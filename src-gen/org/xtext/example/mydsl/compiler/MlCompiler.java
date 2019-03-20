package org.xtext.example.mydsl.compiler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.mml.AllVariables;
import org.xtext.example.mydsl.mml.CrossValidation;
import org.xtext.example.mydsl.mml.DT;
import org.xtext.example.mydsl.mml.DataInput;
import org.xtext.example.mydsl.mml.FormulaItem;
import org.xtext.example.mydsl.mml.LogisticRegression;
import org.xtext.example.mydsl.mml.MLAlgorithm;
import org.xtext.example.mydsl.mml.MMLModel;
import org.xtext.example.mydsl.mml.PredictorVariables;
import org.xtext.example.mydsl.mml.RFormula;
import org.xtext.example.mydsl.mml.RandomForest;
import org.xtext.example.mydsl.mml.SVM;
import org.xtext.example.mydsl.mml.SVMClassification;
import org.xtext.example.mydsl.mml.SVMKernel;
import org.xtext.example.mydsl.mml.StratificationMethod;
import org.xtext.example.mydsl.mml.TrainingTest;
import org.xtext.example.mydsl.mml.ValidationMetric;
import org.xtext.example.mydsl.mml.XFormula;

public class MlCompiler {

	private MMLModel result;
	private String library;
	private String path_output;
	private String code;
	private String code_folder;
	private String data_folder;
	private String shell_path;

	public MlCompiler(String programme,String code_folder, String data_folder) throws IOException{

		this.code_folder = code_folder;
		this.data_folder = data_folder;

		load(programme);

	}

	private void cleanFiles() {
		File output = new File(path_output);
		output.delete();

		File shell = new File(shell_path);
		shell.delete();

	}

	public void compile() throws IOException {

		dataPreparation();
		algoDefinition();
		algoValidation();
		saveMetrics();
		writeCode(code,this.path_output);

	}


	public void load(String programme) throws IOException {

		this.result = this.parseProgram(programme);

		this.library = this.result.getAlgorithm().getFramework().getName();



		this.path_output = this.code_folder+this.library+".txt";
		this.shell_path = this.code_folder+this.library+".sh";

		this.code = "";

		cleanFiles();


	}

