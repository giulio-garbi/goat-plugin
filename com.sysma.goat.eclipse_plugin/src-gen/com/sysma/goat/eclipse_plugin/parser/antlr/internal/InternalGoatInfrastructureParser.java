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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Singleserver", "Cluster", "Ring", "Tree", "Comma", "Colon", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=12;
    public static final int RULE_WS=17;
    public static final int LeftCurlyBracket=10;
    public static final int Cluster=5;
    public static final int RULE_STRING=14;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_SL_COMMENT=16;
    public static final int Comma=8;
    public static final int Ring=6;
    public static final int RULE_INT=13;
    public static final int Singleserver=4;
    public static final int RULE_ML_COMMENT=15;
    public static final int Tree=7;
    public static final int Colon=9;
    public static final int RightCurlyBracket=11;
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
    // InternalGoatInfrastructureParser.g:89:1: ruleSingleServer returns [EObject current=null] : (otherlv_0= Singleserver ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current] ) ;
    public final EObject ruleSingleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_Params_2 = null;



        	enterRule();

        try {
            // InternalGoatInfrastructureParser.g:95:2: ( (otherlv_0= Singleserver ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current] ) )
            // InternalGoatInfrastructureParser.g:96:2: (otherlv_0= Singleserver ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current] )
            {
            // InternalGoatInfrastructureParser.g:96:2: (otherlv_0= Singleserver ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current] )
            // InternalGoatInfrastructureParser.g:97:3: otherlv_0= Singleserver ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current]
            {
            otherlv_0=(Token)match(input,Singleserver,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleServerAccess().getSingleserverKeyword_0());
            		
            // InternalGoatInfrastructureParser.g:101:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatInfrastructureParser.g:102:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatInfrastructureParser.g:102:4: (lv_name_1_0= RULE_ID )
            // InternalGoatInfrastructureParser.g:103:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSingleServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSingleServerRule());
            			}
            			newCompositeNode(grammarAccess.getSingleServerAccess().getParamsParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_Params_2=ruleParams(current);

            state._fsp--;


            			current = this_Params_2;
            			afterParserOrEnumRuleCall();
            		

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


    // $ANTLR start "ruleParams"
    // InternalGoatInfrastructureParser.g:135:1: ruleParams[EObject in_current] returns [EObject current=in_current] : (otherlv_0= LeftCurlyBracket ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= Comma )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleParams(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGoatInfrastructureParser.g:141:2: ( (otherlv_0= LeftCurlyBracket ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= Comma )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= RightCurlyBracket ) )
            // InternalGoatInfrastructureParser.g:142:2: (otherlv_0= LeftCurlyBracket ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= Comma )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= RightCurlyBracket )
            {
            // InternalGoatInfrastructureParser.g:142:2: (otherlv_0= LeftCurlyBracket ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= Comma )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= RightCurlyBracket )
            // InternalGoatInfrastructureParser.g:143:3: otherlv_0= LeftCurlyBracket ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= Comma )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParamsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatInfrastructureParser.g:147:3: ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= Comma )* ( (lv_params_3_0= ruleParam ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatInfrastructureParser.g:148:4: ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= Comma )* ( (lv_params_3_0= ruleParam ) )
                    {
                    // InternalGoatInfrastructureParser.g:148:4: ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= Comma )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==Colon) ) {
                                int LA1_2 = input.LA(3);

                                if ( (LA1_2==RULE_STRING) ) {
                                    int LA1_3 = input.LA(4);

                                    if ( (LA1_3==Comma) ) {
                                        alt1=1;
                                    }


                                }


                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGoatInfrastructureParser.g:149:5: ( (lv_params_1_0= ruleParam ) ) otherlv_2= Comma
                    	    {
                    	    // InternalGoatInfrastructureParser.g:149:5: ( (lv_params_1_0= ruleParam ) )
                    	    // InternalGoatInfrastructureParser.g:150:6: (lv_params_1_0= ruleParam )
                    	    {
                    	    // InternalGoatInfrastructureParser.g:150:6: (lv_params_1_0= ruleParam )
                    	    // InternalGoatInfrastructureParser.g:151:7: lv_params_1_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getParamsAccess().getParamsParamParserRuleCall_1_0_0_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_params_1_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParamsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_1_0,
                    	    								"com.sysma.goat.eclipse_plugin.GoatInfrastructure.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParamsAccess().getCommaKeyword_1_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // InternalGoatInfrastructureParser.g:173:4: ( (lv_params_3_0= ruleParam ) )
                    // InternalGoatInfrastructureParser.g:174:5: (lv_params_3_0= ruleParam )
                    {
                    // InternalGoatInfrastructureParser.g:174:5: (lv_params_3_0= ruleParam )
                    // InternalGoatInfrastructureParser.g:175:6: lv_params_3_0= ruleParam
                    {

                    						newCompositeNode(grammarAccess.getParamsAccess().getParamsParamParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_params_3_0=ruleParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParamsRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"com.sysma.goat.eclipse_plugin.GoatInfrastructure.Param");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParamsAccess().getRightCurlyBracketKeyword_2());
            		

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


    // $ANTLR start "entryRuleParam"
    // InternalGoatInfrastructureParser.g:201:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalGoatInfrastructureParser.g:201:46: (iv_ruleParam= ruleParam EOF )
            // InternalGoatInfrastructureParser.g:202:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalGoatInfrastructureParser.g:208:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalGoatInfrastructureParser.g:214:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalGoatInfrastructureParser.g:215:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalGoatInfrastructureParser.g:215:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalGoatInfrastructureParser.g:216:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalGoatInfrastructureParser.g:216:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGoatInfrastructureParser.g:217:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGoatInfrastructureParser.g:217:4: (lv_name_0_0= RULE_ID )
            // InternalGoatInfrastructureParser.g:218:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
            		
            // InternalGoatInfrastructureParser.g:238:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalGoatInfrastructureParser.g:239:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalGoatInfrastructureParser.g:239:4: (lv_value_2_0= RULE_STRING )
            // InternalGoatInfrastructureParser.g:240:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getParamAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleParam"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});

}