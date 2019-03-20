package org.xtext.example.mydsl.compiler;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.mml.FrameworkLang;
import org.xtext.example.mydsl.mml.MMLModel;

public class Main {

	public static void main(String[] args) {




		String dataInput = "datainput \"iris.csv\"\n";
		String mlFrameworkR = "mlframework R\n";
		String mlFrameworkScikit = "mlframework scikit-learn\n";
		String algorithm =  "algorithm DT\n" ;
		String formula = "";
		String validationMethod = "CrossValidation { numRepetitionCross 5 }\n";
		String metrics = "F1 recall precision\n";

		String programmeR = dataInput + mlFrameworkR + algorithm + formula  + validationMethod + metrics;
		String programmeScikit = dataInput + mlFrameworkScikit + algorithm + formula  + validationMethod + metrics;

		String code_folder = System.getProperty("user.dir")+"/mml_script/";
		String data_folder = System.getProperty("user.dir")+"/mml_data/";
		
		try {
			MlCompiler compiler = new MlCompiler(programmeR,code_folder, data_folder);
			compiler.compile();
			String retourR = compiler.execute();
			
			compiler.load(programmeScikit);
			compiler.compile();
			String retourScikit = compiler.execute();
			
			System.out.println("retour R : " + retourR);
			System.out.println("retour Scikit : " + retourScikit);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



//		String initialString = ""
//				+ "datainput \"iris.csv\"\n"
//				//					+ "datainput \"statsFSEVary.csv\"\n"
//				+ "mlframework R\n"
//				+ "algorithm SVM\n" 
//				+ "formula \"Species\" ~ ." 
//				//										+ "formula 5 ~ 4 + 2 + \"Sepal.Width\" "
//				//										+ "formula \"nbPages\" ~ . "
//				//					+ "formula ." 
//				+ "TrainingTest { pourcentageTraining 70 }\n"
//				//				+ "CrossValidation { numRepetitionCross 20 }\n"
//				+ "recall F1 precision\n";


	}

}
