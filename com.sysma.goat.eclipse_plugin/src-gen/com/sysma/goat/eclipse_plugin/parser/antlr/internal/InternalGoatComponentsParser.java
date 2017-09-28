package com.sysma.goat.eclipse_plugin.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.sysma.goat.eclipse_plugin.services.GoatComponentsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoatComponentsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Component", "Function", "Receiver", "Receive", "Return", "False", "Print", "Sleep", "Until", "Elif", "Else", "Proc", "Send", "This", "True", "Wait", "Nil", "Var", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "PlusSignPlusSign", "ColonEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "At", "If", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_TYPE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Elif=13;
    public static final int Var=21;
    public static final int True=18;
    public static final int False=9;
    public static final int LessThanSign=41;
    public static final int Send=16;
    public static final int Print=10;
    public static final int LeftParenthesis=33;
    public static final int This=17;
    public static final int RightSquareBracket=46;
    public static final int ExclamationMark=32;
    public static final int GreaterThanSign=43;
    public static final int RULE_ID=51;
    public static final int RightParenthesis=34;
    public static final int Receiver=6;
    public static final int ColonEqualsSign=25;
    public static final int GreaterThanSignEqualsSign=28;
    public static final int EqualsSignEqualsSign=27;
    public static final int RULE_TYPE=50;
    public static final int VerticalLine=48;
    public static final int PlusSign=36;
    public static final int RULE_INT=52;
    public static final int RULE_ML_COMMENT=54;
    public static final int LeftSquareBracket=45;
    public static final int Wait=19;
    public static final int If=30;
    public static final int VerticalLineVerticalLine=31;
    public static final int RULE_STRING=53;
    public static final int RULE_SL_COMMENT=55;
    public static final int Proc=15;
    public static final int Function=5;
    public static final int Comma=37;
    public static final int EqualsSign=42;
    public static final int HyphenMinus=38;
    public static final int At=29;
    public static final int AmpersandAmpersand=23;
    public static final int LessThanSignEqualsSign=26;
    public static final int Solidus=40;
    public static final int RightCurlyBracket=49;
    public static final int Component=4;
    public static final int EOF=-1;
    public static final int Asterisk=35;
    public static final int Until=12;
    public static final int FullStop=39;
    public static final int Return=8;
    public static final int RULE_WS=56;
    public static final int LeftCurlyBracket=47;
    public static final int RULE_ANY_OTHER=57;
    public static final int CommercialAt=44;
    public static final int Nil=20;
    public static final int Sleep=11;
    public static final int PlusSignPlusSign=24;
    public static final int Receive=7;
    public static final int Else=14;
    public static final int ExclamationMarkEqualsSign=22;

    // delegates
    // delegators


        public InternalGoatComponentsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoatComponentsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoatComponentsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGoatComponentsParser.g"; }



     	private GoatComponentsGrammarAccess grammarAccess;

        public InternalGoatComponentsParser(TokenStream input, GoatComponentsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GoatComponentsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGoatComponentsParser.g:57:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGoatComponentsParser.g:57:46: (iv_ruleModel= ruleModel EOF )
            // InternalGoatComponentsParser.g:58:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGoatComponentsParser.g:64:1: ruleModel returns [EObject current=null] : ( () ( ( (lv_processes_1_0= ruleProcessDefinition ) ) | ( (lv_components_2_0= ruleComponentDefinition ) ) | ( (lv_functions_3_0= ruleFuncDefinition ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_processes_1_0 = null;

        EObject lv_components_2_0 = null;

        EObject lv_functions_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:70:2: ( ( () ( ( (lv_processes_1_0= ruleProcessDefinition ) ) | ( (lv_components_2_0= ruleComponentDefinition ) ) | ( (lv_functions_3_0= ruleFuncDefinition ) ) )* ) )
            // InternalGoatComponentsParser.g:71:2: ( () ( ( (lv_processes_1_0= ruleProcessDefinition ) ) | ( (lv_components_2_0= ruleComponentDefinition ) ) | ( (lv_functions_3_0= ruleFuncDefinition ) ) )* )
            {
            // InternalGoatComponentsParser.g:71:2: ( () ( ( (lv_processes_1_0= ruleProcessDefinition ) ) | ( (lv_components_2_0= ruleComponentDefinition ) ) | ( (lv_functions_3_0= ruleFuncDefinition ) ) )* )
            // InternalGoatComponentsParser.g:72:3: () ( ( (lv_processes_1_0= ruleProcessDefinition ) ) | ( (lv_components_2_0= ruleComponentDefinition ) ) | ( (lv_functions_3_0= ruleFuncDefinition ) ) )*
            {
            // InternalGoatComponentsParser.g:72:3: ()
            // InternalGoatComponentsParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:79:3: ( ( (lv_processes_1_0= ruleProcessDefinition ) ) | ( (lv_components_2_0= ruleComponentDefinition ) ) | ( (lv_functions_3_0= ruleFuncDefinition ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case Proc:
                    {
                    alt1=1;
                    }
                    break;
                case Component:
                    {
                    alt1=2;
                    }
                    break;
                case Function:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:80:4: ( (lv_processes_1_0= ruleProcessDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:80:4: ( (lv_processes_1_0= ruleProcessDefinition ) )
            	    // InternalGoatComponentsParser.g:81:5: (lv_processes_1_0= ruleProcessDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:81:5: (lv_processes_1_0= ruleProcessDefinition )
            	    // InternalGoatComponentsParser.g:82:6: lv_processes_1_0= ruleProcessDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getProcessesProcessDefinitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_processes_1_0=ruleProcessDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"processes",
            	    							lv_processes_1_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGoatComponentsParser.g:100:4: ( (lv_components_2_0= ruleComponentDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:100:4: ( (lv_components_2_0= ruleComponentDefinition ) )
            	    // InternalGoatComponentsParser.g:101:5: (lv_components_2_0= ruleComponentDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:101:5: (lv_components_2_0= ruleComponentDefinition )
            	    // InternalGoatComponentsParser.g:102:6: lv_components_2_0= ruleComponentDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentDefinitionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_components_2_0=ruleComponentDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_2_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.ComponentDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGoatComponentsParser.g:120:4: ( (lv_functions_3_0= ruleFuncDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:120:4: ( (lv_functions_3_0= ruleFuncDefinition ) )
            	    // InternalGoatComponentsParser.g:121:5: (lv_functions_3_0= ruleFuncDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:121:5: (lv_functions_3_0= ruleFuncDefinition )
            	    // InternalGoatComponentsParser.g:122:6: lv_functions_3_0= ruleFuncDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getFunctionsFuncDefinitionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_functions_3_0=ruleFuncDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"functions",
            	    							lv_functions_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProc"
    // InternalGoatComponentsParser.g:144:1: entryRuleProc returns [EObject current=null] : iv_ruleProc= ruleProc EOF ;
    public final EObject entryRuleProc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProc = null;


        try {
            // InternalGoatComponentsParser.g:144:45: (iv_ruleProc= ruleProc EOF )
            // InternalGoatComponentsParser.g:145:2: iv_ruleProc= ruleProc EOF
            {
             newCompositeNode(grammarAccess.getProcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProc=ruleProc();

            state._fsp--;

             current =iv_ruleProc; 
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
    // $ANTLR end "entryRuleProc"


    // $ANTLR start "ruleProc"
    // InternalGoatComponentsParser.g:151:1: ruleProc returns [EObject current=null] : (this_InterleavingProcess_0= ruleInterleavingProcess | this_NonDeterminismProcess_1= ruleNonDeterminismProcess ) ;
    public final EObject ruleProc() throws RecognitionException {
        EObject current = null;

        EObject this_InterleavingProcess_0 = null;

        EObject this_NonDeterminismProcess_1 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:157:2: ( (this_InterleavingProcess_0= ruleInterleavingProcess | this_NonDeterminismProcess_1= ruleNonDeterminismProcess ) )
            // InternalGoatComponentsParser.g:158:2: (this_InterleavingProcess_0= ruleInterleavingProcess | this_NonDeterminismProcess_1= ruleNonDeterminismProcess )
            {
            // InternalGoatComponentsParser.g:158:2: (this_InterleavingProcess_0= ruleInterleavingProcess | this_NonDeterminismProcess_1= ruleNonDeterminismProcess )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==Receive||LA2_0==Send||(LA2_0>=Wait && LA2_0<=Nil)||LA2_0==If||LA2_0==LeftParenthesis||LA2_0==LeftSquareBracket||LA2_0==LeftCurlyBracket) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatComponentsParser.g:159:3: this_InterleavingProcess_0= ruleInterleavingProcess
                    {

                    			newCompositeNode(grammarAccess.getProcAccess().getInterleavingProcessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InterleavingProcess_0=ruleInterleavingProcess();

                    state._fsp--;


                    			current = this_InterleavingProcess_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:168:3: this_NonDeterminismProcess_1= ruleNonDeterminismProcess
                    {

                    			newCompositeNode(grammarAccess.getProcAccess().getNonDeterminismProcessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonDeterminismProcess_1=ruleNonDeterminismProcess();

                    state._fsp--;


                    			current = this_NonDeterminismProcess_1;
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
    // $ANTLR end "ruleProc"


    // $ANTLR start "entryRuleInterleavingProcess"
    // InternalGoatComponentsParser.g:180:1: entryRuleInterleavingProcess returns [EObject current=null] : iv_ruleInterleavingProcess= ruleInterleavingProcess EOF ;
    public final EObject entryRuleInterleavingProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterleavingProcess = null;


        try {
            // InternalGoatComponentsParser.g:180:60: (iv_ruleInterleavingProcess= ruleInterleavingProcess EOF )
            // InternalGoatComponentsParser.g:181:2: iv_ruleInterleavingProcess= ruleInterleavingProcess EOF
            {
             newCompositeNode(grammarAccess.getInterleavingProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterleavingProcess=ruleInterleavingProcess();

            state._fsp--;

             current =iv_ruleInterleavingProcess; 
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
    // $ANTLR end "entryRuleInterleavingProcess"


    // $ANTLR start "ruleInterleavingProcess"
    // InternalGoatComponentsParser.g:187:1: ruleInterleavingProcess returns [EObject current=null] : (this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )* ) ;
    public final EObject ruleInterleavingProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CallProcess_0 = null;

        EObject lv_subProcs_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:193:2: ( (this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )* ) )
            // InternalGoatComponentsParser.g:194:2: (this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )* )
            {
            // InternalGoatComponentsParser.g:194:2: (this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )* )
            // InternalGoatComponentsParser.g:195:3: this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )*
            {

            			newCompositeNode(grammarAccess.getInterleavingProcessAccess().getCallProcessParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_CallProcess_0=ruleCallProcess();

            state._fsp--;


            			current = this_CallProcess_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:203:3: ()
            // InternalGoatComponentsParser.g:204:4: 
            {

            				current = forceCreateModelElementAndAdd(
            					grammarAccess.getInterleavingProcessAccess().getInterleavingProcessSubProcsAction_1(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:210:3: (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VerticalLine) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:211:4: otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) )
            	    {
            	    otherlv_2=(Token)match(input,VerticalLine,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInterleavingProcessAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalGoatComponentsParser.g:215:4: ( (lv_subProcs_3_0= ruleCallProcess ) )
            	    // InternalGoatComponentsParser.g:216:5: (lv_subProcs_3_0= ruleCallProcess )
            	    {
            	    // InternalGoatComponentsParser.g:216:5: (lv_subProcs_3_0= ruleCallProcess )
            	    // InternalGoatComponentsParser.g:217:6: lv_subProcs_3_0= ruleCallProcess
            	    {

            	    						newCompositeNode(grammarAccess.getInterleavingProcessAccess().getSubProcsCallProcessParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_subProcs_3_0=ruleCallProcess();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInterleavingProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subProcs",
            	    							lv_subProcs_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.CallProcess");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleInterleavingProcess"


    // $ANTLR start "entryRuleNonDeterminismProcess"
    // InternalGoatComponentsParser.g:239:1: entryRuleNonDeterminismProcess returns [EObject current=null] : iv_ruleNonDeterminismProcess= ruleNonDeterminismProcess EOF ;
    public final EObject entryRuleNonDeterminismProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonDeterminismProcess = null;


        try {
            // InternalGoatComponentsParser.g:239:62: (iv_ruleNonDeterminismProcess= ruleNonDeterminismProcess EOF )
            // InternalGoatComponentsParser.g:240:2: iv_ruleNonDeterminismProcess= ruleNonDeterminismProcess EOF
            {
             newCompositeNode(grammarAccess.getNonDeterminismProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonDeterminismProcess=ruleNonDeterminismProcess();

            state._fsp--;

             current =iv_ruleNonDeterminismProcess; 
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
    // $ANTLR end "entryRuleNonDeterminismProcess"


    // $ANTLR start "ruleNonDeterminismProcess"
    // InternalGoatComponentsParser.g:246:1: ruleNonDeterminismProcess returns [EObject current=null] : (this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses | this_IfProcesses_1= ruleIfProcesses | this_NProcess_2= ruleNProcess ) ;
    public final EObject ruleNonDeterminismProcess() throws RecognitionException {
        EObject current = null;

        EObject this_PredOutputProcessOrInputProcesses_0 = null;

        EObject this_IfProcesses_1 = null;

        EObject this_NProcess_2 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:252:2: ( (this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses | this_IfProcesses_1= ruleIfProcesses | this_NProcess_2= ruleNProcess ) )
            // InternalGoatComponentsParser.g:253:2: (this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses | this_IfProcesses_1= ruleIfProcesses | this_NProcess_2= ruleNProcess )
            {
            // InternalGoatComponentsParser.g:253:2: (this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses | this_IfProcesses_1= ruleIfProcesses | this_NProcess_2= ruleNProcess )
            int alt4=3;
            switch ( input.LA(1) ) {
            case EOF:
            case Receive:
            case Send:
            case Wait:
            case LeftSquareBracket:
            case LeftCurlyBracket:
                {
                alt4=1;
                }
                break;
            case If:
                {
                alt4=2;
                }
                break;
            case Nil:
            case LeftParenthesis:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGoatComponentsParser.g:254:3: this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses
                    {

                    			newCompositeNode(grammarAccess.getNonDeterminismProcessAccess().getPredOutputProcessOrInputProcessesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredOutputProcessOrInputProcesses_0=rulePredOutputProcessOrInputProcesses();

                    state._fsp--;


                    			current = this_PredOutputProcessOrInputProcesses_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:263:3: this_IfProcesses_1= ruleIfProcesses
                    {

                    			newCompositeNode(grammarAccess.getNonDeterminismProcessAccess().getIfProcessesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfProcesses_1=ruleIfProcesses();

                    state._fsp--;


                    			current = this_IfProcesses_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:272:3: this_NProcess_2= ruleNProcess
                    {

                    			newCompositeNode(grammarAccess.getNonDeterminismProcessAccess().getNProcessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NProcess_2=ruleNProcess();

                    state._fsp--;


                    			current = this_NProcess_2;
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
    // $ANTLR end "ruleNonDeterminismProcess"


    // $ANTLR start "entryRulePreconditions"
    // InternalGoatComponentsParser.g:284:1: entryRulePreconditions returns [EObject current=null] : iv_rulePreconditions= rulePreconditions EOF ;
    public final EObject entryRulePreconditions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreconditions = null;


        try {
            // InternalGoatComponentsParser.g:284:54: (iv_rulePreconditions= rulePreconditions EOF )
            // InternalGoatComponentsParser.g:285:2: iv_rulePreconditions= rulePreconditions EOF
            {
             newCompositeNode(grammarAccess.getPreconditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreconditions=rulePreconditions();

            state._fsp--;

             current =iv_rulePreconditions; 
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
    // $ANTLR end "entryRulePreconditions"


    // $ANTLR start "rulePreconditions"
    // InternalGoatComponentsParser.g:291:1: rulePreconditions returns [EObject current=null] : ( () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )* ) ;
    public final EObject rulePreconditions() throws RecognitionException {
        EObject current = null;

        EObject lv_precond_1_1 = null;

        EObject lv_precond_1_2 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:297:2: ( ( () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )* ) )
            // InternalGoatComponentsParser.g:298:2: ( () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )* )
            {
            // InternalGoatComponentsParser.g:298:2: ( () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )* )
            // InternalGoatComponentsParser.g:299:3: () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )*
            {
            // InternalGoatComponentsParser.g:299:3: ()
            // InternalGoatComponentsParser.g:300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPreconditionsAccess().getPreconditionsAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:306:3: ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Wait||LA6_0==LeftSquareBracket) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:307:4: ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) )
            	    {
            	    // InternalGoatComponentsParser.g:307:4: ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) )
            	    // InternalGoatComponentsParser.g:308:5: (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness )
            	    {
            	    // InternalGoatComponentsParser.g:308:5: (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==LeftSquareBracket) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==Wait) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalGoatComponentsParser.g:309:6: lv_precond_1_1= ruleUpdate
            	            {

            	            						newCompositeNode(grammarAccess.getPreconditionsAccess().getPrecondUpdateParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_6);
            	            lv_precond_1_1=ruleUpdate();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPreconditionsRule());
            	            						}
            	            						add(
            	            							current,
            	            							"precond",
            	            							lv_precond_1_1,
            	            							"com.sysma.goat.eclipse_plugin.GoatComponents.Update");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalGoatComponentsParser.g:325:6: lv_precond_1_2= ruleAwareness
            	            {

            	            						newCompositeNode(grammarAccess.getPreconditionsAccess().getPrecondAwarenessParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_6);
            	            lv_precond_1_2=ruleAwareness();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPreconditionsRule());
            	            						}
            	            						add(
            	            							current,
            	            							"precond",
            	            							lv_precond_1_2,
            	            							"com.sysma.goat.eclipse_plugin.GoatComponents.Awareness");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "rulePreconditions"


    // $ANTLR start "entryRulePredOutputProcessOrInputProcesses"
    // InternalGoatComponentsParser.g:347:1: entryRulePredOutputProcessOrInputProcesses returns [EObject current=null] : iv_rulePredOutputProcessOrInputProcesses= rulePredOutputProcessOrInputProcesses EOF ;
    public final EObject entryRulePredOutputProcessOrInputProcesses() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredOutputProcessOrInputProcesses = null;


        try {
            // InternalGoatComponentsParser.g:347:74: (iv_rulePredOutputProcessOrInputProcesses= rulePredOutputProcessOrInputProcesses EOF )
            // InternalGoatComponentsParser.g:348:2: iv_rulePredOutputProcessOrInputProcesses= rulePredOutputProcessOrInputProcesses EOF
            {
             newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredOutputProcessOrInputProcesses=rulePredOutputProcessOrInputProcesses();

            state._fsp--;

             current =iv_rulePredOutputProcessOrInputProcesses; 
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
    // $ANTLR end "entryRulePredOutputProcessOrInputProcesses"


    // $ANTLR start "rulePredOutputProcessOrInputProcesses"
    // InternalGoatComponentsParser.g:354:1: rulePredOutputProcessOrInputProcesses returns [EObject current=null] : (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) ) ) ;
    public final EObject rulePredOutputProcessOrInputProcesses() throws RecognitionException {
        EObject current = null;

        EObject this_Preconditions_0 = null;

        EObject this_OutputProcessPart_2 = null;

        EObject this_InputProcessesPart_4 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:360:2: ( (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) ) ) )
            // InternalGoatComponentsParser.g:361:2: (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) ) )
            {
            // InternalGoatComponentsParser.g:361:2: (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) ) )
            // InternalGoatComponentsParser.g:362:3: this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) )
            {

            			newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getPreconditionsParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Preconditions_0=rulePreconditions();

            state._fsp--;


            			current = this_Preconditions_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:370:3: ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Send) ) {
                alt7=1;
            }
            else if ( (LA7_0==Receive) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoatComponentsParser.g:371:4: ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] )
                    {
                    // InternalGoatComponentsParser.g:371:4: ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] )
                    // InternalGoatComponentsParser.g:372:5: () this_OutputProcessPart_2= ruleOutputProcessPart[$current]
                    {
                    // InternalGoatComponentsParser.g:372:5: ()
                    // InternalGoatComponentsParser.g:373:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getPredOutputProcessOrInputProcessesAccess().getOutputProcessPrecondAction_1_0_0(),
                    							current);
                    					

                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPredOutputProcessOrInputProcessesRule());
                    					}
                    					newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getOutputProcessPartParserRuleCall_1_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    this_OutputProcessPart_2=ruleOutputProcessPart(current);

                    state._fsp--;


                    					current = this_OutputProcessPart_2;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:392:4: ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] )
                    {
                    // InternalGoatComponentsParser.g:392:4: ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] )
                    // InternalGoatComponentsParser.g:393:5: () this_InputProcessesPart_4= ruleInputProcessesPart[$current]
                    {
                    // InternalGoatComponentsParser.g:393:5: ()
                    // InternalGoatComponentsParser.g:394:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getPredOutputProcessOrInputProcessesAccess().getInputProcessesPrecondsAction_1_1_0(),
                    							current);
                    					

                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPredOutputProcessOrInputProcessesRule());
                    					}
                    					newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getInputProcessesPartParserRuleCall_1_1_1());
                    				
                    pushFollow(FOLLOW_2);
                    this_InputProcessesPart_4=ruleInputProcessesPart(current);

                    state._fsp--;


                    					current = this_InputProcessesPart_4;
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
    // $ANTLR end "rulePredOutputProcessOrInputProcesses"


    // $ANTLR start "entryRulePredOutputProcessOrInputProcess"
    // InternalGoatComponentsParser.g:417:1: entryRulePredOutputProcessOrInputProcess returns [EObject current=null] : iv_rulePredOutputProcessOrInputProcess= rulePredOutputProcessOrInputProcess EOF ;
    public final EObject entryRulePredOutputProcessOrInputProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredOutputProcessOrInputProcess = null;


        try {
            // InternalGoatComponentsParser.g:417:72: (iv_rulePredOutputProcessOrInputProcess= rulePredOutputProcessOrInputProcess EOF )
            // InternalGoatComponentsParser.g:418:2: iv_rulePredOutputProcessOrInputProcess= rulePredOutputProcessOrInputProcess EOF
            {
             newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredOutputProcessOrInputProcess=rulePredOutputProcessOrInputProcess();

            state._fsp--;

             current =iv_rulePredOutputProcessOrInputProcess; 
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
    // $ANTLR end "entryRulePredOutputProcessOrInputProcess"


    // $ANTLR start "rulePredOutputProcessOrInputProcess"
    // InternalGoatComponentsParser.g:424:1: rulePredOutputProcessOrInputProcess returns [EObject current=null] : (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) ) ) ;
    public final EObject rulePredOutputProcessOrInputProcess() throws RecognitionException {
        EObject current = null;

        EObject this_Preconditions_0 = null;

        EObject this_OutputProcessPart_2 = null;

        EObject lv_inputs_4_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:430:2: ( (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) ) ) )
            // InternalGoatComponentsParser.g:431:2: (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) ) )
            {
            // InternalGoatComponentsParser.g:431:2: (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) ) )
            // InternalGoatComponentsParser.g:432:3: this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) )
            {

            			newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessAccess().getPreconditionsParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Preconditions_0=rulePreconditions();

            state._fsp--;


            			current = this_Preconditions_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:440:3: ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Send) ) {
                alt8=1;
            }
            else if ( (LA8_0==Receive) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoatComponentsParser.g:441:4: ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] )
                    {
                    // InternalGoatComponentsParser.g:441:4: ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] )
                    // InternalGoatComponentsParser.g:442:5: () this_OutputProcessPart_2= ruleOutputProcessPart[$current]
                    {
                    // InternalGoatComponentsParser.g:442:5: ()
                    // InternalGoatComponentsParser.g:443:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getPredOutputProcessOrInputProcessAccess().getOutputProcessPrecondAction_1_0_0(),
                    							current);
                    					

                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPredOutputProcessOrInputProcessRule());
                    					}
                    					newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessAccess().getOutputProcessPartParserRuleCall_1_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    this_OutputProcessPart_2=ruleOutputProcessPart(current);

                    state._fsp--;


                    					current = this_OutputProcessPart_2;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:462:4: ( () ( (lv_inputs_4_0= ruleInputProcess ) ) )
                    {
                    // InternalGoatComponentsParser.g:462:4: ( () ( (lv_inputs_4_0= ruleInputProcess ) ) )
                    // InternalGoatComponentsParser.g:463:5: () ( (lv_inputs_4_0= ruleInputProcess ) )
                    {
                    // InternalGoatComponentsParser.g:463:5: ()
                    // InternalGoatComponentsParser.g:464:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputProcessesPrecondsAction_1_1_0(),
                    							current);
                    					

                    }

                    // InternalGoatComponentsParser.g:470:5: ( (lv_inputs_4_0= ruleInputProcess ) )
                    // InternalGoatComponentsParser.g:471:6: (lv_inputs_4_0= ruleInputProcess )
                    {
                    // InternalGoatComponentsParser.g:471:6: (lv_inputs_4_0= ruleInputProcess )
                    // InternalGoatComponentsParser.g:472:7: lv_inputs_4_0= ruleInputProcess
                    {

                    							newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputsInputProcessParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_inputs_4_0=ruleInputProcess();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPredOutputProcessOrInputProcessRule());
                    							}
                    							add(
                    								current,
                    								"inputs",
                    								lv_inputs_4_0,
                    								"com.sysma.goat.eclipse_plugin.GoatComponents.InputProcess");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "rulePredOutputProcessOrInputProcess"


    // $ANTLR start "ruleInputProcessesPart"
    // InternalGoatComponentsParser.g:496:1: ruleInputProcessesPart[EObject in_current] returns [EObject current=in_current] : ( ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )* ) ;
    public final EObject ruleInputProcessesPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_inputs_0_0 = null;

        EObject lv_preconds_2_0 = null;

        EObject lv_inputs_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:502:2: ( ( ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )* ) )
            // InternalGoatComponentsParser.g:503:2: ( ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )* )
            {
            // InternalGoatComponentsParser.g:503:2: ( ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )* )
            // InternalGoatComponentsParser.g:504:3: ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )*
            {
            // InternalGoatComponentsParser.g:504:3: ( (lv_inputs_0_0= ruleInputProcess ) )
            // InternalGoatComponentsParser.g:505:4: (lv_inputs_0_0= ruleInputProcess )
            {
            // InternalGoatComponentsParser.g:505:4: (lv_inputs_0_0= ruleInputProcess )
            // InternalGoatComponentsParser.g:506:5: lv_inputs_0_0= ruleInputProcess
            {

            					newCompositeNode(grammarAccess.getInputProcessesPartAccess().getInputsInputProcessParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_inputs_0_0=ruleInputProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputProcessesPartRule());
            					}
            					add(
            						current,
            						"inputs",
            						lv_inputs_0_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.InputProcess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:523:3: (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==PlusSign) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:524:4: otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) )
            	    {
            	    otherlv_1=(Token)match(input,PlusSign,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInputProcessesPartAccess().getPlusSignKeyword_1_0());
            	    			
            	    // InternalGoatComponentsParser.g:528:4: ( (lv_preconds_2_0= rulePreconditions ) )
            	    // InternalGoatComponentsParser.g:529:5: (lv_preconds_2_0= rulePreconditions )
            	    {
            	    // InternalGoatComponentsParser.g:529:5: (lv_preconds_2_0= rulePreconditions )
            	    // InternalGoatComponentsParser.g:530:6: lv_preconds_2_0= rulePreconditions
            	    {

            	    						newCompositeNode(grammarAccess.getInputProcessesPartAccess().getPrecondsPreconditionsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_preconds_2_0=rulePreconditions();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputProcessesPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"preconds",
            	    							lv_preconds_2_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.Preconditions");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGoatComponentsParser.g:547:4: ( (lv_inputs_3_0= ruleInputProcess ) )
            	    // InternalGoatComponentsParser.g:548:5: (lv_inputs_3_0= ruleInputProcess )
            	    {
            	    // InternalGoatComponentsParser.g:548:5: (lv_inputs_3_0= ruleInputProcess )
            	    // InternalGoatComponentsParser.g:549:6: lv_inputs_3_0= ruleInputProcess
            	    {

            	    						newCompositeNode(grammarAccess.getInputProcessesPartAccess().getInputsInputProcessParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_inputs_3_0=ruleInputProcess();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputProcessesPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.InputProcess");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleInputProcessesPart"


    // $ANTLR start "entryRuleInputProcess"
    // InternalGoatComponentsParser.g:571:1: entryRuleInputProcess returns [EObject current=null] : iv_ruleInputProcess= ruleInputProcess EOF ;
    public final EObject entryRuleInputProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputProcess = null;


        try {
            // InternalGoatComponentsParser.g:571:53: (iv_ruleInputProcess= ruleInputProcess EOF )
            // InternalGoatComponentsParser.g:572:2: iv_ruleInputProcess= ruleInputProcess EOF
            {
             newCompositeNode(grammarAccess.getInputProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputProcess=ruleInputProcess();

            state._fsp--;

             current =iv_ruleInputProcess; 
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
    // $ANTLR end "entryRuleInputProcess"


    // $ANTLR start "ruleInputProcess"
    // InternalGoatComponentsParser.g:578:1: ruleInputProcess returns [EObject current=null] : ( () otherlv_1= Receive otherlv_2= LeftParenthesis ( (lv_rec_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis otherlv_5= LeftCurlyBracket ( ( (lv_msgInParts_6_0= ruleAttributeToSet ) ) (otherlv_7= Comma ( (lv_msgInParts_8_0= ruleAttributeToSet ) ) )* )? otherlv_9= RightCurlyBracket (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? otherlv_14= FullStop ( (lv_next_15_0= ruleNZCProcess ) ) ) ;
    public final EObject ruleInputProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_output_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_rec_pred_3_0 = null;

        EObject lv_msgInParts_6_0 = null;

        EObject lv_msgInParts_8_0 = null;

        EObject lv_next_15_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:584:2: ( ( () otherlv_1= Receive otherlv_2= LeftParenthesis ( (lv_rec_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis otherlv_5= LeftCurlyBracket ( ( (lv_msgInParts_6_0= ruleAttributeToSet ) ) (otherlv_7= Comma ( (lv_msgInParts_8_0= ruleAttributeToSet ) ) )* )? otherlv_9= RightCurlyBracket (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? otherlv_14= FullStop ( (lv_next_15_0= ruleNZCProcess ) ) ) )
            // InternalGoatComponentsParser.g:585:2: ( () otherlv_1= Receive otherlv_2= LeftParenthesis ( (lv_rec_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis otherlv_5= LeftCurlyBracket ( ( (lv_msgInParts_6_0= ruleAttributeToSet ) ) (otherlv_7= Comma ( (lv_msgInParts_8_0= ruleAttributeToSet ) ) )* )? otherlv_9= RightCurlyBracket (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? otherlv_14= FullStop ( (lv_next_15_0= ruleNZCProcess ) ) )
            {
            // InternalGoatComponentsParser.g:585:2: ( () otherlv_1= Receive otherlv_2= LeftParenthesis ( (lv_rec_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis otherlv_5= LeftCurlyBracket ( ( (lv_msgInParts_6_0= ruleAttributeToSet ) ) (otherlv_7= Comma ( (lv_msgInParts_8_0= ruleAttributeToSet ) ) )* )? otherlv_9= RightCurlyBracket (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? otherlv_14= FullStop ( (lv_next_15_0= ruleNZCProcess ) ) )
            // InternalGoatComponentsParser.g:586:3: () otherlv_1= Receive otherlv_2= LeftParenthesis ( (lv_rec_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis otherlv_5= LeftCurlyBracket ( ( (lv_msgInParts_6_0= ruleAttributeToSet ) ) (otherlv_7= Comma ( (lv_msgInParts_8_0= ruleAttributeToSet ) ) )* )? otherlv_9= RightCurlyBracket (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? otherlv_14= FullStop ( (lv_next_15_0= ruleNZCProcess ) )
            {
            // InternalGoatComponentsParser.g:586:3: ()
            // InternalGoatComponentsParser.g:587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputProcessAccess().getInputProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Receive,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInputProcessAccess().getReceiveKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getInputProcessAccess().getLeftParenthesisKeyword_2());
            		
            // InternalGoatComponentsParser.g:601:3: ( (lv_rec_pred_3_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:602:4: (lv_rec_pred_3_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:602:4: (lv_rec_pred_3_0= ruleExpression )
            // InternalGoatComponentsParser.g:603:5: lv_rec_pred_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInputProcessAccess().getRec_predExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_rec_pred_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputProcessRule());
            					}
            					set(
            						current,
            						"rec_pred",
            						lv_rec_pred_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getInputProcessAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,LeftCurlyBracket,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getInputProcessAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGoatComponentsParser.g:628:3: ( ( (lv_msgInParts_6_0= ruleAttributeToSet ) ) (otherlv_7= Comma ( (lv_msgInParts_8_0= ruleAttributeToSet ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Proc||LA11_0==This) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoatComponentsParser.g:629:4: ( (lv_msgInParts_6_0= ruleAttributeToSet ) ) (otherlv_7= Comma ( (lv_msgInParts_8_0= ruleAttributeToSet ) ) )*
                    {
                    // InternalGoatComponentsParser.g:629:4: ( (lv_msgInParts_6_0= ruleAttributeToSet ) )
                    // InternalGoatComponentsParser.g:630:5: (lv_msgInParts_6_0= ruleAttributeToSet )
                    {
                    // InternalGoatComponentsParser.g:630:5: (lv_msgInParts_6_0= ruleAttributeToSet )
                    // InternalGoatComponentsParser.g:631:6: lv_msgInParts_6_0= ruleAttributeToSet
                    {

                    						newCompositeNode(grammarAccess.getInputProcessAccess().getMsgInPartsAttributeToSetParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_msgInParts_6_0=ruleAttributeToSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputProcessRule());
                    						}
                    						add(
                    							current,
                    							"msgInParts",
                    							lv_msgInParts_6_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.AttributeToSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:648:4: (otherlv_7= Comma ( (lv_msgInParts_8_0= ruleAttributeToSet ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:649:5: otherlv_7= Comma ( (lv_msgInParts_8_0= ruleAttributeToSet ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_16); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInputProcessAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:653:5: ( (lv_msgInParts_8_0= ruleAttributeToSet ) )
                    	    // InternalGoatComponentsParser.g:654:6: (lv_msgInParts_8_0= ruleAttributeToSet )
                    	    {
                    	    // InternalGoatComponentsParser.g:654:6: (lv_msgInParts_8_0= ruleAttributeToSet )
                    	    // InternalGoatComponentsParser.g:655:7: lv_msgInParts_8_0= ruleAttributeToSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getInputProcessAccess().getMsgInPartsAttributeToSetParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_msgInParts_8_0=ruleAttributeToSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInputProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"msgInParts",
                    	    								lv_msgInParts_8_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.AttributeToSet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightCurlyBracket,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getInputProcessAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalGoatComponentsParser.g:678:3: (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Print) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGoatComponentsParser.g:679:4: otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis
                    {
                    otherlv_10=(Token)match(input,Print,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getInputProcessAccess().getPrintKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,LeftParenthesis,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getInputProcessAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalGoatComponentsParser.g:687:4: ( (lv_output_12_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:688:5: (lv_output_12_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:688:5: (lv_output_12_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:689:6: lv_output_12_0= RULE_STRING
                    {
                    lv_output_12_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_output_12_0, grammarAccess.getInputProcessAccess().getOutputSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"output",
                    							lv_output_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,RightParenthesis,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getInputProcessAccess().getRightParenthesisKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,FullStop,FOLLOW_20); 

            			newLeafNode(otherlv_14, grammarAccess.getInputProcessAccess().getFullStopKeyword_9());
            		
            // InternalGoatComponentsParser.g:714:3: ( (lv_next_15_0= ruleNZCProcess ) )
            // InternalGoatComponentsParser.g:715:4: (lv_next_15_0= ruleNZCProcess )
            {
            // InternalGoatComponentsParser.g:715:4: (lv_next_15_0= ruleNZCProcess )
            // InternalGoatComponentsParser.g:716:5: lv_next_15_0= ruleNZCProcess
            {

            					newCompositeNode(grammarAccess.getInputProcessAccess().getNextNZCProcessParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_next_15_0=ruleNZCProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputProcessRule());
            					}
            					set(
            						current,
            						"next",
            						lv_next_15_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.NZCProcess");
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
    // $ANTLR end "ruleInputProcess"


    // $ANTLR start "ruleOutputProcessPart"
    // InternalGoatComponentsParser.g:738:1: ruleOutputProcessPart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleExpression ) ) otherlv_9= RightParenthesis (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? (otherlv_14= Sleep otherlv_15= LeftParenthesis ( (lv_msec_16_0= RULE_INT ) ) otherlv_17= RightParenthesis )? otherlv_18= FullStop ( (lv_next_19_0= ruleProc ) ) ) ;
    public final EObject ruleOutputProcessPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_output_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_msec_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_msgOutParts_2_0 = null;

        EObject lv_msgOutParts_4_0 = null;

        EObject lv_send_pred_8_0 = null;

        EObject lv_next_19_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:744:2: ( (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleExpression ) ) otherlv_9= RightParenthesis (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? (otherlv_14= Sleep otherlv_15= LeftParenthesis ( (lv_msec_16_0= RULE_INT ) ) otherlv_17= RightParenthesis )? otherlv_18= FullStop ( (lv_next_19_0= ruleProc ) ) ) )
            // InternalGoatComponentsParser.g:745:2: (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleExpression ) ) otherlv_9= RightParenthesis (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? (otherlv_14= Sleep otherlv_15= LeftParenthesis ( (lv_msec_16_0= RULE_INT ) ) otherlv_17= RightParenthesis )? otherlv_18= FullStop ( (lv_next_19_0= ruleProc ) ) )
            {
            // InternalGoatComponentsParser.g:745:2: (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleExpression ) ) otherlv_9= RightParenthesis (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? (otherlv_14= Sleep otherlv_15= LeftParenthesis ( (lv_msec_16_0= RULE_INT ) ) otherlv_17= RightParenthesis )? otherlv_18= FullStop ( (lv_next_19_0= ruleProc ) ) )
            // InternalGoatComponentsParser.g:746:3: otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleExpression ) ) otherlv_9= RightParenthesis (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )? (otherlv_14= Sleep otherlv_15= LeftParenthesis ( (lv_msec_16_0= RULE_INT ) ) otherlv_17= RightParenthesis )? otherlv_18= FullStop ( (lv_next_19_0= ruleProc ) )
            {
            otherlv_0=(Token)match(input,Send,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputProcessPartAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputProcessPartAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:754:3: ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Receiver||LA14_0==False||LA14_0==Proc||(LA14_0>=This && LA14_0<=True)||(LA14_0>=ExclamationMark && LA14_0<=LeftParenthesis)||(LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGoatComponentsParser.g:755:4: ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )*
                    {
                    // InternalGoatComponentsParser.g:755:4: ( (lv_msgOutParts_2_0= ruleExpression ) )
                    // InternalGoatComponentsParser.g:756:5: (lv_msgOutParts_2_0= ruleExpression )
                    {
                    // InternalGoatComponentsParser.g:756:5: (lv_msgOutParts_2_0= ruleExpression )
                    // InternalGoatComponentsParser.g:757:6: lv_msgOutParts_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_msgOutParts_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputProcessPartRule());
                    						}
                    						add(
                    							current,
                    							"msgOutParts",
                    							lv_msgOutParts_2_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:774:4: (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:775:5: otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOutputProcessPartAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:779:5: ( (lv_msgOutParts_4_0= ruleExpression ) )
                    	    // InternalGoatComponentsParser.g:780:6: (lv_msgOutParts_4_0= ruleExpression )
                    	    {
                    	    // InternalGoatComponentsParser.g:780:6: (lv_msgOutParts_4_0= ruleExpression )
                    	    // InternalGoatComponentsParser.g:781:7: lv_msgOutParts_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_msgOutParts_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOutputProcessPartRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"msgOutParts",
                    	    								lv_msgOutParts_4_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
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
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getOutputProcessPartAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_6=(Token)match(input,CommercialAt,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getOutputProcessPartAccess().getCommercialAtKeyword_4());
            		
            otherlv_7=(Token)match(input,LeftParenthesis,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_5());
            		
            // InternalGoatComponentsParser.g:812:3: ( (lv_send_pred_8_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:813:4: (lv_send_pred_8_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:813:4: (lv_send_pred_8_0= ruleExpression )
            // InternalGoatComponentsParser.g:814:5: lv_send_pred_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOutputProcessPartAccess().getSend_predExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_send_pred_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputProcessPartRule());
            					}
            					set(
            						current,
            						"send_pred",
            						lv_send_pred_8_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_7());
            		
            // InternalGoatComponentsParser.g:835:3: (otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Print) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGoatComponentsParser.g:836:4: otherlv_10= Print otherlv_11= LeftParenthesis ( (lv_output_12_0= RULE_STRING ) ) otherlv_13= RightParenthesis
                    {
                    otherlv_10=(Token)match(input,Print,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getOutputProcessPartAccess().getPrintKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,LeftParenthesis,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalGoatComponentsParser.g:844:4: ( (lv_output_12_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:845:5: (lv_output_12_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:845:5: (lv_output_12_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:846:6: lv_output_12_0= RULE_STRING
                    {
                    lv_output_12_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_output_12_0, grammarAccess.getOutputProcessPartAccess().getOutputSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputProcessPartRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"output",
                    							lv_output_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,RightParenthesis,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalGoatComponentsParser.g:867:3: (otherlv_14= Sleep otherlv_15= LeftParenthesis ( (lv_msec_16_0= RULE_INT ) ) otherlv_17= RightParenthesis )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Sleep) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGoatComponentsParser.g:868:4: otherlv_14= Sleep otherlv_15= LeftParenthesis ( (lv_msec_16_0= RULE_INT ) ) otherlv_17= RightParenthesis
                    {
                    otherlv_14=(Token)match(input,Sleep,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getOutputProcessPartAccess().getSleepKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,LeftParenthesis,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalGoatComponentsParser.g:876:4: ( (lv_msec_16_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:877:5: (lv_msec_16_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:877:5: (lv_msec_16_0= RULE_INT )
                    // InternalGoatComponentsParser.g:878:6: lv_msec_16_0= RULE_INT
                    {
                    lv_msec_16_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_msec_16_0, grammarAccess.getOutputProcessPartAccess().getMsecINTTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputProcessPartRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"msec",
                    							lv_msec_16_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,RightParenthesis,FOLLOW_19); 

                    				newLeafNode(otherlv_17, grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_9_3());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,FullStop,FOLLOW_26); 

            			newLeafNode(otherlv_18, grammarAccess.getOutputProcessPartAccess().getFullStopKeyword_10());
            		
            // InternalGoatComponentsParser.g:903:3: ( (lv_next_19_0= ruleProc ) )
            // InternalGoatComponentsParser.g:904:4: (lv_next_19_0= ruleProc )
            {
            // InternalGoatComponentsParser.g:904:4: (lv_next_19_0= ruleProc )
            // InternalGoatComponentsParser.g:905:5: lv_next_19_0= ruleProc
            {

            					newCompositeNode(grammarAccess.getOutputProcessPartAccess().getNextProcParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_next_19_0=ruleProc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputProcessPartRule());
            					}
            					set(
            						current,
            						"next",
            						lv_next_19_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Proc");
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
    // $ANTLR end "ruleOutputProcessPart"


    // $ANTLR start "entryRuleIfProcesses"
    // InternalGoatComponentsParser.g:926:1: entryRuleIfProcesses returns [EObject current=null] : iv_ruleIfProcesses= ruleIfProcesses EOF ;
    public final EObject entryRuleIfProcesses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfProcesses = null;


        try {
            // InternalGoatComponentsParser.g:926:52: (iv_ruleIfProcesses= ruleIfProcesses EOF )
            // InternalGoatComponentsParser.g:927:2: iv_ruleIfProcesses= ruleIfProcesses EOF
            {
             newCompositeNode(grammarAccess.getIfProcessesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfProcesses=ruleIfProcesses();

            state._fsp--;

             current =iv_ruleIfProcesses; 
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
    // $ANTLR end "entryRuleIfProcesses"


    // $ANTLR start "ruleIfProcesses"
    // InternalGoatComponentsParser.g:933:1: ruleIfProcesses returns [EObject current=null] : ( () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )* ) ;
    public final EObject ruleIfProcesses() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_branches_1_0 = null;

        EObject lv_branches_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:939:2: ( ( () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )* ) )
            // InternalGoatComponentsParser.g:940:2: ( () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )* )
            {
            // InternalGoatComponentsParser.g:940:2: ( () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )* )
            // InternalGoatComponentsParser.g:941:3: () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )*
            {
            // InternalGoatComponentsParser.g:941:3: ()
            // InternalGoatComponentsParser.g:942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfProcessesAccess().getIfProcessesAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:948:3: ( (lv_branches_1_0= ruleIfBranchProcess ) )
            // InternalGoatComponentsParser.g:949:4: (lv_branches_1_0= ruleIfBranchProcess )
            {
            // InternalGoatComponentsParser.g:949:4: (lv_branches_1_0= ruleIfBranchProcess )
            // InternalGoatComponentsParser.g:950:5: lv_branches_1_0= ruleIfBranchProcess
            {

            					newCompositeNode(grammarAccess.getIfProcessesAccess().getBranchesIfBranchProcessParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_branches_1_0=ruleIfBranchProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfProcessesRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.IfBranchProcess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:967:3: (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Else) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:968:4: otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) )
            	    {
            	    otherlv_2=(Token)match(input,Else,FOLLOW_28); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIfProcessesAccess().getElseKeyword_2_0());
            	    			
            	    // InternalGoatComponentsParser.g:972:4: ( (lv_branches_3_0= ruleIfBranchProcess ) )
            	    // InternalGoatComponentsParser.g:973:5: (lv_branches_3_0= ruleIfBranchProcess )
            	    {
            	    // InternalGoatComponentsParser.g:973:5: (lv_branches_3_0= ruleIfBranchProcess )
            	    // InternalGoatComponentsParser.g:974:6: lv_branches_3_0= ruleIfBranchProcess
            	    {

            	    						newCompositeNode(grammarAccess.getIfProcessesAccess().getBranchesIfBranchProcessParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_branches_3_0=ruleIfBranchProcess();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfProcessesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.IfBranchProcess");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleIfProcesses"


    // $ANTLR start "entryRuleIfBranchProcess"
    // InternalGoatComponentsParser.g:996:1: entryRuleIfBranchProcess returns [EObject current=null] : iv_ruleIfBranchProcess= ruleIfBranchProcess EOF ;
    public final EObject entryRuleIfBranchProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBranchProcess = null;


        try {
            // InternalGoatComponentsParser.g:996:56: (iv_ruleIfBranchProcess= ruleIfBranchProcess EOF )
            // InternalGoatComponentsParser.g:997:2: iv_ruleIfBranchProcess= ruleIfBranchProcess EOF
            {
             newCompositeNode(grammarAccess.getIfBranchProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfBranchProcess=ruleIfBranchProcess();

            state._fsp--;

             current =iv_ruleIfBranchProcess; 
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
    // $ANTLR end "entryRuleIfBranchProcess"


    // $ANTLR start "ruleIfBranchProcess"
    // InternalGoatComponentsParser.g:1003:1: ruleIfBranchProcess returns [EObject current=null] : ( () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleIfBranchProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cond_2_0 = null;

        EObject lv_then_4_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1009:2: ( ( () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:1010:2: ( () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:1010:2: ( () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket )
            // InternalGoatComponentsParser.g:1011:3: () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket
            {
            // InternalGoatComponentsParser.g:1011:3: ()
            // InternalGoatComponentsParser.g:1012:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfBranchProcessAccess().getIfBranchProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIfBranchProcessAccess().getIfKeyword_1());
            		
            // InternalGoatComponentsParser.g:1022:3: ( (lv_cond_2_0= rulePreconditions ) )
            // InternalGoatComponentsParser.g:1023:4: (lv_cond_2_0= rulePreconditions )
            {
            // InternalGoatComponentsParser.g:1023:4: (lv_cond_2_0= rulePreconditions )
            // InternalGoatComponentsParser.g:1024:5: lv_cond_2_0= rulePreconditions
            {

            					newCompositeNode(grammarAccess.getIfBranchProcessAccess().getCondPreconditionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_cond_2_0=rulePreconditions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfBranchProcessRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Preconditions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getIfBranchProcessAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGoatComponentsParser.g:1045:3: ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) )
            // InternalGoatComponentsParser.g:1046:4: (lv_then_4_0= rulePredOutputProcessOrInputProcess )
            {
            // InternalGoatComponentsParser.g:1046:4: (lv_then_4_0= rulePredOutputProcessOrInputProcess )
            // InternalGoatComponentsParser.g:1047:5: lv_then_4_0= rulePredOutputProcessOrInputProcess
            {

            					newCompositeNode(grammarAccess.getIfBranchProcessAccess().getThenPredOutputProcessOrInputProcessParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_then_4_0=rulePredOutputProcessOrInputProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfBranchProcessRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_4_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.PredOutputProcessOrInputProcess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIfBranchProcessAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleIfBranchProcess"


    // $ANTLR start "entryRuleUpdate"
    // InternalGoatComponentsParser.g:1072:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalGoatComponentsParser.g:1072:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalGoatComponentsParser.g:1073:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalGoatComponentsParser.g:1079:1: ruleUpdate returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttributeToSet ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleExpression ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttributeToSet ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleExpression ) ) )* otherlv_8= RightSquareBracket ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_vars_1_0 = null;

        EObject lv_vals_3_0 = null;

        EObject lv_vars_5_0 = null;

        EObject lv_vals_7_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1085:2: ( (otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttributeToSet ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleExpression ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttributeToSet ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleExpression ) ) )* otherlv_8= RightSquareBracket ) )
            // InternalGoatComponentsParser.g:1086:2: (otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttributeToSet ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleExpression ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttributeToSet ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleExpression ) ) )* otherlv_8= RightSquareBracket )
            {
            // InternalGoatComponentsParser.g:1086:2: (otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttributeToSet ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleExpression ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttributeToSet ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleExpression ) ) )* otherlv_8= RightSquareBracket )
            // InternalGoatComponentsParser.g:1087:3: otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttributeToSet ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleExpression ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttributeToSet ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleExpression ) ) )* otherlv_8= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:1091:3: ( (lv_vars_1_0= ruleAttributeToSet ) )
            // InternalGoatComponentsParser.g:1092:4: (lv_vars_1_0= ruleAttributeToSet )
            {
            // InternalGoatComponentsParser.g:1092:4: (lv_vars_1_0= ruleAttributeToSet )
            // InternalGoatComponentsParser.g:1093:5: lv_vars_1_0= ruleAttributeToSet
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getVarsAttributeToSetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_vars_1_0=ruleAttributeToSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.AttributeToSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,ColonEqualsSign,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_2());
            		
            // InternalGoatComponentsParser.g:1114:3: ( (lv_vals_3_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:1115:4: (lv_vals_3_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:1115:4: (lv_vals_3_0= ruleExpression )
            // InternalGoatComponentsParser.g:1116:5: lv_vals_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getValsExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_vals_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"vals",
            						lv_vals_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:1133:3: (otherlv_4= Comma ( (lv_vars_5_0= ruleAttributeToSet ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1134:4: otherlv_4= Comma ( (lv_vars_5_0= ruleAttributeToSet ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_16); 

            	    				newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalGoatComponentsParser.g:1138:4: ( (lv_vars_5_0= ruleAttributeToSet ) )
            	    // InternalGoatComponentsParser.g:1139:5: (lv_vars_5_0= ruleAttributeToSet )
            	    {
            	    // InternalGoatComponentsParser.g:1139:5: (lv_vars_5_0= ruleAttributeToSet )
            	    // InternalGoatComponentsParser.g:1140:6: lv_vars_5_0= ruleAttributeToSet
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateAccess().getVarsAttributeToSetParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_vars_5_0=ruleAttributeToSet();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_5_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.AttributeToSet");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,ColonEqualsSign,FOLLOW_11); 

            	    				newLeafNode(otherlv_6, grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_4_2());
            	    			
            	    // InternalGoatComponentsParser.g:1161:4: ( (lv_vals_7_0= ruleExpression ) )
            	    // InternalGoatComponentsParser.g:1162:5: (lv_vals_7_0= ruleExpression )
            	    {
            	    // InternalGoatComponentsParser.g:1162:5: (lv_vals_7_0= ruleExpression )
            	    // InternalGoatComponentsParser.g:1163:6: lv_vals_7_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateAccess().getValsExpressionParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_vals_7_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vals",
            	    							lv_vals_7_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_8=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdateAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleAwareness"
    // InternalGoatComponentsParser.g:1189:1: entryRuleAwareness returns [EObject current=null] : iv_ruleAwareness= ruleAwareness EOF ;
    public final EObject entryRuleAwareness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwareness = null;


        try {
            // InternalGoatComponentsParser.g:1189:50: (iv_ruleAwareness= ruleAwareness EOF )
            // InternalGoatComponentsParser.g:1190:2: iv_ruleAwareness= ruleAwareness EOF
            {
             newCompositeNode(grammarAccess.getAwarenessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAwareness=ruleAwareness();

            state._fsp--;

             current =iv_ruleAwareness; 
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
    // $ANTLR end "entryRuleAwareness"


    // $ANTLR start "ruleAwareness"
    // InternalGoatComponentsParser.g:1196:1: ruleAwareness returns [EObject current=null] : (otherlv_0= Wait otherlv_1= Until otherlv_2= LeftParenthesis ( (lv_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleAwareness() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pred_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1202:2: ( (otherlv_0= Wait otherlv_1= Until otherlv_2= LeftParenthesis ( (lv_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis ) )
            // InternalGoatComponentsParser.g:1203:2: (otherlv_0= Wait otherlv_1= Until otherlv_2= LeftParenthesis ( (lv_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:1203:2: (otherlv_0= Wait otherlv_1= Until otherlv_2= LeftParenthesis ( (lv_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis )
            // InternalGoatComponentsParser.g:1204:3: otherlv_0= Wait otherlv_1= Until otherlv_2= LeftParenthesis ( (lv_pred_3_0= ruleExpression ) ) otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,Wait,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getAwarenessAccess().getWaitKeyword_0());
            		
            otherlv_1=(Token)match(input,Until,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAwarenessAccess().getUntilKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAwarenessAccess().getLeftParenthesisKeyword_2());
            		
            // InternalGoatComponentsParser.g:1216:3: ( (lv_pred_3_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:1217:4: (lv_pred_3_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:1217:4: (lv_pred_3_0= ruleExpression )
            // InternalGoatComponentsParser.g:1218:5: lv_pred_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAwarenessAccess().getPredExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_pred_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAwarenessRule());
            					}
            					set(
            						current,
            						"pred",
            						lv_pred_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAwarenessAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleAwareness"


    // $ANTLR start "entryRuleNZCProcess"
    // InternalGoatComponentsParser.g:1243:1: entryRuleNZCProcess returns [EObject current=null] : iv_ruleNZCProcess= ruleNZCProcess EOF ;
    public final EObject entryRuleNZCProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNZCProcess = null;


        try {
            // InternalGoatComponentsParser.g:1243:51: (iv_ruleNZCProcess= ruleNZCProcess EOF )
            // InternalGoatComponentsParser.g:1244:2: iv_ruleNZCProcess= ruleNZCProcess EOF
            {
             newCompositeNode(grammarAccess.getNZCProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNZCProcess=ruleNZCProcess();

            state._fsp--;

             current =iv_ruleNZCProcess; 
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
    // $ANTLR end "entryRuleNZCProcess"


    // $ANTLR start "ruleNZCProcess"
    // InternalGoatComponentsParser.g:1250:1: ruleNZCProcess returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess | this_CallProcess_4= ruleCallProcess ) ;
    public final EObject ruleNZCProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Proc_1 = null;

        EObject this_ZeroProcess_3 = null;

        EObject this_CallProcess_4 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1256:2: ( ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess | this_CallProcess_4= ruleCallProcess ) )
            // InternalGoatComponentsParser.g:1257:2: ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess | this_CallProcess_4= ruleCallProcess )
            {
            // InternalGoatComponentsParser.g:1257:2: ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess | this_CallProcess_4= ruleCallProcess )
            int alt19=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt19=1;
                }
                break;
            case Nil:
                {
                alt19=2;
                }
                break;
            case RULE_ID:
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
                    // InternalGoatComponentsParser.g:1258:3: (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:1258:3: (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis )
                    // InternalGoatComponentsParser.g:1259:4: otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getNZCProcessAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getNZCProcessAccess().getProcParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_Proc_1=ruleProc();

                    state._fsp--;


                    				current = this_Proc_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getNZCProcessAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1277:3: this_ZeroProcess_3= ruleZeroProcess
                    {

                    			newCompositeNode(grammarAccess.getNZCProcessAccess().getZeroProcessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ZeroProcess_3=ruleZeroProcess();

                    state._fsp--;


                    			current = this_ZeroProcess_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1286:3: this_CallProcess_4= ruleCallProcess
                    {

                    			newCompositeNode(grammarAccess.getNZCProcessAccess().getCallProcessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallProcess_4=ruleCallProcess();

                    state._fsp--;


                    			current = this_CallProcess_4;
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
    // $ANTLR end "ruleNZCProcess"


    // $ANTLR start "entryRuleNProcess"
    // InternalGoatComponentsParser.g:1298:1: entryRuleNProcess returns [EObject current=null] : iv_ruleNProcess= ruleNProcess EOF ;
    public final EObject entryRuleNProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNProcess = null;


        try {
            // InternalGoatComponentsParser.g:1298:49: (iv_ruleNProcess= ruleNProcess EOF )
            // InternalGoatComponentsParser.g:1299:2: iv_ruleNProcess= ruleNProcess EOF
            {
             newCompositeNode(grammarAccess.getNProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNProcess=ruleNProcess();

            state._fsp--;

             current =iv_ruleNProcess; 
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
    // $ANTLR end "entryRuleNProcess"


    // $ANTLR start "ruleNProcess"
    // InternalGoatComponentsParser.g:1305:1: ruleNProcess returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess ) ;
    public final EObject ruleNProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Proc_1 = null;

        EObject this_ZeroProcess_3 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1311:2: ( ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess ) )
            // InternalGoatComponentsParser.g:1312:2: ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess )
            {
            // InternalGoatComponentsParser.g:1312:2: ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftParenthesis) ) {
                alt20=1;
            }
            else if ( (LA20_0==Nil) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGoatComponentsParser.g:1313:3: (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:1313:3: (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis )
                    // InternalGoatComponentsParser.g:1314:4: otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getNProcessAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getNProcessAccess().getProcParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_Proc_1=ruleProc();

                    state._fsp--;


                    				current = this_Proc_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getNProcessAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1332:3: this_ZeroProcess_3= ruleZeroProcess
                    {

                    			newCompositeNode(grammarAccess.getNProcessAccess().getZeroProcessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ZeroProcess_3=ruleZeroProcess();

                    state._fsp--;


                    			current = this_ZeroProcess_3;
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
    // $ANTLR end "ruleNProcess"


    // $ANTLR start "entryRuleCallProcess"
    // InternalGoatComponentsParser.g:1344:1: entryRuleCallProcess returns [EObject current=null] : iv_ruleCallProcess= ruleCallProcess EOF ;
    public final EObject entryRuleCallProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcess = null;


        try {
            // InternalGoatComponentsParser.g:1344:52: (iv_ruleCallProcess= ruleCallProcess EOF )
            // InternalGoatComponentsParser.g:1345:2: iv_ruleCallProcess= ruleCallProcess EOF
            {
             newCompositeNode(grammarAccess.getCallProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallProcess=ruleCallProcess();

            state._fsp--;

             current =iv_ruleCallProcess; 
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
    // $ANTLR end "entryRuleCallProcess"


    // $ANTLR start "ruleCallProcess"
    // InternalGoatComponentsParser.g:1351:1: ruleCallProcess returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCallProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1357:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:1358:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:1358:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:1359:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:1359:3: ()
            // InternalGoatComponentsParser.g:1360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCallProcessAccess().getCallProcessAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:1366:3: ( (otherlv_1= RULE_ID ) )
            // InternalGoatComponentsParser.g:1367:4: (otherlv_1= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1367:4: (otherlv_1= RULE_ID )
            // InternalGoatComponentsParser.g:1368:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcessRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getCallProcessAccess().getProcnameProcessDefinitionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleCallProcess"


    // $ANTLR start "entryRuleZeroProcess"
    // InternalGoatComponentsParser.g:1383:1: entryRuleZeroProcess returns [EObject current=null] : iv_ruleZeroProcess= ruleZeroProcess EOF ;
    public final EObject entryRuleZeroProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZeroProcess = null;


        try {
            // InternalGoatComponentsParser.g:1383:52: (iv_ruleZeroProcess= ruleZeroProcess EOF )
            // InternalGoatComponentsParser.g:1384:2: iv_ruleZeroProcess= ruleZeroProcess EOF
            {
             newCompositeNode(grammarAccess.getZeroProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZeroProcess=ruleZeroProcess();

            state._fsp--;

             current =iv_ruleZeroProcess; 
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
    // $ANTLR end "entryRuleZeroProcess"


    // $ANTLR start "ruleZeroProcess"
    // InternalGoatComponentsParser.g:1390:1: ruleZeroProcess returns [EObject current=null] : ( () otherlv_1= Nil ) ;
    public final EObject ruleZeroProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1396:2: ( ( () otherlv_1= Nil ) )
            // InternalGoatComponentsParser.g:1397:2: ( () otherlv_1= Nil )
            {
            // InternalGoatComponentsParser.g:1397:2: ( () otherlv_1= Nil )
            // InternalGoatComponentsParser.g:1398:3: () otherlv_1= Nil
            {
            // InternalGoatComponentsParser.g:1398:3: ()
            // InternalGoatComponentsParser.g:1399:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getZeroProcessAccess().getZeroProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Nil,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getZeroProcessAccess().getNilKeyword_1());
            		

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
    // $ANTLR end "ruleZeroProcess"


    // $ANTLR start "entryRuleProcessDefinition"
    // InternalGoatComponentsParser.g:1413:1: entryRuleProcessDefinition returns [EObject current=null] : iv_ruleProcessDefinition= ruleProcessDefinition EOF ;
    public final EObject entryRuleProcessDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessDefinition = null;


        try {
            // InternalGoatComponentsParser.g:1413:58: (iv_ruleProcessDefinition= ruleProcessDefinition EOF )
            // InternalGoatComponentsParser.g:1414:2: iv_ruleProcessDefinition= ruleProcessDefinition EOF
            {
             newCompositeNode(grammarAccess.getProcessDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessDefinition=ruleProcessDefinition();

            state._fsp--;

             current =iv_ruleProcessDefinition; 
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
    // $ANTLR end "entryRuleProcessDefinition"


    // $ANTLR start "ruleProcessDefinition"
    // InternalGoatComponentsParser.g:1420:1: ruleProcessDefinition returns [EObject current=null] : (otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_proc_3_0= ruleProc ) ) ) ;
    public final EObject ruleProcessDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_proc_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1426:2: ( (otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_proc_3_0= ruleProc ) ) ) )
            // InternalGoatComponentsParser.g:1427:2: (otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_proc_3_0= ruleProc ) ) )
            {
            // InternalGoatComponentsParser.g:1427:2: (otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_proc_3_0= ruleProc ) ) )
            // InternalGoatComponentsParser.g:1428:3: otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_proc_3_0= ruleProc ) )
            {
            otherlv_0=(Token)match(input,Proc,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessDefinitionAccess().getProcKeyword_0());
            		
            // InternalGoatComponentsParser.g:1432:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:1433:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1433:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:1434:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessDefinitionAccess().getEqualsSignKeyword_2());
            		
            // InternalGoatComponentsParser.g:1454:3: ( (lv_proc_3_0= ruleProc ) )
            // InternalGoatComponentsParser.g:1455:4: (lv_proc_3_0= ruleProc )
            {
            // InternalGoatComponentsParser.g:1455:4: (lv_proc_3_0= ruleProc )
            // InternalGoatComponentsParser.g:1456:5: lv_proc_3_0= ruleProc
            {

            					newCompositeNode(grammarAccess.getProcessDefinitionAccess().getProcProcParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_proc_3_0=ruleProc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessDefinitionRule());
            					}
            					set(
            						current,
            						"proc",
            						lv_proc_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Proc");
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
    // $ANTLR end "ruleProcessDefinition"


    // $ANTLR start "entryRuleEnvInitValue"
    // InternalGoatComponentsParser.g:1477:1: entryRuleEnvInitValue returns [EObject current=null] : iv_ruleEnvInitValue= ruleEnvInitValue EOF ;
    public final EObject entryRuleEnvInitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvInitValue = null;


        try {
            // InternalGoatComponentsParser.g:1477:53: (iv_ruleEnvInitValue= ruleEnvInitValue EOF )
            // InternalGoatComponentsParser.g:1478:2: iv_ruleEnvInitValue= ruleEnvInitValue EOF
            {
             newCompositeNode(grammarAccess.getEnvInitValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvInitValue=ruleEnvInitValue();

            state._fsp--;

             current =iv_ruleEnvInitValue; 
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
    // $ANTLR end "entryRuleEnvInitValue"


    // $ANTLR start "ruleEnvInitValue"
    // InternalGoatComponentsParser.g:1484:1: ruleEnvInitValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) ) ;
    public final EObject ruleEnvInitValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1490:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) ) )
            // InternalGoatComponentsParser.g:1491:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) )
            {
            // InternalGoatComponentsParser.g:1491:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt22=1;
                }
                break;
            case RULE_STRING:
                {
                alt22=2;
                }
                break;
            case False:
            case True:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGoatComponentsParser.g:1492:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:1492:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:1493:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:1493:4: ()
                    // InternalGoatComponentsParser.g:1494:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:1500:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:1501:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:1501:5: (lv_value_1_0= RULE_INT )
                    // InternalGoatComponentsParser.g:1502:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getEnvInitValueAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvInitValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1520:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalGoatComponentsParser.g:1520:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalGoatComponentsParser.g:1521:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalGoatComponentsParser.g:1521:4: ()
                    // InternalGoatComponentsParser.g:1522:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:1528:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:1529:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:1529:5: (lv_value_3_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:1530:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getEnvInitValueAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvInitValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1548:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:1548:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:1549:4: () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:1549:4: ()
                    // InternalGoatComponentsParser.g:1550:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:1556:4: ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    // InternalGoatComponentsParser.g:1557:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:1557:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    // InternalGoatComponentsParser.g:1558:6: (lv_value_5_1= True | lv_value_5_2= False )
                    {
                    // InternalGoatComponentsParser.g:1558:6: (lv_value_5_1= True | lv_value_5_2= False )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==True) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==False) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalGoatComponentsParser.g:1559:7: lv_value_5_1= True
                            {
                            lv_value_5_1=(Token)match(input,True,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getEnvInitValueAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEnvInitValueRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:1570:7: lv_value_5_2= False
                            {
                            lv_value_5_2=(Token)match(input,False,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getEnvInitValueAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEnvInitValueRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleEnvInitValue"


    // $ANTLR start "entryRuleEnvironment"
    // InternalGoatComponentsParser.g:1588:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalGoatComponentsParser.g:1588:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalGoatComponentsParser.g:1589:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalGoatComponentsParser.g:1595:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitValue ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitValue ) ) )* )? otherlv_9= RightCurlyBracket ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_attrs_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_attrs_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_vals_4_0 = null;

        EObject lv_vals_8_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1601:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitValue ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitValue ) ) )* )? otherlv_9= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:1602:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitValue ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitValue ) ) )* )? otherlv_9= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:1602:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitValue ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitValue ) ) )* )? otherlv_9= RightCurlyBracket )
            // InternalGoatComponentsParser.g:1603:3: () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitValue ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitValue ) ) )* )? otherlv_9= RightCurlyBracket
            {
            // InternalGoatComponentsParser.g:1603:3: ()
            // InternalGoatComponentsParser.g:1604:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:1614:3: ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitValue ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitValue ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGoatComponentsParser.g:1615:4: ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitValue ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitValue ) ) )*
                    {
                    // InternalGoatComponentsParser.g:1615:4: ( (lv_attrs_2_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:1616:5: (lv_attrs_2_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:1616:5: (lv_attrs_2_0= RULE_ID )
                    // InternalGoatComponentsParser.g:1617:6: lv_attrs_2_0= RULE_ID
                    {
                    lv_attrs_2_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(lv_attrs_2_0, grammarAccess.getEnvironmentAccess().getAttrsIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvironmentRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attrs",
                    							lv_attrs_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,ColonEqualsSign,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_1());
                    			
                    // InternalGoatComponentsParser.g:1637:4: ( (lv_vals_4_0= ruleEnvInitValue ) )
                    // InternalGoatComponentsParser.g:1638:5: (lv_vals_4_0= ruleEnvInitValue )
                    {
                    // InternalGoatComponentsParser.g:1638:5: (lv_vals_4_0= ruleEnvInitValue )
                    // InternalGoatComponentsParser.g:1639:6: lv_vals_4_0= ruleEnvInitValue
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getValsEnvInitValueParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_vals_4_0=ruleEnvInitValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"vals",
                    							lv_vals_4_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.EnvInitValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:1656:4: (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitValue ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==Comma) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:1657:5: otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:1661:5: ( (lv_attrs_6_0= RULE_ID ) )
                    	    // InternalGoatComponentsParser.g:1662:6: (lv_attrs_6_0= RULE_ID )
                    	    {
                    	    // InternalGoatComponentsParser.g:1662:6: (lv_attrs_6_0= RULE_ID )
                    	    // InternalGoatComponentsParser.g:1663:7: lv_attrs_6_0= RULE_ID
                    	    {
                    	    lv_attrs_6_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    	    							newLeafNode(lv_attrs_6_0, grammarAccess.getEnvironmentAccess().getAttrsIDTerminalRuleCall_2_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attrs",
                    	    								lv_attrs_6_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,ColonEqualsSign,FOLLOW_35); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_3_2());
                    	    				
                    	    // InternalGoatComponentsParser.g:1683:5: ( (lv_vals_8_0= ruleEnvInitValue ) )
                    	    // InternalGoatComponentsParser.g:1684:6: (lv_vals_8_0= ruleEnvInitValue )
                    	    {
                    	    // InternalGoatComponentsParser.g:1684:6: (lv_vals_8_0= ruleEnvInitValue )
                    	    // InternalGoatComponentsParser.g:1685:7: lv_vals_8_0= ruleEnvInitValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getValsEnvInitValueParserRuleCall_2_3_3_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_vals_8_0=ruleEnvInitValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vals",
                    	    								lv_vals_8_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.EnvInitValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleComponentDefinition"
    // InternalGoatComponentsParser.g:1712:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // InternalGoatComponentsParser.g:1712:60: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // InternalGoatComponentsParser.g:1713:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
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
    // $ANTLR end "entryRuleComponentDefinition"


    // $ANTLR start "ruleComponentDefinition"
    // InternalGoatComponentsParser.g:1719:1: ruleComponentDefinition returns [EObject current=null] : (otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= At ( (lv_address_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_address_4_0=null;
        EObject lv_env_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1725:2: ( (otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= At ( (lv_address_4_0= RULE_STRING ) ) ) )
            // InternalGoatComponentsParser.g:1726:2: (otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= At ( (lv_address_4_0= RULE_STRING ) ) )
            {
            // InternalGoatComponentsParser.g:1726:2: (otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= At ( (lv_address_4_0= RULE_STRING ) ) )
            // InternalGoatComponentsParser.g:1727:3: otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= At ( (lv_address_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Component,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDefinitionAccess().getComponentKeyword_0());
            		
            // InternalGoatComponentsParser.g:1731:3: ( (lv_env_1_0= ruleEnvironment ) )
            // InternalGoatComponentsParser.g:1732:4: (lv_env_1_0= ruleEnvironment )
            {
            // InternalGoatComponentsParser.g:1732:4: (lv_env_1_0= ruleEnvironment )
            // InternalGoatComponentsParser.g:1733:5: lv_env_1_0= ruleEnvironment
            {

            					newCompositeNode(grammarAccess.getComponentDefinitionAccess().getEnvEnvironmentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_env_1_0=ruleEnvironment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
            					}
            					set(
            						current,
            						"env",
            						lv_env_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Environment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:1750:3: ( (otherlv_2= RULE_ID ) )
            // InternalGoatComponentsParser.g:1751:4: (otherlv_2= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1751:4: (otherlv_2= RULE_ID )
            // InternalGoatComponentsParser.g:1752:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_2, grammarAccess.getComponentDefinitionAccess().getProcProcessDefinitionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,At,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentDefinitionAccess().getAtKeyword_3());
            		
            // InternalGoatComponentsParser.g:1767:3: ( (lv_address_4_0= RULE_STRING ) )
            // InternalGoatComponentsParser.g:1768:4: (lv_address_4_0= RULE_STRING )
            {
            // InternalGoatComponentsParser.g:1768:4: (lv_address_4_0= RULE_STRING )
            // InternalGoatComponentsParser.g:1769:5: lv_address_4_0= RULE_STRING
            {
            lv_address_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_address_4_0, grammarAccess.getComponentDefinitionAccess().getAddressSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"address",
            						lv_address_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleComponentDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalGoatComponentsParser.g:1789:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGoatComponentsParser.g:1789:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGoatComponentsParser.g:1790:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGoatComponentsParser.g:1796:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1802:2: (this_Or_0= ruleOr )
            // InternalGoatComponentsParser.g:1803:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalGoatComponentsParser.g:1814:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalGoatComponentsParser.g:1814:43: (iv_ruleOr= ruleOr EOF )
            // InternalGoatComponentsParser.g:1815:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalGoatComponentsParser.g:1821:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1827:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )? ) )
            // InternalGoatComponentsParser.g:1828:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )? )
            {
            // InternalGoatComponentsParser.g:1828:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )? )
            // InternalGoatComponentsParser.g:1829:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )?
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:1837:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==VerticalLineVerticalLine) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGoatComponentsParser.g:1838:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) )
                    {
                    // InternalGoatComponentsParser.g:1838:4: ()
                    // InternalGoatComponentsParser.g:1839:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
                    			
                    // InternalGoatComponentsParser.g:1849:4: ( (lv_right_3_0= ruleAnd ) )
                    // InternalGoatComponentsParser.g:1850:5: (lv_right_3_0= ruleAnd )
                    {
                    // InternalGoatComponentsParser.g:1850:5: (lv_right_3_0= ruleAnd )
                    // InternalGoatComponentsParser.g:1851:6: lv_right_3_0= ruleAnd
                    {

                    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalGoatComponentsParser.g:1873:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGoatComponentsParser.g:1873:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGoatComponentsParser.g:1874:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalGoatComponentsParser.g:1880:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1886:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )? ) )
            // InternalGoatComponentsParser.g:1887:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )? )
            {
            // InternalGoatComponentsParser.g:1887:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )? )
            // InternalGoatComponentsParser.g:1888:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )?
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:1896:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==AmpersandAmpersand) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGoatComponentsParser.g:1897:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) )
                    {
                    // InternalGoatComponentsParser.g:1897:4: ()
                    // InternalGoatComponentsParser.g:1898:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalGoatComponentsParser.g:1908:4: ( (lv_right_3_0= ruleEquality ) )
                    // InternalGoatComponentsParser.g:1909:5: (lv_right_3_0= ruleEquality )
                    {
                    // InternalGoatComponentsParser.g:1909:5: (lv_right_3_0= ruleEquality )
                    // InternalGoatComponentsParser.g:1910:6: lv_right_3_0= ruleEquality
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleEquality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Equality");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalGoatComponentsParser.g:1932:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalGoatComponentsParser.g:1932:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalGoatComponentsParser.g:1933:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalGoatComponentsParser.g:1939:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1945:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? ) )
            // InternalGoatComponentsParser.g:1946:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? )
            {
            // InternalGoatComponentsParser.g:1946:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? )
            // InternalGoatComponentsParser.g:1947:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )?
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:1955:3: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ExclamationMarkEqualsSign||LA28_0==EqualsSignEqualsSign) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGoatComponentsParser.g:1956:4: () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) )
                    {
                    // InternalGoatComponentsParser.g:1956:4: ()
                    // InternalGoatComponentsParser.g:1957:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:1963:4: ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) )
                    // InternalGoatComponentsParser.g:1964:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
                    {
                    // InternalGoatComponentsParser.g:1964:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
                    // InternalGoatComponentsParser.g:1965:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:1965:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==EqualsSignEqualsSign) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==ExclamationMarkEqualsSign) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalGoatComponentsParser.g:1966:7: lv_op_2_1= EqualsSignEqualsSign
                            {
                            lv_op_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_11); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEqualityRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:1977:7: lv_op_2_2= ExclamationMarkEqualsSign
                            {
                            lv_op_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_11); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEqualityRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalGoatComponentsParser.g:1990:4: ( (lv_right_3_0= ruleComparison ) )
                    // InternalGoatComponentsParser.g:1991:5: (lv_right_3_0= ruleComparison )
                    {
                    // InternalGoatComponentsParser.g:1991:5: (lv_right_3_0= ruleComparison )
                    // InternalGoatComponentsParser.g:1992:6: lv_right_3_0= ruleComparison
                    {

                    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleComparison();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualityRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Comparison");
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalGoatComponentsParser.g:2014:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalGoatComponentsParser.g:2014:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalGoatComponentsParser.g:2015:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalGoatComponentsParser.g:2021:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2027:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? ) )
            // InternalGoatComponentsParser.g:2028:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? )
            {
            // InternalGoatComponentsParser.g:2028:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? )
            // InternalGoatComponentsParser.g:2029:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )?
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2037:3: ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LessThanSignEqualsSign||LA30_0==GreaterThanSignEqualsSign||LA30_0==LessThanSign||LA30_0==GreaterThanSign) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGoatComponentsParser.g:2038:4: () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
                    {
                    // InternalGoatComponentsParser.g:2038:4: ()
                    // InternalGoatComponentsParser.g:2039:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2045:4: ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) )
                    // InternalGoatComponentsParser.g:2046:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
                    {
                    // InternalGoatComponentsParser.g:2046:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
                    // InternalGoatComponentsParser.g:2047:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
                    {
                    // InternalGoatComponentsParser.g:2047:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
                    int alt29=4;
                    switch ( input.LA(1) ) {
                    case GreaterThanSignEqualsSign:
                        {
                        alt29=1;
                        }
                        break;
                    case LessThanSignEqualsSign:
                        {
                        alt29=2;
                        }
                        break;
                    case GreaterThanSign:
                        {
                        alt29=3;
                        }
                        break;
                    case LessThanSign:
                        {
                        alt29=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2048:7: lv_op_2_1= GreaterThanSignEqualsSign
                            {
                            lv_op_2_1=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_11); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparisonRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:2059:7: lv_op_2_2= LessThanSignEqualsSign
                            {
                            lv_op_2_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_11); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparisonRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalGoatComponentsParser.g:2070:7: lv_op_2_3= GreaterThanSign
                            {
                            lv_op_2_3=(Token)match(input,GreaterThanSign,FOLLOW_11); 

                            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparisonRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalGoatComponentsParser.g:2081:7: lv_op_2_4= LessThanSign
                            {
                            lv_op_2_4=(Token)match(input,LessThanSign,FOLLOW_11); 

                            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparisonRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalGoatComponentsParser.g:2094:4: ( (lv_right_3_0= rulePlusOrMinus ) )
                    // InternalGoatComponentsParser.g:2095:5: (lv_right_3_0= rulePlusOrMinus )
                    {
                    // InternalGoatComponentsParser.g:2095:5: (lv_right_3_0= rulePlusOrMinus )
                    // InternalGoatComponentsParser.g:2096:6: lv_right_3_0= rulePlusOrMinus
                    {

                    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=rulePlusOrMinus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparisonRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.PlusOrMinus");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalGoatComponentsParser.g:2118:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalGoatComponentsParser.g:2118:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalGoatComponentsParser.g:2119:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalGoatComponentsParser.g:2125:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2131:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? ) )
            // InternalGoatComponentsParser.g:2132:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? )
            {
            // InternalGoatComponentsParser.g:2132:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? )
            // InternalGoatComponentsParser.g:2133:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )?
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2141:3: ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==PlusSignPlusSign||LA32_0==PlusSign||LA32_0==HyphenMinus) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGoatComponentsParser.g:2142:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) )
                    {
                    // InternalGoatComponentsParser.g:2142:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) )
                    int alt31=3;
                    switch ( input.LA(1) ) {
                    case PlusSign:
                        {
                        alt31=1;
                        }
                        break;
                    case HyphenMinus:
                        {
                        alt31=2;
                        }
                        break;
                    case PlusSignPlusSign:
                        {
                        alt31=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2143:5: ( () otherlv_2= PlusSign )
                            {
                            // InternalGoatComponentsParser.g:2143:5: ( () otherlv_2= PlusSign )
                            // InternalGoatComponentsParser.g:2144:6: () otherlv_2= PlusSign
                            {
                            // InternalGoatComponentsParser.g:2144:6: ()
                            // InternalGoatComponentsParser.g:2145:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_2=(Token)match(input,PlusSign,FOLLOW_11); 

                            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:2157:5: ( () otherlv_4= HyphenMinus )
                            {
                            // InternalGoatComponentsParser.g:2157:5: ( () otherlv_4= HyphenMinus )
                            // InternalGoatComponentsParser.g:2158:6: () otherlv_4= HyphenMinus
                            {
                            // InternalGoatComponentsParser.g:2158:6: ()
                            // InternalGoatComponentsParser.g:2159:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_11); 

                            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalGoatComponentsParser.g:2171:5: ( () otherlv_6= PlusSignPlusSign )
                            {
                            // InternalGoatComponentsParser.g:2171:5: ( () otherlv_6= PlusSignPlusSign )
                            // InternalGoatComponentsParser.g:2172:6: () otherlv_6= PlusSignPlusSign
                            {
                            // InternalGoatComponentsParser.g:2172:6: ()
                            // InternalGoatComponentsParser.g:2173:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getPlusOrMinusAccess().getConcatenateLeftAction_1_0_2_0(),
                            								current);
                            						

                            }

                            otherlv_6=(Token)match(input,PlusSignPlusSign,FOLLOW_11); 

                            						newLeafNode(otherlv_6, grammarAccess.getPlusOrMinusAccess().getPlusSignPlusSignKeyword_1_0_2_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalGoatComponentsParser.g:2185:4: ( (lv_right_7_0= ruleMulOrDiv ) )
                    // InternalGoatComponentsParser.g:2186:5: (lv_right_7_0= ruleMulOrDiv )
                    {
                    // InternalGoatComponentsParser.g:2186:5: (lv_right_7_0= ruleMulOrDiv )
                    // InternalGoatComponentsParser.g:2187:6: lv_right_7_0= ruleMulOrDiv
                    {

                    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleMulOrDiv();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_7_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.MulOrDiv");
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalGoatComponentsParser.g:2209:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalGoatComponentsParser.g:2209:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalGoatComponentsParser.g:2210:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalGoatComponentsParser.g:2216:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2222:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? ) )
            // InternalGoatComponentsParser.g:2223:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? )
            {
            // InternalGoatComponentsParser.g:2223:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? )
            // InternalGoatComponentsParser.g:2224:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )?
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2232:3: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Asterisk||LA34_0==Solidus) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGoatComponentsParser.g:2233:4: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) )
                    {
                    // InternalGoatComponentsParser.g:2233:4: ()
                    // InternalGoatComponentsParser.g:2234:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2240:4: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) )
                    // InternalGoatComponentsParser.g:2241:5: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) )
                    {
                    // InternalGoatComponentsParser.g:2241:5: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) )
                    // InternalGoatComponentsParser.g:2242:6: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus )
                    {
                    // InternalGoatComponentsParser.g:2242:6: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==Asterisk) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==Solidus) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2243:7: lv_op_2_1= Asterisk
                            {
                            lv_op_2_1=(Token)match(input,Asterisk,FOLLOW_11); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMulOrDivRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:2254:7: lv_op_2_2= Solidus
                            {
                            lv_op_2_2=(Token)match(input,Solidus,FOLLOW_11); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMulOrDivRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalGoatComponentsParser.g:2267:4: ( (lv_right_3_0= rulePrimary ) )
                    // InternalGoatComponentsParser.g:2268:5: (lv_right_3_0= rulePrimary )
                    {
                    // InternalGoatComponentsParser.g:2268:5: (lv_right_3_0= rulePrimary )
                    // InternalGoatComponentsParser.g:2269:6: lv_right_3_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Primary");
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalGoatComponentsParser.g:2291:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGoatComponentsParser.g:2291:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGoatComponentsParser.g:2292:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalGoatComponentsParser.g:2298:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= ExclamationMark otherlv_5= LeftParenthesis ( (lv_expression_6_0= rulePrimary ) ) otherlv_7= RightParenthesis ) | this_Atomic_8= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_6_0 = null;

        EObject this_Atomic_8 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2304:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= ExclamationMark otherlv_5= LeftParenthesis ( (lv_expression_6_0= rulePrimary ) ) otherlv_7= RightParenthesis ) | this_Atomic_8= ruleAtomic ) )
            // InternalGoatComponentsParser.g:2305:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= ExclamationMark otherlv_5= LeftParenthesis ( (lv_expression_6_0= rulePrimary ) ) otherlv_7= RightParenthesis ) | this_Atomic_8= ruleAtomic )
            {
            // InternalGoatComponentsParser.g:2305:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= ExclamationMark otherlv_5= LeftParenthesis ( (lv_expression_6_0= rulePrimary ) ) otherlv_7= RightParenthesis ) | this_Atomic_8= ruleAtomic )
            int alt35=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt35=1;
                }
                break;
            case ExclamationMark:
                {
                alt35=2;
                }
                break;
            case Receiver:
            case False:
            case Proc:
            case This:
            case True:
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalGoatComponentsParser.g:2306:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:2306:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalGoatComponentsParser.g:2307:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2325:3: ( () otherlv_4= ExclamationMark otherlv_5= LeftParenthesis ( (lv_expression_6_0= rulePrimary ) ) otherlv_7= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:2325:3: ( () otherlv_4= ExclamationMark otherlv_5= LeftParenthesis ( (lv_expression_6_0= rulePrimary ) ) otherlv_7= RightParenthesis )
                    // InternalGoatComponentsParser.g:2326:4: () otherlv_4= ExclamationMark otherlv_5= LeftParenthesis ( (lv_expression_6_0= rulePrimary ) ) otherlv_7= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:2326:4: ()
                    // InternalGoatComponentsParser.g:2327:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,ExclamationMark,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalGoatComponentsParser.g:2341:4: ( (lv_expression_6_0= rulePrimary ) )
                    // InternalGoatComponentsParser.g:2342:5: (lv_expression_6_0= rulePrimary )
                    {
                    // InternalGoatComponentsParser.g:2342:5: (lv_expression_6_0= rulePrimary )
                    // InternalGoatComponentsParser.g:2343:6: lv_expression_6_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_expression_6_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:2366:3: this_Atomic_8= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_8=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_8;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalGoatComponentsParser.g:2378:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalGoatComponentsParser.g:2378:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalGoatComponentsParser.g:2379:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalGoatComponentsParser.g:2385:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | ( () otherlv_9= Proc otherlv_10= FullStop ( (lv_attribute_11_0= RULE_ID ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) otherlv_14= LeftParenthesis ( ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )* )? otherlv_18= RightParenthesis ) | ( () otherlv_20= This otherlv_21= FullStop ( (lv_attribute_22_0= RULE_ID ) ) ) | ( () otherlv_24= Receiver otherlv_25= FullStop ( (lv_attribute_26_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_attribute_11_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_attribute_22_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_attribute_26_0=null;
        EObject lv_params_15_0 = null;

        EObject lv_params_17_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2391:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | ( () otherlv_9= Proc otherlv_10= FullStop ( (lv_attribute_11_0= RULE_ID ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) otherlv_14= LeftParenthesis ( ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )* )? otherlv_18= RightParenthesis ) | ( () otherlv_20= This otherlv_21= FullStop ( (lv_attribute_22_0= RULE_ID ) ) ) | ( () otherlv_24= Receiver otherlv_25= FullStop ( (lv_attribute_26_0= RULE_ID ) ) ) ) )
            // InternalGoatComponentsParser.g:2392:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | ( () otherlv_9= Proc otherlv_10= FullStop ( (lv_attribute_11_0= RULE_ID ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) otherlv_14= LeftParenthesis ( ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )* )? otherlv_18= RightParenthesis ) | ( () otherlv_20= This otherlv_21= FullStop ( (lv_attribute_22_0= RULE_ID ) ) ) | ( () otherlv_24= Receiver otherlv_25= FullStop ( (lv_attribute_26_0= RULE_ID ) ) ) )
            {
            // InternalGoatComponentsParser.g:2392:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | ( () otherlv_9= Proc otherlv_10= FullStop ( (lv_attribute_11_0= RULE_ID ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) otherlv_14= LeftParenthesis ( ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )* )? otherlv_18= RightParenthesis ) | ( () otherlv_20= This otherlv_21= FullStop ( (lv_attribute_22_0= RULE_ID ) ) ) | ( () otherlv_24= Receiver otherlv_25= FullStop ( (lv_attribute_26_0= RULE_ID ) ) ) )
            int alt39=8;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalGoatComponentsParser.g:2393:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:2393:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:2394:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:2394:4: ()
                    // InternalGoatComponentsParser.g:2395:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2401:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:2402:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:2402:5: (lv_value_1_0= RULE_INT )
                    // InternalGoatComponentsParser.g:2403:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2421:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalGoatComponentsParser.g:2421:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalGoatComponentsParser.g:2422:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalGoatComponentsParser.g:2422:4: ()
                    // InternalGoatComponentsParser.g:2423:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2429:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:2430:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:2430:5: (lv_value_3_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:2431:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:2449:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:2449:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:2450:4: () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:2450:4: ()
                    // InternalGoatComponentsParser.g:2451:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2457:4: ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    // InternalGoatComponentsParser.g:2458:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:2458:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    // InternalGoatComponentsParser.g:2459:6: (lv_value_5_1= True | lv_value_5_2= False )
                    {
                    // InternalGoatComponentsParser.g:2459:6: (lv_value_5_1= True | lv_value_5_2= False )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==True) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==False) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2460:7: lv_value_5_1= True
                            {
                            lv_value_5_1=(Token)match(input,True,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:2471:7: lv_value_5_2= False
                            {
                            lv_value_5_2=(Token)match(input,False,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:2486:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:2486:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:2487:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:2487:4: ()
                    // InternalGoatComponentsParser.g:2488:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getLocalVarRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2494:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2495:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2495:5: (otherlv_7= RULE_ID )
                    // InternalGoatComponentsParser.g:2496:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getRefLRefCrossReference_3_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGoatComponentsParser.g:2509:3: ( () otherlv_9= Proc otherlv_10= FullStop ( (lv_attribute_11_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:2509:3: ( () otherlv_9= Proc otherlv_10= FullStop ( (lv_attribute_11_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:2510:4: () otherlv_9= Proc otherlv_10= FullStop ( (lv_attribute_11_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:2510:4: ()
                    // InternalGoatComponentsParser.g:2511:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getLocalAttributeRefAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,Proc,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicAccess().getProcKeyword_4_1());
                    			
                    otherlv_10=(Token)match(input,FullStop,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getFullStopKeyword_4_2());
                    			
                    // InternalGoatComponentsParser.g:2525:4: ( (lv_attribute_11_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2526:5: (lv_attribute_11_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2526:5: (lv_attribute_11_0= RULE_ID )
                    // InternalGoatComponentsParser.g:2527:6: lv_attribute_11_0= RULE_ID
                    {
                    lv_attribute_11_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_11_0, grammarAccess.getAtomicAccess().getAttributeIDTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attribute",
                    							lv_attribute_11_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGoatComponentsParser.g:2545:3: ( () ( (otherlv_13= RULE_ID ) ) otherlv_14= LeftParenthesis ( ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )* )? otherlv_18= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:2545:3: ( () ( (otherlv_13= RULE_ID ) ) otherlv_14= LeftParenthesis ( ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )* )? otherlv_18= RightParenthesis )
                    // InternalGoatComponentsParser.g:2546:4: () ( (otherlv_13= RULE_ID ) ) otherlv_14= LeftParenthesis ( ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )* )? otherlv_18= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:2546:4: ()
                    // InternalGoatComponentsParser.g:2547:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getFunctionCallAction_5_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2553:4: ( (otherlv_13= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2554:5: (otherlv_13= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2554:5: (otherlv_13= RULE_ID )
                    // InternalGoatComponentsParser.g:2555:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_13, grammarAccess.getAtomicAccess().getFunctionFuncDefinitionCrossReference_5_1_0());
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,LeftParenthesis,FOLLOW_43); 

                    				newLeafNode(otherlv_14, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_5_2());
                    			
                    // InternalGoatComponentsParser.g:2570:4: ( ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==Receiver||LA38_0==False||LA38_0==Proc||(LA38_0>=This && LA38_0<=True)||(LA38_0>=ExclamationMark && LA38_0<=LeftParenthesis)||(LA38_0>=RULE_ID && LA38_0<=RULE_STRING)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2571:5: ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )*
                            {
                            // InternalGoatComponentsParser.g:2571:5: ( (lv_params_15_0= ruleExpression ) )
                            // InternalGoatComponentsParser.g:2572:6: (lv_params_15_0= ruleExpression )
                            {
                            // InternalGoatComponentsParser.g:2572:6: (lv_params_15_0= ruleExpression )
                            // InternalGoatComponentsParser.g:2573:7: lv_params_15_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getAtomicAccess().getParamsExpressionParserRuleCall_5_3_0_0());
                            						
                            pushFollow(FOLLOW_44);
                            lv_params_15_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAtomicRule());
                            							}
                            							add(
                            								current,
                            								"params",
                            								lv_params_15_0,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGoatComponentsParser.g:2590:5: (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==Comma) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:2591:6: otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) )
                            	    {
                            	    otherlv_16=(Token)match(input,Comma,FOLLOW_11); 

                            	    						newLeafNode(otherlv_16, grammarAccess.getAtomicAccess().getCommaKeyword_5_3_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:2595:6: ( (lv_params_17_0= ruleExpression ) )
                            	    // InternalGoatComponentsParser.g:2596:7: (lv_params_17_0= ruleExpression )
                            	    {
                            	    // InternalGoatComponentsParser.g:2596:7: (lv_params_17_0= ruleExpression )
                            	    // InternalGoatComponentsParser.g:2597:8: lv_params_17_0= ruleExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getAtomicAccess().getParamsExpressionParserRuleCall_5_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_44);
                            	    lv_params_17_0=ruleExpression();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getAtomicRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_17_0,
                            	    									"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGoatComponentsParser.g:2622:3: ( () otherlv_20= This otherlv_21= FullStop ( (lv_attribute_22_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:2622:3: ( () otherlv_20= This otherlv_21= FullStop ( (lv_attribute_22_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:2623:4: () otherlv_20= This otherlv_21= FullStop ( (lv_attribute_22_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:2623:4: ()
                    // InternalGoatComponentsParser.g:2624:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getComponentAttributeRefAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_20=(Token)match(input,This,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getAtomicAccess().getThisKeyword_6_1());
                    			
                    otherlv_21=(Token)match(input,FullStop,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getAtomicAccess().getFullStopKeyword_6_2());
                    			
                    // InternalGoatComponentsParser.g:2638:4: ( (lv_attribute_22_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2639:5: (lv_attribute_22_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2639:5: (lv_attribute_22_0= RULE_ID )
                    // InternalGoatComponentsParser.g:2640:6: lv_attribute_22_0= RULE_ID
                    {
                    lv_attribute_22_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_22_0, grammarAccess.getAtomicAccess().getAttributeIDTerminalRuleCall_6_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attribute",
                    							lv_attribute_22_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGoatComponentsParser.g:2658:3: ( () otherlv_24= Receiver otherlv_25= FullStop ( (lv_attribute_26_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:2658:3: ( () otherlv_24= Receiver otherlv_25= FullStop ( (lv_attribute_26_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:2659:4: () otherlv_24= Receiver otherlv_25= FullStop ( (lv_attribute_26_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:2659:4: ()
                    // InternalGoatComponentsParser.g:2660:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getRecAttributeRefAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_24=(Token)match(input,Receiver,FOLLOW_19); 

                    				newLeafNode(otherlv_24, grammarAccess.getAtomicAccess().getReceiverKeyword_7_1());
                    			
                    otherlv_25=(Token)match(input,FullStop,FOLLOW_5); 

                    				newLeafNode(otherlv_25, grammarAccess.getAtomicAccess().getFullStopKeyword_7_2());
                    			
                    // InternalGoatComponentsParser.g:2674:4: ( (lv_attribute_26_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2675:5: (lv_attribute_26_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2675:5: (lv_attribute_26_0= RULE_ID )
                    // InternalGoatComponentsParser.g:2676:6: lv_attribute_26_0= RULE_ID
                    {
                    lv_attribute_26_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_26_0, grammarAccess.getAtomicAccess().getAttributeIDTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attribute",
                    							lv_attribute_26_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleAttributeToSet"
    // InternalGoatComponentsParser.g:2697:1: entryRuleAttributeToSet returns [EObject current=null] : iv_ruleAttributeToSet= ruleAttributeToSet EOF ;
    public final EObject entryRuleAttributeToSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeToSet = null;


        try {
            // InternalGoatComponentsParser.g:2697:55: (iv_ruleAttributeToSet= ruleAttributeToSet EOF )
            // InternalGoatComponentsParser.g:2698:2: iv_ruleAttributeToSet= ruleAttributeToSet EOF
            {
             newCompositeNode(grammarAccess.getAttributeToSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeToSet=ruleAttributeToSet();

            state._fsp--;

             current =iv_ruleAttributeToSet; 
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
    // $ANTLR end "entryRuleAttributeToSet"


    // $ANTLR start "ruleAttributeToSet"
    // InternalGoatComponentsParser.g:2704:1: ruleAttributeToSet returns [EObject current=null] : ( ( () otherlv_1= This otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | ( () otherlv_5= Proc otherlv_6= FullStop ( (lv_attribute_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAttributeToSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_attribute_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_attribute_7_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2710:2: ( ( ( () otherlv_1= This otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | ( () otherlv_5= Proc otherlv_6= FullStop ( (lv_attribute_7_0= RULE_ID ) ) ) ) )
            // InternalGoatComponentsParser.g:2711:2: ( ( () otherlv_1= This otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | ( () otherlv_5= Proc otherlv_6= FullStop ( (lv_attribute_7_0= RULE_ID ) ) ) )
            {
            // InternalGoatComponentsParser.g:2711:2: ( ( () otherlv_1= This otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | ( () otherlv_5= Proc otherlv_6= FullStop ( (lv_attribute_7_0= RULE_ID ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==This) ) {
                alt40=1;
            }
            else if ( (LA40_0==Proc) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalGoatComponentsParser.g:2712:3: ( () otherlv_1= This otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:2712:3: ( () otherlv_1= This otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:2713:4: () otherlv_1= This otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:2713:4: ()
                    // InternalGoatComponentsParser.g:2714:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeToSetAccess().getComponentAttributeToSetAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,This,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeToSetAccess().getThisKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,FullStop,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeToSetAccess().getFullStopKeyword_0_2());
                    			
                    // InternalGoatComponentsParser.g:2728:4: ( (lv_attribute_3_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2729:5: (lv_attribute_3_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2729:5: (lv_attribute_3_0= RULE_ID )
                    // InternalGoatComponentsParser.g:2730:6: lv_attribute_3_0= RULE_ID
                    {
                    lv_attribute_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_3_0, grammarAccess.getAttributeToSetAccess().getAttributeIDTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeToSetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attribute",
                    							lv_attribute_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2748:3: ( () otherlv_5= Proc otherlv_6= FullStop ( (lv_attribute_7_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:2748:3: ( () otherlv_5= Proc otherlv_6= FullStop ( (lv_attribute_7_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:2749:4: () otherlv_5= Proc otherlv_6= FullStop ( (lv_attribute_7_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:2749:4: ()
                    // InternalGoatComponentsParser.g:2750:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeToSetAccess().getLocalAttributeToSetAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,Proc,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeToSetAccess().getProcKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,FullStop,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeToSetAccess().getFullStopKeyword_1_2());
                    			
                    // InternalGoatComponentsParser.g:2764:4: ( (lv_attribute_7_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2765:5: (lv_attribute_7_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2765:5: (lv_attribute_7_0= RULE_ID )
                    // InternalGoatComponentsParser.g:2766:6: lv_attribute_7_0= RULE_ID
                    {
                    lv_attribute_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_7_0, grammarAccess.getAttributeToSetAccess().getAttributeIDTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeToSetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attribute",
                    							lv_attribute_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleAttributeToSet"


    // $ANTLR start "entryRuleFuncParam"
    // InternalGoatComponentsParser.g:2787:1: entryRuleFuncParam returns [EObject current=null] : iv_ruleFuncParam= ruleFuncParam EOF ;
    public final EObject entryRuleFuncParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncParam = null;


        try {
            // InternalGoatComponentsParser.g:2787:50: (iv_ruleFuncParam= ruleFuncParam EOF )
            // InternalGoatComponentsParser.g:2788:2: iv_ruleFuncParam= ruleFuncParam EOF
            {
             newCompositeNode(grammarAccess.getFuncParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncParam=ruleFuncParam();

            state._fsp--;

             current =iv_ruleFuncParam; 
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
    // $ANTLR end "entryRuleFuncParam"


    // $ANTLR start "ruleFuncParam"
    // InternalGoatComponentsParser.g:2794:1: ruleFuncParam returns [EObject current=null] : ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFuncParam() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2800:2: ( ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:2801:2: ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:2801:2: ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:2802:3: ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:2802:3: ( (lv_type_0_0= RULE_TYPE ) )
            // InternalGoatComponentsParser.g:2803:4: (lv_type_0_0= RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:2803:4: (lv_type_0_0= RULE_TYPE )
            // InternalGoatComponentsParser.g:2804:5: lv_type_0_0= RULE_TYPE
            {
            lv_type_0_0=(Token)match(input,RULE_TYPE,FOLLOW_5); 

            					newLeafNode(lv_type_0_0, grammarAccess.getFuncParamAccess().getTypeTYPETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.TYPE");
            				

            }


            }

            // InternalGoatComponentsParser.g:2820:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2821:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2821:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:2822:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuncParamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFuncParam"


    // $ANTLR start "entryRuleFuncDefinition"
    // InternalGoatComponentsParser.g:2842:1: entryRuleFuncDefinition returns [EObject current=null] : iv_ruleFuncDefinition= ruleFuncDefinition EOF ;
    public final EObject entryRuleFuncDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDefinition = null;


        try {
            // InternalGoatComponentsParser.g:2842:55: (iv_ruleFuncDefinition= ruleFuncDefinition EOF )
            // InternalGoatComponentsParser.g:2843:2: iv_ruleFuncDefinition= ruleFuncDefinition EOF
            {
             newCompositeNode(grammarAccess.getFuncDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncDefinition=ruleFuncDefinition();

            state._fsp--;

             current =iv_ruleFuncDefinition; 
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
    // $ANTLR end "entryRuleFuncDefinition"


    // $ANTLR start "ruleFuncDefinition"
    // InternalGoatComponentsParser.g:2849:1: ruleFuncDefinition returns [EObject current=null] : (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) ) ;
    public final EObject ruleFuncDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_blk_8_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2855:2: ( (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) ) )
            // InternalGoatComponentsParser.g:2856:2: (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) )
            {
            // InternalGoatComponentsParser.g:2856:2: (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) )
            // InternalGoatComponentsParser.g:2857:3: otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) )
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncDefinitionAccess().getFunctionKeyword_0());
            		
            // InternalGoatComponentsParser.g:2861:3: ( (lv_type_1_0= RULE_TYPE ) )
            // InternalGoatComponentsParser.g:2862:4: (lv_type_1_0= RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:2862:4: (lv_type_1_0= RULE_TYPE )
            // InternalGoatComponentsParser.g:2863:5: lv_type_1_0= RULE_TYPE
            {
            lv_type_1_0=(Token)match(input,RULE_TYPE,FOLLOW_5); 

            					newLeafNode(lv_type_1_0, grammarAccess.getFuncDefinitionAccess().getTypeTYPETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.TYPE");
            				

            }


            }

            // InternalGoatComponentsParser.g:2879:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2880:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2880:4: (lv_name_2_0= RULE_ID )
            // InternalGoatComponentsParser.g:2881:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFuncDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:2901:3: ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_TYPE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGoatComponentsParser.g:2902:4: ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )*
                    {
                    // InternalGoatComponentsParser.g:2902:4: ( (lv_params_4_0= ruleFuncParam ) )
                    // InternalGoatComponentsParser.g:2903:5: (lv_params_4_0= ruleFuncParam )
                    {
                    // InternalGoatComponentsParser.g:2903:5: (lv_params_4_0= ruleFuncParam )
                    // InternalGoatComponentsParser.g:2904:6: lv_params_4_0= ruleFuncParam
                    {

                    						newCompositeNode(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_params_4_0=ruleFuncParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_4_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:2921:4: (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==Comma) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:2922:5: otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_45); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFuncDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:2926:5: ( (lv_params_6_0= ruleFuncParam ) )
                    	    // InternalGoatComponentsParser.g:2927:6: (lv_params_6_0= ruleFuncParam )
                    	    {
                    	    // InternalGoatComponentsParser.g:2927:6: (lv_params_6_0= ruleFuncParam )
                    	    // InternalGoatComponentsParser.g:2928:7: lv_params_6_0= ruleFuncParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    lv_params_6_0=ruleFuncParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFuncDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_6_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.FuncParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getFuncDefinitionAccess().getRightParenthesisKeyword_5());
            		
            // InternalGoatComponentsParser.g:2951:3: ( (lv_blk_8_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:2952:4: (lv_blk_8_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:2952:4: (lv_blk_8_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:2953:5: lv_blk_8_0= ruleFuncBlock
            {

            					newCompositeNode(grammarAccess.getFuncDefinitionAccess().getBlkFuncBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_blk_8_0=ruleFuncBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncDefinitionRule());
            					}
            					set(
            						current,
            						"blk",
            						lv_blk_8_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.FuncBlock");
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
    // $ANTLR end "ruleFuncDefinition"


    // $ANTLR start "entryRuleFuncBlock"
    // InternalGoatComponentsParser.g:2974:1: entryRuleFuncBlock returns [EObject current=null] : iv_ruleFuncBlock= ruleFuncBlock EOF ;
    public final EObject entryRuleFuncBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncBlock = null;


        try {
            // InternalGoatComponentsParser.g:2974:50: (iv_ruleFuncBlock= ruleFuncBlock EOF )
            // InternalGoatComponentsParser.g:2975:2: iv_ruleFuncBlock= ruleFuncBlock EOF
            {
             newCompositeNode(grammarAccess.getFuncBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncBlock=ruleFuncBlock();

            state._fsp--;

             current =iv_ruleFuncBlock; 
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
    // $ANTLR end "entryRuleFuncBlock"


    // $ANTLR start "ruleFuncBlock"
    // InternalGoatComponentsParser.g:2981:1: ruleFuncBlock returns [EObject current=null] : (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleFuncBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2987:2: ( (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:2988:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2988:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket )
            // InternalGoatComponentsParser.g:2989:3: otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:2993:3: ()
            // InternalGoatComponentsParser.g:2994:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuncBlockAccess().getFuncBlockAction_1(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:3000:3: ( (lv_statements_2_0= ruleFuncStatement ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==Return||LA43_0==Var||LA43_0==If||LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3001:4: (lv_statements_2_0= ruleFuncStatement )
            	    {
            	    // InternalGoatComponentsParser.g:3001:4: (lv_statements_2_0= ruleFuncStatement )
            	    // InternalGoatComponentsParser.g:3002:5: lv_statements_2_0= ruleFuncStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFuncBlockAccess().getStatementsFuncStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_statements_2_0=ruleFuncStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuncBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"com.sysma.goat.eclipse_plugin.GoatComponents.FuncStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleFuncBlock"


    // $ANTLR start "entryRuleFuncStatement"
    // InternalGoatComponentsParser.g:3027:1: entryRuleFuncStatement returns [EObject current=null] : iv_ruleFuncStatement= ruleFuncStatement EOF ;
    public final EObject entryRuleFuncStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncStatement = null;


        try {
            // InternalGoatComponentsParser.g:3027:54: (iv_ruleFuncStatement= ruleFuncStatement EOF )
            // InternalGoatComponentsParser.g:3028:2: iv_ruleFuncStatement= ruleFuncStatement EOF
            {
             newCompositeNode(grammarAccess.getFuncStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncStatement=ruleFuncStatement();

            state._fsp--;

             current =iv_ruleFuncStatement; 
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
    // $ANTLR end "entryRuleFuncStatement"


    // $ANTLR start "ruleFuncStatement"
    // InternalGoatComponentsParser.g:3034:1: ruleFuncStatement returns [EObject current=null] : (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration ) ;
    public final EObject ruleFuncStatement() throws RecognitionException {
        EObject current = null;

        EObject this_FuncVarAssign_0 = null;

        EObject this_FuncIfElse_1 = null;

        EObject this_FuncReturn_2 = null;

        EObject this_FuncVarDeclaration_3 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3040:2: ( (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration ) )
            // InternalGoatComponentsParser.g:3041:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration )
            {
            // InternalGoatComponentsParser.g:3041:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration )
            int alt44=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt44=1;
                }
                break;
            case If:
                {
                alt44=2;
                }
                break;
            case Return:
                {
                alt44=3;
                }
                break;
            case Var:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalGoatComponentsParser.g:3042:3: this_FuncVarAssign_0= ruleFuncVarAssign
                    {

                    			newCompositeNode(grammarAccess.getFuncStatementAccess().getFuncVarAssignParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncVarAssign_0=ruleFuncVarAssign();

                    state._fsp--;


                    			current = this_FuncVarAssign_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:3051:3: this_FuncIfElse_1= ruleFuncIfElse
                    {

                    			newCompositeNode(grammarAccess.getFuncStatementAccess().getFuncIfElseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncIfElse_1=ruleFuncIfElse();

                    state._fsp--;


                    			current = this_FuncIfElse_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:3060:3: this_FuncReturn_2= ruleFuncReturn
                    {

                    			newCompositeNode(grammarAccess.getFuncStatementAccess().getFuncReturnParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncReturn_2=ruleFuncReturn();

                    state._fsp--;


                    			current = this_FuncReturn_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:3069:3: this_FuncVarDeclaration_3= ruleFuncVarDeclaration
                    {

                    			newCompositeNode(grammarAccess.getFuncStatementAccess().getFuncVarDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncVarDeclaration_3=ruleFuncVarDeclaration();

                    state._fsp--;


                    			current = this_FuncVarDeclaration_3;
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
    // $ANTLR end "ruleFuncStatement"


    // $ANTLR start "entryRuleFuncVarDeclaration"
    // InternalGoatComponentsParser.g:3081:1: entryRuleFuncVarDeclaration returns [EObject current=null] : iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF ;
    public final EObject entryRuleFuncVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarDeclaration = null;


        try {
            // InternalGoatComponentsParser.g:3081:59: (iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF )
            // InternalGoatComponentsParser.g:3082:2: iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFuncVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncVarDeclaration=ruleFuncVarDeclaration();

            state._fsp--;

             current =iv_ruleFuncVarDeclaration; 
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
    // $ANTLR end "entryRuleFuncVarDeclaration"


    // $ANTLR start "ruleFuncVarDeclaration"
    // InternalGoatComponentsParser.g:3088:1: ruleFuncVarDeclaration returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) ) ;
    public final EObject ruleFuncVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3094:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) ) )
            // InternalGoatComponentsParser.g:3095:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) )
            {
            // InternalGoatComponentsParser.g:3095:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) )
            // InternalGoatComponentsParser.g:3096:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncVarDeclarationAccess().getVarKeyword_0());
            		
            // InternalGoatComponentsParser.g:3100:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:3101:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:3101:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:3102:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuncVarDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncVarDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalGoatComponentsParser.g:3122:3: ( (lv_val_3_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:3123:4: (lv_val_3_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:3123:4: (lv_val_3_0= ruleExpression )
            // InternalGoatComponentsParser.g:3124:5: lv_val_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncVarDeclarationAccess().getValExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncVarDeclarationRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
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
    // $ANTLR end "ruleFuncVarDeclaration"


    // $ANTLR start "entryRuleFuncVarAssign"
    // InternalGoatComponentsParser.g:3145:1: entryRuleFuncVarAssign returns [EObject current=null] : iv_ruleFuncVarAssign= ruleFuncVarAssign EOF ;
    public final EObject entryRuleFuncVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarAssign = null;


        try {
            // InternalGoatComponentsParser.g:3145:54: (iv_ruleFuncVarAssign= ruleFuncVarAssign EOF )
            // InternalGoatComponentsParser.g:3146:2: iv_ruleFuncVarAssign= ruleFuncVarAssign EOF
            {
             newCompositeNode(grammarAccess.getFuncVarAssignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncVarAssign=ruleFuncVarAssign();

            state._fsp--;

             current =iv_ruleFuncVarAssign; 
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
    // $ANTLR end "entryRuleFuncVarAssign"


    // $ANTLR start "ruleFuncVarAssign"
    // InternalGoatComponentsParser.g:3152:1: ruleFuncVarAssign returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFuncVarAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3158:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleExpression ) ) ) )
            // InternalGoatComponentsParser.g:3159:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleExpression ) ) )
            {
            // InternalGoatComponentsParser.g:3159:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleExpression ) ) )
            // InternalGoatComponentsParser.g:3160:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleExpression ) )
            {
            // InternalGoatComponentsParser.g:3160:3: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:3161:4: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:3161:4: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:3162:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarAssignRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncVarAssignAccess().getEqualsSignKeyword_1());
            		
            // InternalGoatComponentsParser.g:3177:3: ( (lv_val_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:3178:4: (lv_val_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:3178:4: (lv_val_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:3179:5: lv_val_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncVarAssignAccess().getValExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncVarAssignRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
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
    // $ANTLR end "ruleFuncVarAssign"


    // $ANTLR start "entryRuleFuncIfElse"
    // InternalGoatComponentsParser.g:3200:1: entryRuleFuncIfElse returns [EObject current=null] : iv_ruleFuncIfElse= ruleFuncIfElse EOF ;
    public final EObject entryRuleFuncIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncIfElse = null;


        try {
            // InternalGoatComponentsParser.g:3200:51: (iv_ruleFuncIfElse= ruleFuncIfElse EOF )
            // InternalGoatComponentsParser.g:3201:2: iv_ruleFuncIfElse= ruleFuncIfElse EOF
            {
             newCompositeNode(grammarAccess.getFuncIfElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncIfElse=ruleFuncIfElse();

            state._fsp--;

             current =iv_ruleFuncIfElse; 
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
    // $ANTLR end "entryRuleFuncIfElse"


    // $ANTLR start "ruleFuncIfElse"
    // InternalGoatComponentsParser.g:3207:1: ruleFuncIfElse returns [EObject current=null] : (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleExpression ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )? ) ;
    public final EObject ruleFuncIfElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_test_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_test_7_0 = null;

        EObject lv_then_9_0 = null;

        EObject lv_elseBranch_11_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3213:2: ( (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleExpression ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )? ) )
            // InternalGoatComponentsParser.g:3214:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleExpression ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )? )
            {
            // InternalGoatComponentsParser.g:3214:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleExpression ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )? )
            // InternalGoatComponentsParser.g:3215:3: otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleExpression ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncIfElseAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:3223:3: ( (lv_test_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:3224:4: (lv_test_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:3224:4: (lv_test_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:3225:5: lv_test_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_test_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
            					}
            					add(
            						current,
            						"test",
            						lv_test_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:3246:3: ( (lv_then_4_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:3247:4: (lv_then_4_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:3247:4: (lv_then_4_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:3248:5: lv_then_4_0= ruleFuncBlock
            {

            					newCompositeNode(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_48);
            lv_then_4_0=ruleFuncBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
            					}
            					add(
            						current,
            						"then",
            						lv_then_4_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.FuncBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:3265:3: (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleExpression ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Elif) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3266:4: otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleExpression ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) )
            	    {
            	    otherlv_5=(Token)match(input,Elif,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFuncIfElseAccess().getElifKeyword_5_0());
            	    			
            	    otherlv_6=(Token)match(input,LeftParenthesis,FOLLOW_11); 

            	    				newLeafNode(otherlv_6, grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_5_1());
            	    			
            	    // InternalGoatComponentsParser.g:3274:4: ( (lv_test_7_0= ruleExpression ) )
            	    // InternalGoatComponentsParser.g:3275:5: (lv_test_7_0= ruleExpression )
            	    {
            	    // InternalGoatComponentsParser.g:3275:5: (lv_test_7_0= ruleExpression )
            	    // InternalGoatComponentsParser.g:3276:6: lv_test_7_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_test_7_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"test",
            	    							lv_test_7_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_13); 

            	    				newLeafNode(otherlv_8, grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_5_3());
            	    			
            	    // InternalGoatComponentsParser.g:3297:4: ( (lv_then_9_0= ruleFuncBlock ) )
            	    // InternalGoatComponentsParser.g:3298:5: (lv_then_9_0= ruleFuncBlock )
            	    {
            	    // InternalGoatComponentsParser.g:3298:5: (lv_then_9_0= ruleFuncBlock )
            	    // InternalGoatComponentsParser.g:3299:6: lv_then_9_0= ruleFuncBlock
            	    {

            	    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_5_4_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_then_9_0=ruleFuncBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"then",
            	    							lv_then_9_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalGoatComponentsParser.g:3317:3: (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Else) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGoatComponentsParser.g:3318:4: otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) )
                    {
                    otherlv_10=(Token)match(input,Else,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getFuncIfElseAccess().getElseKeyword_6_0());
                    			
                    // InternalGoatComponentsParser.g:3322:4: ( (lv_elseBranch_11_0= ruleFuncBlock ) )
                    // InternalGoatComponentsParser.g:3323:5: (lv_elseBranch_11_0= ruleFuncBlock )
                    {
                    // InternalGoatComponentsParser.g:3323:5: (lv_elseBranch_11_0= ruleFuncBlock )
                    // InternalGoatComponentsParser.g:3324:6: lv_elseBranch_11_0= ruleFuncBlock
                    {

                    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getElseBranchFuncBlockParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseBranch_11_0=ruleFuncBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
                    						}
                    						set(
                    							current,
                    							"elseBranch",
                    							lv_elseBranch_11_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncBlock");
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
    // $ANTLR end "ruleFuncIfElse"


    // $ANTLR start "entryRuleFuncReturn"
    // InternalGoatComponentsParser.g:3346:1: entryRuleFuncReturn returns [EObject current=null] : iv_ruleFuncReturn= ruleFuncReturn EOF ;
    public final EObject entryRuleFuncReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncReturn = null;


        try {
            // InternalGoatComponentsParser.g:3346:51: (iv_ruleFuncReturn= ruleFuncReturn EOF )
            // InternalGoatComponentsParser.g:3347:2: iv_ruleFuncReturn= ruleFuncReturn EOF
            {
             newCompositeNode(grammarAccess.getFuncReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncReturn=ruleFuncReturn();

            state._fsp--;

             current =iv_ruleFuncReturn; 
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
    // $ANTLR end "entryRuleFuncReturn"


    // $ANTLR start "ruleFuncReturn"
    // InternalGoatComponentsParser.g:3353:1: ruleFuncReturn returns [EObject current=null] : (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) ) ;
    public final EObject ruleFuncReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3359:2: ( (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) ) )
            // InternalGoatComponentsParser.g:3360:2: (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) )
            {
            // InternalGoatComponentsParser.g:3360:2: (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) )
            // InternalGoatComponentsParser.g:3361:3: otherlv_0= Return ( (lv_val_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Return,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncReturnAccess().getReturnKeyword_0());
            		
            // InternalGoatComponentsParser.g:3365:3: ( (lv_val_1_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:3366:4: (lv_val_1_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:3366:4: (lv_val_1_0= ruleExpression )
            // InternalGoatComponentsParser.g:3367:5: lv_val_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncReturnAccess().getValExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncReturnRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
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
    // $ANTLR end "ruleFuncReturn"

    // Delegated rules


    protected DFA39 dfa39 = new DFA39(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\uffff\1\10\5\uffff";
    static final String dfa_3s = "\1\6\3\uffff\1\10\5\uffff";
    static final String dfa_4s = "\1\65\3\uffff\1\63\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\7\1\10\1\4\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\2\uffff\1\3\5\uffff\1\5\1\uffff\1\6\1\3\40\uffff\1\4\1\1\1\2",
            "",
            "",
            "",
            "\1\10\14\uffff\4\10\1\uffff\3\10\1\uffff\2\10\1\uffff\1\11\5\10\1\uffff\2\10\1\uffff\1\10\2\uffff\1\10\2\uffff\1\10\1\uffff\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2392:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | ( () otherlv_9= Proc otherlv_10= FullStop ( (lv_attribute_11_0= RULE_ID ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) otherlv_14= LeftParenthesis ( ( (lv_params_15_0= ruleExpression ) ) (otherlv_16= Comma ( (lv_params_17_0= ruleExpression ) ) )* )? otherlv_18= RightParenthesis ) | ( () otherlv_20= This otherlv_21= FullStop ( (lv_attribute_22_0= RULE_ID ) ) ) | ( () otherlv_24= Receiver otherlv_25= FullStop ( (lv_attribute_26_0= RULE_ID ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000200000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0038000300068240L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000028000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000200100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x003A000300068240L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000C00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008200240180000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000402000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0030000000040200L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000A0014000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000005001000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0038000700068240L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000A000040200100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000006002L});

}