package com.sysma.goat.eclipse_plugin.ide.contentassist.antlr.internal;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'singleserver'", "'{'", "'}'", "','", "':'"
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

    	public void setGrammarAccess(GoatInfrastructureGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInfrastructure"
    // InternalGoatInfrastructure.g:53:1: entryRuleInfrastructure : ruleInfrastructure EOF ;
    public final void entryRuleInfrastructure() throws RecognitionException {
        try {
            // InternalGoatInfrastructure.g:54:1: ( ruleInfrastructure EOF )
            // InternalGoatInfrastructure.g:55:1: ruleInfrastructure EOF
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
    // InternalGoatInfrastructure.g:62:1: ruleInfrastructure : ( ruleSingleServer ) ;
    public final void ruleInfrastructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:66:2: ( ( ruleSingleServer ) )
            // InternalGoatInfrastructure.g:67:2: ( ruleSingleServer )
            {
            // InternalGoatInfrastructure.g:67:2: ( ruleSingleServer )
            // InternalGoatInfrastructure.g:68:3: ruleSingleServer
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
    // InternalGoatInfrastructure.g:78:1: entryRuleSingleServer : ruleSingleServer EOF ;
    public final void entryRuleSingleServer() throws RecognitionException {
        try {
            // InternalGoatInfrastructure.g:79:1: ( ruleSingleServer EOF )
            // InternalGoatInfrastructure.g:80:1: ruleSingleServer EOF
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
    // InternalGoatInfrastructure.g:87:1: ruleSingleServer : ( ( rule__SingleServer__Group__0 ) ) ;
    public final void ruleSingleServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:91:2: ( ( ( rule__SingleServer__Group__0 ) ) )
            // InternalGoatInfrastructure.g:92:2: ( ( rule__SingleServer__Group__0 ) )
            {
            // InternalGoatInfrastructure.g:92:2: ( ( rule__SingleServer__Group__0 ) )
            // InternalGoatInfrastructure.g:93:3: ( rule__SingleServer__Group__0 )
            {
             before(grammarAccess.getSingleServerAccess().getGroup()); 
            // InternalGoatInfrastructure.g:94:3: ( rule__SingleServer__Group__0 )
            // InternalGoatInfrastructure.g:94:4: rule__SingleServer__Group__0
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
    // InternalGoatInfrastructure.g:104:1: ruleParams : ( ( rule__Params__Group__0 ) ) ;
    public final void ruleParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:108:2: ( ( ( rule__Params__Group__0 ) ) )
            // InternalGoatInfrastructure.g:109:2: ( ( rule__Params__Group__0 ) )
            {
            // InternalGoatInfrastructure.g:109:2: ( ( rule__Params__Group__0 ) )
            // InternalGoatInfrastructure.g:110:3: ( rule__Params__Group__0 )
            {
             before(grammarAccess.getParamsAccess().getGroup()); 
            // InternalGoatInfrastructure.g:111:3: ( rule__Params__Group__0 )
            // InternalGoatInfrastructure.g:111:4: rule__Params__Group__0
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
    // InternalGoatInfrastructure.g:120:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalGoatInfrastructure.g:121:1: ( ruleParam EOF )
            // InternalGoatInfrastructure.g:122:1: ruleParam EOF
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
    // InternalGoatInfrastructure.g:129:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:133:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalGoatInfrastructure.g:134:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalGoatInfrastructure.g:134:2: ( ( rule__Param__Group__0 ) )
            // InternalGoatInfrastructure.g:135:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalGoatInfrastructure.g:136:3: ( rule__Param__Group__0 )
            // InternalGoatInfrastructure.g:136:4: rule__Param__Group__0
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
    // InternalGoatInfrastructure.g:144:1: rule__SingleServer__Group__0 : rule__SingleServer__Group__0__Impl rule__SingleServer__Group__1 ;
    public final void rule__SingleServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:148:1: ( rule__SingleServer__Group__0__Impl rule__SingleServer__Group__1 )
            // InternalGoatInfrastructure.g:149:2: rule__SingleServer__Group__0__Impl rule__SingleServer__Group__1
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
    // InternalGoatInfrastructure.g:156:1: rule__SingleServer__Group__0__Impl : ( 'singleserver' ) ;
    public final void rule__SingleServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:160:1: ( ( 'singleserver' ) )
            // InternalGoatInfrastructure.g:161:1: ( 'singleserver' )
            {
            // InternalGoatInfrastructure.g:161:1: ( 'singleserver' )
            // InternalGoatInfrastructure.g:162:2: 'singleserver'
            {
             before(grammarAccess.getSingleServerAccess().getSingleserverKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalGoatInfrastructure.g:171:1: rule__SingleServer__Group__1 : rule__SingleServer__Group__1__Impl rule__SingleServer__Group__2 ;
    public final void rule__SingleServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:175:1: ( rule__SingleServer__Group__1__Impl rule__SingleServer__Group__2 )
            // InternalGoatInfrastructure.g:176:2: rule__SingleServer__Group__1__Impl rule__SingleServer__Group__2
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
    // InternalGoatInfrastructure.g:183:1: rule__SingleServer__Group__1__Impl : ( ( rule__SingleServer__NameAssignment_1 ) ) ;
    public final void rule__SingleServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:187:1: ( ( ( rule__SingleServer__NameAssignment_1 ) ) )
            // InternalGoatInfrastructure.g:188:1: ( ( rule__SingleServer__NameAssignment_1 ) )
            {
            // InternalGoatInfrastructure.g:188:1: ( ( rule__SingleServer__NameAssignment_1 ) )
            // InternalGoatInfrastructure.g:189:2: ( rule__SingleServer__NameAssignment_1 )
            {
             before(grammarAccess.getSingleServerAccess().getNameAssignment_1()); 
            // InternalGoatInfrastructure.g:190:2: ( rule__SingleServer__NameAssignment_1 )
            // InternalGoatInfrastructure.g:190:3: rule__SingleServer__NameAssignment_1
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
    // InternalGoatInfrastructure.g:198:1: rule__SingleServer__Group__2 : rule__SingleServer__Group__2__Impl ;
    public final void rule__SingleServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:202:1: ( rule__SingleServer__Group__2__Impl )
            // InternalGoatInfrastructure.g:203:2: rule__SingleServer__Group__2__Impl
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
    // InternalGoatInfrastructure.g:209:1: rule__SingleServer__Group__2__Impl : ( ruleParams ) ;
    public final void rule__SingleServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:213:1: ( ( ruleParams ) )
            // InternalGoatInfrastructure.g:214:1: ( ruleParams )
            {
            // InternalGoatInfrastructure.g:214:1: ( ruleParams )
            // InternalGoatInfrastructure.g:215:2: ruleParams
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
    // InternalGoatInfrastructure.g:225:1: rule__Params__Group__0 : rule__Params__Group__0__Impl rule__Params__Group__1 ;
    public final void rule__Params__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:229:1: ( rule__Params__Group__0__Impl rule__Params__Group__1 )
            // InternalGoatInfrastructure.g:230:2: rule__Params__Group__0__Impl rule__Params__Group__1
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
    // InternalGoatInfrastructure.g:237:1: rule__Params__Group__0__Impl : ( '{' ) ;
    public final void rule__Params__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:241:1: ( ( '{' ) )
            // InternalGoatInfrastructure.g:242:1: ( '{' )
            {
            // InternalGoatInfrastructure.g:242:1: ( '{' )
            // InternalGoatInfrastructure.g:243:2: '{'
            {
             before(grammarAccess.getParamsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGoatInfrastructure.g:252:1: rule__Params__Group__1 : rule__Params__Group__1__Impl rule__Params__Group__2 ;
    public final void rule__Params__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:256:1: ( rule__Params__Group__1__Impl rule__Params__Group__2 )
            // InternalGoatInfrastructure.g:257:2: rule__Params__Group__1__Impl rule__Params__Group__2
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
    // InternalGoatInfrastructure.g:264:1: rule__Params__Group__1__Impl : ( ( rule__Params__Group_1__0 )? ) ;
    public final void rule__Params__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:268:1: ( ( ( rule__Params__Group_1__0 )? ) )
            // InternalGoatInfrastructure.g:269:1: ( ( rule__Params__Group_1__0 )? )
            {
            // InternalGoatInfrastructure.g:269:1: ( ( rule__Params__Group_1__0 )? )
            // InternalGoatInfrastructure.g:270:2: ( rule__Params__Group_1__0 )?
            {
             before(grammarAccess.getParamsAccess().getGroup_1()); 
            // InternalGoatInfrastructure.g:271:2: ( rule__Params__Group_1__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGoatInfrastructure.g:271:3: rule__Params__Group_1__0
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
    // InternalGoatInfrastructure.g:279:1: rule__Params__Group__2 : rule__Params__Group__2__Impl ;
    public final void rule__Params__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:283:1: ( rule__Params__Group__2__Impl )
            // InternalGoatInfrastructure.g:284:2: rule__Params__Group__2__Impl
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
    // InternalGoatInfrastructure.g:290:1: rule__Params__Group__2__Impl : ( '}' ) ;
    public final void rule__Params__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:294:1: ( ( '}' ) )
            // InternalGoatInfrastructure.g:295:1: ( '}' )
            {
            // InternalGoatInfrastructure.g:295:1: ( '}' )
            // InternalGoatInfrastructure.g:296:2: '}'
            {
             before(grammarAccess.getParamsAccess().getRightCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGoatInfrastructure.g:306:1: rule__Params__Group_1__0 : rule__Params__Group_1__0__Impl rule__Params__Group_1__1 ;
    public final void rule__Params__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:310:1: ( rule__Params__Group_1__0__Impl rule__Params__Group_1__1 )
            // InternalGoatInfrastructure.g:311:2: rule__Params__Group_1__0__Impl rule__Params__Group_1__1
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
    // InternalGoatInfrastructure.g:318:1: rule__Params__Group_1__0__Impl : ( ( rule__Params__Group_1_0__0 )* ) ;
    public final void rule__Params__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:322:1: ( ( ( rule__Params__Group_1_0__0 )* ) )
            // InternalGoatInfrastructure.g:323:1: ( ( rule__Params__Group_1_0__0 )* )
            {
            // InternalGoatInfrastructure.g:323:1: ( ( rule__Params__Group_1_0__0 )* )
            // InternalGoatInfrastructure.g:324:2: ( rule__Params__Group_1_0__0 )*
            {
             before(grammarAccess.getParamsAccess().getGroup_1_0()); 
            // InternalGoatInfrastructure.g:325:2: ( rule__Params__Group_1_0__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==15) ) {
                        int LA2_2 = input.LA(3);

                        if ( (LA2_2==RULE_STRING) ) {
                            int LA2_3 = input.LA(4);

                            if ( (LA2_3==14) ) {
                                alt2=1;
                            }


                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalGoatInfrastructure.g:325:3: rule__Params__Group_1_0__0
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
    // InternalGoatInfrastructure.g:333:1: rule__Params__Group_1__1 : rule__Params__Group_1__1__Impl ;
    public final void rule__Params__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:337:1: ( rule__Params__Group_1__1__Impl )
            // InternalGoatInfrastructure.g:338:2: rule__Params__Group_1__1__Impl
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
    // InternalGoatInfrastructure.g:344:1: rule__Params__Group_1__1__Impl : ( ( rule__Params__ParamsAssignment_1_1 ) ) ;
    public final void rule__Params__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:348:1: ( ( ( rule__Params__ParamsAssignment_1_1 ) ) )
            // InternalGoatInfrastructure.g:349:1: ( ( rule__Params__ParamsAssignment_1_1 ) )
            {
            // InternalGoatInfrastructure.g:349:1: ( ( rule__Params__ParamsAssignment_1_1 ) )
            // InternalGoatInfrastructure.g:350:2: ( rule__Params__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getParamsAccess().getParamsAssignment_1_1()); 
            // InternalGoatInfrastructure.g:351:2: ( rule__Params__ParamsAssignment_1_1 )
            // InternalGoatInfrastructure.g:351:3: rule__Params__ParamsAssignment_1_1
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
    // InternalGoatInfrastructure.g:360:1: rule__Params__Group_1_0__0 : rule__Params__Group_1_0__0__Impl rule__Params__Group_1_0__1 ;
    public final void rule__Params__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:364:1: ( rule__Params__Group_1_0__0__Impl rule__Params__Group_1_0__1 )
            // InternalGoatInfrastructure.g:365:2: rule__Params__Group_1_0__0__Impl rule__Params__Group_1_0__1
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
    // InternalGoatInfrastructure.g:372:1: rule__Params__Group_1_0__0__Impl : ( ( rule__Params__ParamsAssignment_1_0_0 ) ) ;
    public final void rule__Params__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:376:1: ( ( ( rule__Params__ParamsAssignment_1_0_0 ) ) )
            // InternalGoatInfrastructure.g:377:1: ( ( rule__Params__ParamsAssignment_1_0_0 ) )
            {
            // InternalGoatInfrastructure.g:377:1: ( ( rule__Params__ParamsAssignment_1_0_0 ) )
            // InternalGoatInfrastructure.g:378:2: ( rule__Params__ParamsAssignment_1_0_0 )
            {
             before(grammarAccess.getParamsAccess().getParamsAssignment_1_0_0()); 
            // InternalGoatInfrastructure.g:379:2: ( rule__Params__ParamsAssignment_1_0_0 )
            // InternalGoatInfrastructure.g:379:3: rule__Params__ParamsAssignment_1_0_0
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
    // InternalGoatInfrastructure.g:387:1: rule__Params__Group_1_0__1 : rule__Params__Group_1_0__1__Impl ;
    public final void rule__Params__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:391:1: ( rule__Params__Group_1_0__1__Impl )
            // InternalGoatInfrastructure.g:392:2: rule__Params__Group_1_0__1__Impl
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
    // InternalGoatInfrastructure.g:398:1: rule__Params__Group_1_0__1__Impl : ( ',' ) ;
    public final void rule__Params__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:402:1: ( ( ',' ) )
            // InternalGoatInfrastructure.g:403:1: ( ',' )
            {
            // InternalGoatInfrastructure.g:403:1: ( ',' )
            // InternalGoatInfrastructure.g:404:2: ','
            {
             before(grammarAccess.getParamsAccess().getCommaKeyword_1_0_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGoatInfrastructure.g:414:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:418:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalGoatInfrastructure.g:419:2: rule__Param__Group__0__Impl rule__Param__Group__1
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
    // InternalGoatInfrastructure.g:426:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:430:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // InternalGoatInfrastructure.g:431:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // InternalGoatInfrastructure.g:431:1: ( ( rule__Param__NameAssignment_0 ) )
            // InternalGoatInfrastructure.g:432:2: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // InternalGoatInfrastructure.g:433:2: ( rule__Param__NameAssignment_0 )
            // InternalGoatInfrastructure.g:433:3: rule__Param__NameAssignment_0
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
    // InternalGoatInfrastructure.g:441:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:445:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalGoatInfrastructure.g:446:2: rule__Param__Group__1__Impl rule__Param__Group__2
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
    // InternalGoatInfrastructure.g:453:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:457:1: ( ( ':' ) )
            // InternalGoatInfrastructure.g:458:1: ( ':' )
            {
            // InternalGoatInfrastructure.g:458:1: ( ':' )
            // InternalGoatInfrastructure.g:459:2: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGoatInfrastructure.g:468:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:472:1: ( rule__Param__Group__2__Impl )
            // InternalGoatInfrastructure.g:473:2: rule__Param__Group__2__Impl
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
    // InternalGoatInfrastructure.g:479:1: rule__Param__Group__2__Impl : ( ( rule__Param__ValueAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:483:1: ( ( ( rule__Param__ValueAssignment_2 ) ) )
            // InternalGoatInfrastructure.g:484:1: ( ( rule__Param__ValueAssignment_2 ) )
            {
            // InternalGoatInfrastructure.g:484:1: ( ( rule__Param__ValueAssignment_2 ) )
            // InternalGoatInfrastructure.g:485:2: ( rule__Param__ValueAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getValueAssignment_2()); 
            // InternalGoatInfrastructure.g:486:2: ( rule__Param__ValueAssignment_2 )
            // InternalGoatInfrastructure.g:486:3: rule__Param__ValueAssignment_2
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
    // InternalGoatInfrastructure.g:495:1: rule__SingleServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SingleServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:499:1: ( ( RULE_ID ) )
            // InternalGoatInfrastructure.g:500:2: ( RULE_ID )
            {
            // InternalGoatInfrastructure.g:500:2: ( RULE_ID )
            // InternalGoatInfrastructure.g:501:3: RULE_ID
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
    // InternalGoatInfrastructure.g:510:1: rule__Params__ParamsAssignment_1_0_0 : ( ruleParam ) ;
    public final void rule__Params__ParamsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:514:1: ( ( ruleParam ) )
            // InternalGoatInfrastructure.g:515:2: ( ruleParam )
            {
            // InternalGoatInfrastructure.g:515:2: ( ruleParam )
            // InternalGoatInfrastructure.g:516:3: ruleParam
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
    // InternalGoatInfrastructure.g:525:1: rule__Params__ParamsAssignment_1_1 : ( ruleParam ) ;
    public final void rule__Params__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:529:1: ( ( ruleParam ) )
            // InternalGoatInfrastructure.g:530:2: ( ruleParam )
            {
            // InternalGoatInfrastructure.g:530:2: ( ruleParam )
            // InternalGoatInfrastructure.g:531:3: ruleParam
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
    // InternalGoatInfrastructure.g:540:1: rule__Param__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:544:1: ( ( RULE_ID ) )
            // InternalGoatInfrastructure.g:545:2: ( RULE_ID )
            {
            // InternalGoatInfrastructure.g:545:2: ( RULE_ID )
            // InternalGoatInfrastructure.g:546:3: RULE_ID
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
    // InternalGoatInfrastructure.g:555:1: rule__Param__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Param__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructure.g:559:1: ( ( RULE_STRING ) )
            // InternalGoatInfrastructure.g:560:2: ( RULE_STRING )
            {
            // InternalGoatInfrastructure.g:560:2: ( RULE_STRING )
            // InternalGoatInfrastructure.g:561:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});

}