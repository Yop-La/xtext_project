package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datainput'", "'separator'", "'mlframework'", "'algorithm'", "'SVM'", "'gamma='", "'C='", "'kernel='", "'classification'", "'DT'", "'DecisionTree'", "'RandomForest'", "'RF'", "'LogisticRegression'", "'.'", "'formula'", "'~'", "'+'", "'CrossValidation'", "'{'", "'numRepetitionCross'", "'}'", "'TrainingTest'", "'pourcentageTraining'", "','", "';'", "'scikit-learn'", "'R'", "'Weka'", "'linear'", "'polynomial'", "'radial'", "'C-classification'", "'nu-classification'", "'one-classification'", "'recall'", "'precision'", "'F1'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMml.g"; }



     	private MmlGrammarAccess grammarAccess;

        public InternalMmlParser(TokenStream input, MmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MMLModel";
       	}

       	@Override
       	protected MmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMMLModel"
    // InternalMml.g:65:1: entryRuleMMLModel returns [EObject current=null] : iv_ruleMMLModel= ruleMMLModel EOF ;
    public final EObject entryRuleMMLModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMLModel = null;


        try {
            // InternalMml.g:65:49: (iv_ruleMMLModel= ruleMMLModel EOF )
            // InternalMml.g:66:2: iv_ruleMMLModel= ruleMMLModel EOF
            {
             newCompositeNode(grammarAccess.getMMLModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMMLModel=ruleMMLModel();

            state._fsp--;

             current =iv_ruleMMLModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMMLModel"


    // $ANTLR start "ruleMMLModel"
    // InternalMml.g:72:1: ruleMMLModel returns [EObject current=null] : ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) ) ;
    public final EObject ruleMMLModel() throws RecognitionException {
        EObject current = null;

        EObject lv_input_0_0 = null;

        EObject lv_algorithm_1_0 = null;

        EObject lv_formula_2_0 = null;

        EObject lv_validation_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:78:2: ( ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) ) )
            // InternalMml.g:79:2: ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) )
            {
            // InternalMml.g:79:2: ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) )
            // InternalMml.g:80:3: ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) )
            {
            // InternalMml.g:80:3: ( (lv_input_0_0= ruleDataInput ) )
            // InternalMml.g:81:4: (lv_input_0_0= ruleDataInput )
            {
            // InternalMml.g:81:4: (lv_input_0_0= ruleDataInput )
            // InternalMml.g:82:5: lv_input_0_0= ruleDataInput
            {

            					newCompositeNode(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_input_0_0=ruleDataInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"org.xtext.example.mydsl.Mml.DataInput");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:99:3: ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) )
            // InternalMml.g:100:4: (lv_algorithm_1_0= ruleMLChoiceAlgorithm )
            {
            // InternalMml.g:100:4: (lv_algorithm_1_0= ruleMLChoiceAlgorithm )
            // InternalMml.g:101:5: lv_algorithm_1_0= ruleMLChoiceAlgorithm
            {

            					newCompositeNode(grammarAccess.getMMLModelAccess().getAlgorithmMLChoiceAlgorithmParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_algorithm_1_0=ruleMLChoiceAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_1_0,
            						"org.xtext.example.mydsl.Mml.MLChoiceAlgorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:118:3: ( (lv_formula_2_0= ruleRFormula ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMml.g:119:4: (lv_formula_2_0= ruleRFormula )
                    {
                    // InternalMml.g:119:4: (lv_formula_2_0= ruleRFormula )
                    // InternalMml.g:120:5: lv_formula_2_0= ruleRFormula
                    {

                    					newCompositeNode(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_formula_2_0=ruleRFormula();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMMLModelRule());
                    					}
                    					set(
                    						current,
                    						"formula",
                    						lv_formula_2_0,
                    						"org.xtext.example.mydsl.Mml.RFormula");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMml.g:137:3: ( (lv_validation_3_0= ruleValidation ) )
            // InternalMml.g:138:4: (lv_validation_3_0= ruleValidation )
            {
            // InternalMml.g:138:4: (lv_validation_3_0= ruleValidation )
            // InternalMml.g:139:5: lv_validation_3_0= ruleValidation
            {

            					newCompositeNode(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_validation_3_0=ruleValidation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            					}
            					set(
            						current,
            						"validation",
            						lv_validation_3_0,
            						"org.xtext.example.mydsl.Mml.Validation");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMMLModel"


    // $ANTLR start "entryRuleDataInput"
    // InternalMml.g:160:1: entryRuleDataInput returns [EObject current=null] : iv_ruleDataInput= ruleDataInput EOF ;
    public final EObject entryRuleDataInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataInput = null;


        try {
            // InternalMml.g:160:50: (iv_ruleDataInput= ruleDataInput EOF )
            // InternalMml.g:161:2: iv_ruleDataInput= ruleDataInput EOF
            {
             newCompositeNode(grammarAccess.getDataInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataInput=ruleDataInput();

            state._fsp--;

             current =iv_ruleDataInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataInput"


    // $ANTLR start "ruleDataInput"
    // InternalMml.g:167:1: ruleDataInput returns [EObject current=null] : (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? ) ;
    public final EObject ruleDataInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filelocation_1_0=null;
        EObject lv_parsingInstruction_2_0 = null;



        	enterRule();

        try {
            // InternalMml.g:173:2: ( (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? ) )
            // InternalMml.g:174:2: (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? )
            {
            // InternalMml.g:174:2: (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? )
            // InternalMml.g:175:3: otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataInputAccess().getDatainputKeyword_0());
            		
            // InternalMml.g:179:3: ( (lv_filelocation_1_0= RULE_STRING ) )
            // InternalMml.g:180:4: (lv_filelocation_1_0= RULE_STRING )
            {
            // InternalMml.g:180:4: (lv_filelocation_1_0= RULE_STRING )
            // InternalMml.g:181:5: lv_filelocation_1_0= RULE_STRING
            {
            lv_filelocation_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_filelocation_1_0, grammarAccess.getDataInputAccess().getFilelocationSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filelocation",
            						lv_filelocation_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMml.g:197:3: ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMml.g:198:4: (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration )
                    {
                    // InternalMml.g:198:4: (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration )
                    // InternalMml.g:199:5: lv_parsingInstruction_2_0= ruleCSVParsingConfiguration
                    {

                    					newCompositeNode(grammarAccess.getDataInputAccess().getParsingInstructionCSVParsingConfigurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parsingInstruction_2_0=ruleCSVParsingConfiguration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataInputRule());
                    					}
                    					set(
                    						current,
                    						"parsingInstruction",
                    						lv_parsingInstruction_2_0,
                    						"org.xtext.example.mydsl.Mml.CSVParsingConfiguration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataInput"


    // $ANTLR start "entryRuleCSVParsingConfiguration"
    // InternalMml.g:220:1: entryRuleCSVParsingConfiguration returns [EObject current=null] : iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF ;
    public final EObject entryRuleCSVParsingConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVParsingConfiguration = null;


        try {
            // InternalMml.g:220:64: (iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF )
            // InternalMml.g:221:2: iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF
            {
             newCompositeNode(grammarAccess.getCSVParsingConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSVParsingConfiguration=ruleCSVParsingConfiguration();

            state._fsp--;

             current =iv_ruleCSVParsingConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSVParsingConfiguration"


    // $ANTLR start "ruleCSVParsingConfiguration"
    // InternalMml.g:227:1: ruleCSVParsingConfiguration returns [EObject current=null] : (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) ) ;
    public final EObject ruleCSVParsingConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_sep_1_0 = null;



        	enterRule();

        try {
            // InternalMml.g:233:2: ( (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) ) )
            // InternalMml.g:234:2: (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) )
            {
            // InternalMml.g:234:2: (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) )
            // InternalMml.g:235:3: otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0());
            		
            // InternalMml.g:239:3: ( (lv_sep_1_0= ruleCSVSeparator ) )
            // InternalMml.g:240:4: (lv_sep_1_0= ruleCSVSeparator )
            {
            // InternalMml.g:240:4: (lv_sep_1_0= ruleCSVSeparator )
            // InternalMml.g:241:5: lv_sep_1_0= ruleCSVSeparator
            {

            					newCompositeNode(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sep_1_0=ruleCSVSeparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCSVParsingConfigurationRule());
            					}
            					set(
            						current,
            						"sep",
            						lv_sep_1_0,
            						"org.xtext.example.mydsl.Mml.CSVSeparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSVParsingConfiguration"


    // $ANTLR start "entryRuleMLChoiceAlgorithm"
    // InternalMml.g:262:1: entryRuleMLChoiceAlgorithm returns [EObject current=null] : iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF ;
    public final EObject entryRuleMLChoiceAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLChoiceAlgorithm = null;


        try {
            // InternalMml.g:262:58: (iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF )
            // InternalMml.g:263:2: iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getMLChoiceAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMLChoiceAlgorithm=ruleMLChoiceAlgorithm();

            state._fsp--;

             current =iv_ruleMLChoiceAlgorithm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMLChoiceAlgorithm"


    // $ANTLR start "ruleMLChoiceAlgorithm"
    // InternalMml.g:269:1: ruleMLChoiceAlgorithm returns [EObject current=null] : (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) ) ;
    public final EObject ruleMLChoiceAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_framework_1_0 = null;

        EObject lv_algorithm_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:275:2: ( (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) ) )
            // InternalMml.g:276:2: (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) )
            {
            // InternalMml.g:276:2: (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) )
            // InternalMml.g:277:3: otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0());
            		
            // InternalMml.g:281:3: ( (lv_framework_1_0= ruleFrameworkLang ) )
            // InternalMml.g:282:4: (lv_framework_1_0= ruleFrameworkLang )
            {
            // InternalMml.g:282:4: (lv_framework_1_0= ruleFrameworkLang )
            // InternalMml.g:283:5: lv_framework_1_0= ruleFrameworkLang
            {

            					newCompositeNode(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_framework_1_0=ruleFrameworkLang();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLChoiceAlgorithmRule());
            					}
            					set(
            						current,
            						"framework",
            						lv_framework_1_0,
            						"org.xtext.example.mydsl.Mml.FrameworkLang");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2());
            		
            // InternalMml.g:304:3: ( (lv_algorithm_3_0= ruleMLAlgorithm ) )
            // InternalMml.g:305:4: (lv_algorithm_3_0= ruleMLAlgorithm )
            {
            // InternalMml.g:305:4: (lv_algorithm_3_0= ruleMLAlgorithm )
            // InternalMml.g:306:5: lv_algorithm_3_0= ruleMLAlgorithm
            {

            					newCompositeNode(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_algorithm_3_0=ruleMLAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLChoiceAlgorithmRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_3_0,
            						"org.xtext.example.mydsl.Mml.MLAlgorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMLChoiceAlgorithm"


    // $ANTLR start "entryRuleMLAlgorithm"
    // InternalMml.g:327:1: entryRuleMLAlgorithm returns [EObject current=null] : iv_ruleMLAlgorithm= ruleMLAlgorithm EOF ;
    public final EObject entryRuleMLAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLAlgorithm = null;


        try {
            // InternalMml.g:327:52: (iv_ruleMLAlgorithm= ruleMLAlgorithm EOF )
            // InternalMml.g:328:2: iv_ruleMLAlgorithm= ruleMLAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getMLAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMLAlgorithm=ruleMLAlgorithm();

            state._fsp--;

             current =iv_ruleMLAlgorithm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMLAlgorithm"


    // $ANTLR start "ruleMLAlgorithm"
    // InternalMml.g:334:1: ruleMLAlgorithm returns [EObject current=null] : (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression ) ;
    public final EObject ruleMLAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject this_SVM_0 = null;

        EObject this_DT_1 = null;

        EObject this_RandomForest_2 = null;

        EObject this_LogisticRegression_3 = null;



        	enterRule();

        try {
            // InternalMml.g:340:2: ( (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression ) )
            // InternalMml.g:341:2: (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression )
            {
            // InternalMml.g:341:2: (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 20:
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMml.g:342:3: this_SVM_0= ruleSVM
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getSVMParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SVM_0=ruleSVM();

                    state._fsp--;


                    			current = this_SVM_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMml.g:351:3: this_DT_1= ruleDT
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getDTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DT_1=ruleDT();

                    state._fsp--;


                    			current = this_DT_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMml.g:360:3: this_RandomForest_2= ruleRandomForest
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getRandomForestParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RandomForest_2=ruleRandomForest();

                    state._fsp--;


                    			current = this_RandomForest_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMml.g:369:3: this_LogisticRegression_3= ruleLogisticRegression
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getLogisticRegressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogisticRegression_3=ruleLogisticRegression();

                    state._fsp--;


                    			current = this_LogisticRegression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMLAlgorithm"


    // $ANTLR start "entryRuleSVM"
    // InternalMml.g:381:1: entryRuleSVM returns [EObject current=null] : iv_ruleSVM= ruleSVM EOF ;
    public final EObject entryRuleSVM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVM = null;


        try {
            // InternalMml.g:381:44: (iv_ruleSVM= ruleSVM EOF )
            // InternalMml.g:382:2: iv_ruleSVM= ruleSVM EOF
            {
             newCompositeNode(grammarAccess.getSVMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSVM=ruleSVM();

            state._fsp--;

             current =iv_ruleSVM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSVM"


    // $ANTLR start "ruleSVM"
    // InternalMml.g:388:1: ruleSVM returns [EObject current=null] : ( () otherlv_1= 'SVM' (otherlv_2= 'gamma=' ( (lv_gamma_3_0= ruleFLOAT ) ) )? (otherlv_4= 'C=' ( (lv_C_5_0= ruleFLOAT ) ) )? (otherlv_6= 'kernel=' ( (lv_kernel_7_0= ruleSVMKernel ) ) )? (otherlv_8= 'classification' ( (lv_svmclassification_9_0= ruleSVMClassification ) ) )? ) ;
    public final EObject ruleSVM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_gamma_3_0 = null;

        AntlrDatatypeRuleToken lv_C_5_0 = null;

        Enumerator lv_kernel_7_0 = null;

        Enumerator lv_svmclassification_9_0 = null;



        	enterRule();

        try {
            // InternalMml.g:394:2: ( ( () otherlv_1= 'SVM' (otherlv_2= 'gamma=' ( (lv_gamma_3_0= ruleFLOAT ) ) )? (otherlv_4= 'C=' ( (lv_C_5_0= ruleFLOAT ) ) )? (otherlv_6= 'kernel=' ( (lv_kernel_7_0= ruleSVMKernel ) ) )? (otherlv_8= 'classification' ( (lv_svmclassification_9_0= ruleSVMClassification ) ) )? ) )
            // InternalMml.g:395:2: ( () otherlv_1= 'SVM' (otherlv_2= 'gamma=' ( (lv_gamma_3_0= ruleFLOAT ) ) )? (otherlv_4= 'C=' ( (lv_C_5_0= ruleFLOAT ) ) )? (otherlv_6= 'kernel=' ( (lv_kernel_7_0= ruleSVMKernel ) ) )? (otherlv_8= 'classification' ( (lv_svmclassification_9_0= ruleSVMClassification ) ) )? )
            {
            // InternalMml.g:395:2: ( () otherlv_1= 'SVM' (otherlv_2= 'gamma=' ( (lv_gamma_3_0= ruleFLOAT ) ) )? (otherlv_4= 'C=' ( (lv_C_5_0= ruleFLOAT ) ) )? (otherlv_6= 'kernel=' ( (lv_kernel_7_0= ruleSVMKernel ) ) )? (otherlv_8= 'classification' ( (lv_svmclassification_9_0= ruleSVMClassification ) ) )? )
            // InternalMml.g:396:3: () otherlv_1= 'SVM' (otherlv_2= 'gamma=' ( (lv_gamma_3_0= ruleFLOAT ) ) )? (otherlv_4= 'C=' ( (lv_C_5_0= ruleFLOAT ) ) )? (otherlv_6= 'kernel=' ( (lv_kernel_7_0= ruleSVMKernel ) ) )? (otherlv_8= 'classification' ( (lv_svmclassification_9_0= ruleSVMClassification ) ) )?
            {
            // InternalMml.g:396:3: ()
            // InternalMml.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSVMAccess().getSVMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSVMAccess().getSVMKeyword_1());
            		
            // InternalMml.g:407:3: (otherlv_2= 'gamma=' ( (lv_gamma_3_0= ruleFLOAT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMml.g:408:4: otherlv_2= 'gamma=' ( (lv_gamma_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getSVMAccess().getGammaKeyword_2_0());
                    			
                    // InternalMml.g:412:4: ( (lv_gamma_3_0= ruleFLOAT ) )
                    // InternalMml.g:413:5: (lv_gamma_3_0= ruleFLOAT )
                    {
                    // InternalMml.g:413:5: (lv_gamma_3_0= ruleFLOAT )
                    // InternalMml.g:414:6: lv_gamma_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getGammaFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_gamma_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"gamma",
                    							lv_gamma_3_0,
                    							"org.xtext.example.mydsl.Mml.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:432:3: (otherlv_4= 'C=' ( (lv_C_5_0= ruleFLOAT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMml.g:433:4: otherlv_4= 'C=' ( (lv_C_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getSVMAccess().getCKeyword_3_0());
                    			
                    // InternalMml.g:437:4: ( (lv_C_5_0= ruleFLOAT ) )
                    // InternalMml.g:438:5: (lv_C_5_0= ruleFLOAT )
                    {
                    // InternalMml.g:438:5: (lv_C_5_0= ruleFLOAT )
                    // InternalMml.g:439:6: lv_C_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getCFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_C_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"C",
                    							lv_C_5_0,
                    							"org.xtext.example.mydsl.Mml.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:457:3: (otherlv_6= 'kernel=' ( (lv_kernel_7_0= ruleSVMKernel ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMml.g:458:4: otherlv_6= 'kernel=' ( (lv_kernel_7_0= ruleSVMKernel ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getSVMAccess().getKernelKeyword_4_0());
                    			
                    // InternalMml.g:462:4: ( (lv_kernel_7_0= ruleSVMKernel ) )
                    // InternalMml.g:463:5: (lv_kernel_7_0= ruleSVMKernel )
                    {
                    // InternalMml.g:463:5: (lv_kernel_7_0= ruleSVMKernel )
                    // InternalMml.g:464:6: lv_kernel_7_0= ruleSVMKernel
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getKernelSVMKernelEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_kernel_7_0=ruleSVMKernel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"kernel",
                    							lv_kernel_7_0,
                    							"org.xtext.example.mydsl.Mml.SVMKernel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:482:3: (otherlv_8= 'classification' ( (lv_svmclassification_9_0= ruleSVMClassification ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMml.g:483:4: otherlv_8= 'classification' ( (lv_svmclassification_9_0= ruleSVMClassification ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getSVMAccess().getClassificationKeyword_5_0());
                    			
                    // InternalMml.g:487:4: ( (lv_svmclassification_9_0= ruleSVMClassification ) )
                    // InternalMml.g:488:5: (lv_svmclassification_9_0= ruleSVMClassification )
                    {
                    // InternalMml.g:488:5: (lv_svmclassification_9_0= ruleSVMClassification )
                    // InternalMml.g:489:6: lv_svmclassification_9_0= ruleSVMClassification
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getSvmclassificationSVMClassificationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_svmclassification_9_0=ruleSVMClassification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"svmclassification",
                    							lv_svmclassification_9_0,
                    							"org.xtext.example.mydsl.Mml.SVMClassification");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVM"


    // $ANTLR start "entryRuleDT"
    // InternalMml.g:511:1: entryRuleDT returns [EObject current=null] : iv_ruleDT= ruleDT EOF ;
    public final EObject entryRuleDT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDT = null;


        try {
            // InternalMml.g:511:43: (iv_ruleDT= ruleDT EOF )
            // InternalMml.g:512:2: iv_ruleDT= ruleDT EOF
            {
             newCompositeNode(grammarAccess.getDTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDT=ruleDT();

            state._fsp--;

             current =iv_ruleDT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDT"


    // $ANTLR start "ruleDT"
    // InternalMml.g:518:1: ruleDT returns [EObject current=null] : ( () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( (lv_max_depth_3_0= RULE_INT ) )? ) ;
    public final EObject ruleDT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_max_depth_3_0=null;


        	enterRule();

        try {
            // InternalMml.g:524:2: ( ( () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( (lv_max_depth_3_0= RULE_INT ) )? ) )
            // InternalMml.g:525:2: ( () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( (lv_max_depth_3_0= RULE_INT ) )? )
            {
            // InternalMml.g:525:2: ( () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( (lv_max_depth_3_0= RULE_INT ) )? )
            // InternalMml.g:526:3: () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( (lv_max_depth_3_0= RULE_INT ) )?
            {
            // InternalMml.g:526:3: ()
            // InternalMml.g:527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDTAccess().getDTAction_0(),
            					current);
            			

            }

            // InternalMml.g:533:3: (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMml.g:534:4: otherlv_1= 'DT'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getDTAccess().getDTKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMml.g:539:4: otherlv_2= 'DecisionTree'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getDTAccess().getDecisionTreeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMml.g:544:3: ( (lv_max_depth_3_0= RULE_INT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMml.g:545:4: (lv_max_depth_3_0= RULE_INT )
                    {
                    // InternalMml.g:545:4: (lv_max_depth_3_0= RULE_INT )
                    // InternalMml.g:546:5: lv_max_depth_3_0= RULE_INT
                    {
                    lv_max_depth_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_max_depth_3_0, grammarAccess.getDTAccess().getMax_depthINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDTRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"max_depth",
                    						lv_max_depth_3_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDT"


    // $ANTLR start "entryRuleRandomForest"
    // InternalMml.g:566:1: entryRuleRandomForest returns [EObject current=null] : iv_ruleRandomForest= ruleRandomForest EOF ;
    public final EObject entryRuleRandomForest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomForest = null;


        try {
            // InternalMml.g:566:53: (iv_ruleRandomForest= ruleRandomForest EOF )
            // InternalMml.g:567:2: iv_ruleRandomForest= ruleRandomForest EOF
            {
             newCompositeNode(grammarAccess.getRandomForestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandomForest=ruleRandomForest();

            state._fsp--;

             current =iv_ruleRandomForest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRandomForest"


    // $ANTLR start "ruleRandomForest"
    // InternalMml.g:573:1: ruleRandomForest returns [EObject current=null] : ( () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' ) ) ;
    public final EObject ruleRandomForest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMml.g:579:2: ( ( () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' ) ) )
            // InternalMml.g:580:2: ( () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' ) )
            {
            // InternalMml.g:580:2: ( () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' ) )
            // InternalMml.g:581:3: () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' )
            {
            // InternalMml.g:581:3: ()
            // InternalMml.g:582:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRandomForestAccess().getRandomForestAction_0(),
            					current);
            			

            }

            // InternalMml.g:588:3: (otherlv_1= 'RandomForest' | otherlv_2= 'RF' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMml.g:589:4: otherlv_1= 'RandomForest'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getRandomForestAccess().getRandomForestKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMml.g:594:4: otherlv_2= 'RF'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRandomForestAccess().getRFKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRandomForest"


    // $ANTLR start "entryRuleLogisticRegression"
    // InternalMml.g:603:1: entryRuleLogisticRegression returns [EObject current=null] : iv_ruleLogisticRegression= ruleLogisticRegression EOF ;
    public final EObject entryRuleLogisticRegression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogisticRegression = null;


        try {
            // InternalMml.g:603:59: (iv_ruleLogisticRegression= ruleLogisticRegression EOF )
            // InternalMml.g:604:2: iv_ruleLogisticRegression= ruleLogisticRegression EOF
            {
             newCompositeNode(grammarAccess.getLogisticRegressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogisticRegression=ruleLogisticRegression();

            state._fsp--;

             current =iv_ruleLogisticRegression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogisticRegression"


    // $ANTLR start "ruleLogisticRegression"
    // InternalMml.g:610:1: ruleLogisticRegression returns [EObject current=null] : ( () otherlv_1= 'LogisticRegression' ) ;
    public final EObject ruleLogisticRegression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMml.g:616:2: ( ( () otherlv_1= 'LogisticRegression' ) )
            // InternalMml.g:617:2: ( () otherlv_1= 'LogisticRegression' )
            {
            // InternalMml.g:617:2: ( () otherlv_1= 'LogisticRegression' )
            // InternalMml.g:618:3: () otherlv_1= 'LogisticRegression'
            {
            // InternalMml.g:618:3: ()
            // InternalMml.g:619:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogisticRegressionAccess().getLogisticRegressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLogisticRegressionAccess().getLogisticRegressionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogisticRegression"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMml.g:633:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalMml.g:633:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMml.g:634:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMml.g:640:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMml.g:646:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMml.g:647:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMml.g:647:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMml.g:648:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,25,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleRFormula"
    // InternalMml.g:671:1: entryRuleRFormula returns [EObject current=null] : iv_ruleRFormula= ruleRFormula EOF ;
    public final EObject entryRuleRFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRFormula = null;


        try {
            // InternalMml.g:671:49: (iv_ruleRFormula= ruleRFormula EOF )
            // InternalMml.g:672:2: iv_ruleRFormula= ruleRFormula EOF
            {
             newCompositeNode(grammarAccess.getRFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRFormula=ruleRFormula();

            state._fsp--;

             current =iv_ruleRFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRFormula"


    // $ANTLR start "ruleRFormula"
    // InternalMml.g:678:1: ruleRFormula returns [EObject current=null] : (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleRFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_predictive_1_0 = null;

        EObject lv_predictors_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:684:2: ( (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) ) )
            // InternalMml.g:685:2: (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) )
            {
            // InternalMml.g:685:2: (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) )
            // InternalMml.g:686:3: otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRFormulaAccess().getFormulaKeyword_0());
            		
            // InternalMml.g:690:3: ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==27) ) {
                    alt11=1;
                }
            }
            else if ( (LA11_0==RULE_STRING) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==27) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalMml.g:691:4: ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~'
                    {
                    // InternalMml.g:691:4: ( (lv_predictive_1_0= ruleFormulaItem ) )
                    // InternalMml.g:692:5: (lv_predictive_1_0= ruleFormulaItem )
                    {
                    // InternalMml.g:692:5: (lv_predictive_1_0= ruleFormulaItem )
                    // InternalMml.g:693:6: lv_predictive_1_0= ruleFormulaItem
                    {

                    						newCompositeNode(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_predictive_1_0=ruleFormulaItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRFormulaRule());
                    						}
                    						set(
                    							current,
                    							"predictive",
                    							lv_predictive_1_0,
                    							"org.xtext.example.mydsl.Mml.FormulaItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getRFormulaAccess().getTildeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMml.g:715:3: ( (lv_predictors_3_0= ruleXFormula ) )
            // InternalMml.g:716:4: (lv_predictors_3_0= ruleXFormula )
            {
            // InternalMml.g:716:4: (lv_predictors_3_0= ruleXFormula )
            // InternalMml.g:717:5: lv_predictors_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getRFormulaAccess().getPredictorsXFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_predictors_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRFormulaRule());
            					}
            					set(
            						current,
            						"predictors",
            						lv_predictors_3_0,
            						"org.xtext.example.mydsl.Mml.XFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRFormula"


    // $ANTLR start "entryRuleXFormula"
    // InternalMml.g:738:1: entryRuleXFormula returns [EObject current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final EObject entryRuleXFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFormula = null;


        try {
            // InternalMml.g:738:49: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalMml.g:739:2: iv_ruleXFormula= ruleXFormula EOF
            {
             newCompositeNode(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXFormula=ruleXFormula();

            state._fsp--;

             current =iv_ruleXFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalMml.g:745:1: ruleXFormula returns [EObject current=null] : (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables ) ;
    public final EObject ruleXFormula() throws RecognitionException {
        EObject current = null;

        EObject this_AllVariables_0 = null;

        EObject this_PredictorVariables_1 = null;



        	enterRule();

        try {
            // InternalMml.g:751:2: ( (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables ) )
            // InternalMml.g:752:2: (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables )
            {
            // InternalMml.g:752:2: (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMml.g:753:3: this_AllVariables_0= ruleAllVariables
                    {

                    			newCompositeNode(grammarAccess.getXFormulaAccess().getAllVariablesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllVariables_0=ruleAllVariables();

                    state._fsp--;


                    			current = this_AllVariables_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMml.g:762:3: this_PredictorVariables_1= rulePredictorVariables
                    {

                    			newCompositeNode(grammarAccess.getXFormulaAccess().getPredictorVariablesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredictorVariables_1=rulePredictorVariables();

                    state._fsp--;


                    			current = this_PredictorVariables_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleAllVariables"
    // InternalMml.g:774:1: entryRuleAllVariables returns [EObject current=null] : iv_ruleAllVariables= ruleAllVariables EOF ;
    public final EObject entryRuleAllVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllVariables = null;


        try {
            // InternalMml.g:774:53: (iv_ruleAllVariables= ruleAllVariables EOF )
            // InternalMml.g:775:2: iv_ruleAllVariables= ruleAllVariables EOF
            {
             newCompositeNode(grammarAccess.getAllVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllVariables=ruleAllVariables();

            state._fsp--;

             current =iv_ruleAllVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllVariables"


    // $ANTLR start "ruleAllVariables"
    // InternalMml.g:781:1: ruleAllVariables returns [EObject current=null] : ( (lv_all_0_0= '.' ) ) ;
    public final EObject ruleAllVariables() throws RecognitionException {
        EObject current = null;

        Token lv_all_0_0=null;


        	enterRule();

        try {
            // InternalMml.g:787:2: ( ( (lv_all_0_0= '.' ) ) )
            // InternalMml.g:788:2: ( (lv_all_0_0= '.' ) )
            {
            // InternalMml.g:788:2: ( (lv_all_0_0= '.' ) )
            // InternalMml.g:789:3: (lv_all_0_0= '.' )
            {
            // InternalMml.g:789:3: (lv_all_0_0= '.' )
            // InternalMml.g:790:4: lv_all_0_0= '.'
            {
            lv_all_0_0=(Token)match(input,25,FOLLOW_2); 

            				newLeafNode(lv_all_0_0, grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAllVariablesRule());
            				}
            				setWithLastConsumed(current, "all", lv_all_0_0, ".");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllVariables"


    // $ANTLR start "entryRulePredictorVariables"
    // InternalMml.g:805:1: entryRulePredictorVariables returns [EObject current=null] : iv_rulePredictorVariables= rulePredictorVariables EOF ;
    public final EObject entryRulePredictorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictorVariables = null;


        try {
            // InternalMml.g:805:59: (iv_rulePredictorVariables= rulePredictorVariables EOF )
            // InternalMml.g:806:2: iv_rulePredictorVariables= rulePredictorVariables EOF
            {
             newCompositeNode(grammarAccess.getPredictorVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredictorVariables=rulePredictorVariables();

            state._fsp--;

             current =iv_rulePredictorVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredictorVariables"


    // $ANTLR start "rulePredictorVariables"
    // InternalMml.g:812:1: rulePredictorVariables returns [EObject current=null] : ( ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )* ) ;
    public final EObject rulePredictorVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalMml.g:818:2: ( ( ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )* ) )
            // InternalMml.g:819:2: ( ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )* )
            {
            // InternalMml.g:819:2: ( ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )* )
            // InternalMml.g:820:3: ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )*
            {
            // InternalMml.g:820:3: ( (lv_vars_0_0= ruleFormulaItem ) )
            // InternalMml.g:821:4: (lv_vars_0_0= ruleFormulaItem )
            {
            // InternalMml.g:821:4: (lv_vars_0_0= ruleFormulaItem )
            // InternalMml.g:822:5: lv_vars_0_0= ruleFormulaItem
            {

            					newCompositeNode(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_vars_0_0=ruleFormulaItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredictorVariablesRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"org.xtext.example.mydsl.Mml.FormulaItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:839:3: (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMml.g:840:4: otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_23); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_0());
            	    			
            	    // InternalMml.g:844:4: ( (lv_vars_2_0= ruleFormulaItem ) )
            	    // InternalMml.g:845:5: (lv_vars_2_0= ruleFormulaItem )
            	    {
            	    // InternalMml.g:845:5: (lv_vars_2_0= ruleFormulaItem )
            	    // InternalMml.g:846:6: lv_vars_2_0= ruleFormulaItem
            	    {

            	    						newCompositeNode(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_vars_2_0=ruleFormulaItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPredictorVariablesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.example.mydsl.Mml.FormulaItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredictorVariables"


    // $ANTLR start "entryRuleFormulaItem"
    // InternalMml.g:868:1: entryRuleFormulaItem returns [EObject current=null] : iv_ruleFormulaItem= ruleFormulaItem EOF ;
    public final EObject entryRuleFormulaItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaItem = null;


        try {
            // InternalMml.g:868:52: (iv_ruleFormulaItem= ruleFormulaItem EOF )
            // InternalMml.g:869:2: iv_ruleFormulaItem= ruleFormulaItem EOF
            {
             newCompositeNode(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormulaItem=ruleFormulaItem();

            state._fsp--;

             current =iv_ruleFormulaItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormulaItem"


    // $ANTLR start "ruleFormulaItem"
    // InternalMml.g:875:1: ruleFormulaItem returns [EObject current=null] : ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFormulaItem() throws RecognitionException {
        EObject current = null;

        Token lv_column_0_0=null;
        Token lv_colName_1_0=null;


        	enterRule();

        try {
            // InternalMml.g:881:2: ( ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) ) )
            // InternalMml.g:882:2: ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) )
            {
            // InternalMml.g:882:2: ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMml.g:883:3: ( (lv_column_0_0= RULE_INT ) )
                    {
                    // InternalMml.g:883:3: ( (lv_column_0_0= RULE_INT ) )
                    // InternalMml.g:884:4: (lv_column_0_0= RULE_INT )
                    {
                    // InternalMml.g:884:4: (lv_column_0_0= RULE_INT )
                    // InternalMml.g:885:5: lv_column_0_0= RULE_INT
                    {
                    lv_column_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_column_0_0, grammarAccess.getFormulaItemAccess().getColumnINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFormulaItemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"column",
                    						lv_column_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:902:3: ( (lv_colName_1_0= RULE_STRING ) )
                    {
                    // InternalMml.g:902:3: ( (lv_colName_1_0= RULE_STRING ) )
                    // InternalMml.g:903:4: (lv_colName_1_0= RULE_STRING )
                    {
                    // InternalMml.g:903:4: (lv_colName_1_0= RULE_STRING )
                    // InternalMml.g:904:5: lv_colName_1_0= RULE_STRING
                    {
                    lv_colName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_colName_1_0, grammarAccess.getFormulaItemAccess().getColNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFormulaItemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"colName",
                    						lv_colName_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormulaItem"


    // $ANTLR start "entryRuleValidation"
    // InternalMml.g:924:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // InternalMml.g:924:51: (iv_ruleValidation= ruleValidation EOF )
            // InternalMml.g:925:2: iv_ruleValidation= ruleValidation EOF
            {
             newCompositeNode(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidation=ruleValidation();

            state._fsp--;

             current =iv_ruleValidation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalMml.g:931:1: ruleValidation returns [EObject current=null] : ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        EObject lv_stratification_0_0 = null;

        Enumerator lv_metric_1_0 = null;



        	enterRule();

        try {
            // InternalMml.g:937:2: ( ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ ) )
            // InternalMml.g:938:2: ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ )
            {
            // InternalMml.g:938:2: ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ )
            // InternalMml.g:939:3: ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+
            {
            // InternalMml.g:939:3: ( (lv_stratification_0_0= ruleStratificationMethod ) )
            // InternalMml.g:940:4: (lv_stratification_0_0= ruleStratificationMethod )
            {
            // InternalMml.g:940:4: (lv_stratification_0_0= ruleStratificationMethod )
            // InternalMml.g:941:5: lv_stratification_0_0= ruleStratificationMethod
            {

            					newCompositeNode(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_stratification_0_0=ruleStratificationMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidationRule());
            					}
            					set(
            						current,
            						"stratification",
            						lv_stratification_0_0,
            						"org.xtext.example.mydsl.Mml.StratificationMethod");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:958:3: ( (lv_metric_1_0= ruleValidationMetric ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=46 && LA15_0<=48)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMml.g:959:4: (lv_metric_1_0= ruleValidationMetric )
            	    {
            	    // InternalMml.g:959:4: (lv_metric_1_0= ruleValidationMetric )
            	    // InternalMml.g:960:5: lv_metric_1_0= ruleValidationMetric
            	    {

            	    					newCompositeNode(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_metric_1_0=ruleValidationMetric();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getValidationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metric",
            	    						lv_metric_1_0,
            	    						"org.xtext.example.mydsl.Mml.ValidationMetric");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleStratificationMethod"
    // InternalMml.g:981:1: entryRuleStratificationMethod returns [EObject current=null] : iv_ruleStratificationMethod= ruleStratificationMethod EOF ;
    public final EObject entryRuleStratificationMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStratificationMethod = null;


        try {
            // InternalMml.g:981:61: (iv_ruleStratificationMethod= ruleStratificationMethod EOF )
            // InternalMml.g:982:2: iv_ruleStratificationMethod= ruleStratificationMethod EOF
            {
             newCompositeNode(grammarAccess.getStratificationMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStratificationMethod=ruleStratificationMethod();

            state._fsp--;

             current =iv_ruleStratificationMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStratificationMethod"


    // $ANTLR start "ruleStratificationMethod"
    // InternalMml.g:988:1: ruleStratificationMethod returns [EObject current=null] : (this_CrossValidation_0= ruleCrossValidation | this_TrainingTest_1= ruleTrainingTest ) ;
    public final EObject ruleStratificationMethod() throws RecognitionException {
        EObject current = null;

        EObject this_CrossValidation_0 = null;

        EObject this_TrainingTest_1 = null;



        	enterRule();

        try {
            // InternalMml.g:994:2: ( (this_CrossValidation_0= ruleCrossValidation | this_TrainingTest_1= ruleTrainingTest ) )
            // InternalMml.g:995:2: (this_CrossValidation_0= ruleCrossValidation | this_TrainingTest_1= ruleTrainingTest )
            {
            // InternalMml.g:995:2: (this_CrossValidation_0= ruleCrossValidation | this_TrainingTest_1= ruleTrainingTest )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMml.g:996:3: this_CrossValidation_0= ruleCrossValidation
                    {

                    			newCompositeNode(grammarAccess.getStratificationMethodAccess().getCrossValidationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CrossValidation_0=ruleCrossValidation();

                    state._fsp--;


                    			current = this_CrossValidation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMml.g:1005:3: this_TrainingTest_1= ruleTrainingTest
                    {

                    			newCompositeNode(grammarAccess.getStratificationMethodAccess().getTrainingTestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrainingTest_1=ruleTrainingTest();

                    state._fsp--;


                    			current = this_TrainingTest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStratificationMethod"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMml.g:1017:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalMml.g:1017:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalMml.g:1018:2: iv_ruleCrossValidation= ruleCrossValidation EOF
            {
             newCompositeNode(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossValidation=ruleCrossValidation();

            state._fsp--;

             current =iv_ruleCrossValidation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMml.g:1024:1: ruleCrossValidation returns [EObject current=null] : (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleCrossValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMml.g:1030:2: ( (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalMml.g:1031:2: (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalMml.g:1031:2: (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalMml.g:1032:3: otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getCrossValidationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCrossValidationAccess().getNumRepetitionCrossKeyword_2());
            		
            // InternalMml.g:1044:3: ( (lv_number_3_0= RULE_INT ) )
            // InternalMml.g:1045:4: (lv_number_3_0= RULE_INT )
            {
            // InternalMml.g:1045:4: (lv_number_3_0= RULE_INT )
            // InternalMml.g:1046:5: lv_number_3_0= RULE_INT
            {
            lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_number_3_0, grammarAccess.getCrossValidationAccess().getNumberINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCrossValidationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCrossValidationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleTrainingTest"
    // InternalMml.g:1070:1: entryRuleTrainingTest returns [EObject current=null] : iv_ruleTrainingTest= ruleTrainingTest EOF ;
    public final EObject entryRuleTrainingTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingTest = null;


        try {
            // InternalMml.g:1070:53: (iv_ruleTrainingTest= ruleTrainingTest EOF )
            // InternalMml.g:1071:2: iv_ruleTrainingTest= ruleTrainingTest EOF
            {
             newCompositeNode(grammarAccess.getTrainingTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingTest=ruleTrainingTest();

            state._fsp--;

             current =iv_ruleTrainingTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainingTest"


    // $ANTLR start "ruleTrainingTest"
    // InternalMml.g:1077:1: ruleTrainingTest returns [EObject current=null] : (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleTrainingTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMml.g:1083:2: ( (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalMml.g:1084:2: (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalMml.g:1084:2: (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalMml.g:1085:3: otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTrainingTestAccess().getPourcentageTrainingKeyword_2());
            		
            // InternalMml.g:1097:3: ( (lv_number_3_0= RULE_INT ) )
            // InternalMml.g:1098:4: (lv_number_3_0= RULE_INT )
            {
            // InternalMml.g:1098:4: (lv_number_3_0= RULE_INT )
            // InternalMml.g:1099:5: lv_number_3_0= RULE_INT
            {
            lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_number_3_0, grammarAccess.getTrainingTestAccess().getNumberINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainingTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrainingTest"


    // $ANTLR start "ruleCSVSeparator"
    // InternalMml.g:1123:1: ruleCSVSeparator returns [Enumerator current=null] : ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) ) ;
    public final Enumerator ruleCSVSeparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMml.g:1129:2: ( ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) ) )
            // InternalMml.g:1130:2: ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) )
            {
            // InternalMml.g:1130:2: ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMml.g:1131:3: (enumLiteral_0= ',' )
                    {
                    // InternalMml.g:1131:3: (enumLiteral_0= ',' )
                    // InternalMml.g:1132:4: enumLiteral_0= ','
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1139:3: (enumLiteral_1= ';' )
                    {
                    // InternalMml.g:1139:3: (enumLiteral_1= ';' )
                    // InternalMml.g:1140:4: enumLiteral_1= ';'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSVSeparator"


    // $ANTLR start "ruleFrameworkLang"
    // InternalMml.g:1150:1: ruleFrameworkLang returns [Enumerator current=null] : ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) ) ;
    public final Enumerator ruleFrameworkLang() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1156:2: ( ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) ) )
            // InternalMml.g:1157:2: ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) )
            {
            // InternalMml.g:1157:2: ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt18=1;
                }
                break;
            case 38:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMml.g:1158:3: (enumLiteral_0= 'scikit-learn' )
                    {
                    // InternalMml.g:1158:3: (enumLiteral_0= 'scikit-learn' )
                    // InternalMml.g:1159:4: enumLiteral_0= 'scikit-learn'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1166:3: (enumLiteral_1= 'R' )
                    {
                    // InternalMml.g:1166:3: (enumLiteral_1= 'R' )
                    // InternalMml.g:1167:4: enumLiteral_1= 'R'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1174:3: (enumLiteral_2= 'Weka' )
                    {
                    // InternalMml.g:1174:3: (enumLiteral_2= 'Weka' )
                    // InternalMml.g:1175:4: enumLiteral_2= 'Weka'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrameworkLang"


    // $ANTLR start "ruleSVMKernel"
    // InternalMml.g:1185:1: ruleSVMKernel returns [Enumerator current=null] : ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) ) ;
    public final Enumerator ruleSVMKernel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1191:2: ( ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) ) )
            // InternalMml.g:1192:2: ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) )
            {
            // InternalMml.g:1192:2: ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMml.g:1193:3: (enumLiteral_0= 'linear' )
                    {
                    // InternalMml.g:1193:3: (enumLiteral_0= 'linear' )
                    // InternalMml.g:1194:4: enumLiteral_0= 'linear'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1201:3: (enumLiteral_1= 'polynomial' )
                    {
                    // InternalMml.g:1201:3: (enumLiteral_1= 'polynomial' )
                    // InternalMml.g:1202:4: enumLiteral_1= 'polynomial'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1209:3: (enumLiteral_2= 'radial' )
                    {
                    // InternalMml.g:1209:3: (enumLiteral_2= 'radial' )
                    // InternalMml.g:1210:4: enumLiteral_2= 'radial'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVMKernel"


    // $ANTLR start "ruleSVMClassification"
    // InternalMml.g:1220:1: ruleSVMClassification returns [Enumerator current=null] : ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) ) ;
    public final Enumerator ruleSVMClassification() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1226:2: ( ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) ) )
            // InternalMml.g:1227:2: ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) )
            {
            // InternalMml.g:1227:2: ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt20=1;
                }
                break;
            case 44:
                {
                alt20=2;
                }
                break;
            case 45:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMml.g:1228:3: (enumLiteral_0= 'C-classification' )
                    {
                    // InternalMml.g:1228:3: (enumLiteral_0= 'C-classification' )
                    // InternalMml.g:1229:4: enumLiteral_0= 'C-classification'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1236:3: (enumLiteral_1= 'nu-classification' )
                    {
                    // InternalMml.g:1236:3: (enumLiteral_1= 'nu-classification' )
                    // InternalMml.g:1237:4: enumLiteral_1= 'nu-classification'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1244:3: (enumLiteral_2= 'one-classification' )
                    {
                    // InternalMml.g:1244:3: (enumLiteral_2= 'one-classification' )
                    // InternalMml.g:1245:4: enumLiteral_2= 'one-classification'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getSVMClassificationAccess().getOneClassEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSVMClassificationAccess().getOneClassEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVMClassification"


    // $ANTLR start "ruleValidationMetric"
    // InternalMml.g:1255:1: ruleValidationMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) ) ;
    public final Enumerator ruleValidationMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1261:2: ( ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) ) )
            // InternalMml.g:1262:2: ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) )
            {
            // InternalMml.g:1262:2: ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt21=1;
                }
                break;
            case 47:
                {
                alt21=2;
                }
                break;
            case 48:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMml.g:1263:3: (enumLiteral_0= 'recall' )
                    {
                    // InternalMml.g:1263:3: (enumLiteral_0= 'recall' )
                    // InternalMml.g:1264:4: enumLiteral_0= 'recall'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1271:3: (enumLiteral_1= 'precision' )
                    {
                    // InternalMml.g:1271:3: (enumLiteral_1= 'precision' )
                    // InternalMml.g:1272:4: enumLiteral_1= 'precision'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1279:3: (enumLiteral_2= 'F1' )
                    {
                    // InternalMml.g:1279:3: (enumLiteral_2= 'F1' )
                    // InternalMml.g:1280:4: enumLiteral_2= 'F1'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidationMetric"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000224000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001F08000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});

}