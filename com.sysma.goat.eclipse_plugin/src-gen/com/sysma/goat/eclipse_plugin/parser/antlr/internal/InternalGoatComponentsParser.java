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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Component", "Function", "Receiver", "Return", "False", "Sleep", "Elif", "Else", "Proc", "This", "True", "Var", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "ColonEqualsSign", "LessThanSignEqualsSign", "GreaterThanSignEqualsSign", "At", "If", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "PlusSign", "Comma", "FullStop", "DigitZero", "LessThanSign", "EqualsSign", "GreaterThanSign", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Elif=10;
    public static final int Var=15;
    public static final int True=14;
    public static final int False=8;
    public static final int LessThanSign=31;
    public static final int LeftParenthesis=25;
    public static final int This=13;
    public static final int RightSquareBracket=36;
    public static final int ExclamationMark=24;
    public static final int GreaterThanSign=33;
    public static final int RULE_ID=40;
    public static final int RightParenthesis=26;
    public static final int Receiver=6;
    public static final int ColonEqualsSign=18;
    public static final int GreaterThanSignEqualsSign=20;
    public static final int DigitZero=30;
    public static final int VerticalLine=38;
    public static final int PlusSign=27;
    public static final int RULE_INT=41;
    public static final int RULE_ML_COMMENT=43;
    public static final int LeftSquareBracket=35;
    public static final int If=22;
    public static final int VerticalLineVerticalLine=23;
    public static final int RULE_STRING=42;
    public static final int RULE_SL_COMMENT=44;
    public static final int Proc=12;
    public static final int Function=5;
    public static final int Comma=28;
    public static final int EqualsSign=32;
    public static final int At=21;
    public static final int AmpersandAmpersand=17;
    public static final int LessThanSignEqualsSign=19;
    public static final int RightCurlyBracket=39;
    public static final int Component=4;
    public static final int EOF=-1;
    public static final int FullStop=29;
    public static final int Return=7;
    public static final int RULE_WS=45;
    public static final int LeftCurlyBracket=37;
    public static final int RULE_ANY_OTHER=46;
    public static final int CommercialAt=34;
    public static final int Sleep=9;
    public static final int Else=11;
    public static final int ExclamationMarkEqualsSign=16;

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
    // InternalGoatComponentsParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_processes_0_0= ruleProcessDefinition ) ) | ( (lv_components_1_0= ruleComponentDefinition ) ) | ( (lv_functions_2_0= ruleFuncDefinition ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_processes_0_0 = null;

        EObject lv_components_1_0 = null;

        EObject lv_functions_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:70:2: ( ( ( (lv_processes_0_0= ruleProcessDefinition ) ) | ( (lv_components_1_0= ruleComponentDefinition ) ) | ( (lv_functions_2_0= ruleFuncDefinition ) ) )* )
            // InternalGoatComponentsParser.g:71:2: ( ( (lv_processes_0_0= ruleProcessDefinition ) ) | ( (lv_components_1_0= ruleComponentDefinition ) ) | ( (lv_functions_2_0= ruleFuncDefinition ) ) )*
            {
            // InternalGoatComponentsParser.g:71:2: ( ( (lv_processes_0_0= ruleProcessDefinition ) ) | ( (lv_components_1_0= ruleComponentDefinition ) ) | ( (lv_functions_2_0= ruleFuncDefinition ) ) )*
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
            	    // InternalGoatComponentsParser.g:72:3: ( (lv_processes_0_0= ruleProcessDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:72:3: ( (lv_processes_0_0= ruleProcessDefinition ) )
            	    // InternalGoatComponentsParser.g:73:4: (lv_processes_0_0= ruleProcessDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:73:4: (lv_processes_0_0= ruleProcessDefinition )
            	    // InternalGoatComponentsParser.g:74:5: lv_processes_0_0= ruleProcessDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getProcessesProcessDefinitionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_processes_0_0=ruleProcessDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processes",
            	    						lv_processes_0_0,
            	    						"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGoatComponentsParser.g:92:3: ( (lv_components_1_0= ruleComponentDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:92:3: ( (lv_components_1_0= ruleComponentDefinition ) )
            	    // InternalGoatComponentsParser.g:93:4: (lv_components_1_0= ruleComponentDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:93:4: (lv_components_1_0= ruleComponentDefinition )
            	    // InternalGoatComponentsParser.g:94:5: lv_components_1_0= ruleComponentDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_components_1_0=ruleComponentDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_1_0,
            	    						"com.sysma.goat.eclipse_plugin.GoatComponents.ComponentDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGoatComponentsParser.g:112:3: ( (lv_functions_2_0= ruleFuncDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:112:3: ( (lv_functions_2_0= ruleFuncDefinition ) )
            	    // InternalGoatComponentsParser.g:113:4: (lv_functions_2_0= ruleFuncDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:113:4: (lv_functions_2_0= ruleFuncDefinition )
            	    // InternalGoatComponentsParser.g:114:5: lv_functions_2_0= ruleFuncDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFunctionsFuncDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_functions_2_0=ruleFuncDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_2_0,
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
    // InternalGoatComponentsParser.g:135:1: entryRuleProc returns [EObject current=null] : iv_ruleProc= ruleProc EOF ;
    public final EObject entryRuleProc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProc = null;


        try {
            // InternalGoatComponentsParser.g:135:45: (iv_ruleProc= ruleProc EOF )
            // InternalGoatComponentsParser.g:136:2: iv_ruleProc= ruleProc EOF
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
    // InternalGoatComponentsParser.g:142:1: ruleProc returns [EObject current=null] : (this_InterleavingProcess_0= ruleInterleavingProcess | this_NonDeterminismProcess_1= ruleNonDeterminismProcess ) ;
    public final EObject ruleProc() throws RecognitionException {
        EObject current = null;

        EObject this_InterleavingProcess_0 = null;

        EObject this_NonDeterminismProcess_1 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:148:2: ( (this_InterleavingProcess_0= ruleInterleavingProcess | this_NonDeterminismProcess_1= ruleNonDeterminismProcess ) )
            // InternalGoatComponentsParser.g:149:2: (this_InterleavingProcess_0= ruleInterleavingProcess | this_NonDeterminismProcess_1= ruleNonDeterminismProcess )
            {
            // InternalGoatComponentsParser.g:149:2: (this_InterleavingProcess_0= ruleInterleavingProcess | this_NonDeterminismProcess_1= ruleNonDeterminismProcess )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==If||LA2_0==LeftParenthesis||(LA2_0>=DigitZero && LA2_0<=LessThanSign)||LA2_0==LeftSquareBracket||LA2_0==LeftCurlyBracket) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatComponentsParser.g:150:3: this_InterleavingProcess_0= ruleInterleavingProcess
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
                    // InternalGoatComponentsParser.g:159:3: this_NonDeterminismProcess_1= ruleNonDeterminismProcess
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
    // InternalGoatComponentsParser.g:171:1: entryRuleInterleavingProcess returns [EObject current=null] : iv_ruleInterleavingProcess= ruleInterleavingProcess EOF ;
    public final EObject entryRuleInterleavingProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterleavingProcess = null;


        try {
            // InternalGoatComponentsParser.g:171:60: (iv_ruleInterleavingProcess= ruleInterleavingProcess EOF )
            // InternalGoatComponentsParser.g:172:2: iv_ruleInterleavingProcess= ruleInterleavingProcess EOF
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
    // InternalGoatComponentsParser.g:178:1: ruleInterleavingProcess returns [EObject current=null] : (this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )* ) ;
    public final EObject ruleInterleavingProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CallProcess_0 = null;

        EObject lv_subProcs_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:184:2: ( (this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )* ) )
            // InternalGoatComponentsParser.g:185:2: (this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )* )
            {
            // InternalGoatComponentsParser.g:185:2: (this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )* )
            // InternalGoatComponentsParser.g:186:3: this_CallProcess_0= ruleCallProcess () (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )*
            {

            			newCompositeNode(grammarAccess.getInterleavingProcessAccess().getCallProcessParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_CallProcess_0=ruleCallProcess();

            state._fsp--;


            			current = this_CallProcess_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:194:3: ()
            // InternalGoatComponentsParser.g:195:4: 
            {

            				current = forceCreateModelElementAndAdd(
            					grammarAccess.getInterleavingProcessAccess().getInterleavingProcessSubProcsAction_1(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:201:3: (otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VerticalLine) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:202:4: otherlv_2= VerticalLine ( (lv_subProcs_3_0= ruleCallProcess ) )
            	    {
            	    otherlv_2=(Token)match(input,VerticalLine,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInterleavingProcessAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalGoatComponentsParser.g:206:4: ( (lv_subProcs_3_0= ruleCallProcess ) )
            	    // InternalGoatComponentsParser.g:207:5: (lv_subProcs_3_0= ruleCallProcess )
            	    {
            	    // InternalGoatComponentsParser.g:207:5: (lv_subProcs_3_0= ruleCallProcess )
            	    // InternalGoatComponentsParser.g:208:6: lv_subProcs_3_0= ruleCallProcess
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
    // InternalGoatComponentsParser.g:230:1: entryRuleNonDeterminismProcess returns [EObject current=null] : iv_ruleNonDeterminismProcess= ruleNonDeterminismProcess EOF ;
    public final EObject entryRuleNonDeterminismProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonDeterminismProcess = null;


        try {
            // InternalGoatComponentsParser.g:230:62: (iv_ruleNonDeterminismProcess= ruleNonDeterminismProcess EOF )
            // InternalGoatComponentsParser.g:231:2: iv_ruleNonDeterminismProcess= ruleNonDeterminismProcess EOF
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
    // InternalGoatComponentsParser.g:237:1: ruleNonDeterminismProcess returns [EObject current=null] : (this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses | this_IfProcesses_1= ruleIfProcesses | this_NProcess_2= ruleNProcess ) ;
    public final EObject ruleNonDeterminismProcess() throws RecognitionException {
        EObject current = null;

        EObject this_PredOutputProcessOrInputProcesses_0 = null;

        EObject this_IfProcesses_1 = null;

        EObject this_NProcess_2 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:243:2: ( (this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses | this_IfProcesses_1= ruleIfProcesses | this_NProcess_2= ruleNProcess ) )
            // InternalGoatComponentsParser.g:244:2: (this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses | this_IfProcesses_1= ruleIfProcesses | this_NProcess_2= ruleNProcess )
            {
            // InternalGoatComponentsParser.g:244:2: (this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses | this_IfProcesses_1= ruleIfProcesses | this_NProcess_2= ruleNProcess )
            int alt4=3;
            switch ( input.LA(1) ) {
            case LessThanSign:
            case LeftSquareBracket:
            case LeftCurlyBracket:
                {
                alt4=1;
                }
                break;
            case LeftParenthesis:
                {
                switch ( input.LA(2) ) {
                case This:
                case RightParenthesis:
                case RULE_STRING:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case LeftParenthesis:
                    case Comma:
                        {
                        alt4=1;
                        }
                        break;
                    case RightParenthesis:
                        {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6==EOF||(LA4_6>=Component && LA4_6<=Function)||LA4_6==Proc||LA4_6==RightParenthesis) ) {
                            alt4=3;
                        }
                        else if ( (LA4_6==CommercialAt) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LeftSquareBracket:
                    case VerticalLine:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case If:
                case LeftParenthesis:
                case DigitZero:
                case LessThanSign:
                case LeftSquareBracket:
                case LeftCurlyBracket:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

                }
                break;
            case If:
                {
                alt4=2;
                }
                break;
            case DigitZero:
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
                    // InternalGoatComponentsParser.g:245:3: this_PredOutputProcessOrInputProcesses_0= rulePredOutputProcessOrInputProcesses
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
                    // InternalGoatComponentsParser.g:254:3: this_IfProcesses_1= ruleIfProcesses
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
                    // InternalGoatComponentsParser.g:263:3: this_NProcess_2= ruleNProcess
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
    // InternalGoatComponentsParser.g:275:1: entryRulePreconditions returns [EObject current=null] : iv_rulePreconditions= rulePreconditions EOF ;
    public final EObject entryRulePreconditions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreconditions = null;


        try {
            // InternalGoatComponentsParser.g:275:54: (iv_rulePreconditions= rulePreconditions EOF )
            // InternalGoatComponentsParser.g:276:2: iv_rulePreconditions= rulePreconditions EOF
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
    // InternalGoatComponentsParser.g:282:1: rulePreconditions returns [EObject current=null] : ( () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )* ) ;
    public final EObject rulePreconditions() throws RecognitionException {
        EObject current = null;

        EObject lv_precond_1_1 = null;

        EObject lv_precond_1_2 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:288:2: ( ( () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )* ) )
            // InternalGoatComponentsParser.g:289:2: ( () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )* )
            {
            // InternalGoatComponentsParser.g:289:2: ( () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )* )
            // InternalGoatComponentsParser.g:290:3: () ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )*
            {
            // InternalGoatComponentsParser.g:290:3: ()
            // InternalGoatComponentsParser.g:291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPreconditionsAccess().getPreconditionsAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:297:3: ( ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==LessThanSign||LA6_0==LeftSquareBracket) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:298:4: ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) )
            	    {
            	    // InternalGoatComponentsParser.g:298:4: ( (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness ) )
            	    // InternalGoatComponentsParser.g:299:5: (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness )
            	    {
            	    // InternalGoatComponentsParser.g:299:5: (lv_precond_1_1= ruleUpdate | lv_precond_1_2= ruleAwareness )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==LeftSquareBracket) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==LessThanSign) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalGoatComponentsParser.g:300:6: lv_precond_1_1= ruleUpdate
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
            	            // InternalGoatComponentsParser.g:316:6: lv_precond_1_2= ruleAwareness
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
    // InternalGoatComponentsParser.g:338:1: entryRulePredOutputProcessOrInputProcesses returns [EObject current=null] : iv_rulePredOutputProcessOrInputProcesses= rulePredOutputProcessOrInputProcesses EOF ;
    public final EObject entryRulePredOutputProcessOrInputProcesses() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredOutputProcessOrInputProcesses = null;


        try {
            // InternalGoatComponentsParser.g:338:74: (iv_rulePredOutputProcessOrInputProcesses= rulePredOutputProcessOrInputProcesses EOF )
            // InternalGoatComponentsParser.g:339:2: iv_rulePredOutputProcessOrInputProcesses= rulePredOutputProcessOrInputProcesses EOF
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
    // InternalGoatComponentsParser.g:345:1: rulePredOutputProcessOrInputProcesses returns [EObject current=null] : (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) ) ) ;
    public final EObject rulePredOutputProcessOrInputProcesses() throws RecognitionException {
        EObject current = null;

        EObject this_Preconditions_0 = null;

        EObject this_OutputProcessPart_2 = null;

        EObject this_InputProcessesPart_4 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:351:2: ( (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) ) ) )
            // InternalGoatComponentsParser.g:352:2: (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) ) )
            {
            // InternalGoatComponentsParser.g:352:2: (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) ) )
            // InternalGoatComponentsParser.g:353:3: this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) )
            {

            			newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getPreconditionsParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Preconditions_0=rulePreconditions();

            state._fsp--;


            			current = this_Preconditions_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:361:3: ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LeftParenthesis) ) {
                alt7=1;
            }
            else if ( (LA7_0==LeftCurlyBracket) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoatComponentsParser.g:362:4: ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] )
                    {
                    // InternalGoatComponentsParser.g:362:4: ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] )
                    // InternalGoatComponentsParser.g:363:5: () this_OutputProcessPart_2= ruleOutputProcessPart[$current]
                    {
                    // InternalGoatComponentsParser.g:363:5: ()
                    // InternalGoatComponentsParser.g:364:6: 
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
                    // InternalGoatComponentsParser.g:383:4: ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] )
                    {
                    // InternalGoatComponentsParser.g:383:4: ( () this_InputProcessesPart_4= ruleInputProcessesPart[$current] )
                    // InternalGoatComponentsParser.g:384:5: () this_InputProcessesPart_4= ruleInputProcessesPart[$current]
                    {
                    // InternalGoatComponentsParser.g:384:5: ()
                    // InternalGoatComponentsParser.g:385:6: 
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
    // InternalGoatComponentsParser.g:408:1: entryRulePredOutputProcessOrInputProcess returns [EObject current=null] : iv_rulePredOutputProcessOrInputProcess= rulePredOutputProcessOrInputProcess EOF ;
    public final EObject entryRulePredOutputProcessOrInputProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredOutputProcessOrInputProcess = null;


        try {
            // InternalGoatComponentsParser.g:408:72: (iv_rulePredOutputProcessOrInputProcess= rulePredOutputProcessOrInputProcess EOF )
            // InternalGoatComponentsParser.g:409:2: iv_rulePredOutputProcessOrInputProcess= rulePredOutputProcessOrInputProcess EOF
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
    // InternalGoatComponentsParser.g:415:1: rulePredOutputProcessOrInputProcess returns [EObject current=null] : (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) ) ) ;
    public final EObject rulePredOutputProcessOrInputProcess() throws RecognitionException {
        EObject current = null;

        EObject this_Preconditions_0 = null;

        EObject this_OutputProcessPart_2 = null;

        EObject lv_inputs_4_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:421:2: ( (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) ) ) )
            // InternalGoatComponentsParser.g:422:2: (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) ) )
            {
            // InternalGoatComponentsParser.g:422:2: (this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) ) )
            // InternalGoatComponentsParser.g:423:3: this_Preconditions_0= rulePreconditions ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) )
            {

            			newCompositeNode(grammarAccess.getPredOutputProcessOrInputProcessAccess().getPreconditionsParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Preconditions_0=rulePreconditions();

            state._fsp--;


            			current = this_Preconditions_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:431:3: ( ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] ) | ( () ( (lv_inputs_4_0= ruleInputProcess ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LeftParenthesis) ) {
                alt8=1;
            }
            else if ( (LA8_0==LeftCurlyBracket) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoatComponentsParser.g:432:4: ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] )
                    {
                    // InternalGoatComponentsParser.g:432:4: ( () this_OutputProcessPart_2= ruleOutputProcessPart[$current] )
                    // InternalGoatComponentsParser.g:433:5: () this_OutputProcessPart_2= ruleOutputProcessPart[$current]
                    {
                    // InternalGoatComponentsParser.g:433:5: ()
                    // InternalGoatComponentsParser.g:434:6: 
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
                    // InternalGoatComponentsParser.g:453:4: ( () ( (lv_inputs_4_0= ruleInputProcess ) ) )
                    {
                    // InternalGoatComponentsParser.g:453:4: ( () ( (lv_inputs_4_0= ruleInputProcess ) ) )
                    // InternalGoatComponentsParser.g:454:5: () ( (lv_inputs_4_0= ruleInputProcess ) )
                    {
                    // InternalGoatComponentsParser.g:454:5: ()
                    // InternalGoatComponentsParser.g:455:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputProcessesPrecondsAction_1_1_0(),
                    							current);
                    					

                    }

                    // InternalGoatComponentsParser.g:461:5: ( (lv_inputs_4_0= ruleInputProcess ) )
                    // InternalGoatComponentsParser.g:462:6: (lv_inputs_4_0= ruleInputProcess )
                    {
                    // InternalGoatComponentsParser.g:462:6: (lv_inputs_4_0= ruleInputProcess )
                    // InternalGoatComponentsParser.g:463:7: lv_inputs_4_0= ruleInputProcess
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
    // InternalGoatComponentsParser.g:487:1: ruleInputProcessesPart[EObject in_current] returns [EObject current=in_current] : ( ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )* ) ;
    public final EObject ruleInputProcessesPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_inputs_0_0 = null;

        EObject lv_preconds_2_0 = null;

        EObject lv_inputs_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:493:2: ( ( ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )* ) )
            // InternalGoatComponentsParser.g:494:2: ( ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )* )
            {
            // InternalGoatComponentsParser.g:494:2: ( ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )* )
            // InternalGoatComponentsParser.g:495:3: ( (lv_inputs_0_0= ruleInputProcess ) ) (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )*
            {
            // InternalGoatComponentsParser.g:495:3: ( (lv_inputs_0_0= ruleInputProcess ) )
            // InternalGoatComponentsParser.g:496:4: (lv_inputs_0_0= ruleInputProcess )
            {
            // InternalGoatComponentsParser.g:496:4: (lv_inputs_0_0= ruleInputProcess )
            // InternalGoatComponentsParser.g:497:5: lv_inputs_0_0= ruleInputProcess
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

            // InternalGoatComponentsParser.g:514:3: (otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==PlusSign) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:515:4: otherlv_1= PlusSign ( (lv_preconds_2_0= rulePreconditions ) ) ( (lv_inputs_3_0= ruleInputProcess ) )
            	    {
            	    otherlv_1=(Token)match(input,PlusSign,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInputProcessesPartAccess().getPlusSignKeyword_1_0());
            	    			
            	    // InternalGoatComponentsParser.g:519:4: ( (lv_preconds_2_0= rulePreconditions ) )
            	    // InternalGoatComponentsParser.g:520:5: (lv_preconds_2_0= rulePreconditions )
            	    {
            	    // InternalGoatComponentsParser.g:520:5: (lv_preconds_2_0= rulePreconditions )
            	    // InternalGoatComponentsParser.g:521:6: lv_preconds_2_0= rulePreconditions
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

            	    // InternalGoatComponentsParser.g:538:4: ( (lv_inputs_3_0= ruleInputProcess ) )
            	    // InternalGoatComponentsParser.g:539:5: (lv_inputs_3_0= ruleInputProcess )
            	    {
            	    // InternalGoatComponentsParser.g:539:5: (lv_inputs_3_0= ruleInputProcess )
            	    // InternalGoatComponentsParser.g:540:6: lv_inputs_3_0= ruleInputProcess
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
    // InternalGoatComponentsParser.g:562:1: entryRuleInputProcess returns [EObject current=null] : iv_ruleInputProcess= ruleInputProcess EOF ;
    public final EObject entryRuleInputProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputProcess = null;


        try {
            // InternalGoatComponentsParser.g:562:53: (iv_ruleInputProcess= ruleInputProcess EOF )
            // InternalGoatComponentsParser.g:563:2: iv_ruleInputProcess= ruleInputProcess EOF
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
    // InternalGoatComponentsParser.g:569:1: ruleInputProcess returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_rec_pred_2_0= rulePredicate ) ) otherlv_3= RightCurlyBracket otherlv_4= LeftParenthesis ( ( (lv_msgInParts_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_msgInParts_7_0= ruleAttribute ) ) )* )? otherlv_8= RightParenthesis ( (lv_output_9_0= RULE_STRING ) )? otherlv_10= FullStop ( (lv_next_11_0= ruleNZCProcess ) ) ) ;
    public final EObject ruleInputProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_output_9_0=null;
        Token otherlv_10=null;
        EObject lv_rec_pred_2_0 = null;

        EObject lv_msgInParts_5_0 = null;

        EObject lv_msgInParts_7_0 = null;

        EObject lv_next_11_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:575:2: ( ( () otherlv_1= LeftCurlyBracket ( (lv_rec_pred_2_0= rulePredicate ) ) otherlv_3= RightCurlyBracket otherlv_4= LeftParenthesis ( ( (lv_msgInParts_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_msgInParts_7_0= ruleAttribute ) ) )* )? otherlv_8= RightParenthesis ( (lv_output_9_0= RULE_STRING ) )? otherlv_10= FullStop ( (lv_next_11_0= ruleNZCProcess ) ) ) )
            // InternalGoatComponentsParser.g:576:2: ( () otherlv_1= LeftCurlyBracket ( (lv_rec_pred_2_0= rulePredicate ) ) otherlv_3= RightCurlyBracket otherlv_4= LeftParenthesis ( ( (lv_msgInParts_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_msgInParts_7_0= ruleAttribute ) ) )* )? otherlv_8= RightParenthesis ( (lv_output_9_0= RULE_STRING ) )? otherlv_10= FullStop ( (lv_next_11_0= ruleNZCProcess ) ) )
            {
            // InternalGoatComponentsParser.g:576:2: ( () otherlv_1= LeftCurlyBracket ( (lv_rec_pred_2_0= rulePredicate ) ) otherlv_3= RightCurlyBracket otherlv_4= LeftParenthesis ( ( (lv_msgInParts_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_msgInParts_7_0= ruleAttribute ) ) )* )? otherlv_8= RightParenthesis ( (lv_output_9_0= RULE_STRING ) )? otherlv_10= FullStop ( (lv_next_11_0= ruleNZCProcess ) ) )
            // InternalGoatComponentsParser.g:577:3: () otherlv_1= LeftCurlyBracket ( (lv_rec_pred_2_0= rulePredicate ) ) otherlv_3= RightCurlyBracket otherlv_4= LeftParenthesis ( ( (lv_msgInParts_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_msgInParts_7_0= ruleAttribute ) ) )* )? otherlv_8= RightParenthesis ( (lv_output_9_0= RULE_STRING ) )? otherlv_10= FullStop ( (lv_next_11_0= ruleNZCProcess ) )
            {
            // InternalGoatComponentsParser.g:577:3: ()
            // InternalGoatComponentsParser.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputProcessAccess().getInputProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInputProcessAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:588:3: ( (lv_rec_pred_2_0= rulePredicate ) )
            // InternalGoatComponentsParser.g:589:4: (lv_rec_pred_2_0= rulePredicate )
            {
            // InternalGoatComponentsParser.g:589:4: (lv_rec_pred_2_0= rulePredicate )
            // InternalGoatComponentsParser.g:590:5: lv_rec_pred_2_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getInputProcessAccess().getRec_predPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_rec_pred_2_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputProcessRule());
            					}
            					set(
            						current,
            						"rec_pred",
            						lv_rec_pred_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getInputProcessAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getInputProcessAccess().getLeftParenthesisKeyword_4());
            		
            // InternalGoatComponentsParser.g:615:3: ( ( (lv_msgInParts_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_msgInParts_7_0= ruleAttribute ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==This||LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoatComponentsParser.g:616:4: ( (lv_msgInParts_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_msgInParts_7_0= ruleAttribute ) ) )*
                    {
                    // InternalGoatComponentsParser.g:616:4: ( (lv_msgInParts_5_0= ruleAttribute ) )
                    // InternalGoatComponentsParser.g:617:5: (lv_msgInParts_5_0= ruleAttribute )
                    {
                    // InternalGoatComponentsParser.g:617:5: (lv_msgInParts_5_0= ruleAttribute )
                    // InternalGoatComponentsParser.g:618:6: lv_msgInParts_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getInputProcessAccess().getMsgInPartsAttributeParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_msgInParts_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputProcessRule());
                    						}
                    						add(
                    							current,
                    							"msgInParts",
                    							lv_msgInParts_5_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:635:4: (otherlv_6= Comma ( (lv_msgInParts_7_0= ruleAttribute ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:636:5: otherlv_6= Comma ( (lv_msgInParts_7_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_15); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getInputProcessAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:640:5: ( (lv_msgInParts_7_0= ruleAttribute ) )
                    	    // InternalGoatComponentsParser.g:641:6: (lv_msgInParts_7_0= ruleAttribute )
                    	    {
                    	    // InternalGoatComponentsParser.g:641:6: (lv_msgInParts_7_0= ruleAttribute )
                    	    // InternalGoatComponentsParser.g:642:7: lv_msgInParts_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getInputProcessAccess().getMsgInPartsAttributeParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_msgInParts_7_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInputProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"msgInParts",
                    	    								lv_msgInParts_7_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.Attribute");
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

            otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getInputProcessAccess().getRightParenthesisKeyword_6());
            		
            // InternalGoatComponentsParser.g:665:3: ( (lv_output_9_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGoatComponentsParser.g:666:4: (lv_output_9_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:666:4: (lv_output_9_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:667:5: lv_output_9_0= RULE_STRING
                    {
                    lv_output_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    					newLeafNode(lv_output_9_0, grammarAccess.getInputProcessAccess().getOutputSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputProcessRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"output",
                    						lv_output_9_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,FullStop,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getInputProcessAccess().getFullStopKeyword_8());
            		
            // InternalGoatComponentsParser.g:687:3: ( (lv_next_11_0= ruleNZCProcess ) )
            // InternalGoatComponentsParser.g:688:4: (lv_next_11_0= ruleNZCProcess )
            {
            // InternalGoatComponentsParser.g:688:4: (lv_next_11_0= ruleNZCProcess )
            // InternalGoatComponentsParser.g:689:5: lv_next_11_0= ruleNZCProcess
            {

            					newCompositeNode(grammarAccess.getInputProcessAccess().getNextNZCProcessParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_next_11_0=ruleNZCProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputProcessRule());
            					}
            					set(
            						current,
            						"next",
            						lv_next_11_0,
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
    // InternalGoatComponentsParser.g:711:1: ruleOutputProcessPart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= LeftParenthesis ( ( (lv_msgOutParts_1_0= ruleValue ) ) (otherlv_2= Comma ( (lv_msgOutParts_3_0= ruleValue ) ) )* )? otherlv_4= RightParenthesis otherlv_5= CommercialAt ( (lv_send_pred_6_0= rulePredicate ) ) ( (lv_output_7_0= RULE_STRING ) )? (otherlv_8= Sleep otherlv_9= LeftParenthesis ( (lv_msec_10_0= RULE_INT ) ) otherlv_11= RightParenthesis )? otherlv_12= FullStop ( (lv_next_13_0= ruleNZCProcess ) ) ) ;
    public final EObject ruleOutputProcessPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_output_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_msec_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_msgOutParts_1_0 = null;

        EObject lv_msgOutParts_3_0 = null;

        EObject lv_send_pred_6_0 = null;

        EObject lv_next_13_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:717:2: ( (otherlv_0= LeftParenthesis ( ( (lv_msgOutParts_1_0= ruleValue ) ) (otherlv_2= Comma ( (lv_msgOutParts_3_0= ruleValue ) ) )* )? otherlv_4= RightParenthesis otherlv_5= CommercialAt ( (lv_send_pred_6_0= rulePredicate ) ) ( (lv_output_7_0= RULE_STRING ) )? (otherlv_8= Sleep otherlv_9= LeftParenthesis ( (lv_msec_10_0= RULE_INT ) ) otherlv_11= RightParenthesis )? otherlv_12= FullStop ( (lv_next_13_0= ruleNZCProcess ) ) ) )
            // InternalGoatComponentsParser.g:718:2: (otherlv_0= LeftParenthesis ( ( (lv_msgOutParts_1_0= ruleValue ) ) (otherlv_2= Comma ( (lv_msgOutParts_3_0= ruleValue ) ) )* )? otherlv_4= RightParenthesis otherlv_5= CommercialAt ( (lv_send_pred_6_0= rulePredicate ) ) ( (lv_output_7_0= RULE_STRING ) )? (otherlv_8= Sleep otherlv_9= LeftParenthesis ( (lv_msec_10_0= RULE_INT ) ) otherlv_11= RightParenthesis )? otherlv_12= FullStop ( (lv_next_13_0= ruleNZCProcess ) ) )
            {
            // InternalGoatComponentsParser.g:718:2: (otherlv_0= LeftParenthesis ( ( (lv_msgOutParts_1_0= ruleValue ) ) (otherlv_2= Comma ( (lv_msgOutParts_3_0= ruleValue ) ) )* )? otherlv_4= RightParenthesis otherlv_5= CommercialAt ( (lv_send_pred_6_0= rulePredicate ) ) ( (lv_output_7_0= RULE_STRING ) )? (otherlv_8= Sleep otherlv_9= LeftParenthesis ( (lv_msec_10_0= RULE_INT ) ) otherlv_11= RightParenthesis )? otherlv_12= FullStop ( (lv_next_13_0= ruleNZCProcess ) ) )
            // InternalGoatComponentsParser.g:719:3: otherlv_0= LeftParenthesis ( ( (lv_msgOutParts_1_0= ruleValue ) ) (otherlv_2= Comma ( (lv_msgOutParts_3_0= ruleValue ) ) )* )? otherlv_4= RightParenthesis otherlv_5= CommercialAt ( (lv_send_pred_6_0= rulePredicate ) ) ( (lv_output_7_0= RULE_STRING ) )? (otherlv_8= Sleep otherlv_9= LeftParenthesis ( (lv_msec_10_0= RULE_INT ) ) otherlv_11= RightParenthesis )? otherlv_12= FullStop ( (lv_next_13_0= ruleNZCProcess ) )
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGoatComponentsParser.g:723:3: ( ( (lv_msgOutParts_1_0= ruleValue ) ) (otherlv_2= Comma ( (lv_msgOutParts_3_0= ruleValue ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==This||LA14_0==RULE_ID||LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGoatComponentsParser.g:724:4: ( (lv_msgOutParts_1_0= ruleValue ) ) (otherlv_2= Comma ( (lv_msgOutParts_3_0= ruleValue ) ) )*
                    {
                    // InternalGoatComponentsParser.g:724:4: ( (lv_msgOutParts_1_0= ruleValue ) )
                    // InternalGoatComponentsParser.g:725:5: (lv_msgOutParts_1_0= ruleValue )
                    {
                    // InternalGoatComponentsParser.g:725:5: (lv_msgOutParts_1_0= ruleValue )
                    // InternalGoatComponentsParser.g:726:6: lv_msgOutParts_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_msgOutParts_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputProcessPartRule());
                    						}
                    						add(
                    							current,
                    							"msgOutParts",
                    							lv_msgOutParts_1_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:743:4: (otherlv_2= Comma ( (lv_msgOutParts_3_0= ruleValue ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:744:5: otherlv_2= Comma ( (lv_msgOutParts_3_0= ruleValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_20); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getOutputProcessPartAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:748:5: ( (lv_msgOutParts_3_0= ruleValue ) )
                    	    // InternalGoatComponentsParser.g:749:6: (lv_msgOutParts_3_0= ruleValue )
                    	    {
                    	    // InternalGoatComponentsParser.g:749:6: (lv_msgOutParts_3_0= ruleValue )
                    	    // InternalGoatComponentsParser.g:750:7: lv_msgOutParts_3_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_msgOutParts_3_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOutputProcessPartRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"msgOutParts",
                    	    								lv_msgOutParts_3_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
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

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_2());
            		
            otherlv_5=(Token)match(input,CommercialAt,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getOutputProcessPartAccess().getCommercialAtKeyword_3());
            		
            // InternalGoatComponentsParser.g:777:3: ( (lv_send_pred_6_0= rulePredicate ) )
            // InternalGoatComponentsParser.g:778:4: (lv_send_pred_6_0= rulePredicate )
            {
            // InternalGoatComponentsParser.g:778:4: (lv_send_pred_6_0= rulePredicate )
            // InternalGoatComponentsParser.g:779:5: lv_send_pred_6_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getOutputProcessPartAccess().getSend_predPredicateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_send_pred_6_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputProcessPartRule());
            					}
            					set(
            						current,
            						"send_pred",
            						lv_send_pred_6_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:796:3: ( (lv_output_7_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGoatComponentsParser.g:797:4: (lv_output_7_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:797:4: (lv_output_7_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:798:5: lv_output_7_0= RULE_STRING
                    {
                    lv_output_7_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    					newLeafNode(lv_output_7_0, grammarAccess.getOutputProcessPartAccess().getOutputSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputProcessPartRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"output",
                    						lv_output_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalGoatComponentsParser.g:814:3: (otherlv_8= Sleep otherlv_9= LeftParenthesis ( (lv_msec_10_0= RULE_INT ) ) otherlv_11= RightParenthesis )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Sleep) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGoatComponentsParser.g:815:4: otherlv_8= Sleep otherlv_9= LeftParenthesis ( (lv_msec_10_0= RULE_INT ) ) otherlv_11= RightParenthesis
                    {
                    otherlv_8=(Token)match(input,Sleep,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getOutputProcessPartAccess().getSleepKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,LeftParenthesis,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalGoatComponentsParser.g:823:4: ( (lv_msec_10_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:824:5: (lv_msec_10_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:824:5: (lv_msec_10_0= RULE_INT )
                    // InternalGoatComponentsParser.g:825:6: lv_msec_10_0= RULE_INT
                    {
                    lv_msec_10_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_msec_10_0, grammarAccess.getOutputProcessPartAccess().getMsecINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputProcessPartRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"msec",
                    							lv_msec_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,RightParenthesis,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,FullStop,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getOutputProcessPartAccess().getFullStopKeyword_7());
            		
            // InternalGoatComponentsParser.g:850:3: ( (lv_next_13_0= ruleNZCProcess ) )
            // InternalGoatComponentsParser.g:851:4: (lv_next_13_0= ruleNZCProcess )
            {
            // InternalGoatComponentsParser.g:851:4: (lv_next_13_0= ruleNZCProcess )
            // InternalGoatComponentsParser.g:852:5: lv_next_13_0= ruleNZCProcess
            {

            					newCompositeNode(grammarAccess.getOutputProcessPartAccess().getNextNZCProcessParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_next_13_0=ruleNZCProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputProcessPartRule());
            					}
            					set(
            						current,
            						"next",
            						lv_next_13_0,
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
    // $ANTLR end "ruleOutputProcessPart"


    // $ANTLR start "entryRuleIfProcesses"
    // InternalGoatComponentsParser.g:873:1: entryRuleIfProcesses returns [EObject current=null] : iv_ruleIfProcesses= ruleIfProcesses EOF ;
    public final EObject entryRuleIfProcesses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfProcesses = null;


        try {
            // InternalGoatComponentsParser.g:873:52: (iv_ruleIfProcesses= ruleIfProcesses EOF )
            // InternalGoatComponentsParser.g:874:2: iv_ruleIfProcesses= ruleIfProcesses EOF
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
    // InternalGoatComponentsParser.g:880:1: ruleIfProcesses returns [EObject current=null] : ( () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )* ) ;
    public final EObject ruleIfProcesses() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_branches_1_0 = null;

        EObject lv_branches_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:886:2: ( ( () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )* ) )
            // InternalGoatComponentsParser.g:887:2: ( () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )* )
            {
            // InternalGoatComponentsParser.g:887:2: ( () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )* )
            // InternalGoatComponentsParser.g:888:3: () ( (lv_branches_1_0= ruleIfBranchProcess ) ) (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )*
            {
            // InternalGoatComponentsParser.g:888:3: ()
            // InternalGoatComponentsParser.g:889:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfProcessesAccess().getIfProcessesAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:895:3: ( (lv_branches_1_0= ruleIfBranchProcess ) )
            // InternalGoatComponentsParser.g:896:4: (lv_branches_1_0= ruleIfBranchProcess )
            {
            // InternalGoatComponentsParser.g:896:4: (lv_branches_1_0= ruleIfBranchProcess )
            // InternalGoatComponentsParser.g:897:5: lv_branches_1_0= ruleIfBranchProcess
            {

            					newCompositeNode(grammarAccess.getIfProcessesAccess().getBranchesIfBranchProcessParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalGoatComponentsParser.g:914:3: (otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Else) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:915:4: otherlv_2= Else ( (lv_branches_3_0= ruleIfBranchProcess ) )
            	    {
            	    otherlv_2=(Token)match(input,Else,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIfProcessesAccess().getElseKeyword_2_0());
            	    			
            	    // InternalGoatComponentsParser.g:919:4: ( (lv_branches_3_0= ruleIfBranchProcess ) )
            	    // InternalGoatComponentsParser.g:920:5: (lv_branches_3_0= ruleIfBranchProcess )
            	    {
            	    // InternalGoatComponentsParser.g:920:5: (lv_branches_3_0= ruleIfBranchProcess )
            	    // InternalGoatComponentsParser.g:921:6: lv_branches_3_0= ruleIfBranchProcess
            	    {

            	    						newCompositeNode(grammarAccess.getIfProcessesAccess().getBranchesIfBranchProcessParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // InternalGoatComponentsParser.g:943:1: entryRuleIfBranchProcess returns [EObject current=null] : iv_ruleIfBranchProcess= ruleIfBranchProcess EOF ;
    public final EObject entryRuleIfBranchProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBranchProcess = null;


        try {
            // InternalGoatComponentsParser.g:943:56: (iv_ruleIfBranchProcess= ruleIfBranchProcess EOF )
            // InternalGoatComponentsParser.g:944:2: iv_ruleIfBranchProcess= ruleIfBranchProcess EOF
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
    // InternalGoatComponentsParser.g:950:1: ruleIfBranchProcess returns [EObject current=null] : ( () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleIfBranchProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cond_2_0 = null;

        EObject lv_then_4_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:956:2: ( ( () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:957:2: ( () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:957:2: ( () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket )
            // InternalGoatComponentsParser.g:958:3: () otherlv_1= If ( (lv_cond_2_0= rulePreconditions ) ) otherlv_3= LeftCurlyBracket ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) ) otherlv_5= RightCurlyBracket
            {
            // InternalGoatComponentsParser.g:958:3: ()
            // InternalGoatComponentsParser.g:959:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfBranchProcessAccess().getIfBranchProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIfBranchProcessAccess().getIfKeyword_1());
            		
            // InternalGoatComponentsParser.g:969:3: ( (lv_cond_2_0= rulePreconditions ) )
            // InternalGoatComponentsParser.g:970:4: (lv_cond_2_0= rulePreconditions )
            {
            // InternalGoatComponentsParser.g:970:4: (lv_cond_2_0= rulePreconditions )
            // InternalGoatComponentsParser.g:971:5: lv_cond_2_0= rulePreconditions
            {

            					newCompositeNode(grammarAccess.getIfBranchProcessAccess().getCondPreconditionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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
            		
            // InternalGoatComponentsParser.g:992:3: ( (lv_then_4_0= rulePredOutputProcessOrInputProcess ) )
            // InternalGoatComponentsParser.g:993:4: (lv_then_4_0= rulePredOutputProcessOrInputProcess )
            {
            // InternalGoatComponentsParser.g:993:4: (lv_then_4_0= rulePredOutputProcessOrInputProcess )
            // InternalGoatComponentsParser.g:994:5: lv_then_4_0= rulePredOutputProcessOrInputProcess
            {

            					newCompositeNode(grammarAccess.getIfBranchProcessAccess().getThenPredOutputProcessOrInputProcessParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalGoatComponentsParser.g:1019:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalGoatComponentsParser.g:1019:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalGoatComponentsParser.g:1020:2: iv_ruleUpdate= ruleUpdate EOF
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
    // InternalGoatComponentsParser.g:1026:1: ruleUpdate returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttribute ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttribute ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleValue ) ) )* otherlv_8= RightSquareBracket ) ;
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
            // InternalGoatComponentsParser.g:1032:2: ( (otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttribute ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttribute ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleValue ) ) )* otherlv_8= RightSquareBracket ) )
            // InternalGoatComponentsParser.g:1033:2: (otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttribute ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttribute ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleValue ) ) )* otherlv_8= RightSquareBracket )
            {
            // InternalGoatComponentsParser.g:1033:2: (otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttribute ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttribute ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleValue ) ) )* otherlv_8= RightSquareBracket )
            // InternalGoatComponentsParser.g:1034:3: otherlv_0= LeftSquareBracket ( (lv_vars_1_0= ruleAttribute ) ) otherlv_2= ColonEqualsSign ( (lv_vals_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_vars_5_0= ruleAttribute ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleValue ) ) )* otherlv_8= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:1038:3: ( (lv_vars_1_0= ruleAttribute ) )
            // InternalGoatComponentsParser.g:1039:4: (lv_vars_1_0= ruleAttribute )
            {
            // InternalGoatComponentsParser.g:1039:4: (lv_vars_1_0= ruleAttribute )
            // InternalGoatComponentsParser.g:1040:5: lv_vars_1_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getVarsAttributeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_vars_1_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,ColonEqualsSign,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_2());
            		
            // InternalGoatComponentsParser.g:1061:3: ( (lv_vals_3_0= ruleValue ) )
            // InternalGoatComponentsParser.g:1062:4: (lv_vals_3_0= ruleValue )
            {
            // InternalGoatComponentsParser.g:1062:4: (lv_vals_3_0= ruleValue )
            // InternalGoatComponentsParser.g:1063:5: lv_vals_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getValsValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_vals_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"vals",
            						lv_vals_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:1080:3: (otherlv_4= Comma ( (lv_vars_5_0= ruleAttribute ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleValue ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1081:4: otherlv_4= Comma ( (lv_vars_5_0= ruleAttribute ) ) otherlv_6= ColonEqualsSign ( (lv_vals_7_0= ruleValue ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalGoatComponentsParser.g:1085:4: ( (lv_vars_5_0= ruleAttribute ) )
            	    // InternalGoatComponentsParser.g:1086:5: (lv_vars_5_0= ruleAttribute )
            	    {
            	    // InternalGoatComponentsParser.g:1086:5: (lv_vars_5_0= ruleAttribute )
            	    // InternalGoatComponentsParser.g:1087:6: lv_vars_5_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateAccess().getVarsAttributeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_vars_5_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_5_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,ColonEqualsSign,FOLLOW_20); 

            	    				newLeafNode(otherlv_6, grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_4_2());
            	    			
            	    // InternalGoatComponentsParser.g:1108:4: ( (lv_vals_7_0= ruleValue ) )
            	    // InternalGoatComponentsParser.g:1109:5: (lv_vals_7_0= ruleValue )
            	    {
            	    // InternalGoatComponentsParser.g:1109:5: (lv_vals_7_0= ruleValue )
            	    // InternalGoatComponentsParser.g:1110:6: lv_vals_7_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateAccess().getValsValueParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_vals_7_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vals",
            	    							lv_vals_7_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
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
    // InternalGoatComponentsParser.g:1136:1: entryRuleAwareness returns [EObject current=null] : iv_ruleAwareness= ruleAwareness EOF ;
    public final EObject entryRuleAwareness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwareness = null;


        try {
            // InternalGoatComponentsParser.g:1136:50: (iv_ruleAwareness= ruleAwareness EOF )
            // InternalGoatComponentsParser.g:1137:2: iv_ruleAwareness= ruleAwareness EOF
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
    // InternalGoatComponentsParser.g:1143:1: ruleAwareness returns [EObject current=null] : (otherlv_0= LessThanSign ( (lv_pred_1_0= rulePredicate ) ) otherlv_2= GreaterThanSign ) ;
    public final EObject ruleAwareness() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_pred_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1149:2: ( (otherlv_0= LessThanSign ( (lv_pred_1_0= rulePredicate ) ) otherlv_2= GreaterThanSign ) )
            // InternalGoatComponentsParser.g:1150:2: (otherlv_0= LessThanSign ( (lv_pred_1_0= rulePredicate ) ) otherlv_2= GreaterThanSign )
            {
            // InternalGoatComponentsParser.g:1150:2: (otherlv_0= LessThanSign ( (lv_pred_1_0= rulePredicate ) ) otherlv_2= GreaterThanSign )
            // InternalGoatComponentsParser.g:1151:3: otherlv_0= LessThanSign ( (lv_pred_1_0= rulePredicate ) ) otherlv_2= GreaterThanSign
            {
            otherlv_0=(Token)match(input,LessThanSign,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAwarenessAccess().getLessThanSignKeyword_0());
            		
            // InternalGoatComponentsParser.g:1155:3: ( (lv_pred_1_0= rulePredicate ) )
            // InternalGoatComponentsParser.g:1156:4: (lv_pred_1_0= rulePredicate )
            {
            // InternalGoatComponentsParser.g:1156:4: (lv_pred_1_0= rulePredicate )
            // InternalGoatComponentsParser.g:1157:5: lv_pred_1_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getAwarenessAccess().getPredPredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_pred_1_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAwarenessRule());
            					}
            					set(
            						current,
            						"pred",
            						lv_pred_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,GreaterThanSign,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAwarenessAccess().getGreaterThanSignKeyword_2());
            		

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
    // InternalGoatComponentsParser.g:1182:1: entryRuleNZCProcess returns [EObject current=null] : iv_ruleNZCProcess= ruleNZCProcess EOF ;
    public final EObject entryRuleNZCProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNZCProcess = null;


        try {
            // InternalGoatComponentsParser.g:1182:51: (iv_ruleNZCProcess= ruleNZCProcess EOF )
            // InternalGoatComponentsParser.g:1183:2: iv_ruleNZCProcess= ruleNZCProcess EOF
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
    // InternalGoatComponentsParser.g:1189:1: ruleNZCProcess returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess | this_CallProcess_4= ruleCallProcess ) ;
    public final EObject ruleNZCProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Proc_1 = null;

        EObject this_ZeroProcess_3 = null;

        EObject this_CallProcess_4 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1195:2: ( ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess | this_CallProcess_4= ruleCallProcess ) )
            // InternalGoatComponentsParser.g:1196:2: ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess | this_CallProcess_4= ruleCallProcess )
            {
            // InternalGoatComponentsParser.g:1196:2: ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess | this_CallProcess_4= ruleCallProcess )
            int alt19=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt19=1;
                }
                break;
            case DigitZero:
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
                    // InternalGoatComponentsParser.g:1197:3: (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:1197:3: (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis )
                    // InternalGoatComponentsParser.g:1198:4: otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_32); 

                    				newLeafNode(otherlv_0, grammarAccess.getNZCProcessAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getNZCProcessAccess().getProcParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_25);
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
                    // InternalGoatComponentsParser.g:1216:3: this_ZeroProcess_3= ruleZeroProcess
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
                    // InternalGoatComponentsParser.g:1225:3: this_CallProcess_4= ruleCallProcess
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
    // InternalGoatComponentsParser.g:1237:1: entryRuleNProcess returns [EObject current=null] : iv_ruleNProcess= ruleNProcess EOF ;
    public final EObject entryRuleNProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNProcess = null;


        try {
            // InternalGoatComponentsParser.g:1237:49: (iv_ruleNProcess= ruleNProcess EOF )
            // InternalGoatComponentsParser.g:1238:2: iv_ruleNProcess= ruleNProcess EOF
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
    // InternalGoatComponentsParser.g:1244:1: ruleNProcess returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess ) ;
    public final EObject ruleNProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Proc_1 = null;

        EObject this_ZeroProcess_3 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1250:2: ( ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess ) )
            // InternalGoatComponentsParser.g:1251:2: ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess )
            {
            // InternalGoatComponentsParser.g:1251:2: ( (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis ) | this_ZeroProcess_3= ruleZeroProcess )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftParenthesis) ) {
                alt20=1;
            }
            else if ( (LA20_0==DigitZero) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGoatComponentsParser.g:1252:3: (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:1252:3: (otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis )
                    // InternalGoatComponentsParser.g:1253:4: otherlv_0= LeftParenthesis this_Proc_1= ruleProc otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_32); 

                    				newLeafNode(otherlv_0, grammarAccess.getNProcessAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getNProcessAccess().getProcParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_25);
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
                    // InternalGoatComponentsParser.g:1271:3: this_ZeroProcess_3= ruleZeroProcess
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
    // InternalGoatComponentsParser.g:1283:1: entryRuleCallProcess returns [EObject current=null] : iv_ruleCallProcess= ruleCallProcess EOF ;
    public final EObject entryRuleCallProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcess = null;


        try {
            // InternalGoatComponentsParser.g:1283:52: (iv_ruleCallProcess= ruleCallProcess EOF )
            // InternalGoatComponentsParser.g:1284:2: iv_ruleCallProcess= ruleCallProcess EOF
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
    // InternalGoatComponentsParser.g:1290:1: ruleCallProcess returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject ruleCallProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1296:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalGoatComponentsParser.g:1297:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalGoatComponentsParser.g:1297:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalGoatComponentsParser.g:1298:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalGoatComponentsParser.g:1298:3: ()
            // InternalGoatComponentsParser.g:1299:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCallProcessAccess().getCallProcessAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:1305:3: ( (otherlv_1= RULE_ID ) )
            // InternalGoatComponentsParser.g:1306:4: (otherlv_1= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1306:4: (otherlv_1= RULE_ID )
            // InternalGoatComponentsParser.g:1307:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcessRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getCallProcessAccess().getProcnameProcessDefinitionCrossReference_1_0());
            				

            }


            }

            // InternalGoatComponentsParser.g:1318:3: (otherlv_2= LeftSquareBracket ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= RightSquareBracket )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftSquareBracket) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGoatComponentsParser.g:1319:4: otherlv_2= LeftSquareBracket ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getCallProcessAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalGoatComponentsParser.g:1323:4: ( (lv_params_3_0= ruleValue ) )
                    // InternalGoatComponentsParser.g:1324:5: (lv_params_3_0= ruleValue )
                    {
                    // InternalGoatComponentsParser.g:1324:5: (lv_params_3_0= ruleValue )
                    // InternalGoatComponentsParser.g:1325:6: lv_params_3_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getCallProcessAccess().getParamsValueParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_params_3_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCallProcessRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:1342:4: (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==Comma) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:1343:5: otherlv_4= Comma ( (lv_params_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_20); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCallProcessAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:1347:5: ( (lv_params_5_0= ruleValue ) )
                    	    // InternalGoatComponentsParser.g:1348:6: (lv_params_5_0= ruleValue )
                    	    {
                    	    // InternalGoatComponentsParser.g:1348:6: (lv_params_5_0= ruleValue )
                    	    // InternalGoatComponentsParser.g:1349:7: lv_params_5_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getCallProcessAccess().getParamsValueParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_params_5_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCallProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_5_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getCallProcessAccess().getRightSquareBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleCallProcess"


    // $ANTLR start "entryRuleZeroProcess"
    // InternalGoatComponentsParser.g:1376:1: entryRuleZeroProcess returns [EObject current=null] : iv_ruleZeroProcess= ruleZeroProcess EOF ;
    public final EObject entryRuleZeroProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZeroProcess = null;


        try {
            // InternalGoatComponentsParser.g:1376:52: (iv_ruleZeroProcess= ruleZeroProcess EOF )
            // InternalGoatComponentsParser.g:1377:2: iv_ruleZeroProcess= ruleZeroProcess EOF
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
    // InternalGoatComponentsParser.g:1383:1: ruleZeroProcess returns [EObject current=null] : ( () otherlv_1= DigitZero ) ;
    public final EObject ruleZeroProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1389:2: ( ( () otherlv_1= DigitZero ) )
            // InternalGoatComponentsParser.g:1390:2: ( () otherlv_1= DigitZero )
            {
            // InternalGoatComponentsParser.g:1390:2: ( () otherlv_1= DigitZero )
            // InternalGoatComponentsParser.g:1391:3: () otherlv_1= DigitZero
            {
            // InternalGoatComponentsParser.g:1391:3: ()
            // InternalGoatComponentsParser.g:1392:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getZeroProcessAccess().getZeroProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,DigitZero,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getZeroProcessAccess().getDigitZeroKeyword_1());
            		

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
    // InternalGoatComponentsParser.g:1406:1: entryRuleProcessDefinition returns [EObject current=null] : iv_ruleProcessDefinition= ruleProcessDefinition EOF ;
    public final EObject entryRuleProcessDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessDefinition = null;


        try {
            // InternalGoatComponentsParser.g:1406:58: (iv_ruleProcessDefinition= ruleProcessDefinition EOF )
            // InternalGoatComponentsParser.g:1407:2: iv_ruleProcessDefinition= ruleProcessDefinition EOF
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
    // InternalGoatComponentsParser.g:1413:1: ruleProcessDefinition returns [EObject current=null] : (otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= Comma ( (lv_params_5_0= RULE_ID ) ) )* otherlv_6= RightSquareBracket )? otherlv_7= EqualsSign ( (lv_proc_8_0= ruleProc ) ) ) ;
    public final EObject ruleProcessDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_params_3_0=null;
        Token otherlv_4=null;
        Token lv_params_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_proc_8_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1419:2: ( (otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= Comma ( (lv_params_5_0= RULE_ID ) ) )* otherlv_6= RightSquareBracket )? otherlv_7= EqualsSign ( (lv_proc_8_0= ruleProc ) ) ) )
            // InternalGoatComponentsParser.g:1420:2: (otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= Comma ( (lv_params_5_0= RULE_ID ) ) )* otherlv_6= RightSquareBracket )? otherlv_7= EqualsSign ( (lv_proc_8_0= ruleProc ) ) )
            {
            // InternalGoatComponentsParser.g:1420:2: (otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= Comma ( (lv_params_5_0= RULE_ID ) ) )* otherlv_6= RightSquareBracket )? otherlv_7= EqualsSign ( (lv_proc_8_0= ruleProc ) ) )
            // InternalGoatComponentsParser.g:1421:3: otherlv_0= Proc ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= Comma ( (lv_params_5_0= RULE_ID ) ) )* otherlv_6= RightSquareBracket )? otherlv_7= EqualsSign ( (lv_proc_8_0= ruleProc ) )
            {
            otherlv_0=(Token)match(input,Proc,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessDefinitionAccess().getProcKeyword_0());
            		
            // InternalGoatComponentsParser.g:1425:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:1426:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1426:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:1427:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            // InternalGoatComponentsParser.g:1443:3: (otherlv_2= LeftSquareBracket ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= Comma ( (lv_params_5_0= RULE_ID ) ) )* otherlv_6= RightSquareBracket )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftSquareBracket) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGoatComponentsParser.g:1444:4: otherlv_2= LeftSquareBracket ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= Comma ( (lv_params_5_0= RULE_ID ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProcessDefinitionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalGoatComponentsParser.g:1448:4: ( (lv_params_3_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:1449:5: (lv_params_3_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:1449:5: (lv_params_3_0= RULE_ID )
                    // InternalGoatComponentsParser.g:1450:6: lv_params_3_0= RULE_ID
                    {
                    lv_params_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(lv_params_3_0, grammarAccess.getProcessDefinitionAccess().getParamsIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcessDefinitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:1466:4: (otherlv_4= Comma ( (lv_params_5_0= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==Comma) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:1467:5: otherlv_4= Comma ( (lv_params_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getProcessDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:1471:5: ( (lv_params_5_0= RULE_ID ) )
                    	    // InternalGoatComponentsParser.g:1472:6: (lv_params_5_0= RULE_ID )
                    	    {
                    	    // InternalGoatComponentsParser.g:1472:6: (lv_params_5_0= RULE_ID )
                    	    // InternalGoatComponentsParser.g:1473:7: lv_params_5_0= RULE_ID
                    	    {
                    	    lv_params_5_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    	    							newLeafNode(lv_params_5_0, grammarAccess.getProcessDefinitionAccess().getParamsIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProcessDefinitionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"params",
                    	    								lv_params_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getProcessDefinitionAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,EqualsSign,FOLLOW_32); 

            			newLeafNode(otherlv_7, grammarAccess.getProcessDefinitionAccess().getEqualsSignKeyword_3());
            		
            // InternalGoatComponentsParser.g:1499:3: ( (lv_proc_8_0= ruleProc ) )
            // InternalGoatComponentsParser.g:1500:4: (lv_proc_8_0= ruleProc )
            {
            // InternalGoatComponentsParser.g:1500:4: (lv_proc_8_0= ruleProc )
            // InternalGoatComponentsParser.g:1501:5: lv_proc_8_0= ruleProc
            {

            					newCompositeNode(grammarAccess.getProcessDefinitionAccess().getProcProcParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_proc_8_0=ruleProc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessDefinitionRule());
            					}
            					set(
            						current,
            						"proc",
            						lv_proc_8_0,
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


    // $ANTLR start "entryRuleEnvironment"
    // InternalGoatComponentsParser.g:1522:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalGoatComponentsParser.g:1522:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalGoatComponentsParser.g:1523:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalGoatComponentsParser.g:1529:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= RULE_STRING ) ) )* )? otherlv_9= RightCurlyBracket ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_attrs_2_0=null;
        Token otherlv_3=null;
        Token lv_vals_4_0=null;
        Token otherlv_5=null;
        Token lv_attrs_6_0=null;
        Token otherlv_7=null;
        Token lv_vals_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1535:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= RULE_STRING ) ) )* )? otherlv_9= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:1536:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= RULE_STRING ) ) )* )? otherlv_9= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:1536:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= RULE_STRING ) ) )* )? otherlv_9= RightCurlyBracket )
            // InternalGoatComponentsParser.g:1537:3: () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= RULE_STRING ) ) )* )? otherlv_9= RightCurlyBracket
            {
            // InternalGoatComponentsParser.g:1537:3: ()
            // InternalGoatComponentsParser.g:1538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:1548:3: ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= RULE_STRING ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGoatComponentsParser.g:1549:4: ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= RULE_STRING ) ) )*
                    {
                    // InternalGoatComponentsParser.g:1549:4: ( (lv_attrs_2_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:1550:5: (lv_attrs_2_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:1550:5: (lv_attrs_2_0= RULE_ID )
                    // InternalGoatComponentsParser.g:1551:6: lv_attrs_2_0= RULE_ID
                    {
                    lv_attrs_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

                    otherlv_3=(Token)match(input,ColonEqualsSign,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_1());
                    			
                    // InternalGoatComponentsParser.g:1571:4: ( (lv_vals_4_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:1572:5: (lv_vals_4_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:1572:5: (lv_vals_4_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:1573:6: lv_vals_4_0= RULE_STRING
                    {
                    lv_vals_4_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

                    						newLeafNode(lv_vals_4_0, grammarAccess.getEnvironmentAccess().getValsSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvironmentRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"vals",
                    							lv_vals_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:1589:4: (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= RULE_STRING ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==Comma) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:1590:5: otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:1594:5: ( (lv_attrs_6_0= RULE_ID ) )
                    	    // InternalGoatComponentsParser.g:1595:6: (lv_attrs_6_0= RULE_ID )
                    	    {
                    	    // InternalGoatComponentsParser.g:1595:6: (lv_attrs_6_0= RULE_ID )
                    	    // InternalGoatComponentsParser.g:1596:7: lv_attrs_6_0= RULE_ID
                    	    {
                    	    lv_attrs_6_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

                    	    otherlv_7=(Token)match(input,ColonEqualsSign,FOLLOW_37); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_3_2());
                    	    				
                    	    // InternalGoatComponentsParser.g:1616:5: ( (lv_vals_8_0= RULE_STRING ) )
                    	    // InternalGoatComponentsParser.g:1617:6: (lv_vals_8_0= RULE_STRING )
                    	    {
                    	    // InternalGoatComponentsParser.g:1617:6: (lv_vals_8_0= RULE_STRING )
                    	    // InternalGoatComponentsParser.g:1618:7: lv_vals_8_0= RULE_STRING
                    	    {
                    	    lv_vals_8_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

                    	    							newLeafNode(lv_vals_8_0, grammarAccess.getEnvironmentAccess().getValsSTRINGTerminalRuleCall_2_3_3_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"vals",
                    	    								lv_vals_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
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
    // InternalGoatComponentsParser.g:1644:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // InternalGoatComponentsParser.g:1644:60: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // InternalGoatComponentsParser.g:1645:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
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
    // InternalGoatComponentsParser.g:1651:1: ruleComponentDefinition returns [EObject current=null] : (otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= LeftSquareBracket ( (lv_params_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= RightSquareBracket )? otherlv_8= At ( (lv_address_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_params_4_0=null;
        Token otherlv_5=null;
        Token lv_params_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_address_9_0=null;
        EObject lv_env_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1657:2: ( (otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= LeftSquareBracket ( (lv_params_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= RightSquareBracket )? otherlv_8= At ( (lv_address_9_0= RULE_STRING ) ) ) )
            // InternalGoatComponentsParser.g:1658:2: (otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= LeftSquareBracket ( (lv_params_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= RightSquareBracket )? otherlv_8= At ( (lv_address_9_0= RULE_STRING ) ) )
            {
            // InternalGoatComponentsParser.g:1658:2: (otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= LeftSquareBracket ( (lv_params_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= RightSquareBracket )? otherlv_8= At ( (lv_address_9_0= RULE_STRING ) ) )
            // InternalGoatComponentsParser.g:1659:3: otherlv_0= Component ( (lv_env_1_0= ruleEnvironment ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= LeftSquareBracket ( (lv_params_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= RightSquareBracket )? otherlv_8= At ( (lv_address_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Component,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDefinitionAccess().getComponentKeyword_0());
            		
            // InternalGoatComponentsParser.g:1663:3: ( (lv_env_1_0= ruleEnvironment ) )
            // InternalGoatComponentsParser.g:1664:4: (lv_env_1_0= ruleEnvironment )
            {
            // InternalGoatComponentsParser.g:1664:4: (lv_env_1_0= ruleEnvironment )
            // InternalGoatComponentsParser.g:1665:5: lv_env_1_0= ruleEnvironment
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

            // InternalGoatComponentsParser.g:1682:3: ( (otherlv_2= RULE_ID ) )
            // InternalGoatComponentsParser.g:1683:4: (otherlv_2= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1683:4: (otherlv_2= RULE_ID )
            // InternalGoatComponentsParser.g:1684:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getComponentDefinitionAccess().getProcProcessDefinitionCrossReference_2_0());
            				

            }


            }

            // InternalGoatComponentsParser.g:1695:3: (otherlv_3= LeftSquareBracket ( (lv_params_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= RightSquareBracket )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LeftSquareBracket) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGoatComponentsParser.g:1696:4: otherlv_3= LeftSquareBracket ( (lv_params_4_0= RULE_STRING ) ) (otherlv_5= Comma ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= RightSquareBracket
                    {
                    otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentDefinitionAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalGoatComponentsParser.g:1700:4: ( (lv_params_4_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:1701:5: (lv_params_4_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:1701:5: (lv_params_4_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:1702:6: lv_params_4_0= RULE_STRING
                    {
                    lv_params_4_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_params_4_0, grammarAccess.getComponentDefinitionAccess().getParamsSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentDefinitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"params",
                    							lv_params_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:1718:4: (otherlv_5= Comma ( (lv_params_6_0= RULE_STRING ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:1719:5: otherlv_5= Comma ( (lv_params_6_0= RULE_STRING ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_37); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getComponentDefinitionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:1723:5: ( (lv_params_6_0= RULE_STRING ) )
                    	    // InternalGoatComponentsParser.g:1724:6: (lv_params_6_0= RULE_STRING )
                    	    {
                    	    // InternalGoatComponentsParser.g:1724:6: (lv_params_6_0= RULE_STRING )
                    	    // InternalGoatComponentsParser.g:1725:7: lv_params_6_0= RULE_STRING
                    	    {
                    	    lv_params_6_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    	    							newLeafNode(lv_params_6_0, grammarAccess.getComponentDefinitionAccess().getParamsSTRINGTerminalRuleCall_3_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponentDefinitionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"params",
                    	    								lv_params_6_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_40); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentDefinitionAccess().getRightSquareBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,At,FOLLOW_37); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentDefinitionAccess().getAtKeyword_4());
            		
            // InternalGoatComponentsParser.g:1751:3: ( (lv_address_9_0= RULE_STRING ) )
            // InternalGoatComponentsParser.g:1752:4: (lv_address_9_0= RULE_STRING )
            {
            // InternalGoatComponentsParser.g:1752:4: (lv_address_9_0= RULE_STRING )
            // InternalGoatComponentsParser.g:1753:5: lv_address_9_0= RULE_STRING
            {
            lv_address_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_address_9_0, grammarAccess.getComponentDefinitionAccess().getAddressSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"address",
            						lv_address_9_0,
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


    // $ANTLR start "entryRuleAttribute"
    // InternalGoatComponentsParser.g:1773:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalGoatComponentsParser.g:1773:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalGoatComponentsParser.g:1774:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalGoatComponentsParser.g:1780:1: ruleAttribute returns [EObject current=null] : ( ( ( (lv_comp_0_0= This ) ) otherlv_1= FullStop )? ( (lv_ident_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_comp_0_0=null;
        Token otherlv_1=null;
        Token lv_ident_2_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1786:2: ( ( ( ( (lv_comp_0_0= This ) ) otherlv_1= FullStop )? ( (lv_ident_2_0= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:1787:2: ( ( ( (lv_comp_0_0= This ) ) otherlv_1= FullStop )? ( (lv_ident_2_0= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:1787:2: ( ( ( (lv_comp_0_0= This ) ) otherlv_1= FullStop )? ( (lv_ident_2_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:1788:3: ( ( (lv_comp_0_0= This ) ) otherlv_1= FullStop )? ( (lv_ident_2_0= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:1788:3: ( ( (lv_comp_0_0= This ) ) otherlv_1= FullStop )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==This) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGoatComponentsParser.g:1789:4: ( (lv_comp_0_0= This ) ) otherlv_1= FullStop
                    {
                    // InternalGoatComponentsParser.g:1789:4: ( (lv_comp_0_0= This ) )
                    // InternalGoatComponentsParser.g:1790:5: (lv_comp_0_0= This )
                    {
                    // InternalGoatComponentsParser.g:1790:5: (lv_comp_0_0= This )
                    // InternalGoatComponentsParser.g:1791:6: lv_comp_0_0= This
                    {
                    lv_comp_0_0=(Token)match(input,This,FOLLOW_17); 

                    						newLeafNode(lv_comp_0_0, grammarAccess.getAttributeAccess().getCompThisKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(current, "comp", true, "this");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,FullStop,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getFullStopKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalGoatComponentsParser.g:1808:3: ( (lv_ident_2_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:1809:4: (lv_ident_2_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1809:4: (lv_ident_2_0= RULE_ID )
            // InternalGoatComponentsParser.g:1810:5: lv_ident_2_0= RULE_ID
            {
            lv_ident_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_ident_2_0, grammarAccess.getAttributeAccess().getIdentIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ident",
            						lv_ident_2_0,
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRecAttribute"
    // InternalGoatComponentsParser.g:1830:1: entryRuleRecAttribute returns [EObject current=null] : iv_ruleRecAttribute= ruleRecAttribute EOF ;
    public final EObject entryRuleRecAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecAttribute = null;


        try {
            // InternalGoatComponentsParser.g:1830:53: (iv_ruleRecAttribute= ruleRecAttribute EOF )
            // InternalGoatComponentsParser.g:1831:2: iv_ruleRecAttribute= ruleRecAttribute EOF
            {
             newCompositeNode(grammarAccess.getRecAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecAttribute=ruleRecAttribute();

            state._fsp--;

             current =iv_ruleRecAttribute; 
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
    // $ANTLR end "entryRuleRecAttribute"


    // $ANTLR start "ruleRecAttribute"
    // InternalGoatComponentsParser.g:1837:1: ruleRecAttribute returns [EObject current=null] : (otherlv_0= Receiver otherlv_1= FullStop ( (lv_ident_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRecAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ident_2_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1843:2: ( (otherlv_0= Receiver otherlv_1= FullStop ( (lv_ident_2_0= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:1844:2: (otherlv_0= Receiver otherlv_1= FullStop ( (lv_ident_2_0= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:1844:2: (otherlv_0= Receiver otherlv_1= FullStop ( (lv_ident_2_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:1845:3: otherlv_0= Receiver otherlv_1= FullStop ( (lv_ident_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Receiver,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRecAttributeAccess().getReceiverKeyword_0());
            		
            otherlv_1=(Token)match(input,FullStop,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRecAttributeAccess().getFullStopKeyword_1());
            		
            // InternalGoatComponentsParser.g:1853:3: ( (lv_ident_2_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:1854:4: (lv_ident_2_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1854:4: (lv_ident_2_0= RULE_ID )
            // InternalGoatComponentsParser.g:1855:5: lv_ident_2_0= RULE_ID
            {
            lv_ident_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_ident_2_0, grammarAccess.getRecAttributeAccess().getIdentIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ident",
            						lv_ident_2_0,
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
    // $ANTLR end "ruleRecAttribute"


    // $ANTLR start "entryRuleValue"
    // InternalGoatComponentsParser.g:1875:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGoatComponentsParser.g:1875:46: (iv_ruleValue= ruleValue EOF )
            // InternalGoatComponentsParser.g:1876:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGoatComponentsParser.g:1882:1: ruleValue returns [EObject current=null] : (this_AttributeValue_0= ruleAttributeValue | this_ImmediateValue_1= ruleImmediateValue | this_GoStringFunction_2= ruleGoStringFunction ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeValue_0 = null;

        EObject this_ImmediateValue_1 = null;

        EObject this_GoStringFunction_2 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1888:2: ( (this_AttributeValue_0= ruleAttributeValue | this_ImmediateValue_1= ruleImmediateValue | this_GoStringFunction_2= ruleGoStringFunction ) )
            // InternalGoatComponentsParser.g:1889:2: (this_AttributeValue_0= ruleAttributeValue | this_ImmediateValue_1= ruleImmediateValue | this_GoStringFunction_2= ruleGoStringFunction )
            {
            // InternalGoatComponentsParser.g:1889:2: (this_AttributeValue_0= ruleAttributeValue | this_ImmediateValue_1= ruleImmediateValue | this_GoStringFunction_2= ruleGoStringFunction )
            int alt30=3;
            switch ( input.LA(1) ) {
            case This:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==LeftParenthesis) ) {
                    alt30=3;
                }
                else if ( (LA30_2==EOF||LA30_2==Sleep||(LA30_2>=ExclamationMarkEqualsSign && LA30_2<=AmpersandAmpersand)||(LA30_2>=LessThanSignEqualsSign && LA30_2<=GreaterThanSignEqualsSign)||LA30_2==VerticalLineVerticalLine||LA30_2==RightParenthesis||(LA30_2>=Comma && LA30_2<=FullStop)||(LA30_2>=LessThanSign && LA30_2<=GreaterThanSign)||LA30_2==RightSquareBracket||LA30_2==RightCurlyBracket||LA30_2==RULE_STRING) ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt30=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalGoatComponentsParser.g:1890:3: this_AttributeValue_0= ruleAttributeValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getAttributeValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeValue_0=ruleAttributeValue();

                    state._fsp--;


                    			current = this_AttributeValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1899:3: this_ImmediateValue_1= ruleImmediateValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getImmediateValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImmediateValue_1=ruleImmediateValue();

                    state._fsp--;


                    			current = this_ImmediateValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1908:3: this_GoStringFunction_2= ruleGoStringFunction
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getGoStringFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoStringFunction_2=ruleGoStringFunction();

                    state._fsp--;


                    			current = this_GoStringFunction_2;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalGoatComponentsParser.g:1920:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalGoatComponentsParser.g:1920:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalGoatComponentsParser.g:1921:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalGoatComponentsParser.g:1927:1: ruleAttributeValue returns [EObject current=null] : ( () ( (lv_attr_1_0= ruleAttribute ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject lv_attr_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1933:2: ( ( () ( (lv_attr_1_0= ruleAttribute ) ) ) )
            // InternalGoatComponentsParser.g:1934:2: ( () ( (lv_attr_1_0= ruleAttribute ) ) )
            {
            // InternalGoatComponentsParser.g:1934:2: ( () ( (lv_attr_1_0= ruleAttribute ) ) )
            // InternalGoatComponentsParser.g:1935:3: () ( (lv_attr_1_0= ruleAttribute ) )
            {
            // InternalGoatComponentsParser.g:1935:3: ()
            // InternalGoatComponentsParser.g:1936:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeValueAccess().getAttributeValueAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:1942:3: ( (lv_attr_1_0= ruleAttribute ) )
            // InternalGoatComponentsParser.g:1943:4: (lv_attr_1_0= ruleAttribute )
            {
            // InternalGoatComponentsParser.g:1943:4: (lv_attr_1_0= ruleAttribute )
            // InternalGoatComponentsParser.g:1944:5: lv_attr_1_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeValueAccess().getAttrAttributeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_attr_1_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeValueRule());
            					}
            					set(
            						current,
            						"attr",
            						lv_attr_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Attribute");
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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleImmediateValue"
    // InternalGoatComponentsParser.g:1965:1: entryRuleImmediateValue returns [EObject current=null] : iv_ruleImmediateValue= ruleImmediateValue EOF ;
    public final EObject entryRuleImmediateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmediateValue = null;


        try {
            // InternalGoatComponentsParser.g:1965:55: (iv_ruleImmediateValue= ruleImmediateValue EOF )
            // InternalGoatComponentsParser.g:1966:2: iv_ruleImmediateValue= ruleImmediateValue EOF
            {
             newCompositeNode(grammarAccess.getImmediateValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImmediateValue=ruleImmediateValue();

            state._fsp--;

             current =iv_ruleImmediateValue; 
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
    // $ANTLR end "entryRuleImmediateValue"


    // $ANTLR start "ruleImmediateValue"
    // InternalGoatComponentsParser.g:1972:1: ruleImmediateValue returns [EObject current=null] : ( () ( (lv_imm_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImmediateValue() throws RecognitionException {
        EObject current = null;

        Token lv_imm_1_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1978:2: ( ( () ( (lv_imm_1_0= RULE_STRING ) ) ) )
            // InternalGoatComponentsParser.g:1979:2: ( () ( (lv_imm_1_0= RULE_STRING ) ) )
            {
            // InternalGoatComponentsParser.g:1979:2: ( () ( (lv_imm_1_0= RULE_STRING ) ) )
            // InternalGoatComponentsParser.g:1980:3: () ( (lv_imm_1_0= RULE_STRING ) )
            {
            // InternalGoatComponentsParser.g:1980:3: ()
            // InternalGoatComponentsParser.g:1981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImmediateValueAccess().getImmediateValueAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:1987:3: ( (lv_imm_1_0= RULE_STRING ) )
            // InternalGoatComponentsParser.g:1988:4: (lv_imm_1_0= RULE_STRING )
            {
            // InternalGoatComponentsParser.g:1988:4: (lv_imm_1_0= RULE_STRING )
            // InternalGoatComponentsParser.g:1989:5: lv_imm_1_0= RULE_STRING
            {
            lv_imm_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_imm_1_0, grammarAccess.getImmediateValueAccess().getImmSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImmediateValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"imm",
            						lv_imm_1_0,
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
    // $ANTLR end "ruleImmediateValue"


    // $ANTLR start "entryRuleGoStringFunction"
    // InternalGoatComponentsParser.g:2009:1: entryRuleGoStringFunction returns [EObject current=null] : iv_ruleGoStringFunction= ruleGoStringFunction EOF ;
    public final EObject entryRuleGoStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoStringFunction = null;


        try {
            // InternalGoatComponentsParser.g:2009:57: (iv_ruleGoStringFunction= ruleGoStringFunction EOF )
            // InternalGoatComponentsParser.g:2010:2: iv_ruleGoStringFunction= ruleGoStringFunction EOF
            {
             newCompositeNode(grammarAccess.getGoStringFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoStringFunction=ruleGoStringFunction();

            state._fsp--;

             current =iv_ruleGoStringFunction; 
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
    // $ANTLR end "entryRuleGoStringFunction"


    // $ANTLR start "ruleGoStringFunction"
    // InternalGoatComponentsParser.g:2016:1: ruleGoStringFunction returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* )? otherlv_6= RightParenthesis ) ;
    public final EObject ruleGoStringFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2022:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* )? otherlv_6= RightParenthesis ) )
            // InternalGoatComponentsParser.g:2023:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* )? otherlv_6= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:2023:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* )? otherlv_6= RightParenthesis )
            // InternalGoatComponentsParser.g:2024:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* )? otherlv_6= RightParenthesis
            {
            // InternalGoatComponentsParser.g:2024:3: ()
            // InternalGoatComponentsParser.g:2025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGoStringFunctionAccess().getGoStringFunctionAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:2031:3: ( (otherlv_1= RULE_ID ) )
            // InternalGoatComponentsParser.g:2032:4: (otherlv_1= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2032:4: (otherlv_1= RULE_ID )
            // InternalGoatComponentsParser.g:2033:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoStringFunctionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getGoStringFunctionAccess().getFuncnameFuncDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getGoStringFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalGoatComponentsParser.g:2048:3: ( ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==This||LA32_0==RULE_ID||LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGoatComponentsParser.g:2049:4: ( (lv_params_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )*
                    {
                    // InternalGoatComponentsParser.g:2049:4: ( (lv_params_3_0= ruleValue ) )
                    // InternalGoatComponentsParser.g:2050:5: (lv_params_3_0= ruleValue )
                    {
                    // InternalGoatComponentsParser.g:2050:5: (lv_params_3_0= ruleValue )
                    // InternalGoatComponentsParser.g:2051:6: lv_params_3_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getGoStringFunctionAccess().getParamsValueParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_params_3_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoStringFunctionRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:2068:4: (otherlv_4= Comma ( (lv_params_5_0= ruleValue ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:2069:5: otherlv_4= Comma ( (lv_params_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_20); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGoStringFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:2073:5: ( (lv_params_5_0= ruleValue ) )
                    	    // InternalGoatComponentsParser.g:2074:6: (lv_params_5_0= ruleValue )
                    	    {
                    	    // InternalGoatComponentsParser.g:2074:6: (lv_params_5_0= ruleValue )
                    	    // InternalGoatComponentsParser.g:2075:7: lv_params_5_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getGoStringFunctionAccess().getParamsValueParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_params_5_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGoStringFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_5_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGoStringFunctionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleGoStringFunction"


    // $ANTLR start "entryRulePredicate"
    // InternalGoatComponentsParser.g:2102:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalGoatComponentsParser.g:2102:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalGoatComponentsParser.g:2103:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalGoatComponentsParser.g:2109:1: rulePredicate returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleAnd ) ) )* ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_or_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2115:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleAnd ) ) )* ) )
            // InternalGoatComponentsParser.g:2116:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleAnd ) ) )* )
            {
            // InternalGoatComponentsParser.g:2116:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleAnd ) ) )* )
            // InternalGoatComponentsParser.g:2117:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getPredicateAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2125:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleAnd ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==VerticalLineVerticalLine) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2126:4: () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleAnd ) )
            	    {
            	    // InternalGoatComponentsParser.g:2126:4: ()
            	    // InternalGoatComponentsParser.g:2127:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getPredicateAccess().getPredicateOrAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPredicateAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:2137:4: ( (lv_or_3_0= ruleAnd ) )
            	    // InternalGoatComponentsParser.g:2138:5: (lv_or_3_0= ruleAnd )
            	    {
            	    // InternalGoatComponentsParser.g:2138:5: (lv_or_3_0= ruleAnd )
            	    // InternalGoatComponentsParser.g:2139:6: lv_or_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getPredicateAccess().getOrAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_or_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPredicateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"or",
            	    							lv_or_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleAnd"
    // InternalGoatComponentsParser.g:2161:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGoatComponentsParser.g:2161:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGoatComponentsParser.g:2162:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalGoatComponentsParser.g:2168:1: ruleAnd returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_and_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2174:2: ( (this_Not_0= ruleNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleNot ) ) )* ) )
            // InternalGoatComponentsParser.g:2175:2: (this_Not_0= ruleNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleNot ) ) )* )
            {
            // InternalGoatComponentsParser.g:2175:2: (this_Not_0= ruleNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleNot ) ) )* )
            // InternalGoatComponentsParser.g:2176:3: this_Not_0= ruleNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleNot ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2184:3: ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleNot ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AmpersandAmpersand) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2185:4: () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleNot ) )
            	    {
            	    // InternalGoatComponentsParser.g:2185:4: ()
            	    // InternalGoatComponentsParser.g:2186:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndAccess().getAndAndAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:2196:4: ( (lv_and_3_0= ruleNot ) )
            	    // InternalGoatComponentsParser.g:2197:5: (lv_and_3_0= ruleNot )
            	    {
            	    // InternalGoatComponentsParser.g:2197:5: (lv_and_3_0= ruleNot )
            	    // InternalGoatComponentsParser.g:2198:6: lv_and_3_0= ruleNot
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getAndNotParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_and_3_0=ruleNot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						add(
            	    							current,
            	    							"and",
            	    							lv_and_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.Not");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNot"
    // InternalGoatComponentsParser.g:2220:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalGoatComponentsParser.g:2220:44: (iv_ruleNot= ruleNot EOF )
            // InternalGoatComponentsParser.g:2221:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalGoatComponentsParser.g:2227:1: ruleNot returns [EObject current=null] : (this_Term_0= ruleTerm | ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleTerm ) ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token lv_neg_2_0=null;
        EObject this_Term_0 = null;

        EObject lv_term_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2233:2: ( (this_Term_0= ruleTerm | ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleTerm ) ) ) ) )
            // InternalGoatComponentsParser.g:2234:2: (this_Term_0= ruleTerm | ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleTerm ) ) ) )
            {
            // InternalGoatComponentsParser.g:2234:2: (this_Term_0= ruleTerm | ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleTerm ) ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Receiver||LA35_0==False||(LA35_0>=This && LA35_0<=True)||LA35_0==LeftParenthesis||LA35_0==RULE_ID||LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==ExclamationMark) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalGoatComponentsParser.g:2235:3: this_Term_0= ruleTerm
                    {

                    			newCompositeNode(grammarAccess.getNotAccess().getTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Term_0=ruleTerm();

                    state._fsp--;


                    			current = this_Term_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2244:3: ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleTerm ) ) )
                    {
                    // InternalGoatComponentsParser.g:2244:3: ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleTerm ) ) )
                    // InternalGoatComponentsParser.g:2245:4: () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleTerm ) )
                    {
                    // InternalGoatComponentsParser.g:2245:4: ()
                    // InternalGoatComponentsParser.g:2246:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2252:4: ( (lv_neg_2_0= ExclamationMark ) )
                    // InternalGoatComponentsParser.g:2253:5: (lv_neg_2_0= ExclamationMark )
                    {
                    // InternalGoatComponentsParser.g:2253:5: (lv_neg_2_0= ExclamationMark )
                    // InternalGoatComponentsParser.g:2254:6: lv_neg_2_0= ExclamationMark
                    {
                    lv_neg_2_0=(Token)match(input,ExclamationMark,FOLLOW_43); 

                    						newLeafNode(lv_neg_2_0, grammarAccess.getNotAccess().getNegExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNotRule());
                    						}
                    						setWithLastConsumed(current, "neg", true, "!");
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:2266:4: ( (lv_term_3_0= ruleTerm ) )
                    // InternalGoatComponentsParser.g:2267:5: (lv_term_3_0= ruleTerm )
                    {
                    // InternalGoatComponentsParser.g:2267:5: (lv_term_3_0= ruleTerm )
                    // InternalGoatComponentsParser.g:2268:6: lv_term_3_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getNotAccess().getTermTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_term_3_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotRule());
                    						}
                    						set(
                    							current,
                    							"term",
                    							lv_term_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Term");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleTerm"
    // InternalGoatComponentsParser.g:2290:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalGoatComponentsParser.g:2290:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalGoatComponentsParser.g:2291:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalGoatComponentsParser.g:2297:1: ruleTerm returns [EObject current=null] : (this_Immediate_0= ruleImmediate | this_EqualityTest_1= ruleEqualityTest | (otherlv_2= LeftParenthesis this_Predicate_3= rulePredicate otherlv_4= RightParenthesis ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Immediate_0 = null;

        EObject this_EqualityTest_1 = null;

        EObject this_Predicate_3 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2303:2: ( (this_Immediate_0= ruleImmediate | this_EqualityTest_1= ruleEqualityTest | (otherlv_2= LeftParenthesis this_Predicate_3= rulePredicate otherlv_4= RightParenthesis ) ) )
            // InternalGoatComponentsParser.g:2304:2: (this_Immediate_0= ruleImmediate | this_EqualityTest_1= ruleEqualityTest | (otherlv_2= LeftParenthesis this_Predicate_3= rulePredicate otherlv_4= RightParenthesis ) )
            {
            // InternalGoatComponentsParser.g:2304:2: (this_Immediate_0= ruleImmediate | this_EqualityTest_1= ruleEqualityTest | (otherlv_2= LeftParenthesis this_Predicate_3= rulePredicate otherlv_4= RightParenthesis ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt36=1;
                }
                break;
            case Receiver:
            case This:
            case RULE_ID:
            case RULE_STRING:
                {
                alt36=2;
                }
                break;
            case LeftParenthesis:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalGoatComponentsParser.g:2305:3: this_Immediate_0= ruleImmediate
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getImmediateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Immediate_0=ruleImmediate();

                    state._fsp--;


                    			current = this_Immediate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2314:3: this_EqualityTest_1= ruleEqualityTest
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getEqualityTestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EqualityTest_1=ruleEqualityTest();

                    state._fsp--;


                    			current = this_EqualityTest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:2323:3: (otherlv_2= LeftParenthesis this_Predicate_3= rulePredicate otherlv_4= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:2323:3: (otherlv_2= LeftParenthesis this_Predicate_3= rulePredicate otherlv_4= RightParenthesis )
                    // InternalGoatComponentsParser.g:2324:4: otherlv_2= LeftParenthesis this_Predicate_3= rulePredicate otherlv_4= RightParenthesis
                    {
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getTermAccess().getPredicateParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_Predicate_3=rulePredicate();

                    state._fsp--;


                    				current = this_Predicate_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTermAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleImmediate"
    // InternalGoatComponentsParser.g:2345:1: entryRuleImmediate returns [EObject current=null] : iv_ruleImmediate= ruleImmediate EOF ;
    public final EObject entryRuleImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmediate = null;


        try {
            // InternalGoatComponentsParser.g:2345:50: (iv_ruleImmediate= ruleImmediate EOF )
            // InternalGoatComponentsParser.g:2346:2: iv_ruleImmediate= ruleImmediate EOF
            {
             newCompositeNode(grammarAccess.getImmediateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImmediate=ruleImmediate();

            state._fsp--;

             current =iv_ruleImmediate; 
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
    // $ANTLR end "entryRuleImmediate"


    // $ANTLR start "ruleImmediate"
    // InternalGoatComponentsParser.g:2352:1: ruleImmediate returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleImmediate() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2358:2: ( ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalGoatComponentsParser.g:2359:2: ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalGoatComponentsParser.g:2359:2: ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) )
            // InternalGoatComponentsParser.g:2360:3: () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False )
            {
            // InternalGoatComponentsParser.g:2360:3: ()
            // InternalGoatComponentsParser.g:2361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImmediateAccess().getImmediateAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:2367:3: ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==True) ) {
                alt37=1;
            }
            else if ( (LA37_0==False) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalGoatComponentsParser.g:2368:4: ( (lv_isTrue_1_0= True ) )
                    {
                    // InternalGoatComponentsParser.g:2368:4: ( (lv_isTrue_1_0= True ) )
                    // InternalGoatComponentsParser.g:2369:5: (lv_isTrue_1_0= True )
                    {
                    // InternalGoatComponentsParser.g:2369:5: (lv_isTrue_1_0= True )
                    // InternalGoatComponentsParser.g:2370:6: lv_isTrue_1_0= True
                    {
                    lv_isTrue_1_0=(Token)match(input,True,FOLLOW_2); 

                    						newLeafNode(lv_isTrue_1_0, grammarAccess.getImmediateAccess().getIsTrueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImmediateRule());
                    						}
                    						setWithLastConsumed(current, "isTrue", true, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2383:4: otherlv_2= False
                    {
                    otherlv_2=(Token)match(input,False,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getImmediateAccess().getFalseKeyword_1_1());
                    			

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
    // $ANTLR end "ruleImmediate"


    // $ANTLR start "entryRuleEqualityTest"
    // InternalGoatComponentsParser.g:2392:1: entryRuleEqualityTest returns [EObject current=null] : iv_ruleEqualityTest= ruleEqualityTest EOF ;
    public final EObject entryRuleEqualityTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityTest = null;


        try {
            // InternalGoatComponentsParser.g:2392:53: (iv_ruleEqualityTest= ruleEqualityTest EOF )
            // InternalGoatComponentsParser.g:2393:2: iv_ruleEqualityTest= ruleEqualityTest EOF
            {
             newCompositeNode(grammarAccess.getEqualityTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityTest=ruleEqualityTest();

            state._fsp--;

             current =iv_ruleEqualityTest; 
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
    // $ANTLR end "entryRuleEqualityTest"


    // $ANTLR start "ruleEqualityTest"
    // InternalGoatComponentsParser.g:2399:1: ruleEqualityTest returns [EObject current=null] : ( () ( ( (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute ) ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleValue ) ) ) ;
    public final EObject ruleEqualityTest() throws RecognitionException {
        EObject current = null;

        Token lv_operand_2_1=null;
        Token lv_operand_2_2=null;
        Token lv_operand_2_3=null;
        Token lv_operand_2_4=null;
        Token lv_operand_2_5=null;
        Token lv_operand_2_6=null;
        EObject lv_op1_1_1 = null;

        EObject lv_op1_1_2 = null;

        EObject lv_op2_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2405:2: ( ( () ( ( (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute ) ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleValue ) ) ) )
            // InternalGoatComponentsParser.g:2406:2: ( () ( ( (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute ) ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleValue ) ) )
            {
            // InternalGoatComponentsParser.g:2406:2: ( () ( ( (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute ) ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleValue ) ) )
            // InternalGoatComponentsParser.g:2407:3: () ( ( (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute ) ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleValue ) )
            {
            // InternalGoatComponentsParser.g:2407:3: ()
            // InternalGoatComponentsParser.g:2408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEqualityTestAccess().getEqualityTestAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:2414:3: ( ( (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute ) ) )
            // InternalGoatComponentsParser.g:2415:4: ( (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute ) )
            {
            // InternalGoatComponentsParser.g:2415:4: ( (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute ) )
            // InternalGoatComponentsParser.g:2416:5: (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute )
            {
            // InternalGoatComponentsParser.g:2416:5: (lv_op1_1_1= ruleValue | lv_op1_1_2= ruleRecAttribute )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==This||LA38_0==RULE_ID||LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==Receiver) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalGoatComponentsParser.g:2417:6: lv_op1_1_1= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getEqualityTestAccess().getOp1ValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_op1_1_1=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualityTestRule());
                    						}
                    						set(
                    							current,
                    							"op1",
                    							lv_op1_1_1,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2433:6: lv_op1_1_2= ruleRecAttribute
                    {

                    						newCompositeNode(grammarAccess.getEqualityTestAccess().getOp1RecAttributeParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_44);
                    lv_op1_1_2=ruleRecAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualityTestRule());
                    						}
                    						set(
                    							current,
                    							"op1",
                    							lv_op1_1_2,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.RecAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalGoatComponentsParser.g:2451:3: ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) )
            // InternalGoatComponentsParser.g:2452:4: ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) )
            {
            // InternalGoatComponentsParser.g:2452:4: ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) )
            // InternalGoatComponentsParser.g:2453:5: (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign )
            {
            // InternalGoatComponentsParser.g:2453:5: (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign )
            int alt39=6;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt39=1;
                }
                break;
            case GreaterThanSign:
                {
                alt39=2;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt39=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt39=4;
                }
                break;
            case EqualsSign:
                {
                alt39=5;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt39=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalGoatComponentsParser.g:2454:6: lv_operand_2_1= LessThanSign
                    {
                    lv_operand_2_1=(Token)match(input,LessThanSign,FOLLOW_20); 

                    						newLeafNode(lv_operand_2_1, grammarAccess.getEqualityTestAccess().getOperandLessThanSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2465:6: lv_operand_2_2= GreaterThanSign
                    {
                    lv_operand_2_2=(Token)match(input,GreaterThanSign,FOLLOW_20); 

                    						newLeafNode(lv_operand_2_2, grammarAccess.getEqualityTestAccess().getOperandGreaterThanSignKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:2476:6: lv_operand_2_3= LessThanSignEqualsSign
                    {
                    lv_operand_2_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_20); 

                    						newLeafNode(lv_operand_2_3, grammarAccess.getEqualityTestAccess().getOperandLessThanSignEqualsSignKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:2487:6: lv_operand_2_4= GreaterThanSignEqualsSign
                    {
                    lv_operand_2_4=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_20); 

                    						newLeafNode(lv_operand_2_4, grammarAccess.getEqualityTestAccess().getOperandGreaterThanSignEqualsSignKeyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalGoatComponentsParser.g:2498:6: lv_operand_2_5= EqualsSign
                    {
                    lv_operand_2_5=(Token)match(input,EqualsSign,FOLLOW_20); 

                    						newLeafNode(lv_operand_2_5, grammarAccess.getEqualityTestAccess().getOperandEqualsSignKeyword_2_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalGoatComponentsParser.g:2509:6: lv_operand_2_6= ExclamationMarkEqualsSign
                    {
                    lv_operand_2_6=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_20); 

                    						newLeafNode(lv_operand_2_6, grammarAccess.getEqualityTestAccess().getOperandExclamationMarkEqualsSignKeyword_2_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_6, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalGoatComponentsParser.g:2522:3: ( (lv_op2_3_0= ruleValue ) )
            // InternalGoatComponentsParser.g:2523:4: (lv_op2_3_0= ruleValue )
            {
            // InternalGoatComponentsParser.g:2523:4: (lv_op2_3_0= ruleValue )
            // InternalGoatComponentsParser.g:2524:5: lv_op2_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getEqualityTestAccess().getOp2ValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_op2_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualityTestRule());
            					}
            					set(
            						current,
            						"op2",
            						lv_op2_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Value");
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
    // $ANTLR end "ruleEqualityTest"


    // $ANTLR start "entryRuleFuncParam"
    // InternalGoatComponentsParser.g:2545:1: entryRuleFuncParam returns [EObject current=null] : iv_ruleFuncParam= ruleFuncParam EOF ;
    public final EObject entryRuleFuncParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncParam = null;


        try {
            // InternalGoatComponentsParser.g:2545:50: (iv_ruleFuncParam= ruleFuncParam EOF )
            // InternalGoatComponentsParser.g:2546:2: iv_ruleFuncParam= ruleFuncParam EOF
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
    // InternalGoatComponentsParser.g:2552:1: ruleFuncParam returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFuncParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2558:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:2559:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:2559:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2560:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2560:3: (lv_name_0_0= RULE_ID )
            // InternalGoatComponentsParser.g:2561:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFuncParamAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFuncParamRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalGoatComponentsParser.g:2580:1: entryRuleFuncDefinition returns [EObject current=null] : iv_ruleFuncDefinition= ruleFuncDefinition EOF ;
    public final EObject entryRuleFuncDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDefinition = null;


        try {
            // InternalGoatComponentsParser.g:2580:55: (iv_ruleFuncDefinition= ruleFuncDefinition EOF )
            // InternalGoatComponentsParser.g:2581:2: iv_ruleFuncDefinition= ruleFuncDefinition EOF
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
    // InternalGoatComponentsParser.g:2587:1: ruleFuncDefinition returns [EObject current=null] : (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleFuncParam ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleFuncParam ) ) )* )? otherlv_6= RightParenthesis ( (lv_blk_7_0= ruleFuncBlock ) ) ) ;
    public final EObject ruleFuncDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_blk_7_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2593:2: ( (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleFuncParam ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleFuncParam ) ) )* )? otherlv_6= RightParenthesis ( (lv_blk_7_0= ruleFuncBlock ) ) ) )
            // InternalGoatComponentsParser.g:2594:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleFuncParam ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleFuncParam ) ) )* )? otherlv_6= RightParenthesis ( (lv_blk_7_0= ruleFuncBlock ) ) )
            {
            // InternalGoatComponentsParser.g:2594:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleFuncParam ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleFuncParam ) ) )* )? otherlv_6= RightParenthesis ( (lv_blk_7_0= ruleFuncBlock ) ) )
            // InternalGoatComponentsParser.g:2595:3: otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleFuncParam ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleFuncParam ) ) )* )? otherlv_6= RightParenthesis ( (lv_blk_7_0= ruleFuncBlock ) )
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncDefinitionAccess().getFunctionKeyword_0());
            		
            // InternalGoatComponentsParser.g:2599:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2600:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2600:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:2601:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuncDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalGoatComponentsParser.g:2621:3: ( ( (lv_params_3_0= ruleFuncParam ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleFuncParam ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGoatComponentsParser.g:2622:4: ( (lv_params_3_0= ruleFuncParam ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleFuncParam ) ) )*
                    {
                    // InternalGoatComponentsParser.g:2622:4: ( (lv_params_3_0= ruleFuncParam ) )
                    // InternalGoatComponentsParser.g:2623:5: (lv_params_3_0= ruleFuncParam )
                    {
                    // InternalGoatComponentsParser.g:2623:5: (lv_params_3_0= ruleFuncParam )
                    // InternalGoatComponentsParser.g:2624:6: lv_params_3_0= ruleFuncParam
                    {

                    						newCompositeNode(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_params_3_0=ruleFuncParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:2641:4: (otherlv_4= Comma ( (lv_params_5_0= ruleFuncParam ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==Comma) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:2642:5: otherlv_4= Comma ( (lv_params_5_0= ruleFuncParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFuncDefinitionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:2646:5: ( (lv_params_5_0= ruleFuncParam ) )
                    	    // InternalGoatComponentsParser.g:2647:6: (lv_params_5_0= ruleFuncParam )
                    	    {
                    	    // InternalGoatComponentsParser.g:2647:6: (lv_params_5_0= ruleFuncParam )
                    	    // InternalGoatComponentsParser.g:2648:7: lv_params_5_0= ruleFuncParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_params_5_0=ruleFuncParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFuncDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_5_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.FuncParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getFuncDefinitionAccess().getRightParenthesisKeyword_4());
            		
            // InternalGoatComponentsParser.g:2671:3: ( (lv_blk_7_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:2672:4: (lv_blk_7_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:2672:4: (lv_blk_7_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:2673:5: lv_blk_7_0= ruleFuncBlock
            {

            					newCompositeNode(grammarAccess.getFuncDefinitionAccess().getBlkFuncBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_blk_7_0=ruleFuncBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncDefinitionRule());
            					}
            					set(
            						current,
            						"blk",
            						lv_blk_7_0,
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
    // InternalGoatComponentsParser.g:2694:1: entryRuleFuncBlock returns [EObject current=null] : iv_ruleFuncBlock= ruleFuncBlock EOF ;
    public final EObject entryRuleFuncBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncBlock = null;


        try {
            // InternalGoatComponentsParser.g:2694:50: (iv_ruleFuncBlock= ruleFuncBlock EOF )
            // InternalGoatComponentsParser.g:2695:2: iv_ruleFuncBlock= ruleFuncBlock EOF
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
    // InternalGoatComponentsParser.g:2701:1: ruleFuncBlock returns [EObject current=null] : (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleFuncBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2707:2: ( (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:2708:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2708:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket )
            // InternalGoatComponentsParser.g:2709:3: otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:2713:3: ()
            // InternalGoatComponentsParser.g:2714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuncBlockAccess().getFuncBlockAction_1(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:2720:3: ( (lv_statements_2_0= ruleFuncStatement ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Return||LA42_0==Var||LA42_0==If||LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2721:4: (lv_statements_2_0= ruleFuncStatement )
            	    {
            	    // InternalGoatComponentsParser.g:2721:4: (lv_statements_2_0= ruleFuncStatement )
            	    // InternalGoatComponentsParser.g:2722:5: lv_statements_2_0= ruleFuncStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFuncBlockAccess().getStatementsFuncStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_46);
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
            	    break loop42;
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
    // InternalGoatComponentsParser.g:2747:1: entryRuleFuncStatement returns [EObject current=null] : iv_ruleFuncStatement= ruleFuncStatement EOF ;
    public final EObject entryRuleFuncStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncStatement = null;


        try {
            // InternalGoatComponentsParser.g:2747:54: (iv_ruleFuncStatement= ruleFuncStatement EOF )
            // InternalGoatComponentsParser.g:2748:2: iv_ruleFuncStatement= ruleFuncStatement EOF
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
    // InternalGoatComponentsParser.g:2754:1: ruleFuncStatement returns [EObject current=null] : (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration ) ;
    public final EObject ruleFuncStatement() throws RecognitionException {
        EObject current = null;

        EObject this_FuncVarAssign_0 = null;

        EObject this_FuncIfElse_1 = null;

        EObject this_FuncReturn_2 = null;

        EObject this_FuncVarDeclaration_3 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2760:2: ( (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration ) )
            // InternalGoatComponentsParser.g:2761:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration )
            {
            // InternalGoatComponentsParser.g:2761:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt43=1;
                }
                break;
            case If:
                {
                alt43=2;
                }
                break;
            case Return:
                {
                alt43=3;
                }
                break;
            case Var:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalGoatComponentsParser.g:2762:3: this_FuncVarAssign_0= ruleFuncVarAssign
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
                    // InternalGoatComponentsParser.g:2771:3: this_FuncIfElse_1= ruleFuncIfElse
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
                    // InternalGoatComponentsParser.g:2780:3: this_FuncReturn_2= ruleFuncReturn
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
                    // InternalGoatComponentsParser.g:2789:3: this_FuncVarDeclaration_3= ruleFuncVarDeclaration
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
    // InternalGoatComponentsParser.g:2801:1: entryRuleFuncVarDeclaration returns [EObject current=null] : iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF ;
    public final EObject entryRuleFuncVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarDeclaration = null;


        try {
            // InternalGoatComponentsParser.g:2801:59: (iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF )
            // InternalGoatComponentsParser.g:2802:2: iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF
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
    // InternalGoatComponentsParser.g:2808:1: ruleFuncVarDeclaration returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleFuncVal ) ) ) ;
    public final EObject ruleFuncVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2814:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleFuncVal ) ) ) )
            // InternalGoatComponentsParser.g:2815:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleFuncVal ) ) )
            {
            // InternalGoatComponentsParser.g:2815:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleFuncVal ) ) )
            // InternalGoatComponentsParser.g:2816:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleFuncVal ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncVarDeclarationAccess().getVarKeyword_0());
            		
            // InternalGoatComponentsParser.g:2820:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2821:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2821:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:2822:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncVarDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalGoatComponentsParser.g:2842:3: ( (lv_val_3_0= ruleFuncVal ) )
            // InternalGoatComponentsParser.g:2843:4: (lv_val_3_0= ruleFuncVal )
            {
            // InternalGoatComponentsParser.g:2843:4: (lv_val_3_0= ruleFuncVal )
            // InternalGoatComponentsParser.g:2844:5: lv_val_3_0= ruleFuncVal
            {

            					newCompositeNode(grammarAccess.getFuncVarDeclarationAccess().getValFuncValParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_3_0=ruleFuncVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncVarDeclarationRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.FuncVal");
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
    // InternalGoatComponentsParser.g:2865:1: entryRuleFuncVarAssign returns [EObject current=null] : iv_ruleFuncVarAssign= ruleFuncVarAssign EOF ;
    public final EObject entryRuleFuncVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarAssign = null;


        try {
            // InternalGoatComponentsParser.g:2865:54: (iv_ruleFuncVarAssign= ruleFuncVarAssign EOF )
            // InternalGoatComponentsParser.g:2866:2: iv_ruleFuncVarAssign= ruleFuncVarAssign EOF
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
    // InternalGoatComponentsParser.g:2872:1: ruleFuncVarAssign returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleFuncVal ) ) ) ;
    public final EObject ruleFuncVarAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2878:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleFuncVal ) ) ) )
            // InternalGoatComponentsParser.g:2879:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleFuncVal ) ) )
            {
            // InternalGoatComponentsParser.g:2879:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleFuncVal ) ) )
            // InternalGoatComponentsParser.g:2880:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_val_2_0= ruleFuncVal ) )
            {
            // InternalGoatComponentsParser.g:2880:3: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2881:4: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2881:4: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:2882:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarAssignRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncVarAssignAccess().getEqualsSignKeyword_1());
            		
            // InternalGoatComponentsParser.g:2897:3: ( (lv_val_2_0= ruleFuncVal ) )
            // InternalGoatComponentsParser.g:2898:4: (lv_val_2_0= ruleFuncVal )
            {
            // InternalGoatComponentsParser.g:2898:4: (lv_val_2_0= ruleFuncVal )
            // InternalGoatComponentsParser.g:2899:5: lv_val_2_0= ruleFuncVal
            {

            					newCompositeNode(grammarAccess.getFuncVarAssignAccess().getValFuncValParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_2_0=ruleFuncVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncVarAssignRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.FuncVal");
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


    // $ANTLR start "entryRuleFuncVal"
    // InternalGoatComponentsParser.g:2920:1: entryRuleFuncVal returns [EObject current=null] : iv_ruleFuncVal= ruleFuncVal EOF ;
    public final EObject entryRuleFuncVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVal = null;


        try {
            // InternalGoatComponentsParser.g:2920:48: (iv_ruleFuncVal= ruleFuncVal EOF )
            // InternalGoatComponentsParser.g:2921:2: iv_ruleFuncVal= ruleFuncVal EOF
            {
             newCompositeNode(grammarAccess.getFuncValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncVal=ruleFuncVal();

            state._fsp--;

             current =iv_ruleFuncVal; 
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
    // $ANTLR end "entryRuleFuncVal"


    // $ANTLR start "ruleFuncVal"
    // InternalGoatComponentsParser.g:2927:1: ruleFuncVal returns [EObject current=null] : ( ( () ( (lv_imm_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleFuncVal() throws RecognitionException {
        EObject current = null;

        Token lv_imm_1_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2933:2: ( ( ( () ( (lv_imm_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalGoatComponentsParser.g:2934:2: ( ( () ( (lv_imm_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalGoatComponentsParser.g:2934:2: ( ( () ( (lv_imm_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalGoatComponentsParser.g:2935:3: ( () ( (lv_imm_1_0= RULE_STRING ) ) )
                    {
                    // InternalGoatComponentsParser.g:2935:3: ( () ( (lv_imm_1_0= RULE_STRING ) ) )
                    // InternalGoatComponentsParser.g:2936:4: () ( (lv_imm_1_0= RULE_STRING ) )
                    {
                    // InternalGoatComponentsParser.g:2936:4: ()
                    // InternalGoatComponentsParser.g:2937:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFuncValAccess().getFuncStringAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2943:4: ( (lv_imm_1_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:2944:5: (lv_imm_1_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:2944:5: (lv_imm_1_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:2945:6: lv_imm_1_0= RULE_STRING
                    {
                    lv_imm_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_imm_1_0, grammarAccess.getFuncValAccess().getImmSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncValRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"imm",
                    							lv_imm_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2963:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:2963:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:2964:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:2964:4: ()
                    // InternalGoatComponentsParser.g:2965:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFuncValAccess().getFuncMemoryRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2971:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2972:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2972:5: (otherlv_3= RULE_ID )
                    // InternalGoatComponentsParser.g:2973:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncValRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getFuncValAccess().getRefFuncVarParamCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleFuncVal"


    // $ANTLR start "entryRuleFuncPredicate"
    // InternalGoatComponentsParser.g:2989:1: entryRuleFuncPredicate returns [EObject current=null] : iv_ruleFuncPredicate= ruleFuncPredicate EOF ;
    public final EObject entryRuleFuncPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncPredicate = null;


        try {
            // InternalGoatComponentsParser.g:2989:54: (iv_ruleFuncPredicate= ruleFuncPredicate EOF )
            // InternalGoatComponentsParser.g:2990:2: iv_ruleFuncPredicate= ruleFuncPredicate EOF
            {
             newCompositeNode(grammarAccess.getFuncPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncPredicate=ruleFuncPredicate();

            state._fsp--;

             current =iv_ruleFuncPredicate; 
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
    // $ANTLR end "entryRuleFuncPredicate"


    // $ANTLR start "ruleFuncPredicate"
    // InternalGoatComponentsParser.g:2996:1: ruleFuncPredicate returns [EObject current=null] : (this_FuncAnd_0= ruleFuncAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleFuncAnd ) ) )* ) ;
    public final EObject ruleFuncPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_FuncAnd_0 = null;

        EObject lv_or_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3002:2: ( (this_FuncAnd_0= ruleFuncAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleFuncAnd ) ) )* ) )
            // InternalGoatComponentsParser.g:3003:2: (this_FuncAnd_0= ruleFuncAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleFuncAnd ) ) )* )
            {
            // InternalGoatComponentsParser.g:3003:2: (this_FuncAnd_0= ruleFuncAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleFuncAnd ) ) )* )
            // InternalGoatComponentsParser.g:3004:3: this_FuncAnd_0= ruleFuncAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleFuncAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getFuncPredicateAccess().getFuncAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_FuncAnd_0=ruleFuncAnd();

            state._fsp--;


            			current = this_FuncAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3012:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleFuncAnd ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==VerticalLineVerticalLine) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3013:4: () otherlv_2= VerticalLineVerticalLine ( (lv_or_3_0= ruleFuncAnd ) )
            	    {
            	    // InternalGoatComponentsParser.g:3013:4: ()
            	    // InternalGoatComponentsParser.g:3014:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getFuncPredicateAccess().getFuncPredicateOrAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_48); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFuncPredicateAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:3024:4: ( (lv_or_3_0= ruleFuncAnd ) )
            	    // InternalGoatComponentsParser.g:3025:5: (lv_or_3_0= ruleFuncAnd )
            	    {
            	    // InternalGoatComponentsParser.g:3025:5: (lv_or_3_0= ruleFuncAnd )
            	    // InternalGoatComponentsParser.g:3026:6: lv_or_3_0= ruleFuncAnd
            	    {

            	    						newCompositeNode(grammarAccess.getFuncPredicateAccess().getOrFuncAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_or_3_0=ruleFuncAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncPredicateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"or",
            	    							lv_or_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "ruleFuncPredicate"


    // $ANTLR start "entryRuleFuncAnd"
    // InternalGoatComponentsParser.g:3048:1: entryRuleFuncAnd returns [EObject current=null] : iv_ruleFuncAnd= ruleFuncAnd EOF ;
    public final EObject entryRuleFuncAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncAnd = null;


        try {
            // InternalGoatComponentsParser.g:3048:48: (iv_ruleFuncAnd= ruleFuncAnd EOF )
            // InternalGoatComponentsParser.g:3049:2: iv_ruleFuncAnd= ruleFuncAnd EOF
            {
             newCompositeNode(grammarAccess.getFuncAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncAnd=ruleFuncAnd();

            state._fsp--;

             current =iv_ruleFuncAnd; 
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
    // $ANTLR end "entryRuleFuncAnd"


    // $ANTLR start "ruleFuncAnd"
    // InternalGoatComponentsParser.g:3055:1: ruleFuncAnd returns [EObject current=null] : (this_FuncNot_0= ruleFuncNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleFuncNot ) ) )* ) ;
    public final EObject ruleFuncAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_FuncNot_0 = null;

        EObject lv_and_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3061:2: ( (this_FuncNot_0= ruleFuncNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleFuncNot ) ) )* ) )
            // InternalGoatComponentsParser.g:3062:2: (this_FuncNot_0= ruleFuncNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleFuncNot ) ) )* )
            {
            // InternalGoatComponentsParser.g:3062:2: (this_FuncNot_0= ruleFuncNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleFuncNot ) ) )* )
            // InternalGoatComponentsParser.g:3063:3: this_FuncNot_0= ruleFuncNot ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleFuncNot ) ) )*
            {

            			newCompositeNode(grammarAccess.getFuncAndAccess().getFuncNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_FuncNot_0=ruleFuncNot();

            state._fsp--;


            			current = this_FuncNot_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3071:3: ( () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleFuncNot ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AmpersandAmpersand) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3072:4: () otherlv_2= AmpersandAmpersand ( (lv_and_3_0= ruleFuncNot ) )
            	    {
            	    // InternalGoatComponentsParser.g:3072:4: ()
            	    // InternalGoatComponentsParser.g:3073:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getFuncAndAccess().getFuncAndAndAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_48); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFuncAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:3083:4: ( (lv_and_3_0= ruleFuncNot ) )
            	    // InternalGoatComponentsParser.g:3084:5: (lv_and_3_0= ruleFuncNot )
            	    {
            	    // InternalGoatComponentsParser.g:3084:5: (lv_and_3_0= ruleFuncNot )
            	    // InternalGoatComponentsParser.g:3085:6: lv_and_3_0= ruleFuncNot
            	    {

            	    						newCompositeNode(grammarAccess.getFuncAndAccess().getAndFuncNotParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_and_3_0=ruleFuncNot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncAndRule());
            	    						}
            	    						add(
            	    							current,
            	    							"and",
            	    							lv_and_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncNot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // $ANTLR end "ruleFuncAnd"


    // $ANTLR start "entryRuleFuncNot"
    // InternalGoatComponentsParser.g:3107:1: entryRuleFuncNot returns [EObject current=null] : iv_ruleFuncNot= ruleFuncNot EOF ;
    public final EObject entryRuleFuncNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncNot = null;


        try {
            // InternalGoatComponentsParser.g:3107:48: (iv_ruleFuncNot= ruleFuncNot EOF )
            // InternalGoatComponentsParser.g:3108:2: iv_ruleFuncNot= ruleFuncNot EOF
            {
             newCompositeNode(grammarAccess.getFuncNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncNot=ruleFuncNot();

            state._fsp--;

             current =iv_ruleFuncNot; 
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
    // $ANTLR end "entryRuleFuncNot"


    // $ANTLR start "ruleFuncNot"
    // InternalGoatComponentsParser.g:3114:1: ruleFuncNot returns [EObject current=null] : (this_FuncTerm_0= ruleFuncTerm | ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleFuncTerm ) ) ) ) ;
    public final EObject ruleFuncNot() throws RecognitionException {
        EObject current = null;

        Token lv_neg_2_0=null;
        EObject this_FuncTerm_0 = null;

        EObject lv_term_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3120:2: ( (this_FuncTerm_0= ruleFuncTerm | ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleFuncTerm ) ) ) ) )
            // InternalGoatComponentsParser.g:3121:2: (this_FuncTerm_0= ruleFuncTerm | ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleFuncTerm ) ) ) )
            {
            // InternalGoatComponentsParser.g:3121:2: (this_FuncTerm_0= ruleFuncTerm | ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleFuncTerm ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==False||LA47_0==True||LA47_0==LeftParenthesis||LA47_0==RULE_ID||LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            else if ( (LA47_0==ExclamationMark) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalGoatComponentsParser.g:3122:3: this_FuncTerm_0= ruleFuncTerm
                    {

                    			newCompositeNode(grammarAccess.getFuncNotAccess().getFuncTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncTerm_0=ruleFuncTerm();

                    state._fsp--;


                    			current = this_FuncTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:3131:3: ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleFuncTerm ) ) )
                    {
                    // InternalGoatComponentsParser.g:3131:3: ( () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleFuncTerm ) ) )
                    // InternalGoatComponentsParser.g:3132:4: () ( (lv_neg_2_0= ExclamationMark ) ) ( (lv_term_3_0= ruleFuncTerm ) )
                    {
                    // InternalGoatComponentsParser.g:3132:4: ()
                    // InternalGoatComponentsParser.g:3133:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFuncNotAccess().getFuncNotAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3139:4: ( (lv_neg_2_0= ExclamationMark ) )
                    // InternalGoatComponentsParser.g:3140:5: (lv_neg_2_0= ExclamationMark )
                    {
                    // InternalGoatComponentsParser.g:3140:5: (lv_neg_2_0= ExclamationMark )
                    // InternalGoatComponentsParser.g:3141:6: lv_neg_2_0= ExclamationMark
                    {
                    lv_neg_2_0=(Token)match(input,ExclamationMark,FOLLOW_49); 

                    						newLeafNode(lv_neg_2_0, grammarAccess.getFuncNotAccess().getNegExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncNotRule());
                    						}
                    						setWithLastConsumed(current, "neg", true, "!");
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:3153:4: ( (lv_term_3_0= ruleFuncTerm ) )
                    // InternalGoatComponentsParser.g:3154:5: (lv_term_3_0= ruleFuncTerm )
                    {
                    // InternalGoatComponentsParser.g:3154:5: (lv_term_3_0= ruleFuncTerm )
                    // InternalGoatComponentsParser.g:3155:6: lv_term_3_0= ruleFuncTerm
                    {

                    						newCompositeNode(grammarAccess.getFuncNotAccess().getTermFuncTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_term_3_0=ruleFuncTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncNotRule());
                    						}
                    						set(
                    							current,
                    							"term",
                    							lv_term_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncTerm");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleFuncNot"


    // $ANTLR start "entryRuleFuncTerm"
    // InternalGoatComponentsParser.g:3177:1: entryRuleFuncTerm returns [EObject current=null] : iv_ruleFuncTerm= ruleFuncTerm EOF ;
    public final EObject entryRuleFuncTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncTerm = null;


        try {
            // InternalGoatComponentsParser.g:3177:49: (iv_ruleFuncTerm= ruleFuncTerm EOF )
            // InternalGoatComponentsParser.g:3178:2: iv_ruleFuncTerm= ruleFuncTerm EOF
            {
             newCompositeNode(grammarAccess.getFuncTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncTerm=ruleFuncTerm();

            state._fsp--;

             current =iv_ruleFuncTerm; 
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
    // $ANTLR end "entryRuleFuncTerm"


    // $ANTLR start "ruleFuncTerm"
    // InternalGoatComponentsParser.g:3184:1: ruleFuncTerm returns [EObject current=null] : (this_FuncImmediate_0= ruleFuncImmediate | this_FuncEqualityTest_1= ruleFuncEqualityTest | (otherlv_2= LeftParenthesis this_FuncPredicate_3= ruleFuncPredicate otherlv_4= RightParenthesis ) ) ;
    public final EObject ruleFuncTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_FuncImmediate_0 = null;

        EObject this_FuncEqualityTest_1 = null;

        EObject this_FuncPredicate_3 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3190:2: ( (this_FuncImmediate_0= ruleFuncImmediate | this_FuncEqualityTest_1= ruleFuncEqualityTest | (otherlv_2= LeftParenthesis this_FuncPredicate_3= ruleFuncPredicate otherlv_4= RightParenthesis ) ) )
            // InternalGoatComponentsParser.g:3191:2: (this_FuncImmediate_0= ruleFuncImmediate | this_FuncEqualityTest_1= ruleFuncEqualityTest | (otherlv_2= LeftParenthesis this_FuncPredicate_3= ruleFuncPredicate otherlv_4= RightParenthesis ) )
            {
            // InternalGoatComponentsParser.g:3191:2: (this_FuncImmediate_0= ruleFuncImmediate | this_FuncEqualityTest_1= ruleFuncEqualityTest | (otherlv_2= LeftParenthesis this_FuncPredicate_3= ruleFuncPredicate otherlv_4= RightParenthesis ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt48=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt48=2;
                }
                break;
            case LeftParenthesis:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalGoatComponentsParser.g:3192:3: this_FuncImmediate_0= ruleFuncImmediate
                    {

                    			newCompositeNode(grammarAccess.getFuncTermAccess().getFuncImmediateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncImmediate_0=ruleFuncImmediate();

                    state._fsp--;


                    			current = this_FuncImmediate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:3201:3: this_FuncEqualityTest_1= ruleFuncEqualityTest
                    {

                    			newCompositeNode(grammarAccess.getFuncTermAccess().getFuncEqualityTestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncEqualityTest_1=ruleFuncEqualityTest();

                    state._fsp--;


                    			current = this_FuncEqualityTest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:3210:3: (otherlv_2= LeftParenthesis this_FuncPredicate_3= ruleFuncPredicate otherlv_4= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:3210:3: (otherlv_2= LeftParenthesis this_FuncPredicate_3= ruleFuncPredicate otherlv_4= RightParenthesis )
                    // InternalGoatComponentsParser.g:3211:4: otherlv_2= LeftParenthesis this_FuncPredicate_3= ruleFuncPredicate otherlv_4= RightParenthesis
                    {
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_48); 

                    				newLeafNode(otherlv_2, grammarAccess.getFuncTermAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getFuncTermAccess().getFuncPredicateParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_FuncPredicate_3=ruleFuncPredicate();

                    state._fsp--;


                    				current = this_FuncPredicate_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFuncTermAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "ruleFuncTerm"


    // $ANTLR start "entryRuleFuncImmediate"
    // InternalGoatComponentsParser.g:3232:1: entryRuleFuncImmediate returns [EObject current=null] : iv_ruleFuncImmediate= ruleFuncImmediate EOF ;
    public final EObject entryRuleFuncImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncImmediate = null;


        try {
            // InternalGoatComponentsParser.g:3232:54: (iv_ruleFuncImmediate= ruleFuncImmediate EOF )
            // InternalGoatComponentsParser.g:3233:2: iv_ruleFuncImmediate= ruleFuncImmediate EOF
            {
             newCompositeNode(grammarAccess.getFuncImmediateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncImmediate=ruleFuncImmediate();

            state._fsp--;

             current =iv_ruleFuncImmediate; 
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
    // $ANTLR end "entryRuleFuncImmediate"


    // $ANTLR start "ruleFuncImmediate"
    // InternalGoatComponentsParser.g:3239:1: ruleFuncImmediate returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleFuncImmediate() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3245:2: ( ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalGoatComponentsParser.g:3246:2: ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalGoatComponentsParser.g:3246:2: ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) )
            // InternalGoatComponentsParser.g:3247:3: () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False )
            {
            // InternalGoatComponentsParser.g:3247:3: ()
            // InternalGoatComponentsParser.g:3248:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuncImmediateAccess().getFuncImmediateAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:3254:3: ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==True) ) {
                alt49=1;
            }
            else if ( (LA49_0==False) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalGoatComponentsParser.g:3255:4: ( (lv_isTrue_1_0= True ) )
                    {
                    // InternalGoatComponentsParser.g:3255:4: ( (lv_isTrue_1_0= True ) )
                    // InternalGoatComponentsParser.g:3256:5: (lv_isTrue_1_0= True )
                    {
                    // InternalGoatComponentsParser.g:3256:5: (lv_isTrue_1_0= True )
                    // InternalGoatComponentsParser.g:3257:6: lv_isTrue_1_0= True
                    {
                    lv_isTrue_1_0=(Token)match(input,True,FOLLOW_2); 

                    						newLeafNode(lv_isTrue_1_0, grammarAccess.getFuncImmediateAccess().getIsTrueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncImmediateRule());
                    						}
                    						setWithLastConsumed(current, "isTrue", true, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:3270:4: otherlv_2= False
                    {
                    otherlv_2=(Token)match(input,False,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getFuncImmediateAccess().getFalseKeyword_1_1());
                    			

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
    // $ANTLR end "ruleFuncImmediate"


    // $ANTLR start "entryRuleFuncEqualityTest"
    // InternalGoatComponentsParser.g:3279:1: entryRuleFuncEqualityTest returns [EObject current=null] : iv_ruleFuncEqualityTest= ruleFuncEqualityTest EOF ;
    public final EObject entryRuleFuncEqualityTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncEqualityTest = null;


        try {
            // InternalGoatComponentsParser.g:3279:57: (iv_ruleFuncEqualityTest= ruleFuncEqualityTest EOF )
            // InternalGoatComponentsParser.g:3280:2: iv_ruleFuncEqualityTest= ruleFuncEqualityTest EOF
            {
             newCompositeNode(grammarAccess.getFuncEqualityTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncEqualityTest=ruleFuncEqualityTest();

            state._fsp--;

             current =iv_ruleFuncEqualityTest; 
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
    // $ANTLR end "entryRuleFuncEqualityTest"


    // $ANTLR start "ruleFuncEqualityTest"
    // InternalGoatComponentsParser.g:3286:1: ruleFuncEqualityTest returns [EObject current=null] : ( () ( (lv_op1_1_0= ruleFuncVal ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleFuncVal ) ) ) ;
    public final EObject ruleFuncEqualityTest() throws RecognitionException {
        EObject current = null;

        Token lv_operand_2_1=null;
        Token lv_operand_2_2=null;
        Token lv_operand_2_3=null;
        Token lv_operand_2_4=null;
        Token lv_operand_2_5=null;
        Token lv_operand_2_6=null;
        EObject lv_op1_1_0 = null;

        EObject lv_op2_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3292:2: ( ( () ( (lv_op1_1_0= ruleFuncVal ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleFuncVal ) ) ) )
            // InternalGoatComponentsParser.g:3293:2: ( () ( (lv_op1_1_0= ruleFuncVal ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleFuncVal ) ) )
            {
            // InternalGoatComponentsParser.g:3293:2: ( () ( (lv_op1_1_0= ruleFuncVal ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleFuncVal ) ) )
            // InternalGoatComponentsParser.g:3294:3: () ( (lv_op1_1_0= ruleFuncVal ) ) ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) ) ( (lv_op2_3_0= ruleFuncVal ) )
            {
            // InternalGoatComponentsParser.g:3294:3: ()
            // InternalGoatComponentsParser.g:3295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuncEqualityTestAccess().getFuncEqualityTestAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:3301:3: ( (lv_op1_1_0= ruleFuncVal ) )
            // InternalGoatComponentsParser.g:3302:4: (lv_op1_1_0= ruleFuncVal )
            {
            // InternalGoatComponentsParser.g:3302:4: (lv_op1_1_0= ruleFuncVal )
            // InternalGoatComponentsParser.g:3303:5: lv_op1_1_0= ruleFuncVal
            {

            					newCompositeNode(grammarAccess.getFuncEqualityTestAccess().getOp1FuncValParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
            lv_op1_1_0=ruleFuncVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncEqualityTestRule());
            					}
            					set(
            						current,
            						"op1",
            						lv_op1_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.FuncVal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:3320:3: ( ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) ) )
            // InternalGoatComponentsParser.g:3321:4: ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) )
            {
            // InternalGoatComponentsParser.g:3321:4: ( (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign ) )
            // InternalGoatComponentsParser.g:3322:5: (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign )
            {
            // InternalGoatComponentsParser.g:3322:5: (lv_operand_2_1= LessThanSign | lv_operand_2_2= GreaterThanSign | lv_operand_2_3= LessThanSignEqualsSign | lv_operand_2_4= GreaterThanSignEqualsSign | lv_operand_2_5= EqualsSign | lv_operand_2_6= ExclamationMarkEqualsSign )
            int alt50=6;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt50=1;
                }
                break;
            case GreaterThanSign:
                {
                alt50=2;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt50=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt50=4;
                }
                break;
            case EqualsSign:
                {
                alt50=5;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt50=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalGoatComponentsParser.g:3323:6: lv_operand_2_1= LessThanSign
                    {
                    lv_operand_2_1=(Token)match(input,LessThanSign,FOLLOW_47); 

                    						newLeafNode(lv_operand_2_1, grammarAccess.getFuncEqualityTestAccess().getOperandLessThanSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:3334:6: lv_operand_2_2= GreaterThanSign
                    {
                    lv_operand_2_2=(Token)match(input,GreaterThanSign,FOLLOW_47); 

                    						newLeafNode(lv_operand_2_2, grammarAccess.getFuncEqualityTestAccess().getOperandGreaterThanSignKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:3345:6: lv_operand_2_3= LessThanSignEqualsSign
                    {
                    lv_operand_2_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_47); 

                    						newLeafNode(lv_operand_2_3, grammarAccess.getFuncEqualityTestAccess().getOperandLessThanSignEqualsSignKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:3356:6: lv_operand_2_4= GreaterThanSignEqualsSign
                    {
                    lv_operand_2_4=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_47); 

                    						newLeafNode(lv_operand_2_4, grammarAccess.getFuncEqualityTestAccess().getOperandGreaterThanSignEqualsSignKeyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalGoatComponentsParser.g:3367:6: lv_operand_2_5= EqualsSign
                    {
                    lv_operand_2_5=(Token)match(input,EqualsSign,FOLLOW_47); 

                    						newLeafNode(lv_operand_2_5, grammarAccess.getFuncEqualityTestAccess().getOperandEqualsSignKeyword_2_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalGoatComponentsParser.g:3378:6: lv_operand_2_6= ExclamationMarkEqualsSign
                    {
                    lv_operand_2_6=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_47); 

                    						newLeafNode(lv_operand_2_6, grammarAccess.getFuncEqualityTestAccess().getOperandExclamationMarkEqualsSignKeyword_2_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncEqualityTestRule());
                    						}
                    						setWithLastConsumed(current, "operand", lv_operand_2_6, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalGoatComponentsParser.g:3391:3: ( (lv_op2_3_0= ruleFuncVal ) )
            // InternalGoatComponentsParser.g:3392:4: (lv_op2_3_0= ruleFuncVal )
            {
            // InternalGoatComponentsParser.g:3392:4: (lv_op2_3_0= ruleFuncVal )
            // InternalGoatComponentsParser.g:3393:5: lv_op2_3_0= ruleFuncVal
            {

            					newCompositeNode(grammarAccess.getFuncEqualityTestAccess().getOp2FuncValParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_op2_3_0=ruleFuncVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncEqualityTestRule());
            					}
            					set(
            						current,
            						"op2",
            						lv_op2_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.FuncVal");
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
    // $ANTLR end "ruleFuncEqualityTest"


    // $ANTLR start "entryRuleFuncIfElse"
    // InternalGoatComponentsParser.g:3414:1: entryRuleFuncIfElse returns [EObject current=null] : iv_ruleFuncIfElse= ruleFuncIfElse EOF ;
    public final EObject entryRuleFuncIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncIfElse = null;


        try {
            // InternalGoatComponentsParser.g:3414:51: (iv_ruleFuncIfElse= ruleFuncIfElse EOF )
            // InternalGoatComponentsParser.g:3415:2: iv_ruleFuncIfElse= ruleFuncIfElse EOF
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
    // InternalGoatComponentsParser.g:3421:1: ruleFuncIfElse returns [EObject current=null] : (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleFuncPredicate ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleFuncPredicate ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )? ) ;
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
            // InternalGoatComponentsParser.g:3427:2: ( (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleFuncPredicate ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleFuncPredicate ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )? ) )
            // InternalGoatComponentsParser.g:3428:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleFuncPredicate ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleFuncPredicate ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )? )
            {
            // InternalGoatComponentsParser.g:3428:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleFuncPredicate ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleFuncPredicate ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )? )
            // InternalGoatComponentsParser.g:3429:3: otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleFuncPredicate ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleFuncPredicate ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )* (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncIfElseAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:3437:3: ( (lv_test_2_0= ruleFuncPredicate ) )
            // InternalGoatComponentsParser.g:3438:4: (lv_test_2_0= ruleFuncPredicate )
            {
            // InternalGoatComponentsParser.g:3438:4: (lv_test_2_0= ruleFuncPredicate )
            // InternalGoatComponentsParser.g:3439:5: lv_test_2_0= ruleFuncPredicate
            {

            					newCompositeNode(grammarAccess.getFuncIfElseAccess().getTestFuncPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_test_2_0=ruleFuncPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
            					}
            					add(
            						current,
            						"test",
            						lv_test_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.FuncPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:3460:3: ( (lv_then_4_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:3461:4: (lv_then_4_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:3461:4: (lv_then_4_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:3462:5: lv_then_4_0= ruleFuncBlock
            {

            					newCompositeNode(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_50);
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

            // InternalGoatComponentsParser.g:3479:3: (otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleFuncPredicate ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Elif) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3480:4: otherlv_5= Elif otherlv_6= LeftParenthesis ( (lv_test_7_0= ruleFuncPredicate ) ) otherlv_8= RightParenthesis ( (lv_then_9_0= ruleFuncBlock ) )
            	    {
            	    otherlv_5=(Token)match(input,Elif,FOLLOW_12); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFuncIfElseAccess().getElifKeyword_5_0());
            	    			
            	    otherlv_6=(Token)match(input,LeftParenthesis,FOLLOW_48); 

            	    				newLeafNode(otherlv_6, grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_5_1());
            	    			
            	    // InternalGoatComponentsParser.g:3488:4: ( (lv_test_7_0= ruleFuncPredicate ) )
            	    // InternalGoatComponentsParser.g:3489:5: (lv_test_7_0= ruleFuncPredicate )
            	    {
            	    // InternalGoatComponentsParser.g:3489:5: (lv_test_7_0= ruleFuncPredicate )
            	    // InternalGoatComponentsParser.g:3490:6: lv_test_7_0= ruleFuncPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getTestFuncPredicateParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_test_7_0=ruleFuncPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"test",
            	    							lv_test_7_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_28); 

            	    				newLeafNode(otherlv_8, grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_5_3());
            	    			
            	    // InternalGoatComponentsParser.g:3511:4: ( (lv_then_9_0= ruleFuncBlock ) )
            	    // InternalGoatComponentsParser.g:3512:5: (lv_then_9_0= ruleFuncBlock )
            	    {
            	    // InternalGoatComponentsParser.g:3512:5: (lv_then_9_0= ruleFuncBlock )
            	    // InternalGoatComponentsParser.g:3513:6: lv_then_9_0= ruleFuncBlock
            	    {

            	    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_5_4_0());
            	    					
            	    pushFollow(FOLLOW_50);
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
            	    break loop51;
                }
            } while (true);

            // InternalGoatComponentsParser.g:3531:3: (otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Else) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGoatComponentsParser.g:3532:4: otherlv_10= Else ( (lv_elseBranch_11_0= ruleFuncBlock ) )
                    {
                    otherlv_10=(Token)match(input,Else,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getFuncIfElseAccess().getElseKeyword_6_0());
                    			
                    // InternalGoatComponentsParser.g:3536:4: ( (lv_elseBranch_11_0= ruleFuncBlock ) )
                    // InternalGoatComponentsParser.g:3537:5: (lv_elseBranch_11_0= ruleFuncBlock )
                    {
                    // InternalGoatComponentsParser.g:3537:5: (lv_elseBranch_11_0= ruleFuncBlock )
                    // InternalGoatComponentsParser.g:3538:6: lv_elseBranch_11_0= ruleFuncBlock
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
    // InternalGoatComponentsParser.g:3560:1: entryRuleFuncReturn returns [EObject current=null] : iv_ruleFuncReturn= ruleFuncReturn EOF ;
    public final EObject entryRuleFuncReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncReturn = null;


        try {
            // InternalGoatComponentsParser.g:3560:51: (iv_ruleFuncReturn= ruleFuncReturn EOF )
            // InternalGoatComponentsParser.g:3561:2: iv_ruleFuncReturn= ruleFuncReturn EOF
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
    // InternalGoatComponentsParser.g:3567:1: ruleFuncReturn returns [EObject current=null] : (otherlv_0= Return ( (lv_val_1_0= ruleFuncVal ) ) ) ;
    public final EObject ruleFuncReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3573:2: ( (otherlv_0= Return ( (lv_val_1_0= ruleFuncVal ) ) ) )
            // InternalGoatComponentsParser.g:3574:2: (otherlv_0= Return ( (lv_val_1_0= ruleFuncVal ) ) )
            {
            // InternalGoatComponentsParser.g:3574:2: (otherlv_0= Return ( (lv_val_1_0= ruleFuncVal ) ) )
            // InternalGoatComponentsParser.g:3575:3: otherlv_0= Return ( (lv_val_1_0= ruleFuncVal ) )
            {
            otherlv_0=(Token)match(input,Return,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncReturnAccess().getReturnKeyword_0());
            		
            // InternalGoatComponentsParser.g:3579:3: ( (lv_val_1_0= ruleFuncVal ) )
            // InternalGoatComponentsParser.g:3580:4: (lv_val_1_0= ruleFuncVal )
            {
            // InternalGoatComponentsParser.g:3580:4: (lv_val_1_0= ruleFuncVal )
            // InternalGoatComponentsParser.g:3581:5: lv_val_1_0= ruleFuncVal
            {

            					newCompositeNode(grammarAccess.getFuncReturnAccess().getValFuncValParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleFuncVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncReturnRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.FuncVal");
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000880000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000050003006140L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010004002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010042000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000050004002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000050000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040020000200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000108C2400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008010000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000050002006140L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000380190000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000018000408080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000050003004100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000050002004100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000C02L});

}