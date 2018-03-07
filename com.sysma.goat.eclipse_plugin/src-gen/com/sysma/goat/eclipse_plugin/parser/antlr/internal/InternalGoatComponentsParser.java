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
    // InternalGoatComponentsParser.g:64:1: ruleModel returns [EObject current=null] : ( () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( (lv_processes_3_0= ruleProcessDefinition ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_processes_3_0 = null;

        EObject lv_components_4_0 = null;

        EObject lv_functions_5_0 = null;

        EObject lv_environments_6_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:70:2: ( ( () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( (lv_processes_3_0= ruleProcessDefinition ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )* ) )
            // InternalGoatComponentsParser.g:71:2: ( () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( (lv_processes_3_0= ruleProcessDefinition ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )* )
            {
            // InternalGoatComponentsParser.g:71:2: ( () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( (lv_processes_3_0= ruleProcessDefinition ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )* )
            // InternalGoatComponentsParser.g:72:3: () otherlv_1= Infrastructure ( (otherlv_2= RULE_ID ) ) ( ( (lv_processes_3_0= ruleProcessDefinition ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )*
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

            // InternalGoatComponentsParser.g:96:3: ( ( (lv_processes_3_0= ruleProcessDefinition ) ) | ( (lv_components_4_0= ruleComponentDefinition ) ) | ( (lv_functions_5_0= ruleFuncDefinition ) ) | ( (lv_environments_6_0= ruleEnvironmentDefinition ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case Process:
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
                case Environment:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:97:4: ( (lv_processes_3_0= ruleProcessDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:97:4: ( (lv_processes_3_0= ruleProcessDefinition ) )
            	    // InternalGoatComponentsParser.g:98:5: (lv_processes_3_0= ruleProcessDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:98:5: (lv_processes_3_0= ruleProcessDefinition )
            	    // InternalGoatComponentsParser.g:99:6: lv_processes_3_0= ruleProcessDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getProcessesProcessDefinitionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_processes_3_0=ruleProcessDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"processes",
            	    							lv_processes_3_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGoatComponentsParser.g:117:4: ( (lv_components_4_0= ruleComponentDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:117:4: ( (lv_components_4_0= ruleComponentDefinition ) )
            	    // InternalGoatComponentsParser.g:118:5: (lv_components_4_0= ruleComponentDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:118:5: (lv_components_4_0= ruleComponentDefinition )
            	    // InternalGoatComponentsParser.g:119:6: lv_components_4_0= ruleComponentDefinition
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
            	    // InternalGoatComponentsParser.g:137:4: ( (lv_functions_5_0= ruleFuncDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:137:4: ( (lv_functions_5_0= ruleFuncDefinition ) )
            	    // InternalGoatComponentsParser.g:138:5: (lv_functions_5_0= ruleFuncDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:138:5: (lv_functions_5_0= ruleFuncDefinition )
            	    // InternalGoatComponentsParser.g:139:6: lv_functions_5_0= ruleFuncDefinition
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
            	    // InternalGoatComponentsParser.g:157:4: ( (lv_environments_6_0= ruleEnvironmentDefinition ) )
            	    {
            	    // InternalGoatComponentsParser.g:157:4: ( (lv_environments_6_0= ruleEnvironmentDefinition ) )
            	    // InternalGoatComponentsParser.g:158:5: (lv_environments_6_0= ruleEnvironmentDefinition )
            	    {
            	    // InternalGoatComponentsParser.g:158:5: (lv_environments_6_0= ruleEnvironmentDefinition )
            	    // InternalGoatComponentsParser.g:159:6: lv_environments_6_0= ruleEnvironmentDefinition
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


    // $ANTLR start "entryRuleProcessDefinition"
    // InternalGoatComponentsParser.g:181:1: entryRuleProcessDefinition returns [EObject current=null] : iv_ruleProcessDefinition= ruleProcessDefinition EOF ;
    public final EObject entryRuleProcessDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessDefinition = null;


        try {
            // InternalGoatComponentsParser.g:181:58: (iv_ruleProcessDefinition= ruleProcessDefinition EOF )
            // InternalGoatComponentsParser.g:182:2: iv_ruleProcessDefinition= ruleProcessDefinition EOF
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
    // InternalGoatComponentsParser.g:188:1: ruleProcessDefinition returns [EObject current=null] : (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) ) | ( (lv_block_4_0= ruleProcessBlock ) ) ) ) ;
    public final EObject ruleProcessDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_block_3_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:194:2: ( (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) ) | ( (lv_block_4_0= ruleProcessBlock ) ) ) ) )
            // InternalGoatComponentsParser.g:195:2: (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) ) | ( (lv_block_4_0= ruleProcessBlock ) ) ) )
            {
            // InternalGoatComponentsParser.g:195:2: (otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) ) | ( (lv_block_4_0= ruleProcessBlock ) ) ) )
            // InternalGoatComponentsParser.g:196:3: otherlv_0= Process ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) ) | ( (lv_block_4_0= ruleProcessBlock ) ) )
            {
            otherlv_0=(Token)match(input,Process,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessDefinitionAccess().getProcessKeyword_0());
            		
            // InternalGoatComponentsParser.g:200:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:201:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:201:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:202:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalGoatComponentsParser.g:218:3: ( (otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) ) | ( (lv_block_4_0= ruleProcessBlock ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EqualsSign) ) {
                alt2=1;
            }
            else if ( (LA2_0==LeftCurlyBracket) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatComponentsParser.g:219:4: (otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) )
                    {
                    // InternalGoatComponentsParser.g:219:4: (otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) ) )
                    // InternalGoatComponentsParser.g:220:5: otherlv_2= EqualsSign ( (lv_block_3_0= rulePDPBlock ) )
                    {
                    otherlv_2=(Token)match(input,EqualsSign,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getProcessDefinitionAccess().getEqualsSignKeyword_2_0_0());
                    				
                    // InternalGoatComponentsParser.g:224:5: ( (lv_block_3_0= rulePDPBlock ) )
                    // InternalGoatComponentsParser.g:225:6: (lv_block_3_0= rulePDPBlock )
                    {
                    // InternalGoatComponentsParser.g:225:6: (lv_block_3_0= rulePDPBlock )
                    // InternalGoatComponentsParser.g:226:7: lv_block_3_0= rulePDPBlock
                    {

                    							newCompositeNode(grammarAccess.getProcessDefinitionAccess().getBlockPDPBlockParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_block_3_0=rulePDPBlock();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getProcessDefinitionRule());
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
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:245:4: ( (lv_block_4_0= ruleProcessBlock ) )
                    {
                    // InternalGoatComponentsParser.g:245:4: ( (lv_block_4_0= ruleProcessBlock ) )
                    // InternalGoatComponentsParser.g:246:5: (lv_block_4_0= ruleProcessBlock )
                    {
                    // InternalGoatComponentsParser.g:246:5: (lv_block_4_0= ruleProcessBlock )
                    // InternalGoatComponentsParser.g:247:6: lv_block_4_0= ruleProcessBlock
                    {

                    						newCompositeNode(grammarAccess.getProcessDefinitionAccess().getBlockProcessBlockParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_4_0=ruleProcessBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_4_0,
                    							"com.sysma.goat.eclipse_plugin.GoatComponents.ProcessBlock");
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
    // $ANTLR end "ruleProcessDefinition"


    // $ANTLR start "entryRulePDPBlock"
    // InternalGoatComponentsParser.g:269:1: entryRulePDPBlock returns [EObject current=null] : iv_rulePDPBlock= rulePDPBlock EOF ;
    public final EObject entryRulePDPBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDPBlock = null;


        try {
            // InternalGoatComponentsParser.g:269:49: (iv_rulePDPBlock= rulePDPBlock EOF )
            // InternalGoatComponentsParser.g:270:2: iv_rulePDPBlock= rulePDPBlock EOF
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
    // InternalGoatComponentsParser.g:276:1: rulePDPBlock returns [EObject current=null] : ( ( ( (lv_statements_0_0= rulePDPSpawn ) ) otherlv_1= VerticalLine )* ( (lv_statements_2_0= rulePDPCall ) ) ) ;
    public final EObject rulePDPBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:282:2: ( ( ( ( (lv_statements_0_0= rulePDPSpawn ) ) otherlv_1= VerticalLine )* ( (lv_statements_2_0= rulePDPCall ) ) ) )
            // InternalGoatComponentsParser.g:283:2: ( ( ( (lv_statements_0_0= rulePDPSpawn ) ) otherlv_1= VerticalLine )* ( (lv_statements_2_0= rulePDPCall ) ) )
            {
            // InternalGoatComponentsParser.g:283:2: ( ( ( (lv_statements_0_0= rulePDPSpawn ) ) otherlv_1= VerticalLine )* ( (lv_statements_2_0= rulePDPCall ) ) )
            // InternalGoatComponentsParser.g:284:3: ( ( (lv_statements_0_0= rulePDPSpawn ) ) otherlv_1= VerticalLine )* ( (lv_statements_2_0= rulePDPCall ) )
            {
            // InternalGoatComponentsParser.g:284:3: ( ( (lv_statements_0_0= rulePDPSpawn ) ) otherlv_1= VerticalLine )*
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
            	    // InternalGoatComponentsParser.g:285:4: ( (lv_statements_0_0= rulePDPSpawn ) ) otherlv_1= VerticalLine
            	    {
            	    // InternalGoatComponentsParser.g:285:4: ( (lv_statements_0_0= rulePDPSpawn ) )
            	    // InternalGoatComponentsParser.g:286:5: (lv_statements_0_0= rulePDPSpawn )
            	    {
            	    // InternalGoatComponentsParser.g:286:5: (lv_statements_0_0= rulePDPSpawn )
            	    // InternalGoatComponentsParser.g:287:6: lv_statements_0_0= rulePDPSpawn
            	    {

            	    						newCompositeNode(grammarAccess.getPDPBlockAccess().getStatementsPDPSpawnParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_statements_0_0=rulePDPSpawn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPDPBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_0_0,
            	    							"com.sysma.goat.eclipse_plugin.GoatComponents.PDPSpawn");
            	    						afterParserOrEnumRuleCall();
            	    					

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

            // InternalGoatComponentsParser.g:309:3: ( (lv_statements_2_0= rulePDPCall ) )
            // InternalGoatComponentsParser.g:310:4: (lv_statements_2_0= rulePDPCall )
            {
            // InternalGoatComponentsParser.g:310:4: (lv_statements_2_0= rulePDPCall )
            // InternalGoatComponentsParser.g:311:5: lv_statements_2_0= rulePDPCall
            {

            					newCompositeNode(grammarAccess.getPDPBlockAccess().getStatementsPDPCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_statements_2_0=rulePDPCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPDPBlockRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatComponents.PDPCall");
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
    // $ANTLR end "rulePDPBlock"


    // $ANTLR start "entryRulePDPSpawn"
    // InternalGoatComponentsParser.g:332:1: entryRulePDPSpawn returns [EObject current=null] : iv_rulePDPSpawn= rulePDPSpawn EOF ;
    public final EObject entryRulePDPSpawn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDPSpawn = null;


        try {
            // InternalGoatComponentsParser.g:332:49: (iv_rulePDPSpawn= rulePDPSpawn EOF )
            // InternalGoatComponentsParser.g:333:2: iv_rulePDPSpawn= rulePDPSpawn EOF
            {
             newCompositeNode(grammarAccess.getPDPSpawnRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePDPSpawn=rulePDPSpawn();

            state._fsp--;

             current =iv_rulePDPSpawn; 
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
    // $ANTLR end "entryRulePDPSpawn"


    // $ANTLR start "rulePDPSpawn"
    // InternalGoatComponentsParser.g:339:1: rulePDPSpawn returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePDPSpawn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:345:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:346:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:346:2: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:347:3: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:347:3: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:348:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPDPSpawnRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getPDPSpawnAccess().getProcProcessDefinitionCrossReference_0());
            			

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
    // $ANTLR end "rulePDPSpawn"


    // $ANTLR start "entryRulePDPCall"
    // InternalGoatComponentsParser.g:362:1: entryRulePDPCall returns [EObject current=null] : iv_rulePDPCall= rulePDPCall EOF ;
    public final EObject entryRulePDPCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDPCall = null;


        try {
            // InternalGoatComponentsParser.g:362:48: (iv_rulePDPCall= rulePDPCall EOF )
            // InternalGoatComponentsParser.g:363:2: iv_rulePDPCall= rulePDPCall EOF
            {
             newCompositeNode(grammarAccess.getPDPCallRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePDPCall=rulePDPCall();

            state._fsp--;

             current =iv_rulePDPCall; 
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
    // $ANTLR end "entryRulePDPCall"


    // $ANTLR start "rulePDPCall"
    // InternalGoatComponentsParser.g:369:1: rulePDPCall returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePDPCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:375:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:376:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:376:2: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:377:3: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:377:3: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:378:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPDPCallRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getPDPCallAccess().getProcProcessDefinitionCrossReference_0());
            			

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
    // $ANTLR end "rulePDPCall"


    // $ANTLR start "entryRuleProcessBlock"
    // InternalGoatComponentsParser.g:392:1: entryRuleProcessBlock returns [EObject current=null] : iv_ruleProcessBlock= ruleProcessBlock EOF ;
    public final EObject entryRuleProcessBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBlock = null;


        try {
            // InternalGoatComponentsParser.g:392:53: (iv_ruleProcessBlock= ruleProcessBlock EOF )
            // InternalGoatComponentsParser.g:393:2: iv_ruleProcessBlock= ruleProcessBlock EOF
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
    // InternalGoatComponentsParser.g:399:1: ruleProcessBlock returns [EObject current=null] : (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleProcessBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:405:2: ( (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:406:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:406:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket )
            // InternalGoatComponentsParser.g:407:3: otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleProcessStatement ) )* otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:411:3: ()
            // InternalGoatComponentsParser.g:412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessBlockAccess().getProcessBlockAction_1(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:418:3: ( (lv_statements_2_0= ruleProcessStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=Receive && LA4_0<=Waitfor)||LA4_0==Spawn||LA4_0==Call||LA4_0==Loop||LA4_0==Send||LA4_0==Set||LA4_0==If) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:419:4: (lv_statements_2_0= ruleProcessStatement )
            	    {
            	    // InternalGoatComponentsParser.g:419:4: (lv_statements_2_0= ruleProcessStatement )
            	    // InternalGoatComponentsParser.g:420:5: lv_statements_2_0= ruleProcessStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessBlockAccess().getStatementsProcessStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
    // InternalGoatComponentsParser.g:445:1: entryRuleProcessStatement returns [EObject current=null] : iv_ruleProcessStatement= ruleProcessStatement EOF ;
    public final EObject entryRuleProcessStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessStatement = null;


        try {
            // InternalGoatComponentsParser.g:445:57: (iv_ruleProcessStatement= ruleProcessStatement EOF )
            // InternalGoatComponentsParser.g:446:2: iv_ruleProcessStatement= ruleProcessStatement EOF
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
    // InternalGoatComponentsParser.g:452:1: ruleProcessStatement returns [EObject current=null] : (this_ProcessSpawn_0= ruleProcessSpawn | this_ProcessCall_1= ruleProcessCall | this_ProcessSend_2= ruleProcessSend | this_ProcessReceive_3= ruleProcessReceive | this_ProcessIf_4= ruleProcessIf | this_ProcessSet_5= ruleProcessSet | this_ProcessWaitFor_6= ruleProcessWaitFor | this_ProcessLoop_7= ruleProcessLoop ) ;
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
            // InternalGoatComponentsParser.g:458:2: ( (this_ProcessSpawn_0= ruleProcessSpawn | this_ProcessCall_1= ruleProcessCall | this_ProcessSend_2= ruleProcessSend | this_ProcessReceive_3= ruleProcessReceive | this_ProcessIf_4= ruleProcessIf | this_ProcessSet_5= ruleProcessSet | this_ProcessWaitFor_6= ruleProcessWaitFor | this_ProcessLoop_7= ruleProcessLoop ) )
            // InternalGoatComponentsParser.g:459:2: (this_ProcessSpawn_0= ruleProcessSpawn | this_ProcessCall_1= ruleProcessCall | this_ProcessSend_2= ruleProcessSend | this_ProcessReceive_3= ruleProcessReceive | this_ProcessIf_4= ruleProcessIf | this_ProcessSet_5= ruleProcessSet | this_ProcessWaitFor_6= ruleProcessWaitFor | this_ProcessLoop_7= ruleProcessLoop )
            {
            // InternalGoatComponentsParser.g:459:2: (this_ProcessSpawn_0= ruleProcessSpawn | this_ProcessCall_1= ruleProcessCall | this_ProcessSend_2= ruleProcessSend | this_ProcessReceive_3= ruleProcessReceive | this_ProcessIf_4= ruleProcessIf | this_ProcessSet_5= ruleProcessSet | this_ProcessWaitFor_6= ruleProcessWaitFor | this_ProcessLoop_7= ruleProcessLoop )
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
                    // InternalGoatComponentsParser.g:460:3: this_ProcessSpawn_0= ruleProcessSpawn
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
                    // InternalGoatComponentsParser.g:469:3: this_ProcessCall_1= ruleProcessCall
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
                    // InternalGoatComponentsParser.g:478:3: this_ProcessSend_2= ruleProcessSend
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
                    // InternalGoatComponentsParser.g:487:3: this_ProcessReceive_3= ruleProcessReceive
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
                    // InternalGoatComponentsParser.g:496:3: this_ProcessIf_4= ruleProcessIf
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
                    // InternalGoatComponentsParser.g:505:3: this_ProcessSet_5= ruleProcessSet
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
                    // InternalGoatComponentsParser.g:514:3: this_ProcessWaitFor_6= ruleProcessWaitFor
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
                    // InternalGoatComponentsParser.g:523:3: this_ProcessLoop_7= ruleProcessLoop
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
    // InternalGoatComponentsParser.g:535:1: entryRuleProcessSpawn returns [EObject current=null] : iv_ruleProcessSpawn= ruleProcessSpawn EOF ;
    public final EObject entryRuleProcessSpawn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessSpawn = null;


        try {
            // InternalGoatComponentsParser.g:535:53: (iv_ruleProcessSpawn= ruleProcessSpawn EOF )
            // InternalGoatComponentsParser.g:536:2: iv_ruleProcessSpawn= ruleProcessSpawn EOF
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
    // InternalGoatComponentsParser.g:542:1: ruleProcessSpawn returns [EObject current=null] : (otherlv_0= Spawn otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleProcessSpawn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:548:2: ( (otherlv_0= Spawn otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGoatComponentsParser.g:549:2: (otherlv_0= Spawn otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:549:2: (otherlv_0= Spawn otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGoatComponentsParser.g:550:3: otherlv_0= Spawn otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Spawn,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessSpawnAccess().getSpawnKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessSpawnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:558:3: ( (otherlv_2= RULE_ID ) )
            // InternalGoatComponentsParser.g:559:4: (otherlv_2= RULE_ID )
            {
            // InternalGoatComponentsParser.g:559:4: (otherlv_2= RULE_ID )
            // InternalGoatComponentsParser.g:560:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessSpawnRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getProcessSpawnAccess().getProcProcessDefinitionCrossReference_2_0());
            				

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
    // InternalGoatComponentsParser.g:579:1: entryRuleProcessCall returns [EObject current=null] : iv_ruleProcessCall= ruleProcessCall EOF ;
    public final EObject entryRuleProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessCall = null;


        try {
            // InternalGoatComponentsParser.g:579:52: (iv_ruleProcessCall= ruleProcessCall EOF )
            // InternalGoatComponentsParser.g:580:2: iv_ruleProcessCall= ruleProcessCall EOF
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
    // InternalGoatComponentsParser.g:586:1: ruleProcessCall returns [EObject current=null] : (otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleProcessCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:592:2: ( (otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGoatComponentsParser.g:593:2: (otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:593:2: (otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGoatComponentsParser.g:594:3: otherlv_0= Call otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Call,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessCallAccess().getCallKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:602:3: ( (otherlv_2= RULE_ID ) )
            // InternalGoatComponentsParser.g:603:4: (otherlv_2= RULE_ID )
            {
            // InternalGoatComponentsParser.g:603:4: (otherlv_2= RULE_ID )
            // InternalGoatComponentsParser.g:604:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessCallRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

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
    // InternalGoatComponentsParser.g:623:1: entryRuleProcessSend returns [EObject current=null] : iv_ruleProcessSend= ruleProcessSend EOF ;
    public final EObject entryRuleProcessSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessSend = null;


        try {
            // InternalGoatComponentsParser.g:623:52: (iv_ruleProcessSend= ruleProcessSend EOF )
            // InternalGoatComponentsParser.g:624:2: iv_ruleProcessSend= ruleProcessSend EOF
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
    // InternalGoatComponentsParser.g:630:1: ruleProcessSend returns [EObject current=null] : (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon ) ;
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
            // InternalGoatComponentsParser.g:636:2: ( (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon ) )
            // InternalGoatComponentsParser.g:637:2: (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon )
            {
            // InternalGoatComponentsParser.g:637:2: (otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon )
            // InternalGoatComponentsParser.g:638:3: otherlv_0= Send otherlv_1= LeftCurlyBracket ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )? otherlv_5= RightCurlyBracket otherlv_6= CommercialAt otherlv_7= LeftParenthesis ( (lv_send_pred_8_0= ruleOutputPredicate ) ) otherlv_9= RightParenthesis ( (lv_updates_10_0= ruleUpdate ) ) ( (lv_print_11_0= rulePrintStatement ) )? otherlv_12= Semicolon
            {
            otherlv_0=(Token)match(input,Send,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessSendAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessSendAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:646:3: ( ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Length||LA7_0==False||LA7_0==Comp||LA7_0==Proc||LA7_0==True||LA7_0==ExclamationMark||LA7_0==LeftParenthesis||LA7_0==HyphenMinus||LA7_0==LeftSquareBracket||(LA7_0>=RULE_ID && LA7_0<=RULE_STRING)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoatComponentsParser.g:647:4: ( (lv_msgOutParts_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )*
                    {
                    // InternalGoatComponentsParser.g:647:4: ( (lv_msgOutParts_2_0= ruleExpression ) )
                    // InternalGoatComponentsParser.g:648:5: (lv_msgOutParts_2_0= ruleExpression )
                    {
                    // InternalGoatComponentsParser.g:648:5: (lv_msgOutParts_2_0= ruleExpression )
                    // InternalGoatComponentsParser.g:649:6: lv_msgOutParts_2_0= ruleExpression
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

                    // InternalGoatComponentsParser.g:666:4: (otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:667:5: otherlv_3= Comma ( (lv_msgOutParts_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getProcessSendAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:671:5: ( (lv_msgOutParts_4_0= ruleExpression ) )
                    	    // InternalGoatComponentsParser.g:672:6: (lv_msgOutParts_4_0= ruleExpression )
                    	    {
                    	    // InternalGoatComponentsParser.g:672:6: (lv_msgOutParts_4_0= ruleExpression )
                    	    // InternalGoatComponentsParser.g:673:7: lv_msgOutParts_4_0= ruleExpression
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
            		
            otherlv_6=(Token)match(input,CommercialAt,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessSendAccess().getCommercialAtKeyword_4());
            		
            otherlv_7=(Token)match(input,LeftParenthesis,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getProcessSendAccess().getLeftParenthesisKeyword_5());
            		
            // InternalGoatComponentsParser.g:704:3: ( (lv_send_pred_8_0= ruleOutputPredicate ) )
            // InternalGoatComponentsParser.g:705:4: (lv_send_pred_8_0= ruleOutputPredicate )
            {
            // InternalGoatComponentsParser.g:705:4: (lv_send_pred_8_0= ruleOutputPredicate )
            // InternalGoatComponentsParser.g:706:5: lv_send_pred_8_0= ruleOutputPredicate
            {

            					newCompositeNode(grammarAccess.getProcessSendAccess().getSend_predOutputPredicateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
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
            		
            // InternalGoatComponentsParser.g:727:3: ( (lv_updates_10_0= ruleUpdate ) )
            // InternalGoatComponentsParser.g:728:4: (lv_updates_10_0= ruleUpdate )
            {
            // InternalGoatComponentsParser.g:728:4: (lv_updates_10_0= ruleUpdate )
            // InternalGoatComponentsParser.g:729:5: lv_updates_10_0= ruleUpdate
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

            // InternalGoatComponentsParser.g:746:3: ( (lv_print_11_0= rulePrintStatement ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Print) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoatComponentsParser.g:747:4: (lv_print_11_0= rulePrintStatement )
                    {
                    // InternalGoatComponentsParser.g:747:4: (lv_print_11_0= rulePrintStatement )
                    // InternalGoatComponentsParser.g:748:5: lv_print_11_0= rulePrintStatement
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
    // InternalGoatComponentsParser.g:773:1: entryRuleProcessReceive returns [EObject current=null] : iv_ruleProcessReceive= ruleProcessReceive EOF ;
    public final EObject entryRuleProcessReceive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessReceive = null;


        try {
            // InternalGoatComponentsParser.g:773:55: (iv_ruleProcessReceive= ruleProcessReceive EOF )
            // InternalGoatComponentsParser.g:774:2: iv_ruleProcessReceive= ruleProcessReceive EOF
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
    // InternalGoatComponentsParser.g:780:1: ruleProcessReceive returns [EObject current=null] : (this_ProcessReceiveSingle_0= ruleProcessReceiveSingle | this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple ) ;
    public final EObject ruleProcessReceive() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessReceiveSingle_0 = null;

        EObject this_ProcessReceiveMultiple_1 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:786:2: ( (this_ProcessReceiveSingle_0= ruleProcessReceiveSingle | this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple ) )
            // InternalGoatComponentsParser.g:787:2: (this_ProcessReceiveSingle_0= ruleProcessReceiveSingle | this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple )
            {
            // InternalGoatComponentsParser.g:787:2: (this_ProcessReceiveSingle_0= ruleProcessReceiveSingle | this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Receive) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==LeftCurlyBracket) ) {
                    alt9=2;
                }
                else if ( (LA9_1==LeftParenthesis) ) {
                    alt9=1;
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
                    // InternalGoatComponentsParser.g:788:3: this_ProcessReceiveSingle_0= ruleProcessReceiveSingle
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
                    // InternalGoatComponentsParser.g:797:3: this_ProcessReceiveMultiple_1= ruleProcessReceiveMultiple
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
    // InternalGoatComponentsParser.g:809:1: entryRuleProcessReceiveSingle returns [EObject current=null] : iv_ruleProcessReceiveSingle= ruleProcessReceiveSingle EOF ;
    public final EObject entryRuleProcessReceiveSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessReceiveSingle = null;


        try {
            // InternalGoatComponentsParser.g:809:61: (iv_ruleProcessReceiveSingle= ruleProcessReceiveSingle EOF )
            // InternalGoatComponentsParser.g:810:2: iv_ruleProcessReceiveSingle= ruleProcessReceiveSingle EOF
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
    // InternalGoatComponentsParser.g:816:1: ruleProcessReceiveSingle returns [EObject current=null] : (otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) ) ) ;
    public final EObject ruleProcessReceiveSingle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cases_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:822:2: ( (otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) ) ) )
            // InternalGoatComponentsParser.g:823:2: (otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) ) )
            {
            // InternalGoatComponentsParser.g:823:2: (otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) ) )
            // InternalGoatComponentsParser.g:824:3: otherlv_0= Receive ( (lv_cases_1_0= ruleReceiveCase ) ) otherlv_2= Semicolon ( (lv_then_3_0= ruleEmptyProcessBlock ) )
            {
            otherlv_0=(Token)match(input,Receive,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessReceiveSingleAccess().getReceiveKeyword_0());
            		
            // InternalGoatComponentsParser.g:828:3: ( (lv_cases_1_0= ruleReceiveCase ) )
            // InternalGoatComponentsParser.g:829:4: (lv_cases_1_0= ruleReceiveCase )
            {
            // InternalGoatComponentsParser.g:829:4: (lv_cases_1_0= ruleReceiveCase )
            // InternalGoatComponentsParser.g:830:5: lv_cases_1_0= ruleReceiveCase
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
            		
            // InternalGoatComponentsParser.g:851:3: ( (lv_then_3_0= ruleEmptyProcessBlock ) )
            // InternalGoatComponentsParser.g:852:4: (lv_then_3_0= ruleEmptyProcessBlock )
            {
            // InternalGoatComponentsParser.g:852:4: (lv_then_3_0= ruleEmptyProcessBlock )
            // InternalGoatComponentsParser.g:853:5: lv_then_3_0= ruleEmptyProcessBlock
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
    // InternalGoatComponentsParser.g:874:1: entryRuleEmptyProcessBlock returns [EObject current=null] : iv_ruleEmptyProcessBlock= ruleEmptyProcessBlock EOF ;
    public final EObject entryRuleEmptyProcessBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyProcessBlock = null;


        try {
            // InternalGoatComponentsParser.g:874:58: (iv_ruleEmptyProcessBlock= ruleEmptyProcessBlock EOF )
            // InternalGoatComponentsParser.g:875:2: iv_ruleEmptyProcessBlock= ruleEmptyProcessBlock EOF
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
    // InternalGoatComponentsParser.g:881:1: ruleEmptyProcessBlock returns [EObject current=null] : () ;
    public final EObject ruleEmptyProcessBlock() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:887:2: ( () )
            // InternalGoatComponentsParser.g:888:2: ()
            {
            // InternalGoatComponentsParser.g:888:2: ()
            // InternalGoatComponentsParser.g:889:3: 
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
    // InternalGoatComponentsParser.g:898:1: entryRuleProcessReceiveMultiple returns [EObject current=null] : iv_ruleProcessReceiveMultiple= ruleProcessReceiveMultiple EOF ;
    public final EObject entryRuleProcessReceiveMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessReceiveMultiple = null;


        try {
            // InternalGoatComponentsParser.g:898:63: (iv_ruleProcessReceiveMultiple= ruleProcessReceiveMultiple EOF )
            // InternalGoatComponentsParser.g:899:2: iv_ruleProcessReceiveMultiple= ruleProcessReceiveMultiple EOF
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
    // InternalGoatComponentsParser.g:905:1: ruleProcessReceiveMultiple returns [EObject current=null] : (otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket ) ;
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
            // InternalGoatComponentsParser.g:911:2: ( (otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:912:2: (otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:912:2: (otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket )
            // InternalGoatComponentsParser.g:913:3: otherlv_0= Receive otherlv_1= LeftCurlyBracket (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+ otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Receive,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessReceiveMultipleAccess().getReceiveKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessReceiveMultipleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:921:3: (otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) ) )+
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
            	    // InternalGoatComponentsParser.g:922:4: otherlv_2= Case ( (lv_cases_3_0= ruleReceiveCase ) ) otherlv_4= Colon ( (lv_then_5_0= ruleProcessBlock ) )
            	    {
            	    otherlv_2=(Token)match(input,Case,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProcessReceiveMultipleAccess().getCaseKeyword_2_0());
            	    			
            	    // InternalGoatComponentsParser.g:926:4: ( (lv_cases_3_0= ruleReceiveCase ) )
            	    // InternalGoatComponentsParser.g:927:5: (lv_cases_3_0= ruleReceiveCase )
            	    {
            	    // InternalGoatComponentsParser.g:927:5: (lv_cases_3_0= ruleReceiveCase )
            	    // InternalGoatComponentsParser.g:928:6: lv_cases_3_0= ruleReceiveCase
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
            	    			
            	    // InternalGoatComponentsParser.g:949:4: ( (lv_then_5_0= ruleProcessBlock ) )
            	    // InternalGoatComponentsParser.g:950:5: (lv_then_5_0= ruleProcessBlock )
            	    {
            	    // InternalGoatComponentsParser.g:950:5: (lv_then_5_0= ruleProcessBlock )
            	    // InternalGoatComponentsParser.g:951:6: lv_then_5_0= ruleProcessBlock
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
    // InternalGoatComponentsParser.g:977:1: entryRuleReceiveCase returns [EObject current=null] : iv_ruleReceiveCase= ruleReceiveCase EOF ;
    public final EObject entryRuleReceiveCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiveCase = null;


        try {
            // InternalGoatComponentsParser.g:977:52: (iv_ruleReceiveCase= ruleReceiveCase EOF )
            // InternalGoatComponentsParser.g:978:2: iv_ruleReceiveCase= ruleReceiveCase EOF
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
    // InternalGoatComponentsParser.g:984:1: ruleReceiveCase returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_print_9_0= rulePrintStatement ) )? ) ;
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

        EObject lv_print_9_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:990:2: ( (otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_print_9_0= rulePrintStatement ) )? ) )
            // InternalGoatComponentsParser.g:991:2: (otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_print_9_0= rulePrintStatement ) )? )
            {
            // InternalGoatComponentsParser.g:991:2: (otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_print_9_0= rulePrintStatement ) )? )
            // InternalGoatComponentsParser.g:992:3: otherlv_0= LeftParenthesis ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= RightParenthesis otherlv_3= LeftCurlyBracket ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )? otherlv_7= RightCurlyBracket ( (lv_updates_8_0= ruleUpdate ) ) ( (lv_print_9_0= rulePrintStatement ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiveCaseAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGoatComponentsParser.g:996:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:997:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:997:4: (lv_cond_1_0= ruleExpression )
            // InternalGoatComponentsParser.g:998:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getReceiveCaseAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getReceiveCaseAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getReceiveCaseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGoatComponentsParser.g:1023:3: ( ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGoatComponentsParser.g:1024:4: ( (lv_msgInParts_4_0= RULE_ID ) ) (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )*
                    {
                    // InternalGoatComponentsParser.g:1024:4: ( (lv_msgInParts_4_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:1025:5: (lv_msgInParts_4_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:1025:5: (lv_msgInParts_4_0= RULE_ID )
                    // InternalGoatComponentsParser.g:1026:6: lv_msgInParts_4_0= RULE_ID
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

                    // InternalGoatComponentsParser.g:1042:4: (otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:1043:5: otherlv_5= Comma ( (lv_msgInParts_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getReceiveCaseAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:1047:5: ( (lv_msgInParts_6_0= RULE_ID ) )
                    	    // InternalGoatComponentsParser.g:1048:6: (lv_msgInParts_6_0= RULE_ID )
                    	    {
                    	    // InternalGoatComponentsParser.g:1048:6: (lv_msgInParts_6_0= RULE_ID )
                    	    // InternalGoatComponentsParser.g:1049:7: lv_msgInParts_6_0= RULE_ID
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
            		
            // InternalGoatComponentsParser.g:1071:3: ( (lv_updates_8_0= ruleUpdate ) )
            // InternalGoatComponentsParser.g:1072:4: (lv_updates_8_0= ruleUpdate )
            {
            // InternalGoatComponentsParser.g:1072:4: (lv_updates_8_0= ruleUpdate )
            // InternalGoatComponentsParser.g:1073:5: lv_updates_8_0= ruleUpdate
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

            // InternalGoatComponentsParser.g:1090:3: ( (lv_print_9_0= rulePrintStatement ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Print) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGoatComponentsParser.g:1091:4: (lv_print_9_0= rulePrintStatement )
                    {
                    // InternalGoatComponentsParser.g:1091:4: (lv_print_9_0= rulePrintStatement )
                    // InternalGoatComponentsParser.g:1092:5: lv_print_9_0= rulePrintStatement
                    {

                    					newCompositeNode(grammarAccess.getReceiveCaseAccess().getPrintPrintStatementParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_print_9_0=rulePrintStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReceiveCaseRule());
                    					}
                    					set(
                    						current,
                    						"print",
                    						lv_print_9_0,
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
    // InternalGoatComponentsParser.g:1113:1: entryRuleProcessIf returns [EObject current=null] : iv_ruleProcessIf= ruleProcessIf EOF ;
    public final EObject entryRuleProcessIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessIf = null;


        try {
            // InternalGoatComponentsParser.g:1113:50: (iv_ruleProcessIf= ruleProcessIf EOF )
            // InternalGoatComponentsParser.g:1114:2: iv_ruleProcessIf= ruleProcessIf EOF
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
    // InternalGoatComponentsParser.g:1120:1: ruleProcessIf returns [EObject current=null] : (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )? ) ;
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
            // InternalGoatComponentsParser.g:1126:2: ( (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )? ) )
            // InternalGoatComponentsParser.g:1127:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )? )
            {
            // InternalGoatComponentsParser.g:1127:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )? )
            // InternalGoatComponentsParser.g:1128:3: otherlv_0= If otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis this_ProcessThenBlock_4= ruleProcessThenBlock[$current] (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )* (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessIfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:1136:3: ( (lv_cond_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:1137:4: (lv_cond_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:1137:4: (lv_cond_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:1138:5: lv_cond_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProcessIfAccess().getCondExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessIfAccess().getRightParenthesisKeyword_3());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProcessIfRule());
            			}
            			newCompositeNode(grammarAccess.getProcessIfAccess().getProcessThenBlockParserRuleCall_4());
            		
            pushFollow(FOLLOW_25);
            this_ProcessThenBlock_4=ruleProcessThenBlock(current);

            state._fsp--;


            			current = this_ProcessThenBlock_4;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:1170:3: (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current] )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Else) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==If) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1171:4: otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_cond_8_0= ruleExpression ) ) otherlv_9= RightParenthesis this_ProcessThenBlock_10= ruleProcessThenBlock[$current]
            	    {
            	    otherlv_5=(Token)match(input,Else,FOLLOW_26); 

            	    				newLeafNode(otherlv_5, grammarAccess.getProcessIfAccess().getElseKeyword_5_0());
            	    			
            	    otherlv_6=(Token)match(input,If,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getProcessIfAccess().getIfKeyword_5_1());
            	    			
            	    otherlv_7=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getProcessIfAccess().getLeftParenthesisKeyword_5_2());
            	    			
            	    // InternalGoatComponentsParser.g:1183:4: ( (lv_cond_8_0= ruleExpression ) )
            	    // InternalGoatComponentsParser.g:1184:5: (lv_cond_8_0= ruleExpression )
            	    {
            	    // InternalGoatComponentsParser.g:1184:5: (lv_cond_8_0= ruleExpression )
            	    // InternalGoatComponentsParser.g:1185:6: lv_cond_8_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getProcessIfAccess().getCondExpressionParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_9);
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

            	    otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_10); 

            	    				newLeafNode(otherlv_9, grammarAccess.getProcessIfAccess().getRightParenthesisKeyword_5_4());
            	    			

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getProcessIfRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getProcessIfAccess().getProcessThenBlockParserRuleCall_5_5());
            	    			
            	    pushFollow(FOLLOW_25);
            	    this_ProcessThenBlock_10=ruleProcessThenBlock(current);

            	    state._fsp--;


            	    				current = this_ProcessThenBlock_10;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalGoatComponentsParser.g:1218:3: (otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Else) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGoatComponentsParser.g:1219:4: otherlv_11= Else this_ProcessThenBlock_12= ruleProcessThenBlock[$current]
                    {
                    otherlv_11=(Token)match(input,Else,FOLLOW_10); 

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
    // InternalGoatComponentsParser.g:1240:1: ruleProcessThenBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket ) ;
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
            // InternalGoatComponentsParser.g:1246:2: ( (otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:1247:2: (otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:1247:2: (otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket )
            // InternalGoatComponentsParser.g:1248:3: otherlv_0= LeftCurlyBracket ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) ) ( (lv_then_2_0= rulePTBThen ) ) otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessThenBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:1252:3: ( ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) ) )
            // InternalGoatComponentsParser.g:1253:4: ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) )
            {
            // InternalGoatComponentsParser.g:1253:4: ( (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet ) )
            // InternalGoatComponentsParser.g:1254:5: (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet )
            {
            // InternalGoatComponentsParser.g:1254:5: (lv_action_1_1= ruleProcessSend | lv_action_1_2= ruleProcessReceive | lv_action_1_3= ruleProcessSet )
            int alt16=3;
            switch ( input.LA(1) ) {
            case Send:
                {
                alt16=1;
                }
                break;
            case Receive:
                {
                alt16=2;
                }
                break;
            case Set:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalGoatComponentsParser.g:1255:6: lv_action_1_1= ruleProcessSend
                    {

                    						newCompositeNode(grammarAccess.getProcessThenBlockAccess().getActionProcessSendParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_7);
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
                    // InternalGoatComponentsParser.g:1271:6: lv_action_1_2= ruleProcessReceive
                    {

                    						newCompositeNode(grammarAccess.getProcessThenBlockAccess().getActionProcessReceiveParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_7);
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
                    // InternalGoatComponentsParser.g:1287:6: lv_action_1_3= ruleProcessSet
                    {

                    						newCompositeNode(grammarAccess.getProcessThenBlockAccess().getActionProcessSetParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_7);
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

            // InternalGoatComponentsParser.g:1305:3: ( (lv_then_2_0= rulePTBThen ) )
            // InternalGoatComponentsParser.g:1306:4: (lv_then_2_0= rulePTBThen )
            {
            // InternalGoatComponentsParser.g:1306:4: (lv_then_2_0= rulePTBThen )
            // InternalGoatComponentsParser.g:1307:5: lv_then_2_0= rulePTBThen
            {

            					newCompositeNode(grammarAccess.getProcessThenBlockAccess().getThenPTBThenParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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
    // InternalGoatComponentsParser.g:1332:1: entryRulePTBThen returns [EObject current=null] : iv_rulePTBThen= rulePTBThen EOF ;
    public final EObject entryRulePTBThen() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePTBThen = null;


        try {
            // InternalGoatComponentsParser.g:1332:48: (iv_rulePTBThen= rulePTBThen EOF )
            // InternalGoatComponentsParser.g:1333:2: iv_rulePTBThen= rulePTBThen EOF
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
    // InternalGoatComponentsParser.g:1339:1: rulePTBThen returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleProcessStatement ) )* ) ;
    public final EObject rulePTBThen() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1345:2: ( ( () ( (lv_statements_1_0= ruleProcessStatement ) )* ) )
            // InternalGoatComponentsParser.g:1346:2: ( () ( (lv_statements_1_0= ruleProcessStatement ) )* )
            {
            // InternalGoatComponentsParser.g:1346:2: ( () ( (lv_statements_1_0= ruleProcessStatement ) )* )
            // InternalGoatComponentsParser.g:1347:3: () ( (lv_statements_1_0= ruleProcessStatement ) )*
            {
            // InternalGoatComponentsParser.g:1347:3: ()
            // InternalGoatComponentsParser.g:1348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPTBThenAccess().getProcessBlockAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:1354:3: ( (lv_statements_1_0= ruleProcessStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=Receive && LA17_0<=Waitfor)||LA17_0==Spawn||LA17_0==Call||LA17_0==Loop||LA17_0==Send||LA17_0==Set||LA17_0==If) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1355:4: (lv_statements_1_0= ruleProcessStatement )
            	    {
            	    // InternalGoatComponentsParser.g:1355:4: (lv_statements_1_0= ruleProcessStatement )
            	    // InternalGoatComponentsParser.g:1356:5: lv_statements_1_0= ruleProcessStatement
            	    {

            	    					newCompositeNode(grammarAccess.getPTBThenAccess().getStatementsProcessStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "rulePTBThen"


    // $ANTLR start "entryRuleProcessSet"
    // InternalGoatComponentsParser.g:1377:1: entryRuleProcessSet returns [EObject current=null] : iv_ruleProcessSet= ruleProcessSet EOF ;
    public final EObject entryRuleProcessSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessSet = null;


        try {
            // InternalGoatComponentsParser.g:1377:51: (iv_ruleProcessSet= ruleProcessSet EOF )
            // InternalGoatComponentsParser.g:1378:2: iv_ruleProcessSet= ruleProcessSet EOF
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
    // InternalGoatComponentsParser.g:1384:1: ruleProcessSet returns [EObject current=null] : (otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon ) ;
    public final EObject ruleProcessSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_update_1_0 = null;

        EObject lv_print_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1390:2: ( (otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon ) )
            // InternalGoatComponentsParser.g:1391:2: (otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon )
            {
            // InternalGoatComponentsParser.g:1391:2: (otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon )
            // InternalGoatComponentsParser.g:1392:3: otherlv_0= Set ( (lv_update_1_0= ruleUpdate ) ) ( (lv_print_2_0= rulePrintStatement ) )? otherlv_3= Semicolon
            {
            otherlv_0=(Token)match(input,Set,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessSetAccess().getSetKeyword_0());
            		
            // InternalGoatComponentsParser.g:1396:3: ( (lv_update_1_0= ruleUpdate ) )
            // InternalGoatComponentsParser.g:1397:4: (lv_update_1_0= ruleUpdate )
            {
            // InternalGoatComponentsParser.g:1397:4: (lv_update_1_0= ruleUpdate )
            // InternalGoatComponentsParser.g:1398:5: lv_update_1_0= ruleUpdate
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

            // InternalGoatComponentsParser.g:1415:3: ( (lv_print_2_0= rulePrintStatement ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Print) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGoatComponentsParser.g:1416:4: (lv_print_2_0= rulePrintStatement )
                    {
                    // InternalGoatComponentsParser.g:1416:4: (lv_print_2_0= rulePrintStatement )
                    // InternalGoatComponentsParser.g:1417:5: lv_print_2_0= rulePrintStatement
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
    // InternalGoatComponentsParser.g:1442:1: entryRuleProcessWaitFor returns [EObject current=null] : iv_ruleProcessWaitFor= ruleProcessWaitFor EOF ;
    public final EObject entryRuleProcessWaitFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessWaitFor = null;


        try {
            // InternalGoatComponentsParser.g:1442:55: (iv_ruleProcessWaitFor= ruleProcessWaitFor EOF )
            // InternalGoatComponentsParser.g:1443:2: iv_ruleProcessWaitFor= ruleProcessWaitFor EOF
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
    // InternalGoatComponentsParser.g:1449:1: ruleProcessWaitFor returns [EObject current=null] : (otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon ) ;
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
            // InternalGoatComponentsParser.g:1455:2: ( (otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon ) )
            // InternalGoatComponentsParser.g:1456:2: (otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon )
            {
            // InternalGoatComponentsParser.g:1456:2: (otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon )
            // InternalGoatComponentsParser.g:1457:3: otherlv_0= Waitfor otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_update_4_0= ruleUpdate ) ) ( (lv_print_5_0= rulePrintStatement ) )? otherlv_6= Semicolon
            {
            otherlv_0=(Token)match(input,Waitfor,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessWaitForAccess().getWaitforKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessWaitForAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:1465:3: ( (lv_cond_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:1466:4: (lv_cond_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:1466:4: (lv_cond_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:1467:5: lv_cond_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProcessWaitForAccess().getCondExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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
            		
            // InternalGoatComponentsParser.g:1488:3: ( (lv_update_4_0= ruleUpdate ) )
            // InternalGoatComponentsParser.g:1489:4: (lv_update_4_0= ruleUpdate )
            {
            // InternalGoatComponentsParser.g:1489:4: (lv_update_4_0= ruleUpdate )
            // InternalGoatComponentsParser.g:1490:5: lv_update_4_0= ruleUpdate
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

            // InternalGoatComponentsParser.g:1507:3: ( (lv_print_5_0= rulePrintStatement ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Print) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGoatComponentsParser.g:1508:4: (lv_print_5_0= rulePrintStatement )
                    {
                    // InternalGoatComponentsParser.g:1508:4: (lv_print_5_0= rulePrintStatement )
                    // InternalGoatComponentsParser.g:1509:5: lv_print_5_0= rulePrintStatement
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
    // InternalGoatComponentsParser.g:1534:1: entryRuleProcessLoop returns [EObject current=null] : iv_ruleProcessLoop= ruleProcessLoop EOF ;
    public final EObject entryRuleProcessLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessLoop = null;


        try {
            // InternalGoatComponentsParser.g:1534:52: (iv_ruleProcessLoop= ruleProcessLoop EOF )
            // InternalGoatComponentsParser.g:1535:2: iv_ruleProcessLoop= ruleProcessLoop EOF
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
    // InternalGoatComponentsParser.g:1541:1: ruleProcessLoop returns [EObject current=null] : (otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) ) ) ;
    public final EObject ruleProcessLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1547:2: ( (otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) ) ) )
            // InternalGoatComponentsParser.g:1548:2: (otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) ) )
            {
            // InternalGoatComponentsParser.g:1548:2: (otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) ) )
            // InternalGoatComponentsParser.g:1549:3: otherlv_0= Loop ( (lv_block_1_0= ruleProcessBlock ) )
            {
            otherlv_0=(Token)match(input,Loop,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessLoopAccess().getLoopKeyword_0());
            		
            // InternalGoatComponentsParser.g:1553:3: ( (lv_block_1_0= ruleProcessBlock ) )
            // InternalGoatComponentsParser.g:1554:4: (lv_block_1_0= ruleProcessBlock )
            {
            // InternalGoatComponentsParser.g:1554:4: (lv_block_1_0= ruleProcessBlock )
            // InternalGoatComponentsParser.g:1555:5: lv_block_1_0= ruleProcessBlock
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
    // InternalGoatComponentsParser.g:1576:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalGoatComponentsParser.g:1576:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalGoatComponentsParser.g:1577:2: iv_ruleUpdate= ruleUpdate EOF
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
    // InternalGoatComponentsParser.g:1583:1: ruleUpdate returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )? ) ;
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
            // InternalGoatComponentsParser.g:1589:2: ( ( () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )? ) )
            // InternalGoatComponentsParser.g:1590:2: ( () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )? )
            {
            // InternalGoatComponentsParser.g:1590:2: ( () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )? )
            // InternalGoatComponentsParser.g:1591:3: () (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )?
            {
            // InternalGoatComponentsParser.g:1591:3: ()
            // InternalGoatComponentsParser.g:1592:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpdateAccess().getUpdateAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:1598:3: (otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGoatComponentsParser.g:1599:4: otherlv_1= LeftSquareBracket ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) ) otherlv_3= ColonEqualsSign ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )* otherlv_9= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalGoatComponentsParser.g:1603:4: ( ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) ) )
                    // InternalGoatComponentsParser.g:1604:5: ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) )
                    {
                    // InternalGoatComponentsParser.g:1604:5: ( (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute ) )
                    // InternalGoatComponentsParser.g:1605:6: (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute )
                    {
                    // InternalGoatComponentsParser.g:1605:6: (lv_attribute_2_1= ruleUpdateComponentAttribute | lv_attribute_2_2= ruleUpdateLocalAttribute )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==Comp) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==Proc) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalGoatComponentsParser.g:1606:7: lv_attribute_2_1= ruleUpdateComponentAttribute
                            {

                            							newCompositeNode(grammarAccess.getUpdateAccess().getAttributeUpdateComponentAttributeParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_31);
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
                            // InternalGoatComponentsParser.g:1622:7: lv_attribute_2_2= ruleUpdateLocalAttribute
                            {

                            							newCompositeNode(grammarAccess.getUpdateAccess().getAttributeUpdateLocalAttributeParserRuleCall_1_1_0_1());
                            						
                            pushFollow(FOLLOW_31);
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
                    			
                    // InternalGoatComponentsParser.g:1644:4: ( (lv_value_4_0= ruleExpression ) )
                    // InternalGoatComponentsParser.g:1645:5: (lv_value_4_0= ruleExpression )
                    {
                    // InternalGoatComponentsParser.g:1645:5: (lv_value_4_0= ruleExpression )
                    // InternalGoatComponentsParser.g:1646:6: lv_value_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getUpdateAccess().getValueExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    // InternalGoatComponentsParser.g:1663:4: (otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:1664:5: otherlv_5= Comma ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) ) otherlv_7= ColonEqualsSign ( (lv_value_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_30); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getUpdateAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:1668:5: ( ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) ) )
                    	    // InternalGoatComponentsParser.g:1669:6: ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) )
                    	    {
                    	    // InternalGoatComponentsParser.g:1669:6: ( (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute ) )
                    	    // InternalGoatComponentsParser.g:1670:7: (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute )
                    	    {
                    	    // InternalGoatComponentsParser.g:1670:7: (lv_attribute_6_1= ruleUpdateComponentAttribute | lv_attribute_6_2= ruleUpdateLocalAttribute )
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
                    	            // InternalGoatComponentsParser.g:1671:8: lv_attribute_6_1= ruleUpdateComponentAttribute
                    	            {

                    	            								newCompositeNode(grammarAccess.getUpdateAccess().getAttributeUpdateComponentAttributeParserRuleCall_1_4_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_31);
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
                    	            // InternalGoatComponentsParser.g:1687:8: lv_attribute_6_2= ruleUpdateLocalAttribute
                    	            {

                    	            								newCompositeNode(grammarAccess.getUpdateAccess().getAttributeUpdateLocalAttributeParserRuleCall_1_4_1_0_1());
                    	            							
                    	            pushFollow(FOLLOW_31);
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
                    	    				
                    	    // InternalGoatComponentsParser.g:1709:5: ( (lv_value_8_0= ruleExpression ) )
                    	    // InternalGoatComponentsParser.g:1710:6: (lv_value_8_0= ruleExpression )
                    	    {
                    	    // InternalGoatComponentsParser.g:1710:6: (lv_value_8_0= ruleExpression )
                    	    // InternalGoatComponentsParser.g:1711:7: lv_value_8_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUpdateAccess().getValueExpressionParserRuleCall_1_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
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
                    	    break loop22;
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
    // InternalGoatComponentsParser.g:1738:1: entryRuleUpdateComponentAttribute returns [EObject current=null] : iv_ruleUpdateComponentAttribute= ruleUpdateComponentAttribute EOF ;
    public final EObject entryRuleUpdateComponentAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateComponentAttribute = null;


        try {
            // InternalGoatComponentsParser.g:1738:65: (iv_ruleUpdateComponentAttribute= ruleUpdateComponentAttribute EOF )
            // InternalGoatComponentsParser.g:1739:2: iv_ruleUpdateComponentAttribute= ruleUpdateComponentAttribute EOF
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
    // InternalGoatComponentsParser.g:1745:1: ruleUpdateComponentAttribute returns [EObject current=null] : (otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) ) ;
    public final EObject ruleUpdateComponentAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_atname_2_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1751:2: ( (otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:1752:2: (otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:1752:2: (otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:1753:3: otherlv_0= Comp otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Comp,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateComponentAttributeAccess().getCompKeyword_0());
            		
            otherlv_1=(Token)match(input,FullStop,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateComponentAttributeAccess().getFullStopKeyword_1());
            		
            // InternalGoatComponentsParser.g:1761:3: ( (lv_atname_2_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:1762:4: (lv_atname_2_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1762:4: (lv_atname_2_0= RULE_ID )
            // InternalGoatComponentsParser.g:1763:5: lv_atname_2_0= RULE_ID
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
    // InternalGoatComponentsParser.g:1783:1: entryRuleUpdateLocalAttribute returns [EObject current=null] : iv_ruleUpdateLocalAttribute= ruleUpdateLocalAttribute EOF ;
    public final EObject entryRuleUpdateLocalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateLocalAttribute = null;


        try {
            // InternalGoatComponentsParser.g:1783:61: (iv_ruleUpdateLocalAttribute= ruleUpdateLocalAttribute EOF )
            // InternalGoatComponentsParser.g:1784:2: iv_ruleUpdateLocalAttribute= ruleUpdateLocalAttribute EOF
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
    // InternalGoatComponentsParser.g:1790:1: ruleUpdateLocalAttribute returns [EObject current=null] : (otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) ) ;
    public final EObject ruleUpdateLocalAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_atname_2_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1796:2: ( (otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:1797:2: (otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:1797:2: (otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:1798:3: otherlv_0= Proc otherlv_1= FullStop ( (lv_atname_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Proc,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateLocalAttributeAccess().getProcKeyword_0());
            		
            otherlv_1=(Token)match(input,FullStop,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateLocalAttributeAccess().getFullStopKeyword_1());
            		
            // InternalGoatComponentsParser.g:1806:3: ( (lv_atname_2_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:1807:4: (lv_atname_2_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:1807:4: (lv_atname_2_0= RULE_ID )
            // InternalGoatComponentsParser.g:1808:5: lv_atname_2_0= RULE_ID
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
    // InternalGoatComponentsParser.g:1828:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalGoatComponentsParser.g:1828:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalGoatComponentsParser.g:1829:2: iv_rulePrintStatement= rulePrintStatement EOF
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
    // InternalGoatComponentsParser.g:1835:1: rulePrintStatement returns [EObject current=null] : this_PrintFormattedStatement_0= rulePrintFormattedStatement ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject this_PrintFormattedStatement_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1841:2: (this_PrintFormattedStatement_0= rulePrintFormattedStatement )
            // InternalGoatComponentsParser.g:1842:2: this_PrintFormattedStatement_0= rulePrintFormattedStatement
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
    // InternalGoatComponentsParser.g:1853:1: entryRulePrintFormattedStatement returns [EObject current=null] : iv_rulePrintFormattedStatement= rulePrintFormattedStatement EOF ;
    public final EObject entryRulePrintFormattedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintFormattedStatement = null;


        try {
            // InternalGoatComponentsParser.g:1853:64: (iv_rulePrintFormattedStatement= rulePrintFormattedStatement EOF )
            // InternalGoatComponentsParser.g:1854:2: iv_rulePrintFormattedStatement= rulePrintFormattedStatement EOF
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
    // InternalGoatComponentsParser.g:1860:1: rulePrintFormattedStatement returns [EObject current=null] : (otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis ) ;
    public final EObject rulePrintFormattedStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_toPrint_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:1866:2: ( (otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis ) )
            // InternalGoatComponentsParser.g:1867:2: (otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:1867:2: (otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )
            // InternalGoatComponentsParser.g:1868:3: otherlv_0= Print otherlv_1= LeftParenthesis ( (lv_toPrint_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Print,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintFormattedStatementAccess().getPrintKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintFormattedStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:1876:3: ( (lv_toPrint_2_0= RULE_STRING ) )
            // InternalGoatComponentsParser.g:1877:4: (lv_toPrint_2_0= RULE_STRING )
            {
            // InternalGoatComponentsParser.g:1877:4: (lv_toPrint_2_0= RULE_STRING )
            // InternalGoatComponentsParser.g:1878:5: lv_toPrint_2_0= RULE_STRING
            {
            lv_toPrint_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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
    // InternalGoatComponentsParser.g:1902:1: entryRuleEnvInitValue returns [EObject current=null] : iv_ruleEnvInitValue= ruleEnvInitValue EOF ;
    public final EObject entryRuleEnvInitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvInitValue = null;


        try {
            // InternalGoatComponentsParser.g:1902:53: (iv_ruleEnvInitValue= ruleEnvInitValue EOF )
            // InternalGoatComponentsParser.g:1903:2: iv_ruleEnvInitValue= ruleEnvInitValue EOF
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
    // InternalGoatComponentsParser.g:1909:1: ruleEnvInitValue returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket ) ) ;
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
            // InternalGoatComponentsParser.g:1915:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket ) ) )
            // InternalGoatComponentsParser.g:1916:2: ( ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket ) )
            {
            // InternalGoatComponentsParser.g:1916:2: ( ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case HyphenMinus:
                {
                alt27=1;
                }
                break;
            case RULE_INT:
                {
                alt27=2;
                }
                break;
            case RULE_STRING:
                {
                alt27=3;
                }
                break;
            case False:
            case True:
                {
                alt27=4;
                }
                break;
            case LeftSquareBracket:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalGoatComponentsParser.g:1917:3: ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:1917:3: ( () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:1918:4: () otherlv_1= HyphenMinus ( (lv_negvalue_2_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:1918:4: ()
                    // InternalGoatComponentsParser.g:1919:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getNegativeIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnvInitValueAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:1929:4: ( (lv_negvalue_2_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:1930:5: (lv_negvalue_2_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:1930:5: (lv_negvalue_2_0= RULE_INT )
                    // InternalGoatComponentsParser.g:1931:6: lv_negvalue_2_0= RULE_INT
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
                    // InternalGoatComponentsParser.g:1949:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:1949:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:1950:4: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:1950:4: ()
                    // InternalGoatComponentsParser.g:1951:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getIntConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:1957:4: ( (lv_value_4_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:1958:5: (lv_value_4_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:1958:5: (lv_value_4_0= RULE_INT )
                    // InternalGoatComponentsParser.g:1959:6: lv_value_4_0= RULE_INT
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
                    // InternalGoatComponentsParser.g:1977:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalGoatComponentsParser.g:1977:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalGoatComponentsParser.g:1978:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalGoatComponentsParser.g:1978:4: ()
                    // InternalGoatComponentsParser.g:1979:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getStringConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:1985:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:1986:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:1986:5: (lv_value_6_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:1987:6: lv_value_6_0= RULE_STRING
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
                    // InternalGoatComponentsParser.g:2005:3: ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:2005:3: ( () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:2006:4: () ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:2006:4: ()
                    // InternalGoatComponentsParser.g:2007:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getBoolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2013:4: ( ( (lv_value_8_1= True | lv_value_8_2= False ) ) )
                    // InternalGoatComponentsParser.g:2014:5: ( (lv_value_8_1= True | lv_value_8_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:2014:5: ( (lv_value_8_1= True | lv_value_8_2= False ) )
                    // InternalGoatComponentsParser.g:2015:6: (lv_value_8_1= True | lv_value_8_2= False )
                    {
                    // InternalGoatComponentsParser.g:2015:6: (lv_value_8_1= True | lv_value_8_2= False )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==True) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==False) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2016:7: lv_value_8_1= True
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
                            // InternalGoatComponentsParser.g:2027:7: lv_value_8_2= False
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
                    // InternalGoatComponentsParser.g:2042:3: ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket )
                    {
                    // InternalGoatComponentsParser.g:2042:3: ( () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket )
                    // InternalGoatComponentsParser.g:2043:4: () otherlv_10= LeftSquareBracket ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )? otherlv_14= RightSquareBracket
                    {
                    // InternalGoatComponentsParser.g:2043:4: ()
                    // InternalGoatComponentsParser.g:2044:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitValueAccess().getTupleConstantAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,LeftSquareBracket,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvInitValueAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalGoatComponentsParser.g:2054:4: ( ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==False||LA26_0==True||LA26_0==HyphenMinus||LA26_0==LeftSquareBracket||(LA26_0>=RULE_INT && LA26_0<=RULE_STRING)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2055:5: ( (lv_elem_11_0= ruleEnvInitValue ) ) (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )*
                            {
                            // InternalGoatComponentsParser.g:2055:5: ( (lv_elem_11_0= ruleEnvInitValue ) )
                            // InternalGoatComponentsParser.g:2056:6: (lv_elem_11_0= ruleEnvInitValue )
                            {
                            // InternalGoatComponentsParser.g:2056:6: (lv_elem_11_0= ruleEnvInitValue )
                            // InternalGoatComponentsParser.g:2057:7: lv_elem_11_0= ruleEnvInitValue
                            {

                            							newCompositeNode(grammarAccess.getEnvInitValueAccess().getElemEnvInitValueParserRuleCall_4_2_0_0());
                            						
                            pushFollow(FOLLOW_32);
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

                            // InternalGoatComponentsParser.g:2074:5: (otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==Comma) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:2075:6: otherlv_12= Comma ( (lv_elem_13_0= ruleEnvInitValue ) )
                            	    {
                            	    otherlv_12=(Token)match(input,Comma,FOLLOW_37); 

                            	    						newLeafNode(otherlv_12, grammarAccess.getEnvInitValueAccess().getCommaKeyword_4_2_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:2079:6: ( (lv_elem_13_0= ruleEnvInitValue ) )
                            	    // InternalGoatComponentsParser.g:2080:7: (lv_elem_13_0= ruleEnvInitValue )
                            	    {
                            	    // InternalGoatComponentsParser.g:2080:7: (lv_elem_13_0= ruleEnvInitValue )
                            	    // InternalGoatComponentsParser.g:2081:8: lv_elem_13_0= ruleEnvInitValue
                            	    {

                            	    								newCompositeNode(grammarAccess.getEnvInitValueAccess().getElemEnvInitValueParserRuleCall_4_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_32);
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
                            	    break loop25;
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
    // InternalGoatComponentsParser.g:2109:1: entryRuleEnvInitOrArg returns [EObject current=null] : iv_ruleEnvInitOrArg= ruleEnvInitOrArg EOF ;
    public final EObject entryRuleEnvInitOrArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvInitOrArg = null;


        try {
            // InternalGoatComponentsParser.g:2109:53: (iv_ruleEnvInitOrArg= ruleEnvInitOrArg EOF )
            // InternalGoatComponentsParser.g:2110:2: iv_ruleEnvInitOrArg= ruleEnvInitOrArg EOF
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
    // InternalGoatComponentsParser.g:2116:1: ruleEnvInitOrArg returns [EObject current=null] : (this_EnvInitValue_0= ruleEnvInitValue | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleEnvInitOrArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EnvInitValue_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2122:2: ( (this_EnvInitValue_0= ruleEnvInitValue | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalGoatComponentsParser.g:2123:2: (this_EnvInitValue_0= ruleEnvInitValue | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalGoatComponentsParser.g:2123:2: (this_EnvInitValue_0= ruleEnvInitValue | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==False||LA28_0==True||LA28_0==HyphenMinus||LA28_0==LeftSquareBracket||(LA28_0>=RULE_INT && LA28_0<=RULE_STRING)) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGoatComponentsParser.g:2124:3: this_EnvInitValue_0= ruleEnvInitValue
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
                    // InternalGoatComponentsParser.g:2133:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:2133:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:2134:4: () ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:2134:4: ()
                    // InternalGoatComponentsParser.g:2135:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEnvInitOrArgAccess().getEnvironmentArgAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2141:4: ( (otherlv_2= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2142:5: (otherlv_2= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2142:5: (otherlv_2= RULE_ID )
                    // InternalGoatComponentsParser.g:2143:6: otherlv_2= RULE_ID
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
    // InternalGoatComponentsParser.g:2159:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalGoatComponentsParser.g:2159:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalGoatComponentsParser.g:2160:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalGoatComponentsParser.g:2166:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket ) ;
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
            // InternalGoatComponentsParser.g:2172:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:2173:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2173:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket )
            // InternalGoatComponentsParser.g:2174:3: () otherlv_1= LeftCurlyBracket ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )? otherlv_9= RightCurlyBracket
            {
            // InternalGoatComponentsParser.g:2174:3: ()
            // InternalGoatComponentsParser.g:2175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGoatComponentsParser.g:2185:3: ( ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGoatComponentsParser.g:2186:4: ( (lv_attrs_2_0= RULE_ID ) ) otherlv_3= ColonEqualsSign ( (lv_vals_4_0= ruleEnvInitOrArg ) ) (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )*
                    {
                    // InternalGoatComponentsParser.g:2186:4: ( (lv_attrs_2_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2187:5: (lv_attrs_2_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2187:5: (lv_attrs_2_0= RULE_ID )
                    // InternalGoatComponentsParser.g:2188:6: lv_attrs_2_0= RULE_ID
                    {
                    lv_attrs_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

                    otherlv_3=(Token)match(input,ColonEqualsSign,FOLLOW_38); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_1());
                    			
                    // InternalGoatComponentsParser.g:2208:4: ( (lv_vals_4_0= ruleEnvInitOrArg ) )
                    // InternalGoatComponentsParser.g:2209:5: (lv_vals_4_0= ruleEnvInitOrArg )
                    {
                    // InternalGoatComponentsParser.g:2209:5: (lv_vals_4_0= ruleEnvInitOrArg )
                    // InternalGoatComponentsParser.g:2210:6: lv_vals_4_0= ruleEnvInitOrArg
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

                    // InternalGoatComponentsParser.g:2227:4: (otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==Comma) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:2228:5: otherlv_5= Comma ( (lv_attrs_6_0= RULE_ID ) ) otherlv_7= ColonEqualsSign ( (lv_vals_8_0= ruleEnvInitOrArg ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:2232:5: ( (lv_attrs_6_0= RULE_ID ) )
                    	    // InternalGoatComponentsParser.g:2233:6: (lv_attrs_6_0= RULE_ID )
                    	    {
                    	    // InternalGoatComponentsParser.g:2233:6: (lv_attrs_6_0= RULE_ID )
                    	    // InternalGoatComponentsParser.g:2234:7: lv_attrs_6_0= RULE_ID
                    	    {
                    	    lv_attrs_6_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

                    	    otherlv_7=(Token)match(input,ColonEqualsSign,FOLLOW_38); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_3_2());
                    	    				
                    	    // InternalGoatComponentsParser.g:2254:5: ( (lv_vals_8_0= ruleEnvInitOrArg ) )
                    	    // InternalGoatComponentsParser.g:2255:6: (lv_vals_8_0= ruleEnvInitOrArg )
                    	    {
                    	    // InternalGoatComponentsParser.g:2255:6: (lv_vals_8_0= ruleEnvInitOrArg )
                    	    // InternalGoatComponentsParser.g:2256:7: lv_vals_8_0= ruleEnvInitOrArg
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
                    	    break loop29;
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
    // InternalGoatComponentsParser.g:2283:1: entryRuleEnvParam returns [EObject current=null] : iv_ruleEnvParam= ruleEnvParam EOF ;
    public final EObject entryRuleEnvParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvParam = null;


        try {
            // InternalGoatComponentsParser.g:2283:49: (iv_ruleEnvParam= ruleEnvParam EOF )
            // InternalGoatComponentsParser.g:2284:2: iv_ruleEnvParam= ruleEnvParam EOF
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
    // InternalGoatComponentsParser.g:2290:1: ruleEnvParam returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnvParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2296:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:2297:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:2297:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2298:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2298:3: (lv_name_0_0= RULE_ID )
            // InternalGoatComponentsParser.g:2299:4: lv_name_0_0= RULE_ID
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
    // InternalGoatComponentsParser.g:2318:1: entryRuleEnvironmentDefinition returns [EObject current=null] : iv_ruleEnvironmentDefinition= ruleEnvironmentDefinition EOF ;
    public final EObject entryRuleEnvironmentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentDefinition = null;


        try {
            // InternalGoatComponentsParser.g:2318:62: (iv_ruleEnvironmentDefinition= ruleEnvironmentDefinition EOF )
            // InternalGoatComponentsParser.g:2319:2: iv_ruleEnvironmentDefinition= ruleEnvironmentDefinition EOF
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
    // InternalGoatComponentsParser.g:2325:1: ruleEnvironmentDefinition returns [EObject current=null] : (otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) ) ) ;
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
            // InternalGoatComponentsParser.g:2331:2: ( (otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) ) ) )
            // InternalGoatComponentsParser.g:2332:2: (otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) ) )
            {
            // InternalGoatComponentsParser.g:2332:2: (otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) ) )
            // InternalGoatComponentsParser.g:2333:3: otherlv_0= Environment ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )? ( (lv_env_7_0= ruleEnvironment ) )
            {
            otherlv_0=(Token)match(input,Environment,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentDefinitionAccess().getEnvironmentKeyword_0());
            		
            // InternalGoatComponentsParser.g:2337:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:2338:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:2338:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:2339:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

            // InternalGoatComponentsParser.g:2355:3: (otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LeftParenthesis) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGoatComponentsParser.g:2356:4: otherlv_2= LeftParenthesis ( (lv_envParams_3_0= ruleEnvParam ) ) (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )* otherlv_6= RightParenthesis
                    {
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnvironmentDefinitionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalGoatComponentsParser.g:2360:4: ( (lv_envParams_3_0= ruleEnvParam ) )
                    // InternalGoatComponentsParser.g:2361:5: (lv_envParams_3_0= ruleEnvParam )
                    {
                    // InternalGoatComponentsParser.g:2361:5: (lv_envParams_3_0= ruleEnvParam )
                    // InternalGoatComponentsParser.g:2362:6: lv_envParams_3_0= ruleEnvParam
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentDefinitionAccess().getEnvParamsEnvParamParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalGoatComponentsParser.g:2379:4: (otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:2380:5: otherlv_4= Comma ( (lv_envParams_5_0= ruleEnvParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEnvironmentDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:2384:5: ( (lv_envParams_5_0= ruleEnvParam ) )
                    	    // InternalGoatComponentsParser.g:2385:6: (lv_envParams_5_0= ruleEnvParam )
                    	    {
                    	    // InternalGoatComponentsParser.g:2385:6: (lv_envParams_5_0= ruleEnvParam )
                    	    // InternalGoatComponentsParser.g:2386:7: lv_envParams_5_0= ruleEnvParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentDefinitionAccess().getEnvParamsEnvParamParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_39); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentDefinitionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalGoatComponentsParser.g:2409:3: ( (lv_env_7_0= ruleEnvironment ) )
            // InternalGoatComponentsParser.g:2410:4: (lv_env_7_0= ruleEnvironment )
            {
            // InternalGoatComponentsParser.g:2410:4: (lv_env_7_0= ruleEnvironment )
            // InternalGoatComponentsParser.g:2411:5: lv_env_7_0= ruleEnvironment
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
    // InternalGoatComponentsParser.g:2432:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // InternalGoatComponentsParser.g:2432:60: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // InternalGoatComponentsParser.g:2433:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
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
    // InternalGoatComponentsParser.g:2439:1: ruleComponentDefinition returns [EObject current=null] : (otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) ) ) ;
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
            // InternalGoatComponentsParser.g:2445:2: ( (otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) ) ) )
            // InternalGoatComponentsParser.g:2446:2: (otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) ) )
            {
            // InternalGoatComponentsParser.g:2446:2: (otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) ) )
            // InternalGoatComponentsParser.g:2447:3: otherlv_0= Component ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) ) otherlv_8= Colon ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) )
            {
            otherlv_0=(Token)match(input,Component,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDefinitionAccess().getComponentKeyword_0());
            		
            // InternalGoatComponentsParser.g:2451:3: ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? ) | ( (lv_env_7_0= ruleEnvironment ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==LeftCurlyBracket) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalGoatComponentsParser.g:2452:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? )
                    {
                    // InternalGoatComponentsParser.g:2452:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )? )
                    // InternalGoatComponentsParser.g:2453:5: ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )?
                    {
                    // InternalGoatComponentsParser.g:2453:5: ( (otherlv_1= RULE_ID ) )
                    // InternalGoatComponentsParser.g:2454:6: (otherlv_1= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:2454:6: (otherlv_1= RULE_ID )
                    // InternalGoatComponentsParser.g:2455:7: otherlv_1= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentDefinitionRule());
                    							}
                    						
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_42); 

                    							newLeafNode(otherlv_1, grammarAccess.getComponentDefinitionAccess().getEnvrefEnvironmentDefinitionCrossReference_1_0_0_0());
                    						

                    }


                    }

                    // InternalGoatComponentsParser.g:2466:5: (otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==LeftParenthesis) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2467:6: otherlv_2= LeftParenthesis ( (lv_envargs_3_0= ruleEnvInitOrArg ) ) (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_38); 

                            						newLeafNode(otherlv_2, grammarAccess.getComponentDefinitionAccess().getLeftParenthesisKeyword_1_0_1_0());
                            					
                            // InternalGoatComponentsParser.g:2471:6: ( (lv_envargs_3_0= ruleEnvInitOrArg ) )
                            // InternalGoatComponentsParser.g:2472:7: (lv_envargs_3_0= ruleEnvInitOrArg )
                            {
                            // InternalGoatComponentsParser.g:2472:7: (lv_envargs_3_0= ruleEnvInitOrArg )
                            // InternalGoatComponentsParser.g:2473:8: lv_envargs_3_0= ruleEnvInitOrArg
                            {

                            								newCompositeNode(grammarAccess.getComponentDefinitionAccess().getEnvargsEnvInitOrArgParserRuleCall_1_0_1_1_0());
                            							
                            pushFollow(FOLLOW_40);
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

                            // InternalGoatComponentsParser.g:2490:6: (otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==Comma) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:2491:7: otherlv_4= Comma ( (lv_envargs_5_0= ruleEnvInitOrArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FOLLOW_38); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getComponentDefinitionAccess().getCommaKeyword_1_0_1_2_0());
                            	    						
                            	    // InternalGoatComponentsParser.g:2495:7: ( (lv_envargs_5_0= ruleEnvInitOrArg ) )
                            	    // InternalGoatComponentsParser.g:2496:8: (lv_envargs_5_0= ruleEnvInitOrArg )
                            	    {
                            	    // InternalGoatComponentsParser.g:2496:8: (lv_envargs_5_0= ruleEnvInitOrArg )
                            	    // InternalGoatComponentsParser.g:2497:9: lv_envargs_5_0= ruleEnvInitOrArg
                            	    {

                            	    									newCompositeNode(grammarAccess.getComponentDefinitionAccess().getEnvargsEnvInitOrArgParserRuleCall_1_0_1_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_40);
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
                            	    break loop33;
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
                    // InternalGoatComponentsParser.g:2522:4: ( (lv_env_7_0= ruleEnvironment ) )
                    {
                    // InternalGoatComponentsParser.g:2522:4: ( (lv_env_7_0= ruleEnvironment ) )
                    // InternalGoatComponentsParser.g:2523:5: (lv_env_7_0= ruleEnvironment )
                    {
                    // InternalGoatComponentsParser.g:2523:5: (lv_env_7_0= ruleEnvironment )
                    // InternalGoatComponentsParser.g:2524:6: lv_env_7_0= ruleEnvironment
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

            otherlv_8=(Token)match(input,Colon,FOLLOW_43); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentDefinitionAccess().getColonKeyword_2());
            		
            // InternalGoatComponentsParser.g:2546:3: ( ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) ) )
            // InternalGoatComponentsParser.g:2547:4: ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) )
            {
            // InternalGoatComponentsParser.g:2547:4: ( (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock ) )
            // InternalGoatComponentsParser.g:2548:5: (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock )
            {
            // InternalGoatComponentsParser.g:2548:5: (lv_block_9_1= rulePDPBlock | lv_block_9_2= ruleProcessBlock )
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
                    // InternalGoatComponentsParser.g:2549:6: lv_block_9_1= rulePDPBlock
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
                    // InternalGoatComponentsParser.g:2565:6: lv_block_9_2= ruleProcessBlock
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
    // InternalGoatComponentsParser.g:2587:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGoatComponentsParser.g:2587:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGoatComponentsParser.g:2588:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGoatComponentsParser.g:2594:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2600:2: (this_Or_0= ruleOr )
            // InternalGoatComponentsParser.g:2601:2: this_Or_0= ruleOr
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
    // InternalGoatComponentsParser.g:2612:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalGoatComponentsParser.g:2612:43: (iv_ruleOr= ruleOr EOF )
            // InternalGoatComponentsParser.g:2613:2: iv_ruleOr= ruleOr EOF
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
    // InternalGoatComponentsParser.g:2619:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_sub_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2625:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )* ) )
            // InternalGoatComponentsParser.g:2626:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )* )
            {
            // InternalGoatComponentsParser.g:2626:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )* )
            // InternalGoatComponentsParser.g:2627:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2635:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==VerticalLineVerticalLine) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2636:4: () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleAnd ) )
            	    {
            	    // InternalGoatComponentsParser.g:2636:4: ()
            	    // InternalGoatComponentsParser.g:2637:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrAccess().getOrSubAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:2647:4: ( (lv_sub_3_0= ruleAnd ) )
            	    // InternalGoatComponentsParser.g:2648:5: (lv_sub_3_0= ruleAnd )
            	    {
            	    // InternalGoatComponentsParser.g:2648:5: (lv_sub_3_0= ruleAnd )
            	    // InternalGoatComponentsParser.g:2649:6: lv_sub_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getSubAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
            	    break loop37;
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
    // InternalGoatComponentsParser.g:2671:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGoatComponentsParser.g:2671:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGoatComponentsParser.g:2672:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalGoatComponentsParser.g:2678:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_sub_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2684:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )* ) )
            // InternalGoatComponentsParser.g:2685:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )* )
            {
            // InternalGoatComponentsParser.g:2685:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )* )
            // InternalGoatComponentsParser.g:2686:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2694:3: ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==AmpersandAmpersand) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2695:4: () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleEquality ) )
            	    {
            	    // InternalGoatComponentsParser.g:2695:4: ()
            	    // InternalGoatComponentsParser.g:2696:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndAccess().getAndSubAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:2706:4: ( (lv_sub_3_0= ruleEquality ) )
            	    // InternalGoatComponentsParser.g:2707:5: (lv_sub_3_0= ruleEquality )
            	    {
            	    // InternalGoatComponentsParser.g:2707:5: (lv_sub_3_0= ruleEquality )
            	    // InternalGoatComponentsParser.g:2708:6: lv_sub_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getSubEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalGoatComponentsParser.g:2730:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalGoatComponentsParser.g:2730:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalGoatComponentsParser.g:2731:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalGoatComponentsParser.g:2737:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2743:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? ) )
            // InternalGoatComponentsParser.g:2744:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? )
            {
            // InternalGoatComponentsParser.g:2744:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )? )
            // InternalGoatComponentsParser.g:2745:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )?
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2753:3: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ExclamationMarkEqualsSign||LA40_0==EqualsSignEqualsSign) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGoatComponentsParser.g:2754:4: () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) )
                    {
                    // InternalGoatComponentsParser.g:2754:4: ()
                    // InternalGoatComponentsParser.g:2755:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2761:4: ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) )
                    // InternalGoatComponentsParser.g:2762:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
                    {
                    // InternalGoatComponentsParser.g:2762:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
                    // InternalGoatComponentsParser.g:2763:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:2763:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==EqualsSignEqualsSign) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==ExclamationMarkEqualsSign) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2764:7: lv_op_2_1= EqualsSignEqualsSign
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
                            // InternalGoatComponentsParser.g:2775:7: lv_op_2_2= ExclamationMarkEqualsSign
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

                    // InternalGoatComponentsParser.g:2788:4: ( (lv_right_3_0= ruleComparison ) )
                    // InternalGoatComponentsParser.g:2789:5: (lv_right_3_0= ruleComparison )
                    {
                    // InternalGoatComponentsParser.g:2789:5: (lv_right_3_0= ruleComparison )
                    // InternalGoatComponentsParser.g:2790:6: lv_right_3_0= ruleComparison
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
    // InternalGoatComponentsParser.g:2812:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalGoatComponentsParser.g:2812:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalGoatComponentsParser.g:2813:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalGoatComponentsParser.g:2819:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? ) ;
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
            // InternalGoatComponentsParser.g:2825:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? ) )
            // InternalGoatComponentsParser.g:2826:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? )
            {
            // InternalGoatComponentsParser.g:2826:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )? )
            // InternalGoatComponentsParser.g:2827:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )?
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2835:3: ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==LessThanSignEqualsSign||LA42_0==GreaterThanSignEqualsSign||LA42_0==LessThanSign||LA42_0==GreaterThanSign) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGoatComponentsParser.g:2836:4: () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
                    {
                    // InternalGoatComponentsParser.g:2836:4: ()
                    // InternalGoatComponentsParser.g:2837:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:2843:4: ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) )
                    // InternalGoatComponentsParser.g:2844:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
                    {
                    // InternalGoatComponentsParser.g:2844:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
                    // InternalGoatComponentsParser.g:2845:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
                    {
                    // InternalGoatComponentsParser.g:2845:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
                    int alt41=4;
                    switch ( input.LA(1) ) {
                    case GreaterThanSignEqualsSign:
                        {
                        alt41=1;
                        }
                        break;
                    case LessThanSignEqualsSign:
                        {
                        alt41=2;
                        }
                        break;
                    case GreaterThanSign:
                        {
                        alt41=3;
                        }
                        break;
                    case LessThanSign:
                        {
                        alt41=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2846:7: lv_op_2_1= GreaterThanSignEqualsSign
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
                            // InternalGoatComponentsParser.g:2857:7: lv_op_2_2= LessThanSignEqualsSign
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
                            // InternalGoatComponentsParser.g:2868:7: lv_op_2_3= GreaterThanSign
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
                            // InternalGoatComponentsParser.g:2879:7: lv_op_2_4= LessThanSign
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

                    // InternalGoatComponentsParser.g:2892:4: ( (lv_right_3_0= rulePlusOrMinus ) )
                    // InternalGoatComponentsParser.g:2893:5: (lv_right_3_0= rulePlusOrMinus )
                    {
                    // InternalGoatComponentsParser.g:2893:5: (lv_right_3_0= rulePlusOrMinus )
                    // InternalGoatComponentsParser.g:2894:6: lv_right_3_0= rulePlusOrMinus
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
    // InternalGoatComponentsParser.g:2916:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalGoatComponentsParser.g:2916:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalGoatComponentsParser.g:2917:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalGoatComponentsParser.g:2923:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:2929:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? ) )
            // InternalGoatComponentsParser.g:2930:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? )
            {
            // InternalGoatComponentsParser.g:2930:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )? )
            // InternalGoatComponentsParser.g:2931:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )?
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:2939:3: ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==PlusSignPlusSign||LA44_0==PlusSign||LA44_0==HyphenMinus) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGoatComponentsParser.g:2940:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) ) ( (lv_right_7_0= ruleMulOrDiv ) )
                    {
                    // InternalGoatComponentsParser.g:2940:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= PlusSignPlusSign ) )
                    int alt43=3;
                    switch ( input.LA(1) ) {
                    case PlusSign:
                        {
                        alt43=1;
                        }
                        break;
                    case HyphenMinus:
                        {
                        alt43=2;
                        }
                        break;
                    case PlusSignPlusSign:
                        {
                        alt43=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }

                    switch (alt43) {
                        case 1 :
                            // InternalGoatComponentsParser.g:2941:5: ( () otherlv_2= PlusSign )
                            {
                            // InternalGoatComponentsParser.g:2941:5: ( () otherlv_2= PlusSign )
                            // InternalGoatComponentsParser.g:2942:6: () otherlv_2= PlusSign
                            {
                            // InternalGoatComponentsParser.g:2942:6: ()
                            // InternalGoatComponentsParser.g:2943:7: 
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
                            // InternalGoatComponentsParser.g:2955:5: ( () otherlv_4= HyphenMinus )
                            {
                            // InternalGoatComponentsParser.g:2955:5: ( () otherlv_4= HyphenMinus )
                            // InternalGoatComponentsParser.g:2956:6: () otherlv_4= HyphenMinus
                            {
                            // InternalGoatComponentsParser.g:2956:6: ()
                            // InternalGoatComponentsParser.g:2957:7: 
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
                            // InternalGoatComponentsParser.g:2969:5: ( () otherlv_6= PlusSignPlusSign )
                            {
                            // InternalGoatComponentsParser.g:2969:5: ( () otherlv_6= PlusSignPlusSign )
                            // InternalGoatComponentsParser.g:2970:6: () otherlv_6= PlusSignPlusSign
                            {
                            // InternalGoatComponentsParser.g:2970:6: ()
                            // InternalGoatComponentsParser.g:2971:7: 
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

                    // InternalGoatComponentsParser.g:2983:4: ( (lv_right_7_0= ruleMulOrDiv ) )
                    // InternalGoatComponentsParser.g:2984:5: (lv_right_7_0= ruleMulOrDiv )
                    {
                    // InternalGoatComponentsParser.g:2984:5: (lv_right_7_0= ruleMulOrDiv )
                    // InternalGoatComponentsParser.g:2985:6: lv_right_7_0= ruleMulOrDiv
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
    // InternalGoatComponentsParser.g:3007:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalGoatComponentsParser.g:3007:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalGoatComponentsParser.g:3008:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalGoatComponentsParser.g:3014:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3020:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? ) )
            // InternalGoatComponentsParser.g:3021:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? )
            {
            // InternalGoatComponentsParser.g:3021:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )? )
            // InternalGoatComponentsParser.g:3022:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )?
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3030:3: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==PercentSign||LA46_0==Asterisk||LA46_0==Solidus) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGoatComponentsParser.g:3031:4: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ( (lv_right_3_0= rulePrimary ) )
                    {
                    // InternalGoatComponentsParser.g:3031:4: ()
                    // InternalGoatComponentsParser.g:3032:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3038:4: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) )
                    // InternalGoatComponentsParser.g:3039:5: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
                    {
                    // InternalGoatComponentsParser.g:3039:5: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
                    // InternalGoatComponentsParser.g:3040:6: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
                    {
                    // InternalGoatComponentsParser.g:3040:6: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
                    int alt45=3;
                    switch ( input.LA(1) ) {
                    case Asterisk:
                        {
                        alt45=1;
                        }
                        break;
                    case Solidus:
                        {
                        alt45=2;
                        }
                        break;
                    case PercentSign:
                        {
                        alt45=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }

                    switch (alt45) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3041:7: lv_op_2_1= Asterisk
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
                            // InternalGoatComponentsParser.g:3052:7: lv_op_2_2= Solidus
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
                            // InternalGoatComponentsParser.g:3063:7: lv_op_2_3= PercentSign
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

                    // InternalGoatComponentsParser.g:3076:4: ( (lv_right_3_0= rulePrimary ) )
                    // InternalGoatComponentsParser.g:3077:5: (lv_right_3_0= rulePrimary )
                    {
                    // InternalGoatComponentsParser.g:3077:5: (lv_right_3_0= rulePrimary )
                    // InternalGoatComponentsParser.g:3078:6: lv_right_3_0= rulePrimary
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
    // InternalGoatComponentsParser.g:3100:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGoatComponentsParser.g:3100:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGoatComponentsParser.g:3101:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalGoatComponentsParser.g:3107:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) ) | ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) ) | this_ContainmentExpr_6= ruleContainmentExpr ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_ContainmentExpr_6 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3113:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) ) | ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) ) | this_ContainmentExpr_6= ruleContainmentExpr ) )
            // InternalGoatComponentsParser.g:3114:2: ( ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) ) | ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) ) | this_ContainmentExpr_6= ruleContainmentExpr )
            {
            // InternalGoatComponentsParser.g:3114:2: ( ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) ) | ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) ) | this_ContainmentExpr_6= ruleContainmentExpr )
            int alt47=3;
            switch ( input.LA(1) ) {
            case HyphenMinus:
                {
                alt47=1;
                }
                break;
            case ExclamationMark:
                {
                alt47=2;
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
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalGoatComponentsParser.g:3115:3: ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) )
                    {
                    // InternalGoatComponentsParser.g:3115:3: ( () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) ) )
                    // InternalGoatComponentsParser.g:3116:4: () otherlv_1= HyphenMinus ( (lv_expression_2_0= ruleContainmentExpr ) )
                    {
                    // InternalGoatComponentsParser.g:3116:4: ()
                    // InternalGoatComponentsParser.g:3117:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUnaryMinusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:3127:4: ( (lv_expression_2_0= ruleContainmentExpr ) )
                    // InternalGoatComponentsParser.g:3128:5: (lv_expression_2_0= ruleContainmentExpr )
                    {
                    // InternalGoatComponentsParser.g:3128:5: (lv_expression_2_0= ruleContainmentExpr )
                    // InternalGoatComponentsParser.g:3129:6: lv_expression_2_0= ruleContainmentExpr
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
                    // InternalGoatComponentsParser.g:3148:3: ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) )
                    {
                    // InternalGoatComponentsParser.g:3148:3: ( () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) ) )
                    // InternalGoatComponentsParser.g:3149:4: () otherlv_4= ExclamationMark ( (lv_expression_5_0= ruleContainmentExpr ) )
                    {
                    // InternalGoatComponentsParser.g:3149:4: ()
                    // InternalGoatComponentsParser.g:3150:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,ExclamationMark,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalGoatComponentsParser.g:3160:4: ( (lv_expression_5_0= ruleContainmentExpr ) )
                    // InternalGoatComponentsParser.g:3161:5: (lv_expression_5_0= ruleContainmentExpr )
                    {
                    // InternalGoatComponentsParser.g:3161:5: (lv_expression_5_0= ruleContainmentExpr )
                    // InternalGoatComponentsParser.g:3162:6: lv_expression_5_0= ruleContainmentExpr
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
                    // InternalGoatComponentsParser.g:3181:3: this_ContainmentExpr_6= ruleContainmentExpr
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
    // InternalGoatComponentsParser.g:3193:1: entryRuleContainmentExpr returns [EObject current=null] : iv_ruleContainmentExpr= ruleContainmentExpr EOF ;
    public final EObject entryRuleContainmentExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentExpr = null;


        try {
            // InternalGoatComponentsParser.g:3193:56: (iv_ruleContainmentExpr= ruleContainmentExpr EOF )
            // InternalGoatComponentsParser.g:3194:2: iv_ruleContainmentExpr= ruleContainmentExpr EOF
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
    // InternalGoatComponentsParser.g:3200:1: ruleContainmentExpr returns [EObject current=null] : (this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )? ) ;
    public final EObject ruleContainmentExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AtomicOrExpr_0 = null;

        EObject lv_tuple_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3206:2: ( (this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )? ) )
            // InternalGoatComponentsParser.g:3207:2: (this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )? )
            {
            // InternalGoatComponentsParser.g:3207:2: (this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )? )
            // InternalGoatComponentsParser.g:3208:3: this_AtomicOrExpr_0= ruleAtomicOrExpr ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )?
            {

            			newCompositeNode(grammarAccess.getContainmentExprAccess().getAtomicOrExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_AtomicOrExpr_0=ruleAtomicOrExpr();

            state._fsp--;


            			current = this_AtomicOrExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3216:3: ( () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==In) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGoatComponentsParser.g:3217:4: () otherlv_2= In ( (lv_tuple_3_0= ruleAtomicOrExpr ) )
                    {
                    // InternalGoatComponentsParser.g:3217:4: ()
                    // InternalGoatComponentsParser.g:3218:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getContainmentExprAccess().getContainmentExpressionElemAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,In,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getContainmentExprAccess().getInKeyword_1_1());
                    			
                    // InternalGoatComponentsParser.g:3228:4: ( (lv_tuple_3_0= ruleAtomicOrExpr ) )
                    // InternalGoatComponentsParser.g:3229:5: (lv_tuple_3_0= ruleAtomicOrExpr )
                    {
                    // InternalGoatComponentsParser.g:3229:5: (lv_tuple_3_0= ruleAtomicOrExpr )
                    // InternalGoatComponentsParser.g:3230:6: lv_tuple_3_0= ruleAtomicOrExpr
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
    // InternalGoatComponentsParser.g:3252:1: entryRuleAtomicOrExpr returns [EObject current=null] : iv_ruleAtomicOrExpr= ruleAtomicOrExpr EOF ;
    public final EObject entryRuleAtomicOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicOrExpr = null;


        try {
            // InternalGoatComponentsParser.g:3252:53: (iv_ruleAtomicOrExpr= ruleAtomicOrExpr EOF )
            // InternalGoatComponentsParser.g:3253:2: iv_ruleAtomicOrExpr= ruleAtomicOrExpr EOF
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
    // InternalGoatComponentsParser.g:3259:1: ruleAtomicOrExpr returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic ) ;
    public final EObject ruleAtomicOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Atomic_3 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3265:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic ) )
            // InternalGoatComponentsParser.g:3266:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic )
            {
            // InternalGoatComponentsParser.g:3266:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LeftParenthesis) ) {
                alt49=1;
            }
            else if ( (LA49_0==Length||LA49_0==False||LA49_0==Comp||LA49_0==Proc||LA49_0==True||LA49_0==LeftSquareBracket||(LA49_0>=RULE_ID && LA49_0<=RULE_STRING)) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalGoatComponentsParser.g:3267:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:3267:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalGoatComponentsParser.g:3268:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getAtomicOrExprAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomicOrExprAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
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
                    // InternalGoatComponentsParser.g:3286:3: this_Atomic_3= ruleAtomic
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
    // InternalGoatComponentsParser.g:3298:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalGoatComponentsParser.g:3298:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalGoatComponentsParser.g:3299:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalGoatComponentsParser.g:3305:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? ) ) ;
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
            // InternalGoatComponentsParser.g:3311:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? ) ) )
            // InternalGoatComponentsParser.g:3312:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? ) )
            {
            // InternalGoatComponentsParser.g:3312:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? ) )
            int alt52=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt52=1;
                }
                break;
            case RULE_STRING:
                {
                alt52=2;
                }
                break;
            case False:
            case True:
                {
                alt52=3;
                }
                break;
            case Length:
            case Comp:
            case Proc:
            case LeftSquareBracket:
            case RULE_ID:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalGoatComponentsParser.g:3313:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:3313:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:3314:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:3314:4: ()
                    // InternalGoatComponentsParser.g:3315:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3321:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:3322:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:3322:5: (lv_value_1_0= RULE_INT )
                    // InternalGoatComponentsParser.g:3323:6: lv_value_1_0= RULE_INT
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
                    // InternalGoatComponentsParser.g:3341:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalGoatComponentsParser.g:3341:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalGoatComponentsParser.g:3342:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalGoatComponentsParser.g:3342:4: ()
                    // InternalGoatComponentsParser.g:3343:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3349:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:3350:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:3350:5: (lv_value_3_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:3351:6: lv_value_3_0= RULE_STRING
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
                    // InternalGoatComponentsParser.g:3369:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:3369:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:3370:4: () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:3370:4: ()
                    // InternalGoatComponentsParser.g:3371:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3377:4: ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    // InternalGoatComponentsParser.g:3378:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:3378:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    // InternalGoatComponentsParser.g:3379:6: (lv_value_5_1= True | lv_value_5_2= False )
                    {
                    // InternalGoatComponentsParser.g:3379:6: (lv_value_5_1= True | lv_value_5_2= False )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==True) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==False) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3380:7: lv_value_5_1= True
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
                            // InternalGoatComponentsParser.g:3391:7: lv_value_5_2= False
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
                    // InternalGoatComponentsParser.g:3406:3: (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? )
                    {
                    // InternalGoatComponentsParser.g:3406:3: (this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )? )
                    // InternalGoatComponentsParser.g:3407:4: this_AtomicIndexable_6= ruleAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )?
                    {

                    				newCompositeNode(grammarAccess.getAtomicAccess().getAtomicIndexableParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_51);
                    this_AtomicIndexable_6=ruleAtomicIndexable();

                    state._fsp--;


                    				current = this_AtomicIndexable_6;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalGoatComponentsParser.g:3415:4: (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==LeftSquareBracket) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3416:5: otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleExpression ) ) otherlv_10= RightSquareBracket
                            {
                            otherlv_7=(Token)match(input,LeftSquareBracket,FOLLOW_13); 

                            					newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getLeftSquareBracketKeyword_3_1_0());
                            				
                            // InternalGoatComponentsParser.g:3420:5: ()
                            // InternalGoatComponentsParser.g:3421:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getAtomicAccess().getTupleGetElemAction_3_1_1(),
                            							current);
                            					

                            }

                            // InternalGoatComponentsParser.g:3427:5: ( (lv_idx_9_0= ruleExpression ) )
                            // InternalGoatComponentsParser.g:3428:6: (lv_idx_9_0= ruleExpression )
                            {
                            // InternalGoatComponentsParser.g:3428:6: (lv_idx_9_0= ruleExpression )
                            // InternalGoatComponentsParser.g:3429:7: lv_idx_9_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getAtomicAccess().getIdxExpressionParserRuleCall_3_1_2_0());
                            						
                            pushFollow(FOLLOW_52);
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
    // InternalGoatComponentsParser.g:3456:1: entryRuleAtomicIndexable returns [EObject current=null] : iv_ruleAtomicIndexable= ruleAtomicIndexable EOF ;
    public final EObject entryRuleAtomicIndexable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicIndexable = null;


        try {
            // InternalGoatComponentsParser.g:3456:56: (iv_ruleAtomicIndexable= ruleAtomicIndexable EOF )
            // InternalGoatComponentsParser.g:3457:2: iv_ruleAtomicIndexable= ruleAtomicIndexable EOF
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
    // InternalGoatComponentsParser.g:3463:1: ruleAtomicIndexable returns [EObject current=null] : ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) ) | ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis ) | ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) ) ) ;
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
            // InternalGoatComponentsParser.g:3469:2: ( ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) ) | ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis ) | ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) ) ) )
            // InternalGoatComponentsParser.g:3470:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) ) | ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis ) | ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) ) )
            {
            // InternalGoatComponentsParser.g:3470:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) ) | ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis ) | ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) ) )
            int alt57=6;
            switch ( input.LA(1) ) {
            case LeftSquareBracket:
                {
                alt57=1;
                }
                break;
            case Length:
                {
                alt57=2;
                }
                break;
            case RULE_ID:
                {
                int LA57_3 = input.LA(2);

                if ( (LA57_3==EOF||LA57_3==Return||LA57_3==While||(LA57_3>=Var && LA57_3<=PlusSignPlusSign)||(LA57_3>=LessThanSignEqualsSign && LA57_3<=VerticalLineVerticalLine)||LA57_3==PercentSign||(LA57_3>=RightParenthesis && LA57_3<=HyphenMinus)||LA57_3==Solidus||LA57_3==LessThanSign||LA57_3==GreaterThanSign||(LA57_3>=LeftSquareBracket && LA57_3<=RightSquareBracket)||LA57_3==RightCurlyBracket||LA57_3==RULE_ID) ) {
                    alt57=3;
                }
                else if ( (LA57_3==LeftParenthesis) ) {
                    alt57=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 3, input);

                    throw nvae;
                }
                }
                break;
            case Proc:
                {
                alt57=4;
                }
                break;
            case Comp:
                {
                alt57=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalGoatComponentsParser.g:3471:3: ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket )
                    {
                    // InternalGoatComponentsParser.g:3471:3: ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket )
                    // InternalGoatComponentsParser.g:3472:4: () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )? otherlv_5= RightSquareBracket
                    {
                    // InternalGoatComponentsParser.g:3472:4: ()
                    // InternalGoatComponentsParser.g:3473:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getTupleConstantAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_53); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomicIndexableAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:3483:4: ( ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==Length||LA54_0==False||LA54_0==Comp||LA54_0==Proc||LA54_0==True||LA54_0==ExclamationMark||LA54_0==LeftParenthesis||LA54_0==HyphenMinus||LA54_0==LeftSquareBracket||(LA54_0>=RULE_ID && LA54_0<=RULE_STRING)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3484:5: ( (lv_elem_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )*
                            {
                            // InternalGoatComponentsParser.g:3484:5: ( (lv_elem_2_0= ruleExpression ) )
                            // InternalGoatComponentsParser.g:3485:6: (lv_elem_2_0= ruleExpression )
                            {
                            // InternalGoatComponentsParser.g:3485:6: (lv_elem_2_0= ruleExpression )
                            // InternalGoatComponentsParser.g:3486:7: lv_elem_2_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getAtomicIndexableAccess().getElemExpressionParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_32);
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

                            // InternalGoatComponentsParser.g:3503:5: (otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==Comma) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:3504:6: otherlv_3= Comma ( (lv_elem_4_0= ruleExpression ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getAtomicIndexableAccess().getCommaKeyword_0_2_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:3508:6: ( (lv_elem_4_0= ruleExpression ) )
                            	    // InternalGoatComponentsParser.g:3509:7: (lv_elem_4_0= ruleExpression )
                            	    {
                            	    // InternalGoatComponentsParser.g:3509:7: (lv_elem_4_0= ruleExpression )
                            	    // InternalGoatComponentsParser.g:3510:8: lv_elem_4_0= ruleExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getAtomicIndexableAccess().getElemExpressionParserRuleCall_0_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_32);
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
                            	    break loop53;
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
                    // InternalGoatComponentsParser.g:3535:3: ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:3535:3: ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis )
                    // InternalGoatComponentsParser.g:3536:4: () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleAtomic ) ) otherlv_10= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:3536:4: ()
                    // InternalGoatComponentsParser.g:3537:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getTupleLengthAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,Length,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAtomicIndexableAccess().getLengthKeyword_1_1());
                    			
                    otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getAtomicIndexableAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalGoatComponentsParser.g:3551:4: ( (lv_elem_9_0= ruleAtomic ) )
                    // InternalGoatComponentsParser.g:3552:5: (lv_elem_9_0= ruleAtomic )
                    {
                    // InternalGoatComponentsParser.g:3552:5: (lv_elem_9_0= ruleAtomic )
                    // InternalGoatComponentsParser.g:3553:6: lv_elem_9_0= ruleAtomic
                    {

                    						newCompositeNode(grammarAccess.getAtomicIndexableAccess().getElemAtomicParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_9);
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
                    // InternalGoatComponentsParser.g:3576:3: ( () ( (otherlv_12= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:3576:3: ( () ( (otherlv_12= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:3577:4: () ( (otherlv_12= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:3577:4: ()
                    // InternalGoatComponentsParser.g:3578:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getLocalVarRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3584:4: ( (otherlv_12= RULE_ID ) )
                    // InternalGoatComponentsParser.g:3585:5: (otherlv_12= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:3585:5: (otherlv_12= RULE_ID )
                    // InternalGoatComponentsParser.g:3586:6: otherlv_12= RULE_ID
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
                    // InternalGoatComponentsParser.g:3599:3: ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:3599:3: ( () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:3600:4: () otherlv_14= Proc otherlv_15= FullStop ( (lv_attribute_16_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:3600:4: ()
                    // InternalGoatComponentsParser.g:3601:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getLocalAttributeRefAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,Proc,FOLLOW_33); 

                    				newLeafNode(otherlv_14, grammarAccess.getAtomicIndexableAccess().getProcKeyword_3_1());
                    			
                    otherlv_15=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getAtomicIndexableAccess().getFullStopKeyword_3_2());
                    			
                    // InternalGoatComponentsParser.g:3615:4: ( (lv_attribute_16_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:3616:5: (lv_attribute_16_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:3616:5: (lv_attribute_16_0= RULE_ID )
                    // InternalGoatComponentsParser.g:3617:6: lv_attribute_16_0= RULE_ID
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
                    // InternalGoatComponentsParser.g:3635:3: ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:3635:3: ( () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis )
                    // InternalGoatComponentsParser.g:3636:4: () ( (otherlv_18= RULE_ID ) ) otherlv_19= LeftParenthesis ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )? otherlv_23= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:3636:4: ()
                    // InternalGoatComponentsParser.g:3637:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getFunctionCallAction_4_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:3643:4: ( (otherlv_18= RULE_ID ) )
                    // InternalGoatComponentsParser.g:3644:5: (otherlv_18= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:3644:5: (otherlv_18= RULE_ID )
                    // InternalGoatComponentsParser.g:3645:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicIndexableRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_18, grammarAccess.getAtomicIndexableAccess().getFunctionFuncDefinitionCrossReference_4_1_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,LeftParenthesis,FOLLOW_54); 

                    				newLeafNode(otherlv_19, grammarAccess.getAtomicIndexableAccess().getLeftParenthesisKeyword_4_2());
                    			
                    // InternalGoatComponentsParser.g:3660:4: ( ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==Length||LA56_0==False||LA56_0==Comp||LA56_0==Proc||LA56_0==True||LA56_0==ExclamationMark||LA56_0==LeftParenthesis||LA56_0==HyphenMinus||LA56_0==LeftSquareBracket||(LA56_0>=RULE_ID && LA56_0<=RULE_STRING)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3661:5: ( (lv_params_20_0= ruleExpression ) ) (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )*
                            {
                            // InternalGoatComponentsParser.g:3661:5: ( (lv_params_20_0= ruleExpression ) )
                            // InternalGoatComponentsParser.g:3662:6: (lv_params_20_0= ruleExpression )
                            {
                            // InternalGoatComponentsParser.g:3662:6: (lv_params_20_0= ruleExpression )
                            // InternalGoatComponentsParser.g:3663:7: lv_params_20_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getAtomicIndexableAccess().getParamsExpressionParserRuleCall_4_3_0_0());
                            						
                            pushFollow(FOLLOW_40);
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

                            // InternalGoatComponentsParser.g:3680:5: (otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==Comma) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:3681:6: otherlv_21= Comma ( (lv_params_22_0= ruleExpression ) )
                            	    {
                            	    otherlv_21=(Token)match(input,Comma,FOLLOW_13); 

                            	    						newLeafNode(otherlv_21, grammarAccess.getAtomicIndexableAccess().getCommaKeyword_4_3_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:3685:6: ( (lv_params_22_0= ruleExpression ) )
                            	    // InternalGoatComponentsParser.g:3686:7: (lv_params_22_0= ruleExpression )
                            	    {
                            	    // InternalGoatComponentsParser.g:3686:7: (lv_params_22_0= ruleExpression )
                            	    // InternalGoatComponentsParser.g:3687:8: lv_params_22_0= ruleExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getAtomicIndexableAccess().getParamsExpressionParserRuleCall_4_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_40);
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
                            	    break loop55;
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
                    // InternalGoatComponentsParser.g:3712:3: ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:3712:3: ( () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:3713:4: () otherlv_25= Comp otherlv_26= FullStop ( (lv_attribute_27_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:3713:4: ()
                    // InternalGoatComponentsParser.g:3714:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicIndexableAccess().getComponentAttributeRefAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_25=(Token)match(input,Comp,FOLLOW_33); 

                    				newLeafNode(otherlv_25, grammarAccess.getAtomicIndexableAccess().getCompKeyword_5_1());
                    			
                    otherlv_26=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getAtomicIndexableAccess().getFullStopKeyword_5_2());
                    			
                    // InternalGoatComponentsParser.g:3728:4: ( (lv_attribute_27_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:3729:5: (lv_attribute_27_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:3729:5: (lv_attribute_27_0= RULE_ID )
                    // InternalGoatComponentsParser.g:3730:6: lv_attribute_27_0= RULE_ID
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
    // InternalGoatComponentsParser.g:3751:1: entryRuleOutputPredicate returns [EObject current=null] : iv_ruleOutputPredicate= ruleOutputPredicate EOF ;
    public final EObject entryRuleOutputPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPredicate = null;


        try {
            // InternalGoatComponentsParser.g:3751:56: (iv_ruleOutputPredicate= ruleOutputPredicate EOF )
            // InternalGoatComponentsParser.g:3752:2: iv_ruleOutputPredicate= ruleOutputPredicate EOF
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
    // InternalGoatComponentsParser.g:3758:1: ruleOutputPredicate returns [EObject current=null] : this_OutOr_0= ruleOutOr ;
    public final EObject ruleOutputPredicate() throws RecognitionException {
        EObject current = null;

        EObject this_OutOr_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3764:2: (this_OutOr_0= ruleOutOr )
            // InternalGoatComponentsParser.g:3765:2: this_OutOr_0= ruleOutOr
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
    // InternalGoatComponentsParser.g:3776:1: entryRuleOutOr returns [EObject current=null] : iv_ruleOutOr= ruleOutOr EOF ;
    public final EObject entryRuleOutOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutOr = null;


        try {
            // InternalGoatComponentsParser.g:3776:46: (iv_ruleOutOr= ruleOutOr EOF )
            // InternalGoatComponentsParser.g:3777:2: iv_ruleOutOr= ruleOutOr EOF
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
    // InternalGoatComponentsParser.g:3783:1: ruleOutOr returns [EObject current=null] : (this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )* ) ;
    public final EObject ruleOutOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OutAnd_0 = null;

        EObject lv_sub_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3789:2: ( (this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )* ) )
            // InternalGoatComponentsParser.g:3790:2: (this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )* )
            {
            // InternalGoatComponentsParser.g:3790:2: (this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )* )
            // InternalGoatComponentsParser.g:3791:3: this_OutAnd_0= ruleOutAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOutOrAccess().getOutAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_OutAnd_0=ruleOutAnd();

            state._fsp--;


            			current = this_OutAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3799:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==VerticalLineVerticalLine) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3800:4: () otherlv_2= VerticalLineVerticalLine ( (lv_sub_3_0= ruleOutAnd ) )
            	    {
            	    // InternalGoatComponentsParser.g:3800:4: ()
            	    // InternalGoatComponentsParser.g:3801:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOutOrAccess().getOrSubAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOutOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:3811:4: ( (lv_sub_3_0= ruleOutAnd ) )
            	    // InternalGoatComponentsParser.g:3812:5: (lv_sub_3_0= ruleOutAnd )
            	    {
            	    // InternalGoatComponentsParser.g:3812:5: (lv_sub_3_0= ruleOutAnd )
            	    // InternalGoatComponentsParser.g:3813:6: lv_sub_3_0= ruleOutAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOutOrAccess().getSubOutAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
            	    break loop58;
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
    // InternalGoatComponentsParser.g:3835:1: entryRuleOutAnd returns [EObject current=null] : iv_ruleOutAnd= ruleOutAnd EOF ;
    public final EObject entryRuleOutAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutAnd = null;


        try {
            // InternalGoatComponentsParser.g:3835:47: (iv_ruleOutAnd= ruleOutAnd EOF )
            // InternalGoatComponentsParser.g:3836:2: iv_ruleOutAnd= ruleOutAnd EOF
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
    // InternalGoatComponentsParser.g:3842:1: ruleOutAnd returns [EObject current=null] : (this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )* ) ;
    public final EObject ruleOutAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OutEqualityComparison_0 = null;

        EObject lv_sub_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:3848:2: ( (this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )* ) )
            // InternalGoatComponentsParser.g:3849:2: (this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )* )
            {
            // InternalGoatComponentsParser.g:3849:2: (this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )* )
            // InternalGoatComponentsParser.g:3850:3: this_OutEqualityComparison_0= ruleOutEqualityComparison ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getOutAndAccess().getOutEqualityComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_OutEqualityComparison_0=ruleOutEqualityComparison();

            state._fsp--;


            			current = this_OutEqualityComparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGoatComponentsParser.g:3858:3: ( () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==AmpersandAmpersand) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3859:4: () otherlv_2= AmpersandAmpersand ( (lv_sub_3_0= ruleOutEqualityComparison ) )
            	    {
            	    // InternalGoatComponentsParser.g:3859:4: ()
            	    // InternalGoatComponentsParser.g:3860:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOutAndAccess().getAndSubAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOutAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalGoatComponentsParser.g:3870:4: ( (lv_sub_3_0= ruleOutEqualityComparison ) )
            	    // InternalGoatComponentsParser.g:3871:5: (lv_sub_3_0= ruleOutEqualityComparison )
            	    {
            	    // InternalGoatComponentsParser.g:3871:5: (lv_sub_3_0= ruleOutEqualityComparison )
            	    // InternalGoatComponentsParser.g:3872:6: lv_sub_3_0= ruleOutEqualityComparison
            	    {

            	    						newCompositeNode(grammarAccess.getOutAndAccess().getSubOutEqualityComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
    // $ANTLR end "ruleOutAnd"


    // $ANTLR start "entryRuleOutEqualityComparison"
    // InternalGoatComponentsParser.g:3894:1: entryRuleOutEqualityComparison returns [EObject current=null] : iv_ruleOutEqualityComparison= ruleOutEqualityComparison EOF ;
    public final EObject entryRuleOutEqualityComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutEqualityComparison = null;


        try {
            // InternalGoatComponentsParser.g:3894:62: (iv_ruleOutEqualityComparison= ruleOutEqualityComparison EOF )
            // InternalGoatComponentsParser.g:3895:2: iv_ruleOutEqualityComparison= ruleOutEqualityComparison EOF
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
    // InternalGoatComponentsParser.g:3901:1: ruleOutEqualityComparison returns [EObject current=null] : (this_OutPrimary_0= ruleOutPrimary | (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) ) ) ;
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
            // InternalGoatComponentsParser.g:3907:2: ( (this_OutPrimary_0= ruleOutPrimary | (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) ) ) )
            // InternalGoatComponentsParser.g:3908:2: (this_OutPrimary_0= ruleOutPrimary | (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) ) )
            {
            // InternalGoatComponentsParser.g:3908:2: (this_OutPrimary_0= ruleOutPrimary | (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) ) )
            int alt62=2;
            switch ( input.LA(1) ) {
            case ExclamationMark:
            case LeftParenthesis:
                {
                alt62=1;
                }
                break;
            case True:
                {
                int LA62_2 = input.LA(2);

                if ( (LA62_2==ExclamationMarkEqualsSign||(LA62_2>=LessThanSignEqualsSign && LA62_2<=GreaterThanSignEqualsSign)||LA62_2==In||LA62_2==LessThanSign||LA62_2==GreaterThanSign) ) {
                    alt62=2;
                }
                else if ( (LA62_2==EOF||LA62_2==AmpersandAmpersand||LA62_2==VerticalLineVerticalLine||LA62_2==RightParenthesis) ) {
                    alt62=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 2, input);

                    throw nvae;
                }
                }
                break;
            case False:
                {
                int LA62_3 = input.LA(2);

                if ( (LA62_3==ExclamationMarkEqualsSign||(LA62_3>=LessThanSignEqualsSign && LA62_3<=GreaterThanSignEqualsSign)||LA62_3==In||LA62_3==LessThanSign||LA62_3==GreaterThanSign) ) {
                    alt62=2;
                }
                else if ( (LA62_3==EOF||LA62_3==AmpersandAmpersand||LA62_3==VerticalLineVerticalLine||LA62_3==RightParenthesis) ) {
                    alt62=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 3, input);

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
                alt62=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalGoatComponentsParser.g:3909:3: this_OutPrimary_0= ruleOutPrimary
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
                    // InternalGoatComponentsParser.g:3918:3: (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:3918:3: (this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) ) )
                    // InternalGoatComponentsParser.g:3919:4: this_OutAtomicOrRec_1= ruleOutAtomicOrRec ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) )
                    {

                    				newCompositeNode(grammarAccess.getOutEqualityComparisonAccess().getOutAtomicOrRecParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_55);
                    this_OutAtomicOrRec_1=ruleOutAtomicOrRec();

                    state._fsp--;


                    				current = this_OutAtomicOrRec_1;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalGoatComponentsParser.g:3927:4: ( ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) ) | ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ExclamationMarkEqualsSign||(LA61_0>=LessThanSignEqualsSign && LA61_0<=GreaterThanSignEqualsSign)||LA61_0==LessThanSign||LA61_0==GreaterThanSign) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==In) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalGoatComponentsParser.g:3928:5: ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) )
                            {
                            // InternalGoatComponentsParser.g:3928:5: ( () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) ) )
                            // InternalGoatComponentsParser.g:3929:6: () ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) ) ( (lv_right_4_0= ruleOutAtomicOrRec ) )
                            {
                            // InternalGoatComponentsParser.g:3929:6: ()
                            // InternalGoatComponentsParser.g:3930:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getOutEqualityComparisonAccess().getOutEqualityComparisonLeftAction_1_1_0_0(),
                            								current);
                            						

                            }

                            // InternalGoatComponentsParser.g:3936:6: ( ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) ) )
                            // InternalGoatComponentsParser.g:3937:7: ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) )
                            {
                            // InternalGoatComponentsParser.g:3937:7: ( (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign ) )
                            // InternalGoatComponentsParser.g:3938:8: (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign )
                            {
                            // InternalGoatComponentsParser.g:3938:8: (lv_op_3_1= EqualsSignEqualsSign | lv_op_3_2= ExclamationMarkEqualsSign | lv_op_3_3= GreaterThanSignEqualsSign | lv_op_3_4= LessThanSignEqualsSign | lv_op_3_5= GreaterThanSign | lv_op_3_6= LessThanSign )
                            int alt60=6;
                            switch ( input.LA(1) ) {
                            case EqualsSignEqualsSign:
                                {
                                alt60=1;
                                }
                                break;
                            case ExclamationMarkEqualsSign:
                                {
                                alt60=2;
                                }
                                break;
                            case GreaterThanSignEqualsSign:
                                {
                                alt60=3;
                                }
                                break;
                            case LessThanSignEqualsSign:
                                {
                                alt60=4;
                                }
                                break;
                            case GreaterThanSign:
                                {
                                alt60=5;
                                }
                                break;
                            case LessThanSign:
                                {
                                alt60=6;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 60, 0, input);

                                throw nvae;
                            }

                            switch (alt60) {
                                case 1 :
                                    // InternalGoatComponentsParser.g:3939:9: lv_op_3_1= EqualsSignEqualsSign
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
                                    // InternalGoatComponentsParser.g:3950:9: lv_op_3_2= ExclamationMarkEqualsSign
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
                                    // InternalGoatComponentsParser.g:3961:9: lv_op_3_3= GreaterThanSignEqualsSign
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
                                    // InternalGoatComponentsParser.g:3972:9: lv_op_3_4= LessThanSignEqualsSign
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
                                    // InternalGoatComponentsParser.g:3983:9: lv_op_3_5= GreaterThanSign
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
                                    // InternalGoatComponentsParser.g:3994:9: lv_op_3_6= LessThanSign
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

                            // InternalGoatComponentsParser.g:4007:6: ( (lv_right_4_0= ruleOutAtomicOrRec ) )
                            // InternalGoatComponentsParser.g:4008:7: (lv_right_4_0= ruleOutAtomicOrRec )
                            {
                            // InternalGoatComponentsParser.g:4008:7: (lv_right_4_0= ruleOutAtomicOrRec )
                            // InternalGoatComponentsParser.g:4009:8: lv_right_4_0= ruleOutAtomicOrRec
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
                            // InternalGoatComponentsParser.g:4028:5: ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) )
                            {
                            // InternalGoatComponentsParser.g:4028:5: ( () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) ) )
                            // InternalGoatComponentsParser.g:4029:6: () otherlv_6= In ( (lv_tuple_7_0= ruleOutAtomicOrRec ) )
                            {
                            // InternalGoatComponentsParser.g:4029:6: ()
                            // InternalGoatComponentsParser.g:4030:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getOutEqualityComparisonAccess().getContainmentExpressionElemAction_1_1_1_0(),
                            								current);
                            						

                            }

                            otherlv_6=(Token)match(input,In,FOLLOW_15); 

                            						newLeafNode(otherlv_6, grammarAccess.getOutEqualityComparisonAccess().getInKeyword_1_1_1_1());
                            					
                            // InternalGoatComponentsParser.g:4040:6: ( (lv_tuple_7_0= ruleOutAtomicOrRec ) )
                            // InternalGoatComponentsParser.g:4041:7: (lv_tuple_7_0= ruleOutAtomicOrRec )
                            {
                            // InternalGoatComponentsParser.g:4041:7: (lv_tuple_7_0= ruleOutAtomicOrRec )
                            // InternalGoatComponentsParser.g:4042:8: lv_tuple_7_0= ruleOutAtomicOrRec
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
    // InternalGoatComponentsParser.g:4066:1: entryRuleOutPrimary returns [EObject current=null] : iv_ruleOutPrimary= ruleOutPrimary EOF ;
    public final EObject entryRuleOutPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPrimary = null;


        try {
            // InternalGoatComponentsParser.g:4066:51: (iv_ruleOutPrimary= ruleOutPrimary EOF )
            // InternalGoatComponentsParser.g:4067:2: iv_ruleOutPrimary= ruleOutPrimary EOF
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
    // InternalGoatComponentsParser.g:4073:1: ruleOutPrimary returns [EObject current=null] : ( ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) ) | (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis ) | ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) ) ) ;
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
            // InternalGoatComponentsParser.g:4079:2: ( ( ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) ) | (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis ) | ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) ) ) )
            // InternalGoatComponentsParser.g:4080:2: ( ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) ) | (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis ) | ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) ) )
            {
            // InternalGoatComponentsParser.g:4080:2: ( ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) ) | (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis ) | ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case ExclamationMark:
                {
                alt65=1;
                }
                break;
            case LeftParenthesis:
                {
                alt65=2;
                }
                break;
            case False:
            case True:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalGoatComponentsParser.g:4081:3: ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:4081:3: ( () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) ) )
                    // InternalGoatComponentsParser.g:4082:4: () otherlv_1= ExclamationMark ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) )
                    {
                    // InternalGoatComponentsParser.g:4082:4: ()
                    // InternalGoatComponentsParser.g:4083:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutPrimaryAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutPrimaryAccess().getExclamationMarkKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:4093:4: ( ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) ) )
                    // InternalGoatComponentsParser.g:4094:5: ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) )
                    {
                    // InternalGoatComponentsParser.g:4094:5: ( (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE ) )
                    // InternalGoatComponentsParser.g:4095:6: (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE )
                    {
                    // InternalGoatComponentsParser.g:4095:6: (lv_expression_2_1= ruleOutPrimary | lv_expression_2_2= ruleOCE )
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

                        if ( (LA63_2==EOF||LA63_2==AmpersandAmpersand||LA63_2==VerticalLineVerticalLine||LA63_2==RightParenthesis) ) {
                            alt63=1;
                        }
                        else if ( (LA63_2==In) ) {
                            alt63=2;
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

                        if ( (LA63_3==In) ) {
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
                            // InternalGoatComponentsParser.g:4096:7: lv_expression_2_1= ruleOutPrimary
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
                            // InternalGoatComponentsParser.g:4112:7: lv_expression_2_2= ruleOCE
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
                    // InternalGoatComponentsParser.g:4132:3: (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:4132:3: (otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis )
                    // InternalGoatComponentsParser.g:4133:4: otherlv_3= LeftParenthesis this_OutputPredicate_4= ruleOutputPredicate otherlv_5= RightParenthesis
                    {
                    otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getOutPrimaryAccess().getOutputPredicateParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_9);
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
                    // InternalGoatComponentsParser.g:4151:3: ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:4151:3: ( () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:4152:4: () ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:4152:4: ()
                    // InternalGoatComponentsParser.g:4153:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutPrimaryAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4159:4: ( ( (lv_value_7_1= True | lv_value_7_2= False ) ) )
                    // InternalGoatComponentsParser.g:4160:5: ( (lv_value_7_1= True | lv_value_7_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:4160:5: ( (lv_value_7_1= True | lv_value_7_2= False ) )
                    // InternalGoatComponentsParser.g:4161:6: (lv_value_7_1= True | lv_value_7_2= False )
                    {
                    // InternalGoatComponentsParser.g:4161:6: (lv_value_7_1= True | lv_value_7_2= False )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==True) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==False) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4162:7: lv_value_7_1= True
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
                            // InternalGoatComponentsParser.g:4173:7: lv_value_7_2= False
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
    // InternalGoatComponentsParser.g:4191:1: entryRuleOCE returns [EObject current=null] : iv_ruleOCE= ruleOCE EOF ;
    public final EObject entryRuleOCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCE = null;


        try {
            // InternalGoatComponentsParser.g:4191:44: (iv_ruleOCE= ruleOCE EOF )
            // InternalGoatComponentsParser.g:4192:2: iv_ruleOCE= ruleOCE EOF
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
    // InternalGoatComponentsParser.g:4198:1: ruleOCE returns [EObject current=null] : ( () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) ) ) ;
    public final EObject ruleOCE() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_elem_1_0 = null;

        EObject lv_tuple_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4204:2: ( ( () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) ) ) )
            // InternalGoatComponentsParser.g:4205:2: ( () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) ) )
            {
            // InternalGoatComponentsParser.g:4205:2: ( () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) ) )
            // InternalGoatComponentsParser.g:4206:3: () ( (lv_elem_1_0= ruleOutAtomicOrRec ) ) otherlv_2= In ( (lv_tuple_3_0= ruleOutAtomicOrRec ) )
            {
            // InternalGoatComponentsParser.g:4206:3: ()
            // InternalGoatComponentsParser.g:4207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOCEAccess().getContainmentExpressionAction_0(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:4213:3: ( (lv_elem_1_0= ruleOutAtomicOrRec ) )
            // InternalGoatComponentsParser.g:4214:4: (lv_elem_1_0= ruleOutAtomicOrRec )
            {
            // InternalGoatComponentsParser.g:4214:4: (lv_elem_1_0= ruleOutAtomicOrRec )
            // InternalGoatComponentsParser.g:4215:5: lv_elem_1_0= ruleOutAtomicOrRec
            {

            					newCompositeNode(grammarAccess.getOCEAccess().getElemOutAtomicOrRecParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_56);
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
            		
            // InternalGoatComponentsParser.g:4236:3: ( (lv_tuple_3_0= ruleOutAtomicOrRec ) )
            // InternalGoatComponentsParser.g:4237:4: (lv_tuple_3_0= ruleOutAtomicOrRec )
            {
            // InternalGoatComponentsParser.g:4237:4: (lv_tuple_3_0= ruleOutAtomicOrRec )
            // InternalGoatComponentsParser.g:4238:5: lv_tuple_3_0= ruleOutAtomicOrRec
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
    // InternalGoatComponentsParser.g:4259:1: entryRuleOutAtomicOrRec returns [EObject current=null] : iv_ruleOutAtomicOrRec= ruleOutAtomicOrRec EOF ;
    public final EObject entryRuleOutAtomicOrRec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutAtomicOrRec = null;


        try {
            // InternalGoatComponentsParser.g:4259:55: (iv_ruleOutAtomicOrRec= ruleOutAtomicOrRec EOF )
            // InternalGoatComponentsParser.g:4260:2: iv_ruleOutAtomicOrRec= ruleOutAtomicOrRec EOF
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
    // InternalGoatComponentsParser.g:4266:1: ruleOutAtomicOrRec returns [EObject current=null] : ( ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | this_OutAtomic_4= ruleOutAtomic ) ;
    public final EObject ruleOutAtomicOrRec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_attribute_3_0=null;
        EObject this_OutAtomic_4 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4272:2: ( ( ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | this_OutAtomic_4= ruleOutAtomic ) )
            // InternalGoatComponentsParser.g:4273:2: ( ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | this_OutAtomic_4= ruleOutAtomic )
            {
            // InternalGoatComponentsParser.g:4273:2: ( ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) ) | this_OutAtomic_4= ruleOutAtomic )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Receiver) ) {
                alt66=1;
            }
            else if ( (LA66_0==Length||LA66_0==False||LA66_0==Comp||LA66_0==Proc||LA66_0==True||LA66_0==LeftSquareBracket||(LA66_0>=RULE_ID && LA66_0<=RULE_STRING)) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalGoatComponentsParser.g:4274:3: ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:4274:3: ( () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:4275:4: () otherlv_1= Receiver otherlv_2= FullStop ( (lv_attribute_3_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:4275:4: ()
                    // InternalGoatComponentsParser.g:4276:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicOrRecAccess().getRecAttributeRefAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Receiver,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutAtomicOrRecAccess().getReceiverKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getOutAtomicOrRecAccess().getFullStopKeyword_0_2());
                    			
                    // InternalGoatComponentsParser.g:4290:4: ( (lv_attribute_3_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:4291:5: (lv_attribute_3_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:4291:5: (lv_attribute_3_0= RULE_ID )
                    // InternalGoatComponentsParser.g:4292:6: lv_attribute_3_0= RULE_ID
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
                    // InternalGoatComponentsParser.g:4310:3: this_OutAtomic_4= ruleOutAtomic
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
    // InternalGoatComponentsParser.g:4322:1: entryRuleOutAtomic returns [EObject current=null] : iv_ruleOutAtomic= ruleOutAtomic EOF ;
    public final EObject entryRuleOutAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutAtomic = null;


        try {
            // InternalGoatComponentsParser.g:4322:50: (iv_ruleOutAtomic= ruleOutAtomic EOF )
            // InternalGoatComponentsParser.g:4323:2: iv_ruleOutAtomic= ruleOutAtomic EOF
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
    // InternalGoatComponentsParser.g:4329:1: ruleOutAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? ) ) ;
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
            // InternalGoatComponentsParser.g:4335:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? ) ) )
            // InternalGoatComponentsParser.g:4336:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? ) )
            {
            // InternalGoatComponentsParser.g:4336:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt69=1;
                }
                break;
            case RULE_STRING:
                {
                alt69=2;
                }
                break;
            case False:
            case True:
                {
                alt69=3;
                }
                break;
            case Length:
            case Comp:
            case Proc:
            case LeftSquareBracket:
            case RULE_ID:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalGoatComponentsParser.g:4337:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalGoatComponentsParser.g:4337:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalGoatComponentsParser.g:4338:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalGoatComponentsParser.g:4338:4: ()
                    // InternalGoatComponentsParser.g:4339:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4345:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalGoatComponentsParser.g:4346:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalGoatComponentsParser.g:4346:5: (lv_value_1_0= RULE_INT )
                    // InternalGoatComponentsParser.g:4347:6: lv_value_1_0= RULE_INT
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
                    // InternalGoatComponentsParser.g:4365:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalGoatComponentsParser.g:4365:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalGoatComponentsParser.g:4366:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalGoatComponentsParser.g:4366:4: ()
                    // InternalGoatComponentsParser.g:4367:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4373:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalGoatComponentsParser.g:4374:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalGoatComponentsParser.g:4374:5: (lv_value_3_0= RULE_STRING )
                    // InternalGoatComponentsParser.g:4375:6: lv_value_3_0= RULE_STRING
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
                    // InternalGoatComponentsParser.g:4393:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    {
                    // InternalGoatComponentsParser.g:4393:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    // InternalGoatComponentsParser.g:4394:4: () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    {
                    // InternalGoatComponentsParser.g:4394:4: ()
                    // InternalGoatComponentsParser.g:4395:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4401:4: ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    // InternalGoatComponentsParser.g:4402:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    {
                    // InternalGoatComponentsParser.g:4402:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    // InternalGoatComponentsParser.g:4403:6: (lv_value_5_1= True | lv_value_5_2= False )
                    {
                    // InternalGoatComponentsParser.g:4403:6: (lv_value_5_1= True | lv_value_5_2= False )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==True) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==False) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4404:7: lv_value_5_1= True
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
                            // InternalGoatComponentsParser.g:4415:7: lv_value_5_2= False
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
                    // InternalGoatComponentsParser.g:4430:3: (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? )
                    {
                    // InternalGoatComponentsParser.g:4430:3: (this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )? )
                    // InternalGoatComponentsParser.g:4431:4: this_OutAtomicIndexable_6= ruleOutAtomicIndexable (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )?
                    {

                    				newCompositeNode(grammarAccess.getOutAtomicAccess().getOutAtomicIndexableParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_51);
                    this_OutAtomicIndexable_6=ruleOutAtomicIndexable();

                    state._fsp--;


                    				current = this_OutAtomicIndexable_6;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalGoatComponentsParser.g:4439:4: (otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==LeftSquareBracket) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4440:5: otherlv_7= LeftSquareBracket () ( (lv_idx_9_0= ruleOutAtomic ) ) otherlv_10= RightSquareBracket
                            {
                            otherlv_7=(Token)match(input,LeftSquareBracket,FOLLOW_15); 

                            					newLeafNode(otherlv_7, grammarAccess.getOutAtomicAccess().getLeftSquareBracketKeyword_3_1_0());
                            				
                            // InternalGoatComponentsParser.g:4444:5: ()
                            // InternalGoatComponentsParser.g:4445:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getOutAtomicAccess().getTupleGetElemAction_3_1_1(),
                            							current);
                            					

                            }

                            // InternalGoatComponentsParser.g:4451:5: ( (lv_idx_9_0= ruleOutAtomic ) )
                            // InternalGoatComponentsParser.g:4452:6: (lv_idx_9_0= ruleOutAtomic )
                            {
                            // InternalGoatComponentsParser.g:4452:6: (lv_idx_9_0= ruleOutAtomic )
                            // InternalGoatComponentsParser.g:4453:7: lv_idx_9_0= ruleOutAtomic
                            {

                            							newCompositeNode(grammarAccess.getOutAtomicAccess().getIdxOutAtomicParserRuleCall_3_1_2_0());
                            						
                            pushFollow(FOLLOW_52);
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
    // InternalGoatComponentsParser.g:4480:1: entryRuleOutAtomicIndexable returns [EObject current=null] : iv_ruleOutAtomicIndexable= ruleOutAtomicIndexable EOF ;
    public final EObject entryRuleOutAtomicIndexable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutAtomicIndexable = null;


        try {
            // InternalGoatComponentsParser.g:4480:59: (iv_ruleOutAtomicIndexable= ruleOutAtomicIndexable EOF )
            // InternalGoatComponentsParser.g:4481:2: iv_ruleOutAtomicIndexable= ruleOutAtomicIndexable EOF
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
    // InternalGoatComponentsParser.g:4487:1: ruleOutAtomicIndexable returns [EObject current=null] : ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis ) | ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) ) | ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) ) ) ;
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
            // InternalGoatComponentsParser.g:4493:2: ( ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis ) | ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) ) | ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) ) ) )
            // InternalGoatComponentsParser.g:4494:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis ) | ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) ) | ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) ) )
            {
            // InternalGoatComponentsParser.g:4494:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket ) | ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis ) | ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis ) | ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) ) | ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) ) )
            int alt74=5;
            switch ( input.LA(1) ) {
            case LeftSquareBracket:
                {
                alt74=1;
                }
                break;
            case Length:
                {
                alt74=2;
                }
                break;
            case RULE_ID:
                {
                alt74=3;
                }
                break;
            case Proc:
                {
                alt74=4;
                }
                break;
            case Comp:
                {
                alt74=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalGoatComponentsParser.g:4495:3: ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket )
                    {
                    // InternalGoatComponentsParser.g:4495:3: ( () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket )
                    // InternalGoatComponentsParser.g:4496:4: () otherlv_1= LeftSquareBracket ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )? otherlv_5= RightSquareBracket
                    {
                    // InternalGoatComponentsParser.g:4496:4: ()
                    // InternalGoatComponentsParser.g:4497:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getTupleConstantAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_57); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutAtomicIndexableAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalGoatComponentsParser.g:4507:4: ( ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )* )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==Length||LA71_0==False||LA71_0==Comp||LA71_0==Proc||LA71_0==True||LA71_0==LeftSquareBracket||(LA71_0>=RULE_ID && LA71_0<=RULE_STRING)) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4508:5: ( (lv_elem_2_0= ruleOutAtomic ) ) (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )*
                            {
                            // InternalGoatComponentsParser.g:4508:5: ( (lv_elem_2_0= ruleOutAtomic ) )
                            // InternalGoatComponentsParser.g:4509:6: (lv_elem_2_0= ruleOutAtomic )
                            {
                            // InternalGoatComponentsParser.g:4509:6: (lv_elem_2_0= ruleOutAtomic )
                            // InternalGoatComponentsParser.g:4510:7: lv_elem_2_0= ruleOutAtomic
                            {

                            							newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getElemOutAtomicParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_32);
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

                            // InternalGoatComponentsParser.g:4527:5: (otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==Comma) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:4528:6: otherlv_3= Comma ( (lv_elem_4_0= ruleOutAtomic ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_15); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getOutAtomicIndexableAccess().getCommaKeyword_0_2_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:4532:6: ( (lv_elem_4_0= ruleOutAtomic ) )
                            	    // InternalGoatComponentsParser.g:4533:7: (lv_elem_4_0= ruleOutAtomic )
                            	    {
                            	    // InternalGoatComponentsParser.g:4533:7: (lv_elem_4_0= ruleOutAtomic )
                            	    // InternalGoatComponentsParser.g:4534:8: lv_elem_4_0= ruleOutAtomic
                            	    {

                            	    								newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getElemOutAtomicParserRuleCall_0_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_32);
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
                            	    break loop70;
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
                    // InternalGoatComponentsParser.g:4559:3: ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:4559:3: ( () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis )
                    // InternalGoatComponentsParser.g:4560:4: () otherlv_7= Length otherlv_8= LeftParenthesis ( (lv_elem_9_0= ruleOutAtomic ) ) otherlv_10= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:4560:4: ()
                    // InternalGoatComponentsParser.g:4561:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getTupleLengthAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,Length,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getOutAtomicIndexableAccess().getLengthKeyword_1_1());
                    			
                    otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getOutAtomicIndexableAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalGoatComponentsParser.g:4575:4: ( (lv_elem_9_0= ruleOutAtomic ) )
                    // InternalGoatComponentsParser.g:4576:5: (lv_elem_9_0= ruleOutAtomic )
                    {
                    // InternalGoatComponentsParser.g:4576:5: (lv_elem_9_0= ruleOutAtomic )
                    // InternalGoatComponentsParser.g:4577:6: lv_elem_9_0= ruleOutAtomic
                    {

                    						newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getElemOutAtomicParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_9);
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
                    // InternalGoatComponentsParser.g:4600:3: ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis )
                    {
                    // InternalGoatComponentsParser.g:4600:3: ( () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis )
                    // InternalGoatComponentsParser.g:4601:4: () ( (otherlv_12= RULE_ID ) ) otherlv_13= LeftParenthesis ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )? otherlv_17= RightParenthesis
                    {
                    // InternalGoatComponentsParser.g:4601:4: ()
                    // InternalGoatComponentsParser.g:4602:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getFunctionCallAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGoatComponentsParser.g:4608:4: ( (otherlv_12= RULE_ID ) )
                    // InternalGoatComponentsParser.g:4609:5: (otherlv_12= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:4609:5: (otherlv_12= RULE_ID )
                    // InternalGoatComponentsParser.g:4610:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutAtomicIndexableRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_12, grammarAccess.getOutAtomicIndexableAccess().getFunctionFuncDefinitionCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,LeftParenthesis,FOLLOW_58); 

                    				newLeafNode(otherlv_13, grammarAccess.getOutAtomicIndexableAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalGoatComponentsParser.g:4625:4: ( ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )* )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==Length||LA73_0==False||LA73_0==Comp||LA73_0==Proc||LA73_0==True||LA73_0==LeftSquareBracket||(LA73_0>=RULE_ID && LA73_0<=RULE_STRING)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalGoatComponentsParser.g:4626:5: ( (lv_params_14_0= ruleOutAtomic ) ) (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )*
                            {
                            // InternalGoatComponentsParser.g:4626:5: ( (lv_params_14_0= ruleOutAtomic ) )
                            // InternalGoatComponentsParser.g:4627:6: (lv_params_14_0= ruleOutAtomic )
                            {
                            // InternalGoatComponentsParser.g:4627:6: (lv_params_14_0= ruleOutAtomic )
                            // InternalGoatComponentsParser.g:4628:7: lv_params_14_0= ruleOutAtomic
                            {

                            							newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getParamsOutAtomicParserRuleCall_2_3_0_0());
                            						
                            pushFollow(FOLLOW_40);
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

                            // InternalGoatComponentsParser.g:4645:5: (otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==Comma) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // InternalGoatComponentsParser.g:4646:6: otherlv_15= Comma ( (lv_params_16_0= ruleOutAtomic ) )
                            	    {
                            	    otherlv_15=(Token)match(input,Comma,FOLLOW_15); 

                            	    						newLeafNode(otherlv_15, grammarAccess.getOutAtomicIndexableAccess().getCommaKeyword_2_3_1_0());
                            	    					
                            	    // InternalGoatComponentsParser.g:4650:6: ( (lv_params_16_0= ruleOutAtomic ) )
                            	    // InternalGoatComponentsParser.g:4651:7: (lv_params_16_0= ruleOutAtomic )
                            	    {
                            	    // InternalGoatComponentsParser.g:4651:7: (lv_params_16_0= ruleOutAtomic )
                            	    // InternalGoatComponentsParser.g:4652:8: lv_params_16_0= ruleOutAtomic
                            	    {

                            	    								newCompositeNode(grammarAccess.getOutAtomicIndexableAccess().getParamsOutAtomicParserRuleCall_2_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_40);
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
                            	    break loop72;
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
                    // InternalGoatComponentsParser.g:4677:3: ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:4677:3: ( () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:4678:4: () otherlv_19= Proc otherlv_20= FullStop ( (lv_attribute_21_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:4678:4: ()
                    // InternalGoatComponentsParser.g:4679:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getLocalAttributeRefAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_19=(Token)match(input,Proc,FOLLOW_33); 

                    				newLeafNode(otherlv_19, grammarAccess.getOutAtomicIndexableAccess().getProcKeyword_3_1());
                    			
                    otherlv_20=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getOutAtomicIndexableAccess().getFullStopKeyword_3_2());
                    			
                    // InternalGoatComponentsParser.g:4693:4: ( (lv_attribute_21_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:4694:5: (lv_attribute_21_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:4694:5: (lv_attribute_21_0= RULE_ID )
                    // InternalGoatComponentsParser.g:4695:6: lv_attribute_21_0= RULE_ID
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
                    // InternalGoatComponentsParser.g:4713:3: ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) )
                    {
                    // InternalGoatComponentsParser.g:4713:3: ( () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) ) )
                    // InternalGoatComponentsParser.g:4714:4: () otherlv_23= Comp otherlv_24= FullStop ( (lv_attribute_25_0= RULE_ID ) )
                    {
                    // InternalGoatComponentsParser.g:4714:4: ()
                    // InternalGoatComponentsParser.g:4715:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutAtomicIndexableAccess().getComponentAttributeRefAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_23=(Token)match(input,Comp,FOLLOW_33); 

                    				newLeafNode(otherlv_23, grammarAccess.getOutAtomicIndexableAccess().getCompKeyword_4_1());
                    			
                    otherlv_24=(Token)match(input,FullStop,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getOutAtomicIndexableAccess().getFullStopKeyword_4_2());
                    			
                    // InternalGoatComponentsParser.g:4729:4: ( (lv_attribute_25_0= RULE_ID ) )
                    // InternalGoatComponentsParser.g:4730:5: (lv_attribute_25_0= RULE_ID )
                    {
                    // InternalGoatComponentsParser.g:4730:5: (lv_attribute_25_0= RULE_ID )
                    // InternalGoatComponentsParser.g:4731:6: lv_attribute_25_0= RULE_ID
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
    // InternalGoatComponentsParser.g:4752:1: entryRuleFuncParam returns [EObject current=null] : iv_ruleFuncParam= ruleFuncParam EOF ;
    public final EObject entryRuleFuncParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncParam = null;


        try {
            // InternalGoatComponentsParser.g:4752:50: (iv_ruleFuncParam= ruleFuncParam EOF )
            // InternalGoatComponentsParser.g:4753:2: iv_ruleFuncParam= ruleFuncParam EOF
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
    // InternalGoatComponentsParser.g:4759:1: ruleFuncParam returns [EObject current=null] : ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFuncParam() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4765:2: ( ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGoatComponentsParser.g:4766:2: ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGoatComponentsParser.g:4766:2: ( ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGoatComponentsParser.g:4767:3: ( (lv_type_0_0= RULE_TYPE ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:4767:3: ( (lv_type_0_0= RULE_TYPE ) )
            // InternalGoatComponentsParser.g:4768:4: (lv_type_0_0= RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:4768:4: (lv_type_0_0= RULE_TYPE )
            // InternalGoatComponentsParser.g:4769:5: lv_type_0_0= RULE_TYPE
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

            // InternalGoatComponentsParser.g:4785:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:4786:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:4786:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:4787:5: lv_name_1_0= RULE_ID
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
    // InternalGoatComponentsParser.g:4807:1: entryRuleFuncDefinition returns [EObject current=null] : iv_ruleFuncDefinition= ruleFuncDefinition EOF ;
    public final EObject entryRuleFuncDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDefinition = null;


        try {
            // InternalGoatComponentsParser.g:4807:55: (iv_ruleFuncDefinition= ruleFuncDefinition EOF )
            // InternalGoatComponentsParser.g:4808:2: iv_ruleFuncDefinition= ruleFuncDefinition EOF
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
    // InternalGoatComponentsParser.g:4814:1: ruleFuncDefinition returns [EObject current=null] : (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) ) ;
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
            // InternalGoatComponentsParser.g:4820:2: ( (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) ) )
            // InternalGoatComponentsParser.g:4821:2: (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) )
            {
            // InternalGoatComponentsParser.g:4821:2: (otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) ) )
            // InternalGoatComponentsParser.g:4822:3: otherlv_0= Function ( (lv_type_1_0= RULE_TYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )? otherlv_7= RightParenthesis ( (lv_blk_8_0= ruleFuncBlock ) )
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncDefinitionAccess().getFunctionKeyword_0());
            		
            // InternalGoatComponentsParser.g:4826:3: ( (lv_type_1_0= RULE_TYPE ) )
            // InternalGoatComponentsParser.g:4827:4: (lv_type_1_0= RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:4827:4: (lv_type_1_0= RULE_TYPE )
            // InternalGoatComponentsParser.g:4828:5: lv_type_1_0= RULE_TYPE
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

            // InternalGoatComponentsParser.g:4844:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:4845:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:4845:4: (lv_name_2_0= RULE_ID )
            // InternalGoatComponentsParser.g:4846:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:4866:3: ( ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_TYPE) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalGoatComponentsParser.g:4867:4: ( (lv_params_4_0= ruleFuncParam ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )*
                    {
                    // InternalGoatComponentsParser.g:4867:4: ( (lv_params_4_0= ruleFuncParam ) )
                    // InternalGoatComponentsParser.g:4868:5: (lv_params_4_0= ruleFuncParam )
                    {
                    // InternalGoatComponentsParser.g:4868:5: (lv_params_4_0= ruleFuncParam )
                    // InternalGoatComponentsParser.g:4869:6: lv_params_4_0= ruleFuncParam
                    {

                    						newCompositeNode(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalGoatComponentsParser.g:4886:4: (otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==Comma) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalGoatComponentsParser.g:4887:5: otherlv_5= Comma ( (lv_params_6_0= ruleFuncParam ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_59); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFuncDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGoatComponentsParser.g:4891:5: ( (lv_params_6_0= ruleFuncParam ) )
                    	    // InternalGoatComponentsParser.g:4892:6: (lv_params_6_0= ruleFuncParam )
                    	    {
                    	    // InternalGoatComponentsParser.g:4892:6: (lv_params_6_0= ruleFuncParam )
                    	    // InternalGoatComponentsParser.g:4893:7: lv_params_6_0= ruleFuncParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getFuncDefinitionAccess().getRightParenthesisKeyword_5());
            		
            // InternalGoatComponentsParser.g:4916:3: ( (lv_blk_8_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:4917:4: (lv_blk_8_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:4917:4: (lv_blk_8_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:4918:5: lv_blk_8_0= ruleFuncBlock
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
    // InternalGoatComponentsParser.g:4939:1: entryRuleFuncBlock returns [EObject current=null] : iv_ruleFuncBlock= ruleFuncBlock EOF ;
    public final EObject entryRuleFuncBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncBlock = null;


        try {
            // InternalGoatComponentsParser.g:4939:50: (iv_ruleFuncBlock= ruleFuncBlock EOF )
            // InternalGoatComponentsParser.g:4940:2: iv_ruleFuncBlock= ruleFuncBlock EOF
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
    // InternalGoatComponentsParser.g:4946:1: ruleFuncBlock returns [EObject current=null] : (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleFuncBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:4952:2: ( (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:4953:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:4953:2: (otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket )
            // InternalGoatComponentsParser.g:4954:3: otherlv_0= LeftCurlyBracket () ( (lv_statements_2_0= ruleFuncStatement ) )* otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_61); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatComponentsParser.g:4958:3: ()
            // InternalGoatComponentsParser.g:4959:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuncBlockAccess().getFuncBlockAction_1(),
            					current);
            			

            }

            // InternalGoatComponentsParser.g:4965:3: ( (lv_statements_2_0= ruleFuncStatement ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==Return||LA77_0==While||LA77_0==Var||LA77_0==If||LA77_0==RULE_ID) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:4966:4: (lv_statements_2_0= ruleFuncStatement )
            	    {
            	    // InternalGoatComponentsParser.g:4966:4: (lv_statements_2_0= ruleFuncStatement )
            	    // InternalGoatComponentsParser.g:4967:5: lv_statements_2_0= ruleFuncStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFuncBlockAccess().getStatementsFuncStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_61);
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
            	    break loop77;
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
    // InternalGoatComponentsParser.g:4992:1: entryRuleFuncStatement returns [EObject current=null] : iv_ruleFuncStatement= ruleFuncStatement EOF ;
    public final EObject entryRuleFuncStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncStatement = null;


        try {
            // InternalGoatComponentsParser.g:4992:54: (iv_ruleFuncStatement= ruleFuncStatement EOF )
            // InternalGoatComponentsParser.g:4993:2: iv_ruleFuncStatement= ruleFuncStatement EOF
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
    // InternalGoatComponentsParser.g:4999:1: ruleFuncStatement returns [EObject current=null] : (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile ) ;
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
            // InternalGoatComponentsParser.g:5005:2: ( (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile ) )
            // InternalGoatComponentsParser.g:5006:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile )
            {
            // InternalGoatComponentsParser.g:5006:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile )
            int alt78=7;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // InternalGoatComponentsParser.g:5007:3: this_FuncVarAssign_0= ruleFuncVarAssign
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
                    // InternalGoatComponentsParser.g:5016:3: this_FuncIfElse_1= ruleFuncIfElse
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
                    // InternalGoatComponentsParser.g:5025:3: this_FuncReturn_2= ruleFuncReturn
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
                    // InternalGoatComponentsParser.g:5034:3: this_FuncVarDeclaration_3= ruleFuncVarDeclaration
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
                    // InternalGoatComponentsParser.g:5043:3: this_FuncVarAppend_4= ruleFuncVarAppend
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
                    // InternalGoatComponentsParser.g:5052:3: this_FuncVarPop_5= ruleFuncVarPop
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
                    // InternalGoatComponentsParser.g:5061:3: this_FuncWhile_6= ruleFuncWhile
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
    // InternalGoatComponentsParser.g:5073:1: entryRuleFuncVarDeclaration returns [EObject current=null] : iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF ;
    public final EObject entryRuleFuncVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarDeclaration = null;


        try {
            // InternalGoatComponentsParser.g:5073:59: (iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF )
            // InternalGoatComponentsParser.g:5074:2: iv_ruleFuncVarDeclaration= ruleFuncVarDeclaration EOF
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
    // InternalGoatComponentsParser.g:5080:1: ruleFuncVarDeclaration returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) ) ;
    public final EObject ruleFuncVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5086:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) ) )
            // InternalGoatComponentsParser.g:5087:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) )
            {
            // InternalGoatComponentsParser.g:5087:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) ) )
            // InternalGoatComponentsParser.g:5088:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_val_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncVarDeclarationAccess().getVarKeyword_0());
            		
            // InternalGoatComponentsParser.g:5092:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:5093:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:5093:4: (lv_name_1_0= RULE_ID )
            // InternalGoatComponentsParser.g:5094:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_62); 

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
            		
            // InternalGoatComponentsParser.g:5114:3: ( (lv_val_3_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5115:4: (lv_val_3_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5115:4: (lv_val_3_0= ruleExpression )
            // InternalGoatComponentsParser.g:5116:5: lv_val_3_0= ruleExpression
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
    // InternalGoatComponentsParser.g:5137:1: entryRuleFuncVarAssign returns [EObject current=null] : iv_ruleFuncVarAssign= ruleFuncVarAssign EOF ;
    public final EObject entryRuleFuncVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarAssign = null;


        try {
            // InternalGoatComponentsParser.g:5137:54: (iv_ruleFuncVarAssign= ruleFuncVarAssign EOF )
            // InternalGoatComponentsParser.g:5138:2: iv_ruleFuncVarAssign= ruleFuncVarAssign EOF
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
    // InternalGoatComponentsParser.g:5144:1: ruleFuncVarAssign returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) ) ) ;
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
            // InternalGoatComponentsParser.g:5150:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) ) ) )
            // InternalGoatComponentsParser.g:5151:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) ) )
            {
            // InternalGoatComponentsParser.g:5151:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) ) )
            // InternalGoatComponentsParser.g:5152:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )? otherlv_4= EqualsSign ( (lv_val_5_0= ruleExpression ) )
            {
            // InternalGoatComponentsParser.g:5152:3: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:5153:4: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:5153:4: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:5154:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarAssignRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(otherlv_0, grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalGoatComponentsParser.g:5165:3: (otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==LeftSquareBracket) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalGoatComponentsParser.g:5166:4: otherlv_1= LeftSquareBracket ( (lv_idx_2_0= ruleExpression ) ) otherlv_3= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getFuncVarAssignAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalGoatComponentsParser.g:5170:4: ( (lv_idx_2_0= ruleExpression ) )
                    // InternalGoatComponentsParser.g:5171:5: (lv_idx_2_0= ruleExpression )
                    {
                    // InternalGoatComponentsParser.g:5171:5: (lv_idx_2_0= ruleExpression )
                    // InternalGoatComponentsParser.g:5172:6: lv_idx_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFuncVarAssignAccess().getIdxExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_52);
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

                    otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getFuncVarAssignAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,EqualsSign,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFuncVarAssignAccess().getEqualsSignKeyword_2());
            		
            // InternalGoatComponentsParser.g:5198:3: ( (lv_val_5_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5199:4: (lv_val_5_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5199:4: (lv_val_5_0= ruleExpression )
            // InternalGoatComponentsParser.g:5200:5: lv_val_5_0= ruleExpression
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
    // InternalGoatComponentsParser.g:5221:1: entryRuleFuncVarAppend returns [EObject current=null] : iv_ruleFuncVarAppend= ruleFuncVarAppend EOF ;
    public final EObject entryRuleFuncVarAppend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarAppend = null;


        try {
            // InternalGoatComponentsParser.g:5221:54: (iv_ruleFuncVarAppend= ruleFuncVarAppend EOF )
            // InternalGoatComponentsParser.g:5222:2: iv_ruleFuncVarAppend= ruleFuncVarAppend EOF
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
    // InternalGoatComponentsParser.g:5228:1: ruleFuncVarAppend returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis ) ;
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
            // InternalGoatComponentsParser.g:5234:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis ) )
            // InternalGoatComponentsParser.g:5235:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:5235:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis )
            // InternalGoatComponentsParser.g:5236:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Append otherlv_3= LeftParenthesis ( (lv_item_4_0= ruleExpression ) ) otherlv_5= RightParenthesis
            {
            // InternalGoatComponentsParser.g:5236:3: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:5237:4: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:5237:4: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:5238:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarAppendRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getFuncVarAppendAccess().getVarFuncVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncVarAppendAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,Append,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncVarAppendAccess().getAppendKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncVarAppendAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:5261:3: ( (lv_item_4_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5262:4: (lv_item_4_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5262:4: (lv_item_4_0= ruleExpression )
            // InternalGoatComponentsParser.g:5263:5: lv_item_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncVarAppendAccess().getItemExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalGoatComponentsParser.g:5288:1: entryRuleFuncVarPop returns [EObject current=null] : iv_ruleFuncVarPop= ruleFuncVarPop EOF ;
    public final EObject entryRuleFuncVarPop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVarPop = null;


        try {
            // InternalGoatComponentsParser.g:5288:51: (iv_ruleFuncVarPop= ruleFuncVarPop EOF )
            // InternalGoatComponentsParser.g:5289:2: iv_ruleFuncVarPop= ruleFuncVarPop EOF
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
    // InternalGoatComponentsParser.g:5295:1: ruleFuncVarPop returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis ) ;
    public final EObject ruleFuncVarPop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5301:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis ) )
            // InternalGoatComponentsParser.g:5302:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis )
            {
            // InternalGoatComponentsParser.g:5302:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis )
            // InternalGoatComponentsParser.g:5303:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= FullStop otherlv_2= Pop otherlv_3= LeftParenthesis otherlv_4= RightParenthesis
            {
            // InternalGoatComponentsParser.g:5303:3: ( (otherlv_0= RULE_ID ) )
            // InternalGoatComponentsParser.g:5304:4: (otherlv_0= RULE_ID )
            {
            // InternalGoatComponentsParser.g:5304:4: (otherlv_0= RULE_ID )
            // InternalGoatComponentsParser.g:5305:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarPopRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getFuncVarPopAccess().getVarFuncVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncVarPopAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,Pop,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncVarPopAccess().getPopKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_9); 

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
    // InternalGoatComponentsParser.g:5336:1: entryRuleFuncIfElse returns [EObject current=null] : iv_ruleFuncIfElse= ruleFuncIfElse EOF ;
    public final EObject entryRuleFuncIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncIfElse = null;


        try {
            // InternalGoatComponentsParser.g:5336:51: (iv_ruleFuncIfElse= ruleFuncIfElse EOF )
            // InternalGoatComponentsParser.g:5337:2: iv_ruleFuncIfElse= ruleFuncIfElse EOF
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
    // InternalGoatComponentsParser.g:5343:1: ruleFuncIfElse returns [EObject current=null] : (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )? ) ;
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
            // InternalGoatComponentsParser.g:5349:2: ( (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )? ) )
            // InternalGoatComponentsParser.g:5350:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )? )
            {
            // InternalGoatComponentsParser.g:5350:2: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )? )
            // InternalGoatComponentsParser.g:5351:3: otherlv_0= If otherlv_1= LeftParenthesis ( (lv_test_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_then_4_0= ruleFuncBlock ) ) (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )* (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncIfElseAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:5359:3: ( (lv_test_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5360:4: (lv_test_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5360:4: (lv_test_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:5361:5: lv_test_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:5382:3: ( (lv_then_4_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:5383:4: (lv_then_4_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:5383:4: (lv_then_4_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:5384:5: lv_then_4_0= ruleFuncBlock
            {

            					newCompositeNode(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalGoatComponentsParser.g:5401:3: (otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==Else) ) {
                    int LA80_1 = input.LA(2);

                    if ( (LA80_1==If) ) {
                        alt80=1;
                    }


                }


                switch (alt80) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:5402:4: otherlv_5= Else otherlv_6= If otherlv_7= LeftParenthesis ( (lv_test_8_0= ruleExpression ) ) otherlv_9= RightParenthesis ( (lv_then_10_0= ruleFuncBlock ) )
            	    {
            	    otherlv_5=(Token)match(input,Else,FOLLOW_26); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFuncIfElseAccess().getElseKeyword_5_0());
            	    			
            	    otherlv_6=(Token)match(input,If,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getFuncIfElseAccess().getIfKeyword_5_1());
            	    			
            	    otherlv_7=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_5_2());
            	    			
            	    // InternalGoatComponentsParser.g:5414:4: ( (lv_test_8_0= ruleExpression ) )
            	    // InternalGoatComponentsParser.g:5415:5: (lv_test_8_0= ruleExpression )
            	    {
            	    // InternalGoatComponentsParser.g:5415:5: (lv_test_8_0= ruleExpression )
            	    // InternalGoatComponentsParser.g:5416:6: lv_test_8_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_9);
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

            	    otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_10); 

            	    				newLeafNode(otherlv_9, grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_5_4());
            	    			
            	    // InternalGoatComponentsParser.g:5437:4: ( (lv_then_10_0= ruleFuncBlock ) )
            	    // InternalGoatComponentsParser.g:5438:5: (lv_then_10_0= ruleFuncBlock )
            	    {
            	    // InternalGoatComponentsParser.g:5438:5: (lv_then_10_0= ruleFuncBlock )
            	    // InternalGoatComponentsParser.g:5439:6: lv_then_10_0= ruleFuncBlock
            	    {

            	    						newCompositeNode(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_5_5_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop80;
                }
            } while (true);

            // InternalGoatComponentsParser.g:5457:3: (otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==Else) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalGoatComponentsParser.g:5458:4: otherlv_11= Else ( (lv_elseBranch_12_0= ruleFuncBlock ) )
                    {
                    otherlv_11=(Token)match(input,Else,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getFuncIfElseAccess().getElseKeyword_6_0());
                    			
                    // InternalGoatComponentsParser.g:5462:4: ( (lv_elseBranch_12_0= ruleFuncBlock ) )
                    // InternalGoatComponentsParser.g:5463:5: (lv_elseBranch_12_0= ruleFuncBlock )
                    {
                    // InternalGoatComponentsParser.g:5463:5: (lv_elseBranch_12_0= ruleFuncBlock )
                    // InternalGoatComponentsParser.g:5464:6: lv_elseBranch_12_0= ruleFuncBlock
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
    // InternalGoatComponentsParser.g:5486:1: entryRuleFuncReturn returns [EObject current=null] : iv_ruleFuncReturn= ruleFuncReturn EOF ;
    public final EObject entryRuleFuncReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncReturn = null;


        try {
            // InternalGoatComponentsParser.g:5486:51: (iv_ruleFuncReturn= ruleFuncReturn EOF )
            // InternalGoatComponentsParser.g:5487:2: iv_ruleFuncReturn= ruleFuncReturn EOF
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
    // InternalGoatComponentsParser.g:5493:1: ruleFuncReturn returns [EObject current=null] : (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) ) ;
    public final EObject ruleFuncReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5499:2: ( (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) ) )
            // InternalGoatComponentsParser.g:5500:2: (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) )
            {
            // InternalGoatComponentsParser.g:5500:2: (otherlv_0= Return ( (lv_val_1_0= ruleExpression ) ) )
            // InternalGoatComponentsParser.g:5501:3: otherlv_0= Return ( (lv_val_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Return,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncReturnAccess().getReturnKeyword_0());
            		
            // InternalGoatComponentsParser.g:5505:3: ( (lv_val_1_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5506:4: (lv_val_1_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5506:4: (lv_val_1_0= ruleExpression )
            // InternalGoatComponentsParser.g:5507:5: lv_val_1_0= ruleExpression
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
    // InternalGoatComponentsParser.g:5528:1: entryRuleFuncWhile returns [EObject current=null] : iv_ruleFuncWhile= ruleFuncWhile EOF ;
    public final EObject entryRuleFuncWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncWhile = null;


        try {
            // InternalGoatComponentsParser.g:5528:50: (iv_ruleFuncWhile= ruleFuncWhile EOF )
            // InternalGoatComponentsParser.g:5529:2: iv_ruleFuncWhile= ruleFuncWhile EOF
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
    // InternalGoatComponentsParser.g:5535:1: ruleFuncWhile returns [EObject current=null] : (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) ) ) ;
    public final EObject ruleFuncWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cond_2_0 = null;

        EObject lv_cycle_4_0 = null;



        	enterRule();

        try {
            // InternalGoatComponentsParser.g:5541:2: ( (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) ) ) )
            // InternalGoatComponentsParser.g:5542:2: (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) ) )
            {
            // InternalGoatComponentsParser.g:5542:2: (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) ) )
            // InternalGoatComponentsParser.g:5543:3: otherlv_0= While otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleExpression ) ) otherlv_3= RightParenthesis ( (lv_cycle_4_0= ruleFuncBlock ) )
            {
            otherlv_0=(Token)match(input,While,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncWhileAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncWhileAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGoatComponentsParser.g:5551:3: ( (lv_cond_2_0= ruleExpression ) )
            // InternalGoatComponentsParser.g:5552:4: (lv_cond_2_0= ruleExpression )
            {
            // InternalGoatComponentsParser.g:5552:4: (lv_cond_2_0= ruleExpression )
            // InternalGoatComponentsParser.g:5553:5: lv_cond_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncWhileAccess().getCondExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncWhileAccess().getRightParenthesisKeyword_3());
            		
            // InternalGoatComponentsParser.g:5574:3: ( (lv_cycle_4_0= ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:5575:4: (lv_cycle_4_0= ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:5575:4: (lv_cycle_4_0= ruleFuncBlock )
            // InternalGoatComponentsParser.g:5576:5: lv_cycle_4_0= ruleFuncBlock
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


    protected DFA78 dfa78 = new DFA78(this);
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

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "5006:2: (this_FuncVarAssign_0= ruleFuncVarAssign | this_FuncIfElse_1= ruleFuncIfElse | this_FuncReturn_2= ruleFuncReturn | this_FuncVarDeclaration_3= ruleFuncVarDeclaration | this_FuncVarAppend_4= ruleFuncVarAppend | this_FuncVarPop_5= ruleFuncVarPop | this_FuncWhile_6= ruleFuncWhile )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000002E2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x10000020128A0C00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0400000000000000L});
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000012000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000020128A0C02L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8300800004008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8100800004008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xC100800004008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4400040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4420000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0050001400000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000A00100000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002120000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xC30085000520A000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xC1008D000520A000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0050005C40000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xC30005000520A100L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xC1000D000520A100L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000080000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x5000002020044000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000008000000L});

}