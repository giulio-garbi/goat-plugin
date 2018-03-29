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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Infrastructure", "Environment", "Component", "Function", "Receiver", "Process", "Receive", "Waitfor", "Append", "Length", "Return", "False", "Print", "Spawn", "While", "Call", "Case", "Comp", "Else", "Loop", "Proc", "Send", "True", "Pop", "Set", "Var", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "PlusSignPlusSign", "ColonEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "If", "In", "VerticalLineVerticalLine", "ExclamationMark", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_TYPE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Var=29;
    public static final int True=26;
    public static final int Process=9;
    public static final int False=15;
    public static final int LessThanSign=52;
    public static final int Comp=21;
    public static final int Send=25;
    public static final int Print=16;
    public static final int PercentSign=41;
    public static final int LeftParenthesis=42;
    public static final int Spawn=17;
    public static final int RightSquareBracket=57;
    public static final int ExclamationMark=40;
    public static final int GreaterThanSign=54;
    public static final int RULE_ID=62;
    public static final int RightParenthesis=43;
    public static final int Receiver=8;
    public static final int ColonEqualsSign=33;
    public static final int GreaterThanSignEqualsSign=36;
    public static final int Pop=27;
    public static final int EqualsSignEqualsSign=35;
    public static final int RULE_TYPE=61;
    public static final int VerticalLine=59;
    public static final int PlusSign=45;
    public static final int RULE_INT=63;
    public static final int RULE_ML_COMMENT=65;
    public static final int Environment=5;
    public static final int LeftSquareBracket=56;
    public static final int If=37;
    public static final int Set=28;
    public static final int In=38;
    public static final int VerticalLineVerticalLine=39;
    public static final int RULE_STRING=64;
    public static final int Case=20;
    public static final int RULE_SL_COMMENT=66;
    public static final int Proc=24;
    public static final int Function=7;
    public static final int Comma=46;
    public static final int EqualsSign=53;
    public static final int HyphenMinus=47;
    public static final int AmpersandAmpersand=31;
    public static final int Waitfor=11;
    public static final int Infrastructure=4;
    public static final int LessThanSignEqualsSign=34;
    public static final int Solidus=49;
    public static final int Colon=50;
    public static final int RightCurlyBracket=60;
    public static final int Component=6;
    public static final int EOF=-1;
    public static final int Asterisk=44;
    public static final int Loop=23;
    public static final int Call=19;
    public static final int FullStop=48;
    public static final int Return=14;
    public static final int RULE_WS=67;
    public static final int LeftCurlyBracket=58;
    public static final int While=18;
    public static final int RULE_ANY_OTHER=68;
    public static final int CommercialAt=55;
    public static final int Semicolon=51;
    public static final int Append=12;
    public static final int Length=13;
    public static final int PlusSignPlusSign=32;
    public static final int Receive=10;
    public static final int Else=22;
    public static final int ExclamationMarkEqualsSign=30;

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
    // InternalGoatComponentsParser.g:64:1: ruleModel returns [EObject current=null] : ( () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_processes_3_1 = null;

        EObject lv_processes_3_2 = null;

        EObject lv_components_4_0 = null;

        EObject lv_functions_5_0 = null;

        EObject lv_environments_6_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:70:2: ( ( () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )* ) )
            // InternalGoatComponentsParser.g:71:2: ( () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )* )
            {
            // InternalGoatComponentsParser.g:71:2: ( () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )* )
            // InternalGoatComponentsParser.g:72:3: () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )*
            {
            // InternalGoatComponentsParser.g:72:3: ()
            // InternalGoatComponentsParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Infrastructure,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getInfrastructureKeyword_1());
            		
            // InternalGoatComponentsParser.g:83:3: ( (otherlv_2= RULE_ID ) )
            // InternalGoatComponentsParser.g:84:4: (otherlv_2= RULE_ID )
            {
            // InternalGoatComponentsParser.g:84:4: (otherlv_2= RULE_ID )
            // InternalGoatComponentsParser.g:85:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_2, grammarAccess.getModelAccess().getInfrastructureInfrastructureCrossReference_2_0());
            				

            }


            }

            // InternalGoatComponentsParser.g:96:3: ( ( ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case Process:
                    {
                    alt2=1;
                    }
                    break;
                case Component:
                    {
                    alt2=2;
                    }
                    break;
                case Function:
                    {
                    alt2=3;
                    }
                    break;
                case Environment:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:97:4: ( ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) ) )
            	    {
            	    // InternalGoatComponentsParser.g:97:4: ( ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) ) )
            	    // InternalGoatComponentsParser.g:98:5: ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) )
            	    {
            	    // InternalGoatComponentsParser.g:98:5: ( (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar ) )
            	    // InternalGoatComponentsParser.g:99:6: (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar )
            	    {
            	    // InternalGoatComponentsParser.g:99:6: (lv_processes_3_1= ruleProcessDefinitionBlk | lv_processes_3_2= ruleProcessDefinitionPar )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==Process) ) {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==RULE_ID) ) {
            	            int LA1_2 = input.LA(3);

            	            if ( (LA1_2==LeftCurlyBracket) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_2==EqualsSign) ) {
            	                alt1=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 1, 2, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 1, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalGoatComponentsParser.g:100:7: lv_processes_3_1= ruleProcessDefinitionBlk
            	            {

            	            							newCompositeNode(grammarAccess.getModelAccess().getProcessesProcessDefinitionBlkParserRuleCall_3_0_0_0());
            	            						
            	            pushFollow(FOLLOW_4);
            	            lv_processes_3_1=ruleProcessDefinitionBlk();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getModelRule());
            	            							}
            	            							add(
            	            								current,
            	            								"processes",
            	            								lv_processes_3_1,
            	            								"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessDefinitionBlk");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGoatComponentsParser.g:116:7: lv_processes_3_2= ruleProcessDefinitionPar
            	            {

            	            							newCompositeNode(grammarAccess.getModelAccess().getProcessesProcessDefinitionParParserRuleCall_3_0_0_1());
            	            						
            	            pushFollow(FOLLOW_4);
            	            lv_processes_3_2=ruleProcessDefinitionPar();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getModelRule());
            	            							}
            	            							add(
            	            								current,
            	            								"processes",
            	            								lv_processes_3_2,
            	            								"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessDefinitionPar");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGoatComponentsParser.g:135:4: ( (lv_components_4_0= ruleComponentDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:135:4: ( (lv_components_4_0= ruleComponentDefinition ) )
            	    // InternalGoatComponentsParser.g:136:5: (lv_components_4_0= ruleComponentDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:136:5: (lv_components_4_0= ruleComponentDefinition )
            	    // InternalGoatComponentsParser.g:137:6: lv_components_4_0= ruleComponentDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentDefinitionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_components_4_0=ruleComponentDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_4_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.ComponentDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGoatComponentsParser.g:155:4: ( (lv_functions_5_0= ruleFuncDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:155:4: ( (lv_functions_5_0= ruleFuncDefinition ) )
            	    // InternalGoatComponentsParser.g:156:5: (lv_functions_5_0= ruleFuncDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:156:5: (lv_functions_5_0= ruleFuncDefinition )
            	    // InternalGoatComponentsParser.g:157:6: lv_functions_5_0= ruleFuncDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getFunctionsFuncDefinitionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_functions_5_0=ruleFuncDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"functions",
            	    							lv_functions_5_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalGoatComponentsParser.g:175:4: ( (lv_environments_6_0= ruleEnvironmentDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:175:4: ( (lv_environments_6_0= ruleEnvironmentDefinition ) )
            	    // InternalGoatComponentsParser.g:176:5: (lv_environments_6_0= ruleEnvironmentDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:176:5: (lv_environments_6_0= ruleEnvironmentDefinition )
            	    // InternalGoatComponentsParser.g:177:6: lv_environments_6_0= ruleEnvironmentDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getEnvironmentsEnvironmentDefinitionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_environments_6_0=ruleEnvironmentDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_6_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.EnvironmentDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleProcessDefinitionBlk"
    // InternalGoatComponentsParser.g:199:1: entryRuleProcessDefinitionBlk returns [EObject current=null] : iv_ruleProcessDefinitionBlk= ruleProcessDefinitionBlk EOF ;
    public final EObject entryRuleProcessDefinitionBlk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessDefinitionBlk = null;


        try {
            // InternalGoatComponentsParser.g:199:61: (iv_ruleProcessDefinitionBlk= ruleProcessDefinitionBlk EOF )
            // InternalGoatComponentsParser.g:200:2: iv_ruleProcessDefinitionBlk= ruleProcessDefinitionBlk EOF
            {
             newCompositeNode(grammarAccess.getProcessDefinitionBlkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessDefinitionBlk=ruleProcessDefinitionBlk();

            state._fsp--;

             current =iv_ruleProcessDefinitionBlk; 
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
    // $ANTLR end "entryRuleProcessDefinitionBlk"


    // $ANTLR start "ruleProcessDefinitionBlk"
    // InternalGoatComponentsParser.g:206:1: ruleProcessDefinitionBlk returns [EObject current=null] : (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (lv_block_2_0= ruleProcessBlock ) ) ) ;
    public final EObject ruleProcessDefinitionBlk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:212:2: ( (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (lv_block_2_0= ruleProcessBlock ) ) ) )
            // InternalGoatComponentsParser.g:213:2: (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (lv_block_2_0= ruleProcessBlock ) ) )
            {
            // InternalGoatComponentsParser.g:213:2: (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (lv_block_2_0= ruleProcessBlock ) ) )
            // InternalGoatComponentsParser.g:214:3: otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (lv_block_2_0= ruleProcessBlock ) )
            {
            otherlv_0=(Token)match(input,Process,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessDefinitionBlkAccess().getProcessKeyword_0());
            		
            // InternalGoatComponentsParser.g:218:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:219:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:219:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:220:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessDefinitionBlkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessDefinitionBlkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGoatComponentsParser.g:236:3: ( (lv_block_2_0= ruleProcessBlock ) )
            // InternalGoatComponentsParser.g:237:4: (lv_block_2_0= ruleProcessBlock )
            {
            // InternalGoatComponentsParser.g:237:4: (lv_block_2_0= ruleProcessBlock )
            // InternalGoatComponentsParser.g:238:5: lv_block_2_0= ruleProcessBlock
            {

            					newCompositeNode(grammarAccess.getProcessDefinitionBlkAccess().getBlockProcessBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_2_0=ruleProcessBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessDefinitionBlkRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessBlock");
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
    // $ANTLR end "ruleProcessDefinitionBlk"


    // $ANTLR start "entryRuleProcessDefinitionPar"
    // InternalGoatComponentsParser.g:259:1: entryRuleProcessDefinitionPar returns [EObject current=null] : iv_ruleProcessDefinitionPar= ruleProcessDefinitionPar EOF ;
    public final EObject entryRuleProcessDefinitionPar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessDefinitionPar = null;


        try {
            // InternalGoatComponentsParser.g:259:61: (iv_ruleProcessDefinitionPar= ruleProcessDefinitionPar EOF )
            // InternalGoatComponentsParser.g:260:2: iv_ruleProcessDefinitionPar= ruleProcessDefinitionPar EOF
            {
             newCompositeNode(grammarAccess.getProcessDefinitionParRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessDefinitionPar=ruleProcessDefinitionPar();

            state._fsp--;

             current =iv_ruleProcessDefinitionPar; 
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
    // $ANTLR end "entryRuleProcessDefinitionPar"


    // $ANTLR start "ruleProcessDefinitionPar"
    // InternalGoatComponentsParser.g:266:1: ruleProcessDefinitionPar returns [EObject current=null] : (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) ) ;
    public final EObject ruleProcessDefinitionPar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:272:2: ( (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) ) )
            // InternalGoatComponentsParser.g:273:2: (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) )
            {
            // InternalGoatComponentsParser.g:273:2: (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) )
            // InternalGoatComponentsParser.g:274:3: otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) )
            {
            otherlv_0=(Token)match(input,Process,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessDefinitionParAccess().getProcessKeyword_0());
            		
            // InternalGoatComponentsParser.g:278:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:279:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:279:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:280:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessDefinitionParAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessDefinitionParRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessDefinitionParAccess().getEqualsSignKeyword_2());
            		
            // InternalGoatComponentsParser.g:300:3: ( (lv_block_3_0= rulePDPBlock ) )
            // InternalGoatComponentsParser.g:301:4: (lv_block_3_0= rulePDPBlock )
            {
            // InternalGoatComponentsParser.g:301:4: (lv_block_3_0= rulePDPBlock )
            // InternalGoatComponentsParser.g:302:5: lv_block_3_0= rulePDPBlock
            {

            					newCompositeNode(grammarAccess.getProcessDefinitionParAccess().getBlockPDPBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_3_0=rulePDPBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessDefinitionParRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.PDPBlock");
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
    // $ANTLR end "ruleProcessDefinitionPar"


    // $ANTLR start "entryRulePDPBlock"
    // InternalGoatComponentsParser.g:323:1: entryRulePDPBlock returns [EObject current=null] : iv_rulePDPBlock= rulePDPBlock EOF ;
    public final EObject entryRulePDPBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDPBlock = null;


        try {
            // InternalGoatComponentsParser.g:323:49: (iv_rulePDPBlock= rulePDPBlock EOF )
            // InternalGoatComponentsParser.g:324:2: iv_rulePDPBlock= rulePDPBlock EOF
            {
             newCompositeNode(grammarAccess.getPDPBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePDPBlock=rulePDPBlock();

            state._fsp--;

             current =iv_rulePDPBlock; 
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
    // $ANTLR end "entryRulePDPBlock"


    // $ANTLR start "rulePDPBlock"
    // InternalGoatComponentsParser.g:330:1: rulePDPBlock returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= VerticalLine )* ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePDPBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:336:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= VerticalLine )* ( (otherlv_2= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:337:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= VerticalLine )* ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:337:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= VerticalLine )* ( (otherlv_2= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:338:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= VerticalLine )* ( (otherlv_2= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:338:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= VerticalLine )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==VerticalLine) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:339:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= VerticalLine
            	    {
            	    // InternalGoatComponentsParser.g:339:4: ( (otherlv_0= RULE_ID ) )
            	    // InternalGoatComponentsParser.g:340:5: (otherlv_0= RULE_ID )
            	    {
            	    // InternalGoatComponentsParser.g:340:5: (otherlv_0= RULE_ID )
            	    // InternalGoatComponentsParser.g:341:6: otherlv_0= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPDPBlockRule());
            	    						}
            	    					
            	    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(otherlv_0, grammarAccess.getPDPBlockAccess().getProcsProcessDefinitionCrossReference_0_0_0());
            	    					

            	    }


            	    }

            	    otherlv_1=(Token)match(input,VerticalLine,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPDPBlockAccess().getVerticalLineKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalGoatComponentsParser.g:357:3: ( (otherlv_2= RULE_ID ) )
            // InternalGoatComponentsParser.g:358:4: (otherlv_2= RULE_ID )
            {
            // InternalGoatComponentsParser.g:358:4: (otherlv_2= RULE_ID )
            // InternalGoatComponentsParser.g:359:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPDPBlockRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getPDPBlockAccess().getProcsProcessDefinitionCrossReference_1_0());
            				

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
    // $ANTLR end "rulePDPBlock"


    // $ANTLR start "entryRuleProcessBlock"
    // InternalGoatComponentsParser.g:374:1: entryRuleProcessBlock returns [EObject current=null] : iv_ruleProcessBlock= ruleProcessBlock EOF ;
    public final EObject entryRuleProcessBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBlock = null;


        try {
            // InternalGoatComponentsParser.g:374:53: (iv_ruleProcessBlock= ruleProcessBlock EOF )
            // InternalGoatComponentsParser.g:375:2: iv_ruleProcessBlock= ruleProcessBlock EOF
            {
             newCompositeNode(grammarAccess.getProcessBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBlock=ruleProcessBlock();

            state._fsp--;

             current =iv_ruleProcessBlock; 
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
    // $ANTLR end "entryRuleProcessBlock"


    // $ANTLR start "ruleProcessBlock"
    // InternalGoatComponentsParser.g:381:1: ruleProcessBlock returns [EObject current=null] : (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleProcessBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:387:2: ( (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:388:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:388:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket )
            // InternalGoatComponentsParser.g:389:3: otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:393:3: ()
            // InternalGoatComponentsParser.g:394:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessBlockAccess().getProcessBlockAction_1(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:400:3: ( (lv_statements_2_0= ruleProcessStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=Receive && LA4_0<=Waitfor)||LA4_0==Spawn||LA4_0==Call||LA4_0==Loop||LA4_0==Send||LA4_0==Set||LA4_0==If) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:401:4: (lv_statements_2_0= ruleProcessStatement )
            	    {
            	    // InternalGoatComponentsParser.g:401:4: (lv_statements_2_0= ruleProcessStatement )
            	    // InternalGoatComponentsParser.g:402:5: lv_statements_2_0= ruleProcessStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessBlockAccess().getStatementsProcessStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_statements_2_0=ruleProcessStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleProcessBlock"


    // $ANTLR start "entryRuleProcessStatement"
    // InternalGoatComponentsParser.g:427:1: entryRuleProcessStatement returns [EObject current=null] : iv_ruleProcessStatement= ruleProcessStatement EOF ;
    public final EObject entryRuleProcessStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessStatement = null;


        try {
            // InternalGoatComponentsParser.g:427:57: (iv_ruleProcessStatement= ruleProcessStatement EOF )
            // InternalGoatComponentsParser.g:428:2: iv_ruleProcessStatement= ruleProcessStatement EOF
            {
             newCompositeNode(grammarAccess.getProcessStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessStatement=ruleProcessStatement();

            state._fsp--;

             current =iv_ruleProcessStatement; 
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
    // $ANTLR end "entryRuleProcessStatement"


    // $ANTLR start "ruleProcessStatement"
    // InternalGoatComponentsParser.g:434:1: ruleProcessStatement returns [EObject current=null] : (this_ProcessSpawn_0= ruleProcessSpawn | this_ProcessCall_1= ruleProcessCall | this_ProcessSend_2= ruleProcessSend | this_ProcessReceive_3= ruleProcessReceive | this_ProcessIf_4= ruleProcessIf | this_ProcessSet_5= ruleProcessSet | this_ProcessWaitFor_6= ruleProcessWaitFor | this_ProcessLoop_7= ruleProcessLoop ) ;
    public final EObject ruleProcessStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessSpawn_0 = null;

        EObject this_ProcessCall_1 = null;

        EObject this_ProcessSend_2 = null;

        EObject this_ProcessReceive_3 = null;

        EObject this_ProcessIf_4 = null;

        EObject this_ProcessSet_5 = null;

        EObject this_ProcessWaitFor_6 = null;

        EObject this_ProcessLoop_7 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:440:2: ( (this_ProcessSpawn_0= ruleProcessSpawn | this_ProcessCall_1= ruleProcessCall | this_ProcessSend_2= ruleProcessSend | this_ProcessReceive_3= ruleProcessReceive | this_ProcessIf_4= ruleProcessIf | this_ProcessSet_5= ruleProcessSet | this_ProcessWaitFor_6= ruleProcessWaitFor | this_ProcessLoop_7= ruleProcessLoop ) )
            // InternalGoatComponentsParser.g:441:2: (this_ProcessSpawn_0= ruleProcessSpawn | this_ProcessCall_1= ruleProcessCall | this_ProcessSend_2= ruleProcessSend | this_ProcessReceive_3= ruleProcessReceive | this_ProcessIf_4= ruleProcessIf | this_ProcessSet_5= ruleProcessSet | this_ProcessWaitFor_6= ruleProcessWaitFor | this_ProcessLoop_7= ruleProcessLoop )
            {
            // InternalGoatComponentsParser.g:441:2: (this_ProcessSpawn_0= ruleProcessSpawn | this_ProcessCall_1= ruleProcessCall | this_ProcessSend_2= ruleProcessSend | this_ProcessReceive_3= ruleProcessReceive | this_ProcessIf_4= ruleProcessIf | this_ProcessSet_5= ruleProcessSet | this_ProcessWaitFor_6= ruleProcessWaitFor | this_ProcessLoop_7= ruleProcessLoop )
            int alt5=8;
            switch ( input.LA(1) ) {
            case Spawn:
                {
                alt5=1;
                }
                break;
            case Call:
                {
                alt5=2;
                }
                break;
            case Send:
                {
                alt5=3;
                }
                break;
            case Receive:
                {
                alt5=4;
                }
                break;
            case If:
                {
                alt5=5;
                }
                break;
            case Set:
                {
                alt5=6;
                }
                break;
            case Waitfor:
                {
                alt5=7;
                }
                break;
            case Loop:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGoatComponentsParser.g:442:3: this_ProcessSpawn_0= ruleProcessSpawn
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementAccess().getProcessSpawnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessSpawn_0=ruleProcessSpawn();

                    state._fsp--;


                    			current = this_ProcessSpawn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:451:3: this_ProcessCall_1= ruleProcessCall
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementAccess().getProcessCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessCall_1=ruleProcessCall();

                    state._fsp--;


                    			current = this_ProcessCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:460:3: this_ProcessSend_2= ruleProcessSend
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementAccess().getProcessSendParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessSend_2=ruleProcessSend();

                    state._fsp--;


                    			current = this_ProcessSend_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:469:3: this_ProcessReceive_3= ruleProcessReceive
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementAccess().getProcessReceiveParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessReceive_3=ruleProcessReceive();

                    state._fsp--;


                    			current = this_ProcessReceive_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGoatComponentsParser.g:478:3: this_ProcessIf_4= ruleProcessIf
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementAccess().getProcessIfParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessIf_4=ruleProcessIf();

                    state._fsp--;


                    			current = this_ProcessIf_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGoatComponentsParser.g:487:3: this_ProcessSet_5= ruleProcessSet
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementAccess().getProcessSetParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessSet_5=ruleProcessSet();

                    state._fsp--;


                    			current = this_ProcessSet_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGoatComponentsParser.g:496:3: this_ProcessWaitFor_6= ruleProcessWaitFor
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementAccess().getProcessWaitForParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessWaitFor_6=ruleProcessWaitFor();

                    state._fsp--;


                    			current = this_ProcessWaitFor_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGoatComponentsParser.g:505:3: this_ProcessLoop_7= ruleProcessLoop
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementAccess().getProcessLoopParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessLoop_7=ruleProcessLoop();

                    state._fsp--;


                    			current = this_ProcessLoop_7;
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
    // $ANTLR end "ruleProcessStatement"


    // $ANTLR start "entryRuleProcessSpawn"
    // InternalGoatComponentsParser.g:517:1: entryRuleProcessSpawn returns [EObject current=null] : iv_ruleProcessSpawn= ruleProcessSpawn EOF ;
    public final EObject entryRuleProcessSpawn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessSpawn = null;


        try {
            // InternalGoatComponentsParser.g:517:53: (iv_ruleProcessSpawn= ruleProcessSpawn EOF )
            // InternalGoatComponentsParser.g:518:2: iv_ruleProcessSpawn= ruleProcessSpawn EOF
            {
             newCompositeNode(grammarAccess.getProcessSpawnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessSpawn=ruleProcessSpawn();

            state._fsp--;

             current =iv_ruleProcessSpawn; 
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
    // $ANTLR end "entryRuleProcessSpawn"


    // $ANTLR start "ruleProcessSpawn"
    // InternalGoatComponentsParser.g:524:1: ruleProcessSpawn returns [EObject current=null] : (otherlv_0= Spawn otherlv_1= LeftParenthesis ( (lv_blk_2_0= rulePDPBlock ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleProcessSpawn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_blk_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:530:2: ( (otherlv_0= Spawn otherlv_1= LeftParenthesis ( (lv_blk_2_0= rulePDPBlock ) ) otherlv_3= RightParenthesis ) )
            // InternalGoatComponentsParser.g:531:2: (otherlv_0= Spawn otherlv_1= LeftParenthesis ( (lv_blk_2_0= rulePDPBlock ) ) otherlv_3= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:531:2: (otherlv_0= Spawn otherlv_1= LeftParenthesis ( (lv_blk_2_0= rulePDPBlock ) ) otherlv_3= RightParenthesis )
            // InternalGoatComponentsParser.g:532:3: otherlv_0= Spawn otherlv_1= LeftParenthesis ( (lv_blk_2_0= rulePDPBlock ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Spawn,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessSpawnAccess().getSpawnKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessSpawnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:540:3: ( (lv_blk_2_0= rulePDPBlock ) )
            // InternalGoatComponentsParser.g:541:4: (lv_blk_2_0= rulePDPBlock )
            {
            // InternalGoatComponentsParser.g:541:4: (lv_blk_2_0= rulePDPBlock )
            // InternalGoatComponentsParser.g:542:5: lv_blk_2_0= rulePDPBlock
            {

            					newCompositeNode(grammarAccess.getProcessSpawnAccess().getBlkPDPBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_blk_2_0=rulePDPBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessSpawnRule());
            					}
            					set(
            						current,
            						"blk",
            						lv_blk_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.PDPBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessSpawnAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleProcessSpawn"


    // $ANTLR start "entryRuleProcessCall"
    // InternalGoatComponentsParser.g:567:1: entryRuleProcessCall returns [EObject current=null] : iv_ruleProcessCall= ruleProcessCall EOF ;
    public final EObject entryRuleProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessCall = null;


        try {
            // InternalGoatComponentsParser.g:567:52: (iv_ruleProcessCall= ruleProcessCall EOF )
            // InternalGoatComponentsParser.g:568:2: iv_ruleProcessCall= ruleProcessCall EOF
            {
             newCompositeNode(grammarAccess.getProcessCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessCall=ruleProcessCall();

            state._fsp--;

             current =iv_ruleProcessCall; 
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
    // $ANTLR end "entryRuleProcessCall"


    // $ANTLR start "ruleProcessCall"
    // InternalGoatComponentsParser.g:574:1: ruleProcessCall returns [EObject current=null] : (otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleProcessCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:580:2: ( (otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGoatComponentsParser.g:581:2: (otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:581:2: (otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGoatComponentsParser.g:582:3: otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Call,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessCallAccess().getCallKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:590:3: ( (otherlv_2= RULE_ID ) )
            // InternalGoatComponentsParser.g:591:4: (otherlv_2= RULE_ID )
            {
            // InternalGoatComponentsParser.g:591:4: (otherlv_2= RULE_ID )
            // InternalGoatComponentsParser.g:592:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessCallRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getProcessCallAccess().getProcProcessDefinitionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleProcessCall"


    // $ANTLR start "entryRuleProcessSend"
    // InternalGoatComponentsParser.g:611:1: entryRuleProcessSend returns [EObject current=null] : iv_ruleProcessSend= ruleProcessSend EOF ;
    public final EObject entryRuleProcessSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessSend = null;


        try {
            // InternalGoatComponentsParser.g:611:52: (iv_ruleProcessSend= ruleProcessSend EOF )
            // InternalGoatComponentsParser.g:612:2: iv_ruleProcessSend= ruleProcessSend EOF
            {
             newCompositeNode(grammarAccess.getProcessSendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessSend=ruleProcessSend();

            state._fsp--;

             current =iv_ruleProcessSend; 
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
    // $ANTLR end "entryRuleProcessSend"


    // $ANTLR start "ruleProcessSend"
    // InternalGoatComponentsParser.g:618:1: ruleProcessSend returns [EObject current=null] : (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon ) ;
    public final EObject ruleProcessSend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_msgOutParts_2_0 = null;

        EObject lv_msgOutParts_4_0 = null;

        EObject lv_send_pred_8_0 = null;

        EObject lv_updates_10_0 = null;

        EObject lv_print_11_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:624:2: ( (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon ) )
            // InternalGoatComponentsParser.g:625:2: (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon )
            {
            // InternalGoatComponentsParser.g:625:2: (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon )
            // InternalGoatComponentsParser.g:626:3: otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon
            {
            otherlv_0=(Token)match(input,Send,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessSendAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessSendAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:634:3: ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Length||LA7_0==False||LA7_0==Comp||LA7_0==Proc||LA7_0==True||LA7_0==ExclamationMark||LA7_0==LeftParenthesis||LA7_0==HyphenMinus||LA7_0==LeftSquareBracket||(LA7_0>=RULE_ID && LA7_0<=RULE_STRING)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoatComponentsParser.g:635:4: ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )*
                    {
                    // InternalGoatComponentsParser.g:635:4: ( (lv_msgOutParts_2_0= ruleExpression ) )
                    // InternalGoatComponentsParser.g:636:5: (lv_msgOutParts_2_0= ruleExpression )
                    {
                    // InternalGoatComponentsParser.g:636:5: (lv_msgOutParts_2_0= ruleExpression )
                    // InternalGoatComponentsParser.g:637:6: lv_msgOutParts_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getProcessSendAccess().getMsgOutPartsExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_msgOutParts_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessSendRule());
                    						}
                    						add(
                    							current,
                    							"msgOutParts",
                    							lv_msgOutParts_2_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:654:4: (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:655:5: otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getProcessSendAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:659:5: ( (lv_msgOutParts_4_0= ruleExpression ) )
                    	    // InternalGoatComponentsParser.g:660:6: (lv_msgOutParts_4_0= ruleExpression )
                    	    {
                    	    // InternalGoatComponentsParser.g:660:6: (lv_msgOutParts_4_0= ruleExpression )
                    	    // InternalGoatComponentsParser.g:661:7: lv_msgOutParts_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessSendAccess().getMsgOutPartsExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_msgOutParts_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessSendRule());
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
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessSendAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_6=(Token)match(input,CommercialAt,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessSendAccess().getCommercialAtKeyword_4());
            		
            otherlv_7=(Token)match(input,LeftParenthesis,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getProcessSendAccess().getLeftParenthesisKeyword_5());
            		
            // InternalGoatComponentsParser.g:692:3: ( (lv_send_pred_8_0= ruleOutputPredicate ) )
            // InternalGoatComponentsParser.g:693:4: (lv_send_pred_8_0= ruleOutputPredicate )
            {
            // InternalGoatComponentsParser.g:693:4: (lv_send_pred_8_0= ruleOutputPredicate )
            // InternalGoatComponentsParser.g:694:5: lv_send_pred_8_0= ruleOutputPredicate
            {

            					newCompositeNode(grammarAccess.getProcessSendAccess().getSend_predOutputPredicateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_send_pred_8_0=ruleOutputPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessSendRule());
            					}
            					set(
            						current,
            						"send_pred",
            						lv_send_pred_8_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.OutputPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getProcessSendAccess().getRightParenthesisKeyword_7());
            		
            // InternalGoatComponentsParser.g:715:3: ( (lv_updates_10_0= ruleUpdate ) )
            // InternalGoatComponentsParser.g:716:4: (lv_updates_10_0= ruleUpdate )
            {
            // InternalGoatComponentsParser.g:716:4: (lv_updates_10_0= ruleUpdate )
            // InternalGoatComponentsParser.g:717:5: lv_updates_10_0= ruleUpdate
            {

            					newCompositeNode(grammarAccess.getProcessSendAccess().getUpdatesUpdateParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_updates_10_0=ruleUpdate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessSendRule());
            					}
            					set(
            						current,
            						"updates",
            						lv_updates_10_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Update");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:734:3: ( (lv_print_11_0= rulePrintStatement ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Print) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoatComponentsParser.g:735:4: (lv_print_11_0= rulePrintStatement )
                    {
                    // InternalGoatComponentsParser.g:735:4: (lv_print_11_0= rulePrintStatement )
                    // InternalGoatComponentsParser.g:736:5: lv_print_11_0= rulePrintStatement
                    {

                    					newCompositeNode(grammarAccess.getProcessSendAccess().getPrintPrintStatementParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_print_11_0=rulePrintStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcessSendRule());
                    					}
                    					set(
                    						current,
                    						"print",
                    						lv_print_11_0,
                    						"com.sysma.goat.eclipse_plugin.GoatComponents.PrintStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getProcessSendAccess().getSemicolonKeyword_10());
            		

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
    // $ANTLR end "ruleProcessSend"


    // $ANTLR start "entryRuleProcessReceive"
    // InternalGoatComponentsParser.g:761:1: entryRuleProcessReceive returns [EObject current=null] : iv_ruleProcessReceive= ruleProcessReceive EOF ;
    public final EObject entryRuleProcessReceive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessReceive = null;


        try {
            // InternalGoatComponentsParser.g:761:55: (iv_ruleProcessReceive= ruleProcessReceive EOF )
            // InternalGoatComponentsParser.g:762:2: iv_ruleProcessReceive= ruleProcessReceive EOF
            {
             newCompositeNode(grammarAccess.getProcessReceiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessReceive=ruleProcessReceive();

            state._fsp--;

             current =iv_ruleProcessReceive; 
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
    // $ANTLR end "entryRuleProcessReceive"


    // $ANTLR start "ruleProcessReceive"
    // InternalGoatComponentsParser.g:768:1: ruleProcessReceive returns [EObject current=null] : (this_ProcessReceiveSingle_0= ruleProcessReceiveSingle | this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple ) ;
    public final EObject ruleProcessReceive() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessReceiveSingle_0 = null;

        EObject this_ProcessReceiveMultiple_1 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:774:2: ( (this_ProcessReceiveSingle_0= ruleProcessReceiveSingle | this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple ) )
            // InternalGoatComponentsParser.g:775:2: (this_ProcessReceiveSingle_0= ruleProcessReceiveSingle | this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple )
            {
            // InternalGoatComponentsParser.g:775:2: (this_ProcessReceiveSingle_0= ruleProcessReceiveSingle | this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Receive) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==LeftParenthesis) ) {
                    alt9=1;
                }
                else if ( (LA9_1==LeftCurlyBracket) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGoatComponentsParser.g:776:3: this_ProcessReceiveSingle_0= ruleProcessReceiveSingle
                    {

                    			newCompositeNode(grammarAccess.getProcessReceiveAccess().getProcessReceiveSingleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessReceiveSingle_0=ruleProcessReceiveSingle();

                    state._fsp--;


                    			current = this_ProcessReceiveSingle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:785:3: this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple
                    {

                    			newCompositeNode(grammarAccess.getProcessReceiveAccess().getProcessReceiveMultipleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessReceiveMultiple_1=ruleProcessReceiveMultiple();

                    state._fsp--;


                    			current = this_ProcessReceiveMultiple_1;
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
    // $ANTLR end "ruleProcessReceive"


    // $ANTLR start "entryRuleProcessReceiveSingle"
    // InternalGoatComponentsParser.g:797:1: entryRuleProcessReceiveSingle returns [EObject current=null] : iv_ruleProcessReceiveSingle= ruleProcessReceiveSingle EOF ;
    public final EObject entryRuleProcessReceiveSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessReceiveSingle = null;


        try {
            // InternalGoatComponentsParser.g:797:61: (iv_ruleProcessReceiveSingle= ruleProcessReceiveSingle EOF )
            // InternalGoatComponentsParser.g:798:2: iv_ruleProcessReceiveSingle= ruleProcessReceiveSingle EOF
            {
             newCompositeNode(grammarAccess.getProcessReceiveSingleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessReceiveSingle=ruleProcessReceiveSingle();

            state._fsp--;

             current =iv_ruleProcessReceiveSingle; 
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
    // $ANTLR end "entryRuleProcessReceiveSingle"


    // $ANTLR start "ruleProcessReceiveSingle"
    // InternalGoatComponentsParser.g:804:1: ruleProcessReceiveSingle returns [EObject current=null] : (otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) ) ) ;
    public final EObject ruleProcessReceiveSingle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cases_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:810:2: ( (otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) ) ) )
            // InternalGoatComponentsParser.g:811:2: (otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) ) )
            {
            // InternalGoatComponentsParser.g:811:2: (otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) ) )
            // InternalGoatComponentsParser.g:812:3: otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) )
            {
            otherlv_0=(Token)match(input,Receive,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessReceiveSingleAccess().getReceiveKeyword_0());
            		
            // InternalGoatComponentsParser.g:816:3: ( (lv_cases_1_0= ruleReceiveCase ) )
            // InternalGoatComponentsParser.g:817:4: (lv_cases_1_0= ruleReceiveCase )
            {
            // InternalGoatComponentsParser.g:817:4: (lv_cases_1_0= ruleReceiveCase )
            // InternalGoatComponentsParser.g:818:5: lv_cases_1_0= ruleReceiveCase
            {

            					newCompositeNode(grammarAccess.getProcessReceiveSingleAccess().getCasesReceiveCaseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_cases_1_0=ruleReceiveCase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessReceiveSingleRule());
            					}
            					add(
            						current,
            						"cases",
            						lv_cases_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.ReceiveCase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_1); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessReceiveSingleAccess().getSemicolonKeyword_2());
            		
            // InternalGoatComponentsParser.g:839:3: ( (lv_then_3_0= ruleEmptyProcessBlock ) )
            // InternalGoatComponentsParser.g:840:4: (lv_then_3_0= ruleEmptyProcessBlock )
            {
            // InternalGoatComponentsParser.g:840:4: (lv_then_3_0= ruleEmptyProcessBlock )
            // InternalGoatComponentsParser.g:841:5: lv_then_3_0= ruleEmptyProcessBlock
            {

            					newCompositeNode(grammarAccess.getProcessReceiveSingleAccess().getThenEmptyProcessBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_then_3_0=ruleEmptyProcessBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessReceiveSingleRule());
            					}
            					add(
            						current,
            						"then",
            						lv_then_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.EmptyProcessBlock");
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
    // $ANTLR end "ruleProcessReceiveSingle"


    // $ANTLR start "entryRuleEmptyProcessBlock"
    // InternalGoatComponentsParser.g:862:1: entryRuleEmptyProcessBlock returns [EObject current=null] : iv_ruleEmptyProcessBlock= ruleEmptyProcessBlock EOF ;
    public final EObject entryRuleEmptyProcessBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyProcessBlock = null;


        try {
            // InternalGoatComponentsParser.g:862:58: (iv_ruleEmptyProcessBlock= ruleEmptyProcessBlock EOF )
            // InternalGoatComponentsParser.g:863:2: iv_ruleEmptyProcessBlock= ruleEmptyProcessBlock EOF
            {
             newCompositeNode(grammarAccess.getEmptyProcessBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyProcessBlock=ruleEmptyProcessBlock();

            state._fsp--;

             current =iv_ruleEmptyProcessBlock; 
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
    // $ANTLR end "entryRuleEmptyProcessBlock"


    // $ANTLR start "ruleEmptyProcessBlock"
    // InternalGoatComponentsParser.g:869:1: ruleEmptyProcessBlock returns [EObject current=null] : () ;
    public final EObject ruleEmptyProcessBlock() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:875:2: ( () )
            // InternalGoatComponentsParser.g:876:2: ()
            {
            // InternalGoatComponentsParser.g:876:2: ()
            // InternalGoatComponentsParser.g:877:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getEmptyProcessBlockAccess().getProcessBlockAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyProcessBlock"


    // $ANTLR start "entryRuleProcessReceiveMultiple"
    // InternalGoatComponentsParser.g:886:1: entryRuleProcessReceiveMultiple returns [EObject current=null] : iv_ruleProcessReceiveMultiple= ruleProcessReceiveMultiple EOF ;
    public final EObject entryRuleProcessReceiveMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessReceiveMultiple = null;


        try {
            // InternalGoatComponentsParser.g:886:63: (iv_ruleProcessReceiveMultiple= ruleProcessReceiveMultiple EOF )
            // InternalGoatComponentsParser.g:887:2: iv_ruleProcessReceiveMultiple= ruleProcessReceiveMultiple EOF
            {
             newCompositeNode(grammarAccess.getProcessReceiveMultipleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessReceiveMultiple=ruleProcessReceiveMultiple();

            state._fsp--;

             current =iv_ruleProcessReceiveMultiple; 
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
    // $ANTLR end "entryRuleProcessReceiveMultiple"


    // $ANTLR start "ruleProcessReceiveMultiple"
    // InternalGoatComponentsParser.g:893:1: ruleProcessReceiveMultiple returns [EObject current=null] : (otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleProcessReceiveMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cases_3_0 = null;

        EObject lv_then_5_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:899:2: ( (otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:900:2: (otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:900:2: (otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket )
            // InternalGoatComponentsParser.g:901:3: otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Receive,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessReceiveMultipleAccess().getReceiveKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessReceiveMultipleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:909:3: (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Case) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:910:4: otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) )
            	    {
            	    otherlv_2=(Token)match(input,Case,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProcessReceiveMultipleAccess().getCaseKeyword_2_0());
            	    			
            	    // InternalGoatComponentsParser.g:914:4: ( (lv_cases_3_0= ruleReceiveCase ) )
            	    // InternalGoatComponentsParser.g:915:5: (lv_cases_3_0= ruleReceiveCase )
            	    {
            	    // InternalGoatComponentsParser.g:915:5: (lv_cases_3_0= ruleReceiveCase )
            	    // InternalGoatComponentsParser.g:916:6: lv_cases_3_0= ruleReceiveCase
            	    {

            	    						newCompositeNode(grammarAccess.getProcessReceiveMultipleAccess().getCasesReceiveCaseParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_cases_3_0=ruleReceiveCase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessReceiveMultipleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cases",
            	    							lv_cases_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.ReceiveCase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,Colon,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getProcessReceiveMultipleAccess().getColonKeyword_2_2());
            	    			
            	    // InternalGoatComponentsParser.g:937:4: ( (lv_then_5_0= ruleProcessBlock ) )
            	    // InternalGoatComponentsParser.g:938:5: (lv_then_5_0= ruleProcessBlock )
            	    {
            	    // InternalGoatComponentsParser.g:938:5: (lv_then_5_0= ruleProcessBlock )
            	    // InternalGoatComponentsParser.g:939:6: lv_then_5_0= ruleProcessBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProcessReceiveMultipleAccess().getThenProcessBlockParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_then_5_0=ruleProcessBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessReceiveMultipleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"then",
            	    							lv_then_5_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessReceiveMultipleAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleProcessReceiveMultiple"


    // $ANTLR start "entryRuleReceiveCase"
    // InternalGoatComponentsParser.g:965:1: entryRuleReceiveCase returns [EObject current=null] : iv_ruleReceiveCase= ruleReceiveCase EOF ;
    public final EObject entryRuleReceiveCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiveCase = null;


        try {
            // InternalGoatComponentsParser.g:965:52: (iv_ruleReceiveCase= ruleReceiveCase EOF )
            // InternalGoatComponentsParser.g:966:2: iv_ruleReceiveCase= ruleReceiveCase EOF
            {
             newCompositeNode(grammarAccess.getReceiveCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReceiveCase=ruleReceiveCase();

            state._fsp--;

             current =iv_ruleReceiveCase; 
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
    // $ANTLR end "entryRuleReceiveCase"


    // $ANTLR start "ruleReceiveCase"
    // InternalGoatComponentsParser.g:972:1: ruleReceiveCase returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_spawn_9_0= ruleProcessSpawn ) )? ( (lv_print_10_0= rulePrintStatement ) )? ) ;
    public final EObject ruleReceiveCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_msgInParts_4_0=null;
        Token otherlv_5=null;
        Token lv_msgInParts_6_0=null;
        Token otherlv_7=null;
        EObject lv_cond_1_0 = null;

        EObject lv_updates_8_0 = null;

        EObject lv_spawn_9_0 = null;

        EObject lv_print_10_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:978:2: ( (otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_spawn_9_0= ruleProcessSpawn ) )? ( (lv_print_10_0= rulePrintStatement ) )? ) )
            // InternalGoatComponentsParser.g:979:2: (otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_spawn_9_0= ruleProcessSpawn ) )? ( (lv_print_10_0= rulePrintStatement ) )? )
            {
            // InternalGoatComponentsParser.g:979:2: (otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_spawn_9_0= ruleProcessSpawn ) )? ( (lv_print_10_0= rulePrintStatement ) )? )
            // InternalGoatComponentsParser.g:980:3: otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_spawn_9_0= ruleProcessSpawn ) )? ( (lv_print_10_0= rulePrintStatement ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiveCaseAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGoatComponentsParser.g:984:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:985:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:985:4: (lv_cond_1_0= ruleExpression )
            // InternalGoatComponentsParser.g:986:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getReceiveCaseAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_cond_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReceiveCaseRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getReceiveCaseAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getReceiveCaseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGoatComponentsParser.g:1011:3: ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGoatComponentsParser.g:1012:4: ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )*
                    {
                    // InternalGoatComponentsParser.g:1012:4: ( (lv_msgInParts_4_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:1013:5: (lv_msgInParts_4_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:1013:5: (lv_msgInParts_4_0= RULE_ID )
                    // InternalGoatComponentsParser.g:1014:6: lv_msgInParts_4_0= RULE_ID
                    {
                    lv_msgInParts_4_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_msgInParts_4_0, grammarAccess.getReceiveCaseAccess().getMsgInPartsIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReceiveCaseRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"msgInParts",
                    							lv_msgInParts_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:1030:4: (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:1031:5: otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getReceiveCaseAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:1035:5: ( (lv_msgInParts_6_0= RULE_ID ) )
                    	    // InternalGoatComponentsParser.g:1036:6: (lv_msgInParts_6_0= RULE_ID )
                    	    {
                    	    // InternalGoatComponentsParser.g:1036:6: (lv_msgInParts_6_0= RULE_ID )
                    	    // InternalGoatComponentsParser.g:1037:7: lv_msgInParts_6_0= RULE_ID
                    	    {
                    	    lv_msgInParts_6_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    							newLeafNode(lv_msgInParts_6_0, grammarAccess.getReceiveCaseAccess().getMsgInPartsIDTerminalRuleCall_4_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReceiveCaseRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"msgInParts",
                    	    								lv_msgInParts_6_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getReceiveCaseAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalGoatComponentsParser.g:1059:3: ( (lv_updates_8_0= ruleUpdate ) )
            // InternalGoatComponentsParser.g:1060:4: (lv_updates_8_0= ruleUpdate )
            {
            // InternalGoatComponentsParser.g:1060:4: (lv_updates_8_0= ruleUpdate )
            // InternalGoatComponentsParser.g:1061:5: lv_updates_8_0= ruleUpdate
            {

            					newCompositeNode(grammarAccess.getReceiveCaseAccess().getUpdatesUpdateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_updates_8_0=ruleUpdate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReceiveCaseRule());
            					}
            					set(
            						current,
            						"updates",
            						lv_updates_8_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Update");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:1078:3: ( (lv_spawn_9_0= ruleProcessSpawn ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Spawn) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGoatComponentsParser.g:1079:4: (lv_spawn_9_0= ruleProcessSpawn )
                    {
                    // InternalGoatComponentsParser.g:1079:4: (lv_spawn_9_0= ruleProcessSpawn )
                    // InternalGoatComponentsParser.g:1080:5: lv_spawn_9_0= ruleProcessSpawn
                    {

                    					newCompositeNode(grammarAccess.getReceiveCaseAccess().getSpawnProcessSpawnParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_spawn_9_0=ruleProcessSpawn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReceiveCaseRule());
                    					}
                    					set(
                    						current,
                    						"spawn",
                    						lv_spawn_9_0,
                    						"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessSpawn");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGoatComponentsParser.g:1097:3: ( (lv_print_10_0= rulePrintStatement ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Print) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGoatComponentsParser.g:1098:4: (lv_print_10_0= rulePrintStatement )
                    {
                    // InternalGoatComponentsParser.g:1098:4: (lv_print_10_0= rulePrintStatement )
                    // InternalGoatComponentsParser.g:1099:5: lv_print_10_0= rulePrintStatement
                    {

                    					newCompositeNode(grammarAccess.getReceiveCaseAccess().getPrintPrintStatementParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_print_10_0=rulePrintStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReceiveCaseRule());
                    					}
                    					set(
                    						current,
                    						"print",
                    						lv_print_10_0,
                    						"com.sysma.goat.eclipse_plugin.GoatComponents.PrintStatement");
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
    // $ANTLR end "ruleReceiveCase"


    // $ANTLR start "entryRuleProcessIf"
    // InternalGoatComponentsParser.g:1120:1: entryRuleProcessIf returns [EObject current=null] : iv_ruleProcessIf= ruleProcessIf EOF ;
    public final EObject entryRuleProcessIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessIf = null;


        try {
            // InternalGoatComponentsParser.g:1120:50: (iv_ruleProcessIf= ruleProcessIf EOF )
            // InternalGoatComponentsParser.g:1121:2: iv_ruleProcessIf= ruleProcessIf EOF
            {
             newCompositeNode(grammarAccess.getProcessIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessIf=ruleProcessIf();

            state._fsp--;

             current =iv_ruleProcessIf; 
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
    // $ANTLR end "entryRuleProcessIf"


    // $ANTLR start "ruleProcessIf"
    // InternalGoatComponentsParser.g:1127:1: ruleProcessIf returns [EObject current=null] : (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )? ) ;
    public final EObject ruleProcessIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_cond_2_0 = null;

        EObject this_ProcessThenBlock_4 = null;

        EObject lv_cond_8_0 = null;

        EObject this_ProcessThenBlock_10 = null;

        EObject this_ProcessThenBlock_12 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1133:2: ( (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )? ) )
            // InternalGoatComponentsParser.g:1134:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )? )
            {
            // InternalGoatComponentsParser.g:1134:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )? )
            // InternalGoatComponentsParser.g:1135:3: otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessIfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:1143:3: ( (lv_cond_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:1144:4: (lv_cond_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:1144:4: (lv_cond_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:1145:5: lv_cond_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProcessIfAccess().getCondExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_cond_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessIfRule());
            					}
            					add(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessIfAccess().getRightParenthesisKeyword_3());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProcessIfRule());
            			}
            			newCompositeNode(grammarAccess.getProcessIfAccess().getProcessThenBlockParserRuleCall_4());
            		
            pushFollow(FOLLOW_26);
            this_ProcessThenBlock_4=ruleProcessThenBlock(current);

            state._fsp--;


            			current = this_ProcessThenBlock_4;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:1177:3: (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Else) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==If) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1178:4: otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current]
            	    {
            	    otherlv_5=(Token)match(input,Else,FOLLOW_27); 

            	    				newLeafNode(otherlv_5, grammarAccess.getProcessIfAccess().getElseKeyword_5_0());
            	    			
            	    otherlv_6=(Token)match(input,If,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getProcessIfAccess().getIfKeyword_5_1());
            	    			
            	    otherlv_7=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getProcessIfAccess().getLeftParenthesisKeyword_5_2());
            	    			
            	    // InternalGoatComponentsParser.g:1190:4: ( (lv_cond_8_0= ruleExpression ) )
            	    // InternalGoatComponentsParser.g:1191:5: (lv_cond_8_0= ruleExpression )
            	    {
            	    // InternalGoatComponentsParser.g:1191:5: (lv_cond_8_0= ruleExpression )
            	    // InternalGoatComponentsParser.g:1192:6: lv_cond_8_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getProcessIfAccess().getCondExpressionParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_cond_8_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessIfRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cond",
            	    							lv_cond_8_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getProcessIfAccess().getRightParenthesisKeyword_5_4());
            	    			

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getProcessIfRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getProcessIfAccess().getProcessThenBlockParserRuleCall_5_5());
            	    			
            	    pushFollow(FOLLOW_26);
            	    this_ProcessThenBlock_10=ruleProcessThenBlock(current);

            	    state._fsp--;


            	    				current = this_ProcessThenBlock_10;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalGoatComponentsParser.g:1225:3: (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Else) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGoatComponentsParser.g:1226:4: otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current]
                    {
                    otherlv_11=(Token)match(input,Else,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getProcessIfAccess().getElseKeyword_6_0());
                    			

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getProcessIfRule());
                    				}
                    				newCompositeNode(grammarAccess.getProcessIfAccess().getProcessThenBlockParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ProcessThenBlock_12=ruleProcessThenBlock(current);

                    state._fsp--;


                    				current = this_ProcessThenBlock_12;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleProcessIf"


    // $ANTLR start "ruleProcessThenBlock"
    // InternalGoatComponentsParser.g:1247:1: ruleProcessThenBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleProcessThenBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_action_1_1 = null;

        EObject lv_action_1_2 = null;

        EObject lv_action_1_3 = null;

        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1253:2: ( (otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:1254:2: (otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:1254:2: (otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket )
            // InternalGoatComponentsParser.g:1255:3: otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessThenBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:1259:3: ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) )
            // InternalGoatComponentsParser.g:1260:4: ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) )
            {
            // InternalGoatComponentsParser.g:1260:4: ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) )
            // InternalGoatComponentsParser.g:1261:5: (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet )
            {
            // InternalGoatComponentsParser.g:1261:5: (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet )
            int alt17=3;
            switch ( input.LA(1) ) {
            case Send:
                {
                alt17=1;
                }
                break;
            case Receive:
                {
                alt17=2;
                }
                break;
            case Set:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalGoatComponentsParser.g:1262:6: lv_action_1_1= ruleProcessSend
                    {

                    						newCompositeNode(grammarAccess.getProcessThenBlockAccess().getActionProcessSendParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_action_1_1=ruleProcessSend();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessThenBlockRule());
                    						}
                    						add(
                    							current,
                    							"action",
                    							lv_action_1_1,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessSend");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1278:6: lv_action_1_2= ruleProcessReceive
                    {

                    						newCompositeNode(grammarAccess.getProcessThenBlockAccess().getActionProcessReceiveParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_8);
                    lv_action_1_2=ruleProcessReceive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessThenBlockRule());
                    						}
                    						add(
                    							current,
                    							"action",
                    							lv_action_1_2,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessReceive");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1294:6: lv_action_1_3= ruleProcessSet
                    {

                    						newCompositeNode(grammarAccess.getProcessThenBlockAccess().getActionProcessSetParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_8);
                    lv_action_1_3=ruleProcessSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessThenBlockRule());
                    						}
                    						add(
                    							current,
                    							"action",
                    							lv_action_1_3,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalGoatComponentsParser.g:1312:3: ( (lv_then_2_0= rulePTBThen ) )
            // InternalGoatComponentsParser.g:1313:4: (lv_then_2_0= rulePTBThen )
            {
            // InternalGoatComponentsParser.g:1313:4: (lv_then_2_0= rulePTBThen )
            // InternalGoatComponentsParser.g:1314:5: lv_then_2_0= rulePTBThen
            {

            					newCompositeNode(grammarAccess.getProcessThenBlockAccess().getThenPTBThenParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_then_2_0=rulePTBThen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessThenBlockRule());
            					}
            					add(
            						current,
            						"then",
            						lv_then_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.PTBThen");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessThenBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleProcessThenBlock"


    // $ANTLR start "entryRulePTBThen"
    // InternalGoatComponentsParser.g:1339:1: entryRulePTBThen returns [EObject current=null] : iv_rulePTBThen= rulePTBThen EOF ;
    public final EObject entryRulePTBThen() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePTBThen = null;


        try {
            // InternalGoatComponentsParser.g:1339:48: (iv_rulePTBThen= rulePTBThen EOF )
            // InternalGoatComponentsParser.g:1340:2: iv_rulePTBThen= rulePTBThen EOF
            {
             newCompositeNode(grammarAccess.getPTBThenRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePTBThen=rulePTBThen();

            state._fsp--;

             current =iv_rulePTBThen; 
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
    // $ANTLR end "entryRulePTBThen"


    // $ANTLR start "rulePTBThen"
    // InternalGoatComponentsParser.g:1346:1: rulePTBThen returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleProcessStatement ) )* ) ;
    public final EObject rulePTBThen() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1352:2: ( ( () ( (lv_statements_1_0= ruleProcessStatement ) )* ) )
            // InternalGoatComponentsParser.g:1353:2: ( () ( (lv_statements_1_0= ruleProcessStatement ) )* )
            {
            // InternalGoatComponentsParser.g:1353:2: ( () ( (lv_statements_1_0= ruleProcessStatement ) )* )
            // InternalGoatComponentsParser.g:1354:3: () ( (lv_statements_1_0= ruleProcessStatement ) )*
            {
            // InternalGoatComponentsParser.g:1354:3: ()
            // InternalGoatComponentsParser.g:1355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPTBThenAccess().getProcessBlockAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:1361:3: ( (lv_statements_1_0= ruleProcessStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=Receive && LA18_0<=Waitfor)||LA18_0==Spawn||LA18_0==Call||LA18_0==Loop||LA18_0==Send||LA18_0==Set||LA18_0==If) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1362:4: (lv_statements_1_0= ruleProcessStatement )
            	    {
            	    // InternalGoatComponentsParser.g:1362:4: (lv_statements_1_0= ruleProcessStatement )
            	    // InternalGoatComponentsParser.g:1363:5: lv_statements_1_0= ruleProcessStatement
            	    {

            	    					newCompositeNode(grammarAccess.getPTBThenAccess().getStatementsProcessStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_statements_1_0=ruleProcessStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPTBThenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "rulePTBThen"


    // $ANTLR start "entryRuleProcessSet"
    // InternalGoatComponentsParser.g:1384:1: entryRuleProcessSet returns [EObject current=null] : iv_ruleProcessSet= ruleProcessSet EOF ;
    public final EObject entryRuleProcessSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessSet = null;


        try {
            // InternalGoatComponentsParser.g:1384:51: (iv_ruleProcessSet= ruleProcessSet EOF )
            // InternalGoatComponentsParser.g:1385:2: iv_ruleProcessSet= ruleProcessSet EOF
            {
             newCompositeNode(grammarAccess.getProcessSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessSet=ruleProcessSet();

            state._fsp--;

             current =iv_ruleProcessSet; 
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
    // $ANTLR end "entryRuleProcessSet"


    // $ANTLR start "ruleProcessSet"
    // InternalGoatComponentsParser.g:1391:1: ruleProcessSet returns [EObject current=null] : (otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon ) ;
    public final EObject ruleProcessSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_update_1_0 = null;

        EObject lv_print_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1397:2: ( (otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon ) )
            // InternalGoatComponentsParser.g:1398:2: (otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon )
            {
            // InternalGoatComponentsParser.g:1398:2: (otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon )
            // InternalGoatComponentsParser.g:1399:3: otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon
            {
            otherlv_0=(Token)match(input,Set,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessSetAccess().getSetKeyword_0());
            		
            // InternalGoatComponentsParser.g:1403:3: ( (lv_update_1_0= ruleUpdate ) )
            // InternalGoatComponentsParser.g:1404:4: (lv_update_1_0= ruleUpdate )
            {
            // InternalGoatComponentsParser.g:1404:4: (lv_update_1_0= ruleUpdate )
            // InternalGoatComponentsParser.g:1405:5: lv_update_1_0= ruleUpdate
            {

            					newCompositeNode(grammarAccess.getProcessSetAccess().getUpdateUpdateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_update_1_0=ruleUpdate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessSetRule());
            					}
            					set(
            						current,
            						"update",
            						lv_update_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Update");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:1422:3: ( (lv_print_2_0= rulePrintStatement ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Print) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGoatComponentsParser.g:1423:4: (lv_print_2_0= rulePrintStatement )
                    {
                    // InternalGoatComponentsParser.g:1423:4: (lv_print_2_0= rulePrintStatement )
                    // InternalGoatComponentsParser.g:1424:5: lv_print_2_0= rulePrintStatement
                    {

                    					newCompositeNode(grammarAccess.getProcessSetAccess().getPrintPrintStatementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_print_2_0=rulePrintStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcessSetRule());
                    					}
                    					set(
                    						current,
                    						"print",
                    						lv_print_2_0,
                    						"com.sysma.goat.eclipse_plugin.GoatComponents.PrintStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessSetAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleProcessSet"


    // $ANTLR start "entryRuleProcessWaitFor"
    // InternalGoatComponentsParser.g:1449:1: entryRuleProcessWaitFor returns [EObject current=null] : iv_ruleProcessWaitFor= ruleProcessWaitFor EOF ;
    public final EObject entryRuleProcessWaitFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessWaitFor = null;


        try {
            // InternalGoatComponentsParser.g:1449:55: (iv_ruleProcessWaitFor= ruleProcessWaitFor EOF )
            // InternalGoatComponentsParser.g:1450:2: iv_ruleProcessWaitFor= ruleProcessWaitFor EOF
            {
             newCompositeNode(grammarAccess.getProcessWaitForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessWaitFor=ruleProcessWaitFor();

            state._fsp--;

             current =iv_ruleProcessWaitFor; 
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
    // $ANTLR end "entryRuleProcessWaitFor"


    // $ANTLR start "ruleProcessWaitFor"
    // InternalGoatComponentsParser.g:1456:1: ruleProcessWaitFor returns [EObject current=null] : (otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon ) ;
    public final EObject ruleProcessWaitFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_cond_2_0 = null;

        EObject lv_update_4_0 = null;

        EObject lv_print_5_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1462:2: ( (otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon ) )
            // InternalGoatComponentsParser.g:1463:2: (otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon )
            {
            // InternalGoatComponentsParser.g:1463:2: (otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon )
            // InternalGoatComponentsParser.g:1464:3: otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon
            {
            otherlv_0=(Token)match(input,Waitfor,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessWaitForAccess().getWaitforKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessWaitForAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:1472:3: ( (lv_cond_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:1473:4: (lv_cond_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:1473:4: (lv_cond_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:1474:5: lv_cond_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProcessWaitForAccess().getCondExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_cond_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessWaitForRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessWaitForAccess().getRightParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:1495:3: ( (lv_update_4_0= ruleUpdate ) )
            // InternalGoatComponentsParser.g:1496:4: (lv_update_4_0= ruleUpdate )
            {
            // InternalGoatComponentsParser.g:1496:4: (lv_update_4_0= ruleUpdate )
            // InternalGoatComponentsParser.g:1497:5: lv_update_4_0= ruleUpdate
            {

            					newCompositeNode(grammarAccess.getProcessWaitForAccess().getUpdateUpdateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_update_4_0=ruleUpdate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessWaitForRule());
            					}
            					set(
            						current,
            						"update",
            						lv_update_4_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Update");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoatComponentsParser.g:1514:3: ( (lv_print_5_0= rulePrintStatement ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Print) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGoatComponentsParser.g:1515:4: (lv_print_5_0= rulePrintStatement )
                    {
                    // InternalGoatComponentsParser.g:1515:4: (lv_print_5_0= rulePrintStatement )
                    // InternalGoatComponentsParser.g:1516:5: lv_print_5_0= rulePrintStatement
                    {

                    					newCompositeNode(grammarAccess.getProcessWaitForAccess().getPrintPrintStatementParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_print_5_0=rulePrintStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcessWaitForRule());
                    					}
                    					set(
                    						current,
                    						"print",
                    						lv_print_5_0,
                    						"com.sysma.goat.eclipse_plugin.GoatComponents.PrintStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessWaitForAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleProcessWaitFor"


    // $ANTLR start "entryRuleProcessLoop"
    // InternalGoatComponentsParser.g:1541:1: entryRuleProcessLoop returns [EObject current=null] : iv_ruleProcessLoop= ruleProcessLoop EOF ;
    public final EObject entryRuleProcessLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessLoop = null;


        try {
            // InternalGoatComponentsParser.g:1541:52: (iv_ruleProcessLoop= ruleProcessLoop EOF )
            // InternalGoatComponentsParser.g:1542:2: iv_ruleProcessLoop= ruleProcessLoop EOF
            {
             newCompositeNode(grammarAccess.getProcessLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessLoop=ruleProcessLoop();

            state._fsp--;

             current =iv_ruleProcessLoop; 
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
    // $ANTLR end "entryRuleProcessLoop"


    // $ANTLR start "ruleProcessLoop"
    // InternalGoatComponentsParser.g:1548:1: ruleProcessLoop returns [EObject current=null] : (otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) ) ) ;
    public final EObject ruleProcessLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1554:2: ( (otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) ) ) )
            // InternalGoatComponentsParser.g:1555:2: (otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) ) )
            {
            // InternalGoatComponentsParser.g:1555:2: (otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) ) )
            // InternalGoatComponentsParser.g:1556:3: otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) )
            {
            otherlv_0=(Token)match(input,Loop,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessLoopAccess().getLoopKeyword_0());
            		
            // InternalGoatComponentsParser.g:1560:3: ( (lv_block_1_0= ruleProcessBlock ) )
            // InternalGoatComponentsParser.g:1561:4: (lv_block_1_0= ruleProcessBlock )
            {
            // InternalGoatComponentsParser.g:1561:4: (lv_block_1_0= ruleProcessBlock )
            // InternalGoatComponentsParser.g:1562:5: lv_block_1_0= ruleProcessBlock
            {

            					newCompositeNode(grammarAccess.getProcessLoopAccess().getBlockProcessBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_1_0=ruleProcessBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessLoopRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessBlock");
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
    // $ANTLR end "ruleProcessLoop"


    // $ANTLR start "entryRuleUpdate"
    // InternalGoatComponentsParser.g:1583:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalGoatComponentsParser.g:1583:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalGoatComponentsParser.g:1584:2: iv_ruleUpdate= ruleUpdate EOF
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
    // InternalGoatComponentsParser.g:1590:1: ruleUpdate returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )? ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_attribute_2_1 = null;

        EObject lv_attribute_2_2 = null;

        EObject lv_value_4_0 = null;

        EObject lv_attribute_6_1 = null;

        EObject lv_attribute_6_2 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1596:2: ( ( () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )? ) )
            // InternalGoatComponentsParser.g:1597:2: ( () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )? )
            {
            // InternalGoatComponentsParser.g:1597:2: ( () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )? )
            // InternalGoatComponentsParser.g:1598:3: () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )?
            {
            // InternalGoatComponentsParser.g:1598:3: ()
            // InternalGoatComponentsParser.g:1599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpdateAccess().getUpdateAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:1605:3: (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftSquareBracket) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGoatComponentsParser.g:1606:4: otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalGoatComponentsParser.g:1610:4: ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) )
                    // InternalGoatComponentsParser.g:1611:5: ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) )
                    {
                    // InternalGoatComponentsParser.g:1611:5: ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) )
                    // InternalGoatComponentsParser.g:1612:6: (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute )
                    {
                    // InternalGoatComponentsParser.g:1612:6: (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Comp) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==Proc) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalGoatComponentsParser.g:1613:7: lv_attribute_2_1= ruleUpdateComponentAttribute
                            {

                            							newCompositeNode(grammarAccess.getUpdateAccess().getAttributeUpdateComponentAttributeParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_32);
                            lv_attribute_2_1=ruleUpdateComponentAttribute();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getUpdateRule());
                            							}
                            							add(
                            								current,
                            								"attribute",
                            								lv_attribute_2_1,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.UpdateComponentAttribute");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:1629:7: lv_attribute_2_2= ruleUpdateLocalAttribute
                            {

                            							newCompositeNode(grammarAccess.getUpdateAccess().getAttributeUpdateLocalAttributeParserRuleCall_1_1_0_1());
                            						
                            pushFollow(FOLLOW_32);
                            lv_attribute_2_2=ruleUpdateLocalAttribute();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getUpdateRule());
                            							}
                            							add(
                            								current,
                            								"attribute",
                            								lv_attribute_2_2,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.UpdateLocalAttribute");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_3=(Token)match(input,ColonEqualsSign,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_1_2());
                    			
                    // InternalGoatComponentsParser.g:1651:4: ( (lv_value_4_0= ruleExpression ) )
                    // InternalGoatComponentsParser.g:1652:5: (lv_value_4_0= ruleExpression )
                    {
                    // InternalGoatComponentsParser.g:1652:5: (lv_value_4_0= ruleExpression )
                    // InternalGoatComponentsParser.g:1653:6: lv_value_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getUpdateAccess().getValueExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_value_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:1670:4: (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==Comma) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:1671:5: otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_31); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getUpdateAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:1675:5: ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) )
                    	    // InternalGoatComponentsParser.g:1676:6: ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) )
                    	    {
                    	    // InternalGoatComponentsParser.g:1676:6: ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) )
                    	    // InternalGoatComponentsParser.g:1677:7: (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute )
                    	    {
                    	    // InternalGoatComponentsParser.g:1677:7: (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute )
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==Comp) ) {
                    	        alt22=1;
                    	    }
                    	    else if ( (LA22_0==Proc) ) {
                    	        alt22=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 22, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // InternalGoatComponentsParser.g:1678:8: lv_attribute_6_1= ruleUpdateComponentAttribute
                    	            {

                    	            								newCompositeNode(grammarAccess.getUpdateAccess().getAttributeUpdateComponentAttributeParserRuleCall_1_4_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_32);
                    	            lv_attribute_6_1=ruleUpdateComponentAttribute();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getUpdateRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"attribute",
                    	            									lv_attribute_6_1,
                    	            									"com.sysma.goat.eclipse_plugin.GoatComponents.UpdateComponentAttribute");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalGoatComponentsParser.g:1694:8: lv_attribute_6_2= ruleUpdateLocalAttribute
                    	            {

                    	            								newCompositeNode(grammarAccess.getUpdateAccess().getAttributeUpdateLocalAttributeParserRuleCall_1_4_1_0_1());
                    	            							
                    	            pushFollow(FOLLOW_32);
                    	            lv_attribute_6_2=ruleUpdateLocalAttribute();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getUpdateRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"attribute",
                    	            									lv_attribute_6_2,
                    	            									"com.sysma.goat.eclipse_plugin.GoatComponents.UpdateLocalAttribute");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,ColonEqualsSign,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_1_4_2());
                    	    				
                    	    // InternalGoatComponentsParser.g:1716:5: ( (lv_value_8_0= ruleExpression ) )
                    	    // InternalGoatComponentsParser.g:1717:6: (lv_value_8_0= ruleExpression )
                    	    {
                    	    // InternalGoatComponentsParser.g:1717:6: (lv_value_8_0= ruleExpression )
                    	    // InternalGoatComponentsParser.g:1718:7: lv_value_8_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUpdateAccess().getValueExpressionParserRuleCall_1_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_value_8_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUpdateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_8_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getUpdateAccess().getRightSquareBracketKeyword_1_5());
                    			

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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleUpdateComponentAttribute"
    // InternalGoatComponentsParser.g:1745:1: entryRuleUpdateComponentAttribute returns [EObject current=null] : iv_ruleUpdateComponentAttribute= ruleUpdateComponentAttribute EOF ;
    public final EObject entryRuleUpdateComponentAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateComponentAttribute = null;


        try {
            // InternalGoatComponentsParser.g:1745:65: (iv_ruleUpdateComponentAttribute= ruleUpdateComponentAttribute EOF )
            // InternalGoatComponentsParser.g:1746:2: iv_ruleUpdateComponentAttribute= ruleUpdateComponentAttribute EOF
            {
             newCompositeNode(grammarAccess.getUpdateComponentAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateComponentAttribute=ruleUpdateComponentAttribute();

            state._fsp--;

             current =iv_ruleUpdateComponentAttribute; 
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
    // $ANTLR end "entryRuleUpdateComponentAttribute"


    // $ANTLR start "ruleUpdateComponentAttribute"
    // InternalGoatComponentsParser.g:1752:1: ruleUpdateComponentAttribute returns [EObject current=null] : (otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) ) ;
    public final EObject ruleUpdateComponentAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_atname_2_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1758:2: ( (otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:1759:2: (otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:1759:2: (otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:1760:3: otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Comp,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateComponentAttributeAccess().getCompKeyword_0());
            		
            otherlv_1=(Token)match(input,FullStop,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateComponentAttributeAccess().getFullStopKeyword_1());
            		
            // InternalGoatComponentsParser.g:1768:3: ( (lv_atname_2_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:1769:4: (lv_atname_2_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1769:4: (lv_atname_2_0= RULE_ID )
            // InternalGoatComponentsParser.g:1770:5: lv_atname_2_0= RULE_ID
            {
            lv_atname_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_atname_2_0, grammarAccess.getUpdateComponentAttributeAccess().getAtnameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateComponentAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"atname",
            						lv_atname_2_0,
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
    // $ANTLR end "ruleUpdateComponentAttribute"


    // $ANTLR start "entryRuleUpdateLocalAttribute"
    // InternalGoatComponentsParser.g:1790:1: entryRuleUpdateLocalAttribute returns [EObject current=null] : iv_ruleUpdateLocalAttribute= ruleUpdateLocalAttribute EOF ;
    public final EObject entryRuleUpdateLocalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateLocalAttribute = null;


        try {
            // InternalGoatComponentsParser.g:1790:61: (iv_ruleUpdateLocalAttribute= ruleUpdateLocalAttribute EOF )
            // InternalGoatComponentsParser.g:1791:2: iv_ruleUpdateLocalAttribute= ruleUpdateLocalAttribute EOF
            {
             newCompositeNode(grammarAccess.getUpdateLocalAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateLocalAttribute=ruleUpdateLocalAttribute();

            state._fsp--;

             current =iv_ruleUpdateLocalAttribute; 
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
    // $ANTLR end "entryRuleUpdateLocalAttribute"


    // $ANTLR start "ruleUpdateLocalAttribute"
    // InternalGoatComponentsParser.g:1797:1: ruleUpdateLocalAttribute returns [EObject current=null] : (otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) ) ;
    public final EObject ruleUpdateLocalAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_atname_2_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1803:2: ( (otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:1804:2: (otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:1804:2: (otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:1805:3: otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Proc,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateLocalAttributeAccess().getProcKeyword_0());
            		
            otherlv_1=(Token)match(input,FullStop,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateLocalAttributeAccess().getFullStopKeyword_1());
            		
            // InternalGoatComponentsParser.g:1813:3: ( (lv_atname_2_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:1814:4: (lv_atname_2_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1814:4: (lv_atname_2_0= RULE_ID )
            // InternalGoatComponentsParser.g:1815:5: lv_atname_2_0= RULE_ID
            {
            lv_atname_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_atname_2_0, grammarAccess.getUpdateLocalAttributeAccess().getAtnameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateLocalAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"atname",
            						lv_atname_2_0,
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
    // $ANTLR end "ruleUpdateLocalAttribute"


    // $ANTLR start "entryRulePrintStatement"
    // InternalGoatComponentsParser.g:1835:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalGoatComponentsParser.g:1835:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalGoatComponentsParser.g:1836:2: iv_rulePrintStatement= rulePrintStatement EOF
            {
             newCompositeNode(grammarAccess.getPrintStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintStatement=rulePrintStatement();

            state._fsp--;

             current =iv_rulePrintStatement; 
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
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalGoatComponentsParser.g:1842:1: rulePrintStatement returns [EObject current=null] : this_PrintFormattedStatement_0= rulePrintFormattedStatement ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject this_PrintFormattedStatement_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1848:2: (this_PrintFormattedStatement_0= rulePrintFormattedStatement )
            // InternalGoatComponentsParser.g:1849:2: this_PrintFormattedStatement_0= rulePrintFormattedStatement
            {

            		newCompositeNode(grammarAccess.getPrintStatementAccess().getPrintFormattedStatementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PrintFormattedStatement_0=rulePrintFormattedStatement();

            state._fsp--;


            		current = this_PrintFormattedStatement_0;
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
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRulePrintFormattedStatement"
    // InternalGoatComponentsParser.g:1860:1: entryRulePrintFormattedStatement returns [EObject current=null] : iv_rulePrintFormattedStatement= rulePrintFormattedStatement EOF ;
    public final EObject entryRulePrintFormattedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintFormattedStatement = null;


        try {
            // InternalGoatComponentsParser.g:1860:64: (iv_rulePrintFormattedStatement= rulePrintFormattedStatement EOF )
            // InternalGoatComponentsParser.g:1861:2: iv_rulePrintFormattedStatement= rulePrintFormattedStatement EOF
            {
             newCompositeNode(grammarAccess.getPrintFormattedStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintFormattedStatement=rulePrintFormattedStatement();

            state._fsp--;

             current =iv_rulePrintFormattedStatement; 
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
    // $ANTLR end "entryRulePrintFormattedStatement"


    // $ANTLR start "rulePrintFormattedStatement"
    // InternalGoatComponentsParser.g:1867:1: rulePrintFormattedStatement returns [EObject current=null] : (otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis ) ;
    public final EObject rulePrintFormattedStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_toPrint_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1873:2: ( (otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis ) )
            // InternalGoatComponentsParser.g:1874:2: (otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:1874:2: (otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )
            // InternalGoatComponentsParser.g:1875:3: otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Print,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintFormattedStatementAccess().getPrintKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintFormattedStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:1883:3: ( (lv_toPrint_2_0= RULE_STRING ) )
            // InternalGoatComponentsParser.g:1884:4: (lv_toPrint_2_0= RULE_STRING )
            {
            // InternalGoatComponentsParser.g:1884:4: (lv_toPrint_2_0= RULE_STRING )
            // InternalGoatComponentsParser.g:1885:5: lv_toPrint_2_0= RULE_STRING
            {
            lv_toPrint_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_toPrint_2_0, grammarAccess.getPrintFormattedStatementAccess().getToPrintSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintFormattedStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"toPrint",
            						lv_toPrint_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPrintFormattedStatementAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulePrintFormattedStatement"


    // $ANTLR start "entryRuleEnvInitValue"
    // InternalGoatComponentsParser.g:1909:1: entryRuleEnvInitValue returns [EObject current=null] : iv_ruleEnvInitValue= ruleEnvInitValue EOF ;
    public final EObject entryRuleEnvInitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvInitValue = null;


        try {
            // InternalGoatComponentsParser.g:1909:53: (iv_ruleEnvInitValue= ruleEnvInitValue EOF )
            // InternalGoatComponentsParser.g:1910:2: iv_ruleEnvInitValue= ruleEnvInitValue EOF
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
    // InternalGoatComponentsParser.g:1916:1: ruleEnvInitValue returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket ) ) ;
    public final EObject ruleEnvInitValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_negvalue_2_0=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_1=null;
        Token lv_value_8_2=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_elem_11_0 = null;

        EObject lv_elem_13_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1922:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket ) ) )
            // InternalGoatComponentsParser.g:1923:2: ( ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket ) )
            {
            // InternalGoatComponentsParser.g:1923:2: ( ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case HyphenMinus:
                {
                alt28=1;
                }
                break;
            case RULE_INT:
                {
                alt28=2;
                }
                break;
            case RULE_STRING:
                {
                alt28=3;
                }
                break;
            case False:
            case True:
                {
                alt28=4;
                }
                break;
            case LeftSquareBracket:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalGoatComponentsParser.g:1924:3: ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:1924:3: ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:1925:4: () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:1925:4: ()
                    // InternalGoatComponentsParser.g:1926:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getNegativeIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnvInitValueAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:1936:4: ( (lv_negvalue_2_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:1937:5: (lv_negvalue_2_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:1937:5: (lv_negvalue_2_0= RULE_INT )
                    // InternalGoatComponentsParser.g:1938:6: lv_negvalue_2_0= RULE_INT
                    {
                    lv_negvalue_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_negvalue_2_0, grammarAccess.getEnvInitValueAccess().getNegvalueINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvInitValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"negvalue",
                    							lv_negvalue_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1956:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:1956:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:1957:4: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:1957:4: ()
                    // InternalGoatComponentsParser.g:1958:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getIntConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:1964:4: ( (lv_value_4_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:1965:5: (lv_value_4_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:1965:5: (lv_value_4_0= RULE_INT )
                    // InternalGoatComponentsParser.g:1966:6: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getEnvInitValueAccess().getValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvInitValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1984:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalGoatComponentsParser.g:1984:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalGoatComponentsParser.g:1985:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalGoatComponentsParser.g:1985:4: ()
                    // InternalGoatComponentsParser.g:1986:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getStringConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:1992:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:1993:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:1993:5: (lv_value_6_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:1994:6: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_6_0, grammarAccess.getEnvInitValueAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvInitValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:2012:3: ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:2012:3: ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:2013:4: () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:2013:4: ()
                    // InternalGoatComponentsParser.g:2014:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getBoolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2020:4: ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) )
                    // InternalGoatComponentsParser.g:2021:5: ( (lv_value_8_1= True | lv_value_8_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:2021:5: ( (lv_value_8_1= True | lv_value_8_2= False ) )
                    // InternalGoatComponentsParser.g:2022:6: (lv_value_8_1= True | lv_value_8_2= False )
                    {
                    // InternalGoatComponentsParser.g:2022:6: (lv_value_8_1= True | lv_value_8_2= False )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==True) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==False) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2023:7: lv_value_8_1= True
                            {
                            lv_value_8_1=(Token)match(input,True,FOLLOW_2); 

                            							newLeafNode(lv_value_8_1, grammarAccess.getEnvInitValueAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEnvInitValueRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:2034:7: lv_value_8_2= False
                            {
                            lv_value_8_2=(Token)match(input,False,FOLLOW_2); 

                            							newLeafNode(lv_value_8_2, grammarAccess.getEnvInitValueAccess().getValueFalseKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEnvInitValueRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGoatComponentsParser.g:2049:3: ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket )
                    {
                    // InternalGoatComponentsParser.g:2049:3: ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket )
                    // InternalGoatComponentsParser.g:2050:4: () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket
                    {
                    // InternalGoatComponentsParser.g:2050:4: ()
                    // InternalGoatComponentsParser.g:2051:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getTupleConstantAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,LeftSquareBracket,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvInitValueAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalGoatComponentsParser.g:2061:4: ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==False||LA27_0==True||LA27_0==HyphenMinus||LA27_0==LeftSquareBracket||(LA27_0>=RULE_INT && LA27_0<=RULE_STRING)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2062:5: ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )*
                            {
                            // InternalGoatComponentsParser.g:2062:5: ( (lv_elem_11_0= ruleEnvInitValue ) )
                            // InternalGoatComponentsParser.g:2063:6: (lv_elem_11_0= ruleEnvInitValue )
                            {
                            // InternalGoatComponentsParser.g:2063:6: (lv_elem_11_0= ruleEnvInitValue )
                            // InternalGoatComponentsParser.g:2064:7: lv_elem_11_0= ruleEnvInitValue
                            {

                            							newCompositeNode(grammarAccess.getEnvInitValueAccess().getElemEnvInitValueParserRuleCall_4_2_0_0());
                            						
                            pushFollow(FOLLOW_33);
                            lv_elem_11_0=ruleEnvInitValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEnvInitValueRule());
                            							}
                            							add(
                            								current,
                            								"elem",
                            								lv_elem_11_0,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.EnvInitValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGoatComponentsParser.g:2081:5: (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==Comma) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:2082:6: otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) )
                            	    {
                            	    otherlv_12=(Token)match(input,Comma,FOLLOW_38); 

                            	    						newLeafNode(otherlv_12, grammarAccess.getEnvInitValueAccess().getCommaKeyword_4_2_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:2086:6: ( (lv_elem_13_0= ruleEnvInitValue ) )
                            	    // InternalGoatComponentsParser.g:2087:7: (lv_elem_13_0= ruleEnvInitValue )
                            	    {
                            	    // InternalGoatComponentsParser.g:2087:7: (lv_elem_13_0= ruleEnvInitValue )
                            	    // InternalGoatComponentsParser.g:2088:8: lv_elem_13_0= ruleEnvInitValue
                            	    {

                            	    								newCompositeNode(grammarAccess.getEnvInitValueAccess().getElemEnvInitValueParserRuleCall_4_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_33);
                            	    lv_elem_13_0=ruleEnvInitValue();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEnvInitValueRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"elem",
                            	    									lv_elem_13_0,
                            	    									"com.sysma.goat.eclipse_plugin.GoatComponents.EnvInitValue");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnvInitValueAccess().getRightSquareBracketKeyword_4_3());
                    			

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


    // $ANTLR start "entryRuleEnvInitOrArg"
    // InternalGoatComponentsParser.g:2116:1: entryRuleEnvInitOrArg returns [EObject current=null] : iv_ruleEnvInitOrArg= ruleEnvInitOrArg EOF ;
    public final EObject entryRuleEnvInitOrArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvInitOrArg = null;


        try {
            // InternalGoatComponentsParser.g:2116:53: (iv_ruleEnvInitOrArg= ruleEnvInitOrArg EOF )
            // InternalGoatComponentsParser.g:2117:2: iv_ruleEnvInitOrArg= ruleEnvInitOrArg EOF
            {
             newCompositeNode(grammarAccess.getEnvInitOrArgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvInitOrArg=ruleEnvInitOrArg();

            state._fsp--;

             current =iv_ruleEnvInitOrArg; 
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
    // $ANTLR end "entryRuleEnvInitOrArg"


    // $ANTLR start "ruleEnvInitOrArg"
    // InternalGoatComponentsParser.g:2123:1: ruleEnvInitOrArg returns [EObject current=null] : (this_EnvInitValue_0= ruleEnvInitValue | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleEnvInitOrArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EnvInitValue_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2129:2: ( (this_EnvInitValue_0= ruleEnvInitValue | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalGoatComponentsParser.g:2130:2: (this_EnvInitValue_0= ruleEnvInitValue | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalGoatComponentsParser.g:2130:2: (this_EnvInitValue_0= ruleEnvInitValue | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==False||LA29_0==True||LA29_0==HyphenMinus||LA29_0==LeftSquareBracket||(LA29_0>=RULE_INT && LA29_0<=RULE_STRING)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGoatComponentsParser.g:2131:3: this_EnvInitValue_0= ruleEnvInitValue
                    {

                    			newCompositeNode(grammarAccess.getEnvInitOrArgAccess().getEnvInitValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnvInitValue_0=ruleEnvInitValue();

                    state._fsp--;


                    			current = this_EnvInitValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2140:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:2140:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:2141:4: () ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:2141:4: ()
                    // InternalGoatComponentsParser.g:2142:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitOrArgAccess().getEnvironmentArgAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2148:4: ( (otherlv_2= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2149:5: (otherlv_2= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2149:5: (otherlv_2= RULE_ID )
                    // InternalGoatComponentsParser.g:2150:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvInitOrArgRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getEnvInitOrArgAccess().getArgEnvParamCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleEnvInitOrArg"


    // $ANTLR start "entryRuleEnvironment"
    // InternalGoatComponentsParser.g:2166:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalGoatComponentsParser.g:2166:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalGoatComponentsParser.g:2167:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalGoatComponentsParser.g:2173:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket ) ;
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
            // InternalGoatComponentsParser.g:2179:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:2180:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2180:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket )
            // InternalGoatComponentsParser.g:2181:3: () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket
            {
            // InternalGoatComponentsParser.g:2181:3: ()
            // InternalGoatComponentsParser.g:2182:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:2192:3: ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGoatComponentsParser.g:2193:4: ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )*
                    {
                    // InternalGoatComponentsParser.g:2193:4: ( (lv_attrs_2_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2194:5: (lv_attrs_2_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2194:5: (lv_attrs_2_0= RULE_ID )
                    // InternalGoatComponentsParser.g:2195:6: lv_attrs_2_0= RULE_ID
                    {
                    lv_attrs_2_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

                    otherlv_3=(Token)match(input,ColonEqualsSign,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_1());
                    			
                    // InternalGoatComponentsParser.g:2215:4: ( (lv_vals_4_0= ruleEnvInitOrArg ) )
                    // InternalGoatComponentsParser.g:2216:5: (lv_vals_4_0= ruleEnvInitOrArg )
                    {
                    // InternalGoatComponentsParser.g:2216:5: (lv_vals_4_0= ruleEnvInitOrArg )
                    // InternalGoatComponentsParser.g:2217:6: lv_vals_4_0= ruleEnvInitOrArg
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getValsEnvInitOrArgParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_vals_4_0=ruleEnvInitOrArg();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"vals",
                    							lv_vals_4_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.EnvInitOrArg");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:2234:4: (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==Comma) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:2235:5: otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:2239:5: ( (lv_attrs_6_0= RULE_ID ) )
                    	    // InternalGoatComponentsParser.g:2240:6: (lv_attrs_6_0= RULE_ID )
                    	    {
                    	    // InternalGoatComponentsParser.g:2240:6: (lv_attrs_6_0= RULE_ID )
                    	    // InternalGoatComponentsParser.g:2241:7: lv_attrs_6_0= RULE_ID
                    	    {
                    	    lv_attrs_6_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

                    	    otherlv_7=(Token)match(input,ColonEqualsSign,FOLLOW_39); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_3_2());
                    	    				
                    	    // InternalGoatComponentsParser.g:2261:5: ( (lv_vals_8_0= ruleEnvInitOrArg ) )
                    	    // InternalGoatComponentsParser.g:2262:6: (lv_vals_8_0= ruleEnvInitOrArg )
                    	    {
                    	    // InternalGoatComponentsParser.g:2262:6: (lv_vals_8_0= ruleEnvInitOrArg )
                    	    // InternalGoatComponentsParser.g:2263:7: lv_vals_8_0= ruleEnvInitOrArg
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getValsEnvInitOrArgParserRuleCall_2_3_3_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_vals_8_0=ruleEnvInitOrArg();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vals",
                    	    								lv_vals_8_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.EnvInitOrArg");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
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


    // $ANTLR start "entryRuleEnvParam"
    // InternalGoatComponentsParser.g:2290:1: entryRuleEnvParam returns [EObject current=null] : iv_ruleEnvParam= ruleEnvParam EOF ;
    public final EObject entryRuleEnvParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvParam = null;


        try {
            // InternalGoatComponentsParser.g:2290:49: (iv_ruleEnvParam= ruleEnvParam EOF )
            // InternalGoatComponentsParser.g:2291:2: iv_ruleEnvParam= ruleEnvParam EOF
            {
             newCompositeNode(grammarAccess.getEnvParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvParam=ruleEnvParam();

            state._fsp--;

             current =iv_ruleEnvParam; 
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
    // $ANTLR end "entryRuleEnvParam"


    // $ANTLR start "ruleEnvParam"
    // InternalGoatComponentsParser.g:2297:1: ruleEnvParam returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnvParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2303:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:2304:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:2304:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2305:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2305:3: (lv_name_0_0= RULE_ID )
            // InternalGoatComponentsParser.g:2306:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEnvParamAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnvParamRule());
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
    // $ANTLR end "ruleEnvParam"


    // $ANTLR start "entryRuleEnvironmentDefinition"
    // InternalGoatComponentsParser.g:2325:1: entryRuleEnvironmentDefinition returns [EObject current=null] : iv_ruleEnvironmentDefinition= ruleEnvironmentDefinition EOF ;
    public final EObject entryRuleEnvironmentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentDefinition = null;


        try {
            // InternalGoatComponentsParser.g:2325:62: (iv_ruleEnvironmentDefinition= ruleEnvironmentDefinition EOF )
            // InternalGoatComponentsParser.g:2326:2: iv_ruleEnvironmentDefinition= ruleEnvironmentDefinition EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentDefinition=ruleEnvironmentDefinition();

            state._fsp--;

             current =iv_ruleEnvironmentDefinition; 
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
    // $ANTLR end "entryRuleEnvironmentDefinition"


    // $ANTLR start "ruleEnvironmentDefinition"
    // InternalGoatComponentsParser.g:2332:1: ruleEnvironmentDefinition returns [EObject current=null] : (otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) ) ) ;
    public final EObject ruleEnvironmentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_envParams_3_0 = null;

        EObject lv_envParams_5_0 = null;

        EObject lv_env_7_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2338:2: ( (otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) ) ) )
            // InternalGoatComponentsParser.g:2339:2: (otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) ) )
            {
            // InternalGoatComponentsParser.g:2339:2: (otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) ) )
            // InternalGoatComponentsParser.g:2340:3: otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) )
            {
            otherlv_0=(Token)match(input,Environment,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentDefinitionAccess().getEnvironmentKeyword_0());
            		
            // InternalGoatComponentsParser.g:2344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2345:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:2346:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnvironmentDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGoatComponentsParser.g:2362:3: (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LeftParenthesis) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGoatComponentsParser.g:2363:4: otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis
                    {
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnvironmentDefinitionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalGoatComponentsParser.g:2367:4: ( (lv_envParams_3_0= ruleEnvParam ) )
                    // InternalGoatComponentsParser.g:2368:5: (lv_envParams_3_0= ruleEnvParam )
                    {
                    // InternalGoatComponentsParser.g:2368:5: (lv_envParams_3_0= ruleEnvParam )
                    // InternalGoatComponentsParser.g:2369:6: lv_envParams_3_0= ruleEnvParam
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentDefinitionAccess().getEnvParamsEnvParamParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_envParams_3_0=ruleEnvParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"envParams",
                    							lv_envParams_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.EnvParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoatComponentsParser.g:2386:4: (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Comma) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:2387:5: otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEnvironmentDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:2391:5: ( (lv_envParams_5_0= ruleEnvParam ) )
                    	    // InternalGoatComponentsParser.g:2392:6: (lv_envParams_5_0= ruleEnvParam )
                    	    {
                    	    // InternalGoatComponentsParser.g:2392:6: (lv_envParams_5_0= ruleEnvParam )
                    	    // InternalGoatComponentsParser.g:2393:7: lv_envParams_5_0= ruleEnvParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentDefinitionAccess().getEnvParamsEnvParamParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_envParams_5_0=ruleEnvParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"envParams",
                    	    								lv_envParams_5_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatComponents.EnvParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_40); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentDefinitionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalGoatComponentsParser.g:2416:3: ( (lv_env_7_0= ruleEnvironment ) )
            // InternalGoatComponentsParser.g:2417:4: (lv_env_7_0= ruleEnvironment )
            {
            // InternalGoatComponentsParser.g:2417:4: (lv_env_7_0= ruleEnvironment )
            // InternalGoatComponentsParser.g:2418:5: lv_env_7_0= ruleEnvironment
            {

            					newCompositeNode(grammarAccess.getEnvironmentDefinitionAccess().getEnvEnvironmentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_env_7_0=ruleEnvironment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentDefinitionRule());
            					}
            					set(
            						current,
            						"env",
            						lv_env_7_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Environment");
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
    // $ANTLR end "ruleEnvironmentDefinition"


    // $ANTLR start "entryRuleComponentDefinition"
    // InternalGoatComponentsParser.g:2439:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // InternalGoatComponentsParser.g:2439:60: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // InternalGoatComponentsParser.g:2440:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
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
    // InternalGoatComponentsParser.g:2446:1: ruleComponentDefinition returns [EObject current=null] : (otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) ) ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_envargs_3_0 = null;

        EObject lv_envargs_5_0 = null;

        EObject lv_env_7_0 = null;

        EObject lv_block_9_1 = null;

        EObject lv_block_9_2 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2452:2: ( (otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) ) ) )
            // InternalGoatComponentsParser.g:2453:2: (otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) ) )
            {
            // InternalGoatComponentsParser.g:2453:2: (otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) ) )
            // InternalGoatComponentsParser.g:2454:3: otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) )
            {
            otherlv_0=(Token)match(input,Component,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDefinitionAccess().getComponentKeyword_0());
            		
            // InternalGoatComponentsParser.g:2458:3: ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==LeftCurlyBracket) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalGoatComponentsParser.g:2459:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? )
                    {
                    // InternalGoatComponentsParser.g:2459:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? )
                    // InternalGoatComponentsParser.g:2460:5: ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )?
                    {
                    // InternalGoatComponentsParser.g:2460:5: ( (otherlv_1= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2461:6: (otherlv_1= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2461:6: (otherlv_1= RULE_ID )
                    // InternalGoatComponentsParser.g:2462:7: otherlv_1= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentDefinitionRule());
                    							}
                    						
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_43); 

                    							newLeafNode(otherlv_1, grammarAccess.getComponentDefinitionAccess().getEnvrefEnvironmentDefinitionCrossReference_1_0_0_0());
                    						

                    }


                    }

                    // InternalGoatComponentsParser.g:2473:5: (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==LeftParenthesis) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2474:6: otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_39); 

                            						newLeafNode(otherlv_2, grammarAccess.getComponentDefinitionAccess().getLeftParenthesisKeyword_1_0_1_0());
                            					
                            // InternalGoatComponentsParser.g:2478:6: ( (lv_envargs_3_0= ruleEnvInitOrArg ) )
                            // InternalGoatComponentsParser.g:2479:7: (lv_envargs_3_0= ruleEnvInitOrArg )
                            {
                            // InternalGoatComponentsParser.g:2479:7: (lv_envargs_3_0= ruleEnvInitOrArg )
                            // InternalGoatComponentsParser.g:2480:8: lv_envargs_3_0= ruleEnvInitOrArg
                            {

                            								newCompositeNode(grammarAccess.getComponentDefinitionAccess().getEnvargsEnvInitOrArgParserRuleCall_1_0_1_1_0());
                            							
                            pushFollow(FOLLOW_41);
                            lv_envargs_3_0=ruleEnvInitOrArg();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
                            								}
                            								add(
                            									current,
                            									"envargs",
                            									lv_envargs_3_0,
                            									"com.sysma.goat.eclipse_plugin.GoatComponents.EnvInitOrArg");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalGoatComponentsParser.g:2497:6: (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==Comma) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:2498:7: otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FOLLOW_39); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getComponentDefinitionAccess().getCommaKeyword_1_0_1_2_0());
                            	    						
                            	    // InternalGoatComponentsParser.g:2502:7: ( (lv_envargs_5_0= ruleEnvInitOrArg ) )
                            	    // InternalGoatComponentsParser.g:2503:8: (lv_envargs_5_0= ruleEnvInitOrArg )
                            	    {
                            	    // InternalGoatComponentsParser.g:2503:8: (lv_envargs_5_0= ruleEnvInitOrArg )
                            	    // InternalGoatComponentsParser.g:2504:9: lv_envargs_5_0= ruleEnvInitOrArg
                            	    {

                            	    									newCompositeNode(grammarAccess.getComponentDefinitionAccess().getEnvargsEnvInitOrArgParserRuleCall_1_0_1_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_41);
                            	    lv_envargs_5_0=ruleEnvInitOrArg();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"envargs",
                            	    										lv_envargs_5_0,
                            	    										"com.sysma.goat.eclipse_plugin.GoatComponents.EnvInitOrArg");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_20); 

                            						newLeafNode(otherlv_6, grammarAccess.getComponentDefinitionAccess().getRightParenthesisKeyword_1_0_1_3());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2529:4: ( (lv_env_7_0= ruleEnvironment ) )
                    {
                    // InternalGoatComponentsParser.g:2529:4: ( (lv_env_7_0= ruleEnvironment ) )
                    // InternalGoatComponentsParser.g:2530:5: (lv_env_7_0= ruleEnvironment )
                    {
                    // InternalGoatComponentsParser.g:2530:5: (lv_env_7_0= ruleEnvironment )
                    // InternalGoatComponentsParser.g:2531:6: lv_env_7_0= ruleEnvironment
                    {

                    						newCompositeNode(grammarAccess.getComponentDefinitionAccess().getEnvEnvironmentParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_env_7_0=ruleEnvironment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"env",
                    							lv_env_7_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Environment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,Colon,FOLLOW_44); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentDefinitionAccess().getColonKeyword_2());
            		
            // InternalGoatComponentsParser.g:2553:3: ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) )
            // InternalGoatComponentsParser.g:2554:4: ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) )
            {
            // InternalGoatComponentsParser.g:2554:4: ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) )
            // InternalGoatComponentsParser.g:2555:5: (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock )
            {
            // InternalGoatComponentsParser.g:2555:5: (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==LeftCurlyBracket) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalGoatComponentsParser.g:2556:6: lv_block_9_1= rulePDPBlock
                    {

                    						newCompositeNode(grammarAccess.getComponentDefinitionAccess().getBlockPDPBlockParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_9_1=rulePDPBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_9_1,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.PDPBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:2572:6: lv_block_9_2= ruleProcessBlock
                    {

                    						newCompositeNode(grammarAccess.getComponentDefinitionAccess().getBlockProcessBlockParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_9_2=ruleProcessBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_9_2,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // InternalGoatComponentsParser.g:2594:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGoatComponentsParser.g:2594:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGoatComponentsParser.g:2595:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGoatComponentsParser.g:2601:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2607:2: (this_Or_0= ruleOr )
            // InternalGoatComponentsParser.g:2608:2: this_Or_0= ruleOr
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
    // InternalGoatComponentsParser.g:2619:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalGoatComponentsParser.g:2619:43: (iv_ruleOr= ruleOr EOF )
            // InternalGoatComponentsParser.g:2620:2: iv_ruleOr= ruleOr EOF
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
    // InternalGoatComponentsParser.g:2626:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_sub_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2632:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )* ) )
            // InternalGoatComponentsParser.g:2633:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )* )
            {
            // InternalGoatComponentsParser.g:2633:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )* )
            // InternalGoatComponentsParser.g:2634:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2642:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==VerticalLineVerticalLine) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2643:4: () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) )
            	    {
            	    // InternalGoatComponentsParser.g:2643:4: ()
            	    // InternalGoatComponentsParser.g:2644:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrAccess().getOrSubAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:2654:4: ( (lv_sub_3_0= ruleAnd ) )
            	    // InternalGoatComponentsParser.g:2655:5: (lv_sub_3_0= ruleAnd )
            	    {
            	    // InternalGoatComponentsParser.g:2655:5: (lv_sub_3_0= ruleAnd )
            	    // InternalGoatComponentsParser.g:2656:6: lv_sub_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getSubAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_sub_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sub",
            	    							lv_sub_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalGoatComponentsParser.g:2678:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGoatComponentsParser.g:2678:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGoatComponentsParser.g:2679:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalGoatComponentsParser.g:2685:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_sub_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2691:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )* ) )
            // InternalGoatComponentsParser.g:2692:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )* )
            {
            // InternalGoatComponentsParser.g:2692:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )* )
            // InternalGoatComponentsParser.g:2693:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2701:3: ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==AmpersandAmpersand) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2702:4: () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) )
            	    {
            	    // InternalGoatComponentsParser.g:2702:4: ()
            	    // InternalGoatComponentsParser.g:2703:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndAccess().getAndSubAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:2713:4: ( (lv_sub_3_0= ruleEquality ) )
            	    // InternalGoatComponentsParser.g:2714:5: (lv_sub_3_0= ruleEquality )
            	    {
            	    // InternalGoatComponentsParser.g:2714:5: (lv_sub_3_0= ruleEquality )
            	    // InternalGoatComponentsParser.g:2715:6: lv_sub_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getSubEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_sub_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sub",
            	    							lv_sub_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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


    // $ANTLR start "entryRuleEquality"
    // InternalGoatComponentsParser.g:2737:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalGoatComponentsParser.g:2737:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalGoatComponentsParser.g:2738:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalGoatComponentsParser.g:2744:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2750:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? ) )
            // InternalGoatComponentsParser.g:2751:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? )
            {
            // InternalGoatComponentsParser.g:2751:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? )
            // InternalGoatComponentsParser.g:2752:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )?
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2760:3: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ExclamationMarkEqualsSign||LA41_0==EqualsSignEqualsSign) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGoatComponentsParser.g:2761:4: () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) )
                    {
                    // InternalGoatComponentsParser.g:2761:4: ()
                    // InternalGoatComponentsParser.g:2762:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2768:4: ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) )
                    // InternalGoatComponentsParser.g:2769:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
                    {
                    // InternalGoatComponentsParser.g:2769:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
                    // InternalGoatComponentsParser.g:2770:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:2770:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==EqualsSignEqualsSign) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==ExclamationMarkEqualsSign) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2771:7: lv_op_2_1= EqualsSignEqualsSign
                            {
                            lv_op_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_13); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEqualityRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:2782:7: lv_op_2_2= ExclamationMarkEqualsSign
                            {
                            lv_op_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_13); 

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

                    // InternalGoatComponentsParser.g:2795:4: ( (lv_right_3_0= ruleComparison ) )
                    // InternalGoatComponentsParser.g:2796:5: (lv_right_3_0= ruleComparison )
                    {
                    // InternalGoatComponentsParser.g:2796:5: (lv_right_3_0= ruleComparison )
                    // InternalGoatComponentsParser.g:2797:6: lv_right_3_0= ruleComparison
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
    // InternalGoatComponentsParser.g:2819:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalGoatComponentsParser.g:2819:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalGoatComponentsParser.g:2820:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalGoatComponentsParser.g:2826:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? ) ;
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
            // InternalGoatComponentsParser.g:2832:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? ) )
            // InternalGoatComponentsParser.g:2833:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? )
            {
            // InternalGoatComponentsParser.g:2833:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? )
            // InternalGoatComponentsParser.g:2834:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )?
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2842:3: ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LessThanSignEqualsSign||LA43_0==GreaterThanSignEqualsSign||LA43_0==LessThanSign||LA43_0==GreaterThanSign) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGoatComponentsParser.g:2843:4: () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
                    {
                    // InternalGoatComponentsParser.g:2843:4: ()
                    // InternalGoatComponentsParser.g:2844:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2850:4: ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) )
                    // InternalGoatComponentsParser.g:2851:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
                    {
                    // InternalGoatComponentsParser.g:2851:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
                    // InternalGoatComponentsParser.g:2852:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
                    {
                    // InternalGoatComponentsParser.g:2852:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
                    int alt42=4;
                    switch ( input.LA(1) ) {
                    case GreaterThanSignEqualsSign:
                        {
                        alt42=1;
                        }
                        break;
                    case LessThanSignEqualsSign:
                        {
                        alt42=2;
                        }
                        break;
                    case GreaterThanSign:
                        {
                        alt42=3;
                        }
                        break;
                    case LessThanSign:
                        {
                        alt42=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2853:7: lv_op_2_1= GreaterThanSignEqualsSign
                            {
                            lv_op_2_1=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_13); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparisonRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:2864:7: lv_op_2_2= LessThanSignEqualsSign
                            {
                            lv_op_2_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_13); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparisonRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalGoatComponentsParser.g:2875:7: lv_op_2_3= GreaterThanSign
                            {
                            lv_op_2_3=(Token)match(input,GreaterThanSign,FOLLOW_13); 

                            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparisonRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalGoatComponentsParser.g:2886:7: lv_op_2_4= LessThanSign
                            {
                            lv_op_2_4=(Token)match(input,LessThanSign,FOLLOW_13); 

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

                    // InternalGoatComponentsParser.g:2899:4: ( (lv_right_3_0= rulePlusOrMinus ) )
                    // InternalGoatComponentsParser.g:2900:5: (lv_right_3_0= rulePlusOrMinus )
                    {
                    // InternalGoatComponentsParser.g:2900:5: (lv_right_3_0= rulePlusOrMinus )
                    // InternalGoatComponentsParser.g:2901:6: lv_right_3_0= rulePlusOrMinus
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
    // InternalGoatComponentsParser.g:2923:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalGoatComponentsParser.g:2923:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalGoatComponentsParser.g:2924:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalGoatComponentsParser.g:2930:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2936:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? ) )
            // InternalGoatComponentsParser.g:2937:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? )
            {
            // InternalGoatComponentsParser.g:2937:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? )
            // InternalGoatComponentsParser.g:2938:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )?
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2946:3: ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==PlusSignPlusSign||LA45_0==PlusSign||LA45_0==HyphenMinus) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGoatComponentsParser.g:2947:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) )
                    {
                    // InternalGoatComponentsParser.g:2947:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) )
                    int alt44=3;
                    switch ( input.LA(1) ) {
                    case PlusSign:
                        {
                        alt44=1;
                        }
                        break;
                    case HyphenMinus:
                        {
                        alt44=2;
                        }
                        break;
                    case PlusSignPlusSign:
                        {
                        alt44=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }

                    switch (alt44) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2948:5: ( () otherlv_2= PlusSign )
                            {
                            // InternalGoatComponentsParser.g:2948:5: ( () otherlv_2= PlusSign )
                            // InternalGoatComponentsParser.g:2949:6: () otherlv_2= PlusSign
                            {
                            // InternalGoatComponentsParser.g:2949:6: ()
                            // InternalGoatComponentsParser.g:2950:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_2=(Token)match(input,PlusSign,FOLLOW_13); 

                            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:2962:5: ( () otherlv_4= HyphenMinus )
                            {
                            // InternalGoatComponentsParser.g:2962:5: ( () otherlv_4= HyphenMinus )
                            // InternalGoatComponentsParser.g:2963:6: () otherlv_4= HyphenMinus
                            {
                            // InternalGoatComponentsParser.g:2963:6: ()
                            // InternalGoatComponentsParser.g:2964:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_13); 

                            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalGoatComponentsParser.g:2976:5: ( () otherlv_6= PlusSignPlusSign )
                            {
                            // InternalGoatComponentsParser.g:2976:5: ( () otherlv_6= PlusSignPlusSign )
                            // InternalGoatComponentsParser.g:2977:6: () otherlv_6= PlusSignPlusSign
                            {
                            // InternalGoatComponentsParser.g:2977:6: ()
                            // InternalGoatComponentsParser.g:2978:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getPlusOrMinusAccess().getConcatenateLeftAction_1_0_2_0(),
                            								current);
                            						

                            }

                            otherlv_6=(Token)match(input,PlusSignPlusSign,FOLLOW_13); 

                            						newLeafNode(otherlv_6, grammarAccess.getPlusOrMinusAccess().getPlusSignPlusSignKeyword_1_0_2_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalGoatComponentsParser.g:2990:4: ( (lv_right_7_0= ruleMulOrDiv ) )
                    // InternalGoatComponentsParser.g:2991:5: (lv_right_7_0= ruleMulOrDiv )
                    {
                    // InternalGoatComponentsParser.g:2991:5: (lv_right_7_0= ruleMulOrDiv )
                    // InternalGoatComponentsParser.g:2992:6: lv_right_7_0= ruleMulOrDiv
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
    // InternalGoatComponentsParser.g:3014:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalGoatComponentsParser.g:3014:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalGoatComponentsParser.g:3015:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalGoatComponentsParser.g:3021:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3027:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? ) )
            // InternalGoatComponentsParser.g:3028:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? )
            {
            // InternalGoatComponentsParser.g:3028:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? )
            // InternalGoatComponentsParser.g:3029:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )?
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3037:3: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==PercentSign||LA47_0==Asterisk||LA47_0==Solidus) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGoatComponentsParser.g:3038:4: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) )
                    {
                    // InternalGoatComponentsParser.g:3038:4: ()
                    // InternalGoatComponentsParser.g:3039:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3045:4: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) )
                    // InternalGoatComponentsParser.g:3046:5: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
                    {
                    // InternalGoatComponentsParser.g:3046:5: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
                    // InternalGoatComponentsParser.g:3047:6: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
                    {
                    // InternalGoatComponentsParser.g:3047:6: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
                    int alt46=3;
                    switch ( input.LA(1) ) {
                    case Asterisk:
                        {
                        alt46=1;
                        }
                        break;
                    case Solidus:
                        {
                        alt46=2;
                        }
                        break;
                    case PercentSign:
                        {
                        alt46=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }

                    switch (alt46) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3048:7: lv_op_2_1= Asterisk
                            {
                            lv_op_2_1=(Token)match(input,Asterisk,FOLLOW_13); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMulOrDivRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:3059:7: lv_op_2_2= Solidus
                            {
                            lv_op_2_2=(Token)match(input,Solidus,FOLLOW_13); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMulOrDivRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalGoatComponentsParser.g:3070:7: lv_op_2_3= PercentSign
                            {
                            lv_op_2_3=(Token)match(input,PercentSign,FOLLOW_13); 

                            							newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMulOrDivRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_3, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalGoatComponentsParser.g:3083:4: ( (lv_right_3_0= rulePrimary ) )
                    // InternalGoatComponentsParser.g:3084:5: (lv_right_3_0= rulePrimary )
                    {
                    // InternalGoatComponentsParser.g:3084:5: (lv_right_3_0= rulePrimary )
                    // InternalGoatComponentsParser.g:3085:6: lv_right_3_0= rulePrimary
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
    // InternalGoatComponentsParser.g:3107:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGoatComponentsParser.g:3107:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGoatComponentsParser.g:3108:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalGoatComponentsParser.g:3114:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) ) | ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) ) | this_ContainmentExpr_6= ruleContainmentExpr ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_ContainmentExpr_6 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3120:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) ) | ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) ) | this_ContainmentExpr_6= ruleContainmentExpr ) )
            // InternalGoatComponentsParser.g:3121:2: ( ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) ) | ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) ) | this_ContainmentExpr_6= ruleContainmentExpr )
            {
            // InternalGoatComponentsParser.g:3121:2: ( ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) ) | ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) ) | this_ContainmentExpr_6= ruleContainmentExpr )
            int alt48=3;
            switch ( input.LA(1) ) {
            case HyphenMinus:
                {
                alt48=1;
                }
                break;
            case ExclamationMark:
                {
                alt48=2;
                }
                break;
            case Length:
            case False:
            case Comp:
            case Proc:
            case True:
            case LeftParenthesis:
            case LeftSquareBracket:
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
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
                    // InternalGoatComponentsParser.g:3122:3: ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) )
                    {
                    // InternalGoatComponentsParser.g:3122:3: ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) )
                    // InternalGoatComponentsParser.g:3123:4: () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) )
                    {
                    // InternalGoatComponentsParser.g:3123:4: ()
                    // InternalGoatComponentsParser.g:3124:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUnaryMinusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:3134:4: ( (lv_expression_2_0= ruleContainmentExpr ) )
                    // InternalGoatComponentsParser.g:3135:5: (lv_expression_2_0= ruleContainmentExpr )
                    {
                    // InternalGoatComponentsParser.g:3135:5: (lv_expression_2_0= ruleContainmentExpr )
                    // InternalGoatComponentsParser.g:3136:6: lv_expression_2_0= ruleContainmentExpr
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionContainmentExprParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleContainmentExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.ContainmentExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:3155:3: ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) )
                    {
                    // InternalGoatComponentsParser.g:3155:3: ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) )
                    // InternalGoatComponentsParser.g:3156:4: () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) )
                    {
                    // InternalGoatComponentsParser.g:3156:4: ()
                    // InternalGoatComponentsParser.g:3157:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,ExclamationMark,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalGoatComponentsParser.g:3167:4: ( (lv_expression_5_0= ruleContainmentExpr ) )
                    // InternalGoatComponentsParser.g:3168:5: (lv_expression_5_0= ruleContainmentExpr )
                    {
                    // InternalGoatComponentsParser.g:3168:5: (lv_expression_5_0= ruleContainmentExpr )
                    // InternalGoatComponentsParser.g:3169:6: lv_expression_5_0= ruleContainmentExpr
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionContainmentExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleContainmentExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.ContainmentExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:3188:3: this_ContainmentExpr_6= ruleContainmentExpr
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getContainmentExprParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainmentExpr_6=ruleContainmentExpr();

                    state._fsp--;


                    			current = this_ContainmentExpr_6;
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


    // $ANTLR start "entryRuleContainmentExpr"
    // InternalGoatComponentsParser.g:3200:1: entryRuleContainmentExpr returns [EObject current=null] : iv_ruleContainmentExpr= ruleContainmentExpr EOF ;
    public final EObject entryRuleContainmentExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentExpr = null;


        try {
            // InternalGoatComponentsParser.g:3200:56: (iv_ruleContainmentExpr= ruleContainmentExpr EOF )
            // InternalGoatComponentsParser.g:3201:2: iv_ruleContainmentExpr= ruleContainmentExpr EOF
            {
             newCompositeNode(grammarAccess.getContainmentExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainmentExpr=ruleContainmentExpr();

            state._fsp--;

             current =iv_ruleContainmentExpr; 
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
    // $ANTLR end "entryRuleContainmentExpr"


    // $ANTLR start "ruleContainmentExpr"
    // InternalGoatComponentsParser.g:3207:1: ruleContainmentExpr returns [EObject current=null] : (this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )? ) ;
    public final EObject ruleContainmentExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AtomicOrExpr_0 = null;

        EObject lv_tuple_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3213:2: ( (this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )? ) )
            // InternalGoatComponentsParser.g:3214:2: (this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )? )
            {
            // InternalGoatComponentsParser.g:3214:2: (this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )? )
            // InternalGoatComponentsParser.g:3215:3: this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )?
            {

            			newCompositeNode(grammarAccess.getContainmentExprAccess().getAtomicOrExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_AtomicOrExpr_0=ruleAtomicOrExpr();

            state._fsp--;


            			current = this_AtomicOrExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3223:3: ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==In) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGoatComponentsParser.g:3224:4: () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) )
                    {
                    // InternalGoatComponentsParser.g:3224:4: ()
                    // InternalGoatComponentsParser.g:3225:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getContainmentExprAccess().getContainmentExpressionElemAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,In,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getContainmentExprAccess().getInKeyword_1_1());
                    			
                    // InternalGoatComponentsParser.g:3235:4: ( (lv_tuple_3_0= ruleAtomicOrExpr ) )
                    // InternalGoatComponentsParser.g:3236:5: (lv_tuple_3_0= ruleAtomicOrExpr )
                    {
                    // InternalGoatComponentsParser.g:3236:5: (lv_tuple_3_0= ruleAtomicOrExpr )
                    // InternalGoatComponentsParser.g:3237:6: lv_tuple_3_0= ruleAtomicOrExpr
                    {

                    						newCompositeNode(grammarAccess.getContainmentExprAccess().getTupleAtomicOrExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tuple_3_0=ruleAtomicOrExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContainmentExprRule());
                    						}
                    						set(
                    							current,
                    							"tuple",
                    							lv_tuple_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.AtomicOrExpr");
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
    // $ANTLR end "ruleContainmentExpr"


    // $ANTLR start "entryRuleAtomicOrExpr"
    // InternalGoatComponentsParser.g:3259:1: entryRuleAtomicOrExpr returns [EObject current=null] : iv_ruleAtomicOrExpr= ruleAtomicOrExpr EOF ;
    public final EObject entryRuleAtomicOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicOrExpr = null;


        try {
            // InternalGoatComponentsParser.g:3259:53: (iv_ruleAtomicOrExpr= ruleAtomicOrExpr EOF )
            // InternalGoatComponentsParser.g:3260:2: iv_ruleAtomicOrExpr= ruleAtomicOrExpr EOF
            {
             newCompositeNode(grammarAccess.getAtomicOrExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicOrExpr=ruleAtomicOrExpr();

            state._fsp--;

             current =iv_ruleAtomicOrExpr; 
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
    // $ANTLR end "entryRuleAtomicOrExpr"


    // $ANTLR start "ruleAtomicOrExpr"
    // InternalGoatComponentsParser.g:3266:1: ruleAtomicOrExpr returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic ) ;
    public final EObject ruleAtomicOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Atomic_3 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3272:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic ) )
            // InternalGoatComponentsParser.g:3273:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic )
            {
            // InternalGoatComponentsParser.g:3273:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LeftParenthesis) ) {
                alt50=1;
            }
            else if ( (LA50_0==Length||LA50_0==False||LA50_0==Comp||LA50_0==Proc||LA50_0==True||LA50_0==LeftSquareBracket||(LA50_0>=RULE_ID && LA50_0<=RULE_STRING)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalGoatComponentsParser.g:3274:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:3274:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalGoatComponentsParser.g:3275:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getAtomicOrExprAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomicOrExprAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicOrExprAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:3293:3: this_Atomic_3= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getAtomicOrExprAccess().getAtomicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_3=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_3;
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
    // $ANTLR end "ruleAtomicOrExpr"


    // $ANTLR start "entryRuleAtomic"
    // InternalGoatComponentsParser.g:3305:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalGoatComponentsParser.g:3305:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalGoatComponentsParser.g:3306:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalGoatComponentsParser.g:3312:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject this_AtomicIndexable_6 = null;

        EObject lv_idx_9_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3318:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? ) ) )
            // InternalGoatComponentsParser.g:3319:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? ) )
            {
            // InternalGoatComponentsParser.g:3319:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt53=1;
                }
                break;
            case RULE_STRING:
                {
                alt53=2;
                }
                break;
            case False:
            case True:
                {
                alt53=3;
                }
                break;
            case Length:
            case Comp:
            case Proc:
            case LeftSquareBracket:
            case RULE_ID:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalGoatComponentsParser.g:3320:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:3320:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:3321:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:3321:4: ()
                    // InternalGoatComponentsParser.g:3322:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3328:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:3329:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:3329:5: (lv_value_1_0= RULE_INT )
                    // InternalGoatComponentsParser.g:3330:6: lv_value_1_0= RULE_INT
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
                    // InternalGoatComponentsParser.g:3348:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalGoatComponentsParser.g:3348:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalGoatComponentsParser.g:3349:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalGoatComponentsParser.g:3349:4: ()
                    // InternalGoatComponentsParser.g:3350:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3356:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:3357:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:3357:5: (lv_value_3_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:3358:6: lv_value_3_0= RULE_STRING
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
                    // InternalGoatComponentsParser.g:3376:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:3376:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:3377:4: () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:3377:4: ()
                    // InternalGoatComponentsParser.g:3378:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3384:4: ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    // InternalGoatComponentsParser.g:3385:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:3385:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    // InternalGoatComponentsParser.g:3386:6: (lv_value_5_1= True | lv_value_5_2= False )
                    {
                    // InternalGoatComponentsParser.g:3386:6: (lv_value_5_1= True | lv_value_5_2= False )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==True) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==False) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3387:7: lv_value_5_1= True
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
                            // InternalGoatComponentsParser.g:3398:7: lv_value_5_2= False
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
                    // InternalGoatComponentsParser.g:3413:3: (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? )
                    {
                    // InternalGoatComponentsParser.g:3413:3: (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? )
                    // InternalGoatComponentsParser.g:3414:4: this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )?
                    {

                    				newCompositeNode(grammarAccess.getAtomicAccess().getAtomicIndexableParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_52);
                    this_AtomicIndexable_6=ruleAtomicIndexable();

                    state._fsp--;


                    				current = this_AtomicIndexable_6;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalGoatComponentsParser.g:3422:4: (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==LeftSquareBracket) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3423:5: otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket
                            {
                            otherlv_7=(Token)match(input,LeftSquareBracket,FOLLOW_13); 

                            					newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getLeftSquareBracketKeyword_3_1_0());
                            				
                            // InternalGoatComponentsParser.g:3427:5: ()
                            // InternalGoatComponentsParser.g:3428:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getAtomicAccess().getTupleGetElemAction_3_1_1(),
                            							current);
                            					

                            }

                            // InternalGoatComponentsParser.g:3434:5: ( (lv_idx_9_0= ruleExpression ) )
                            // InternalGoatComponentsParser.g:3435:6: (lv_idx_9_0= ruleExpression )
                            {
                            // InternalGoatComponentsParser.g:3435:6: (lv_idx_9_0= ruleExpression )
                            // InternalGoatComponentsParser.g:3436:7: lv_idx_9_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getAtomicAccess().getIdxExpressionParserRuleCall_3_1_2_0());
                            						
                            pushFollow(FOLLOW_53);
                            lv_idx_9_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAtomicRule());
                            							}
                            							set(
                            								current,
                            								"idx",
                            								lv_idx_9_0,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                            					newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getRightSquareBracketKeyword_3_1_3());
                            				

                            }
                            break;

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


    // $ANTLR start "entryRuleAtomicIndexable"
    // InternalGoatComponentsParser.g:3463:1: entryRuleAtomicIndexable returns [EObject current=null] : iv_ruleAtomicIndexable= ruleAtomicIndexable EOF ;
    public final EObject entryRuleAtomicIndexable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicIndexable = null;


        try {
            // InternalGoatComponentsParser.g:3463:56: (iv_ruleAtomicIndexable= ruleAtomicIndexable EOF )
            // InternalGoatComponentsParser.g:3464:2: iv_ruleAtomicIndexable= ruleAtomicIndexable EOF
            {
             newCompositeNode(grammarAccess.getAtomicIndexableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicIndexable=ruleAtomicIndexable();

            state._fsp--;

             current =iv_ruleAtomicIndexable; 
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
    // $ANTLR end "entryRuleAtomicIndexable"


    // $ANTLR start "ruleAtomicIndexable"
    // InternalGoatComponentsParser.g:3470:1: ruleAtomicIndexable returns [EObject current=null] : ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) ) | ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis ) | ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicIndexable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_attribute_16_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_attribute_27_0=null;
        EObject lv_elem_2_0 = null;

        EObject lv_elem_4_0 = null;

        EObject lv_elem_9_0 = null;

        EObject lv_params_20_0 = null;

        EObject lv_params_22_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3476:2: ( ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) ) | ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis ) | ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) ) ) )
            // InternalGoatComponentsParser.g:3477:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) ) | ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis ) | ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) ) )
            {
            // InternalGoatComponentsParser.g:3477:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) ) | ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis ) | ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case LeftSquareBracket:
                {
                alt58=1;
                }
                break;
            case Length:
                {
                alt58=2;
                }
                break;
            case RULE_ID:
                {
                int LA58_3 = input.LA(2);

                if ( (LA58_3==EOF||LA58_3==Return||LA58_3==While||(LA58_3>=Var && LA58_3<=PlusSignPlusSign)||(LA58_3>=LessThanSignEqualsSign && LA58_3<=VerticalLineVerticalLine)||LA58_3==PercentSign||(LA58_3>=RightParenthesis && LA58_3<=HyphenMinus)||LA58_3==Solidus||LA58_3==LessThanSign||LA58_3==GreaterThanSign||(LA58_3>=LeftSquareBracket && LA58_3<=RightSquareBracket)||LA58_3==RightCurlyBracket||LA58_3==RULE_ID) ) {
                    alt58=3;
                }
                else if ( (LA58_3==LeftParenthesis) ) {
                    alt58=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 3, input);

                    throw nvae;
                }
                }
                break;
            case Proc:
                {
                alt58=4;
                }
                break;
            case Comp:
                {
                alt58=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalGoatComponentsParser.g:3478:3: ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket )
                    {
                    // InternalGoatComponentsParser.g:3478:3: ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket )
                    // InternalGoatComponentsParser.g:3479:4: () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket
                    {
                    // InternalGoatComponentsParser.g:3479:4: ()
                    // InternalGoatComponentsParser.g:3480:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getTupleConstantAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_54); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomicIndexableAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:3490:4: ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==Length||LA55_0==False||LA55_0==Comp||LA55_0==Proc||LA55_0==True||LA55_0==ExclamationMark||LA55_0==LeftParenthesis||LA55_0==HyphenMinus||LA55_0==LeftSquareBracket||(LA55_0>=RULE_ID && LA55_0<=RULE_STRING)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3491:5: ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )*
                            {
                            // InternalGoatComponentsParser.g:3491:5: ( (lv_elem_2_0= ruleExpression ) )
                            // InternalGoatComponentsParser.g:3492:6: (lv_elem_2_0= ruleExpression )
                            {
                            // InternalGoatComponentsParser.g:3492:6: (lv_elem_2_0= ruleExpression )
                            // InternalGoatComponentsParser.g:3493:7: lv_elem_2_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getAtomicIndexableAccess().getElemExpressionParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_33);
                            lv_elem_2_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAtomicIndexableRule());
                            							}
                            							add(
                            								current,
                            								"elem",
                            								lv_elem_2_0,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGoatComponentsParser.g:3510:5: (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==Comma) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:3511:6: otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getAtomicIndexableAccess().getCommaKeyword_0_2_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:3515:6: ( (lv_elem_4_0= ruleExpression ) )
                            	    // InternalGoatComponentsParser.g:3516:7: (lv_elem_4_0= ruleExpression )
                            	    {
                            	    // InternalGoatComponentsParser.g:3516:7: (lv_elem_4_0= ruleExpression )
                            	    // InternalGoatComponentsParser.g:3517:8: lv_elem_4_0= ruleExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getAtomicIndexableAccess().getElemExpressionParserRuleCall_0_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_33);
                            	    lv_elem_4_0=ruleExpression();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getAtomicIndexableRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"elem",
                            	    									lv_elem_4_0,
                            	    									"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtomicIndexableAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:3542:3: ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:3542:3: ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis )
                    // InternalGoatComponentsParser.g:3543:4: () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:3543:4: ()
                    // InternalGoatComponentsParser.g:3544:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getTupleLengthAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,Length,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getAtomicIndexableAccess().getLengthKeyword_1_1());
                    			
                    otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getAtomicIndexableAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalGoatComponentsParser.g:3558:4: ( (lv_elem_9_0= ruleAtomic ) )
                    // InternalGoatComponentsParser.g:3559:5: (lv_elem_9_0= ruleAtomic )
                    {
                    // InternalGoatComponentsParser.g:3559:5: (lv_elem_9_0= ruleAtomic )
                    // InternalGoatComponentsParser.g:3560:6: lv_elem_9_0= ruleAtomic
                    {

                    						newCompositeNode(grammarAccess.getAtomicIndexableAccess().getElemAtomicParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_elem_9_0=ruleAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicIndexableRule());
                    						}
                    						set(
                    							current,
                    							"elem",
                    							lv_elem_9_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Atomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getAtomicIndexableAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:3583:3: ( () ( (otherlv_12= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:3583:3: ( () ( (otherlv_12= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:3584:4: () ( (otherlv_12= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:3584:4: ()
                    // InternalGoatComponentsParser.g:3585:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getLocalVarRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3591:4: ( (otherlv_12= RULE_ID ) )
                    // InternalGoatComponentsParser.g:3592:5: (otherlv_12= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:3592:5: (otherlv_12= RULE_ID )
                    // InternalGoatComponentsParser.g:3593:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicIndexableRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_12, grammarAccess.getAtomicIndexableAccess().getRefLRefCrossReference_2_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:3606:3: ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:3606:3: ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:3607:4: () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:3607:4: ()
                    // InternalGoatComponentsParser.g:3608:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getLocalAttributeRefAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,Proc,FOLLOW_34); 

                    				newLeafNode(otherlv_14, grammarAccess.getAtomicIndexableAccess().getProcKeyword_3_1());
                    			
                    otherlv_15=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getAtomicIndexableAccess().getFullStopKeyword_3_2());
                    			
                    // InternalGoatComponentsParser.g:3622:4: ( (lv_attribute_16_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:3623:5: (lv_attribute_16_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:3623:5: (lv_attribute_16_0= RULE_ID )
                    // InternalGoatComponentsParser.g:3624:6: lv_attribute_16_0= RULE_ID
                    {
                    lv_attribute_16_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_16_0, grammarAccess.getAtomicIndexableAccess().getAttributeIDTerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicIndexableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attribute",
                    							lv_attribute_16_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGoatComponentsParser.g:3642:3: ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:3642:3: ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis )
                    // InternalGoatComponentsParser.g:3643:4: () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:3643:4: ()
                    // InternalGoatComponentsParser.g:3644:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getFunctionCallAction_4_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3650:4: ( (otherlv_18= RULE_ID ) )
                    // InternalGoatComponentsParser.g:3651:5: (otherlv_18= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:3651:5: (otherlv_18= RULE_ID )
                    // InternalGoatComponentsParser.g:3652:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicIndexableRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_18, grammarAccess.getAtomicIndexableAccess().getFunctionFuncDefinitionCrossReference_4_1_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,LeftParenthesis,FOLLOW_55); 

                    				newLeafNode(otherlv_19, grammarAccess.getAtomicIndexableAccess().getLeftParenthesisKeyword_4_2());
                    			
                    // InternalGoatComponentsParser.g:3667:4: ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==Length||LA57_0==False||LA57_0==Comp||LA57_0==Proc||LA57_0==True||LA57_0==ExclamationMark||LA57_0==LeftParenthesis||LA57_0==HyphenMinus||LA57_0==LeftSquareBracket||(LA57_0>=RULE_ID && LA57_0<=RULE_STRING)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3668:5: ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )*
                            {
                            // InternalGoatComponentsParser.g:3668:5: ( (lv_params_20_0= ruleExpression ) )
                            // InternalGoatComponentsParser.g:3669:6: (lv_params_20_0= ruleExpression )
                            {
                            // InternalGoatComponentsParser.g:3669:6: (lv_params_20_0= ruleExpression )
                            // InternalGoatComponentsParser.g:3670:7: lv_params_20_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getAtomicIndexableAccess().getParamsExpressionParserRuleCall_4_3_0_0());
                            						
                            pushFollow(FOLLOW_41);
                            lv_params_20_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAtomicIndexableRule());
                            							}
                            							add(
                            								current,
                            								"params",
                            								lv_params_20_0,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGoatComponentsParser.g:3687:5: (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==Comma) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:3688:6: otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) )
                            	    {
                            	    otherlv_21=(Token)match(input,Comma,FOLLOW_13); 

                            	    						newLeafNode(otherlv_21, grammarAccess.getAtomicIndexableAccess().getCommaKeyword_4_3_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:3692:6: ( (lv_params_22_0= ruleExpression ) )
                            	    // InternalGoatComponentsParser.g:3693:7: (lv_params_22_0= ruleExpression )
                            	    {
                            	    // InternalGoatComponentsParser.g:3693:7: (lv_params_22_0= ruleExpression )
                            	    // InternalGoatComponentsParser.g:3694:8: lv_params_22_0= ruleExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getAtomicIndexableAccess().getParamsExpressionParserRuleCall_4_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_41);
                            	    lv_params_22_0=ruleExpression();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getAtomicIndexableRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_22_0,
                            	    									"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getAtomicIndexableAccess().getRightParenthesisKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGoatComponentsParser.g:3719:3: ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:3719:3: ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:3720:4: () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:3720:4: ()
                    // InternalGoatComponentsParser.g:3721:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getComponentAttributeRefAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_25=(Token)match(input,Comp,FOLLOW_34); 

                    				newLeafNode(otherlv_25, grammarAccess.getAtomicIndexableAccess().getCompKeyword_5_1());
                    			
                    otherlv_26=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getAtomicIndexableAccess().getFullStopKeyword_5_2());
                    			
                    // InternalGoatComponentsParser.g:3735:4: ( (lv_attribute_27_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:3736:5: (lv_attribute_27_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:3736:5: (lv_attribute_27_0= RULE_ID )
                    // InternalGoatComponentsParser.g:3737:6: lv_attribute_27_0= RULE_ID
                    {
                    lv_attribute_27_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_27_0, grammarAccess.getAtomicIndexableAccess().getAttributeIDTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicIndexableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attribute",
                    							lv_attribute_27_0,
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
    // $ANTLR end "ruleAtomicIndexable"


    // $ANTLR start "entryRuleOutputPredicate"
    // InternalGoatComponentsParser.g:3758:1: entryRuleOutputPredicate returns [EObject current=null] : iv_ruleOutputPredicate= ruleOutputPredicate EOF ;
    public final EObject entryRuleOutputPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPredicate = null;


        try {
            // InternalGoatComponentsParser.g:3758:56: (iv_ruleOutputPredicate= ruleOutputPredicate EOF )
            // InternalGoatComponentsParser.g:3759:2: iv_ruleOutputPredicate= ruleOutputPredicate EOF
            {
             newCompositeNode(grammarAccess.getOutputPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputPredicate=ruleOutputPredicate();

            state._fsp--;

             current =iv_ruleOutputPredicate; 
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
    // $ANTLR end "entryRuleOutputPredicate"


    // $ANTLR start "ruleOutputPredicate"
    // InternalGoatComponentsParser.g:3765:1: ruleOutputPredicate returns [EObject current=null] : this_OutOr_0= ruleOutOr ;
    public final EObject ruleOutputPredicate() throws RecognitionException {
        EObject current = null;

        EObject this_OutOr_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3771:2: (this_OutOr_0= ruleOutOr )
            // InternalGoatComponentsParser.g:3772:2: this_OutOr_0= ruleOutOr
            {

            		newCompositeNode(grammarAccess.getOutputPredicateAccess().getOutOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OutOr_0=ruleOutOr();

            state._fsp--;


            		current = this_OutOr_0;
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
    // $ANTLR end "ruleOutputPredicate"


    // $ANTLR start "entryRuleOutOr"
    // InternalGoatComponentsParser.g:3783:1: entryRuleOutOr returns [EObject current=null] : iv_ruleOutOr= ruleOutOr EOF ;
    public final EObject entryRuleOutOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutOr = null;


        try {
            // InternalGoatComponentsParser.g:3783:46: (iv_ruleOutOr= ruleOutOr EOF )
            // InternalGoatComponentsParser.g:3784:2: iv_ruleOutOr= ruleOutOr EOF
            {
             newCompositeNode(grammarAccess.getOutOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutOr=ruleOutOr();

            state._fsp--;

             current =iv_ruleOutOr; 
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
    // $ANTLR end "entryRuleOutOr"


    // $ANTLR start "ruleOutOr"
    // InternalGoatComponentsParser.g:3790:1: ruleOutOr returns [EObject current=null] : (this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )* ) ;
    public final EObject ruleOutOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OutAnd_0 = null;

        EObject lv_sub_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3796:2: ( (this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )* ) )
            // InternalGoatComponentsParser.g:3797:2: (this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )* )
            {
            // InternalGoatComponentsParser.g:3797:2: (this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )* )
            // InternalGoatComponentsParser.g:3798:3: this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOutOrAccess().getOutAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_OutAnd_0=ruleOutAnd();

            state._fsp--;


            			current = this_OutAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3806:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==VerticalLineVerticalLine) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3807:4: () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) )
            	    {
            	    // InternalGoatComponentsParser.g:3807:4: ()
            	    // InternalGoatComponentsParser.g:3808:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOutOrAccess().getOrSubAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOutOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:3818:4: ( (lv_sub_3_0= ruleOutAnd ) )
            	    // InternalGoatComponentsParser.g:3819:5: (lv_sub_3_0= ruleOutAnd )
            	    {
            	    // InternalGoatComponentsParser.g:3819:5: (lv_sub_3_0= ruleOutAnd )
            	    // InternalGoatComponentsParser.g:3820:6: lv_sub_3_0= ruleOutAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOutOrAccess().getSubOutAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_sub_3_0=ruleOutAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutOrRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sub",
            	    							lv_sub_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.OutAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // $ANTLR end "ruleOutOr"


    // $ANTLR start "entryRuleOutAnd"
    // InternalGoatComponentsParser.g:3842:1: entryRuleOutAnd returns [EObject current=null] : iv_ruleOutAnd= ruleOutAnd EOF ;
    public final EObject entryRuleOutAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutAnd = null;


        try {
            // InternalGoatComponentsParser.g:3842:47: (iv_ruleOutAnd= ruleOutAnd EOF )
            // InternalGoatComponentsParser.g:3843:2: iv_ruleOutAnd= ruleOutAnd EOF
            {
             newCompositeNode(grammarAccess.getOutAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutAnd=ruleOutAnd();

            state._fsp--;

             current =iv_ruleOutAnd; 
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
    // $ANTLR end "entryRuleOutAnd"


    // $ANTLR start "ruleOutAnd"
    // InternalGoatComponentsParser.g:3849:1: ruleOutAnd returns [EObject current=null] : (this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )* ) ;
    public final EObject ruleOutAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OutEqualityComparison_0 = null;

        EObject lv_sub_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3855:2: ( (this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )* ) )
            // InternalGoatComponentsParser.g:3856:2: (this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )* )
            {
            // InternalGoatComponentsParser.g:3856:2: (this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )* )
            // InternalGoatComponentsParser.g:3857:3: this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getOutAndAccess().getOutEqualityComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_OutEqualityComparison_0=ruleOutEqualityComparison();

            state._fsp--;


            			current = this_OutEqualityComparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3865:3: ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==AmpersandAmpersand) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3866:4: () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) )
            	    {
            	    // InternalGoatComponentsParser.g:3866:4: ()
            	    // InternalGoatComponentsParser.g:3867:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOutAndAccess().getAndSubAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOutAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:3877:4: ( (lv_sub_3_0= ruleOutEqualityComparison ) )
            	    // InternalGoatComponentsParser.g:3878:5: (lv_sub_3_0= ruleOutEqualityComparison )
            	    {
            	    // InternalGoatComponentsParser.g:3878:5: (lv_sub_3_0= ruleOutEqualityComparison )
            	    // InternalGoatComponentsParser.g:3879:6: lv_sub_3_0= ruleOutEqualityComparison
            	    {

            	    						newCompositeNode(grammarAccess.getOutAndAccess().getSubOutEqualityComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_sub_3_0=ruleOutEqualityComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutAndRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sub",
            	    							lv_sub_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.OutEqualityComparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // $ANTLR end "ruleOutAnd"


    // $ANTLR start "entryRuleOutEqualityComparison"
    // InternalGoatComponentsParser.g:3901:1: entryRuleOutEqualityComparison returns [EObject current=null] : iv_ruleOutEqualityComparison= ruleOutEqualityComparison EOF ;
    public final EObject entryRuleOutEqualityComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutEqualityComparison = null;


        try {
            // InternalGoatComponentsParser.g:3901:62: (iv_ruleOutEqualityComparison= ruleOutEqualityComparison EOF )
            // InternalGoatComponentsParser.g:3902:2: iv_ruleOutEqualityComparison= ruleOutEqualityComparison EOF
            {
             newCompositeNode(grammarAccess.getOutEqualityComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutEqualityComparison=ruleOutEqualityComparison();

            state._fsp--;

             current =iv_ruleOutEqualityComparison; 
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
    // $ANTLR end "entryRuleOutEqualityComparison"


    // $ANTLR start "ruleOutEqualityComparison"
    // InternalGoatComponentsParser.g:3908:1: ruleOutEqualityComparison returns [EObject current=null] : (this_OutPrimary_0= ruleOutPrimary | (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) ) ) ;
    public final EObject ruleOutEqualityComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token lv_op_3_4=null;
        Token lv_op_3_5=null;
        Token lv_op_3_6=null;
        Token otherlv_6=null;
        EObject this_OutPrimary_0 = null;

        EObject this_OutAtomicOrRec_1 = null;

        EObject lv_right_4_0 = null;

        EObject lv_tuple_7_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3914:2: ( (this_OutPrimary_0= ruleOutPrimary | (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) ) ) )
            // InternalGoatComponentsParser.g:3915:2: (this_OutPrimary_0= ruleOutPrimary | (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) ) )
            {
            // InternalGoatComponentsParser.g:3915:2: (this_OutPrimary_0= ruleOutPrimary | (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) ) )
            int alt63=2;
            switch ( input.LA(1) ) {
            case ExclamationMark:
            case LeftParenthesis:
                {
                alt63=1;
                }
                break;
            case True:
                {
                int LA63_2 = input.LA(2);

                if ( (LA63_2==ExclamationMarkEqualsSign||(LA63_2>=LessThanSignEqualsSign && LA63_2<=GreaterThanSignEqualsSign)||LA63_2==In||LA63_2==LessThanSign||LA63_2==GreaterThanSign) ) {
                    alt63=2;
                }
                else if ( (LA63_2==EOF||LA63_2==AmpersandAmpersand||LA63_2==VerticalLineVerticalLine||LA63_2==RightParenthesis) ) {
                    alt63=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 2, input);

                    throw nvae;
                }
                }
                break;
            case False:
                {
                int LA63_3 = input.LA(2);

                if ( (LA63_3==ExclamationMarkEqualsSign||(LA63_3>=LessThanSignEqualsSign && LA63_3<=GreaterThanSignEqualsSign)||LA63_3==In||LA63_3==LessThanSign||LA63_3==GreaterThanSign) ) {
                    alt63=2;
                }
                else if ( (LA63_3==EOF||LA63_3==AmpersandAmpersand||LA63_3==VerticalLineVerticalLine||LA63_3==RightParenthesis) ) {
                    alt63=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 3, input);

                    throw nvae;
                }
                }
                break;
            case Receiver:
            case Length:
            case Comp:
            case Proc:
            case LeftSquareBracket:
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt63=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalGoatComponentsParser.g:3916:3: this_OutPrimary_0= ruleOutPrimary
                    {

                    			newCompositeNode(grammarAccess.getOutEqualityComparisonAccess().getOutPrimaryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutPrimary_0=ruleOutPrimary();

                    state._fsp--;


                    			current = this_OutPrimary_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:3925:3: (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:3925:3: (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) )
                    // InternalGoatComponentsParser.g:3926:4: this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) )
                    {

                    				newCompositeNode(grammarAccess.getOutEqualityComparisonAccess().getOutAtomicOrRecParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_56);
                    this_OutAtomicOrRec_1=ruleOutAtomicOrRec();

                    state._fsp--;


                    				current = this_OutAtomicOrRec_1;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalGoatComponentsParser.g:3934:4: ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==ExclamationMarkEqualsSign||(LA62_0>=LessThanSignEqualsSign && LA62_0<=GreaterThanSignEqualsSign)||LA62_0==LessThanSign||LA62_0==GreaterThanSign) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==In) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3935:5: ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) )
                            {
                            // InternalGoatComponentsParser.g:3935:5: ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) )
                            // InternalGoatComponentsParser.g:3936:6: () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) )
                            {
                            // InternalGoatComponentsParser.g:3936:6: ()
                            // InternalGoatComponentsParser.g:3937:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getOutEqualityComparisonAccess().getOutEqualityComparisonLeftAction_1_1_0_0(),
                            								current);
                            						

                            }

                            // InternalGoatComponentsParser.g:3943:6: ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) )
                            // InternalGoatComponentsParser.g:3944:7: ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) )
                            {
                            // InternalGoatComponentsParser.g:3944:7: ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) )
                            // InternalGoatComponentsParser.g:3945:8: (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign )
                            {
                            // InternalGoatComponentsParser.g:3945:8: (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign )
                            int alt61=6;
                            switch ( input.LA(1) ) {
                            case EqualsSignEqualsSign:
                                {
                                alt61=1;
                                }
                                break;
                            case ExclamationMarkEqualsSign:
                                {
                                alt61=2;
                                }
                                break;
                            case GreaterThanSignEqualsSign:
                                {
                                alt61=3;
                                }
                                break;
                            case LessThanSignEqualsSign:
                                {
                                alt61=4;
                                }
                                break;
                            case GreaterThanSign:
                                {
                                alt61=5;
                                }
                                break;
                            case LessThanSign:
                                {
                                alt61=6;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 61, 0, input);

                                throw nvae;
                            }

                            switch (alt61) {
                                case 1 :
                                    // InternalGoatComponentsParser.g:3946:9: lv_op_3_1= EqualsSignEqualsSign
                                    {
                                    lv_op_3_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_15); 

                                    									newLeafNode(lv_op_3_1, grammarAccess.getOutEqualityComparisonAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_1_0_0());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getOutEqualityComparisonRule());
                                    									}
                                    									setWithLastConsumed(current, "op", lv_op_3_1, null);
                                    								

                                    }
                                    break;
                                case 2 :
                                    // InternalGoatComponentsParser.g:3957:9: lv_op_3_2= ExclamationMarkEqualsSign
                                    {
                                    lv_op_3_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_15); 

                                    									newLeafNode(lv_op_3_2, grammarAccess.getOutEqualityComparisonAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1_0_1());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getOutEqualityComparisonRule());
                                    									}
                                    									setWithLastConsumed(current, "op", lv_op_3_2, null);
                                    								

                                    }
                                    break;
                                case 3 :
                                    // InternalGoatComponentsParser.g:3968:9: lv_op_3_3= GreaterThanSignEqualsSign
                                    {
                                    lv_op_3_3=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_15); 

                                    									newLeafNode(lv_op_3_3, grammarAccess.getOutEqualityComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_1_0_2());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getOutEqualityComparisonRule());
                                    									}
                                    									setWithLastConsumed(current, "op", lv_op_3_3, null);
                                    								

                                    }
                                    break;
                                case 4 :
                                    // InternalGoatComponentsParser.g:3979:9: lv_op_3_4= LessThanSignEqualsSign
                                    {
                                    lv_op_3_4=(Token)match(input,LessThanSignEqualsSign,FOLLOW_15); 

                                    									newLeafNode(lv_op_3_4, grammarAccess.getOutEqualityComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1_0_3());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getOutEqualityComparisonRule());
                                    									}
                                    									setWithLastConsumed(current, "op", lv_op_3_4, null);
                                    								

                                    }
                                    break;
                                case 5 :
                                    // InternalGoatComponentsParser.g:3990:9: lv_op_3_5= GreaterThanSign
                                    {
                                    lv_op_3_5=(Token)match(input,GreaterThanSign,FOLLOW_15); 

                                    									newLeafNode(lv_op_3_5, grammarAccess.getOutEqualityComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_1_0_4());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getOutEqualityComparisonRule());
                                    									}
                                    									setWithLastConsumed(current, "op", lv_op_3_5, null);
                                    								

                                    }
                                    break;
                                case 6 :
                                    // InternalGoatComponentsParser.g:4001:9: lv_op_3_6= LessThanSign
                                    {
                                    lv_op_3_6=(Token)match(input,LessThanSign,FOLLOW_15); 

                                    									newLeafNode(lv_op_3_6, grammarAccess.getOutEqualityComparisonAccess().getOpLessThanSignKeyword_1_1_0_1_0_5());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getOutEqualityComparisonRule());
                                    									}
                                    									setWithLastConsumed(current, "op", lv_op_3_6, null);
                                    								

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalGoatComponentsParser.g:4014:6: ( (lv_right_4_0= ruleOutAtomicOrRec ) )
                            // InternalGoatComponentsParser.g:4015:7: (lv_right_4_0= ruleOutAtomicOrRec )
                            {
                            // InternalGoatComponentsParser.g:4015:7: (lv_right_4_0= ruleOutAtomicOrRec )
                            // InternalGoatComponentsParser.g:4016:8: lv_right_4_0= ruleOutAtomicOrRec
                            {

                            								newCompositeNode(grammarAccess.getOutEqualityComparisonAccess().getRightOutAtomicOrRecParserRuleCall_1_1_0_2_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_right_4_0=ruleOutAtomicOrRec();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getOutEqualityComparisonRule());
                            								}
                            								set(
                            									current,
                            									"right",
                            									lv_right_4_0,
                            									"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomicOrRec");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:4035:5: ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) )
                            {
                            // InternalGoatComponentsParser.g:4035:5: ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) )
                            // InternalGoatComponentsParser.g:4036:6: () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) )
                            {
                            // InternalGoatComponentsParser.g:4036:6: ()
                            // InternalGoatComponentsParser.g:4037:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getOutEqualityComparisonAccess().getContainmentExpressionElemAction_1_1_1_0(),
                            								current);
                            						

                            }

                            otherlv_6=(Token)match(input,In,FOLLOW_15); 

                            						newLeafNode(otherlv_6, grammarAccess.getOutEqualityComparisonAccess().getInKeyword_1_1_1_1());
                            					
                            // InternalGoatComponentsParser.g:4047:6: ( (lv_tuple_7_0= ruleOutAtomicOrRec ) )
                            // InternalGoatComponentsParser.g:4048:7: (lv_tuple_7_0= ruleOutAtomicOrRec )
                            {
                            // InternalGoatComponentsParser.g:4048:7: (lv_tuple_7_0= ruleOutAtomicOrRec )
                            // InternalGoatComponentsParser.g:4049:8: lv_tuple_7_0= ruleOutAtomicOrRec
                            {

                            								newCompositeNode(grammarAccess.getOutEqualityComparisonAccess().getTupleOutAtomicOrRecParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_tuple_7_0=ruleOutAtomicOrRec();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getOutEqualityComparisonRule());
                            								}
                            								set(
                            									current,
                            									"tuple",
                            									lv_tuple_7_0,
                            									"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomicOrRec");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleOutEqualityComparison"


    // $ANTLR start "entryRuleOutPrimary"
    // InternalGoatComponentsParser.g:4073:1: entryRuleOutPrimary returns [EObject current=null] : iv_ruleOutPrimary= ruleOutPrimary EOF ;
    public final EObject entryRuleOutPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPrimary = null;


        try {
            // InternalGoatComponentsParser.g:4073:51: (iv_ruleOutPrimary= ruleOutPrimary EOF )
            // InternalGoatComponentsParser.g:4074:2: iv_ruleOutPrimary= ruleOutPrimary EOF
            {
             newCompositeNode(grammarAccess.getOutPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutPrimary=ruleOutPrimary();

            state._fsp--;

             current =iv_ruleOutPrimary; 
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
    // $ANTLR end "entryRuleOutPrimary"


    // $ANTLR start "ruleOutPrimary"
    // InternalGoatComponentsParser.g:4080:1: ruleOutPrimary returns [EObject current=null] : ( ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) ) | (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis ) | ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) ) ) ;
    public final EObject ruleOutPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_value_7_1=null;
        Token lv_value_7_2=null;
        EObject lv_expression_2_1 = null;

        EObject lv_expression_2_2 = null;

        EObject this_OutputPredicate_4 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4086:2: ( ( ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) ) | (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis ) | ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) ) ) )
            // InternalGoatComponentsParser.g:4087:2: ( ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) ) | (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis ) | ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) ) )
            {
            // InternalGoatComponentsParser.g:4087:2: ( ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) ) | (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis ) | ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case ExclamationMark:
                {
                alt66=1;
                }
                break;
            case LeftParenthesis:
                {
                alt66=2;
                }
                break;
            case False:
            case True:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalGoatComponentsParser.g:4088:3: ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:4088:3: ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) )
                    // InternalGoatComponentsParser.g:4089:4: () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) )
                    {
                    // InternalGoatComponentsParser.g:4089:4: ()
                    // InternalGoatComponentsParser.g:4090:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutPrimaryAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutPrimaryAccess().getExclamationMarkKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:4100:4: ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) )
                    // InternalGoatComponentsParser.g:4101:5: ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) )
                    {
                    // InternalGoatComponentsParser.g:4101:5: ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) )
                    // InternalGoatComponentsParser.g:4102:6: (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE )
                    {
                    // InternalGoatComponentsParser.g:4102:6: (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE )
                    int alt64=2;
                    switch ( input.LA(1) ) {
                    case ExclamationMark:
                    case LeftParenthesis:
                        {
                        alt64=1;
                        }
                        break;
                    case True:
                        {
                        int LA64_2 = input.LA(2);

                        if ( (LA64_2==EOF||LA64_2==AmpersandAmpersand||LA64_2==VerticalLineVerticalLine||LA64_2==RightParenthesis) ) {
                            alt64=1;
                        }
                        else if ( (LA64_2==In) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case False:
                        {
                        int LA64_3 = input.LA(2);

                        if ( (LA64_3==In) ) {
                            alt64=2;
                        }
                        else if ( (LA64_3==EOF||LA64_3==AmpersandAmpersand||LA64_3==VerticalLineVerticalLine||LA64_3==RightParenthesis) ) {
                            alt64=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Receiver:
                    case Length:
                    case Comp:
                    case Proc:
                    case LeftSquareBracket:
                    case RULE_ID:
                    case RULE_INT:
                    case RULE_STRING:
                        {
                        alt64=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }

                    switch (alt64) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4103:7: lv_expression_2_1= ruleOutPrimary
                            {

                            							newCompositeNode(grammarAccess.getOutPrimaryAccess().getExpressionOutPrimaryParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_expression_2_1=ruleOutPrimary();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOutPrimaryRule());
                            							}
                            							set(
                            								current,
                            								"expression",
                            								lv_expression_2_1,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.OutPrimary");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:4119:7: lv_expression_2_2= ruleOCE
                            {

                            							newCompositeNode(grammarAccess.getOutPrimaryAccess().getExpressionOCEParserRuleCall_0_2_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_expression_2_2=ruleOCE();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOutPrimaryRule());
                            							}
                            							set(
                            								current,
                            								"expression",
                            								lv_expression_2_2,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.OCE");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:4139:3: (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:4139:3: (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis )
                    // InternalGoatComponentsParser.g:4140:4: otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis
                    {
                    otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getOutPrimaryAccess().getOutputPredicateParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_OutputPredicate_4=ruleOutputPredicate();

                    state._fsp--;


                    				current = this_OutputPredicate_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:4158:3: ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:4158:3: ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:4159:4: () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:4159:4: ()
                    // InternalGoatComponentsParser.g:4160:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutPrimaryAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4166:4: ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) )
                    // InternalGoatComponentsParser.g:4167:5: ( (lv_value_7_1= True | lv_value_7_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:4167:5: ( (lv_value_7_1= True | lv_value_7_2= False ) )
                    // InternalGoatComponentsParser.g:4168:6: (lv_value_7_1= True | lv_value_7_2= False )
                    {
                    // InternalGoatComponentsParser.g:4168:6: (lv_value_7_1= True | lv_value_7_2= False )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==True) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==False) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4169:7: lv_value_7_1= True
                            {
                            lv_value_7_1=(Token)match(input,True,FOLLOW_2); 

                            							newLeafNode(lv_value_7_1, grammarAccess.getOutPrimaryAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOutPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:4180:7: lv_value_7_2= False
                            {
                            lv_value_7_2=(Token)match(input,False,FOLLOW_2); 

                            							newLeafNode(lv_value_7_2, grammarAccess.getOutPrimaryAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOutPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_7_2, null);
                            						

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
    // $ANTLR end "ruleOutPrimary"


    // $ANTLR start "entryRuleOCE"
    // InternalGoatComponentsParser.g:4198:1: entryRuleOCE returns [EObject current=null] : iv_ruleOCE= ruleOCE EOF ;
    public final EObject entryRuleOCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCE = null;


        try {
            // InternalGoatComponentsParser.g:4198:44: (iv_ruleOCE= ruleOCE EOF )
            // InternalGoatComponentsParser.g:4199:2: iv_ruleOCE= ruleOCE EOF
            {
             newCompositeNode(grammarAccess.getOCERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOCE=ruleOCE();

            state._fsp--;

             current =iv_ruleOCE; 
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
    // $ANTLR end "entryRuleOCE"


    // $ANTLR start "ruleOCE"
    // InternalGoatComponentsParser.g:4205:1: ruleOCE returns [EObject current=null] : ( () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) ) ) ;
    public final EObject ruleOCE() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_elem_1_0 = null;

        EObject lv_tuple_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4211:2: ( ( () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) ) ) )
            // InternalGoatComponentsParser.g:4212:2: ( () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) ) )
            {
            // InternalGoatComponentsParser.g:4212:2: ( () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) ) )
            // InternalGoatComponentsParser.g:4213:3: () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) )
            {
            // InternalGoatComponentsParser.g:4213:3: ()
            // InternalGoatComponentsParser.g:4214:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOCEAccess().getContainmentExpressionAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:4220:3: ( (lv_elem_1_0= ruleOutAtomicOrRec ) )
            // InternalGoatComponentsParser.g:4221:4: (lv_elem_1_0= ruleOutAtomicOrRec )
            {
            // InternalGoatComponentsParser.g:4221:4: (lv_elem_1_0= ruleOutAtomicOrRec )
            // InternalGoatComponentsParser.g:4222:5: lv_elem_1_0= ruleOutAtomicOrRec
            {

            					newCompositeNode(grammarAccess.getOCEAccess().getElemOutAtomicOrRecParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_57);
            lv_elem_1_0=ruleOutAtomicOrRec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOCERule());
            					}
            					set(
            						current,
            						"elem",
            						lv_elem_1_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomicOrRec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,In,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getOCEAccess().getInKeyword_2());
            		
            // InternalGoatComponentsParser.g:4243:3: ( (lv_tuple_3_0= ruleOutAtomicOrRec ) )
            // InternalGoatComponentsParser.g:4244:4: (lv_tuple_3_0= ruleOutAtomicOrRec )
            {
            // InternalGoatComponentsParser.g:4244:4: (lv_tuple_3_0= ruleOutAtomicOrRec )
            // InternalGoatComponentsParser.g:4245:5: lv_tuple_3_0= ruleOutAtomicOrRec
            {

            					newCompositeNode(grammarAccess.getOCEAccess().getTupleOutAtomicOrRecParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_tuple_3_0=ruleOutAtomicOrRec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOCERule());
            					}
            					set(
            						current,
            						"tuple",
            						lv_tuple_3_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomicOrRec");
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
    // $ANTLR end "ruleOCE"


    // $ANTLR start "entryRuleOutAtomicOrRec"
    // InternalGoatComponentsParser.g:4266:1: entryRuleOutAtomicOrRec returns [EObject current=null] : iv_ruleOutAtomicOrRec= ruleOutAtomicOrRec EOF ;
    public final EObject entryRuleOutAtomicOrRec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutAtomicOrRec = null;


        try {
            // InternalGoatComponentsParser.g:4266:55: (iv_ruleOutAtomicOrRec= ruleOutAtomicOrRec EOF )
            // InternalGoatComponentsParser.g:4267:2: iv_ruleOutAtomicOrRec= ruleOutAtomicOrRec EOF
            {
             newCompositeNode(grammarAccess.getOutAtomicOrRecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutAtomicOrRec=ruleOutAtomicOrRec();

            state._fsp--;

             current =iv_ruleOutAtomicOrRec; 
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
    // $ANTLR end "entryRuleOutAtomicOrRec"


    // $ANTLR start "ruleOutAtomicOrRec"
    // InternalGoatComponentsParser.g:4273:1: ruleOutAtomicOrRec returns [EObject current=null] : ( ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | this_OutAtomic_4= ruleOutAtomic ) ;
    public final EObject ruleOutAtomicOrRec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_attribute_3_0=null;
        EObject this_OutAtomic_4 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4279:2: ( ( ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | this_OutAtomic_4= ruleOutAtomic ) )
            // InternalGoatComponentsParser.g:4280:2: ( ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | this_OutAtomic_4= ruleOutAtomic )
            {
            // InternalGoatComponentsParser.g:4280:2: ( ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | this_OutAtomic_4= ruleOutAtomic )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Receiver) ) {
                alt67=1;
            }
            else if ( (LA67_0==Length||LA67_0==False||LA67_0==Comp||LA67_0==Proc||LA67_0==True||LA67_0==LeftSquareBracket||(LA67_0>=RULE_ID && LA67_0<=RULE_STRING)) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalGoatComponentsParser.g:4281:3: ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:4281:3: ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:4282:4: () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:4282:4: ()
                    // InternalGoatComponentsParser.g:4283:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicOrRecAccess().getRecAttributeRefAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Receiver,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutAtomicOrRecAccess().getReceiverKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getOutAtomicOrRecAccess().getFullStopKeyword_0_2());
                    			
                    // InternalGoatComponentsParser.g:4297:4: ( (lv_attribute_3_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:4298:5: (lv_attribute_3_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:4298:5: (lv_attribute_3_0= RULE_ID )
                    // InternalGoatComponentsParser.g:4299:6: lv_attribute_3_0= RULE_ID
                    {
                    lv_attribute_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_3_0, grammarAccess.getOutAtomicOrRecAccess().getAttributeIDTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutAtomicOrRecRule());
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
                    // InternalGoatComponentsParser.g:4317:3: this_OutAtomic_4= ruleOutAtomic
                    {

                    			newCompositeNode(grammarAccess.getOutAtomicOrRecAccess().getOutAtomicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutAtomic_4=ruleOutAtomic();

                    state._fsp--;


                    			current = this_OutAtomic_4;
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
    // $ANTLR end "ruleOutAtomicOrRec"


    // $ANTLR start "entryRuleOutAtomic"
    // InternalGoatComponentsParser.g:4329:1: entryRuleOutAtomic returns [EObject current=null] : iv_ruleOutAtomic= ruleOutAtomic EOF ;
    public final EObject entryRuleOutAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutAtomic = null;


        try {
            // InternalGoatComponentsParser.g:4329:50: (iv_ruleOutAtomic= ruleOutAtomic EOF )
            // InternalGoatComponentsParser.g:4330:2: iv_ruleOutAtomic= ruleOutAtomic EOF
            {
             newCompositeNode(grammarAccess.getOutAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutAtomic=ruleOutAtomic();

            state._fsp--;

             current =iv_ruleOutAtomic; 
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
    // $ANTLR end "entryRuleOutAtomic"


    // $ANTLR start "ruleOutAtomic"
    // InternalGoatComponentsParser.g:4336:1: ruleOutAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? ) ) ;
    public final EObject ruleOutAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject this_OutAtomicIndexable_6 = null;

        EObject lv_idx_9_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4342:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? ) ) )
            // InternalGoatComponentsParser.g:4343:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? ) )
            {
            // InternalGoatComponentsParser.g:4343:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt70=1;
                }
                break;
            case RULE_STRING:
                {
                alt70=2;
                }
                break;
            case False:
            case True:
                {
                alt70=3;
                }
                break;
            case Length:
            case Comp:
            case Proc:
            case LeftSquareBracket:
            case RULE_ID:
                {
                alt70=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalGoatComponentsParser.g:4344:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:4344:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:4345:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:4345:4: ()
                    // InternalGoatComponentsParser.g:4346:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4352:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:4353:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:4353:5: (lv_value_1_0= RULE_INT )
                    // InternalGoatComponentsParser.g:4354:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getOutAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutAtomicRule());
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
                    // InternalGoatComponentsParser.g:4372:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalGoatComponentsParser.g:4372:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalGoatComponentsParser.g:4373:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalGoatComponentsParser.g:4373:4: ()
                    // InternalGoatComponentsParser.g:4374:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4380:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:4381:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:4381:5: (lv_value_3_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:4382:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getOutAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutAtomicRule());
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
                    // InternalGoatComponentsParser.g:4400:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:4400:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:4401:4: () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:4401:4: ()
                    // InternalGoatComponentsParser.g:4402:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4408:4: ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    // InternalGoatComponentsParser.g:4409:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:4409:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    // InternalGoatComponentsParser.g:4410:6: (lv_value_5_1= True | lv_value_5_2= False )
                    {
                    // InternalGoatComponentsParser.g:4410:6: (lv_value_5_1= True | lv_value_5_2= False )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==True) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==False) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4411:7: lv_value_5_1= True
                            {
                            lv_value_5_1=(Token)match(input,True,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getOutAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOutAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGoatComponentsParser.g:4422:7: lv_value_5_2= False
                            {
                            lv_value_5_2=(Token)match(input,False,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getOutAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOutAtomicRule());
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
                    // InternalGoatComponentsParser.g:4437:3: (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? )
                    {
                    // InternalGoatComponentsParser.g:4437:3: (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? )
                    // InternalGoatComponentsParser.g:4438:4: this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )?
                    {

                    				newCompositeNode(grammarAccess.getOutAtomicAccess().getOutAtomicIndexableParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_52);
                    this_OutAtomicIndexable_6=ruleOutAtomicIndexable();

                    state._fsp--;


                    				current = this_OutAtomicIndexable_6;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalGoatComponentsParser.g:4446:4: (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==LeftSquareBracket) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4447:5: otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket
                            {
                            otherlv_7=(Token)match(input,LeftSquareBracket,FOLLOW_15); 

                            					newLeafNode(otherlv_7, grammarAccess.getOutAtomicAccess().getLeftSquareBracketKeyword_3_1_0());
                            				
                            // InternalGoatComponentsParser.g:4451:5: ()
                            // InternalGoatComponentsParser.g:4452:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getOutAtomicAccess().getTupleGetElemAction_3_1_1(),
                            							current);
                            					

                            }

                            // InternalGoatComponentsParser.g:4458:5: ( (lv_idx_9_0= ruleOutAtomic ) )
                            // InternalGoatComponentsParser.g:4459:6: (lv_idx_9_0= ruleOutAtomic )
                            {
                            // InternalGoatComponentsParser.g:4459:6: (lv_idx_9_0= ruleOutAtomic )
                            // InternalGoatComponentsParser.g:4460:7: lv_idx_9_0= ruleOutAtomic
                            {

                            							newCompositeNode(grammarAccess.getOutAtomicAccess().getIdxOutAtomicParserRuleCall_3_1_2_0());
                            						
                            pushFollow(FOLLOW_53);
                            lv_idx_9_0=ruleOutAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOutAtomicRule());
                            							}
                            							set(
                            								current,
                            								"idx",
                            								lv_idx_9_0,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                            					newLeafNode(otherlv_10, grammarAccess.getOutAtomicAccess().getRightSquareBracketKeyword_3_1_3());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleOutAtomic"


    // $ANTLR start "entryRuleOutAtomicIndexable"
    // InternalGoatComponentsParser.g:4487:1: entryRuleOutAtomicIndexable returns [EObject current=null] : iv_ruleOutAtomicIndexable= ruleOutAtomicIndexable EOF ;
    public final EObject entryRuleOutAtomicIndexable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutAtomicIndexable = null;


        try {
            // InternalGoatComponentsParser.g:4487:59: (iv_ruleOutAtomicIndexable= ruleOutAtomicIndexable EOF )
            // InternalGoatComponentsParser.g:4488:2: iv_ruleOutAtomicIndexable= ruleOutAtomicIndexable EOF
            {
             newCompositeNode(grammarAccess.getOutAtomicIndexableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutAtomicIndexable=ruleOutAtomicIndexable();

            state._fsp--;

             current =iv_ruleOutAtomicIndexable; 
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
    // $ANTLR end "entryRuleOutAtomicIndexable"


    // $ANTLR start "ruleOutAtomicIndexable"
    // InternalGoatComponentsParser.g:4494:1: ruleOutAtomicIndexable returns [EObject current=null] : ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis ) | ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) ) | ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) ) ) ;
    public final EObject ruleOutAtomicIndexable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_attribute_21_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_attribute_25_0=null;
        EObject lv_elem_2_0 = null;

        EObject lv_elem_4_0 = null;

        EObject lv_elem_9_0 = null;

        EObject lv_params_14_0 = null;

        EObject lv_params_16_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4500:2: ( ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis ) | ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) ) | ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) ) ) )
            // InternalGoatComponentsParser.g:4501:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis ) | ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) ) | ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) ) )
            {
            // InternalGoatComponentsParser.g:4501:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis ) | ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) ) | ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) ) )
            int alt75=5;
            switch ( input.LA(1) ) {
            case LeftSquareBracket:
                {
                alt75=1;
                }
                break;
            case Length:
                {
                alt75=2;
                }
                break;
            case RULE_ID:
                {
                alt75=3;
                }
                break;
            case Proc:
                {
                alt75=4;
                }
                break;
            case Comp:
                {
                alt75=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalGoatComponentsParser.g:4502:3: ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket )
                    {
                    // InternalGoatComponentsParser.g:4502:3: ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket )
                    // InternalGoatComponentsParser.g:4503:4: () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket
                    {
                    // InternalGoatComponentsParser.g:4503:4: ()
                    // InternalGoatComponentsParser.g:4504:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getTupleConstantAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_58); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutAtomicIndexableAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:4514:4: ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==Length||LA72_0==False||LA72_0==Comp||LA72_0==Proc||LA72_0==True||LA72_0==LeftSquareBracket||(LA72_0>=RULE_ID && LA72_0<=RULE_STRING)) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4515:5: ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )*
                            {
                            // InternalGoatComponentsParser.g:4515:5: ( (lv_elem_2_0= ruleOutAtomic ) )
                            // InternalGoatComponentsParser.g:4516:6: (lv_elem_2_0= ruleOutAtomic )
                            {
                            // InternalGoatComponentsParser.g:4516:6: (lv_elem_2_0= ruleOutAtomic )
                            // InternalGoatComponentsParser.g:4517:7: lv_elem_2_0= ruleOutAtomic
                            {

                            							newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getElemOutAtomicParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_33);
                            lv_elem_2_0=ruleOutAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOutAtomicIndexableRule());
                            							}
                            							add(
                            								current,
                            								"elem",
                            								lv_elem_2_0,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGoatComponentsParser.g:4534:5: (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==Comma) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:4535:6: otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_15); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getOutAtomicIndexableAccess().getCommaKeyword_0_2_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:4539:6: ( (lv_elem_4_0= ruleOutAtomic ) )
                            	    // InternalGoatComponentsParser.g:4540:7: (lv_elem_4_0= ruleOutAtomic )
                            	    {
                            	    // InternalGoatComponentsParser.g:4540:7: (lv_elem_4_0= ruleOutAtomic )
                            	    // InternalGoatComponentsParser.g:4541:8: lv_elem_4_0= ruleOutAtomic
                            	    {

                            	    								newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getElemOutAtomicParserRuleCall_0_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_33);
                            	    lv_elem_4_0=ruleOutAtomic();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getOutAtomicIndexableRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"elem",
                            	    									lv_elem_4_0,
                            	    									"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomic");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutAtomicIndexableAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:4566:3: ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:4566:3: ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis )
                    // InternalGoatComponentsParser.g:4567:4: () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:4567:4: ()
                    // InternalGoatComponentsParser.g:4568:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getTupleLengthAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,Length,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getOutAtomicIndexableAccess().getLengthKeyword_1_1());
                    			
                    otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getOutAtomicIndexableAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalGoatComponentsParser.g:4582:4: ( (lv_elem_9_0= ruleOutAtomic ) )
                    // InternalGoatComponentsParser.g:4583:5: (lv_elem_9_0= ruleOutAtomic )
                    {
                    // InternalGoatComponentsParser.g:4583:5: (lv_elem_9_0= ruleOutAtomic )
                    // InternalGoatComponentsParser.g:4584:6: lv_elem_9_0= ruleOutAtomic
                    {

                    						newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getElemOutAtomicParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_elem_9_0=ruleOutAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutAtomicIndexableRule());
                    						}
                    						set(
                    							current,
                    							"elem",
                    							lv_elem_9_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getOutAtomicIndexableAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:4607:3: ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:4607:3: ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis )
                    // InternalGoatComponentsParser.g:4608:4: () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:4608:4: ()
                    // InternalGoatComponentsParser.g:4609:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getFunctionCallAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4615:4: ( (otherlv_12= RULE_ID ) )
                    // InternalGoatComponentsParser.g:4616:5: (otherlv_12= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:4616:5: (otherlv_12= RULE_ID )
                    // InternalGoatComponentsParser.g:4617:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutAtomicIndexableRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_12, grammarAccess.getOutAtomicIndexableAccess().getFunctionFuncDefinitionCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,LeftParenthesis,FOLLOW_59); 

                    				newLeafNode(otherlv_13, grammarAccess.getOutAtomicIndexableAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalGoatComponentsParser.g:4632:4: ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==Length||LA74_0==False||LA74_0==Comp||LA74_0==Proc||LA74_0==True||LA74_0==LeftSquareBracket||(LA74_0>=RULE_ID && LA74_0<=RULE_STRING)) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4633:5: ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )*
                            {
                            // InternalGoatComponentsParser.g:4633:5: ( (lv_params_14_0= ruleOutAtomic ) )
                            // InternalGoatComponentsParser.g:4634:6: (lv_params_14_0= ruleOutAtomic )
                            {
                            // InternalGoatComponentsParser.g:4634:6: (lv_params_14_0= ruleOutAtomic )
                            // InternalGoatComponentsParser.g:4635:7: lv_params_14_0= ruleOutAtomic
                            {

                            							newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getParamsOutAtomicParserRuleCall_2_3_0_0());
                            						
                            pushFollow(FOLLOW_41);
                            lv_params_14_0=ruleOutAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOutAtomicIndexableRule());
                            							}
                            							add(
                            								current,
                            								"params",
                            								lv_params_14_0,
                            								"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGoatComponentsParser.g:4652:5: (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )*
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==Comma) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:4653:6: otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) )
                            	    {
                            	    otherlv_15=(Token)match(input,Comma,FOLLOW_15); 

                            	    						newLeafNode(otherlv_15, grammarAccess.getOutAtomicIndexableAccess().getCommaKeyword_2_3_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:4657:6: ( (lv_params_16_0= ruleOutAtomic ) )
                            	    // InternalGoatComponentsParser.g:4658:7: (lv_params_16_0= ruleOutAtomic )
                            	    {
                            	    // InternalGoatComponentsParser.g:4658:7: (lv_params_16_0= ruleOutAtomic )
                            	    // InternalGoatComponentsParser.g:4659:8: lv_params_16_0= ruleOutAtomic
                            	    {

                            	    								newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getParamsOutAtomicParserRuleCall_2_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_41);
                            	    lv_params_16_0=ruleOutAtomic();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getOutAtomicIndexableRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_16_0,
                            	    									"com.sysma.goat.eclipse_plugin.GoatComponents.OutAtomic");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop73;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getOutAtomicIndexableAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:4684:3: ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:4684:3: ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:4685:4: () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:4685:4: ()
                    // InternalGoatComponentsParser.g:4686:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getLocalAttributeRefAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_19=(Token)match(input,Proc,FOLLOW_34); 

                    				newLeafNode(otherlv_19, grammarAccess.getOutAtomicIndexableAccess().getProcKeyword_3_1());
                    			
                    otherlv_20=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getOutAtomicIndexableAccess().getFullStopKeyword_3_2());
                    			
                    // InternalGoatComponentsParser.g:4700:4: ( (lv_attribute_21_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:4701:5: (lv_attribute_21_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:4701:5: (lv_attribute_21_0= RULE_ID )
                    // InternalGoatComponentsParser.g:4702:6: lv_attribute_21_0= RULE_ID
                    {
                    lv_attribute_21_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_21_0, grammarAccess.getOutAtomicIndexableAccess().getAttributeIDTerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutAtomicIndexableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attribute",
                    							lv_attribute_21_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGoatComponentsParser.g:4720:3: ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:4720:3: ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:4721:4: () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:4721:4: ()
                    // InternalGoatComponentsParser.g:4722:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getComponentAttributeRefAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_23=(Token)match(input,Comp,FOLLOW_34); 

                    				newLeafNode(otherlv_23, grammarAccess.getOutAtomicIndexableAccess().getCompKeyword_4_1());
                    			
                    otherlv_24=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getOutAtomicIndexableAccess().getFullStopKeyword_4_2());
                    			
                    // InternalGoatComponentsParser.g:4736:4: ( (lv_attribute_25_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:4737:5: (lv_attribute_25_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:4737:5: (lv_attribute_25_0= RULE_ID )
                    // InternalGoatComponentsParser.g:4738:6: lv_attribute_25_0= RULE_ID
                    {
                    lv_attribute_25_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attribute_25_0, grammarAccess.getOutAtomicIndexableAccess().getAttributeIDTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutAtomicIndexableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attribute",
                    							lv_attribute_25_0,
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
    // $ANTLR end "ruleOutAtomicIndexable"


    // $ANTLR start "entryRuleFuncParam"
    // InternalGoatComponentsParser.g:4759:1: entryRuleFuncParam returns [EObject current=null] : iv_ruleFuncParam= ruleFuncParam EOF ;
    public final EObject entryRuleFuncParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncParam = null;


        try {
            // InternalGoatComponentsParser.g:4759:50: (iv_ruleFuncParam= ruleFuncParam EOF )
            // InternalGoatComponentsParser.g:4760:2: iv_ruleFuncParam= ruleFuncParam EOF
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
    // InternalGoatComponentsParser.g:4766:1: ruleFuncParam returns [EObject current=null] : ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFuncParam() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4772:2: ( ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:4773:2: ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:4773:2: ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:4774:3: ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:4774:3: ( (lv_type_0_0= RULE_TYPE ) )
            // InternalGoatComponentsParser.g:4775:4: (lv_type_0_0= RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:4775:4: (lv_type_0_0= RULE_TYPE )
            // InternalGoatComponentsParser.g:4776:5: lv_type_0_0= RULE_TYPE
            {
            lv_type_0_0=(Token)match(input,RULE_TYPE,FOLLOW_3); 

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

            // InternalGoatComponentsParser.g:4792:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:4793:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:4793:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:4794:5: lv_name_1_0= RULE_ID
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
    // InternalGoatComponentsParser.g:4814:1: entryRuleFuncDefinition returns [EObject current=null] : iv_ruleFuncDefinition= ruleFuncDefinition EOF ;
    public final EObject entryRuleFuncDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDefinition = null;


        try {
            // InternalGoatComponentsParser.g:4814:55: (iv_ruleFuncDefinition= ruleFuncDefinition EOF )
            // InternalGoatComponentsParser.g:4815:2: iv_ruleFuncDefinition= ruleFuncDefinition EOF
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
    // InternalGoatComponentsParser.g:4821:1: ruleFuncDefinition returns [EObject current=null] : (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) ) ;
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
            // InternalGoatComponentsParser.g:4827:2: ( (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) ) )
            // InternalGoatComponentsParser.g:4828:2: (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) )
            {
            // InternalGoatComponentsParser.g:4828:2: (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) )
            // InternalGoatComponentsParser.g:4829:3: otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) )
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncDefinitionAccess().getFunctionKeyword_0());
            		
            // InternalGoatComponentsParser.g:4833:3: ( (lv_type_1_0= RULE_TYPE ) )
            // InternalGoatComponentsParser.g:4834:4: (lv_type_1_0= RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:4834:4: (lv_type_1_0= RULE_TYPE )
            // InternalGoatComponentsParser.g:4835:5: lv_type_1_0= RULE_TYPE
            {
            lv_type_1_0=(Token)match(input,RULE_TYPE,FOLLOW_3); 

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

            // InternalGoatComponentsParser.g:4851:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:4852:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:4852:4: (lv_name_2_0= RULE_ID )
            // InternalGoatComponentsParser.g:4853:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:4873:3: ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_TYPE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalGoatComponentsParser.g:4874:4: ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )*
                    {
                    // InternalGoatComponentsParser.g:4874:4: ( (lv_params_4_0= ruleFuncParam ) )
                    // InternalGoatComponentsParser.g:4875:5: (lv_params_4_0= ruleFuncParam )
                    {
                    // InternalGoatComponentsParser.g:4875:5: (lv_params_4_0= ruleFuncParam )
                    // InternalGoatComponentsParser.g:4876:6: lv_params_4_0= ruleFuncParam
                    {

                    						newCompositeNode(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalGoatComponentsParser.g:4893:4: (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==Comma) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:4894:5: otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_60); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFuncDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:4898:5: ( (lv_params_6_0= ruleFuncParam ) )
                    	    // InternalGoatComponentsParser.g:4899:6: (lv_params_6_0= ruleFuncParam )
                    	    {
                    	    // InternalGoatComponentsParser.g:4899:6: (lv_params_6_0= ruleFuncParam )
                    	    // InternalGoatComponentsParser.g:4900:7: lv_params_6_0= ruleFuncParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getFuncDefinitionAccess().getRightParenthesisKeyword_5());
            		
            // InternalGoatComponentsParser.g:4923:3: ( (lv_blk_8_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:4924:4: (lv_blk_8_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:4924:4: (lv_blk_8_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:4925:5: lv_blk_8_0= ruleFuncBlock
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
    // InternalGoatComponentsParser.g:4946:1: entryRuleFuncBlock returns [EObject current=null] : iv_ruleFuncBlock= ruleFuncBlock EOF ;
    public final EObject entryRuleFuncBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncBlock = null;


        try {
            // InternalGoatComponentsParser.g:4946:50: (iv_ruleFuncBlock= ruleFuncBlock EOF )
            // InternalGoatComponentsParser.g:4947:2: iv_ruleFuncBlock= ruleFuncBlock EOF
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
    // InternalGoatComponentsParser.g:4953:1: ruleFuncBlock returns [EObject current=null] : (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleFuncBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4959:2: ( (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:4960:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:4960:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket )
            // InternalGoatComponentsParser.g:4961:3: otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:4965:3: ()
            // InternalGoatComponentsParser.g:4966:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuncBlockAccess().getFuncBlockAction_1(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:4972:3: ( (lv_statements_2_0= ruleFuncStatement ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==Return||LA78_0==While||LA78_0==Var||LA78_0==If||LA78_0==RULE_ID) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:4973:4: (lv_statements_2_0= ruleFuncStatement )
            	    {
            	    // InternalGoatComponentsParser.g:4973:4: (lv_statements_2_0= ruleFuncStatement )
            	    // InternalGoatComponentsParser.g:4974:5: lv_statements_2_0= ruleFuncStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFuncBlockAccess().getStatementsFuncStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_62);
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
            	    break loop78;
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
    // InternalGoatComponentsParser.g:4999:1: entryRuleFuncStatement returns [EObject current=null] : iv_ruleFuncStatement= ruleFuncStatement EOF ;
    public final EObject entryRuleFuncStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncStatement = null;


        try {
            // InternalGoatComponentsParser.g:4999:54: (iv_ruleFuncStatement= ruleFuncStatement EOF )
            // InternalGoatComponentsParser.g:5000:2: iv_ruleFuncStatement= ruleFuncStatement EOF
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
    // InternalGoatComponentsParser.g:5006:1: ruleFuncStatement returns [EObject current=null] : (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile ) ;
    public final EObject ruleFuncStatement() throws RecognitionException {
        EObject current = null;

        EObject this_FuncVarAssign_0 = null;

        EObject this_FuncIfElse_1 = null;

        EObject this_FuncReturn_2 = null;

        EObject this_FuncVarDeclaration_3 = null;

        EObject this_FuncVarAppend_4 = null;

        EObject this_FuncVarPop_5 = null;

        EObject this_FuncWhile_6 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5012:2: ( (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile ) )
            // InternalGoatComponentsParser.g:5013:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile )
            {
            // InternalGoatComponentsParser.g:5013:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile )
            int alt79=7;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // InternalGoatComponentsParser.g:5014:3: this_FuncVarAssign_0= ruleFuncVarAssign
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
                    // InternalGoatComponentsParser.g:5023:3: this_FuncIfElse_1= ruleFuncIfElse
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
                    // InternalGoatComponentsParser.g:5032:3: this_FuncReturn_2= ruleFuncReturn
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
                    // InternalGoatComponentsParser.g:5041:3: this_FuncVarDeclaration_3= ruleFuncVarDeclaration
                    {

                    			newCompositeNode(grammarAccess.getFuncStatementAccess().getFuncVarDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncVarDeclaration_3=ruleFuncVarDeclaration();

                    state._fsp--;


                    			current = this_FuncVarDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGoatComponentsParser.g:5050:3: this_FuncVarAppend_4= ruleFuncVarAppend
                    {

                    			newCompositeNode(grammarAccess.getFuncStatementAccess().getFuncVarAppendParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncVarAppend_4=ruleFuncVarAppend();

                    state._fsp--;


                    			current = this_FuncVarAppend_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGoatComponentsParser.g:5059:3: this_FuncVarPop_5= ruleFuncVarPop
                    {

                    			newCompositeNode(grammarAccess.getFuncStatementAccess().getFuncVarPopParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncVarPop_5=ruleFuncVarPop();

                    state._fsp--;


                    			current = this_FuncVarPop_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGoatComponentsParser.g:5068:3: this_FuncWhile_6= ruleFuncWhile
                    {

                    			newCompositeNode(grammarAccess.getFuncStatementAccess().getFuncWhileParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncWhile_6=ruleFuncWhile();

                    state._fsp--;


                    			current = this_FuncWhile_6;
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
    // InternalGoatComponentsParser.g:5080:1: entryRuleFuncVarDeclaration returns [EObject current=null] : iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF ;
    public final EObject entryRuleFuncVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarDeclaration = null;


        try {
            // InternalGoatComponentsParser.g:5080:59: (iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF )
            // InternalGoatComponentsParser.g:5081:2: iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF
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
    // InternalGoatComponentsParser.g:5087:1: ruleFuncVarDeclaration returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) ) ;
    public final EObject ruleFuncVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5093:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) ) )
            // InternalGoatComponentsParser.g:5094:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) )
            {
            // InternalGoatComponentsParser.g:5094:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) )
            // InternalGoatComponentsParser.g:5095:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncVarDeclarationAccess().getVarKeyword_0());
            		
            // InternalGoatComponentsParser.g:5099:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:5100:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:5100:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:5101:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncVarDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalGoatComponentsParser.g:5121:3: ( (lv_val_3_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5122:4: (lv_val_3_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5122:4: (lv_val_3_0= ruleExpression )
            // InternalGoatComponentsParser.g:5123:5: lv_val_3_0= ruleExpression
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
    // InternalGoatComponentsParser.g:5144:1: entryRuleFuncVarAssign returns [EObject current=null] : iv_ruleFuncVarAssign= ruleFuncVarAssign EOF ;
    public final EObject entryRuleFuncVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarAssign = null;


        try {
            // InternalGoatComponentsParser.g:5144:54: (iv_ruleFuncVarAssign= ruleFuncVarAssign EOF )
            // InternalGoatComponentsParser.g:5145:2: iv_ruleFuncVarAssign= ruleFuncVarAssign EOF
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
    // InternalGoatComponentsParser.g:5151:1: ruleFuncVarAssign returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) ) ) ;
    public final EObject ruleFuncVarAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_idx_2_0 = null;

        EObject lv_val_5_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5157:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) ) ) )
            // InternalGoatComponentsParser.g:5158:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) ) )
            {
            // InternalGoatComponentsParser.g:5158:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) ) )
            // InternalGoatComponentsParser.g:5159:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) )
            {
            // InternalGoatComponentsParser.g:5159:3: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:5160:4: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:5160:4: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:5161:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarAssignRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(otherlv_0, grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalGoatComponentsParser.g:5172:3: (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LeftSquareBracket) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalGoatComponentsParser.g:5173:4: otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getFuncVarAssignAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalGoatComponentsParser.g:5177:4: ( (lv_idx_2_0= ruleExpression ) )
                    // InternalGoatComponentsParser.g:5178:5: (lv_idx_2_0= ruleExpression )
                    {
                    // InternalGoatComponentsParser.g:5178:5: (lv_idx_2_0= ruleExpression )
                    // InternalGoatComponentsParser.g:5179:6: lv_idx_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFuncVarAssignAccess().getIdxExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_idx_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncVarAssignRule());
                    						}
                    						set(
                    							current,
                    							"idx",
                    							lv_idx_2_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getFuncVarAssignAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,EqualsSign,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFuncVarAssignAccess().getEqualsSignKeyword_2());
            		
            // InternalGoatComponentsParser.g:5205:3: ( (lv_val_5_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5206:4: (lv_val_5_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5206:4: (lv_val_5_0= ruleExpression )
            // InternalGoatComponentsParser.g:5207:5: lv_val_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncVarAssignAccess().getValExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncVarAssignRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_5_0,
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


    // $ANTLR start "entryRuleFuncVarAppend"
    // InternalGoatComponentsParser.g:5228:1: entryRuleFuncVarAppend returns [EObject current=null] : iv_ruleFuncVarAppend= ruleFuncVarAppend EOF ;
    public final EObject entryRuleFuncVarAppend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarAppend = null;


        try {
            // InternalGoatComponentsParser.g:5228:54: (iv_ruleFuncVarAppend= ruleFuncVarAppend EOF )
            // InternalGoatComponentsParser.g:5229:2: iv_ruleFuncVarAppend= ruleFuncVarAppend EOF
            {
             newCompositeNode(grammarAccess.getFuncVarAppendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncVarAppend=ruleFuncVarAppend();

            state._fsp--;

             current =iv_ruleFuncVarAppend; 
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
    // $ANTLR end "entryRuleFuncVarAppend"


    // $ANTLR start "ruleFuncVarAppend"
    // InternalGoatComponentsParser.g:5235:1: ruleFuncVarAppend returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis ) ;
    public final EObject ruleFuncVarAppend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_item_4_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5241:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis ) )
            // InternalGoatComponentsParser.g:5242:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:5242:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis )
            // InternalGoatComponentsParser.g:5243:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis
            {
            // InternalGoatComponentsParser.g:5243:3: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:5244:4: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:5244:4: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:5245:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarAppendRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_0, grammarAccess.getFuncVarAppendAccess().getVarFuncVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncVarAppendAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,Append,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncVarAppendAccess().getAppendKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncVarAppendAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:5268:3: ( (lv_item_4_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5269:4: (lv_item_4_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5269:4: (lv_item_4_0= ruleExpression )
            // InternalGoatComponentsParser.g:5270:5: lv_item_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncVarAppendAccess().getItemExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_item_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncVarAppendRule());
            					}
            					set(
            						current,
            						"item",
            						lv_item_4_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFuncVarAppendAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleFuncVarAppend"


    // $ANTLR start "entryRuleFuncVarPop"
    // InternalGoatComponentsParser.g:5295:1: entryRuleFuncVarPop returns [EObject current=null] : iv_ruleFuncVarPop= ruleFuncVarPop EOF ;
    public final EObject entryRuleFuncVarPop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarPop = null;


        try {
            // InternalGoatComponentsParser.g:5295:51: (iv_ruleFuncVarPop= ruleFuncVarPop EOF )
            // InternalGoatComponentsParser.g:5296:2: iv_ruleFuncVarPop= ruleFuncVarPop EOF
            {
             newCompositeNode(grammarAccess.getFuncVarPopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncVarPop=ruleFuncVarPop();

            state._fsp--;

             current =iv_ruleFuncVarPop; 
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
    // $ANTLR end "entryRuleFuncVarPop"


    // $ANTLR start "ruleFuncVarPop"
    // InternalGoatComponentsParser.g:5302:1: ruleFuncVarPop returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis ) ;
    public final EObject ruleFuncVarPop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5308:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis ) )
            // InternalGoatComponentsParser.g:5309:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:5309:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis )
            // InternalGoatComponentsParser.g:5310:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis
            {
            // InternalGoatComponentsParser.g:5310:3: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:5311:4: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:5311:4: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:5312:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarPopRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_0, grammarAccess.getFuncVarPopAccess().getVarFuncVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncVarPopAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,Pop,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncVarPopAccess().getPopKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncVarPopAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFuncVarPopAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFuncVarPop"


    // $ANTLR start "entryRuleFuncIfElse"
    // InternalGoatComponentsParser.g:5343:1: entryRuleFuncIfElse returns [EObject current=null] : iv_ruleFuncIfElse= ruleFuncIfElse EOF ;
    public final EObject entryRuleFuncIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncIfElse = null;


        try {
            // InternalGoatComponentsParser.g:5343:51: (iv_ruleFuncIfElse= ruleFuncIfElse EOF )
            // InternalGoatComponentsParser.g:5344:2: iv_ruleFuncIfElse= ruleFuncIfElse EOF
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
    // InternalGoatComponentsParser.g:5350:1: ruleFuncIfElse returns [EObject current=null] : (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )? ) ;
    public final EObject ruleFuncIfElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_test_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_test_8_0 = null;

        EObject lv_then_10_0 = null;

        EObject lv_elseBranch_12_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5356:2: ( (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )? ) )
            // InternalGoatComponentsParser.g:5357:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )? )
            {
            // InternalGoatComponentsParser.g:5357:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )? )
            // InternalGoatComponentsParser.g:5358:3: otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncIfElseAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:5366:3: ( (lv_test_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5367:4: (lv_test_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5367:4: (lv_test_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:5368:5: lv_test_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:5389:3: ( (lv_then_4_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:5390:4: (lv_then_4_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:5390:4: (lv_then_4_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:5391:5: lv_then_4_0= ruleFuncBlock
            {

            					newCompositeNode(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalGoatComponentsParser.g:5408:3: (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==Else) ) {
                    int LA81_1 = input.LA(2);

                    if ( (LA81_1==If) ) {
                        alt81=1;
                    }


                }


                switch (alt81) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:5409:4: otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) )
            	    {
            	    otherlv_5=(Token)match(input,Else,FOLLOW_27); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFuncIfElseAccess().getElseKeyword_5_0());
            	    			
            	    otherlv_6=(Token)match(input,If,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getFuncIfElseAccess().getIfKeyword_5_1());
            	    			
            	    otherlv_7=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_5_2());
            	    			
            	    // InternalGoatComponentsParser.g:5421:4: ( (lv_test_8_0= ruleExpression ) )
            	    // InternalGoatComponentsParser.g:5422:5: (lv_test_8_0= ruleExpression )
            	    {
            	    // InternalGoatComponentsParser.g:5422:5: (lv_test_8_0= ruleExpression )
            	    // InternalGoatComponentsParser.g:5423:6: lv_test_8_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_test_8_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"test",
            	    							lv_test_8_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_5_4());
            	    			
            	    // InternalGoatComponentsParser.g:5444:4: ( (lv_then_10_0= ruleFuncBlock ) )
            	    // InternalGoatComponentsParser.g:5445:5: (lv_then_10_0= ruleFuncBlock )
            	    {
            	    // InternalGoatComponentsParser.g:5445:5: (lv_then_10_0= ruleFuncBlock )
            	    // InternalGoatComponentsParser.g:5446:6: lv_then_10_0= ruleFuncBlock
            	    {

            	    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_5_5_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_then_10_0=ruleFuncBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"then",
            	    							lv_then_10_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.FuncBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            // InternalGoatComponentsParser.g:5464:3: (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==Else) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalGoatComponentsParser.g:5465:4: otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) )
                    {
                    otherlv_11=(Token)match(input,Else,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getFuncIfElseAccess().getElseKeyword_6_0());
                    			
                    // InternalGoatComponentsParser.g:5469:4: ( (lv_elseBranch_12_0= ruleFuncBlock ) )
                    // InternalGoatComponentsParser.g:5470:5: (lv_elseBranch_12_0= ruleFuncBlock )
                    {
                    // InternalGoatComponentsParser.g:5470:5: (lv_elseBranch_12_0= ruleFuncBlock )
                    // InternalGoatComponentsParser.g:5471:6: lv_elseBranch_12_0= ruleFuncBlock
                    {

                    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getElseBranchFuncBlockParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseBranch_12_0=ruleFuncBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncIfElseRule());
                    						}
                    						set(
                    							current,
                    							"elseBranch",
                    							lv_elseBranch_12_0,
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
    // InternalGoatComponentsParser.g:5493:1: entryRuleFuncReturn returns [EObject current=null] : iv_ruleFuncReturn= ruleFuncReturn EOF ;
    public final EObject entryRuleFuncReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncReturn = null;


        try {
            // InternalGoatComponentsParser.g:5493:51: (iv_ruleFuncReturn= ruleFuncReturn EOF )
            // InternalGoatComponentsParser.g:5494:2: iv_ruleFuncReturn= ruleFuncReturn EOF
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
    // InternalGoatComponentsParser.g:5500:1: ruleFuncReturn returns [EObject current=null] : (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) ) ;
    public final EObject ruleFuncReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5506:2: ( (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) ) )
            // InternalGoatComponentsParser.g:5507:2: (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) )
            {
            // InternalGoatComponentsParser.g:5507:2: (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) )
            // InternalGoatComponentsParser.g:5508:3: otherlv_0= Return ( (lv_val_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Return,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncReturnAccess().getReturnKeyword_0());
            		
            // InternalGoatComponentsParser.g:5512:3: ( (lv_val_1_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5513:4: (lv_val_1_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5513:4: (lv_val_1_0= ruleExpression )
            // InternalGoatComponentsParser.g:5514:5: lv_val_1_0= ruleExpression
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


    // $ANTLR start "entryRuleFuncWhile"
    // InternalGoatComponentsParser.g:5535:1: entryRuleFuncWhile returns [EObject current=null] : iv_ruleFuncWhile= ruleFuncWhile EOF ;
    public final EObject entryRuleFuncWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncWhile = null;


        try {
            // InternalGoatComponentsParser.g:5535:50: (iv_ruleFuncWhile= ruleFuncWhile EOF )
            // InternalGoatComponentsParser.g:5536:2: iv_ruleFuncWhile= ruleFuncWhile EOF
            {
             newCompositeNode(grammarAccess.getFuncWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncWhile=ruleFuncWhile();

            state._fsp--;

             current =iv_ruleFuncWhile; 
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
    // $ANTLR end "entryRuleFuncWhile"


    // $ANTLR start "ruleFuncWhile"
    // InternalGoatComponentsParser.g:5542:1: ruleFuncWhile returns [EObject current=null] : (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) ) ) ;
    public final EObject ruleFuncWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cond_2_0 = null;

        EObject lv_cycle_4_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5548:2: ( (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) ) ) )
            // InternalGoatComponentsParser.g:5549:2: (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) ) )
            {
            // InternalGoatComponentsParser.g:5549:2: (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) ) )
            // InternalGoatComponentsParser.g:5550:3: otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) )
            {
            otherlv_0=(Token)match(input,While,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncWhileAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncWhileAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:5558:3: ( (lv_cond_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5559:4: (lv_cond_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5559:4: (lv_cond_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:5560:5: lv_cond_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncWhileAccess().getCondExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_cond_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncWhileRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncWhileAccess().getRightParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:5581:3: ( (lv_cycle_4_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:5582:4: (lv_cycle_4_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:5582:4: (lv_cycle_4_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:5583:5: lv_cycle_4_0= ruleFuncBlock
            {

            					newCompositeNode(grammarAccess.getFuncWhileAccess().getCycleFuncBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_cycle_4_0=ruleFuncBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncWhileRule());
            					}
            					set(
            						current,
            						"cycle",
            						lv_cycle_4_0,
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
    // $ANTLR end "ruleFuncWhile"

    // Delegated rules


    protected DFA79 dfa79 = new DFA79(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\16\1\60\4\uffff\1\14\3\uffff";
    static final String dfa_3s = "\1\76\1\70\4\uffff\1\33\3\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\7\1\uffff\1\1\1\5\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\3\uffff\1\5\12\uffff\1\4\7\uffff\1\2\30\uffff\1\1",
            "\1\6\4\uffff\1\7\2\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\10\16\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "5013:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000002E2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x10000020128A0C00L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xD10085000520A000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x1000400000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xC10085000520A000L,0x0000000000000001L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xC10005000520A100L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0108000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000030000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000012000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000020128A0C02L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8300800004008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8100800004008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xC100800004008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4400040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0050001400000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000A00100000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002120000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xC30085000520A000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xC1008D000520A000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0050005C40000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xC30005000520A100L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xC1000D000520A100L,0x0000000000000001L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000080000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x5000002020044000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000008000000L});

}