	public String execute() throws IOException, InterruptedException {
		if(this.library.equals("SCIKIT")) {

			writeCode("#!/bin/bash", this.shell_path);
			writeCode("[ -d \"/home/ensai/anaconda3\" ] &&	/home/ensai/anaconda3/bin/python3 "
					+this.path_output, this.shell_path);
			writeCode("[ -d \"/root/anaconda\" ] &&	/root/anaconda/bin/python3 "
					+this.path_output, this.shell_path);
		}

		if(this.library.equals("R")) {
			writeCode("#!/bin/bash", this.shell_path);
			writeCode("Rscript "+this.path_output, this.shell_path);
		}
		String cmd = "bash " + this.shell_path;
		Process p = Runtime.getRuntime().exec(cmd);


		// to print errors
		try {
			p.waitFor();
			final int exitValue = p.waitFor();
			if (exitValue != 0){

				try (final BufferedReader b = new BufferedReader(new InputStreamReader(p.getErrorStream()))) {
					String line;
					if ((line = b.readLine()) != null)
						System.out.println("err : " + line);
				} catch (final IOException e) {
					e.printStackTrace();
				}                
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		// to get the result of the cmd
		String retour = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line; 
		while ((line = in.readLine()) != null) {
			retour += line;
		}

		return(retour);

	}

	private MMLModel parseProgram(String programme) throws IOException {

		XtextParser parser = new XtextParser();
		MMLModel model=null;

		Reader reader = new StringReader(programme);


		EObject result = parser.parse(reader);

		model = (MMLModel) result;

		return(model);

	}

	private void algoDefinition() throws IOException {


		MLAlgorithm mlAlgo = this.result.getAlgorithm().getAlgorithm();

		if(mlAlgo instanceof SVM) {


			svmDefinition();
		}

		if(mlAlgo instanceof DT) {

			DT mDT = (DT) mlAlgo;
			//			int profondeur = mDT.getMax_depth();			
			decisionTreeDefinition();
		}

		if(mlAlgo instanceof RandomForest) {
			randomForestDefinition();
		}

		if(mlAlgo instanceof LogisticRegression) {
			logRegDefinition();
		}


	}

	private void logRegDefinition() throws IOException {

		String path_code = code_folder + this.library + "/define_log_reg.txt";
		String code = this.readFile(path_code,Charset.defaultCharset()) ;
		this.appendCode(code);
	}


	private void decisionTreeDefinition() throws IOException {
		String path_code = code_folder + this.library + "/define_decision_tree.txt";
		String code = this.readFile(path_code,Charset.defaultCharset()) ;

		this.appendCode(code);
	}

	private void svmDefinition() throws IOException {
		String path_code = code_folder + this.library + "/define_svm.txt";
		String code = this.readFile(path_code,Charset.defaultCharset()) ;

		this.appendCode(code);
	}

	private void randomForestDefinition() throws IOException {
		String path_code = code_folder + this.library + "/define_random_forest.txt";
		String code = this.readFile(path_code,Charset.defaultCharset()) ;
		this.appendCode(code);

	}

	private void saveMetrics() throws IOException {



		String path_code = code_folder + this.library + "/save_metrics.txt";

		String code = this.readFile(path_code,Charset.defaultCharset()) ;

		this.appendCode(code);

	}


	private void algoValidation() throws IOException {

		defineMetrics();

		defineValidationMethod();

	}

	private void defineValidationMethod() throws IOException {

		StratificationMethod stratificationMethod = this.result.getValidation().getStratification();

		if(stratificationMethod instanceof CrossValidation) {


			CrossValidation crossValidation = (CrossValidation) stratificationMethod;

			crossValidation(crossValidation);


		}

		if(stratificationMethod instanceof TrainingTest) {

			TrainingTest trainingTest = (TrainingTest) stratificationMethod;

			defineTrainTestValidation(trainingTest);

		}

	}

	private void crossValidation(CrossValidation crossValidation) throws IOException {


		int n_splits = crossValidation.getNumber();


		String path_code = code_folder + this.library + "/define_k_fold_validation.txt";
		String code = this.readFile(path_code,Charset.defaultCharset()) ;

		code = code.replace("[[n_splits]]", Integer.toString(n_splits));


		this.appendCode(code);


	}

	private void defineTrainTestValidation(TrainingTest trainingTest) throws IOException {

		int pct = trainingTest.getNumber();

		String path_code = code_folder + this.library + "/define_train_test_validation.txt";
		String code = this.readFile(path_code,Charset.defaultCharset()) ;

		code = code.replace("[[test_size]]", Integer.toString(pct));


		this.appendCode(code);


	}

	private void defineMetrics() throws IOException {

		EList<ValidationMetric> validationMetrics = this.result.getValidation().getMetric();

		String metrics = "";
		for (ValidationMetric validationMetric : validationMetrics) {

			if(metrics=="") {
				metrics = validationMetric.getName();
			}else {
				metrics = metrics + "+" +validationMetric.getName();
			}
		}

		String path_code = code_folder + this.library + "/define_metrics.txt";
		String code = this.readFile(path_code,Charset.defaultCharset()) ;

		code = code.replace("[[metrics]]", metrics);

		this.appendCode(code);



	}

	public void dataPreparation() throws IOException {

		// step 1 : importation

		dataImportation();

		// step 2 : target

		setTarget();

		// step3 : predictors	
		setPredictors();




	}

	private void setPredictors() throws IOException {


		RFormula formula = this.result.getFormula();
		String indexPredictors = "";
		String namePredictors = "";		
		if(formula != null) {


			XFormula xformula = formula.getPredictors();

			if(xformula instanceof AllVariables) {
				return;
				// pas de problème ( déjà traité avant )
			}

			if(xformula instanceof PredictorVariables) {


				PredictorVariables predictorsVariables = (PredictorVariables) xformula;
				List<FormulaItem> listFormulaItem = predictorsVariables.getVars();


				for (FormulaItem formulaItem : listFormulaItem) {
					String colName = formulaItem.getColName();
					if(colName == null) {
						if(indexPredictors == "") {
							indexPredictors = indexPredictors+formulaItem.getColumn();
						}else {
							indexPredictors = indexPredictors+"+"+formulaItem.getColumn();
						}

					}else {
						if(namePredictors=="") {
							namePredictors = namePredictors+formulaItem.getColName();
						}else {
							namePredictors = namePredictors+"+"+formulaItem.getColName();
						}

					}
				}


				String path_code = code_folder + this.library + "/set_predictors.txt";
				String code = this.readFile(path_code,Charset.defaultCharset()) ;

				code = code.replace("[[index_predictors]]", indexPredictors);
				code = code.replace("[[name_predictors]]", namePredictors);


				this.appendCode(code);

			}
		}




	}

	private void setTarget() throws IOException {

		RFormula formula = this.result.getFormula();
		String target = "-1"; // dernière colonne par défaut
		if(formula != null) {


			FormulaItem formulaItem = formula.getPredictive();

			if(formulaItem != null) {
				String colName = formulaItem.getColName();
				int col = formulaItem.getColumn();

				target = String.valueOf(col);
				if(colName != null) {
					target = colName;
				}
			}

		}

		String path_code = code_folder + this.library + "/set_target.txt";
		String code = this.readFile(path_code,Charset.defaultCharset()) ;

		code = code.replace("[[target_index]]", target);


		this.appendCode(code);
		// TODO Auto-generated method stub

	}

	private String readFile(String path, Charset encoding) 
			throws IOException 
	{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	private void dataImportation() throws IOException {

		DataInput dataInput = this.result.getInput();
		String fileLocation = dataInput.getFilelocation();


		String path_code = code_folder + this.library + "/data_importation.txt";

		String code = this.readFile(path_code,Charset.defaultCharset());
		String sep = ",";


		code = code.replace("[path]", this.data_folder+fileLocation);
		code = code.replace("[sep]", sep);


		this.appendCode(code);

	}

	private void appendCode(String code) {
		this.code = this.code + "\n" + code;
	}

	private void writeCode(String code, String pathFile) {
		try(FileWriter fw = new FileWriter(pathFile, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))
		{
			out.println(code);
		} catch (IOException e) {
			//exception handling left as an exercise for the reader
		}

	}



}
