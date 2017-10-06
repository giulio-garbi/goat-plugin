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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'singleserver'", "'{'", "','", "'}'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public String getGrammarFileName() { return "InternalGoatInfrastructure.g"; }



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
    // InternalGoatInfrastructure.g:64:1: entryRuleInfrastructure returns [EObject current=null] : iv_ruleInfrastructure= ruleInfrastructure EOF ;
    public final EObject entryRuleInfrastructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfrastructure = null;


        try {
            // InternalGoatInfrastructure.g:64:55: (iv_ruleInfrastructure= ruleInfrastructure EOF )
            // InternalGoatInfrastructure.g:65:2: iv_ruleInfrastructure= ruleInfrastructure EOF
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
    // InternalGoatInfrastructure.g:71:1: ruleInfrastructure returns [EObject current=null] : this_SingleServer_0= ruleSingleServer ;
    public final EObject ruleInfrastructure() throws RecognitionException {
        EObject current = null;

        EObject this_SingleServer_0 = null;



        	enterRule();

        try {
            // InternalGoatInfrastructure.g:77:2: (this_SingleServer_0= ruleSingleServer )
            // InternalGoatInfrastructure.g:78:2: this_SingleServer_0= ruleSingleServer
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
    // InternalGoatInfrastructure.g:89:1: entryRuleSingleServer returns [EObject current=null] : iv_ruleSingleServer= ruleSingleServer EOF ;
    public final EObject entryRuleSingleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleServer = null;


        try {
            // InternalGoatInfrastructure.g:89:53: (iv_ruleSingleServer= ruleSingleServer EOF )
            // InternalGoatInfrastructure.g:90:2: iv_ruleSingleServer= ruleSingleServer EOF
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
    // InternalGoatInfrastructure.g:96:1: ruleSingleServer returns [EObject current=null] : (otherlv_0= 'singleserver' ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current] ) ;
    public final EObject ruleSingleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_Params_2 = null;



        	enterRule();

        try {
            // InternalGoatInfrastructure.g:102:2: ( (otherlv_0= 'singleserver' ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current] ) )
            // InternalGoatInfrastructure.g:103:2: (otherlv_0= 'singleserver' ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current] )
            {
            // InternalGoatInfrastructure.g:103:2: (otherlv_0= 'singleserver' ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current] )
            // InternalGoatInfrastructure.g:104:3: otherlv_0= 'singleserver' ( (lv_name_1_0= RULE_ID ) ) this_Params_2= ruleParams[$current]
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleServerAccess().getSingleserverKeyword_0());
            		
            // InternalGoatInfrastructure.g:108:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoatInfrastructure.g:109:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoatInfrastructure.g:109:4: (lv_name_1_0= RULE_ID )
            // InternalGoatInfrastructure.g:110:5: lv_name_1_0= RULE_ID
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
    // InternalGoatInfrastructure.g:142:1: ruleParams[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= ',' )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= '}' ) ;
    public final EObject ruleParams(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGoatInfrastructure.g:148:2: ( (otherlv_0= '{' ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= ',' )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= '}' ) )
            // InternalGoatInfrastructure.g:149:2: (otherlv_0= '{' ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= ',' )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= '}' )
            {
            // InternalGoatInfrastructure.g:149:2: (otherlv_0= '{' ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= ',' )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= '}' )
            // InternalGoatInfrastructure.g:150:3: otherlv_0= '{' ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= ',' )* ( (lv_params_3_0= ruleParam ) ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParamsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGoatInfrastructure.g:154:3: ( ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= ',' )* ( (lv_params_3_0= ruleParam ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatInfrastructure.g:155:4: ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= ',' )* ( (lv_params_3_0= ruleParam ) )
                    {
                    // InternalGoatInfrastructure.g:155:4: ( ( (lv_params_1_0= ruleParam ) ) otherlv_2= ',' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==15) ) {
                                int LA1_2 = input.LA(3);

                                if ( (LA1_2==RULE_STRING) ) {
                                    int LA1_3 = input.LA(4);

                                    if ( (LA1_3==13) ) {
                                        alt1=1;
                                    }


                                }


                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGoatInfrastructure.g:156:5: ( (lv_params_1_0= ruleParam ) ) otherlv_2= ','
                    	    {
                    	    // InternalGoatInfrastructure.g:156:5: ( (lv_params_1_0= ruleParam ) )
                    	    // InternalGoatInfrastructure.g:157:6: (lv_params_1_0= ruleParam )
                    	    {
                    	    // InternalGoatInfrastructure.g:157:6: (lv_params_1_0= ruleParam )
                    	    // InternalGoatInfrastructure.g:158:7: lv_params_1_0= ruleParam
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

                    	    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParamsAccess().getCommaKeyword_1_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // InternalGoatInfrastructure.g:180:4: ( (lv_params_3_0= ruleParam ) )
                    // InternalGoatInfrastructure.g:181:5: (lv_params_3_0= ruleParam )
                    {
                    // InternalGoatInfrastructure.g:181:5: (lv_params_3_0= ruleParam )
                    // InternalGoatInfrastructure.g:182:6: lv_params_3_0= ruleParam
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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGoatInfrastructure.g:208:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalGoatInfrastructure.g:208:46: (iv_ruleParam= ruleParam EOF )
            // InternalGoatInfrastructure.g:209:2: iv_ruleParam= ruleParam EOF
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
    // InternalGoatInfrastructure.g:215:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalGoatInfrastructure.g:221:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalGoatInfrastructure.g:222:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalGoatInfrastructure.g:222:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalGoatInfrastructure.g:223:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalGoatInfrastructure.g:223:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGoatInfrastructure.g:224:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGoatInfrastructure.g:224:4: (lv_name_0_0= RULE_ID )
            // InternalGoatInfrastructure.g:225:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
            		
            // InternalGoatInfrastructure.g:245:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalGoatInfrastructure.g:246:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalGoatInfrastructure.g:246:4: (lv_value_2_0= RULE_STRING )
            // InternalGoatInfrastructure.g:247:5: lv_value_2_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});

}