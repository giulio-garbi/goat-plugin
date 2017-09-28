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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Component", "Function", "Receiver", "Receive", "Return", "False", "Print", "Sleep", "Until", "Elif", "Else", "Proc", "Send", "This", "True", "Wait", "Nil", "Var", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "PlusSignPlusSign", "ColonEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "At", "If", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_TYPE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Elif=13;
    public static final int Var=21;
    public static final int True=18;
    public static final int False=9;
    public static final int LessThanSign=41;
    public static final int Send=16;
    public static final int Print=10;
    public static final int LeftParenthesis=33;
    public static final int This=17;
    public static final int RightSquareBracket=46;
    public static final int ExclamationMark=32;
    public static final int GreaterThanSign=43;
    public static final int RULE_ID=51;
    public static final int RightParenthesis=34;
    public static final int Receiver=6;
    public static final int ColonEqualsSign=25;
    public static final int GreaterThanSignEqualsSign=28;
    public static final int EqualsSignEqualsSign=27;
    public static final int RULE_TYPE=50;
    public static final int VerticalLine=48;
    public static final int PlusSign=36;
    public static final int RULE_INT=52;
    public static final int RULE_ML_COMMENT=54;
    public static final int LeftSquareBracket=45;
    public static final int Wait=19;
    public static final int If=30;
    public static final int VerticalLineVerticalLine=31;
    public static final int RULE_STRING=53;
    public static final int RULE_SL_COMMENT=55;
    public static final int Proc=15;
    public static final int Function=5;
    public static final int Comma=37;
    public static final int EqualsSign=42;
    public static final int HyphenMinus=38;
    public static final int At=29;
    public static final int AmpersandAmpersand=23;
    public static final int LessThanSignEqualsSign=26;
    public static final int Solidus=40;
    public static final int RightCurlyBracket=49;
    public static final int Component=4;
    public static final int EOF=-1;
    public static final int Asterisk=35;
    public static final int Until=12;
    public static final int FullStop=39;
    public static final int Return=8;
    public static final int RULE_WS=56;
    public static final int LeftCurlyBracket=47;
    public static final int RULE_ANY_OTHER=57;
    public static final int CommercialAt=44;
    public static final int Nil=20;
    public static final int Sleep=11;
    public static final int PlusSignPlusSign=24;
    public static final int Receive=7;
    public static final int Else=14;
    public static final int ExclamationMarkEqualsSign=22;

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
    		tokenNameToValue.put("Elif", "'elif'");
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
    // InternalGoatComponentsParser.g:101:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:102:1: ( ruleModel EOF )
            // InternalGoatComponentsParser.g:103:1: ruleModel EOF
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
    // InternalGoatComponentsParser.g:110:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:114:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalGoatComponentsParser.g:115:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:115:2: ( ( rule__Model__Group__0 ) )
            // InternalGoatComponentsParser.g:116:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalGoatComponentsParser.g:117:3: ( rule__Model__Group__0 )
            // InternalGoatComponentsParser.g:117:4: rule__Model__Group__0
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
    // InternalGoatComponentsParser.g:126:1: entryRuleProc : ruleProc EOF ;
    public final void entryRuleProc() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:127:1: ( ruleProc EOF )
            // InternalGoatComponentsParser.g:128:1: ruleProc EOF
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
    // InternalGoatComponentsParser.g:135:1: ruleProc : ( ( rule__Proc__Alternatives ) ) ;
    public final void ruleProc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:139:2: ( ( ( rule__Proc__Alternatives ) ) )
            // InternalGoatComponentsParser.g:140:2: ( ( rule__Proc__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:140:2: ( ( rule__Proc__Alternatives ) )
            // InternalGoatComponentsParser.g:141:3: ( rule__Proc__Alternatives )
            {
             before(grammarAccess.getProcAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:142:3: ( rule__Proc__Alternatives )
            // InternalGoatComponentsParser.g:142:4: rule__Proc__Alternatives
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
    // InternalGoatComponentsParser.g:151:1: entryRuleInterleavingProcess : ruleInterleavingProcess EOF ;
    public final void entryRuleInterleavingProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:152:1: ( ruleInterleavingProcess EOF )
            // InternalGoatComponentsParser.g:153:1: ruleInterleavingProcess EOF
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
    // InternalGoatComponentsParser.g:160:1: ruleInterleavingProcess : ( ( rule__InterleavingProcess__Group__0 ) ) ;
    public final void ruleInterleavingProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:164:2: ( ( ( rule__InterleavingProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:165:2: ( ( rule__InterleavingProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:165:2: ( ( rule__InterleavingProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:166:3: ( rule__InterleavingProcess__Group__0 )
            {
             before(grammarAccess.getInterleavingProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:167:3: ( rule__InterleavingProcess__Group__0 )
            // InternalGoatComponentsParser.g:167:4: rule__InterleavingProcess__Group__0
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
    // InternalGoatComponentsParser.g:176:1: entryRuleNonDeterminismProcess : ruleNonDeterminismProcess EOF ;
    public final void entryRuleNonDeterminismProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:177:1: ( ruleNonDeterminismProcess EOF )
            // InternalGoatComponentsParser.g:178:1: ruleNonDeterminismProcess EOF
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
    // InternalGoatComponentsParser.g:185:1: ruleNonDeterminismProcess : ( ( rule__NonDeterminismProcess__Alternatives ) ) ;
    public final void ruleNonDeterminismProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:189:2: ( ( ( rule__NonDeterminismProcess__Alternatives ) ) )
            // InternalGoatComponentsParser.g:190:2: ( ( rule__NonDeterminismProcess__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:190:2: ( ( rule__NonDeterminismProcess__Alternatives ) )
            // InternalGoatComponentsParser.g:191:3: ( rule__NonDeterminismProcess__Alternatives )
            {
             before(grammarAccess.getNonDeterminismProcessAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:192:3: ( rule__NonDeterminismProcess__Alternatives )
            // InternalGoatComponentsParser.g:192:4: rule__NonDeterminismProcess__Alternatives
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
    // InternalGoatComponentsParser.g:201:1: entryRulePreconditions : rulePreconditions EOF ;
    public final void entryRulePreconditions() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:202:1: ( rulePreconditions EOF )
            // InternalGoatComponentsParser.g:203:1: rulePreconditions EOF
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
    // InternalGoatComponentsParser.g:210:1: rulePreconditions : ( ( rule__Preconditions__Group__0 ) ) ;
    public final void rulePreconditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:214:2: ( ( ( rule__Preconditions__Group__0 ) ) )
            // InternalGoatComponentsParser.g:215:2: ( ( rule__Preconditions__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:215:2: ( ( rule__Preconditions__Group__0 ) )
            // InternalGoatComponentsParser.g:216:3: ( rule__Preconditions__Group__0 )
            {
             before(grammarAccess.getPreconditionsAccess().getGroup()); 
            // InternalGoatComponentsParser.g:217:3: ( rule__Preconditions__Group__0 )
            // InternalGoatComponentsParser.g:217:4: rule__Preconditions__Group__0
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
    // InternalGoatComponentsParser.g:226:1: entryRulePredOutputProcessOrInputProcesses : rulePredOutputProcessOrInputProcesses EOF ;
    public final void entryRulePredOutputProcessOrInputProcesses() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:227:1: ( rulePredOutputProcessOrInputProcesses EOF )
            // InternalGoatComponentsParser.g:228:1: rulePredOutputProcessOrInputProcesses EOF
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
    // InternalGoatComponentsParser.g:235:1: rulePredOutputProcessOrInputProcesses : ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) ) ;
    public final void rulePredOutputProcessOrInputProcesses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:239:2: ( ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) ) )
            // InternalGoatComponentsParser.g:240:2: ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:240:2: ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) )
            // InternalGoatComponentsParser.g:241:3: ( rule__PredOutputProcessOrInputProcesses__Group__0 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup()); 
            // InternalGoatComponentsParser.g:242:3: ( rule__PredOutputProcessOrInputProcesses__Group__0 )
            // InternalGoatComponentsParser.g:242:4: rule__PredOutputProcessOrInputProcesses__Group__0
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
    // InternalGoatComponentsParser.g:251:1: entryRulePredOutputProcessOrInputProcess : rulePredOutputProcessOrInputProcess EOF ;
    public final void entryRulePredOutputProcessOrInputProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:252:1: ( rulePredOutputProcessOrInputProcess EOF )
            // InternalGoatComponentsParser.g:253:1: rulePredOutputProcessOrInputProcess EOF
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
    // InternalGoatComponentsParser.g:260:1: rulePredOutputProcessOrInputProcess : ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) ) ;
    public final void rulePredOutputProcessOrInputProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:264:2: ( ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:265:2: ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:265:2: ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:266:3: ( rule__PredOutputProcessOrInputProcess__Group__0 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:267:3: ( rule__PredOutputProcessOrInputProcess__Group__0 )
            // InternalGoatComponentsParser.g:267:4: rule__PredOutputProcessOrInputProcess__Group__0
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
    // InternalGoatComponentsParser.g:277:1: ruleInputProcessesPart : ( ( rule__InputProcessesPart__Group__0 ) ) ;
    public final void ruleInputProcessesPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:281:2: ( ( ( rule__InputProcessesPart__Group__0 ) ) )
            // InternalGoatComponentsParser.g:282:2: ( ( rule__InputProcessesPart__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:282:2: ( ( rule__InputProcessesPart__Group__0 ) )
            // InternalGoatComponentsParser.g:283:3: ( rule__InputProcessesPart__Group__0 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getGroup()); 
            // InternalGoatComponentsParser.g:284:3: ( rule__InputProcessesPart__Group__0 )
            // InternalGoatComponentsParser.g:284:4: rule__InputProcessesPart__Group__0
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
    // InternalGoatComponentsParser.g:293:1: entryRuleInputProcess : ruleInputProcess EOF ;
    public final void entryRuleInputProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:294:1: ( ruleInputProcess EOF )
            // InternalGoatComponentsParser.g:295:1: ruleInputProcess EOF
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
    // InternalGoatComponentsParser.g:302:1: ruleInputProcess : ( ( rule__InputProcess__Group__0 ) ) ;
    public final void ruleInputProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:306:2: ( ( ( rule__InputProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:307:2: ( ( rule__InputProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:307:2: ( ( rule__InputProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:308:3: ( rule__InputProcess__Group__0 )
            {
             before(grammarAccess.getInputProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:309:3: ( rule__InputProcess__Group__0 )
            // InternalGoatComponentsParser.g:309:4: rule__InputProcess__Group__0
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
    // InternalGoatComponentsParser.g:319:1: ruleOutputProcessPart : ( ( rule__OutputProcessPart__Group__0 ) ) ;
    public final void ruleOutputProcessPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:323:2: ( ( ( rule__OutputProcessPart__Group__0 ) ) )
            // InternalGoatComponentsParser.g:324:2: ( ( rule__OutputProcessPart__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:324:2: ( ( rule__OutputProcessPart__Group__0 ) )
            // InternalGoatComponentsParser.g:325:3: ( rule__OutputProcessPart__Group__0 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup()); 
            // InternalGoatComponentsParser.g:326:3: ( rule__OutputProcessPart__Group__0 )
            // InternalGoatComponentsParser.g:326:4: rule__OutputProcessPart__Group__0
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


    // $ANTLR start "entryRuleIfProcesses"
    // InternalGoatComponentsParser.g:335:1: entryRuleIfProcesses : ruleIfProcesses EOF ;
    public final void entryRuleIfProcesses() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:336:1: ( ruleIfProcesses EOF )
            // InternalGoatComponentsParser.g:337:1: ruleIfProcesses EOF
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
    // InternalGoatComponentsParser.g:344:1: ruleIfProcesses : ( ( rule__IfProcesses__Group__0 ) ) ;
    public final void ruleIfProcesses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:348:2: ( ( ( rule__IfProcesses__Group__0 ) ) )
            // InternalGoatComponentsParser.g:349:2: ( ( rule__IfProcesses__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:349:2: ( ( rule__IfProcesses__Group__0 ) )
            // InternalGoatComponentsParser.g:350:3: ( rule__IfProcesses__Group__0 )
            {
             before(grammarAccess.getIfProcessesAccess().getGroup()); 
            // InternalGoatComponentsParser.g:351:3: ( rule__IfProcesses__Group__0 )
            // InternalGoatComponentsParser.g:351:4: rule__IfProcesses__Group__0
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
    // InternalGoatComponentsParser.g:360:1: entryRuleIfBranchProcess : ruleIfBranchProcess EOF ;
    public final void entryRuleIfBranchProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:361:1: ( ruleIfBranchProcess EOF )
            // InternalGoatComponentsParser.g:362:1: ruleIfBranchProcess EOF
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
    // InternalGoatComponentsParser.g:369:1: ruleIfBranchProcess : ( ( rule__IfBranchProcess__Group__0 ) ) ;
    public final void ruleIfBranchProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:373:2: ( ( ( rule__IfBranchProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:374:2: ( ( rule__IfBranchProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:374:2: ( ( rule__IfBranchProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:375:3: ( rule__IfBranchProcess__Group__0 )
            {
             before(grammarAccess.getIfBranchProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:376:3: ( rule__IfBranchProcess__Group__0 )
            // InternalGoatComponentsParser.g:376:4: rule__IfBranchProcess__Group__0
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


    // $ANTLR start "entryRuleUpdate"
    // InternalGoatComponentsParser.g:385:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:386:1: ( ruleUpdate EOF )
            // InternalGoatComponentsParser.g:387:1: ruleUpdate EOF
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
    // InternalGoatComponentsParser.g:394:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:398:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalGoatComponentsParser.g:399:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:399:2: ( ( rule__Update__Group__0 ) )
            // InternalGoatComponentsParser.g:400:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalGoatComponentsParser.g:401:3: ( rule__Update__Group__0 )
            // InternalGoatComponentsParser.g:401:4: rule__Update__Group__0
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
    // InternalGoatComponentsParser.g:410:1: entryRuleAwareness : ruleAwareness EOF ;
    public final void entryRuleAwareness() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:411:1: ( ruleAwareness EOF )
            // InternalGoatComponentsParser.g:412:1: ruleAwareness EOF
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
    // InternalGoatComponentsParser.g:419:1: ruleAwareness : ( ( rule__Awareness__Group__0 ) ) ;
    public final void ruleAwareness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:423:2: ( ( ( rule__Awareness__Group__0 ) ) )
            // InternalGoatComponentsParser.g:424:2: ( ( rule__Awareness__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:424:2: ( ( rule__Awareness__Group__0 ) )
            // InternalGoatComponentsParser.g:425:3: ( rule__Awareness__Group__0 )
            {
             before(grammarAccess.getAwarenessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:426:3: ( rule__Awareness__Group__0 )
            // InternalGoatComponentsParser.g:426:4: rule__Awareness__Group__0
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
    // InternalGoatComponentsParser.g:435:1: entryRuleNZCProcess : ruleNZCProcess EOF ;
    public final void entryRuleNZCProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:436:1: ( ruleNZCProcess EOF )
            // InternalGoatComponentsParser.g:437:1: ruleNZCProcess EOF
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
    // InternalGoatComponentsParser.g:444:1: ruleNZCProcess : ( ( rule__NZCProcess__Alternatives ) ) ;
    public final void ruleNZCProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:448:2: ( ( ( rule__NZCProcess__Alternatives ) ) )
            // InternalGoatComponentsParser.g:449:2: ( ( rule__NZCProcess__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:449:2: ( ( rule__NZCProcess__Alternatives ) )
            // InternalGoatComponentsParser.g:450:3: ( rule__NZCProcess__Alternatives )
            {
             before(grammarAccess.getNZCProcessAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:451:3: ( rule__NZCProcess__Alternatives )
            // InternalGoatComponentsParser.g:451:4: rule__NZCProcess__Alternatives
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
    // InternalGoatComponentsParser.g:460:1: entryRuleNProcess : ruleNProcess EOF ;
    public final void entryRuleNProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:461:1: ( ruleNProcess EOF )
            // InternalGoatComponentsParser.g:462:1: ruleNProcess EOF
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
    // InternalGoatComponentsParser.g:469:1: ruleNProcess : ( ( rule__NProcess__Alternatives ) ) ;
    public final void ruleNProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:473:2: ( ( ( rule__NProcess__Alternatives ) ) )
            // InternalGoatComponentsParser.g:474:2: ( ( rule__NProcess__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:474:2: ( ( rule__NProcess__Alternatives ) )
            // InternalGoatComponentsParser.g:475:3: ( rule__NProcess__Alternatives )
            {
             before(grammarAccess.getNProcessAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:476:3: ( rule__NProcess__Alternatives )
            // InternalGoatComponentsParser.g:476:4: rule__NProcess__Alternatives
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
    // InternalGoatComponentsParser.g:485:1: entryRuleCallProcess : ruleCallProcess EOF ;
    public final void entryRuleCallProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:486:1: ( ruleCallProcess EOF )
            // InternalGoatComponentsParser.g:487:1: ruleCallProcess EOF
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
    // InternalGoatComponentsParser.g:494:1: ruleCallProcess : ( ( rule__CallProcess__Group__0 ) ) ;
    public final void ruleCallProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:498:2: ( ( ( rule__CallProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:499:2: ( ( rule__CallProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:499:2: ( ( rule__CallProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:500:3: ( rule__CallProcess__Group__0 )
            {
             before(grammarAccess.getCallProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:501:3: ( rule__CallProcess__Group__0 )
            // InternalGoatComponentsParser.g:501:4: rule__CallProcess__Group__0
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
    // InternalGoatComponentsParser.g:510:1: entryRuleZeroProcess : ruleZeroProcess EOF ;
    public final void entryRuleZeroProcess() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:511:1: ( ruleZeroProcess EOF )
            // InternalGoatComponentsParser.g:512:1: ruleZeroProcess EOF
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
    // InternalGoatComponentsParser.g:519:1: ruleZeroProcess : ( ( rule__ZeroProcess__Group__0 ) ) ;
    public final void ruleZeroProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:523:2: ( ( ( rule__ZeroProcess__Group__0 ) ) )
            // InternalGoatComponentsParser.g:524:2: ( ( rule__ZeroProcess__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:524:2: ( ( rule__ZeroProcess__Group__0 ) )
            // InternalGoatComponentsParser.g:525:3: ( rule__ZeroProcess__Group__0 )
            {
             before(grammarAccess.getZeroProcessAccess().getGroup()); 
            // InternalGoatComponentsParser.g:526:3: ( rule__ZeroProcess__Group__0 )
            // InternalGoatComponentsParser.g:526:4: rule__ZeroProcess__Group__0
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
    // InternalGoatComponentsParser.g:535:1: entryRuleProcessDefinition : ruleProcessDefinition EOF ;
    public final void entryRuleProcessDefinition() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:536:1: ( ruleProcessDefinition EOF )
            // InternalGoatComponentsParser.g:537:1: ruleProcessDefinition EOF
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
    // InternalGoatComponentsParser.g:544:1: ruleProcessDefinition : ( ( rule__ProcessDefinition__Group__0 ) ) ;
    public final void ruleProcessDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:548:2: ( ( ( rule__ProcessDefinition__Group__0 ) ) )
            // InternalGoatComponentsParser.g:549:2: ( ( rule__ProcessDefinition__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:549:2: ( ( rule__ProcessDefinition__Group__0 ) )
            // InternalGoatComponentsParser.g:550:3: ( rule__ProcessDefinition__Group__0 )
            {
             before(grammarAccess.getProcessDefinitionAccess().getGroup()); 
            // InternalGoatComponentsParser.g:551:3: ( rule__ProcessDefinition__Group__0 )
            // InternalGoatComponentsParser.g:551:4: rule__ProcessDefinition__Group__0
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
    // InternalGoatComponentsParser.g:560:1: entryRuleEnvInitValue : ruleEnvInitValue EOF ;
    public final void entryRuleEnvInitValue() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:561:1: ( ruleEnvInitValue EOF )
            // InternalGoatComponentsParser.g:562:1: ruleEnvInitValue EOF
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
    // InternalGoatComponentsParser.g:569:1: ruleEnvInitValue : ( ( rule__EnvInitValue__Alternatives ) ) ;
    public final void ruleEnvInitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:573:2: ( ( ( rule__EnvInitValue__Alternatives ) ) )
            // InternalGoatComponentsParser.g:574:2: ( ( rule__EnvInitValue__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:574:2: ( ( rule__EnvInitValue__Alternatives ) )
            // InternalGoatComponentsParser.g:575:3: ( rule__EnvInitValue__Alternatives )
            {
             before(grammarAccess.getEnvInitValueAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:576:3: ( rule__EnvInitValue__Alternatives )
            // InternalGoatComponentsParser.g:576:4: rule__EnvInitValue__Alternatives
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
    // InternalGoatComponentsParser.g:585:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:586:1: ( ruleEnvironment EOF )
            // InternalGoatComponentsParser.g:587:1: ruleEnvironment EOF
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
    // InternalGoatComponentsParser.g:594:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:598:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalGoatComponentsParser.g:599:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:599:2: ( ( rule__Environment__Group__0 ) )
            // InternalGoatComponentsParser.g:600:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalGoatComponentsParser.g:601:3: ( rule__Environment__Group__0 )
            // InternalGoatComponentsParser.g:601:4: rule__Environment__Group__0
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
    // InternalGoatComponentsParser.g:610:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:611:1: ( ruleComponentDefinition EOF )
            // InternalGoatComponentsParser.g:612:1: ruleComponentDefinition EOF
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
    // InternalGoatComponentsParser.g:619:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Group__0 ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:623:2: ( ( ( rule__ComponentDefinition__Group__0 ) ) )
            // InternalGoatComponentsParser.g:624:2: ( ( rule__ComponentDefinition__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:624:2: ( ( rule__ComponentDefinition__Group__0 ) )
            // InternalGoatComponentsParser.g:625:3: ( rule__ComponentDefinition__Group__0 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getGroup()); 
            // InternalGoatComponentsParser.g:626:3: ( rule__ComponentDefinition__Group__0 )
            // InternalGoatComponentsParser.g:626:4: rule__ComponentDefinition__Group__0
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
    // InternalGoatComponentsParser.g:635:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:636:1: ( ruleExpression EOF )
            // InternalGoatComponentsParser.g:637:1: ruleExpression EOF
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
    // InternalGoatComponentsParser.g:644:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:648:2: ( ( ruleOr ) )
            // InternalGoatComponentsParser.g:649:2: ( ruleOr )
            {
            // InternalGoatComponentsParser.g:649:2: ( ruleOr )
            // InternalGoatComponentsParser.g:650:3: ruleOr
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
    // InternalGoatComponentsParser.g:660:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:661:1: ( ruleOr EOF )
            // InternalGoatComponentsParser.g:662:1: ruleOr EOF
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
    // InternalGoatComponentsParser.g:669:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:673:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalGoatComponentsParser.g:674:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:674:2: ( ( rule__Or__Group__0 ) )
            // InternalGoatComponentsParser.g:675:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalGoatComponentsParser.g:676:3: ( rule__Or__Group__0 )
            // InternalGoatComponentsParser.g:676:4: rule__Or__Group__0
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
    // InternalGoatComponentsParser.g:685:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:686:1: ( ruleAnd EOF )
            // InternalGoatComponentsParser.g:687:1: ruleAnd EOF
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
    // InternalGoatComponentsParser.g:694:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:698:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalGoatComponentsParser.g:699:2: ( ( rule__And__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:699:2: ( ( rule__And__Group__0 ) )
            // InternalGoatComponentsParser.g:700:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalGoatComponentsParser.g:701:3: ( rule__And__Group__0 )
            // InternalGoatComponentsParser.g:701:4: rule__And__Group__0
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
    // InternalGoatComponentsParser.g:710:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:711:1: ( ruleEquality EOF )
            // InternalGoatComponentsParser.g:712:1: ruleEquality EOF
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
    // InternalGoatComponentsParser.g:719:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:723:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalGoatComponentsParser.g:724:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:724:2: ( ( rule__Equality__Group__0 ) )
            // InternalGoatComponentsParser.g:725:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalGoatComponentsParser.g:726:3: ( rule__Equality__Group__0 )
            // InternalGoatComponentsParser.g:726:4: rule__Equality__Group__0
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
    // InternalGoatComponentsParser.g:735:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:736:1: ( ruleComparison EOF )
            // InternalGoatComponentsParser.g:737:1: ruleComparison EOF
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
    // InternalGoatComponentsParser.g:744:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:748:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalGoatComponentsParser.g:749:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:749:2: ( ( rule__Comparison__Group__0 ) )
            // InternalGoatComponentsParser.g:750:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalGoatComponentsParser.g:751:3: ( rule__Comparison__Group__0 )
            // InternalGoatComponentsParser.g:751:4: rule__Comparison__Group__0
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
    // InternalGoatComponentsParser.g:760:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:761:1: ( rulePlusOrMinus EOF )
            // InternalGoatComponentsParser.g:762:1: rulePlusOrMinus EOF
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
    // InternalGoatComponentsParser.g:769:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:773:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalGoatComponentsParser.g:774:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:774:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalGoatComponentsParser.g:775:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalGoatComponentsParser.g:776:3: ( rule__PlusOrMinus__Group__0 )
            // InternalGoatComponentsParser.g:776:4: rule__PlusOrMinus__Group__0
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
    // InternalGoatComponentsParser.g:785:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:786:1: ( ruleMulOrDiv EOF )
            // InternalGoatComponentsParser.g:787:1: ruleMulOrDiv EOF
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
    // InternalGoatComponentsParser.g:794:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:798:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalGoatComponentsParser.g:799:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:799:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalGoatComponentsParser.g:800:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalGoatComponentsParser.g:801:3: ( rule__MulOrDiv__Group__0 )
            // InternalGoatComponentsParser.g:801:4: rule__MulOrDiv__Group__0
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
    // InternalGoatComponentsParser.g:810:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:811:1: ( rulePrimary EOF )
            // InternalGoatComponentsParser.g:812:1: rulePrimary EOF
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
    // InternalGoatComponentsParser.g:819:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:823:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalGoatComponentsParser.g:824:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:824:2: ( ( rule__Primary__Alternatives ) )
            // InternalGoatComponentsParser.g:825:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:826:3: ( rule__Primary__Alternatives )
            // InternalGoatComponentsParser.g:826:4: rule__Primary__Alternatives
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
    // InternalGoatComponentsParser.g:835:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:836:1: ( ruleAtomic EOF )
            // InternalGoatComponentsParser.g:837:1: ruleAtomic EOF
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
    // InternalGoatComponentsParser.g:844:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:848:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalGoatComponentsParser.g:849:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:849:2: ( ( rule__Atomic__Alternatives ) )
            // InternalGoatComponentsParser.g:850:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:851:3: ( rule__Atomic__Alternatives )
            // InternalGoatComponentsParser.g:851:4: rule__Atomic__Alternatives
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
    // InternalGoatComponentsParser.g:860:1: entryRuleAttributeToSet : ruleAttributeToSet EOF ;
    public final void entryRuleAttributeToSet() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:861:1: ( ruleAttributeToSet EOF )
            // InternalGoatComponentsParser.g:862:1: ruleAttributeToSet EOF
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
    // InternalGoatComponentsParser.g:869:1: ruleAttributeToSet : ( ( rule__AttributeToSet__Alternatives ) ) ;
    public final void ruleAttributeToSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:873:2: ( ( ( rule__AttributeToSet__Alternatives ) ) )
            // InternalGoatComponentsParser.g:874:2: ( ( rule__AttributeToSet__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:874:2: ( ( rule__AttributeToSet__Alternatives ) )
            // InternalGoatComponentsParser.g:875:3: ( rule__AttributeToSet__Alternatives )
            {
             before(grammarAccess.getAttributeToSetAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:876:3: ( rule__AttributeToSet__Alternatives )
            // InternalGoatComponentsParser.g:876:4: rule__AttributeToSet__Alternatives
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
    // InternalGoatComponentsParser.g:885:1: entryRuleFuncParam : ruleFuncParam EOF ;
    public final void entryRuleFuncParam() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:886:1: ( ruleFuncParam EOF )
            // InternalGoatComponentsParser.g:887:1: ruleFuncParam EOF
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
    // InternalGoatComponentsParser.g:894:1: ruleFuncParam : ( ( rule__FuncParam__Group__0 ) ) ;
    public final void ruleFuncParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:898:2: ( ( ( rule__FuncParam__Group__0 ) ) )
            // InternalGoatComponentsParser.g:899:2: ( ( rule__FuncParam__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:899:2: ( ( rule__FuncParam__Group__0 ) )
            // InternalGoatComponentsParser.g:900:3: ( rule__FuncParam__Group__0 )
            {
             before(grammarAccess.getFuncParamAccess().getGroup()); 
            // InternalGoatComponentsParser.g:901:3: ( rule__FuncParam__Group__0 )
            // InternalGoatComponentsParser.g:901:4: rule__FuncParam__Group__0
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
    // InternalGoatComponentsParser.g:910:1: entryRuleFuncDefinition : ruleFuncDefinition EOF ;
    public final void entryRuleFuncDefinition() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:911:1: ( ruleFuncDefinition EOF )
            // InternalGoatComponentsParser.g:912:1: ruleFuncDefinition EOF
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
    // InternalGoatComponentsParser.g:919:1: ruleFuncDefinition : ( ( rule__FuncDefinition__Group__0 ) ) ;
    public final void ruleFuncDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:923:2: ( ( ( rule__FuncDefinition__Group__0 ) ) )
            // InternalGoatComponentsParser.g:924:2: ( ( rule__FuncDefinition__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:924:2: ( ( rule__FuncDefinition__Group__0 ) )
            // InternalGoatComponentsParser.g:925:3: ( rule__FuncDefinition__Group__0 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getGroup()); 
            // InternalGoatComponentsParser.g:926:3: ( rule__FuncDefinition__Group__0 )
            // InternalGoatComponentsParser.g:926:4: rule__FuncDefinition__Group__0
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
    // InternalGoatComponentsParser.g:935:1: entryRuleFuncBlock : ruleFuncBlock EOF ;
    public final void entryRuleFuncBlock() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:936:1: ( ruleFuncBlock EOF )
            // InternalGoatComponentsParser.g:937:1: ruleFuncBlock EOF
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
    // InternalGoatComponentsParser.g:944:1: ruleFuncBlock : ( ( rule__FuncBlock__Group__0 ) ) ;
    public final void ruleFuncBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:948:2: ( ( ( rule__FuncBlock__Group__0 ) ) )
            // InternalGoatComponentsParser.g:949:2: ( ( rule__FuncBlock__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:949:2: ( ( rule__FuncBlock__Group__0 ) )
            // InternalGoatComponentsParser.g:950:3: ( rule__FuncBlock__Group__0 )
            {
             before(grammarAccess.getFuncBlockAccess().getGroup()); 
            // InternalGoatComponentsParser.g:951:3: ( rule__FuncBlock__Group__0 )
            // InternalGoatComponentsParser.g:951:4: rule__FuncBlock__Group__0
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
    // InternalGoatComponentsParser.g:960:1: entryRuleFuncStatement : ruleFuncStatement EOF ;
    public final void entryRuleFuncStatement() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:961:1: ( ruleFuncStatement EOF )
            // InternalGoatComponentsParser.g:962:1: ruleFuncStatement EOF
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
    // InternalGoatComponentsParser.g:969:1: ruleFuncStatement : ( ( rule__FuncStatement__Alternatives ) ) ;
    public final void ruleFuncStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:973:2: ( ( ( rule__FuncStatement__Alternatives ) ) )
            // InternalGoatComponentsParser.g:974:2: ( ( rule__FuncStatement__Alternatives ) )
            {
            // InternalGoatComponentsParser.g:974:2: ( ( rule__FuncStatement__Alternatives ) )
            // InternalGoatComponentsParser.g:975:3: ( rule__FuncStatement__Alternatives )
            {
             before(grammarAccess.getFuncStatementAccess().getAlternatives()); 
            // InternalGoatComponentsParser.g:976:3: ( rule__FuncStatement__Alternatives )
            // InternalGoatComponentsParser.g:976:4: rule__FuncStatement__Alternatives
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
    // InternalGoatComponentsParser.g:985:1: entryRuleFuncVarDeclaration : ruleFuncVarDeclaration EOF ;
    public final void entryRuleFuncVarDeclaration() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:986:1: ( ruleFuncVarDeclaration EOF )
            // InternalGoatComponentsParser.g:987:1: ruleFuncVarDeclaration EOF
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
    // InternalGoatComponentsParser.g:994:1: ruleFuncVarDeclaration : ( ( rule__FuncVarDeclaration__Group__0 ) ) ;
    public final void ruleFuncVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:998:2: ( ( ( rule__FuncVarDeclaration__Group__0 ) ) )
            // InternalGoatComponentsParser.g:999:2: ( ( rule__FuncVarDeclaration__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:999:2: ( ( rule__FuncVarDeclaration__Group__0 ) )
            // InternalGoatComponentsParser.g:1000:3: ( rule__FuncVarDeclaration__Group__0 )
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1001:3: ( rule__FuncVarDeclaration__Group__0 )
            // InternalGoatComponentsParser.g:1001:4: rule__FuncVarDeclaration__Group__0
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
    // InternalGoatComponentsParser.g:1010:1: entryRuleFuncVarAssign : ruleFuncVarAssign EOF ;
    public final void entryRuleFuncVarAssign() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:1011:1: ( ruleFuncVarAssign EOF )
            // InternalGoatComponentsParser.g:1012:1: ruleFuncVarAssign EOF
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
    // InternalGoatComponentsParser.g:1019:1: ruleFuncVarAssign : ( ( rule__FuncVarAssign__Group__0 ) ) ;
    public final void ruleFuncVarAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1023:2: ( ( ( rule__FuncVarAssign__Group__0 ) ) )
            // InternalGoatComponentsParser.g:1024:2: ( ( rule__FuncVarAssign__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:1024:2: ( ( rule__FuncVarAssign__Group__0 ) )
            // InternalGoatComponentsParser.g:1025:3: ( rule__FuncVarAssign__Group__0 )
            {
             before(grammarAccess.getFuncVarAssignAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1026:3: ( rule__FuncVarAssign__Group__0 )
            // InternalGoatComponentsParser.g:1026:4: rule__FuncVarAssign__Group__0
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
    // InternalGoatComponentsParser.g:1035:1: entryRuleFuncIfElse : ruleFuncIfElse EOF ;
    public final void entryRuleFuncIfElse() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:1036:1: ( ruleFuncIfElse EOF )
            // InternalGoatComponentsParser.g:1037:1: ruleFuncIfElse EOF
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
    // InternalGoatComponentsParser.g:1044:1: ruleFuncIfElse : ( ( rule__FuncIfElse__Group__0 ) ) ;
    public final void ruleFuncIfElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1048:2: ( ( ( rule__FuncIfElse__Group__0 ) ) )
            // InternalGoatComponentsParser.g:1049:2: ( ( rule__FuncIfElse__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:1049:2: ( ( rule__FuncIfElse__Group__0 ) )
            // InternalGoatComponentsParser.g:1050:3: ( rule__FuncIfElse__Group__0 )
            {
             before(grammarAccess.getFuncIfElseAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1051:3: ( rule__FuncIfElse__Group__0 )
            // InternalGoatComponentsParser.g:1051:4: rule__FuncIfElse__Group__0
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
    // InternalGoatComponentsParser.g:1060:1: entryRuleFuncReturn : ruleFuncReturn EOF ;
    public final void entryRuleFuncReturn() throws RecognitionException {
        try {
            // InternalGoatComponentsParser.g:1061:1: ( ruleFuncReturn EOF )
            // InternalGoatComponentsParser.g:1062:1: ruleFuncReturn EOF
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
    // InternalGoatComponentsParser.g:1069:1: ruleFuncReturn : ( ( rule__FuncReturn__Group__0 ) ) ;
    public final void ruleFuncReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1073:2: ( ( ( rule__FuncReturn__Group__0 ) ) )
            // InternalGoatComponentsParser.g:1074:2: ( ( rule__FuncReturn__Group__0 ) )
            {
            // InternalGoatComponentsParser.g:1074:2: ( ( rule__FuncReturn__Group__0 ) )
            // InternalGoatComponentsParser.g:1075:3: ( rule__FuncReturn__Group__0 )
            {
             before(grammarAccess.getFuncReturnAccess().getGroup()); 
            // InternalGoatComponentsParser.g:1076:3: ( rule__FuncReturn__Group__0 )
            // InternalGoatComponentsParser.g:1076:4: rule__FuncReturn__Group__0
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
    // InternalGoatComponentsParser.g:1084:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__ProcessesAssignment_1_0 ) ) | ( ( rule__Model__ComponentsAssignment_1_1 ) ) | ( ( rule__Model__FunctionsAssignment_1_2 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1088:1: ( ( ( rule__Model__ProcessesAssignment_1_0 ) ) | ( ( rule__Model__ComponentsAssignment_1_1 ) ) | ( ( rule__Model__FunctionsAssignment_1_2 ) ) )
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
                    // InternalGoatComponentsParser.g:1089:2: ( ( rule__Model__ProcessesAssignment_1_0 ) )
                    {
                    // InternalGoatComponentsParser.g:1089:2: ( ( rule__Model__ProcessesAssignment_1_0 ) )
                    // InternalGoatComponentsParser.g:1090:3: ( rule__Model__ProcessesAssignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getProcessesAssignment_1_0()); 
                    // InternalGoatComponentsParser.g:1091:3: ( rule__Model__ProcessesAssignment_1_0 )
                    // InternalGoatComponentsParser.g:1091:4: rule__Model__ProcessesAssignment_1_0
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
                    // InternalGoatComponentsParser.g:1095:2: ( ( rule__Model__ComponentsAssignment_1_1 ) )
                    {
                    // InternalGoatComponentsParser.g:1095:2: ( ( rule__Model__ComponentsAssignment_1_1 ) )
                    // InternalGoatComponentsParser.g:1096:3: ( rule__Model__ComponentsAssignment_1_1 )
                    {
                     before(grammarAccess.getModelAccess().getComponentsAssignment_1_1()); 
                    // InternalGoatComponentsParser.g:1097:3: ( rule__Model__ComponentsAssignment_1_1 )
                    // InternalGoatComponentsParser.g:1097:4: rule__Model__ComponentsAssignment_1_1
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
                    // InternalGoatComponentsParser.g:1101:2: ( ( rule__Model__FunctionsAssignment_1_2 ) )
                    {
                    // InternalGoatComponentsParser.g:1101:2: ( ( rule__Model__FunctionsAssignment_1_2 ) )
                    // InternalGoatComponentsParser.g:1102:3: ( rule__Model__FunctionsAssignment_1_2 )
                    {
                     before(grammarAccess.getModelAccess().getFunctionsAssignment_1_2()); 
                    // InternalGoatComponentsParser.g:1103:3: ( rule__Model__FunctionsAssignment_1_2 )
                    // InternalGoatComponentsParser.g:1103:4: rule__Model__FunctionsAssignment_1_2
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
    // InternalGoatComponentsParser.g:1111:1: rule__Proc__Alternatives : ( ( ruleInterleavingProcess ) | ( ruleNonDeterminismProcess ) );
    public final void rule__Proc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1115:1: ( ( ruleInterleavingProcess ) | ( ruleNonDeterminismProcess ) )
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
                    // InternalGoatComponentsParser.g:1116:2: ( ruleInterleavingProcess )
                    {
                    // InternalGoatComponentsParser.g:1116:2: ( ruleInterleavingProcess )
                    // InternalGoatComponentsParser.g:1117:3: ruleInterleavingProcess
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
                    // InternalGoatComponentsParser.g:1122:2: ( ruleNonDeterminismProcess )
                    {
                    // InternalGoatComponentsParser.g:1122:2: ( ruleNonDeterminismProcess )
                    // InternalGoatComponentsParser.g:1123:3: ruleNonDeterminismProcess
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
    // InternalGoatComponentsParser.g:1132:1: rule__NonDeterminismProcess__Alternatives : ( ( rulePredOutputProcessOrInputProcesses ) | ( ruleIfProcesses ) | ( ruleNProcess ) );
    public final void rule__NonDeterminismProcess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1136:1: ( ( rulePredOutputProcessOrInputProcesses ) | ( ruleIfProcesses ) | ( ruleNProcess ) )
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
                    // InternalGoatComponentsParser.g:1137:2: ( rulePredOutputProcessOrInputProcesses )
                    {
                    // InternalGoatComponentsParser.g:1137:2: ( rulePredOutputProcessOrInputProcesses )
                    // InternalGoatComponentsParser.g:1138:3: rulePredOutputProcessOrInputProcesses
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
                    // InternalGoatComponentsParser.g:1143:2: ( ruleIfProcesses )
                    {
                    // InternalGoatComponentsParser.g:1143:2: ( ruleIfProcesses )
                    // InternalGoatComponentsParser.g:1144:3: ruleIfProcesses
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
                    // InternalGoatComponentsParser.g:1149:2: ( ruleNProcess )
                    {
                    // InternalGoatComponentsParser.g:1149:2: ( ruleNProcess )
                    // InternalGoatComponentsParser.g:1150:3: ruleNProcess
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
    // InternalGoatComponentsParser.g:1159:1: rule__Preconditions__PrecondAlternatives_1_0 : ( ( ruleUpdate ) | ( ruleAwareness ) );
    public final void rule__Preconditions__PrecondAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1163:1: ( ( ruleUpdate ) | ( ruleAwareness ) )
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
                    // InternalGoatComponentsParser.g:1164:2: ( ruleUpdate )
                    {
                    // InternalGoatComponentsParser.g:1164:2: ( ruleUpdate )
                    // InternalGoatComponentsParser.g:1165:3: ruleUpdate
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
                    // InternalGoatComponentsParser.g:1170:2: ( ruleAwareness )
                    {
                    // InternalGoatComponentsParser.g:1170:2: ( ruleAwareness )
                    // InternalGoatComponentsParser.g:1171:3: ruleAwareness
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
    // InternalGoatComponentsParser.g:1180:1: rule__PredOutputProcessOrInputProcesses__Alternatives_1 : ( ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) ) );
    public final void rule__PredOutputProcessOrInputProcesses__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1184:1: ( ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) ) )
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
                    // InternalGoatComponentsParser.g:1185:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1185:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) )
                    // InternalGoatComponentsParser.g:1186:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup_1_0()); 
                    // InternalGoatComponentsParser.g:1187:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 )
                    // InternalGoatComponentsParser.g:1187:4: rule__PredOutputProcessOrInputProcesses__Group_1_0__0
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
                    // InternalGoatComponentsParser.g:1191:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1191:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) )
                    // InternalGoatComponentsParser.g:1192:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup_1_1()); 
                    // InternalGoatComponentsParser.g:1193:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 )
                    // InternalGoatComponentsParser.g:1193:4: rule__PredOutputProcessOrInputProcesses__Group_1_1__0
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
    // InternalGoatComponentsParser.g:1201:1: rule__PredOutputProcessOrInputProcess__Alternatives_1 : ( ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) ) );
    public final void rule__PredOutputProcessOrInputProcess__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1205:1: ( ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) ) )
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
                    // InternalGoatComponentsParser.g:1206:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1206:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) )
                    // InternalGoatComponentsParser.g:1207:3: ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup_1_0()); 
                    // InternalGoatComponentsParser.g:1208:3: ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 )
                    // InternalGoatComponentsParser.g:1208:4: rule__PredOutputProcessOrInputProcess__Group_1_0__0
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
                    // InternalGoatComponentsParser.g:1212:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1212:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) )
                    // InternalGoatComponentsParser.g:1213:3: ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup_1_1()); 
                    // InternalGoatComponentsParser.g:1214:3: ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 )
                    // InternalGoatComponentsParser.g:1214:4: rule__PredOutputProcessOrInputProcess__Group_1_1__0
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
    // InternalGoatComponentsParser.g:1222:1: rule__NZCProcess__Alternatives : ( ( ( rule__NZCProcess__Group_0__0 ) ) | ( ruleZeroProcess ) | ( ruleCallProcess ) );
    public final void rule__NZCProcess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1226:1: ( ( ( rule__NZCProcess__Group_0__0 ) ) | ( ruleZeroProcess ) | ( ruleCallProcess ) )
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
                    // InternalGoatComponentsParser.g:1227:2: ( ( rule__NZCProcess__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1227:2: ( ( rule__NZCProcess__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1228:3: ( rule__NZCProcess__Group_0__0 )
                    {
                     before(grammarAccess.getNZCProcessAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1229:3: ( rule__NZCProcess__Group_0__0 )
                    // InternalGoatComponentsParser.g:1229:4: rule__NZCProcess__Group_0__0
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
                    // InternalGoatComponentsParser.g:1233:2: ( ruleZeroProcess )
                    {
                    // InternalGoatComponentsParser.g:1233:2: ( ruleZeroProcess )
                    // InternalGoatComponentsParser.g:1234:3: ruleZeroProcess
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
                    // InternalGoatComponentsParser.g:1239:2: ( ruleCallProcess )
                    {
                    // InternalGoatComponentsParser.g:1239:2: ( ruleCallProcess )
                    // InternalGoatComponentsParser.g:1240:3: ruleCallProcess
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
    // InternalGoatComponentsParser.g:1249:1: rule__NProcess__Alternatives : ( ( ( rule__NProcess__Group_0__0 ) ) | ( ruleZeroProcess ) );
    public final void rule__NProcess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1253:1: ( ( ( rule__NProcess__Group_0__0 ) ) | ( ruleZeroProcess ) )
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
                    // InternalGoatComponentsParser.g:1254:2: ( ( rule__NProcess__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1254:2: ( ( rule__NProcess__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1255:3: ( rule__NProcess__Group_0__0 )
                    {
                     before(grammarAccess.getNProcessAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1256:3: ( rule__NProcess__Group_0__0 )
                    // InternalGoatComponentsParser.g:1256:4: rule__NProcess__Group_0__0
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
                    // InternalGoatComponentsParser.g:1260:2: ( ruleZeroProcess )
                    {
                    // InternalGoatComponentsParser.g:1260:2: ( ruleZeroProcess )
                    // InternalGoatComponentsParser.g:1261:3: ruleZeroProcess
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
    // InternalGoatComponentsParser.g:1270:1: rule__EnvInitValue__Alternatives : ( ( ( rule__EnvInitValue__Group_0__0 ) ) | ( ( rule__EnvInitValue__Group_1__0 ) ) | ( ( rule__EnvInitValue__Group_2__0 ) ) );
    public final void rule__EnvInitValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1274:1: ( ( ( rule__EnvInitValue__Group_0__0 ) ) | ( ( rule__EnvInitValue__Group_1__0 ) ) | ( ( rule__EnvInitValue__Group_2__0 ) ) )
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
                    // InternalGoatComponentsParser.g:1275:2: ( ( rule__EnvInitValue__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1275:2: ( ( rule__EnvInitValue__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1276:3: ( rule__EnvInitValue__Group_0__0 )
                    {
                     before(grammarAccess.getEnvInitValueAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1277:3: ( rule__EnvInitValue__Group_0__0 )
                    // InternalGoatComponentsParser.g:1277:4: rule__EnvInitValue__Group_0__0
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
                    // InternalGoatComponentsParser.g:1281:2: ( ( rule__EnvInitValue__Group_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1281:2: ( ( rule__EnvInitValue__Group_1__0 ) )
                    // InternalGoatComponentsParser.g:1282:3: ( rule__EnvInitValue__Group_1__0 )
                    {
                     before(grammarAccess.getEnvInitValueAccess().getGroup_1()); 
                    // InternalGoatComponentsParser.g:1283:3: ( rule__EnvInitValue__Group_1__0 )
                    // InternalGoatComponentsParser.g:1283:4: rule__EnvInitValue__Group_1__0
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
                    // InternalGoatComponentsParser.g:1287:2: ( ( rule__EnvInitValue__Group_2__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1287:2: ( ( rule__EnvInitValue__Group_2__0 ) )
                    // InternalGoatComponentsParser.g:1288:3: ( rule__EnvInitValue__Group_2__0 )
                    {
                     before(grammarAccess.getEnvInitValueAccess().getGroup_2()); 
                    // InternalGoatComponentsParser.g:1289:3: ( rule__EnvInitValue__Group_2__0 )
                    // InternalGoatComponentsParser.g:1289:4: rule__EnvInitValue__Group_2__0
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
    // InternalGoatComponentsParser.g:1297:1: rule__EnvInitValue__ValueAlternatives_2_1_0 : ( ( True ) | ( False ) );
    public final void rule__EnvInitValue__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1301:1: ( ( True ) | ( False ) )
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
                    // InternalGoatComponentsParser.g:1302:2: ( True )
                    {
                    // InternalGoatComponentsParser.g:1302:2: ( True )
                    // InternalGoatComponentsParser.g:1303:3: True
                    {
                     before(grammarAccess.getEnvInitValueAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEnvInitValueAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1308:2: ( False )
                    {
                    // InternalGoatComponentsParser.g:1308:2: ( False )
                    // InternalGoatComponentsParser.g:1309:3: False
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
    // InternalGoatComponentsParser.g:1318:1: rule__Equality__OpAlternatives_1_1_0 : ( ( EqualsSignEqualsSign ) | ( ExclamationMarkEqualsSign ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1322:1: ( ( EqualsSignEqualsSign ) | ( ExclamationMarkEqualsSign ) )
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
                    // InternalGoatComponentsParser.g:1323:2: ( EqualsSignEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:1323:2: ( EqualsSignEqualsSign )
                    // InternalGoatComponentsParser.g:1324:3: EqualsSignEqualsSign
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,EqualsSignEqualsSign,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1329:2: ( ExclamationMarkEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:1329:2: ( ExclamationMarkEqualsSign )
                    // InternalGoatComponentsParser.g:1330:3: ExclamationMarkEqualsSign
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
    // InternalGoatComponentsParser.g:1339:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( GreaterThanSignEqualsSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSign ) | ( LessThanSign ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1343:1: ( ( GreaterThanSignEqualsSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSign ) | ( LessThanSign ) )
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
                    // InternalGoatComponentsParser.g:1344:2: ( GreaterThanSignEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:1344:2: ( GreaterThanSignEqualsSign )
                    // InternalGoatComponentsParser.g:1345:3: GreaterThanSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,GreaterThanSignEqualsSign,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1350:2: ( LessThanSignEqualsSign )
                    {
                    // InternalGoatComponentsParser.g:1350:2: ( LessThanSignEqualsSign )
                    // InternalGoatComponentsParser.g:1351:3: LessThanSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,LessThanSignEqualsSign,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsParser.g:1356:2: ( GreaterThanSign )
                    {
                    // InternalGoatComponentsParser.g:1356:2: ( GreaterThanSign )
                    // InternalGoatComponentsParser.g:1357:3: GreaterThanSign
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,GreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGoatComponentsParser.g:1362:2: ( LessThanSign )
                    {
                    // InternalGoatComponentsParser.g:1362:2: ( LessThanSign )
                    // InternalGoatComponentsParser.g:1363:3: LessThanSign
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
    // InternalGoatComponentsParser.g:1372:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_2__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1376:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_2__0 ) ) )
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
                    // InternalGoatComponentsParser.g:1377:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1377:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalGoatComponentsParser.g:1378:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalGoatComponentsParser.g:1379:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalGoatComponentsParser.g:1379:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalGoatComponentsParser.g:1383:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1383:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalGoatComponentsParser.g:1384:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalGoatComponentsParser.g:1385:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalGoatComponentsParser.g:1385:4: rule__PlusOrMinus__Group_1_0_1__0
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
                    // InternalGoatComponentsParser.g:1389:2: ( ( rule__PlusOrMinus__Group_1_0_2__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1389:2: ( ( rule__PlusOrMinus__Group_1_0_2__0 ) )
                    // InternalGoatComponentsParser.g:1390:3: ( rule__PlusOrMinus__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_2()); 
                    // InternalGoatComponentsParser.g:1391:3: ( rule__PlusOrMinus__Group_1_0_2__0 )
                    // InternalGoatComponentsParser.g:1391:4: rule__PlusOrMinus__Group_1_0_2__0
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
    // InternalGoatComponentsParser.g:1399:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( Asterisk ) | ( Solidus ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1403:1: ( ( Asterisk ) | ( Solidus ) )
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
                    // InternalGoatComponentsParser.g:1404:2: ( Asterisk )
                    {
                    // InternalGoatComponentsParser.g:1404:2: ( Asterisk )
                    // InternalGoatComponentsParser.g:1405:3: Asterisk
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,Asterisk,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1410:2: ( Solidus )
                    {
                    // InternalGoatComponentsParser.g:1410:2: ( Solidus )
                    // InternalGoatComponentsParser.g:1411:3: Solidus
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
    // InternalGoatComponentsParser.g:1420:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1424:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
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
                    // InternalGoatComponentsParser.g:1425:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1425:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1426:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1427:3: ( rule__Primary__Group_0__0 )
                    // InternalGoatComponentsParser.g:1427:4: rule__Primary__Group_0__0
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
                    // InternalGoatComponentsParser.g:1431:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1431:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalGoatComponentsParser.g:1432:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalGoatComponentsParser.g:1433:3: ( rule__Primary__Group_1__0 )
                    // InternalGoatComponentsParser.g:1433:4: rule__Primary__Group_1__0
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
                    // InternalGoatComponentsParser.g:1437:2: ( ruleAtomic )
                    {
                    // InternalGoatComponentsParser.g:1437:2: ( ruleAtomic )
                    // InternalGoatComponentsParser.g:1438:3: ruleAtomic
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
    // InternalGoatComponentsParser.g:1447:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1451:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) )
            int alt16=8;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalGoatComponentsParser.g:1452:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1452:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1453:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1454:3: ( rule__Atomic__Group_0__0 )
                    // InternalGoatComponentsParser.g:1454:4: rule__Atomic__Group_0__0
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
                    // InternalGoatComponentsParser.g:1458:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1458:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalGoatComponentsParser.g:1459:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalGoatComponentsParser.g:1460:3: ( rule__Atomic__Group_1__0 )
                    // InternalGoatComponentsParser.g:1460:4: rule__Atomic__Group_1__0
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
                    // InternalGoatComponentsParser.g:1464:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1464:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalGoatComponentsParser.g:1465:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalGoatComponentsParser.g:1466:3: ( rule__Atomic__Group_2__0 )
                    // InternalGoatComponentsParser.g:1466:4: rule__Atomic__Group_2__0
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
                    // InternalGoatComponentsParser.g:1470:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1470:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalGoatComponentsParser.g:1471:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalGoatComponentsParser.g:1472:3: ( rule__Atomic__Group_3__0 )
                    // InternalGoatComponentsParser.g:1472:4: rule__Atomic__Group_3__0
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
                    // InternalGoatComponentsParser.g:1476:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1476:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalGoatComponentsParser.g:1477:3: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // InternalGoatComponentsParser.g:1478:3: ( rule__Atomic__Group_4__0 )
                    // InternalGoatComponentsParser.g:1478:4: rule__Atomic__Group_4__0
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
                    // InternalGoatComponentsParser.g:1482:2: ( ( rule__Atomic__Group_5__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1482:2: ( ( rule__Atomic__Group_5__0 ) )
                    // InternalGoatComponentsParser.g:1483:3: ( rule__Atomic__Group_5__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_5()); 
                    // InternalGoatComponentsParser.g:1484:3: ( rule__Atomic__Group_5__0 )
                    // InternalGoatComponentsParser.g:1484:4: rule__Atomic__Group_5__0
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
                    // InternalGoatComponentsParser.g:1488:2: ( ( rule__Atomic__Group_6__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1488:2: ( ( rule__Atomic__Group_6__0 ) )
                    // InternalGoatComponentsParser.g:1489:3: ( rule__Atomic__Group_6__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_6()); 
                    // InternalGoatComponentsParser.g:1490:3: ( rule__Atomic__Group_6__0 )
                    // InternalGoatComponentsParser.g:1490:4: rule__Atomic__Group_6__0
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
                    // InternalGoatComponentsParser.g:1494:2: ( ( rule__Atomic__Group_7__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1494:2: ( ( rule__Atomic__Group_7__0 ) )
                    // InternalGoatComponentsParser.g:1495:3: ( rule__Atomic__Group_7__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_7()); 
                    // InternalGoatComponentsParser.g:1496:3: ( rule__Atomic__Group_7__0 )
                    // InternalGoatComponentsParser.g:1496:4: rule__Atomic__Group_7__0
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
    // InternalGoatComponentsParser.g:1504:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( True ) | ( False ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1508:1: ( ( True ) | ( False ) )
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
                    // InternalGoatComponentsParser.g:1509:2: ( True )
                    {
                    // InternalGoatComponentsParser.g:1509:2: ( True )
                    // InternalGoatComponentsParser.g:1510:3: True
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsParser.g:1515:2: ( False )
                    {
                    // InternalGoatComponentsParser.g:1515:2: ( False )
                    // InternalGoatComponentsParser.g:1516:3: False
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
    // InternalGoatComponentsParser.g:1525:1: rule__AttributeToSet__Alternatives : ( ( ( rule__AttributeToSet__Group_0__0 ) ) | ( ( rule__AttributeToSet__Group_1__0 ) ) );
    public final void rule__AttributeToSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1529:1: ( ( ( rule__AttributeToSet__Group_0__0 ) ) | ( ( rule__AttributeToSet__Group_1__0 ) ) )
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
                    // InternalGoatComponentsParser.g:1530:2: ( ( rule__AttributeToSet__Group_0__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1530:2: ( ( rule__AttributeToSet__Group_0__0 ) )
                    // InternalGoatComponentsParser.g:1531:3: ( rule__AttributeToSet__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeToSetAccess().getGroup_0()); 
                    // InternalGoatComponentsParser.g:1532:3: ( rule__AttributeToSet__Group_0__0 )
                    // InternalGoatComponentsParser.g:1532:4: rule__AttributeToSet__Group_0__0
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
                    // InternalGoatComponentsParser.g:1536:2: ( ( rule__AttributeToSet__Group_1__0 ) )
                    {
                    // InternalGoatComponentsParser.g:1536:2: ( ( rule__AttributeToSet__Group_1__0 ) )
                    // InternalGoatComponentsParser.g:1537:3: ( rule__AttributeToSet__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeToSetAccess().getGroup_1()); 
                    // InternalGoatComponentsParser.g:1538:3: ( rule__AttributeToSet__Group_1__0 )
                    // InternalGoatComponentsParser.g:1538:4: rule__AttributeToSet__Group_1__0
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
    // InternalGoatComponentsParser.g:1546:1: rule__FuncStatement__Alternatives : ( ( ruleFuncVarAssign ) | ( ruleFuncIfElse ) | ( ruleFuncReturn ) | ( ruleFuncVarDeclaration ) );
    public final void rule__FuncStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1550:1: ( ( ruleFuncVarAssign ) | ( ruleFuncIfElse ) | ( ruleFuncReturn ) | ( ruleFuncVarDeclaration ) )
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
                    // InternalGoatComponentsParser.g:1551:2: ( ruleFuncVarAssign )
                    {
                    // InternalGoatComponentsParser.g:1551:2: ( ruleFuncVarAssign )
                    // InternalGoatComponentsParser.g:1552:3: ruleFuncVarAssign
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
                    // InternalGoatComponentsParser.g:1557:2: ( ruleFuncIfElse )
                    {
                    // InternalGoatComponentsParser.g:1557:2: ( ruleFuncIfElse )
                    // InternalGoatComponentsParser.g:1558:3: ruleFuncIfElse
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
                    // InternalGoatComponentsParser.g:1563:2: ( ruleFuncReturn )
                    {
                    // InternalGoatComponentsParser.g:1563:2: ( ruleFuncReturn )
                    // InternalGoatComponentsParser.g:1564:3: ruleFuncReturn
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
                    // InternalGoatComponentsParser.g:1569:2: ( ruleFuncVarDeclaration )
                    {
                    // InternalGoatComponentsParser.g:1569:2: ( ruleFuncVarDeclaration )
                    // InternalGoatComponentsParser.g:1570:3: ruleFuncVarDeclaration
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
    // InternalGoatComponentsParser.g:1579:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1583:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGoatComponentsParser.g:1584:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalGoatComponentsParser.g:1591:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1595:1: ( ( () ) )
            // InternalGoatComponentsParser.g:1596:1: ( () )
            {
            // InternalGoatComponentsParser.g:1596:1: ( () )
            // InternalGoatComponentsParser.g:1597:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalGoatComponentsParser.g:1598:2: ()
            // InternalGoatComponentsParser.g:1598:3: 
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
    // InternalGoatComponentsParser.g:1606:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1610:1: ( rule__Model__Group__1__Impl )
            // InternalGoatComponentsParser.g:1611:2: rule__Model__Group__1__Impl
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
    // InternalGoatComponentsParser.g:1617:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1621:1: ( ( ( rule__Model__Alternatives_1 )* ) )
            // InternalGoatComponentsParser.g:1622:1: ( ( rule__Model__Alternatives_1 )* )
            {
            // InternalGoatComponentsParser.g:1622:1: ( ( rule__Model__Alternatives_1 )* )
            // InternalGoatComponentsParser.g:1623:2: ( rule__Model__Alternatives_1 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalGoatComponentsParser.g:1624:2: ( rule__Model__Alternatives_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=Component && LA20_0<=Function)||LA20_0==Proc) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1624:3: rule__Model__Alternatives_1
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
    // InternalGoatComponentsParser.g:1633:1: rule__InterleavingProcess__Group__0 : rule__InterleavingProcess__Group__0__Impl rule__InterleavingProcess__Group__1 ;
    public final void rule__InterleavingProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1637:1: ( rule__InterleavingProcess__Group__0__Impl rule__InterleavingProcess__Group__1 )
            // InternalGoatComponentsParser.g:1638:2: rule__InterleavingProcess__Group__0__Impl rule__InterleavingProcess__Group__1
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
    // InternalGoatComponentsParser.g:1645:1: rule__InterleavingProcess__Group__0__Impl : ( ruleCallProcess ) ;
    public final void rule__InterleavingProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1649:1: ( ( ruleCallProcess ) )
            // InternalGoatComponentsParser.g:1650:1: ( ruleCallProcess )
            {
            // InternalGoatComponentsParser.g:1650:1: ( ruleCallProcess )
            // InternalGoatComponentsParser.g:1651:2: ruleCallProcess
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
    // InternalGoatComponentsParser.g:1660:1: rule__InterleavingProcess__Group__1 : rule__InterleavingProcess__Group__1__Impl rule__InterleavingProcess__Group__2 ;
    public final void rule__InterleavingProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1664:1: ( rule__InterleavingProcess__Group__1__Impl rule__InterleavingProcess__Group__2 )
            // InternalGoatComponentsParser.g:1665:2: rule__InterleavingProcess__Group__1__Impl rule__InterleavingProcess__Group__2
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
    // InternalGoatComponentsParser.g:1672:1: rule__InterleavingProcess__Group__1__Impl : ( () ) ;
    public final void rule__InterleavingProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1676:1: ( ( () ) )
            // InternalGoatComponentsParser.g:1677:1: ( () )
            {
            // InternalGoatComponentsParser.g:1677:1: ( () )
            // InternalGoatComponentsParser.g:1678:2: ()
            {
             before(grammarAccess.getInterleavingProcessAccess().getInterleavingProcessSubProcsAction_1()); 
            // InternalGoatComponentsParser.g:1679:2: ()
            // InternalGoatComponentsParser.g:1679:3: 
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
    // InternalGoatComponentsParser.g:1687:1: rule__InterleavingProcess__Group__2 : rule__InterleavingProcess__Group__2__Impl ;
    public final void rule__InterleavingProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1691:1: ( rule__InterleavingProcess__Group__2__Impl )
            // InternalGoatComponentsParser.g:1692:2: rule__InterleavingProcess__Group__2__Impl
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
    // InternalGoatComponentsParser.g:1698:1: rule__InterleavingProcess__Group__2__Impl : ( ( rule__InterleavingProcess__Group_2__0 )* ) ;
    public final void rule__InterleavingProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1702:1: ( ( ( rule__InterleavingProcess__Group_2__0 )* ) )
            // InternalGoatComponentsParser.g:1703:1: ( ( rule__InterleavingProcess__Group_2__0 )* )
            {
            // InternalGoatComponentsParser.g:1703:1: ( ( rule__InterleavingProcess__Group_2__0 )* )
            // InternalGoatComponentsParser.g:1704:2: ( rule__InterleavingProcess__Group_2__0 )*
            {
             before(grammarAccess.getInterleavingProcessAccess().getGroup_2()); 
            // InternalGoatComponentsParser.g:1705:2: ( rule__InterleavingProcess__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==VerticalLine) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1705:3: rule__InterleavingProcess__Group_2__0
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
    // InternalGoatComponentsParser.g:1714:1: rule__InterleavingProcess__Group_2__0 : rule__InterleavingProcess__Group_2__0__Impl rule__InterleavingProcess__Group_2__1 ;
    public final void rule__InterleavingProcess__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1718:1: ( rule__InterleavingProcess__Group_2__0__Impl rule__InterleavingProcess__Group_2__1 )
            // InternalGoatComponentsParser.g:1719:2: rule__InterleavingProcess__Group_2__0__Impl rule__InterleavingProcess__Group_2__1
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
    // InternalGoatComponentsParser.g:1726:1: rule__InterleavingProcess__Group_2__0__Impl : ( VerticalLine ) ;
    public final void rule__InterleavingProcess__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1730:1: ( ( VerticalLine ) )
            // InternalGoatComponentsParser.g:1731:1: ( VerticalLine )
            {
            // InternalGoatComponentsParser.g:1731:1: ( VerticalLine )
            // InternalGoatComponentsParser.g:1732:2: VerticalLine
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
    // InternalGoatComponentsParser.g:1741:1: rule__InterleavingProcess__Group_2__1 : rule__InterleavingProcess__Group_2__1__Impl ;
    public final void rule__InterleavingProcess__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1745:1: ( rule__InterleavingProcess__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:1746:2: rule__InterleavingProcess__Group_2__1__Impl
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
    // InternalGoatComponentsParser.g:1752:1: rule__InterleavingProcess__Group_2__1__Impl : ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) ) ;
    public final void rule__InterleavingProcess__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1756:1: ( ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) ) )
            // InternalGoatComponentsParser.g:1757:1: ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) )
            {
            // InternalGoatComponentsParser.g:1757:1: ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) )
            // InternalGoatComponentsParser.g:1758:2: ( rule__InterleavingProcess__SubProcsAssignment_2_1 )
            {
             before(grammarAccess.getInterleavingProcessAccess().getSubProcsAssignment_2_1()); 
            // InternalGoatComponentsParser.g:1759:2: ( rule__InterleavingProcess__SubProcsAssignment_2_1 )
            // InternalGoatComponentsParser.g:1759:3: rule__InterleavingProcess__SubProcsAssignment_2_1
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
    // InternalGoatComponentsParser.g:1768:1: rule__Preconditions__Group__0 : rule__Preconditions__Group__0__Impl rule__Preconditions__Group__1 ;
    public final void rule__Preconditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1772:1: ( rule__Preconditions__Group__0__Impl rule__Preconditions__Group__1 )
            // InternalGoatComponentsParser.g:1773:2: rule__Preconditions__Group__0__Impl rule__Preconditions__Group__1
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
    // InternalGoatComponentsParser.g:1780:1: rule__Preconditions__Group__0__Impl : ( () ) ;
    public final void rule__Preconditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1784:1: ( ( () ) )
            // InternalGoatComponentsParser.g:1785:1: ( () )
            {
            // InternalGoatComponentsParser.g:1785:1: ( () )
            // InternalGoatComponentsParser.g:1786:2: ()
            {
             before(grammarAccess.getPreconditionsAccess().getPreconditionsAction_0()); 
            // InternalGoatComponentsParser.g:1787:2: ()
            // InternalGoatComponentsParser.g:1787:3: 
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
    // InternalGoatComponentsParser.g:1795:1: rule__Preconditions__Group__1 : rule__Preconditions__Group__1__Impl ;
    public final void rule__Preconditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1799:1: ( rule__Preconditions__Group__1__Impl )
            // InternalGoatComponentsParser.g:1800:2: rule__Preconditions__Group__1__Impl
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
    // InternalGoatComponentsParser.g:1806:1: rule__Preconditions__Group__1__Impl : ( ( rule__Preconditions__PrecondAssignment_1 )* ) ;
    public final void rule__Preconditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1810:1: ( ( ( rule__Preconditions__PrecondAssignment_1 )* ) )
            // InternalGoatComponentsParser.g:1811:1: ( ( rule__Preconditions__PrecondAssignment_1 )* )
            {
            // InternalGoatComponentsParser.g:1811:1: ( ( rule__Preconditions__PrecondAssignment_1 )* )
            // InternalGoatComponentsParser.g:1812:2: ( rule__Preconditions__PrecondAssignment_1 )*
            {
             before(grammarAccess.getPreconditionsAccess().getPrecondAssignment_1()); 
            // InternalGoatComponentsParser.g:1813:2: ( rule__Preconditions__PrecondAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Wait||LA22_0==LeftSquareBracket) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:1813:3: rule__Preconditions__PrecondAssignment_1
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
    // InternalGoatComponentsParser.g:1822:1: rule__PredOutputProcessOrInputProcesses__Group__0 : rule__PredOutputProcessOrInputProcesses__Group__0__Impl rule__PredOutputProcessOrInputProcesses__Group__1 ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1826:1: ( rule__PredOutputProcessOrInputProcesses__Group__0__Impl rule__PredOutputProcessOrInputProcesses__Group__1 )
            // InternalGoatComponentsParser.g:1827:2: rule__PredOutputProcessOrInputProcesses__Group__0__Impl rule__PredOutputProcessOrInputProcesses__Group__1
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
    // InternalGoatComponentsParser.g:1834:1: rule__PredOutputProcessOrInputProcesses__Group__0__Impl : ( rulePreconditions ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1838:1: ( ( rulePreconditions ) )
            // InternalGoatComponentsParser.g:1839:1: ( rulePreconditions )
            {
            // InternalGoatComponentsParser.g:1839:1: ( rulePreconditions )
            // InternalGoatComponentsParser.g:1840:2: rulePreconditions
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
    // InternalGoatComponentsParser.g:1849:1: rule__PredOutputProcessOrInputProcesses__Group__1 : rule__PredOutputProcessOrInputProcesses__Group__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1853:1: ( rule__PredOutputProcessOrInputProcesses__Group__1__Impl )
            // InternalGoatComponentsParser.g:1854:2: rule__PredOutputProcessOrInputProcesses__Group__1__Impl
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
    // InternalGoatComponentsParser.g:1860:1: rule__PredOutputProcessOrInputProcesses__Group__1__Impl : ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1864:1: ( ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) ) )
            // InternalGoatComponentsParser.g:1865:1: ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) )
            {
            // InternalGoatComponentsParser.g:1865:1: ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) )
            // InternalGoatComponentsParser.g:1866:2: ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getAlternatives_1()); 
            // InternalGoatComponentsParser.g:1867:2: ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 )
            // InternalGoatComponentsParser.g:1867:3: rule__PredOutputProcessOrInputProcesses__Alternatives_1
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
    // InternalGoatComponentsParser.g:1876:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__0 : rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_0__1 ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1880:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_0__1 )
            // InternalGoatComponentsParser.g:1881:2: rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_0__1
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
    // InternalGoatComponentsParser.g:1888:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1892:1: ( ( () ) )
            // InternalGoatComponentsParser.g:1893:1: ( () )
            {
            // InternalGoatComponentsParser.g:1893:1: ( () )
            // InternalGoatComponentsParser.g:1894:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getOutputProcessPrecondAction_1_0_0()); 
            // InternalGoatComponentsParser.g:1895:2: ()
            // InternalGoatComponentsParser.g:1895:3: 
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
    // InternalGoatComponentsParser.g:1903:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__1 : rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1907:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl )
            // InternalGoatComponentsParser.g:1908:2: rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl
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
    // InternalGoatComponentsParser.g:1914:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl : ( ruleOutputProcessPart ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1918:1: ( ( ruleOutputProcessPart ) )
            // InternalGoatComponentsParser.g:1919:1: ( ruleOutputProcessPart )
            {
            // InternalGoatComponentsParser.g:1919:1: ( ruleOutputProcessPart )
            // InternalGoatComponentsParser.g:1920:2: ruleOutputProcessPart
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
    // InternalGoatComponentsParser.g:1930:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__0 : rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_1__1 ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1934:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_1__1 )
            // InternalGoatComponentsParser.g:1935:2: rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_1__1
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
    // InternalGoatComponentsParser.g:1942:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1946:1: ( ( () ) )
            // InternalGoatComponentsParser.g:1947:1: ( () )
            {
            // InternalGoatComponentsParser.g:1947:1: ( () )
            // InternalGoatComponentsParser.g:1948:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getInputProcessesPrecondsAction_1_1_0()); 
            // InternalGoatComponentsParser.g:1949:2: ()
            // InternalGoatComponentsParser.g:1949:3: 
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
    // InternalGoatComponentsParser.g:1957:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__1 : rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1961:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl )
            // InternalGoatComponentsParser.g:1962:2: rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl
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
    // InternalGoatComponentsParser.g:1968:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl : ( ruleInputProcessesPart ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1972:1: ( ( ruleInputProcessesPart ) )
            // InternalGoatComponentsParser.g:1973:1: ( ruleInputProcessesPart )
            {
            // InternalGoatComponentsParser.g:1973:1: ( ruleInputProcessesPart )
            // InternalGoatComponentsParser.g:1974:2: ruleInputProcessesPart
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
    // InternalGoatComponentsParser.g:1984:1: rule__PredOutputProcessOrInputProcess__Group__0 : rule__PredOutputProcessOrInputProcess__Group__0__Impl rule__PredOutputProcessOrInputProcess__Group__1 ;
    public final void rule__PredOutputProcessOrInputProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:1988:1: ( rule__PredOutputProcessOrInputProcess__Group__0__Impl rule__PredOutputProcessOrInputProcess__Group__1 )
            // InternalGoatComponentsParser.g:1989:2: rule__PredOutputProcessOrInputProcess__Group__0__Impl rule__PredOutputProcessOrInputProcess__Group__1
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
    // InternalGoatComponentsParser.g:1996:1: rule__PredOutputProcessOrInputProcess__Group__0__Impl : ( rulePreconditions ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2000:1: ( ( rulePreconditions ) )
            // InternalGoatComponentsParser.g:2001:1: ( rulePreconditions )
            {
            // InternalGoatComponentsParser.g:2001:1: ( rulePreconditions )
            // InternalGoatComponentsParser.g:2002:2: rulePreconditions
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
    // InternalGoatComponentsParser.g:2011:1: rule__PredOutputProcessOrInputProcess__Group__1 : rule__PredOutputProcessOrInputProcess__Group__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2015:1: ( rule__PredOutputProcessOrInputProcess__Group__1__Impl )
            // InternalGoatComponentsParser.g:2016:2: rule__PredOutputProcessOrInputProcess__Group__1__Impl
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
    // InternalGoatComponentsParser.g:2022:1: rule__PredOutputProcessOrInputProcess__Group__1__Impl : ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2026:1: ( ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) ) )
            // InternalGoatComponentsParser.g:2027:1: ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) )
            {
            // InternalGoatComponentsParser.g:2027:1: ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) )
            // InternalGoatComponentsParser.g:2028:2: ( rule__PredOutputProcessOrInputProcess__Alternatives_1 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getAlternatives_1()); 
            // InternalGoatComponentsParser.g:2029:2: ( rule__PredOutputProcessOrInputProcess__Alternatives_1 )
            // InternalGoatComponentsParser.g:2029:3: rule__PredOutputProcessOrInputProcess__Alternatives_1
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
    // InternalGoatComponentsParser.g:2038:1: rule__PredOutputProcessOrInputProcess__Group_1_0__0 : rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_0__1 ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2042:1: ( rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_0__1 )
            // InternalGoatComponentsParser.g:2043:2: rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_0__1
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
    // InternalGoatComponentsParser.g:2050:1: rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2054:1: ( ( () ) )
            // InternalGoatComponentsParser.g:2055:1: ( () )
            {
            // InternalGoatComponentsParser.g:2055:1: ( () )
            // InternalGoatComponentsParser.g:2056:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getOutputProcessPrecondAction_1_0_0()); 
            // InternalGoatComponentsParser.g:2057:2: ()
            // InternalGoatComponentsParser.g:2057:3: 
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
    // InternalGoatComponentsParser.g:2065:1: rule__PredOutputProcessOrInputProcess__Group_1_0__1 : rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2069:1: ( rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl )
            // InternalGoatComponentsParser.g:2070:2: rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl
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
    // InternalGoatComponentsParser.g:2076:1: rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl : ( ruleOutputProcessPart ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2080:1: ( ( ruleOutputProcessPart ) )
            // InternalGoatComponentsParser.g:2081:1: ( ruleOutputProcessPart )
            {
            // InternalGoatComponentsParser.g:2081:1: ( ruleOutputProcessPart )
            // InternalGoatComponentsParser.g:2082:2: ruleOutputProcessPart
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
    // InternalGoatComponentsParser.g:2092:1: rule__PredOutputProcessOrInputProcess__Group_1_1__0 : rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_1__1 ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2096:1: ( rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_1__1 )
            // InternalGoatComponentsParser.g:2097:2: rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_1__1
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
    // InternalGoatComponentsParser.g:2104:1: rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2108:1: ( ( () ) )
            // InternalGoatComponentsParser.g:2109:1: ( () )
            {
            // InternalGoatComponentsParser.g:2109:1: ( () )
            // InternalGoatComponentsParser.g:2110:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputProcessesPrecondsAction_1_1_0()); 
            // InternalGoatComponentsParser.g:2111:2: ()
            // InternalGoatComponentsParser.g:2111:3: 
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
    // InternalGoatComponentsParser.g:2119:1: rule__PredOutputProcessOrInputProcess__Group_1_1__1 : rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2123:1: ( rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl )
            // InternalGoatComponentsParser.g:2124:2: rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl
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
    // InternalGoatComponentsParser.g:2130:1: rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl : ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2134:1: ( ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) ) )
            // InternalGoatComponentsParser.g:2135:1: ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) )
            {
            // InternalGoatComponentsParser.g:2135:1: ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) )
            // InternalGoatComponentsParser.g:2136:2: ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputsAssignment_1_1_1()); 
            // InternalGoatComponentsParser.g:2137:2: ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 )
            // InternalGoatComponentsParser.g:2137:3: rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1
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
    // InternalGoatComponentsParser.g:2146:1: rule__InputProcessesPart__Group__0 : rule__InputProcessesPart__Group__0__Impl rule__InputProcessesPart__Group__1 ;
    public final void rule__InputProcessesPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2150:1: ( rule__InputProcessesPart__Group__0__Impl rule__InputProcessesPart__Group__1 )
            // InternalGoatComponentsParser.g:2151:2: rule__InputProcessesPart__Group__0__Impl rule__InputProcessesPart__Group__1
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
    // InternalGoatComponentsParser.g:2158:1: rule__InputProcessesPart__Group__0__Impl : ( ( rule__InputProcessesPart__InputsAssignment_0 ) ) ;
    public final void rule__InputProcessesPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2162:1: ( ( ( rule__InputProcessesPart__InputsAssignment_0 ) ) )
            // InternalGoatComponentsParser.g:2163:1: ( ( rule__InputProcessesPart__InputsAssignment_0 ) )
            {
            // InternalGoatComponentsParser.g:2163:1: ( ( rule__InputProcessesPart__InputsAssignment_0 ) )
            // InternalGoatComponentsParser.g:2164:2: ( rule__InputProcessesPart__InputsAssignment_0 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getInputsAssignment_0()); 
            // InternalGoatComponentsParser.g:2165:2: ( rule__InputProcessesPart__InputsAssignment_0 )
            // InternalGoatComponentsParser.g:2165:3: rule__InputProcessesPart__InputsAssignment_0
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
    // InternalGoatComponentsParser.g:2173:1: rule__InputProcessesPart__Group__1 : rule__InputProcessesPart__Group__1__Impl ;
    public final void rule__InputProcessesPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2177:1: ( rule__InputProcessesPart__Group__1__Impl )
            // InternalGoatComponentsParser.g:2178:2: rule__InputProcessesPart__Group__1__Impl
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
    // InternalGoatComponentsParser.g:2184:1: rule__InputProcessesPart__Group__1__Impl : ( ( rule__InputProcessesPart__Group_1__0 )* ) ;
    public final void rule__InputProcessesPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2188:1: ( ( ( rule__InputProcessesPart__Group_1__0 )* ) )
            // InternalGoatComponentsParser.g:2189:1: ( ( rule__InputProcessesPart__Group_1__0 )* )
            {
            // InternalGoatComponentsParser.g:2189:1: ( ( rule__InputProcessesPart__Group_1__0 )* )
            // InternalGoatComponentsParser.g:2190:2: ( rule__InputProcessesPart__Group_1__0 )*
            {
             before(grammarAccess.getInputProcessesPartAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:2191:2: ( rule__InputProcessesPart__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==PlusSign) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2191:3: rule__InputProcessesPart__Group_1__0
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
    // InternalGoatComponentsParser.g:2200:1: rule__InputProcessesPart__Group_1__0 : rule__InputProcessesPart__Group_1__0__Impl rule__InputProcessesPart__Group_1__1 ;
    public final void rule__InputProcessesPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2204:1: ( rule__InputProcessesPart__Group_1__0__Impl rule__InputProcessesPart__Group_1__1 )
            // InternalGoatComponentsParser.g:2205:2: rule__InputProcessesPart__Group_1__0__Impl rule__InputProcessesPart__Group_1__1
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
    // InternalGoatComponentsParser.g:2212:1: rule__InputProcessesPart__Group_1__0__Impl : ( PlusSign ) ;
    public final void rule__InputProcessesPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2216:1: ( ( PlusSign ) )
            // InternalGoatComponentsParser.g:2217:1: ( PlusSign )
            {
            // InternalGoatComponentsParser.g:2217:1: ( PlusSign )
            // InternalGoatComponentsParser.g:2218:2: PlusSign
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
    // InternalGoatComponentsParser.g:2227:1: rule__InputProcessesPart__Group_1__1 : rule__InputProcessesPart__Group_1__1__Impl rule__InputProcessesPart__Group_1__2 ;
    public final void rule__InputProcessesPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2231:1: ( rule__InputProcessesPart__Group_1__1__Impl rule__InputProcessesPart__Group_1__2 )
            // InternalGoatComponentsParser.g:2232:2: rule__InputProcessesPart__Group_1__1__Impl rule__InputProcessesPart__Group_1__2
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
    // InternalGoatComponentsParser.g:2239:1: rule__InputProcessesPart__Group_1__1__Impl : ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) ) ;
    public final void rule__InputProcessesPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2243:1: ( ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:2244:1: ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:2244:1: ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:2245:2: ( rule__InputProcessesPart__PrecondsAssignment_1_1 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getPrecondsAssignment_1_1()); 
            // InternalGoatComponentsParser.g:2246:2: ( rule__InputProcessesPart__PrecondsAssignment_1_1 )
            // InternalGoatComponentsParser.g:2246:3: rule__InputProcessesPart__PrecondsAssignment_1_1
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
    // InternalGoatComponentsParser.g:2254:1: rule__InputProcessesPart__Group_1__2 : rule__InputProcessesPart__Group_1__2__Impl ;
    public final void rule__InputProcessesPart__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2258:1: ( rule__InputProcessesPart__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:2259:2: rule__InputProcessesPart__Group_1__2__Impl
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
    // InternalGoatComponentsParser.g:2265:1: rule__InputProcessesPart__Group_1__2__Impl : ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) ) ;
    public final void rule__InputProcessesPart__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2269:1: ( ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:2270:1: ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:2270:1: ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:2271:2: ( rule__InputProcessesPart__InputsAssignment_1_2 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getInputsAssignment_1_2()); 
            // InternalGoatComponentsParser.g:2272:2: ( rule__InputProcessesPart__InputsAssignment_1_2 )
            // InternalGoatComponentsParser.g:2272:3: rule__InputProcessesPart__InputsAssignment_1_2
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
    // InternalGoatComponentsParser.g:2281:1: rule__InputProcess__Group__0 : rule__InputProcess__Group__0__Impl rule__InputProcess__Group__1 ;
    public final void rule__InputProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2285:1: ( rule__InputProcess__Group__0__Impl rule__InputProcess__Group__1 )
            // InternalGoatComponentsParser.g:2286:2: rule__InputProcess__Group__0__Impl rule__InputProcess__Group__1
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
    // InternalGoatComponentsParser.g:2293:1: rule__InputProcess__Group__0__Impl : ( () ) ;
    public final void rule__InputProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2297:1: ( ( () ) )
            // InternalGoatComponentsParser.g:2298:1: ( () )
            {
            // InternalGoatComponentsParser.g:2298:1: ( () )
            // InternalGoatComponentsParser.g:2299:2: ()
            {
             before(grammarAccess.getInputProcessAccess().getInputProcessAction_0()); 
            // InternalGoatComponentsParser.g:2300:2: ()
            // InternalGoatComponentsParser.g:2300:3: 
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
    // InternalGoatComponentsParser.g:2308:1: rule__InputProcess__Group__1 : rule__InputProcess__Group__1__Impl rule__InputProcess__Group__2 ;
    public final void rule__InputProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2312:1: ( rule__InputProcess__Group__1__Impl rule__InputProcess__Group__2 )
            // InternalGoatComponentsParser.g:2313:2: rule__InputProcess__Group__1__Impl rule__InputProcess__Group__2
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
    // InternalGoatComponentsParser.g:2320:1: rule__InputProcess__Group__1__Impl : ( Receive ) ;
    public final void rule__InputProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2324:1: ( ( Receive ) )
            // InternalGoatComponentsParser.g:2325:1: ( Receive )
            {
            // InternalGoatComponentsParser.g:2325:1: ( Receive )
            // InternalGoatComponentsParser.g:2326:2: Receive
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
    // InternalGoatComponentsParser.g:2335:1: rule__InputProcess__Group__2 : rule__InputProcess__Group__2__Impl rule__InputProcess__Group__3 ;
    public final void rule__InputProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2339:1: ( rule__InputProcess__Group__2__Impl rule__InputProcess__Group__3 )
            // InternalGoatComponentsParser.g:2340:2: rule__InputProcess__Group__2__Impl rule__InputProcess__Group__3
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
    // InternalGoatComponentsParser.g:2347:1: rule__InputProcess__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__InputProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2351:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:2352:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:2352:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:2353:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:2362:1: rule__InputProcess__Group__3 : rule__InputProcess__Group__3__Impl rule__InputProcess__Group__4 ;
    public final void rule__InputProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2366:1: ( rule__InputProcess__Group__3__Impl rule__InputProcess__Group__4 )
            // InternalGoatComponentsParser.g:2367:2: rule__InputProcess__Group__3__Impl rule__InputProcess__Group__4
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
    // InternalGoatComponentsParser.g:2374:1: rule__InputProcess__Group__3__Impl : ( ( rule__InputProcess__Rec_predAssignment_3 ) ) ;
    public final void rule__InputProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2378:1: ( ( ( rule__InputProcess__Rec_predAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:2379:1: ( ( rule__InputProcess__Rec_predAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:2379:1: ( ( rule__InputProcess__Rec_predAssignment_3 ) )
            // InternalGoatComponentsParser.g:2380:2: ( rule__InputProcess__Rec_predAssignment_3 )
            {
             before(grammarAccess.getInputProcessAccess().getRec_predAssignment_3()); 
            // InternalGoatComponentsParser.g:2381:2: ( rule__InputProcess__Rec_predAssignment_3 )
            // InternalGoatComponentsParser.g:2381:3: rule__InputProcess__Rec_predAssignment_3
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
    // InternalGoatComponentsParser.g:2389:1: rule__InputProcess__Group__4 : rule__InputProcess__Group__4__Impl rule__InputProcess__Group__5 ;
    public final void rule__InputProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2393:1: ( rule__InputProcess__Group__4__Impl rule__InputProcess__Group__5 )
            // InternalGoatComponentsParser.g:2394:2: rule__InputProcess__Group__4__Impl rule__InputProcess__Group__5
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
    // InternalGoatComponentsParser.g:2401:1: rule__InputProcess__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__InputProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2405:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:2406:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:2406:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:2407:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:2416:1: rule__InputProcess__Group__5 : rule__InputProcess__Group__5__Impl rule__InputProcess__Group__6 ;
    public final void rule__InputProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2420:1: ( rule__InputProcess__Group__5__Impl rule__InputProcess__Group__6 )
            // InternalGoatComponentsParser.g:2421:2: rule__InputProcess__Group__5__Impl rule__InputProcess__Group__6
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
    // InternalGoatComponentsParser.g:2428:1: rule__InputProcess__Group__5__Impl : ( LeftCurlyBracket ) ;
    public final void rule__InputProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2432:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:2433:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2433:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:2434:2: LeftCurlyBracket
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
    // InternalGoatComponentsParser.g:2443:1: rule__InputProcess__Group__6 : rule__InputProcess__Group__6__Impl rule__InputProcess__Group__7 ;
    public final void rule__InputProcess__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2447:1: ( rule__InputProcess__Group__6__Impl rule__InputProcess__Group__7 )
            // InternalGoatComponentsParser.g:2448:2: rule__InputProcess__Group__6__Impl rule__InputProcess__Group__7
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
    // InternalGoatComponentsParser.g:2455:1: rule__InputProcess__Group__6__Impl : ( ( rule__InputProcess__Group_6__0 )? ) ;
    public final void rule__InputProcess__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2459:1: ( ( ( rule__InputProcess__Group_6__0 )? ) )
            // InternalGoatComponentsParser.g:2460:1: ( ( rule__InputProcess__Group_6__0 )? )
            {
            // InternalGoatComponentsParser.g:2460:1: ( ( rule__InputProcess__Group_6__0 )? )
            // InternalGoatComponentsParser.g:2461:2: ( rule__InputProcess__Group_6__0 )?
            {
             before(grammarAccess.getInputProcessAccess().getGroup_6()); 
            // InternalGoatComponentsParser.g:2462:2: ( rule__InputProcess__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Proc||LA24_0==This) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGoatComponentsParser.g:2462:3: rule__InputProcess__Group_6__0
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
    // InternalGoatComponentsParser.g:2470:1: rule__InputProcess__Group__7 : rule__InputProcess__Group__7__Impl rule__InputProcess__Group__8 ;
    public final void rule__InputProcess__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2474:1: ( rule__InputProcess__Group__7__Impl rule__InputProcess__Group__8 )
            // InternalGoatComponentsParser.g:2475:2: rule__InputProcess__Group__7__Impl rule__InputProcess__Group__8
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
    // InternalGoatComponentsParser.g:2482:1: rule__InputProcess__Group__7__Impl : ( RightCurlyBracket ) ;
    public final void rule__InputProcess__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2486:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:2487:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2487:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:2488:2: RightCurlyBracket
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
    // InternalGoatComponentsParser.g:2497:1: rule__InputProcess__Group__8 : rule__InputProcess__Group__8__Impl rule__InputProcess__Group__9 ;
    public final void rule__InputProcess__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2501:1: ( rule__InputProcess__Group__8__Impl rule__InputProcess__Group__9 )
            // InternalGoatComponentsParser.g:2502:2: rule__InputProcess__Group__8__Impl rule__InputProcess__Group__9
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
    // InternalGoatComponentsParser.g:2509:1: rule__InputProcess__Group__8__Impl : ( ( rule__InputProcess__Group_8__0 )? ) ;
    public final void rule__InputProcess__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2513:1: ( ( ( rule__InputProcess__Group_8__0 )? ) )
            // InternalGoatComponentsParser.g:2514:1: ( ( rule__InputProcess__Group_8__0 )? )
            {
            // InternalGoatComponentsParser.g:2514:1: ( ( rule__InputProcess__Group_8__0 )? )
            // InternalGoatComponentsParser.g:2515:2: ( rule__InputProcess__Group_8__0 )?
            {
             before(grammarAccess.getInputProcessAccess().getGroup_8()); 
            // InternalGoatComponentsParser.g:2516:2: ( rule__InputProcess__Group_8__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Print) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGoatComponentsParser.g:2516:3: rule__InputProcess__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputProcess__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputProcessAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalGoatComponentsParser.g:2524:1: rule__InputProcess__Group__9 : rule__InputProcess__Group__9__Impl rule__InputProcess__Group__10 ;
    public final void rule__InputProcess__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2528:1: ( rule__InputProcess__Group__9__Impl rule__InputProcess__Group__10 )
            // InternalGoatComponentsParser.g:2529:2: rule__InputProcess__Group__9__Impl rule__InputProcess__Group__10
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
    // InternalGoatComponentsParser.g:2536:1: rule__InputProcess__Group__9__Impl : ( FullStop ) ;
    public final void rule__InputProcess__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2540:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:2541:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:2541:1: ( FullStop )
            // InternalGoatComponentsParser.g:2542:2: FullStop
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
    // InternalGoatComponentsParser.g:2551:1: rule__InputProcess__Group__10 : rule__InputProcess__Group__10__Impl ;
    public final void rule__InputProcess__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2555:1: ( rule__InputProcess__Group__10__Impl )
            // InternalGoatComponentsParser.g:2556:2: rule__InputProcess__Group__10__Impl
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
    // InternalGoatComponentsParser.g:2562:1: rule__InputProcess__Group__10__Impl : ( ( rule__InputProcess__NextAssignment_10 ) ) ;
    public final void rule__InputProcess__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2566:1: ( ( ( rule__InputProcess__NextAssignment_10 ) ) )
            // InternalGoatComponentsParser.g:2567:1: ( ( rule__InputProcess__NextAssignment_10 ) )
            {
            // InternalGoatComponentsParser.g:2567:1: ( ( rule__InputProcess__NextAssignment_10 ) )
            // InternalGoatComponentsParser.g:2568:2: ( rule__InputProcess__NextAssignment_10 )
            {
             before(grammarAccess.getInputProcessAccess().getNextAssignment_10()); 
            // InternalGoatComponentsParser.g:2569:2: ( rule__InputProcess__NextAssignment_10 )
            // InternalGoatComponentsParser.g:2569:3: rule__InputProcess__NextAssignment_10
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
    // InternalGoatComponentsParser.g:2578:1: rule__InputProcess__Group_6__0 : rule__InputProcess__Group_6__0__Impl rule__InputProcess__Group_6__1 ;
    public final void rule__InputProcess__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2582:1: ( rule__InputProcess__Group_6__0__Impl rule__InputProcess__Group_6__1 )
            // InternalGoatComponentsParser.g:2583:2: rule__InputProcess__Group_6__0__Impl rule__InputProcess__Group_6__1
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
    // InternalGoatComponentsParser.g:2590:1: rule__InputProcess__Group_6__0__Impl : ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) ) ;
    public final void rule__InputProcess__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2594:1: ( ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) ) )
            // InternalGoatComponentsParser.g:2595:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) )
            {
            // InternalGoatComponentsParser.g:2595:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) )
            // InternalGoatComponentsParser.g:2596:2: ( rule__InputProcess__MsgInPartsAssignment_6_0 )
            {
             before(grammarAccess.getInputProcessAccess().getMsgInPartsAssignment_6_0()); 
            // InternalGoatComponentsParser.g:2597:2: ( rule__InputProcess__MsgInPartsAssignment_6_0 )
            // InternalGoatComponentsParser.g:2597:3: rule__InputProcess__MsgInPartsAssignment_6_0
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
    // InternalGoatComponentsParser.g:2605:1: rule__InputProcess__Group_6__1 : rule__InputProcess__Group_6__1__Impl ;
    public final void rule__InputProcess__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2609:1: ( rule__InputProcess__Group_6__1__Impl )
            // InternalGoatComponentsParser.g:2610:2: rule__InputProcess__Group_6__1__Impl
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
    // InternalGoatComponentsParser.g:2616:1: rule__InputProcess__Group_6__1__Impl : ( ( rule__InputProcess__Group_6_1__0 )* ) ;
    public final void rule__InputProcess__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2620:1: ( ( ( rule__InputProcess__Group_6_1__0 )* ) )
            // InternalGoatComponentsParser.g:2621:1: ( ( rule__InputProcess__Group_6_1__0 )* )
            {
            // InternalGoatComponentsParser.g:2621:1: ( ( rule__InputProcess__Group_6_1__0 )* )
            // InternalGoatComponentsParser.g:2622:2: ( rule__InputProcess__Group_6_1__0 )*
            {
             before(grammarAccess.getInputProcessAccess().getGroup_6_1()); 
            // InternalGoatComponentsParser.g:2623:2: ( rule__InputProcess__Group_6_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:2623:3: rule__InputProcess__Group_6_1__0
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
    // InternalGoatComponentsParser.g:2632:1: rule__InputProcess__Group_6_1__0 : rule__InputProcess__Group_6_1__0__Impl rule__InputProcess__Group_6_1__1 ;
    public final void rule__InputProcess__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2636:1: ( rule__InputProcess__Group_6_1__0__Impl rule__InputProcess__Group_6_1__1 )
            // InternalGoatComponentsParser.g:2637:2: rule__InputProcess__Group_6_1__0__Impl rule__InputProcess__Group_6_1__1
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
    // InternalGoatComponentsParser.g:2644:1: rule__InputProcess__Group_6_1__0__Impl : ( Comma ) ;
    public final void rule__InputProcess__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2648:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:2649:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:2649:1: ( Comma )
            // InternalGoatComponentsParser.g:2650:2: Comma
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
    // InternalGoatComponentsParser.g:2659:1: rule__InputProcess__Group_6_1__1 : rule__InputProcess__Group_6_1__1__Impl ;
    public final void rule__InputProcess__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2663:1: ( rule__InputProcess__Group_6_1__1__Impl )
            // InternalGoatComponentsParser.g:2664:2: rule__InputProcess__Group_6_1__1__Impl
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
    // InternalGoatComponentsParser.g:2670:1: rule__InputProcess__Group_6_1__1__Impl : ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) ) ;
    public final void rule__InputProcess__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2674:1: ( ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) ) )
            // InternalGoatComponentsParser.g:2675:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) )
            {
            // InternalGoatComponentsParser.g:2675:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) )
            // InternalGoatComponentsParser.g:2676:2: ( rule__InputProcess__MsgInPartsAssignment_6_1_1 )
            {
             before(grammarAccess.getInputProcessAccess().getMsgInPartsAssignment_6_1_1()); 
            // InternalGoatComponentsParser.g:2677:2: ( rule__InputProcess__MsgInPartsAssignment_6_1_1 )
            // InternalGoatComponentsParser.g:2677:3: rule__InputProcess__MsgInPartsAssignment_6_1_1
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


    // $ANTLR start "rule__InputProcess__Group_8__0"
    // InternalGoatComponentsParser.g:2686:1: rule__InputProcess__Group_8__0 : rule__InputProcess__Group_8__0__Impl rule__InputProcess__Group_8__1 ;
    public final void rule__InputProcess__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2690:1: ( rule__InputProcess__Group_8__0__Impl rule__InputProcess__Group_8__1 )
            // InternalGoatComponentsParser.g:2691:2: rule__InputProcess__Group_8__0__Impl rule__InputProcess__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__InputProcess__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__Group_8__0"


    // $ANTLR start "rule__InputProcess__Group_8__0__Impl"
    // InternalGoatComponentsParser.g:2698:1: rule__InputProcess__Group_8__0__Impl : ( Print ) ;
    public final void rule__InputProcess__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2702:1: ( ( Print ) )
            // InternalGoatComponentsParser.g:2703:1: ( Print )
            {
            // InternalGoatComponentsParser.g:2703:1: ( Print )
            // InternalGoatComponentsParser.g:2704:2: Print
            {
             before(grammarAccess.getInputProcessAccess().getPrintKeyword_8_0()); 
            match(input,Print,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getPrintKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__Group_8__0__Impl"


    // $ANTLR start "rule__InputProcess__Group_8__1"
    // InternalGoatComponentsParser.g:2713:1: rule__InputProcess__Group_8__1 : rule__InputProcess__Group_8__1__Impl rule__InputProcess__Group_8__2 ;
    public final void rule__InputProcess__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2717:1: ( rule__InputProcess__Group_8__1__Impl rule__InputProcess__Group_8__2 )
            // InternalGoatComponentsParser.g:2718:2: rule__InputProcess__Group_8__1__Impl rule__InputProcess__Group_8__2
            {
            pushFollow(FOLLOW_24);
            rule__InputProcess__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__Group_8__1"


    // $ANTLR start "rule__InputProcess__Group_8__1__Impl"
    // InternalGoatComponentsParser.g:2725:1: rule__InputProcess__Group_8__1__Impl : ( LeftParenthesis ) ;
    public final void rule__InputProcess__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2729:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:2730:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:2730:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:2731:2: LeftParenthesis
            {
             before(grammarAccess.getInputProcessAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__Group_8__1__Impl"


    // $ANTLR start "rule__InputProcess__Group_8__2"
    // InternalGoatComponentsParser.g:2740:1: rule__InputProcess__Group_8__2 : rule__InputProcess__Group_8__2__Impl rule__InputProcess__Group_8__3 ;
    public final void rule__InputProcess__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2744:1: ( rule__InputProcess__Group_8__2__Impl rule__InputProcess__Group_8__3 )
            // InternalGoatComponentsParser.g:2745:2: rule__InputProcess__Group_8__2__Impl rule__InputProcess__Group_8__3
            {
            pushFollow(FOLLOW_16);
            rule__InputProcess__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputProcess__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__Group_8__2"


    // $ANTLR start "rule__InputProcess__Group_8__2__Impl"
    // InternalGoatComponentsParser.g:2752:1: rule__InputProcess__Group_8__2__Impl : ( ( rule__InputProcess__OutputAssignment_8_2 ) ) ;
    public final void rule__InputProcess__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2756:1: ( ( ( rule__InputProcess__OutputAssignment_8_2 ) ) )
            // InternalGoatComponentsParser.g:2757:1: ( ( rule__InputProcess__OutputAssignment_8_2 ) )
            {
            // InternalGoatComponentsParser.g:2757:1: ( ( rule__InputProcess__OutputAssignment_8_2 ) )
            // InternalGoatComponentsParser.g:2758:2: ( rule__InputProcess__OutputAssignment_8_2 )
            {
             before(grammarAccess.getInputProcessAccess().getOutputAssignment_8_2()); 
            // InternalGoatComponentsParser.g:2759:2: ( rule__InputProcess__OutputAssignment_8_2 )
            // InternalGoatComponentsParser.g:2759:3: rule__InputProcess__OutputAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__OutputAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getInputProcessAccess().getOutputAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__Group_8__2__Impl"


    // $ANTLR start "rule__InputProcess__Group_8__3"
    // InternalGoatComponentsParser.g:2767:1: rule__InputProcess__Group_8__3 : rule__InputProcess__Group_8__3__Impl ;
    public final void rule__InputProcess__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2771:1: ( rule__InputProcess__Group_8__3__Impl )
            // InternalGoatComponentsParser.g:2772:2: rule__InputProcess__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputProcess__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__Group_8__3"


    // $ANTLR start "rule__InputProcess__Group_8__3__Impl"
    // InternalGoatComponentsParser.g:2778:1: rule__InputProcess__Group_8__3__Impl : ( RightParenthesis ) ;
    public final void rule__InputProcess__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2782:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:2783:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:2783:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:2784:2: RightParenthesis
            {
             before(grammarAccess.getInputProcessAccess().getRightParenthesisKeyword_8_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getRightParenthesisKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__Group_8__3__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group__0"
    // InternalGoatComponentsParser.g:2794:1: rule__OutputProcessPart__Group__0 : rule__OutputProcessPart__Group__0__Impl rule__OutputProcessPart__Group__1 ;
    public final void rule__OutputProcessPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2798:1: ( rule__OutputProcessPart__Group__0__Impl rule__OutputProcessPart__Group__1 )
            // InternalGoatComponentsParser.g:2799:2: rule__OutputProcessPart__Group__0__Impl rule__OutputProcessPart__Group__1
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
    // InternalGoatComponentsParser.g:2806:1: rule__OutputProcessPart__Group__0__Impl : ( Send ) ;
    public final void rule__OutputProcessPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2810:1: ( ( Send ) )
            // InternalGoatComponentsParser.g:2811:1: ( Send )
            {
            // InternalGoatComponentsParser.g:2811:1: ( Send )
            // InternalGoatComponentsParser.g:2812:2: Send
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
    // InternalGoatComponentsParser.g:2821:1: rule__OutputProcessPart__Group__1 : rule__OutputProcessPart__Group__1__Impl rule__OutputProcessPart__Group__2 ;
    public final void rule__OutputProcessPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2825:1: ( rule__OutputProcessPart__Group__1__Impl rule__OutputProcessPart__Group__2 )
            // InternalGoatComponentsParser.g:2826:2: rule__OutputProcessPart__Group__1__Impl rule__OutputProcessPart__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalGoatComponentsParser.g:2833:1: rule__OutputProcessPart__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__OutputProcessPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2837:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:2838:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2838:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:2839:2: LeftCurlyBracket
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
    // InternalGoatComponentsParser.g:2848:1: rule__OutputProcessPart__Group__2 : rule__OutputProcessPart__Group__2__Impl rule__OutputProcessPart__Group__3 ;
    public final void rule__OutputProcessPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2852:1: ( rule__OutputProcessPart__Group__2__Impl rule__OutputProcessPart__Group__3 )
            // InternalGoatComponentsParser.g:2853:2: rule__OutputProcessPart__Group__2__Impl rule__OutputProcessPart__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalGoatComponentsParser.g:2860:1: rule__OutputProcessPart__Group__2__Impl : ( ( rule__OutputProcessPart__Group_2__0 )? ) ;
    public final void rule__OutputProcessPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2864:1: ( ( ( rule__OutputProcessPart__Group_2__0 )? ) )
            // InternalGoatComponentsParser.g:2865:1: ( ( rule__OutputProcessPart__Group_2__0 )? )
            {
            // InternalGoatComponentsParser.g:2865:1: ( ( rule__OutputProcessPart__Group_2__0 )? )
            // InternalGoatComponentsParser.g:2866:2: ( rule__OutputProcessPart__Group_2__0 )?
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_2()); 
            // InternalGoatComponentsParser.g:2867:2: ( rule__OutputProcessPart__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Receiver||LA27_0==False||LA27_0==Proc||(LA27_0>=This && LA27_0<=True)||(LA27_0>=ExclamationMark && LA27_0<=LeftParenthesis)||(LA27_0>=RULE_ID && LA27_0<=RULE_STRING)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGoatComponentsParser.g:2867:3: rule__OutputProcessPart__Group_2__0
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
    // InternalGoatComponentsParser.g:2875:1: rule__OutputProcessPart__Group__3 : rule__OutputProcessPart__Group__3__Impl rule__OutputProcessPart__Group__4 ;
    public final void rule__OutputProcessPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2879:1: ( rule__OutputProcessPart__Group__3__Impl rule__OutputProcessPart__Group__4 )
            // InternalGoatComponentsParser.g:2880:2: rule__OutputProcessPart__Group__3__Impl rule__OutputProcessPart__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalGoatComponentsParser.g:2887:1: rule__OutputProcessPart__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__OutputProcessPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2891:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:2892:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:2892:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:2893:2: RightCurlyBracket
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
    // InternalGoatComponentsParser.g:2902:1: rule__OutputProcessPart__Group__4 : rule__OutputProcessPart__Group__4__Impl rule__OutputProcessPart__Group__5 ;
    public final void rule__OutputProcessPart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2906:1: ( rule__OutputProcessPart__Group__4__Impl rule__OutputProcessPart__Group__5 )
            // InternalGoatComponentsParser.g:2907:2: rule__OutputProcessPart__Group__4__Impl rule__OutputProcessPart__Group__5
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
    // InternalGoatComponentsParser.g:2914:1: rule__OutputProcessPart__Group__4__Impl : ( CommercialAt ) ;
    public final void rule__OutputProcessPart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2918:1: ( ( CommercialAt ) )
            // InternalGoatComponentsParser.g:2919:1: ( CommercialAt )
            {
            // InternalGoatComponentsParser.g:2919:1: ( CommercialAt )
            // InternalGoatComponentsParser.g:2920:2: CommercialAt
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
    // InternalGoatComponentsParser.g:2929:1: rule__OutputProcessPart__Group__5 : rule__OutputProcessPart__Group__5__Impl rule__OutputProcessPart__Group__6 ;
    public final void rule__OutputProcessPart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2933:1: ( rule__OutputProcessPart__Group__5__Impl rule__OutputProcessPart__Group__6 )
            // InternalGoatComponentsParser.g:2934:2: rule__OutputProcessPart__Group__5__Impl rule__OutputProcessPart__Group__6
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
    // InternalGoatComponentsParser.g:2941:1: rule__OutputProcessPart__Group__5__Impl : ( LeftParenthesis ) ;
    public final void rule__OutputProcessPart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2945:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:2946:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:2946:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:2947:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:2956:1: rule__OutputProcessPart__Group__6 : rule__OutputProcessPart__Group__6__Impl rule__OutputProcessPart__Group__7 ;
    public final void rule__OutputProcessPart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2960:1: ( rule__OutputProcessPart__Group__6__Impl rule__OutputProcessPart__Group__7 )
            // InternalGoatComponentsParser.g:2961:2: rule__OutputProcessPart__Group__6__Impl rule__OutputProcessPart__Group__7
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
    // InternalGoatComponentsParser.g:2968:1: rule__OutputProcessPart__Group__6__Impl : ( ( rule__OutputProcessPart__Send_predAssignment_6 ) ) ;
    public final void rule__OutputProcessPart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2972:1: ( ( ( rule__OutputProcessPart__Send_predAssignment_6 ) ) )
            // InternalGoatComponentsParser.g:2973:1: ( ( rule__OutputProcessPart__Send_predAssignment_6 ) )
            {
            // InternalGoatComponentsParser.g:2973:1: ( ( rule__OutputProcessPart__Send_predAssignment_6 ) )
            // InternalGoatComponentsParser.g:2974:2: ( rule__OutputProcessPart__Send_predAssignment_6 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getSend_predAssignment_6()); 
            // InternalGoatComponentsParser.g:2975:2: ( rule__OutputProcessPart__Send_predAssignment_6 )
            // InternalGoatComponentsParser.g:2975:3: rule__OutputProcessPart__Send_predAssignment_6
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
    // InternalGoatComponentsParser.g:2983:1: rule__OutputProcessPart__Group__7 : rule__OutputProcessPart__Group__7__Impl rule__OutputProcessPart__Group__8 ;
    public final void rule__OutputProcessPart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2987:1: ( rule__OutputProcessPart__Group__7__Impl rule__OutputProcessPart__Group__8 )
            // InternalGoatComponentsParser.g:2988:2: rule__OutputProcessPart__Group__7__Impl rule__OutputProcessPart__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalGoatComponentsParser.g:2995:1: rule__OutputProcessPart__Group__7__Impl : ( RightParenthesis ) ;
    public final void rule__OutputProcessPart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:2999:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:3000:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:3000:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:3001:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:3010:1: rule__OutputProcessPart__Group__8 : rule__OutputProcessPart__Group__8__Impl rule__OutputProcessPart__Group__9 ;
    public final void rule__OutputProcessPart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3014:1: ( rule__OutputProcessPart__Group__8__Impl rule__OutputProcessPart__Group__9 )
            // InternalGoatComponentsParser.g:3015:2: rule__OutputProcessPart__Group__8__Impl rule__OutputProcessPart__Group__9
            {
            pushFollow(FOLLOW_27);
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
    // InternalGoatComponentsParser.g:3022:1: rule__OutputProcessPart__Group__8__Impl : ( ( rule__OutputProcessPart__Group_8__0 )? ) ;
    public final void rule__OutputProcessPart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3026:1: ( ( ( rule__OutputProcessPart__Group_8__0 )? ) )
            // InternalGoatComponentsParser.g:3027:1: ( ( rule__OutputProcessPart__Group_8__0 )? )
            {
            // InternalGoatComponentsParser.g:3027:1: ( ( rule__OutputProcessPart__Group_8__0 )? )
            // InternalGoatComponentsParser.g:3028:2: ( rule__OutputProcessPart__Group_8__0 )?
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_8()); 
            // InternalGoatComponentsParser.g:3029:2: ( rule__OutputProcessPart__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Print) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGoatComponentsParser.g:3029:3: rule__OutputProcessPart__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputProcessPart__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputProcessPartAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalGoatComponentsParser.g:3037:1: rule__OutputProcessPart__Group__9 : rule__OutputProcessPart__Group__9__Impl rule__OutputProcessPart__Group__10 ;
    public final void rule__OutputProcessPart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3041:1: ( rule__OutputProcessPart__Group__9__Impl rule__OutputProcessPart__Group__10 )
            // InternalGoatComponentsParser.g:3042:2: rule__OutputProcessPart__Group__9__Impl rule__OutputProcessPart__Group__10
            {
            pushFollow(FOLLOW_27);
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
    // InternalGoatComponentsParser.g:3049:1: rule__OutputProcessPart__Group__9__Impl : ( ( rule__OutputProcessPart__Group_9__0 )? ) ;
    public final void rule__OutputProcessPart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3053:1: ( ( ( rule__OutputProcessPart__Group_9__0 )? ) )
            // InternalGoatComponentsParser.g:3054:1: ( ( rule__OutputProcessPart__Group_9__0 )? )
            {
            // InternalGoatComponentsParser.g:3054:1: ( ( rule__OutputProcessPart__Group_9__0 )? )
            // InternalGoatComponentsParser.g:3055:2: ( rule__OutputProcessPart__Group_9__0 )?
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_9()); 
            // InternalGoatComponentsParser.g:3056:2: ( rule__OutputProcessPart__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Sleep) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGoatComponentsParser.g:3056:3: rule__OutputProcessPart__Group_9__0
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
    // InternalGoatComponentsParser.g:3064:1: rule__OutputProcessPart__Group__10 : rule__OutputProcessPart__Group__10__Impl rule__OutputProcessPart__Group__11 ;
    public final void rule__OutputProcessPart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3068:1: ( rule__OutputProcessPart__Group__10__Impl rule__OutputProcessPart__Group__11 )
            // InternalGoatComponentsParser.g:3069:2: rule__OutputProcessPart__Group__10__Impl rule__OutputProcessPart__Group__11
            {
            pushFollow(FOLLOW_28);
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
    // InternalGoatComponentsParser.g:3076:1: rule__OutputProcessPart__Group__10__Impl : ( FullStop ) ;
    public final void rule__OutputProcessPart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3080:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:3081:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:3081:1: ( FullStop )
            // InternalGoatComponentsParser.g:3082:2: FullStop
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
    // InternalGoatComponentsParser.g:3091:1: rule__OutputProcessPart__Group__11 : rule__OutputProcessPart__Group__11__Impl ;
    public final void rule__OutputProcessPart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3095:1: ( rule__OutputProcessPart__Group__11__Impl )
            // InternalGoatComponentsParser.g:3096:2: rule__OutputProcessPart__Group__11__Impl
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
    // InternalGoatComponentsParser.g:3102:1: rule__OutputProcessPart__Group__11__Impl : ( ( rule__OutputProcessPart__NextAssignment_11 ) ) ;
    public final void rule__OutputProcessPart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3106:1: ( ( ( rule__OutputProcessPart__NextAssignment_11 ) ) )
            // InternalGoatComponentsParser.g:3107:1: ( ( rule__OutputProcessPart__NextAssignment_11 ) )
            {
            // InternalGoatComponentsParser.g:3107:1: ( ( rule__OutputProcessPart__NextAssignment_11 ) )
            // InternalGoatComponentsParser.g:3108:2: ( rule__OutputProcessPart__NextAssignment_11 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getNextAssignment_11()); 
            // InternalGoatComponentsParser.g:3109:2: ( rule__OutputProcessPart__NextAssignment_11 )
            // InternalGoatComponentsParser.g:3109:3: rule__OutputProcessPart__NextAssignment_11
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
    // InternalGoatComponentsParser.g:3118:1: rule__OutputProcessPart__Group_2__0 : rule__OutputProcessPart__Group_2__0__Impl rule__OutputProcessPart__Group_2__1 ;
    public final void rule__OutputProcessPart__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3122:1: ( rule__OutputProcessPart__Group_2__0__Impl rule__OutputProcessPart__Group_2__1 )
            // InternalGoatComponentsParser.g:3123:2: rule__OutputProcessPart__Group_2__0__Impl rule__OutputProcessPart__Group_2__1
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
    // InternalGoatComponentsParser.g:3130:1: rule__OutputProcessPart__Group_2__0__Impl : ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) ) ;
    public final void rule__OutputProcessPart__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3134:1: ( ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) ) )
            // InternalGoatComponentsParser.g:3135:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) )
            {
            // InternalGoatComponentsParser.g:3135:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) )
            // InternalGoatComponentsParser.g:3136:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsAssignment_2_0()); 
            // InternalGoatComponentsParser.g:3137:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 )
            // InternalGoatComponentsParser.g:3137:3: rule__OutputProcessPart__MsgOutPartsAssignment_2_0
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
    // InternalGoatComponentsParser.g:3145:1: rule__OutputProcessPart__Group_2__1 : rule__OutputProcessPart__Group_2__1__Impl ;
    public final void rule__OutputProcessPart__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3149:1: ( rule__OutputProcessPart__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:3150:2: rule__OutputProcessPart__Group_2__1__Impl
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
    // InternalGoatComponentsParser.g:3156:1: rule__OutputProcessPart__Group_2__1__Impl : ( ( rule__OutputProcessPart__Group_2_1__0 )* ) ;
    public final void rule__OutputProcessPart__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3160:1: ( ( ( rule__OutputProcessPart__Group_2_1__0 )* ) )
            // InternalGoatComponentsParser.g:3161:1: ( ( rule__OutputProcessPart__Group_2_1__0 )* )
            {
            // InternalGoatComponentsParser.g:3161:1: ( ( rule__OutputProcessPart__Group_2_1__0 )* )
            // InternalGoatComponentsParser.g:3162:2: ( rule__OutputProcessPart__Group_2_1__0 )*
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_2_1()); 
            // InternalGoatComponentsParser.g:3163:2: ( rule__OutputProcessPart__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3163:3: rule__OutputProcessPart__Group_2_1__0
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
    // InternalGoatComponentsParser.g:3172:1: rule__OutputProcessPart__Group_2_1__0 : rule__OutputProcessPart__Group_2_1__0__Impl rule__OutputProcessPart__Group_2_1__1 ;
    public final void rule__OutputProcessPart__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3176:1: ( rule__OutputProcessPart__Group_2_1__0__Impl rule__OutputProcessPart__Group_2_1__1 )
            // InternalGoatComponentsParser.g:3177:2: rule__OutputProcessPart__Group_2_1__0__Impl rule__OutputProcessPart__Group_2_1__1
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
    // InternalGoatComponentsParser.g:3184:1: rule__OutputProcessPart__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__OutputProcessPart__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3188:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:3189:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:3189:1: ( Comma )
            // InternalGoatComponentsParser.g:3190:2: Comma
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
    // InternalGoatComponentsParser.g:3199:1: rule__OutputProcessPart__Group_2_1__1 : rule__OutputProcessPart__Group_2_1__1__Impl ;
    public final void rule__OutputProcessPart__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3203:1: ( rule__OutputProcessPart__Group_2_1__1__Impl )
            // InternalGoatComponentsParser.g:3204:2: rule__OutputProcessPart__Group_2_1__1__Impl
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
    // InternalGoatComponentsParser.g:3210:1: rule__OutputProcessPart__Group_2_1__1__Impl : ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) ) ;
    public final void rule__OutputProcessPart__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3214:1: ( ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) ) )
            // InternalGoatComponentsParser.g:3215:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) )
            {
            // InternalGoatComponentsParser.g:3215:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) )
            // InternalGoatComponentsParser.g:3216:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsAssignment_2_1_1()); 
            // InternalGoatComponentsParser.g:3217:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 )
            // InternalGoatComponentsParser.g:3217:3: rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1
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


    // $ANTLR start "rule__OutputProcessPart__Group_8__0"
    // InternalGoatComponentsParser.g:3226:1: rule__OutputProcessPart__Group_8__0 : rule__OutputProcessPart__Group_8__0__Impl rule__OutputProcessPart__Group_8__1 ;
    public final void rule__OutputProcessPart__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3230:1: ( rule__OutputProcessPart__Group_8__0__Impl rule__OutputProcessPart__Group_8__1 )
            // InternalGoatComponentsParser.g:3231:2: rule__OutputProcessPart__Group_8__0__Impl rule__OutputProcessPart__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__OutputProcessPart__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputProcessPart__Group_8__0"


    // $ANTLR start "rule__OutputProcessPart__Group_8__0__Impl"
    // InternalGoatComponentsParser.g:3238:1: rule__OutputProcessPart__Group_8__0__Impl : ( Print ) ;
    public final void rule__OutputProcessPart__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3242:1: ( ( Print ) )
            // InternalGoatComponentsParser.g:3243:1: ( Print )
            {
            // InternalGoatComponentsParser.g:3243:1: ( Print )
            // InternalGoatComponentsParser.g:3244:2: Print
            {
             before(grammarAccess.getOutputProcessPartAccess().getPrintKeyword_8_0()); 
            match(input,Print,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getPrintKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputProcessPart__Group_8__0__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_8__1"
    // InternalGoatComponentsParser.g:3253:1: rule__OutputProcessPart__Group_8__1 : rule__OutputProcessPart__Group_8__1__Impl rule__OutputProcessPart__Group_8__2 ;
    public final void rule__OutputProcessPart__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3257:1: ( rule__OutputProcessPart__Group_8__1__Impl rule__OutputProcessPart__Group_8__2 )
            // InternalGoatComponentsParser.g:3258:2: rule__OutputProcessPart__Group_8__1__Impl rule__OutputProcessPart__Group_8__2
            {
            pushFollow(FOLLOW_24);
            rule__OutputProcessPart__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputProcessPart__Group_8__1"


    // $ANTLR start "rule__OutputProcessPart__Group_8__1__Impl"
    // InternalGoatComponentsParser.g:3265:1: rule__OutputProcessPart__Group_8__1__Impl : ( LeftParenthesis ) ;
    public final void rule__OutputProcessPart__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3269:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:3270:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:3270:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:3271:2: LeftParenthesis
            {
             before(grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputProcessPart__Group_8__1__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_8__2"
    // InternalGoatComponentsParser.g:3280:1: rule__OutputProcessPart__Group_8__2 : rule__OutputProcessPart__Group_8__2__Impl rule__OutputProcessPart__Group_8__3 ;
    public final void rule__OutputProcessPart__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3284:1: ( rule__OutputProcessPart__Group_8__2__Impl rule__OutputProcessPart__Group_8__3 )
            // InternalGoatComponentsParser.g:3285:2: rule__OutputProcessPart__Group_8__2__Impl rule__OutputProcessPart__Group_8__3
            {
            pushFollow(FOLLOW_16);
            rule__OutputProcessPart__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputProcessPart__Group_8__2"


    // $ANTLR start "rule__OutputProcessPart__Group_8__2__Impl"
    // InternalGoatComponentsParser.g:3292:1: rule__OutputProcessPart__Group_8__2__Impl : ( ( rule__OutputProcessPart__OutputAssignment_8_2 ) ) ;
    public final void rule__OutputProcessPart__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3296:1: ( ( ( rule__OutputProcessPart__OutputAssignment_8_2 ) ) )
            // InternalGoatComponentsParser.g:3297:1: ( ( rule__OutputProcessPart__OutputAssignment_8_2 ) )
            {
            // InternalGoatComponentsParser.g:3297:1: ( ( rule__OutputProcessPart__OutputAssignment_8_2 ) )
            // InternalGoatComponentsParser.g:3298:2: ( rule__OutputProcessPart__OutputAssignment_8_2 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getOutputAssignment_8_2()); 
            // InternalGoatComponentsParser.g:3299:2: ( rule__OutputProcessPart__OutputAssignment_8_2 )
            // InternalGoatComponentsParser.g:3299:3: rule__OutputProcessPart__OutputAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__OutputAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputProcessPartAccess().getOutputAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputProcessPart__Group_8__2__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_8__3"
    // InternalGoatComponentsParser.g:3307:1: rule__OutputProcessPart__Group_8__3 : rule__OutputProcessPart__Group_8__3__Impl ;
    public final void rule__OutputProcessPart__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3311:1: ( rule__OutputProcessPart__Group_8__3__Impl )
            // InternalGoatComponentsParser.g:3312:2: rule__OutputProcessPart__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputProcessPart__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputProcessPart__Group_8__3"


    // $ANTLR start "rule__OutputProcessPart__Group_8__3__Impl"
    // InternalGoatComponentsParser.g:3318:1: rule__OutputProcessPart__Group_8__3__Impl : ( RightParenthesis ) ;
    public final void rule__OutputProcessPart__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3322:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:3323:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:3323:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:3324:2: RightParenthesis
            {
             before(grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_8_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputProcessPart__Group_8__3__Impl"


    // $ANTLR start "rule__OutputProcessPart__Group_9__0"
    // InternalGoatComponentsParser.g:3334:1: rule__OutputProcessPart__Group_9__0 : rule__OutputProcessPart__Group_9__0__Impl rule__OutputProcessPart__Group_9__1 ;
    public final void rule__OutputProcessPart__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3338:1: ( rule__OutputProcessPart__Group_9__0__Impl rule__OutputProcessPart__Group_9__1 )
            // InternalGoatComponentsParser.g:3339:2: rule__OutputProcessPart__Group_9__0__Impl rule__OutputProcessPart__Group_9__1
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
    // InternalGoatComponentsParser.g:3346:1: rule__OutputProcessPart__Group_9__0__Impl : ( Sleep ) ;
    public final void rule__OutputProcessPart__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3350:1: ( ( Sleep ) )
            // InternalGoatComponentsParser.g:3351:1: ( Sleep )
            {
            // InternalGoatComponentsParser.g:3351:1: ( Sleep )
            // InternalGoatComponentsParser.g:3352:2: Sleep
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
    // InternalGoatComponentsParser.g:3361:1: rule__OutputProcessPart__Group_9__1 : rule__OutputProcessPart__Group_9__1__Impl rule__OutputProcessPart__Group_9__2 ;
    public final void rule__OutputProcessPart__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3365:1: ( rule__OutputProcessPart__Group_9__1__Impl rule__OutputProcessPart__Group_9__2 )
            // InternalGoatComponentsParser.g:3366:2: rule__OutputProcessPart__Group_9__1__Impl rule__OutputProcessPart__Group_9__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalGoatComponentsParser.g:3373:1: rule__OutputProcessPart__Group_9__1__Impl : ( LeftParenthesis ) ;
    public final void rule__OutputProcessPart__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3377:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:3378:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:3378:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:3379:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:3388:1: rule__OutputProcessPart__Group_9__2 : rule__OutputProcessPart__Group_9__2__Impl rule__OutputProcessPart__Group_9__3 ;
    public final void rule__OutputProcessPart__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3392:1: ( rule__OutputProcessPart__Group_9__2__Impl rule__OutputProcessPart__Group_9__3 )
            // InternalGoatComponentsParser.g:3393:2: rule__OutputProcessPart__Group_9__2__Impl rule__OutputProcessPart__Group_9__3
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
    // InternalGoatComponentsParser.g:3400:1: rule__OutputProcessPart__Group_9__2__Impl : ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) ) ;
    public final void rule__OutputProcessPart__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3404:1: ( ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) ) )
            // InternalGoatComponentsParser.g:3405:1: ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) )
            {
            // InternalGoatComponentsParser.g:3405:1: ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) )
            // InternalGoatComponentsParser.g:3406:2: ( rule__OutputProcessPart__MsecAssignment_9_2 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsecAssignment_9_2()); 
            // InternalGoatComponentsParser.g:3407:2: ( rule__OutputProcessPart__MsecAssignment_9_2 )
            // InternalGoatComponentsParser.g:3407:3: rule__OutputProcessPart__MsecAssignment_9_2
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
    // InternalGoatComponentsParser.g:3415:1: rule__OutputProcessPart__Group_9__3 : rule__OutputProcessPart__Group_9__3__Impl ;
    public final void rule__OutputProcessPart__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3419:1: ( rule__OutputProcessPart__Group_9__3__Impl )
            // InternalGoatComponentsParser.g:3420:2: rule__OutputProcessPart__Group_9__3__Impl
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
    // InternalGoatComponentsParser.g:3426:1: rule__OutputProcessPart__Group_9__3__Impl : ( RightParenthesis ) ;
    public final void rule__OutputProcessPart__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3430:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:3431:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:3431:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:3432:2: RightParenthesis
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


    // $ANTLR start "rule__IfProcesses__Group__0"
    // InternalGoatComponentsParser.g:3442:1: rule__IfProcesses__Group__0 : rule__IfProcesses__Group__0__Impl rule__IfProcesses__Group__1 ;
    public final void rule__IfProcesses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3446:1: ( rule__IfProcesses__Group__0__Impl rule__IfProcesses__Group__1 )
            // InternalGoatComponentsParser.g:3447:2: rule__IfProcesses__Group__0__Impl rule__IfProcesses__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalGoatComponentsParser.g:3454:1: rule__IfProcesses__Group__0__Impl : ( () ) ;
    public final void rule__IfProcesses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3458:1: ( ( () ) )
            // InternalGoatComponentsParser.g:3459:1: ( () )
            {
            // InternalGoatComponentsParser.g:3459:1: ( () )
            // InternalGoatComponentsParser.g:3460:2: ()
            {
             before(grammarAccess.getIfProcessesAccess().getIfProcessesAction_0()); 
            // InternalGoatComponentsParser.g:3461:2: ()
            // InternalGoatComponentsParser.g:3461:3: 
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
    // InternalGoatComponentsParser.g:3469:1: rule__IfProcesses__Group__1 : rule__IfProcesses__Group__1__Impl rule__IfProcesses__Group__2 ;
    public final void rule__IfProcesses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3473:1: ( rule__IfProcesses__Group__1__Impl rule__IfProcesses__Group__2 )
            // InternalGoatComponentsParser.g:3474:2: rule__IfProcesses__Group__1__Impl rule__IfProcesses__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalGoatComponentsParser.g:3481:1: rule__IfProcesses__Group__1__Impl : ( ( rule__IfProcesses__BranchesAssignment_1 ) ) ;
    public final void rule__IfProcesses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3485:1: ( ( ( rule__IfProcesses__BranchesAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:3486:1: ( ( rule__IfProcesses__BranchesAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:3486:1: ( ( rule__IfProcesses__BranchesAssignment_1 ) )
            // InternalGoatComponentsParser.g:3487:2: ( rule__IfProcesses__BranchesAssignment_1 )
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesAssignment_1()); 
            // InternalGoatComponentsParser.g:3488:2: ( rule__IfProcesses__BranchesAssignment_1 )
            // InternalGoatComponentsParser.g:3488:3: rule__IfProcesses__BranchesAssignment_1
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
    // InternalGoatComponentsParser.g:3496:1: rule__IfProcesses__Group__2 : rule__IfProcesses__Group__2__Impl ;
    public final void rule__IfProcesses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3500:1: ( rule__IfProcesses__Group__2__Impl )
            // InternalGoatComponentsParser.g:3501:2: rule__IfProcesses__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfProcesses__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGoatComponentsParser.g:3507:1: rule__IfProcesses__Group__2__Impl : ( ( rule__IfProcesses__Group_2__0 )* ) ;
    public final void rule__IfProcesses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3511:1: ( ( ( rule__IfProcesses__Group_2__0 )* ) )
            // InternalGoatComponentsParser.g:3512:1: ( ( rule__IfProcesses__Group_2__0 )* )
            {
            // InternalGoatComponentsParser.g:3512:1: ( ( rule__IfProcesses__Group_2__0 )* )
            // InternalGoatComponentsParser.g:3513:2: ( rule__IfProcesses__Group_2__0 )*
            {
             before(grammarAccess.getIfProcessesAccess().getGroup_2()); 
            // InternalGoatComponentsParser.g:3514:2: ( rule__IfProcesses__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Else) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3514:3: rule__IfProcesses__Group_2__0
            	    {
            	    pushFollow(FOLLOW_32);
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


    // $ANTLR start "rule__IfProcesses__Group_2__0"
    // InternalGoatComponentsParser.g:3523:1: rule__IfProcesses__Group_2__0 : rule__IfProcesses__Group_2__0__Impl rule__IfProcesses__Group_2__1 ;
    public final void rule__IfProcesses__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3527:1: ( rule__IfProcesses__Group_2__0__Impl rule__IfProcesses__Group_2__1 )
            // InternalGoatComponentsParser.g:3528:2: rule__IfProcesses__Group_2__0__Impl rule__IfProcesses__Group_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalGoatComponentsParser.g:3535:1: rule__IfProcesses__Group_2__0__Impl : ( Else ) ;
    public final void rule__IfProcesses__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3539:1: ( ( Else ) )
            // InternalGoatComponentsParser.g:3540:1: ( Else )
            {
            // InternalGoatComponentsParser.g:3540:1: ( Else )
            // InternalGoatComponentsParser.g:3541:2: Else
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
    // InternalGoatComponentsParser.g:3550:1: rule__IfProcesses__Group_2__1 : rule__IfProcesses__Group_2__1__Impl ;
    public final void rule__IfProcesses__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3554:1: ( rule__IfProcesses__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:3555:2: rule__IfProcesses__Group_2__1__Impl
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
    // InternalGoatComponentsParser.g:3561:1: rule__IfProcesses__Group_2__1__Impl : ( ( rule__IfProcesses__BranchesAssignment_2_1 ) ) ;
    public final void rule__IfProcesses__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3565:1: ( ( ( rule__IfProcesses__BranchesAssignment_2_1 ) ) )
            // InternalGoatComponentsParser.g:3566:1: ( ( rule__IfProcesses__BranchesAssignment_2_1 ) )
            {
            // InternalGoatComponentsParser.g:3566:1: ( ( rule__IfProcesses__BranchesAssignment_2_1 ) )
            // InternalGoatComponentsParser.g:3567:2: ( rule__IfProcesses__BranchesAssignment_2_1 )
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesAssignment_2_1()); 
            // InternalGoatComponentsParser.g:3568:2: ( rule__IfProcesses__BranchesAssignment_2_1 )
            // InternalGoatComponentsParser.g:3568:3: rule__IfProcesses__BranchesAssignment_2_1
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


    // $ANTLR start "rule__IfBranchProcess__Group__0"
    // InternalGoatComponentsParser.g:3577:1: rule__IfBranchProcess__Group__0 : rule__IfBranchProcess__Group__0__Impl rule__IfBranchProcess__Group__1 ;
    public final void rule__IfBranchProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3581:1: ( rule__IfBranchProcess__Group__0__Impl rule__IfBranchProcess__Group__1 )
            // InternalGoatComponentsParser.g:3582:2: rule__IfBranchProcess__Group__0__Impl rule__IfBranchProcess__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalGoatComponentsParser.g:3589:1: rule__IfBranchProcess__Group__0__Impl : ( () ) ;
    public final void rule__IfBranchProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3593:1: ( ( () ) )
            // InternalGoatComponentsParser.g:3594:1: ( () )
            {
            // InternalGoatComponentsParser.g:3594:1: ( () )
            // InternalGoatComponentsParser.g:3595:2: ()
            {
             before(grammarAccess.getIfBranchProcessAccess().getIfBranchProcessAction_0()); 
            // InternalGoatComponentsParser.g:3596:2: ()
            // InternalGoatComponentsParser.g:3596:3: 
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
    // InternalGoatComponentsParser.g:3604:1: rule__IfBranchProcess__Group__1 : rule__IfBranchProcess__Group__1__Impl rule__IfBranchProcess__Group__2 ;
    public final void rule__IfBranchProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3608:1: ( rule__IfBranchProcess__Group__1__Impl rule__IfBranchProcess__Group__2 )
            // InternalGoatComponentsParser.g:3609:2: rule__IfBranchProcess__Group__1__Impl rule__IfBranchProcess__Group__2
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
    // InternalGoatComponentsParser.g:3616:1: rule__IfBranchProcess__Group__1__Impl : ( If ) ;
    public final void rule__IfBranchProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3620:1: ( ( If ) )
            // InternalGoatComponentsParser.g:3621:1: ( If )
            {
            // InternalGoatComponentsParser.g:3621:1: ( If )
            // InternalGoatComponentsParser.g:3622:2: If
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
    // InternalGoatComponentsParser.g:3631:1: rule__IfBranchProcess__Group__2 : rule__IfBranchProcess__Group__2__Impl rule__IfBranchProcess__Group__3 ;
    public final void rule__IfBranchProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3635:1: ( rule__IfBranchProcess__Group__2__Impl rule__IfBranchProcess__Group__3 )
            // InternalGoatComponentsParser.g:3636:2: rule__IfBranchProcess__Group__2__Impl rule__IfBranchProcess__Group__3
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
    // InternalGoatComponentsParser.g:3643:1: rule__IfBranchProcess__Group__2__Impl : ( ( rule__IfBranchProcess__CondAssignment_2 ) ) ;
    public final void rule__IfBranchProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3647:1: ( ( ( rule__IfBranchProcess__CondAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:3648:1: ( ( rule__IfBranchProcess__CondAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:3648:1: ( ( rule__IfBranchProcess__CondAssignment_2 ) )
            // InternalGoatComponentsParser.g:3649:2: ( rule__IfBranchProcess__CondAssignment_2 )
            {
             before(grammarAccess.getIfBranchProcessAccess().getCondAssignment_2()); 
            // InternalGoatComponentsParser.g:3650:2: ( rule__IfBranchProcess__CondAssignment_2 )
            // InternalGoatComponentsParser.g:3650:3: rule__IfBranchProcess__CondAssignment_2
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
    // InternalGoatComponentsParser.g:3658:1: rule__IfBranchProcess__Group__3 : rule__IfBranchProcess__Group__3__Impl rule__IfBranchProcess__Group__4 ;
    public final void rule__IfBranchProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3662:1: ( rule__IfBranchProcess__Group__3__Impl rule__IfBranchProcess__Group__4 )
            // InternalGoatComponentsParser.g:3663:2: rule__IfBranchProcess__Group__3__Impl rule__IfBranchProcess__Group__4
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
    // InternalGoatComponentsParser.g:3670:1: rule__IfBranchProcess__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__IfBranchProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3674:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:3675:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:3675:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:3676:2: LeftCurlyBracket
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
    // InternalGoatComponentsParser.g:3685:1: rule__IfBranchProcess__Group__4 : rule__IfBranchProcess__Group__4__Impl rule__IfBranchProcess__Group__5 ;
    public final void rule__IfBranchProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3689:1: ( rule__IfBranchProcess__Group__4__Impl rule__IfBranchProcess__Group__5 )
            // InternalGoatComponentsParser.g:3690:2: rule__IfBranchProcess__Group__4__Impl rule__IfBranchProcess__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalGoatComponentsParser.g:3697:1: rule__IfBranchProcess__Group__4__Impl : ( ( rule__IfBranchProcess__ThenAssignment_4 ) ) ;
    public final void rule__IfBranchProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3701:1: ( ( ( rule__IfBranchProcess__ThenAssignment_4 ) ) )
            // InternalGoatComponentsParser.g:3702:1: ( ( rule__IfBranchProcess__ThenAssignment_4 ) )
            {
            // InternalGoatComponentsParser.g:3702:1: ( ( rule__IfBranchProcess__ThenAssignment_4 ) )
            // InternalGoatComponentsParser.g:3703:2: ( rule__IfBranchProcess__ThenAssignment_4 )
            {
             before(grammarAccess.getIfBranchProcessAccess().getThenAssignment_4()); 
            // InternalGoatComponentsParser.g:3704:2: ( rule__IfBranchProcess__ThenAssignment_4 )
            // InternalGoatComponentsParser.g:3704:3: rule__IfBranchProcess__ThenAssignment_4
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
    // InternalGoatComponentsParser.g:3712:1: rule__IfBranchProcess__Group__5 : rule__IfBranchProcess__Group__5__Impl ;
    public final void rule__IfBranchProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3716:1: ( rule__IfBranchProcess__Group__5__Impl )
            // InternalGoatComponentsParser.g:3717:2: rule__IfBranchProcess__Group__5__Impl
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
    // InternalGoatComponentsParser.g:3723:1: rule__IfBranchProcess__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__IfBranchProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3727:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:3728:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:3728:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:3729:2: RightCurlyBracket
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


    // $ANTLR start "rule__Update__Group__0"
    // InternalGoatComponentsParser.g:3739:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3743:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalGoatComponentsParser.g:3744:2: rule__Update__Group__0__Impl rule__Update__Group__1
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
    // InternalGoatComponentsParser.g:3751:1: rule__Update__Group__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3755:1: ( ( LeftSquareBracket ) )
            // InternalGoatComponentsParser.g:3756:1: ( LeftSquareBracket )
            {
            // InternalGoatComponentsParser.g:3756:1: ( LeftSquareBracket )
            // InternalGoatComponentsParser.g:3757:2: LeftSquareBracket
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
    // InternalGoatComponentsParser.g:3766:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3770:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalGoatComponentsParser.g:3771:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalGoatComponentsParser.g:3778:1: rule__Update__Group__1__Impl : ( ( rule__Update__VarsAssignment_1 ) ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3782:1: ( ( ( rule__Update__VarsAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:3783:1: ( ( rule__Update__VarsAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:3783:1: ( ( rule__Update__VarsAssignment_1 ) )
            // InternalGoatComponentsParser.g:3784:2: ( rule__Update__VarsAssignment_1 )
            {
             before(grammarAccess.getUpdateAccess().getVarsAssignment_1()); 
            // InternalGoatComponentsParser.g:3785:2: ( rule__Update__VarsAssignment_1 )
            // InternalGoatComponentsParser.g:3785:3: rule__Update__VarsAssignment_1
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
    // InternalGoatComponentsParser.g:3793:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3797:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalGoatComponentsParser.g:3798:2: rule__Update__Group__2__Impl rule__Update__Group__3
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
    // InternalGoatComponentsParser.g:3805:1: rule__Update__Group__2__Impl : ( ColonEqualsSign ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3809:1: ( ( ColonEqualsSign ) )
            // InternalGoatComponentsParser.g:3810:1: ( ColonEqualsSign )
            {
            // InternalGoatComponentsParser.g:3810:1: ( ColonEqualsSign )
            // InternalGoatComponentsParser.g:3811:2: ColonEqualsSign
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
    // InternalGoatComponentsParser.g:3820:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3824:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalGoatComponentsParser.g:3825:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalGoatComponentsParser.g:3832:1: rule__Update__Group__3__Impl : ( ( rule__Update__ValsAssignment_3 ) ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3836:1: ( ( ( rule__Update__ValsAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:3837:1: ( ( rule__Update__ValsAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:3837:1: ( ( rule__Update__ValsAssignment_3 ) )
            // InternalGoatComponentsParser.g:3838:2: ( rule__Update__ValsAssignment_3 )
            {
             before(grammarAccess.getUpdateAccess().getValsAssignment_3()); 
            // InternalGoatComponentsParser.g:3839:2: ( rule__Update__ValsAssignment_3 )
            // InternalGoatComponentsParser.g:3839:3: rule__Update__ValsAssignment_3
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
    // InternalGoatComponentsParser.g:3847:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3851:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalGoatComponentsParser.g:3852:2: rule__Update__Group__4__Impl rule__Update__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalGoatComponentsParser.g:3859:1: rule__Update__Group__4__Impl : ( ( rule__Update__Group_4__0 )* ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3863:1: ( ( ( rule__Update__Group_4__0 )* ) )
            // InternalGoatComponentsParser.g:3864:1: ( ( rule__Update__Group_4__0 )* )
            {
            // InternalGoatComponentsParser.g:3864:1: ( ( rule__Update__Group_4__0 )* )
            // InternalGoatComponentsParser.g:3865:2: ( rule__Update__Group_4__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_4()); 
            // InternalGoatComponentsParser.g:3866:2: ( rule__Update__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:3866:3: rule__Update__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Update__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalGoatComponentsParser.g:3874:1: rule__Update__Group__5 : rule__Update__Group__5__Impl ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3878:1: ( rule__Update__Group__5__Impl )
            // InternalGoatComponentsParser.g:3879:2: rule__Update__Group__5__Impl
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
    // InternalGoatComponentsParser.g:3885:1: rule__Update__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3889:1: ( ( RightSquareBracket ) )
            // InternalGoatComponentsParser.g:3890:1: ( RightSquareBracket )
            {
            // InternalGoatComponentsParser.g:3890:1: ( RightSquareBracket )
            // InternalGoatComponentsParser.g:3891:2: RightSquareBracket
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
    // InternalGoatComponentsParser.g:3901:1: rule__Update__Group_4__0 : rule__Update__Group_4__0__Impl rule__Update__Group_4__1 ;
    public final void rule__Update__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3905:1: ( rule__Update__Group_4__0__Impl rule__Update__Group_4__1 )
            // InternalGoatComponentsParser.g:3906:2: rule__Update__Group_4__0__Impl rule__Update__Group_4__1
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
    // InternalGoatComponentsParser.g:3913:1: rule__Update__Group_4__0__Impl : ( Comma ) ;
    public final void rule__Update__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3917:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:3918:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:3918:1: ( Comma )
            // InternalGoatComponentsParser.g:3919:2: Comma
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
    // InternalGoatComponentsParser.g:3928:1: rule__Update__Group_4__1 : rule__Update__Group_4__1__Impl rule__Update__Group_4__2 ;
    public final void rule__Update__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3932:1: ( rule__Update__Group_4__1__Impl rule__Update__Group_4__2 )
            // InternalGoatComponentsParser.g:3933:2: rule__Update__Group_4__1__Impl rule__Update__Group_4__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalGoatComponentsParser.g:3940:1: rule__Update__Group_4__1__Impl : ( ( rule__Update__VarsAssignment_4_1 ) ) ;
    public final void rule__Update__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3944:1: ( ( ( rule__Update__VarsAssignment_4_1 ) ) )
            // InternalGoatComponentsParser.g:3945:1: ( ( rule__Update__VarsAssignment_4_1 ) )
            {
            // InternalGoatComponentsParser.g:3945:1: ( ( rule__Update__VarsAssignment_4_1 ) )
            // InternalGoatComponentsParser.g:3946:2: ( rule__Update__VarsAssignment_4_1 )
            {
             before(grammarAccess.getUpdateAccess().getVarsAssignment_4_1()); 
            // InternalGoatComponentsParser.g:3947:2: ( rule__Update__VarsAssignment_4_1 )
            // InternalGoatComponentsParser.g:3947:3: rule__Update__VarsAssignment_4_1
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
    // InternalGoatComponentsParser.g:3955:1: rule__Update__Group_4__2 : rule__Update__Group_4__2__Impl rule__Update__Group_4__3 ;
    public final void rule__Update__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3959:1: ( rule__Update__Group_4__2__Impl rule__Update__Group_4__3 )
            // InternalGoatComponentsParser.g:3960:2: rule__Update__Group_4__2__Impl rule__Update__Group_4__3
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
    // InternalGoatComponentsParser.g:3967:1: rule__Update__Group_4__2__Impl : ( ColonEqualsSign ) ;
    public final void rule__Update__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3971:1: ( ( ColonEqualsSign ) )
            // InternalGoatComponentsParser.g:3972:1: ( ColonEqualsSign )
            {
            // InternalGoatComponentsParser.g:3972:1: ( ColonEqualsSign )
            // InternalGoatComponentsParser.g:3973:2: ColonEqualsSign
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
    // InternalGoatComponentsParser.g:3982:1: rule__Update__Group_4__3 : rule__Update__Group_4__3__Impl ;
    public final void rule__Update__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3986:1: ( rule__Update__Group_4__3__Impl )
            // InternalGoatComponentsParser.g:3987:2: rule__Update__Group_4__3__Impl
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
    // InternalGoatComponentsParser.g:3993:1: rule__Update__Group_4__3__Impl : ( ( rule__Update__ValsAssignment_4_3 ) ) ;
    public final void rule__Update__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:3997:1: ( ( ( rule__Update__ValsAssignment_4_3 ) ) )
            // InternalGoatComponentsParser.g:3998:1: ( ( rule__Update__ValsAssignment_4_3 ) )
            {
            // InternalGoatComponentsParser.g:3998:1: ( ( rule__Update__ValsAssignment_4_3 ) )
            // InternalGoatComponentsParser.g:3999:2: ( rule__Update__ValsAssignment_4_3 )
            {
             before(grammarAccess.getUpdateAccess().getValsAssignment_4_3()); 
            // InternalGoatComponentsParser.g:4000:2: ( rule__Update__ValsAssignment_4_3 )
            // InternalGoatComponentsParser.g:4000:3: rule__Update__ValsAssignment_4_3
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
    // InternalGoatComponentsParser.g:4009:1: rule__Awareness__Group__0 : rule__Awareness__Group__0__Impl rule__Awareness__Group__1 ;
    public final void rule__Awareness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4013:1: ( rule__Awareness__Group__0__Impl rule__Awareness__Group__1 )
            // InternalGoatComponentsParser.g:4014:2: rule__Awareness__Group__0__Impl rule__Awareness__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalGoatComponentsParser.g:4021:1: rule__Awareness__Group__0__Impl : ( Wait ) ;
    public final void rule__Awareness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4025:1: ( ( Wait ) )
            // InternalGoatComponentsParser.g:4026:1: ( Wait )
            {
            // InternalGoatComponentsParser.g:4026:1: ( Wait )
            // InternalGoatComponentsParser.g:4027:2: Wait
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
    // InternalGoatComponentsParser.g:4036:1: rule__Awareness__Group__1 : rule__Awareness__Group__1__Impl rule__Awareness__Group__2 ;
    public final void rule__Awareness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4040:1: ( rule__Awareness__Group__1__Impl rule__Awareness__Group__2 )
            // InternalGoatComponentsParser.g:4041:2: rule__Awareness__Group__1__Impl rule__Awareness__Group__2
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
    // InternalGoatComponentsParser.g:4048:1: rule__Awareness__Group__1__Impl : ( Until ) ;
    public final void rule__Awareness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4052:1: ( ( Until ) )
            // InternalGoatComponentsParser.g:4053:1: ( Until )
            {
            // InternalGoatComponentsParser.g:4053:1: ( Until )
            // InternalGoatComponentsParser.g:4054:2: Until
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
    // InternalGoatComponentsParser.g:4063:1: rule__Awareness__Group__2 : rule__Awareness__Group__2__Impl rule__Awareness__Group__3 ;
    public final void rule__Awareness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4067:1: ( rule__Awareness__Group__2__Impl rule__Awareness__Group__3 )
            // InternalGoatComponentsParser.g:4068:2: rule__Awareness__Group__2__Impl rule__Awareness__Group__3
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
    // InternalGoatComponentsParser.g:4075:1: rule__Awareness__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Awareness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4079:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:4080:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:4080:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:4081:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:4090:1: rule__Awareness__Group__3 : rule__Awareness__Group__3__Impl rule__Awareness__Group__4 ;
    public final void rule__Awareness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4094:1: ( rule__Awareness__Group__3__Impl rule__Awareness__Group__4 )
            // InternalGoatComponentsParser.g:4095:2: rule__Awareness__Group__3__Impl rule__Awareness__Group__4
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
    // InternalGoatComponentsParser.g:4102:1: rule__Awareness__Group__3__Impl : ( ( rule__Awareness__PredAssignment_3 ) ) ;
    public final void rule__Awareness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4106:1: ( ( ( rule__Awareness__PredAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:4107:1: ( ( rule__Awareness__PredAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:4107:1: ( ( rule__Awareness__PredAssignment_3 ) )
            // InternalGoatComponentsParser.g:4108:2: ( rule__Awareness__PredAssignment_3 )
            {
             before(grammarAccess.getAwarenessAccess().getPredAssignment_3()); 
            // InternalGoatComponentsParser.g:4109:2: ( rule__Awareness__PredAssignment_3 )
            // InternalGoatComponentsParser.g:4109:3: rule__Awareness__PredAssignment_3
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
    // InternalGoatComponentsParser.g:4117:1: rule__Awareness__Group__4 : rule__Awareness__Group__4__Impl ;
    public final void rule__Awareness__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4121:1: ( rule__Awareness__Group__4__Impl )
            // InternalGoatComponentsParser.g:4122:2: rule__Awareness__Group__4__Impl
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
    // InternalGoatComponentsParser.g:4128:1: rule__Awareness__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Awareness__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4132:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:4133:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:4133:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:4134:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:4144:1: rule__NZCProcess__Group_0__0 : rule__NZCProcess__Group_0__0__Impl rule__NZCProcess__Group_0__1 ;
    public final void rule__NZCProcess__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4148:1: ( rule__NZCProcess__Group_0__0__Impl rule__NZCProcess__Group_0__1 )
            // InternalGoatComponentsParser.g:4149:2: rule__NZCProcess__Group_0__0__Impl rule__NZCProcess__Group_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalGoatComponentsParser.g:4156:1: rule__NZCProcess__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__NZCProcess__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4160:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:4161:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:4161:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:4162:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:4171:1: rule__NZCProcess__Group_0__1 : rule__NZCProcess__Group_0__1__Impl rule__NZCProcess__Group_0__2 ;
    public final void rule__NZCProcess__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4175:1: ( rule__NZCProcess__Group_0__1__Impl rule__NZCProcess__Group_0__2 )
            // InternalGoatComponentsParser.g:4176:2: rule__NZCProcess__Group_0__1__Impl rule__NZCProcess__Group_0__2
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
    // InternalGoatComponentsParser.g:4183:1: rule__NZCProcess__Group_0__1__Impl : ( ruleProc ) ;
    public final void rule__NZCProcess__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4187:1: ( ( ruleProc ) )
            // InternalGoatComponentsParser.g:4188:1: ( ruleProc )
            {
            // InternalGoatComponentsParser.g:4188:1: ( ruleProc )
            // InternalGoatComponentsParser.g:4189:2: ruleProc
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
    // InternalGoatComponentsParser.g:4198:1: rule__NZCProcess__Group_0__2 : rule__NZCProcess__Group_0__2__Impl ;
    public final void rule__NZCProcess__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4202:1: ( rule__NZCProcess__Group_0__2__Impl )
            // InternalGoatComponentsParser.g:4203:2: rule__NZCProcess__Group_0__2__Impl
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
    // InternalGoatComponentsParser.g:4209:1: rule__NZCProcess__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__NZCProcess__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4213:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:4214:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:4214:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:4215:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:4225:1: rule__NProcess__Group_0__0 : rule__NProcess__Group_0__0__Impl rule__NProcess__Group_0__1 ;
    public final void rule__NProcess__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4229:1: ( rule__NProcess__Group_0__0__Impl rule__NProcess__Group_0__1 )
            // InternalGoatComponentsParser.g:4230:2: rule__NProcess__Group_0__0__Impl rule__NProcess__Group_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalGoatComponentsParser.g:4237:1: rule__NProcess__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__NProcess__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4241:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:4242:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:4242:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:4243:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:4252:1: rule__NProcess__Group_0__1 : rule__NProcess__Group_0__1__Impl rule__NProcess__Group_0__2 ;
    public final void rule__NProcess__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4256:1: ( rule__NProcess__Group_0__1__Impl rule__NProcess__Group_0__2 )
            // InternalGoatComponentsParser.g:4257:2: rule__NProcess__Group_0__1__Impl rule__NProcess__Group_0__2
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
    // InternalGoatComponentsParser.g:4264:1: rule__NProcess__Group_0__1__Impl : ( ruleProc ) ;
    public final void rule__NProcess__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4268:1: ( ( ruleProc ) )
            // InternalGoatComponentsParser.g:4269:1: ( ruleProc )
            {
            // InternalGoatComponentsParser.g:4269:1: ( ruleProc )
            // InternalGoatComponentsParser.g:4270:2: ruleProc
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
    // InternalGoatComponentsParser.g:4279:1: rule__NProcess__Group_0__2 : rule__NProcess__Group_0__2__Impl ;
    public final void rule__NProcess__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4283:1: ( rule__NProcess__Group_0__2__Impl )
            // InternalGoatComponentsParser.g:4284:2: rule__NProcess__Group_0__2__Impl
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
    // InternalGoatComponentsParser.g:4290:1: rule__NProcess__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__NProcess__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4294:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:4295:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:4295:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:4296:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:4306:1: rule__CallProcess__Group__0 : rule__CallProcess__Group__0__Impl rule__CallProcess__Group__1 ;
    public final void rule__CallProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4310:1: ( rule__CallProcess__Group__0__Impl rule__CallProcess__Group__1 )
            // InternalGoatComponentsParser.g:4311:2: rule__CallProcess__Group__0__Impl rule__CallProcess__Group__1
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
    // InternalGoatComponentsParser.g:4318:1: rule__CallProcess__Group__0__Impl : ( () ) ;
    public final void rule__CallProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4322:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4323:1: ( () )
            {
            // InternalGoatComponentsParser.g:4323:1: ( () )
            // InternalGoatComponentsParser.g:4324:2: ()
            {
             before(grammarAccess.getCallProcessAccess().getCallProcessAction_0()); 
            // InternalGoatComponentsParser.g:4325:2: ()
            // InternalGoatComponentsParser.g:4325:3: 
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
    // InternalGoatComponentsParser.g:4333:1: rule__CallProcess__Group__1 : rule__CallProcess__Group__1__Impl ;
    public final void rule__CallProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4337:1: ( rule__CallProcess__Group__1__Impl )
            // InternalGoatComponentsParser.g:4338:2: rule__CallProcess__Group__1__Impl
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
    // InternalGoatComponentsParser.g:4344:1: rule__CallProcess__Group__1__Impl : ( ( rule__CallProcess__ProcnameAssignment_1 ) ) ;
    public final void rule__CallProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4348:1: ( ( ( rule__CallProcess__ProcnameAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:4349:1: ( ( rule__CallProcess__ProcnameAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:4349:1: ( ( rule__CallProcess__ProcnameAssignment_1 ) )
            // InternalGoatComponentsParser.g:4350:2: ( rule__CallProcess__ProcnameAssignment_1 )
            {
             before(grammarAccess.getCallProcessAccess().getProcnameAssignment_1()); 
            // InternalGoatComponentsParser.g:4351:2: ( rule__CallProcess__ProcnameAssignment_1 )
            // InternalGoatComponentsParser.g:4351:3: rule__CallProcess__ProcnameAssignment_1
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
    // InternalGoatComponentsParser.g:4360:1: rule__ZeroProcess__Group__0 : rule__ZeroProcess__Group__0__Impl rule__ZeroProcess__Group__1 ;
    public final void rule__ZeroProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4364:1: ( rule__ZeroProcess__Group__0__Impl rule__ZeroProcess__Group__1 )
            // InternalGoatComponentsParser.g:4365:2: rule__ZeroProcess__Group__0__Impl rule__ZeroProcess__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalGoatComponentsParser.g:4372:1: rule__ZeroProcess__Group__0__Impl : ( () ) ;
    public final void rule__ZeroProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4376:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4377:1: ( () )
            {
            // InternalGoatComponentsParser.g:4377:1: ( () )
            // InternalGoatComponentsParser.g:4378:2: ()
            {
             before(grammarAccess.getZeroProcessAccess().getZeroProcessAction_0()); 
            // InternalGoatComponentsParser.g:4379:2: ()
            // InternalGoatComponentsParser.g:4379:3: 
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
    // InternalGoatComponentsParser.g:4387:1: rule__ZeroProcess__Group__1 : rule__ZeroProcess__Group__1__Impl ;
    public final void rule__ZeroProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4391:1: ( rule__ZeroProcess__Group__1__Impl )
            // InternalGoatComponentsParser.g:4392:2: rule__ZeroProcess__Group__1__Impl
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
    // InternalGoatComponentsParser.g:4398:1: rule__ZeroProcess__Group__1__Impl : ( Nil ) ;
    public final void rule__ZeroProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4402:1: ( ( Nil ) )
            // InternalGoatComponentsParser.g:4403:1: ( Nil )
            {
            // InternalGoatComponentsParser.g:4403:1: ( Nil )
            // InternalGoatComponentsParser.g:4404:2: Nil
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
    // InternalGoatComponentsParser.g:4414:1: rule__ProcessDefinition__Group__0 : rule__ProcessDefinition__Group__0__Impl rule__ProcessDefinition__Group__1 ;
    public final void rule__ProcessDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4418:1: ( rule__ProcessDefinition__Group__0__Impl rule__ProcessDefinition__Group__1 )
            // InternalGoatComponentsParser.g:4419:2: rule__ProcessDefinition__Group__0__Impl rule__ProcessDefinition__Group__1
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
    // InternalGoatComponentsParser.g:4426:1: rule__ProcessDefinition__Group__0__Impl : ( Proc ) ;
    public final void rule__ProcessDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4430:1: ( ( Proc ) )
            // InternalGoatComponentsParser.g:4431:1: ( Proc )
            {
            // InternalGoatComponentsParser.g:4431:1: ( Proc )
            // InternalGoatComponentsParser.g:4432:2: Proc
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
    // InternalGoatComponentsParser.g:4441:1: rule__ProcessDefinition__Group__1 : rule__ProcessDefinition__Group__1__Impl rule__ProcessDefinition__Group__2 ;
    public final void rule__ProcessDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4445:1: ( rule__ProcessDefinition__Group__1__Impl rule__ProcessDefinition__Group__2 )
            // InternalGoatComponentsParser.g:4446:2: rule__ProcessDefinition__Group__1__Impl rule__ProcessDefinition__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalGoatComponentsParser.g:4453:1: rule__ProcessDefinition__Group__1__Impl : ( ( rule__ProcessDefinition__NameAssignment_1 ) ) ;
    public final void rule__ProcessDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4457:1: ( ( ( rule__ProcessDefinition__NameAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:4458:1: ( ( rule__ProcessDefinition__NameAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:4458:1: ( ( rule__ProcessDefinition__NameAssignment_1 ) )
            // InternalGoatComponentsParser.g:4459:2: ( rule__ProcessDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getProcessDefinitionAccess().getNameAssignment_1()); 
            // InternalGoatComponentsParser.g:4460:2: ( rule__ProcessDefinition__NameAssignment_1 )
            // InternalGoatComponentsParser.g:4460:3: rule__ProcessDefinition__NameAssignment_1
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
    // InternalGoatComponentsParser.g:4468:1: rule__ProcessDefinition__Group__2 : rule__ProcessDefinition__Group__2__Impl rule__ProcessDefinition__Group__3 ;
    public final void rule__ProcessDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4472:1: ( rule__ProcessDefinition__Group__2__Impl rule__ProcessDefinition__Group__3 )
            // InternalGoatComponentsParser.g:4473:2: rule__ProcessDefinition__Group__2__Impl rule__ProcessDefinition__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalGoatComponentsParser.g:4480:1: rule__ProcessDefinition__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__ProcessDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4484:1: ( ( EqualsSign ) )
            // InternalGoatComponentsParser.g:4485:1: ( EqualsSign )
            {
            // InternalGoatComponentsParser.g:4485:1: ( EqualsSign )
            // InternalGoatComponentsParser.g:4486:2: EqualsSign
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
    // InternalGoatComponentsParser.g:4495:1: rule__ProcessDefinition__Group__3 : rule__ProcessDefinition__Group__3__Impl ;
    public final void rule__ProcessDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4499:1: ( rule__ProcessDefinition__Group__3__Impl )
            // InternalGoatComponentsParser.g:4500:2: rule__ProcessDefinition__Group__3__Impl
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
    // InternalGoatComponentsParser.g:4506:1: rule__ProcessDefinition__Group__3__Impl : ( ( rule__ProcessDefinition__ProcAssignment_3 ) ) ;
    public final void rule__ProcessDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4510:1: ( ( ( rule__ProcessDefinition__ProcAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:4511:1: ( ( rule__ProcessDefinition__ProcAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:4511:1: ( ( rule__ProcessDefinition__ProcAssignment_3 ) )
            // InternalGoatComponentsParser.g:4512:2: ( rule__ProcessDefinition__ProcAssignment_3 )
            {
             before(grammarAccess.getProcessDefinitionAccess().getProcAssignment_3()); 
            // InternalGoatComponentsParser.g:4513:2: ( rule__ProcessDefinition__ProcAssignment_3 )
            // InternalGoatComponentsParser.g:4513:3: rule__ProcessDefinition__ProcAssignment_3
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
    // InternalGoatComponentsParser.g:4522:1: rule__EnvInitValue__Group_0__0 : rule__EnvInitValue__Group_0__0__Impl rule__EnvInitValue__Group_0__1 ;
    public final void rule__EnvInitValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4526:1: ( rule__EnvInitValue__Group_0__0__Impl rule__EnvInitValue__Group_0__1 )
            // InternalGoatComponentsParser.g:4527:2: rule__EnvInitValue__Group_0__0__Impl rule__EnvInitValue__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalGoatComponentsParser.g:4534:1: rule__EnvInitValue__Group_0__0__Impl : ( () ) ;
    public final void rule__EnvInitValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4538:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4539:1: ( () )
            {
            // InternalGoatComponentsParser.g:4539:1: ( () )
            // InternalGoatComponentsParser.g:4540:2: ()
            {
             before(grammarAccess.getEnvInitValueAccess().getIntConstantAction_0_0()); 
            // InternalGoatComponentsParser.g:4541:2: ()
            // InternalGoatComponentsParser.g:4541:3: 
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
    // InternalGoatComponentsParser.g:4549:1: rule__EnvInitValue__Group_0__1 : rule__EnvInitValue__Group_0__1__Impl ;
    public final void rule__EnvInitValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4553:1: ( rule__EnvInitValue__Group_0__1__Impl )
            // InternalGoatComponentsParser.g:4554:2: rule__EnvInitValue__Group_0__1__Impl
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
    // InternalGoatComponentsParser.g:4560:1: rule__EnvInitValue__Group_0__1__Impl : ( ( rule__EnvInitValue__ValueAssignment_0_1 ) ) ;
    public final void rule__EnvInitValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4564:1: ( ( ( rule__EnvInitValue__ValueAssignment_0_1 ) ) )
            // InternalGoatComponentsParser.g:4565:1: ( ( rule__EnvInitValue__ValueAssignment_0_1 ) )
            {
            // InternalGoatComponentsParser.g:4565:1: ( ( rule__EnvInitValue__ValueAssignment_0_1 ) )
            // InternalGoatComponentsParser.g:4566:2: ( rule__EnvInitValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAssignment_0_1()); 
            // InternalGoatComponentsParser.g:4567:2: ( rule__EnvInitValue__ValueAssignment_0_1 )
            // InternalGoatComponentsParser.g:4567:3: rule__EnvInitValue__ValueAssignment_0_1
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
    // InternalGoatComponentsParser.g:4576:1: rule__EnvInitValue__Group_1__0 : rule__EnvInitValue__Group_1__0__Impl rule__EnvInitValue__Group_1__1 ;
    public final void rule__EnvInitValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4580:1: ( rule__EnvInitValue__Group_1__0__Impl rule__EnvInitValue__Group_1__1 )
            // InternalGoatComponentsParser.g:4581:2: rule__EnvInitValue__Group_1__0__Impl rule__EnvInitValue__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGoatComponentsParser.g:4588:1: rule__EnvInitValue__Group_1__0__Impl : ( () ) ;
    public final void rule__EnvInitValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4592:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4593:1: ( () )
            {
            // InternalGoatComponentsParser.g:4593:1: ( () )
            // InternalGoatComponentsParser.g:4594:2: ()
            {
             before(grammarAccess.getEnvInitValueAccess().getStringConstantAction_1_0()); 
            // InternalGoatComponentsParser.g:4595:2: ()
            // InternalGoatComponentsParser.g:4595:3: 
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
    // InternalGoatComponentsParser.g:4603:1: rule__EnvInitValue__Group_1__1 : rule__EnvInitValue__Group_1__1__Impl ;
    public final void rule__EnvInitValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4607:1: ( rule__EnvInitValue__Group_1__1__Impl )
            // InternalGoatComponentsParser.g:4608:2: rule__EnvInitValue__Group_1__1__Impl
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
    // InternalGoatComponentsParser.g:4614:1: rule__EnvInitValue__Group_1__1__Impl : ( ( rule__EnvInitValue__ValueAssignment_1_1 ) ) ;
    public final void rule__EnvInitValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4618:1: ( ( ( rule__EnvInitValue__ValueAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:4619:1: ( ( rule__EnvInitValue__ValueAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:4619:1: ( ( rule__EnvInitValue__ValueAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:4620:2: ( rule__EnvInitValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAssignment_1_1()); 
            // InternalGoatComponentsParser.g:4621:2: ( rule__EnvInitValue__ValueAssignment_1_1 )
            // InternalGoatComponentsParser.g:4621:3: rule__EnvInitValue__ValueAssignment_1_1
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
    // InternalGoatComponentsParser.g:4630:1: rule__EnvInitValue__Group_2__0 : rule__EnvInitValue__Group_2__0__Impl rule__EnvInitValue__Group_2__1 ;
    public final void rule__EnvInitValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4634:1: ( rule__EnvInitValue__Group_2__0__Impl rule__EnvInitValue__Group_2__1 )
            // InternalGoatComponentsParser.g:4635:2: rule__EnvInitValue__Group_2__0__Impl rule__EnvInitValue__Group_2__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalGoatComponentsParser.g:4642:1: rule__EnvInitValue__Group_2__0__Impl : ( () ) ;
    public final void rule__EnvInitValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4646:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4647:1: ( () )
            {
            // InternalGoatComponentsParser.g:4647:1: ( () )
            // InternalGoatComponentsParser.g:4648:2: ()
            {
             before(grammarAccess.getEnvInitValueAccess().getBoolConstantAction_2_0()); 
            // InternalGoatComponentsParser.g:4649:2: ()
            // InternalGoatComponentsParser.g:4649:3: 
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
    // InternalGoatComponentsParser.g:4657:1: rule__EnvInitValue__Group_2__1 : rule__EnvInitValue__Group_2__1__Impl ;
    public final void rule__EnvInitValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4661:1: ( rule__EnvInitValue__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:4662:2: rule__EnvInitValue__Group_2__1__Impl
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
    // InternalGoatComponentsParser.g:4668:1: rule__EnvInitValue__Group_2__1__Impl : ( ( rule__EnvInitValue__ValueAssignment_2_1 ) ) ;
    public final void rule__EnvInitValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4672:1: ( ( ( rule__EnvInitValue__ValueAssignment_2_1 ) ) )
            // InternalGoatComponentsParser.g:4673:1: ( ( rule__EnvInitValue__ValueAssignment_2_1 ) )
            {
            // InternalGoatComponentsParser.g:4673:1: ( ( rule__EnvInitValue__ValueAssignment_2_1 ) )
            // InternalGoatComponentsParser.g:4674:2: ( rule__EnvInitValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAssignment_2_1()); 
            // InternalGoatComponentsParser.g:4675:2: ( rule__EnvInitValue__ValueAssignment_2_1 )
            // InternalGoatComponentsParser.g:4675:3: rule__EnvInitValue__ValueAssignment_2_1
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
    // InternalGoatComponentsParser.g:4684:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4688:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalGoatComponentsParser.g:4689:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
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
    // InternalGoatComponentsParser.g:4696:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4700:1: ( ( () ) )
            // InternalGoatComponentsParser.g:4701:1: ( () )
            {
            // InternalGoatComponentsParser.g:4701:1: ( () )
            // InternalGoatComponentsParser.g:4702:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalGoatComponentsParser.g:4703:2: ()
            // InternalGoatComponentsParser.g:4703:3: 
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
    // InternalGoatComponentsParser.g:4711:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4715:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalGoatComponentsParser.g:4716:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalGoatComponentsParser.g:4723:1: rule__Environment__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4727:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:4728:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:4728:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:4729:2: LeftCurlyBracket
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
    // InternalGoatComponentsParser.g:4738:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4742:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalGoatComponentsParser.g:4743:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalGoatComponentsParser.g:4750:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Group_2__0 )? ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4754:1: ( ( ( rule__Environment__Group_2__0 )? ) )
            // InternalGoatComponentsParser.g:4755:1: ( ( rule__Environment__Group_2__0 )? )
            {
            // InternalGoatComponentsParser.g:4755:1: ( ( rule__Environment__Group_2__0 )? )
            // InternalGoatComponentsParser.g:4756:2: ( rule__Environment__Group_2__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_2()); 
            // InternalGoatComponentsParser.g:4757:2: ( rule__Environment__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGoatComponentsParser.g:4757:3: rule__Environment__Group_2__0
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
    // InternalGoatComponentsParser.g:4765:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4769:1: ( rule__Environment__Group__3__Impl )
            // InternalGoatComponentsParser.g:4770:2: rule__Environment__Group__3__Impl
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
    // InternalGoatComponentsParser.g:4776:1: rule__Environment__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4780:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:4781:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:4781:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:4782:2: RightCurlyBracket
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
    // InternalGoatComponentsParser.g:4792:1: rule__Environment__Group_2__0 : rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1 ;
    public final void rule__Environment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4796:1: ( rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1 )
            // InternalGoatComponentsParser.g:4797:2: rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalGoatComponentsParser.g:4804:1: rule__Environment__Group_2__0__Impl : ( ( rule__Environment__AttrsAssignment_2_0 ) ) ;
    public final void rule__Environment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4808:1: ( ( ( rule__Environment__AttrsAssignment_2_0 ) ) )
            // InternalGoatComponentsParser.g:4809:1: ( ( rule__Environment__AttrsAssignment_2_0 ) )
            {
            // InternalGoatComponentsParser.g:4809:1: ( ( rule__Environment__AttrsAssignment_2_0 ) )
            // InternalGoatComponentsParser.g:4810:2: ( rule__Environment__AttrsAssignment_2_0 )
            {
             before(grammarAccess.getEnvironmentAccess().getAttrsAssignment_2_0()); 
            // InternalGoatComponentsParser.g:4811:2: ( rule__Environment__AttrsAssignment_2_0 )
            // InternalGoatComponentsParser.g:4811:3: rule__Environment__AttrsAssignment_2_0
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
    // InternalGoatComponentsParser.g:4819:1: rule__Environment__Group_2__1 : rule__Environment__Group_2__1__Impl rule__Environment__Group_2__2 ;
    public final void rule__Environment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4823:1: ( rule__Environment__Group_2__1__Impl rule__Environment__Group_2__2 )
            // InternalGoatComponentsParser.g:4824:2: rule__Environment__Group_2__1__Impl rule__Environment__Group_2__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalGoatComponentsParser.g:4831:1: rule__Environment__Group_2__1__Impl : ( ColonEqualsSign ) ;
    public final void rule__Environment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4835:1: ( ( ColonEqualsSign ) )
            // InternalGoatComponentsParser.g:4836:1: ( ColonEqualsSign )
            {
            // InternalGoatComponentsParser.g:4836:1: ( ColonEqualsSign )
            // InternalGoatComponentsParser.g:4837:2: ColonEqualsSign
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
    // InternalGoatComponentsParser.g:4846:1: rule__Environment__Group_2__2 : rule__Environment__Group_2__2__Impl rule__Environment__Group_2__3 ;
    public final void rule__Environment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4850:1: ( rule__Environment__Group_2__2__Impl rule__Environment__Group_2__3 )
            // InternalGoatComponentsParser.g:4851:2: rule__Environment__Group_2__2__Impl rule__Environment__Group_2__3
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
    // InternalGoatComponentsParser.g:4858:1: rule__Environment__Group_2__2__Impl : ( ( rule__Environment__ValsAssignment_2_2 ) ) ;
    public final void rule__Environment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4862:1: ( ( ( rule__Environment__ValsAssignment_2_2 ) ) )
            // InternalGoatComponentsParser.g:4863:1: ( ( rule__Environment__ValsAssignment_2_2 ) )
            {
            // InternalGoatComponentsParser.g:4863:1: ( ( rule__Environment__ValsAssignment_2_2 ) )
            // InternalGoatComponentsParser.g:4864:2: ( rule__Environment__ValsAssignment_2_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getValsAssignment_2_2()); 
            // InternalGoatComponentsParser.g:4865:2: ( rule__Environment__ValsAssignment_2_2 )
            // InternalGoatComponentsParser.g:4865:3: rule__Environment__ValsAssignment_2_2
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
    // InternalGoatComponentsParser.g:4873:1: rule__Environment__Group_2__3 : rule__Environment__Group_2__3__Impl ;
    public final void rule__Environment__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4877:1: ( rule__Environment__Group_2__3__Impl )
            // InternalGoatComponentsParser.g:4878:2: rule__Environment__Group_2__3__Impl
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
    // InternalGoatComponentsParser.g:4884:1: rule__Environment__Group_2__3__Impl : ( ( rule__Environment__Group_2_3__0 )* ) ;
    public final void rule__Environment__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4888:1: ( ( ( rule__Environment__Group_2_3__0 )* ) )
            // InternalGoatComponentsParser.g:4889:1: ( ( rule__Environment__Group_2_3__0 )* )
            {
            // InternalGoatComponentsParser.g:4889:1: ( ( rule__Environment__Group_2_3__0 )* )
            // InternalGoatComponentsParser.g:4890:2: ( rule__Environment__Group_2_3__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_2_3()); 
            // InternalGoatComponentsParser.g:4891:2: ( rule__Environment__Group_2_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:4891:3: rule__Environment__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Environment__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalGoatComponentsParser.g:4900:1: rule__Environment__Group_2_3__0 : rule__Environment__Group_2_3__0__Impl rule__Environment__Group_2_3__1 ;
    public final void rule__Environment__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4904:1: ( rule__Environment__Group_2_3__0__Impl rule__Environment__Group_2_3__1 )
            // InternalGoatComponentsParser.g:4905:2: rule__Environment__Group_2_3__0__Impl rule__Environment__Group_2_3__1
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
    // InternalGoatComponentsParser.g:4912:1: rule__Environment__Group_2_3__0__Impl : ( Comma ) ;
    public final void rule__Environment__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4916:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:4917:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:4917:1: ( Comma )
            // InternalGoatComponentsParser.g:4918:2: Comma
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
    // InternalGoatComponentsParser.g:4927:1: rule__Environment__Group_2_3__1 : rule__Environment__Group_2_3__1__Impl rule__Environment__Group_2_3__2 ;
    public final void rule__Environment__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4931:1: ( rule__Environment__Group_2_3__1__Impl rule__Environment__Group_2_3__2 )
            // InternalGoatComponentsParser.g:4932:2: rule__Environment__Group_2_3__1__Impl rule__Environment__Group_2_3__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalGoatComponentsParser.g:4939:1: rule__Environment__Group_2_3__1__Impl : ( ( rule__Environment__AttrsAssignment_2_3_1 ) ) ;
    public final void rule__Environment__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4943:1: ( ( ( rule__Environment__AttrsAssignment_2_3_1 ) ) )
            // InternalGoatComponentsParser.g:4944:1: ( ( rule__Environment__AttrsAssignment_2_3_1 ) )
            {
            // InternalGoatComponentsParser.g:4944:1: ( ( rule__Environment__AttrsAssignment_2_3_1 ) )
            // InternalGoatComponentsParser.g:4945:2: ( rule__Environment__AttrsAssignment_2_3_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getAttrsAssignment_2_3_1()); 
            // InternalGoatComponentsParser.g:4946:2: ( rule__Environment__AttrsAssignment_2_3_1 )
            // InternalGoatComponentsParser.g:4946:3: rule__Environment__AttrsAssignment_2_3_1
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
    // InternalGoatComponentsParser.g:4954:1: rule__Environment__Group_2_3__2 : rule__Environment__Group_2_3__2__Impl rule__Environment__Group_2_3__3 ;
    public final void rule__Environment__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4958:1: ( rule__Environment__Group_2_3__2__Impl rule__Environment__Group_2_3__3 )
            // InternalGoatComponentsParser.g:4959:2: rule__Environment__Group_2_3__2__Impl rule__Environment__Group_2_3__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalGoatComponentsParser.g:4966:1: rule__Environment__Group_2_3__2__Impl : ( ColonEqualsSign ) ;
    public final void rule__Environment__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4970:1: ( ( ColonEqualsSign ) )
            // InternalGoatComponentsParser.g:4971:1: ( ColonEqualsSign )
            {
            // InternalGoatComponentsParser.g:4971:1: ( ColonEqualsSign )
            // InternalGoatComponentsParser.g:4972:2: ColonEqualsSign
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
    // InternalGoatComponentsParser.g:4981:1: rule__Environment__Group_2_3__3 : rule__Environment__Group_2_3__3__Impl ;
    public final void rule__Environment__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4985:1: ( rule__Environment__Group_2_3__3__Impl )
            // InternalGoatComponentsParser.g:4986:2: rule__Environment__Group_2_3__3__Impl
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
    // InternalGoatComponentsParser.g:4992:1: rule__Environment__Group_2_3__3__Impl : ( ( rule__Environment__ValsAssignment_2_3_3 ) ) ;
    public final void rule__Environment__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:4996:1: ( ( ( rule__Environment__ValsAssignment_2_3_3 ) ) )
            // InternalGoatComponentsParser.g:4997:1: ( ( rule__Environment__ValsAssignment_2_3_3 ) )
            {
            // InternalGoatComponentsParser.g:4997:1: ( ( rule__Environment__ValsAssignment_2_3_3 ) )
            // InternalGoatComponentsParser.g:4998:2: ( rule__Environment__ValsAssignment_2_3_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getValsAssignment_2_3_3()); 
            // InternalGoatComponentsParser.g:4999:2: ( rule__Environment__ValsAssignment_2_3_3 )
            // InternalGoatComponentsParser.g:4999:3: rule__Environment__ValsAssignment_2_3_3
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
    // InternalGoatComponentsParser.g:5008:1: rule__ComponentDefinition__Group__0 : rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 ;
    public final void rule__ComponentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5012:1: ( rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 )
            // InternalGoatComponentsParser.g:5013:2: rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1
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
    // InternalGoatComponentsParser.g:5020:1: rule__ComponentDefinition__Group__0__Impl : ( Component ) ;
    public final void rule__ComponentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5024:1: ( ( Component ) )
            // InternalGoatComponentsParser.g:5025:1: ( Component )
            {
            // InternalGoatComponentsParser.g:5025:1: ( Component )
            // InternalGoatComponentsParser.g:5026:2: Component
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
    // InternalGoatComponentsParser.g:5035:1: rule__ComponentDefinition__Group__1 : rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 ;
    public final void rule__ComponentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5039:1: ( rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 )
            // InternalGoatComponentsParser.g:5040:2: rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2
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
    // InternalGoatComponentsParser.g:5047:1: rule__ComponentDefinition__Group__1__Impl : ( ( rule__ComponentDefinition__EnvAssignment_1 ) ) ;
    public final void rule__ComponentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5051:1: ( ( ( rule__ComponentDefinition__EnvAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:5052:1: ( ( rule__ComponentDefinition__EnvAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:5052:1: ( ( rule__ComponentDefinition__EnvAssignment_1 ) )
            // InternalGoatComponentsParser.g:5053:2: ( rule__ComponentDefinition__EnvAssignment_1 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getEnvAssignment_1()); 
            // InternalGoatComponentsParser.g:5054:2: ( rule__ComponentDefinition__EnvAssignment_1 )
            // InternalGoatComponentsParser.g:5054:3: rule__ComponentDefinition__EnvAssignment_1
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
    // InternalGoatComponentsParser.g:5062:1: rule__ComponentDefinition__Group__2 : rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 ;
    public final void rule__ComponentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5066:1: ( rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 )
            // InternalGoatComponentsParser.g:5067:2: rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalGoatComponentsParser.g:5074:1: rule__ComponentDefinition__Group__2__Impl : ( ( rule__ComponentDefinition__ProcAssignment_2 ) ) ;
    public final void rule__ComponentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5078:1: ( ( ( rule__ComponentDefinition__ProcAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:5079:1: ( ( rule__ComponentDefinition__ProcAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:5079:1: ( ( rule__ComponentDefinition__ProcAssignment_2 ) )
            // InternalGoatComponentsParser.g:5080:2: ( rule__ComponentDefinition__ProcAssignment_2 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getProcAssignment_2()); 
            // InternalGoatComponentsParser.g:5081:2: ( rule__ComponentDefinition__ProcAssignment_2 )
            // InternalGoatComponentsParser.g:5081:3: rule__ComponentDefinition__ProcAssignment_2
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
    // InternalGoatComponentsParser.g:5089:1: rule__ComponentDefinition__Group__3 : rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 ;
    public final void rule__ComponentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5093:1: ( rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 )
            // InternalGoatComponentsParser.g:5094:2: rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalGoatComponentsParser.g:5101:1: rule__ComponentDefinition__Group__3__Impl : ( At ) ;
    public final void rule__ComponentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5105:1: ( ( At ) )
            // InternalGoatComponentsParser.g:5106:1: ( At )
            {
            // InternalGoatComponentsParser.g:5106:1: ( At )
            // InternalGoatComponentsParser.g:5107:2: At
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
    // InternalGoatComponentsParser.g:5116:1: rule__ComponentDefinition__Group__4 : rule__ComponentDefinition__Group__4__Impl ;
    public final void rule__ComponentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5120:1: ( rule__ComponentDefinition__Group__4__Impl )
            // InternalGoatComponentsParser.g:5121:2: rule__ComponentDefinition__Group__4__Impl
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
    // InternalGoatComponentsParser.g:5127:1: rule__ComponentDefinition__Group__4__Impl : ( ( rule__ComponentDefinition__AddressAssignment_4 ) ) ;
    public final void rule__ComponentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5131:1: ( ( ( rule__ComponentDefinition__AddressAssignment_4 ) ) )
            // InternalGoatComponentsParser.g:5132:1: ( ( rule__ComponentDefinition__AddressAssignment_4 ) )
            {
            // InternalGoatComponentsParser.g:5132:1: ( ( rule__ComponentDefinition__AddressAssignment_4 ) )
            // InternalGoatComponentsParser.g:5133:2: ( rule__ComponentDefinition__AddressAssignment_4 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getAddressAssignment_4()); 
            // InternalGoatComponentsParser.g:5134:2: ( rule__ComponentDefinition__AddressAssignment_4 )
            // InternalGoatComponentsParser.g:5134:3: rule__ComponentDefinition__AddressAssignment_4
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
    // InternalGoatComponentsParser.g:5143:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5147:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalGoatComponentsParser.g:5148:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalGoatComponentsParser.g:5155:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5159:1: ( ( ruleAnd ) )
            // InternalGoatComponentsParser.g:5160:1: ( ruleAnd )
            {
            // InternalGoatComponentsParser.g:5160:1: ( ruleAnd )
            // InternalGoatComponentsParser.g:5161:2: ruleAnd
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
    // InternalGoatComponentsParser.g:5170:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5174:1: ( rule__Or__Group__1__Impl )
            // InternalGoatComponentsParser.g:5175:2: rule__Or__Group__1__Impl
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
    // InternalGoatComponentsParser.g:5181:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )? ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5185:1: ( ( ( rule__Or__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5186:1: ( ( rule__Or__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5186:1: ( ( rule__Or__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5187:2: ( rule__Or__Group_1__0 )?
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5188:2: ( rule__Or__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==VerticalLineVerticalLine) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGoatComponentsParser.g:5188:3: rule__Or__Group_1__0
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
    // InternalGoatComponentsParser.g:5197:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5201:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalGoatComponentsParser.g:5202:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalGoatComponentsParser.g:5209:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5213:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5214:1: ( () )
            {
            // InternalGoatComponentsParser.g:5214:1: ( () )
            // InternalGoatComponentsParser.g:5215:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:5216:2: ()
            // InternalGoatComponentsParser.g:5216:3: 
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
    // InternalGoatComponentsParser.g:5224:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5228:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalGoatComponentsParser.g:5229:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalGoatComponentsParser.g:5236:1: rule__Or__Group_1__1__Impl : ( VerticalLineVerticalLine ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5240:1: ( ( VerticalLineVerticalLine ) )
            // InternalGoatComponentsParser.g:5241:1: ( VerticalLineVerticalLine )
            {
            // InternalGoatComponentsParser.g:5241:1: ( VerticalLineVerticalLine )
            // InternalGoatComponentsParser.g:5242:2: VerticalLineVerticalLine
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
    // InternalGoatComponentsParser.g:5251:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5255:1: ( rule__Or__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:5256:2: rule__Or__Group_1__2__Impl
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
    // InternalGoatComponentsParser.g:5262:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5266:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:5267:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:5267:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:5268:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:5269:2: ( rule__Or__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:5269:3: rule__Or__RightAssignment_1_2
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
    // InternalGoatComponentsParser.g:5278:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5282:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalGoatComponentsParser.g:5283:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalGoatComponentsParser.g:5290:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5294:1: ( ( ruleEquality ) )
            // InternalGoatComponentsParser.g:5295:1: ( ruleEquality )
            {
            // InternalGoatComponentsParser.g:5295:1: ( ruleEquality )
            // InternalGoatComponentsParser.g:5296:2: ruleEquality
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
    // InternalGoatComponentsParser.g:5305:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5309:1: ( rule__And__Group__1__Impl )
            // InternalGoatComponentsParser.g:5310:2: rule__And__Group__1__Impl
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
    // InternalGoatComponentsParser.g:5316:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )? ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5320:1: ( ( ( rule__And__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5321:1: ( ( rule__And__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5321:1: ( ( rule__And__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5322:2: ( rule__And__Group_1__0 )?
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5323:2: ( rule__And__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==AmpersandAmpersand) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGoatComponentsParser.g:5323:3: rule__And__Group_1__0
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
    // InternalGoatComponentsParser.g:5332:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5336:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalGoatComponentsParser.g:5337:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalGoatComponentsParser.g:5344:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5348:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5349:1: ( () )
            {
            // InternalGoatComponentsParser.g:5349:1: ( () )
            // InternalGoatComponentsParser.g:5350:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:5351:2: ()
            // InternalGoatComponentsParser.g:5351:3: 
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
    // InternalGoatComponentsParser.g:5359:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5363:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalGoatComponentsParser.g:5364:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalGoatComponentsParser.g:5371:1: rule__And__Group_1__1__Impl : ( AmpersandAmpersand ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5375:1: ( ( AmpersandAmpersand ) )
            // InternalGoatComponentsParser.g:5376:1: ( AmpersandAmpersand )
            {
            // InternalGoatComponentsParser.g:5376:1: ( AmpersandAmpersand )
            // InternalGoatComponentsParser.g:5377:2: AmpersandAmpersand
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
    // InternalGoatComponentsParser.g:5386:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5390:1: ( rule__And__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:5391:2: rule__And__Group_1__2__Impl
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
    // InternalGoatComponentsParser.g:5397:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5401:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:5402:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:5402:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:5403:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:5404:2: ( rule__And__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:5404:3: rule__And__RightAssignment_1_2
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
    // InternalGoatComponentsParser.g:5413:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5417:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalGoatComponentsParser.g:5418:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalGoatComponentsParser.g:5425:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5429:1: ( ( ruleComparison ) )
            // InternalGoatComponentsParser.g:5430:1: ( ruleComparison )
            {
            // InternalGoatComponentsParser.g:5430:1: ( ruleComparison )
            // InternalGoatComponentsParser.g:5431:2: ruleComparison
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
    // InternalGoatComponentsParser.g:5440:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5444:1: ( rule__Equality__Group__1__Impl )
            // InternalGoatComponentsParser.g:5445:2: rule__Equality__Group__1__Impl
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
    // InternalGoatComponentsParser.g:5451:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )? ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5455:1: ( ( ( rule__Equality__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5456:1: ( ( rule__Equality__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5456:1: ( ( rule__Equality__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5457:2: ( rule__Equality__Group_1__0 )?
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5458:2: ( rule__Equality__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ExclamationMarkEqualsSign||LA37_0==EqualsSignEqualsSign) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGoatComponentsParser.g:5458:3: rule__Equality__Group_1__0
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
    // InternalGoatComponentsParser.g:5467:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5471:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalGoatComponentsParser.g:5472:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalGoatComponentsParser.g:5479:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5483:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5484:1: ( () )
            {
            // InternalGoatComponentsParser.g:5484:1: ( () )
            // InternalGoatComponentsParser.g:5485:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:5486:2: ()
            // InternalGoatComponentsParser.g:5486:3: 
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
    // InternalGoatComponentsParser.g:5494:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5498:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalGoatComponentsParser.g:5499:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
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
    // InternalGoatComponentsParser.g:5506:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5510:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:5511:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:5511:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:5512:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalGoatComponentsParser.g:5513:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalGoatComponentsParser.g:5513:3: rule__Equality__OpAssignment_1_1
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
    // InternalGoatComponentsParser.g:5521:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5525:1: ( rule__Equality__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:5526:2: rule__Equality__Group_1__2__Impl
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
    // InternalGoatComponentsParser.g:5532:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5536:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:5537:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:5537:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:5538:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:5539:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:5539:3: rule__Equality__RightAssignment_1_2
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
    // InternalGoatComponentsParser.g:5548:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5552:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalGoatComponentsParser.g:5553:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalGoatComponentsParser.g:5560:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5564:1: ( ( rulePlusOrMinus ) )
            // InternalGoatComponentsParser.g:5565:1: ( rulePlusOrMinus )
            {
            // InternalGoatComponentsParser.g:5565:1: ( rulePlusOrMinus )
            // InternalGoatComponentsParser.g:5566:2: rulePlusOrMinus
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
    // InternalGoatComponentsParser.g:5575:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5579:1: ( rule__Comparison__Group__1__Impl )
            // InternalGoatComponentsParser.g:5580:2: rule__Comparison__Group__1__Impl
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
    // InternalGoatComponentsParser.g:5586:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )? ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5590:1: ( ( ( rule__Comparison__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5591:1: ( ( rule__Comparison__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5591:1: ( ( rule__Comparison__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5592:2: ( rule__Comparison__Group_1__0 )?
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5593:2: ( rule__Comparison__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LessThanSignEqualsSign||LA38_0==GreaterThanSignEqualsSign||LA38_0==LessThanSign||LA38_0==GreaterThanSign) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGoatComponentsParser.g:5593:3: rule__Comparison__Group_1__0
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
    // InternalGoatComponentsParser.g:5602:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5606:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalGoatComponentsParser.g:5607:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalGoatComponentsParser.g:5614:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5618:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5619:1: ( () )
            {
            // InternalGoatComponentsParser.g:5619:1: ( () )
            // InternalGoatComponentsParser.g:5620:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:5621:2: ()
            // InternalGoatComponentsParser.g:5621:3: 
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
    // InternalGoatComponentsParser.g:5629:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5633:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalGoatComponentsParser.g:5634:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
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
    // InternalGoatComponentsParser.g:5641:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5645:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:5646:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:5646:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:5647:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalGoatComponentsParser.g:5648:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalGoatComponentsParser.g:5648:3: rule__Comparison__OpAssignment_1_1
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
    // InternalGoatComponentsParser.g:5656:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5660:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:5661:2: rule__Comparison__Group_1__2__Impl
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
    // InternalGoatComponentsParser.g:5667:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5671:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:5672:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:5672:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:5673:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:5674:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:5674:3: rule__Comparison__RightAssignment_1_2
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
    // InternalGoatComponentsParser.g:5683:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5687:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalGoatComponentsParser.g:5688:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalGoatComponentsParser.g:5695:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5699:1: ( ( ruleMulOrDiv ) )
            // InternalGoatComponentsParser.g:5700:1: ( ruleMulOrDiv )
            {
            // InternalGoatComponentsParser.g:5700:1: ( ruleMulOrDiv )
            // InternalGoatComponentsParser.g:5701:2: ruleMulOrDiv
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
    // InternalGoatComponentsParser.g:5710:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5714:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalGoatComponentsParser.g:5715:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalGoatComponentsParser.g:5721:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )? ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5725:1: ( ( ( rule__PlusOrMinus__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5726:1: ( ( rule__PlusOrMinus__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5726:1: ( ( rule__PlusOrMinus__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5727:2: ( rule__PlusOrMinus__Group_1__0 )?
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5728:2: ( rule__PlusOrMinus__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==PlusSignPlusSign||LA39_0==PlusSign||LA39_0==HyphenMinus) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGoatComponentsParser.g:5728:3: rule__PlusOrMinus__Group_1__0
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
    // InternalGoatComponentsParser.g:5737:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5741:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalGoatComponentsParser.g:5742:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
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
    // InternalGoatComponentsParser.g:5749:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5753:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalGoatComponentsParser.g:5754:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalGoatComponentsParser.g:5754:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalGoatComponentsParser.g:5755:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalGoatComponentsParser.g:5756:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalGoatComponentsParser.g:5756:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalGoatComponentsParser.g:5764:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5768:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalGoatComponentsParser.g:5769:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalGoatComponentsParser.g:5775:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5779:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:5780:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:5780:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:5781:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalGoatComponentsParser.g:5782:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalGoatComponentsParser.g:5782:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalGoatComponentsParser.g:5791:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5795:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalGoatComponentsParser.g:5796:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
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
    // InternalGoatComponentsParser.g:5803:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5807:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5808:1: ( () )
            {
            // InternalGoatComponentsParser.g:5808:1: ( () )
            // InternalGoatComponentsParser.g:5809:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalGoatComponentsParser.g:5810:2: ()
            // InternalGoatComponentsParser.g:5810:3: 
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
    // InternalGoatComponentsParser.g:5818:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5822:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalGoatComponentsParser.g:5823:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalGoatComponentsParser.g:5829:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( PlusSign ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5833:1: ( ( PlusSign ) )
            // InternalGoatComponentsParser.g:5834:1: ( PlusSign )
            {
            // InternalGoatComponentsParser.g:5834:1: ( PlusSign )
            // InternalGoatComponentsParser.g:5835:2: PlusSign
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
    // InternalGoatComponentsParser.g:5845:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5849:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalGoatComponentsParser.g:5850:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalGoatComponentsParser.g:5857:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5861:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5862:1: ( () )
            {
            // InternalGoatComponentsParser.g:5862:1: ( () )
            // InternalGoatComponentsParser.g:5863:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalGoatComponentsParser.g:5864:2: ()
            // InternalGoatComponentsParser.g:5864:3: 
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
    // InternalGoatComponentsParser.g:5872:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5876:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalGoatComponentsParser.g:5877:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalGoatComponentsParser.g:5883:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5887:1: ( ( HyphenMinus ) )
            // InternalGoatComponentsParser.g:5888:1: ( HyphenMinus )
            {
            // InternalGoatComponentsParser.g:5888:1: ( HyphenMinus )
            // InternalGoatComponentsParser.g:5889:2: HyphenMinus
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
    // InternalGoatComponentsParser.g:5899:1: rule__PlusOrMinus__Group_1_0_2__0 : rule__PlusOrMinus__Group_1_0_2__0__Impl rule__PlusOrMinus__Group_1_0_2__1 ;
    public final void rule__PlusOrMinus__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5903:1: ( rule__PlusOrMinus__Group_1_0_2__0__Impl rule__PlusOrMinus__Group_1_0_2__1 )
            // InternalGoatComponentsParser.g:5904:2: rule__PlusOrMinus__Group_1_0_2__0__Impl rule__PlusOrMinus__Group_1_0_2__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalGoatComponentsParser.g:5911:1: rule__PlusOrMinus__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5915:1: ( ( () ) )
            // InternalGoatComponentsParser.g:5916:1: ( () )
            {
            // InternalGoatComponentsParser.g:5916:1: ( () )
            // InternalGoatComponentsParser.g:5917:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getConcatenateLeftAction_1_0_2_0()); 
            // InternalGoatComponentsParser.g:5918:2: ()
            // InternalGoatComponentsParser.g:5918:3: 
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
    // InternalGoatComponentsParser.g:5926:1: rule__PlusOrMinus__Group_1_0_2__1 : rule__PlusOrMinus__Group_1_0_2__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5930:1: ( rule__PlusOrMinus__Group_1_0_2__1__Impl )
            // InternalGoatComponentsParser.g:5931:2: rule__PlusOrMinus__Group_1_0_2__1__Impl
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
    // InternalGoatComponentsParser.g:5937:1: rule__PlusOrMinus__Group_1_0_2__1__Impl : ( PlusSignPlusSign ) ;
    public final void rule__PlusOrMinus__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5941:1: ( ( PlusSignPlusSign ) )
            // InternalGoatComponentsParser.g:5942:1: ( PlusSignPlusSign )
            {
            // InternalGoatComponentsParser.g:5942:1: ( PlusSignPlusSign )
            // InternalGoatComponentsParser.g:5943:2: PlusSignPlusSign
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
    // InternalGoatComponentsParser.g:5953:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5957:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalGoatComponentsParser.g:5958:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalGoatComponentsParser.g:5965:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5969:1: ( ( rulePrimary ) )
            // InternalGoatComponentsParser.g:5970:1: ( rulePrimary )
            {
            // InternalGoatComponentsParser.g:5970:1: ( rulePrimary )
            // InternalGoatComponentsParser.g:5971:2: rulePrimary
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
    // InternalGoatComponentsParser.g:5980:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5984:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalGoatComponentsParser.g:5985:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalGoatComponentsParser.g:5991:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )? ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:5995:1: ( ( ( rule__MulOrDiv__Group_1__0 )? ) )
            // InternalGoatComponentsParser.g:5996:1: ( ( rule__MulOrDiv__Group_1__0 )? )
            {
            // InternalGoatComponentsParser.g:5996:1: ( ( rule__MulOrDiv__Group_1__0 )? )
            // InternalGoatComponentsParser.g:5997:2: ( rule__MulOrDiv__Group_1__0 )?
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalGoatComponentsParser.g:5998:2: ( rule__MulOrDiv__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Asterisk||LA40_0==Solidus) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGoatComponentsParser.g:5998:3: rule__MulOrDiv__Group_1__0
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
    // InternalGoatComponentsParser.g:6007:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6011:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalGoatComponentsParser.g:6012:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalGoatComponentsParser.g:6019:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6023:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6024:1: ( () )
            {
            // InternalGoatComponentsParser.g:6024:1: ( () )
            // InternalGoatComponentsParser.g:6025:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalGoatComponentsParser.g:6026:2: ()
            // InternalGoatComponentsParser.g:6026:3: 
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
    // InternalGoatComponentsParser.g:6034:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6038:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalGoatComponentsParser.g:6039:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
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
    // InternalGoatComponentsParser.g:6046:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6050:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:6051:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:6051:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:6052:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalGoatComponentsParser.g:6053:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalGoatComponentsParser.g:6053:3: rule__MulOrDiv__OpAssignment_1_1
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
    // InternalGoatComponentsParser.g:6061:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6065:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalGoatComponentsParser.g:6066:2: rule__MulOrDiv__Group_1__2__Impl
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
    // InternalGoatComponentsParser.g:6072:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6076:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalGoatComponentsParser.g:6077:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalGoatComponentsParser.g:6077:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalGoatComponentsParser.g:6078:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalGoatComponentsParser.g:6079:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalGoatComponentsParser.g:6079:3: rule__MulOrDiv__RightAssignment_1_2
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
    // InternalGoatComponentsParser.g:6088:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6092:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalGoatComponentsParser.g:6093:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalGoatComponentsParser.g:6100:1: rule__Primary__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6104:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:6105:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:6105:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:6106:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:6115:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6119:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalGoatComponentsParser.g:6120:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
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
    // InternalGoatComponentsParser.g:6127:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6131:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:6132:1: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:6132:1: ( ruleExpression )
            // InternalGoatComponentsParser.g:6133:2: ruleExpression
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
    // InternalGoatComponentsParser.g:6142:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6146:1: ( rule__Primary__Group_0__2__Impl )
            // InternalGoatComponentsParser.g:6147:2: rule__Primary__Group_0__2__Impl
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
    // InternalGoatComponentsParser.g:6153:1: rule__Primary__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6157:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:6158:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:6158:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:6159:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:6169:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6173:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalGoatComponentsParser.g:6174:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalGoatComponentsParser.g:6181:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6185:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6186:1: ( () )
            {
            // InternalGoatComponentsParser.g:6186:1: ( () )
            // InternalGoatComponentsParser.g:6187:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalGoatComponentsParser.g:6188:2: ()
            // InternalGoatComponentsParser.g:6188:3: 
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
    // InternalGoatComponentsParser.g:6196:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6200:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalGoatComponentsParser.g:6201:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalGoatComponentsParser.g:6208:1: rule__Primary__Group_1__1__Impl : ( ExclamationMark ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6212:1: ( ( ExclamationMark ) )
            // InternalGoatComponentsParser.g:6213:1: ( ExclamationMark )
            {
            // InternalGoatComponentsParser.g:6213:1: ( ExclamationMark )
            // InternalGoatComponentsParser.g:6214:2: ExclamationMark
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
    // InternalGoatComponentsParser.g:6223:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6227:1: ( rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 )
            // InternalGoatComponentsParser.g:6228:2: rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3
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
    // InternalGoatComponentsParser.g:6235:1: rule__Primary__Group_1__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6239:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:6240:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:6240:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:6241:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:6250:1: rule__Primary__Group_1__3 : rule__Primary__Group_1__3__Impl rule__Primary__Group_1__4 ;
    public final void rule__Primary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6254:1: ( rule__Primary__Group_1__3__Impl rule__Primary__Group_1__4 )
            // InternalGoatComponentsParser.g:6255:2: rule__Primary__Group_1__3__Impl rule__Primary__Group_1__4
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
    // InternalGoatComponentsParser.g:6262:1: rule__Primary__Group_1__3__Impl : ( ( rule__Primary__ExpressionAssignment_1_3 ) ) ;
    public final void rule__Primary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6266:1: ( ( ( rule__Primary__ExpressionAssignment_1_3 ) ) )
            // InternalGoatComponentsParser.g:6267:1: ( ( rule__Primary__ExpressionAssignment_1_3 ) )
            {
            // InternalGoatComponentsParser.g:6267:1: ( ( rule__Primary__ExpressionAssignment_1_3 ) )
            // InternalGoatComponentsParser.g:6268:2: ( rule__Primary__ExpressionAssignment_1_3 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_3()); 
            // InternalGoatComponentsParser.g:6269:2: ( rule__Primary__ExpressionAssignment_1_3 )
            // InternalGoatComponentsParser.g:6269:3: rule__Primary__ExpressionAssignment_1_3
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
    // InternalGoatComponentsParser.g:6277:1: rule__Primary__Group_1__4 : rule__Primary__Group_1__4__Impl ;
    public final void rule__Primary__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6281:1: ( rule__Primary__Group_1__4__Impl )
            // InternalGoatComponentsParser.g:6282:2: rule__Primary__Group_1__4__Impl
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
    // InternalGoatComponentsParser.g:6288:1: rule__Primary__Group_1__4__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6292:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:6293:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:6293:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:6294:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:6304:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6308:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalGoatComponentsParser.g:6309:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalGoatComponentsParser.g:6316:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6320:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6321:1: ( () )
            {
            // InternalGoatComponentsParser.g:6321:1: ( () )
            // InternalGoatComponentsParser.g:6322:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalGoatComponentsParser.g:6323:2: ()
            // InternalGoatComponentsParser.g:6323:3: 
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
    // InternalGoatComponentsParser.g:6331:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6335:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalGoatComponentsParser.g:6336:2: rule__Atomic__Group_0__1__Impl
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
    // InternalGoatComponentsParser.g:6342:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6346:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalGoatComponentsParser.g:6347:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalGoatComponentsParser.g:6347:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalGoatComponentsParser.g:6348:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalGoatComponentsParser.g:6349:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalGoatComponentsParser.g:6349:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalGoatComponentsParser.g:6358:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6362:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalGoatComponentsParser.g:6363:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGoatComponentsParser.g:6370:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6374:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6375:1: ( () )
            {
            // InternalGoatComponentsParser.g:6375:1: ( () )
            // InternalGoatComponentsParser.g:6376:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalGoatComponentsParser.g:6377:2: ()
            // InternalGoatComponentsParser.g:6377:3: 
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
    // InternalGoatComponentsParser.g:6385:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6389:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalGoatComponentsParser.g:6390:2: rule__Atomic__Group_1__1__Impl
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
    // InternalGoatComponentsParser.g:6396:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6400:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalGoatComponentsParser.g:6401:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalGoatComponentsParser.g:6401:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalGoatComponentsParser.g:6402:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalGoatComponentsParser.g:6403:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalGoatComponentsParser.g:6403:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalGoatComponentsParser.g:6412:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6416:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalGoatComponentsParser.g:6417:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalGoatComponentsParser.g:6424:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6428:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6429:1: ( () )
            {
            // InternalGoatComponentsParser.g:6429:1: ( () )
            // InternalGoatComponentsParser.g:6430:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // InternalGoatComponentsParser.g:6431:2: ()
            // InternalGoatComponentsParser.g:6431:3: 
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
    // InternalGoatComponentsParser.g:6439:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6443:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalGoatComponentsParser.g:6444:2: rule__Atomic__Group_2__1__Impl
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
    // InternalGoatComponentsParser.g:6450:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6454:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalGoatComponentsParser.g:6455:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalGoatComponentsParser.g:6455:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalGoatComponentsParser.g:6456:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalGoatComponentsParser.g:6457:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalGoatComponentsParser.g:6457:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalGoatComponentsParser.g:6466:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6470:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalGoatComponentsParser.g:6471:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
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
    // InternalGoatComponentsParser.g:6478:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6482:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6483:1: ( () )
            {
            // InternalGoatComponentsParser.g:6483:1: ( () )
            // InternalGoatComponentsParser.g:6484:2: ()
            {
             before(grammarAccess.getAtomicAccess().getLocalVarRefAction_3_0()); 
            // InternalGoatComponentsParser.g:6485:2: ()
            // InternalGoatComponentsParser.g:6485:3: 
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
    // InternalGoatComponentsParser.g:6493:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6497:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalGoatComponentsParser.g:6498:2: rule__Atomic__Group_3__1__Impl
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
    // InternalGoatComponentsParser.g:6504:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6508:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // InternalGoatComponentsParser.g:6509:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // InternalGoatComponentsParser.g:6509:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // InternalGoatComponentsParser.g:6510:2: ( rule__Atomic__RefAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            // InternalGoatComponentsParser.g:6511:2: ( rule__Atomic__RefAssignment_3_1 )
            // InternalGoatComponentsParser.g:6511:3: rule__Atomic__RefAssignment_3_1
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
    // InternalGoatComponentsParser.g:6520:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6524:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalGoatComponentsParser.g:6525:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalGoatComponentsParser.g:6532:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6536:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6537:1: ( () )
            {
            // InternalGoatComponentsParser.g:6537:1: ( () )
            // InternalGoatComponentsParser.g:6538:2: ()
            {
             before(grammarAccess.getAtomicAccess().getLocalAttributeRefAction_4_0()); 
            // InternalGoatComponentsParser.g:6539:2: ()
            // InternalGoatComponentsParser.g:6539:3: 
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
    // InternalGoatComponentsParser.g:6547:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6551:1: ( rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 )
            // InternalGoatComponentsParser.g:6552:2: rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalGoatComponentsParser.g:6559:1: rule__Atomic__Group_4__1__Impl : ( Proc ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6563:1: ( ( Proc ) )
            // InternalGoatComponentsParser.g:6564:1: ( Proc )
            {
            // InternalGoatComponentsParser.g:6564:1: ( Proc )
            // InternalGoatComponentsParser.g:6565:2: Proc
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
    // InternalGoatComponentsParser.g:6574:1: rule__Atomic__Group_4__2 : rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 ;
    public final void rule__Atomic__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6578:1: ( rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 )
            // InternalGoatComponentsParser.g:6579:2: rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3
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
    // InternalGoatComponentsParser.g:6586:1: rule__Atomic__Group_4__2__Impl : ( FullStop ) ;
    public final void rule__Atomic__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6590:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:6591:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:6591:1: ( FullStop )
            // InternalGoatComponentsParser.g:6592:2: FullStop
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
    // InternalGoatComponentsParser.g:6601:1: rule__Atomic__Group_4__3 : rule__Atomic__Group_4__3__Impl ;
    public final void rule__Atomic__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6605:1: ( rule__Atomic__Group_4__3__Impl )
            // InternalGoatComponentsParser.g:6606:2: rule__Atomic__Group_4__3__Impl
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
    // InternalGoatComponentsParser.g:6612:1: rule__Atomic__Group_4__3__Impl : ( ( rule__Atomic__AttributeAssignment_4_3 ) ) ;
    public final void rule__Atomic__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6616:1: ( ( ( rule__Atomic__AttributeAssignment_4_3 ) ) )
            // InternalGoatComponentsParser.g:6617:1: ( ( rule__Atomic__AttributeAssignment_4_3 ) )
            {
            // InternalGoatComponentsParser.g:6617:1: ( ( rule__Atomic__AttributeAssignment_4_3 ) )
            // InternalGoatComponentsParser.g:6618:2: ( rule__Atomic__AttributeAssignment_4_3 )
            {
             before(grammarAccess.getAtomicAccess().getAttributeAssignment_4_3()); 
            // InternalGoatComponentsParser.g:6619:2: ( rule__Atomic__AttributeAssignment_4_3 )
            // InternalGoatComponentsParser.g:6619:3: rule__Atomic__AttributeAssignment_4_3
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
    // InternalGoatComponentsParser.g:6628:1: rule__Atomic__Group_5__0 : rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 ;
    public final void rule__Atomic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6632:1: ( rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 )
            // InternalGoatComponentsParser.g:6633:2: rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1
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
    // InternalGoatComponentsParser.g:6640:1: rule__Atomic__Group_5__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6644:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6645:1: ( () )
            {
            // InternalGoatComponentsParser.g:6645:1: ( () )
            // InternalGoatComponentsParser.g:6646:2: ()
            {
             before(grammarAccess.getAtomicAccess().getFunctionCallAction_5_0()); 
            // InternalGoatComponentsParser.g:6647:2: ()
            // InternalGoatComponentsParser.g:6647:3: 
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
    // InternalGoatComponentsParser.g:6655:1: rule__Atomic__Group_5__1 : rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 ;
    public final void rule__Atomic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6659:1: ( rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 )
            // InternalGoatComponentsParser.g:6660:2: rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2
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
    // InternalGoatComponentsParser.g:6667:1: rule__Atomic__Group_5__1__Impl : ( ( rule__Atomic__FunctionAssignment_5_1 ) ) ;
    public final void rule__Atomic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6671:1: ( ( ( rule__Atomic__FunctionAssignment_5_1 ) ) )
            // InternalGoatComponentsParser.g:6672:1: ( ( rule__Atomic__FunctionAssignment_5_1 ) )
            {
            // InternalGoatComponentsParser.g:6672:1: ( ( rule__Atomic__FunctionAssignment_5_1 ) )
            // InternalGoatComponentsParser.g:6673:2: ( rule__Atomic__FunctionAssignment_5_1 )
            {
             before(grammarAccess.getAtomicAccess().getFunctionAssignment_5_1()); 
            // InternalGoatComponentsParser.g:6674:2: ( rule__Atomic__FunctionAssignment_5_1 )
            // InternalGoatComponentsParser.g:6674:3: rule__Atomic__FunctionAssignment_5_1
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
    // InternalGoatComponentsParser.g:6682:1: rule__Atomic__Group_5__2 : rule__Atomic__Group_5__2__Impl rule__Atomic__Group_5__3 ;
    public final void rule__Atomic__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6686:1: ( rule__Atomic__Group_5__2__Impl rule__Atomic__Group_5__3 )
            // InternalGoatComponentsParser.g:6687:2: rule__Atomic__Group_5__2__Impl rule__Atomic__Group_5__3
            {
            pushFollow(FOLLOW_53);
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
    // InternalGoatComponentsParser.g:6694:1: rule__Atomic__Group_5__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Atomic__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6698:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:6699:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:6699:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:6700:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:6709:1: rule__Atomic__Group_5__3 : rule__Atomic__Group_5__3__Impl rule__Atomic__Group_5__4 ;
    public final void rule__Atomic__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6713:1: ( rule__Atomic__Group_5__3__Impl rule__Atomic__Group_5__4 )
            // InternalGoatComponentsParser.g:6714:2: rule__Atomic__Group_5__3__Impl rule__Atomic__Group_5__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalGoatComponentsParser.g:6721:1: rule__Atomic__Group_5__3__Impl : ( ( rule__Atomic__Group_5_3__0 )? ) ;
    public final void rule__Atomic__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6725:1: ( ( ( rule__Atomic__Group_5_3__0 )? ) )
            // InternalGoatComponentsParser.g:6726:1: ( ( rule__Atomic__Group_5_3__0 )? )
            {
            // InternalGoatComponentsParser.g:6726:1: ( ( rule__Atomic__Group_5_3__0 )? )
            // InternalGoatComponentsParser.g:6727:2: ( rule__Atomic__Group_5_3__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_5_3()); 
            // InternalGoatComponentsParser.g:6728:2: ( rule__Atomic__Group_5_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Receiver||LA41_0==False||LA41_0==Proc||(LA41_0>=This && LA41_0<=True)||(LA41_0>=ExclamationMark && LA41_0<=LeftParenthesis)||(LA41_0>=RULE_ID && LA41_0<=RULE_STRING)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGoatComponentsParser.g:6728:3: rule__Atomic__Group_5_3__0
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
    // InternalGoatComponentsParser.g:6736:1: rule__Atomic__Group_5__4 : rule__Atomic__Group_5__4__Impl ;
    public final void rule__Atomic__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6740:1: ( rule__Atomic__Group_5__4__Impl )
            // InternalGoatComponentsParser.g:6741:2: rule__Atomic__Group_5__4__Impl
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
    // InternalGoatComponentsParser.g:6747:1: rule__Atomic__Group_5__4__Impl : ( RightParenthesis ) ;
    public final void rule__Atomic__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6751:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:6752:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:6752:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:6753:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:6763:1: rule__Atomic__Group_5_3__0 : rule__Atomic__Group_5_3__0__Impl rule__Atomic__Group_5_3__1 ;
    public final void rule__Atomic__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6767:1: ( rule__Atomic__Group_5_3__0__Impl rule__Atomic__Group_5_3__1 )
            // InternalGoatComponentsParser.g:6768:2: rule__Atomic__Group_5_3__0__Impl rule__Atomic__Group_5_3__1
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
    // InternalGoatComponentsParser.g:6775:1: rule__Atomic__Group_5_3__0__Impl : ( ( rule__Atomic__ParamsAssignment_5_3_0 ) ) ;
    public final void rule__Atomic__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6779:1: ( ( ( rule__Atomic__ParamsAssignment_5_3_0 ) ) )
            // InternalGoatComponentsParser.g:6780:1: ( ( rule__Atomic__ParamsAssignment_5_3_0 ) )
            {
            // InternalGoatComponentsParser.g:6780:1: ( ( rule__Atomic__ParamsAssignment_5_3_0 ) )
            // InternalGoatComponentsParser.g:6781:2: ( rule__Atomic__ParamsAssignment_5_3_0 )
            {
             before(grammarAccess.getAtomicAccess().getParamsAssignment_5_3_0()); 
            // InternalGoatComponentsParser.g:6782:2: ( rule__Atomic__ParamsAssignment_5_3_0 )
            // InternalGoatComponentsParser.g:6782:3: rule__Atomic__ParamsAssignment_5_3_0
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
    // InternalGoatComponentsParser.g:6790:1: rule__Atomic__Group_5_3__1 : rule__Atomic__Group_5_3__1__Impl ;
    public final void rule__Atomic__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6794:1: ( rule__Atomic__Group_5_3__1__Impl )
            // InternalGoatComponentsParser.g:6795:2: rule__Atomic__Group_5_3__1__Impl
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
    // InternalGoatComponentsParser.g:6801:1: rule__Atomic__Group_5_3__1__Impl : ( ( rule__Atomic__Group_5_3_1__0 )* ) ;
    public final void rule__Atomic__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6805:1: ( ( ( rule__Atomic__Group_5_3_1__0 )* ) )
            // InternalGoatComponentsParser.g:6806:1: ( ( rule__Atomic__Group_5_3_1__0 )* )
            {
            // InternalGoatComponentsParser.g:6806:1: ( ( rule__Atomic__Group_5_3_1__0 )* )
            // InternalGoatComponentsParser.g:6807:2: ( rule__Atomic__Group_5_3_1__0 )*
            {
             before(grammarAccess.getAtomicAccess().getGroup_5_3_1()); 
            // InternalGoatComponentsParser.g:6808:2: ( rule__Atomic__Group_5_3_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Comma) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:6808:3: rule__Atomic__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Atomic__Group_5_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalGoatComponentsParser.g:6817:1: rule__Atomic__Group_5_3_1__0 : rule__Atomic__Group_5_3_1__0__Impl rule__Atomic__Group_5_3_1__1 ;
    public final void rule__Atomic__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6821:1: ( rule__Atomic__Group_5_3_1__0__Impl rule__Atomic__Group_5_3_1__1 )
            // InternalGoatComponentsParser.g:6822:2: rule__Atomic__Group_5_3_1__0__Impl rule__Atomic__Group_5_3_1__1
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
    // InternalGoatComponentsParser.g:6829:1: rule__Atomic__Group_5_3_1__0__Impl : ( Comma ) ;
    public final void rule__Atomic__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6833:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:6834:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:6834:1: ( Comma )
            // InternalGoatComponentsParser.g:6835:2: Comma
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
    // InternalGoatComponentsParser.g:6844:1: rule__Atomic__Group_5_3_1__1 : rule__Atomic__Group_5_3_1__1__Impl ;
    public final void rule__Atomic__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6848:1: ( rule__Atomic__Group_5_3_1__1__Impl )
            // InternalGoatComponentsParser.g:6849:2: rule__Atomic__Group_5_3_1__1__Impl
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
    // InternalGoatComponentsParser.g:6855:1: rule__Atomic__Group_5_3_1__1__Impl : ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) ) ;
    public final void rule__Atomic__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6859:1: ( ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) ) )
            // InternalGoatComponentsParser.g:6860:1: ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) )
            {
            // InternalGoatComponentsParser.g:6860:1: ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) )
            // InternalGoatComponentsParser.g:6861:2: ( rule__Atomic__ParamsAssignment_5_3_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getParamsAssignment_5_3_1_1()); 
            // InternalGoatComponentsParser.g:6862:2: ( rule__Atomic__ParamsAssignment_5_3_1_1 )
            // InternalGoatComponentsParser.g:6862:3: rule__Atomic__ParamsAssignment_5_3_1_1
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
    // InternalGoatComponentsParser.g:6871:1: rule__Atomic__Group_6__0 : rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 ;
    public final void rule__Atomic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6875:1: ( rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 )
            // InternalGoatComponentsParser.g:6876:2: rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalGoatComponentsParser.g:6883:1: rule__Atomic__Group_6__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6887:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6888:1: ( () )
            {
            // InternalGoatComponentsParser.g:6888:1: ( () )
            // InternalGoatComponentsParser.g:6889:2: ()
            {
             before(grammarAccess.getAtomicAccess().getComponentAttributeRefAction_6_0()); 
            // InternalGoatComponentsParser.g:6890:2: ()
            // InternalGoatComponentsParser.g:6890:3: 
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
    // InternalGoatComponentsParser.g:6898:1: rule__Atomic__Group_6__1 : rule__Atomic__Group_6__1__Impl rule__Atomic__Group_6__2 ;
    public final void rule__Atomic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6902:1: ( rule__Atomic__Group_6__1__Impl rule__Atomic__Group_6__2 )
            // InternalGoatComponentsParser.g:6903:2: rule__Atomic__Group_6__1__Impl rule__Atomic__Group_6__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalGoatComponentsParser.g:6910:1: rule__Atomic__Group_6__1__Impl : ( This ) ;
    public final void rule__Atomic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6914:1: ( ( This ) )
            // InternalGoatComponentsParser.g:6915:1: ( This )
            {
            // InternalGoatComponentsParser.g:6915:1: ( This )
            // InternalGoatComponentsParser.g:6916:2: This
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
    // InternalGoatComponentsParser.g:6925:1: rule__Atomic__Group_6__2 : rule__Atomic__Group_6__2__Impl rule__Atomic__Group_6__3 ;
    public final void rule__Atomic__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6929:1: ( rule__Atomic__Group_6__2__Impl rule__Atomic__Group_6__3 )
            // InternalGoatComponentsParser.g:6930:2: rule__Atomic__Group_6__2__Impl rule__Atomic__Group_6__3
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
    // InternalGoatComponentsParser.g:6937:1: rule__Atomic__Group_6__2__Impl : ( FullStop ) ;
    public final void rule__Atomic__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6941:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:6942:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:6942:1: ( FullStop )
            // InternalGoatComponentsParser.g:6943:2: FullStop
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
    // InternalGoatComponentsParser.g:6952:1: rule__Atomic__Group_6__3 : rule__Atomic__Group_6__3__Impl ;
    public final void rule__Atomic__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6956:1: ( rule__Atomic__Group_6__3__Impl )
            // InternalGoatComponentsParser.g:6957:2: rule__Atomic__Group_6__3__Impl
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
    // InternalGoatComponentsParser.g:6963:1: rule__Atomic__Group_6__3__Impl : ( ( rule__Atomic__AttributeAssignment_6_3 ) ) ;
    public final void rule__Atomic__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6967:1: ( ( ( rule__Atomic__AttributeAssignment_6_3 ) ) )
            // InternalGoatComponentsParser.g:6968:1: ( ( rule__Atomic__AttributeAssignment_6_3 ) )
            {
            // InternalGoatComponentsParser.g:6968:1: ( ( rule__Atomic__AttributeAssignment_6_3 ) )
            // InternalGoatComponentsParser.g:6969:2: ( rule__Atomic__AttributeAssignment_6_3 )
            {
             before(grammarAccess.getAtomicAccess().getAttributeAssignment_6_3()); 
            // InternalGoatComponentsParser.g:6970:2: ( rule__Atomic__AttributeAssignment_6_3 )
            // InternalGoatComponentsParser.g:6970:3: rule__Atomic__AttributeAssignment_6_3
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
    // InternalGoatComponentsParser.g:6979:1: rule__Atomic__Group_7__0 : rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 ;
    public final void rule__Atomic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6983:1: ( rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 )
            // InternalGoatComponentsParser.g:6984:2: rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1
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
    // InternalGoatComponentsParser.g:6991:1: rule__Atomic__Group_7__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:6995:1: ( ( () ) )
            // InternalGoatComponentsParser.g:6996:1: ( () )
            {
            // InternalGoatComponentsParser.g:6996:1: ( () )
            // InternalGoatComponentsParser.g:6997:2: ()
            {
             before(grammarAccess.getAtomicAccess().getRecAttributeRefAction_7_0()); 
            // InternalGoatComponentsParser.g:6998:2: ()
            // InternalGoatComponentsParser.g:6998:3: 
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
    // InternalGoatComponentsParser.g:7006:1: rule__Atomic__Group_7__1 : rule__Atomic__Group_7__1__Impl rule__Atomic__Group_7__2 ;
    public final void rule__Atomic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7010:1: ( rule__Atomic__Group_7__1__Impl rule__Atomic__Group_7__2 )
            // InternalGoatComponentsParser.g:7011:2: rule__Atomic__Group_7__1__Impl rule__Atomic__Group_7__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalGoatComponentsParser.g:7018:1: rule__Atomic__Group_7__1__Impl : ( Receiver ) ;
    public final void rule__Atomic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7022:1: ( ( Receiver ) )
            // InternalGoatComponentsParser.g:7023:1: ( Receiver )
            {
            // InternalGoatComponentsParser.g:7023:1: ( Receiver )
            // InternalGoatComponentsParser.g:7024:2: Receiver
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
    // InternalGoatComponentsParser.g:7033:1: rule__Atomic__Group_7__2 : rule__Atomic__Group_7__2__Impl rule__Atomic__Group_7__3 ;
    public final void rule__Atomic__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7037:1: ( rule__Atomic__Group_7__2__Impl rule__Atomic__Group_7__3 )
            // InternalGoatComponentsParser.g:7038:2: rule__Atomic__Group_7__2__Impl rule__Atomic__Group_7__3
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
    // InternalGoatComponentsParser.g:7045:1: rule__Atomic__Group_7__2__Impl : ( FullStop ) ;
    public final void rule__Atomic__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7049:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:7050:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:7050:1: ( FullStop )
            // InternalGoatComponentsParser.g:7051:2: FullStop
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
    // InternalGoatComponentsParser.g:7060:1: rule__Atomic__Group_7__3 : rule__Atomic__Group_7__3__Impl ;
    public final void rule__Atomic__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7064:1: ( rule__Atomic__Group_7__3__Impl )
            // InternalGoatComponentsParser.g:7065:2: rule__Atomic__Group_7__3__Impl
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
    // InternalGoatComponentsParser.g:7071:1: rule__Atomic__Group_7__3__Impl : ( ( rule__Atomic__AttributeAssignment_7_3 ) ) ;
    public final void rule__Atomic__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7075:1: ( ( ( rule__Atomic__AttributeAssignment_7_3 ) ) )
            // InternalGoatComponentsParser.g:7076:1: ( ( rule__Atomic__AttributeAssignment_7_3 ) )
            {
            // InternalGoatComponentsParser.g:7076:1: ( ( rule__Atomic__AttributeAssignment_7_3 ) )
            // InternalGoatComponentsParser.g:7077:2: ( rule__Atomic__AttributeAssignment_7_3 )
            {
             before(grammarAccess.getAtomicAccess().getAttributeAssignment_7_3()); 
            // InternalGoatComponentsParser.g:7078:2: ( rule__Atomic__AttributeAssignment_7_3 )
            // InternalGoatComponentsParser.g:7078:3: rule__Atomic__AttributeAssignment_7_3
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
    // InternalGoatComponentsParser.g:7087:1: rule__AttributeToSet__Group_0__0 : rule__AttributeToSet__Group_0__0__Impl rule__AttributeToSet__Group_0__1 ;
    public final void rule__AttributeToSet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7091:1: ( rule__AttributeToSet__Group_0__0__Impl rule__AttributeToSet__Group_0__1 )
            // InternalGoatComponentsParser.g:7092:2: rule__AttributeToSet__Group_0__0__Impl rule__AttributeToSet__Group_0__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalGoatComponentsParser.g:7099:1: rule__AttributeToSet__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeToSet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7103:1: ( ( () ) )
            // InternalGoatComponentsParser.g:7104:1: ( () )
            {
            // InternalGoatComponentsParser.g:7104:1: ( () )
            // InternalGoatComponentsParser.g:7105:2: ()
            {
             before(grammarAccess.getAttributeToSetAccess().getComponentAttributeToSetAction_0_0()); 
            // InternalGoatComponentsParser.g:7106:2: ()
            // InternalGoatComponentsParser.g:7106:3: 
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
    // InternalGoatComponentsParser.g:7114:1: rule__AttributeToSet__Group_0__1 : rule__AttributeToSet__Group_0__1__Impl rule__AttributeToSet__Group_0__2 ;
    public final void rule__AttributeToSet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7118:1: ( rule__AttributeToSet__Group_0__1__Impl rule__AttributeToSet__Group_0__2 )
            // InternalGoatComponentsParser.g:7119:2: rule__AttributeToSet__Group_0__1__Impl rule__AttributeToSet__Group_0__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalGoatComponentsParser.g:7126:1: rule__AttributeToSet__Group_0__1__Impl : ( This ) ;
    public final void rule__AttributeToSet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7130:1: ( ( This ) )
            // InternalGoatComponentsParser.g:7131:1: ( This )
            {
            // InternalGoatComponentsParser.g:7131:1: ( This )
            // InternalGoatComponentsParser.g:7132:2: This
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
    // InternalGoatComponentsParser.g:7141:1: rule__AttributeToSet__Group_0__2 : rule__AttributeToSet__Group_0__2__Impl rule__AttributeToSet__Group_0__3 ;
    public final void rule__AttributeToSet__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7145:1: ( rule__AttributeToSet__Group_0__2__Impl rule__AttributeToSet__Group_0__3 )
            // InternalGoatComponentsParser.g:7146:2: rule__AttributeToSet__Group_0__2__Impl rule__AttributeToSet__Group_0__3
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
    // InternalGoatComponentsParser.g:7153:1: rule__AttributeToSet__Group_0__2__Impl : ( FullStop ) ;
    public final void rule__AttributeToSet__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7157:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:7158:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:7158:1: ( FullStop )
            // InternalGoatComponentsParser.g:7159:2: FullStop
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
    // InternalGoatComponentsParser.g:7168:1: rule__AttributeToSet__Group_0__3 : rule__AttributeToSet__Group_0__3__Impl ;
    public final void rule__AttributeToSet__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7172:1: ( rule__AttributeToSet__Group_0__3__Impl )
            // InternalGoatComponentsParser.g:7173:2: rule__AttributeToSet__Group_0__3__Impl
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
    // InternalGoatComponentsParser.g:7179:1: rule__AttributeToSet__Group_0__3__Impl : ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) ) ;
    public final void rule__AttributeToSet__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7183:1: ( ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) ) )
            // InternalGoatComponentsParser.g:7184:1: ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) )
            {
            // InternalGoatComponentsParser.g:7184:1: ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) )
            // InternalGoatComponentsParser.g:7185:2: ( rule__AttributeToSet__AttributeAssignment_0_3 )
            {
             before(grammarAccess.getAttributeToSetAccess().getAttributeAssignment_0_3()); 
            // InternalGoatComponentsParser.g:7186:2: ( rule__AttributeToSet__AttributeAssignment_0_3 )
            // InternalGoatComponentsParser.g:7186:3: rule__AttributeToSet__AttributeAssignment_0_3
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
    // InternalGoatComponentsParser.g:7195:1: rule__AttributeToSet__Group_1__0 : rule__AttributeToSet__Group_1__0__Impl rule__AttributeToSet__Group_1__1 ;
    public final void rule__AttributeToSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7199:1: ( rule__AttributeToSet__Group_1__0__Impl rule__AttributeToSet__Group_1__1 )
            // InternalGoatComponentsParser.g:7200:2: rule__AttributeToSet__Group_1__0__Impl rule__AttributeToSet__Group_1__1
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
    // InternalGoatComponentsParser.g:7207:1: rule__AttributeToSet__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeToSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7211:1: ( ( () ) )
            // InternalGoatComponentsParser.g:7212:1: ( () )
            {
            // InternalGoatComponentsParser.g:7212:1: ( () )
            // InternalGoatComponentsParser.g:7213:2: ()
            {
             before(grammarAccess.getAttributeToSetAccess().getLocalAttributeToSetAction_1_0()); 
            // InternalGoatComponentsParser.g:7214:2: ()
            // InternalGoatComponentsParser.g:7214:3: 
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
    // InternalGoatComponentsParser.g:7222:1: rule__AttributeToSet__Group_1__1 : rule__AttributeToSet__Group_1__1__Impl rule__AttributeToSet__Group_1__2 ;
    public final void rule__AttributeToSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7226:1: ( rule__AttributeToSet__Group_1__1__Impl rule__AttributeToSet__Group_1__2 )
            // InternalGoatComponentsParser.g:7227:2: rule__AttributeToSet__Group_1__1__Impl rule__AttributeToSet__Group_1__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalGoatComponentsParser.g:7234:1: rule__AttributeToSet__Group_1__1__Impl : ( Proc ) ;
    public final void rule__AttributeToSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7238:1: ( ( Proc ) )
            // InternalGoatComponentsParser.g:7239:1: ( Proc )
            {
            // InternalGoatComponentsParser.g:7239:1: ( Proc )
            // InternalGoatComponentsParser.g:7240:2: Proc
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
    // InternalGoatComponentsParser.g:7249:1: rule__AttributeToSet__Group_1__2 : rule__AttributeToSet__Group_1__2__Impl rule__AttributeToSet__Group_1__3 ;
    public final void rule__AttributeToSet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7253:1: ( rule__AttributeToSet__Group_1__2__Impl rule__AttributeToSet__Group_1__3 )
            // InternalGoatComponentsParser.g:7254:2: rule__AttributeToSet__Group_1__2__Impl rule__AttributeToSet__Group_1__3
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
    // InternalGoatComponentsParser.g:7261:1: rule__AttributeToSet__Group_1__2__Impl : ( FullStop ) ;
    public final void rule__AttributeToSet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7265:1: ( ( FullStop ) )
            // InternalGoatComponentsParser.g:7266:1: ( FullStop )
            {
            // InternalGoatComponentsParser.g:7266:1: ( FullStop )
            // InternalGoatComponentsParser.g:7267:2: FullStop
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
    // InternalGoatComponentsParser.g:7276:1: rule__AttributeToSet__Group_1__3 : rule__AttributeToSet__Group_1__3__Impl ;
    public final void rule__AttributeToSet__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7280:1: ( rule__AttributeToSet__Group_1__3__Impl )
            // InternalGoatComponentsParser.g:7281:2: rule__AttributeToSet__Group_1__3__Impl
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
    // InternalGoatComponentsParser.g:7287:1: rule__AttributeToSet__Group_1__3__Impl : ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) ) ;
    public final void rule__AttributeToSet__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7291:1: ( ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) ) )
            // InternalGoatComponentsParser.g:7292:1: ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) )
            {
            // InternalGoatComponentsParser.g:7292:1: ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) )
            // InternalGoatComponentsParser.g:7293:2: ( rule__AttributeToSet__AttributeAssignment_1_3 )
            {
             before(grammarAccess.getAttributeToSetAccess().getAttributeAssignment_1_3()); 
            // InternalGoatComponentsParser.g:7294:2: ( rule__AttributeToSet__AttributeAssignment_1_3 )
            // InternalGoatComponentsParser.g:7294:3: rule__AttributeToSet__AttributeAssignment_1_3
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
    // InternalGoatComponentsParser.g:7303:1: rule__FuncParam__Group__0 : rule__FuncParam__Group__0__Impl rule__FuncParam__Group__1 ;
    public final void rule__FuncParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7307:1: ( rule__FuncParam__Group__0__Impl rule__FuncParam__Group__1 )
            // InternalGoatComponentsParser.g:7308:2: rule__FuncParam__Group__0__Impl rule__FuncParam__Group__1
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
    // InternalGoatComponentsParser.g:7315:1: rule__FuncParam__Group__0__Impl : ( ( rule__FuncParam__TypeAssignment_0 ) ) ;
    public final void rule__FuncParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7319:1: ( ( ( rule__FuncParam__TypeAssignment_0 ) ) )
            // InternalGoatComponentsParser.g:7320:1: ( ( rule__FuncParam__TypeAssignment_0 ) )
            {
            // InternalGoatComponentsParser.g:7320:1: ( ( rule__FuncParam__TypeAssignment_0 ) )
            // InternalGoatComponentsParser.g:7321:2: ( rule__FuncParam__TypeAssignment_0 )
            {
             before(grammarAccess.getFuncParamAccess().getTypeAssignment_0()); 
            // InternalGoatComponentsParser.g:7322:2: ( rule__FuncParam__TypeAssignment_0 )
            // InternalGoatComponentsParser.g:7322:3: rule__FuncParam__TypeAssignment_0
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
    // InternalGoatComponentsParser.g:7330:1: rule__FuncParam__Group__1 : rule__FuncParam__Group__1__Impl ;
    public final void rule__FuncParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7334:1: ( rule__FuncParam__Group__1__Impl )
            // InternalGoatComponentsParser.g:7335:2: rule__FuncParam__Group__1__Impl
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
    // InternalGoatComponentsParser.g:7341:1: rule__FuncParam__Group__1__Impl : ( ( rule__FuncParam__NameAssignment_1 ) ) ;
    public final void rule__FuncParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7345:1: ( ( ( rule__FuncParam__NameAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:7346:1: ( ( rule__FuncParam__NameAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:7346:1: ( ( rule__FuncParam__NameAssignment_1 ) )
            // InternalGoatComponentsParser.g:7347:2: ( rule__FuncParam__NameAssignment_1 )
            {
             before(grammarAccess.getFuncParamAccess().getNameAssignment_1()); 
            // InternalGoatComponentsParser.g:7348:2: ( rule__FuncParam__NameAssignment_1 )
            // InternalGoatComponentsParser.g:7348:3: rule__FuncParam__NameAssignment_1
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
    // InternalGoatComponentsParser.g:7357:1: rule__FuncDefinition__Group__0 : rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1 ;
    public final void rule__FuncDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7361:1: ( rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1 )
            // InternalGoatComponentsParser.g:7362:2: rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalGoatComponentsParser.g:7369:1: rule__FuncDefinition__Group__0__Impl : ( Function ) ;
    public final void rule__FuncDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7373:1: ( ( Function ) )
            // InternalGoatComponentsParser.g:7374:1: ( Function )
            {
            // InternalGoatComponentsParser.g:7374:1: ( Function )
            // InternalGoatComponentsParser.g:7375:2: Function
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
    // InternalGoatComponentsParser.g:7384:1: rule__FuncDefinition__Group__1 : rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2 ;
    public final void rule__FuncDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7388:1: ( rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2 )
            // InternalGoatComponentsParser.g:7389:2: rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2
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
    // InternalGoatComponentsParser.g:7396:1: rule__FuncDefinition__Group__1__Impl : ( ( rule__FuncDefinition__TypeAssignment_1 ) ) ;
    public final void rule__FuncDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7400:1: ( ( ( rule__FuncDefinition__TypeAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:7401:1: ( ( rule__FuncDefinition__TypeAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:7401:1: ( ( rule__FuncDefinition__TypeAssignment_1 ) )
            // InternalGoatComponentsParser.g:7402:2: ( rule__FuncDefinition__TypeAssignment_1 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getTypeAssignment_1()); 
            // InternalGoatComponentsParser.g:7403:2: ( rule__FuncDefinition__TypeAssignment_1 )
            // InternalGoatComponentsParser.g:7403:3: rule__FuncDefinition__TypeAssignment_1
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
    // InternalGoatComponentsParser.g:7411:1: rule__FuncDefinition__Group__2 : rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3 ;
    public final void rule__FuncDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7415:1: ( rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3 )
            // InternalGoatComponentsParser.g:7416:2: rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3
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
    // InternalGoatComponentsParser.g:7423:1: rule__FuncDefinition__Group__2__Impl : ( ( rule__FuncDefinition__NameAssignment_2 ) ) ;
    public final void rule__FuncDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7427:1: ( ( ( rule__FuncDefinition__NameAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:7428:1: ( ( rule__FuncDefinition__NameAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:7428:1: ( ( rule__FuncDefinition__NameAssignment_2 ) )
            // InternalGoatComponentsParser.g:7429:2: ( rule__FuncDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getNameAssignment_2()); 
            // InternalGoatComponentsParser.g:7430:2: ( rule__FuncDefinition__NameAssignment_2 )
            // InternalGoatComponentsParser.g:7430:3: rule__FuncDefinition__NameAssignment_2
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
    // InternalGoatComponentsParser.g:7438:1: rule__FuncDefinition__Group__3 : rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4 ;
    public final void rule__FuncDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7442:1: ( rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4 )
            // InternalGoatComponentsParser.g:7443:2: rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4
            {
            pushFollow(FOLLOW_56);
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
    // InternalGoatComponentsParser.g:7450:1: rule__FuncDefinition__Group__3__Impl : ( LeftParenthesis ) ;
    public final void rule__FuncDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7454:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:7455:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:7455:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:7456:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:7465:1: rule__FuncDefinition__Group__4 : rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5 ;
    public final void rule__FuncDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7469:1: ( rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5 )
            // InternalGoatComponentsParser.g:7470:2: rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5
            {
            pushFollow(FOLLOW_56);
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
    // InternalGoatComponentsParser.g:7477:1: rule__FuncDefinition__Group__4__Impl : ( ( rule__FuncDefinition__Group_4__0 )? ) ;
    public final void rule__FuncDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7481:1: ( ( ( rule__FuncDefinition__Group_4__0 )? ) )
            // InternalGoatComponentsParser.g:7482:1: ( ( rule__FuncDefinition__Group_4__0 )? )
            {
            // InternalGoatComponentsParser.g:7482:1: ( ( rule__FuncDefinition__Group_4__0 )? )
            // InternalGoatComponentsParser.g:7483:2: ( rule__FuncDefinition__Group_4__0 )?
            {
             before(grammarAccess.getFuncDefinitionAccess().getGroup_4()); 
            // InternalGoatComponentsParser.g:7484:2: ( rule__FuncDefinition__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_TYPE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGoatComponentsParser.g:7484:3: rule__FuncDefinition__Group_4__0
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
    // InternalGoatComponentsParser.g:7492:1: rule__FuncDefinition__Group__5 : rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6 ;
    public final void rule__FuncDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7496:1: ( rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6 )
            // InternalGoatComponentsParser.g:7497:2: rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6
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
    // InternalGoatComponentsParser.g:7504:1: rule__FuncDefinition__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__FuncDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7508:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:7509:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:7509:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:7510:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:7519:1: rule__FuncDefinition__Group__6 : rule__FuncDefinition__Group__6__Impl ;
    public final void rule__FuncDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7523:1: ( rule__FuncDefinition__Group__6__Impl )
            // InternalGoatComponentsParser.g:7524:2: rule__FuncDefinition__Group__6__Impl
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
    // InternalGoatComponentsParser.g:7530:1: rule__FuncDefinition__Group__6__Impl : ( ( rule__FuncDefinition__BlkAssignment_6 ) ) ;
    public final void rule__FuncDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7534:1: ( ( ( rule__FuncDefinition__BlkAssignment_6 ) ) )
            // InternalGoatComponentsParser.g:7535:1: ( ( rule__FuncDefinition__BlkAssignment_6 ) )
            {
            // InternalGoatComponentsParser.g:7535:1: ( ( rule__FuncDefinition__BlkAssignment_6 ) )
            // InternalGoatComponentsParser.g:7536:2: ( rule__FuncDefinition__BlkAssignment_6 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getBlkAssignment_6()); 
            // InternalGoatComponentsParser.g:7537:2: ( rule__FuncDefinition__BlkAssignment_6 )
            // InternalGoatComponentsParser.g:7537:3: rule__FuncDefinition__BlkAssignment_6
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
    // InternalGoatComponentsParser.g:7546:1: rule__FuncDefinition__Group_4__0 : rule__FuncDefinition__Group_4__0__Impl rule__FuncDefinition__Group_4__1 ;
    public final void rule__FuncDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7550:1: ( rule__FuncDefinition__Group_4__0__Impl rule__FuncDefinition__Group_4__1 )
            // InternalGoatComponentsParser.g:7551:2: rule__FuncDefinition__Group_4__0__Impl rule__FuncDefinition__Group_4__1
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
    // InternalGoatComponentsParser.g:7558:1: rule__FuncDefinition__Group_4__0__Impl : ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) ) ;
    public final void rule__FuncDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7562:1: ( ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) ) )
            // InternalGoatComponentsParser.g:7563:1: ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) )
            {
            // InternalGoatComponentsParser.g:7563:1: ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) )
            // InternalGoatComponentsParser.g:7564:2: ( rule__FuncDefinition__ParamsAssignment_4_0 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getParamsAssignment_4_0()); 
            // InternalGoatComponentsParser.g:7565:2: ( rule__FuncDefinition__ParamsAssignment_4_0 )
            // InternalGoatComponentsParser.g:7565:3: rule__FuncDefinition__ParamsAssignment_4_0
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
    // InternalGoatComponentsParser.g:7573:1: rule__FuncDefinition__Group_4__1 : rule__FuncDefinition__Group_4__1__Impl ;
    public final void rule__FuncDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7577:1: ( rule__FuncDefinition__Group_4__1__Impl )
            // InternalGoatComponentsParser.g:7578:2: rule__FuncDefinition__Group_4__1__Impl
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
    // InternalGoatComponentsParser.g:7584:1: rule__FuncDefinition__Group_4__1__Impl : ( ( rule__FuncDefinition__Group_4_1__0 )* ) ;
    public final void rule__FuncDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7588:1: ( ( ( rule__FuncDefinition__Group_4_1__0 )* ) )
            // InternalGoatComponentsParser.g:7589:1: ( ( rule__FuncDefinition__Group_4_1__0 )* )
            {
            // InternalGoatComponentsParser.g:7589:1: ( ( rule__FuncDefinition__Group_4_1__0 )* )
            // InternalGoatComponentsParser.g:7590:2: ( rule__FuncDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getFuncDefinitionAccess().getGroup_4_1()); 
            // InternalGoatComponentsParser.g:7591:2: ( rule__FuncDefinition__Group_4_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Comma) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:7591:3: rule__FuncDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__FuncDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalGoatComponentsParser.g:7600:1: rule__FuncDefinition__Group_4_1__0 : rule__FuncDefinition__Group_4_1__0__Impl rule__FuncDefinition__Group_4_1__1 ;
    public final void rule__FuncDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7604:1: ( rule__FuncDefinition__Group_4_1__0__Impl rule__FuncDefinition__Group_4_1__1 )
            // InternalGoatComponentsParser.g:7605:2: rule__FuncDefinition__Group_4_1__0__Impl rule__FuncDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalGoatComponentsParser.g:7612:1: rule__FuncDefinition__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__FuncDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7616:1: ( ( Comma ) )
            // InternalGoatComponentsParser.g:7617:1: ( Comma )
            {
            // InternalGoatComponentsParser.g:7617:1: ( Comma )
            // InternalGoatComponentsParser.g:7618:2: Comma
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
    // InternalGoatComponentsParser.g:7627:1: rule__FuncDefinition__Group_4_1__1 : rule__FuncDefinition__Group_4_1__1__Impl ;
    public final void rule__FuncDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7631:1: ( rule__FuncDefinition__Group_4_1__1__Impl )
            // InternalGoatComponentsParser.g:7632:2: rule__FuncDefinition__Group_4_1__1__Impl
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
    // InternalGoatComponentsParser.g:7638:1: rule__FuncDefinition__Group_4_1__1__Impl : ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) ) ;
    public final void rule__FuncDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7642:1: ( ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) ) )
            // InternalGoatComponentsParser.g:7643:1: ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) )
            {
            // InternalGoatComponentsParser.g:7643:1: ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) )
            // InternalGoatComponentsParser.g:7644:2: ( rule__FuncDefinition__ParamsAssignment_4_1_1 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getParamsAssignment_4_1_1()); 
            // InternalGoatComponentsParser.g:7645:2: ( rule__FuncDefinition__ParamsAssignment_4_1_1 )
            // InternalGoatComponentsParser.g:7645:3: rule__FuncDefinition__ParamsAssignment_4_1_1
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
    // InternalGoatComponentsParser.g:7654:1: rule__FuncBlock__Group__0 : rule__FuncBlock__Group__0__Impl rule__FuncBlock__Group__1 ;
    public final void rule__FuncBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7658:1: ( rule__FuncBlock__Group__0__Impl rule__FuncBlock__Group__1 )
            // InternalGoatComponentsParser.g:7659:2: rule__FuncBlock__Group__0__Impl rule__FuncBlock__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalGoatComponentsParser.g:7666:1: rule__FuncBlock__Group__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__FuncBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7670:1: ( ( LeftCurlyBracket ) )
            // InternalGoatComponentsParser.g:7671:1: ( LeftCurlyBracket )
            {
            // InternalGoatComponentsParser.g:7671:1: ( LeftCurlyBracket )
            // InternalGoatComponentsParser.g:7672:2: LeftCurlyBracket
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
    // InternalGoatComponentsParser.g:7681:1: rule__FuncBlock__Group__1 : rule__FuncBlock__Group__1__Impl rule__FuncBlock__Group__2 ;
    public final void rule__FuncBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7685:1: ( rule__FuncBlock__Group__1__Impl rule__FuncBlock__Group__2 )
            // InternalGoatComponentsParser.g:7686:2: rule__FuncBlock__Group__1__Impl rule__FuncBlock__Group__2
            {
            pushFollow(FOLLOW_57);
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
    // InternalGoatComponentsParser.g:7693:1: rule__FuncBlock__Group__1__Impl : ( () ) ;
    public final void rule__FuncBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7697:1: ( ( () ) )
            // InternalGoatComponentsParser.g:7698:1: ( () )
            {
            // InternalGoatComponentsParser.g:7698:1: ( () )
            // InternalGoatComponentsParser.g:7699:2: ()
            {
             before(grammarAccess.getFuncBlockAccess().getFuncBlockAction_1()); 
            // InternalGoatComponentsParser.g:7700:2: ()
            // InternalGoatComponentsParser.g:7700:3: 
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
    // InternalGoatComponentsParser.g:7708:1: rule__FuncBlock__Group__2 : rule__FuncBlock__Group__2__Impl rule__FuncBlock__Group__3 ;
    public final void rule__FuncBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7712:1: ( rule__FuncBlock__Group__2__Impl rule__FuncBlock__Group__3 )
            // InternalGoatComponentsParser.g:7713:2: rule__FuncBlock__Group__2__Impl rule__FuncBlock__Group__3
            {
            pushFollow(FOLLOW_57);
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
    // InternalGoatComponentsParser.g:7720:1: rule__FuncBlock__Group__2__Impl : ( ( rule__FuncBlock__StatementsAssignment_2 )* ) ;
    public final void rule__FuncBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7724:1: ( ( ( rule__FuncBlock__StatementsAssignment_2 )* ) )
            // InternalGoatComponentsParser.g:7725:1: ( ( rule__FuncBlock__StatementsAssignment_2 )* )
            {
            // InternalGoatComponentsParser.g:7725:1: ( ( rule__FuncBlock__StatementsAssignment_2 )* )
            // InternalGoatComponentsParser.g:7726:2: ( rule__FuncBlock__StatementsAssignment_2 )*
            {
             before(grammarAccess.getFuncBlockAccess().getStatementsAssignment_2()); 
            // InternalGoatComponentsParser.g:7727:2: ( rule__FuncBlock__StatementsAssignment_2 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Return||LA45_0==Var||LA45_0==If||LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:7727:3: rule__FuncBlock__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__FuncBlock__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalGoatComponentsParser.g:7735:1: rule__FuncBlock__Group__3 : rule__FuncBlock__Group__3__Impl ;
    public final void rule__FuncBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7739:1: ( rule__FuncBlock__Group__3__Impl )
            // InternalGoatComponentsParser.g:7740:2: rule__FuncBlock__Group__3__Impl
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
    // InternalGoatComponentsParser.g:7746:1: rule__FuncBlock__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__FuncBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7750:1: ( ( RightCurlyBracket ) )
            // InternalGoatComponentsParser.g:7751:1: ( RightCurlyBracket )
            {
            // InternalGoatComponentsParser.g:7751:1: ( RightCurlyBracket )
            // InternalGoatComponentsParser.g:7752:2: RightCurlyBracket
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
    // InternalGoatComponentsParser.g:7762:1: rule__FuncVarDeclaration__Group__0 : rule__FuncVarDeclaration__Group__0__Impl rule__FuncVarDeclaration__Group__1 ;
    public final void rule__FuncVarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7766:1: ( rule__FuncVarDeclaration__Group__0__Impl rule__FuncVarDeclaration__Group__1 )
            // InternalGoatComponentsParser.g:7767:2: rule__FuncVarDeclaration__Group__0__Impl rule__FuncVarDeclaration__Group__1
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
    // InternalGoatComponentsParser.g:7774:1: rule__FuncVarDeclaration__Group__0__Impl : ( Var ) ;
    public final void rule__FuncVarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7778:1: ( ( Var ) )
            // InternalGoatComponentsParser.g:7779:1: ( Var )
            {
            // InternalGoatComponentsParser.g:7779:1: ( Var )
            // InternalGoatComponentsParser.g:7780:2: Var
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
    // InternalGoatComponentsParser.g:7789:1: rule__FuncVarDeclaration__Group__1 : rule__FuncVarDeclaration__Group__1__Impl rule__FuncVarDeclaration__Group__2 ;
    public final void rule__FuncVarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7793:1: ( rule__FuncVarDeclaration__Group__1__Impl rule__FuncVarDeclaration__Group__2 )
            // InternalGoatComponentsParser.g:7794:2: rule__FuncVarDeclaration__Group__1__Impl rule__FuncVarDeclaration__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalGoatComponentsParser.g:7801:1: rule__FuncVarDeclaration__Group__1__Impl : ( ( rule__FuncVarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__FuncVarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7805:1: ( ( ( rule__FuncVarDeclaration__NameAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:7806:1: ( ( rule__FuncVarDeclaration__NameAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:7806:1: ( ( rule__FuncVarDeclaration__NameAssignment_1 ) )
            // InternalGoatComponentsParser.g:7807:2: ( rule__FuncVarDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getNameAssignment_1()); 
            // InternalGoatComponentsParser.g:7808:2: ( rule__FuncVarDeclaration__NameAssignment_1 )
            // InternalGoatComponentsParser.g:7808:3: rule__FuncVarDeclaration__NameAssignment_1
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
    // InternalGoatComponentsParser.g:7816:1: rule__FuncVarDeclaration__Group__2 : rule__FuncVarDeclaration__Group__2__Impl rule__FuncVarDeclaration__Group__3 ;
    public final void rule__FuncVarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7820:1: ( rule__FuncVarDeclaration__Group__2__Impl rule__FuncVarDeclaration__Group__3 )
            // InternalGoatComponentsParser.g:7821:2: rule__FuncVarDeclaration__Group__2__Impl rule__FuncVarDeclaration__Group__3
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
    // InternalGoatComponentsParser.g:7828:1: rule__FuncVarDeclaration__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__FuncVarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7832:1: ( ( EqualsSign ) )
            // InternalGoatComponentsParser.g:7833:1: ( EqualsSign )
            {
            // InternalGoatComponentsParser.g:7833:1: ( EqualsSign )
            // InternalGoatComponentsParser.g:7834:2: EqualsSign
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
    // InternalGoatComponentsParser.g:7843:1: rule__FuncVarDeclaration__Group__3 : rule__FuncVarDeclaration__Group__3__Impl ;
    public final void rule__FuncVarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7847:1: ( rule__FuncVarDeclaration__Group__3__Impl )
            // InternalGoatComponentsParser.g:7848:2: rule__FuncVarDeclaration__Group__3__Impl
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
    // InternalGoatComponentsParser.g:7854:1: rule__FuncVarDeclaration__Group__3__Impl : ( ( rule__FuncVarDeclaration__ValAssignment_3 ) ) ;
    public final void rule__FuncVarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7858:1: ( ( ( rule__FuncVarDeclaration__ValAssignment_3 ) ) )
            // InternalGoatComponentsParser.g:7859:1: ( ( rule__FuncVarDeclaration__ValAssignment_3 ) )
            {
            // InternalGoatComponentsParser.g:7859:1: ( ( rule__FuncVarDeclaration__ValAssignment_3 ) )
            // InternalGoatComponentsParser.g:7860:2: ( rule__FuncVarDeclaration__ValAssignment_3 )
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getValAssignment_3()); 
            // InternalGoatComponentsParser.g:7861:2: ( rule__FuncVarDeclaration__ValAssignment_3 )
            // InternalGoatComponentsParser.g:7861:3: rule__FuncVarDeclaration__ValAssignment_3
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
    // InternalGoatComponentsParser.g:7870:1: rule__FuncVarAssign__Group__0 : rule__FuncVarAssign__Group__0__Impl rule__FuncVarAssign__Group__1 ;
    public final void rule__FuncVarAssign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7874:1: ( rule__FuncVarAssign__Group__0__Impl rule__FuncVarAssign__Group__1 )
            // InternalGoatComponentsParser.g:7875:2: rule__FuncVarAssign__Group__0__Impl rule__FuncVarAssign__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalGoatComponentsParser.g:7882:1: rule__FuncVarAssign__Group__0__Impl : ( ( rule__FuncVarAssign__VarAssignment_0 ) ) ;
    public final void rule__FuncVarAssign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7886:1: ( ( ( rule__FuncVarAssign__VarAssignment_0 ) ) )
            // InternalGoatComponentsParser.g:7887:1: ( ( rule__FuncVarAssign__VarAssignment_0 ) )
            {
            // InternalGoatComponentsParser.g:7887:1: ( ( rule__FuncVarAssign__VarAssignment_0 ) )
            // InternalGoatComponentsParser.g:7888:2: ( rule__FuncVarAssign__VarAssignment_0 )
            {
             before(grammarAccess.getFuncVarAssignAccess().getVarAssignment_0()); 
            // InternalGoatComponentsParser.g:7889:2: ( rule__FuncVarAssign__VarAssignment_0 )
            // InternalGoatComponentsParser.g:7889:3: rule__FuncVarAssign__VarAssignment_0
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
    // InternalGoatComponentsParser.g:7897:1: rule__FuncVarAssign__Group__1 : rule__FuncVarAssign__Group__1__Impl rule__FuncVarAssign__Group__2 ;
    public final void rule__FuncVarAssign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7901:1: ( rule__FuncVarAssign__Group__1__Impl rule__FuncVarAssign__Group__2 )
            // InternalGoatComponentsParser.g:7902:2: rule__FuncVarAssign__Group__1__Impl rule__FuncVarAssign__Group__2
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
    // InternalGoatComponentsParser.g:7909:1: rule__FuncVarAssign__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__FuncVarAssign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7913:1: ( ( EqualsSign ) )
            // InternalGoatComponentsParser.g:7914:1: ( EqualsSign )
            {
            // InternalGoatComponentsParser.g:7914:1: ( EqualsSign )
            // InternalGoatComponentsParser.g:7915:2: EqualsSign
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
    // InternalGoatComponentsParser.g:7924:1: rule__FuncVarAssign__Group__2 : rule__FuncVarAssign__Group__2__Impl ;
    public final void rule__FuncVarAssign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7928:1: ( rule__FuncVarAssign__Group__2__Impl )
            // InternalGoatComponentsParser.g:7929:2: rule__FuncVarAssign__Group__2__Impl
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
    // InternalGoatComponentsParser.g:7935:1: rule__FuncVarAssign__Group__2__Impl : ( ( rule__FuncVarAssign__ValAssignment_2 ) ) ;
    public final void rule__FuncVarAssign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7939:1: ( ( ( rule__FuncVarAssign__ValAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:7940:1: ( ( rule__FuncVarAssign__ValAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:7940:1: ( ( rule__FuncVarAssign__ValAssignment_2 ) )
            // InternalGoatComponentsParser.g:7941:2: ( rule__FuncVarAssign__ValAssignment_2 )
            {
             before(grammarAccess.getFuncVarAssignAccess().getValAssignment_2()); 
            // InternalGoatComponentsParser.g:7942:2: ( rule__FuncVarAssign__ValAssignment_2 )
            // InternalGoatComponentsParser.g:7942:3: rule__FuncVarAssign__ValAssignment_2
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
    // InternalGoatComponentsParser.g:7951:1: rule__FuncIfElse__Group__0 : rule__FuncIfElse__Group__0__Impl rule__FuncIfElse__Group__1 ;
    public final void rule__FuncIfElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7955:1: ( rule__FuncIfElse__Group__0__Impl rule__FuncIfElse__Group__1 )
            // InternalGoatComponentsParser.g:7956:2: rule__FuncIfElse__Group__0__Impl rule__FuncIfElse__Group__1
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
    // InternalGoatComponentsParser.g:7963:1: rule__FuncIfElse__Group__0__Impl : ( If ) ;
    public final void rule__FuncIfElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7967:1: ( ( If ) )
            // InternalGoatComponentsParser.g:7968:1: ( If )
            {
            // InternalGoatComponentsParser.g:7968:1: ( If )
            // InternalGoatComponentsParser.g:7969:2: If
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
    // InternalGoatComponentsParser.g:7978:1: rule__FuncIfElse__Group__1 : rule__FuncIfElse__Group__1__Impl rule__FuncIfElse__Group__2 ;
    public final void rule__FuncIfElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7982:1: ( rule__FuncIfElse__Group__1__Impl rule__FuncIfElse__Group__2 )
            // InternalGoatComponentsParser.g:7983:2: rule__FuncIfElse__Group__1__Impl rule__FuncIfElse__Group__2
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
    // InternalGoatComponentsParser.g:7990:1: rule__FuncIfElse__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FuncIfElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:7994:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:7995:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:7995:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:7996:2: LeftParenthesis
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
    // InternalGoatComponentsParser.g:8005:1: rule__FuncIfElse__Group__2 : rule__FuncIfElse__Group__2__Impl rule__FuncIfElse__Group__3 ;
    public final void rule__FuncIfElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8009:1: ( rule__FuncIfElse__Group__2__Impl rule__FuncIfElse__Group__3 )
            // InternalGoatComponentsParser.g:8010:2: rule__FuncIfElse__Group__2__Impl rule__FuncIfElse__Group__3
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
    // InternalGoatComponentsParser.g:8017:1: rule__FuncIfElse__Group__2__Impl : ( ( rule__FuncIfElse__TestAssignment_2 ) ) ;
    public final void rule__FuncIfElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8021:1: ( ( ( rule__FuncIfElse__TestAssignment_2 ) ) )
            // InternalGoatComponentsParser.g:8022:1: ( ( rule__FuncIfElse__TestAssignment_2 ) )
            {
            // InternalGoatComponentsParser.g:8022:1: ( ( rule__FuncIfElse__TestAssignment_2 ) )
            // InternalGoatComponentsParser.g:8023:2: ( rule__FuncIfElse__TestAssignment_2 )
            {
             before(grammarAccess.getFuncIfElseAccess().getTestAssignment_2()); 
            // InternalGoatComponentsParser.g:8024:2: ( rule__FuncIfElse__TestAssignment_2 )
            // InternalGoatComponentsParser.g:8024:3: rule__FuncIfElse__TestAssignment_2
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
    // InternalGoatComponentsParser.g:8032:1: rule__FuncIfElse__Group__3 : rule__FuncIfElse__Group__3__Impl rule__FuncIfElse__Group__4 ;
    public final void rule__FuncIfElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8036:1: ( rule__FuncIfElse__Group__3__Impl rule__FuncIfElse__Group__4 )
            // InternalGoatComponentsParser.g:8037:2: rule__FuncIfElse__Group__3__Impl rule__FuncIfElse__Group__4
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
    // InternalGoatComponentsParser.g:8044:1: rule__FuncIfElse__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FuncIfElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8048:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:8049:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:8049:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:8050:2: RightParenthesis
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
    // InternalGoatComponentsParser.g:8059:1: rule__FuncIfElse__Group__4 : rule__FuncIfElse__Group__4__Impl rule__FuncIfElse__Group__5 ;
    public final void rule__FuncIfElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8063:1: ( rule__FuncIfElse__Group__4__Impl rule__FuncIfElse__Group__5 )
            // InternalGoatComponentsParser.g:8064:2: rule__FuncIfElse__Group__4__Impl rule__FuncIfElse__Group__5
            {
            pushFollow(FOLLOW_59);
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
    // InternalGoatComponentsParser.g:8071:1: rule__FuncIfElse__Group__4__Impl : ( ( rule__FuncIfElse__ThenAssignment_4 ) ) ;
    public final void rule__FuncIfElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8075:1: ( ( ( rule__FuncIfElse__ThenAssignment_4 ) ) )
            // InternalGoatComponentsParser.g:8076:1: ( ( rule__FuncIfElse__ThenAssignment_4 ) )
            {
            // InternalGoatComponentsParser.g:8076:1: ( ( rule__FuncIfElse__ThenAssignment_4 ) )
            // InternalGoatComponentsParser.g:8077:2: ( rule__FuncIfElse__ThenAssignment_4 )
            {
             before(grammarAccess.getFuncIfElseAccess().getThenAssignment_4()); 
            // InternalGoatComponentsParser.g:8078:2: ( rule__FuncIfElse__ThenAssignment_4 )
            // InternalGoatComponentsParser.g:8078:3: rule__FuncIfElse__ThenAssignment_4
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
    // InternalGoatComponentsParser.g:8086:1: rule__FuncIfElse__Group__5 : rule__FuncIfElse__Group__5__Impl rule__FuncIfElse__Group__6 ;
    public final void rule__FuncIfElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8090:1: ( rule__FuncIfElse__Group__5__Impl rule__FuncIfElse__Group__6 )
            // InternalGoatComponentsParser.g:8091:2: rule__FuncIfElse__Group__5__Impl rule__FuncIfElse__Group__6
            {
            pushFollow(FOLLOW_59);
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
    // InternalGoatComponentsParser.g:8098:1: rule__FuncIfElse__Group__5__Impl : ( ( rule__FuncIfElse__Group_5__0 )* ) ;
    public final void rule__FuncIfElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8102:1: ( ( ( rule__FuncIfElse__Group_5__0 )* ) )
            // InternalGoatComponentsParser.g:8103:1: ( ( rule__FuncIfElse__Group_5__0 )* )
            {
            // InternalGoatComponentsParser.g:8103:1: ( ( rule__FuncIfElse__Group_5__0 )* )
            // InternalGoatComponentsParser.g:8104:2: ( rule__FuncIfElse__Group_5__0 )*
            {
             before(grammarAccess.getFuncIfElseAccess().getGroup_5()); 
            // InternalGoatComponentsParser.g:8105:2: ( rule__FuncIfElse__Group_5__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==Elif) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGoatComponentsParser.g:8105:3: rule__FuncIfElse__Group_5__0
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__FuncIfElse__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalGoatComponentsParser.g:8113:1: rule__FuncIfElse__Group__6 : rule__FuncIfElse__Group__6__Impl ;
    public final void rule__FuncIfElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8117:1: ( rule__FuncIfElse__Group__6__Impl )
            // InternalGoatComponentsParser.g:8118:2: rule__FuncIfElse__Group__6__Impl
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
    // InternalGoatComponentsParser.g:8124:1: rule__FuncIfElse__Group__6__Impl : ( ( rule__FuncIfElse__Group_6__0 )? ) ;
    public final void rule__FuncIfElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8128:1: ( ( ( rule__FuncIfElse__Group_6__0 )? ) )
            // InternalGoatComponentsParser.g:8129:1: ( ( rule__FuncIfElse__Group_6__0 )? )
            {
            // InternalGoatComponentsParser.g:8129:1: ( ( rule__FuncIfElse__Group_6__0 )? )
            // InternalGoatComponentsParser.g:8130:2: ( rule__FuncIfElse__Group_6__0 )?
            {
             before(grammarAccess.getFuncIfElseAccess().getGroup_6()); 
            // InternalGoatComponentsParser.g:8131:2: ( rule__FuncIfElse__Group_6__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Else) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGoatComponentsParser.g:8131:3: rule__FuncIfElse__Group_6__0
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
    // InternalGoatComponentsParser.g:8140:1: rule__FuncIfElse__Group_5__0 : rule__FuncIfElse__Group_5__0__Impl rule__FuncIfElse__Group_5__1 ;
    public final void rule__FuncIfElse__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8144:1: ( rule__FuncIfElse__Group_5__0__Impl rule__FuncIfElse__Group_5__1 )
            // InternalGoatComponentsParser.g:8145:2: rule__FuncIfElse__Group_5__0__Impl rule__FuncIfElse__Group_5__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalGoatComponentsParser.g:8152:1: rule__FuncIfElse__Group_5__0__Impl : ( Elif ) ;
    public final void rule__FuncIfElse__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8156:1: ( ( Elif ) )
            // InternalGoatComponentsParser.g:8157:1: ( Elif )
            {
            // InternalGoatComponentsParser.g:8157:1: ( Elif )
            // InternalGoatComponentsParser.g:8158:2: Elif
            {
             before(grammarAccess.getFuncIfElseAccess().getElifKeyword_5_0()); 
            match(input,Elif,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getElifKeyword_5_0()); 

            }


            }

        }
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
    // InternalGoatComponentsParser.g:8167:1: rule__FuncIfElse__Group_5__1 : rule__FuncIfElse__Group_5__1__Impl rule__FuncIfElse__Group_5__2 ;
    public final void rule__FuncIfElse__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8171:1: ( rule__FuncIfElse__Group_5__1__Impl rule__FuncIfElse__Group_5__2 )
            // InternalGoatComponentsParser.g:8172:2: rule__FuncIfElse__Group_5__1__Impl rule__FuncIfElse__Group_5__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponentsParser.g:8179:1: rule__FuncIfElse__Group_5__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FuncIfElse__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8183:1: ( ( LeftParenthesis ) )
            // InternalGoatComponentsParser.g:8184:1: ( LeftParenthesis )
            {
            // InternalGoatComponentsParser.g:8184:1: ( LeftParenthesis )
            // InternalGoatComponentsParser.g:8185:2: LeftParenthesis
            {
             before(grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
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
    // InternalGoatComponentsParser.g:8194:1: rule__FuncIfElse__Group_5__2 : rule__FuncIfElse__Group_5__2__Impl rule__FuncIfElse__Group_5__3 ;
    public final void rule__FuncIfElse__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8198:1: ( rule__FuncIfElse__Group_5__2__Impl rule__FuncIfElse__Group_5__3 )
            // InternalGoatComponentsParser.g:8199:2: rule__FuncIfElse__Group_5__2__Impl rule__FuncIfElse__Group_5__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponentsParser.g:8206:1: rule__FuncIfElse__Group_5__2__Impl : ( ( rule__FuncIfElse__TestAssignment_5_2 ) ) ;
    public final void rule__FuncIfElse__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8210:1: ( ( ( rule__FuncIfElse__TestAssignment_5_2 ) ) )
            // InternalGoatComponentsParser.g:8211:1: ( ( rule__FuncIfElse__TestAssignment_5_2 ) )
            {
            // InternalGoatComponentsParser.g:8211:1: ( ( rule__FuncIfElse__TestAssignment_5_2 ) )
            // InternalGoatComponentsParser.g:8212:2: ( rule__FuncIfElse__TestAssignment_5_2 )
            {
             before(grammarAccess.getFuncIfElseAccess().getTestAssignment_5_2()); 
            // InternalGoatComponentsParser.g:8213:2: ( rule__FuncIfElse__TestAssignment_5_2 )
            // InternalGoatComponentsParser.g:8213:3: rule__FuncIfElse__TestAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__TestAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFuncIfElseAccess().getTestAssignment_5_2()); 

            }


            }

        }
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
    // InternalGoatComponentsParser.g:8221:1: rule__FuncIfElse__Group_5__3 : rule__FuncIfElse__Group_5__3__Impl rule__FuncIfElse__Group_5__4 ;
    public final void rule__FuncIfElse__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8225:1: ( rule__FuncIfElse__Group_5__3__Impl rule__FuncIfElse__Group_5__4 )
            // InternalGoatComponentsParser.g:8226:2: rule__FuncIfElse__Group_5__3__Impl rule__FuncIfElse__Group_5__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponentsParser.g:8233:1: rule__FuncIfElse__Group_5__3__Impl : ( RightParenthesis ) ;
    public final void rule__FuncIfElse__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8237:1: ( ( RightParenthesis ) )
            // InternalGoatComponentsParser.g:8238:1: ( RightParenthesis )
            {
            // InternalGoatComponentsParser.g:8238:1: ( RightParenthesis )
            // InternalGoatComponentsParser.g:8239:2: RightParenthesis
            {
             before(grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_5_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_5_3()); 

            }


            }

        }
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
    // InternalGoatComponentsParser.g:8248:1: rule__FuncIfElse__Group_5__4 : rule__FuncIfElse__Group_5__4__Impl ;
    public final void rule__FuncIfElse__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8252:1: ( rule__FuncIfElse__Group_5__4__Impl )
            // InternalGoatComponentsParser.g:8253:2: rule__FuncIfElse__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__Group_5__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalGoatComponentsParser.g:8259:1: rule__FuncIfElse__Group_5__4__Impl : ( ( rule__FuncIfElse__ThenAssignment_5_4 ) ) ;
    public final void rule__FuncIfElse__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8263:1: ( ( ( rule__FuncIfElse__ThenAssignment_5_4 ) ) )
            // InternalGoatComponentsParser.g:8264:1: ( ( rule__FuncIfElse__ThenAssignment_5_4 ) )
            {
            // InternalGoatComponentsParser.g:8264:1: ( ( rule__FuncIfElse__ThenAssignment_5_4 ) )
            // InternalGoatComponentsParser.g:8265:2: ( rule__FuncIfElse__ThenAssignment_5_4 )
            {
             before(grammarAccess.getFuncIfElseAccess().getThenAssignment_5_4()); 
            // InternalGoatComponentsParser.g:8266:2: ( rule__FuncIfElse__ThenAssignment_5_4 )
            // InternalGoatComponentsParser.g:8266:3: rule__FuncIfElse__ThenAssignment_5_4
            {
            pushFollow(FOLLOW_2);
            rule__FuncIfElse__ThenAssignment_5_4();

            state._fsp--;


            }

             after(grammarAccess.getFuncIfElseAccess().getThenAssignment_5_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__FuncIfElse__Group_6__0"
    // InternalGoatComponentsParser.g:8275:1: rule__FuncIfElse__Group_6__0 : rule__FuncIfElse__Group_6__0__Impl rule__FuncIfElse__Group_6__1 ;
    public final void rule__FuncIfElse__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8279:1: ( rule__FuncIfElse__Group_6__0__Impl rule__FuncIfElse__Group_6__1 )
            // InternalGoatComponentsParser.g:8280:2: rule__FuncIfElse__Group_6__0__Impl rule__FuncIfElse__Group_6__1
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
    // InternalGoatComponentsParser.g:8287:1: rule__FuncIfElse__Group_6__0__Impl : ( Else ) ;
    public final void rule__FuncIfElse__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8291:1: ( ( Else ) )
            // InternalGoatComponentsParser.g:8292:1: ( Else )
            {
            // InternalGoatComponentsParser.g:8292:1: ( Else )
            // InternalGoatComponentsParser.g:8293:2: Else
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
    // InternalGoatComponentsParser.g:8302:1: rule__FuncIfElse__Group_6__1 : rule__FuncIfElse__Group_6__1__Impl ;
    public final void rule__FuncIfElse__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8306:1: ( rule__FuncIfElse__Group_6__1__Impl )
            // InternalGoatComponentsParser.g:8307:2: rule__FuncIfElse__Group_6__1__Impl
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
    // InternalGoatComponentsParser.g:8313:1: rule__FuncIfElse__Group_6__1__Impl : ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) ) ;
    public final void rule__FuncIfElse__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8317:1: ( ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) ) )
            // InternalGoatComponentsParser.g:8318:1: ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) )
            {
            // InternalGoatComponentsParser.g:8318:1: ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) )
            // InternalGoatComponentsParser.g:8319:2: ( rule__FuncIfElse__ElseBranchAssignment_6_1 )
            {
             before(grammarAccess.getFuncIfElseAccess().getElseBranchAssignment_6_1()); 
            // InternalGoatComponentsParser.g:8320:2: ( rule__FuncIfElse__ElseBranchAssignment_6_1 )
            // InternalGoatComponentsParser.g:8320:3: rule__FuncIfElse__ElseBranchAssignment_6_1
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
    // InternalGoatComponentsParser.g:8329:1: rule__FuncReturn__Group__0 : rule__FuncReturn__Group__0__Impl rule__FuncReturn__Group__1 ;
    public final void rule__FuncReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8333:1: ( rule__FuncReturn__Group__0__Impl rule__FuncReturn__Group__1 )
            // InternalGoatComponentsParser.g:8334:2: rule__FuncReturn__Group__0__Impl rule__FuncReturn__Group__1
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
    // InternalGoatComponentsParser.g:8341:1: rule__FuncReturn__Group__0__Impl : ( Return ) ;
    public final void rule__FuncReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8345:1: ( ( Return ) )
            // InternalGoatComponentsParser.g:8346:1: ( Return )
            {
            // InternalGoatComponentsParser.g:8346:1: ( Return )
            // InternalGoatComponentsParser.g:8347:2: Return
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
    // InternalGoatComponentsParser.g:8356:1: rule__FuncReturn__Group__1 : rule__FuncReturn__Group__1__Impl ;
    public final void rule__FuncReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8360:1: ( rule__FuncReturn__Group__1__Impl )
            // InternalGoatComponentsParser.g:8361:2: rule__FuncReturn__Group__1__Impl
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
    // InternalGoatComponentsParser.g:8367:1: rule__FuncReturn__Group__1__Impl : ( ( rule__FuncReturn__ValAssignment_1 ) ) ;
    public final void rule__FuncReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8371:1: ( ( ( rule__FuncReturn__ValAssignment_1 ) ) )
            // InternalGoatComponentsParser.g:8372:1: ( ( rule__FuncReturn__ValAssignment_1 ) )
            {
            // InternalGoatComponentsParser.g:8372:1: ( ( rule__FuncReturn__ValAssignment_1 ) )
            // InternalGoatComponentsParser.g:8373:2: ( rule__FuncReturn__ValAssignment_1 )
            {
             before(grammarAccess.getFuncReturnAccess().getValAssignment_1()); 
            // InternalGoatComponentsParser.g:8374:2: ( rule__FuncReturn__ValAssignment_1 )
            // InternalGoatComponentsParser.g:8374:3: rule__FuncReturn__ValAssignment_1
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
    // InternalGoatComponentsParser.g:8383:1: rule__Model__ProcessesAssignment_1_0 : ( ruleProcessDefinition ) ;
    public final void rule__Model__ProcessesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8387:1: ( ( ruleProcessDefinition ) )
            // InternalGoatComponentsParser.g:8388:2: ( ruleProcessDefinition )
            {
            // InternalGoatComponentsParser.g:8388:2: ( ruleProcessDefinition )
            // InternalGoatComponentsParser.g:8389:3: ruleProcessDefinition
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
    // InternalGoatComponentsParser.g:8398:1: rule__Model__ComponentsAssignment_1_1 : ( ruleComponentDefinition ) ;
    public final void rule__Model__ComponentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8402:1: ( ( ruleComponentDefinition ) )
            // InternalGoatComponentsParser.g:8403:2: ( ruleComponentDefinition )
            {
            // InternalGoatComponentsParser.g:8403:2: ( ruleComponentDefinition )
            // InternalGoatComponentsParser.g:8404:3: ruleComponentDefinition
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
    // InternalGoatComponentsParser.g:8413:1: rule__Model__FunctionsAssignment_1_2 : ( ruleFuncDefinition ) ;
    public final void rule__Model__FunctionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8417:1: ( ( ruleFuncDefinition ) )
            // InternalGoatComponentsParser.g:8418:2: ( ruleFuncDefinition )
            {
            // InternalGoatComponentsParser.g:8418:2: ( ruleFuncDefinition )
            // InternalGoatComponentsParser.g:8419:3: ruleFuncDefinition
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
    // InternalGoatComponentsParser.g:8428:1: rule__InterleavingProcess__SubProcsAssignment_2_1 : ( ruleCallProcess ) ;
    public final void rule__InterleavingProcess__SubProcsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8432:1: ( ( ruleCallProcess ) )
            // InternalGoatComponentsParser.g:8433:2: ( ruleCallProcess )
            {
            // InternalGoatComponentsParser.g:8433:2: ( ruleCallProcess )
            // InternalGoatComponentsParser.g:8434:3: ruleCallProcess
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
    // InternalGoatComponentsParser.g:8443:1: rule__Preconditions__PrecondAssignment_1 : ( ( rule__Preconditions__PrecondAlternatives_1_0 ) ) ;
    public final void rule__Preconditions__PrecondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8447:1: ( ( ( rule__Preconditions__PrecondAlternatives_1_0 ) ) )
            // InternalGoatComponentsParser.g:8448:2: ( ( rule__Preconditions__PrecondAlternatives_1_0 ) )
            {
            // InternalGoatComponentsParser.g:8448:2: ( ( rule__Preconditions__PrecondAlternatives_1_0 ) )
            // InternalGoatComponentsParser.g:8449:3: ( rule__Preconditions__PrecondAlternatives_1_0 )
            {
             before(grammarAccess.getPreconditionsAccess().getPrecondAlternatives_1_0()); 
            // InternalGoatComponentsParser.g:8450:3: ( rule__Preconditions__PrecondAlternatives_1_0 )
            // InternalGoatComponentsParser.g:8450:4: rule__Preconditions__PrecondAlternatives_1_0
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
    // InternalGoatComponentsParser.g:8458:1: rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 : ( ruleInputProcess ) ;
    public final void rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8462:1: ( ( ruleInputProcess ) )
            // InternalGoatComponentsParser.g:8463:2: ( ruleInputProcess )
            {
            // InternalGoatComponentsParser.g:8463:2: ( ruleInputProcess )
            // InternalGoatComponentsParser.g:8464:3: ruleInputProcess
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
    // InternalGoatComponentsParser.g:8473:1: rule__InputProcessesPart__InputsAssignment_0 : ( ruleInputProcess ) ;
    public final void rule__InputProcessesPart__InputsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8477:1: ( ( ruleInputProcess ) )
            // InternalGoatComponentsParser.g:8478:2: ( ruleInputProcess )
            {
            // InternalGoatComponentsParser.g:8478:2: ( ruleInputProcess )
            // InternalGoatComponentsParser.g:8479:3: ruleInputProcess
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
    // InternalGoatComponentsParser.g:8488:1: rule__InputProcessesPart__PrecondsAssignment_1_1 : ( rulePreconditions ) ;
    public final void rule__InputProcessesPart__PrecondsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8492:1: ( ( rulePreconditions ) )
            // InternalGoatComponentsParser.g:8493:2: ( rulePreconditions )
            {
            // InternalGoatComponentsParser.g:8493:2: ( rulePreconditions )
            // InternalGoatComponentsParser.g:8494:3: rulePreconditions
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
    // InternalGoatComponentsParser.g:8503:1: rule__InputProcessesPart__InputsAssignment_1_2 : ( ruleInputProcess ) ;
    public final void rule__InputProcessesPart__InputsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8507:1: ( ( ruleInputProcess ) )
            // InternalGoatComponentsParser.g:8508:2: ( ruleInputProcess )
            {
            // InternalGoatComponentsParser.g:8508:2: ( ruleInputProcess )
            // InternalGoatComponentsParser.g:8509:3: ruleInputProcess
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
    // InternalGoatComponentsParser.g:8518:1: rule__InputProcess__Rec_predAssignment_3 : ( ruleExpression ) ;
    public final void rule__InputProcess__Rec_predAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8522:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8523:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8523:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8524:3: ruleExpression
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
    // InternalGoatComponentsParser.g:8533:1: rule__InputProcess__MsgInPartsAssignment_6_0 : ( ruleAttributeToSet ) ;
    public final void rule__InputProcess__MsgInPartsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8537:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponentsParser.g:8538:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponentsParser.g:8538:2: ( ruleAttributeToSet )
            // InternalGoatComponentsParser.g:8539:3: ruleAttributeToSet
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
    // InternalGoatComponentsParser.g:8548:1: rule__InputProcess__MsgInPartsAssignment_6_1_1 : ( ruleAttributeToSet ) ;
    public final void rule__InputProcess__MsgInPartsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8552:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponentsParser.g:8553:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponentsParser.g:8553:2: ( ruleAttributeToSet )
            // InternalGoatComponentsParser.g:8554:3: ruleAttributeToSet
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


    // $ANTLR start "rule__InputProcess__OutputAssignment_8_2"
    // InternalGoatComponentsParser.g:8563:1: rule__InputProcess__OutputAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__InputProcess__OutputAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8567:1: ( ( RULE_STRING ) )
            // InternalGoatComponentsParser.g:8568:2: ( RULE_STRING )
            {
            // InternalGoatComponentsParser.g:8568:2: ( RULE_STRING )
            // InternalGoatComponentsParser.g:8569:3: RULE_STRING
            {
             before(grammarAccess.getInputProcessAccess().getOutputSTRINGTerminalRuleCall_8_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputProcessAccess().getOutputSTRINGTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputProcess__OutputAssignment_8_2"


    // $ANTLR start "rule__InputProcess__NextAssignment_10"
    // InternalGoatComponentsParser.g:8578:1: rule__InputProcess__NextAssignment_10 : ( ruleNZCProcess ) ;
    public final void rule__InputProcess__NextAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8582:1: ( ( ruleNZCProcess ) )
            // InternalGoatComponentsParser.g:8583:2: ( ruleNZCProcess )
            {
            // InternalGoatComponentsParser.g:8583:2: ( ruleNZCProcess )
            // InternalGoatComponentsParser.g:8584:3: ruleNZCProcess
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
    // InternalGoatComponentsParser.g:8593:1: rule__OutputProcessPart__MsgOutPartsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__OutputProcessPart__MsgOutPartsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8597:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8598:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8598:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8599:3: ruleExpression
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
    // InternalGoatComponentsParser.g:8608:1: rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8612:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8613:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8613:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8614:3: ruleExpression
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
    // InternalGoatComponentsParser.g:8623:1: rule__OutputProcessPart__Send_predAssignment_6 : ( ruleExpression ) ;
    public final void rule__OutputProcessPart__Send_predAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8627:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8628:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8628:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8629:3: ruleExpression
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


    // $ANTLR start "rule__OutputProcessPart__OutputAssignment_8_2"
    // InternalGoatComponentsParser.g:8638:1: rule__OutputProcessPart__OutputAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__OutputProcessPart__OutputAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8642:1: ( ( RULE_STRING ) )
            // InternalGoatComponentsParser.g:8643:2: ( RULE_STRING )
            {
            // InternalGoatComponentsParser.g:8643:2: ( RULE_STRING )
            // InternalGoatComponentsParser.g:8644:3: RULE_STRING
            {
             before(grammarAccess.getOutputProcessPartAccess().getOutputSTRINGTerminalRuleCall_8_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputProcessPartAccess().getOutputSTRINGTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputProcessPart__OutputAssignment_8_2"


    // $ANTLR start "rule__OutputProcessPart__MsecAssignment_9_2"
    // InternalGoatComponentsParser.g:8653:1: rule__OutputProcessPart__MsecAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__OutputProcessPart__MsecAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8657:1: ( ( RULE_INT ) )
            // InternalGoatComponentsParser.g:8658:2: ( RULE_INT )
            {
            // InternalGoatComponentsParser.g:8658:2: ( RULE_INT )
            // InternalGoatComponentsParser.g:8659:3: RULE_INT
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
    // InternalGoatComponentsParser.g:8668:1: rule__OutputProcessPart__NextAssignment_11 : ( ruleProc ) ;
    public final void rule__OutputProcessPart__NextAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8672:1: ( ( ruleProc ) )
            // InternalGoatComponentsParser.g:8673:2: ( ruleProc )
            {
            // InternalGoatComponentsParser.g:8673:2: ( ruleProc )
            // InternalGoatComponentsParser.g:8674:3: ruleProc
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


    // $ANTLR start "rule__IfProcesses__BranchesAssignment_1"
    // InternalGoatComponentsParser.g:8683:1: rule__IfProcesses__BranchesAssignment_1 : ( ruleIfBranchProcess ) ;
    public final void rule__IfProcesses__BranchesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8687:1: ( ( ruleIfBranchProcess ) )
            // InternalGoatComponentsParser.g:8688:2: ( ruleIfBranchProcess )
            {
            // InternalGoatComponentsParser.g:8688:2: ( ruleIfBranchProcess )
            // InternalGoatComponentsParser.g:8689:3: ruleIfBranchProcess
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
    // InternalGoatComponentsParser.g:8698:1: rule__IfProcesses__BranchesAssignment_2_1 : ( ruleIfBranchProcess ) ;
    public final void rule__IfProcesses__BranchesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8702:1: ( ( ruleIfBranchProcess ) )
            // InternalGoatComponentsParser.g:8703:2: ( ruleIfBranchProcess )
            {
            // InternalGoatComponentsParser.g:8703:2: ( ruleIfBranchProcess )
            // InternalGoatComponentsParser.g:8704:3: ruleIfBranchProcess
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


    // $ANTLR start "rule__IfBranchProcess__CondAssignment_2"
    // InternalGoatComponentsParser.g:8713:1: rule__IfBranchProcess__CondAssignment_2 : ( rulePreconditions ) ;
    public final void rule__IfBranchProcess__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8717:1: ( ( rulePreconditions ) )
            // InternalGoatComponentsParser.g:8718:2: ( rulePreconditions )
            {
            // InternalGoatComponentsParser.g:8718:2: ( rulePreconditions )
            // InternalGoatComponentsParser.g:8719:3: rulePreconditions
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
    // InternalGoatComponentsParser.g:8728:1: rule__IfBranchProcess__ThenAssignment_4 : ( rulePredOutputProcessOrInputProcess ) ;
    public final void rule__IfBranchProcess__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8732:1: ( ( rulePredOutputProcessOrInputProcess ) )
            // InternalGoatComponentsParser.g:8733:2: ( rulePredOutputProcessOrInputProcess )
            {
            // InternalGoatComponentsParser.g:8733:2: ( rulePredOutputProcessOrInputProcess )
            // InternalGoatComponentsParser.g:8734:3: rulePredOutputProcessOrInputProcess
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


    // $ANTLR start "rule__Update__VarsAssignment_1"
    // InternalGoatComponentsParser.g:8743:1: rule__Update__VarsAssignment_1 : ( ruleAttributeToSet ) ;
    public final void rule__Update__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8747:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponentsParser.g:8748:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponentsParser.g:8748:2: ( ruleAttributeToSet )
            // InternalGoatComponentsParser.g:8749:3: ruleAttributeToSet
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
    // InternalGoatComponentsParser.g:8758:1: rule__Update__ValsAssignment_3 : ( ruleExpression ) ;
    public final void rule__Update__ValsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8762:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8763:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8763:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8764:3: ruleExpression
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
    // InternalGoatComponentsParser.g:8773:1: rule__Update__VarsAssignment_4_1 : ( ruleAttributeToSet ) ;
    public final void rule__Update__VarsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8777:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponentsParser.g:8778:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponentsParser.g:8778:2: ( ruleAttributeToSet )
            // InternalGoatComponentsParser.g:8779:3: ruleAttributeToSet
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
    // InternalGoatComponentsParser.g:8788:1: rule__Update__ValsAssignment_4_3 : ( ruleExpression ) ;
    public final void rule__Update__ValsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8792:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8793:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8793:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8794:3: ruleExpression
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
    // InternalGoatComponentsParser.g:8803:1: rule__Awareness__PredAssignment_3 : ( ruleExpression ) ;
    public final void rule__Awareness__PredAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8807:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:8808:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:8808:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:8809:3: ruleExpression
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
    // InternalGoatComponentsParser.g:8818:1: rule__CallProcess__ProcnameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CallProcess__ProcnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8822:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:8823:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:8823:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:8824:3: ( RULE_ID )
            {
             before(grammarAccess.getCallProcessAccess().getProcnameProcessDefinitionCrossReference_1_0()); 
            // InternalGoatComponentsParser.g:8825:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:8826:4: RULE_ID
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
    // InternalGoatComponentsParser.g:8837:1: rule__ProcessDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProcessDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8841:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:8842:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:8842:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:8843:3: RULE_ID
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
    // InternalGoatComponentsParser.g:8852:1: rule__ProcessDefinition__ProcAssignment_3 : ( ruleProc ) ;
    public final void rule__ProcessDefinition__ProcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8856:1: ( ( ruleProc ) )
            // InternalGoatComponentsParser.g:8857:2: ( ruleProc )
            {
            // InternalGoatComponentsParser.g:8857:2: ( ruleProc )
            // InternalGoatComponentsParser.g:8858:3: ruleProc
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
    // InternalGoatComponentsParser.g:8867:1: rule__EnvInitValue__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__EnvInitValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8871:1: ( ( RULE_INT ) )
            // InternalGoatComponentsParser.g:8872:2: ( RULE_INT )
            {
            // InternalGoatComponentsParser.g:8872:2: ( RULE_INT )
            // InternalGoatComponentsParser.g:8873:3: RULE_INT
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
    // InternalGoatComponentsParser.g:8882:1: rule__EnvInitValue__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__EnvInitValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8886:1: ( ( RULE_STRING ) )
            // InternalGoatComponentsParser.g:8887:2: ( RULE_STRING )
            {
            // InternalGoatComponentsParser.g:8887:2: ( RULE_STRING )
            // InternalGoatComponentsParser.g:8888:3: RULE_STRING
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
    // InternalGoatComponentsParser.g:8897:1: rule__EnvInitValue__ValueAssignment_2_1 : ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__EnvInitValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8901:1: ( ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) ) )
            // InternalGoatComponentsParser.g:8902:2: ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) )
            {
            // InternalGoatComponentsParser.g:8902:2: ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) )
            // InternalGoatComponentsParser.g:8903:3: ( rule__EnvInitValue__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAlternatives_2_1_0()); 
            // InternalGoatComponentsParser.g:8904:3: ( rule__EnvInitValue__ValueAlternatives_2_1_0 )
            // InternalGoatComponentsParser.g:8904:4: rule__EnvInitValue__ValueAlternatives_2_1_0
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
    // InternalGoatComponentsParser.g:8912:1: rule__Environment__AttrsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Environment__AttrsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8916:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:8917:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:8917:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:8918:3: RULE_ID
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
    // InternalGoatComponentsParser.g:8927:1: rule__Environment__ValsAssignment_2_2 : ( ruleEnvInitValue ) ;
    public final void rule__Environment__ValsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8931:1: ( ( ruleEnvInitValue ) )
            // InternalGoatComponentsParser.g:8932:2: ( ruleEnvInitValue )
            {
            // InternalGoatComponentsParser.g:8932:2: ( ruleEnvInitValue )
            // InternalGoatComponentsParser.g:8933:3: ruleEnvInitValue
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
    // InternalGoatComponentsParser.g:8942:1: rule__Environment__AttrsAssignment_2_3_1 : ( RULE_ID ) ;
    public final void rule__Environment__AttrsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8946:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:8947:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:8947:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:8948:3: RULE_ID
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
    // InternalGoatComponentsParser.g:8957:1: rule__Environment__ValsAssignment_2_3_3 : ( ruleEnvInitValue ) ;
    public final void rule__Environment__ValsAssignment_2_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8961:1: ( ( ruleEnvInitValue ) )
            // InternalGoatComponentsParser.g:8962:2: ( ruleEnvInitValue )
            {
            // InternalGoatComponentsParser.g:8962:2: ( ruleEnvInitValue )
            // InternalGoatComponentsParser.g:8963:3: ruleEnvInitValue
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
    // InternalGoatComponentsParser.g:8972:1: rule__ComponentDefinition__EnvAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__ComponentDefinition__EnvAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8976:1: ( ( ruleEnvironment ) )
            // InternalGoatComponentsParser.g:8977:2: ( ruleEnvironment )
            {
            // InternalGoatComponentsParser.g:8977:2: ( ruleEnvironment )
            // InternalGoatComponentsParser.g:8978:3: ruleEnvironment
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
    // InternalGoatComponentsParser.g:8987:1: rule__ComponentDefinition__ProcAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentDefinition__ProcAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:8991:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:8992:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:8992:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:8993:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentDefinitionAccess().getProcProcessDefinitionCrossReference_2_0()); 
            // InternalGoatComponentsParser.g:8994:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:8995:4: RULE_ID
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
    // InternalGoatComponentsParser.g:9006:1: rule__ComponentDefinition__AddressAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ComponentDefinition__AddressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9010:1: ( ( RULE_STRING ) )
            // InternalGoatComponentsParser.g:9011:2: ( RULE_STRING )
            {
            // InternalGoatComponentsParser.g:9011:2: ( RULE_STRING )
            // InternalGoatComponentsParser.g:9012:3: RULE_STRING
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
    // InternalGoatComponentsParser.g:9021:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9025:1: ( ( ruleAnd ) )
            // InternalGoatComponentsParser.g:9026:2: ( ruleAnd )
            {
            // InternalGoatComponentsParser.g:9026:2: ( ruleAnd )
            // InternalGoatComponentsParser.g:9027:3: ruleAnd
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
    // InternalGoatComponentsParser.g:9036:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9040:1: ( ( ruleEquality ) )
            // InternalGoatComponentsParser.g:9041:2: ( ruleEquality )
            {
            // InternalGoatComponentsParser.g:9041:2: ( ruleEquality )
            // InternalGoatComponentsParser.g:9042:3: ruleEquality
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
    // InternalGoatComponentsParser.g:9051:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9055:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalGoatComponentsParser.g:9056:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalGoatComponentsParser.g:9056:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalGoatComponentsParser.g:9057:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalGoatComponentsParser.g:9058:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalGoatComponentsParser.g:9058:4: rule__Equality__OpAlternatives_1_1_0
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
    // InternalGoatComponentsParser.g:9066:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9070:1: ( ( ruleComparison ) )
            // InternalGoatComponentsParser.g:9071:2: ( ruleComparison )
            {
            // InternalGoatComponentsParser.g:9071:2: ( ruleComparison )
            // InternalGoatComponentsParser.g:9072:3: ruleComparison
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
    // InternalGoatComponentsParser.g:9081:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9085:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalGoatComponentsParser.g:9086:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalGoatComponentsParser.g:9086:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalGoatComponentsParser.g:9087:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalGoatComponentsParser.g:9088:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalGoatComponentsParser.g:9088:4: rule__Comparison__OpAlternatives_1_1_0
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
    // InternalGoatComponentsParser.g:9096:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9100:1: ( ( rulePlusOrMinus ) )
            // InternalGoatComponentsParser.g:9101:2: ( rulePlusOrMinus )
            {
            // InternalGoatComponentsParser.g:9101:2: ( rulePlusOrMinus )
            // InternalGoatComponentsParser.g:9102:3: rulePlusOrMinus
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
    // InternalGoatComponentsParser.g:9111:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9115:1: ( ( ruleMulOrDiv ) )
            // InternalGoatComponentsParser.g:9116:2: ( ruleMulOrDiv )
            {
            // InternalGoatComponentsParser.g:9116:2: ( ruleMulOrDiv )
            // InternalGoatComponentsParser.g:9117:3: ruleMulOrDiv
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
    // InternalGoatComponentsParser.g:9126:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9130:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalGoatComponentsParser.g:9131:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalGoatComponentsParser.g:9131:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalGoatComponentsParser.g:9132:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalGoatComponentsParser.g:9133:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalGoatComponentsParser.g:9133:4: rule__MulOrDiv__OpAlternatives_1_1_0
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
    // InternalGoatComponentsParser.g:9141:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9145:1: ( ( rulePrimary ) )
            // InternalGoatComponentsParser.g:9146:2: ( rulePrimary )
            {
            // InternalGoatComponentsParser.g:9146:2: ( rulePrimary )
            // InternalGoatComponentsParser.g:9147:3: rulePrimary
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
    // InternalGoatComponentsParser.g:9156:1: rule__Primary__ExpressionAssignment_1_3 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9160:1: ( ( rulePrimary ) )
            // InternalGoatComponentsParser.g:9161:2: ( rulePrimary )
            {
            // InternalGoatComponentsParser.g:9161:2: ( rulePrimary )
            // InternalGoatComponentsParser.g:9162:3: rulePrimary
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
    // InternalGoatComponentsParser.g:9171:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9175:1: ( ( RULE_INT ) )
            // InternalGoatComponentsParser.g:9176:2: ( RULE_INT )
            {
            // InternalGoatComponentsParser.g:9176:2: ( RULE_INT )
            // InternalGoatComponentsParser.g:9177:3: RULE_INT
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
    // InternalGoatComponentsParser.g:9186:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9190:1: ( ( RULE_STRING ) )
            // InternalGoatComponentsParser.g:9191:2: ( RULE_STRING )
            {
            // InternalGoatComponentsParser.g:9191:2: ( RULE_STRING )
            // InternalGoatComponentsParser.g:9192:3: RULE_STRING
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
    // InternalGoatComponentsParser.g:9201:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9205:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalGoatComponentsParser.g:9206:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalGoatComponentsParser.g:9206:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalGoatComponentsParser.g:9207:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalGoatComponentsParser.g:9208:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalGoatComponentsParser.g:9208:4: rule__Atomic__ValueAlternatives_2_1_0
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
    // InternalGoatComponentsParser.g:9216:1: rule__Atomic__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9220:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:9221:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:9221:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9222:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getRefLRefCrossReference_3_1_0()); 
            // InternalGoatComponentsParser.g:9223:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:9224:4: RULE_ID
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
    // InternalGoatComponentsParser.g:9235:1: rule__Atomic__AttributeAssignment_4_3 : ( RULE_ID ) ;
    public final void rule__Atomic__AttributeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9239:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9240:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9240:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9241:3: RULE_ID
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
    // InternalGoatComponentsParser.g:9250:1: rule__Atomic__FunctionAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__FunctionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9254:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:9255:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:9255:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9256:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getFunctionFuncDefinitionCrossReference_5_1_0()); 
            // InternalGoatComponentsParser.g:9257:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:9258:4: RULE_ID
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
    // InternalGoatComponentsParser.g:9269:1: rule__Atomic__ParamsAssignment_5_3_0 : ( ruleExpression ) ;
    public final void rule__Atomic__ParamsAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9273:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9274:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9274:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9275:3: ruleExpression
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
    // InternalGoatComponentsParser.g:9284:1: rule__Atomic__ParamsAssignment_5_3_1_1 : ( ruleExpression ) ;
    public final void rule__Atomic__ParamsAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9288:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9289:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9289:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9290:3: ruleExpression
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
    // InternalGoatComponentsParser.g:9299:1: rule__Atomic__AttributeAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__Atomic__AttributeAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9303:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9304:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9304:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9305:3: RULE_ID
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
    // InternalGoatComponentsParser.g:9314:1: rule__Atomic__AttributeAssignment_7_3 : ( RULE_ID ) ;
    public final void rule__Atomic__AttributeAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9318:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9319:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9319:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9320:3: RULE_ID
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
    // InternalGoatComponentsParser.g:9329:1: rule__AttributeToSet__AttributeAssignment_0_3 : ( RULE_ID ) ;
    public final void rule__AttributeToSet__AttributeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9333:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9334:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9334:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9335:3: RULE_ID
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
    // InternalGoatComponentsParser.g:9344:1: rule__AttributeToSet__AttributeAssignment_1_3 : ( RULE_ID ) ;
    public final void rule__AttributeToSet__AttributeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9348:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9349:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9349:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9350:3: RULE_ID
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
    // InternalGoatComponentsParser.g:9359:1: rule__FuncParam__TypeAssignment_0 : ( RULE_TYPE ) ;
    public final void rule__FuncParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9363:1: ( ( RULE_TYPE ) )
            // InternalGoatComponentsParser.g:9364:2: ( RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:9364:2: ( RULE_TYPE )
            // InternalGoatComponentsParser.g:9365:3: RULE_TYPE
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
    // InternalGoatComponentsParser.g:9374:1: rule__FuncParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FuncParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9378:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9379:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9379:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9380:3: RULE_ID
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
    // InternalGoatComponentsParser.g:9389:1: rule__FuncDefinition__TypeAssignment_1 : ( RULE_TYPE ) ;
    public final void rule__FuncDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9393:1: ( ( RULE_TYPE ) )
            // InternalGoatComponentsParser.g:9394:2: ( RULE_TYPE )
            {
            // InternalGoatComponentsParser.g:9394:2: ( RULE_TYPE )
            // InternalGoatComponentsParser.g:9395:3: RULE_TYPE
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
    // InternalGoatComponentsParser.g:9404:1: rule__FuncDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FuncDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9408:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9409:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9409:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9410:3: RULE_ID
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
    // InternalGoatComponentsParser.g:9419:1: rule__FuncDefinition__ParamsAssignment_4_0 : ( ruleFuncParam ) ;
    public final void rule__FuncDefinition__ParamsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9423:1: ( ( ruleFuncParam ) )
            // InternalGoatComponentsParser.g:9424:2: ( ruleFuncParam )
            {
            // InternalGoatComponentsParser.g:9424:2: ( ruleFuncParam )
            // InternalGoatComponentsParser.g:9425:3: ruleFuncParam
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
    // InternalGoatComponentsParser.g:9434:1: rule__FuncDefinition__ParamsAssignment_4_1_1 : ( ruleFuncParam ) ;
    public final void rule__FuncDefinition__ParamsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9438:1: ( ( ruleFuncParam ) )
            // InternalGoatComponentsParser.g:9439:2: ( ruleFuncParam )
            {
            // InternalGoatComponentsParser.g:9439:2: ( ruleFuncParam )
            // InternalGoatComponentsParser.g:9440:3: ruleFuncParam
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
    // InternalGoatComponentsParser.g:9449:1: rule__FuncDefinition__BlkAssignment_6 : ( ruleFuncBlock ) ;
    public final void rule__FuncDefinition__BlkAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9453:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:9454:2: ( ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:9454:2: ( ruleFuncBlock )
            // InternalGoatComponentsParser.g:9455:3: ruleFuncBlock
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
    // InternalGoatComponentsParser.g:9464:1: rule__FuncBlock__StatementsAssignment_2 : ( ruleFuncStatement ) ;
    public final void rule__FuncBlock__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9468:1: ( ( ruleFuncStatement ) )
            // InternalGoatComponentsParser.g:9469:2: ( ruleFuncStatement )
            {
            // InternalGoatComponentsParser.g:9469:2: ( ruleFuncStatement )
            // InternalGoatComponentsParser.g:9470:3: ruleFuncStatement
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
    // InternalGoatComponentsParser.g:9479:1: rule__FuncVarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FuncVarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9483:1: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9484:2: ( RULE_ID )
            {
            // InternalGoatComponentsParser.g:9484:2: ( RULE_ID )
            // InternalGoatComponentsParser.g:9485:3: RULE_ID
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
    // InternalGoatComponentsParser.g:9494:1: rule__FuncVarDeclaration__ValAssignment_3 : ( ruleExpression ) ;
    public final void rule__FuncVarDeclaration__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9498:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9499:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9499:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9500:3: ruleExpression
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
    // InternalGoatComponentsParser.g:9509:1: rule__FuncVarAssign__VarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FuncVarAssign__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9513:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponentsParser.g:9514:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponentsParser.g:9514:2: ( ( RULE_ID ) )
            // InternalGoatComponentsParser.g:9515:3: ( RULE_ID )
            {
             before(grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationCrossReference_0_0()); 
            // InternalGoatComponentsParser.g:9516:3: ( RULE_ID )
            // InternalGoatComponentsParser.g:9517:4: RULE_ID
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
    // InternalGoatComponentsParser.g:9528:1: rule__FuncVarAssign__ValAssignment_2 : ( ruleExpression ) ;
    public final void rule__FuncVarAssign__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9532:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9533:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9533:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9534:3: ruleExpression
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
    // InternalGoatComponentsParser.g:9543:1: rule__FuncIfElse__TestAssignment_2 : ( ruleExpression ) ;
    public final void rule__FuncIfElse__TestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9547:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9548:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9548:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9549:3: ruleExpression
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
    // InternalGoatComponentsParser.g:9558:1: rule__FuncIfElse__ThenAssignment_4 : ( ruleFuncBlock ) ;
    public final void rule__FuncIfElse__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9562:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:9563:2: ( ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:9563:2: ( ruleFuncBlock )
            // InternalGoatComponentsParser.g:9564:3: ruleFuncBlock
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


    // $ANTLR start "rule__FuncIfElse__TestAssignment_5_2"
    // InternalGoatComponentsParser.g:9573:1: rule__FuncIfElse__TestAssignment_5_2 : ( ruleExpression ) ;
    public final void rule__FuncIfElse__TestAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9577:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9578:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9578:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9579:3: ruleExpression
            {
             before(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFuncIfElseAccess().getTestExpressionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncIfElse__TestAssignment_5_2"


    // $ANTLR start "rule__FuncIfElse__ThenAssignment_5_4"
    // InternalGoatComponentsParser.g:9588:1: rule__FuncIfElse__ThenAssignment_5_4 : ( ruleFuncBlock ) ;
    public final void rule__FuncIfElse__ThenAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9592:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:9593:2: ( ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:9593:2: ( ruleFuncBlock )
            // InternalGoatComponentsParser.g:9594:3: ruleFuncBlock
            {
             before(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncBlock();

            state._fsp--;

             after(grammarAccess.getFuncIfElseAccess().getThenFuncBlockParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncIfElse__ThenAssignment_5_4"


    // $ANTLR start "rule__FuncIfElse__ElseBranchAssignment_6_1"
    // InternalGoatComponentsParser.g:9603:1: rule__FuncIfElse__ElseBranchAssignment_6_1 : ( ruleFuncBlock ) ;
    public final void rule__FuncIfElse__ElseBranchAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9607:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponentsParser.g:9608:2: ( ruleFuncBlock )
            {
            // InternalGoatComponentsParser.g:9608:2: ( ruleFuncBlock )
            // InternalGoatComponentsParser.g:9609:3: ruleFuncBlock
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
    // InternalGoatComponentsParser.g:9618:1: rule__FuncReturn__ValAssignment_1 : ( ruleExpression ) ;
    public final void rule__FuncReturn__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponentsParser.g:9622:1: ( ( ruleExpression ) )
            // InternalGoatComponentsParser.g:9623:2: ( ruleExpression )
            {
            // InternalGoatComponentsParser.g:9623:2: ( ruleExpression )
            // InternalGoatComponentsParser.g:9624:3: ruleExpression
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
    static final String dfa_2s = "\4\uffff\1\10\5\uffff";
    static final String dfa_3s = "\1\6\3\uffff\1\10\5\uffff";
    static final String dfa_4s = "\1\65\3\uffff\1\63\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\7\1\10\1\4\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\2\uffff\1\3\5\uffff\1\5\1\uffff\1\6\1\3\40\uffff\1\4\1\1\1\2",
            "",
            "",
            "",
            "\1\10\14\uffff\4\10\1\uffff\3\10\1\uffff\2\10\1\uffff\1\11\5\10\1\uffff\2\10\1\uffff\1\10\2\uffff\1\10\2\uffff\1\10\1\uffff\1\10",
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
            return "1447:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000200000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0038000300068240L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000028000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000200100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x003A000300068240L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000C00L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008200240180000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000402000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0030000000040200L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000A0014000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000005001000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0038000700068240L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000A000040200100L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0008000040200102L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000002002L});

}