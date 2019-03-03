package org.xtext.example.mydsl.compiler;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.mml.FrameworkLang;
import org.xtext.example.mydsl.mml.MMLModel;

public class Main {

	public static void main(String[] args) {





			String initialString = ""
					+ "datainput \"iris.csv\"\n"
					//					+ "datainput \"statsFSEVary.csv\"\n"
					+ "mlframework scikit-learn\n"
					+ "algorithm LogisticRegression\n" 
					+ "formula \"Species\" ~ ." 
					//										+ "formula 5 ~ 4 + 2 + \"Sepal.Width\" "
					//										+ "formula \"nbPages\" ~ . "
					//					+ "formula ." 
										+ "TrainingTest { pourcentageTraining 70 }\n"
	//				+ "CrossValidation { numRepetitionCross 20 }\n"
					+ "recall F1 precision\n";
	
			String code_folder = System.getProperty("user.dir")+"/mml_script/";
			String data_folder = System.getProperty("user.dir")+"/mml_data/";
			try {
				MlCompiler compiler = new MlCompiler(initialString,code_folder, data_folder);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	





	}

}
