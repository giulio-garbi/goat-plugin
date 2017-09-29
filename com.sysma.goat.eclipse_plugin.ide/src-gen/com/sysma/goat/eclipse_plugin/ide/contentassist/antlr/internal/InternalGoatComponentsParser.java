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
import com.sysma.goat.eclipse_plugin.services.GoatComponentsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoatComponentsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Component", "Function", "Receiver", "Receive", "Return", "False", "Print", "Sleep", "Until", "Else", "Proc", "Send", "This", "True", "Wait", "Nil", "Var", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "PlusSignPlusSign", "ColonEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "At", "If", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_TYPE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Var=20;
    public static final int True=17;
    public static final int False=9;
    public static final int LessThanSign=40;
    public static final int Send=15;
    public static final int Print=10;
    public static final int LeftParenthesis=32;
    public static final int This=16;
    public static final int RightSquareBracket=45;
    public static final int ExclamationMark=31;
    public static final int GreaterThanSign=42;
    public static final int RULE_ID=50;
    public static final int RightParenthesis=33;
    public static final int Receiver=6;
    public static final int ColonEqualsSign=24;
    public static final int GreaterThanSignEqualsSign=27;
    public static final int EqualsSignEqualsSign=26;
    public static final int RULE_TYPE=49;
    public static final int VerticalLine=47;
    public static final int PlusSign=35;
    public static final int RULE_INT=51;
    public static final int RULE_ML_COMMENT=53;
    public static final int LeftSquareBracket=44;
    public static final int Wait=18;
    public static final int If=29;
    public static final int VerticalLineVerticalLine=30;
    public static final int RULE_STRING=52;
    public static final int RULE_SL_COMMENT=54;
    public static final int Proc=14;
    public static final int Function=5;
    public static final int Comma=36;
    public static final int EqualsSign=41;
    public static final int HyphenMinus=37;
    public static final int At=28;
    public static final int AmpersandAmpersand=22;
    public static final int LessThanSignEqualsSign=25;
    public static final int Solidus=39;
    public static final int RightCurlyBracket=48;
    public static final int Component=4;
    public static final int EOF=-1;
    public static final int Asterisk=34;
    public static final int Until=12;
    public static final int FullStop=38;
    public static final int Return=8;
    public static final int RULE_WS=55;
    public static final int LeftCurlyBracket=46;
    public static final int RULE_ANY_OTHER=56;
    public static final int CommercialAt=43;
    public static final int Nil=19;
    public static final int Sleep=11;
    public static final int PlusSignPlusSign=23;
    public static final int Receive=7;
    public static final int Else=13;
    public static final int ExclamationMarkEqualsSign=21;

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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("CommercialAt", "'@'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("VerticalLine", "'|'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("AmpersandAmpersand", "'&&'");
    		tokenNameToValue.put("PlusSignPlusSign", "'++'");
    		tokenNameToValue.put("ColonEqualsSign", "':='");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("EqualsSignEqualsSign", "'=='");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("At", "'at'");
    		tokenNameToValue.put("If", "'if'");
    		tokenNameToValue.put("VerticalLineVerticalLine", "'||'");
    		tokenNameToValue.put("Nil", "'nil'");
    		tokenNameToValue.put("Var", "'var'");
    		tokenNameToValue.put("Else", "'else'");
    		tokenNameToValue.put("Proc", "'proc'");
    		tokenNameToValue.put("Send", "'send'");
    		tokenNameToValue.put("This", "'this'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("Wait", "'wait'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Print", "'print'");
    		tokenNameToValue.put("Sleep", "'sleep'");
    		tokenNameToValue.put("Until", "'until'");
    		tokenNameToValue.put("Return", "'return'");
    		tokenNameToValue.put("Receive", "'receive'");
    		tokenNameToValue.put("Function", "'function'");
    		tokenNameToValue.put("Receiver", "'receiver'");
    		tokenNameToValue.put("Component", "'component'");
    	}

    	public void setGrammarAccess(GoatComponentsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalGoatComponentsParser.g:100:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:101:1: ( ruleModel EOF )
            // InternalGoatComponentsParser.g:102:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGoatComponentsParser.g:109:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:113:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalGoatComponentsParser.g:114:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:114:2: ( ( rule__Model__Group__0 ) )
            // InternalGoatComponentsParser.g:115:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalGoatComponentsParser.g:116:3: ( rule__Model__Group__0 )
            // InternalGoatComponentsParser.g:116:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProc"
    // InternalGoatComponentsParser.g:125:1: entryRuleProc : ruleProc EOF ;
    public final void entryRuleProc() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:126:1: ( ruleProc EOF )
            // InternalGoatComponentsParser.g:127:1: ruleProc EOF
            {
             before(grammarAccess.getProcRule()); 
            pushFollow(FOLLOW_1);
            ruleProc();

            state._fsp--;

             after(grammarAccess.getProcRule()); 
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
    // $ANTLR end "entryRuleProc"


    // $ANTLR start "ruleProc"
    // InternalGoatComponentsParser.g:134:1: ruleProc : ( ( rule__Proc__Alternatives ) ) ;
    public final void ruleProc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:138:2: ( ( ( rule__Proc__Alternatives ) ) )
            // InternalGoatComponentsParser.g:139:2: ( ( rule__Proc__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:139:2: ( ( rule__Proc__Alternatives ) )
            // InternalGoatComponentsParser.g:140:3: ( rule__Proc__Alternatives )
            {
             before(grammarAccess.getProcAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:141:3: ( rule__Proc__Alternatives )
            // InternalGoatComponentsParser.g:141:4: rule__Proc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Proc__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProc"


    // $ANTLR start "entryRuleInterleavingProcess"
    // InternalGoatComponentsParser.g:150:1: entryRuleInterleavingProcess : ruleInterleavingProcess EOF ;
    public final void entryRuleInterleavingProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:151:1: ( ruleInterleavingProcess EOF )
            // InternalGoatComponentsParser.g:152:1: ruleInterleavingProcess EOF
            {
             before(grammarAccess.getInterleavingProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleInterleavingProcess();

            state._fsp--;

             after(grammarAccess.getInterleavingProcessRule()); 
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
    // $ANTLR end "entryRuleInterleavingProcess"


    // $ANTLR start "ruleInterleavingProcess"
    // InternalGoatComponentsParser.g:159:1: ruleInterleavingProcess : ( ( rule__InterleavingProcess__Group__0 ) ) ;
    public final void ruleInterleavingProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:163:2: ( ( ( rule__InterleavingProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:164:2: ( ( rule__InterleavingProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:164:2: ( ( rule__InterleavingProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:165:3: ( rule__InterleavingProcess__Group__0 )
            {
             before(grammarAccess.getInterleavingProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:166:3: ( rule__InterleavingProcess__Group__0 )
            // InternalGoatComponentsParser.g:166:4: rule__InterleavingProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterleavingProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterleavingProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleInterleavingProcess"


    // $ANTLR start "entryRuleNonDeterminismProcess"
    // InternalGoatComponentsParser.g:175:1: entryRuleNonDeterminismProcess : ruleNonDeterminismProcess EOF ;
    public final void entryRuleNonDeterminismProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:176:1: ( ruleNonDeterminismProcess EOF )
            // InternalGoatComponentsParser.g:177:1: ruleNonDeterminismProcess EOF
            {
             before(grammarAccess.getNonDeterminismProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleNonDeterminismProcess();

            state._fsp--;

             after(grammarAccess.getNonDeterminismProcessRule()); 
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
    // $ANTLR end "entryRuleNonDeterminismProcess"


    // $ANTLR start "ruleNonDeterminismProcess"
    // InternalGoatComponentsParser.g:184:1: ruleNonDeterminismProcess : ( ( rule__NonDeterminismProcess__Alternatives ) ) ;
    public final void ruleNonDeterminismProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:188:2: ( ( ( rule__NonDeterminismProcess__Alternatives ) ) )
            // InternalGoatComponentsParser.g:189:2: ( ( rule__NonDeterminismProcess__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:189:2: ( ( rule__NonDeterminismProcess__Alternatives ) )
            // InternalGoatComponentsParser.g:190:3: ( rule__NonDeterminismProcess__Alternatives )
            {
             before(grammarAccess.getNonDeterminismProcessAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:191:3: ( rule__NonDeterminismProcess__Alternatives )
            // InternalGoatComponentsParser.g:191:4: rule__NonDeterminismProcess__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NonDeterminismProcess__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNonDeterminismProcessAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNonDeterminismProcess"


    // $ANTLR start "entryRulePreconditions"
    // InternalGoatComponentsParser.g:200:1: entryRulePreconditions : rulePreconditions EOF ;
    public final void entryRulePreconditions() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:201:1: ( rulePreconditions EOF )
            // InternalGoatComponentsParser.g:202:1: rulePreconditions EOF
            {
             before(grammarAccess.getPreconditionsRule()); 
            pushFollow(FOLLOW_1);
            rulePreconditions();

            state._fsp--;

             after(grammarAccess.getPreconditionsRule()); 
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
    // $ANTLR end "entryRulePreconditions"


    // $ANTLR start "rulePreconditions"
    // InternalGoatComponentsParser.g:209:1: rulePreconditions : ( ( rule__Preconditions__Group__0 ) ) ;
    public final void rulePreconditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:213:2: ( ( ( rule__Preconditions__Group__0 ) ) )
            // InternalGoatComponentsParser.g:214:2: ( ( rule__Preconditions__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:214:2: ( ( rule__Preconditions__Group__0 ) )
            // InternalGoatComponentsParser.g:215:3: ( rule__Preconditions__Group__0 )
            {
             before(grammarAccess.getPreconditionsAccess().getGroup()); 
            // InternalGoatComponentsParser.g:216:3: ( rule__Preconditions__Group__0 )
            // InternalGoatComponentsParser.g:216:4: rule__Preconditions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Preconditions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionsAccess().getGroup()); 

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
    // $ANTLR end "rulePreconditions"


    // $ANTLR start "entryRulePredOutputProcessOrInputProcesses"
    // InternalGoatComponentsParser.g:225:1: entryRulePredOutputProcessOrInputProcesses : rulePredOutputProcessOrInputProcesses EOF ;
    public final void entryRulePredOutputProcessOrInputProcesses() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:226:1: ( rulePredOutputProcessOrInputProcesses EOF )
            // InternalGoatComponentsParser.g:227:1: rulePredOutputProcessOrInputProcesses EOF
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesRule()); 
            pushFollow(FOLLOW_1);
            rulePredOutputProcessOrInputProcesses();

            state._fsp--;

             after(grammarAccess.getPredOutputProcessOrInputProcessesRule()); 
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
    // $ANTLR end "entryRulePredOutputProcessOrInputProcesses"


    // $ANTLR start "rulePredOutputProcessOrInputProcesses"
    // InternalGoatComponentsParser.g:234:1: rulePredOutputProcessOrInputProcesses : ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) ) ;
    public final void rulePredOutputProcessOrInputProcesses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:238:2: ( ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) ) )
            // InternalGoatComponentsParser.g:239:2: ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:239:2: ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) )
            // InternalGoatComponentsParser.g:240:3: ( rule__PredOutputProcessOrInputProcesses__Group__0 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup()); 
            // InternalGoatComponentsParser.g:241:3: ( rule__PredOutputProcessOrInputProcesses__Group__0 )
            // InternalGoatComponentsParser.g:241:4: rule__PredOutputProcessOrInputProcesses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcesses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup()); 

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
    // $ANTLR end "rulePredOutputProcessOrInputProcesses"


    // $ANTLR start "entryRulePredOutputProcessOrInputProcess"
    // InternalGoatComponentsParser.g:250:1: entryRulePredOutputProcessOrInputProcess : rulePredOutputProcessOrInputProcess EOF ;
    public final void entryRulePredOutputProcessOrInputProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:251:1: ( rulePredOutputProcessOrInputProcess EOF )
            // InternalGoatComponentsParser.g:252:1: rulePredOutputProcessOrInputProcess EOF
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessRule()); 
            pushFollow(FOLLOW_1);
            rulePredOutputProcessOrInputProcess();

            state._fsp--;

             after(grammarAccess.getPredOutputProcessOrInputProcessRule()); 
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
    // $ANTLR end "entryRulePredOutputProcessOrInputProcess"


    // $ANTLR start "rulePredOutputProcessOrInputProcess"
    // InternalGoatComponentsParser.g:259:1: rulePredOutputProcessOrInputProcess : ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) ) ;
    public final void rulePredOutputProcessOrInputProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:263:2: ( ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:264:2: ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:264:2: ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:265:3: ( rule__PredOutputProcessOrInputProcess__Group__0 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:266:3: ( rule__PredOutputProcessOrInputProcess__Group__0 )
            // InternalGoatComponentsParser.g:266:4: rule__PredOutputProcessOrInputProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup()); 

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
    // $ANTLR end "rulePredOutputProcessOrInputProcess"


    // $ANTLR start "ruleInputProcessesPart"
    // InternalGoatComponentsParser.g:276:1: ruleInputProcessesPart : ( ( rule__InputProcessesPart__Group__0 ) ) ;
    public final void ruleInputProcessesPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:280:2: ( ( ( rule__InputProcessesPart__Group__0 ) ) )
            // InternalGoatComponentsParser.g:281:2: ( ( rule__InputProcessesPart__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:281:2: ( ( rule__InputProcessesPart__Group__0 ) )
            // InternalGoatComponentsParser.g:282:3: ( rule__InputProcessesPart__Group__0 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getGroup()); 
            // InternalGoatComponentsParser.g:283:3: ( rule__InputProcessesPart__Group__0 )
            // InternalGoatComponentsParser.g:283:4: rule__InputProcessesPart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputProcessesPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessesPartAccess().getGroup()); 

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
    // $ANTLR end "ruleInputProcessesPart"


    // $ANTLR start "entryRuleInputProcess"
    // InternalGoatComponentsParser.g:292:1: entryRuleInputProcess : ruleInputProcess EOF ;
    public final void entryRuleInputProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:293:1: ( ruleInputProcess EOF )
            // InternalGoatComponentsParser.g:294:1: ruleInputProcess EOF
            {
             before(grammarAccess.getInputProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleInputProcess();

            state._fsp--;

             after(grammarAccess.getInputProcessRule()); 
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
    // $ANTLR end "entryRuleInputProcess"


    // $ANTLR start "ruleInputProcess"
    // InternalGoatComponentsParser.g:301:1: ruleInputProcess : ( ( rule__InputProcess__Group__0 ) ) ;
    public final void ruleInputProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:305:2: ( ( ( rule__InputProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:306:2: ( ( rule__InputProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:306:2: ( ( rule__InputProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:307:3: ( rule__InputProcess__Group__0 )
            {
             before(grammarAccess.getInputProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:308:3: ( rule__InputProcess__Group__0 )
            // InternalGoatComponentsParser.g:308:4: rule__InputProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleInputProcess"


    // $ANTLR start "ruleOutputProcessPart"
    // InternalGoatComponentsParser.g:318:1: ruleOutputProcessPart : ( ( rule__OutputProcessPart__Group__0 ) ) ;
    public final void ruleOutputProcessPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:322:2: ( ( ( rule__OutputProcessPart__Group__0 ) ) )
            // InternalGoatComponentsParser.g:323:2: ( ( rule__OutputProcessPart__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:323:2: ( ( rule__OutputProcessPart__Group__0 ) )
            // InternalGoatComponentsParser.g:324:3: ( rule__OutputProcessPart__Group__0 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup()); 
            // InternalGoatComponentsParser.g:325:3: ( rule__OutputProcessPart__Group__0 )
            // InternalGoatComponentsParser.g:325:4: rule__OutputProcessPart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputProcessPartAccess().getGroup()); 

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
    // $ANTLR end "ruleOutputProcessPart"


    // $ANTLR start "entryRulePrintStatement"
    // InternalGoatComponentsParser.g:334:1: entryRulePrintStatement : rulePrintStatement EOF ;
    public final void entryRulePrintStatement() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:335:1: ( rulePrintStatement EOF )
            // InternalGoatComponentsParser.g:336:1: rulePrintStatement EOF
            {
             before(grammarAccess.getPrintStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePrintStatement();

            state._fsp--;

             after(grammarAccess.getPrintStatementRule()); 
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
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalGoatComponentsParser.g:343:1: rulePrintStatement : ( rulePrintFormattedStatement ) ;
    public final void rulePrintStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:347:2: ( ( rulePrintFormattedStatement ) )
            // InternalGoatComponentsParser.g:348:2: ( rulePrintFormattedStatement )
            {
            // InternalGoatComponentsParser.g:348:2: ( rulePrintFormattedStatement )
            // InternalGoatComponentsParser.g:349:3: rulePrintFormattedStatement
            {
             before(grammarAccess.getPrintStatementAccess().getPrintFormattedStatementParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePrintFormattedStatement();

            state._fsp--;

             after(grammarAccess.getPrintStatementAccess().getPrintFormattedStatementParserRuleCall()); 

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
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRulePrintFormattedStatement"
    // InternalGoatComponentsParser.g:359:1: entryRulePrintFormattedStatement : rulePrintFormattedStatement EOF ;
    public final void entryRulePrintFormattedStatement() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:360:1: ( rulePrintFormattedStatement EOF )
            // InternalGoatComponentsParser.g:361:1: rulePrintFormattedStatement EOF
            {
             before(grammarAccess.getPrintFormattedStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePrintFormattedStatement();

            state._fsp--;

             after(grammarAccess.getPrintFormattedStatementRule()); 
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
    // $ANTLR end "entryRulePrintFormattedStatement"


    // $ANTLR start "rulePrintFormattedStatement"
    // InternalGoatComponentsParser.g:368:1: rulePrintFormattedStatement : ( ( rule__PrintFormattedStatement__Group__0 ) ) ;
    public final void rulePrintFormattedStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:372:2: ( ( ( rule__PrintFormattedStatement__Group__0 ) ) )
            // InternalGoatComponentsParser.g:373:2: ( ( rule__PrintFormattedStatement__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:373:2: ( ( rule__PrintFormattedStatement__Group__0 ) )
            // InternalGoatComponentsParser.g:374:3: ( rule__PrintFormattedStatement__Group__0 )
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getGroup()); 
            // InternalGoatComponentsParser.g:375:3: ( rule__PrintFormattedStatement__Group__0 )
            // InternalGoatComponentsParser.g:375:4: rule__PrintFormattedStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintFormattedStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintFormattedStatementAccess().getGroup()); 

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
    // $ANTLR end "rulePrintFormattedStatement"


    // $ANTLR start "entryRuleIfProcesses"
    // InternalGoatComponentsParser.g:384:1: entryRuleIfProcesses : ruleIfProcesses EOF ;
    public final void entryRuleIfProcesses() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:385:1: ( ruleIfProcesses EOF )
            // InternalGoatComponentsParser.g:386:1: ruleIfProcesses EOF
            {
             before(grammarAccess.getIfProcessesRule()); 
            pushFollow(FOLLOW_1);
            ruleIfProcesses();

            state._fsp--;

             after(grammarAccess.getIfProcessesRule()); 
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
    // $ANTLR end "entryRuleIfProcesses"


    // $ANTLR start "ruleIfProcesses"
    // InternalGoatComponentsParser.g:393:1: ruleIfProcesses : ( ( rule__IfProcesses__Group__0 ) ) ;
    public final void ruleIfProcesses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:397:2: ( ( ( rule__IfProcesses__Group__0 ) ) )
            // InternalGoatComponentsParser.g:398:2: ( ( rule__IfProcesses__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:398:2: ( ( rule__IfProcesses__Group__0 ) )
            // InternalGoatComponentsParser.g:399:3: ( rule__IfProcesses__Group__0 )
            {
             before(grammarAccess.getIfProcessesAccess().getGroup()); 
            // InternalGoatComponentsParser.g:400:3: ( rule__IfProcesses__Group__0 )
            // InternalGoatComponentsParser.g:400:4: rule__IfProcesses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfProcessesAccess().getGroup()); 

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
    // $ANTLR end "ruleIfProcesses"


    // $ANTLR start "entryRuleIfBranchProcess"
    // InternalGoatComponentsParser.g:409:1: entryRuleIfBranchProcess : ruleIfBranchProcess EOF ;
    public final void entryRuleIfBranchProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:410:1: ( ruleIfBranchProcess EOF )
            // InternalGoatComponentsParser.g:411:1: ruleIfBranchProcess EOF
            {
             before(grammarAccess.getIfBranchProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleIfBranchProcess();

            state._fsp--;

             after(grammarAccess.getIfBranchProcessRule()); 
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
    // $ANTLR end "entryRuleIfBranchProcess"


    // $ANTLR start "ruleIfBranchProcess"
    // InternalGoatComponentsParser.g:418:1: ruleIfBranchProcess : ( ( rule__IfBranchProcess__Group__0 ) ) ;
    public final void ruleIfBranchProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:422:2: ( ( ( rule__IfBranchProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:423:2: ( ( rule__IfBranchProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:423:2: ( ( rule__IfBranchProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:424:3: ( rule__IfBranchProcess__Group__0 )
            {
             before(grammarAccess.getIfBranchProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:425:3: ( rule__IfBranchProcess__Group__0 )
            // InternalGoatComponentsParser.g:425:4: rule__IfBranchProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfBranchProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfBranchProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleIfBranchProcess"


    // $ANTLR start "entryRuleElseBranchProcess"
    // InternalGoatComponentsParser.g:434:1: entryRuleElseBranchProcess : ruleElseBranchProcess EOF ;
    public final void entryRuleElseBranchProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:435:1: ( ruleElseBranchProcess EOF )
            // InternalGoatComponentsParser.g:436:1: ruleElseBranchProcess EOF
            {
             before(grammarAccess.getElseBranchProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleElseBranchProcess();

            state._fsp--;

             after(grammarAccess.getElseBranchProcessRule()); 
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
    // $ANTLR end "entryRuleElseBranchProcess"


    // $ANTLR start "ruleElseBranchProcess"
    // InternalGoatComponentsParser.g:443:1: ruleElseBranchProcess : ( ( rule__ElseBranchProcess__Group__0 ) ) ;
    public final void ruleElseBranchProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:447:2: ( ( ( rule__ElseBranchProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:448:2: ( ( rule__ElseBranchProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:448:2: ( ( rule__ElseBranchProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:449:3: ( rule__ElseBranchProcess__Group__0 )
            {
             before(grammarAccess.getElseBranchProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:450:3: ( rule__ElseBranchProcess__Group__0 )
            // InternalGoatComponentsParser.g:450:4: rule__ElseBranchProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseBranchProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseBranchProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleElseBranchProcess"


    // $ANTLR start "entryRuleUpdate"
    // InternalGoatComponentsParser.g:459:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:460:1: ( ruleUpdate EOF )
            // InternalGoatComponentsParser.g:461:1: ruleUpdate EOF
            {
             before(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdate();

            state._fsp--;

             after(grammarAccess.getUpdateRule()); 
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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalGoatComponentsParser.g:468:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:472:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalGoatComponentsParser.g:473:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:473:2: ( ( rule__Update__Group__0 ) )
            // InternalGoatComponentsParser.g:474:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalGoatComponentsParser.g:475:3: ( rule__Update__Group__0 )
            // InternalGoatComponentsParser.g:475:4: rule__Update__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getGroup()); 

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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleAwareness"
    // InternalGoatComponentsParser.g:484:1: entryRuleAwareness : ruleAwareness EOF ;
    public final void entryRuleAwareness() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:485:1: ( ruleAwareness EOF )
            // InternalGoatComponentsParser.g:486:1: ruleAwareness EOF
            {
             before(grammarAccess.getAwarenessRule()); 
            pushFollow(FOLLOW_1);
            ruleAwareness();

            state._fsp--;

             after(grammarAccess.getAwarenessRule()); 
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
    // $ANTLR end "entryRuleAwareness"


    // $ANTLR start "ruleAwareness"
    // InternalGoatComponentsParser.g:493:1: ruleAwareness : ( ( rule__Awareness__Group__0 ) ) ;
    public final void ruleAwareness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:497:2: ( ( ( rule__Awareness__Group__0 ) ) )
            // InternalGoatComponentsParser.g:498:2: ( ( rule__Awareness__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:498:2: ( ( rule__Awareness__Group__0 ) )
            // InternalGoatComponentsParser.g:499:3: ( rule__Awareness__Group__0 )
            {
             before(grammarAccess.getAwarenessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:500:3: ( rule__Awareness__Group__0 )
            // InternalGoatComponentsParser.g:500:4: rule__Awareness__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Awareness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAwarenessAccess().getGroup()); 

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
    // $ANTLR end "ruleAwareness"


    // $ANTLR start "entryRuleNZCProcess"
    // InternalGoatComponentsParser.g:509:1: entryRuleNZCProcess : ruleNZCProcess EOF ;
    public final void entryRuleNZCProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:510:1: ( ruleNZCProcess EOF )
            // InternalGoatComponentsParser.g:511:1: ruleNZCProcess EOF
            {
             before(grammarAccess.getNZCProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleNZCProcess();

            state._fsp--;

             after(grammarAccess.getNZCProcessRule()); 
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
    // $ANTLR end "entryRuleNZCProcess"


    // $ANTLR start "ruleNZCProcess"
    // InternalGoatComponentsParser.g:518:1: ruleNZCProcess : ( ( rule__NZCProcess__Alternatives ) ) ;
    public final void ruleNZCProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:522:2: ( ( ( rule__NZCProcess__Alternatives ) ) )
            // InternalGoatComponentsParser.g:523:2: ( ( rule__NZCProcess__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:523:2: ( ( rule__NZCProcess__Alternatives ) )
            // InternalGoatComponentsParser.g:524:3: ( rule__NZCProcess__Alternatives )
            {
             before(grammarAccess.getNZCProcessAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:525:3: ( rule__NZCProcess__Alternatives )
            // InternalGoatComponentsParser.g:525:4: rule__NZCProcess__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NZCProcess__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNZCProcessAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNZCProcess"


    // $ANTLR start "entryRuleNProcess"
    // InternalGoatComponentsParser.g:534:1: entryRuleNProcess : ruleNProcess EOF ;
    public final void entryRuleNProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:535:1: ( ruleNProcess EOF )
            // InternalGoatComponentsParser.g:536:1: ruleNProcess EOF
            {
             before(grammarAccess.getNProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleNProcess();

            state._fsp--;

             after(grammarAccess.getNProcessRule()); 
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
    // $ANTLR end "entryRuleNProcess"


    // $ANTLR start "ruleNProcess"
    // InternalGoatComponentsParser.g:543:1: ruleNProcess : ( ( rule__NProcess__Alternatives ) ) ;
    public final void ruleNProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:547:2: ( ( ( rule__NProcess__Alternatives ) ) )
            // InternalGoatComponentsParser.g:548:2: ( ( rule__NProcess__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:548:2: ( ( rule__NProcess__Alternatives ) )
            // InternalGoatComponentsParser.g:549:3: ( rule__NProcess__Alternatives )
            {
             before(grammarAccess.getNProcessAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:550:3: ( rule__NProcess__Alternatives )
            // InternalGoatComponentsParser.g:550:4: rule__NProcess__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NProcess__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNProcessAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNProcess"


    // $ANTLR start "entryRuleCallProcess"
    // InternalGoatComponentsParser.g:559:1: entryRuleCallProcess : ruleCallProcess EOF ;
    public final void entryRuleCallProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:560:1: ( ruleCallProcess EOF )
            // InternalGoatComponentsParser.g:561:1: ruleCallProcess EOF
            {
             before(grammarAccess.getCallProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleCallProcess();

            state._fsp--;

             after(grammarAccess.getCallProcessRule()); 
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
    // $ANTLR end "entryRuleCallProcess"


    // $ANTLR start "ruleCallProcess"
    // InternalGoatComponentsParser.g:568:1: ruleCallProcess : ( ( rule__CallProcess__Group__0 ) ) ;
    public final void ruleCallProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:572:2: ( ( ( rule__CallProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:573:2: ( ( rule__CallProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:573:2: ( ( rule__CallProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:574:3: ( rule__CallProcess__Group__0 )
            {
             before(grammarAccess.getCallProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:575:3: ( rule__CallProcess__Group__0 )
            // InternalGoatComponentsParser.g:575:4: rule__CallProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleCallProcess"


    // $ANTLR start "entryRuleZeroProcess"
    // InternalGoatComponentsParser.g:584:1: entryRuleZeroProcess : ruleZeroProcess EOF ;
    public final void entryRuleZeroProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:585:1: ( ruleZeroProcess EOF )
            // InternalGoatComponentsParser.g:586:1: ruleZeroProcess EOF
            {
             before(grammarAccess.getZeroProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleZeroProcess();

            state._fsp--;

             after(grammarAccess.getZeroProcessRule()); 
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
    // $ANTLR end "entryRuleZeroProcess"


    // $ANTLR start "ruleZeroProcess"
    // InternalGoatComponentsParser.g:593:1: ruleZeroProcess : ( ( rule__ZeroProcess__Group__0 ) ) ;
    public final void ruleZeroProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:597:2: ( ( ( rule__ZeroProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:598:2: ( ( rule__ZeroProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:598:2: ( ( rule__ZeroProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:599:3: ( rule__ZeroProcess__Group__0 )
            {
             before(grammarAccess.getZeroProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:600:3: ( rule__ZeroProcess__Group__0 )
            // InternalGoatComponentsParser.g:600:4: rule__ZeroProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ZeroProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZeroProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleZeroProcess"


    // $ANTLR start "entryRuleProcessDefinition"
    // InternalGoatComponentsParser.g:609:1: entryRuleProcessDefinition : ruleProcessDefinition EOF ;
    public final void entryRuleProcessDefinition() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:610:1: ( ruleProcessDefinition EOF )
            // InternalGoatComponentsParser.g:611:1: ruleProcessDefinition EOF
            {
             before(grammarAccess.getProcessDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessDefinition();

            state._fsp--;

             after(grammarAccess.getProcessDefinitionRule()); 
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
    // $ANTLR end "entryRuleProcessDefinition"


    // $ANTLR start "ruleProcessDefinition"
    // InternalGoatComponentsParser.g:618:1: ruleProcessDefinition : ( ( rule__ProcessDefinition__Group__0 ) ) ;
    public final void ruleProcessDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:622:2: ( ( ( rule__ProcessDefinition__Group__0 ) ) )
            // InternalGoatComponentsParser.g:623:2: ( ( rule__ProcessDefinition__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:623:2: ( ( rule__ProcessDefinition__Group__0 ) )
            // InternalGoatComponentsParser.g:624:3: ( rule__ProcessDefinition__Group__0 )
            {
             before(grammarAccess.getProcessDefinitionAccess().getGroup()); 
            // InternalGoatComponentsParser.g:625:3: ( rule__ProcessDefinition__Group__0 )
            // InternalGoatComponentsParser.g:625:4: rule__ProcessDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleProcessDefinition"


    // $ANTLR start "entryRuleEnvInitValue"
    // InternalGoatComponentsParser.g:634:1: entryRuleEnvInitValue : ruleEnvInitValue EOF ;
    public final void entryRuleEnvInitValue() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:635:1: ( ruleEnvInitValue EOF )
            // InternalGoatComponentsParser.g:636:1: ruleEnvInitValue EOF
            {
             before(grammarAccess.getEnvInitValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvInitValue();

            state._fsp--;

             after(grammarAccess.getEnvInitValueRule()); 
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
    // $ANTLR end "entryRuleEnvInitValue"


    // $ANTLR start "ruleEnvInitValue"
    // InternalGoatComponentsParser.g:643:1: ruleEnvInitValue : ( ( rule__EnvInitValue__Alternatives ) ) ;
    public final void ruleEnvInitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:647:2: ( ( ( rule__EnvInitValue__Alternatives ) ) )
            // InternalGoatComponentsParser.g:648:2: ( ( rule__EnvInitValue__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:648:2: ( ( rule__EnvInitValue__Alternatives ) )
            // InternalGoatComponentsParser.g:649:3: ( rule__EnvInitValue__Alternatives )
            {
             before(grammarAccess.getEnvInitValueAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:650:3: ( rule__EnvInitValue__Alternatives )
            // InternalGoatComponentsParser.g:650:4: rule__EnvInitValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnvInitValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnvInitValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEnvInitValue"


    // $ANTLR start "entryRuleEnvironment"
    // InternalGoatComponentsParser.g:659:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:660:1: ( ruleEnvironment EOF )
            // InternalGoatComponentsParser.g:661:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalGoatComponentsParser.g:668:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:672:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalGoatComponentsParser.g:673:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:673:2: ( ( rule__Environment__Group__0 ) )
            // InternalGoatComponentsParser.g:674:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalGoatComponentsParser.g:675:3: ( rule__Environment__Group__0 )
            // InternalGoatComponentsParser.g:675:4: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleComponentDefinition"
    // InternalGoatComponentsParser.g:684:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:685:1: ( ruleComponentDefinition EOF )
            // InternalGoatComponentsParser.g:686:1: ruleComponentDefinition EOF
            {
             before(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionRule()); 
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
    // $ANTLR end "entryRuleComponentDefinition"


    // $ANTLR start "ruleComponentDefinition"
    // InternalGoatComponentsParser.g:693:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Group__0 ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:697:2: ( ( ( rule__ComponentDefinition__Group__0 ) ) )
            // InternalGoatComponentsParser.g:698:2: ( ( rule__ComponentDefinition__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:698:2: ( ( rule__ComponentDefinition__Group__0 ) )
            // InternalGoatComponentsParser.g:699:3: ( rule__ComponentDefinition__Group__0 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getGroup()); 
            // InternalGoatComponentsParser.g:700:3: ( rule__ComponentDefinition__Group__0 )
            // InternalGoatComponentsParser.g:700:4: rule__ComponentDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalGoatComponentsParser.g:709:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:710:1: ( ruleExpression EOF )
            // InternalGoatComponentsParser.g:711:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGoatComponentsParser.g:718:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:722:2: ( ( ruleOr ) )
            // InternalGoatComponentsParser.g:723:2: ( ruleOr )
            {
            // InternalGoatComponentsParser.g:723:2: ( ruleOr )
            // InternalGoatComponentsParser.g:724:3: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalGoatComponentsParser.g:734:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:735:1: ( ruleOr EOF )
            // InternalGoatComponentsParser.g:736:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalGoatComponentsParser.g:743:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:747:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalGoatComponentsParser.g:748:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:748:2: ( ( rule__Or__Group__0 ) )
            // InternalGoatComponentsParser.g:749:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalGoatComponentsParser.g:750:3: ( rule__Or__Group__0 )
            // InternalGoatComponentsParser.g:750:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalGoatComponentsParser.g:759:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:760:1: ( ruleAnd EOF )
            // InternalGoatComponentsParser.g:761:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalGoatComponentsParser.g:768:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:772:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalGoatComponentsParser.g:773:2: ( ( rule__And__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:773:2: ( ( rule__And__Group__0 ) )
            // InternalGoatComponentsParser.g:774:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalGoatComponentsParser.g:775:3: ( rule__And__Group__0 )
            // InternalGoatComponentsParser.g:775:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalGoatComponentsParser.g:784:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:785:1: ( ruleEquality EOF )
            // InternalGoatComponentsParser.g:786:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalGoatComponentsParser.g:793:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:797:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalGoatComponentsParser.g:798:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:798:2: ( ( rule__Equality__Group__0 ) )
            // InternalGoatComponentsParser.g:799:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalGoatComponentsParser.g:800:3: ( rule__Equality__Group__0 )
            // InternalGoatComponentsParser.g:800:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalGoatComponentsParser.g:809:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:810:1: ( ruleComparison EOF )
            // InternalGoatComponentsParser.g:811:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalGoatComponentsParser.g:818:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:822:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalGoatComponentsParser.g:823:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:823:2: ( ( rule__Comparison__Group__0 ) )
            // InternalGoatComponentsParser.g:824:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalGoatComponentsParser.g:825:3: ( rule__Comparison__Group__0 )
            // InternalGoatComponentsParser.g:825:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalGoatComponentsParser.g:834:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:835:1: ( rulePlusOrMinus EOF )
            // InternalGoatComponentsParser.g:836:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalGoatComponentsParser.g:843:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:847:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalGoatComponentsParser.g:848:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:848:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalGoatComponentsParser.g:849:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalGoatComponentsParser.g:850:3: ( rule__PlusOrMinus__Group__0 )
            // InternalGoatComponentsParser.g:850:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalGoatComponentsParser.g:859:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:860:1: ( ruleMulOrDiv EOF )
            // InternalGoatComponentsParser.g:861:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalGoatComponentsParser.g:868:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:872:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalGoatComponentsParser.g:873:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:873:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalGoatComponentsParser.g:874:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalGoatComponentsParser.g:875:3: ( rule__MulOrDiv__Group__0 )
            // InternalGoatComponentsParser.g:875:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalGoatComponentsParser.g:884:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:885:1: ( rulePrimary EOF )
            // InternalGoatComponentsParser.g:886:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalGoatComponentsParser.g:893:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:897:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalGoatComponentsParser.g:898:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:898:2: ( ( rule__Primary__Alternatives ) )
            // InternalGoatComponentsParser.g:899:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:900:3: ( rule__Primary__Alternatives )
            // InternalGoatComponentsParser.g:900:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalGoatComponentsParser.g:909:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:910:1: ( ruleAtomic EOF )
            // InternalGoatComponentsParser.g:911:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalGoatComponentsParser.g:918:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:922:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalGoatComponentsParser.g:923:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:923:2: ( ( rule__Atomic__Alternatives ) )
            // InternalGoatComponentsParser.g:924:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:925:3: ( rule__Atomic__Alternatives )
            // InternalGoatComponentsParser.g:925:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleAttributeToSet"
    // InternalGoatComponentsParser.g:934:1: entryRuleAttributeToSet : ruleAttributeToSet EOF ;
    public final void entryRuleAttributeToSet() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:935:1: ( ruleAttributeToSet EOF )
            // InternalGoatComponentsParser.g:936:1: ruleAttributeToSet EOF
            {
             before(grammarAccess.getAttributeToSetRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeToSet();

            state._fsp--;

             after(grammarAccess.getAttributeToSetRule()); 
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
    // $ANTLR end "entryRuleAttributeToSet"


    // $ANTLR start "ruleAttributeToSet"
    // InternalGoatComponentsParser.g:943:1: ruleAttributeToSet : ( ( rule__AttributeToSet__Alternatives ) ) ;
    public final void ruleAttributeToSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:947:2: ( ( ( rule__AttributeToSet__Alternatives ) ) )
            // InternalGoatComponentsParser.g:948:2: ( ( rule__AttributeToSet__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:948:2: ( ( rule__AttributeToSet__Alternatives ) )
            // InternalGoatComponentsParser.g:949:3: ( rule__AttributeToSet__Alternatives )
            {
             before(grammarAccess.getAttributeToSetAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:950:3: ( rule__AttributeToSet__Alternatives )
            // InternalGoatComponentsParser.g:950:4: rule__AttributeToSet__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeToSet__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeToSetAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeToSet"


    // $ANTLR start "entryRuleFuncParam"
    // InternalGoatComponentsParser.g:959:1: entryRuleFuncParam : ruleFuncParam EOF ;
    public final void entryRuleFuncParam() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:960:1: ( ruleFuncParam EOF )
            // InternalGoatComponentsParser.g:961:1: ruleFuncParam EOF
            {
             before(grammarAccess.getFuncParamRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncParam();

            state._fsp--;

             after(grammarAccess.getFuncParamRule()); 
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
    // $ANTLR end "entryRuleFuncParam"


    // $ANTLR start "ruleFuncParam"
    // InternalGoatComponentsParser.g:968:1: ruleFuncParam : ( ( rule__FuncParam__Group__0 ) ) ;
    public final void ruleFuncParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:972:2: ( ( ( rule__FuncParam__Group__0 ) ) )
            // InternalGoatComponentsParser.g:973:2: ( ( rule__FuncParam__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:973:2: ( ( rule__FuncParam__Group__0 ) )
            // InternalGoatComponentsParser.g:974:3: ( rule__FuncParam__Group__0 )
            {
             before(grammarAccess.getFuncParamAccess().getGroup()); 
            // InternalGoatComponentsParser.g:975:3: ( rule__FuncParam__Group__0 )
            // InternalGoatComponentsParser.g:975:4: rule__FuncParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncParamAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncParam"


    // $ANTLR start "entryRuleFuncDefinition"
    // InternalGoatComponentsParser.g:984:1: entryRuleFuncDefinition : ruleFuncDefinition EOF ;
    public final void entryRuleFuncDefinition() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:985:1: ( ruleFuncDefinition EOF )
            // InternalGoatComponentsParser.g:986:1: ruleFuncDefinition EOF
            {
             before(grammarAccess.getFuncDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncDefinition();

            state._fsp--;

             after(grammarAccess.getFuncDefinitionRule()); 
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
    // $ANTLR end "entryRuleFuncDefinition"


    // $ANTLR start "ruleFuncDefinition"
    // InternalGoatComponentsParser.g:993:1: ruleFuncDefinition : ( ( rule__FuncDefinition__Group__0 ) ) ;
    public final void ruleFuncDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:997:2: ( ( ( rule__FuncDefinition__Group__0 ) ) )
            // InternalGoatComponentsParser.g:998:2: ( ( rule__FuncDefinition__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:998:2: ( ( rule__FuncDefinition__Group__0 ) )
            // InternalGoatComponentsParser.g:999:3: ( rule__FuncDefinition__Group__0 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1000:3: ( rule__FuncDefinition__Group__0 )
            // InternalGoatComponentsParser.g:1000:4: rule__FuncDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncDefinition"


    // $ANTLR start "entryRuleFuncBlock"
    // InternalGoatComponentsParser.g:1009:1: entryRuleFuncBlock : ruleFuncBlock EOF ;
    public final void entryRuleFuncBlock() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:1010:1: ( ruleFuncBlock EOF )
            // InternalGoatComponentsParser.g:1011:1: ruleFuncBlock EOF
            {
             before(grammarAccess.getFuncBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncBlock();

            state._fsp--;

             after(grammarAccess.getFuncBlockRule()); 
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
    // $ANTLR end "entryRuleFuncBlock"


    // $ANTLR start "ruleFuncBlock"
    // InternalGoatComponentsParser.g:1018:1: ruleFuncBlock : ( ( rule__FuncBlock__Group__0 ) ) ;
    public final void ruleFuncBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1022:2: ( ( ( rule__FuncBlock__Group__0 ) ) )
            // InternalGoatComponentsParser.g:1023:2: ( ( rule__FuncBlock__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:1023:2: ( ( rule__FuncBlock__Group__0 ) )
            // InternalGoatComponentsParser.g:1024:3: ( rule__FuncBlock__Group__0 )
            {
             before(grammarAccess.getFuncBlockAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1025:3: ( rule__FuncBlock__Group__0 )
            // InternalGoatComponentsParser.g:1025:4: rule__FuncBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncBlock"


    // $ANTLR start "entryRuleFuncStatement"
    // InternalGoatComponentsParser.g:1034:1: entryRuleFuncStatement : ruleFuncStatement EOF ;
    public final void entryRuleFuncStatement() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:1035:1: ( ruleFuncStatement EOF )
            // InternalGoatComponentsParser.g:1036:1: ruleFuncStatement EOF
            {
             before(grammarAccess.getFuncStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncStatement();

            state._fsp--;

             after(grammarAccess.getFuncStatementRule()); 
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
    // $ANTLR end "entryRuleFuncStatement"


    // $ANTLR start "ruleFuncStatement"
    // InternalGoatComponentsParser.g:1043:1: ruleFuncStatement : ( ( rule__FuncStatement__Alternatives ) ) ;
    public final void ruleFuncStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1047:2: ( ( ( rule__FuncStatement__Alternatives ) ) )
            // InternalGoatComponentsParser.g:1048:2: ( ( rule__FuncStatement__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:1048:2: ( ( rule__FuncStatement__Alternatives ) )
            // InternalGoatComponentsParser.g:1049:3: ( rule__FuncStatement__Alternatives )
            {
             before(grammarAccess.getFuncStatementAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:1050:3: ( rule__FuncStatement__Alternatives )
            // InternalGoatComponentsParser.g:1050:4: rule__FuncStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FuncStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFuncStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFuncStatement"


    // $ANTLR start "entryRuleFuncVarDeclaration"
    // InternalGoatComponentsParser.g:1059:1: entryRuleFuncVarDeclaration : ruleFuncVarDeclaration EOF ;
    public final void entryRuleFuncVarDeclaration() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:1060:1: ( ruleFuncVarDeclaration EOF )
            // InternalGoatComponentsParser.g:1061:1: ruleFuncVarDeclaration EOF
            {
             before(grammarAccess.getFuncVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncVarDeclaration();

            state._fsp--;

             after(grammarAccess.getFuncVarDeclarationRule()); 
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
    // $ANTLR end "entryRuleFuncVarDeclaration"


    // $ANTLR start "ruleFuncVarDeclaration"
    // InternalGoatComponentsParser.g:1068:1: ruleFuncVarDeclaration : ( ( rule__FuncVarDeclaration__Group__0 ) ) ;
    public final void ruleFuncVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1072:2: ( ( ( rule__FuncVarDeclaration__Group__0 ) ) )
            // InternalGoatComponentsParser.g:1073:2: ( ( rule__FuncVarDeclaration__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:1073:2: ( ( rule__FuncVarDeclaration__Group__0 ) )
            // InternalGoatComponentsParser.g:1074:3: ( rule__FuncVarDeclaration__Group__0 )
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1075:3: ( rule__FuncVarDeclaration__Group__0 )
            // InternalGoatComponentsParser.g:1075:4: rule__FuncVarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncVarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncVarDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncVarDeclaration"


    // $ANTLR start "entryRuleFuncVarAssign"
    // InternalGoatComponentsParser.g:1084:1: entryRuleFuncVarAssign : ruleFuncVarAssign EOF ;
    public final void entryRuleFuncVarAssign() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:1085:1: ( ruleFuncVarAssign EOF )
            // InternalGoatComponentsParser.g:1086:1: ruleFuncVarAssign EOF
            {
             before(grammarAccess.getFuncVarAssignRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncVarAssign();

            state._fsp--;

             after(grammarAccess.getFuncVarAssignRule()); 
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
    // $ANTLR end "entryRuleFuncVarAssign"


    // $ANTLR start "ruleFuncVarAssign"
    // InternalGoatComponentsParser.g:1093:1: ruleFuncVarAssign : ( ( rule__FuncVarAssign__Group__0 ) ) ;
    public final void ruleFuncVarAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1097:2: ( ( ( rule__FuncVarAssign__Group__0 ) ) )
            // InternalGoatComponentsParser.g:1098:2: ( ( rule__FuncVarAssign__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:1098:2: ( ( rule__FuncVarAssign__Group__0 ) )
            // InternalGoatComponentsParser.g:1099:3: ( rule__FuncVarAssign__Group__0 )
            {
             before(grammarAccess.getFuncVarAssignAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1100:3: ( rule__FuncVarAssign__Group__0 )
            // InternalGoatComponentsParser.g:1100:4: rule__FuncVarAssign__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncVarAssign__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncVarAssignAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncVarAssign"


    // $ANTLR start "entryRuleFuncIfElse"
    // InternalGoatComponentsParser.g:1109:1: entryRuleFuncIfElse : ruleFuncIfElse EOF ;
    public final void entryRuleFuncIfElse() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:1110:1: ( ruleFuncIfElse EOF )
            // InternalGoatComponentsParser.g:1111:1: ruleFuncIfElse EOF
            {
             before(grammarAccess.getFuncIfElseRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncIfElse();

            state._fsp--;

             after(grammarAccess.getFuncIfElseRule()); 
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
    // $ANTLR end "entryRuleFuncIfElse"


    // $ANTLR start "ruleFuncIfElse"
    // InternalGoatComponentsParser.g:1118:1: ruleFuncIfElse : ( ( rule__FuncIfElse__Group__0 ) ) ;
    public final void ruleFuncIfElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1122:2: ( ( ( rule__FuncIfElse__Group__0 ) ) )
            // InternalGoatComponentsParser.g:1123:2: ( ( rule__FuncIfElse__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:1123:2: ( ( rule__FuncIfElse__Group__0 ) )
            // InternalGoatComponentsParser.g:1124:3: ( rule__FuncIfElse__Group__0 )
            {
             before(grammarAccess.getFuncIfElseAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1125:3: ( rule__FuncIfElse__Group__0 )
            // InternalGoatComponentsParser.g:1125:4: rule__FuncIfElse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncIfElseAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncIfElse"


    // $ANTLR start "entryRuleFuncReturn"
    // InternalGoatComponentsParser.g:1134:1: entryRuleFuncReturn : ruleFuncReturn EOF ;
    public final void entryRuleFuncReturn() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:1135:1: ( ruleFuncReturn EOF )
            // InternalGoatComponentsParser.g:1136:1: ruleFuncReturn EOF
            {
             before(grammarAccess.getFuncReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncReturn();

            state._fsp--;

             after(grammarAccess.getFuncReturnRule()); 
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
    // $ANTLR end "entryRuleFuncReturn"


    // $ANTLR start "ruleFuncReturn"
    // InternalGoatComponentsParser.g:1143:1: ruleFuncReturn : ( ( rule__FuncReturn__Group__0 ) ) ;
    public final void ruleFuncReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1147:2: ( ( ( rule__FuncReturn__Group__0 ) ) )
            // InternalGoatComponentsParser.g:1148:2: ( ( rule__FuncReturn__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:1148:2: ( ( rule__FuncReturn__Group__0 ) )
            // InternalGoatComponentsParser.g:1149:3: ( rule__FuncReturn__Group__0 )
            {
             before(grammarAccess.getFuncReturnAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1150:3: ( rule__FuncReturn__Group__0 )
            // InternalGoatComponentsParser.g:1150:4: rule__FuncReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncReturnAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncReturn"


    // $ANTLR start "rule__Model__Alternatives_1"
    // InternalGoatComponentsParser.g:1158:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__ProcessesAssignment_1_0 ) ) | ( ( rule__Model__ComponentsAssignment_1_1 ) ) | ( ( rule__Model__FunctionsAssignment_1_2 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1162:1: ( ( ( rule__Model__ProcessesAssignment_1_0 ) ) | ( ( rule__Model__ComponentsAssignment_1_1 ) ) | ( ( rule__Model__FunctionsAssignment_1_2 ) ) )
            int alt1=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGoatComponentsParser.g:1163:2: ( ( rule__Model__ProcessesAssignment_1_0 ) )
                    {
                    // InternalGoatComponentsParser.g:1163:2: ( ( rule__Model__ProcessesAssignment_1_0 ) )
                    // InternalGoatComponentsParser.g:1164:3: ( rule__Model__ProcessesAssignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getProcessesAssignment_1_0()); 
                    // InternalGoatComponentsParser.g:1165:3: ( rule__Model__ProcessesAssignment_1_0 )
                    // InternalGoatComponentsParser.g:1165:4: rule__Model__ProcessesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ProcessesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProcessesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1169:2: ( ( rule__Model__ComponentsAssignment_1_1 ) )
                    {
                    // InternalGoatComponentsParser.g:1169:2: ( ( rule__Model__ComponentsAssignment_1_1 ) )
                    // InternalGoatComponentsParser.g:1170:3: ( rule__Model__ComponentsAssignment_1_1 )
                    {
                     before(grammarAccess.getModelAccess().getComponentsAssignment_1_1()); 
                    // InternalGoatComponentsParser.g:1171:3: ( rule__Model__ComponentsAssignment_1_1 )
                    // InternalGoatComponentsParser.g:1171:4: rule__Model__ComponentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ComponentsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getComponentsAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1175:2: ( ( rule__Model__FunctionsAssignment_1_2 ) )
                    {
                    // InternalGoatComponentsParser.g:1175:2: ( ( rule__Model__FunctionsAssignment_1_2 ) )
                    // InternalGoatComponentsParser.g:1176:3: ( rule__Model__FunctionsAssignment_1_2 )
                    {
                     before(grammarAccess.getModelAccess().getFunctionsAssignment_1_2()); 
                    // InternalGoatComponentsParser.g:1177:3: ( rule__Model__FunctionsAssignment_1_2 )
                    // InternalGoatComponentsParser.g:1177:4: rule__Model__FunctionsAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__FunctionsAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFunctionsAssignment_1_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Model__Alternatives_1"


    // $ANTLR start "rule__Proc__Alternatives"
    // InternalGoatComponentsParser.g:1185:1: rule__Proc__Alternatives : ( ( ruleInterleavingProcess ) | ( ruleNonDeterminismProcess ) );
    public final void rule__Proc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1189:1: ( ( ruleInterleavingProcess ) | ( ruleNonDeterminismProcess ) )
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
                    // InternalGoatComponentsParser.g:1190:2: ( ruleInterleavingProcess )
                    {
                    // InternalGoatComponentsParser.g:1190:2: ( ruleInterleavingProcess )
                    // InternalGoatComponentsParser.g:1191:3: ruleInterleavingProcess
                    {
                     before(grammarAccess.getProcAccess().getInterleavingProcessParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterleavingProcess();

                    state._fsp--;

                     after(grammarAccess.getProcAccess().getInterleavingProcessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1196:2: ( ruleNonDeterminismProcess )
                    {
                    // InternalGoatComponentsParser.g:1196:2: ( ruleNonDeterminismProcess )
                    // InternalGoatComponentsParser.g:1197:3: ruleNonDeterminismProcess
                    {
                     before(grammarAccess.getProcAccess().getNonDeterminismProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonDeterminismProcess();

                    state._fsp--;

                     after(grammarAccess.getProcAccess().getNonDeterminismProcessParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Proc__Alternatives"


    // $ANTLR start "rule__NonDeterminismProcess__Alternatives"
    // InternalGoatComponentsParser.g:1206:1: rule__NonDeterminismProcess__Alternatives : ( ( rulePredOutputProcessOrInputProcesses ) | ( ruleIfProcesses ) | ( ruleNProcess ) );
    public final void rule__NonDeterminismProcess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1210:1: ( ( rulePredOutputProcessOrInputProcesses ) | ( ruleIfProcesses ) | ( ruleNProcess ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case EOF:
            case Receive:
            case Send:
            case Wait:
            case LeftSquareBracket:
            case LeftCurlyBracket:
                {
                alt3=1;
                }
                break;
            case If:
                {
                alt3=2;
                }
                break;
            case Nil:
            case LeftParenthesis:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGoatComponentsParser.g:1211:2: ( rulePredOutputProcessOrInputProcesses )
                    {
                    // InternalGoatComponentsParser.g:1211:2: ( rulePredOutputProcessOrInputProcesses )
                    // InternalGoatComponentsParser.g:1212:3: rulePredOutputProcessOrInputProcesses
                    {
                     before(grammarAccess.getNonDeterminismProcessAccess().getPredOutputProcessOrInputProcessesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePredOutputProcessOrInputProcesses();

                    state._fsp--;

                     after(grammarAccess.getNonDeterminismProcessAccess().getPredOutputProcessOrInputProcessesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1217:2: ( ruleIfProcesses )
                    {
                    // InternalGoatComponentsParser.g:1217:2: ( ruleIfProcesses )
                    // InternalGoatComponentsParser.g:1218:3: ruleIfProcesses
                    {
                     before(grammarAccess.getNonDeterminismProcessAccess().getIfProcessesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIfProcesses();

                    state._fsp--;

                     after(grammarAccess.getNonDeterminismProcessAccess().getIfProcessesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1223:2: ( ruleNProcess )
                    {
                    // InternalGoatComponentsParser.g:1223:2: ( ruleNProcess )
                    // InternalGoatComponentsParser.g:1224:3: ruleNProcess
                    {
                     before(grammarAccess.getNonDeterminismProcessAccess().getNProcessParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNProcess();

                    state._fsp--;

                     after(grammarAccess.getNonDeterminismProcessAccess().getNProcessParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__NonDeterminismProcess__Alternatives"


    // $ANTLR start "rule__Preconditions__PrecondAlternatives_1_0"
    // InternalGoatComponentsParser.g:1233:1: rule__Preconditions__PrecondAlternatives_1_0 : ( ( ruleUpdate ) | ( ruleAwareness ) );
    public final void rule__Preconditions__PrecondAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1237:1: ( ( ruleUpdate ) | ( ruleAwareness ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LeftSquareBracket) ) {
                alt4=1;
            }
            else if ( (LA4_0==Wait) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGoatComponentsParser.g:1238:2: ( ruleUpdate )
                    {
                    // InternalGoatComponentsParser.g:1238:2: ( ruleUpdate )
                    // InternalGoatComponentsParser.g:1239:3: ruleUpdate
                    {
                     before(grammarAccess.getPreconditionsAccess().getPrecondUpdateParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdate();

                    state._fsp--;

                     after(grammarAccess.getPreconditionsAccess().getPrecondUpdateParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1244:2: ( ruleAwareness )
                    {
                    // InternalGoatComponentsParser.g:1244:2: ( ruleAwareness )
                    // InternalGoatComponentsParser.g:1245:3: ruleAwareness
                    {
                     before(grammarAccess.getPreconditionsAccess().getPrecondAwarenessParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAwareness();

                    state._fsp--;

                     after(grammarAccess.getPreconditionsAccess().getPrecondAwarenessParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Preconditions__PrecondAlternatives_1_0"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Alternatives_1"
    // InternalGoatComponentsParser.g:1254:1: rule__PredOutputProcessOrInputProcesses__Alternatives_1 : ( ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) ) );
    public final void rule__PredOutputProcessOrInputProcesses__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1258:1: ( ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Send) ) {
                alt5=1;
            }
            else if ( (LA5_0==Receive) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGoatComponentsParser.g:1259:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1259:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) )
                    // InternalGoatComponentsParser.g:1260:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup_1_0()); 
                    // InternalGoatComponentsParser.g:1261:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 )
                    // InternalGoatComponentsParser.g:1261:4: rule__PredOutputProcessOrInputProcesses__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredOutputProcessOrInputProcesses__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1265:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1265:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) )
                    // InternalGoatComponentsParser.g:1266:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup_1_1()); 
                    // InternalGoatComponentsParser.g:1267:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 )
                    // InternalGoatComponentsParser.g:1267:4: rule__PredOutputProcessOrInputProcesses__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredOutputProcessOrInputProcesses__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup_1_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Alternatives_1"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Alternatives_1"
    // InternalGoatComponentsParser.g:1275:1: rule__PredOutputProcessOrInputProcess__Alternatives_1 : ( ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) ) );
    public final void rule__PredOutputProcessOrInputProcess__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1279:1: ( ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Send) ) {
                alt6=1;
            }
            else if ( (LA6_0==Receive) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoatComponentsParser.g:1280:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1280:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) )
                    // InternalGoatComponentsParser.g:1281:3: ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup_1_0()); 
                    // InternalGoatComponentsParser.g:1282:3: ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 )
                    // InternalGoatComponentsParser.g:1282:4: rule__PredOutputProcessOrInputProcess__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredOutputProcessOrInputProcess__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1286:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1286:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) )
                    // InternalGoatComponentsParser.g:1287:3: ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup_1_1()); 
                    // InternalGoatComponentsParser.g:1288:3: ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 )
                    // InternalGoatComponentsParser.g:1288:4: rule__PredOutputProcessOrInputProcess__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredOutputProcessOrInputProcess__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup_1_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Alternatives_1"


    // $ANTLR start "rule__NZCProcess__Alternatives"
    // InternalGoatComponentsParser.g:1296:1: rule__NZCProcess__Alternatives : ( ( ( rule__NZCProcess__Group_0__0 ) ) | ( ruleZeroProcess ) | ( ruleCallProcess ) );
    public final void rule__NZCProcess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1300:1: ( ( ( rule__NZCProcess__Group_0__0 ) ) | ( ruleZeroProcess ) | ( ruleCallProcess ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt7=1;
                }
                break;
            case Nil:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGoatComponentsParser.g:1301:2: ( ( rule__NZCProcess__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1301:2: ( ( rule__NZCProcess__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1302:3: ( rule__NZCProcess__Group_0__0 )
                    {
                     before(grammarAccess.getNZCProcessAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1303:3: ( rule__NZCProcess__Group_0__0 )
                    // InternalGoatComponentsParser.g:1303:4: rule__NZCProcess__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NZCProcess__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNZCProcessAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1307:2: ( ruleZeroProcess )
                    {
                    // InternalGoatComponentsParser.g:1307:2: ( ruleZeroProcess )
                    // InternalGoatComponentsParser.g:1308:3: ruleZeroProcess
                    {
                     before(grammarAccess.getNZCProcessAccess().getZeroProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleZeroProcess();

                    state._fsp--;

                     after(grammarAccess.getNZCProcessAccess().getZeroProcessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1313:2: ( ruleCallProcess )
                    {
                    // InternalGoatComponentsParser.g:1313:2: ( ruleCallProcess )
                    // InternalGoatComponentsParser.g:1314:3: ruleCallProcess
                    {
                     before(grammarAccess.getNZCProcessAccess().getCallProcessParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCallProcess();

                    state._fsp--;

                     after(grammarAccess.getNZCProcessAccess().getCallProcessParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__NZCProcess__Alternatives"


    // $ANTLR start "rule__NProcess__Alternatives"
    // InternalGoatComponentsParser.g:1323:1: rule__NProcess__Alternatives : ( ( ( rule__NProcess__Group_0__0 ) ) | ( ruleZeroProcess ) );
    public final void rule__NProcess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1327:1: ( ( ( rule__NProcess__Group_0__0 ) ) | ( ruleZeroProcess ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LeftParenthesis) ) {
                alt8=1;
            }
            else if ( (LA8_0==Nil) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoatComponentsParser.g:1328:2: ( ( rule__NProcess__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1328:2: ( ( rule__NProcess__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1329:3: ( rule__NProcess__Group_0__0 )
                    {
                     before(grammarAccess.getNProcessAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1330:3: ( rule__NProcess__Group_0__0 )
                    // InternalGoatComponentsParser.g:1330:4: rule__NProcess__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NProcess__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNProcessAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1334:2: ( ruleZeroProcess )
                    {
                    // InternalGoatComponentsParser.g:1334:2: ( ruleZeroProcess )
                    // InternalGoatComponentsParser.g:1335:3: ruleZeroProcess
                    {
                     before(grammarAccess.getNProcessAccess().getZeroProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleZeroProcess();

                    state._fsp--;

                     after(grammarAccess.getNProcessAccess().getZeroProcessParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__NProcess__Alternatives"


    // $ANTLR start "rule__EnvInitValue__Alternatives"
    // InternalGoatComponentsParser.g:1344:1: rule__EnvInitValue__Alternatives : ( ( ( rule__EnvInitValue__Group_0__0 ) ) | ( ( rule__EnvInitValue__Group_1__0 ) ) | ( ( rule__EnvInitValue__Group_2__0 ) ) );
    public final void rule__EnvInitValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1348:1: ( ( ( rule__EnvInitValue__Group_0__0 ) ) | ( ( rule__EnvInitValue__Group_1__0 ) ) | ( ( rule__EnvInitValue__Group_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case False:
            case True:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGoatComponentsParser.g:1349:2: ( ( rule__EnvInitValue__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1349:2: ( ( rule__EnvInitValue__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1350:3: ( rule__EnvInitValue__Group_0__0 )
                    {
                     before(grammarAccess.getEnvInitValueAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1351:3: ( rule__EnvInitValue__Group_0__0 )
                    // InternalGoatComponentsParser.g:1351:4: rule__EnvInitValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvInitValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvInitValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1355:2: ( ( rule__EnvInitValue__Group_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1355:2: ( ( rule__EnvInitValue__Group_1__0 ) )
                    // InternalGoatComponentsParser.g:1356:3: ( rule__EnvInitValue__Group_1__0 )
                    {
                     before(grammarAccess.getEnvInitValueAccess().getGroup_1()); 
                    // InternalGoatComponentsParser.g:1357:3: ( rule__EnvInitValue__Group_1__0 )
                    // InternalGoatComponentsParser.g:1357:4: rule__EnvInitValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvInitValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvInitValueAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1361:2: ( ( rule__EnvInitValue__Group_2__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1361:2: ( ( rule__EnvInitValue__Group_2__0 ) )
                    // InternalGoatComponentsParser.g:1362:3: ( rule__EnvInitValue__Group_2__0 )
                    {
                     before(grammarAccess.getEnvInitValueAccess().getGroup_2()); 
                    // InternalGoatComponentsParser.g:1363:3: ( rule__EnvInitValue__Group_2__0 )
                    // InternalGoatComponentsParser.g:1363:4: rule__EnvInitValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvInitValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvInitValueAccess().getGroup_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EnvInitValue__Alternatives"


    // $ANTLR start "rule__EnvInitValue__ValueAlternatives_2_1_0"
    // InternalGoatComponentsParser.g:1371:1: rule__EnvInitValue__ValueAlternatives_2_1_0 : ( ( True ) | ( False ) );
    public final void rule__EnvInitValue__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1375:1: ( ( True ) | ( False ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==True) ) {
                alt10=1;
            }
            else if ( (LA10_0==False) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGoatComponentsParser.g:1376:2: ( True )
                    {
                    // InternalGoatComponentsParser.g:1376:2: ( True )
                    // InternalGoatComponentsParser.g:1377:3: True
                    {
                     before(grammarAccess.getEnvInitValueAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEnvInitValueAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1382:2: ( False )
                    {
                    // InternalGoatComponentsParser.g:1382:2: ( False )
                    // InternalGoatComponentsParser.g:1383:3: False
                    {
                     before(grammarAccess.getEnvInitValueAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,False,FOLLOW_2); 
                     after(grammarAccess.getEnvInitValueAccess().getValueFalseKeyword_2_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EnvInitValue__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalGoatComponentsParser.g:1392:1: rule__Equality__OpAlternatives_1_1_0 : ( ( EqualsSignEqualsSign ) | ( ExclamationMarkEqualsSign ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1396:1: ( ( EqualsSignEqualsSign ) | ( ExclamationMarkEqualsSign ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EqualsSignEqualsSign) ) {
                alt11=1;
            }
            else if ( (LA11_0==ExclamationMarkEqualsSign) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoatComponentsParser.g:1397:2: ( EqualsSignEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:1397:2: ( EqualsSignEqualsSign )
                    // InternalGoatComponentsParser.g:1398:3: EqualsSignEqualsSign
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,EqualsSignEqualsSign,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1403:2: ( ExclamationMarkEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:1403:2: ( ExclamationMarkEqualsSign )
                    // InternalGoatComponentsParser.g:1404:3: ExclamationMarkEqualsSign
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,ExclamationMarkEqualsSign,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // InternalGoatComponentsParser.g:1413:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( GreaterThanSignEqualsSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSign ) | ( LessThanSign ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1417:1: ( ( GreaterThanSignEqualsSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSign ) | ( LessThanSign ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case GreaterThanSignEqualsSign:
                {
                alt12=1;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt12=2;
                }
                break;
            case GreaterThanSign:
                {
                alt12=3;
                }
                break;
            case LessThanSign:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGoatComponentsParser.g:1418:2: ( GreaterThanSignEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:1418:2: ( GreaterThanSignEqualsSign )
                    // InternalGoatComponentsParser.g:1419:3: GreaterThanSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,GreaterThanSignEqualsSign,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1424:2: ( LessThanSignEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:1424:2: ( LessThanSignEqualsSign )
                    // InternalGoatComponentsParser.g:1425:3: LessThanSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,LessThanSignEqualsSign,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1430:2: ( GreaterThanSign )
                    {
                    // InternalGoatComponentsParser.g:1430:2: ( GreaterThanSign )
                    // InternalGoatComponentsParser.g:1431:3: GreaterThanSign
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,GreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:1436:2: ( LessThanSign )
                    {
                    // InternalGoatComponentsParser.g:1436:2: ( LessThanSign )
                    // InternalGoatComponentsParser.g:1437:3: LessThanSign
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,LessThanSign,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalGoatComponentsParser.g:1446:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_2__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1450:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                alt13=1;
                }
                break;
            case HyphenMinus:
                {
                alt13=2;
                }
                break;
            case PlusSignPlusSign:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalGoatComponentsParser.g:1451:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1451:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalGoatComponentsParser.g:1452:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalGoatComponentsParser.g:1453:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalGoatComponentsParser.g:1453:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1457:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1457:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalGoatComponentsParser.g:1458:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalGoatComponentsParser.g:1459:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalGoatComponentsParser.g:1459:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1463:2: ( ( rule__PlusOrMinus__Group_1_0_2__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1463:2: ( ( rule__PlusOrMinus__Group_1_0_2__0 ) )
                    // InternalGoatComponentsParser.g:1464:3: ( rule__PlusOrMinus__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_2()); 
                    // InternalGoatComponentsParser.g:1465:3: ( rule__PlusOrMinus__Group_1_0_2__0 )
                    // InternalGoatComponentsParser.g:1465:4: rule__PlusOrMinus__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_1_0"
    // InternalGoatComponentsParser.g:1473:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( Asterisk ) | ( Solidus ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1477:1: ( ( Asterisk ) | ( Solidus ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Asterisk) ) {
                alt14=1;
            }
            else if ( (LA14_0==Solidus) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGoatComponentsParser.g:1478:2: ( Asterisk )
                    {
                    // InternalGoatComponentsParser.g:1478:2: ( Asterisk )
                    // InternalGoatComponentsParser.g:1479:3: Asterisk
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,Asterisk,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1484:2: ( Solidus )
                    {
                    // InternalGoatComponentsParser.g:1484:2: ( Solidus )
                    // InternalGoatComponentsParser.g:1485:3: Solidus
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,Solidus,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalGoatComponentsParser.g:1494:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1498:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt15=1;
                }
                break;
            case ExclamationMark:
                {
                alt15=2;
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
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalGoatComponentsParser.g:1499:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1499:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1500:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1501:3: ( rule__Primary__Group_0__0 )
                    // InternalGoatComponentsParser.g:1501:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1505:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1505:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalGoatComponentsParser.g:1506:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalGoatComponentsParser.g:1507:3: ( rule__Primary__Group_1__0 )
                    // InternalGoatComponentsParser.g:1507:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1511:2: ( ruleAtomic )
                    {
                    // InternalGoatComponentsParser.g:1511:2: ( ruleAtomic )
                    // InternalGoatComponentsParser.g:1512:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalGoatComponentsParser.g:1521:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1525:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) )
            int alt16=8;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalGoatComponentsParser.g:1526:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1526:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1527:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1528:3: ( rule__Atomic__Group_0__0 )
                    // InternalGoatComponentsParser.g:1528:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1532:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1532:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalGoatComponentsParser.g:1533:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalGoatComponentsParser.g:1534:3: ( rule__Atomic__Group_1__0 )
                    // InternalGoatComponentsParser.g:1534:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1538:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1538:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalGoatComponentsParser.g:1539:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalGoatComponentsParser.g:1540:3: ( rule__Atomic__Group_2__0 )
                    // InternalGoatComponentsParser.g:1540:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:1544:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1544:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalGoatComponentsParser.g:1545:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalGoatComponentsParser.g:1546:3: ( rule__Atomic__Group_3__0 )
                    // InternalGoatComponentsParser.g:1546:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGoatComponentsParser.g:1550:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1550:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalGoatComponentsParser.g:1551:3: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // InternalGoatComponentsParser.g:1552:3: ( rule__Atomic__Group_4__0 )
                    // InternalGoatComponentsParser.g:1552:4: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGoatComponentsParser.g:1556:2: ( ( rule__Atomic__Group_5__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1556:2: ( ( rule__Atomic__Group_5__0 ) )
                    // InternalGoatComponentsParser.g:1557:3: ( rule__Atomic__Group_5__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_5()); 
                    // InternalGoatComponentsParser.g:1558:3: ( rule__Atomic__Group_5__0 )
                    // InternalGoatComponentsParser.g:1558:4: rule__Atomic__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGoatComponentsParser.g:1562:2: ( ( rule__Atomic__Group_6__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1562:2: ( ( rule__Atomic__Group_6__0 ) )
                    // InternalGoatComponentsParser.g:1563:3: ( rule__Atomic__Group_6__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_6()); 
                    // InternalGoatComponentsParser.g:1564:3: ( rule__Atomic__Group_6__0 )
                    // InternalGoatComponentsParser.g:1564:4: rule__Atomic__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGoatComponentsParser.g:1568:2: ( ( rule__Atomic__Group_7__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1568:2: ( ( rule__Atomic__Group_7__0 ) )
                    // InternalGoatComponentsParser.g:1569:3: ( rule__Atomic__Group_7__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_7()); 
                    // InternalGoatComponentsParser.g:1570:3: ( rule__Atomic__Group_7__0 )
                    // InternalGoatComponentsParser.g:1570:4: rule__Atomic__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_7()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // InternalGoatComponentsParser.g:1578:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( True ) | ( False ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1582:1: ( ( True ) | ( False ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==True) ) {
                alt17=1;
            }
            else if ( (LA17_0==False) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGoatComponentsParser.g:1583:2: ( True )
                    {
                    // InternalGoatComponentsParser.g:1583:2: ( True )
                    // InternalGoatComponentsParser.g:1584:3: True
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1589:2: ( False )
                    {
                    // InternalGoatComponentsParser.g:1589:2: ( False )
                    // InternalGoatComponentsParser.g:1590:3: False
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,False,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__AttributeToSet__Alternatives"
    // InternalGoatComponentsParser.g:1599:1: rule__AttributeToSet__Alternatives : ( ( ( rule__AttributeToSet__Group_0__0 ) ) | ( ( rule__AttributeToSet__Group_1__0 ) ) );
    public final void rule__AttributeToSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1603:1: ( ( ( rule__AttributeToSet__Group_0__0 ) ) | ( ( rule__AttributeToSet__Group_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==This) ) {
                alt18=1;
            }
            else if ( (LA18_0==Proc) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGoatComponentsParser.g:1604:2: ( ( rule__AttributeToSet__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1604:2: ( ( rule__AttributeToSet__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1605:3: ( rule__AttributeToSet__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeToSetAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1606:3: ( rule__AttributeToSet__Group_0__0 )
                    // InternalGoatComponentsParser.g:1606:4: rule__AttributeToSet__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeToSet__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeToSetAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1610:2: ( ( rule__AttributeToSet__Group_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1610:2: ( ( rule__AttributeToSet__Group_1__0 ) )
                    // InternalGoatComponentsParser.g:1611:3: ( rule__AttributeToSet__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeToSetAccess().getGroup_1()); 
                    // InternalGoatComponentsParser.g:1612:3: ( rule__AttributeToSet__Group_1__0 )
                    // InternalGoatComponentsParser.g:1612:4: rule__AttributeToSet__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeToSet__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeToSetAccess().getGroup_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AttributeToSet__Alternatives"


    // $ANTLR start "rule__FuncStatement__Alternatives"
    // InternalGoatComponentsParser.g:1620:1: rule__FuncStatement__Alternatives : ( ( ruleFuncVarAssign ) | ( ruleFuncIfElse ) | ( ruleFuncReturn ) | ( ruleFuncVarDeclaration ) );
    public final void rule__FuncStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1624:1: ( ( ruleFuncVarAssign ) | ( ruleFuncIfElse ) | ( ruleFuncReturn ) | ( ruleFuncVarDeclaration ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case If:
                {
                alt19=2;
                }
                break;
            case Return:
                {
                alt19=3;
                }
                break;
            case Var:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGoatComponentsParser.g:1625:2: ( ruleFuncVarAssign )
                    {
                    // InternalGoatComponentsParser.g:1625:2: ( ruleFuncVarAssign )
                    // InternalGoatComponentsParser.g:1626:3: ruleFuncVarAssign
                    {
                     before(grammarAccess.getFuncStatementAccess().getFuncVarAssignParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncVarAssign();

                    state._fsp--;

                     after(grammarAccess.getFuncStatementAccess().getFuncVarAssignParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1631:2: ( ruleFuncIfElse )
                    {
                    // InternalGoatComponentsParser.g:1631:2: ( ruleFuncIfElse )
                    // InternalGoatComponentsParser.g:1632:3: ruleFuncIfElse
                    {
                     before(grammarAccess.getFuncStatementAccess().getFuncIfElseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncIfElse();

                    state._fsp--;

                     after(grammarAccess.getFuncStatementAccess().getFuncIfElseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1637:2: ( ruleFuncReturn )
                    {
                    // InternalGoatComponentsParser.g:1637:2: ( ruleFuncReturn )
                    // InternalGoatComponentsParser.g:1638:3: ruleFuncReturn
                    {
                     before(grammarAccess.getFuncStatementAccess().getFuncReturnParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncReturn();

                    state._fsp--;

                     after(grammarAccess.getFuncStatementAccess().getFuncReturnParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:1643:2: ( ruleFuncVarDeclaration )
                    {
                    // InternalGoatComponentsParser.g:1643:2: ( ruleFuncVarDeclaration )
                    // InternalGoatComponentsParser.g:1644:3: ruleFuncVarDeclaration
                    {
                     before(grammarAccess.getFuncStatementAccess().getFuncVarDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncVarDeclaration();

                    state._fsp--;

                     after(grammarAccess.getFuncStatementAccess().getFuncVarDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__FuncStatement__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalGoatComponentsParser.g:1653:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1657:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGoatComponentsParser.g:1658:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalGoatComponentsParser.g:1665:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1669:1: ( ( () ) )
            // InternalGoatComponentsParser.g:1670:1: ( () )
            {
            // InternalGoatComponentsParser.g:1670:1: ( () )
            // InternalGoatComponentsParser.g:1671:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalGoatComponentsParser.g:1672:2: ()
            // InternalGoatComponentsParser.g:1672:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalGoatComponentsParser.g:1680:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1684:1: ( rule__Model__Group__1__Impl )
            // InternalGoatComponentsParser.g:1685:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalGoatComponentsParser.g:1691:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1695:1: ( ( ( rule__Model__Alternatives_1 )* ) )
            // InternalGoatComponentsParser.g:1696:1: ( ( rule__Model__Alternatives_1 )* )
            {
            // InternalGoatComponentsParser.g:1696:1: ( ( rule__Model__Alternatives_1 )* )
            // InternalGoatComponentsParser.g:1697:2: ( rule__Model__Alternatives_1 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalGoatComponentsParser.g:1698:2: ( rule__Model__Alternatives_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=Component && LA20_0<=Function)||LA20_0==Proc) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1698:3: rule__Model__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__InterleavingProcess__Group__0"
    // InternalGoatComponentsParser.g:1707:1: rule__InterleavingProcess__Group__0 : rule__InterleavingProcess__Group__0__Impl rule__InterleavingProcess__Group__1 ;
    public final void rule__InterleavingProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1711:1: ( rule__InterleavingProcess__Group__0__Impl rule__InterleavingProcess__Group__1 )
            // InternalGoatComponentsParser.g:1712:2: rule__InterleavingProcess__Group__0__Impl rule__InterleavingProcess__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InterleavingProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterleavingProcess__Group__1();

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
    // $ANTLR end "rule__InterleavingProcess__Group__0"


    // $ANTLR start "rule__InterleavingProcess__Group__0__Impl"
    // InternalGoatComponentsParser.g:1719:1: rule__InterleavingProcess__Group__0__Impl : ( ruleCallProcess ) ;
    public final void rule__InterleavingProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1723:1: ( ( ruleCallProcess ) )
            // InternalGoatComponentsParser.g:1724:1: ( ruleCallProcess )
            {
            // InternalGoatComponentsParser.g:1724:1: ( ruleCallProcess )
            // InternalGoatComponentsParser.g:1725:2: ruleCallProcess
            {
             before(grammarAccess.getInterleavingProcessAccess().getCallProcessParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCallProcess();

            state._fsp--;

             after(grammarAccess.getInterleavingProcessAccess().getCallProcessParserRuleCall_0()); 

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
    // $ANTLR end "rule__InterleavingProcess__Group__0__Impl"


    // $ANTLR start "rule__InterleavingProcess__Group__1"
    // InternalGoatComponentsParser.g:1734:1: rule__InterleavingProcess__Group__1 : rule__InterleavingProcess__Group__1__Impl rule__InterleavingProcess__Group__2 ;
    public final void rule__InterleavingProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1738:1: ( rule__InterleavingProcess__Group__1__Impl rule__InterleavingProcess__Group__2 )
            // InternalGoatComponentsParser.g:1739:2: rule__InterleavingProcess__Group__1__Impl rule__InterleavingProcess__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__InterleavingProcess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterleavingProcess__Group__2();

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
    // $ANTLR end "rule__InterleavingProcess__Group__1"


    // $ANTLR start "rule__InterleavingProcess__Group__1__Impl"
    // InternalGoatComponentsParser.g:1746:1: rule__InterleavingProcess__Group__1__Impl : ( () ) ;
    public final void rule__InterleavingProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1750:1: ( ( () ) )
            // InternalGoatComponentsParser.g:1751:1: ( () )
            {
            // InternalGoatComponentsParser.g:1751:1: ( () )
            // InternalGoatComponentsParser.g:1752:2: ()
            {
             before(grammarAccess.getInterleavingProcessAccess().getInterleavingProcessSubProcsAction_1()); 
            // InternalGoatComponentsParser.g:1753:2: ()
            // InternalGoatComponentsParser.g:1753:3: 
            {
            }

             after(grammarAccess.getInterleavingProcessAccess().getInterleavingProcessSubProcsAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterleavingProcess__Group__1__Impl"


    // $ANTLR start "rule__InterleavingProcess__Group__2"
    // InternalGoatComponentsParser.g:1761:1: rule__InterleavingProcess__Group__2 : rule__InterleavingProcess__Group__2__Impl ;
    public final void rule__InterleavingProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1765:1: ( rule__InterleavingProcess__Group__2__Impl )
            // InternalGoatComponentsParser.g:1766:2: rule__InterleavingProcess__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterleavingProcess__Group__2__Impl();

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
    // $ANTLR end "rule__InterleavingProcess__Group__2"


    // $ANTLR start "rule__InterleavingProcess__Group__2__Impl"
    // InternalGoatComponentsParser.g:1772:1: rule__InterleavingProcess__Group__2__Impl : ( ( rule__InterleavingProcess__Group_2__0 )* ) ;
    public final void rule__InterleavingProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1776:1: ( ( ( rule__InterleavingProcess__Group_2__0 )* ) )
            // InternalGoatComponentsParser.g:1777:1: ( ( rule__InterleavingProcess__Group_2__0 )* )
            {
            // InternalGoatComponentsParser.g:1777:1: ( ( rule__InterleavingProcess__Group_2__0 )* )
            // InternalGoatComponentsParser.g:1778:2: ( rule__InterleavingProcess__Group_2__0 )*
            {
             before(grammarAccess.getInterleavingProcessAccess().getGroup_2()); 
            // InternalGoatComponentsParser.g:1779:2: ( rule__InterleavingProcess__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==VerticalLine) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1779:3: rule__InterleavingProcess__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__InterleavingProcess__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getInterleavingProcessAccess().getGroup_2()); 

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
    // $ANTLR end "rule__InterleavingProcess__Group__2__Impl"


    // $ANTLR start "rule__InterleavingProcess__Group_2__0"
    // InternalGoatComponentsParser.g:1788:1: rule__InterleavingProcess__Group_2__0 : rule__InterleavingProcess__Group_2__0__Impl rule__InterleavingProcess__Group_2__1 ;
    public final void rule__InterleavingProcess__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1792:1: ( rule__InterleavingProcess__Group_2__0__Impl rule__InterleavingProcess__Group_2__1 )
            // InternalGoatComponentsParser.g:1793:2: rule__InterleavingProcess__Group_2__0__Impl rule__InterleavingProcess__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__InterleavingProcess__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterleavingProcess__Group_2__1();

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
    // $ANTLR end "rule__InterleavingProcess__Group_2__0"


    // $ANTLR start "rule__InterleavingProcess__Group_2__0__Impl"
    // InternalGoatComponentsParser.g:1800:1: rule__InterleavingProcess__Group_2__0__Impl : ( VerticalLine ) ;
    public final void rule__InterleavingProcess__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1804:1: ( ( VerticalLine ) )
            // InternalGoatComponentsParser.g:1805:1: ( VerticalLine )
            {
            // InternalGoatComponentsParser.g:1805:1: ( VerticalLine )
            // InternalGoatComponentsParser.g:1806:2: VerticalLine
            {
             before(grammarAccess.getInterleavingProcessAccess().getVerticalLineKeyword_2_0()); 
            match(input,VerticalLine,FOLLOW_2); 
             after(grammarAccess.getInterleavingProcessAccess().getVerticalLineKeyword_2_0()); 

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
    // $ANTLR end "rule__InterleavingProcess__Group_2__0__Impl"


    // $ANTLR start "rule__InterleavingProcess__Group_2__1"
    // InternalGoatComponentsParser.g:1815:1: rule__InterleavingProcess__Group_2__1 : rule__InterleavingProcess__Group_2__1__Impl ;
    public final void rule__InterleavingProcess__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1819:1: ( rule__InterleavingProcess__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:1820:2: rule__InterleavingProcess__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterleavingProcess__Group_2__1__Impl();

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
    // $ANTLR end "rule__InterleavingProcess__Group_2__1"


    // $ANTLR start "rule__InterleavingProcess__Group_2__1__Impl"
    // InternalGoatComponentsParser.g:1826:1: rule__InterleavingProcess__Group_2__1__Impl : ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) ) ;
    public final void rule__InterleavingProcess__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1830:1: ( ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) ) )
            // InternalGoatComponentsParser.g:1831:1: ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) )
            {
            // InternalGoatComponentsParser.g:1831:1: ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) )
            // InternalGoatComponentsParser.g:1832:2: ( rule__InterleavingProcess__SubProcsAssignment_2_1 )
            {
             before(grammarAccess.getInterleavingProcessAccess().getSubProcsAssignment_2_1()); 
            // InternalGoatComponentsParser.g:1833:2: ( rule__InterleavingProcess__SubProcsAssignment_2_1 )
            // InternalGoatComponentsParser.g:1833:3: rule__InterleavingProcess__SubProcsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InterleavingProcess__SubProcsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInterleavingProcessAccess().getSubProcsAssignment_2_1()); 

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
    // $ANTLR end "rule__InterleavingProcess__Group_2__1__Impl"


    // $ANTLR start "rule__Preconditions__Group__0"
    // InternalGoatComponentsParser.g:1842:1: rule__Preconditions__Group__0 : rule__Preconditions__Group__0__Impl rule__Preconditions__Group__1 ;
    public final void rule__Preconditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1846:1: ( rule__Preconditions__Group__0__Impl rule__Preconditions__Group__1 )
            // InternalGoatComponentsParser.g:1847:2: rule__Preconditions__Group__0__Impl rule__Preconditions__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Preconditions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preconditions__Group__1();

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
    // $ANTLR end "rule__Preconditions__Group__0"


    // $ANTLR start "rule__Preconditions__Group__0__Impl"
    // InternalGoatComponentsParser.g:1854:1: rule__Preconditions__Group__0__Impl : ( () ) ;
    public final void rule__Preconditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1858:1: ( ( () ) )
            // InternalGoatComponentsParser.g:1859:1: ( () )
            {
            // InternalGoatComponentsParser.g:1859:1: ( () )
            // InternalGoatComponentsParser.g:1860:2: ()
            {
             before(grammarAccess.getPreconditionsAccess().getPreconditionsAction_0()); 
            // InternalGoatComponentsParser.g:1861:2: ()
            // InternalGoatComponentsParser.g:1861:3: 
            {
            }

             after(grammarAccess.getPreconditionsAccess().getPreconditionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preconditions__Group__0__Impl"


    // $ANTLR start "rule__Preconditions__Group__1"
    // InternalGoatComponentsParser.g:1869:1: rule__Preconditions__Group__1 : rule__Preconditions__Group__1__Impl ;
    public final void rule__Preconditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1873:1: ( rule__Preconditions__Group__1__Impl )
            // InternalGoatComponentsParser.g:1874:2: rule__Preconditions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Preconditions__Group__1__Impl();

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
    // $ANTLR end "rule__Preconditions__Group__1"


    // $ANTLR start "rule__Preconditions__Group__1__Impl"
    // InternalGoatComponentsParser.g:1880:1: rule__Preconditions__Group__1__Impl : ( ( rule__Preconditions__PrecondAssignment_1 )* ) ;
    public final void rule__Preconditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1884:1: ( ( ( rule__Preconditions__PrecondAssignment_1 )* ) )
            // InternalGoatComponentsParser.g:1885:1: ( ( rule__Preconditions__PrecondAssignment_1 )* )
            {
            // InternalGoatComponentsParser.g:1885:1: ( ( rule__Preconditions__PrecondAssignment_1 )* )
            // InternalGoatComponentsParser.g:1886:2: ( rule__Preconditions__PrecondAssignment_1 )*
            {
             before(grammarAccess.getPreconditionsAccess().getPrecondAssignment_1()); 
            // InternalGoatComponentsParser.g:1887:2: ( rule__Preconditions__PrecondAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Wait||LA22_0==LeftSquareBracket) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1887:3: rule__Preconditions__PrecondAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Preconditions__PrecondAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPreconditionsAccess().getPrecondAssignment_1()); 

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
    // $ANTLR end "rule__Preconditions__Group__1__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group__0"
    // InternalGoatComponentsParser.g:1896:1: rule__PredOutputProcessOrInputProcesses__Group__0 : rule__PredOutputProcessOrInputProcesses__Group__0__Impl rule__PredOutputProcessOrInputProcesses__Group__1 ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1900:1: ( rule__PredOutputProcessOrInputProcesses__Group__0__Impl rule__PredOutputProcessOrInputProcesses__Group__1 )
            // InternalGoatComponentsParser.g:1901:2: rule__PredOutputProcessOrInputProcesses__Group__0__Impl rule__PredOutputProcessOrInputProcesses__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PredOutputProcessOrInputProcesses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcesses__Group__1();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group__0"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group__0__Impl"
    // InternalGoatComponentsParser.g:1908:1: rule__PredOutputProcessOrInputProcesses__Group__0__Impl : ( rulePreconditions ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1912:1: ( ( rulePreconditions ) )
            // InternalGoatComponentsParser.g:1913:1: ( rulePreconditions )
            {
            // InternalGoatComponentsParser.g:1913:1: ( rulePreconditions )
            // InternalGoatComponentsParser.g:1914:2: rulePreconditions
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getPreconditionsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePreconditions();

            state._fsp--;

             after(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getPreconditionsParserRuleCall_0()); 

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group__0__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group__1"
    // InternalGoatComponentsParser.g:1923:1: rule__PredOutputProcessOrInputProcesses__Group__1 : rule__PredOutputProcessOrInputProcesses__Group__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1927:1: ( rule__PredOutputProcessOrInputProcesses__Group__1__Impl )
            // InternalGoatComponentsParser.g:1928:2: rule__PredOutputProcessOrInputProcesses__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcesses__Group__1__Impl();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group__1"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group__1__Impl"
    // InternalGoatComponentsParser.g:1934:1: rule__PredOutputProcessOrInputProcesses__Group__1__Impl : ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1938:1: ( ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) ) )
            // InternalGoatComponentsParser.g:1939:1: ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) )
            {
            // InternalGoatComponentsParser.g:1939:1: ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) )
            // InternalGoatComponentsParser.g:1940:2: ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getAlternatives_1()); 
            // InternalGoatComponentsParser.g:1941:2: ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 )
            // InternalGoatComponentsParser.g:1941:3: rule__PredOutputProcessOrInputProcesses__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcesses__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group__1__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group_1_0__0"
    // InternalGoatComponentsParser.g:1950:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__0 : rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_0__1 ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1954:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_0__1 )
            // InternalGoatComponentsParser.g:1955:2: rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcesses__Group_1_0__1();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group_1_0__0"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl"
    // InternalGoatComponentsParser.g:1962:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1966:1: ( ( () ) )
            // InternalGoatComponentsParser.g:1967:1: ( () )
            {
            // InternalGoatComponentsParser.g:1967:1: ( () )
            // InternalGoatComponentsParser.g:1968:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getOutputProcessPrecondAction_1_0_0()); 
            // InternalGoatComponentsParser.g:1969:2: ()
            // InternalGoatComponentsParser.g:1969:3: 
            {
            }

             after(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getOutputProcessPrecondAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group_1_0__1"
    // InternalGoatComponentsParser.g:1977:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__1 : rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1981:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl )
            // InternalGoatComponentsParser.g:1982:2: rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group_1_0__1"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl"
    // InternalGoatComponentsParser.g:1988:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl : ( ruleOutputProcessPart ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1992:1: ( ( ruleOutputProcessPart ) )
            // InternalGoatComponentsParser.g:1993:1: ( ruleOutputProcessPart )
            {
            // InternalGoatComponentsParser.g:1993:1: ( ruleOutputProcessPart )
            // InternalGoatComponentsParser.g:1994:2: ruleOutputProcessPart
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getOutputProcessPartParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleOutputProcessPart();

            state._fsp--;

             after(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getOutputProcessPartParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group_1_1__0"
    // InternalGoatComponentsParser.g:2004:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__0 : rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_1__1 ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2008:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_1__1 )
            // InternalGoatComponentsParser.g:2009:2: rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcesses__Group_1_1__1();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group_1_1__0"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl"
    // InternalGoatComponentsParser.g:2016:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2020:1: ( ( () ) )
            // InternalGoatComponentsParser.g:2021:1: ( () )
            {
            // InternalGoatComponentsParser.g:2021:1: ( () )
            // InternalGoatComponentsParser.g:2022:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getInputProcessesPrecondsAction_1_1_0()); 
            // InternalGoatComponentsParser.g:2023:2: ()
            // InternalGoatComponentsParser.g:2023:3: 
            {
            }

             after(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getInputProcessesPrecondsAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group_1_1__1"
    // InternalGoatComponentsParser.g:2031:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__1 : rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2035:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl )
            // InternalGoatComponentsParser.g:2036:2: rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group_1_1__1"


    // $ANTLR start "rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl"
    // InternalGoatComponentsParser.g:2042:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl : ( ruleInputProcessesPart ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2046:1: ( ( ruleInputProcessesPart ) )
            // InternalGoatComponentsParser.g:2047:1: ( ruleInputProcessesPart )
            {
            // InternalGoatComponentsParser.g:2047:1: ( ruleInputProcessesPart )
            // InternalGoatComponentsParser.g:2048:2: ruleInputProcessesPart
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getInputProcessesPartParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_2);
            ruleInputProcessesPart();

            state._fsp--;

             after(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getInputProcessesPartParserRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group__0"
    // InternalGoatComponentsParser.g:2058:1: rule__PredOutputProcessOrInputProcess__Group__0 : rule__PredOutputProcessOrInputProcess__Group__0__Impl rule__PredOutputProcessOrInputProcess__Group__1 ;
    public final void rule__PredOutputProcessOrInputProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2062:1: ( rule__PredOutputProcessOrInputProcess__Group__0__Impl rule__PredOutputProcessOrInputProcess__Group__1 )
            // InternalGoatComponentsParser.g:2063:2: rule__PredOutputProcessOrInputProcess__Group__0__Impl rule__PredOutputProcessOrInputProcess__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PredOutputProcessOrInputProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcess__Group__1();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group__0"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group__0__Impl"
    // InternalGoatComponentsParser.g:2070:1: rule__PredOutputProcessOrInputProcess__Group__0__Impl : ( rulePreconditions ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2074:1: ( ( rulePreconditions ) )
            // InternalGoatComponentsParser.g:2075:1: ( rulePreconditions )
            {
            // InternalGoatComponentsParser.g:2075:1: ( rulePreconditions )
            // InternalGoatComponentsParser.g:2076:2: rulePreconditions
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getPreconditionsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePreconditions();

            state._fsp--;

             after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getPreconditionsParserRuleCall_0()); 

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group__0__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group__1"
    // InternalGoatComponentsParser.g:2085:1: rule__PredOutputProcessOrInputProcess__Group__1 : rule__PredOutputProcessOrInputProcess__Group__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2089:1: ( rule__PredOutputProcessOrInputProcess__Group__1__Impl )
            // InternalGoatComponentsParser.g:2090:2: rule__PredOutputProcessOrInputProcess__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcess__Group__1__Impl();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group__1"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group__1__Impl"
    // InternalGoatComponentsParser.g:2096:1: rule__PredOutputProcessOrInputProcess__Group__1__Impl : ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2100:1: ( ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) ) )
            // InternalGoatComponentsParser.g:2101:1: ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) )
            {
            // InternalGoatComponentsParser.g:2101:1: ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) )
            // InternalGoatComponentsParser.g:2102:2: ( rule__PredOutputProcessOrInputProcess__Alternatives_1 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getAlternatives_1()); 
            // InternalGoatComponentsParser.g:2103:2: ( rule__PredOutputProcessOrInputProcess__Alternatives_1 )
            // InternalGoatComponentsParser.g:2103:3: rule__PredOutputProcessOrInputProcess__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcess__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group__1__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group_1_0__0"
    // InternalGoatComponentsParser.g:2112:1: rule__PredOutputProcessOrInputProcess__Group_1_0__0 : rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_0__1 ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2116:1: ( rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_0__1 )
            // InternalGoatComponentsParser.g:2117:2: rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcess__Group_1_0__1();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group_1_0__0"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl"
    // InternalGoatComponentsParser.g:2124:1: rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2128:1: ( ( () ) )
            // InternalGoatComponentsParser.g:2129:1: ( () )
            {
            // InternalGoatComponentsParser.g:2129:1: ( () )
            // InternalGoatComponentsParser.g:2130:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getOutputProcessPrecondAction_1_0_0()); 
            // InternalGoatComponentsParser.g:2131:2: ()
            // InternalGoatComponentsParser.g:2131:3: 
            {
            }

             after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getOutputProcessPrecondAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group_1_0__1"
    // InternalGoatComponentsParser.g:2139:1: rule__PredOutputProcessOrInputProcess__Group_1_0__1 : rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2143:1: ( rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl )
            // InternalGoatComponentsParser.g:2144:2: rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group_1_0__1"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl"
    // InternalGoatComponentsParser.g:2150:1: rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl : ( ruleOutputProcessPart ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2154:1: ( ( ruleOutputProcessPart ) )
            // InternalGoatComponentsParser.g:2155:1: ( ruleOutputProcessPart )
            {
            // InternalGoatComponentsParser.g:2155:1: ( ruleOutputProcessPart )
            // InternalGoatComponentsParser.g:2156:2: ruleOutputProcessPart
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getOutputProcessPartParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleOutputProcessPart();

            state._fsp--;

             after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getOutputProcessPartParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group_1_1__0"
    // InternalGoatComponentsParser.g:2166:1: rule__PredOutputProcessOrInputProcess__Group_1_1__0 : rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_1__1 ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2170:1: ( rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_1__1 )
            // InternalGoatComponentsParser.g:2171:2: rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcess__Group_1_1__1();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group_1_1__0"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl"
    // InternalGoatComponentsParser.g:2178:1: rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2182:1: ( ( () ) )
            // InternalGoatComponentsParser.g:2183:1: ( () )
            {
            // InternalGoatComponentsParser.g:2183:1: ( () )
            // InternalGoatComponentsParser.g:2184:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputProcessesPrecondsAction_1_1_0()); 
            // InternalGoatComponentsParser.g:2185:2: ()
            // InternalGoatComponentsParser.g:2185:3: 
            {
            }

             after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputProcessesPrecondsAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group_1_1__1"
    // InternalGoatComponentsParser.g:2193:1: rule__PredOutputProcessOrInputProcess__Group_1_1__1 : rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2197:1: ( rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl )
            // InternalGoatComponentsParser.g:2198:2: rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group_1_1__1"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl"
    // InternalGoatComponentsParser.g:2204:1: rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl : ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2208:1: ( ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) ) )
            // InternalGoatComponentsParser.g:2209:1: ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) )
            {
            // InternalGoatComponentsParser.g:2209:1: ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) )
            // InternalGoatComponentsParser.g:2210:2: ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputsAssignment_1_1_1()); 
            // InternalGoatComponentsParser.g:2211:2: ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 )
            // InternalGoatComponentsParser.g:2211:3: rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputsAssignment_1_1_1()); 

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl"


    // $ANTLR start "rule__InputProcessesPart__Group__0"
    // InternalGoatComponentsParser.g:2220:1: rule__InputProcessesPart__Group__0 : rule__InputProcessesPart__Group__0__Impl rule__InputProcessesPart__Group__1 ;
    public final void rule__InputProcessesPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2224:1: ( rule__InputProcessesPart__Group__0__Impl rule__InputProcessesPart__Group__1 )
            // InternalGoatComponentsParser.g:2225:2: rule__InputProcessesPart__Group__0__Impl rule__InputProcessesPart__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__InputProcessesPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcessesPart__Group__1();

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
    // $ANTLR end "rule__InputProcessesPart__Group__0"


    // $ANTLR start "rule__InputProcessesPart__Group__0__Impl"
    // InternalGoatComponentsParser.g:2232:1: rule__InputProcessesPart__Group__0__Impl : ( ( rule__InputProcessesPart__InputsAssignment_0 ) ) ;
    public final void rule__InputProcessesPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2236:1: ( ( ( rule__InputProcessesPart__InputsAssignment_0 ) ) )
            // InternalGoatComponentsParser.g:2237:1: ( ( rule__InputProcessesPart__InputsAssignment_0 ) )
            {
            // InternalGoatComponentsParser.g:2237:1: ( ( rule__InputProcessesPart__InputsAssignment_0 ) )
            // InternalGoatComponentsParser.g:2238:2: ( rule__InputProcessesPart__InputsAssignment_0 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getInputsAssignment_0()); 
            // InternalGoatComponentsParser.g:2239:2: ( rule__InputProcessesPart__InputsAssignment_0 )
            // InternalGoatComponentsParser.g:2239:3: rule__InputProcessesPart__InputsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InputProcessesPart__InputsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessesPartAccess().getInputsAssignment_0()); 

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
    // $ANTLR end "rule__InputProcessesPart__Group__0__Impl"


    // $ANTLR start "rule__InputProcessesPart__Group__1"
    // InternalGoatComponentsParser.g:2247:1: rule__InputProcessesPart__Group__1 : rule__InputProcessesPart__Group__1__Impl ;
    public final void rule__InputProcessesPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2251:1: ( rule__InputProcessesPart__Group__1__Impl )
            // InternalGoatComponentsParser.g:2252:2: rule__InputProcessesPart__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputProcessesPart__Group__1__Impl();

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
    // $ANTLR end "rule__InputProcessesPart__Group__1"


    // $ANTLR start "rule__InputProcessesPart__Group__1__Impl"
    // InternalGoatComponentsParser.g:2258:1: rule__InputProcessesPart__Group__1__Impl : ( ( rule__InputProcessesPart__Group_1__0 )* ) ;
    public final void rule__InputProcessesPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2262:1: ( ( ( rule__InputProcessesPart__Group_1__0 )* ) )
            // InternalGoatComponentsParser.g:2263:1: ( ( rule__InputProcessesPart__Group_1__0 )* )
            {
            // InternalGoatComponentsParser.g:2263:1: ( ( rule__InputProcessesPart__Group_1__0 )* )
            // InternalGoatComponentsParser.g:2264:2: ( rule__InputProcessesPart__Group_1__0 )*
            {
             before(grammarAccess.getInputProcessesPartAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:2265:2: ( rule__InputProcessesPart__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==PlusSign) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2265:3: rule__InputProcessesPart__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InputProcessesPart__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getInputProcessesPartAccess().getGroup_1()); 

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
    // $ANTLR end "rule__InputProcessesPart__Group__1__Impl"


    // $ANTLR start "rule__InputProcessesPart__Group_1__0"
    // InternalGoatComponentsParser.g:2274:1: rule__InputProcessesPart__Group_1__0 : rule__InputProcessesPart__Group_1__0__Impl rule__InputProcessesPart__Group_1__1 ;
    public final void rule__InputProcessesPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2278:1: ( rule__InputProcessesPart__Group_1__0__Impl rule__InputProcessesPart__Group_1__1 )
            // InternalGoatComponentsParser.g:2279:2: rule__InputProcessesPart__Group_1__0__Impl rule__InputProcessesPart__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__InputProcessesPart__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcessesPart__Group_1__1();

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
    // $ANTLR end "rule__InputProcessesPart__Group_1__0"


    // $ANTLR start "rule__InputProcessesPart__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:2286:1: rule__InputProcessesPart__Group_1__0__Impl : ( PlusSign ) ;
    public final void rule__InputProcessesPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2290:1: ( ( PlusSign ) )
            // InternalGoatComponentsParser.g:2291:1: ( PlusSign )
            {
            // InternalGoatComponentsParser.g:2291:1: ( PlusSign )
            // InternalGoatComponentsParser.g:2292:2: PlusSign
            {
             before(grammarAccess.getInputProcessesPartAccess().getPlusSignKeyword_1_0()); 
            match(input,PlusSign,FOLLOW_2); 
             after(grammarAccess.getInputProcessesPartAccess().getPlusSignKeyword_1_0()); 

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
    // $ANTLR end "rule__InputProcessesPart__Group_1__0__Impl"


    // $ANTLR start "rule__InputProcessesPart__Group_1__1"
    // InternalGoatComponentsParser.g:2301:1: rule__InputProcessesPart__Group_1__1 : rule__InputProcessesPart__Group_1__1__Impl rule__InputProcessesPart__Group_1__2 ;
    public final void rule__InputProcessesPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2305:1: ( rule__InputProcessesPart__Group_1__1__Impl rule__InputProcessesPart__Group_1__2 )
            // InternalGoatComponentsParser.g:2306:2: rule__InputProcessesPart__Group_1__1__Impl rule__InputProcessesPart__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__InputProcessesPart__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcessesPart__Group_1__2();

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
    // $ANTLR end "rule__InputProcessesPart__Group_1__1"


    // $ANTLR start "rule__InputProcessesPart__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:2313:1: rule__InputProcessesPart__Group_1__1__Impl : ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) ) ;
    public final void rule__InputProcessesPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2317:1: ( ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:2318:1: ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:2318:1: ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:2319:2: ( rule__InputProcessesPart__PrecondsAssignment_1_1 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getPrecondsAssignment_1_1()); 
            // InternalGoatComponentsParser.g:2320:2: ( rule__InputProcessesPart__PrecondsAssignment_1_1 )
            // InternalGoatComponentsParser.g:2320:3: rule__InputProcessesPart__PrecondsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InputProcessesPart__PrecondsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessesPartAccess().getPrecondsAssignment_1_1()); 

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
    // $ANTLR end "rule__InputProcessesPart__Group_1__1__Impl"


    // $ANTLR start "rule__InputProcessesPart__Group_1__2"
    // InternalGoatComponentsParser.g:2328:1: rule__InputProcessesPart__Group_1__2 : rule__InputProcessesPart__Group_1__2__Impl ;
    public final void rule__InputProcessesPart__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2332:1: ( rule__InputProcessesPart__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:2333:2: rule__InputProcessesPart__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputProcessesPart__Group_1__2__Impl();

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
    // $ANTLR end "rule__InputProcessesPart__Group_1__2"


    // $ANTLR start "rule__InputProcessesPart__Group_1__2__Impl"
    // InternalGoatComponentsParser.g:2339:1: rule__InputProcessesPart__Group_1__2__Impl : ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) ) ;
    public final void rule__InputProcessesPart__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2343:1: ( ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:2344:1: ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:2344:1: ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:2345:2: ( rule__InputProcessesPart__InputsAssignment_1_2 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getInputsAssignment_1_2()); 
            // InternalGoatComponentsParser.g:2346:2: ( rule__InputProcessesPart__InputsAssignment_1_2 )
            // InternalGoatComponentsParser.g:2346:3: rule__InputProcessesPart__InputsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__InputProcessesPart__InputsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessesPartAccess().getInputsAssignment_1_2()); 

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
    // $ANTLR end "rule__InputProcessesPart__Group_1__2__Impl"


    // $ANTLR start "rule__InputProcess__Group__0"
    // InternalGoatComponentsParser.g:2355:1: rule__InputProcess__Group__0 : rule__InputProcess__Group__0__Impl rule__InputProcess__Group__1 ;
    public final void rule__InputProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2359:1: ( rule__InputProcess__Group__0__Impl rule__InputProcess__Group__1 )
            // InternalGoatComponentsParser.g:2360:2: rule__InputProcess__Group__0__Impl rule__InputProcess__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__InputProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__1();

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
    // $ANTLR end "rule__InputProcess__Group__0"


    // $ANTLR start "rule__InputProcess__Group__0__Impl"
    // InternalGoatComponentsParser.g:2367:1: rule__InputProcess__Group__0__Impl : ( () ) ;
    public final void rule__InputProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2371:1: ( ( () ) )
            // InternalGoatComponentsParser.g:2372:1: ( () )
            {
            // InternalGoatComponentsParser.g:2372:1: ( () )
            // InternalGoatComponentsParser.g:2373:2: ()
            {
             before(grammarAccess.getInputProcessAccess().getInputProcessAction_0()); 
            // InternalGoatComponentsParser.g:2374:2: ()
            // InternalGoatComponentsParser.g:2374:3: 
            {
            }

             after(grammarAccess.getInputProcessAccess().getInputProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__Group__0__Impl"


    // $ANTLR start "rule__InputProcess__Group__1"
    // InternalGoatComponentsParser.g:2382:1: rule__InputProcess__Group__1 : rule__InputProcess__Group__1__Impl rule__InputProcess__Group__2 ;
    public final void rule__InputProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2386:1: ( rule__InputProcess__Group__1__Impl rule__InputProcess__Group__2 )
            // InternalGoatComponentsParser.g:2387:2: rule__InputProcess__Group__1__Impl rule__InputProcess__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__InputProcess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__2();

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
    // $ANTLR end "rule__InputProcess__Group__1"


    // $ANTLR start "rule__InputProcess__Group__1__Impl"
    // InternalGoatComponentsParser.g:2394:1: rule__InputProcess__Group__1__Impl : ( Receive ) ;
    public final void rule__InputProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2398:1: ( ( Receive ) )
            // InternalGoatComponentsParser.g:2399:1: ( Receive )
            {
            // InternalGoatComponentsParser.g:2399:1: ( Receive )
            // InternalGoatComponentsParser.g:2400:2: Receive
            {
             before(grammarAccess.getInputProcessAccess().getReceiveKeyword_1()); 
            match(input,Receive,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getReceiveKeyword_1()); 

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
    // $ANTLR end "rule__InputProcess__Group__1__Impl"


    // $ANTLR start "rule__InputProcess__Group__2"
    // InternalGoatComponentsParser.g:2409:1: rule__InputProcess__Group__2 : rule__InputProcess__Group__2__Impl rule__InputProcess__Group__3 ;
    public final void rule__InputProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2413:1: ( rule__InputProcess__Group__2__Impl rule__InputProcess__Group__3 )
            // InternalGoatComponentsParser.g:2414:2: rule__InputProcess__Group__2__Impl rule__InputProcess__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__InputProcess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__3();

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
    // $ANTLR end "rule__InputProcess__Group__2"


    // $ANTLR start "rule__InputProcess__Group__2__Impl"
    // InternalGoatComponentsParser.g:2421:1: rule__InputProcess__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__InputProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2425:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:2426:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:2426:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:2427:2: LeftParenthesis
            {
             before(grammarAccess.getInputProcessAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__InputProcess__Group__2__Impl"


    // $ANTLR start "rule__InputProcess__Group__3"
    // InternalGoatComponentsParser.g:2436:1: rule__InputProcess__Group__3 : rule__InputProcess__Group__3__Impl rule__InputProcess__Group__4 ;
    public final void rule__InputProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2440:1: ( rule__InputProcess__Group__3__Impl rule__InputProcess__Group__4 )
            // InternalGoatComponentsParser.g:2441:2: rule__InputProcess__Group__3__Impl rule__InputProcess__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__InputProcess__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__4();

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
    // $ANTLR end "rule__InputProcess__Group__3"


    // $ANTLR start "rule__InputProcess__Group__3__Impl"
    // InternalGoatComponentsParser.g:2448:1: rule__InputProcess__Group__3__Impl : ( ( rule__InputProcess__Rec_predAssignment_3 ) ) ;
    public final void rule__InputProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2452:1: ( ( ( rule__InputProcess__Rec_predAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:2453:1: ( ( rule__InputProcess__Rec_predAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:2453:1: ( ( rule__InputProcess__Rec_predAssignment_3 ) )
            // InternalGoatComponentsParser.g:2454:2: ( rule__InputProcess__Rec_predAssignment_3 )
            {
             before(grammarAccess.getInputProcessAccess().getRec_predAssignment_3()); 
            // InternalGoatComponentsParser.g:2455:2: ( rule__InputProcess__Rec_predAssignment_3 )
            // InternalGoatComponentsParser.g:2455:3: rule__InputProcess__Rec_predAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__Rec_predAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessAccess().getRec_predAssignment_3()); 

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
    // $ANTLR end "rule__InputProcess__Group__3__Impl"


    // $ANTLR start "rule__InputProcess__Group__4"
    // InternalGoatComponentsParser.g:2463:1: rule__InputProcess__Group__4 : rule__InputProcess__Group__4__Impl rule__InputProcess__Group__5 ;
    public final void rule__InputProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2467:1: ( rule__InputProcess__Group__4__Impl rule__InputProcess__Group__5 )
            // InternalGoatComponentsParser.g:2468:2: rule__InputProcess__Group__4__Impl rule__InputProcess__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__InputProcess__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__5();

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
    // $ANTLR end "rule__InputProcess__Group__4"


    // $ANTLR start "rule__InputProcess__Group__4__Impl"
    // InternalGoatComponentsParser.g:2475:1: rule__InputProcess__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__InputProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2479:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:2480:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:2480:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:2481:2: RightParenthesis
            {
             before(grammarAccess.getInputProcessAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__InputProcess__Group__4__Impl"


    // $ANTLR start "rule__InputProcess__Group__5"
    // InternalGoatComponentsParser.g:2490:1: rule__InputProcess__Group__5 : rule__InputProcess__Group__5__Impl rule__InputProcess__Group__6 ;
    public final void rule__InputProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2494:1: ( rule__InputProcess__Group__5__Impl rule__InputProcess__Group__6 )
            // InternalGoatComponentsParser.g:2495:2: rule__InputProcess__Group__5__Impl rule__InputProcess__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__InputProcess__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__6();

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
    // $ANTLR end "rule__InputProcess__Group__5"


    // $ANTLR start "rule__InputProcess__Group__5__Impl"
    // InternalGoatComponentsParser.g:2502:1: rule__InputProcess__Group__5__Impl : ( LeftCurlyBracket ) ;
    public final void rule__InputProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2506:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:2507:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2507:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:2508:2: LeftCurlyBracket
            {
             before(grammarAccess.getInputProcessAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__InputProcess__Group__5__Impl"


    // $ANTLR start "rule__InputProcess__Group__6"
    // InternalGoatComponentsParser.g:2517:1: rule__InputProcess__Group__6 : rule__InputProcess__Group__6__Impl rule__InputProcess__Group__7 ;
    public final void rule__InputProcess__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2521:1: ( rule__InputProcess__Group__6__Impl rule__InputProcess__Group__7 )
            // InternalGoatComponentsParser.g:2522:2: rule__InputProcess__Group__6__Impl rule__InputProcess__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__InputProcess__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__7();

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
    // $ANTLR end "rule__InputProcess__Group__6"


    // $ANTLR start "rule__InputProcess__Group__6__Impl"
    // InternalGoatComponentsParser.g:2529:1: rule__InputProcess__Group__6__Impl : ( ( rule__InputProcess__Group_6__0 )? ) ;
    public final void rule__InputProcess__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2533:1: ( ( ( rule__InputProcess__Group_6__0 )? ) )
            // InternalGoatComponentsParser.g:2534:1: ( ( rule__InputProcess__Group_6__0 )? )
            {
            // InternalGoatComponentsParser.g:2534:1: ( ( rule__InputProcess__Group_6__0 )? )
            // InternalGoatComponentsParser.g:2535:2: ( rule__InputProcess__Group_6__0 )?
            {
             before(grammarAccess.getInputProcessAccess().getGroup_6()); 
            // InternalGoatComponentsParser.g:2536:2: ( rule__InputProcess__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Proc||LA24_0==This) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGoatComponentsParser.g:2536:3: rule__InputProcess__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputProcess__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputProcessAccess().getGroup_6()); 

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
    // $ANTLR end "rule__InputProcess__Group__6__Impl"


    // $ANTLR start "rule__InputProcess__Group__7"
    // InternalGoatComponentsParser.g:2544:1: rule__InputProcess__Group__7 : rule__InputProcess__Group__7__Impl rule__InputProcess__Group__8 ;
    public final void rule__InputProcess__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2548:1: ( rule__InputProcess__Group__7__Impl rule__InputProcess__Group__8 )
            // InternalGoatComponentsParser.g:2549:2: rule__InputProcess__Group__7__Impl rule__InputProcess__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__InputProcess__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__8();

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
    // $ANTLR end "rule__InputProcess__Group__7"


    // $ANTLR start "rule__InputProcess__Group__7__Impl"
    // InternalGoatComponentsParser.g:2556:1: rule__InputProcess__Group__7__Impl : ( RightCurlyBracket ) ;
    public final void rule__InputProcess__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2560:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:2561:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2561:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:2562:2: RightCurlyBracket
            {
             before(grammarAccess.getInputProcessAccess().getRightCurlyBracketKeyword_7()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__InputProcess__Group__7__Impl"


    // $ANTLR start "rule__InputProcess__Group__8"
    // InternalGoatComponentsParser.g:2571:1: rule__InputProcess__Group__8 : rule__InputProcess__Group__8__Impl rule__InputProcess__Group__9 ;
    public final void rule__InputProcess__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2575:1: ( rule__InputProcess__Group__8__Impl rule__InputProcess__Group__9 )
            // InternalGoatComponentsParser.g:2576:2: rule__InputProcess__Group__8__Impl rule__InputProcess__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__InputProcess__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__9();

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
    // $ANTLR end "rule__InputProcess__Group__8"


    // $ANTLR start "rule__InputProcess__Group__8__Impl"
    // InternalGoatComponentsParser.g:2583:1: rule__InputProcess__Group__8__Impl : ( ( rule__InputProcess__OutputAssignment_8 )? ) ;
    public final void rule__InputProcess__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2587:1: ( ( ( rule__InputProcess__OutputAssignment_8 )? ) )
            // InternalGoatComponentsParser.g:2588:1: ( ( rule__InputProcess__OutputAssignment_8 )? )
            {
            // InternalGoatComponentsParser.g:2588:1: ( ( rule__InputProcess__OutputAssignment_8 )? )
            // InternalGoatComponentsParser.g:2589:2: ( rule__InputProcess__OutputAssignment_8 )?
            {
             before(grammarAccess.getInputProcessAccess().getOutputAssignment_8()); 
            // InternalGoatComponentsParser.g:2590:2: ( rule__InputProcess__OutputAssignment_8 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Print) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGoatComponentsParser.g:2590:3: rule__InputProcess__OutputAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputProcess__OutputAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputProcessAccess().getOutputAssignment_8()); 

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
    // $ANTLR end "rule__InputProcess__Group__8__Impl"


    // $ANTLR start "rule__InputProcess__Group__9"
    // InternalGoatComponentsParser.g:2598:1: rule__InputProcess__Group__9 : rule__InputProcess__Group__9__Impl rule__InputProcess__Group__10 ;
    public final void rule__InputProcess__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2602:1: ( rule__InputProcess__Group__9__Impl rule__InputProcess__Group__10 )
            // InternalGoatComponentsParser.g:2603:2: rule__InputProcess__Group__9__Impl rule__InputProcess__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__InputProcess__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__10();

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
    // $ANTLR end "rule__InputProcess__Group__9"


    // $ANTLR start "rule__InputProcess__Group__9__Impl"
    // InternalGoatComponentsParser.g:2610:1: rule__InputProcess__Group__9__Impl : ( FullStop ) ;
    public final void rule__InputProcess__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2614:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:2615:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:2615:1: ( FullStop )
            // InternalGoatComponentsParser.g:2616:2: FullStop
            {
             before(grammarAccess.getInputProcessAccess().getFullStopKeyword_9()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getFullStopKeyword_9()); 

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
    // $ANTLR end "rule__InputProcess__Group__9__Impl"


    // $ANTLR start "rule__InputProcess__Group__10"
    // InternalGoatComponentsParser.g:2625:1: rule__InputProcess__Group__10 : rule__InputProcess__Group__10__Impl ;
    public final void rule__InputProcess__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2629:1: ( rule__InputProcess__Group__10__Impl )
            // InternalGoatComponentsParser.g:2630:2: rule__InputProcess__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__Group__10__Impl();

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
    // $ANTLR end "rule__InputProcess__Group__10"


    // $ANTLR start "rule__InputProcess__Group__10__Impl"
    // InternalGoatComponentsParser.g:2636:1: rule__InputProcess__Group__10__Impl : ( ( rule__InputProcess__NextAssignment_10 ) ) ;
    public final void rule__InputProcess__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2640:1: ( ( ( rule__InputProcess__NextAssignment_10 ) ) )
            // InternalGoatComponentsParser.g:2641:1: ( ( rule__InputProcess__NextAssignment_10 ) )
            {
            // InternalGoatComponentsParser.g:2641:1: ( ( rule__InputProcess__NextAssignment_10 ) )
            // InternalGoatComponentsParser.g:2642:2: ( rule__InputProcess__NextAssignment_10 )
            {
             before(grammarAccess.getInputProcessAccess().getNextAssignment_10()); 
            // InternalGoatComponentsParser.g:2643:2: ( rule__InputProcess__NextAssignment_10 )
            // InternalGoatComponentsParser.g:2643:3: rule__InputProcess__NextAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__NextAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessAccess().getNextAssignment_10()); 

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
    // $ANTLR end "rule__InputProcess__Group__10__Impl"


    // $ANTLR start "rule__InputProcess__Group_6__0"
    // InternalGoatComponentsParser.g:2652:1: rule__InputProcess__Group_6__0 : rule__InputProcess__Group_6__0__Impl rule__InputProcess__Group_6__1 ;
    public final void rule__InputProcess__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2656:1: ( rule__InputProcess__Group_6__0__Impl rule__InputProcess__Group_6__1 )
            // InternalGoatComponentsParser.g:2657:2: rule__InputProcess__Group_6__0__Impl rule__InputProcess__Group_6__1
            {
            pushFollow(FOLLOW_21);
            rule__InputProcess__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group_6__1();

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
    // $ANTLR end "rule__InputProcess__Group_6__0"


    // $ANTLR start "rule__InputProcess__Group_6__0__Impl"
    // InternalGoatComponentsParser.g:2664:1: rule__InputProcess__Group_6__0__Impl : ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) ) ;
    public final void rule__InputProcess__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2668:1: ( ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) ) )
            // InternalGoatComponentsParser.g:2669:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) )
            {
            // InternalGoatComponentsParser.g:2669:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) )
            // InternalGoatComponentsParser.g:2670:2: ( rule__InputProcess__MsgInPartsAssignment_6_0 )
            {
             before(grammarAccess.getInputProcessAccess().getMsgInPartsAssignment_6_0()); 
            // InternalGoatComponentsParser.g:2671:2: ( rule__InputProcess__MsgInPartsAssignment_6_0 )
            // InternalGoatComponentsParser.g:2671:3: rule__InputProcess__MsgInPartsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__MsgInPartsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessAccess().getMsgInPartsAssignment_6_0()); 

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
    // $ANTLR end "rule__InputProcess__Group_6__0__Impl"


    // $ANTLR start "rule__InputProcess__Group_6__1"
    // InternalGoatComponentsParser.g:2679:1: rule__InputProcess__Group_6__1 : rule__InputProcess__Group_6__1__Impl ;
    public final void rule__InputProcess__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2683:1: ( rule__InputProcess__Group_6__1__Impl )
            // InternalGoatComponentsParser.g:2684:2: rule__InputProcess__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__Group_6__1__Impl();

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
    // $ANTLR end "rule__InputProcess__Group_6__1"


    // $ANTLR start "rule__InputProcess__Group_6__1__Impl"
    // InternalGoatComponentsParser.g:2690:1: rule__InputProcess__Group_6__1__Impl : ( ( rule__InputProcess__Group_6_1__0 )* ) ;
    public final void rule__InputProcess__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2694:1: ( ( ( rule__InputProcess__Group_6_1__0 )* ) )
            // InternalGoatComponentsParser.g:2695:1: ( ( rule__InputProcess__Group_6_1__0 )* )
            {
            // InternalGoatComponentsParser.g:2695:1: ( ( rule__InputProcess__Group_6_1__0 )* )
            // InternalGoatComponentsParser.g:2696:2: ( rule__InputProcess__Group_6_1__0 )*
            {
             before(grammarAccess.getInputProcessAccess().getGroup_6_1()); 
            // InternalGoatComponentsParser.g:2697:2: ( rule__InputProcess__Group_6_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2697:3: rule__InputProcess__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__InputProcess__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInputProcessAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__InputProcess__Group_6__1__Impl"


    // $ANTLR start "rule__InputProcess__Group_6_1__0"
    // InternalGoatComponentsParser.g:2706:1: rule__InputProcess__Group_6_1__0 : rule__InputProcess__Group_6_1__0__Impl rule__InputProcess__Group_6_1__1 ;
    public final void rule__InputProcess__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2710:1: ( rule__InputProcess__Group_6_1__0__Impl rule__InputProcess__Group_6_1__1 )
            // InternalGoatComponentsParser.g:2711:2: rule__InputProcess__Group_6_1__0__Impl rule__InputProcess__Group_6_1__1
            {
            pushFollow(FOLLOW_23);
            rule__InputProcess__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group_6_1__1();

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
    // $ANTLR end "rule__InputProcess__Group_6_1__0"


    // $ANTLR start "rule__InputProcess__Group_6_1__0__Impl"
    // InternalGoatComponentsParser.g:2718:1: rule__InputProcess__Group_6_1__0__Impl : ( Comma ) ;
    public final void rule__InputProcess__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2722:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:2723:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:2723:1: ( Comma )
            // InternalGoatComponentsParser.g:2724:2: Comma
            {
             before(grammarAccess.getInputProcessAccess().getCommaKeyword_6_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getCommaKeyword_6_1_0()); 

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
    // $ANTLR end "rule__InputProcess__Group_6_1__0__Impl"


    // $ANTLR start "rule__InputProcess__Group_6_1__1"
    // InternalGoatComponentsParser.g:2733:1: rule__InputProcess__Group_6_1__1 : rule__InputProcess__Group_6_1__1__Impl ;
    public final void rule__InputProcess__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2737:1: ( rule__InputProcess__Group_6_1__1__Impl )
            // InternalGoatComponentsParser.g:2738:2: rule__InputProcess__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__InputProcess__Group_6_1__1"


    // $ANTLR start "rule__InputProcess__Group_6_1__1__Impl"
    // InternalGoatComponentsParser.g:2744:1: rule__InputProcess__Group_6_1__1__Impl : ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) ) ;
    public final void rule__InputProcess__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2748:1: ( ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) ) )
            // InternalGoatComponentsParser.g:2749:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) )
            {
            // InternalGoatComponentsParser.g:2749:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) )
            // InternalGoatComponentsParser.g:2750:2: ( rule__InputProcess__MsgInPartsAssignment_6_1_1 )
            {
             before(grammarAccess.getInputProcessAccess().getMsgInPartsAssignment_6_1_1()); 
            // InternalGoatComponentsParser.g:2751:2: ( rule__InputProcess__MsgInPartsAssignment_6_1_1 )
            // InternalGoatComponentsParser.g:2751:3: rule__InputProcess__MsgInPartsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__MsgInPartsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessAccess().getMsgInPartsAssignment_6_1_1()); 

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
    // $ANTLR end "rule__InputProcess__Group_6_1__1__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__0"
    // InternalGoatComponentsParser.g:2760:1: rule__OutputProcessPart__Group__0 : rule__OutputProcessPart__Group__0__Impl rule__OutputProcessPart__Group__1 ;
    public final void rule__OutputProcessPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2764:1: ( rule__OutputProcessPart__Group__0__Impl rule__OutputProcessPart__Group__1 )
            // InternalGoatComponentsParser.g:2765:2: rule__OutputProcessPart__Group__0__Impl rule__OutputProcessPart__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__OutputProcessPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__1();

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
    // $ANTLR end "rule__OutputProcessPart__Group__0"


    // $ANTLR start "rule__OutputProcessPart__Group__0__Impl"
    // InternalGoatComponentsParser.g:2772:1: rule__OutputProcessPart__Group__0__Impl : ( Send ) ;
    public final void rule__OutputProcessPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2776:1: ( ( Send ) )
            // InternalGoatComponentsParser.g:2777:1: ( Send )
            {
            // InternalGoatComponentsParser.g:2777:1: ( Send )
            // InternalGoatComponentsParser.g:2778:2: Send
            {
             before(grammarAccess.getOutputProcessPartAccess().getSendKeyword_0()); 
            match(input,Send,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getSendKeyword_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__0__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__1"
    // InternalGoatComponentsParser.g:2787:1: rule__OutputProcessPart__Group__1 : rule__OutputProcessPart__Group__1__Impl rule__OutputProcessPart__Group__2 ;
    public final void rule__OutputProcessPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2791:1: ( rule__OutputProcessPart__Group__1__Impl rule__OutputProcessPart__Group__2 )
            // InternalGoatComponentsParser.g:2792:2: rule__OutputProcessPart__Group__1__Impl rule__OutputProcessPart__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__OutputProcessPart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__2();

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
    // $ANTLR end "rule__OutputProcessPart__Group__1"


    // $ANTLR start "rule__OutputProcessPart__Group__1__Impl"
    // InternalGoatComponentsParser.g:2799:1: rule__OutputProcessPart__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__OutputProcessPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2803:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:2804:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2804:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:2805:2: LeftCurlyBracket
            {
             before(grammarAccess.getOutputProcessPartAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__1__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__2"
    // InternalGoatComponentsParser.g:2814:1: rule__OutputProcessPart__Group__2 : rule__OutputProcessPart__Group__2__Impl rule__OutputProcessPart__Group__3 ;
    public final void rule__OutputProcessPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2818:1: ( rule__OutputProcessPart__Group__2__Impl rule__OutputProcessPart__Group__3 )
            // InternalGoatComponentsParser.g:2819:2: rule__OutputProcessPart__Group__2__Impl rule__OutputProcessPart__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__OutputProcessPart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__3();

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
    // $ANTLR end "rule__OutputProcessPart__Group__2"


    // $ANTLR start "rule__OutputProcessPart__Group__2__Impl"
    // InternalGoatComponentsParser.g:2826:1: rule__OutputProcessPart__Group__2__Impl : ( ( rule__OutputProcessPart__Group_2__0 )? ) ;
    public final void rule__OutputProcessPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2830:1: ( ( ( rule__OutputProcessPart__Group_2__0 )? ) )
            // InternalGoatComponentsParser.g:2831:1: ( ( rule__OutputProcessPart__Group_2__0 )? )
            {
            // InternalGoatComponentsParser.g:2831:1: ( ( rule__OutputProcessPart__Group_2__0 )? )
            // InternalGoatComponentsParser.g:2832:2: ( rule__OutputProcessPart__Group_2__0 )?
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_2()); 
            // InternalGoatComponentsParser.g:2833:2: ( rule__OutputProcessPart__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Receiver||LA27_0==False||LA27_0==Proc||(LA27_0>=This && LA27_0<=True)||(LA27_0>=ExclamationMark && LA27_0<=LeftParenthesis)||(LA27_0>=RULE_ID && LA27_0<=RULE_STRING)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGoatComponentsParser.g:2833:3: rule__OutputProcessPart__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputProcessPart__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputProcessPartAccess().getGroup_2()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__2__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__3"
    // InternalGoatComponentsParser.g:2841:1: rule__OutputProcessPart__Group__3 : rule__OutputProcessPart__Group__3__Impl rule__OutputProcessPart__Group__4 ;
    public final void rule__OutputProcessPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2845:1: ( rule__OutputProcessPart__Group__3__Impl rule__OutputProcessPart__Group__4 )
            // InternalGoatComponentsParser.g:2846:2: rule__OutputProcessPart__Group__3__Impl rule__OutputProcessPart__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__OutputProcessPart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__4();

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
    // $ANTLR end "rule__OutputProcessPart__Group__3"


    // $ANTLR start "rule__OutputProcessPart__Group__3__Impl"
    // InternalGoatComponentsParser.g:2853:1: rule__OutputProcessPart__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__OutputProcessPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2857:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:2858:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2858:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:2859:2: RightCurlyBracket
            {
             before(grammarAccess.getOutputProcessPartAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__3__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__4"
    // InternalGoatComponentsParser.g:2868:1: rule__OutputProcessPart__Group__4 : rule__OutputProcessPart__Group__4__Impl rule__OutputProcessPart__Group__5 ;
    public final void rule__OutputProcessPart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2872:1: ( rule__OutputProcessPart__Group__4__Impl rule__OutputProcessPart__Group__5 )
            // InternalGoatComponentsParser.g:2873:2: rule__OutputProcessPart__Group__4__Impl rule__OutputProcessPart__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__OutputProcessPart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__5();

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
    // $ANTLR end "rule__OutputProcessPart__Group__4"


    // $ANTLR start "rule__OutputProcessPart__Group__4__Impl"
    // InternalGoatComponentsParser.g:2880:1: rule__OutputProcessPart__Group__4__Impl : ( CommercialAt ) ;
    public final void rule__OutputProcessPart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2884:1: ( ( CommercialAt ) )
            // InternalGoatComponentsParser.g:2885:1: ( CommercialAt )
            {
            // InternalGoatComponentsParser.g:2885:1: ( CommercialAt )
            // InternalGoatComponentsParser.g:2886:2: CommercialAt
            {
             before(grammarAccess.getOutputProcessPartAccess().getCommercialAtKeyword_4()); 
            match(input,CommercialAt,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getCommercialAtKeyword_4()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__4__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__5"
    // InternalGoatComponentsParser.g:2895:1: rule__OutputProcessPart__Group__5 : rule__OutputProcessPart__Group__5__Impl rule__OutputProcessPart__Group__6 ;
    public final void rule__OutputProcessPart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2899:1: ( rule__OutputProcessPart__Group__5__Impl rule__OutputProcessPart__Group__6 )
            // InternalGoatComponentsParser.g:2900:2: rule__OutputProcessPart__Group__5__Impl rule__OutputProcessPart__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__OutputProcessPart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__6();

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
    // $ANTLR end "rule__OutputProcessPart__Group__5"


    // $ANTLR start "rule__OutputProcessPart__Group__5__Impl"
    // InternalGoatComponentsParser.g:2907:1: rule__OutputProcessPart__Group__5__Impl : ( LeftParenthesis ) ;
    public final void rule__OutputProcessPart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2911:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:2912:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:2912:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:2913:2: LeftParenthesis
            {
             before(grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_5()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__5__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__6"
    // InternalGoatComponentsParser.g:2922:1: rule__OutputProcessPart__Group__6 : rule__OutputProcessPart__Group__6__Impl rule__OutputProcessPart__Group__7 ;
    public final void rule__OutputProcessPart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2926:1: ( rule__OutputProcessPart__Group__6__Impl rule__OutputProcessPart__Group__7 )
            // InternalGoatComponentsParser.g:2927:2: rule__OutputProcessPart__Group__6__Impl rule__OutputProcessPart__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__OutputProcessPart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__7();

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
    // $ANTLR end "rule__OutputProcessPart__Group__6"


    // $ANTLR start "rule__OutputProcessPart__Group__6__Impl"
    // InternalGoatComponentsParser.g:2934:1: rule__OutputProcessPart__Group__6__Impl : ( ( rule__OutputProcessPart__Send_predAssignment_6 ) ) ;
    public final void rule__OutputProcessPart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2938:1: ( ( ( rule__OutputProcessPart__Send_predAssignment_6 ) ) )
            // InternalGoatComponentsParser.g:2939:1: ( ( rule__OutputProcessPart__Send_predAssignment_6 ) )
            {
            // InternalGoatComponentsParser.g:2939:1: ( ( rule__OutputProcessPart__Send_predAssignment_6 ) )
            // InternalGoatComponentsParser.g:2940:2: ( rule__OutputProcessPart__Send_predAssignment_6 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getSend_predAssignment_6()); 
            // InternalGoatComponentsParser.g:2941:2: ( rule__OutputProcessPart__Send_predAssignment_6 )
            // InternalGoatComponentsParser.g:2941:3: rule__OutputProcessPart__Send_predAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Send_predAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOutputProcessPartAccess().getSend_predAssignment_6()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__6__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__7"
    // InternalGoatComponentsParser.g:2949:1: rule__OutputProcessPart__Group__7 : rule__OutputProcessPart__Group__7__Impl rule__OutputProcessPart__Group__8 ;
    public final void rule__OutputProcessPart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2953:1: ( rule__OutputProcessPart__Group__7__Impl rule__OutputProcessPart__Group__8 )
            // InternalGoatComponentsParser.g:2954:2: rule__OutputProcessPart__Group__7__Impl rule__OutputProcessPart__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__OutputProcessPart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__8();

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
    // $ANTLR end "rule__OutputProcessPart__Group__7"


    // $ANTLR start "rule__OutputProcessPart__Group__7__Impl"
    // InternalGoatComponentsParser.g:2961:1: rule__OutputProcessPart__Group__7__Impl : ( RightParenthesis ) ;
    public final void rule__OutputProcessPart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2965:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:2966:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:2966:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:2967:2: RightParenthesis
            {
             before(grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_7()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__7__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__8"
    // InternalGoatComponentsParser.g:2976:1: rule__OutputProcessPart__Group__8 : rule__OutputProcessPart__Group__8__Impl rule__OutputProcessPart__Group__9 ;
    public final void rule__OutputProcessPart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2980:1: ( rule__OutputProcessPart__Group__8__Impl rule__OutputProcessPart__Group__9 )
            // InternalGoatComponentsParser.g:2981:2: rule__OutputProcessPart__Group__8__Impl rule__OutputProcessPart__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__OutputProcessPart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__9();

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
    // $ANTLR end "rule__OutputProcessPart__Group__8"


    // $ANTLR start "rule__OutputProcessPart__Group__8__Impl"
    // InternalGoatComponentsParser.g:2988:1: rule__OutputProcessPart__Group__8__Impl : ( ( rule__OutputProcessPart__OutputAssignment_8 )? ) ;
    public final void rule__OutputProcessPart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2992:1: ( ( ( rule__OutputProcessPart__OutputAssignment_8 )? ) )
            // InternalGoatComponentsParser.g:2993:1: ( ( rule__OutputProcessPart__OutputAssignment_8 )? )
            {
            // InternalGoatComponentsParser.g:2993:1: ( ( rule__OutputProcessPart__OutputAssignment_8 )? )
            // InternalGoatComponentsParser.g:2994:2: ( rule__OutputProcessPart__OutputAssignment_8 )?
            {
             before(grammarAccess.getOutputProcessPartAccess().getOutputAssignment_8()); 
            // InternalGoatComponentsParser.g:2995:2: ( rule__OutputProcessPart__OutputAssignment_8 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Print) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGoatComponentsParser.g:2995:3: rule__OutputProcessPart__OutputAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputProcessPart__OutputAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputProcessPartAccess().getOutputAssignment_8()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__8__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__9"
    // InternalGoatComponentsParser.g:3003:1: rule__OutputProcessPart__Group__9 : rule__OutputProcessPart__Group__9__Impl rule__OutputProcessPart__Group__10 ;
    public final void rule__OutputProcessPart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3007:1: ( rule__OutputProcessPart__Group__9__Impl rule__OutputProcessPart__Group__10 )
            // InternalGoatComponentsParser.g:3008:2: rule__OutputProcessPart__Group__9__Impl rule__OutputProcessPart__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__OutputProcessPart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__10();

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
    // $ANTLR end "rule__OutputProcessPart__Group__9"


    // $ANTLR start "rule__OutputProcessPart__Group__9__Impl"
    // InternalGoatComponentsParser.g:3015:1: rule__OutputProcessPart__Group__9__Impl : ( ( rule__OutputProcessPart__Group_9__0 )? ) ;
    public final void rule__OutputProcessPart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3019:1: ( ( ( rule__OutputProcessPart__Group_9__0 )? ) )
            // InternalGoatComponentsParser.g:3020:1: ( ( rule__OutputProcessPart__Group_9__0 )? )
            {
            // InternalGoatComponentsParser.g:3020:1: ( ( rule__OutputProcessPart__Group_9__0 )? )
            // InternalGoatComponentsParser.g:3021:2: ( rule__OutputProcessPart__Group_9__0 )?
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_9()); 
            // InternalGoatComponentsParser.g:3022:2: ( rule__OutputProcessPart__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Sleep) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGoatComponentsParser.g:3022:3: rule__OutputProcessPart__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputProcessPart__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputProcessPartAccess().getGroup_9()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__9__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__10"
    // InternalGoatComponentsParser.g:3030:1: rule__OutputProcessPart__Group__10 : rule__OutputProcessPart__Group__10__Impl rule__OutputProcessPart__Group__11 ;
    public final void rule__OutputProcessPart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3034:1: ( rule__OutputProcessPart__Group__10__Impl rule__OutputProcessPart__Group__11 )
            // InternalGoatComponentsParser.g:3035:2: rule__OutputProcessPart__Group__10__Impl rule__OutputProcessPart__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__OutputProcessPart__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__11();

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
    // $ANTLR end "rule__OutputProcessPart__Group__10"


    // $ANTLR start "rule__OutputProcessPart__Group__10__Impl"
    // InternalGoatComponentsParser.g:3042:1: rule__OutputProcessPart__Group__10__Impl : ( FullStop ) ;
    public final void rule__OutputProcessPart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3046:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:3047:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:3047:1: ( FullStop )
            // InternalGoatComponentsParser.g:3048:2: FullStop
            {
             before(grammarAccess.getOutputProcessPartAccess().getFullStopKeyword_10()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getFullStopKeyword_10()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__10__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__11"
    // InternalGoatComponentsParser.g:3057:1: rule__OutputProcessPart__Group__11 : rule__OutputProcessPart__Group__11__Impl ;
    public final void rule__OutputProcessPart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3061:1: ( rule__OutputProcessPart__Group__11__Impl )
            // InternalGoatComponentsParser.g:3062:2: rule__OutputProcessPart__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group__11__Impl();

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
    // $ANTLR end "rule__OutputProcessPart__Group__11"


    // $ANTLR start "rule__OutputProcessPart__Group__11__Impl"
    // InternalGoatComponentsParser.g:3068:1: rule__OutputProcessPart__Group__11__Impl : ( ( rule__OutputProcessPart__NextAssignment_11 ) ) ;
    public final void rule__OutputProcessPart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3072:1: ( ( ( rule__OutputProcessPart__NextAssignment_11 ) ) )
            // InternalGoatComponentsParser.g:3073:1: ( ( rule__OutputProcessPart__NextAssignment_11 ) )
            {
            // InternalGoatComponentsParser.g:3073:1: ( ( rule__OutputProcessPart__NextAssignment_11 ) )
            // InternalGoatComponentsParser.g:3074:2: ( rule__OutputProcessPart__NextAssignment_11 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getNextAssignment_11()); 
            // InternalGoatComponentsParser.g:3075:2: ( rule__OutputProcessPart__NextAssignment_11 )
            // InternalGoatComponentsParser.g:3075:3: rule__OutputProcessPart__NextAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__NextAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getOutputProcessPartAccess().getNextAssignment_11()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group__11__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_2__0"
    // InternalGoatComponentsParser.g:3084:1: rule__OutputProcessPart__Group_2__0 : rule__OutputProcessPart__Group_2__0__Impl rule__OutputProcessPart__Group_2__1 ;
    public final void rule__OutputProcessPart__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3088:1: ( rule__OutputProcessPart__Group_2__0__Impl rule__OutputProcessPart__Group_2__1 )
            // InternalGoatComponentsParser.g:3089:2: rule__OutputProcessPart__Group_2__0__Impl rule__OutputProcessPart__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__OutputProcessPart__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_2__1();

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
    // $ANTLR end "rule__OutputProcessPart__Group_2__0"


    // $ANTLR start "rule__OutputProcessPart__Group_2__0__Impl"
    // InternalGoatComponentsParser.g:3096:1: rule__OutputProcessPart__Group_2__0__Impl : ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) ) ;
    public final void rule__OutputProcessPart__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3100:1: ( ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) ) )
            // InternalGoatComponentsParser.g:3101:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) )
            {
            // InternalGoatComponentsParser.g:3101:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) )
            // InternalGoatComponentsParser.g:3102:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsAssignment_2_0()); 
            // InternalGoatComponentsParser.g:3103:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 )
            // InternalGoatComponentsParser.g:3103:3: rule__OutputProcessPart__MsgOutPartsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__MsgOutPartsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsAssignment_2_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group_2__0__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_2__1"
    // InternalGoatComponentsParser.g:3111:1: rule__OutputProcessPart__Group_2__1 : rule__OutputProcessPart__Group_2__1__Impl ;
    public final void rule__OutputProcessPart__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3115:1: ( rule__OutputProcessPart__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:3116:2: rule__OutputProcessPart__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_2__1__Impl();

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
    // $ANTLR end "rule__OutputProcessPart__Group_2__1"


    // $ANTLR start "rule__OutputProcessPart__Group_2__1__Impl"
    // InternalGoatComponentsParser.g:3122:1: rule__OutputProcessPart__Group_2__1__Impl : ( ( rule__OutputProcessPart__Group_2_1__0 )* ) ;
    public final void rule__OutputProcessPart__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3126:1: ( ( ( rule__OutputProcessPart__Group_2_1__0 )* ) )
            // InternalGoatComponentsParser.g:3127:1: ( ( rule__OutputProcessPart__Group_2_1__0 )* )
            {
            // InternalGoatComponentsParser.g:3127:1: ( ( rule__OutputProcessPart__Group_2_1__0 )* )
            // InternalGoatComponentsParser.g:3128:2: ( rule__OutputProcessPart__Group_2_1__0 )*
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_2_1()); 
            // InternalGoatComponentsParser.g:3129:2: ( rule__OutputProcessPart__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3129:3: rule__OutputProcessPart__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__OutputProcessPart__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getOutputProcessPartAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group_2__1__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_2_1__0"
    // InternalGoatComponentsParser.g:3138:1: rule__OutputProcessPart__Group_2_1__0 : rule__OutputProcessPart__Group_2_1__0__Impl rule__OutputProcessPart__Group_2_1__1 ;
    public final void rule__OutputProcessPart__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3142:1: ( rule__OutputProcessPart__Group_2_1__0__Impl rule__OutputProcessPart__Group_2_1__1 )
            // InternalGoatComponentsParser.g:3143:2: rule__OutputProcessPart__Group_2_1__0__Impl rule__OutputProcessPart__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__OutputProcessPart__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_2_1__1();

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
    // $ANTLR end "rule__OutputProcessPart__Group_2_1__0"


    // $ANTLR start "rule__OutputProcessPart__Group_2_1__0__Impl"
    // InternalGoatComponentsParser.g:3150:1: rule__OutputProcessPart__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__OutputProcessPart__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3154:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:3155:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:3155:1: ( Comma )
            // InternalGoatComponentsParser.g:3156:2: Comma
            {
             before(grammarAccess.getOutputProcessPartAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group_2_1__0__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_2_1__1"
    // InternalGoatComponentsParser.g:3165:1: rule__OutputProcessPart__Group_2_1__1 : rule__OutputProcessPart__Group_2_1__1__Impl ;
    public final void rule__OutputProcessPart__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3169:1: ( rule__OutputProcessPart__Group_2_1__1__Impl )
            // InternalGoatComponentsParser.g:3170:2: rule__OutputProcessPart__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__OutputProcessPart__Group_2_1__1"


    // $ANTLR start "rule__OutputProcessPart__Group_2_1__1__Impl"
    // InternalGoatComponentsParser.g:3176:1: rule__OutputProcessPart__Group_2_1__1__Impl : ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) ) ;
    public final void rule__OutputProcessPart__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3180:1: ( ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) ) )
            // InternalGoatComponentsParser.g:3181:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) )
            {
            // InternalGoatComponentsParser.g:3181:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) )
            // InternalGoatComponentsParser.g:3182:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsAssignment_2_1_1()); 
            // InternalGoatComponentsParser.g:3183:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 )
            // InternalGoatComponentsParser.g:3183:3: rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group_2_1__1__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_9__0"
    // InternalGoatComponentsParser.g:3192:1: rule__OutputProcessPart__Group_9__0 : rule__OutputProcessPart__Group_9__0__Impl rule__OutputProcessPart__Group_9__1 ;
    public final void rule__OutputProcessPart__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3196:1: ( rule__OutputProcessPart__Group_9__0__Impl rule__OutputProcessPart__Group_9__1 )
            // InternalGoatComponentsParser.g:3197:2: rule__OutputProcessPart__Group_9__0__Impl rule__OutputProcessPart__Group_9__1
            {
            pushFollow(FOLLOW_14);
            rule__OutputProcessPart__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_9__1();

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
    // $ANTLR end "rule__OutputProcessPart__Group_9__0"


    // $ANTLR start "rule__OutputProcessPart__Group_9__0__Impl"
    // InternalGoatComponentsParser.g:3204:1: rule__OutputProcessPart__Group_9__0__Impl : ( Sleep ) ;
    public final void rule__OutputProcessPart__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3208:1: ( ( Sleep ) )
            // InternalGoatComponentsParser.g:3209:1: ( Sleep )
            {
            // InternalGoatComponentsParser.g:3209:1: ( Sleep )
            // InternalGoatComponentsParser.g:3210:2: Sleep
            {
             before(grammarAccess.getOutputProcessPartAccess().getSleepKeyword_9_0()); 
            match(input,Sleep,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getSleepKeyword_9_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group_9__0__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_9__1"
    // InternalGoatComponentsParser.g:3219:1: rule__OutputProcessPart__Group_9__1 : rule__OutputProcessPart__Group_9__1__Impl rule__OutputProcessPart__Group_9__2 ;
    public final void rule__OutputProcessPart__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3223:1: ( rule__OutputProcessPart__Group_9__1__Impl rule__OutputProcessPart__Group_9__2 )
            // InternalGoatComponentsParser.g:3224:2: rule__OutputProcessPart__Group_9__1__Impl rule__OutputProcessPart__Group_9__2
            {
            pushFollow(FOLLOW_28);
            rule__OutputProcessPart__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_9__2();

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
    // $ANTLR end "rule__OutputProcessPart__Group_9__1"


    // $ANTLR start "rule__OutputProcessPart__Group_9__1__Impl"
    // InternalGoatComponentsParser.g:3231:1: rule__OutputProcessPart__Group_9__1__Impl : ( LeftParenthesis ) ;
    public final void rule__OutputProcessPart__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3235:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:3236:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:3236:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:3237:2: LeftParenthesis
            {
             before(grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_9_1()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group_9__1__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_9__2"
    // InternalGoatComponentsParser.g:3246:1: rule__OutputProcessPart__Group_9__2 : rule__OutputProcessPart__Group_9__2__Impl rule__OutputProcessPart__Group_9__3 ;
    public final void rule__OutputProcessPart__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3250:1: ( rule__OutputProcessPart__Group_9__2__Impl rule__OutputProcessPart__Group_9__3 )
            // InternalGoatComponentsParser.g:3251:2: rule__OutputProcessPart__Group_9__2__Impl rule__OutputProcessPart__Group_9__3
            {
            pushFollow(FOLLOW_16);
            rule__OutputProcessPart__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_9__3();

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
    // $ANTLR end "rule__OutputProcessPart__Group_9__2"


    // $ANTLR start "rule__OutputProcessPart__Group_9__2__Impl"
    // InternalGoatComponentsParser.g:3258:1: rule__OutputProcessPart__Group_9__2__Impl : ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) ) ;
    public final void rule__OutputProcessPart__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3262:1: ( ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) ) )
            // InternalGoatComponentsParser.g:3263:1: ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) )
            {
            // InternalGoatComponentsParser.g:3263:1: ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) )
            // InternalGoatComponentsParser.g:3264:2: ( rule__OutputProcessPart__MsecAssignment_9_2 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsecAssignment_9_2()); 
            // InternalGoatComponentsParser.g:3265:2: ( rule__OutputProcessPart__MsecAssignment_9_2 )
            // InternalGoatComponentsParser.g:3265:3: rule__OutputProcessPart__MsecAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__MsecAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputProcessPartAccess().getMsecAssignment_9_2()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group_9__2__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_9__3"
    // InternalGoatComponentsParser.g:3273:1: rule__OutputProcessPart__Group_9__3 : rule__OutputProcessPart__Group_9__3__Impl ;
    public final void rule__OutputProcessPart__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3277:1: ( rule__OutputProcessPart__Group_9__3__Impl )
            // InternalGoatComponentsParser.g:3278:2: rule__OutputProcessPart__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_9__3__Impl();

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
    // $ANTLR end "rule__OutputProcessPart__Group_9__3"


    // $ANTLR start "rule__OutputProcessPart__Group_9__3__Impl"
    // InternalGoatComponentsParser.g:3284:1: rule__OutputProcessPart__Group_9__3__Impl : ( RightParenthesis ) ;
    public final void rule__OutputProcessPart__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3288:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:3289:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:3289:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:3290:2: RightParenthesis
            {
             before(grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_9_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_9_3()); 

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
    // $ANTLR end "rule__OutputProcessPart__Group_9__3__Impl"


    // $ANTLR start "rule__PrintFormattedStatement__Group__0"
    // InternalGoatComponentsParser.g:3300:1: rule__PrintFormattedStatement__Group__0 : rule__PrintFormattedStatement__Group__0__Impl rule__PrintFormattedStatement__Group__1 ;
    public final void rule__PrintFormattedStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3304:1: ( rule__PrintFormattedStatement__Group__0__Impl rule__PrintFormattedStatement__Group__1 )
            // InternalGoatComponentsParser.g:3305:2: rule__PrintFormattedStatement__Group__0__Impl rule__PrintFormattedStatement__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__PrintFormattedStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintFormattedStatement__Group__1();

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
    // $ANTLR end "rule__PrintFormattedStatement__Group__0"


    // $ANTLR start "rule__PrintFormattedStatement__Group__0__Impl"
    // InternalGoatComponentsParser.g:3312:1: rule__PrintFormattedStatement__Group__0__Impl : ( () ) ;
    public final void rule__PrintFormattedStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3316:1: ( ( () ) )
            // InternalGoatComponentsParser.g:3317:1: ( () )
            {
            // InternalGoatComponentsParser.g:3317:1: ( () )
            // InternalGoatComponentsParser.g:3318:2: ()
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getPrintFormattedStatementAction_0()); 
            // InternalGoatComponentsParser.g:3319:2: ()
            // InternalGoatComponentsParser.g:3319:3: 
            {
            }

             after(grammarAccess.getPrintFormattedStatementAccess().getPrintFormattedStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintFormattedStatement__Group__0__Impl"


    // $ANTLR start "rule__PrintFormattedStatement__Group__1"
    // InternalGoatComponentsParser.g:3327:1: rule__PrintFormattedStatement__Group__1 : rule__PrintFormattedStatement__Group__1__Impl rule__PrintFormattedStatement__Group__2 ;
    public final void rule__PrintFormattedStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3331:1: ( rule__PrintFormattedStatement__Group__1__Impl rule__PrintFormattedStatement__Group__2 )
            // InternalGoatComponentsParser.g:3332:2: rule__PrintFormattedStatement__Group__1__Impl rule__PrintFormattedStatement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PrintFormattedStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintFormattedStatement__Group__2();

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
    // $ANTLR end "rule__PrintFormattedStatement__Group__1"


    // $ANTLR start "rule__PrintFormattedStatement__Group__1__Impl"
    // InternalGoatComponentsParser.g:3339:1: rule__PrintFormattedStatement__Group__1__Impl : ( Print ) ;
    public final void rule__PrintFormattedStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3343:1: ( ( Print ) )
            // InternalGoatComponentsParser.g:3344:1: ( Print )
            {
            // InternalGoatComponentsParser.g:3344:1: ( Print )
            // InternalGoatComponentsParser.g:3345:2: Print
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getPrintKeyword_1()); 
            match(input,Print,FOLLOW_2); 
             after(grammarAccess.getPrintFormattedStatementAccess().getPrintKeyword_1()); 

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
    // $ANTLR end "rule__PrintFormattedStatement__Group__1__Impl"


    // $ANTLR start "rule__PrintFormattedStatement__Group__2"
    // InternalGoatComponentsParser.g:3354:1: rule__PrintFormattedStatement__Group__2 : rule__PrintFormattedStatement__Group__2__Impl rule__PrintFormattedStatement__Group__3 ;
    public final void rule__PrintFormattedStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3358:1: ( rule__PrintFormattedStatement__Group__2__Impl rule__PrintFormattedStatement__Group__3 )
            // InternalGoatComponentsParser.g:3359:2: rule__PrintFormattedStatement__Group__2__Impl rule__PrintFormattedStatement__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__PrintFormattedStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintFormattedStatement__Group__3();

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
    // $ANTLR end "rule__PrintFormattedStatement__Group__2"


    // $ANTLR start "rule__PrintFormattedStatement__Group__2__Impl"
    // InternalGoatComponentsParser.g:3366:1: rule__PrintFormattedStatement__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__PrintFormattedStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3370:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:3371:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:3371:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:3372:2: LeftParenthesis
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrintFormattedStatementAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__PrintFormattedStatement__Group__2__Impl"


    // $ANTLR start "rule__PrintFormattedStatement__Group__3"
    // InternalGoatComponentsParser.g:3381:1: rule__PrintFormattedStatement__Group__3 : rule__PrintFormattedStatement__Group__3__Impl rule__PrintFormattedStatement__Group__4 ;
    public final void rule__PrintFormattedStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3385:1: ( rule__PrintFormattedStatement__Group__3__Impl rule__PrintFormattedStatement__Group__4 )
            // InternalGoatComponentsParser.g:3386:2: rule__PrintFormattedStatement__Group__3__Impl rule__PrintFormattedStatement__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__PrintFormattedStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintFormattedStatement__Group__4();

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
    // $ANTLR end "rule__PrintFormattedStatement__Group__3"


    // $ANTLR start "rule__PrintFormattedStatement__Group__3__Impl"
    // InternalGoatComponentsParser.g:3393:1: rule__PrintFormattedStatement__Group__3__Impl : ( ( rule__PrintFormattedStatement__ToPrintAssignment_3 ) ) ;
    public final void rule__PrintFormattedStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3397:1: ( ( ( rule__PrintFormattedStatement__ToPrintAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:3398:1: ( ( rule__PrintFormattedStatement__ToPrintAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:3398:1: ( ( rule__PrintFormattedStatement__ToPrintAssignment_3 ) )
            // InternalGoatComponentsParser.g:3399:2: ( rule__PrintFormattedStatement__ToPrintAssignment_3 )
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getToPrintAssignment_3()); 
            // InternalGoatComponentsParser.g:3400:2: ( rule__PrintFormattedStatement__ToPrintAssignment_3 )
            // InternalGoatComponentsParser.g:3400:3: rule__PrintFormattedStatement__ToPrintAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrintFormattedStatement__ToPrintAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrintFormattedStatementAccess().getToPrintAssignment_3()); 

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
    // $ANTLR end "rule__PrintFormattedStatement__Group__3__Impl"


    // $ANTLR start "rule__PrintFormattedStatement__Group__4"
    // InternalGoatComponentsParser.g:3408:1: rule__PrintFormattedStatement__Group__4 : rule__PrintFormattedStatement__Group__4__Impl ;
    public final void rule__PrintFormattedStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3412:1: ( rule__PrintFormattedStatement__Group__4__Impl )
            // InternalGoatComponentsParser.g:3413:2: rule__PrintFormattedStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintFormattedStatement__Group__4__Impl();

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
    // $ANTLR end "rule__PrintFormattedStatement__Group__4"


    // $ANTLR start "rule__PrintFormattedStatement__Group__4__Impl"
    // InternalGoatComponentsParser.g:3419:1: rule__PrintFormattedStatement__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__PrintFormattedStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3423:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:3424:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:3424:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:3425:2: RightParenthesis
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrintFormattedStatementAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__PrintFormattedStatement__Group__4__Impl"


    // $ANTLR start "rule__IfProcesses__Group__0"
    // InternalGoatComponentsParser.g:3435:1: rule__IfProcesses__Group__0 : rule__IfProcesses__Group__0__Impl rule__IfProcesses__Group__1 ;
    public final void rule__IfProcesses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3439:1: ( rule__IfProcesses__Group__0__Impl rule__IfProcesses__Group__1 )
            // InternalGoatComponentsParser.g:3440:2: rule__IfProcesses__Group__0__Impl rule__IfProcesses__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__IfProcesses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group__1();

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
    // $ANTLR end "rule__IfProcesses__Group__0"


    // $ANTLR start "rule__IfProcesses__Group__0__Impl"
    // InternalGoatComponentsParser.g:3447:1: rule__IfProcesses__Group__0__Impl : ( () ) ;
    public final void rule__IfProcesses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3451:1: ( ( () ) )
            // InternalGoatComponentsParser.g:3452:1: ( () )
            {
            // InternalGoatComponentsParser.g:3452:1: ( () )
            // InternalGoatComponentsParser.g:3453:2: ()
            {
             before(grammarAccess.getIfProcessesAccess().getIfProcessesAction_0()); 
            // InternalGoatComponentsParser.g:3454:2: ()
            // InternalGoatComponentsParser.g:3454:3: 
            {
            }

             after(grammarAccess.getIfProcessesAccess().getIfProcessesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfProcesses__Group__0__Impl"


    // $ANTLR start "rule__IfProcesses__Group__1"
    // InternalGoatComponentsParser.g:3462:1: rule__IfProcesses__Group__1 : rule__IfProcesses__Group__1__Impl rule__IfProcesses__Group__2 ;
    public final void rule__IfProcesses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3466:1: ( rule__IfProcesses__Group__1__Impl rule__IfProcesses__Group__2 )
            // InternalGoatComponentsParser.g:3467:2: rule__IfProcesses__Group__1__Impl rule__IfProcesses__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__IfProcesses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group__2();

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
    // $ANTLR end "rule__IfProcesses__Group__1"


    // $ANTLR start "rule__IfProcesses__Group__1__Impl"
    // InternalGoatComponentsParser.g:3474:1: rule__IfProcesses__Group__1__Impl : ( ( rule__IfProcesses__BranchesAssignment_1 ) ) ;
    public final void rule__IfProcesses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3478:1: ( ( ( rule__IfProcesses__BranchesAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:3479:1: ( ( rule__IfProcesses__BranchesAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:3479:1: ( ( rule__IfProcesses__BranchesAssignment_1 ) )
            // InternalGoatComponentsParser.g:3480:2: ( rule__IfProcesses__BranchesAssignment_1 )
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesAssignment_1()); 
            // InternalGoatComponentsParser.g:3481:2: ( rule__IfProcesses__BranchesAssignment_1 )
            // InternalGoatComponentsParser.g:3481:3: rule__IfProcesses__BranchesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfProcesses__BranchesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfProcessesAccess().getBranchesAssignment_1()); 

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
    // $ANTLR end "rule__IfProcesses__Group__1__Impl"


    // $ANTLR start "rule__IfProcesses__Group__2"
    // InternalGoatComponentsParser.g:3489:1: rule__IfProcesses__Group__2 : rule__IfProcesses__Group__2__Impl rule__IfProcesses__Group__3 ;
    public final void rule__IfProcesses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3493:1: ( rule__IfProcesses__Group__2__Impl rule__IfProcesses__Group__3 )
            // InternalGoatComponentsParser.g:3494:2: rule__IfProcesses__Group__2__Impl rule__IfProcesses__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__IfProcesses__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group__3();

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
    // $ANTLR end "rule__IfProcesses__Group__2"


    // $ANTLR start "rule__IfProcesses__Group__2__Impl"
    // InternalGoatComponentsParser.g:3501:1: rule__IfProcesses__Group__2__Impl : ( ( rule__IfProcesses__Group_2__0 )* ) ;
    public final void rule__IfProcesses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3505:1: ( ( ( rule__IfProcesses__Group_2__0 )* ) )
            // InternalGoatComponentsParser.g:3506:1: ( ( rule__IfProcesses__Group_2__0 )* )
            {
            // InternalGoatComponentsParser.g:3506:1: ( ( rule__IfProcesses__Group_2__0 )* )
            // InternalGoatComponentsParser.g:3507:2: ( rule__IfProcesses__Group_2__0 )*
            {
             before(grammarAccess.getIfProcessesAccess().getGroup_2()); 
            // InternalGoatComponentsParser.g:3508:2: ( rule__IfProcesses__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Else) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==If) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3508:3: rule__IfProcesses__Group_2__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__IfProcesses__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getIfProcessesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__IfProcesses__Group__2__Impl"


    // $ANTLR start "rule__IfProcesses__Group__3"
    // InternalGoatComponentsParser.g:3516:1: rule__IfProcesses__Group__3 : rule__IfProcesses__Group__3__Impl ;
    public final void rule__IfProcesses__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3520:1: ( rule__IfProcesses__Group__3__Impl )
            // InternalGoatComponentsParser.g:3521:2: rule__IfProcesses__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group__3__Impl();

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
    // $ANTLR end "rule__IfProcesses__Group__3"


    // $ANTLR start "rule__IfProcesses__Group__3__Impl"
    // InternalGoatComponentsParser.g:3527:1: rule__IfProcesses__Group__3__Impl : ( ( rule__IfProcesses__Group_3__0 )? ) ;
    public final void rule__IfProcesses__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3531:1: ( ( ( rule__IfProcesses__Group_3__0 )? ) )
            // InternalGoatComponentsParser.g:3532:1: ( ( rule__IfProcesses__Group_3__0 )? )
            {
            // InternalGoatComponentsParser.g:3532:1: ( ( rule__IfProcesses__Group_3__0 )? )
            // InternalGoatComponentsParser.g:3533:2: ( rule__IfProcesses__Group_3__0 )?
            {
             before(grammarAccess.getIfProcessesAccess().getGroup_3()); 
            // InternalGoatComponentsParser.g:3534:2: ( rule__IfProcesses__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Else) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGoatComponentsParser.g:3534:3: rule__IfProcesses__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfProcesses__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfProcessesAccess().getGroup_3()); 

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
    // $ANTLR end "rule__IfProcesses__Group__3__Impl"


    // $ANTLR start "rule__IfProcesses__Group_2__0"
    // InternalGoatComponentsParser.g:3543:1: rule__IfProcesses__Group_2__0 : rule__IfProcesses__Group_2__0__Impl rule__IfProcesses__Group_2__1 ;
    public final void rule__IfProcesses__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3547:1: ( rule__IfProcesses__Group_2__0__Impl rule__IfProcesses__Group_2__1 )
            // InternalGoatComponentsParser.g:3548:2: rule__IfProcesses__Group_2__0__Impl rule__IfProcesses__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__IfProcesses__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group_2__1();

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
    // $ANTLR end "rule__IfProcesses__Group_2__0"


    // $ANTLR start "rule__IfProcesses__Group_2__0__Impl"
    // InternalGoatComponentsParser.g:3555:1: rule__IfProcesses__Group_2__0__Impl : ( Else ) ;
    public final void rule__IfProcesses__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3559:1: ( ( Else ) )
            // InternalGoatComponentsParser.g:3560:1: ( Else )
            {
            // InternalGoatComponentsParser.g:3560:1: ( Else )
            // InternalGoatComponentsParser.g:3561:2: Else
            {
             before(grammarAccess.getIfProcessesAccess().getElseKeyword_2_0()); 
            match(input,Else,FOLLOW_2); 
             after(grammarAccess.getIfProcessesAccess().getElseKeyword_2_0()); 

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
    // $ANTLR end "rule__IfProcesses__Group_2__0__Impl"


    // $ANTLR start "rule__IfProcesses__Group_2__1"
    // InternalGoatComponentsParser.g:3570:1: rule__IfProcesses__Group_2__1 : rule__IfProcesses__Group_2__1__Impl ;
    public final void rule__IfProcesses__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3574:1: ( rule__IfProcesses__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:3575:2: rule__IfProcesses__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group_2__1__Impl();

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
    // $ANTLR end "rule__IfProcesses__Group_2__1"


    // $ANTLR start "rule__IfProcesses__Group_2__1__Impl"
    // InternalGoatComponentsParser.g:3581:1: rule__IfProcesses__Group_2__1__Impl : ( ( rule__IfProcesses__BranchesAssignment_2_1 ) ) ;
    public final void rule__IfProcesses__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3585:1: ( ( ( rule__IfProcesses__BranchesAssignment_2_1 ) ) )
            // InternalGoatComponentsParser.g:3586:1: ( ( rule__IfProcesses__BranchesAssignment_2_1 ) )
            {
            // InternalGoatComponentsParser.g:3586:1: ( ( rule__IfProcesses__BranchesAssignment_2_1 ) )
            // InternalGoatComponentsParser.g:3587:2: ( rule__IfProcesses__BranchesAssignment_2_1 )
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesAssignment_2_1()); 
            // InternalGoatComponentsParser.g:3588:2: ( rule__IfProcesses__BranchesAssignment_2_1 )
            // InternalGoatComponentsParser.g:3588:3: rule__IfProcesses__BranchesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__IfProcesses__BranchesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIfProcessesAccess().getBranchesAssignment_2_1()); 

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
    // $ANTLR end "rule__IfProcesses__Group_2__1__Impl"


    // $ANTLR start "rule__IfProcesses__Group_3__0"
    // InternalGoatComponentsParser.g:3597:1: rule__IfProcesses__Group_3__0 : rule__IfProcesses__Group_3__0__Impl rule__IfProcesses__Group_3__1 ;
    public final void rule__IfProcesses__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3601:1: ( rule__IfProcesses__Group_3__0__Impl rule__IfProcesses__Group_3__1 )
            // InternalGoatComponentsParser.g:3602:2: rule__IfProcesses__Group_3__0__Impl rule__IfProcesses__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__IfProcesses__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group_3__1();

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
    // $ANTLR end "rule__IfProcesses__Group_3__0"


    // $ANTLR start "rule__IfProcesses__Group_3__0__Impl"
    // InternalGoatComponentsParser.g:3609:1: rule__IfProcesses__Group_3__0__Impl : ( Else ) ;
    public final void rule__IfProcesses__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3613:1: ( ( Else ) )
            // InternalGoatComponentsParser.g:3614:1: ( Else )
            {
            // InternalGoatComponentsParser.g:3614:1: ( Else )
            // InternalGoatComponentsParser.g:3615:2: Else
            {
             before(grammarAccess.getIfProcessesAccess().getElseKeyword_3_0()); 
            match(input,Else,FOLLOW_2); 
             after(grammarAccess.getIfProcessesAccess().getElseKeyword_3_0()); 

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
    // $ANTLR end "rule__IfProcesses__Group_3__0__Impl"


    // $ANTLR start "rule__IfProcesses__Group_3__1"
    // InternalGoatComponentsParser.g:3624:1: rule__IfProcesses__Group_3__1 : rule__IfProcesses__Group_3__1__Impl ;
    public final void rule__IfProcesses__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3628:1: ( rule__IfProcesses__Group_3__1__Impl )
            // InternalGoatComponentsParser.g:3629:2: rule__IfProcesses__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group_3__1__Impl();

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
    // $ANTLR end "rule__IfProcesses__Group_3__1"


    // $ANTLR start "rule__IfProcesses__Group_3__1__Impl"
    // InternalGoatComponentsParser.g:3635:1: rule__IfProcesses__Group_3__1__Impl : ( ( rule__IfProcesses__BranchesAssignment_3_1 ) ) ;
    public final void rule__IfProcesses__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3639:1: ( ( ( rule__IfProcesses__BranchesAssignment_3_1 ) ) )
            // InternalGoatComponentsParser.g:3640:1: ( ( rule__IfProcesses__BranchesAssignment_3_1 ) )
            {
            // InternalGoatComponentsParser.g:3640:1: ( ( rule__IfProcesses__BranchesAssignment_3_1 ) )
            // InternalGoatComponentsParser.g:3641:2: ( rule__IfProcesses__BranchesAssignment_3_1 )
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesAssignment_3_1()); 
            // InternalGoatComponentsParser.g:3642:2: ( rule__IfProcesses__BranchesAssignment_3_1 )
            // InternalGoatComponentsParser.g:3642:3: rule__IfProcesses__BranchesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IfProcesses__BranchesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIfProcessesAccess().getBranchesAssignment_3_1()); 

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
    // $ANTLR end "rule__IfProcesses__Group_3__1__Impl"


    // $ANTLR start "rule__IfBranchProcess__Group__0"
    // InternalGoatComponentsParser.g:3651:1: rule__IfBranchProcess__Group__0 : rule__IfBranchProcess__Group__0__Impl rule__IfBranchProcess__Group__1 ;
    public final void rule__IfBranchProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3655:1: ( rule__IfBranchProcess__Group__0__Impl rule__IfBranchProcess__Group__1 )
            // InternalGoatComponentsParser.g:3656:2: rule__IfBranchProcess__Group__0__Impl rule__IfBranchProcess__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__IfBranchProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfBranchProcess__Group__1();

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
    // $ANTLR end "rule__IfBranchProcess__Group__0"


    // $ANTLR start "rule__IfBranchProcess__Group__0__Impl"
    // InternalGoatComponentsParser.g:3663:1: rule__IfBranchProcess__Group__0__Impl : ( () ) ;
    public final void rule__IfBranchProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3667:1: ( ( () ) )
            // InternalGoatComponentsParser.g:3668:1: ( () )
            {
            // InternalGoatComponentsParser.g:3668:1: ( () )
            // InternalGoatComponentsParser.g:3669:2: ()
            {
             before(grammarAccess.getIfBranchProcessAccess().getIfBranchProcessAction_0()); 
            // InternalGoatComponentsParser.g:3670:2: ()
            // InternalGoatComponentsParser.g:3670:3: 
            {
            }

             after(grammarAccess.getIfBranchProcessAccess().getIfBranchProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBranchProcess__Group__0__Impl"


    // $ANTLR start "rule__IfBranchProcess__Group__1"
    // InternalGoatComponentsParser.g:3678:1: rule__IfBranchProcess__Group__1 : rule__IfBranchProcess__Group__1__Impl rule__IfBranchProcess__Group__2 ;
    public final void rule__IfBranchProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3682:1: ( rule__IfBranchProcess__Group__1__Impl rule__IfBranchProcess__Group__2 )
            // InternalGoatComponentsParser.g:3683:2: rule__IfBranchProcess__Group__1__Impl rule__IfBranchProcess__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__IfBranchProcess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfBranchProcess__Group__2();

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
    // $ANTLR end "rule__IfBranchProcess__Group__1"


    // $ANTLR start "rule__IfBranchProcess__Group__1__Impl"
    // InternalGoatComponentsParser.g:3690:1: rule__IfBranchProcess__Group__1__Impl : ( If ) ;
    public final void rule__IfBranchProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3694:1: ( ( If ) )
            // InternalGoatComponentsParser.g:3695:1: ( If )
            {
            // InternalGoatComponentsParser.g:3695:1: ( If )
            // InternalGoatComponentsParser.g:3696:2: If
            {
             before(grammarAccess.getIfBranchProcessAccess().getIfKeyword_1()); 
            match(input,If,FOLLOW_2); 
             after(grammarAccess.getIfBranchProcessAccess().getIfKeyword_1()); 

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
    // $ANTLR end "rule__IfBranchProcess__Group__1__Impl"


    // $ANTLR start "rule__IfBranchProcess__Group__2"
    // InternalGoatComponentsParser.g:3705:1: rule__IfBranchProcess__Group__2 : rule__IfBranchProcess__Group__2__Impl rule__IfBranchProcess__Group__3 ;
    public final void rule__IfBranchProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3709:1: ( rule__IfBranchProcess__Group__2__Impl rule__IfBranchProcess__Group__3 )
            // InternalGoatComponentsParser.g:3710:2: rule__IfBranchProcess__Group__2__Impl rule__IfBranchProcess__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__IfBranchProcess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfBranchProcess__Group__3();

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
    // $ANTLR end "rule__IfBranchProcess__Group__2"


    // $ANTLR start "rule__IfBranchProcess__Group__2__Impl"
    // InternalGoatComponentsParser.g:3717:1: rule__IfBranchProcess__Group__2__Impl : ( ( rule__IfBranchProcess__CondAssignment_2 ) ) ;
    public final void rule__IfBranchProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3721:1: ( ( ( rule__IfBranchProcess__CondAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:3722:1: ( ( rule__IfBranchProcess__CondAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:3722:1: ( ( rule__IfBranchProcess__CondAssignment_2 ) )
            // InternalGoatComponentsParser.g:3723:2: ( rule__IfBranchProcess__CondAssignment_2 )
            {
             before(grammarAccess.getIfBranchProcessAccess().getCondAssignment_2()); 
            // InternalGoatComponentsParser.g:3724:2: ( rule__IfBranchProcess__CondAssignment_2 )
            // InternalGoatComponentsParser.g:3724:3: rule__IfBranchProcess__CondAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfBranchProcess__CondAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfBranchProcessAccess().getCondAssignment_2()); 

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
    // $ANTLR end "rule__IfBranchProcess__Group__2__Impl"


    // $ANTLR start "rule__IfBranchProcess__Group__3"
    // InternalGoatComponentsParser.g:3732:1: rule__IfBranchProcess__Group__3 : rule__IfBranchProcess__Group__3__Impl rule__IfBranchProcess__Group__4 ;
    public final void rule__IfBranchProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3736:1: ( rule__IfBranchProcess__Group__3__Impl rule__IfBranchProcess__Group__4 )
            // InternalGoatComponentsParser.g:3737:2: rule__IfBranchProcess__Group__3__Impl rule__IfBranchProcess__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__IfBranchProcess__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfBranchProcess__Group__4();

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
    // $ANTLR end "rule__IfBranchProcess__Group__3"


    // $ANTLR start "rule__IfBranchProcess__Group__3__Impl"
    // InternalGoatComponentsParser.g:3744:1: rule__IfBranchProcess__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__IfBranchProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3748:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:3749:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:3749:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:3750:2: LeftCurlyBracket
            {
             before(grammarAccess.getIfBranchProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getIfBranchProcessAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__IfBranchProcess__Group__3__Impl"


    // $ANTLR start "rule__IfBranchProcess__Group__4"
    // InternalGoatComponentsParser.g:3759:1: rule__IfBranchProcess__Group__4 : rule__IfBranchProcess__Group__4__Impl rule__IfBranchProcess__Group__5 ;
    public final void rule__IfBranchProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3763:1: ( rule__IfBranchProcess__Group__4__Impl rule__IfBranchProcess__Group__5 )
            // InternalGoatComponentsParser.g:3764:2: rule__IfBranchProcess__Group__4__Impl rule__IfBranchProcess__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__IfBranchProcess__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfBranchProcess__Group__5();

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
    // $ANTLR end "rule__IfBranchProcess__Group__4"


    // $ANTLR start "rule__IfBranchProcess__Group__4__Impl"
    // InternalGoatComponentsParser.g:3771:1: rule__IfBranchProcess__Group__4__Impl : ( ( rule__IfBranchProcess__ThenAssignment_4 ) ) ;
    public final void rule__IfBranchProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3775:1: ( ( ( rule__IfBranchProcess__ThenAssignment_4 ) ) )
            // InternalGoatComponentsParser.g:3776:1: ( ( rule__IfBranchProcess__ThenAssignment_4 ) )
            {
            // InternalGoatComponentsParser.g:3776:1: ( ( rule__IfBranchProcess__ThenAssignment_4 ) )
            // InternalGoatComponentsParser.g:3777:2: ( rule__IfBranchProcess__ThenAssignment_4 )
            {
             before(grammarAccess.getIfBranchProcessAccess().getThenAssignment_4()); 
            // InternalGoatComponentsParser.g:3778:2: ( rule__IfBranchProcess__ThenAssignment_4 )
            // InternalGoatComponentsParser.g:3778:3: rule__IfBranchProcess__ThenAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfBranchProcess__ThenAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfBranchProcessAccess().getThenAssignment_4()); 

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
    // $ANTLR end "rule__IfBranchProcess__Group__4__Impl"


    // $ANTLR start "rule__IfBranchProcess__Group__5"
    // InternalGoatComponentsParser.g:3786:1: rule__IfBranchProcess__Group__5 : rule__IfBranchProcess__Group__5__Impl ;
    public final void rule__IfBranchProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3790:1: ( rule__IfBranchProcess__Group__5__Impl )
            // InternalGoatComponentsParser.g:3791:2: rule__IfBranchProcess__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfBranchProcess__Group__5__Impl();

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
    // $ANTLR end "rule__IfBranchProcess__Group__5"


    // $ANTLR start "rule__IfBranchProcess__Group__5__Impl"
    // InternalGoatComponentsParser.g:3797:1: rule__IfBranchProcess__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__IfBranchProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3801:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:3802:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:3802:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:3803:2: RightCurlyBracket
            {
             before(grammarAccess.getIfBranchProcessAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getIfBranchProcessAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__IfBranchProcess__Group__5__Impl"


    // $ANTLR start "rule__ElseBranchProcess__Group__0"
    // InternalGoatComponentsParser.g:3813:1: rule__ElseBranchProcess__Group__0 : rule__ElseBranchProcess__Group__0__Impl rule__ElseBranchProcess__Group__1 ;
    public final void rule__ElseBranchProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3817:1: ( rule__ElseBranchProcess__Group__0__Impl rule__ElseBranchProcess__Group__1 )
            // InternalGoatComponentsParser.g:3818:2: rule__ElseBranchProcess__Group__0__Impl rule__ElseBranchProcess__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ElseBranchProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseBranchProcess__Group__1();

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
    // $ANTLR end "rule__ElseBranchProcess__Group__0"


    // $ANTLR start "rule__ElseBranchProcess__Group__0__Impl"
    // InternalGoatComponentsParser.g:3825:1: rule__ElseBranchProcess__Group__0__Impl : ( () ) ;
    public final void rule__ElseBranchProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3829:1: ( ( () ) )
            // InternalGoatComponentsParser.g:3830:1: ( () )
            {
            // InternalGoatComponentsParser.g:3830:1: ( () )
            // InternalGoatComponentsParser.g:3831:2: ()
            {
             before(grammarAccess.getElseBranchProcessAccess().getIfBranchProcessAction_0()); 
            // InternalGoatComponentsParser.g:3832:2: ()
            // InternalGoatComponentsParser.g:3832:3: 
            {
            }

             after(grammarAccess.getElseBranchProcessAccess().getIfBranchProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseBranchProcess__Group__0__Impl"


    // $ANTLR start "rule__ElseBranchProcess__Group__1"
    // InternalGoatComponentsParser.g:3840:1: rule__ElseBranchProcess__Group__1 : rule__ElseBranchProcess__Group__1__Impl rule__ElseBranchProcess__Group__2 ;
    public final void rule__ElseBranchProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3844:1: ( rule__ElseBranchProcess__Group__1__Impl rule__ElseBranchProcess__Group__2 )
            // InternalGoatComponentsParser.g:3845:2: rule__ElseBranchProcess__Group__1__Impl rule__ElseBranchProcess__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ElseBranchProcess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseBranchProcess__Group__2();

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
    // $ANTLR end "rule__ElseBranchProcess__Group__1"


    // $ANTLR start "rule__ElseBranchProcess__Group__1__Impl"
    // InternalGoatComponentsParser.g:3852:1: rule__ElseBranchProcess__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ElseBranchProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3856:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:3857:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:3857:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:3858:2: LeftCurlyBracket
            {
             before(grammarAccess.getElseBranchProcessAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getElseBranchProcessAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ElseBranchProcess__Group__1__Impl"


    // $ANTLR start "rule__ElseBranchProcess__Group__2"
    // InternalGoatComponentsParser.g:3867:1: rule__ElseBranchProcess__Group__2 : rule__ElseBranchProcess__Group__2__Impl rule__ElseBranchProcess__Group__3 ;
    public final void rule__ElseBranchProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3871:1: ( rule__ElseBranchProcess__Group__2__Impl rule__ElseBranchProcess__Group__3 )
            // InternalGoatComponentsParser.g:3872:2: rule__ElseBranchProcess__Group__2__Impl rule__ElseBranchProcess__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ElseBranchProcess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseBranchProcess__Group__3();

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
    // $ANTLR end "rule__ElseBranchProcess__Group__2"


    // $ANTLR start "rule__ElseBranchProcess__Group__2__Impl"
    // InternalGoatComponentsParser.g:3879:1: rule__ElseBranchProcess__Group__2__Impl : ( ( rule__ElseBranchProcess__ThenAssignment_2 ) ) ;
    public final void rule__ElseBranchProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3883:1: ( ( ( rule__ElseBranchProcess__ThenAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:3884:1: ( ( rule__ElseBranchProcess__ThenAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:3884:1: ( ( rule__ElseBranchProcess__ThenAssignment_2 ) )
            // InternalGoatComponentsParser.g:3885:2: ( rule__ElseBranchProcess__ThenAssignment_2 )
            {
             before(grammarAccess.getElseBranchProcessAccess().getThenAssignment_2()); 
            // InternalGoatComponentsParser.g:3886:2: ( rule__ElseBranchProcess__ThenAssignment_2 )
            // InternalGoatComponentsParser.g:3886:3: rule__ElseBranchProcess__ThenAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseBranchProcess__ThenAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseBranchProcessAccess().getThenAssignment_2()); 

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
    // $ANTLR end "rule__ElseBranchProcess__Group__2__Impl"


    // $ANTLR start "rule__ElseBranchProcess__Group__3"
    // InternalGoatComponentsParser.g:3894:1: rule__ElseBranchProcess__Group__3 : rule__ElseBranchProcess__Group__3__Impl ;
    public final void rule__ElseBranchProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3898:1: ( rule__ElseBranchProcess__Group__3__Impl )
            // InternalGoatComponentsParser.g:3899:2: rule__ElseBranchProcess__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseBranchProcess__Group__3__Impl();

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
    // $ANTLR end "rule__ElseBranchProcess__Group__3"


    // $ANTLR start "rule__ElseBranchProcess__Group__3__Impl"
    // InternalGoatComponentsParser.g:3905:1: rule__ElseBranchProcess__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ElseBranchProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3909:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:3910:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:3910:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:3911:2: RightCurlyBracket
            {
             before(grammarAccess.getElseBranchProcessAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getElseBranchProcessAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ElseBranchProcess__Group__3__Impl"


    // $ANTLR start "rule__Update__Group__0"
    // InternalGoatComponentsParser.g:3921:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3925:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalGoatComponentsParser.g:3926:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Update__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__1();

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
    // $ANTLR end "rule__Update__Group__0"


    // $ANTLR start "rule__Update__Group__0__Impl"
    // InternalGoatComponentsParser.g:3933:1: rule__Update__Group__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3937:1: ( ( LeftSquareBracket ) )
            // InternalGoatComponentsParser.g:3938:1: ( LeftSquareBracket )
            {
            // InternalGoatComponentsParser.g:3938:1: ( LeftSquareBracket )
            // InternalGoatComponentsParser.g:3939:2: LeftSquareBracket
            {
             before(grammarAccess.getUpdateAccess().getLeftSquareBracketKeyword_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Update__Group__0__Impl"


    // $ANTLR start "rule__Update__Group__1"
    // InternalGoatComponentsParser.g:3948:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3952:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalGoatComponentsParser.g:3953:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Update__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__2();

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
    // $ANTLR end "rule__Update__Group__1"


    // $ANTLR start "rule__Update__Group__1__Impl"
    // InternalGoatComponentsParser.g:3960:1: rule__Update__Group__1__Impl : ( ( rule__Update__VarsAssignment_1 ) ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3964:1: ( ( ( rule__Update__VarsAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:3965:1: ( ( rule__Update__VarsAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:3965:1: ( ( rule__Update__VarsAssignment_1 ) )
            // InternalGoatComponentsParser.g:3966:2: ( rule__Update__VarsAssignment_1 )
            {
             before(grammarAccess.getUpdateAccess().getVarsAssignment_1()); 
            // InternalGoatComponentsParser.g:3967:2: ( rule__Update__VarsAssignment_1 )
            // InternalGoatComponentsParser.g:3967:3: rule__Update__VarsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Update__VarsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getVarsAssignment_1()); 

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
    // $ANTLR end "rule__Update__Group__1__Impl"


    // $ANTLR start "rule__Update__Group__2"
    // InternalGoatComponentsParser.g:3975:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3979:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalGoatComponentsParser.g:3980:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Update__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__3();

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
    // $ANTLR end "rule__Update__Group__2"


    // $ANTLR start "rule__Update__Group__2__Impl"
    // InternalGoatComponentsParser.g:3987:1: rule__Update__Group__2__Impl : ( ColonEqualsSign ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3991:1: ( ( ColonEqualsSign ) )
            // InternalGoatComponentsParser.g:3992:1: ( ColonEqualsSign )
            {
            // InternalGoatComponentsParser.g:3992:1: ( ColonEqualsSign )
            // InternalGoatComponentsParser.g:3993:2: ColonEqualsSign
            {
             before(grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_2()); 
            match(input,ColonEqualsSign,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Update__Group__2__Impl"


    // $ANTLR start "rule__Update__Group__3"
    // InternalGoatComponentsParser.g:4002:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4006:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalGoatComponentsParser.g:4007:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Update__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__4();

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
    // $ANTLR end "rule__Update__Group__3"


    // $ANTLR start "rule__Update__Group__3__Impl"
    // InternalGoatComponentsParser.g:4014:1: rule__Update__Group__3__Impl : ( ( rule__Update__ValsAssignment_3 ) ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4018:1: ( ( ( rule__Update__ValsAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:4019:1: ( ( rule__Update__ValsAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:4019:1: ( ( rule__Update__ValsAssignment_3 ) )
            // InternalGoatComponentsParser.g:4020:2: ( rule__Update__ValsAssignment_3 )
            {
             before(grammarAccess.getUpdateAccess().getValsAssignment_3()); 
            // InternalGoatComponentsParser.g:4021:2: ( rule__Update__ValsAssignment_3 )
            // InternalGoatComponentsParser.g:4021:3: rule__Update__ValsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Update__ValsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getValsAssignment_3()); 

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
    // $ANTLR end "rule__Update__Group__3__Impl"


    // $ANTLR start "rule__Update__Group__4"
    // InternalGoatComponentsParser.g:4029:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4033:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalGoatComponentsParser.g:4034:2: rule__Update__Group__4__Impl rule__Update__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Update__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__5();

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
    // $ANTLR end "rule__Update__Group__4"


    // $ANTLR start "rule__Update__Group__4__Impl"
    // InternalGoatComponentsParser.g:4041:1: rule__Update__Group__4__Impl : ( ( rule__Update__Group_4__0 )* ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4045:1: ( ( ( rule__Update__Group_4__0 )* ) )
            // InternalGoatComponentsParser.g:4046:1: ( ( rule__Update__Group_4__0 )* )
            {
            // InternalGoatComponentsParser.g:4046:1: ( ( rule__Update__Group_4__0 )* )
            // InternalGoatComponentsParser.g:4047:2: ( rule__Update__Group_4__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_4()); 
            // InternalGoatComponentsParser.g:4048:2: ( rule__Update__Group_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Comma) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:4048:3: rule__Update__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Update__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getUpdateAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Update__Group__4__Impl"


    // $ANTLR start "rule__Update__Group__5"
    // InternalGoatComponentsParser.g:4056:1: rule__Update__Group__5 : rule__Update__Group__5__Impl ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4060:1: ( rule__Update__Group__5__Impl )
            // InternalGoatComponentsParser.g:4061:2: rule__Update__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__5__Impl();

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
    // $ANTLR end "rule__Update__Group__5"


    // $ANTLR start "rule__Update__Group__5__Impl"
    // InternalGoatComponentsParser.g:4067:1: rule__Update__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4071:1: ( ( RightSquareBracket ) )
            // InternalGoatComponentsParser.g:4072:1: ( RightSquareBracket )
            {
            // InternalGoatComponentsParser.g:4072:1: ( RightSquareBracket )
            // InternalGoatComponentsParser.g:4073:2: RightSquareBracket
            {
             before(grammarAccess.getUpdateAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Update__Group__5__Impl"


    // $ANTLR start "rule__Update__Group_4__0"
    // InternalGoatComponentsParser.g:4083:1: rule__Update__Group_4__0 : rule__Update__Group_4__0__Impl rule__Update__Group_4__1 ;
    public final void rule__Update__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4087:1: ( rule__Update__Group_4__0__Impl rule__Update__Group_4__1 )
            // InternalGoatComponentsParser.g:4088:2: rule__Update__Group_4__0__Impl rule__Update__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__Update__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_4__1();

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
    // $ANTLR end "rule__Update__Group_4__0"


    // $ANTLR start "rule__Update__Group_4__0__Impl"
    // InternalGoatComponentsParser.g:4095:1: rule__Update__Group_4__0__Impl : ( Comma ) ;
    public final void rule__Update__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4099:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:4100:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:4100:1: ( Comma )
            // InternalGoatComponentsParser.g:4101:2: Comma
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Update__Group_4__0__Impl"


    // $ANTLR start "rule__Update__Group_4__1"
    // InternalGoatComponentsParser.g:4110:1: rule__Update__Group_4__1 : rule__Update__Group_4__1__Impl rule__Update__Group_4__2 ;
    public final void rule__Update__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4114:1: ( rule__Update__Group_4__1__Impl rule__Update__Group_4__2 )
            // InternalGoatComponentsParser.g:4115:2: rule__Update__Group_4__1__Impl rule__Update__Group_4__2
            {
            pushFollow(FOLLOW_35);
            rule__Update__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_4__2();

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
    // $ANTLR end "rule__Update__Group_4__1"


    // $ANTLR start "rule__Update__Group_4__1__Impl"
    // InternalGoatComponentsParser.g:4122:1: rule__Update__Group_4__1__Impl : ( ( rule__Update__VarsAssignment_4_1 ) ) ;
    public final void rule__Update__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4126:1: ( ( ( rule__Update__VarsAssignment_4_1 ) ) )
            // InternalGoatComponentsParser.g:4127:1: ( ( rule__Update__VarsAssignment_4_1 ) )
            {
            // InternalGoatComponentsParser.g:4127:1: ( ( rule__Update__VarsAssignment_4_1 ) )
            // InternalGoatComponentsParser.g:4128:2: ( rule__Update__VarsAssignment_4_1 )
            {
             before(grammarAccess.getUpdateAccess().getVarsAssignment_4_1()); 
            // InternalGoatComponentsParser.g:4129:2: ( rule__Update__VarsAssignment_4_1 )
            // InternalGoatComponentsParser.g:4129:3: rule__Update__VarsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Update__VarsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getVarsAssignment_4_1()); 

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
    // $ANTLR end "rule__Update__Group_4__1__Impl"


    // $ANTLR start "rule__Update__Group_4__2"
    // InternalGoatComponentsParser.g:4137:1: rule__Update__Group_4__2 : rule__Update__Group_4__2__Impl rule__Update__Group_4__3 ;
    public final void rule__Update__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4141:1: ( rule__Update__Group_4__2__Impl rule__Update__Group_4__3 )
            // InternalGoatComponentsParser.g:4142:2: rule__Update__Group_4__2__Impl rule__Update__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__Update__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_4__3();

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
    // $ANTLR end "rule__Update__Group_4__2"


    // $ANTLR start "rule__Update__Group_4__2__Impl"
    // InternalGoatComponentsParser.g:4149:1: rule__Update__Group_4__2__Impl : ( ColonEqualsSign ) ;
    public final void rule__Update__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4153:1: ( ( ColonEqualsSign ) )
            // InternalGoatComponentsParser.g:4154:1: ( ColonEqualsSign )
            {
            // InternalGoatComponentsParser.g:4154:1: ( ColonEqualsSign )
            // InternalGoatComponentsParser.g:4155:2: ColonEqualsSign
            {
             before(grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_4_2()); 
            match(input,ColonEqualsSign,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_4_2()); 

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
    // $ANTLR end "rule__Update__Group_4__2__Impl"


    // $ANTLR start "rule__Update__Group_4__3"
    // InternalGoatComponentsParser.g:4164:1: rule__Update__Group_4__3 : rule__Update__Group_4__3__Impl ;
    public final void rule__Update__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4168:1: ( rule__Update__Group_4__3__Impl )
            // InternalGoatComponentsParser.g:4169:2: rule__Update__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group_4__3__Impl();

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
    // $ANTLR end "rule__Update__Group_4__3"


    // $ANTLR start "rule__Update__Group_4__3__Impl"
    // InternalGoatComponentsParser.g:4175:1: rule__Update__Group_4__3__Impl : ( ( rule__Update__ValsAssignment_4_3 ) ) ;
    public final void rule__Update__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4179:1: ( ( ( rule__Update__ValsAssignment_4_3 ) ) )
            // InternalGoatComponentsParser.g:4180:1: ( ( rule__Update__ValsAssignment_4_3 ) )
            {
            // InternalGoatComponentsParser.g:4180:1: ( ( rule__Update__ValsAssignment_4_3 ) )
            // InternalGoatComponentsParser.g:4181:2: ( rule__Update__ValsAssignment_4_3 )
            {
             before(grammarAccess.getUpdateAccess().getValsAssignment_4_3()); 
            // InternalGoatComponentsParser.g:4182:2: ( rule__Update__ValsAssignment_4_3 )
            // InternalGoatComponentsParser.g:4182:3: rule__Update__ValsAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Update__ValsAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getValsAssignment_4_3()); 

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
    // $ANTLR end "rule__Update__Group_4__3__Impl"


    // $ANTLR start "rule__Awareness__Group__0"
    // InternalGoatComponentsParser.g:4191:1: rule__Awareness__Group__0 : rule__Awareness__Group__0__Impl rule__Awareness__Group__1 ;
    public final void rule__Awareness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4195:1: ( rule__Awareness__Group__0__Impl rule__Awareness__Group__1 )
            // InternalGoatComponentsParser.g:4196:2: rule__Awareness__Group__0__Impl rule__Awareness__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Awareness__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Awareness__Group__1();

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
    // $ANTLR end "rule__Awareness__Group__0"


    // $ANTLR start "rule__Awareness__Group__0__Impl"
    // InternalGoatComponentsParser.g:4203:1: rule__Awareness__Group__0__Impl : ( Wait ) ;
    public final void rule__Awareness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4207:1: ( ( Wait ) )
            // InternalGoatComponentsParser.g:4208:1: ( Wait )
            {
            // InternalGoatComponentsParser.g:4208:1: ( Wait )
            // InternalGoatComponentsParser.g:4209:2: Wait
            {
             before(grammarAccess.getAwarenessAccess().getWaitKeyword_0()); 
            match(input,Wait,FOLLOW_2); 
             after(grammarAccess.getAwarenessAccess().getWaitKeyword_0()); 

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
    // $ANTLR end "rule__Awareness__Group__0__Impl"


    // $ANTLR start "rule__Awareness__Group__1"
    // InternalGoatComponentsParser.g:4218:1: rule__Awareness__Group__1 : rule__Awareness__Group__1__Impl rule__Awareness__Group__2 ;
    public final void rule__Awareness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4222:1: ( rule__Awareness__Group__1__Impl rule__Awareness__Group__2 )
            // InternalGoatComponentsParser.g:4223:2: rule__Awareness__Group__1__Impl rule__Awareness__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Awareness__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Awareness__Group__2();

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
    // $ANTLR end "rule__Awareness__Group__1"


    // $ANTLR start "rule__Awareness__Group__1__Impl"
    // InternalGoatComponentsParser.g:4230:1: rule__Awareness__Group__1__Impl : ( Until ) ;
    public final void rule__Awareness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4234:1: ( ( Until ) )
            // InternalGoatComponentsParser.g:4235:1: ( Until )
            {
            // InternalGoatComponentsParser.g:4235:1: ( Until )
            // InternalGoatComponentsParser.g:4236:2: Until
            {
             before(grammarAccess.getAwarenessAccess().getUntilKeyword_1()); 
            match(input,Until,FOLLOW_2); 
             after(grammarAccess.getAwarenessAccess().getUntilKeyword_1()); 

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
    // $ANTLR end "rule__Awareness__Group__1__Impl"


    // $ANTLR start "rule__Awareness__Group__2"
    // InternalGoatComponentsParser.g:4245:1: rule__Awareness__Group__2 : rule__Awareness__Group__2__Impl rule__Awareness__Group__3 ;
    public final void rule__Awareness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4249:1: ( rule__Awareness__Group__2__Impl rule__Awareness__Group__3 )
            // InternalGoatComponentsParser.g:4250:2: rule__Awareness__Group__2__Impl rule__Awareness__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Awareness__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Awareness__Group__3();

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
    // $ANTLR end "rule__Awareness__Group__2"


    // $ANTLR start "rule__Awareness__Group__2__Impl"
    // InternalGoatComponentsParser.g:4257:1: rule__Awareness__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Awareness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4261:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:4262:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:4262:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:4263:2: LeftParenthesis
            {
             before(grammarAccess.getAwarenessAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getAwarenessAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Awareness__Group__2__Impl"


    // $ANTLR start "rule__Awareness__Group__3"
    // InternalGoatComponentsParser.g:4272:1: rule__Awareness__Group__3 : rule__Awareness__Group__3__Impl rule__Awareness__Group__4 ;
    public final void rule__Awareness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4276:1: ( rule__Awareness__Group__3__Impl rule__Awareness__Group__4 )
            // InternalGoatComponentsParser.g:4277:2: rule__Awareness__Group__3__Impl rule__Awareness__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Awareness__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Awareness__Group__4();

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
    // $ANTLR end "rule__Awareness__Group__3"


    // $ANTLR start "rule__Awareness__Group__3__Impl"
    // InternalGoatComponentsParser.g:4284:1: rule__Awareness__Group__3__Impl : ( ( rule__Awareness__PredAssignment_3 ) ) ;
    public final void rule__Awareness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4288:1: ( ( ( rule__Awareness__PredAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:4289:1: ( ( rule__Awareness__PredAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:4289:1: ( ( rule__Awareness__PredAssignment_3 ) )
            // InternalGoatComponentsParser.g:4290:2: ( rule__Awareness__PredAssignment_3 )
            {
             before(grammarAccess.getAwarenessAccess().getPredAssignment_3()); 
            // InternalGoatComponentsParser.g:4291:2: ( rule__Awareness__PredAssignment_3 )
            // InternalGoatComponentsParser.g:4291:3: rule__Awareness__PredAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Awareness__PredAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAwarenessAccess().getPredAssignment_3()); 

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
    // $ANTLR end "rule__Awareness__Group__3__Impl"


    // $ANTLR start "rule__Awareness__Group__4"
    // InternalGoatComponentsParser.g:4299:1: rule__Awareness__Group__4 : rule__Awareness__Group__4__Impl ;
    public final void rule__Awareness__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4303:1: ( rule__Awareness__Group__4__Impl )
            // InternalGoatComponentsParser.g:4304:2: rule__Awareness__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Awareness__Group__4__Impl();

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
    // $ANTLR end "rule__Awareness__Group__4"


    // $ANTLR start "rule__Awareness__Group__4__Impl"
    // InternalGoatComponentsParser.g:4310:1: rule__Awareness__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Awareness__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4314:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:4315:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:4315:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:4316:2: RightParenthesis
            {
             before(grammarAccess.getAwarenessAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getAwarenessAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Awareness__Group__4__Impl"


    // $ANTLR start "rule__NZCProcess__Group_0__0"
    // InternalGoatComponentsParser.g:4326:1: rule__NZCProcess__Group_0__0 : rule__NZCProcess__Group_0__0__Impl rule__NZCProcess__Group_0__1 ;
    public final void rule__NZCProcess__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4330:1: ( rule__NZCProcess__Group_0__0__Impl rule__NZCProcess__Group_0__1 )
            // InternalGoatComponentsParser.g:4331:2: rule__NZCProcess__Group_0__0__Impl rule__NZCProcess__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__NZCProcess__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NZCProcess__Group_0__1();

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
    // $ANTLR end "rule__NZCProcess__Group_0__0"


    // $ANTLR start "rule__NZCProcess__Group_0__0__Impl"
    // InternalGoatComponentsParser.g:4338:1: rule__NZCProcess__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__NZCProcess__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4342:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:4343:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:4343:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:4344:2: LeftParenthesis
            {
             before(grammarAccess.getNZCProcessAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getNZCProcessAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__NZCProcess__Group_0__0__Impl"


    // $ANTLR start "rule__NZCProcess__Group_0__1"
    // InternalGoatComponentsParser.g:4353:1: rule__NZCProcess__Group_0__1 : rule__NZCProcess__Group_0__1__Impl rule__NZCProcess__Group_0__2 ;
    public final void rule__NZCProcess__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4357:1: ( rule__NZCProcess__Group_0__1__Impl rule__NZCProcess__Group_0__2 )
            // InternalGoatComponentsParser.g:4358:2: rule__NZCProcess__Group_0__1__Impl rule__NZCProcess__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__NZCProcess__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NZCProcess__Group_0__2();

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
    // $ANTLR end "rule__NZCProcess__Group_0__1"


    // $ANTLR start "rule__NZCProcess__Group_0__1__Impl"
    // InternalGoatComponentsParser.g:4365:1: rule__NZCProcess__Group_0__1__Impl : ( ruleProc ) ;
    public final void rule__NZCProcess__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4369:1: ( ( ruleProc ) )
            // InternalGoatComponentsParser.g:4370:1: ( ruleProc )
            {
            // InternalGoatComponentsParser.g:4370:1: ( ruleProc )
            // InternalGoatComponentsParser.g:4371:2: ruleProc
            {
             before(grammarAccess.getNZCProcessAccess().getProcParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleProc();

            state._fsp--;

             after(grammarAccess.getNZCProcessAccess().getProcParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__NZCProcess__Group_0__1__Impl"


    // $ANTLR start "rule__NZCProcess__Group_0__2"
    // InternalGoatComponentsParser.g:4380:1: rule__NZCProcess__Group_0__2 : rule__NZCProcess__Group_0__2__Impl ;
    public final void rule__NZCProcess__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4384:1: ( rule__NZCProcess__Group_0__2__Impl )
            // InternalGoatComponentsParser.g:4385:2: rule__NZCProcess__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NZCProcess__Group_0__2__Impl();

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
    // $ANTLR end "rule__NZCProcess__Group_0__2"


    // $ANTLR start "rule__NZCProcess__Group_0__2__Impl"
    // InternalGoatComponentsParser.g:4391:1: rule__NZCProcess__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__NZCProcess__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4395:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:4396:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:4396:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:4397:2: RightParenthesis
            {
             before(grammarAccess.getNZCProcessAccess().getRightParenthesisKeyword_0_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getNZCProcessAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__NZCProcess__Group_0__2__Impl"


    // $ANTLR start "rule__NProcess__Group_0__0"
    // InternalGoatComponentsParser.g:4407:1: rule__NProcess__Group_0__0 : rule__NProcess__Group_0__0__Impl rule__NProcess__Group_0__1 ;
    public final void rule__NProcess__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4411:1: ( rule__NProcess__Group_0__0__Impl rule__NProcess__Group_0__1 )
            // InternalGoatComponentsParser.g:4412:2: rule__NProcess__Group_0__0__Impl rule__NProcess__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__NProcess__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NProcess__Group_0__1();

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
    // $ANTLR end "rule__NProcess__Group_0__0"


    // $ANTLR start "rule__NProcess__Group_0__0__Impl"
    // InternalGoatComponentsParser.g:4419:1: rule__NProcess__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__NProcess__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4423:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:4424:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:4424:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:4425:2: LeftParenthesis
            {
             before(grammarAccess.getNProcessAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getNProcessAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__NProcess__Group_0__0__Impl"


    // $ANTLR start "rule__NProcess__Group_0__1"
    // InternalGoatComponentsParser.g:4434:1: rule__NProcess__Group_0__1 : rule__NProcess__Group_0__1__Impl rule__NProcess__Group_0__2 ;
    public final void rule__NProcess__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4438:1: ( rule__NProcess__Group_0__1__Impl rule__NProcess__Group_0__2 )
            // InternalGoatComponentsParser.g:4439:2: rule__NProcess__Group_0__1__Impl rule__NProcess__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__NProcess__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NProcess__Group_0__2();

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
    // $ANTLR end "rule__NProcess__Group_0__1"


    // $ANTLR start "rule__NProcess__Group_0__1__Impl"
    // InternalGoatComponentsParser.g:4446:1: rule__NProcess__Group_0__1__Impl : ( ruleProc ) ;
    public final void rule__NProcess__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4450:1: ( ( ruleProc ) )
            // InternalGoatComponentsParser.g:4451:1: ( ruleProc )
            {
            // InternalGoatComponentsParser.g:4451:1: ( ruleProc )
            // InternalGoatComponentsParser.g:4452:2: ruleProc
            {
             before(grammarAccess.getNProcessAccess().getProcParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleProc();

            state._fsp--;

             after(grammarAccess.getNProcessAccess().getProcParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__NProcess__Group_0__1__Impl"


    // $ANTLR start "rule__NProcess__Group_0__2"
    // InternalGoatComponentsParser.g:4461:1: rule__NProcess__Group_0__2 : rule__NProcess__Group_0__2__Impl ;
    public final void rule__NProcess__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4465:1: ( rule__NProcess__Group_0__2__Impl )
            // InternalGoatComponentsParser.g:4466:2: rule__NProcess__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NProcess__Group_0__2__Impl();

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
    // $ANTLR end "rule__NProcess__Group_0__2"


    // $ANTLR start "rule__NProcess__Group_0__2__Impl"
    // InternalGoatComponentsParser.g:4472:1: rule__NProcess__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__NProcess__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4476:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:4477:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:4477:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:4478:2: RightParenthesis
            {
             before(grammarAccess.getNProcessAccess().getRightParenthesisKeyword_0_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getNProcessAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__NProcess__Group_0__2__Impl"


    // $ANTLR start "rule__CallProcess__Group__0"
    // InternalGoatComponentsParser.g:4488:1: rule__CallProcess__Group__0 : rule__CallProcess__Group__0__Impl rule__CallProcess__Group__1 ;
    public final void rule__CallProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4492:1: ( rule__CallProcess__Group__0__Impl rule__CallProcess__Group__1 )
            // InternalGoatComponentsParser.g:4493:2: rule__CallProcess__Group__0__Impl rule__CallProcess__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CallProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcess__Group__1();

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
    // $ANTLR end "rule__CallProcess__Group__0"


    // $ANTLR start "rule__CallProcess__Group__0__Impl"
    // InternalGoatComponentsParser.g:4500:1: rule__CallProcess__Group__0__Impl : ( () ) ;
    public final void rule__CallProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4504:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4505:1: ( () )
            {
            // InternalGoatComponentsParser.g:4505:1: ( () )
            // InternalGoatComponentsParser.g:4506:2: ()
            {
             before(grammarAccess.getCallProcessAccess().getCallProcessAction_0()); 
            // InternalGoatComponentsParser.g:4507:2: ()
            // InternalGoatComponentsParser.g:4507:3: 
            {
            }

             after(grammarAccess.getCallProcessAccess().getCallProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcess__Group__0__Impl"


    // $ANTLR start "rule__CallProcess__Group__1"
    // InternalGoatComponentsParser.g:4515:1: rule__CallProcess__Group__1 : rule__CallProcess__Group__1__Impl ;
    public final void rule__CallProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4519:1: ( rule__CallProcess__Group__1__Impl )
            // InternalGoatComponentsParser.g:4520:2: rule__CallProcess__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallProcess__Group__1__Impl();

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
    // $ANTLR end "rule__CallProcess__Group__1"


    // $ANTLR start "rule__CallProcess__Group__1__Impl"
    // InternalGoatComponentsParser.g:4526:1: rule__CallProcess__Group__1__Impl : ( ( rule__CallProcess__ProcnameAssignment_1 ) ) ;
    public final void rule__CallProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4530:1: ( ( ( rule__CallProcess__ProcnameAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:4531:1: ( ( rule__CallProcess__ProcnameAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:4531:1: ( ( rule__CallProcess__ProcnameAssignment_1 ) )
            // InternalGoatComponentsParser.g:4532:2: ( rule__CallProcess__ProcnameAssignment_1 )
            {
             before(grammarAccess.getCallProcessAccess().getProcnameAssignment_1()); 
            // InternalGoatComponentsParser.g:4533:2: ( rule__CallProcess__ProcnameAssignment_1 )
            // InternalGoatComponentsParser.g:4533:3: rule__CallProcess__ProcnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CallProcess__ProcnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCallProcessAccess().getProcnameAssignment_1()); 

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
    // $ANTLR end "rule__CallProcess__Group__1__Impl"


    // $ANTLR start "rule__ZeroProcess__Group__0"
    // InternalGoatComponentsParser.g:4542:1: rule__ZeroProcess__Group__0 : rule__ZeroProcess__Group__0__Impl rule__ZeroProcess__Group__1 ;
    public final void rule__ZeroProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4546:1: ( rule__ZeroProcess__Group__0__Impl rule__ZeroProcess__Group__1 )
            // InternalGoatComponentsParser.g:4547:2: rule__ZeroProcess__Group__0__Impl rule__ZeroProcess__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ZeroProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZeroProcess__Group__1();

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
    // $ANTLR end "rule__ZeroProcess__Group__0"


    // $ANTLR start "rule__ZeroProcess__Group__0__Impl"
    // InternalGoatComponentsParser.g:4554:1: rule__ZeroProcess__Group__0__Impl : ( () ) ;
    public final void rule__ZeroProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4558:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4559:1: ( () )
            {
            // InternalGoatComponentsParser.g:4559:1: ( () )
            // InternalGoatComponentsParser.g:4560:2: ()
            {
             before(grammarAccess.getZeroProcessAccess().getZeroProcessAction_0()); 
            // InternalGoatComponentsParser.g:4561:2: ()
            // InternalGoatComponentsParser.g:4561:3: 
            {
            }

             after(grammarAccess.getZeroProcessAccess().getZeroProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroProcess__Group__0__Impl"


    // $ANTLR start "rule__ZeroProcess__Group__1"
    // InternalGoatComponentsParser.g:4569:1: rule__ZeroProcess__Group__1 : rule__ZeroProcess__Group__1__Impl ;
    public final void rule__ZeroProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4573:1: ( rule__ZeroProcess__Group__1__Impl )
            // InternalGoatComponentsParser.g:4574:2: rule__ZeroProcess__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ZeroProcess__Group__1__Impl();

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
    // $ANTLR end "rule__ZeroProcess__Group__1"


    // $ANTLR start "rule__ZeroProcess__Group__1__Impl"
    // InternalGoatComponentsParser.g:4580:1: rule__ZeroProcess__Group__1__Impl : ( Nil ) ;
    public final void rule__ZeroProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4584:1: ( ( Nil ) )
            // InternalGoatComponentsParser.g:4585:1: ( Nil )
            {
            // InternalGoatComponentsParser.g:4585:1: ( Nil )
            // InternalGoatComponentsParser.g:4586:2: Nil
            {
             before(grammarAccess.getZeroProcessAccess().getNilKeyword_1()); 
            match(input,Nil,FOLLOW_2); 
             after(grammarAccess.getZeroProcessAccess().getNilKeyword_1()); 

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
    // $ANTLR end "rule__ZeroProcess__Group__1__Impl"


    // $ANTLR start "rule__ProcessDefinition__Group__0"
    // InternalGoatComponentsParser.g:4596:1: rule__ProcessDefinition__Group__0 : rule__ProcessDefinition__Group__0__Impl rule__ProcessDefinition__Group__1 ;
    public final void rule__ProcessDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4600:1: ( rule__ProcessDefinition__Group__0__Impl rule__ProcessDefinition__Group__1 )
            // InternalGoatComponentsParser.g:4601:2: rule__ProcessDefinition__Group__0__Impl rule__ProcessDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ProcessDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessDefinition__Group__1();

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
    // $ANTLR end "rule__ProcessDefinition__Group__0"


    // $ANTLR start "rule__ProcessDefinition__Group__0__Impl"
    // InternalGoatComponentsParser.g:4608:1: rule__ProcessDefinition__Group__0__Impl : ( Proc ) ;
    public final void rule__ProcessDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4612:1: ( ( Proc ) )
            // InternalGoatComponentsParser.g:4613:1: ( Proc )
            {
            // InternalGoatComponentsParser.g:4613:1: ( Proc )
            // InternalGoatComponentsParser.g:4614:2: Proc
            {
             before(grammarAccess.getProcessDefinitionAccess().getProcKeyword_0()); 
            match(input,Proc,FOLLOW_2); 
             after(grammarAccess.getProcessDefinitionAccess().getProcKeyword_0()); 

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
    // $ANTLR end "rule__ProcessDefinition__Group__0__Impl"


    // $ANTLR start "rule__ProcessDefinition__Group__1"
    // InternalGoatComponentsParser.g:4623:1: rule__ProcessDefinition__Group__1 : rule__ProcessDefinition__Group__1__Impl rule__ProcessDefinition__Group__2 ;
    public final void rule__ProcessDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4627:1: ( rule__ProcessDefinition__Group__1__Impl rule__ProcessDefinition__Group__2 )
            // InternalGoatComponentsParser.g:4628:2: rule__ProcessDefinition__Group__1__Impl rule__ProcessDefinition__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__ProcessDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessDefinition__Group__2();

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
    // $ANTLR end "rule__ProcessDefinition__Group__1"


    // $ANTLR start "rule__ProcessDefinition__Group__1__Impl"
    // InternalGoatComponentsParser.g:4635:1: rule__ProcessDefinition__Group__1__Impl : ( ( rule__ProcessDefinition__NameAssignment_1 ) ) ;
    public final void rule__ProcessDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4639:1: ( ( ( rule__ProcessDefinition__NameAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:4640:1: ( ( rule__ProcessDefinition__NameAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:4640:1: ( ( rule__ProcessDefinition__NameAssignment_1 ) )
            // InternalGoatComponentsParser.g:4641:2: ( rule__ProcessDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getProcessDefinitionAccess().getNameAssignment_1()); 
            // InternalGoatComponentsParser.g:4642:2: ( rule__ProcessDefinition__NameAssignment_1 )
            // InternalGoatComponentsParser.g:4642:3: rule__ProcessDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProcessDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ProcessDefinition__Group__1__Impl"


    // $ANTLR start "rule__ProcessDefinition__Group__2"
    // InternalGoatComponentsParser.g:4650:1: rule__ProcessDefinition__Group__2 : rule__ProcessDefinition__Group__2__Impl rule__ProcessDefinition__Group__3 ;
    public final void rule__ProcessDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4654:1: ( rule__ProcessDefinition__Group__2__Impl rule__ProcessDefinition__Group__3 )
            // InternalGoatComponentsParser.g:4655:2: rule__ProcessDefinition__Group__2__Impl rule__ProcessDefinition__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ProcessDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessDefinition__Group__3();

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
    // $ANTLR end "rule__ProcessDefinition__Group__2"


    // $ANTLR start "rule__ProcessDefinition__Group__2__Impl"
    // InternalGoatComponentsParser.g:4662:1: rule__ProcessDefinition__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__ProcessDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4666:1: ( ( EqualsSign ) )
            // InternalGoatComponentsParser.g:4667:1: ( EqualsSign )
            {
            // InternalGoatComponentsParser.g:4667:1: ( EqualsSign )
            // InternalGoatComponentsParser.g:4668:2: EqualsSign
            {
             before(grammarAccess.getProcessDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getProcessDefinitionAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__ProcessDefinition__Group__2__Impl"


    // $ANTLR start "rule__ProcessDefinition__Group__3"
    // InternalGoatComponentsParser.g:4677:1: rule__ProcessDefinition__Group__3 : rule__ProcessDefinition__Group__3__Impl ;
    public final void rule__ProcessDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4681:1: ( rule__ProcessDefinition__Group__3__Impl )
            // InternalGoatComponentsParser.g:4682:2: rule__ProcessDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__ProcessDefinition__Group__3"


    // $ANTLR start "rule__ProcessDefinition__Group__3__Impl"
    // InternalGoatComponentsParser.g:4688:1: rule__ProcessDefinition__Group__3__Impl : ( ( rule__ProcessDefinition__ProcAssignment_3 ) ) ;
    public final void rule__ProcessDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4692:1: ( ( ( rule__ProcessDefinition__ProcAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:4693:1: ( ( rule__ProcessDefinition__ProcAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:4693:1: ( ( rule__ProcessDefinition__ProcAssignment_3 ) )
            // InternalGoatComponentsParser.g:4694:2: ( rule__ProcessDefinition__ProcAssignment_3 )
            {
             before(grammarAccess.getProcessDefinitionAccess().getProcAssignment_3()); 
            // InternalGoatComponentsParser.g:4695:2: ( rule__ProcessDefinition__ProcAssignment_3 )
            // InternalGoatComponentsParser.g:4695:3: rule__ProcessDefinition__ProcAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ProcessDefinition__ProcAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProcessDefinitionAccess().getProcAssignment_3()); 

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
    // $ANTLR end "rule__ProcessDefinition__Group__3__Impl"


    // $ANTLR start "rule__EnvInitValue__Group_0__0"
    // InternalGoatComponentsParser.g:4704:1: rule__EnvInitValue__Group_0__0 : rule__EnvInitValue__Group_0__0__Impl rule__EnvInitValue__Group_0__1 ;
    public final void rule__EnvInitValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4708:1: ( rule__EnvInitValue__Group_0__0__Impl rule__EnvInitValue__Group_0__1 )
            // InternalGoatComponentsParser.g:4709:2: rule__EnvInitValue__Group_0__0__Impl rule__EnvInitValue__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__EnvInitValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvInitValue__Group_0__1();

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
    // $ANTLR end "rule__EnvInitValue__Group_0__0"


    // $ANTLR start "rule__EnvInitValue__Group_0__0__Impl"
    // InternalGoatComponentsParser.g:4716:1: rule__EnvInitValue__Group_0__0__Impl : ( () ) ;
    public final void rule__EnvInitValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4720:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4721:1: ( () )
            {
            // InternalGoatComponentsParser.g:4721:1: ( () )
            // InternalGoatComponentsParser.g:4722:2: ()
            {
             before(grammarAccess.getEnvInitValueAccess().getIntConstantAction_0_0()); 
            // InternalGoatComponentsParser.g:4723:2: ()
            // InternalGoatComponentsParser.g:4723:3: 
            {
            }

             after(grammarAccess.getEnvInitValueAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvInitValue__Group_0__0__Impl"


    // $ANTLR start "rule__EnvInitValue__Group_0__1"
    // InternalGoatComponentsParser.g:4731:1: rule__EnvInitValue__Group_0__1 : rule__EnvInitValue__Group_0__1__Impl ;
    public final void rule__EnvInitValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4735:1: ( rule__EnvInitValue__Group_0__1__Impl )
            // InternalGoatComponentsParser.g:4736:2: rule__EnvInitValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvInitValue__Group_0__1__Impl();

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
    // $ANTLR end "rule__EnvInitValue__Group_0__1"


    // $ANTLR start "rule__EnvInitValue__Group_0__1__Impl"
    // InternalGoatComponentsParser.g:4742:1: rule__EnvInitValue__Group_0__1__Impl : ( ( rule__EnvInitValue__ValueAssignment_0_1 ) ) ;
    public final void rule__EnvInitValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4746:1: ( ( ( rule__EnvInitValue__ValueAssignment_0_1 ) ) )
            // InternalGoatComponentsParser.g:4747:1: ( ( rule__EnvInitValue__ValueAssignment_0_1 ) )
            {
            // InternalGoatComponentsParser.g:4747:1: ( ( rule__EnvInitValue__ValueAssignment_0_1 ) )
            // InternalGoatComponentsParser.g:4748:2: ( rule__EnvInitValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAssignment_0_1()); 
            // InternalGoatComponentsParser.g:4749:2: ( rule__EnvInitValue__ValueAssignment_0_1 )
            // InternalGoatComponentsParser.g:4749:3: rule__EnvInitValue__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvInitValue__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvInitValueAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__EnvInitValue__Group_0__1__Impl"


    // $ANTLR start "rule__EnvInitValue__Group_1__0"
    // InternalGoatComponentsParser.g:4758:1: rule__EnvInitValue__Group_1__0 : rule__EnvInitValue__Group_1__0__Impl rule__EnvInitValue__Group_1__1 ;
    public final void rule__EnvInitValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4762:1: ( rule__EnvInitValue__Group_1__0__Impl rule__EnvInitValue__Group_1__1 )
            // InternalGoatComponentsParser.g:4763:2: rule__EnvInitValue__Group_1__0__Impl rule__EnvInitValue__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__EnvInitValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvInitValue__Group_1__1();

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
    // $ANTLR end "rule__EnvInitValue__Group_1__0"


    // $ANTLR start "rule__EnvInitValue__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:4770:1: rule__EnvInitValue__Group_1__0__Impl : ( () ) ;
    public final void rule__EnvInitValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4774:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4775:1: ( () )
            {
            // InternalGoatComponentsParser.g:4775:1: ( () )
            // InternalGoatComponentsParser.g:4776:2: ()
            {
             before(grammarAccess.getEnvInitValueAccess().getStringConstantAction_1_0()); 
            // InternalGoatComponentsParser.g:4777:2: ()
            // InternalGoatComponentsParser.g:4777:3: 
            {
            }

             after(grammarAccess.getEnvInitValueAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvInitValue__Group_1__0__Impl"


    // $ANTLR start "rule__EnvInitValue__Group_1__1"
    // InternalGoatComponentsParser.g:4785:1: rule__EnvInitValue__Group_1__1 : rule__EnvInitValue__Group_1__1__Impl ;
    public final void rule__EnvInitValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4789:1: ( rule__EnvInitValue__Group_1__1__Impl )
            // InternalGoatComponentsParser.g:4790:2: rule__EnvInitValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvInitValue__Group_1__1__Impl();

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
    // $ANTLR end "rule__EnvInitValue__Group_1__1"


    // $ANTLR start "rule__EnvInitValue__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:4796:1: rule__EnvInitValue__Group_1__1__Impl : ( ( rule__EnvInitValue__ValueAssignment_1_1 ) ) ;
    public final void rule__EnvInitValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4800:1: ( ( ( rule__EnvInitValue__ValueAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:4801:1: ( ( rule__EnvInitValue__ValueAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:4801:1: ( ( rule__EnvInitValue__ValueAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:4802:2: ( rule__EnvInitValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAssignment_1_1()); 
            // InternalGoatComponentsParser.g:4803:2: ( rule__EnvInitValue__ValueAssignment_1_1 )
            // InternalGoatComponentsParser.g:4803:3: rule__EnvInitValue__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvInitValue__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvInitValueAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__EnvInitValue__Group_1__1__Impl"


    // $ANTLR start "rule__EnvInitValue__Group_2__0"
    // InternalGoatComponentsParser.g:4812:1: rule__EnvInitValue__Group_2__0 : rule__EnvInitValue__Group_2__0__Impl rule__EnvInitValue__Group_2__1 ;
    public final void rule__EnvInitValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4816:1: ( rule__EnvInitValue__Group_2__0__Impl rule__EnvInitValue__Group_2__1 )
            // InternalGoatComponentsParser.g:4817:2: rule__EnvInitValue__Group_2__0__Impl rule__EnvInitValue__Group_2__1
            {
            pushFollow(FOLLOW_40);
            rule__EnvInitValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvInitValue__Group_2__1();

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
    // $ANTLR end "rule__EnvInitValue__Group_2__0"


    // $ANTLR start "rule__EnvInitValue__Group_2__0__Impl"
    // InternalGoatComponentsParser.g:4824:1: rule__EnvInitValue__Group_2__0__Impl : ( () ) ;
    public final void rule__EnvInitValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4828:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4829:1: ( () )
            {
            // InternalGoatComponentsParser.g:4829:1: ( () )
            // InternalGoatComponentsParser.g:4830:2: ()
            {
             before(grammarAccess.getEnvInitValueAccess().getBoolConstantAction_2_0()); 
            // InternalGoatComponentsParser.g:4831:2: ()
            // InternalGoatComponentsParser.g:4831:3: 
            {
            }

             after(grammarAccess.getEnvInitValueAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvInitValue__Group_2__0__Impl"


    // $ANTLR start "rule__EnvInitValue__Group_2__1"
    // InternalGoatComponentsParser.g:4839:1: rule__EnvInitValue__Group_2__1 : rule__EnvInitValue__Group_2__1__Impl ;
    public final void rule__EnvInitValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4843:1: ( rule__EnvInitValue__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:4844:2: rule__EnvInitValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvInitValue__Group_2__1__Impl();

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
    // $ANTLR end "rule__EnvInitValue__Group_2__1"


    // $ANTLR start "rule__EnvInitValue__Group_2__1__Impl"
    // InternalGoatComponentsParser.g:4850:1: rule__EnvInitValue__Group_2__1__Impl : ( ( rule__EnvInitValue__ValueAssignment_2_1 ) ) ;
    public final void rule__EnvInitValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4854:1: ( ( ( rule__EnvInitValue__ValueAssignment_2_1 ) ) )
            // InternalGoatComponentsParser.g:4855:1: ( ( rule__EnvInitValue__ValueAssignment_2_1 ) )
            {
            // InternalGoatComponentsParser.g:4855:1: ( ( rule__EnvInitValue__ValueAssignment_2_1 ) )
            // InternalGoatComponentsParser.g:4856:2: ( rule__EnvInitValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAssignment_2_1()); 
            // InternalGoatComponentsParser.g:4857:2: ( rule__EnvInitValue__ValueAssignment_2_1 )
            // InternalGoatComponentsParser.g:4857:3: rule__EnvInitValue__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvInitValue__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvInitValueAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__EnvInitValue__Group_2__1__Impl"


    // $ANTLR start "rule__Environment__Group__0"
    // InternalGoatComponentsParser.g:4866:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4870:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalGoatComponentsParser.g:4871:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__1();

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
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalGoatComponentsParser.g:4878:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4882:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4883:1: ( () )
            {
            // InternalGoatComponentsParser.g:4883:1: ( () )
            // InternalGoatComponentsParser.g:4884:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalGoatComponentsParser.g:4885:2: ()
            // InternalGoatComponentsParser.g:4885:3: 
            {
            }

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalGoatComponentsParser.g:4893:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4897:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalGoatComponentsParser.g:4898:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__2();

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
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalGoatComponentsParser.g:4905:1: rule__Environment__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4909:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:4910:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:4910:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:4911:2: LeftCurlyBracket
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // InternalGoatComponentsParser.g:4920:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4924:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalGoatComponentsParser.g:4925:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__3();

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
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // InternalGoatComponentsParser.g:4932:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Group_2__0 )? ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4936:1: ( ( ( rule__Environment__Group_2__0 )? ) )
            // InternalGoatComponentsParser.g:4937:1: ( ( rule__Environment__Group_2__0 )? )
            {
            // InternalGoatComponentsParser.g:4937:1: ( ( rule__Environment__Group_2__0 )? )
            // InternalGoatComponentsParser.g:4938:2: ( rule__Environment__Group_2__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_2()); 
            // InternalGoatComponentsParser.g:4939:2: ( rule__Environment__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGoatComponentsParser.g:4939:3: rule__Environment__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // InternalGoatComponentsParser.g:4947:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4951:1: ( rule__Environment__Group__3__Impl )
            // InternalGoatComponentsParser.g:4952:2: rule__Environment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__3__Impl();

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
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // InternalGoatComponentsParser.g:4958:1: rule__Environment__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4962:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:4963:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:4963:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:4964:2: RightCurlyBracket
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group_2__0"
    // InternalGoatComponentsParser.g:4974:1: rule__Environment__Group_2__0 : rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1 ;
    public final void rule__Environment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4978:1: ( rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1 )
            // InternalGoatComponentsParser.g:4979:2: rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__Environment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_2__1();

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
    // $ANTLR end "rule__Environment__Group_2__0"


    // $ANTLR start "rule__Environment__Group_2__0__Impl"
    // InternalGoatComponentsParser.g:4986:1: rule__Environment__Group_2__0__Impl : ( ( rule__Environment__AttrsAssignment_2_0 ) ) ;
    public final void rule__Environment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4990:1: ( ( ( rule__Environment__AttrsAssignment_2_0 ) ) )
            // InternalGoatComponentsParser.g:4991:1: ( ( rule__Environment__AttrsAssignment_2_0 ) )
            {
            // InternalGoatComponentsParser.g:4991:1: ( ( rule__Environment__AttrsAssignment_2_0 ) )
            // InternalGoatComponentsParser.g:4992:2: ( rule__Environment__AttrsAssignment_2_0 )
            {
             before(grammarAccess.getEnvironmentAccess().getAttrsAssignment_2_0()); 
            // InternalGoatComponentsParser.g:4993:2: ( rule__Environment__AttrsAssignment_2_0 )
            // InternalGoatComponentsParser.g:4993:3: rule__Environment__AttrsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__AttrsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getAttrsAssignment_2_0()); 

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
    // $ANTLR end "rule__Environment__Group_2__0__Impl"


    // $ANTLR start "rule__Environment__Group_2__1"
    // InternalGoatComponentsParser.g:5001:1: rule__Environment__Group_2__1 : rule__Environment__Group_2__1__Impl rule__Environment__Group_2__2 ;
    public final void rule__Environment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5005:1: ( rule__Environment__Group_2__1__Impl rule__Environment__Group_2__2 )
            // InternalGoatComponentsParser.g:5006:2: rule__Environment__Group_2__1__Impl rule__Environment__Group_2__2
            {
            pushFollow(FOLLOW_42);
            rule__Environment__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_2__2();

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
    // $ANTLR end "rule__Environment__Group_2__1"


    // $ANTLR start "rule__Environment__Group_2__1__Impl"
    // InternalGoatComponentsParser.g:5013:1: rule__Environment__Group_2__1__Impl : ( ColonEqualsSign ) ;
    public final void rule__Environment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5017:1: ( ( ColonEqualsSign ) )
            // InternalGoatComponentsParser.g:5018:1: ( ColonEqualsSign )
            {
            // InternalGoatComponentsParser.g:5018:1: ( ColonEqualsSign )
            // InternalGoatComponentsParser.g:5019:2: ColonEqualsSign
            {
             before(grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_1()); 
            match(input,ColonEqualsSign,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__Environment__Group_2__1__Impl"


    // $ANTLR start "rule__Environment__Group_2__2"
    // InternalGoatComponentsParser.g:5028:1: rule__Environment__Group_2__2 : rule__Environment__Group_2__2__Impl rule__Environment__Group_2__3 ;
    public final void rule__Environment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5032:1: ( rule__Environment__Group_2__2__Impl rule__Environment__Group_2__3 )
            // InternalGoatComponentsParser.g:5033:2: rule__Environment__Group_2__2__Impl rule__Environment__Group_2__3
            {
            pushFollow(FOLLOW_21);
            rule__Environment__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_2__3();

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
    // $ANTLR end "rule__Environment__Group_2__2"


    // $ANTLR start "rule__Environment__Group_2__2__Impl"
    // InternalGoatComponentsParser.g:5040:1: rule__Environment__Group_2__2__Impl : ( ( rule__Environment__ValsAssignment_2_2 ) ) ;
    public final void rule__Environment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5044:1: ( ( ( rule__Environment__ValsAssignment_2_2 ) ) )
            // InternalGoatComponentsParser.g:5045:1: ( ( rule__Environment__ValsAssignment_2_2 ) )
            {
            // InternalGoatComponentsParser.g:5045:1: ( ( rule__Environment__ValsAssignment_2_2 ) )
            // InternalGoatComponentsParser.g:5046:2: ( rule__Environment__ValsAssignment_2_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getValsAssignment_2_2()); 
            // InternalGoatComponentsParser.g:5047:2: ( rule__Environment__ValsAssignment_2_2 )
            // InternalGoatComponentsParser.g:5047:3: rule__Environment__ValsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Environment__ValsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getValsAssignment_2_2()); 

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
    // $ANTLR end "rule__Environment__Group_2__2__Impl"


    // $ANTLR start "rule__Environment__Group_2__3"
    // InternalGoatComponentsParser.g:5055:1: rule__Environment__Group_2__3 : rule__Environment__Group_2__3__Impl ;
    public final void rule__Environment__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5059:1: ( rule__Environment__Group_2__3__Impl )
            // InternalGoatComponentsParser.g:5060:2: rule__Environment__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_2__3__Impl();

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
    // $ANTLR end "rule__Environment__Group_2__3"


    // $ANTLR start "rule__Environment__Group_2__3__Impl"
    // InternalGoatComponentsParser.g:5066:1: rule__Environment__Group_2__3__Impl : ( ( rule__Environment__Group_2_3__0 )* ) ;
    public final void rule__Environment__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5070:1: ( ( ( rule__Environment__Group_2_3__0 )* ) )
            // InternalGoatComponentsParser.g:5071:1: ( ( rule__Environment__Group_2_3__0 )* )
            {
            // InternalGoatComponentsParser.g:5071:1: ( ( rule__Environment__Group_2_3__0 )* )
            // InternalGoatComponentsParser.g:5072:2: ( rule__Environment__Group_2_3__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_2_3()); 
            // InternalGoatComponentsParser.g:5073:2: ( rule__Environment__Group_2_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:5073:3: rule__Environment__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Environment__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Environment__Group_2__3__Impl"


    // $ANTLR start "rule__Environment__Group_2_3__0"
    // InternalGoatComponentsParser.g:5082:1: rule__Environment__Group_2_3__0 : rule__Environment__Group_2_3__0__Impl rule__Environment__Group_2_3__1 ;
    public final void rule__Environment__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5086:1: ( rule__Environment__Group_2_3__0__Impl rule__Environment__Group_2_3__1 )
            // InternalGoatComponentsParser.g:5087:2: rule__Environment__Group_2_3__0__Impl rule__Environment__Group_2_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Environment__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_2_3__1();

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
    // $ANTLR end "rule__Environment__Group_2_3__0"


    // $ANTLR start "rule__Environment__Group_2_3__0__Impl"
    // InternalGoatComponentsParser.g:5094:1: rule__Environment__Group_2_3__0__Impl : ( Comma ) ;
    public final void rule__Environment__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5098:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:5099:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:5099:1: ( Comma )
            // InternalGoatComponentsParser.g:5100:2: Comma
            {
             before(grammarAccess.getEnvironmentAccess().getCommaKeyword_2_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getCommaKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Environment__Group_2_3__0__Impl"


    // $ANTLR start "rule__Environment__Group_2_3__1"
    // InternalGoatComponentsParser.g:5109:1: rule__Environment__Group_2_3__1 : rule__Environment__Group_2_3__1__Impl rule__Environment__Group_2_3__2 ;
    public final void rule__Environment__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5113:1: ( rule__Environment__Group_2_3__1__Impl rule__Environment__Group_2_3__2 )
            // InternalGoatComponentsParser.g:5114:2: rule__Environment__Group_2_3__1__Impl rule__Environment__Group_2_3__2
            {
            pushFollow(FOLLOW_35);
            rule__Environment__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_2_3__2();

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
    // $ANTLR end "rule__Environment__Group_2_3__1"


    // $ANTLR start "rule__Environment__Group_2_3__1__Impl"
    // InternalGoatComponentsParser.g:5121:1: rule__Environment__Group_2_3__1__Impl : ( ( rule__Environment__AttrsAssignment_2_3_1 ) ) ;
    public final void rule__Environment__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5125:1: ( ( ( rule__Environment__AttrsAssignment_2_3_1 ) ) )
            // InternalGoatComponentsParser.g:5126:1: ( ( rule__Environment__AttrsAssignment_2_3_1 ) )
            {
            // InternalGoatComponentsParser.g:5126:1: ( ( rule__Environment__AttrsAssignment_2_3_1 ) )
            // InternalGoatComponentsParser.g:5127:2: ( rule__Environment__AttrsAssignment_2_3_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getAttrsAssignment_2_3_1()); 
            // InternalGoatComponentsParser.g:5128:2: ( rule__Environment__AttrsAssignment_2_3_1 )
            // InternalGoatComponentsParser.g:5128:3: rule__Environment__AttrsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Environment__AttrsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getAttrsAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Environment__Group_2_3__1__Impl"


    // $ANTLR start "rule__Environment__Group_2_3__2"
    // InternalGoatComponentsParser.g:5136:1: rule__Environment__Group_2_3__2 : rule__Environment__Group_2_3__2__Impl rule__Environment__Group_2_3__3 ;
    public final void rule__Environment__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5140:1: ( rule__Environment__Group_2_3__2__Impl rule__Environment__Group_2_3__3 )
            // InternalGoatComponentsParser.g:5141:2: rule__Environment__Group_2_3__2__Impl rule__Environment__Group_2_3__3
            {
            pushFollow(FOLLOW_42);
            rule__Environment__Group_2_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_2_3__3();

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
    // $ANTLR end "rule__Environment__Group_2_3__2"


    // $ANTLR start "rule__Environment__Group_2_3__2__Impl"
    // InternalGoatComponentsParser.g:5148:1: rule__Environment__Group_2_3__2__Impl : ( ColonEqualsSign ) ;
    public final void rule__Environment__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5152:1: ( ( ColonEqualsSign ) )
            // InternalGoatComponentsParser.g:5153:1: ( ColonEqualsSign )
            {
            // InternalGoatComponentsParser.g:5153:1: ( ColonEqualsSign )
            // InternalGoatComponentsParser.g:5154:2: ColonEqualsSign
            {
             before(grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_3_2()); 
            match(input,ColonEqualsSign,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_3_2()); 

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
    // $ANTLR end "rule__Environment__Group_2_3__2__Impl"


    // $ANTLR start "rule__Environment__Group_2_3__3"
    // InternalGoatComponentsParser.g:5163:1: rule__Environment__Group_2_3__3 : rule__Environment__Group_2_3__3__Impl ;
    public final void rule__Environment__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5167:1: ( rule__Environment__Group_2_3__3__Impl )
            // InternalGoatComponentsParser.g:5168:2: rule__Environment__Group_2_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_2_3__3__Impl();

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
    // $ANTLR end "rule__Environment__Group_2_3__3"


    // $ANTLR start "rule__Environment__Group_2_3__3__Impl"
    // InternalGoatComponentsParser.g:5174:1: rule__Environment__Group_2_3__3__Impl : ( ( rule__Environment__ValsAssignment_2_3_3 ) ) ;
    public final void rule__Environment__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5178:1: ( ( ( rule__Environment__ValsAssignment_2_3_3 ) ) )
            // InternalGoatComponentsParser.g:5179:1: ( ( rule__Environment__ValsAssignment_2_3_3 ) )
            {
            // InternalGoatComponentsParser.g:5179:1: ( ( rule__Environment__ValsAssignment_2_3_3 ) )
            // InternalGoatComponentsParser.g:5180:2: ( rule__Environment__ValsAssignment_2_3_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getValsAssignment_2_3_3()); 
            // InternalGoatComponentsParser.g:5181:2: ( rule__Environment__ValsAssignment_2_3_3 )
            // InternalGoatComponentsParser.g:5181:3: rule__Environment__ValsAssignment_2_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Environment__ValsAssignment_2_3_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getValsAssignment_2_3_3()); 

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
    // $ANTLR end "rule__Environment__Group_2_3__3__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__0"
    // InternalGoatComponentsParser.g:5190:1: rule__ComponentDefinition__Group__0 : rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 ;
    public final void rule__ComponentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5194:1: ( rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 )
            // InternalGoatComponentsParser.g:5195:2: rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ComponentDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__1();

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
    // $ANTLR end "rule__ComponentDefinition__Group__0"


    // $ANTLR start "rule__ComponentDefinition__Group__0__Impl"
    // InternalGoatComponentsParser.g:5202:1: rule__ComponentDefinition__Group__0__Impl : ( Component ) ;
    public final void rule__ComponentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5206:1: ( ( Component ) )
            // InternalGoatComponentsParser.g:5207:1: ( Component )
            {
            // InternalGoatComponentsParser.g:5207:1: ( Component )
            // InternalGoatComponentsParser.g:5208:2: Component
            {
             before(grammarAccess.getComponentDefinitionAccess().getComponentKeyword_0()); 
            match(input,Component,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__ComponentDefinition__Group__0__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__1"
    // InternalGoatComponentsParser.g:5217:1: rule__ComponentDefinition__Group__1 : rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 ;
    public final void rule__ComponentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5221:1: ( rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 )
            // InternalGoatComponentsParser.g:5222:2: rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__2();

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
    // $ANTLR end "rule__ComponentDefinition__Group__1"


    // $ANTLR start "rule__ComponentDefinition__Group__1__Impl"
    // InternalGoatComponentsParser.g:5229:1: rule__ComponentDefinition__Group__1__Impl : ( ( rule__ComponentDefinition__EnvAssignment_1 ) ) ;
    public final void rule__ComponentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5233:1: ( ( ( rule__ComponentDefinition__EnvAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:5234:1: ( ( rule__ComponentDefinition__EnvAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:5234:1: ( ( rule__ComponentDefinition__EnvAssignment_1 ) )
            // InternalGoatComponentsParser.g:5235:2: ( rule__ComponentDefinition__EnvAssignment_1 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getEnvAssignment_1()); 
            // InternalGoatComponentsParser.g:5236:2: ( rule__ComponentDefinition__EnvAssignment_1 )
            // InternalGoatComponentsParser.g:5236:3: rule__ComponentDefinition__EnvAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__EnvAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getEnvAssignment_1()); 

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
    // $ANTLR end "rule__ComponentDefinition__Group__1__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__2"
    // InternalGoatComponentsParser.g:5244:1: rule__ComponentDefinition__Group__2 : rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 ;
    public final void rule__ComponentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5248:1: ( rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 )
            // InternalGoatComponentsParser.g:5249:2: rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__ComponentDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__3();

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
    // $ANTLR end "rule__ComponentDefinition__Group__2"


    // $ANTLR start "rule__ComponentDefinition__Group__2__Impl"
    // InternalGoatComponentsParser.g:5256:1: rule__ComponentDefinition__Group__2__Impl : ( ( rule__ComponentDefinition__ProcAssignment_2 ) ) ;
    public final void rule__ComponentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5260:1: ( ( ( rule__ComponentDefinition__ProcAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:5261:1: ( ( rule__ComponentDefinition__ProcAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:5261:1: ( ( rule__ComponentDefinition__ProcAssignment_2 ) )
            // InternalGoatComponentsParser.g:5262:2: ( rule__ComponentDefinition__ProcAssignment_2 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getProcAssignment_2()); 
            // InternalGoatComponentsParser.g:5263:2: ( rule__ComponentDefinition__ProcAssignment_2 )
            // InternalGoatComponentsParser.g:5263:3: rule__ComponentDefinition__ProcAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__ProcAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getProcAssignment_2()); 

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
    // $ANTLR end "rule__ComponentDefinition__Group__2__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__3"
    // InternalGoatComponentsParser.g:5271:1: rule__ComponentDefinition__Group__3 : rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 ;
    public final void rule__ComponentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5275:1: ( rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 )
            // InternalGoatComponentsParser.g:5276:2: rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__ComponentDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__4();

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
    // $ANTLR end "rule__ComponentDefinition__Group__3"


    // $ANTLR start "rule__ComponentDefinition__Group__3__Impl"
    // InternalGoatComponentsParser.g:5283:1: rule__ComponentDefinition__Group__3__Impl : ( At ) ;
    public final void rule__ComponentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5287:1: ( ( At ) )
            // InternalGoatComponentsParser.g:5288:1: ( At )
            {
            // InternalGoatComponentsParser.g:5288:1: ( At )
            // InternalGoatComponentsParser.g:5289:2: At
            {
             before(grammarAccess.getComponentDefinitionAccess().getAtKeyword_3()); 
            match(input,At,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getAtKeyword_3()); 

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
    // $ANTLR end "rule__ComponentDefinition__Group__3__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__4"
    // InternalGoatComponentsParser.g:5298:1: rule__ComponentDefinition__Group__4 : rule__ComponentDefinition__Group__4__Impl ;
    public final void rule__ComponentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5302:1: ( rule__ComponentDefinition__Group__4__Impl )
            // InternalGoatComponentsParser.g:5303:2: rule__ComponentDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__ComponentDefinition__Group__4"


    // $ANTLR start "rule__ComponentDefinition__Group__4__Impl"
    // InternalGoatComponentsParser.g:5309:1: rule__ComponentDefinition__Group__4__Impl : ( ( rule__ComponentDefinition__AddressAssignment_4 ) ) ;
    public final void rule__ComponentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5313:1: ( ( ( rule__ComponentDefinition__AddressAssignment_4 ) ) )
            // InternalGoatComponentsParser.g:5314:1: ( ( rule__ComponentDefinition__AddressAssignment_4 ) )
            {
            // InternalGoatComponentsParser.g:5314:1: ( ( rule__ComponentDefinition__AddressAssignment_4 ) )
            // InternalGoatComponentsParser.g:5315:2: ( rule__ComponentDefinition__AddressAssignment_4 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getAddressAssignment_4()); 
            // InternalGoatComponentsParser.g:5316:2: ( rule__ComponentDefinition__AddressAssignment_4 )
            // InternalGoatComponentsParser.g:5316:3: rule__ComponentDefinition__AddressAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__AddressAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getAddressAssignment_4()); 

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
    // $ANTLR end "rule__ComponentDefinition__Group__4__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalGoatComponentsParser.g:5325:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5329:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalGoatComponentsParser.g:5330:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalGoatComponentsParser.g:5337:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5341:1: ( ( ruleAnd ) )
            // InternalGoatComponentsParser.g:5342:1: ( ruleAnd )
            {
            // InternalGoatComponentsParser.g:5342:1: ( ruleAnd )
            // InternalGoatComponentsParser.g:5343:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalGoatComponentsParser.g:5352:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5356:1: ( rule__Or__Group__1__Impl )
            // InternalGoatComponentsParser.g:5357:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalGoatComponentsParser.g:5363:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )? ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5367:1: ( ( ( rule__Or__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5368:1: ( ( rule__Or__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5368:1: ( ( rule__Or__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5369:2: ( rule__Or__Group_1__0 )?
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5370:2: ( rule__Or__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==VerticalLineVerticalLine) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGoatComponentsParser.g:5370:3: rule__Or__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Or__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalGoatComponentsParser.g:5379:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5383:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalGoatComponentsParser.g:5384:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:5391:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5395:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5396:1: ( () )
            {
            // InternalGoatComponentsParser.g:5396:1: ( () )
            // InternalGoatComponentsParser.g:5397:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:5398:2: ()
            // InternalGoatComponentsParser.g:5398:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalGoatComponentsParser.g:5406:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5410:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalGoatComponentsParser.g:5411:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:5418:1: rule__Or__Group_1__1__Impl : ( VerticalLineVerticalLine ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5422:1: ( ( VerticalLineVerticalLine ) )
            // InternalGoatComponentsParser.g:5423:1: ( VerticalLineVerticalLine )
            {
            // InternalGoatComponentsParser.g:5423:1: ( VerticalLineVerticalLine )
            // InternalGoatComponentsParser.g:5424:2: VerticalLineVerticalLine
            {
             before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,VerticalLineVerticalLine,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalGoatComponentsParser.g:5433:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5437:1: ( rule__Or__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:5438:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalGoatComponentsParser.g:5444:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5448:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:5449:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:5449:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:5450:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:5451:2: ( rule__Or__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:5451:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalGoatComponentsParser.g:5460:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5464:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalGoatComponentsParser.g:5465:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalGoatComponentsParser.g:5472:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5476:1: ( ( ruleEquality ) )
            // InternalGoatComponentsParser.g:5477:1: ( ruleEquality )
            {
            // InternalGoatComponentsParser.g:5477:1: ( ruleEquality )
            // InternalGoatComponentsParser.g:5478:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalGoatComponentsParser.g:5487:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5491:1: ( rule__And__Group__1__Impl )
            // InternalGoatComponentsParser.g:5492:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalGoatComponentsParser.g:5498:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )? ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5502:1: ( ( ( rule__And__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5503:1: ( ( rule__And__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5503:1: ( ( rule__And__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5504:2: ( rule__And__Group_1__0 )?
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5505:2: ( rule__And__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==AmpersandAmpersand) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGoatComponentsParser.g:5505:3: rule__And__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndAccess().getGroup_1()); 

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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalGoatComponentsParser.g:5514:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5518:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalGoatComponentsParser.g:5519:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:5526:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5530:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5531:1: ( () )
            {
            // InternalGoatComponentsParser.g:5531:1: ( () )
            // InternalGoatComponentsParser.g:5532:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:5533:2: ()
            // InternalGoatComponentsParser.g:5533:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalGoatComponentsParser.g:5541:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5545:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalGoatComponentsParser.g:5546:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:5553:1: rule__And__Group_1__1__Impl : ( AmpersandAmpersand ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5557:1: ( ( AmpersandAmpersand ) )
            // InternalGoatComponentsParser.g:5558:1: ( AmpersandAmpersand )
            {
            // InternalGoatComponentsParser.g:5558:1: ( AmpersandAmpersand )
            // InternalGoatComponentsParser.g:5559:2: AmpersandAmpersand
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,AmpersandAmpersand,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 

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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalGoatComponentsParser.g:5568:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5572:1: ( rule__And__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:5573:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalGoatComponentsParser.g:5579:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5583:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:5584:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:5584:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:5585:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:5586:2: ( rule__And__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:5586:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalGoatComponentsParser.g:5595:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5599:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalGoatComponentsParser.g:5600:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalGoatComponentsParser.g:5607:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5611:1: ( ( ruleComparison ) )
            // InternalGoatComponentsParser.g:5612:1: ( ruleComparison )
            {
            // InternalGoatComponentsParser.g:5612:1: ( ruleComparison )
            // InternalGoatComponentsParser.g:5613:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

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
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalGoatComponentsParser.g:5622:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5626:1: ( rule__Equality__Group__1__Impl )
            // InternalGoatComponentsParser.g:5627:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalGoatComponentsParser.g:5633:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )? ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5637:1: ( ( ( rule__Equality__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5638:1: ( ( rule__Equality__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5638:1: ( ( rule__Equality__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5639:2: ( rule__Equality__Group_1__0 )?
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5640:2: ( rule__Equality__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ExclamationMarkEqualsSign||LA38_0==EqualsSignEqualsSign) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGoatComponentsParser.g:5640:3: rule__Equality__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalGoatComponentsParser.g:5649:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5653:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalGoatComponentsParser.g:5654:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:5661:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5665:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5666:1: ( () )
            {
            // InternalGoatComponentsParser.g:5666:1: ( () )
            // InternalGoatComponentsParser.g:5667:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:5668:2: ()
            // InternalGoatComponentsParser.g:5668:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalGoatComponentsParser.g:5676:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5680:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalGoatComponentsParser.g:5681:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:5688:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5692:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:5693:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:5693:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:5694:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalGoatComponentsParser.g:5695:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalGoatComponentsParser.g:5695:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalGoatComponentsParser.g:5703:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5707:1: ( rule__Equality__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:5708:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalGoatComponentsParser.g:5714:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5718:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:5719:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:5719:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:5720:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:5721:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:5721:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalGoatComponentsParser.g:5730:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5734:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalGoatComponentsParser.g:5735:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalGoatComponentsParser.g:5742:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5746:1: ( ( rulePlusOrMinus ) )
            // InternalGoatComponentsParser.g:5747:1: ( rulePlusOrMinus )
            {
            // InternalGoatComponentsParser.g:5747:1: ( rulePlusOrMinus )
            // InternalGoatComponentsParser.g:5748:2: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalGoatComponentsParser.g:5757:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5761:1: ( rule__Comparison__Group__1__Impl )
            // InternalGoatComponentsParser.g:5762:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalGoatComponentsParser.g:5768:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )? ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5772:1: ( ( ( rule__Comparison__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5773:1: ( ( rule__Comparison__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5773:1: ( ( rule__Comparison__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5774:2: ( rule__Comparison__Group_1__0 )?
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5775:2: ( rule__Comparison__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==LessThanSignEqualsSign||LA39_0==GreaterThanSignEqualsSign||LA39_0==LessThanSign||LA39_0==GreaterThanSign) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGoatComponentsParser.g:5775:3: rule__Comparison__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalGoatComponentsParser.g:5784:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5788:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalGoatComponentsParser.g:5789:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:5796:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5800:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5801:1: ( () )
            {
            // InternalGoatComponentsParser.g:5801:1: ( () )
            // InternalGoatComponentsParser.g:5802:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:5803:2: ()
            // InternalGoatComponentsParser.g:5803:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalGoatComponentsParser.g:5811:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5815:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalGoatComponentsParser.g:5816:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:5823:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5827:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:5828:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:5828:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:5829:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalGoatComponentsParser.g:5830:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalGoatComponentsParser.g:5830:3: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalGoatComponentsParser.g:5838:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5842:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:5843:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalGoatComponentsParser.g:5849:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5853:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:5854:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:5854:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:5855:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:5856:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:5856:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalGoatComponentsParser.g:5865:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5869:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalGoatComponentsParser.g:5870:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalGoatComponentsParser.g:5877:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5881:1: ( ( ruleMulOrDiv ) )
            // InternalGoatComponentsParser.g:5882:1: ( ruleMulOrDiv )
            {
            // InternalGoatComponentsParser.g:5882:1: ( ruleMulOrDiv )
            // InternalGoatComponentsParser.g:5883:2: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalGoatComponentsParser.g:5892:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5896:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalGoatComponentsParser.g:5897:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalGoatComponentsParser.g:5903:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )? ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5907:1: ( ( ( rule__PlusOrMinus__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5908:1: ( ( rule__PlusOrMinus__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5908:1: ( ( rule__PlusOrMinus__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5909:2: ( rule__PlusOrMinus__Group_1__0 )?
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5910:2: ( rule__PlusOrMinus__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==PlusSignPlusSign||LA40_0==PlusSign||LA40_0==HyphenMinus) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGoatComponentsParser.g:5910:3: rule__PlusOrMinus__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalGoatComponentsParser.g:5919:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5923:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalGoatComponentsParser.g:5924:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:5931:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5935:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalGoatComponentsParser.g:5936:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalGoatComponentsParser.g:5936:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalGoatComponentsParser.g:5937:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalGoatComponentsParser.g:5938:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalGoatComponentsParser.g:5938:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalGoatComponentsParser.g:5946:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5950:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalGoatComponentsParser.g:5951:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:5957:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5961:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:5962:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:5962:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:5963:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalGoatComponentsParser.g:5964:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalGoatComponentsParser.g:5964:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalGoatComponentsParser.g:5973:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5977:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalGoatComponentsParser.g:5978:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_12);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalGoatComponentsParser.g:5985:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5989:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5990:1: ( () )
            {
            // InternalGoatComponentsParser.g:5990:1: ( () )
            // InternalGoatComponentsParser.g:5991:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalGoatComponentsParser.g:5992:2: ()
            // InternalGoatComponentsParser.g:5992:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalGoatComponentsParser.g:6000:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6004:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalGoatComponentsParser.g:6005:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalGoatComponentsParser.g:6011:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( PlusSign ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6015:1: ( ( PlusSign ) )
            // InternalGoatComponentsParser.g:6016:1: ( PlusSign )
            {
            // InternalGoatComponentsParser.g:6016:1: ( PlusSign )
            // InternalGoatComponentsParser.g:6017:2: PlusSign
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,PlusSign,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalGoatComponentsParser.g:6027:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6031:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalGoatComponentsParser.g:6032:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_49);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalGoatComponentsParser.g:6039:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6043:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6044:1: ( () )
            {
            // InternalGoatComponentsParser.g:6044:1: ( () )
            // InternalGoatComponentsParser.g:6045:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalGoatComponentsParser.g:6046:2: ()
            // InternalGoatComponentsParser.g:6046:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalGoatComponentsParser.g:6054:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6058:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalGoatComponentsParser.g:6059:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalGoatComponentsParser.g:6065:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6069:1: ( ( HyphenMinus ) )
            // InternalGoatComponentsParser.g:6070:1: ( HyphenMinus )
            {
            // InternalGoatComponentsParser.g:6070:1: ( HyphenMinus )
            // InternalGoatComponentsParser.g:6071:2: HyphenMinus
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_2__0"
    // InternalGoatComponentsParser.g:6081:1: rule__PlusOrMinus__Group_1_0_2__0 : rule__PlusOrMinus__Group_1_0_2__0__Impl rule__PlusOrMinus__Group_1_0_2__1 ;
    public final void rule__PlusOrMinus__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6085:1: ( rule__PlusOrMinus__Group_1_0_2__0__Impl rule__PlusOrMinus__Group_1_0_2__1 )
            // InternalGoatComponentsParser.g:6086:2: rule__PlusOrMinus__Group_1_0_2__0__Impl rule__PlusOrMinus__Group_1_0_2__1
            {
            pushFollow(FOLLOW_48);
            rule__PlusOrMinus__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_2__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_2__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_2__0__Impl"
    // InternalGoatComponentsParser.g:6093:1: rule__PlusOrMinus__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6097:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6098:1: ( () )
            {
            // InternalGoatComponentsParser.g:6098:1: ( () )
            // InternalGoatComponentsParser.g:6099:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getConcatenateLeftAction_1_0_2_0()); 
            // InternalGoatComponentsParser.g:6100:2: ()
            // InternalGoatComponentsParser.g:6100:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getConcatenateLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_2__1"
    // InternalGoatComponentsParser.g:6108:1: rule__PlusOrMinus__Group_1_0_2__1 : rule__PlusOrMinus__Group_1_0_2__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6112:1: ( rule__PlusOrMinus__Group_1_0_2__1__Impl )
            // InternalGoatComponentsParser.g:6113:2: rule__PlusOrMinus__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_2__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_2__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_2__1__Impl"
    // InternalGoatComponentsParser.g:6119:1: rule__PlusOrMinus__Group_1_0_2__1__Impl : ( PlusSignPlusSign ) ;
    public final void rule__PlusOrMinus__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6123:1: ( ( PlusSignPlusSign ) )
            // InternalGoatComponentsParser.g:6124:1: ( PlusSignPlusSign )
            {
            // InternalGoatComponentsParser.g:6124:1: ( PlusSignPlusSign )
            // InternalGoatComponentsParser.g:6125:2: PlusSignPlusSign
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignPlusSignKeyword_1_0_2_1()); 
            match(input,PlusSignPlusSign,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignPlusSignKeyword_1_0_2_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalGoatComponentsParser.g:6135:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6139:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalGoatComponentsParser.g:6140:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalGoatComponentsParser.g:6147:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6151:1: ( ( rulePrimary ) )
            // InternalGoatComponentsParser.g:6152:1: ( rulePrimary )
            {
            // InternalGoatComponentsParser.g:6152:1: ( rulePrimary )
            // InternalGoatComponentsParser.g:6153:2: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalGoatComponentsParser.g:6162:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6166:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalGoatComponentsParser.g:6167:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalGoatComponentsParser.g:6173:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )? ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6177:1: ( ( ( rule__MulOrDiv__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:6178:1: ( ( rule__MulOrDiv__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:6178:1: ( ( rule__MulOrDiv__Group_1__0 )? )
            // InternalGoatComponentsParser.g:6179:2: ( rule__MulOrDiv__Group_1__0 )?
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:6180:2: ( rule__MulOrDiv__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Asterisk||LA41_0==Solidus) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGoatComponentsParser.g:6180:3: rule__MulOrDiv__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalGoatComponentsParser.g:6189:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6193:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalGoatComponentsParser.g:6194:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_50);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:6201:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6205:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6206:1: ( () )
            {
            // InternalGoatComponentsParser.g:6206:1: ( () )
            // InternalGoatComponentsParser.g:6207:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:6208:2: ()
            // InternalGoatComponentsParser.g:6208:3: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalGoatComponentsParser.g:6216:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6220:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalGoatComponentsParser.g:6221:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:6228:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6232:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:6233:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:6233:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:6234:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalGoatComponentsParser.g:6235:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalGoatComponentsParser.g:6235:3: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__2"
    // InternalGoatComponentsParser.g:6243:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6247:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:6248:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__2"


    // $ANTLR start "rule__MulOrDiv__Group_1__2__Impl"
    // InternalGoatComponentsParser.g:6254:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6258:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:6259:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:6259:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:6260:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:6261:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:6261:3: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalGoatComponentsParser.g:6270:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6274:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalGoatComponentsParser.g:6275:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalGoatComponentsParser.g:6282:1: rule__Primary__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6286:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:6287:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:6287:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:6288:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalGoatComponentsParser.g:6297:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6301:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalGoatComponentsParser.g:6302:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalGoatComponentsParser.g:6309:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6313:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:6314:1: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:6314:1: ( ruleExpression )
            // InternalGoatComponentsParser.g:6315:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalGoatComponentsParser.g:6324:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6328:1: ( rule__Primary__Group_0__2__Impl )
            // InternalGoatComponentsParser.g:6329:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalGoatComponentsParser.g:6335:1: rule__Primary__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6339:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:6340:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:6340:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:6341:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalGoatComponentsParser.g:6351:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6355:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalGoatComponentsParser.g:6356:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_51);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:6363:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6367:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6368:1: ( () )
            {
            // InternalGoatComponentsParser.g:6368:1: ( () )
            // InternalGoatComponentsParser.g:6369:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalGoatComponentsParser.g:6370:2: ()
            // InternalGoatComponentsParser.g:6370:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalGoatComponentsParser.g:6378:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6382:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalGoatComponentsParser.g:6383:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:6390:1: rule__Primary__Group_1__1__Impl : ( ExclamationMark ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6394:1: ( ( ExclamationMark ) )
            // InternalGoatComponentsParser.g:6395:1: ( ExclamationMark )
            {
            // InternalGoatComponentsParser.g:6395:1: ( ExclamationMark )
            // InternalGoatComponentsParser.g:6396:2: ExclamationMark
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,ExclamationMark,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalGoatComponentsParser.g:6405:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6409:1: ( rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 )
            // InternalGoatComponentsParser.g:6410:2: rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__3();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalGoatComponentsParser.g:6417:1: rule__Primary__Group_1__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6421:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:6422:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:6422:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:6423:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__3"
    // InternalGoatComponentsParser.g:6432:1: rule__Primary__Group_1__3 : rule__Primary__Group_1__3__Impl rule__Primary__Group_1__4 ;
    public final void rule__Primary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6436:1: ( rule__Primary__Group_1__3__Impl rule__Primary__Group_1__4 )
            // InternalGoatComponentsParser.g:6437:2: rule__Primary__Group_1__3__Impl rule__Primary__Group_1__4
            {
            pushFollow(FOLLOW_16);
            rule__Primary__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__4();

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
    // $ANTLR end "rule__Primary__Group_1__3"


    // $ANTLR start "rule__Primary__Group_1__3__Impl"
    // InternalGoatComponentsParser.g:6444:1: rule__Primary__Group_1__3__Impl : ( ( rule__Primary__ExpressionAssignment_1_3 ) ) ;
    public final void rule__Primary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6448:1: ( ( ( rule__Primary__ExpressionAssignment_1_3 ) ) )
            // InternalGoatComponentsParser.g:6449:1: ( ( rule__Primary__ExpressionAssignment_1_3 ) )
            {
            // InternalGoatComponentsParser.g:6449:1: ( ( rule__Primary__ExpressionAssignment_1_3 ) )
            // InternalGoatComponentsParser.g:6450:2: ( rule__Primary__ExpressionAssignment_1_3 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_3()); 
            // InternalGoatComponentsParser.g:6451:2: ( rule__Primary__ExpressionAssignment_1_3 )
            // InternalGoatComponentsParser.g:6451:3: rule__Primary__ExpressionAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_3()); 

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
    // $ANTLR end "rule__Primary__Group_1__3__Impl"


    // $ANTLR start "rule__Primary__Group_1__4"
    // InternalGoatComponentsParser.g:6459:1: rule__Primary__Group_1__4 : rule__Primary__Group_1__4__Impl ;
    public final void rule__Primary__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6463:1: ( rule__Primary__Group_1__4__Impl )
            // InternalGoatComponentsParser.g:6464:2: rule__Primary__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__4__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__4"


    // $ANTLR start "rule__Primary__Group_1__4__Impl"
    // InternalGoatComponentsParser.g:6470:1: rule__Primary__Group_1__4__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6474:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:6475:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:6475:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:6476:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_4()); 

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
    // $ANTLR end "rule__Primary__Group_1__4__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalGoatComponentsParser.g:6486:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6490:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalGoatComponentsParser.g:6491:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalGoatComponentsParser.g:6498:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6502:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6503:1: ( () )
            {
            // InternalGoatComponentsParser.g:6503:1: ( () )
            // InternalGoatComponentsParser.g:6504:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalGoatComponentsParser.g:6505:2: ()
            // InternalGoatComponentsParser.g:6505:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalGoatComponentsParser.g:6513:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6517:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalGoatComponentsParser.g:6518:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalGoatComponentsParser.g:6524:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6528:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalGoatComponentsParser.g:6529:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalGoatComponentsParser.g:6529:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalGoatComponentsParser.g:6530:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalGoatComponentsParser.g:6531:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalGoatComponentsParser.g:6531:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalGoatComponentsParser.g:6540:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6544:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalGoatComponentsParser.g:6545:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:6552:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6556:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6557:1: ( () )
            {
            // InternalGoatComponentsParser.g:6557:1: ( () )
            // InternalGoatComponentsParser.g:6558:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalGoatComponentsParser.g:6559:2: ()
            // InternalGoatComponentsParser.g:6559:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalGoatComponentsParser.g:6567:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6571:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalGoatComponentsParser.g:6572:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:6578:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6582:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:6583:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:6583:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:6584:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalGoatComponentsParser.g:6585:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalGoatComponentsParser.g:6585:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalGoatComponentsParser.g:6594:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6598:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalGoatComponentsParser.g:6599:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_40);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalGoatComponentsParser.g:6606:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6610:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6611:1: ( () )
            {
            // InternalGoatComponentsParser.g:6611:1: ( () )
            // InternalGoatComponentsParser.g:6612:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // InternalGoatComponentsParser.g:6613:2: ()
            // InternalGoatComponentsParser.g:6613:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalGoatComponentsParser.g:6621:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6625:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:6626:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalGoatComponentsParser.g:6632:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6636:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalGoatComponentsParser.g:6637:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalGoatComponentsParser.g:6637:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalGoatComponentsParser.g:6638:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalGoatComponentsParser.g:6639:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalGoatComponentsParser.g:6639:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalGoatComponentsParser.g:6648:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6652:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalGoatComponentsParser.g:6653:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalGoatComponentsParser.g:6660:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6664:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6665:1: ( () )
            {
            // InternalGoatComponentsParser.g:6665:1: ( () )
            // InternalGoatComponentsParser.g:6666:2: ()
            {
             before(grammarAccess.getAtomicAccess().getLocalVarRefAction_3_0()); 
            // InternalGoatComponentsParser.g:6667:2: ()
            // InternalGoatComponentsParser.g:6667:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getLocalVarRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalGoatComponentsParser.g:6675:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6679:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalGoatComponentsParser.g:6680:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalGoatComponentsParser.g:6686:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6690:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // InternalGoatComponentsParser.g:6691:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // InternalGoatComponentsParser.g:6691:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // InternalGoatComponentsParser.g:6692:2: ( rule__Atomic__RefAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            // InternalGoatComponentsParser.g:6693:2: ( rule__Atomic__RefAssignment_3_1 )
            // InternalGoatComponentsParser.g:6693:3: rule__Atomic__RefAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__RefAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 

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
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__0"
    // InternalGoatComponentsParser.g:6702:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6706:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalGoatComponentsParser.g:6707:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_52);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__1();

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
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // InternalGoatComponentsParser.g:6714:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6718:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6719:1: ( () )
            {
            // InternalGoatComponentsParser.g:6719:1: ( () )
            // InternalGoatComponentsParser.g:6720:2: ()
            {
             before(grammarAccess.getAtomicAccess().getLocalAttributeRefAction_4_0()); 
            // InternalGoatComponentsParser.g:6721:2: ()
            // InternalGoatComponentsParser.g:6721:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getLocalAttributeRefAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // InternalGoatComponentsParser.g:6729:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6733:1: ( rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 )
            // InternalGoatComponentsParser.g:6734:2: rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2
            {
            pushFollow(FOLLOW_53);
            rule__Atomic__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__2();

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
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // InternalGoatComponentsParser.g:6741:1: rule__Atomic__Group_4__1__Impl : ( Proc ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6745:1: ( ( Proc ) )
            // InternalGoatComponentsParser.g:6746:1: ( Proc )
            {
            // InternalGoatComponentsParser.g:6746:1: ( Proc )
            // InternalGoatComponentsParser.g:6747:2: Proc
            {
             before(grammarAccess.getAtomicAccess().getProcKeyword_4_1()); 
            match(input,Proc,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getProcKeyword_4_1()); 

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
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__2"
    // InternalGoatComponentsParser.g:6756:1: rule__Atomic__Group_4__2 : rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 ;
    public final void rule__Atomic__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6760:1: ( rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 )
            // InternalGoatComponentsParser.g:6761:2: rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Atomic__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__3();

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
    // $ANTLR end "rule__Atomic__Group_4__2"


    // $ANTLR start "rule__Atomic__Group_4__2__Impl"
    // InternalGoatComponentsParser.g:6768:1: rule__Atomic__Group_4__2__Impl : ( FullStop ) ;
    public final void rule__Atomic__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6772:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:6773:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:6773:1: ( FullStop )
            // InternalGoatComponentsParser.g:6774:2: FullStop
            {
             before(grammarAccess.getAtomicAccess().getFullStopKeyword_4_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getFullStopKeyword_4_2()); 

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
    // $ANTLR end "rule__Atomic__Group_4__2__Impl"


    // $ANTLR start "rule__Atomic__Group_4__3"
    // InternalGoatComponentsParser.g:6783:1: rule__Atomic__Group_4__3 : rule__Atomic__Group_4__3__Impl ;
    public final void rule__Atomic__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6787:1: ( rule__Atomic__Group_4__3__Impl )
            // InternalGoatComponentsParser.g:6788:2: rule__Atomic__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__3__Impl();

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
    // $ANTLR end "rule__Atomic__Group_4__3"


    // $ANTLR start "rule__Atomic__Group_4__3__Impl"
    // InternalGoatComponentsParser.g:6794:1: rule__Atomic__Group_4__3__Impl : ( ( rule__Atomic__AttributeAssignment_4_3 ) ) ;
    public final void rule__Atomic__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6798:1: ( ( ( rule__Atomic__AttributeAssignment_4_3 ) ) )
            // InternalGoatComponentsParser.g:6799:1: ( ( rule__Atomic__AttributeAssignment_4_3 ) )
            {
            // InternalGoatComponentsParser.g:6799:1: ( ( rule__Atomic__AttributeAssignment_4_3 ) )
            // InternalGoatComponentsParser.g:6800:2: ( rule__Atomic__AttributeAssignment_4_3 )
            {
             before(grammarAccess.getAtomicAccess().getAttributeAssignment_4_3()); 
            // InternalGoatComponentsParser.g:6801:2: ( rule__Atomic__AttributeAssignment_4_3 )
            // InternalGoatComponentsParser.g:6801:3: rule__Atomic__AttributeAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__AttributeAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAttributeAssignment_4_3()); 

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
    // $ANTLR end "rule__Atomic__Group_4__3__Impl"


    // $ANTLR start "rule__Atomic__Group_5__0"
    // InternalGoatComponentsParser.g:6810:1: rule__Atomic__Group_5__0 : rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 ;
    public final void rule__Atomic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6814:1: ( rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 )
            // InternalGoatComponentsParser.g:6815:2: rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Atomic__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__1();

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
    // $ANTLR end "rule__Atomic__Group_5__0"


    // $ANTLR start "rule__Atomic__Group_5__0__Impl"
    // InternalGoatComponentsParser.g:6822:1: rule__Atomic__Group_5__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6826:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6827:1: ( () )
            {
            // InternalGoatComponentsParser.g:6827:1: ( () )
            // InternalGoatComponentsParser.g:6828:2: ()
            {
             before(grammarAccess.getAtomicAccess().getFunctionCallAction_5_0()); 
            // InternalGoatComponentsParser.g:6829:2: ()
            // InternalGoatComponentsParser.g:6829:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getFunctionCallAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__0__Impl"


    // $ANTLR start "rule__Atomic__Group_5__1"
    // InternalGoatComponentsParser.g:6837:1: rule__Atomic__Group_5__1 : rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 ;
    public final void rule__Atomic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6841:1: ( rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 )
            // InternalGoatComponentsParser.g:6842:2: rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Atomic__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__2();

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
    // $ANTLR end "rule__Atomic__Group_5__1"


    // $ANTLR start "rule__Atomic__Group_5__1__Impl"
    // InternalGoatComponentsParser.g:6849:1: rule__Atomic__Group_5__1__Impl : ( ( rule__Atomic__FunctionAssignment_5_1 ) ) ;
    public final void rule__Atomic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6853:1: ( ( ( rule__Atomic__FunctionAssignment_5_1 ) ) )
            // InternalGoatComponentsParser.g:6854:1: ( ( rule__Atomic__FunctionAssignment_5_1 ) )
            {
            // InternalGoatComponentsParser.g:6854:1: ( ( rule__Atomic__FunctionAssignment_5_1 ) )
            // InternalGoatComponentsParser.g:6855:2: ( rule__Atomic__FunctionAssignment_5_1 )
            {
             before(grammarAccess.getAtomicAccess().getFunctionAssignment_5_1()); 
            // InternalGoatComponentsParser.g:6856:2: ( rule__Atomic__FunctionAssignment_5_1 )
            // InternalGoatComponentsParser.g:6856:3: rule__Atomic__FunctionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__FunctionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getFunctionAssignment_5_1()); 

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
    // $ANTLR end "rule__Atomic__Group_5__1__Impl"


    // $ANTLR start "rule__Atomic__Group_5__2"
    // InternalGoatComponentsParser.g:6864:1: rule__Atomic__Group_5__2 : rule__Atomic__Group_5__2__Impl rule__Atomic__Group_5__3 ;
    public final void rule__Atomic__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6868:1: ( rule__Atomic__Group_5__2__Impl rule__Atomic__Group_5__3 )
            // InternalGoatComponentsParser.g:6869:2: rule__Atomic__Group_5__2__Impl rule__Atomic__Group_5__3
            {
            pushFollow(FOLLOW_54);
            rule__Atomic__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__3();

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
    // $ANTLR end "rule__Atomic__Group_5__2"


    // $ANTLR start "rule__Atomic__Group_5__2__Impl"
    // InternalGoatComponentsParser.g:6876:1: rule__Atomic__Group_5__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Atomic__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6880:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:6881:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:6881:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:6882:2: LeftParenthesis
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_5_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_5_2()); 

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
    // $ANTLR end "rule__Atomic__Group_5__2__Impl"


    // $ANTLR start "rule__Atomic__Group_5__3"
    // InternalGoatComponentsParser.g:6891:1: rule__Atomic__Group_5__3 : rule__Atomic__Group_5__3__Impl rule__Atomic__Group_5__4 ;
    public final void rule__Atomic__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6895:1: ( rule__Atomic__Group_5__3__Impl rule__Atomic__Group_5__4 )
            // InternalGoatComponentsParser.g:6896:2: rule__Atomic__Group_5__3__Impl rule__Atomic__Group_5__4
            {
            pushFollow(FOLLOW_54);
            rule__Atomic__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__4();

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
    // $ANTLR end "rule__Atomic__Group_5__3"


    // $ANTLR start "rule__Atomic__Group_5__3__Impl"
    // InternalGoatComponentsParser.g:6903:1: rule__Atomic__Group_5__3__Impl : ( ( rule__Atomic__Group_5_3__0 )? ) ;
    public final void rule__Atomic__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6907:1: ( ( ( rule__Atomic__Group_5_3__0 )? ) )
            // InternalGoatComponentsParser.g:6908:1: ( ( rule__Atomic__Group_5_3__0 )? )
            {
            // InternalGoatComponentsParser.g:6908:1: ( ( rule__Atomic__Group_5_3__0 )? )
            // InternalGoatComponentsParser.g:6909:2: ( rule__Atomic__Group_5_3__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_5_3()); 
            // InternalGoatComponentsParser.g:6910:2: ( rule__Atomic__Group_5_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Receiver||LA42_0==False||LA42_0==Proc||(LA42_0>=This && LA42_0<=True)||(LA42_0>=ExclamationMark && LA42_0<=LeftParenthesis)||(LA42_0>=RULE_ID && LA42_0<=RULE_STRING)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGoatComponentsParser.g:6910:3: rule__Atomic__Group_5_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_5_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Atomic__Group_5__3__Impl"


    // $ANTLR start "rule__Atomic__Group_5__4"
    // InternalGoatComponentsParser.g:6918:1: rule__Atomic__Group_5__4 : rule__Atomic__Group_5__4__Impl ;
    public final void rule__Atomic__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6922:1: ( rule__Atomic__Group_5__4__Impl )
            // InternalGoatComponentsParser.g:6923:2: rule__Atomic__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__4__Impl();

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
    // $ANTLR end "rule__Atomic__Group_5__4"


    // $ANTLR start "rule__Atomic__Group_5__4__Impl"
    // InternalGoatComponentsParser.g:6929:1: rule__Atomic__Group_5__4__Impl : ( RightParenthesis ) ;
    public final void rule__Atomic__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6933:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:6934:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:6934:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:6935:2: RightParenthesis
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_5_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Atomic__Group_5__4__Impl"


    // $ANTLR start "rule__Atomic__Group_5_3__0"
    // InternalGoatComponentsParser.g:6945:1: rule__Atomic__Group_5_3__0 : rule__Atomic__Group_5_3__0__Impl rule__Atomic__Group_5_3__1 ;
    public final void rule__Atomic__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6949:1: ( rule__Atomic__Group_5_3__0__Impl rule__Atomic__Group_5_3__1 )
            // InternalGoatComponentsParser.g:6950:2: rule__Atomic__Group_5_3__0__Impl rule__Atomic__Group_5_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Atomic__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5_3__1();

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
    // $ANTLR end "rule__Atomic__Group_5_3__0"


    // $ANTLR start "rule__Atomic__Group_5_3__0__Impl"
    // InternalGoatComponentsParser.g:6957:1: rule__Atomic__Group_5_3__0__Impl : ( ( rule__Atomic__ParamsAssignment_5_3_0 ) ) ;
    public final void rule__Atomic__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6961:1: ( ( ( rule__Atomic__ParamsAssignment_5_3_0 ) ) )
            // InternalGoatComponentsParser.g:6962:1: ( ( rule__Atomic__ParamsAssignment_5_3_0 ) )
            {
            // InternalGoatComponentsParser.g:6962:1: ( ( rule__Atomic__ParamsAssignment_5_3_0 ) )
            // InternalGoatComponentsParser.g:6963:2: ( rule__Atomic__ParamsAssignment_5_3_0 )
            {
             before(grammarAccess.getAtomicAccess().getParamsAssignment_5_3_0()); 
            // InternalGoatComponentsParser.g:6964:2: ( rule__Atomic__ParamsAssignment_5_3_0 )
            // InternalGoatComponentsParser.g:6964:3: rule__Atomic__ParamsAssignment_5_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ParamsAssignment_5_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getParamsAssignment_5_3_0()); 

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
    // $ANTLR end "rule__Atomic__Group_5_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_5_3__1"
    // InternalGoatComponentsParser.g:6972:1: rule__Atomic__Group_5_3__1 : rule__Atomic__Group_5_3__1__Impl ;
    public final void rule__Atomic__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6976:1: ( rule__Atomic__Group_5_3__1__Impl )
            // InternalGoatComponentsParser.g:6977:2: rule__Atomic__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_5_3__1"


    // $ANTLR start "rule__Atomic__Group_5_3__1__Impl"
    // InternalGoatComponentsParser.g:6983:1: rule__Atomic__Group_5_3__1__Impl : ( ( rule__Atomic__Group_5_3_1__0 )* ) ;
    public final void rule__Atomic__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6987:1: ( ( ( rule__Atomic__Group_5_3_1__0 )* ) )
            // InternalGoatComponentsParser.g:6988:1: ( ( rule__Atomic__Group_5_3_1__0 )* )
            {
            // InternalGoatComponentsParser.g:6988:1: ( ( rule__Atomic__Group_5_3_1__0 )* )
            // InternalGoatComponentsParser.g:6989:2: ( rule__Atomic__Group_5_3_1__0 )*
            {
             before(grammarAccess.getAtomicAccess().getGroup_5_3_1()); 
            // InternalGoatComponentsParser.g:6990:2: ( rule__Atomic__Group_5_3_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==Comma) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:6990:3: rule__Atomic__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Atomic__Group_5_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getAtomicAccess().getGroup_5_3_1()); 

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
    // $ANTLR end "rule__Atomic__Group_5_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_5_3_1__0"
    // InternalGoatComponentsParser.g:6999:1: rule__Atomic__Group_5_3_1__0 : rule__Atomic__Group_5_3_1__0__Impl rule__Atomic__Group_5_3_1__1 ;
    public final void rule__Atomic__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7003:1: ( rule__Atomic__Group_5_3_1__0__Impl rule__Atomic__Group_5_3_1__1 )
            // InternalGoatComponentsParser.g:7004:2: rule__Atomic__Group_5_3_1__0__Impl rule__Atomic__Group_5_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Atomic__Group_5_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5_3_1__1();

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
    // $ANTLR end "rule__Atomic__Group_5_3_1__0"


    // $ANTLR start "rule__Atomic__Group_5_3_1__0__Impl"
    // InternalGoatComponentsParser.g:7011:1: rule__Atomic__Group_5_3_1__0__Impl : ( Comma ) ;
    public final void rule__Atomic__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7015:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:7016:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:7016:1: ( Comma )
            // InternalGoatComponentsParser.g:7017:2: Comma
            {
             before(grammarAccess.getAtomicAccess().getCommaKeyword_5_3_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getCommaKeyword_5_3_1_0()); 

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
    // $ANTLR end "rule__Atomic__Group_5_3_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_5_3_1__1"
    // InternalGoatComponentsParser.g:7026:1: rule__Atomic__Group_5_3_1__1 : rule__Atomic__Group_5_3_1__1__Impl ;
    public final void rule__Atomic__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7030:1: ( rule__Atomic__Group_5_3_1__1__Impl )
            // InternalGoatComponentsParser.g:7031:2: rule__Atomic__Group_5_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5_3_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_5_3_1__1"


    // $ANTLR start "rule__Atomic__Group_5_3_1__1__Impl"
    // InternalGoatComponentsParser.g:7037:1: rule__Atomic__Group_5_3_1__1__Impl : ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) ) ;
    public final void rule__Atomic__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7041:1: ( ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) ) )
            // InternalGoatComponentsParser.g:7042:1: ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) )
            {
            // InternalGoatComponentsParser.g:7042:1: ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) )
            // InternalGoatComponentsParser.g:7043:2: ( rule__Atomic__ParamsAssignment_5_3_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getParamsAssignment_5_3_1_1()); 
            // InternalGoatComponentsParser.g:7044:2: ( rule__Atomic__ParamsAssignment_5_3_1_1 )
            // InternalGoatComponentsParser.g:7044:3: rule__Atomic__ParamsAssignment_5_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ParamsAssignment_5_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getParamsAssignment_5_3_1_1()); 

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
    // $ANTLR end "rule__Atomic__Group_5_3_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_6__0"
    // InternalGoatComponentsParser.g:7053:1: rule__Atomic__Group_6__0 : rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 ;
    public final void rule__Atomic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7057:1: ( rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 )
            // InternalGoatComponentsParser.g:7058:2: rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1
            {
            pushFollow(FOLLOW_55);
            rule__Atomic__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_6__1();

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
    // $ANTLR end "rule__Atomic__Group_6__0"


    // $ANTLR start "rule__Atomic__Group_6__0__Impl"
    // InternalGoatComponentsParser.g:7065:1: rule__Atomic__Group_6__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7069:1: ( ( () ) )
            // InternalGoatComponentsParser.g:7070:1: ( () )
            {
            // InternalGoatComponentsParser.g:7070:1: ( () )
            // InternalGoatComponentsParser.g:7071:2: ()
            {
             before(grammarAccess.getAtomicAccess().getComponentAttributeRefAction_6_0()); 
            // InternalGoatComponentsParser.g:7072:2: ()
            // InternalGoatComponentsParser.g:7072:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getComponentAttributeRefAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_6__0__Impl"


    // $ANTLR start "rule__Atomic__Group_6__1"
    // InternalGoatComponentsParser.g:7080:1: rule__Atomic__Group_6__1 : rule__Atomic__Group_6__1__Impl rule__Atomic__Group_6__2 ;
    public final void rule__Atomic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7084:1: ( rule__Atomic__Group_6__1__Impl rule__Atomic__Group_6__2 )
            // InternalGoatComponentsParser.g:7085:2: rule__Atomic__Group_6__1__Impl rule__Atomic__Group_6__2
            {
            pushFollow(FOLLOW_53);
            rule__Atomic__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_6__2();

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
    // $ANTLR end "rule__Atomic__Group_6__1"


    // $ANTLR start "rule__Atomic__Group_6__1__Impl"
    // InternalGoatComponentsParser.g:7092:1: rule__Atomic__Group_6__1__Impl : ( This ) ;
    public final void rule__Atomic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7096:1: ( ( This ) )
            // InternalGoatComponentsParser.g:7097:1: ( This )
            {
            // InternalGoatComponentsParser.g:7097:1: ( This )
            // InternalGoatComponentsParser.g:7098:2: This
            {
             before(grammarAccess.getAtomicAccess().getThisKeyword_6_1()); 
            match(input,This,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getThisKeyword_6_1()); 

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
    // $ANTLR end "rule__Atomic__Group_6__1__Impl"


    // $ANTLR start "rule__Atomic__Group_6__2"
    // InternalGoatComponentsParser.g:7107:1: rule__Atomic__Group_6__2 : rule__Atomic__Group_6__2__Impl rule__Atomic__Group_6__3 ;
    public final void rule__Atomic__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7111:1: ( rule__Atomic__Group_6__2__Impl rule__Atomic__Group_6__3 )
            // InternalGoatComponentsParser.g:7112:2: rule__Atomic__Group_6__2__Impl rule__Atomic__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__Atomic__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_6__3();

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
    // $ANTLR end "rule__Atomic__Group_6__2"


    // $ANTLR start "rule__Atomic__Group_6__2__Impl"
    // InternalGoatComponentsParser.g:7119:1: rule__Atomic__Group_6__2__Impl : ( FullStop ) ;
    public final void rule__Atomic__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7123:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:7124:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:7124:1: ( FullStop )
            // InternalGoatComponentsParser.g:7125:2: FullStop
            {
             before(grammarAccess.getAtomicAccess().getFullStopKeyword_6_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getFullStopKeyword_6_2()); 

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
    // $ANTLR end "rule__Atomic__Group_6__2__Impl"


    // $ANTLR start "rule__Atomic__Group_6__3"
    // InternalGoatComponentsParser.g:7134:1: rule__Atomic__Group_6__3 : rule__Atomic__Group_6__3__Impl ;
    public final void rule__Atomic__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7138:1: ( rule__Atomic__Group_6__3__Impl )
            // InternalGoatComponentsParser.g:7139:2: rule__Atomic__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_6__3__Impl();

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
    // $ANTLR end "rule__Atomic__Group_6__3"


    // $ANTLR start "rule__Atomic__Group_6__3__Impl"
    // InternalGoatComponentsParser.g:7145:1: rule__Atomic__Group_6__3__Impl : ( ( rule__Atomic__AttributeAssignment_6_3 ) ) ;
    public final void rule__Atomic__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7149:1: ( ( ( rule__Atomic__AttributeAssignment_6_3 ) ) )
            // InternalGoatComponentsParser.g:7150:1: ( ( rule__Atomic__AttributeAssignment_6_3 ) )
            {
            // InternalGoatComponentsParser.g:7150:1: ( ( rule__Atomic__AttributeAssignment_6_3 ) )
            // InternalGoatComponentsParser.g:7151:2: ( rule__Atomic__AttributeAssignment_6_3 )
            {
             before(grammarAccess.getAtomicAccess().getAttributeAssignment_6_3()); 
            // InternalGoatComponentsParser.g:7152:2: ( rule__Atomic__AttributeAssignment_6_3 )
            // InternalGoatComponentsParser.g:7152:3: rule__Atomic__AttributeAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__AttributeAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAttributeAssignment_6_3()); 

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
    // $ANTLR end "rule__Atomic__Group_6__3__Impl"


    // $ANTLR start "rule__Atomic__Group_7__0"
    // InternalGoatComponentsParser.g:7161:1: rule__Atomic__Group_7__0 : rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 ;
    public final void rule__Atomic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7165:1: ( rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 )
            // InternalGoatComponentsParser.g:7166:2: rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Atomic__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_7__1();

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
    // $ANTLR end "rule__Atomic__Group_7__0"


    // $ANTLR start "rule__Atomic__Group_7__0__Impl"
    // InternalGoatComponentsParser.g:7173:1: rule__Atomic__Group_7__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7177:1: ( ( () ) )
            // InternalGoatComponentsParser.g:7178:1: ( () )
            {
            // InternalGoatComponentsParser.g:7178:1: ( () )
            // InternalGoatComponentsParser.g:7179:2: ()
            {
             before(grammarAccess.getAtomicAccess().getRecAttributeRefAction_7_0()); 
            // InternalGoatComponentsParser.g:7180:2: ()
            // InternalGoatComponentsParser.g:7180:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getRecAttributeRefAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_7__0__Impl"


    // $ANTLR start "rule__Atomic__Group_7__1"
    // InternalGoatComponentsParser.g:7188:1: rule__Atomic__Group_7__1 : rule__Atomic__Group_7__1__Impl rule__Atomic__Group_7__2 ;
    public final void rule__Atomic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7192:1: ( rule__Atomic__Group_7__1__Impl rule__Atomic__Group_7__2 )
            // InternalGoatComponentsParser.g:7193:2: rule__Atomic__Group_7__1__Impl rule__Atomic__Group_7__2
            {
            pushFollow(FOLLOW_53);
            rule__Atomic__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_7__2();

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
    // $ANTLR end "rule__Atomic__Group_7__1"


    // $ANTLR start "rule__Atomic__Group_7__1__Impl"
    // InternalGoatComponentsParser.g:7200:1: rule__Atomic__Group_7__1__Impl : ( Receiver ) ;
    public final void rule__Atomic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7204:1: ( ( Receiver ) )
            // InternalGoatComponentsParser.g:7205:1: ( Receiver )
            {
            // InternalGoatComponentsParser.g:7205:1: ( Receiver )
            // InternalGoatComponentsParser.g:7206:2: Receiver
            {
             before(grammarAccess.getAtomicAccess().getReceiverKeyword_7_1()); 
            match(input,Receiver,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getReceiverKeyword_7_1()); 

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
    // $ANTLR end "rule__Atomic__Group_7__1__Impl"


    // $ANTLR start "rule__Atomic__Group_7__2"
    // InternalGoatComponentsParser.g:7215:1: rule__Atomic__Group_7__2 : rule__Atomic__Group_7__2__Impl rule__Atomic__Group_7__3 ;
    public final void rule__Atomic__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7219:1: ( rule__Atomic__Group_7__2__Impl rule__Atomic__Group_7__3 )
            // InternalGoatComponentsParser.g:7220:2: rule__Atomic__Group_7__2__Impl rule__Atomic__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__Atomic__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_7__3();

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
    // $ANTLR end "rule__Atomic__Group_7__2"


    // $ANTLR start "rule__Atomic__Group_7__2__Impl"
    // InternalGoatComponentsParser.g:7227:1: rule__Atomic__Group_7__2__Impl : ( FullStop ) ;
    public final void rule__Atomic__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7231:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:7232:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:7232:1: ( FullStop )
            // InternalGoatComponentsParser.g:7233:2: FullStop
            {
             before(grammarAccess.getAtomicAccess().getFullStopKeyword_7_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getFullStopKeyword_7_2()); 

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
    // $ANTLR end "rule__Atomic__Group_7__2__Impl"


    // $ANTLR start "rule__Atomic__Group_7__3"
    // InternalGoatComponentsParser.g:7242:1: rule__Atomic__Group_7__3 : rule__Atomic__Group_7__3__Impl ;
    public final void rule__Atomic__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7246:1: ( rule__Atomic__Group_7__3__Impl )
            // InternalGoatComponentsParser.g:7247:2: rule__Atomic__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_7__3__Impl();

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
    // $ANTLR end "rule__Atomic__Group_7__3"


    // $ANTLR start "rule__Atomic__Group_7__3__Impl"
    // InternalGoatComponentsParser.g:7253:1: rule__Atomic__Group_7__3__Impl : ( ( rule__Atomic__AttributeAssignment_7_3 ) ) ;
    public final void rule__Atomic__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7257:1: ( ( ( rule__Atomic__AttributeAssignment_7_3 ) ) )
            // InternalGoatComponentsParser.g:7258:1: ( ( rule__Atomic__AttributeAssignment_7_3 ) )
            {
            // InternalGoatComponentsParser.g:7258:1: ( ( rule__Atomic__AttributeAssignment_7_3 ) )
            // InternalGoatComponentsParser.g:7259:2: ( rule__Atomic__AttributeAssignment_7_3 )
            {
             before(grammarAccess.getAtomicAccess().getAttributeAssignment_7_3()); 
            // InternalGoatComponentsParser.g:7260:2: ( rule__Atomic__AttributeAssignment_7_3 )
            // InternalGoatComponentsParser.g:7260:3: rule__Atomic__AttributeAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__AttributeAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAttributeAssignment_7_3()); 

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
    // $ANTLR end "rule__Atomic__Group_7__3__Impl"


    // $ANTLR start "rule__AttributeToSet__Group_0__0"
    // InternalGoatComponentsParser.g:7269:1: rule__AttributeToSet__Group_0__0 : rule__AttributeToSet__Group_0__0__Impl rule__AttributeToSet__Group_0__1 ;
    public final void rule__AttributeToSet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7273:1: ( rule__AttributeToSet__Group_0__0__Impl rule__AttributeToSet__Group_0__1 )
            // InternalGoatComponentsParser.g:7274:2: rule__AttributeToSet__Group_0__0__Impl rule__AttributeToSet__Group_0__1
            {
            pushFollow(FOLLOW_55);
            rule__AttributeToSet__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeToSet__Group_0__1();

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
    // $ANTLR end "rule__AttributeToSet__Group_0__0"


    // $ANTLR start "rule__AttributeToSet__Group_0__0__Impl"
    // InternalGoatComponentsParser.g:7281:1: rule__AttributeToSet__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeToSet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7285:1: ( ( () ) )
            // InternalGoatComponentsParser.g:7286:1: ( () )
            {
            // InternalGoatComponentsParser.g:7286:1: ( () )
            // InternalGoatComponentsParser.g:7287:2: ()
            {
             before(grammarAccess.getAttributeToSetAccess().getComponentAttributeToSetAction_0_0()); 
            // InternalGoatComponentsParser.g:7288:2: ()
            // InternalGoatComponentsParser.g:7288:3: 
            {
            }

             after(grammarAccess.getAttributeToSetAccess().getComponentAttributeToSetAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeToSet__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeToSet__Group_0__1"
    // InternalGoatComponentsParser.g:7296:1: rule__AttributeToSet__Group_0__1 : rule__AttributeToSet__Group_0__1__Impl rule__AttributeToSet__Group_0__2 ;
    public final void rule__AttributeToSet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7300:1: ( rule__AttributeToSet__Group_0__1__Impl rule__AttributeToSet__Group_0__2 )
            // InternalGoatComponentsParser.g:7301:2: rule__AttributeToSet__Group_0__1__Impl rule__AttributeToSet__Group_0__2
            {
            pushFollow(FOLLOW_53);
            rule__AttributeToSet__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeToSet__Group_0__2();

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
    // $ANTLR end "rule__AttributeToSet__Group_0__1"


    // $ANTLR start "rule__AttributeToSet__Group_0__1__Impl"
    // InternalGoatComponentsParser.g:7308:1: rule__AttributeToSet__Group_0__1__Impl : ( This ) ;
    public final void rule__AttributeToSet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7312:1: ( ( This ) )
            // InternalGoatComponentsParser.g:7313:1: ( This )
            {
            // InternalGoatComponentsParser.g:7313:1: ( This )
            // InternalGoatComponentsParser.g:7314:2: This
            {
             before(grammarAccess.getAttributeToSetAccess().getThisKeyword_0_1()); 
            match(input,This,FOLLOW_2); 
             after(grammarAccess.getAttributeToSetAccess().getThisKeyword_0_1()); 

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
    // $ANTLR end "rule__AttributeToSet__Group_0__1__Impl"


    // $ANTLR start "rule__AttributeToSet__Group_0__2"
    // InternalGoatComponentsParser.g:7323:1: rule__AttributeToSet__Group_0__2 : rule__AttributeToSet__Group_0__2__Impl rule__AttributeToSet__Group_0__3 ;
    public final void rule__AttributeToSet__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7327:1: ( rule__AttributeToSet__Group_0__2__Impl rule__AttributeToSet__Group_0__3 )
            // InternalGoatComponentsParser.g:7328:2: rule__AttributeToSet__Group_0__2__Impl rule__AttributeToSet__Group_0__3
            {
            pushFollow(FOLLOW_7);
            rule__AttributeToSet__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeToSet__Group_0__3();

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
    // $ANTLR end "rule__AttributeToSet__Group_0__2"


    // $ANTLR start "rule__AttributeToSet__Group_0__2__Impl"
    // InternalGoatComponentsParser.g:7335:1: rule__AttributeToSet__Group_0__2__Impl : ( FullStop ) ;
    public final void rule__AttributeToSet__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7339:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:7340:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:7340:1: ( FullStop )
            // InternalGoatComponentsParser.g:7341:2: FullStop
            {
             before(grammarAccess.getAttributeToSetAccess().getFullStopKeyword_0_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getAttributeToSetAccess().getFullStopKeyword_0_2()); 

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
    // $ANTLR end "rule__AttributeToSet__Group_0__2__Impl"


    // $ANTLR start "rule__AttributeToSet__Group_0__3"
    // InternalGoatComponentsParser.g:7350:1: rule__AttributeToSet__Group_0__3 : rule__AttributeToSet__Group_0__3__Impl ;
    public final void rule__AttributeToSet__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7354:1: ( rule__AttributeToSet__Group_0__3__Impl )
            // InternalGoatComponentsParser.g:7355:2: rule__AttributeToSet__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeToSet__Group_0__3__Impl();

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
    // $ANTLR end "rule__AttributeToSet__Group_0__3"


    // $ANTLR start "rule__AttributeToSet__Group_0__3__Impl"
    // InternalGoatComponentsParser.g:7361:1: rule__AttributeToSet__Group_0__3__Impl : ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) ) ;
    public final void rule__AttributeToSet__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7365:1: ( ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) ) )
            // InternalGoatComponentsParser.g:7366:1: ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) )
            {
            // InternalGoatComponentsParser.g:7366:1: ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) )
            // InternalGoatComponentsParser.g:7367:2: ( rule__AttributeToSet__AttributeAssignment_0_3 )
            {
             before(grammarAccess.getAttributeToSetAccess().getAttributeAssignment_0_3()); 
            // InternalGoatComponentsParser.g:7368:2: ( rule__AttributeToSet__AttributeAssignment_0_3 )
            // InternalGoatComponentsParser.g:7368:3: rule__AttributeToSet__AttributeAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeToSet__AttributeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeToSetAccess().getAttributeAssignment_0_3()); 

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
    // $ANTLR end "rule__AttributeToSet__Group_0__3__Impl"


    // $ANTLR start "rule__AttributeToSet__Group_1__0"
    // InternalGoatComponentsParser.g:7377:1: rule__AttributeToSet__Group_1__0 : rule__AttributeToSet__Group_1__0__Impl rule__AttributeToSet__Group_1__1 ;
    public final void rule__AttributeToSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7381:1: ( rule__AttributeToSet__Group_1__0__Impl rule__AttributeToSet__Group_1__1 )
            // InternalGoatComponentsParser.g:7382:2: rule__AttributeToSet__Group_1__0__Impl rule__AttributeToSet__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__AttributeToSet__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeToSet__Group_1__1();

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
    // $ANTLR end "rule__AttributeToSet__Group_1__0"


    // $ANTLR start "rule__AttributeToSet__Group_1__0__Impl"
    // InternalGoatComponentsParser.g:7389:1: rule__AttributeToSet__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeToSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7393:1: ( ( () ) )
            // InternalGoatComponentsParser.g:7394:1: ( () )
            {
            // InternalGoatComponentsParser.g:7394:1: ( () )
            // InternalGoatComponentsParser.g:7395:2: ()
            {
             before(grammarAccess.getAttributeToSetAccess().getLocalAttributeToSetAction_1_0()); 
            // InternalGoatComponentsParser.g:7396:2: ()
            // InternalGoatComponentsParser.g:7396:3: 
            {
            }

             after(grammarAccess.getAttributeToSetAccess().getLocalAttributeToSetAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeToSet__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeToSet__Group_1__1"
    // InternalGoatComponentsParser.g:7404:1: rule__AttributeToSet__Group_1__1 : rule__AttributeToSet__Group_1__1__Impl rule__AttributeToSet__Group_1__2 ;
    public final void rule__AttributeToSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7408:1: ( rule__AttributeToSet__Group_1__1__Impl rule__AttributeToSet__Group_1__2 )
            // InternalGoatComponentsParser.g:7409:2: rule__AttributeToSet__Group_1__1__Impl rule__AttributeToSet__Group_1__2
            {
            pushFollow(FOLLOW_53);
            rule__AttributeToSet__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeToSet__Group_1__2();

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
    // $ANTLR end "rule__AttributeToSet__Group_1__1"


    // $ANTLR start "rule__AttributeToSet__Group_1__1__Impl"
    // InternalGoatComponentsParser.g:7416:1: rule__AttributeToSet__Group_1__1__Impl : ( Proc ) ;
    public final void rule__AttributeToSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7420:1: ( ( Proc ) )
            // InternalGoatComponentsParser.g:7421:1: ( Proc )
            {
            // InternalGoatComponentsParser.g:7421:1: ( Proc )
            // InternalGoatComponentsParser.g:7422:2: Proc
            {
             before(grammarAccess.getAttributeToSetAccess().getProcKeyword_1_1()); 
            match(input,Proc,FOLLOW_2); 
             after(grammarAccess.getAttributeToSetAccess().getProcKeyword_1_1()); 

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
    // $ANTLR end "rule__AttributeToSet__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeToSet__Group_1__2"
    // InternalGoatComponentsParser.g:7431:1: rule__AttributeToSet__Group_1__2 : rule__AttributeToSet__Group_1__2__Impl rule__AttributeToSet__Group_1__3 ;
    public final void rule__AttributeToSet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7435:1: ( rule__AttributeToSet__Group_1__2__Impl rule__AttributeToSet__Group_1__3 )
            // InternalGoatComponentsParser.g:7436:2: rule__AttributeToSet__Group_1__2__Impl rule__AttributeToSet__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__AttributeToSet__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeToSet__Group_1__3();

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
    // $ANTLR end "rule__AttributeToSet__Group_1__2"


    // $ANTLR start "rule__AttributeToSet__Group_1__2__Impl"
    // InternalGoatComponentsParser.g:7443:1: rule__AttributeToSet__Group_1__2__Impl : ( FullStop ) ;
    public final void rule__AttributeToSet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7447:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:7448:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:7448:1: ( FullStop )
            // InternalGoatComponentsParser.g:7449:2: FullStop
            {
             before(grammarAccess.getAttributeToSetAccess().getFullStopKeyword_1_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getAttributeToSetAccess().getFullStopKeyword_1_2()); 

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
    // $ANTLR end "rule__AttributeToSet__Group_1__2__Impl"


    // $ANTLR start "rule__AttributeToSet__Group_1__3"
    // InternalGoatComponentsParser.g:7458:1: rule__AttributeToSet__Group_1__3 : rule__AttributeToSet__Group_1__3__Impl ;
    public final void rule__AttributeToSet__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7462:1: ( rule__AttributeToSet__Group_1__3__Impl )
            // InternalGoatComponentsParser.g:7463:2: rule__AttributeToSet__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeToSet__Group_1__3__Impl();

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
    // $ANTLR end "rule__AttributeToSet__Group_1__3"


    // $ANTLR start "rule__AttributeToSet__Group_1__3__Impl"
    // InternalGoatComponentsParser.g:7469:1: rule__AttributeToSet__Group_1__3__Impl : ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) ) ;
    public final void rule__AttributeToSet__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7473:1: ( ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) ) )
            // InternalGoatComponentsParser.g:7474:1: ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) )
            {
            // InternalGoatComponentsParser.g:7474:1: ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) )
            // InternalGoatComponentsParser.g:7475:2: ( rule__AttributeToSet__AttributeAssignment_1_3 )
            {
             before(grammarAccess.getAttributeToSetAccess().getAttributeAssignment_1_3()); 
            // InternalGoatComponentsParser.g:7476:2: ( rule__AttributeToSet__AttributeAssignment_1_3 )
            // InternalGoatComponentsParser.g:7476:3: rule__AttributeToSet__AttributeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeToSet__AttributeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeToSetAccess().getAttributeAssignment_1_3()); 

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
    // $ANTLR end "rule__AttributeToSet__Group_1__3__Impl"


    // $ANTLR start "rule__FuncParam__Group__0"
    // InternalGoatComponentsParser.g:7485:1: rule__FuncParam__Group__0 : rule__FuncParam__Group__0__Impl rule__FuncParam__Group__1 ;
    public final void rule__FuncParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7489:1: ( rule__FuncParam__Group__0__Impl rule__FuncParam__Group__1 )
            // InternalGoatComponentsParser.g:7490:2: rule__FuncParam__Group__0__Impl rule__FuncParam__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FuncParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncParam__Group__1();

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
    // $ANTLR end "rule__FuncParam__Group__0"


    // $ANTLR start "rule__FuncParam__Group__0__Impl"
    // InternalGoatComponentsParser.g:7497:1: rule__FuncParam__Group__0__Impl : ( ( rule__FuncParam__TypeAssignment_0 ) ) ;
    public final void rule__FuncParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7501:1: ( ( ( rule__FuncParam__TypeAssignment_0 ) ) )
            // InternalGoatComponentsParser.g:7502:1: ( ( rule__FuncParam__TypeAssignment_0 ) )
            {
            // InternalGoatComponentsParser.g:7502:1: ( ( rule__FuncParam__TypeAssignment_0 ) )
            // InternalGoatComponentsParser.g:7503:2: ( rule__FuncParam__TypeAssignment_0 )
            {
             before(grammarAccess.getFuncParamAccess().getTypeAssignment_0()); 
            // InternalGoatComponentsParser.g:7504:2: ( rule__FuncParam__TypeAssignment_0 )
            // InternalGoatComponentsParser.g:7504:3: rule__FuncParam__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FuncParam__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFuncParamAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__FuncParam__Group__0__Impl"


    // $ANTLR start "rule__FuncParam__Group__1"
    // InternalGoatComponentsParser.g:7512:1: rule__FuncParam__Group__1 : rule__FuncParam__Group__1__Impl ;
    public final void rule__FuncParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7516:1: ( rule__FuncParam__Group__1__Impl )
            // InternalGoatComponentsParser.g:7517:2: rule__FuncParam__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncParam__Group__1__Impl();

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
    // $ANTLR end "rule__FuncParam__Group__1"


    // $ANTLR start "rule__FuncParam__Group__1__Impl"
    // InternalGoatComponentsParser.g:7523:1: rule__FuncParam__Group__1__Impl : ( ( rule__FuncParam__NameAssignment_1 ) ) ;
    public final void rule__FuncParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7527:1: ( ( ( rule__FuncParam__NameAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:7528:1: ( ( rule__FuncParam__NameAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:7528:1: ( ( rule__FuncParam__NameAssignment_1 ) )
            // InternalGoatComponentsParser.g:7529:2: ( rule__FuncParam__NameAssignment_1 )
            {
             before(grammarAccess.getFuncParamAccess().getNameAssignment_1()); 
            // InternalGoatComponentsParser.g:7530:2: ( rule__FuncParam__NameAssignment_1 )
            // InternalGoatComponentsParser.g:7530:3: rule__FuncParam__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncParam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncParamAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FuncParam__Group__1__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__0"
    // InternalGoatComponentsParser.g:7539:1: rule__FuncDefinition__Group__0 : rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1 ;
    public final void rule__FuncDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7543:1: ( rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1 )
            // InternalGoatComponentsParser.g:7544:2: rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__FuncDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__1();

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
    // $ANTLR end "rule__FuncDefinition__Group__0"


    // $ANTLR start "rule__FuncDefinition__Group__0__Impl"
    // InternalGoatComponentsParser.g:7551:1: rule__FuncDefinition__Group__0__Impl : ( Function ) ;
    public final void rule__FuncDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7555:1: ( ( Function ) )
            // InternalGoatComponentsParser.g:7556:1: ( Function )
            {
            // InternalGoatComponentsParser.g:7556:1: ( Function )
            // InternalGoatComponentsParser.g:7557:2: Function
            {
             before(grammarAccess.getFuncDefinitionAccess().getFunctionKeyword_0()); 
            match(input,Function,FOLLOW_2); 
             after(grammarAccess.getFuncDefinitionAccess().getFunctionKeyword_0()); 

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
    // $ANTLR end "rule__FuncDefinition__Group__0__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__1"
    // InternalGoatComponentsParser.g:7566:1: rule__FuncDefinition__Group__1 : rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2 ;
    public final void rule__FuncDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7570:1: ( rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2 )
            // InternalGoatComponentsParser.g:7571:2: rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FuncDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__2();

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
    // $ANTLR end "rule__FuncDefinition__Group__1"


    // $ANTLR start "rule__FuncDefinition__Group__1__Impl"
    // InternalGoatComponentsParser.g:7578:1: rule__FuncDefinition__Group__1__Impl : ( ( rule__FuncDefinition__TypeAssignment_1 ) ) ;
    public final void rule__FuncDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7582:1: ( ( ( rule__FuncDefinition__TypeAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:7583:1: ( ( rule__FuncDefinition__TypeAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:7583:1: ( ( rule__FuncDefinition__TypeAssignment_1 ) )
            // InternalGoatComponentsParser.g:7584:2: ( rule__FuncDefinition__TypeAssignment_1 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getTypeAssignment_1()); 
            // InternalGoatComponentsParser.g:7585:2: ( rule__FuncDefinition__TypeAssignment_1 )
            // InternalGoatComponentsParser.g:7585:3: rule__FuncDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncDefinitionAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__FuncDefinition__Group__1__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__2"
    // InternalGoatComponentsParser.g:7593:1: rule__FuncDefinition__Group__2 : rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3 ;
    public final void rule__FuncDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7597:1: ( rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3 )
            // InternalGoatComponentsParser.g:7598:2: rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__FuncDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__3();

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
    // $ANTLR end "rule__FuncDefinition__Group__2"


    // $ANTLR start "rule__FuncDefinition__Group__2__Impl"
    // InternalGoatComponentsParser.g:7605:1: rule__FuncDefinition__Group__2__Impl : ( ( rule__FuncDefinition__NameAssignment_2 ) ) ;
    public final void rule__FuncDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7609:1: ( ( ( rule__FuncDefinition__NameAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:7610:1: ( ( rule__FuncDefinition__NameAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:7610:1: ( ( rule__FuncDefinition__NameAssignment_2 ) )
            // InternalGoatComponentsParser.g:7611:2: ( rule__FuncDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getNameAssignment_2()); 
            // InternalGoatComponentsParser.g:7612:2: ( rule__FuncDefinition__NameAssignment_2 )
            // InternalGoatComponentsParser.g:7612:3: rule__FuncDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuncDefinitionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__FuncDefinition__Group__2__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__3"
    // InternalGoatComponentsParser.g:7620:1: rule__FuncDefinition__Group__3 : rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4 ;
    public final void rule__FuncDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7624:1: ( rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4 )
            // InternalGoatComponentsParser.g:7625:2: rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4
            {
            pushFollow(FOLLOW_57);
            rule__FuncDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__4();

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
    // $ANTLR end "rule__FuncDefinition__Group__3"


    // $ANTLR start "rule__FuncDefinition__Group__3__Impl"
    // InternalGoatComponentsParser.g:7632:1: rule__FuncDefinition__Group__3__Impl : ( LeftParenthesis ) ;
    public final void rule__FuncDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7636:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:7637:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:7637:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:7638:2: LeftParenthesis
            {
             before(grammarAccess.getFuncDefinitionAccess().getLeftParenthesisKeyword_3()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getFuncDefinitionAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FuncDefinition__Group__3__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__4"
    // InternalGoatComponentsParser.g:7647:1: rule__FuncDefinition__Group__4 : rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5 ;
    public final void rule__FuncDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7651:1: ( rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5 )
            // InternalGoatComponentsParser.g:7652:2: rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5
            {
            pushFollow(FOLLOW_57);
            rule__FuncDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__5();

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
    // $ANTLR end "rule__FuncDefinition__Group__4"


    // $ANTLR start "rule__FuncDefinition__Group__4__Impl"
    // InternalGoatComponentsParser.g:7659:1: rule__FuncDefinition__Group__4__Impl : ( ( rule__FuncDefinition__Group_4__0 )? ) ;
    public final void rule__FuncDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7663:1: ( ( ( rule__FuncDefinition__Group_4__0 )? ) )
            // InternalGoatComponentsParser.g:7664:1: ( ( rule__FuncDefinition__Group_4__0 )? )
            {
            // InternalGoatComponentsParser.g:7664:1: ( ( rule__FuncDefinition__Group_4__0 )? )
            // InternalGoatComponentsParser.g:7665:2: ( rule__FuncDefinition__Group_4__0 )?
            {
             before(grammarAccess.getFuncDefinitionAccess().getGroup_4()); 
            // InternalGoatComponentsParser.g:7666:2: ( rule__FuncDefinition__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_TYPE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGoatComponentsParser.g:7666:3: rule__FuncDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FuncDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuncDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FuncDefinition__Group__4__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__5"
    // InternalGoatComponentsParser.g:7674:1: rule__FuncDefinition__Group__5 : rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6 ;
    public final void rule__FuncDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7678:1: ( rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6 )
            // InternalGoatComponentsParser.g:7679:2: rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__FuncDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__6();

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
    // $ANTLR end "rule__FuncDefinition__Group__5"


    // $ANTLR start "rule__FuncDefinition__Group__5__Impl"
    // InternalGoatComponentsParser.g:7686:1: rule__FuncDefinition__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__FuncDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7690:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:7691:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:7691:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:7692:2: RightParenthesis
            {
             before(grammarAccess.getFuncDefinitionAccess().getRightParenthesisKeyword_5()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getFuncDefinitionAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__FuncDefinition__Group__5__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__6"
    // InternalGoatComponentsParser.g:7701:1: rule__FuncDefinition__Group__6 : rule__FuncDefinition__Group__6__Impl ;
    public final void rule__FuncDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7705:1: ( rule__FuncDefinition__Group__6__Impl )
            // InternalGoatComponentsParser.g:7706:2: rule__FuncDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__6__Impl();

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
    // $ANTLR end "rule__FuncDefinition__Group__6"


    // $ANTLR start "rule__FuncDefinition__Group__6__Impl"
    // InternalGoatComponentsParser.g:7712:1: rule__FuncDefinition__Group__6__Impl : ( ( rule__FuncDefinition__BlkAssignment_6 ) ) ;
    public final void rule__FuncDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7716:1: ( ( ( rule__FuncDefinition__BlkAssignment_6 ) ) )
            // InternalGoatComponentsParser.g:7717:1: ( ( rule__FuncDefinition__BlkAssignment_6 ) )
            {
            // InternalGoatComponentsParser.g:7717:1: ( ( rule__FuncDefinition__BlkAssignment_6 ) )
            // InternalGoatComponentsParser.g:7718:2: ( rule__FuncDefinition__BlkAssignment_6 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getBlkAssignment_6()); 
            // InternalGoatComponentsParser.g:7719:2: ( rule__FuncDefinition__BlkAssignment_6 )
            // InternalGoatComponentsParser.g:7719:3: rule__FuncDefinition__BlkAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__BlkAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFuncDefinitionAccess().getBlkAssignment_6()); 

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
    // $ANTLR end "rule__FuncDefinition__Group__6__Impl"


    // $ANTLR start "rule__FuncDefinition__Group_4__0"
    // InternalGoatComponentsParser.g:7728:1: rule__FuncDefinition__Group_4__0 : rule__FuncDefinition__Group_4__0__Impl rule__FuncDefinition__Group_4__1 ;
    public final void rule__FuncDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7732:1: ( rule__FuncDefinition__Group_4__0__Impl rule__FuncDefinition__Group_4__1 )
            // InternalGoatComponentsParser.g:7733:2: rule__FuncDefinition__Group_4__0__Impl rule__FuncDefinition__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__FuncDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group_4__1();

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
    // $ANTLR end "rule__FuncDefinition__Group_4__0"


    // $ANTLR start "rule__FuncDefinition__Group_4__0__Impl"
    // InternalGoatComponentsParser.g:7740:1: rule__FuncDefinition__Group_4__0__Impl : ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) ) ;
    public final void rule__FuncDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7744:1: ( ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) ) )
            // InternalGoatComponentsParser.g:7745:1: ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) )
            {
            // InternalGoatComponentsParser.g:7745:1: ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) )
            // InternalGoatComponentsParser.g:7746:2: ( rule__FuncDefinition__ParamsAssignment_4_0 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getParamsAssignment_4_0()); 
            // InternalGoatComponentsParser.g:7747:2: ( rule__FuncDefinition__ParamsAssignment_4_0 )
            // InternalGoatComponentsParser.g:7747:3: rule__FuncDefinition__ParamsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__ParamsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFuncDefinitionAccess().getParamsAssignment_4_0()); 

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
    // $ANTLR end "rule__FuncDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__FuncDefinition__Group_4__1"
    // InternalGoatComponentsParser.g:7755:1: rule__FuncDefinition__Group_4__1 : rule__FuncDefinition__Group_4__1__Impl ;
    public final void rule__FuncDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7759:1: ( rule__FuncDefinition__Group_4__1__Impl )
            // InternalGoatComponentsParser.g:7760:2: rule__FuncDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__FuncDefinition__Group_4__1"


    // $ANTLR start "rule__FuncDefinition__Group_4__1__Impl"
    // InternalGoatComponentsParser.g:7766:1: rule__FuncDefinition__Group_4__1__Impl : ( ( rule__FuncDefinition__Group_4_1__0 )* ) ;
    public final void rule__FuncDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7770:1: ( ( ( rule__FuncDefinition__Group_4_1__0 )* ) )
            // InternalGoatComponentsParser.g:7771:1: ( ( rule__FuncDefinition__Group_4_1__0 )* )
            {
            // InternalGoatComponentsParser.g:7771:1: ( ( rule__FuncDefinition__Group_4_1__0 )* )
            // InternalGoatComponentsParser.g:7772:2: ( rule__FuncDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getFuncDefinitionAccess().getGroup_4_1()); 
            // InternalGoatComponentsParser.g:7773:2: ( rule__FuncDefinition__Group_4_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Comma) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:7773:3: rule__FuncDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__FuncDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getFuncDefinitionAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__FuncDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__FuncDefinition__Group_4_1__0"
    // InternalGoatComponentsParser.g:7782:1: rule__FuncDefinition__Group_4_1__0 : rule__FuncDefinition__Group_4_1__0__Impl rule__FuncDefinition__Group_4_1__1 ;
    public final void rule__FuncDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7786:1: ( rule__FuncDefinition__Group_4_1__0__Impl rule__FuncDefinition__Group_4_1__1 )
            // InternalGoatComponentsParser.g:7787:2: rule__FuncDefinition__Group_4_1__0__Impl rule__FuncDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_56);
            rule__FuncDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group_4_1__1();

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
    // $ANTLR end "rule__FuncDefinition__Group_4_1__0"


    // $ANTLR start "rule__FuncDefinition__Group_4_1__0__Impl"
    // InternalGoatComponentsParser.g:7794:1: rule__FuncDefinition__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__FuncDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7798:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:7799:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:7799:1: ( Comma )
            // InternalGoatComponentsParser.g:7800:2: Comma
            {
             before(grammarAccess.getFuncDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getFuncDefinitionAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__FuncDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__FuncDefinition__Group_4_1__1"
    // InternalGoatComponentsParser.g:7809:1: rule__FuncDefinition__Group_4_1__1 : rule__FuncDefinition__Group_4_1__1__Impl ;
    public final void rule__FuncDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7813:1: ( rule__FuncDefinition__Group_4_1__1__Impl )
            // InternalGoatComponentsParser.g:7814:2: rule__FuncDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__FuncDefinition__Group_4_1__1"


    // $ANTLR start "rule__FuncDefinition__Group_4_1__1__Impl"
    // InternalGoatComponentsParser.g:7820:1: rule__FuncDefinition__Group_4_1__1__Impl : ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) ) ;
    public final void rule__FuncDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7824:1: ( ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) ) )
            // InternalGoatComponentsParser.g:7825:1: ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) )
            {
            // InternalGoatComponentsParser.g:7825:1: ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) )
            // InternalGoatComponentsParser.g:7826:2: ( rule__FuncDefinition__ParamsAssignment_4_1_1 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getParamsAssignment_4_1_1()); 
            // InternalGoatComponentsParser.g:7827:2: ( rule__FuncDefinition__ParamsAssignment_4_1_1 )
            // InternalGoatComponentsParser.g:7827:3: rule__FuncDefinition__ParamsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__ParamsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncDefinitionAccess().getParamsAssignment_4_1_1()); 

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
    // $ANTLR end "rule__FuncDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__FuncBlock__Group__0"
    // InternalGoatComponentsParser.g:7836:1: rule__FuncBlock__Group__0 : rule__FuncBlock__Group__0__Impl rule__FuncBlock__Group__1 ;
    public final void rule__FuncBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7840:1: ( rule__FuncBlock__Group__0__Impl rule__FuncBlock__Group__1 )
            // InternalGoatComponentsParser.g:7841:2: rule__FuncBlock__Group__0__Impl rule__FuncBlock__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__FuncBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncBlock__Group__1();

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
    // $ANTLR end "rule__FuncBlock__Group__0"


    // $ANTLR start "rule__FuncBlock__Group__0__Impl"
    // InternalGoatComponentsParser.g:7848:1: rule__FuncBlock__Group__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__FuncBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7852:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:7853:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:7853:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:7854:2: LeftCurlyBracket
            {
             before(grammarAccess.getFuncBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getFuncBlockAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__FuncBlock__Group__0__Impl"


    // $ANTLR start "rule__FuncBlock__Group__1"
    // InternalGoatComponentsParser.g:7863:1: rule__FuncBlock__Group__1 : rule__FuncBlock__Group__1__Impl rule__FuncBlock__Group__2 ;
    public final void rule__FuncBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7867:1: ( rule__FuncBlock__Group__1__Impl rule__FuncBlock__Group__2 )
            // InternalGoatComponentsParser.g:7868:2: rule__FuncBlock__Group__1__Impl rule__FuncBlock__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__FuncBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncBlock__Group__2();

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
    // $ANTLR end "rule__FuncBlock__Group__1"


    // $ANTLR start "rule__FuncBlock__Group__1__Impl"
    // InternalGoatComponentsParser.g:7875:1: rule__FuncBlock__Group__1__Impl : ( () ) ;
    public final void rule__FuncBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7879:1: ( ( () ) )
            // InternalGoatComponentsParser.g:7880:1: ( () )
            {
            // InternalGoatComponentsParser.g:7880:1: ( () )
            // InternalGoatComponentsParser.g:7881:2: ()
            {
             before(grammarAccess.getFuncBlockAccess().getFuncBlockAction_1()); 
            // InternalGoatComponentsParser.g:7882:2: ()
            // InternalGoatComponentsParser.g:7882:3: 
            {
            }

             after(grammarAccess.getFuncBlockAccess().getFuncBlockAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncBlock__Group__1__Impl"


    // $ANTLR start "rule__FuncBlock__Group__2"
    // InternalGoatComponentsParser.g:7890:1: rule__FuncBlock__Group__2 : rule__FuncBlock__Group__2__Impl rule__FuncBlock__Group__3 ;
    public final void rule__FuncBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7894:1: ( rule__FuncBlock__Group__2__Impl rule__FuncBlock__Group__3 )
            // InternalGoatComponentsParser.g:7895:2: rule__FuncBlock__Group__2__Impl rule__FuncBlock__Group__3
            {
            pushFollow(FOLLOW_58);
            rule__FuncBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncBlock__Group__3();

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
    // $ANTLR end "rule__FuncBlock__Group__2"


    // $ANTLR start "rule__FuncBlock__Group__2__Impl"
    // InternalGoatComponentsParser.g:7902:1: rule__FuncBlock__Group__2__Impl : ( ( rule__FuncBlock__StatementsAssignment_2 )* ) ;
    public final void rule__FuncBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7906:1: ( ( ( rule__FuncBlock__StatementsAssignment_2 )* ) )
            // InternalGoatComponentsParser.g:7907:1: ( ( rule__FuncBlock__StatementsAssignment_2 )* )
            {
            // InternalGoatComponentsParser.g:7907:1: ( ( rule__FuncBlock__StatementsAssignment_2 )* )
            // InternalGoatComponentsParser.g:7908:2: ( rule__FuncBlock__StatementsAssignment_2 )*
            {
             before(grammarAccess.getFuncBlockAccess().getStatementsAssignment_2()); 
            // InternalGoatComponentsParser.g:7909:2: ( rule__FuncBlock__StatementsAssignment_2 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==Return||LA46_0==Var||LA46_0==If||LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:7909:3: rule__FuncBlock__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_59);
            	    rule__FuncBlock__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getFuncBlockAccess().getStatementsAssignment_2()); 

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
    // $ANTLR end "rule__FuncBlock__Group__2__Impl"


    // $ANTLR start "rule__FuncBlock__Group__3"
    // InternalGoatComponentsParser.g:7917:1: rule__FuncBlock__Group__3 : rule__FuncBlock__Group__3__Impl ;
    public final void rule__FuncBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7921:1: ( rule__FuncBlock__Group__3__Impl )
            // InternalGoatComponentsParser.g:7922:2: rule__FuncBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncBlock__Group__3__Impl();

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
    // $ANTLR end "rule__FuncBlock__Group__3"


    // $ANTLR start "rule__FuncBlock__Group__3__Impl"
    // InternalGoatComponentsParser.g:7928:1: rule__FuncBlock__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__FuncBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7932:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:7933:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:7933:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:7934:2: RightCurlyBracket
            {
             before(grammarAccess.getFuncBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getFuncBlockAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__FuncBlock__Group__3__Impl"


    // $ANTLR start "rule__FuncVarDeclaration__Group__0"
    // InternalGoatComponentsParser.g:7944:1: rule__FuncVarDeclaration__Group__0 : rule__FuncVarDeclaration__Group__0__Impl rule__FuncVarDeclaration__Group__1 ;
    public final void rule__FuncVarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7948:1: ( rule__FuncVarDeclaration__Group__0__Impl rule__FuncVarDeclaration__Group__1 )
            // InternalGoatComponentsParser.g:7949:2: rule__FuncVarDeclaration__Group__0__Impl rule__FuncVarDeclaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FuncVarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncVarDeclaration__Group__1();

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
    // $ANTLR end "rule__FuncVarDeclaration__Group__0"


    // $ANTLR start "rule__FuncVarDeclaration__Group__0__Impl"
    // InternalGoatComponentsParser.g:7956:1: rule__FuncVarDeclaration__Group__0__Impl : ( Var ) ;
    public final void rule__FuncVarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7960:1: ( ( Var ) )
            // InternalGoatComponentsParser.g:7961:1: ( Var )
            {
            // InternalGoatComponentsParser.g:7961:1: ( Var )
            // InternalGoatComponentsParser.g:7962:2: Var
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getVarKeyword_0()); 
            match(input,Var,FOLLOW_2); 
             after(grammarAccess.getFuncVarDeclarationAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__FuncVarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FuncVarDeclaration__Group__1"
    // InternalGoatComponentsParser.g:7971:1: rule__FuncVarDeclaration__Group__1 : rule__FuncVarDeclaration__Group__1__Impl rule__FuncVarDeclaration__Group__2 ;
    public final void rule__FuncVarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7975:1: ( rule__FuncVarDeclaration__Group__1__Impl rule__FuncVarDeclaration__Group__2 )
            // InternalGoatComponentsParser.g:7976:2: rule__FuncVarDeclaration__Group__1__Impl rule__FuncVarDeclaration__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__FuncVarDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncVarDeclaration__Group__2();

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
    // $ANTLR end "rule__FuncVarDeclaration__Group__1"


    // $ANTLR start "rule__FuncVarDeclaration__Group__1__Impl"
    // InternalGoatComponentsParser.g:7983:1: rule__FuncVarDeclaration__Group__1__Impl : ( ( rule__FuncVarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__FuncVarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7987:1: ( ( ( rule__FuncVarDeclaration__NameAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:7988:1: ( ( rule__FuncVarDeclaration__NameAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:7988:1: ( ( rule__FuncVarDeclaration__NameAssignment_1 ) )
            // InternalGoatComponentsParser.g:7989:2: ( rule__FuncVarDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getNameAssignment_1()); 
            // InternalGoatComponentsParser.g:7990:2: ( rule__FuncVarDeclaration__NameAssignment_1 )
            // InternalGoatComponentsParser.g:7990:3: rule__FuncVarDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncVarDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncVarDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FuncVarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FuncVarDeclaration__Group__2"
    // InternalGoatComponentsParser.g:7998:1: rule__FuncVarDeclaration__Group__2 : rule__FuncVarDeclaration__Group__2__Impl rule__FuncVarDeclaration__Group__3 ;
    public final void rule__FuncVarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8002:1: ( rule__FuncVarDeclaration__Group__2__Impl rule__FuncVarDeclaration__Group__3 )
            // InternalGoatComponentsParser.g:8003:2: rule__FuncVarDeclaration__Group__2__Impl rule__FuncVarDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__FuncVarDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncVarDeclaration__Group__3();

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
    // $ANTLR end "rule__FuncVarDeclaration__Group__2"


    // $ANTLR start "rule__FuncVarDeclaration__Group__2__Impl"
    // InternalGoatComponentsParser.g:8010:1: rule__FuncVarDeclaration__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__FuncVarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8014:1: ( ( EqualsSign ) )
            // InternalGoatComponentsParser.g:8015:1: ( EqualsSign )
            {
            // InternalGoatComponentsParser.g:8015:1: ( EqualsSign )
            // InternalGoatComponentsParser.g:8016:2: EqualsSign
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getFuncVarDeclarationAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__FuncVarDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FuncVarDeclaration__Group__3"
    // InternalGoatComponentsParser.g:8025:1: rule__FuncVarDeclaration__Group__3 : rule__FuncVarDeclaration__Group__3__Impl ;
    public final void rule__FuncVarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8029:1: ( rule__FuncVarDeclaration__Group__3__Impl )
            // InternalGoatComponentsParser.g:8030:2: rule__FuncVarDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncVarDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__FuncVarDeclaration__Group__3"


    // $ANTLR start "rule__FuncVarDeclaration__Group__3__Impl"
    // InternalGoatComponentsParser.g:8036:1: rule__FuncVarDeclaration__Group__3__Impl : ( ( rule__FuncVarDeclaration__ValAssignment_3 ) ) ;
    public final void rule__FuncVarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8040:1: ( ( ( rule__FuncVarDeclaration__ValAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:8041:1: ( ( rule__FuncVarDeclaration__ValAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:8041:1: ( ( rule__FuncVarDeclaration__ValAssignment_3 ) )
            // InternalGoatComponentsParser.g:8042:2: ( rule__FuncVarDeclaration__ValAssignment_3 )
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getValAssignment_3()); 
            // InternalGoatComponentsParser.g:8043:2: ( rule__FuncVarDeclaration__ValAssignment_3 )
            // InternalGoatComponentsParser.g:8043:3: rule__FuncVarDeclaration__ValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FuncVarDeclaration__ValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFuncVarDeclarationAccess().getValAssignment_3()); 

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
    // $ANTLR end "rule__FuncVarDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FuncVarAssign__Group__0"
    // InternalGoatComponentsParser.g:8052:1: rule__FuncVarAssign__Group__0 : rule__FuncVarAssign__Group__0__Impl rule__FuncVarAssign__Group__1 ;
    public final void rule__FuncVarAssign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8056:1: ( rule__FuncVarAssign__Group__0__Impl rule__FuncVarAssign__Group__1 )
            // InternalGoatComponentsParser.g:8057:2: rule__FuncVarAssign__Group__0__Impl rule__FuncVarAssign__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__FuncVarAssign__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncVarAssign__Group__1();

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
    // $ANTLR end "rule__FuncVarAssign__Group__0"


    // $ANTLR start "rule__FuncVarAssign__Group__0__Impl"
    // InternalGoatComponentsParser.g:8064:1: rule__FuncVarAssign__Group__0__Impl : ( ( rule__FuncVarAssign__VarAssignment_0 ) ) ;
    public final void rule__FuncVarAssign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8068:1: ( ( ( rule__FuncVarAssign__VarAssignment_0 ) ) )
            // InternalGoatComponentsParser.g:8069:1: ( ( rule__FuncVarAssign__VarAssignment_0 ) )
            {
            // InternalGoatComponentsParser.g:8069:1: ( ( rule__FuncVarAssign__VarAssignment_0 ) )
            // InternalGoatComponentsParser.g:8070:2: ( rule__FuncVarAssign__VarAssignment_0 )
            {
             before(grammarAccess.getFuncVarAssignAccess().getVarAssignment_0()); 
            // InternalGoatComponentsParser.g:8071:2: ( rule__FuncVarAssign__VarAssignment_0 )
            // InternalGoatComponentsParser.g:8071:3: rule__FuncVarAssign__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FuncVarAssign__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFuncVarAssignAccess().getVarAssignment_0()); 

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
    // $ANTLR end "rule__FuncVarAssign__Group__0__Impl"


    // $ANTLR start "rule__FuncVarAssign__Group__1"
    // InternalGoatComponentsParser.g:8079:1: rule__FuncVarAssign__Group__1 : rule__FuncVarAssign__Group__1__Impl rule__FuncVarAssign__Group__2 ;
    public final void rule__FuncVarAssign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8083:1: ( rule__FuncVarAssign__Group__1__Impl rule__FuncVarAssign__Group__2 )
            // InternalGoatComponentsParser.g:8084:2: rule__FuncVarAssign__Group__1__Impl rule__FuncVarAssign__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__FuncVarAssign__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncVarAssign__Group__2();

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
    // $ANTLR end "rule__FuncVarAssign__Group__1"


    // $ANTLR start "rule__FuncVarAssign__Group__1__Impl"
    // InternalGoatComponentsParser.g:8091:1: rule__FuncVarAssign__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__FuncVarAssign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8095:1: ( ( EqualsSign ) )
            // InternalGoatComponentsParser.g:8096:1: ( EqualsSign )
            {
            // InternalGoatComponentsParser.g:8096:1: ( EqualsSign )
            // InternalGoatComponentsParser.g:8097:2: EqualsSign
            {
             before(grammarAccess.getFuncVarAssignAccess().getEqualsSignKeyword_1()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getFuncVarAssignAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__FuncVarAssign__Group__1__Impl"


    // $ANTLR start "rule__FuncVarAssign__Group__2"
    // InternalGoatComponentsParser.g:8106:1: rule__FuncVarAssign__Group__2 : rule__FuncVarAssign__Group__2__Impl ;
    public final void rule__FuncVarAssign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8110:1: ( rule__FuncVarAssign__Group__2__Impl )
            // InternalGoatComponentsParser.g:8111:2: rule__FuncVarAssign__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncVarAssign__Group__2__Impl();

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
    // $ANTLR end "rule__FuncVarAssign__Group__2"


    // $ANTLR start "rule__FuncVarAssign__Group__2__Impl"
    // InternalGoatComponentsParser.g:8117:1: rule__FuncVarAssign__Group__2__Impl : ( ( rule__FuncVarAssign__ValAssignment_2 ) ) ;
    public final void rule__FuncVarAssign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8121:1: ( ( ( rule__FuncVarAssign__ValAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:8122:1: ( ( rule__FuncVarAssign__ValAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:8122:1: ( ( rule__FuncVarAssign__ValAssignment_2 ) )
            // InternalGoatComponentsParser.g:8123:2: ( rule__FuncVarAssign__ValAssignment_2 )
            {
             before(grammarAccess.getFuncVarAssignAccess().getValAssignment_2()); 
            // InternalGoatComponentsParser.g:8124:2: ( rule__FuncVarAssign__ValAssignment_2 )
            // InternalGoatComponentsParser.g:8124:3: rule__FuncVarAssign__ValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FuncVarAssign__ValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuncVarAssignAccess().getValAssignment_2()); 

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
    // $ANTLR end "rule__FuncVarAssign__Group__2__Impl"


    // $ANTLR start "rule__FuncIfElse__Group__0"
    // InternalGoatComponentsParser.g:8133:1: rule__FuncIfElse__Group__0 : rule__FuncIfElse__Group__0__Impl rule__FuncIfElse__Group__1 ;
    public final void rule__FuncIfElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8137:1: ( rule__FuncIfElse__Group__0__Impl rule__FuncIfElse__Group__1 )
            // InternalGoatComponentsParser.g:8138:2: rule__FuncIfElse__Group__0__Impl rule__FuncIfElse__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FuncIfElse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group__1();

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
    // $ANTLR end "rule__FuncIfElse__Group__0"


    // $ANTLR start "rule__FuncIfElse__Group__0__Impl"
    // InternalGoatComponentsParser.g:8145:1: rule__FuncIfElse__Group__0__Impl : ( If ) ;
    public final void rule__FuncIfElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8149:1: ( ( If ) )
            // InternalGoatComponentsParser.g:8150:1: ( If )
            {
            // InternalGoatComponentsParser.g:8150:1: ( If )
            // InternalGoatComponentsParser.g:8151:2: If
            {
             before(grammarAccess.getFuncIfElseAccess().getIfKeyword_0()); 
            match(input,If,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__FuncIfElse__Group__0__Impl"


    // $ANTLR start "rule__FuncIfElse__Group__1"
    // InternalGoatComponentsParser.g:8160:1: rule__FuncIfElse__Group__1 : rule__FuncIfElse__Group__1__Impl rule__FuncIfElse__Group__2 ;
    public final void rule__FuncIfElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8164:1: ( rule__FuncIfElse__Group__1__Impl rule__FuncIfElse__Group__2 )
            // InternalGoatComponentsParser.g:8165:2: rule__FuncIfElse__Group__1__Impl rule__FuncIfElse__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__FuncIfElse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group__2();

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
    // $ANTLR end "rule__FuncIfElse__Group__1"


    // $ANTLR start "rule__FuncIfElse__Group__1__Impl"
    // InternalGoatComponentsParser.g:8172:1: rule__FuncIfElse__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FuncIfElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8176:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:8177:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:8177:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:8178:2: LeftParenthesis
            {
             before(grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FuncIfElse__Group__1__Impl"


    // $ANTLR start "rule__FuncIfElse__Group__2"
    // InternalGoatComponentsParser.g:8187:1: rule__FuncIfElse__Group__2 : rule__FuncIfElse__Group__2__Impl rule__FuncIfElse__Group__3 ;
    public final void rule__FuncIfElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8191:1: ( rule__FuncIfElse__Group__2__Impl rule__FuncIfElse__Group__3 )
            // InternalGoatComponentsParser.g:8192:2: rule__FuncIfElse__Group__2__Impl rule__FuncIfElse__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__FuncIfElse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group__3();

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
    // $ANTLR end "rule__FuncIfElse__Group__2"


    // $ANTLR start "rule__FuncIfElse__Group__2__Impl"
    // InternalGoatComponentsParser.g:8199:1: rule__FuncIfElse__Group__2__Impl : ( ( rule__FuncIfElse__TestAssignment_2 ) ) ;
    public final void rule__FuncIfElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8203:1: ( ( ( rule__FuncIfElse__TestAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:8204:1: ( ( rule__FuncIfElse__TestAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:8204:1: ( ( rule__FuncIfElse__TestAssignment_2 ) )
            // InternalGoatComponentsParser.g:8205:2: ( rule__FuncIfElse__TestAssignment_2 )
            {
             before(grammarAccess.getFuncIfElseAccess().getTestAssignment_2()); 
            // InternalGoatComponentsParser.g:8206:2: ( rule__FuncIfElse__TestAssignment_2 )
            // InternalGoatComponentsParser.g:8206:3: rule__FuncIfElse__TestAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__TestAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuncIfElseAccess().getTestAssignment_2()); 

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
    // $ANTLR end "rule__FuncIfElse__Group__2__Impl"


    // $ANTLR start "rule__FuncIfElse__Group__3"
    // InternalGoatComponentsParser.g:8214:1: rule__FuncIfElse__Group__3 : rule__FuncIfElse__Group__3__Impl rule__FuncIfElse__Group__4 ;
    public final void rule__FuncIfElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8218:1: ( rule__FuncIfElse__Group__3__Impl rule__FuncIfElse__Group__4 )
            // InternalGoatComponentsParser.g:8219:2: rule__FuncIfElse__Group__3__Impl rule__FuncIfElse__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__FuncIfElse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group__4();

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
    // $ANTLR end "rule__FuncIfElse__Group__3"


    // $ANTLR start "rule__FuncIfElse__Group__3__Impl"
    // InternalGoatComponentsParser.g:8226:1: rule__FuncIfElse__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FuncIfElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8230:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:8231:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:8231:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:8232:2: RightParenthesis
            {
             before(grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FuncIfElse__Group__3__Impl"


    // $ANTLR start "rule__FuncIfElse__Group__4"
    // InternalGoatComponentsParser.g:8241:1: rule__FuncIfElse__Group__4 : rule__FuncIfElse__Group__4__Impl rule__FuncIfElse__Group__5 ;
    public final void rule__FuncIfElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8245:1: ( rule__FuncIfElse__Group__4__Impl rule__FuncIfElse__Group__5 )
            // InternalGoatComponentsParser.g:8246:2: rule__FuncIfElse__Group__4__Impl rule__FuncIfElse__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__FuncIfElse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group__5();

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
    // $ANTLR end "rule__FuncIfElse__Group__4"


    // $ANTLR start "rule__FuncIfElse__Group__4__Impl"
    // InternalGoatComponentsParser.g:8253:1: rule__FuncIfElse__Group__4__Impl : ( ( rule__FuncIfElse__ThenAssignment_4 ) ) ;
    public final void rule__FuncIfElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8257:1: ( ( ( rule__FuncIfElse__ThenAssignment_4 ) ) )
            // InternalGoatComponentsParser.g:8258:1: ( ( rule__FuncIfElse__ThenAssignment_4 ) )
            {
            // InternalGoatComponentsParser.g:8258:1: ( ( rule__FuncIfElse__ThenAssignment_4 ) )
            // InternalGoatComponentsParser.g:8259:2: ( rule__FuncIfElse__ThenAssignment_4 )
            {
             before(grammarAccess.getFuncIfElseAccess().getThenAssignment_4()); 
            // InternalGoatComponentsParser.g:8260:2: ( rule__FuncIfElse__ThenAssignment_4 )
            // InternalGoatComponentsParser.g:8260:3: rule__FuncIfElse__ThenAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__ThenAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFuncIfElseAccess().getThenAssignment_4()); 

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
    // $ANTLR end "rule__FuncIfElse__Group__4__Impl"


    // $ANTLR start "rule__FuncIfElse__Group__5"
    // InternalGoatComponentsParser.g:8268:1: rule__FuncIfElse__Group__5 : rule__FuncIfElse__Group__5__Impl rule__FuncIfElse__Group__6 ;
    public final void rule__FuncIfElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8272:1: ( rule__FuncIfElse__Group__5__Impl rule__FuncIfElse__Group__6 )
            // InternalGoatComponentsParser.g:8273:2: rule__FuncIfElse__Group__5__Impl rule__FuncIfElse__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__FuncIfElse__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group__6();

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
    // $ANTLR end "rule__FuncIfElse__Group__5"


    // $ANTLR start "rule__FuncIfElse__Group__5__Impl"
    // InternalGoatComponentsParser.g:8280:1: rule__FuncIfElse__Group__5__Impl : ( ( rule__FuncIfElse__Group_5__0 )* ) ;
    public final void rule__FuncIfElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8284:1: ( ( ( rule__FuncIfElse__Group_5__0 )* ) )
            // InternalGoatComponentsParser.g:8285:1: ( ( rule__FuncIfElse__Group_5__0 )* )
            {
            // InternalGoatComponentsParser.g:8285:1: ( ( rule__FuncIfElse__Group_5__0 )* )
            // InternalGoatComponentsParser.g:8286:2: ( rule__FuncIfElse__Group_5__0 )*
            {
             before(grammarAccess.getFuncIfElseAccess().getGroup_5()); 
            // InternalGoatComponentsParser.g:8287:2: ( rule__FuncIfElse__Group_5__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Else) ) {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==If) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:8287:3: rule__FuncIfElse__Group_5__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FuncIfElse__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getFuncIfElseAccess().getGroup_5()); 

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
    // $ANTLR end "rule__FuncIfElse__Group__5__Impl"


    // $ANTLR start "rule__FuncIfElse__Group__6"
    // InternalGoatComponentsParser.g:8295:1: rule__FuncIfElse__Group__6 : rule__FuncIfElse__Group__6__Impl ;
    public final void rule__FuncIfElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8299:1: ( rule__FuncIfElse__Group__6__Impl )
            // InternalGoatComponentsParser.g:8300:2: rule__FuncIfElse__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group__6__Impl();

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
    // $ANTLR end "rule__FuncIfElse__Group__6"


    // $ANTLR start "rule__FuncIfElse__Group__6__Impl"
    // InternalGoatComponentsParser.g:8306:1: rule__FuncIfElse__Group__6__Impl : ( ( rule__FuncIfElse__Group_6__0 )? ) ;
    public final void rule__FuncIfElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8310:1: ( ( ( rule__FuncIfElse__Group_6__0 )? ) )
            // InternalGoatComponentsParser.g:8311:1: ( ( rule__FuncIfElse__Group_6__0 )? )
            {
            // InternalGoatComponentsParser.g:8311:1: ( ( rule__FuncIfElse__Group_6__0 )? )
            // InternalGoatComponentsParser.g:8312:2: ( rule__FuncIfElse__Group_6__0 )?
            {
             before(grammarAccess.getFuncIfElseAccess().getGroup_6()); 
            // InternalGoatComponentsParser.g:8313:2: ( rule__FuncIfElse__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Else) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGoatComponentsParser.g:8313:3: rule__FuncIfElse__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FuncIfElse__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuncIfElseAccess().getGroup_6()); 

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
    // $ANTLR end "rule__FuncIfElse__Group__6__Impl"


    // $ANTLR start "rule__FuncIfElse__Group_5__0"
    // InternalGoatComponentsParser.g:8322:1: rule__FuncIfElse__Group_5__0 : rule__FuncIfElse__Group_5__0__Impl rule__FuncIfElse__Group_5__1 ;
    public final void rule__FuncIfElse__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8326:1: ( rule__FuncIfElse__Group_5__0__Impl rule__FuncIfElse__Group_5__1 )
            // InternalGoatComponentsParser.g:8327:2: rule__FuncIfElse__Group_5__0__Impl rule__FuncIfElse__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__FuncIfElse__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group_5__1();

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
    // $ANTLR end "rule__FuncIfElse__Group_5__0"


    // $ANTLR start "rule__FuncIfElse__Group_5__0__Impl"
    // InternalGoatComponentsParser.g:8334:1: rule__FuncIfElse__Group_5__0__Impl : ( Else ) ;
    public final void rule__FuncIfElse__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8338:1: ( ( Else ) )
            // InternalGoatComponentsParser.g:8339:1: ( Else )
            {
            // InternalGoatComponentsParser.g:8339:1: ( Else )
            // InternalGoatComponentsParser.g:8340:2: Else
            {
             before(grammarAccess.getFuncIfElseAccess().getElseKeyword_5_0()); 
            match(input,Else,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getElseKeyword_5_0()); 

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
    // $ANTLR end "rule__FuncIfElse__Group_5__0__Impl"


    // $ANTLR start "rule__FuncIfElse__Group_5__1"
    // InternalGoatComponentsParser.g:8349:1: rule__FuncIfElse__Group_5__1 : rule__FuncIfElse__Group_5__1__Impl rule__FuncIfElse__Group_5__2 ;
    public final void rule__FuncIfElse__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8353:1: ( rule__FuncIfElse__Group_5__1__Impl rule__FuncIfElse__Group_5__2 )
            // InternalGoatComponentsParser.g:8354:2: rule__FuncIfElse__Group_5__1__Impl rule__FuncIfElse__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__FuncIfElse__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group_5__2();

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
    // $ANTLR end "rule__FuncIfElse__Group_5__1"


    // $ANTLR start "rule__FuncIfElse__Group_5__1__Impl"
    // InternalGoatComponentsParser.g:8361:1: rule__FuncIfElse__Group_5__1__Impl : ( If ) ;
    public final void rule__FuncIfElse__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8365:1: ( ( If ) )
            // InternalGoatComponentsParser.g:8366:1: ( If )
            {
            // InternalGoatComponentsParser.g:8366:1: ( If )
            // InternalGoatComponentsParser.g:8367:2: If
            {
             before(grammarAccess.getFuncIfElseAccess().getIfKeyword_5_1()); 
            match(input,If,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getIfKeyword_5_1()); 

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
    // $ANTLR end "rule__FuncIfElse__Group_5__1__Impl"


    // $ANTLR start "rule__FuncIfElse__Group_5__2"
    // InternalGoatComponentsParser.g:8376:1: rule__FuncIfElse__Group_5__2 : rule__FuncIfElse__Group_5__2__Impl rule__FuncIfElse__Group_5__3 ;
    public final void rule__FuncIfElse__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8380:1: ( rule__FuncIfElse__Group_5__2__Impl rule__FuncIfElse__Group_5__3 )
            // InternalGoatComponentsParser.g:8381:2: rule__FuncIfElse__Group_5__2__Impl rule__FuncIfElse__Group_5__3
            {
            pushFollow(FOLLOW_15);
            rule__FuncIfElse__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group_5__3();

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
    // $ANTLR end "rule__FuncIfElse__Group_5__2"


    // $ANTLR start "rule__FuncIfElse__Group_5__2__Impl"
    // InternalGoatComponentsParser.g:8388:1: rule__FuncIfElse__Group_5__2__Impl : ( LeftParenthesis ) ;
    public final void rule__FuncIfElse__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8392:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:8393:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:8393:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:8394:2: LeftParenthesis
            {
             before(grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_5_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_5_2()); 

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
    // $ANTLR end "rule__FuncIfElse__Group_5__2__Impl"


    // $ANTLR start "rule__FuncIfElse__Group_5__3"
    // InternalGoatComponentsParser.g:8403:1: rule__FuncIfElse__Group_5__3 : rule__FuncIfElse__Group_5__3__Impl rule__FuncIfElse__Group_5__4 ;
    public final void rule__FuncIfElse__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8407:1: ( rule__FuncIfElse__Group_5__3__Impl rule__FuncIfElse__Group_5__4 )
            // InternalGoatComponentsParser.g:8408:2: rule__FuncIfElse__Group_5__3__Impl rule__FuncIfElse__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__FuncIfElse__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group_5__4();

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
    // $ANTLR end "rule__FuncIfElse__Group_5__3"


    // $ANTLR start "rule__FuncIfElse__Group_5__3__Impl"
    // InternalGoatComponentsParser.g:8415:1: rule__FuncIfElse__Group_5__3__Impl : ( ( rule__FuncIfElse__TestAssignment_5_3 ) ) ;
    public final void rule__FuncIfElse__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8419:1: ( ( ( rule__FuncIfElse__TestAssignment_5_3 ) ) )
            // InternalGoatComponentsParser.g:8420:1: ( ( rule__FuncIfElse__TestAssignment_5_3 ) )
            {
            // InternalGoatComponentsParser.g:8420:1: ( ( rule__FuncIfElse__TestAssignment_5_3 ) )
            // InternalGoatComponentsParser.g:8421:2: ( rule__FuncIfElse__TestAssignment_5_3 )
            {
             before(grammarAccess.getFuncIfElseAccess().getTestAssignment_5_3()); 
            // InternalGoatComponentsParser.g:8422:2: ( rule__FuncIfElse__TestAssignment_5_3 )
            // InternalGoatComponentsParser.g:8422:3: rule__FuncIfElse__TestAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__TestAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getFuncIfElseAccess().getTestAssignment_5_3()); 

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
    // $ANTLR end "rule__FuncIfElse__Group_5__3__Impl"


    // $ANTLR start "rule__FuncIfElse__Group_5__4"
    // InternalGoatComponentsParser.g:8430:1: rule__FuncIfElse__Group_5__4 : rule__FuncIfElse__Group_5__4__Impl rule__FuncIfElse__Group_5__5 ;
    public final void rule__FuncIfElse__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8434:1: ( rule__FuncIfElse__Group_5__4__Impl rule__FuncIfElse__Group_5__5 )
            // InternalGoatComponentsParser.g:8435:2: rule__FuncIfElse__Group_5__4__Impl rule__FuncIfElse__Group_5__5
            {
            pushFollow(FOLLOW_17);
            rule__FuncIfElse__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group_5__5();

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
    // $ANTLR end "rule__FuncIfElse__Group_5__4"


    // $ANTLR start "rule__FuncIfElse__Group_5__4__Impl"
    // InternalGoatComponentsParser.g:8442:1: rule__FuncIfElse__Group_5__4__Impl : ( RightParenthesis ) ;
    public final void rule__FuncIfElse__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8446:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:8447:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:8447:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:8448:2: RightParenthesis
            {
             before(grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_5_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__FuncIfElse__Group_5__4__Impl"


    // $ANTLR start "rule__FuncIfElse__Group_5__5"
    // InternalGoatComponentsParser.g:8457:1: rule__FuncIfElse__Group_5__5 : rule__FuncIfElse__Group_5__5__Impl ;
    public final void rule__FuncIfElse__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8461:1: ( rule__FuncIfElse__Group_5__5__Impl )
            // InternalGoatComponentsParser.g:8462:2: rule__FuncIfElse__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group_5__5__Impl();

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
    // $ANTLR end "rule__FuncIfElse__Group_5__5"


    // $ANTLR start "rule__FuncIfElse__Group_5__5__Impl"
    // InternalGoatComponentsParser.g:8468:1: rule__FuncIfElse__Group_5__5__Impl : ( ( rule__FuncIfElse__ThenAssignment_5_5 ) ) ;
    public final void rule__FuncIfElse__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8472:1: ( ( ( rule__FuncIfElse__ThenAssignment_5_5 ) ) )
            // InternalGoatComponentsParser.g:8473:1: ( ( rule__FuncIfElse__ThenAssignment_5_5 ) )
            {
            // InternalGoatComponentsParser.g:8473:1: ( ( rule__FuncIfElse__ThenAssignment_5_5 ) )
            // InternalGoatComponentsParser.g:8474:2: ( rule__FuncIfElse__ThenAssignment_5_5 )
            {
             before(grammarAccess.getFuncIfElseAccess().getThenAssignment_5_5()); 
            // InternalGoatComponentsParser.g:8475:2: ( rule__FuncIfElse__ThenAssignment_5_5 )
            // InternalGoatComponentsParser.g:8475:3: rule__FuncIfElse__ThenAssignment_5_5
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__ThenAssignment_5_5();

            state._fsp--;


            }

             after(grammarAccess.getFuncIfElseAccess().getThenAssignment_5_5()); 

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
    // $ANTLR end "rule__FuncIfElse__Group_5__5__Impl"


    // $ANTLR start "rule__FuncIfElse__Group_6__0"
    // InternalGoatComponentsParser.g:8484:1: rule__FuncIfElse__Group_6__0 : rule__FuncIfElse__Group_6__0__Impl rule__FuncIfElse__Group_6__1 ;
    public final void rule__FuncIfElse__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8488:1: ( rule__FuncIfElse__Group_6__0__Impl rule__FuncIfElse__Group_6__1 )
            // InternalGoatComponentsParser.g:8489:2: rule__FuncIfElse__Group_6__0__Impl rule__FuncIfElse__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__FuncIfElse__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group_6__1();

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
    // $ANTLR end "rule__FuncIfElse__Group_6__0"


    // $ANTLR start "rule__FuncIfElse__Group_6__0__Impl"
    // InternalGoatComponentsParser.g:8496:1: rule__FuncIfElse__Group_6__0__Impl : ( Else ) ;
    public final void rule__FuncIfElse__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8500:1: ( ( Else ) )
            // InternalGoatComponentsParser.g:8501:1: ( Else )
            {
            // InternalGoatComponentsParser.g:8501:1: ( Else )
            // InternalGoatComponentsParser.g:8502:2: Else
            {
             before(grammarAccess.getFuncIfElseAccess().getElseKeyword_6_0()); 
            match(input,Else,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getElseKeyword_6_0()); 

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
    // $ANTLR end "rule__FuncIfElse__Group_6__0__Impl"


    // $ANTLR start "rule__FuncIfElse__Group_6__1"
    // InternalGoatComponentsParser.g:8511:1: rule__FuncIfElse__Group_6__1 : rule__FuncIfElse__Group_6__1__Impl ;
    public final void rule__FuncIfElse__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8515:1: ( rule__FuncIfElse__Group_6__1__Impl )
            // InternalGoatComponentsParser.g:8516:2: rule__FuncIfElse__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group_6__1__Impl();

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
    // $ANTLR end "rule__FuncIfElse__Group_6__1"


    // $ANTLR start "rule__FuncIfElse__Group_6__1__Impl"
    // InternalGoatComponentsParser.g:8522:1: rule__FuncIfElse__Group_6__1__Impl : ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) ) ;
    public final void rule__FuncIfElse__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8526:1: ( ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) ) )
            // InternalGoatComponentsParser.g:8527:1: ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) )
            {
            // InternalGoatComponentsParser.g:8527:1: ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) )
            // InternalGoatComponentsParser.g:8528:2: ( rule__FuncIfElse__ElseBranchAssignment_6_1 )
            {
             before(grammarAccess.getFuncIfElseAccess().getElseBranchAssignment_6_1()); 
            // InternalGoatComponentsParser.g:8529:2: ( rule__FuncIfElse__ElseBranchAssignment_6_1 )
            // InternalGoatComponentsParser.g:8529:3: rule__FuncIfElse__ElseBranchAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__ElseBranchAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncIfElseAccess().getElseBranchAssignment_6_1()); 

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
    // $ANTLR end "rule__FuncIfElse__Group_6__1__Impl"


    // $ANTLR start "rule__FuncReturn__Group__0"
    // InternalGoatComponentsParser.g:8538:1: rule__FuncReturn__Group__0 : rule__FuncReturn__Group__0__Impl rule__FuncReturn__Group__1 ;
    public final void rule__FuncReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8542:1: ( rule__FuncReturn__Group__0__Impl rule__FuncReturn__Group__1 )
            // InternalGoatComponentsParser.g:8543:2: rule__FuncReturn__Group__0__Impl rule__FuncReturn__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__FuncReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncReturn__Group__1();

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
    // $ANTLR end "rule__FuncReturn__Group__0"


    // $ANTLR start "rule__FuncReturn__Group__0__Impl"
    // InternalGoatComponentsParser.g:8550:1: rule__FuncReturn__Group__0__Impl : ( Return ) ;
    public final void rule__FuncReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8554:1: ( ( Return ) )
            // InternalGoatComponentsParser.g:8555:1: ( Return )
            {
            // InternalGoatComponentsParser.g:8555:1: ( Return )
            // InternalGoatComponentsParser.g:8556:2: Return
            {
             before(grammarAccess.getFuncReturnAccess().getReturnKeyword_0()); 
            match(input,Return,FOLLOW_2); 
             after(grammarAccess.getFuncReturnAccess().getReturnKeyword_0()); 

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
    // $ANTLR end "rule__FuncReturn__Group__0__Impl"


    // $ANTLR start "rule__FuncReturn__Group__1"
    // InternalGoatComponentsParser.g:8565:1: rule__FuncReturn__Group__1 : rule__FuncReturn__Group__1__Impl ;
    public final void rule__FuncReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8569:1: ( rule__FuncReturn__Group__1__Impl )
            // InternalGoatComponentsParser.g:8570:2: rule__FuncReturn__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncReturn__Group__1__Impl();

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
    // $ANTLR end "rule__FuncReturn__Group__1"


    // $ANTLR start "rule__FuncReturn__Group__1__Impl"
    // InternalGoatComponentsParser.g:8576:1: rule__FuncReturn__Group__1__Impl : ( ( rule__FuncReturn__ValAssignment_1 ) ) ;
    public final void rule__FuncReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8580:1: ( ( ( rule__FuncReturn__ValAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:8581:1: ( ( rule__FuncReturn__ValAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:8581:1: ( ( rule__FuncReturn__ValAssignment_1 ) )
            // InternalGoatComponentsParser.g:8582:2: ( rule__FuncReturn__ValAssignment_1 )
            {
             before(grammarAccess.getFuncReturnAccess().getValAssignment_1()); 
            // InternalGoatComponentsParser.g:8583:2: ( rule__FuncReturn__ValAssignment_1 )
            // InternalGoatComponentsParser.g:8583:3: rule__FuncReturn__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncReturn__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncReturnAccess().getValAssignment_1()); 

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
    // $ANTLR end "rule__FuncReturn__Group__1__Impl"


    // $ANTLR start "rule__Model__ProcessesAssignment_1_0"
    // InternalGoatComponentsParser.g:8592:1: rule__Model__ProcessesAssignment_1_0 : ( ruleProcessDefinition ) ;
    public final void rule__Model__ProcessesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8596:1: ( ( ruleProcessDefinition ) )
            // InternalGoatComponentsParser.g:8597:2: ( ruleProcessDefinition )
            {
            // InternalGoatComponentsParser.g:8597:2: ( ruleProcessDefinition )
            // InternalGoatComponentsParser.g:8598:3: ruleProcessDefinition
            {
             before(grammarAccess.getModelAccess().getProcessesProcessDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProcessesProcessDefinitionParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Model__ProcessesAssignment_1_0"


    // $ANTLR start "rule__Model__ComponentsAssignment_1_1"
    // InternalGoatComponentsParser.g:8607:1: rule__Model__ComponentsAssignment_1_1 : ( ruleComponentDefinition ) ;
    public final void rule__Model__ComponentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8611:1: ( ( ruleComponentDefinition ) )
            // InternalGoatComponentsParser.g:8612:2: ( ruleComponentDefinition )
            {
            // InternalGoatComponentsParser.g:8612:2: ( ruleComponentDefinition )
            // InternalGoatComponentsParser.g:8613:3: ruleComponentDefinition
            {
             before(grammarAccess.getModelAccess().getComponentsComponentDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComponentsComponentDefinitionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Model__ComponentsAssignment_1_1"


    // $ANTLR start "rule__Model__FunctionsAssignment_1_2"
    // InternalGoatComponentsParser.g:8622:1: rule__Model__FunctionsAssignment_1_2 : ( ruleFuncDefinition ) ;
    public final void rule__Model__FunctionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8626:1: ( ( ruleFuncDefinition ) )
            // InternalGoatComponentsParser.g:8627:2: ( ruleFuncDefinition )
            {
            // InternalGoatComponentsParser.g:8627:2: ( ruleFuncDefinition )
            // InternalGoatComponentsParser.g:8628:3: ruleFuncDefinition
            {
             before(grammarAccess.getModelAccess().getFunctionsFuncDefinitionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFunctionsFuncDefinitionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Model__FunctionsAssignment_1_2"


    // $ANTLR start "rule__InterleavingProcess__SubProcsAssignment_2_1"
    // InternalGoatComponentsParser.g:8637:1: rule__InterleavingProcess__SubProcsAssignment_2_1 : ( ruleCallProcess ) ;
    public final void rule__InterleavingProcess__SubProcsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8641:1: ( ( ruleCallProcess ) )
            // InternalGoatComponentsParser.g:8642:2: ( ruleCallProcess )
            {
            // InternalGoatComponentsParser.g:8642:2: ( ruleCallProcess )
            // InternalGoatComponentsParser.g:8643:3: ruleCallProcess
            {
             before(grammarAccess.getInterleavingProcessAccess().getSubProcsCallProcessParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCallProcess();

            state._fsp--;

             after(grammarAccess.getInterleavingProcessAccess().getSubProcsCallProcessParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__InterleavingProcess__SubProcsAssignment_2_1"


    // $ANTLR start "rule__Preconditions__PrecondAssignment_1"
    // InternalGoatComponentsParser.g:8652:1: rule__Preconditions__PrecondAssignment_1 : ( ( rule__Preconditions__PrecondAlternatives_1_0 ) ) ;
    public final void rule__Preconditions__PrecondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8656:1: ( ( ( rule__Preconditions__PrecondAlternatives_1_0 ) ) )
            // InternalGoatComponentsParser.g:8657:2: ( ( rule__Preconditions__PrecondAlternatives_1_0 ) )
            {
            // InternalGoatComponentsParser.g:8657:2: ( ( rule__Preconditions__PrecondAlternatives_1_0 ) )
            // InternalGoatComponentsParser.g:8658:3: ( rule__Preconditions__PrecondAlternatives_1_0 )
            {
             before(grammarAccess.getPreconditionsAccess().getPrecondAlternatives_1_0()); 
            // InternalGoatComponentsParser.g:8659:3: ( rule__Preconditions__PrecondAlternatives_1_0 )
            // InternalGoatComponentsParser.g:8659:4: rule__Preconditions__PrecondAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Preconditions__PrecondAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionsAccess().getPrecondAlternatives_1_0()); 

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
    // $ANTLR end "rule__Preconditions__PrecondAssignment_1"


    // $ANTLR start "rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1"
    // InternalGoatComponentsParser.g:8667:1: rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 : ( ruleInputProcess ) ;
    public final void rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8671:1: ( ( ruleInputProcess ) )
            // InternalGoatComponentsParser.g:8672:2: ( ruleInputProcess )
            {
            // InternalGoatComponentsParser.g:8672:2: ( ruleInputProcess )
            // InternalGoatComponentsParser.g:8673:3: ruleInputProcess
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputsInputProcessParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputProcess();

            state._fsp--;

             after(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputsInputProcessParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1"


    // $ANTLR start "rule__InputProcessesPart__InputsAssignment_0"
    // InternalGoatComponentsParser.g:8682:1: rule__InputProcessesPart__InputsAssignment_0 : ( ruleInputProcess ) ;
    public final void rule__InputProcessesPart__InputsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8686:1: ( ( ruleInputProcess ) )
            // InternalGoatComponentsParser.g:8687:2: ( ruleInputProcess )
            {
            // InternalGoatComponentsParser.g:8687:2: ( ruleInputProcess )
            // InternalGoatComponentsParser.g:8688:3: ruleInputProcess
            {
             before(grammarAccess.getInputProcessesPartAccess().getInputsInputProcessParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInputProcess();

            state._fsp--;

             after(grammarAccess.getInputProcessesPartAccess().getInputsInputProcessParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__InputProcessesPart__InputsAssignment_0"


    // $ANTLR start "rule__InputProcessesPart__PrecondsAssignment_1_1"
    // InternalGoatComponentsParser.g:8697:1: rule__InputProcessesPart__PrecondsAssignment_1_1 : ( rulePreconditions ) ;
    public final void rule__InputProcessesPart__PrecondsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8701:1: ( ( rulePreconditions ) )
            // InternalGoatComponentsParser.g:8702:2: ( rulePreconditions )
            {
            // InternalGoatComponentsParser.g:8702:2: ( rulePreconditions )
            // InternalGoatComponentsParser.g:8703:3: rulePreconditions
            {
             before(grammarAccess.getInputProcessesPartAccess().getPrecondsPreconditionsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePreconditions();

            state._fsp--;

             after(grammarAccess.getInputProcessesPartAccess().getPrecondsPreconditionsParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__InputProcessesPart__PrecondsAssignment_1_1"


    // $ANTLR start "rule__InputProcessesPart__InputsAssignment_1_2"
    // InternalGoatComponentsParser.g:8712:1: rule__InputProcessesPart__InputsAssignment_1_2 : ( ruleInputProcess ) ;
    public final void rule__InputProcessesPart__InputsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8716:1: ( ( ruleInputProcess ) )
            // InternalGoatComponentsParser.g:8717:2: ( ruleInputProcess )
            {
            // InternalGoatComponentsParser.g:8717:2: ( ruleInputProcess )
            // InternalGoatComponentsParser.g:8718:3: ruleInputProcess
            {
             before(grammarAccess.getInputProcessesPartAccess().getInputsInputProcessParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInputProcess();

            state._fsp--;

             after(grammarAccess.getInputProcessesPartAccess().getInputsInputProcessParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__InputProcessesPart__InputsAssignment_1_2"


    // $ANTLR start "rule__InputProcess__Rec_predAssignment_3"
    // InternalGoatComponentsParser.g:8727:1: rule__InputProcess__Rec_predAssignment_3 : ( ruleExpression ) ;
    public final void rule__InputProcess__Rec_predAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8731:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8732:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8732:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8733:3: ruleExpression
            {
             before(grammarAccess.getInputProcessAccess().getRec_predExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInputProcessAccess().getRec_predExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InputProcess__Rec_predAssignment_3"


    // $ANTLR start "rule__InputProcess__MsgInPartsAssignment_6_0"
    // InternalGoatComponentsParser.g:8742:1: rule__InputProcess__MsgInPartsAssignment_6_0 : ( ruleAttributeToSet ) ;
    public final void rule__InputProcess__MsgInPartsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8746:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponentsParser.g:8747:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponentsParser.g:8747:2: ( ruleAttributeToSet )
            // InternalGoatComponentsParser.g:8748:3: ruleAttributeToSet
            {
             before(grammarAccess.getInputProcessAccess().getMsgInPartsAttributeToSetParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeToSet();

            state._fsp--;

             after(grammarAccess.getInputProcessAccess().getMsgInPartsAttributeToSetParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__InputProcess__MsgInPartsAssignment_6_0"


    // $ANTLR start "rule__InputProcess__MsgInPartsAssignment_6_1_1"
    // InternalGoatComponentsParser.g:8757:1: rule__InputProcess__MsgInPartsAssignment_6_1_1 : ( ruleAttributeToSet ) ;
    public final void rule__InputProcess__MsgInPartsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8761:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponentsParser.g:8762:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponentsParser.g:8762:2: ( ruleAttributeToSet )
            // InternalGoatComponentsParser.g:8763:3: ruleAttributeToSet
            {
             before(grammarAccess.getInputProcessAccess().getMsgInPartsAttributeToSetParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeToSet();

            state._fsp--;

             after(grammarAccess.getInputProcessAccess().getMsgInPartsAttributeToSetParserRuleCall_6_1_1_0()); 

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
    // $ANTLR end "rule__InputProcess__MsgInPartsAssignment_6_1_1"


    // $ANTLR start "rule__InputProcess__OutputAssignment_8"
    // InternalGoatComponentsParser.g:8772:1: rule__InputProcess__OutputAssignment_8 : ( rulePrintStatement ) ;
    public final void rule__InputProcess__OutputAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8776:1: ( ( rulePrintStatement ) )
            // InternalGoatComponentsParser.g:8777:2: ( rulePrintStatement )
            {
            // InternalGoatComponentsParser.g:8777:2: ( rulePrintStatement )
            // InternalGoatComponentsParser.g:8778:3: rulePrintStatement
            {
             before(grammarAccess.getInputProcessAccess().getOutputPrintStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePrintStatement();

            state._fsp--;

             after(grammarAccess.getInputProcessAccess().getOutputPrintStatementParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__InputProcess__OutputAssignment_8"


    // $ANTLR start "rule__InputProcess__NextAssignment_10"
    // InternalGoatComponentsParser.g:8787:1: rule__InputProcess__NextAssignment_10 : ( ruleNZCProcess ) ;
    public final void rule__InputProcess__NextAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8791:1: ( ( ruleNZCProcess ) )
            // InternalGoatComponentsParser.g:8792:2: ( ruleNZCProcess )
            {
            // InternalGoatComponentsParser.g:8792:2: ( ruleNZCProcess )
            // InternalGoatComponentsParser.g:8793:3: ruleNZCProcess
            {
             before(grammarAccess.getInputProcessAccess().getNextNZCProcessParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleNZCProcess();

            state._fsp--;

             after(grammarAccess.getInputProcessAccess().getNextNZCProcessParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__InputProcess__NextAssignment_10"


    // $ANTLR start "rule__OutputProcessPart__MsgOutPartsAssignment_2_0"
    // InternalGoatComponentsParser.g:8802:1: rule__OutputProcessPart__MsgOutPartsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__OutputProcessPart__MsgOutPartsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8806:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8807:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8807:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8808:3: ruleExpression
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsExpressionParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__MsgOutPartsAssignment_2_0"


    // $ANTLR start "rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1"
    // InternalGoatComponentsParser.g:8817:1: rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8821:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8822:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8822:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8823:3: ruleExpression
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsExpressionParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1"


    // $ANTLR start "rule__OutputProcessPart__Send_predAssignment_6"
    // InternalGoatComponentsParser.g:8832:1: rule__OutputProcessPart__Send_predAssignment_6 : ( ruleExpression ) ;
    public final void rule__OutputProcessPart__Send_predAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8836:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8837:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8837:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8838:3: ruleExpression
            {
             before(grammarAccess.getOutputProcessPartAccess().getSend_predExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getOutputProcessPartAccess().getSend_predExpressionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__Send_predAssignment_6"


    // $ANTLR start "rule__OutputProcessPart__OutputAssignment_8"
    // InternalGoatComponentsParser.g:8847:1: rule__OutputProcessPart__OutputAssignment_8 : ( rulePrintStatement ) ;
    public final void rule__OutputProcessPart__OutputAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8851:1: ( ( rulePrintStatement ) )
            // InternalGoatComponentsParser.g:8852:2: ( rulePrintStatement )
            {
            // InternalGoatComponentsParser.g:8852:2: ( rulePrintStatement )
            // InternalGoatComponentsParser.g:8853:3: rulePrintStatement
            {
             before(grammarAccess.getOutputProcessPartAccess().getOutputPrintStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePrintStatement();

            state._fsp--;

             after(grammarAccess.getOutputProcessPartAccess().getOutputPrintStatementParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__OutputAssignment_8"


    // $ANTLR start "rule__OutputProcessPart__MsecAssignment_9_2"
    // InternalGoatComponentsParser.g:8862:1: rule__OutputProcessPart__MsecAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__OutputProcessPart__MsecAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8866:1: ( ( RULE_INT ) )
            // InternalGoatComponentsParser.g:8867:2: ( RULE_INT )
            {
            // InternalGoatComponentsParser.g:8867:2: ( RULE_INT )
            // InternalGoatComponentsParser.g:8868:3: RULE_INT
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsecINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getMsecINTTerminalRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__MsecAssignment_9_2"


    // $ANTLR start "rule__OutputProcessPart__NextAssignment_11"
    // InternalGoatComponentsParser.g:8877:1: rule__OutputProcessPart__NextAssignment_11 : ( ruleProc ) ;
    public final void rule__OutputProcessPart__NextAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8881:1: ( ( ruleProc ) )
            // InternalGoatComponentsParser.g:8882:2: ( ruleProc )
            {
            // InternalGoatComponentsParser.g:8882:2: ( ruleProc )
            // InternalGoatComponentsParser.g:8883:3: ruleProc
            {
             before(grammarAccess.getOutputProcessPartAccess().getNextProcParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleProc();

            state._fsp--;

             after(grammarAccess.getOutputProcessPartAccess().getNextProcParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__OutputProcessPart__NextAssignment_11"


    // $ANTLR start "rule__PrintFormattedStatement__ToPrintAssignment_3"
    // InternalGoatComponentsParser.g:8892:1: rule__PrintFormattedStatement__ToPrintAssignment_3 : ( RULE_STRING ) ;
    public final void rule__PrintFormattedStatement__ToPrintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8896:1: ( ( RULE_STRING ) )
            // InternalGoatComponentsParser.g:8897:2: ( RULE_STRING )
            {
            // InternalGoatComponentsParser.g:8897:2: ( RULE_STRING )
            // InternalGoatComponentsParser.g:8898:3: RULE_STRING
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getToPrintSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrintFormattedStatementAccess().getToPrintSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__PrintFormattedStatement__ToPrintAssignment_3"


    // $ANTLR start "rule__IfProcesses__BranchesAssignment_1"
    // InternalGoatComponentsParser.g:8907:1: rule__IfProcesses__BranchesAssignment_1 : ( ruleIfBranchProcess ) ;
    public final void rule__IfProcesses__BranchesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8911:1: ( ( ruleIfBranchProcess ) )
            // InternalGoatComponentsParser.g:8912:2: ( ruleIfBranchProcess )
            {
            // InternalGoatComponentsParser.g:8912:2: ( ruleIfBranchProcess )
            // InternalGoatComponentsParser.g:8913:3: ruleIfBranchProcess
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesIfBranchProcessParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIfBranchProcess();

            state._fsp--;

             after(grammarAccess.getIfProcessesAccess().getBranchesIfBranchProcessParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IfProcesses__BranchesAssignment_1"


    // $ANTLR start "rule__IfProcesses__BranchesAssignment_2_1"
    // InternalGoatComponentsParser.g:8922:1: rule__IfProcesses__BranchesAssignment_2_1 : ( ruleIfBranchProcess ) ;
    public final void rule__IfProcesses__BranchesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8926:1: ( ( ruleIfBranchProcess ) )
            // InternalGoatComponentsParser.g:8927:2: ( ruleIfBranchProcess )
            {
            // InternalGoatComponentsParser.g:8927:2: ( ruleIfBranchProcess )
            // InternalGoatComponentsParser.g:8928:3: ruleIfBranchProcess
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesIfBranchProcessParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIfBranchProcess();

            state._fsp--;

             after(grammarAccess.getIfProcessesAccess().getBranchesIfBranchProcessParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__IfProcesses__BranchesAssignment_2_1"


    // $ANTLR start "rule__IfProcesses__BranchesAssignment_3_1"
    // InternalGoatComponentsParser.g:8937:1: rule__IfProcesses__BranchesAssignment_3_1 : ( ruleElseBranchProcess ) ;
    public final void rule__IfProcesses__BranchesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8941:1: ( ( ruleElseBranchProcess ) )
            // InternalGoatComponentsParser.g:8942:2: ( ruleElseBranchProcess )
            {
            // InternalGoatComponentsParser.g:8942:2: ( ruleElseBranchProcess )
            // InternalGoatComponentsParser.g:8943:3: ruleElseBranchProcess
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesElseBranchProcessParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElseBranchProcess();

            state._fsp--;

             after(grammarAccess.getIfProcessesAccess().getBranchesElseBranchProcessParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__IfProcesses__BranchesAssignment_3_1"


    // $ANTLR start "rule__IfBranchProcess__CondAssignment_2"
    // InternalGoatComponentsParser.g:8952:1: rule__IfBranchProcess__CondAssignment_2 : ( rulePreconditions ) ;
    public final void rule__IfBranchProcess__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8956:1: ( ( rulePreconditions ) )
            // InternalGoatComponentsParser.g:8957:2: ( rulePreconditions )
            {
            // InternalGoatComponentsParser.g:8957:2: ( rulePreconditions )
            // InternalGoatComponentsParser.g:8958:3: rulePreconditions
            {
             before(grammarAccess.getIfBranchProcessAccess().getCondPreconditionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePreconditions();

            state._fsp--;

             after(grammarAccess.getIfBranchProcessAccess().getCondPreconditionsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__IfBranchProcess__CondAssignment_2"


    // $ANTLR start "rule__IfBranchProcess__ThenAssignment_4"
    // InternalGoatComponentsParser.g:8967:1: rule__IfBranchProcess__ThenAssignment_4 : ( rulePredOutputProcessOrInputProcess ) ;
    public final void rule__IfBranchProcess__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8971:1: ( ( rulePredOutputProcessOrInputProcess ) )
            // InternalGoatComponentsParser.g:8972:2: ( rulePredOutputProcessOrInputProcess )
            {
            // InternalGoatComponentsParser.g:8972:2: ( rulePredOutputProcessOrInputProcess )
            // InternalGoatComponentsParser.g:8973:3: rulePredOutputProcessOrInputProcess
            {
             before(grammarAccess.getIfBranchProcessAccess().getThenPredOutputProcessOrInputProcessParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredOutputProcessOrInputProcess();

            state._fsp--;

             after(grammarAccess.getIfBranchProcessAccess().getThenPredOutputProcessOrInputProcessParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IfBranchProcess__ThenAssignment_4"


    // $ANTLR start "rule__ElseBranchProcess__ThenAssignment_2"
    // InternalGoatComponentsParser.g:8982:1: rule__ElseBranchProcess__ThenAssignment_2 : ( rulePredOutputProcessOrInputProcess ) ;
    public final void rule__ElseBranchProcess__ThenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8986:1: ( ( rulePredOutputProcessOrInputProcess ) )
            // InternalGoatComponentsParser.g:8987:2: ( rulePredOutputProcessOrInputProcess )
            {
            // InternalGoatComponentsParser.g:8987:2: ( rulePredOutputProcessOrInputProcess )
            // InternalGoatComponentsParser.g:8988:3: rulePredOutputProcessOrInputProcess
            {
             before(grammarAccess.getElseBranchProcessAccess().getThenPredOutputProcessOrInputProcessParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePredOutputProcessOrInputProcess();

            state._fsp--;

             after(grammarAccess.getElseBranchProcessAccess().getThenPredOutputProcessOrInputProcessParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ElseBranchProcess__ThenAssignment_2"


    // $ANTLR start "rule__Update__VarsAssignment_1"
    // InternalGoatComponentsParser.g:8997:1: rule__Update__VarsAssignment_1 : ( ruleAttributeToSet ) ;
    public final void rule__Update__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9001:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponentsParser.g:9002:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponentsParser.g:9002:2: ( ruleAttributeToSet )
            // InternalGoatComponentsParser.g:9003:3: ruleAttributeToSet
            {
             before(grammarAccess.getUpdateAccess().getVarsAttributeToSetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeToSet();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getVarsAttributeToSetParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Update__VarsAssignment_1"


    // $ANTLR start "rule__Update__ValsAssignment_3"
    // InternalGoatComponentsParser.g:9012:1: rule__Update__ValsAssignment_3 : ( ruleExpression ) ;
    public final void rule__Update__ValsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9016:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9017:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9017:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9018:3: ruleExpression
            {
             before(grammarAccess.getUpdateAccess().getValsExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getValsExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Update__ValsAssignment_3"


    // $ANTLR start "rule__Update__VarsAssignment_4_1"
    // InternalGoatComponentsParser.g:9027:1: rule__Update__VarsAssignment_4_1 : ( ruleAttributeToSet ) ;
    public final void rule__Update__VarsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9031:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponentsParser.g:9032:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponentsParser.g:9032:2: ( ruleAttributeToSet )
            // InternalGoatComponentsParser.g:9033:3: ruleAttributeToSet
            {
             before(grammarAccess.getUpdateAccess().getVarsAttributeToSetParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeToSet();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getVarsAttributeToSetParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Update__VarsAssignment_4_1"


    // $ANTLR start "rule__Update__ValsAssignment_4_3"
    // InternalGoatComponentsParser.g:9042:1: rule__Update__ValsAssignment_4_3 : ( ruleExpression ) ;
    public final void rule__Update__ValsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9046:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9047:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9047:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9048:3: ruleExpression
            {
             before(grammarAccess.getUpdateAccess().getValsExpressionParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getValsExpressionParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Update__ValsAssignment_4_3"


    // $ANTLR start "rule__Awareness__PredAssignment_3"
    // InternalGoatComponentsParser.g:9057:1: rule__Awareness__PredAssignment_3 : ( ruleExpression ) ;
    public final void rule__Awareness__PredAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9061:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9062:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9062:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9063:3: ruleExpression
            {
             before(grammarAccess.getAwarenessAccess().getPredExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAwarenessAccess().getPredExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Awareness__PredAssignment_3"


    // $ANTLR start "rule__CallProcess__ProcnameAssignment_1"
    // InternalGoatComponentsParser.g:9072:1: rule__CallProcess__ProcnameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CallProcess__ProcnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9076:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:9077:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:9077:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9078:3: ( RULE_ID )
            {
             before(grammarAccess.getCallProcessAccess().getProcnameProcessDefinitionCrossReference_1_0()); 
            // InternalGoatComponentsParser.g:9079:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:9080:4: RULE_ID
            {
             before(grammarAccess.getCallProcessAccess().getProcnameProcessDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCallProcessAccess().getProcnameProcessDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCallProcessAccess().getProcnameProcessDefinitionCrossReference_1_0()); 

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
    // $ANTLR end "rule__CallProcess__ProcnameAssignment_1"


    // $ANTLR start "rule__ProcessDefinition__NameAssignment_1"
    // InternalGoatComponentsParser.g:9091:1: rule__ProcessDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProcessDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9095:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9096:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9096:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9097:3: RULE_ID
            {
             before(grammarAccess.getProcessDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ProcessDefinition__NameAssignment_1"


    // $ANTLR start "rule__ProcessDefinition__ProcAssignment_3"
    // InternalGoatComponentsParser.g:9106:1: rule__ProcessDefinition__ProcAssignment_3 : ( ruleProc ) ;
    public final void rule__ProcessDefinition__ProcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9110:1: ( ( ruleProc ) )
            // InternalGoatComponentsParser.g:9111:2: ( ruleProc )
            {
            // InternalGoatComponentsParser.g:9111:2: ( ruleProc )
            // InternalGoatComponentsParser.g:9112:3: ruleProc
            {
             before(grammarAccess.getProcessDefinitionAccess().getProcProcParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProc();

            state._fsp--;

             after(grammarAccess.getProcessDefinitionAccess().getProcProcParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ProcessDefinition__ProcAssignment_3"


    // $ANTLR start "rule__EnvInitValue__ValueAssignment_0_1"
    // InternalGoatComponentsParser.g:9121:1: rule__EnvInitValue__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__EnvInitValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9125:1: ( ( RULE_INT ) )
            // InternalGoatComponentsParser.g:9126:2: ( RULE_INT )
            {
            // InternalGoatComponentsParser.g:9126:2: ( RULE_INT )
            // InternalGoatComponentsParser.g:9127:3: RULE_INT
            {
             before(grammarAccess.getEnvInitValueAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnvInitValueAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__EnvInitValue__ValueAssignment_0_1"


    // $ANTLR start "rule__EnvInitValue__ValueAssignment_1_1"
    // InternalGoatComponentsParser.g:9136:1: rule__EnvInitValue__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__EnvInitValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9140:1: ( ( RULE_STRING ) )
            // InternalGoatComponentsParser.g:9141:2: ( RULE_STRING )
            {
            // InternalGoatComponentsParser.g:9141:2: ( RULE_STRING )
            // InternalGoatComponentsParser.g:9142:3: RULE_STRING
            {
             before(grammarAccess.getEnvInitValueAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnvInitValueAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EnvInitValue__ValueAssignment_1_1"


    // $ANTLR start "rule__EnvInitValue__ValueAssignment_2_1"
    // InternalGoatComponentsParser.g:9151:1: rule__EnvInitValue__ValueAssignment_2_1 : ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__EnvInitValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9155:1: ( ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) ) )
            // InternalGoatComponentsParser.g:9156:2: ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) )
            {
            // InternalGoatComponentsParser.g:9156:2: ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) )
            // InternalGoatComponentsParser.g:9157:3: ( rule__EnvInitValue__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAlternatives_2_1_0()); 
            // InternalGoatComponentsParser.g:9158:3: ( rule__EnvInitValue__ValueAlternatives_2_1_0 )
            // InternalGoatComponentsParser.g:9158:4: rule__EnvInitValue__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EnvInitValue__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEnvInitValueAccess().getValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__EnvInitValue__ValueAssignment_2_1"


    // $ANTLR start "rule__Environment__AttrsAssignment_2_0"
    // InternalGoatComponentsParser.g:9166:1: rule__Environment__AttrsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Environment__AttrsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9170:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9171:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9171:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9172:3: RULE_ID
            {
             before(grammarAccess.getEnvironmentAccess().getAttrsIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getAttrsIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Environment__AttrsAssignment_2_0"


    // $ANTLR start "rule__Environment__ValsAssignment_2_2"
    // InternalGoatComponentsParser.g:9181:1: rule__Environment__ValsAssignment_2_2 : ( ruleEnvInitValue ) ;
    public final void rule__Environment__ValsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9185:1: ( ( ruleEnvInitValue ) )
            // InternalGoatComponentsParser.g:9186:2: ( ruleEnvInitValue )
            {
            // InternalGoatComponentsParser.g:9186:2: ( ruleEnvInitValue )
            // InternalGoatComponentsParser.g:9187:3: ruleEnvInitValue
            {
             before(grammarAccess.getEnvironmentAccess().getValsEnvInitValueParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvInitValue();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getValsEnvInitValueParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Environment__ValsAssignment_2_2"


    // $ANTLR start "rule__Environment__AttrsAssignment_2_3_1"
    // InternalGoatComponentsParser.g:9196:1: rule__Environment__AttrsAssignment_2_3_1 : ( RULE_ID ) ;
    public final void rule__Environment__AttrsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9200:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9201:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9201:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9202:3: RULE_ID
            {
             before(grammarAccess.getEnvironmentAccess().getAttrsIDTerminalRuleCall_2_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getAttrsIDTerminalRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__Environment__AttrsAssignment_2_3_1"


    // $ANTLR start "rule__Environment__ValsAssignment_2_3_3"
    // InternalGoatComponentsParser.g:9211:1: rule__Environment__ValsAssignment_2_3_3 : ( ruleEnvInitValue ) ;
    public final void rule__Environment__ValsAssignment_2_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9215:1: ( ( ruleEnvInitValue ) )
            // InternalGoatComponentsParser.g:9216:2: ( ruleEnvInitValue )
            {
            // InternalGoatComponentsParser.g:9216:2: ( ruleEnvInitValue )
            // InternalGoatComponentsParser.g:9217:3: ruleEnvInitValue
            {
             before(grammarAccess.getEnvironmentAccess().getValsEnvInitValueParserRuleCall_2_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvInitValue();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getValsEnvInitValueParserRuleCall_2_3_3_0()); 

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
    // $ANTLR end "rule__Environment__ValsAssignment_2_3_3"


    // $ANTLR start "rule__ComponentDefinition__EnvAssignment_1"
    // InternalGoatComponentsParser.g:9226:1: rule__ComponentDefinition__EnvAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__ComponentDefinition__EnvAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9230:1: ( ( ruleEnvironment ) )
            // InternalGoatComponentsParser.g:9231:2: ( ruleEnvironment )
            {
            // InternalGoatComponentsParser.g:9231:2: ( ruleEnvironment )
            // InternalGoatComponentsParser.g:9232:3: ruleEnvironment
            {
             before(grammarAccess.getComponentDefinitionAccess().getEnvEnvironmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionAccess().getEnvEnvironmentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComponentDefinition__EnvAssignment_1"


    // $ANTLR start "rule__ComponentDefinition__ProcAssignment_2"
    // InternalGoatComponentsParser.g:9241:1: rule__ComponentDefinition__ProcAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentDefinition__ProcAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9245:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:9246:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:9246:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9247:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentDefinitionAccess().getProcProcessDefinitionCrossReference_2_0()); 
            // InternalGoatComponentsParser.g:9248:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:9249:4: RULE_ID
            {
             before(grammarAccess.getComponentDefinitionAccess().getProcProcessDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getProcProcessDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getComponentDefinitionAccess().getProcProcessDefinitionCrossReference_2_0()); 

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
    // $ANTLR end "rule__ComponentDefinition__ProcAssignment_2"


    // $ANTLR start "rule__ComponentDefinition__AddressAssignment_4"
    // InternalGoatComponentsParser.g:9260:1: rule__ComponentDefinition__AddressAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ComponentDefinition__AddressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9264:1: ( ( RULE_STRING ) )
            // InternalGoatComponentsParser.g:9265:2: ( RULE_STRING )
            {
            // InternalGoatComponentsParser.g:9265:2: ( RULE_STRING )
            // InternalGoatComponentsParser.g:9266:3: RULE_STRING
            {
             before(grammarAccess.getComponentDefinitionAccess().getAddressSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getAddressSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ComponentDefinition__AddressAssignment_4"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalGoatComponentsParser.g:9275:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9279:1: ( ( ruleAnd ) )
            // InternalGoatComponentsParser.g:9280:2: ( ruleAnd )
            {
            // InternalGoatComponentsParser.g:9280:2: ( ruleAnd )
            // InternalGoatComponentsParser.g:9281:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalGoatComponentsParser.g:9290:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9294:1: ( ( ruleEquality ) )
            // InternalGoatComponentsParser.g:9295:2: ( ruleEquality )
            {
            // InternalGoatComponentsParser.g:9295:2: ( ruleEquality )
            // InternalGoatComponentsParser.g:9296:3: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalGoatComponentsParser.g:9305:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9309:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalGoatComponentsParser.g:9310:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalGoatComponentsParser.g:9310:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalGoatComponentsParser.g:9311:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalGoatComponentsParser.g:9312:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalGoatComponentsParser.g:9312:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalGoatComponentsParser.g:9320:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9324:1: ( ( ruleComparison ) )
            // InternalGoatComponentsParser.g:9325:2: ( ruleComparison )
            {
            // InternalGoatComponentsParser.g:9325:2: ( ruleComparison )
            // InternalGoatComponentsParser.g:9326:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // InternalGoatComponentsParser.g:9335:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9339:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalGoatComponentsParser.g:9340:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalGoatComponentsParser.g:9340:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalGoatComponentsParser.g:9341:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalGoatComponentsParser.g:9342:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalGoatComponentsParser.g:9342:4: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalGoatComponentsParser.g:9350:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9354:1: ( ( rulePlusOrMinus ) )
            // InternalGoatComponentsParser.g:9355:2: ( rulePlusOrMinus )
            {
            // InternalGoatComponentsParser.g:9355:2: ( rulePlusOrMinus )
            // InternalGoatComponentsParser.g:9356:3: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalGoatComponentsParser.g:9365:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9369:1: ( ( ruleMulOrDiv ) )
            // InternalGoatComponentsParser.g:9370:2: ( ruleMulOrDiv )
            {
            // InternalGoatComponentsParser.g:9370:2: ( ruleMulOrDiv )
            // InternalGoatComponentsParser.g:9371:3: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_1"
    // InternalGoatComponentsParser.g:9380:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9384:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalGoatComponentsParser.g:9385:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalGoatComponentsParser.g:9385:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalGoatComponentsParser.g:9386:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalGoatComponentsParser.g:9387:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalGoatComponentsParser.g:9387:4: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_2"
    // InternalGoatComponentsParser.g:9395:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9399:1: ( ( rulePrimary ) )
            // InternalGoatComponentsParser.g:9400:2: ( rulePrimary )
            {
            // InternalGoatComponentsParser.g:9400:2: ( rulePrimary )
            // InternalGoatComponentsParser.g:9401:3: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_3"
    // InternalGoatComponentsParser.g:9410:1: rule__Primary__ExpressionAssignment_1_3 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9414:1: ( ( rulePrimary ) )
            // InternalGoatComponentsParser.g:9415:2: ( rulePrimary )
            {
            // InternalGoatComponentsParser.g:9415:2: ( rulePrimary )
            // InternalGoatComponentsParser.g:9416:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_3"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalGoatComponentsParser.g:9425:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9429:1: ( ( RULE_INT ) )
            // InternalGoatComponentsParser.g:9430:2: ( RULE_INT )
            {
            // InternalGoatComponentsParser.g:9430:2: ( RULE_INT )
            // InternalGoatComponentsParser.g:9431:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalGoatComponentsParser.g:9440:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9444:1: ( ( RULE_STRING ) )
            // InternalGoatComponentsParser.g:9445:2: ( RULE_STRING )
            {
            // InternalGoatComponentsParser.g:9445:2: ( RULE_STRING )
            // InternalGoatComponentsParser.g:9446:3: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalGoatComponentsParser.g:9455:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9459:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalGoatComponentsParser.g:9460:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalGoatComponentsParser.g:9460:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalGoatComponentsParser.g:9461:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalGoatComponentsParser.g:9462:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalGoatComponentsParser.g:9462:4: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__RefAssignment_3_1"
    // InternalGoatComponentsParser.g:9470:1: rule__Atomic__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9474:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:9475:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:9475:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9476:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getRefLRefCrossReference_3_1_0()); 
            // InternalGoatComponentsParser.g:9477:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:9478:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getRefLRefIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getRefLRefIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getRefLRefCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Atomic__RefAssignment_3_1"


    // $ANTLR start "rule__Atomic__AttributeAssignment_4_3"
    // InternalGoatComponentsParser.g:9489:1: rule__Atomic__AttributeAssignment_4_3 : ( RULE_ID ) ;
    public final void rule__Atomic__AttributeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9493:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9494:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9494:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9495:3: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getAttributeIDTerminalRuleCall_4_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getAttributeIDTerminalRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Atomic__AttributeAssignment_4_3"


    // $ANTLR start "rule__Atomic__FunctionAssignment_5_1"
    // InternalGoatComponentsParser.g:9504:1: rule__Atomic__FunctionAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__FunctionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9508:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:9509:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:9509:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9510:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getFunctionFuncDefinitionCrossReference_5_1_0()); 
            // InternalGoatComponentsParser.g:9511:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:9512:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getFunctionFuncDefinitionIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getFunctionFuncDefinitionIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getFunctionFuncDefinitionCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Atomic__FunctionAssignment_5_1"


    // $ANTLR start "rule__Atomic__ParamsAssignment_5_3_0"
    // InternalGoatComponentsParser.g:9523:1: rule__Atomic__ParamsAssignment_5_3_0 : ( ruleExpression ) ;
    public final void rule__Atomic__ParamsAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9527:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9528:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9528:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9529:3: ruleExpression
            {
             before(grammarAccess.getAtomicAccess().getParamsExpressionParserRuleCall_5_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getParamsExpressionParserRuleCall_5_3_0_0()); 

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
    // $ANTLR end "rule__Atomic__ParamsAssignment_5_3_0"


    // $ANTLR start "rule__Atomic__ParamsAssignment_5_3_1_1"
    // InternalGoatComponentsParser.g:9538:1: rule__Atomic__ParamsAssignment_5_3_1_1 : ( ruleExpression ) ;
    public final void rule__Atomic__ParamsAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9542:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9543:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9543:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9544:3: ruleExpression
            {
             before(grammarAccess.getAtomicAccess().getParamsExpressionParserRuleCall_5_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getParamsExpressionParserRuleCall_5_3_1_1_0()); 

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
    // $ANTLR end "rule__Atomic__ParamsAssignment_5_3_1_1"


    // $ANTLR start "rule__Atomic__AttributeAssignment_6_3"
    // InternalGoatComponentsParser.g:9553:1: rule__Atomic__AttributeAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__Atomic__AttributeAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9557:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9558:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9558:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9559:3: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getAttributeIDTerminalRuleCall_6_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getAttributeIDTerminalRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Atomic__AttributeAssignment_6_3"


    // $ANTLR start "rule__Atomic__AttributeAssignment_7_3"
    // InternalGoatComponentsParser.g:9568:1: rule__Atomic__AttributeAssignment_7_3 : ( RULE_ID ) ;
    public final void rule__Atomic__AttributeAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9572:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9573:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9573:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9574:3: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getAttributeIDTerminalRuleCall_7_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getAttributeIDTerminalRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__Atomic__AttributeAssignment_7_3"


    // $ANTLR start "rule__AttributeToSet__AttributeAssignment_0_3"
    // InternalGoatComponentsParser.g:9583:1: rule__AttributeToSet__AttributeAssignment_0_3 : ( RULE_ID ) ;
    public final void rule__AttributeToSet__AttributeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9587:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9588:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9588:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9589:3: RULE_ID
            {
             before(grammarAccess.getAttributeToSetAccess().getAttributeIDTerminalRuleCall_0_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeToSetAccess().getAttributeIDTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__AttributeToSet__AttributeAssignment_0_3"


    // $ANTLR start "rule__AttributeToSet__AttributeAssignment_1_3"
    // InternalGoatComponentsParser.g:9598:1: rule__AttributeToSet__AttributeAssignment_1_3 : ( RULE_ID ) ;
    public final void rule__AttributeToSet__AttributeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9602:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9603:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9603:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9604:3: RULE_ID
            {
             before(grammarAccess.getAttributeToSetAccess().getAttributeIDTerminalRuleCall_1_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeToSetAccess().getAttributeIDTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__AttributeToSet__AttributeAssignment_1_3"


    // $ANTLR start "rule__FuncParam__TypeAssignment_0"
    // InternalGoatComponentsParser.g:9613:1: rule__FuncParam__TypeAssignment_0 : ( RULE_TYPE ) ;
    public final void rule__FuncParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9617:1: ( ( RULE_TYPE ) )
            // InternalGoatComponentsParser.g:9618:2: ( RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:9618:2: ( RULE_TYPE )
            // InternalGoatComponentsParser.g:9619:3: RULE_TYPE
            {
             before(grammarAccess.getFuncParamAccess().getTypeTYPETerminalRuleCall_0_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getFuncParamAccess().getTypeTYPETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FuncParam__TypeAssignment_0"


    // $ANTLR start "rule__FuncParam__NameAssignment_1"
    // InternalGoatComponentsParser.g:9628:1: rule__FuncParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FuncParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9632:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9633:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9633:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9634:3: RULE_ID
            {
             before(grammarAccess.getFuncParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncParamAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FuncParam__NameAssignment_1"


    // $ANTLR start "rule__FuncDefinition__TypeAssignment_1"
    // InternalGoatComponentsParser.g:9643:1: rule__FuncDefinition__TypeAssignment_1 : ( RULE_TYPE ) ;
    public final void rule__FuncDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9647:1: ( ( RULE_TYPE ) )
            // InternalGoatComponentsParser.g:9648:2: ( RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:9648:2: ( RULE_TYPE )
            // InternalGoatComponentsParser.g:9649:3: RULE_TYPE
            {
             before(grammarAccess.getFuncDefinitionAccess().getTypeTYPETerminalRuleCall_1_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getFuncDefinitionAccess().getTypeTYPETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FuncDefinition__TypeAssignment_1"


    // $ANTLR start "rule__FuncDefinition__NameAssignment_2"
    // InternalGoatComponentsParser.g:9658:1: rule__FuncDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FuncDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9662:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9663:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9663:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9664:3: RULE_ID
            {
             before(grammarAccess.getFuncDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FuncDefinition__NameAssignment_2"


    // $ANTLR start "rule__FuncDefinition__ParamsAssignment_4_0"
    // InternalGoatComponentsParser.g:9673:1: rule__FuncDefinition__ParamsAssignment_4_0 : ( ruleFuncParam ) ;
    public final void rule__FuncDefinition__ParamsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9677:1: ( ( ruleFuncParam ) )
            // InternalGoatComponentsParser.g:9678:2: ( ruleFuncParam )
            {
            // InternalGoatComponentsParser.g:9678:2: ( ruleFuncParam )
            // InternalGoatComponentsParser.g:9679:3: ruleFuncParam
            {
             before(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncParam();

            state._fsp--;

             after(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__FuncDefinition__ParamsAssignment_4_0"


    // $ANTLR start "rule__FuncDefinition__ParamsAssignment_4_1_1"
    // InternalGoatComponentsParser.g:9688:1: rule__FuncDefinition__ParamsAssignment_4_1_1 : ( ruleFuncParam ) ;
    public final void rule__FuncDefinition__ParamsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9692:1: ( ( ruleFuncParam ) )
            // InternalGoatComponentsParser.g:9693:2: ( ruleFuncParam )
            {
            // InternalGoatComponentsParser.g:9693:2: ( ruleFuncParam )
            // InternalGoatComponentsParser.g:9694:3: ruleFuncParam
            {
             before(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncParam();

            state._fsp--;

             after(grammarAccess.getFuncDefinitionAccess().getParamsFuncParamParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__FuncDefinition__ParamsAssignment_4_1_1"


    // $ANTLR start "rule__FuncDefinition__BlkAssignment_6"
    // InternalGoatComponentsParser.g:9703:1: rule__FuncDefinition__BlkAssignment_6 : ( ruleFuncBlock ) ;
    public final void rule__FuncDefinition__BlkAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9707:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:9708:2: ( ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:9708:2: ( ruleFuncBlock )
            // InternalGoatComponentsParser.g:9709:3: ruleFuncBlock
            {
             before(grammarAccess.getFuncDefinitionAccess().getBlkFuncBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncBlock();

            state._fsp--;

             after(grammarAccess.getFuncDefinitionAccess().getBlkFuncBlockParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__FuncDefinition__BlkAssignment_6"


    // $ANTLR start "rule__FuncBlock__StatementsAssignment_2"
    // InternalGoatComponentsParser.g:9718:1: rule__FuncBlock__StatementsAssignment_2 : ( ruleFuncStatement ) ;
    public final void rule__FuncBlock__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9722:1: ( ( ruleFuncStatement ) )
            // InternalGoatComponentsParser.g:9723:2: ( ruleFuncStatement )
            {
            // InternalGoatComponentsParser.g:9723:2: ( ruleFuncStatement )
            // InternalGoatComponentsParser.g:9724:3: ruleFuncStatement
            {
             before(grammarAccess.getFuncBlockAccess().getStatementsFuncStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncStatement();

            state._fsp--;

             after(grammarAccess.getFuncBlockAccess().getStatementsFuncStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FuncBlock__StatementsAssignment_2"


    // $ANTLR start "rule__FuncVarDeclaration__NameAssignment_1"
    // InternalGoatComponentsParser.g:9733:1: rule__FuncVarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FuncVarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9737:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9738:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9738:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9739:3: RULE_ID
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FuncVarDeclaration__NameAssignment_1"


    // $ANTLR start "rule__FuncVarDeclaration__ValAssignment_3"
    // InternalGoatComponentsParser.g:9748:1: rule__FuncVarDeclaration__ValAssignment_3 : ( ruleExpression ) ;
    public final void rule__FuncVarDeclaration__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9752:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9753:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9753:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9754:3: ruleExpression
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getValExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFuncVarDeclarationAccess().getValExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FuncVarDeclaration__ValAssignment_3"


    // $ANTLR start "rule__FuncVarAssign__VarAssignment_0"
    // InternalGoatComponentsParser.g:9763:1: rule__FuncVarAssign__VarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FuncVarAssign__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9767:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:9768:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:9768:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9769:3: ( RULE_ID )
            {
             before(grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationCrossReference_0_0()); 
            // InternalGoatComponentsParser.g:9770:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:9771:4: RULE_ID
            {
             before(grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__FuncVarAssign__VarAssignment_0"


    // $ANTLR start "rule__FuncVarAssign__ValAssignment_2"
    // InternalGoatComponentsParser.g:9782:1: rule__FuncVarAssign__ValAssignment_2 : ( ruleExpression ) ;
    public final void rule__FuncVarAssign__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9786:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9787:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9787:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9788:3: ruleExpression
            {
             before(grammarAccess.getFuncVarAssignAccess().getValExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFuncVarAssignAccess().getValExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FuncVarAssign__ValAssignment_2"


    // $ANTLR start "rule__FuncIfElse__TestAssignment_2"
    // InternalGoatComponentsParser.g:9797:1: rule__FuncIfElse__TestAssignment_2 : ( ruleExpression ) ;
    public final void rule__FuncIfElse__TestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9801:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9802:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9802:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9803:3: ruleExpression
            {
             before(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FuncIfElse__TestAssignment_2"


    // $ANTLR start "rule__FuncIfElse__ThenAssignment_4"
    // InternalGoatComponentsParser.g:9812:1: rule__FuncIfElse__ThenAssignment_4 : ( ruleFuncBlock ) ;
    public final void rule__FuncIfElse__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9816:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:9817:2: ( ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:9817:2: ( ruleFuncBlock )
            // InternalGoatComponentsParser.g:9818:3: ruleFuncBlock
            {
             before(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncBlock();

            state._fsp--;

             after(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FuncIfElse__ThenAssignment_4"


    // $ANTLR start "rule__FuncIfElse__TestAssignment_5_3"
    // InternalGoatComponentsParser.g:9827:1: rule__FuncIfElse__TestAssignment_5_3 : ( ruleExpression ) ;
    public final void rule__FuncIfElse__TestAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9831:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9832:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9832:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9833:3: ruleExpression
            {
             before(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_5_3_0()); 

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
    // $ANTLR end "rule__FuncIfElse__TestAssignment_5_3"


    // $ANTLR start "rule__FuncIfElse__ThenAssignment_5_5"
    // InternalGoatComponentsParser.g:9842:1: rule__FuncIfElse__ThenAssignment_5_5 : ( ruleFuncBlock ) ;
    public final void rule__FuncIfElse__ThenAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9846:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:9847:2: ( ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:9847:2: ( ruleFuncBlock )
            // InternalGoatComponentsParser.g:9848:3: ruleFuncBlock
            {
             before(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_5_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncBlock();

            state._fsp--;

             after(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_5_5_0()); 

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
    // $ANTLR end "rule__FuncIfElse__ThenAssignment_5_5"


    // $ANTLR start "rule__FuncIfElse__ElseBranchAssignment_6_1"
    // InternalGoatComponentsParser.g:9857:1: rule__FuncIfElse__ElseBranchAssignment_6_1 : ( ruleFuncBlock ) ;
    public final void rule__FuncIfElse__ElseBranchAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9861:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:9862:2: ( ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:9862:2: ( ruleFuncBlock )
            // InternalGoatComponentsParser.g:9863:3: ruleFuncBlock
            {
             before(grammarAccess.getFuncIfElseAccess().getElseBranchFuncBlockParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncBlock();

            state._fsp--;

             after(grammarAccess.getFuncIfElseAccess().getElseBranchFuncBlockParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__FuncIfElse__ElseBranchAssignment_6_1"


    // $ANTLR start "rule__FuncReturn__ValAssignment_1"
    // InternalGoatComponentsParser.g:9872:1: rule__FuncReturn__ValAssignment_1 : ( ruleExpression ) ;
    public final void rule__FuncReturn__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9876:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9877:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9877:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9878:3: ruleExpression
            {
             before(grammarAccess.getFuncReturnAccess().getValExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFuncReturnAccess().getValExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FuncReturn__ValAssignment_1"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\uffff\1\11\5\uffff";
    static final String dfa_3s = "\1\6\3\uffff\1\10\5\uffff";
    static final String dfa_4s = "\1\64\3\uffff\1\62\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\7\1\10\1\6\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\2\uffff\1\3\4\uffff\1\5\1\uffff\1\6\1\3\40\uffff\1\4\1\1\1\2",
            "",
            "",
            "",
            "\1\11\13\uffff\4\11\1\uffff\3\11\1\uffff\2\11\1\uffff\1\10\5\11\1\uffff\2\11\1\uffff\1\11\2\uffff\1\11\2\uffff\1\11\1\uffff\1\11",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1521:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001C000180034240L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001000000014000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000100080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x001D000180034240L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000C00L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00041001200C0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000201000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000020200L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0018000000020200L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000005000A000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000002800800000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x001C000380034240L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0002000200000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0005000020100100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0004000020100102L});

}