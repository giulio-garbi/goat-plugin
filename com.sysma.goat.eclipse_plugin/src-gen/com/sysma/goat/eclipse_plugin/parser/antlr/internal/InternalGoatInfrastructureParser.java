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
import com.sysma.goat.eclipse_plugin.services.GoatInfrastructureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoatInfrastructureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SingleServer", "External", "Comma", "Colon", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=10;
    public static final int RULE_WS=15;
    public static final int LeftCurlyBracket=8;
    public static final int RULE_STRING=12;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_SL_COMMENT=14;
    public static final int Comma=6;
    public static final int SingleServer=4;
    public static final int RULE_INT=11;
    public static final int External=5;
    public static final int RULE_ML_COMMENT=13;
    public static final int Colon=7;
    public static final int RightCurlyBracket=9;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalGoatInfrastructureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoatInfrastructureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoatInfrastructureParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGoatInfrastructureParser.g"; }



     	private GoatInfrastructureGrammarAccess grammarAccess;

        public InternalGoatInfrastructureParser(TokenStream input, GoatInfrastructureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Infrastructure";
       	}

       	@Override
       	protected GoatInfrastructureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInfrastructure"
    // InternalGoatInfrastructureParser.g:57:1: entryRuleInfrastructure returns [EObject current=null] : iv_ruleInfrastructure= ruleInfrastructure EOF ;
    public final EObject entryRuleInfrastructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfrastructure = null;


        try {
            // InternalGoatInfrastructureParser.g:57:55: (iv_ruleInfrastructure= ruleInfrastructure EOF )
            // InternalGoatInfrastructureParser.g:58:2: iv_ruleInfrastructure= ruleInfrastructure EOF
            {
             newCompositeNode(grammarAccess.getInfrastructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfrastructure=ruleInfrastructure();

            state._fsp--;

             current =iv_ruleInfrastructure; 
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
    // $ANTLR end "entryRuleInfrastructure"


    // $ANTLR start "ruleInfrastructure"
    // InternalGoatInfrastructureParser.g:64:1: ruleInfrastructure returns [EObject current=null] : this_SingleServer_0= ruleSingleServer ;
    public final EObject ruleInfrastructure() throws RecognitionException {
        EObject current = null;

        EObject this_SingleServer_0 = null;



        	enterRule();

        try {
            // InternalGoatInfrastructureParser.g:70:2: (this_SingleServer_0= ruleSingleServer )
            // InternalGoatInfrastructureParser.g:71:2: this_SingleServer_0= ruleSingleServer
            {

            		newCompositeNode(grammarAccess.getInfrastructureAccess().getSingleServerParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SingleServer_0=ruleSingleServer();

            state._fsp--;


            		current = this_SingleServer_0;
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
    // $ANTLR end "ruleInfrastructure"


    // $ANTLR start "entryRuleSingleServer"
    // InternalGoatInfrastructureParser.g:82:1: entryRuleSingleServer returns [EObject current=null] : iv_ruleSingleServer= ruleSingleServer EOF ;
    public final EObject entryRuleSingleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleServer = null;


        try {
            // InternalGoatInfrastructureParser.g:82:53: (iv_ruleSingleServer= ruleSingleServer EOF )
            // InternalGoatInfrastructureParser.g:83:2: iv_ruleSingleServer= ruleSingleServer EOF
            {
             newCompositeNode(grammarAccess.getSingleServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleServer=ruleSingleServer();

            state._fsp--;

             current =iv_ruleSingleServer; 
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
    // $ANTLR end "entryRuleSingleServer"


    // $ANTLR start "ruleSingleServer"
    // InternalGoatInfrastructureParser.g:89:1: ruleSingleServer returns [EObject current=null] : ( ( (lv_external_0_0= External ) )? otherlv_1= SingleServer ( (lv_params_2_0= ruleParams ) ) ) ;
    public final EObject ruleSingleServer() throws RecognitionException {
        EObject current = null;

        Token lv_external_0_0=null;
        Token otherlv_1=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalGoatInfrastructureParser.g:95:2: ( ( ( (lv_external_0_0= External ) )? otherlv_1= SingleServer ( (lv_params_2_0= ruleParams ) ) ) )
            // InternalGoatInfrastructureParser.g:96:2: ( ( (lv_external_0_0= External ) )? otherlv_1= SingleServer ( (lv_params_2_0= ruleParams ) ) )
            {
            // InternalGoatInfrastructureParser.g:96:2: ( ( (lv_external_0_0= External ) )? otherlv_1= SingleServer ( (lv_params_2_0= ruleParams ) ) )
            // InternalGoatInfrastructureParser.g:97:3: ( (lv_external_0_0= External ) )? otherlv_1= SingleServer ( (lv_params_2_0= ruleParams ) )
            {
            // InternalGoatInfrastructureParser.g:97:3: ( (lv_external_0_0= External ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==External) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGoatInfrastructureParser.g:98:4: (lv_external_0_0= External )
                    {
                    // InternalGoatInfrastructureParser.g:98:4: (lv_external_0_0= External )
                    // InternalGoatInfrastructureParser.g:99:5: lv_external_0_0= External
                    {
                    lv_external_0_0=(Token)match(input,External,FOLLOW_3); 

                    					newLeafNode(lv_external_0_0, grammarAccess.getSingleServerAccess().getExternalExternalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleServerRule());
                    					}
                    					setWithLastConsumed(current, "external", true, "external");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,SingleServer,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleServerAccess().getSingleServerKeyword_1());
            		
            // InternalGoatInfrastructureParser.g:115:3: ( (lv_params_2_0= ruleParams ) )
            // InternalGoatInfrastructureParser.g:116:4: (lv_params_2_0= ruleParams )
            {
            // InternalGoatInfrastructureParser.g:116:4: (lv_params_2_0= ruleParams )
            // InternalGoatInfrastructureParser.g:117:5: lv_params_2_0= ruleParams
            {

            					newCompositeNode(grammarAccess.getSingleServerAccess().getParamsParamsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_params_2_0=ruleParams();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleServerRule());
            					}
            					set(
            						current,
            						"params",
            						lv_params_2_0,
            						"com.sysma.goat.eclipse_plugin.GoatInfrastructure.Params");
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
    // $ANTLR end "ruleSingleServer"


    // $ANTLR start "entryRuleParams"
    // InternalGoatInfrastructureParser.g:138:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalGoatInfrastructureParser.g:138:47: (iv_ruleParams= ruleParams EOF )
            // InternalGoatInfrastructureParser.g:139:2: iv_ruleParams= ruleParams EOF
            {
             newCompositeNode(grammarAccess.getParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParams=ruleParams();

            state._fsp--;

             current =iv_ruleParams; 
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
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // InternalGoatInfrastructureParser.g:145:1: ruleParams returns [EObject current=null] : (otherlv_0= LeftCurlyBracket () ( ( ( (lv_keys_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_values_4_0= RULE_STRING ) ) otherlv_5= Comma )* ( (lv_keys_6_0= RULE_ID ) ) otherlv_7= Colon ( (lv_values_8_0= RULE_STRING ) ) )? otherlv_9= RightCurlyBracket ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keys_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;
        Token lv_keys_6_0=null;
        Token otherlv_7=null;
        Token lv_values_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalGoatInfrastructureParser.g:151:2: ( (otherlv_0= LeftCurlyBracket () ( ( ( (lv_keys_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_values_4_0= RULE_STRING ) ) otherlv_5= Comma )* ( (lv_keys_6_0= RULE_ID ) ) otherlv_7= Colon ( (lv_values_8_0= RULE_STRING ) ) )? otherlv_9= RightCurlyBracket ) )
            // InternalGoatInfrastructureParser.g:152:2: (otherlv_0= LeftCurlyBracket () ( ( ( (lv_keys_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_values_4_0= RULE_STRING ) ) otherlv_5= Comma )* ( (lv_keys_6_0= RULE_ID ) ) otherlv_7= Colon ( (lv_values_8_0= RULE_STRING ) ) )? otherlv_9= RightCurlyBracket )
            {
            // InternalGoatInfrastructureParser.g:152:2: (otherlv_0= LeftCurlyBracket () ( ( ( (lv_keys_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_values_4_0= RULE_STRING ) ) otherlv_5= Comma )* ( (lv_keys_6_0= RULE_ID ) ) otherlv_7= Colon ( (lv_values_8_0= RULE_STRING ) ) )? otherlv_9= RightCurlyBracket )
            // InternalGoatInfrastructureParser.g:153:3: otherlv_0= LeftCurlyBracket () ( ( ( (lv_keys_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_values_4_0= RULE_STRING ) ) otherlv_5= Comma )* ( (lv_keys_6_0= RULE_ID ) ) otherlv_7= Colon ( (lv_values_8_0= RULE_STRING ) ) )? otherlv_9= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParamsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatInfrastructureParser.g:157:3: ()
            // InternalGoatInfrastructureParser.g:158:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParamsAccess().getParamsAction_1(),
            					current);
            			

            }

            // InternalGoatInfrastructureParser.g:164:3: ( ( ( (lv_keys_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_values_4_0= RULE_STRING ) ) otherlv_5= Comma )* ( (lv_keys_6_0= RULE_ID ) ) otherlv_7= Colon ( (lv_values_8_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGoatInfrastructureParser.g:165:4: ( ( (lv_keys_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_values_4_0= RULE_STRING ) ) otherlv_5= Comma )* ( (lv_keys_6_0= RULE_ID ) ) otherlv_7= Colon ( (lv_values_8_0= RULE_STRING ) )
                    {
                    // InternalGoatInfrastructureParser.g:165:4: ( ( (lv_keys_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_values_4_0= RULE_STRING ) ) otherlv_5= Comma )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==Colon) ) {
                                int LA2_2 = input.LA(3);

                                if ( (LA2_2==RULE_STRING) ) {
                                    int LA2_3 = input.LA(4);

                                    if ( (LA2_3==Comma) ) {
                                        alt2=1;
                                    }


                                }


                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGoatInfrastructureParser.g:166:5: ( (lv_keys_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_values_4_0= RULE_STRING ) ) otherlv_5= Comma
                    	    {
                    	    // InternalGoatInfrastructureParser.g:166:5: ( (lv_keys_2_0= RULE_ID ) )
                    	    // InternalGoatInfrastructureParser.g:167:6: (lv_keys_2_0= RULE_ID )
                    	    {
                    	    // InternalGoatInfrastructureParser.g:167:6: (lv_keys_2_0= RULE_ID )
                    	    // InternalGoatInfrastructureParser.g:168:7: lv_keys_2_0= RULE_ID
                    	    {
                    	    lv_keys_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    							newLeafNode(lv_keys_2_0, grammarAccess.getParamsAccess().getKeysIDTerminalRuleCall_2_0_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParamsRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"keys",
                    	    								lv_keys_2_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,Colon,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParamsAccess().getColonKeyword_2_0_1());
                    	    				
                    	    // InternalGoatInfrastructureParser.g:188:5: ( (lv_values_4_0= RULE_STRING ) )
                    	    // InternalGoatInfrastructureParser.g:189:6: (lv_values_4_0= RULE_STRING )
                    	    {
                    	    // InternalGoatInfrastructureParser.g:189:6: (lv_values_4_0= RULE_STRING )
                    	    // InternalGoatInfrastructureParser.g:190:7: lv_values_4_0= RULE_STRING
                    	    {
                    	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    	    							newLeafNode(lv_values_4_0, grammarAccess.getParamsAccess().getValuesSTRINGTerminalRuleCall_2_0_2_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParamsRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getParamsAccess().getCommaKeyword_2_0_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // InternalGoatInfrastructureParser.g:211:4: ( (lv_keys_6_0= RULE_ID ) )
                    // InternalGoatInfrastructureParser.g:212:5: (lv_keys_6_0= RULE_ID )
                    {
                    // InternalGoatInfrastructureParser.g:212:5: (lv_keys_6_0= RULE_ID )
                    // InternalGoatInfrastructureParser.g:213:6: lv_keys_6_0= RULE_ID
                    {
                    lv_keys_6_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_keys_6_0, grammarAccess.getParamsAccess().getKeysIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamsRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"keys",
                    							lv_keys_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,Colon,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getParamsAccess().getColonKeyword_2_2());
                    			
                    // InternalGoatInfrastructureParser.g:233:4: ( (lv_values_8_0= RULE_STRING ) )
                    // InternalGoatInfrastructureParser.g:234:5: (lv_values_8_0= RULE_STRING )
                    {
                    // InternalGoatInfrastructureParser.g:234:5: (lv_values_8_0= RULE_STRING )
                    // InternalGoatInfrastructureParser.g:235:6: lv_values_8_0= RULE_STRING
                    {
                    lv_values_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_values_8_0, grammarAccess.getParamsAccess().getValuesSTRINGTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamsRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParamsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleParams"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});

}