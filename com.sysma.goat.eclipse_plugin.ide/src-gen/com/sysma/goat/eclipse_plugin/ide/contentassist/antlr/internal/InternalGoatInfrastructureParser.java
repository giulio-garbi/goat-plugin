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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("External", "'external'");
    		tokenNameToValue.put("SingleServer", "'singleServer'");
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
    // InternalGoatInfrastructureParser.g:61:1: entryRuleInfrastructure : ruleInfrastructure EOF ;
    public final void entryRuleInfrastructure() throws RecognitionException {
        try {
            // InternalGoatInfrastructureParser.g:62:1: ( ruleInfrastructure EOF )
            // InternalGoatInfrastructureParser.g:63:1: ruleInfrastructure EOF
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
    // InternalGoatInfrastructureParser.g:70:1: ruleInfrastructure : ( ruleSingleServer ) ;
    public final void ruleInfrastructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:74:2: ( ( ruleSingleServer ) )
            // InternalGoatInfrastructureParser.g:75:2: ( ruleSingleServer )
            {
            // InternalGoatInfrastructureParser.g:75:2: ( ruleSingleServer )
            // InternalGoatInfrastructureParser.g:76:3: ruleSingleServer
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
    // InternalGoatInfrastructureParser.g:86:1: entryRuleSingleServer : ruleSingleServer EOF ;
    public final void entryRuleSingleServer() throws RecognitionException {
        try {
            // InternalGoatInfrastructureParser.g:87:1: ( ruleSingleServer EOF )
            // InternalGoatInfrastructureParser.g:88:1: ruleSingleServer EOF
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
    // InternalGoatInfrastructureParser.g:95:1: ruleSingleServer : ( ( rule__SingleServer__Group__0 ) ) ;
    public final void ruleSingleServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:99:2: ( ( ( rule__SingleServer__Group__0 ) ) )
            // InternalGoatInfrastructureParser.g:100:2: ( ( rule__SingleServer__Group__0 ) )
            {
            // InternalGoatInfrastructureParser.g:100:2: ( ( rule__SingleServer__Group__0 ) )
            // InternalGoatInfrastructureParser.g:101:3: ( rule__SingleServer__Group__0 )
            {
             before(grammarAccess.getSingleServerAccess().getGroup()); 
            // InternalGoatInfrastructureParser.g:102:3: ( rule__SingleServer__Group__0 )
            // InternalGoatInfrastructureParser.g:102:4: rule__SingleServer__Group__0
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


    // $ANTLR start "entryRuleParams"
    // InternalGoatInfrastructureParser.g:111:1: entryRuleParams : ruleParams EOF ;
    public final void entryRuleParams() throws RecognitionException {
        try {
            // InternalGoatInfrastructureParser.g:112:1: ( ruleParams EOF )
            // InternalGoatInfrastructureParser.g:113:1: ruleParams EOF
            {
             before(grammarAccess.getParamsRule()); 
            pushFollow(FOLLOW_1);
            ruleParams();

            state._fsp--;

             after(grammarAccess.getParamsRule()); 
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
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // InternalGoatInfrastructureParser.g:120:1: ruleParams : ( ( rule__Params__Group__0 ) ) ;
    public final void ruleParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:124:2: ( ( ( rule__Params__Group__0 ) ) )
            // InternalGoatInfrastructureParser.g:125:2: ( ( rule__Params__Group__0 ) )
            {
            // InternalGoatInfrastructureParser.g:125:2: ( ( rule__Params__Group__0 ) )
            // InternalGoatInfrastructureParser.g:126:3: ( rule__Params__Group__0 )
            {
             before(grammarAccess.getParamsAccess().getGroup()); 
            // InternalGoatInfrastructureParser.g:127:3: ( rule__Params__Group__0 )
            // InternalGoatInfrastructureParser.g:127:4: rule__Params__Group__0
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


    // $ANTLR start "rule__SingleServer__Group__0"
    // InternalGoatInfrastructureParser.g:135:1: rule__SingleServer__Group__0 : rule__SingleServer__Group__0__Impl rule__SingleServer__Group__1 ;
    public final void rule__SingleServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:139:1: ( rule__SingleServer__Group__0__Impl rule__SingleServer__Group__1 )
            // InternalGoatInfrastructureParser.g:140:2: rule__SingleServer__Group__0__Impl rule__SingleServer__Group__1
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
    // InternalGoatInfrastructureParser.g:147:1: rule__SingleServer__Group__0__Impl : ( ( rule__SingleServer__ExternalAssignment_0 )? ) ;
    public final void rule__SingleServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:151:1: ( ( ( rule__SingleServer__ExternalAssignment_0 )? ) )
            // InternalGoatInfrastructureParser.g:152:1: ( ( rule__SingleServer__ExternalAssignment_0 )? )
            {
            // InternalGoatInfrastructureParser.g:152:1: ( ( rule__SingleServer__ExternalAssignment_0 )? )
            // InternalGoatInfrastructureParser.g:153:2: ( rule__SingleServer__ExternalAssignment_0 )?
            {
             before(grammarAccess.getSingleServerAccess().getExternalAssignment_0()); 
            // InternalGoatInfrastructureParser.g:154:2: ( rule__SingleServer__ExternalAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==External) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGoatInfrastructureParser.g:154:3: rule__SingleServer__ExternalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleServer__ExternalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleServerAccess().getExternalAssignment_0()); 

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
    // InternalGoatInfrastructureParser.g:162:1: rule__SingleServer__Group__1 : rule__SingleServer__Group__1__Impl rule__SingleServer__Group__2 ;
    public final void rule__SingleServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:166:1: ( rule__SingleServer__Group__1__Impl rule__SingleServer__Group__2 )
            // InternalGoatInfrastructureParser.g:167:2: rule__SingleServer__Group__1__Impl rule__SingleServer__Group__2
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
    // InternalGoatInfrastructureParser.g:174:1: rule__SingleServer__Group__1__Impl : ( SingleServer ) ;
    public final void rule__SingleServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:178:1: ( ( SingleServer ) )
            // InternalGoatInfrastructureParser.g:179:1: ( SingleServer )
            {
            // InternalGoatInfrastructureParser.g:179:1: ( SingleServer )
            // InternalGoatInfrastructureParser.g:180:2: SingleServer
            {
             before(grammarAccess.getSingleServerAccess().getSingleServerKeyword_1()); 
            match(input,SingleServer,FOLLOW_2); 
             after(grammarAccess.getSingleServerAccess().getSingleServerKeyword_1()); 

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
    // InternalGoatInfrastructureParser.g:189:1: rule__SingleServer__Group__2 : rule__SingleServer__Group__2__Impl ;
    public final void rule__SingleServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:193:1: ( rule__SingleServer__Group__2__Impl )
            // InternalGoatInfrastructureParser.g:194:2: rule__SingleServer__Group__2__Impl
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
    // InternalGoatInfrastructureParser.g:200:1: rule__SingleServer__Group__2__Impl : ( ( rule__SingleServer__ParamsAssignment_2 ) ) ;
    public final void rule__SingleServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:204:1: ( ( ( rule__SingleServer__ParamsAssignment_2 ) ) )
            // InternalGoatInfrastructureParser.g:205:1: ( ( rule__SingleServer__ParamsAssignment_2 ) )
            {
            // InternalGoatInfrastructureParser.g:205:1: ( ( rule__SingleServer__ParamsAssignment_2 ) )
            // InternalGoatInfrastructureParser.g:206:2: ( rule__SingleServer__ParamsAssignment_2 )
            {
             before(grammarAccess.getSingleServerAccess().getParamsAssignment_2()); 
            // InternalGoatInfrastructureParser.g:207:2: ( rule__SingleServer__ParamsAssignment_2 )
            // InternalGoatInfrastructureParser.g:207:3: rule__SingleServer__ParamsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleServer__ParamsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleServerAccess().getParamsAssignment_2()); 

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
    // InternalGoatInfrastructureParser.g:216:1: rule__Params__Group__0 : rule__Params__Group__0__Impl rule__Params__Group__1 ;
    public final void rule__Params__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:220:1: ( rule__Params__Group__0__Impl rule__Params__Group__1 )
            // InternalGoatInfrastructureParser.g:221:2: rule__Params__Group__0__Impl rule__Params__Group__1
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
    // InternalGoatInfrastructureParser.g:228:1: rule__Params__Group__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Params__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:232:1: ( ( LeftCurlyBracket ) )
            // InternalGoatInfrastructureParser.g:233:1: ( LeftCurlyBracket )
            {
            // InternalGoatInfrastructureParser.g:233:1: ( LeftCurlyBracket )
            // InternalGoatInfrastructureParser.g:234:2: LeftCurlyBracket
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
    // InternalGoatInfrastructureParser.g:243:1: rule__Params__Group__1 : rule__Params__Group__1__Impl rule__Params__Group__2 ;
    public final void rule__Params__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:247:1: ( rule__Params__Group__1__Impl rule__Params__Group__2 )
            // InternalGoatInfrastructureParser.g:248:2: rule__Params__Group__1__Impl rule__Params__Group__2
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
    // InternalGoatInfrastructureParser.g:255:1: rule__Params__Group__1__Impl : ( () ) ;
    public final void rule__Params__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:259:1: ( ( () ) )
            // InternalGoatInfrastructureParser.g:260:1: ( () )
            {
            // InternalGoatInfrastructureParser.g:260:1: ( () )
            // InternalGoatInfrastructureParser.g:261:2: ()
            {
             before(grammarAccess.getParamsAccess().getParamsAction_1()); 
            // InternalGoatInfrastructureParser.g:262:2: ()
            // InternalGoatInfrastructureParser.g:262:3: 
            {
            }

             after(grammarAccess.getParamsAccess().getParamsAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__1__Impl"


    // $ANTLR start "rule__Params__Group__2"
    // InternalGoatInfrastructureParser.g:270:1: rule__Params__Group__2 : rule__Params__Group__2__Impl rule__Params__Group__3 ;
    public final void rule__Params__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:274:1: ( rule__Params__Group__2__Impl rule__Params__Group__3 )
            // InternalGoatInfrastructureParser.g:275:2: rule__Params__Group__2__Impl rule__Params__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Params__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group__3();

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
    // InternalGoatInfrastructureParser.g:282:1: rule__Params__Group__2__Impl : ( ( rule__Params__Group_2__0 )? ) ;
    public final void rule__Params__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:286:1: ( ( ( rule__Params__Group_2__0 )? ) )
            // InternalGoatInfrastructureParser.g:287:1: ( ( rule__Params__Group_2__0 )? )
            {
            // InternalGoatInfrastructureParser.g:287:1: ( ( rule__Params__Group_2__0 )? )
            // InternalGoatInfrastructureParser.g:288:2: ( rule__Params__Group_2__0 )?
            {
             before(grammarAccess.getParamsAccess().getGroup_2()); 
            // InternalGoatInfrastructureParser.g:289:2: ( rule__Params__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatInfrastructureParser.g:289:3: rule__Params__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Params__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParamsAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Params__Group__3"
    // InternalGoatInfrastructureParser.g:297:1: rule__Params__Group__3 : rule__Params__Group__3__Impl ;
    public final void rule__Params__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:301:1: ( rule__Params__Group__3__Impl )
            // InternalGoatInfrastructureParser.g:302:2: rule__Params__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group__3__Impl();

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
    // $ANTLR end "rule__Params__Group__3"


    // $ANTLR start "rule__Params__Group__3__Impl"
    // InternalGoatInfrastructureParser.g:308:1: rule__Params__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Params__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:312:1: ( ( RightCurlyBracket ) )
            // InternalGoatInfrastructureParser.g:313:1: ( RightCurlyBracket )
            {
            // InternalGoatInfrastructureParser.g:313:1: ( RightCurlyBracket )
            // InternalGoatInfrastructureParser.g:314:2: RightCurlyBracket
            {
             before(grammarAccess.getParamsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Params__Group__3__Impl"


    // $ANTLR start "rule__Params__Group_2__0"
    // InternalGoatInfrastructureParser.g:324:1: rule__Params__Group_2__0 : rule__Params__Group_2__0__Impl rule__Params__Group_2__1 ;
    public final void rule__Params__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:328:1: ( rule__Params__Group_2__0__Impl rule__Params__Group_2__1 )
            // InternalGoatInfrastructureParser.g:329:2: rule__Params__Group_2__0__Impl rule__Params__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Params__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group_2__1();

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
    // $ANTLR end "rule__Params__Group_2__0"


    // $ANTLR start "rule__Params__Group_2__0__Impl"
    // InternalGoatInfrastructureParser.g:336:1: rule__Params__Group_2__0__Impl : ( ( rule__Params__Group_2_0__0 )* ) ;
    public final void rule__Params__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:340:1: ( ( ( rule__Params__Group_2_0__0 )* ) )
            // InternalGoatInfrastructureParser.g:341:1: ( ( rule__Params__Group_2_0__0 )* )
            {
            // InternalGoatInfrastructureParser.g:341:1: ( ( rule__Params__Group_2_0__0 )* )
            // InternalGoatInfrastructureParser.g:342:2: ( rule__Params__Group_2_0__0 )*
            {
             before(grammarAccess.getParamsAccess().getGroup_2_0()); 
            // InternalGoatInfrastructureParser.g:343:2: ( rule__Params__Group_2_0__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==Colon) ) {
                        int LA3_2 = input.LA(3);

                        if ( (LA3_2==RULE_STRING) ) {
                            int LA3_3 = input.LA(4);

                            if ( (LA3_3==Comma) ) {
                                alt3=1;
                            }


                        }


                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalGoatInfrastructureParser.g:343:3: rule__Params__Group_2_0__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Params__Group_2_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getParamsAccess().getGroup_2_0()); 

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
    // $ANTLR end "rule__Params__Group_2__0__Impl"


    // $ANTLR start "rule__Params__Group_2__1"
    // InternalGoatInfrastructureParser.g:351:1: rule__Params__Group_2__1 : rule__Params__Group_2__1__Impl rule__Params__Group_2__2 ;
    public final void rule__Params__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:355:1: ( rule__Params__Group_2__1__Impl rule__Params__Group_2__2 )
            // InternalGoatInfrastructureParser.g:356:2: rule__Params__Group_2__1__Impl rule__Params__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Params__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group_2__2();

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
    // $ANTLR end "rule__Params__Group_2__1"


    // $ANTLR start "rule__Params__Group_2__1__Impl"
    // InternalGoatInfrastructureParser.g:363:1: rule__Params__Group_2__1__Impl : ( ( rule__Params__KeysAssignment_2_1 ) ) ;
    public final void rule__Params__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:367:1: ( ( ( rule__Params__KeysAssignment_2_1 ) ) )
            // InternalGoatInfrastructureParser.g:368:1: ( ( rule__Params__KeysAssignment_2_1 ) )
            {
            // InternalGoatInfrastructureParser.g:368:1: ( ( rule__Params__KeysAssignment_2_1 ) )
            // InternalGoatInfrastructureParser.g:369:2: ( rule__Params__KeysAssignment_2_1 )
            {
             before(grammarAccess.getParamsAccess().getKeysAssignment_2_1()); 
            // InternalGoatInfrastructureParser.g:370:2: ( rule__Params__KeysAssignment_2_1 )
            // InternalGoatInfrastructureParser.g:370:3: rule__Params__KeysAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Params__KeysAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getKeysAssignment_2_1()); 

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
    // $ANTLR end "rule__Params__Group_2__1__Impl"


    // $ANTLR start "rule__Params__Group_2__2"
    // InternalGoatInfrastructureParser.g:378:1: rule__Params__Group_2__2 : rule__Params__Group_2__2__Impl rule__Params__Group_2__3 ;
    public final void rule__Params__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:382:1: ( rule__Params__Group_2__2__Impl rule__Params__Group_2__3 )
            // InternalGoatInfrastructureParser.g:383:2: rule__Params__Group_2__2__Impl rule__Params__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__Params__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group_2__3();

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
    // $ANTLR end "rule__Params__Group_2__2"


    // $ANTLR start "rule__Params__Group_2__2__Impl"
    // InternalGoatInfrastructureParser.g:390:1: rule__Params__Group_2__2__Impl : ( Colon ) ;
    public final void rule__Params__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:394:1: ( ( Colon ) )
            // InternalGoatInfrastructureParser.g:395:1: ( Colon )
            {
            // InternalGoatInfrastructureParser.g:395:1: ( Colon )
            // InternalGoatInfrastructureParser.g:396:2: Colon
            {
             before(grammarAccess.getParamsAccess().getColonKeyword_2_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getColonKeyword_2_2()); 

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
    // $ANTLR end "rule__Params__Group_2__2__Impl"


    // $ANTLR start "rule__Params__Group_2__3"
    // InternalGoatInfrastructureParser.g:405:1: rule__Params__Group_2__3 : rule__Params__Group_2__3__Impl ;
    public final void rule__Params__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:409:1: ( rule__Params__Group_2__3__Impl )
            // InternalGoatInfrastructureParser.g:410:2: rule__Params__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group_2__3__Impl();

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
    // $ANTLR end "rule__Params__Group_2__3"


    // $ANTLR start "rule__Params__Group_2__3__Impl"
    // InternalGoatInfrastructureParser.g:416:1: rule__Params__Group_2__3__Impl : ( ( rule__Params__ValuesAssignment_2_3 ) ) ;
    public final void rule__Params__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:420:1: ( ( ( rule__Params__ValuesAssignment_2_3 ) ) )
            // InternalGoatInfrastructureParser.g:421:1: ( ( rule__Params__ValuesAssignment_2_3 ) )
            {
            // InternalGoatInfrastructureParser.g:421:1: ( ( rule__Params__ValuesAssignment_2_3 ) )
            // InternalGoatInfrastructureParser.g:422:2: ( rule__Params__ValuesAssignment_2_3 )
            {
             before(grammarAccess.getParamsAccess().getValuesAssignment_2_3()); 
            // InternalGoatInfrastructureParser.g:423:2: ( rule__Params__ValuesAssignment_2_3 )
            // InternalGoatInfrastructureParser.g:423:3: rule__Params__ValuesAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Params__ValuesAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getValuesAssignment_2_3()); 

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
    // $ANTLR end "rule__Params__Group_2__3__Impl"


    // $ANTLR start "rule__Params__Group_2_0__0"
    // InternalGoatInfrastructureParser.g:432:1: rule__Params__Group_2_0__0 : rule__Params__Group_2_0__0__Impl rule__Params__Group_2_0__1 ;
    public final void rule__Params__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:436:1: ( rule__Params__Group_2_0__0__Impl rule__Params__Group_2_0__1 )
            // InternalGoatInfrastructureParser.g:437:2: rule__Params__Group_2_0__0__Impl rule__Params__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Params__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group_2_0__1();

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
    // $ANTLR end "rule__Params__Group_2_0__0"


    // $ANTLR start "rule__Params__Group_2_0__0__Impl"
    // InternalGoatInfrastructureParser.g:444:1: rule__Params__Group_2_0__0__Impl : ( ( rule__Params__KeysAssignment_2_0_0 ) ) ;
    public final void rule__Params__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:448:1: ( ( ( rule__Params__KeysAssignment_2_0_0 ) ) )
            // InternalGoatInfrastructureParser.g:449:1: ( ( rule__Params__KeysAssignment_2_0_0 ) )
            {
            // InternalGoatInfrastructureParser.g:449:1: ( ( rule__Params__KeysAssignment_2_0_0 ) )
            // InternalGoatInfrastructureParser.g:450:2: ( rule__Params__KeysAssignment_2_0_0 )
            {
             before(grammarAccess.getParamsAccess().getKeysAssignment_2_0_0()); 
            // InternalGoatInfrastructureParser.g:451:2: ( rule__Params__KeysAssignment_2_0_0 )
            // InternalGoatInfrastructureParser.g:451:3: rule__Params__KeysAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Params__KeysAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getKeysAssignment_2_0_0()); 

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
    // $ANTLR end "rule__Params__Group_2_0__0__Impl"


    // $ANTLR start "rule__Params__Group_2_0__1"
    // InternalGoatInfrastructureParser.g:459:1: rule__Params__Group_2_0__1 : rule__Params__Group_2_0__1__Impl rule__Params__Group_2_0__2 ;
    public final void rule__Params__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:463:1: ( rule__Params__Group_2_0__1__Impl rule__Params__Group_2_0__2 )
            // InternalGoatInfrastructureParser.g:464:2: rule__Params__Group_2_0__1__Impl rule__Params__Group_2_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Params__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group_2_0__2();

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
    // $ANTLR end "rule__Params__Group_2_0__1"


    // $ANTLR start "rule__Params__Group_2_0__1__Impl"
    // InternalGoatInfrastructureParser.g:471:1: rule__Params__Group_2_0__1__Impl : ( Colon ) ;
    public final void rule__Params__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:475:1: ( ( Colon ) )
            // InternalGoatInfrastructureParser.g:476:1: ( Colon )
            {
            // InternalGoatInfrastructureParser.g:476:1: ( Colon )
            // InternalGoatInfrastructureParser.g:477:2: Colon
            {
             before(grammarAccess.getParamsAccess().getColonKeyword_2_0_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getColonKeyword_2_0_1()); 

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
    // $ANTLR end "rule__Params__Group_2_0__1__Impl"


    // $ANTLR start "rule__Params__Group_2_0__2"
    // InternalGoatInfrastructureParser.g:486:1: rule__Params__Group_2_0__2 : rule__Params__Group_2_0__2__Impl rule__Params__Group_2_0__3 ;
    public final void rule__Params__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:490:1: ( rule__Params__Group_2_0__2__Impl rule__Params__Group_2_0__3 )
            // InternalGoatInfrastructureParser.g:491:2: rule__Params__Group_2_0__2__Impl rule__Params__Group_2_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Params__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group_2_0__3();

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
    // $ANTLR end "rule__Params__Group_2_0__2"


    // $ANTLR start "rule__Params__Group_2_0__2__Impl"
    // InternalGoatInfrastructureParser.g:498:1: rule__Params__Group_2_0__2__Impl : ( ( rule__Params__ValuesAssignment_2_0_2 ) ) ;
    public final void rule__Params__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:502:1: ( ( ( rule__Params__ValuesAssignment_2_0_2 ) ) )
            // InternalGoatInfrastructureParser.g:503:1: ( ( rule__Params__ValuesAssignment_2_0_2 ) )
            {
            // InternalGoatInfrastructureParser.g:503:1: ( ( rule__Params__ValuesAssignment_2_0_2 ) )
            // InternalGoatInfrastructureParser.g:504:2: ( rule__Params__ValuesAssignment_2_0_2 )
            {
             before(grammarAccess.getParamsAccess().getValuesAssignment_2_0_2()); 
            // InternalGoatInfrastructureParser.g:505:2: ( rule__Params__ValuesAssignment_2_0_2 )
            // InternalGoatInfrastructureParser.g:505:3: rule__Params__ValuesAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Params__ValuesAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getValuesAssignment_2_0_2()); 

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
    // $ANTLR end "rule__Params__Group_2_0__2__Impl"


    // $ANTLR start "rule__Params__Group_2_0__3"
    // InternalGoatInfrastructureParser.g:513:1: rule__Params__Group_2_0__3 : rule__Params__Group_2_0__3__Impl ;
    public final void rule__Params__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:517:1: ( rule__Params__Group_2_0__3__Impl )
            // InternalGoatInfrastructureParser.g:518:2: rule__Params__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group_2_0__3__Impl();

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
    // $ANTLR end "rule__Params__Group_2_0__3"


    // $ANTLR start "rule__Params__Group_2_0__3__Impl"
    // InternalGoatInfrastructureParser.g:524:1: rule__Params__Group_2_0__3__Impl : ( Comma ) ;
    public final void rule__Params__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:528:1: ( ( Comma ) )
            // InternalGoatInfrastructureParser.g:529:1: ( Comma )
            {
            // InternalGoatInfrastructureParser.g:529:1: ( Comma )
            // InternalGoatInfrastructureParser.g:530:2: Comma
            {
             before(grammarAccess.getParamsAccess().getCommaKeyword_2_0_3()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getCommaKeyword_2_0_3()); 

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
    // $ANTLR end "rule__Params__Group_2_0__3__Impl"


    // $ANTLR start "rule__SingleServer__ExternalAssignment_0"
    // InternalGoatInfrastructureParser.g:540:1: rule__SingleServer__ExternalAssignment_0 : ( ( External ) ) ;
    public final void rule__SingleServer__ExternalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:544:1: ( ( ( External ) ) )
            // InternalGoatInfrastructureParser.g:545:2: ( ( External ) )
            {
            // InternalGoatInfrastructureParser.g:545:2: ( ( External ) )
            // InternalGoatInfrastructureParser.g:546:3: ( External )
            {
             before(grammarAccess.getSingleServerAccess().getExternalExternalKeyword_0_0()); 
            // InternalGoatInfrastructureParser.g:547:3: ( External )
            // InternalGoatInfrastructureParser.g:548:4: External
            {
             before(grammarAccess.getSingleServerAccess().getExternalExternalKeyword_0_0()); 
            match(input,External,FOLLOW_2); 
             after(grammarAccess.getSingleServerAccess().getExternalExternalKeyword_0_0()); 

            }

             after(grammarAccess.getSingleServerAccess().getExternalExternalKeyword_0_0()); 

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
    // $ANTLR end "rule__SingleServer__ExternalAssignment_0"


    // $ANTLR start "rule__SingleServer__ParamsAssignment_2"
    // InternalGoatInfrastructureParser.g:559:1: rule__SingleServer__ParamsAssignment_2 : ( ruleParams ) ;
    public final void rule__SingleServer__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:563:1: ( ( ruleParams ) )
            // InternalGoatInfrastructureParser.g:564:2: ( ruleParams )
            {
            // InternalGoatInfrastructureParser.g:564:2: ( ruleParams )
            // InternalGoatInfrastructureParser.g:565:3: ruleParams
            {
             before(grammarAccess.getSingleServerAccess().getParamsParamsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParams();

            state._fsp--;

             after(grammarAccess.getSingleServerAccess().getParamsParamsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SingleServer__ParamsAssignment_2"


    // $ANTLR start "rule__Params__KeysAssignment_2_0_0"
    // InternalGoatInfrastructureParser.g:574:1: rule__Params__KeysAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__Params__KeysAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:578:1: ( ( RULE_ID ) )
            // InternalGoatInfrastructureParser.g:579:2: ( RULE_ID )
            {
            // InternalGoatInfrastructureParser.g:579:2: ( RULE_ID )
            // InternalGoatInfrastructureParser.g:580:3: RULE_ID
            {
             before(grammarAccess.getParamsAccess().getKeysIDTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getKeysIDTerminalRuleCall_2_0_0_0()); 

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
    // $ANTLR end "rule__Params__KeysAssignment_2_0_0"


    // $ANTLR start "rule__Params__ValuesAssignment_2_0_2"
    // InternalGoatInfrastructureParser.g:589:1: rule__Params__ValuesAssignment_2_0_2 : ( RULE_STRING ) ;
    public final void rule__Params__ValuesAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:593:1: ( ( RULE_STRING ) )
            // InternalGoatInfrastructureParser.g:594:2: ( RULE_STRING )
            {
            // InternalGoatInfrastructureParser.g:594:2: ( RULE_STRING )
            // InternalGoatInfrastructureParser.g:595:3: RULE_STRING
            {
             before(grammarAccess.getParamsAccess().getValuesSTRINGTerminalRuleCall_2_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getValuesSTRINGTerminalRuleCall_2_0_2_0()); 

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
    // $ANTLR end "rule__Params__ValuesAssignment_2_0_2"


    // $ANTLR start "rule__Params__KeysAssignment_2_1"
    // InternalGoatInfrastructureParser.g:604:1: rule__Params__KeysAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Params__KeysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:608:1: ( ( RULE_ID ) )
            // InternalGoatInfrastructureParser.g:609:2: ( RULE_ID )
            {
            // InternalGoatInfrastructureParser.g:609:2: ( RULE_ID )
            // InternalGoatInfrastructureParser.g:610:3: RULE_ID
            {
             before(grammarAccess.getParamsAccess().getKeysIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getKeysIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Params__KeysAssignment_2_1"


    // $ANTLR start "rule__Params__ValuesAssignment_2_3"
    // InternalGoatInfrastructureParser.g:619:1: rule__Params__ValuesAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__Params__ValuesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatInfrastructureParser.g:623:1: ( ( RULE_STRING ) )
            // InternalGoatInfrastructureParser.g:624:2: ( RULE_STRING )
            {
            // InternalGoatInfrastructureParser.g:624:2: ( RULE_STRING )
            // InternalGoatInfrastructureParser.g:625:3: RULE_STRING
            {
             before(grammarAccess.getParamsAccess().getValuesSTRINGTerminalRuleCall_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getValuesSTRINGTerminalRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__Params__ValuesAssignment_2_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});

}