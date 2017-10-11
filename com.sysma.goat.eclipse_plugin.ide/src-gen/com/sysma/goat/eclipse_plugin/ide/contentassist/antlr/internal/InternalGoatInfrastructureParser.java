package com.sysma.goat.eclipse_plugin.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.sysma.goat.eclipse_plugin.services.GoatInfrastructureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoatInfrastructureParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Ring", "'ring'");
    		tokenNameToValue.put("Tree", "'tree'");
    		tokenNameToValue.put("Cluster", "'cluster'");
    		tokenNameToValue.put("Singleserver", "'singleserver'");
    	}

    	public void setGrammarAccess(GoatInfrastructureGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleInfrastructure"
    // InternalGoatInfrastructureParser.g:63:1: entryRuleInfrastructure : ruleInfrastructure EOF ;
    public final void entryRuleInfrastructure() throws RecognitionException {
        try {
            // InternalGoatInfrastructureParser.g:64:1: ( ruleInfrastructure EOF )
            // InternalGoatInfrastructureParser.g:65:1: ruleInfrastructure EOF
            {
             before(grammarAccess.getInfrastructureRule()); 
            pushFollow(FOLLOW_1);
            ruleInfrastructure();

            state._fsp--;

             after(grammarAccess.getInfrastructureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfrastructure"


    // $ANTLR start "ruleInfrastructure"
    // InternalGoatInfrastructureParser.g:72:1: ruleInfrastructure : ( ruleSingleServer ) ;
    public final void ruleInfrastructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:76:2: ( ( ruleSingleServer ) )
            // InternalGoatInfrastructureParser.g:77:2: ( ruleSingleServer )
            {
            // InternalGoatInfrastructureParser.g:77:2: ( ruleSingleServer )
            // InternalGoatInfrastructureParser.g:78:3: ruleSingleServer
            {
             before(grammarAccess.getInfrastructureAccess().getSingleServerParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSingleServer();

            state._fsp--;

             after(grammarAccess.getInfrastructureAccess().getSingleServerParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfrastructure"


    // $ANTLR start "entryRuleSingleServer"
    // InternalGoatInfrastructureParser.g:88:1: entryRuleSingleServer : ruleSingleServer EOF ;
    public final void entryRuleSingleServer() throws RecognitionException {
        try {
            // InternalGoatInfrastructureParser.g:89:1: ( ruleSingleServer EOF )
            // InternalGoatInfrastructureParser.g:90:1: ruleSingleServer EOF
            {
             before(grammarAccess.getSingleServerRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleServer();

            state._fsp--;

             after(grammarAccess.getSingleServerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleServer"


    // $ANTLR start "ruleSingleServer"
    // InternalGoatInfrastructureParser.g:97:1: ruleSingleServer : ( ( rule__SingleServer__Group__0 ) ) ;
    public final void ruleSingleServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:101:2: ( ( ( rule__SingleServer__Group__0 ) ) )
            // InternalGoatInfrastructureParser.g:102:2: ( ( rule__SingleServer__Group__0 ) )
            {
            // InternalGoatInfrastructureParser.g:102:2: ( ( rule__SingleServer__Group__0 ) )
            // InternalGoatInfrastructureParser.g:103:3: ( rule__SingleServer__Group__0 )
            {
             before(grammarAccess.getSingleServerAccess().getGroup()); 
            // InternalGoatInfrastructureParser.g:104:3: ( rule__SingleServer__Group__0 )
            // InternalGoatInfrastructureParser.g:104:4: rule__SingleServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleServer"


    // $ANTLR start "ruleParams"
    // InternalGoatInfrastructureParser.g:114:1: ruleParams : ( ( rule__Params__Group__0 ) ) ;
    public final void ruleParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:118:2: ( ( ( rule__Params__Group__0 ) ) )
            // InternalGoatInfrastructureParser.g:119:2: ( ( rule__Params__Group__0 ) )
            {
            // InternalGoatInfrastructureParser.g:119:2: ( ( rule__Params__Group__0 ) )
            // InternalGoatInfrastructureParser.g:120:3: ( rule__Params__Group__0 )
            {
             before(grammarAccess.getParamsAccess().getGroup()); 
            // InternalGoatInfrastructureParser.g:121:3: ( rule__Params__Group__0 )
            // InternalGoatInfrastructureParser.g:121:4: rule__Params__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleParam"
    // InternalGoatInfrastructureParser.g:130:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalGoatInfrastructureParser.g:131:1: ( ruleParam EOF )
            // InternalGoatInfrastructureParser.g:132:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalGoatInfrastructureParser.g:139:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:143:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalGoatInfrastructureParser.g:144:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalGoatInfrastructureParser.g:144:2: ( ( rule__Param__Group__0 ) )
            // InternalGoatInfrastructureParser.g:145:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalGoatInfrastructureParser.g:146:3: ( rule__Param__Group__0 )
            // InternalGoatInfrastructureParser.g:146:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "rule__SingleServer__Group__0"
    // InternalGoatInfrastructureParser.g:154:1: rule__SingleServer__Group__0 : rule__SingleServer__Group__0__Impl rule__SingleServer__Group__1 ;
    public final void rule__SingleServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:158:1: ( rule__SingleServer__Group__0__Impl rule__SingleServer__Group__1 )
            // InternalGoatInfrastructureParser.g:159:2: rule__SingleServer__Group__0__Impl rule__SingleServer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SingleServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleServer__Group__0"


    // $ANTLR start "rule__SingleServer__Group__0__Impl"
    // InternalGoatInfrastructureParser.g:166:1: rule__SingleServer__Group__0__Impl : ( Singleserver ) ;
    public final void rule__SingleServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:170:1: ( ( Singleserver ) )
            // InternalGoatInfrastructureParser.g:171:1: ( Singleserver )
            {
            // InternalGoatInfrastructureParser.g:171:1: ( Singleserver )
            // InternalGoatInfrastructureParser.g:172:2: Singleserver
            {
             before(grammarAccess.getSingleServerAccess().getSingleserverKeyword_0()); 
            match(input,Singleserver,FOLLOW_2); 
             after(grammarAccess.getSingleServerAccess().getSingleserverKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleServer__Group__0__Impl"


    // $ANTLR start "rule__SingleServer__Group__1"
    // InternalGoatInfrastructureParser.g:181:1: rule__SingleServer__Group__1 : rule__SingleServer__Group__1__Impl rule__SingleServer__Group__2 ;
    public final void rule__SingleServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:185:1: ( rule__SingleServer__Group__1__Impl rule__SingleServer__Group__2 )
            // InternalGoatInfrastructureParser.g:186:2: rule__SingleServer__Group__1__Impl rule__SingleServer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SingleServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleServer__Group__1"


    // $ANTLR start "rule__SingleServer__Group__1__Impl"
    // InternalGoatInfrastructureParser.g:193:1: rule__SingleServer__Group__1__Impl : ( ( rule__SingleServer__NameAssignment_1 ) ) ;
    public final void rule__SingleServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:197:1: ( ( ( rule__SingleServer__NameAssignment_1 ) ) )
            // InternalGoatInfrastructureParser.g:198:1: ( ( rule__SingleServer__NameAssignment_1 ) )
            {
            // InternalGoatInfrastructureParser.g:198:1: ( ( rule__SingleServer__NameAssignment_1 ) )
            // InternalGoatInfrastructureParser.g:199:2: ( rule__SingleServer__NameAssignment_1 )
            {
             before(grammarAccess.getSingleServerAccess().getNameAssignment_1()); 
            // InternalGoatInfrastructureParser.g:200:2: ( rule__SingleServer__NameAssignment_1 )
            // InternalGoatInfrastructureParser.g:200:3: rule__SingleServer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleServer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleServer__Group__1__Impl"


    // $ANTLR start "rule__SingleServer__Group__2"
    // InternalGoatInfrastructureParser.g:208:1: rule__SingleServer__Group__2 : rule__SingleServer__Group__2__Impl ;
    public final void rule__SingleServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:212:1: ( rule__SingleServer__Group__2__Impl )
            // InternalGoatInfrastructureParser.g:213:2: rule__SingleServer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleServer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleServer__Group__2"


    // $ANTLR start "rule__SingleServer__Group__2__Impl"
    // InternalGoatInfrastructureParser.g:219:1: rule__SingleServer__Group__2__Impl : ( ruleParams ) ;
    public final void rule__SingleServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:223:1: ( ( ruleParams ) )
            // InternalGoatInfrastructureParser.g:224:1: ( ruleParams )
            {
            // InternalGoatInfrastructureParser.g:224:1: ( ruleParams )
            // InternalGoatInfrastructureParser.g:225:2: ruleParams
            {
             before(grammarAccess.getSingleServerAccess().getParamsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleParams();

            state._fsp--;

             after(grammarAccess.getSingleServerAccess().getParamsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleServer__Group__2__Impl"


    // $ANTLR start "rule__Params__Group__0"
    // InternalGoatInfrastructureParser.g:235:1: rule__Params__Group__0 : rule__Params__Group__0__Impl rule__Params__Group__1 ;
    public final void rule__Params__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:239:1: ( rule__Params__Group__0__Impl rule__Params__Group__1 )
            // InternalGoatInfrastructureParser.g:240:2: rule__Params__Group__0__Impl rule__Params__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Params__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__0"


    // $ANTLR start "rule__Params__Group__0__Impl"
    // InternalGoatInfrastructureParser.g:247:1: rule__Params__Group__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Params__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:251:1: ( ( LeftCurlyBracket ) )
            // InternalGoatInfrastructureParser.g:252:1: ( LeftCurlyBracket )
            {
            // InternalGoatInfrastructureParser.g:252:1: ( LeftCurlyBracket )
            // InternalGoatInfrastructureParser.g:253:2: LeftCurlyBracket
            {
             before(grammarAccess.getParamsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__0__Impl"


    // $ANTLR start "rule__Params__Group__1"
    // InternalGoatInfrastructureParser.g:262:1: rule__Params__Group__1 : rule__Params__Group__1__Impl rule__Params__Group__2 ;
    public final void rule__Params__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:266:1: ( rule__Params__Group__1__Impl rule__Params__Group__2 )
            // InternalGoatInfrastructureParser.g:267:2: rule__Params__Group__1__Impl rule__Params__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Params__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__1"


    // $ANTLR start "rule__Params__Group__1__Impl"
    // InternalGoatInfrastructureParser.g:274:1: rule__Params__Group__1__Impl : ( ( rule__Params__Group_1__0 )? ) ;
    public final void rule__Params__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:278:1: ( ( ( rule__Params__Group_1__0 )? ) )
            // InternalGoatInfrastructureParser.g:279:1: ( ( rule__Params__Group_1__0 )? )
            {
            // InternalGoatInfrastructureParser.g:279:1: ( ( rule__Params__Group_1__0 )? )
            // InternalGoatInfrastructureParser.g:280:2: ( rule__Params__Group_1__0 )?
            {
             before(grammarAccess.getParamsAccess().getGroup_1()); 
            // InternalGoatInfrastructureParser.g:281:2: ( rule__Params__Group_1__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGoatInfrastructureParser.g:281:3: rule__Params__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Params__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParamsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__1__Impl"


    // $ANTLR start "rule__Params__Group__2"
    // InternalGoatInfrastructureParser.g:289:1: rule__Params__Group__2 : rule__Params__Group__2__Impl ;
    public final void rule__Params__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:293:1: ( rule__Params__Group__2__Impl )
            // InternalGoatInfrastructureParser.g:294:2: rule__Params__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__2"


    // $ANTLR start "rule__Params__Group__2__Impl"
    // InternalGoatInfrastructureParser.g:300:1: rule__Params__Group__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__Params__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:304:1: ( ( RightCurlyBracket ) )
            // InternalGoatInfrastructureParser.g:305:1: ( RightCurlyBracket )
            {
            // InternalGoatInfrastructureParser.g:305:1: ( RightCurlyBracket )
            // InternalGoatInfrastructureParser.g:306:2: RightCurlyBracket
            {
             before(grammarAccess.getParamsAccess().getRightCurlyBracketKeyword_2()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__2__Impl"


    // $ANTLR start "rule__Params__Group_1__0"
    // InternalGoatInfrastructureParser.g:316:1: rule__Params__Group_1__0 : rule__Params__Group_1__0__Impl rule__Params__Group_1__1 ;
    public final void rule__Params__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:320:1: ( rule__Params__Group_1__0__Impl rule__Params__Group_1__1 )
            // InternalGoatInfrastructureParser.g:321:2: rule__Params__Group_1__0__Impl rule__Params__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Params__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1__0"


    // $ANTLR start "rule__Params__Group_1__0__Impl"
    // InternalGoatInfrastructureParser.g:328:1: rule__Params__Group_1__0__Impl : ( ( rule__Params__Group_1_0__0 )* ) ;
    public final void rule__Params__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:332:1: ( ( ( rule__Params__Group_1_0__0 )* ) )
            // InternalGoatInfrastructureParser.g:333:1: ( ( rule__Params__Group_1_0__0 )* )
            {
            // InternalGoatInfrastructureParser.g:333:1: ( ( rule__Params__Group_1_0__0 )* )
            // InternalGoatInfrastructureParser.g:334:2: ( rule__Params__Group_1_0__0 )*
            {
             before(grammarAccess.getParamsAccess().getGroup_1_0()); 
            // InternalGoatInfrastructureParser.g:335:2: ( rule__Params__Group_1_0__0 )*
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
            	    // InternalGoatInfrastructureParser.g:335:3: rule__Params__Group_1_0__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Params__Group_1_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getParamsAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1__0__Impl"


    // $ANTLR start "rule__Params__Group_1__1"
    // InternalGoatInfrastructureParser.g:343:1: rule__Params__Group_1__1 : rule__Params__Group_1__1__Impl ;
    public final void rule__Params__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:347:1: ( rule__Params__Group_1__1__Impl )
            // InternalGoatInfrastructureParser.g:348:2: rule__Params__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1__1"


    // $ANTLR start "rule__Params__Group_1__1__Impl"
    // InternalGoatInfrastructureParser.g:354:1: rule__Params__Group_1__1__Impl : ( ( rule__Params__ParamsAssignment_1_1 ) ) ;
    public final void rule__Params__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:358:1: ( ( ( rule__Params__ParamsAssignment_1_1 ) ) )
            // InternalGoatInfrastructureParser.g:359:1: ( ( rule__Params__ParamsAssignment_1_1 ) )
            {
            // InternalGoatInfrastructureParser.g:359:1: ( ( rule__Params__ParamsAssignment_1_1 ) )
            // InternalGoatInfrastructureParser.g:360:2: ( rule__Params__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getParamsAccess().getParamsAssignment_1_1()); 
            // InternalGoatInfrastructureParser.g:361:2: ( rule__Params__ParamsAssignment_1_1 )
            // InternalGoatInfrastructureParser.g:361:3: rule__Params__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Params__ParamsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getParamsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1__1__Impl"


    // $ANTLR start "rule__Params__Group_1_0__0"
    // InternalGoatInfrastructureParser.g:370:1: rule__Params__Group_1_0__0 : rule__Params__Group_1_0__0__Impl rule__Params__Group_1_0__1 ;
    public final void rule__Params__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:374:1: ( rule__Params__Group_1_0__0__Impl rule__Params__Group_1_0__1 )
            // InternalGoatInfrastructureParser.g:375:2: rule__Params__Group_1_0__0__Impl rule__Params__Group_1_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Params__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1_0__0"


    // $ANTLR start "rule__Params__Group_1_0__0__Impl"
    // InternalGoatInfrastructureParser.g:382:1: rule__Params__Group_1_0__0__Impl : ( ( rule__Params__ParamsAssignment_1_0_0 ) ) ;
    public final void rule__Params__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:386:1: ( ( ( rule__Params__ParamsAssignment_1_0_0 ) ) )
            // InternalGoatInfrastructureParser.g:387:1: ( ( rule__Params__ParamsAssignment_1_0_0 ) )
            {
            // InternalGoatInfrastructureParser.g:387:1: ( ( rule__Params__ParamsAssignment_1_0_0 ) )
            // InternalGoatInfrastructureParser.g:388:2: ( rule__Params__ParamsAssignment_1_0_0 )
            {
             before(grammarAccess.getParamsAccess().getParamsAssignment_1_0_0()); 
            // InternalGoatInfrastructureParser.g:389:2: ( rule__Params__ParamsAssignment_1_0_0 )
            // InternalGoatInfrastructureParser.g:389:3: rule__Params__ParamsAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Params__ParamsAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getParamsAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1_0__0__Impl"


    // $ANTLR start "rule__Params__Group_1_0__1"
    // InternalGoatInfrastructureParser.g:397:1: rule__Params__Group_1_0__1 : rule__Params__Group_1_0__1__Impl ;
    public final void rule__Params__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:401:1: ( rule__Params__Group_1_0__1__Impl )
            // InternalGoatInfrastructureParser.g:402:2: rule__Params__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1_0__1"


    // $ANTLR start "rule__Params__Group_1_0__1__Impl"
    // InternalGoatInfrastructureParser.g:408:1: rule__Params__Group_1_0__1__Impl : ( Comma ) ;
    public final void rule__Params__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:412:1: ( ( Comma ) )
            // InternalGoatInfrastructureParser.g:413:1: ( Comma )
            {
            // InternalGoatInfrastructureParser.g:413:1: ( Comma )
            // InternalGoatInfrastructureParser.g:414:2: Comma
            {
             before(grammarAccess.getParamsAccess().getCommaKeyword_1_0_1()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getCommaKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1_0__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalGoatInfrastructureParser.g:424:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:428:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalGoatInfrastructureParser.g:429:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalGoatInfrastructureParser.g:436:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:440:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // InternalGoatInfrastructureParser.g:441:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // InternalGoatInfrastructureParser.g:441:1: ( ( rule__Param__NameAssignment_0 ) )
            // InternalGoatInfrastructureParser.g:442:2: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // InternalGoatInfrastructureParser.g:443:2: ( rule__Param__NameAssignment_0 )
            // InternalGoatInfrastructureParser.g:443:3: rule__Param__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalGoatInfrastructureParser.g:451:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:455:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalGoatInfrastructureParser.g:456:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalGoatInfrastructureParser.g:463:1: rule__Param__Group__1__Impl : ( Colon ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:467:1: ( ( Colon ) )
            // InternalGoatInfrastructureParser.g:468:1: ( Colon )
            {
            // InternalGoatInfrastructureParser.g:468:1: ( Colon )
            // InternalGoatInfrastructureParser.g:469:2: Colon
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Param__Group__2"
    // InternalGoatInfrastructureParser.g:478:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:482:1: ( rule__Param__Group__2__Impl )
            // InternalGoatInfrastructureParser.g:483:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__2"


    // $ANTLR start "rule__Param__Group__2__Impl"
    // InternalGoatInfrastructureParser.g:489:1: rule__Param__Group__2__Impl : ( ( rule__Param__ValueAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:493:1: ( ( ( rule__Param__ValueAssignment_2 ) ) )
            // InternalGoatInfrastructureParser.g:494:1: ( ( rule__Param__ValueAssignment_2 ) )
            {
            // InternalGoatInfrastructureParser.g:494:1: ( ( rule__Param__ValueAssignment_2 ) )
            // InternalGoatInfrastructureParser.g:495:2: ( rule__Param__ValueAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getValueAssignment_2()); 
            // InternalGoatInfrastructureParser.g:496:2: ( rule__Param__ValueAssignment_2 )
            // InternalGoatInfrastructureParser.g:496:3: rule__Param__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Param__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__2__Impl"


    // $ANTLR start "rule__SingleServer__NameAssignment_1"
    // InternalGoatInfrastructureParser.g:505:1: rule__SingleServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SingleServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:509:1: ( ( RULE_ID ) )
            // InternalGoatInfrastructureParser.g:510:2: ( RULE_ID )
            {
            // InternalGoatInfrastructureParser.g:510:2: ( RULE_ID )
            // InternalGoatInfrastructureParser.g:511:3: RULE_ID
            {
             before(grammarAccess.getSingleServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleServerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleServer__NameAssignment_1"


    // $ANTLR start "rule__Params__ParamsAssignment_1_0_0"
    // InternalGoatInfrastructureParser.g:520:1: rule__Params__ParamsAssignment_1_0_0 : ( ruleParam ) ;
    public final void rule__Params__ParamsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:524:1: ( ( ruleParam ) )
            // InternalGoatInfrastructureParser.g:525:2: ( ruleParam )
            {
            // InternalGoatInfrastructureParser.g:525:2: ( ruleParam )
            // InternalGoatInfrastructureParser.g:526:3: ruleParam
            {
             before(grammarAccess.getParamsAccess().getParamsParamParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamsAccess().getParamsParamParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__ParamsAssignment_1_0_0"


    // $ANTLR start "rule__Params__ParamsAssignment_1_1"
    // InternalGoatInfrastructureParser.g:535:1: rule__Params__ParamsAssignment_1_1 : ( ruleParam ) ;
    public final void rule__Params__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:539:1: ( ( ruleParam ) )
            // InternalGoatInfrastructureParser.g:540:2: ( ruleParam )
            {
            // InternalGoatInfrastructureParser.g:540:2: ( ruleParam )
            // InternalGoatInfrastructureParser.g:541:3: ruleParam
            {
             before(grammarAccess.getParamsAccess().getParamsParamParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamsAccess().getParamsParamParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__ParamsAssignment_1_1"


    // $ANTLR start "rule__Param__NameAssignment_0"
    // InternalGoatInfrastructureParser.g:550:1: rule__Param__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:554:1: ( ( RULE_ID ) )
            // InternalGoatInfrastructureParser.g:555:2: ( RULE_ID )
            {
            // InternalGoatInfrastructureParser.g:555:2: ( RULE_ID )
            // InternalGoatInfrastructureParser.g:556:3: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__NameAssignment_0"


    // $ANTLR start "rule__Param__ValueAssignment_2"
    // InternalGoatInfrastructureParser.g:565:1: rule__Param__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Param__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:569:1: ( ( RULE_STRING ) )
            // InternalGoatInfrastructureParser.g:570:2: ( RULE_STRING )
            {
            // InternalGoatInfrastructureParser.g:570:2: ( RULE_STRING )
            // InternalGoatInfrastructureParser.g:571:3: RULE_STRING
            {
             before(grammarAccess.getParamAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});

}