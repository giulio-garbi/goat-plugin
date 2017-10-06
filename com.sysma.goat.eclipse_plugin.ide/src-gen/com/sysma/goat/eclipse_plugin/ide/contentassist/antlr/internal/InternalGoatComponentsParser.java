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
import com.sysma.goat.eclipse_plugin.services.GoatComponentsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoatComponentsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_TYPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'infrastructure'", "'|'", "'+'", "'receive'", "'('", "')'", "'{'", "'}'", "'.'", "','", "'send'", "'@'", "'sleep'", "'print'", "'else'", "'if'", "'['", "':='", "']'", "'wait'", "'until'", "'nil'", "'proc'", "'='", "'component'", "'||'", "'&&'", "'-'", "'++'", "'!'", "'this'", "'receiver'", "'function'", "'var'", "'return'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_TYPE=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGoatComponentsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoatComponentsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoatComponentsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGoatComponents.g"; }


    	private GoatComponentsGrammarAccess grammarAccess;

    	public void setGrammarAccess(GoatComponentsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalGoatComponents.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGoatComponents.g:54:1: ( ruleModel EOF )
            // InternalGoatComponents.g:55:1: ruleModel EOF
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
    // InternalGoatComponents.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalGoatComponents.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalGoatComponents.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalGoatComponents.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalGoatComponents.g:69:3: ( rule__Model__Group__0 )
            // InternalGoatComponents.g:69:4: rule__Model__Group__0
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
    // InternalGoatComponents.g:78:1: entryRuleProc : ruleProc EOF ;
    public final void entryRuleProc() throws RecognitionException {
        try {
            // InternalGoatComponents.g:79:1: ( ruleProc EOF )
            // InternalGoatComponents.g:80:1: ruleProc EOF
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
    // InternalGoatComponents.g:87:1: ruleProc : ( ( rule__Proc__Alternatives ) ) ;
    public final void ruleProc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:91:2: ( ( ( rule__Proc__Alternatives ) ) )
            // InternalGoatComponents.g:92:2: ( ( rule__Proc__Alternatives ) )
            {
            // InternalGoatComponents.g:92:2: ( ( rule__Proc__Alternatives ) )
            // InternalGoatComponents.g:93:3: ( rule__Proc__Alternatives )
            {
             before(grammarAccess.getProcAccess().getAlternatives()); 
            // InternalGoatComponents.g:94:3: ( rule__Proc__Alternatives )
            // InternalGoatComponents.g:94:4: rule__Proc__Alternatives
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
    // InternalGoatComponents.g:103:1: entryRuleInterleavingProcess : ruleInterleavingProcess EOF ;
    public final void entryRuleInterleavingProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:104:1: ( ruleInterleavingProcess EOF )
            // InternalGoatComponents.g:105:1: ruleInterleavingProcess EOF
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
    // InternalGoatComponents.g:112:1: ruleInterleavingProcess : ( ( rule__InterleavingProcess__Group__0 ) ) ;
    public final void ruleInterleavingProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:116:2: ( ( ( rule__InterleavingProcess__Group__0 ) ) )
            // InternalGoatComponents.g:117:2: ( ( rule__InterleavingProcess__Group__0 ) )
            {
            // InternalGoatComponents.g:117:2: ( ( rule__InterleavingProcess__Group__0 ) )
            // InternalGoatComponents.g:118:3: ( rule__InterleavingProcess__Group__0 )
            {
             before(grammarAccess.getInterleavingProcessAccess().getGroup()); 
            // InternalGoatComponents.g:119:3: ( rule__InterleavingProcess__Group__0 )
            // InternalGoatComponents.g:119:4: rule__InterleavingProcess__Group__0
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
    // InternalGoatComponents.g:128:1: entryRuleNonDeterminismProcess : ruleNonDeterminismProcess EOF ;
    public final void entryRuleNonDeterminismProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:129:1: ( ruleNonDeterminismProcess EOF )
            // InternalGoatComponents.g:130:1: ruleNonDeterminismProcess EOF
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
    // InternalGoatComponents.g:137:1: ruleNonDeterminismProcess : ( ( rule__NonDeterminismProcess__Alternatives ) ) ;
    public final void ruleNonDeterminismProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:141:2: ( ( ( rule__NonDeterminismProcess__Alternatives ) ) )
            // InternalGoatComponents.g:142:2: ( ( rule__NonDeterminismProcess__Alternatives ) )
            {
            // InternalGoatComponents.g:142:2: ( ( rule__NonDeterminismProcess__Alternatives ) )
            // InternalGoatComponents.g:143:3: ( rule__NonDeterminismProcess__Alternatives )
            {
             before(grammarAccess.getNonDeterminismProcessAccess().getAlternatives()); 
            // InternalGoatComponents.g:144:3: ( rule__NonDeterminismProcess__Alternatives )
            // InternalGoatComponents.g:144:4: rule__NonDeterminismProcess__Alternatives
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
    // InternalGoatComponents.g:153:1: entryRulePreconditions : rulePreconditions EOF ;
    public final void entryRulePreconditions() throws RecognitionException {
        try {
            // InternalGoatComponents.g:154:1: ( rulePreconditions EOF )
            // InternalGoatComponents.g:155:1: rulePreconditions EOF
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
    // InternalGoatComponents.g:162:1: rulePreconditions : ( ( rule__Preconditions__Group__0 ) ) ;
    public final void rulePreconditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:166:2: ( ( ( rule__Preconditions__Group__0 ) ) )
            // InternalGoatComponents.g:167:2: ( ( rule__Preconditions__Group__0 ) )
            {
            // InternalGoatComponents.g:167:2: ( ( rule__Preconditions__Group__0 ) )
            // InternalGoatComponents.g:168:3: ( rule__Preconditions__Group__0 )
            {
             before(grammarAccess.getPreconditionsAccess().getGroup()); 
            // InternalGoatComponents.g:169:3: ( rule__Preconditions__Group__0 )
            // InternalGoatComponents.g:169:4: rule__Preconditions__Group__0
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
    // InternalGoatComponents.g:178:1: entryRulePredOutputProcessOrInputProcesses : rulePredOutputProcessOrInputProcesses EOF ;
    public final void entryRulePredOutputProcessOrInputProcesses() throws RecognitionException {
        try {
            // InternalGoatComponents.g:179:1: ( rulePredOutputProcessOrInputProcesses EOF )
            // InternalGoatComponents.g:180:1: rulePredOutputProcessOrInputProcesses EOF
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
    // InternalGoatComponents.g:187:1: rulePredOutputProcessOrInputProcesses : ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) ) ;
    public final void rulePredOutputProcessOrInputProcesses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:191:2: ( ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) ) )
            // InternalGoatComponents.g:192:2: ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) )
            {
            // InternalGoatComponents.g:192:2: ( ( rule__PredOutputProcessOrInputProcesses__Group__0 ) )
            // InternalGoatComponents.g:193:3: ( rule__PredOutputProcessOrInputProcesses__Group__0 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup()); 
            // InternalGoatComponents.g:194:3: ( rule__PredOutputProcessOrInputProcesses__Group__0 )
            // InternalGoatComponents.g:194:4: rule__PredOutputProcessOrInputProcesses__Group__0
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
    // InternalGoatComponents.g:203:1: entryRulePredOutputProcessOrInputProcess : rulePredOutputProcessOrInputProcess EOF ;
    public final void entryRulePredOutputProcessOrInputProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:204:1: ( rulePredOutputProcessOrInputProcess EOF )
            // InternalGoatComponents.g:205:1: rulePredOutputProcessOrInputProcess EOF
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
    // InternalGoatComponents.g:212:1: rulePredOutputProcessOrInputProcess : ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) ) ;
    public final void rulePredOutputProcessOrInputProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:216:2: ( ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) ) )
            // InternalGoatComponents.g:217:2: ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) )
            {
            // InternalGoatComponents.g:217:2: ( ( rule__PredOutputProcessOrInputProcess__Group__0 ) )
            // InternalGoatComponents.g:218:3: ( rule__PredOutputProcessOrInputProcess__Group__0 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup()); 
            // InternalGoatComponents.g:219:3: ( rule__PredOutputProcessOrInputProcess__Group__0 )
            // InternalGoatComponents.g:219:4: rule__PredOutputProcessOrInputProcess__Group__0
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
    // InternalGoatComponents.g:229:1: ruleInputProcessesPart : ( ( rule__InputProcessesPart__Group__0 ) ) ;
    public final void ruleInputProcessesPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:233:2: ( ( ( rule__InputProcessesPart__Group__0 ) ) )
            // InternalGoatComponents.g:234:2: ( ( rule__InputProcessesPart__Group__0 ) )
            {
            // InternalGoatComponents.g:234:2: ( ( rule__InputProcessesPart__Group__0 ) )
            // InternalGoatComponents.g:235:3: ( rule__InputProcessesPart__Group__0 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getGroup()); 
            // InternalGoatComponents.g:236:3: ( rule__InputProcessesPart__Group__0 )
            // InternalGoatComponents.g:236:4: rule__InputProcessesPart__Group__0
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
    // InternalGoatComponents.g:245:1: entryRuleInputProcess : ruleInputProcess EOF ;
    public final void entryRuleInputProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:246:1: ( ruleInputProcess EOF )
            // InternalGoatComponents.g:247:1: ruleInputProcess EOF
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
    // InternalGoatComponents.g:254:1: ruleInputProcess : ( ( rule__InputProcess__Group__0 ) ) ;
    public final void ruleInputProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:258:2: ( ( ( rule__InputProcess__Group__0 ) ) )
            // InternalGoatComponents.g:259:2: ( ( rule__InputProcess__Group__0 ) )
            {
            // InternalGoatComponents.g:259:2: ( ( rule__InputProcess__Group__0 ) )
            // InternalGoatComponents.g:260:3: ( rule__InputProcess__Group__0 )
            {
             before(grammarAccess.getInputProcessAccess().getGroup()); 
            // InternalGoatComponents.g:261:3: ( rule__InputProcess__Group__0 )
            // InternalGoatComponents.g:261:4: rule__InputProcess__Group__0
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
    // InternalGoatComponents.g:271:1: ruleOutputProcessPart : ( ( rule__OutputProcessPart__Group__0 ) ) ;
    public final void ruleOutputProcessPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:275:2: ( ( ( rule__OutputProcessPart__Group__0 ) ) )
            // InternalGoatComponents.g:276:2: ( ( rule__OutputProcessPart__Group__0 ) )
            {
            // InternalGoatComponents.g:276:2: ( ( rule__OutputProcessPart__Group__0 ) )
            // InternalGoatComponents.g:277:3: ( rule__OutputProcessPart__Group__0 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup()); 
            // InternalGoatComponents.g:278:3: ( rule__OutputProcessPart__Group__0 )
            // InternalGoatComponents.g:278:4: rule__OutputProcessPart__Group__0
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
    // InternalGoatComponents.g:287:1: entryRulePrintStatement : rulePrintStatement EOF ;
    public final void entryRulePrintStatement() throws RecognitionException {
        try {
            // InternalGoatComponents.g:288:1: ( rulePrintStatement EOF )
            // InternalGoatComponents.g:289:1: rulePrintStatement EOF
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
    // InternalGoatComponents.g:296:1: rulePrintStatement : ( rulePrintFormattedStatement ) ;
    public final void rulePrintStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:300:2: ( ( rulePrintFormattedStatement ) )
            // InternalGoatComponents.g:301:2: ( rulePrintFormattedStatement )
            {
            // InternalGoatComponents.g:301:2: ( rulePrintFormattedStatement )
            // InternalGoatComponents.g:302:3: rulePrintFormattedStatement
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
    // InternalGoatComponents.g:312:1: entryRulePrintFormattedStatement : rulePrintFormattedStatement EOF ;
    public final void entryRulePrintFormattedStatement() throws RecognitionException {
        try {
            // InternalGoatComponents.g:313:1: ( rulePrintFormattedStatement EOF )
            // InternalGoatComponents.g:314:1: rulePrintFormattedStatement EOF
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
    // InternalGoatComponents.g:321:1: rulePrintFormattedStatement : ( ( rule__PrintFormattedStatement__Group__0 ) ) ;
    public final void rulePrintFormattedStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:325:2: ( ( ( rule__PrintFormattedStatement__Group__0 ) ) )
            // InternalGoatComponents.g:326:2: ( ( rule__PrintFormattedStatement__Group__0 ) )
            {
            // InternalGoatComponents.g:326:2: ( ( rule__PrintFormattedStatement__Group__0 ) )
            // InternalGoatComponents.g:327:3: ( rule__PrintFormattedStatement__Group__0 )
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getGroup()); 
            // InternalGoatComponents.g:328:3: ( rule__PrintFormattedStatement__Group__0 )
            // InternalGoatComponents.g:328:4: rule__PrintFormattedStatement__Group__0
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
    // InternalGoatComponents.g:337:1: entryRuleIfProcesses : ruleIfProcesses EOF ;
    public final void entryRuleIfProcesses() throws RecognitionException {
        try {
            // InternalGoatComponents.g:338:1: ( ruleIfProcesses EOF )
            // InternalGoatComponents.g:339:1: ruleIfProcesses EOF
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
    // InternalGoatComponents.g:346:1: ruleIfProcesses : ( ( rule__IfProcesses__Group__0 ) ) ;
    public final void ruleIfProcesses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:350:2: ( ( ( rule__IfProcesses__Group__0 ) ) )
            // InternalGoatComponents.g:351:2: ( ( rule__IfProcesses__Group__0 ) )
            {
            // InternalGoatComponents.g:351:2: ( ( rule__IfProcesses__Group__0 ) )
            // InternalGoatComponents.g:352:3: ( rule__IfProcesses__Group__0 )
            {
             before(grammarAccess.getIfProcessesAccess().getGroup()); 
            // InternalGoatComponents.g:353:3: ( rule__IfProcesses__Group__0 )
            // InternalGoatComponents.g:353:4: rule__IfProcesses__Group__0
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
    // InternalGoatComponents.g:362:1: entryRuleIfBranchProcess : ruleIfBranchProcess EOF ;
    public final void entryRuleIfBranchProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:363:1: ( ruleIfBranchProcess EOF )
            // InternalGoatComponents.g:364:1: ruleIfBranchProcess EOF
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
    // InternalGoatComponents.g:371:1: ruleIfBranchProcess : ( ( rule__IfBranchProcess__Group__0 ) ) ;
    public final void ruleIfBranchProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:375:2: ( ( ( rule__IfBranchProcess__Group__0 ) ) )
            // InternalGoatComponents.g:376:2: ( ( rule__IfBranchProcess__Group__0 ) )
            {
            // InternalGoatComponents.g:376:2: ( ( rule__IfBranchProcess__Group__0 ) )
            // InternalGoatComponents.g:377:3: ( rule__IfBranchProcess__Group__0 )
            {
             before(grammarAccess.getIfBranchProcessAccess().getGroup()); 
            // InternalGoatComponents.g:378:3: ( rule__IfBranchProcess__Group__0 )
            // InternalGoatComponents.g:378:4: rule__IfBranchProcess__Group__0
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
    // InternalGoatComponents.g:387:1: entryRuleElseBranchProcess : ruleElseBranchProcess EOF ;
    public final void entryRuleElseBranchProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:388:1: ( ruleElseBranchProcess EOF )
            // InternalGoatComponents.g:389:1: ruleElseBranchProcess EOF
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
    // InternalGoatComponents.g:396:1: ruleElseBranchProcess : ( ( rule__ElseBranchProcess__Group__0 ) ) ;
    public final void ruleElseBranchProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:400:2: ( ( ( rule__ElseBranchProcess__Group__0 ) ) )
            // InternalGoatComponents.g:401:2: ( ( rule__ElseBranchProcess__Group__0 ) )
            {
            // InternalGoatComponents.g:401:2: ( ( rule__ElseBranchProcess__Group__0 ) )
            // InternalGoatComponents.g:402:3: ( rule__ElseBranchProcess__Group__0 )
            {
             before(grammarAccess.getElseBranchProcessAccess().getGroup()); 
            // InternalGoatComponents.g:403:3: ( rule__ElseBranchProcess__Group__0 )
            // InternalGoatComponents.g:403:4: rule__ElseBranchProcess__Group__0
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
    // InternalGoatComponents.g:412:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalGoatComponents.g:413:1: ( ruleUpdate EOF )
            // InternalGoatComponents.g:414:1: ruleUpdate EOF
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
    // InternalGoatComponents.g:421:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:425:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalGoatComponents.g:426:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalGoatComponents.g:426:2: ( ( rule__Update__Group__0 ) )
            // InternalGoatComponents.g:427:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalGoatComponents.g:428:3: ( rule__Update__Group__0 )
            // InternalGoatComponents.g:428:4: rule__Update__Group__0
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
    // InternalGoatComponents.g:437:1: entryRuleAwareness : ruleAwareness EOF ;
    public final void entryRuleAwareness() throws RecognitionException {
        try {
            // InternalGoatComponents.g:438:1: ( ruleAwareness EOF )
            // InternalGoatComponents.g:439:1: ruleAwareness EOF
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
    // InternalGoatComponents.g:446:1: ruleAwareness : ( ( rule__Awareness__Group__0 ) ) ;
    public final void ruleAwareness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:450:2: ( ( ( rule__Awareness__Group__0 ) ) )
            // InternalGoatComponents.g:451:2: ( ( rule__Awareness__Group__0 ) )
            {
            // InternalGoatComponents.g:451:2: ( ( rule__Awareness__Group__0 ) )
            // InternalGoatComponents.g:452:3: ( rule__Awareness__Group__0 )
            {
             before(grammarAccess.getAwarenessAccess().getGroup()); 
            // InternalGoatComponents.g:453:3: ( rule__Awareness__Group__0 )
            // InternalGoatComponents.g:453:4: rule__Awareness__Group__0
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
    // InternalGoatComponents.g:462:1: entryRuleNZCProcess : ruleNZCProcess EOF ;
    public final void entryRuleNZCProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:463:1: ( ruleNZCProcess EOF )
            // InternalGoatComponents.g:464:1: ruleNZCProcess EOF
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
    // InternalGoatComponents.g:471:1: ruleNZCProcess : ( ( rule__NZCProcess__Alternatives ) ) ;
    public final void ruleNZCProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:475:2: ( ( ( rule__NZCProcess__Alternatives ) ) )
            // InternalGoatComponents.g:476:2: ( ( rule__NZCProcess__Alternatives ) )
            {
            // InternalGoatComponents.g:476:2: ( ( rule__NZCProcess__Alternatives ) )
            // InternalGoatComponents.g:477:3: ( rule__NZCProcess__Alternatives )
            {
             before(grammarAccess.getNZCProcessAccess().getAlternatives()); 
            // InternalGoatComponents.g:478:3: ( rule__NZCProcess__Alternatives )
            // InternalGoatComponents.g:478:4: rule__NZCProcess__Alternatives
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
    // InternalGoatComponents.g:487:1: entryRuleNProcess : ruleNProcess EOF ;
    public final void entryRuleNProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:488:1: ( ruleNProcess EOF )
            // InternalGoatComponents.g:489:1: ruleNProcess EOF
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
    // InternalGoatComponents.g:496:1: ruleNProcess : ( ( rule__NProcess__Alternatives ) ) ;
    public final void ruleNProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:500:2: ( ( ( rule__NProcess__Alternatives ) ) )
            // InternalGoatComponents.g:501:2: ( ( rule__NProcess__Alternatives ) )
            {
            // InternalGoatComponents.g:501:2: ( ( rule__NProcess__Alternatives ) )
            // InternalGoatComponents.g:502:3: ( rule__NProcess__Alternatives )
            {
             before(grammarAccess.getNProcessAccess().getAlternatives()); 
            // InternalGoatComponents.g:503:3: ( rule__NProcess__Alternatives )
            // InternalGoatComponents.g:503:4: rule__NProcess__Alternatives
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
    // InternalGoatComponents.g:512:1: entryRuleCallProcess : ruleCallProcess EOF ;
    public final void entryRuleCallProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:513:1: ( ruleCallProcess EOF )
            // InternalGoatComponents.g:514:1: ruleCallProcess EOF
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
    // InternalGoatComponents.g:521:1: ruleCallProcess : ( ( rule__CallProcess__Group__0 ) ) ;
    public final void ruleCallProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:525:2: ( ( ( rule__CallProcess__Group__0 ) ) )
            // InternalGoatComponents.g:526:2: ( ( rule__CallProcess__Group__0 ) )
            {
            // InternalGoatComponents.g:526:2: ( ( rule__CallProcess__Group__0 ) )
            // InternalGoatComponents.g:527:3: ( rule__CallProcess__Group__0 )
            {
             before(grammarAccess.getCallProcessAccess().getGroup()); 
            // InternalGoatComponents.g:528:3: ( rule__CallProcess__Group__0 )
            // InternalGoatComponents.g:528:4: rule__CallProcess__Group__0
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
    // InternalGoatComponents.g:537:1: entryRuleZeroProcess : ruleZeroProcess EOF ;
    public final void entryRuleZeroProcess() throws RecognitionException {
        try {
            // InternalGoatComponents.g:538:1: ( ruleZeroProcess EOF )
            // InternalGoatComponents.g:539:1: ruleZeroProcess EOF
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
    // InternalGoatComponents.g:546:1: ruleZeroProcess : ( ( rule__ZeroProcess__Group__0 ) ) ;
    public final void ruleZeroProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:550:2: ( ( ( rule__ZeroProcess__Group__0 ) ) )
            // InternalGoatComponents.g:551:2: ( ( rule__ZeroProcess__Group__0 ) )
            {
            // InternalGoatComponents.g:551:2: ( ( rule__ZeroProcess__Group__0 ) )
            // InternalGoatComponents.g:552:3: ( rule__ZeroProcess__Group__0 )
            {
             before(grammarAccess.getZeroProcessAccess().getGroup()); 
            // InternalGoatComponents.g:553:3: ( rule__ZeroProcess__Group__0 )
            // InternalGoatComponents.g:553:4: rule__ZeroProcess__Group__0
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
    // InternalGoatComponents.g:562:1: entryRuleProcessDefinition : ruleProcessDefinition EOF ;
    public final void entryRuleProcessDefinition() throws RecognitionException {
        try {
            // InternalGoatComponents.g:563:1: ( ruleProcessDefinition EOF )
            // InternalGoatComponents.g:564:1: ruleProcessDefinition EOF
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
    // InternalGoatComponents.g:571:1: ruleProcessDefinition : ( ( rule__ProcessDefinition__Group__0 ) ) ;
    public final void ruleProcessDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:575:2: ( ( ( rule__ProcessDefinition__Group__0 ) ) )
            // InternalGoatComponents.g:576:2: ( ( rule__ProcessDefinition__Group__0 ) )
            {
            // InternalGoatComponents.g:576:2: ( ( rule__ProcessDefinition__Group__0 ) )
            // InternalGoatComponents.g:577:3: ( rule__ProcessDefinition__Group__0 )
            {
             before(grammarAccess.getProcessDefinitionAccess().getGroup()); 
            // InternalGoatComponents.g:578:3: ( rule__ProcessDefinition__Group__0 )
            // InternalGoatComponents.g:578:4: rule__ProcessDefinition__Group__0
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
    // InternalGoatComponents.g:587:1: entryRuleEnvInitValue : ruleEnvInitValue EOF ;
    public final void entryRuleEnvInitValue() throws RecognitionException {
        try {
            // InternalGoatComponents.g:588:1: ( ruleEnvInitValue EOF )
            // InternalGoatComponents.g:589:1: ruleEnvInitValue EOF
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
    // InternalGoatComponents.g:596:1: ruleEnvInitValue : ( ( rule__EnvInitValue__Alternatives ) ) ;
    public final void ruleEnvInitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:600:2: ( ( ( rule__EnvInitValue__Alternatives ) ) )
            // InternalGoatComponents.g:601:2: ( ( rule__EnvInitValue__Alternatives ) )
            {
            // InternalGoatComponents.g:601:2: ( ( rule__EnvInitValue__Alternatives ) )
            // InternalGoatComponents.g:602:3: ( rule__EnvInitValue__Alternatives )
            {
             before(grammarAccess.getEnvInitValueAccess().getAlternatives()); 
            // InternalGoatComponents.g:603:3: ( rule__EnvInitValue__Alternatives )
            // InternalGoatComponents.g:603:4: rule__EnvInitValue__Alternatives
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
    // InternalGoatComponents.g:612:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalGoatComponents.g:613:1: ( ruleEnvironment EOF )
            // InternalGoatComponents.g:614:1: ruleEnvironment EOF
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
    // InternalGoatComponents.g:621:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:625:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalGoatComponents.g:626:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalGoatComponents.g:626:2: ( ( rule__Environment__Group__0 ) )
            // InternalGoatComponents.g:627:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalGoatComponents.g:628:3: ( rule__Environment__Group__0 )
            // InternalGoatComponents.g:628:4: rule__Environment__Group__0
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
    // InternalGoatComponents.g:637:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // InternalGoatComponents.g:638:1: ( ruleComponentDefinition EOF )
            // InternalGoatComponents.g:639:1: ruleComponentDefinition EOF
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
    // InternalGoatComponents.g:646:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Group__0 ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:650:2: ( ( ( rule__ComponentDefinition__Group__0 ) ) )
            // InternalGoatComponents.g:651:2: ( ( rule__ComponentDefinition__Group__0 ) )
            {
            // InternalGoatComponents.g:651:2: ( ( rule__ComponentDefinition__Group__0 ) )
            // InternalGoatComponents.g:652:3: ( rule__ComponentDefinition__Group__0 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getGroup()); 
            // InternalGoatComponents.g:653:3: ( rule__ComponentDefinition__Group__0 )
            // InternalGoatComponents.g:653:4: rule__ComponentDefinition__Group__0
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
    // InternalGoatComponents.g:662:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGoatComponents.g:663:1: ( ruleExpression EOF )
            // InternalGoatComponents.g:664:1: ruleExpression EOF
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
    // InternalGoatComponents.g:671:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:675:2: ( ( ruleOr ) )
            // InternalGoatComponents.g:676:2: ( ruleOr )
            {
            // InternalGoatComponents.g:676:2: ( ruleOr )
            // InternalGoatComponents.g:677:3: ruleOr
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
    // InternalGoatComponents.g:687:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalGoatComponents.g:688:1: ( ruleOr EOF )
            // InternalGoatComponents.g:689:1: ruleOr EOF
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
    // InternalGoatComponents.g:696:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:700:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalGoatComponents.g:701:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalGoatComponents.g:701:2: ( ( rule__Or__Group__0 ) )
            // InternalGoatComponents.g:702:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalGoatComponents.g:703:3: ( rule__Or__Group__0 )
            // InternalGoatComponents.g:703:4: rule__Or__Group__0
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
    // InternalGoatComponents.g:712:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalGoatComponents.g:713:1: ( ruleAnd EOF )
            // InternalGoatComponents.g:714:1: ruleAnd EOF
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
    // InternalGoatComponents.g:721:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:725:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalGoatComponents.g:726:2: ( ( rule__And__Group__0 ) )
            {
            // InternalGoatComponents.g:726:2: ( ( rule__And__Group__0 ) )
            // InternalGoatComponents.g:727:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalGoatComponents.g:728:3: ( rule__And__Group__0 )
            // InternalGoatComponents.g:728:4: rule__And__Group__0
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
    // InternalGoatComponents.g:737:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalGoatComponents.g:738:1: ( ruleEquality EOF )
            // InternalGoatComponents.g:739:1: ruleEquality EOF
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
    // InternalGoatComponents.g:746:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:750:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalGoatComponents.g:751:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalGoatComponents.g:751:2: ( ( rule__Equality__Group__0 ) )
            // InternalGoatComponents.g:752:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalGoatComponents.g:753:3: ( rule__Equality__Group__0 )
            // InternalGoatComponents.g:753:4: rule__Equality__Group__0
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
    // InternalGoatComponents.g:762:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalGoatComponents.g:763:1: ( ruleComparison EOF )
            // InternalGoatComponents.g:764:1: ruleComparison EOF
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
    // InternalGoatComponents.g:771:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:775:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalGoatComponents.g:776:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalGoatComponents.g:776:2: ( ( rule__Comparison__Group__0 ) )
            // InternalGoatComponents.g:777:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalGoatComponents.g:778:3: ( rule__Comparison__Group__0 )
            // InternalGoatComponents.g:778:4: rule__Comparison__Group__0
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
    // InternalGoatComponents.g:787:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalGoatComponents.g:788:1: ( rulePlusOrMinus EOF )
            // InternalGoatComponents.g:789:1: rulePlusOrMinus EOF
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
    // InternalGoatComponents.g:796:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:800:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalGoatComponents.g:801:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalGoatComponents.g:801:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalGoatComponents.g:802:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalGoatComponents.g:803:3: ( rule__PlusOrMinus__Group__0 )
            // InternalGoatComponents.g:803:4: rule__PlusOrMinus__Group__0
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
    // InternalGoatComponents.g:812:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalGoatComponents.g:813:1: ( ruleMulOrDiv EOF )
            // InternalGoatComponents.g:814:1: ruleMulOrDiv EOF
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
    // InternalGoatComponents.g:821:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:825:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalGoatComponents.g:826:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalGoatComponents.g:826:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalGoatComponents.g:827:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalGoatComponents.g:828:3: ( rule__MulOrDiv__Group__0 )
            // InternalGoatComponents.g:828:4: rule__MulOrDiv__Group__0
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
    // InternalGoatComponents.g:837:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalGoatComponents.g:838:1: ( rulePrimary EOF )
            // InternalGoatComponents.g:839:1: rulePrimary EOF
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
    // InternalGoatComponents.g:846:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:850:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalGoatComponents.g:851:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalGoatComponents.g:851:2: ( ( rule__Primary__Alternatives ) )
            // InternalGoatComponents.g:852:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalGoatComponents.g:853:3: ( rule__Primary__Alternatives )
            // InternalGoatComponents.g:853:4: rule__Primary__Alternatives
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
    // InternalGoatComponents.g:862:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalGoatComponents.g:863:1: ( ruleAtomic EOF )
            // InternalGoatComponents.g:864:1: ruleAtomic EOF
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
    // InternalGoatComponents.g:871:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:875:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalGoatComponents.g:876:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalGoatComponents.g:876:2: ( ( rule__Atomic__Alternatives ) )
            // InternalGoatComponents.g:877:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalGoatComponents.g:878:3: ( rule__Atomic__Alternatives )
            // InternalGoatComponents.g:878:4: rule__Atomic__Alternatives
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
    // InternalGoatComponents.g:887:1: entryRuleAttributeToSet : ruleAttributeToSet EOF ;
    public final void entryRuleAttributeToSet() throws RecognitionException {
        try {
            // InternalGoatComponents.g:888:1: ( ruleAttributeToSet EOF )
            // InternalGoatComponents.g:889:1: ruleAttributeToSet EOF
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
    // InternalGoatComponents.g:896:1: ruleAttributeToSet : ( ( rule__AttributeToSet__Alternatives ) ) ;
    public final void ruleAttributeToSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:900:2: ( ( ( rule__AttributeToSet__Alternatives ) ) )
            // InternalGoatComponents.g:901:2: ( ( rule__AttributeToSet__Alternatives ) )
            {
            // InternalGoatComponents.g:901:2: ( ( rule__AttributeToSet__Alternatives ) )
            // InternalGoatComponents.g:902:3: ( rule__AttributeToSet__Alternatives )
            {
             before(grammarAccess.getAttributeToSetAccess().getAlternatives()); 
            // InternalGoatComponents.g:903:3: ( rule__AttributeToSet__Alternatives )
            // InternalGoatComponents.g:903:4: rule__AttributeToSet__Alternatives
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
    // InternalGoatComponents.g:912:1: entryRuleFuncParam : ruleFuncParam EOF ;
    public final void entryRuleFuncParam() throws RecognitionException {
        try {
            // InternalGoatComponents.g:913:1: ( ruleFuncParam EOF )
            // InternalGoatComponents.g:914:1: ruleFuncParam EOF
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
    // InternalGoatComponents.g:921:1: ruleFuncParam : ( ( rule__FuncParam__Group__0 ) ) ;
    public final void ruleFuncParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:925:2: ( ( ( rule__FuncParam__Group__0 ) ) )
            // InternalGoatComponents.g:926:2: ( ( rule__FuncParam__Group__0 ) )
            {
            // InternalGoatComponents.g:926:2: ( ( rule__FuncParam__Group__0 ) )
            // InternalGoatComponents.g:927:3: ( rule__FuncParam__Group__0 )
            {
             before(grammarAccess.getFuncParamAccess().getGroup()); 
            // InternalGoatComponents.g:928:3: ( rule__FuncParam__Group__0 )
            // InternalGoatComponents.g:928:4: rule__FuncParam__Group__0
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
    // InternalGoatComponents.g:937:1: entryRuleFuncDefinition : ruleFuncDefinition EOF ;
    public final void entryRuleFuncDefinition() throws RecognitionException {
        try {
            // InternalGoatComponents.g:938:1: ( ruleFuncDefinition EOF )
            // InternalGoatComponents.g:939:1: ruleFuncDefinition EOF
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
    // InternalGoatComponents.g:946:1: ruleFuncDefinition : ( ( rule__FuncDefinition__Group__0 ) ) ;
    public final void ruleFuncDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:950:2: ( ( ( rule__FuncDefinition__Group__0 ) ) )
            // InternalGoatComponents.g:951:2: ( ( rule__FuncDefinition__Group__0 ) )
            {
            // InternalGoatComponents.g:951:2: ( ( rule__FuncDefinition__Group__0 ) )
            // InternalGoatComponents.g:952:3: ( rule__FuncDefinition__Group__0 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getGroup()); 
            // InternalGoatComponents.g:953:3: ( rule__FuncDefinition__Group__0 )
            // InternalGoatComponents.g:953:4: rule__FuncDefinition__Group__0
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
    // InternalGoatComponents.g:962:1: entryRuleFuncBlock : ruleFuncBlock EOF ;
    public final void entryRuleFuncBlock() throws RecognitionException {
        try {
            // InternalGoatComponents.g:963:1: ( ruleFuncBlock EOF )
            // InternalGoatComponents.g:964:1: ruleFuncBlock EOF
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
    // InternalGoatComponents.g:971:1: ruleFuncBlock : ( ( rule__FuncBlock__Group__0 ) ) ;
    public final void ruleFuncBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:975:2: ( ( ( rule__FuncBlock__Group__0 ) ) )
            // InternalGoatComponents.g:976:2: ( ( rule__FuncBlock__Group__0 ) )
            {
            // InternalGoatComponents.g:976:2: ( ( rule__FuncBlock__Group__0 ) )
            // InternalGoatComponents.g:977:3: ( rule__FuncBlock__Group__0 )
            {
             before(grammarAccess.getFuncBlockAccess().getGroup()); 
            // InternalGoatComponents.g:978:3: ( rule__FuncBlock__Group__0 )
            // InternalGoatComponents.g:978:4: rule__FuncBlock__Group__0
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
    // InternalGoatComponents.g:987:1: entryRuleFuncStatement : ruleFuncStatement EOF ;
    public final void entryRuleFuncStatement() throws RecognitionException {
        try {
            // InternalGoatComponents.g:988:1: ( ruleFuncStatement EOF )
            // InternalGoatComponents.g:989:1: ruleFuncStatement EOF
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
    // InternalGoatComponents.g:996:1: ruleFuncStatement : ( ( rule__FuncStatement__Alternatives ) ) ;
    public final void ruleFuncStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1000:2: ( ( ( rule__FuncStatement__Alternatives ) ) )
            // InternalGoatComponents.g:1001:2: ( ( rule__FuncStatement__Alternatives ) )
            {
            // InternalGoatComponents.g:1001:2: ( ( rule__FuncStatement__Alternatives ) )
            // InternalGoatComponents.g:1002:3: ( rule__FuncStatement__Alternatives )
            {
             before(grammarAccess.getFuncStatementAccess().getAlternatives()); 
            // InternalGoatComponents.g:1003:3: ( rule__FuncStatement__Alternatives )
            // InternalGoatComponents.g:1003:4: rule__FuncStatement__Alternatives
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
    // InternalGoatComponents.g:1012:1: entryRuleFuncVarDeclaration : ruleFuncVarDeclaration EOF ;
    public final void entryRuleFuncVarDeclaration() throws RecognitionException {
        try {
            // InternalGoatComponents.g:1013:1: ( ruleFuncVarDeclaration EOF )
            // InternalGoatComponents.g:1014:1: ruleFuncVarDeclaration EOF
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
    // InternalGoatComponents.g:1021:1: ruleFuncVarDeclaration : ( ( rule__FuncVarDeclaration__Group__0 ) ) ;
    public final void ruleFuncVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1025:2: ( ( ( rule__FuncVarDeclaration__Group__0 ) ) )
            // InternalGoatComponents.g:1026:2: ( ( rule__FuncVarDeclaration__Group__0 ) )
            {
            // InternalGoatComponents.g:1026:2: ( ( rule__FuncVarDeclaration__Group__0 ) )
            // InternalGoatComponents.g:1027:3: ( rule__FuncVarDeclaration__Group__0 )
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getGroup()); 
            // InternalGoatComponents.g:1028:3: ( rule__FuncVarDeclaration__Group__0 )
            // InternalGoatComponents.g:1028:4: rule__FuncVarDeclaration__Group__0
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
    // InternalGoatComponents.g:1037:1: entryRuleFuncVarAssign : ruleFuncVarAssign EOF ;
    public final void entryRuleFuncVarAssign() throws RecognitionException {
        try {
            // InternalGoatComponents.g:1038:1: ( ruleFuncVarAssign EOF )
            // InternalGoatComponents.g:1039:1: ruleFuncVarAssign EOF
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
    // InternalGoatComponents.g:1046:1: ruleFuncVarAssign : ( ( rule__FuncVarAssign__Group__0 ) ) ;
    public final void ruleFuncVarAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1050:2: ( ( ( rule__FuncVarAssign__Group__0 ) ) )
            // InternalGoatComponents.g:1051:2: ( ( rule__FuncVarAssign__Group__0 ) )
            {
            // InternalGoatComponents.g:1051:2: ( ( rule__FuncVarAssign__Group__0 ) )
            // InternalGoatComponents.g:1052:3: ( rule__FuncVarAssign__Group__0 )
            {
             before(grammarAccess.getFuncVarAssignAccess().getGroup()); 
            // InternalGoatComponents.g:1053:3: ( rule__FuncVarAssign__Group__0 )
            // InternalGoatComponents.g:1053:4: rule__FuncVarAssign__Group__0
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
    // InternalGoatComponents.g:1062:1: entryRuleFuncIfElse : ruleFuncIfElse EOF ;
    public final void entryRuleFuncIfElse() throws RecognitionException {
        try {
            // InternalGoatComponents.g:1063:1: ( ruleFuncIfElse EOF )
            // InternalGoatComponents.g:1064:1: ruleFuncIfElse EOF
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
    // InternalGoatComponents.g:1071:1: ruleFuncIfElse : ( ( rule__FuncIfElse__Group__0 ) ) ;
    public final void ruleFuncIfElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1075:2: ( ( ( rule__FuncIfElse__Group__0 ) ) )
            // InternalGoatComponents.g:1076:2: ( ( rule__FuncIfElse__Group__0 ) )
            {
            // InternalGoatComponents.g:1076:2: ( ( rule__FuncIfElse__Group__0 ) )
            // InternalGoatComponents.g:1077:3: ( rule__FuncIfElse__Group__0 )
            {
             before(grammarAccess.getFuncIfElseAccess().getGroup()); 
            // InternalGoatComponents.g:1078:3: ( rule__FuncIfElse__Group__0 )
            // InternalGoatComponents.g:1078:4: rule__FuncIfElse__Group__0
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
    // InternalGoatComponents.g:1087:1: entryRuleFuncReturn : ruleFuncReturn EOF ;
    public final void entryRuleFuncReturn() throws RecognitionException {
        try {
            // InternalGoatComponents.g:1088:1: ( ruleFuncReturn EOF )
            // InternalGoatComponents.g:1089:1: ruleFuncReturn EOF
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
    // InternalGoatComponents.g:1096:1: ruleFuncReturn : ( ( rule__FuncReturn__Group__0 ) ) ;
    public final void ruleFuncReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1100:2: ( ( ( rule__FuncReturn__Group__0 ) ) )
            // InternalGoatComponents.g:1101:2: ( ( rule__FuncReturn__Group__0 ) )
            {
            // InternalGoatComponents.g:1101:2: ( ( rule__FuncReturn__Group__0 ) )
            // InternalGoatComponents.g:1102:3: ( rule__FuncReturn__Group__0 )
            {
             before(grammarAccess.getFuncReturnAccess().getGroup()); 
            // InternalGoatComponents.g:1103:3: ( rule__FuncReturn__Group__0 )
            // InternalGoatComponents.g:1103:4: rule__FuncReturn__Group__0
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


    // $ANTLR start "rule__Model__Alternatives_3"
    // InternalGoatComponents.g:1111:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ProcessesAssignment_3_0 ) ) | ( ( rule__Model__ComponentsAssignment_3_1 ) ) | ( ( rule__Model__FunctionsAssignment_3_2 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1115:1: ( ( ( rule__Model__ProcessesAssignment_3_0 ) ) | ( ( rule__Model__ComponentsAssignment_3_1 ) ) | ( ( rule__Model__FunctionsAssignment_3_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 54:
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
                    // InternalGoatComponents.g:1116:2: ( ( rule__Model__ProcessesAssignment_3_0 ) )
                    {
                    // InternalGoatComponents.g:1116:2: ( ( rule__Model__ProcessesAssignment_3_0 ) )
                    // InternalGoatComponents.g:1117:3: ( rule__Model__ProcessesAssignment_3_0 )
                    {
                     before(grammarAccess.getModelAccess().getProcessesAssignment_3_0()); 
                    // InternalGoatComponents.g:1118:3: ( rule__Model__ProcessesAssignment_3_0 )
                    // InternalGoatComponents.g:1118:4: rule__Model__ProcessesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ProcessesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProcessesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponents.g:1122:2: ( ( rule__Model__ComponentsAssignment_3_1 ) )
                    {
                    // InternalGoatComponents.g:1122:2: ( ( rule__Model__ComponentsAssignment_3_1 ) )
                    // InternalGoatComponents.g:1123:3: ( rule__Model__ComponentsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getComponentsAssignment_3_1()); 
                    // InternalGoatComponents.g:1124:3: ( rule__Model__ComponentsAssignment_3_1 )
                    // InternalGoatComponents.g:1124:4: rule__Model__ComponentsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ComponentsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getComponentsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponents.g:1128:2: ( ( rule__Model__FunctionsAssignment_3_2 ) )
                    {
                    // InternalGoatComponents.g:1128:2: ( ( rule__Model__FunctionsAssignment_3_2 ) )
                    // InternalGoatComponents.g:1129:3: ( rule__Model__FunctionsAssignment_3_2 )
                    {
                     before(grammarAccess.getModelAccess().getFunctionsAssignment_3_2()); 
                    // InternalGoatComponents.g:1130:3: ( rule__Model__FunctionsAssignment_3_2 )
                    // InternalGoatComponents.g:1130:4: rule__Model__FunctionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__FunctionsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFunctionsAssignment_3_2()); 

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
    // $ANTLR end "rule__Model__Alternatives_3"


    // $ANTLR start "rule__Proc__Alternatives"
    // InternalGoatComponents.g:1138:1: rule__Proc__Alternatives : ( ( ruleInterleavingProcess ) | ( ruleNonDeterminismProcess ) );
    public final void rule__Proc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1142:1: ( ( ruleInterleavingProcess ) | ( ruleNonDeterminismProcess ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||(LA2_0>=25 && LA2_0<=26)||LA2_0==28||LA2_0==32||(LA2_0>=37 && LA2_0<=38)||LA2_0==41||LA2_0==43) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatComponents.g:1143:2: ( ruleInterleavingProcess )
                    {
                    // InternalGoatComponents.g:1143:2: ( ruleInterleavingProcess )
                    // InternalGoatComponents.g:1144:3: ruleInterleavingProcess
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
                    // InternalGoatComponents.g:1149:2: ( ruleNonDeterminismProcess )
                    {
                    // InternalGoatComponents.g:1149:2: ( ruleNonDeterminismProcess )
                    // InternalGoatComponents.g:1150:3: ruleNonDeterminismProcess
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
    // InternalGoatComponents.g:1159:1: rule__NonDeterminismProcess__Alternatives : ( ( rulePredOutputProcessOrInputProcesses ) | ( ruleIfProcesses ) | ( ruleNProcess ) );
    public final void rule__NonDeterminismProcess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1163:1: ( ( rulePredOutputProcessOrInputProcesses ) | ( ruleIfProcesses ) | ( ruleNProcess ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case EOF:
            case 25:
            case 28:
            case 32:
            case 38:
            case 41:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 26:
            case 43:
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
                    // InternalGoatComponents.g:1164:2: ( rulePredOutputProcessOrInputProcesses )
                    {
                    // InternalGoatComponents.g:1164:2: ( rulePredOutputProcessOrInputProcesses )
                    // InternalGoatComponents.g:1165:3: rulePredOutputProcessOrInputProcesses
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
                    // InternalGoatComponents.g:1170:2: ( ruleIfProcesses )
                    {
                    // InternalGoatComponents.g:1170:2: ( ruleIfProcesses )
                    // InternalGoatComponents.g:1171:3: ruleIfProcesses
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
                    // InternalGoatComponents.g:1176:2: ( ruleNProcess )
                    {
                    // InternalGoatComponents.g:1176:2: ( ruleNProcess )
                    // InternalGoatComponents.g:1177:3: ruleNProcess
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
    // InternalGoatComponents.g:1186:1: rule__Preconditions__PrecondAlternatives_1_0 : ( ( ruleUpdate ) | ( ruleAwareness ) );
    public final void rule__Preconditions__PrecondAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1190:1: ( ( ruleUpdate ) | ( ruleAwareness ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            else if ( (LA4_0==41) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGoatComponents.g:1191:2: ( ruleUpdate )
                    {
                    // InternalGoatComponents.g:1191:2: ( ruleUpdate )
                    // InternalGoatComponents.g:1192:3: ruleUpdate
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
                    // InternalGoatComponents.g:1197:2: ( ruleAwareness )
                    {
                    // InternalGoatComponents.g:1197:2: ( ruleAwareness )
                    // InternalGoatComponents.g:1198:3: ruleAwareness
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
    // InternalGoatComponents.g:1207:1: rule__PredOutputProcessOrInputProcesses__Alternatives_1 : ( ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) ) );
    public final void rule__PredOutputProcessOrInputProcesses__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1211:1: ( ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGoatComponents.g:1212:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) )
                    {
                    // InternalGoatComponents.g:1212:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 ) )
                    // InternalGoatComponents.g:1213:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup_1_0()); 
                    // InternalGoatComponents.g:1214:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0 )
                    // InternalGoatComponents.g:1214:4: rule__PredOutputProcessOrInputProcesses__Group_1_0__0
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
                    // InternalGoatComponents.g:1218:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) )
                    {
                    // InternalGoatComponents.g:1218:2: ( ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 ) )
                    // InternalGoatComponents.g:1219:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getGroup_1_1()); 
                    // InternalGoatComponents.g:1220:3: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0 )
                    // InternalGoatComponents.g:1220:4: rule__PredOutputProcessOrInputProcesses__Group_1_1__0
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
    // InternalGoatComponents.g:1228:1: rule__PredOutputProcessOrInputProcess__Alternatives_1 : ( ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) ) );
    public final void rule__PredOutputProcessOrInputProcess__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1232:1: ( ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) ) | ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoatComponents.g:1233:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) )
                    {
                    // InternalGoatComponents.g:1233:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 ) )
                    // InternalGoatComponents.g:1234:3: ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup_1_0()); 
                    // InternalGoatComponents.g:1235:3: ( rule__PredOutputProcessOrInputProcess__Group_1_0__0 )
                    // InternalGoatComponents.g:1235:4: rule__PredOutputProcessOrInputProcess__Group_1_0__0
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
                    // InternalGoatComponents.g:1239:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) )
                    {
                    // InternalGoatComponents.g:1239:2: ( ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 ) )
                    // InternalGoatComponents.g:1240:3: ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 )
                    {
                     before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getGroup_1_1()); 
                    // InternalGoatComponents.g:1241:3: ( rule__PredOutputProcessOrInputProcess__Group_1_1__0 )
                    // InternalGoatComponents.g:1241:4: rule__PredOutputProcessOrInputProcess__Group_1_1__0
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
    // InternalGoatComponents.g:1249:1: rule__NZCProcess__Alternatives : ( ( ( rule__NZCProcess__Group_0__0 ) ) | ( ruleZeroProcess ) | ( ruleCallProcess ) );
    public final void rule__NZCProcess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1253:1: ( ( ( rule__NZCProcess__Group_0__0 ) ) | ( ruleZeroProcess ) | ( ruleCallProcess ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 43:
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
                    // InternalGoatComponents.g:1254:2: ( ( rule__NZCProcess__Group_0__0 ) )
                    {
                    // InternalGoatComponents.g:1254:2: ( ( rule__NZCProcess__Group_0__0 ) )
                    // InternalGoatComponents.g:1255:3: ( rule__NZCProcess__Group_0__0 )
                    {
                     before(grammarAccess.getNZCProcessAccess().getGroup_0()); 
                    // InternalGoatComponents.g:1256:3: ( rule__NZCProcess__Group_0__0 )
                    // InternalGoatComponents.g:1256:4: rule__NZCProcess__Group_0__0
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
                    // InternalGoatComponents.g:1260:2: ( ruleZeroProcess )
                    {
                    // InternalGoatComponents.g:1260:2: ( ruleZeroProcess )
                    // InternalGoatComponents.g:1261:3: ruleZeroProcess
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
                    // InternalGoatComponents.g:1266:2: ( ruleCallProcess )
                    {
                    // InternalGoatComponents.g:1266:2: ( ruleCallProcess )
                    // InternalGoatComponents.g:1267:3: ruleCallProcess
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
    // InternalGoatComponents.g:1276:1: rule__NProcess__Alternatives : ( ( ( rule__NProcess__Group_0__0 ) ) | ( ruleZeroProcess ) );
    public final void rule__NProcess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1280:1: ( ( ( rule__NProcess__Group_0__0 ) ) | ( ruleZeroProcess ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==43) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoatComponents.g:1281:2: ( ( rule__NProcess__Group_0__0 ) )
                    {
                    // InternalGoatComponents.g:1281:2: ( ( rule__NProcess__Group_0__0 ) )
                    // InternalGoatComponents.g:1282:3: ( rule__NProcess__Group_0__0 )
                    {
                     before(grammarAccess.getNProcessAccess().getGroup_0()); 
                    // InternalGoatComponents.g:1283:3: ( rule__NProcess__Group_0__0 )
                    // InternalGoatComponents.g:1283:4: rule__NProcess__Group_0__0
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
                    // InternalGoatComponents.g:1287:2: ( ruleZeroProcess )
                    {
                    // InternalGoatComponents.g:1287:2: ( ruleZeroProcess )
                    // InternalGoatComponents.g:1288:3: ruleZeroProcess
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
    // InternalGoatComponents.g:1297:1: rule__EnvInitValue__Alternatives : ( ( ( rule__EnvInitValue__Group_0__0 ) ) | ( ( rule__EnvInitValue__Group_1__0 ) ) | ( ( rule__EnvInitValue__Group_2__0 ) ) );
    public final void rule__EnvInitValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1301:1: ( ( ( rule__EnvInitValue__Group_0__0 ) ) | ( ( rule__EnvInitValue__Group_1__0 ) ) | ( ( rule__EnvInitValue__Group_2__0 ) ) )
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
            case 12:
            case 13:
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
                    // InternalGoatComponents.g:1302:2: ( ( rule__EnvInitValue__Group_0__0 ) )
                    {
                    // InternalGoatComponents.g:1302:2: ( ( rule__EnvInitValue__Group_0__0 ) )
                    // InternalGoatComponents.g:1303:3: ( rule__EnvInitValue__Group_0__0 )
                    {
                     before(grammarAccess.getEnvInitValueAccess().getGroup_0()); 
                    // InternalGoatComponents.g:1304:3: ( rule__EnvInitValue__Group_0__0 )
                    // InternalGoatComponents.g:1304:4: rule__EnvInitValue__Group_0__0
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
                    // InternalGoatComponents.g:1308:2: ( ( rule__EnvInitValue__Group_1__0 ) )
                    {
                    // InternalGoatComponents.g:1308:2: ( ( rule__EnvInitValue__Group_1__0 ) )
                    // InternalGoatComponents.g:1309:3: ( rule__EnvInitValue__Group_1__0 )
                    {
                     before(grammarAccess.getEnvInitValueAccess().getGroup_1()); 
                    // InternalGoatComponents.g:1310:3: ( rule__EnvInitValue__Group_1__0 )
                    // InternalGoatComponents.g:1310:4: rule__EnvInitValue__Group_1__0
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
                    // InternalGoatComponents.g:1314:2: ( ( rule__EnvInitValue__Group_2__0 ) )
                    {
                    // InternalGoatComponents.g:1314:2: ( ( rule__EnvInitValue__Group_2__0 ) )
                    // InternalGoatComponents.g:1315:3: ( rule__EnvInitValue__Group_2__0 )
                    {
                     before(grammarAccess.getEnvInitValueAccess().getGroup_2()); 
                    // InternalGoatComponents.g:1316:3: ( rule__EnvInitValue__Group_2__0 )
                    // InternalGoatComponents.g:1316:4: rule__EnvInitValue__Group_2__0
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
    // InternalGoatComponents.g:1324:1: rule__EnvInitValue__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EnvInitValue__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1328:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==13) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGoatComponents.g:1329:2: ( 'true' )
                    {
                    // InternalGoatComponents.g:1329:2: ( 'true' )
                    // InternalGoatComponents.g:1330:3: 'true'
                    {
                     before(grammarAccess.getEnvInitValueAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEnvInitValueAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponents.g:1335:2: ( 'false' )
                    {
                    // InternalGoatComponents.g:1335:2: ( 'false' )
                    // InternalGoatComponents.g:1336:3: 'false'
                    {
                     before(grammarAccess.getEnvInitValueAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalGoatComponents.g:1345:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1349:1: ( ( '==' ) | ( '!=' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoatComponents.g:1350:2: ( '==' )
                    {
                    // InternalGoatComponents.g:1350:2: ( '==' )
                    // InternalGoatComponents.g:1351:3: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponents.g:1356:2: ( '!=' )
                    {
                    // InternalGoatComponents.g:1356:2: ( '!=' )
                    // InternalGoatComponents.g:1357:3: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalGoatComponents.g:1366:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1370:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt12=1;
                }
                break;
            case 17:
                {
                alt12=2;
                }
                break;
            case 18:
                {
                alt12=3;
                }
                break;
            case 19:
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
                    // InternalGoatComponents.g:1371:2: ( '>=' )
                    {
                    // InternalGoatComponents.g:1371:2: ( '>=' )
                    // InternalGoatComponents.g:1372:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponents.g:1377:2: ( '<=' )
                    {
                    // InternalGoatComponents.g:1377:2: ( '<=' )
                    // InternalGoatComponents.g:1378:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoatComponents.g:1383:2: ( '>' )
                    {
                    // InternalGoatComponents.g:1383:2: ( '>' )
                    // InternalGoatComponents.g:1384:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGoatComponents.g:1389:2: ( '<' )
                    {
                    // InternalGoatComponents.g:1389:2: ( '<' )
                    // InternalGoatComponents.g:1390:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalGoatComponents.g:1399:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_2__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1403:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 49:
                {
                alt13=2;
                }
                break;
            case 50:
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
                    // InternalGoatComponents.g:1404:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalGoatComponents.g:1404:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalGoatComponents.g:1405:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalGoatComponents.g:1406:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalGoatComponents.g:1406:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalGoatComponents.g:1410:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalGoatComponents.g:1410:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalGoatComponents.g:1411:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalGoatComponents.g:1412:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalGoatComponents.g:1412:4: rule__PlusOrMinus__Group_1_0_1__0
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
                    // InternalGoatComponents.g:1416:2: ( ( rule__PlusOrMinus__Group_1_0_2__0 ) )
                    {
                    // InternalGoatComponents.g:1416:2: ( ( rule__PlusOrMinus__Group_1_0_2__0 ) )
                    // InternalGoatComponents.g:1417:3: ( rule__PlusOrMinus__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_2()); 
                    // InternalGoatComponents.g:1418:3: ( rule__PlusOrMinus__Group_1_0_2__0 )
                    // InternalGoatComponents.g:1418:4: rule__PlusOrMinus__Group_1_0_2__0
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
    // InternalGoatComponents.g:1426:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1430:1: ( ( '*' ) | ( '/' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==21) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGoatComponents.g:1431:2: ( '*' )
                    {
                    // InternalGoatComponents.g:1431:2: ( '*' )
                    // InternalGoatComponents.g:1432:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponents.g:1437:2: ( '/' )
                    {
                    // InternalGoatComponents.g:1437:2: ( '/' )
                    // InternalGoatComponents.g:1438:3: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalGoatComponents.g:1447:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1451:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt15=1;
                }
                break;
            case 51:
                {
                alt15=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 12:
            case 13:
            case 44:
            case 52:
            case 53:
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
                    // InternalGoatComponents.g:1452:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalGoatComponents.g:1452:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalGoatComponents.g:1453:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalGoatComponents.g:1454:3: ( rule__Primary__Group_0__0 )
                    // InternalGoatComponents.g:1454:4: rule__Primary__Group_0__0
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
                    // InternalGoatComponents.g:1458:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalGoatComponents.g:1458:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalGoatComponents.g:1459:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalGoatComponents.g:1460:3: ( rule__Primary__Group_1__0 )
                    // InternalGoatComponents.g:1460:4: rule__Primary__Group_1__0
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
                    // InternalGoatComponents.g:1464:2: ( ruleAtomic )
                    {
                    // InternalGoatComponents.g:1464:2: ( ruleAtomic )
                    // InternalGoatComponents.g:1465:3: ruleAtomic
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
    // InternalGoatComponents.g:1474:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1478:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) )
            int alt16=8;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalGoatComponents.g:1479:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalGoatComponents.g:1479:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalGoatComponents.g:1480:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalGoatComponents.g:1481:3: ( rule__Atomic__Group_0__0 )
                    // InternalGoatComponents.g:1481:4: rule__Atomic__Group_0__0
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
                    // InternalGoatComponents.g:1485:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalGoatComponents.g:1485:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalGoatComponents.g:1486:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalGoatComponents.g:1487:3: ( rule__Atomic__Group_1__0 )
                    // InternalGoatComponents.g:1487:4: rule__Atomic__Group_1__0
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
                    // InternalGoatComponents.g:1491:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalGoatComponents.g:1491:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalGoatComponents.g:1492:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalGoatComponents.g:1493:3: ( rule__Atomic__Group_2__0 )
                    // InternalGoatComponents.g:1493:4: rule__Atomic__Group_2__0
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
                    // InternalGoatComponents.g:1497:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalGoatComponents.g:1497:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalGoatComponents.g:1498:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalGoatComponents.g:1499:3: ( rule__Atomic__Group_3__0 )
                    // InternalGoatComponents.g:1499:4: rule__Atomic__Group_3__0
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
                    // InternalGoatComponents.g:1503:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalGoatComponents.g:1503:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalGoatComponents.g:1504:3: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // InternalGoatComponents.g:1505:3: ( rule__Atomic__Group_4__0 )
                    // InternalGoatComponents.g:1505:4: rule__Atomic__Group_4__0
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
                    // InternalGoatComponents.g:1509:2: ( ( rule__Atomic__Group_5__0 ) )
                    {
                    // InternalGoatComponents.g:1509:2: ( ( rule__Atomic__Group_5__0 ) )
                    // InternalGoatComponents.g:1510:3: ( rule__Atomic__Group_5__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_5()); 
                    // InternalGoatComponents.g:1511:3: ( rule__Atomic__Group_5__0 )
                    // InternalGoatComponents.g:1511:4: rule__Atomic__Group_5__0
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
                    // InternalGoatComponents.g:1515:2: ( ( rule__Atomic__Group_6__0 ) )
                    {
                    // InternalGoatComponents.g:1515:2: ( ( rule__Atomic__Group_6__0 ) )
                    // InternalGoatComponents.g:1516:3: ( rule__Atomic__Group_6__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_6()); 
                    // InternalGoatComponents.g:1517:3: ( rule__Atomic__Group_6__0 )
                    // InternalGoatComponents.g:1517:4: rule__Atomic__Group_6__0
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
                    // InternalGoatComponents.g:1521:2: ( ( rule__Atomic__Group_7__0 ) )
                    {
                    // InternalGoatComponents.g:1521:2: ( ( rule__Atomic__Group_7__0 ) )
                    // InternalGoatComponents.g:1522:3: ( rule__Atomic__Group_7__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_7()); 
                    // InternalGoatComponents.g:1523:3: ( rule__Atomic__Group_7__0 )
                    // InternalGoatComponents.g:1523:4: rule__Atomic__Group_7__0
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
    // InternalGoatComponents.g:1531:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1535:1: ( ( 'true' ) | ( 'false' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            else if ( (LA17_0==13) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGoatComponents.g:1536:2: ( 'true' )
                    {
                    // InternalGoatComponents.g:1536:2: ( 'true' )
                    // InternalGoatComponents.g:1537:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoatComponents.g:1542:2: ( 'false' )
                    {
                    // InternalGoatComponents.g:1542:2: ( 'false' )
                    // InternalGoatComponents.g:1543:3: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalGoatComponents.g:1552:1: rule__AttributeToSet__Alternatives : ( ( ( rule__AttributeToSet__Group_0__0 ) ) | ( ( rule__AttributeToSet__Group_1__0 ) ) );
    public final void rule__AttributeToSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1556:1: ( ( ( rule__AttributeToSet__Group_0__0 ) ) | ( ( rule__AttributeToSet__Group_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52) ) {
                alt18=1;
            }
            else if ( (LA18_0==44) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGoatComponents.g:1557:2: ( ( rule__AttributeToSet__Group_0__0 ) )
                    {
                    // InternalGoatComponents.g:1557:2: ( ( rule__AttributeToSet__Group_0__0 ) )
                    // InternalGoatComponents.g:1558:3: ( rule__AttributeToSet__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeToSetAccess().getGroup_0()); 
                    // InternalGoatComponents.g:1559:3: ( rule__AttributeToSet__Group_0__0 )
                    // InternalGoatComponents.g:1559:4: rule__AttributeToSet__Group_0__0
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
                    // InternalGoatComponents.g:1563:2: ( ( rule__AttributeToSet__Group_1__0 ) )
                    {
                    // InternalGoatComponents.g:1563:2: ( ( rule__AttributeToSet__Group_1__0 ) )
                    // InternalGoatComponents.g:1564:3: ( rule__AttributeToSet__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeToSetAccess().getGroup_1()); 
                    // InternalGoatComponents.g:1565:3: ( rule__AttributeToSet__Group_1__0 )
                    // InternalGoatComponents.g:1565:4: rule__AttributeToSet__Group_1__0
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
    // InternalGoatComponents.g:1573:1: rule__FuncStatement__Alternatives : ( ( ruleFuncVarAssign ) | ( ruleFuncIfElse ) | ( ruleFuncReturn ) | ( ruleFuncVarDeclaration ) );
    public final void rule__FuncStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1577:1: ( ( ruleFuncVarAssign ) | ( ruleFuncIfElse ) | ( ruleFuncReturn ) | ( ruleFuncVarDeclaration ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 56:
                {
                alt19=3;
                }
                break;
            case 55:
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
                    // InternalGoatComponents.g:1578:2: ( ruleFuncVarAssign )
                    {
                    // InternalGoatComponents.g:1578:2: ( ruleFuncVarAssign )
                    // InternalGoatComponents.g:1579:3: ruleFuncVarAssign
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
                    // InternalGoatComponents.g:1584:2: ( ruleFuncIfElse )
                    {
                    // InternalGoatComponents.g:1584:2: ( ruleFuncIfElse )
                    // InternalGoatComponents.g:1585:3: ruleFuncIfElse
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
                    // InternalGoatComponents.g:1590:2: ( ruleFuncReturn )
                    {
                    // InternalGoatComponents.g:1590:2: ( ruleFuncReturn )
                    // InternalGoatComponents.g:1591:3: ruleFuncReturn
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
                    // InternalGoatComponents.g:1596:2: ( ruleFuncVarDeclaration )
                    {
                    // InternalGoatComponents.g:1596:2: ( ruleFuncVarDeclaration )
                    // InternalGoatComponents.g:1597:3: ruleFuncVarDeclaration
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
    // InternalGoatComponents.g:1606:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1610:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGoatComponents.g:1611:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalGoatComponents.g:1618:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1622:1: ( ( () ) )
            // InternalGoatComponents.g:1623:1: ( () )
            {
            // InternalGoatComponents.g:1623:1: ( () )
            // InternalGoatComponents.g:1624:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalGoatComponents.g:1625:2: ()
            // InternalGoatComponents.g:1625:3: 
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
    // InternalGoatComponents.g:1633:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1637:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalGoatComponents.g:1638:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
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
    // InternalGoatComponents.g:1645:1: rule__Model__Group__1__Impl : ( 'infrastructure' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1649:1: ( ( 'infrastructure' ) )
            // InternalGoatComponents.g:1650:1: ( 'infrastructure' )
            {
            // InternalGoatComponents.g:1650:1: ( 'infrastructure' )
            // InternalGoatComponents.g:1651:2: 'infrastructure'
            {
             before(grammarAccess.getModelAccess().getInfrastructureKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getInfrastructureKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__2"
    // InternalGoatComponents.g:1660:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1664:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalGoatComponents.g:1665:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalGoatComponents.g:1672:1: rule__Model__Group__2__Impl : ( ( rule__Model__InfrastructureAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1676:1: ( ( ( rule__Model__InfrastructureAssignment_2 ) ) )
            // InternalGoatComponents.g:1677:1: ( ( rule__Model__InfrastructureAssignment_2 ) )
            {
            // InternalGoatComponents.g:1677:1: ( ( rule__Model__InfrastructureAssignment_2 ) )
            // InternalGoatComponents.g:1678:2: ( rule__Model__InfrastructureAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getInfrastructureAssignment_2()); 
            // InternalGoatComponents.g:1679:2: ( rule__Model__InfrastructureAssignment_2 )
            // InternalGoatComponents.g:1679:3: rule__Model__InfrastructureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__InfrastructureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getInfrastructureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalGoatComponents.g:1687:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1691:1: ( rule__Model__Group__3__Impl )
            // InternalGoatComponents.g:1692:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalGoatComponents.g:1698:1: rule__Model__Group__3__Impl : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1702:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // InternalGoatComponents.g:1703:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // InternalGoatComponents.g:1703:1: ( ( rule__Model__Alternatives_3 )* )
            // InternalGoatComponents.g:1704:2: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // InternalGoatComponents.g:1705:2: ( rule__Model__Alternatives_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==44||LA20_0==46||LA20_0==54) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGoatComponents.g:1705:3: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__InterleavingProcess__Group__0"
    // InternalGoatComponents.g:1714:1: rule__InterleavingProcess__Group__0 : rule__InterleavingProcess__Group__0__Impl rule__InterleavingProcess__Group__1 ;
    public final void rule__InterleavingProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1718:1: ( rule__InterleavingProcess__Group__0__Impl rule__InterleavingProcess__Group__1 )
            // InternalGoatComponents.g:1719:2: rule__InterleavingProcess__Group__0__Impl rule__InterleavingProcess__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGoatComponents.g:1726:1: rule__InterleavingProcess__Group__0__Impl : ( ruleCallProcess ) ;
    public final void rule__InterleavingProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1730:1: ( ( ruleCallProcess ) )
            // InternalGoatComponents.g:1731:1: ( ruleCallProcess )
            {
            // InternalGoatComponents.g:1731:1: ( ruleCallProcess )
            // InternalGoatComponents.g:1732:2: ruleCallProcess
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
    // InternalGoatComponents.g:1741:1: rule__InterleavingProcess__Group__1 : rule__InterleavingProcess__Group__1__Impl rule__InterleavingProcess__Group__2 ;
    public final void rule__InterleavingProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1745:1: ( rule__InterleavingProcess__Group__1__Impl rule__InterleavingProcess__Group__2 )
            // InternalGoatComponents.g:1746:2: rule__InterleavingProcess__Group__1__Impl rule__InterleavingProcess__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalGoatComponents.g:1753:1: rule__InterleavingProcess__Group__1__Impl : ( () ) ;
    public final void rule__InterleavingProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1757:1: ( ( () ) )
            // InternalGoatComponents.g:1758:1: ( () )
            {
            // InternalGoatComponents.g:1758:1: ( () )
            // InternalGoatComponents.g:1759:2: ()
            {
             before(grammarAccess.getInterleavingProcessAccess().getInterleavingProcessSubProcsAction_1()); 
            // InternalGoatComponents.g:1760:2: ()
            // InternalGoatComponents.g:1760:3: 
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
    // InternalGoatComponents.g:1768:1: rule__InterleavingProcess__Group__2 : rule__InterleavingProcess__Group__2__Impl ;
    public final void rule__InterleavingProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1772:1: ( rule__InterleavingProcess__Group__2__Impl )
            // InternalGoatComponents.g:1773:2: rule__InterleavingProcess__Group__2__Impl
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
    // InternalGoatComponents.g:1779:1: rule__InterleavingProcess__Group__2__Impl : ( ( rule__InterleavingProcess__Group_2__0 )* ) ;
    public final void rule__InterleavingProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1783:1: ( ( ( rule__InterleavingProcess__Group_2__0 )* ) )
            // InternalGoatComponents.g:1784:1: ( ( rule__InterleavingProcess__Group_2__0 )* )
            {
            // InternalGoatComponents.g:1784:1: ( ( rule__InterleavingProcess__Group_2__0 )* )
            // InternalGoatComponents.g:1785:2: ( rule__InterleavingProcess__Group_2__0 )*
            {
             before(grammarAccess.getInterleavingProcessAccess().getGroup_2()); 
            // InternalGoatComponents.g:1786:2: ( rule__InterleavingProcess__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGoatComponents.g:1786:3: rule__InterleavingProcess__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalGoatComponents.g:1795:1: rule__InterleavingProcess__Group_2__0 : rule__InterleavingProcess__Group_2__0__Impl rule__InterleavingProcess__Group_2__1 ;
    public final void rule__InterleavingProcess__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1799:1: ( rule__InterleavingProcess__Group_2__0__Impl rule__InterleavingProcess__Group_2__1 )
            // InternalGoatComponents.g:1800:2: rule__InterleavingProcess__Group_2__0__Impl rule__InterleavingProcess__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:1807:1: rule__InterleavingProcess__Group_2__0__Impl : ( '|' ) ;
    public final void rule__InterleavingProcess__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1811:1: ( ( '|' ) )
            // InternalGoatComponents.g:1812:1: ( '|' )
            {
            // InternalGoatComponents.g:1812:1: ( '|' )
            // InternalGoatComponents.g:1813:2: '|'
            {
             before(grammarAccess.getInterleavingProcessAccess().getVerticalLineKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGoatComponents.g:1822:1: rule__InterleavingProcess__Group_2__1 : rule__InterleavingProcess__Group_2__1__Impl ;
    public final void rule__InterleavingProcess__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1826:1: ( rule__InterleavingProcess__Group_2__1__Impl )
            // InternalGoatComponents.g:1827:2: rule__InterleavingProcess__Group_2__1__Impl
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
    // InternalGoatComponents.g:1833:1: rule__InterleavingProcess__Group_2__1__Impl : ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) ) ;
    public final void rule__InterleavingProcess__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1837:1: ( ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) ) )
            // InternalGoatComponents.g:1838:1: ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) )
            {
            // InternalGoatComponents.g:1838:1: ( ( rule__InterleavingProcess__SubProcsAssignment_2_1 ) )
            // InternalGoatComponents.g:1839:2: ( rule__InterleavingProcess__SubProcsAssignment_2_1 )
            {
             before(grammarAccess.getInterleavingProcessAccess().getSubProcsAssignment_2_1()); 
            // InternalGoatComponents.g:1840:2: ( rule__InterleavingProcess__SubProcsAssignment_2_1 )
            // InternalGoatComponents.g:1840:3: rule__InterleavingProcess__SubProcsAssignment_2_1
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
    // InternalGoatComponents.g:1849:1: rule__Preconditions__Group__0 : rule__Preconditions__Group__0__Impl rule__Preconditions__Group__1 ;
    public final void rule__Preconditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1853:1: ( rule__Preconditions__Group__0__Impl rule__Preconditions__Group__1 )
            // InternalGoatComponents.g:1854:2: rule__Preconditions__Group__0__Impl rule__Preconditions__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGoatComponents.g:1861:1: rule__Preconditions__Group__0__Impl : ( () ) ;
    public final void rule__Preconditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1865:1: ( ( () ) )
            // InternalGoatComponents.g:1866:1: ( () )
            {
            // InternalGoatComponents.g:1866:1: ( () )
            // InternalGoatComponents.g:1867:2: ()
            {
             before(grammarAccess.getPreconditionsAccess().getPreconditionsAction_0()); 
            // InternalGoatComponents.g:1868:2: ()
            // InternalGoatComponents.g:1868:3: 
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
    // InternalGoatComponents.g:1876:1: rule__Preconditions__Group__1 : rule__Preconditions__Group__1__Impl ;
    public final void rule__Preconditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1880:1: ( rule__Preconditions__Group__1__Impl )
            // InternalGoatComponents.g:1881:2: rule__Preconditions__Group__1__Impl
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
    // InternalGoatComponents.g:1887:1: rule__Preconditions__Group__1__Impl : ( ( rule__Preconditions__PrecondAssignment_1 )* ) ;
    public final void rule__Preconditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1891:1: ( ( ( rule__Preconditions__PrecondAssignment_1 )* ) )
            // InternalGoatComponents.g:1892:1: ( ( rule__Preconditions__PrecondAssignment_1 )* )
            {
            // InternalGoatComponents.g:1892:1: ( ( rule__Preconditions__PrecondAssignment_1 )* )
            // InternalGoatComponents.g:1893:2: ( rule__Preconditions__PrecondAssignment_1 )*
            {
             before(grammarAccess.getPreconditionsAccess().getPrecondAssignment_1()); 
            // InternalGoatComponents.g:1894:2: ( rule__Preconditions__PrecondAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38||LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGoatComponents.g:1894:3: rule__Preconditions__PrecondAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalGoatComponents.g:1903:1: rule__PredOutputProcessOrInputProcesses__Group__0 : rule__PredOutputProcessOrInputProcesses__Group__0__Impl rule__PredOutputProcessOrInputProcesses__Group__1 ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1907:1: ( rule__PredOutputProcessOrInputProcesses__Group__0__Impl rule__PredOutputProcessOrInputProcesses__Group__1 )
            // InternalGoatComponents.g:1908:2: rule__PredOutputProcessOrInputProcesses__Group__0__Impl rule__PredOutputProcessOrInputProcesses__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGoatComponents.g:1915:1: rule__PredOutputProcessOrInputProcesses__Group__0__Impl : ( rulePreconditions ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1919:1: ( ( rulePreconditions ) )
            // InternalGoatComponents.g:1920:1: ( rulePreconditions )
            {
            // InternalGoatComponents.g:1920:1: ( rulePreconditions )
            // InternalGoatComponents.g:1921:2: rulePreconditions
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
    // InternalGoatComponents.g:1930:1: rule__PredOutputProcessOrInputProcesses__Group__1 : rule__PredOutputProcessOrInputProcesses__Group__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1934:1: ( rule__PredOutputProcessOrInputProcesses__Group__1__Impl )
            // InternalGoatComponents.g:1935:2: rule__PredOutputProcessOrInputProcesses__Group__1__Impl
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
    // InternalGoatComponents.g:1941:1: rule__PredOutputProcessOrInputProcesses__Group__1__Impl : ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1945:1: ( ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) ) )
            // InternalGoatComponents.g:1946:1: ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) )
            {
            // InternalGoatComponents.g:1946:1: ( ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 ) )
            // InternalGoatComponents.g:1947:2: ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getAlternatives_1()); 
            // InternalGoatComponents.g:1948:2: ( rule__PredOutputProcessOrInputProcesses__Alternatives_1 )
            // InternalGoatComponents.g:1948:3: rule__PredOutputProcessOrInputProcesses__Alternatives_1
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
    // InternalGoatComponents.g:1957:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__0 : rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_0__1 ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1961:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_0__1 )
            // InternalGoatComponents.g:1962:2: rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGoatComponents.g:1969:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1973:1: ( ( () ) )
            // InternalGoatComponents.g:1974:1: ( () )
            {
            // InternalGoatComponents.g:1974:1: ( () )
            // InternalGoatComponents.g:1975:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getOutputProcessPrecondAction_1_0_0()); 
            // InternalGoatComponents.g:1976:2: ()
            // InternalGoatComponents.g:1976:3: 
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
    // InternalGoatComponents.g:1984:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__1 : rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1988:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl )
            // InternalGoatComponents.g:1989:2: rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl
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
    // InternalGoatComponents.g:1995:1: rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl : ( ruleOutputProcessPart ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:1999:1: ( ( ruleOutputProcessPart ) )
            // InternalGoatComponents.g:2000:1: ( ruleOutputProcessPart )
            {
            // InternalGoatComponents.g:2000:1: ( ruleOutputProcessPart )
            // InternalGoatComponents.g:2001:2: ruleOutputProcessPart
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
    // InternalGoatComponents.g:2011:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__0 : rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_1__1 ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2015:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_1__1 )
            // InternalGoatComponents.g:2016:2: rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcesses__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGoatComponents.g:2023:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2027:1: ( ( () ) )
            // InternalGoatComponents.g:2028:1: ( () )
            {
            // InternalGoatComponents.g:2028:1: ( () )
            // InternalGoatComponents.g:2029:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessesAccess().getInputProcessesPrecondsAction_1_1_0()); 
            // InternalGoatComponents.g:2030:2: ()
            // InternalGoatComponents.g:2030:3: 
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
    // InternalGoatComponents.g:2038:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__1 : rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2042:1: ( rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl )
            // InternalGoatComponents.g:2043:2: rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl
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
    // InternalGoatComponents.g:2049:1: rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl : ( ruleInputProcessesPart ) ;
    public final void rule__PredOutputProcessOrInputProcesses__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2053:1: ( ( ruleInputProcessesPart ) )
            // InternalGoatComponents.g:2054:1: ( ruleInputProcessesPart )
            {
            // InternalGoatComponents.g:2054:1: ( ruleInputProcessesPart )
            // InternalGoatComponents.g:2055:2: ruleInputProcessesPart
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
    // InternalGoatComponents.g:2065:1: rule__PredOutputProcessOrInputProcess__Group__0 : rule__PredOutputProcessOrInputProcess__Group__0__Impl rule__PredOutputProcessOrInputProcess__Group__1 ;
    public final void rule__PredOutputProcessOrInputProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2069:1: ( rule__PredOutputProcessOrInputProcess__Group__0__Impl rule__PredOutputProcessOrInputProcess__Group__1 )
            // InternalGoatComponents.g:2070:2: rule__PredOutputProcessOrInputProcess__Group__0__Impl rule__PredOutputProcessOrInputProcess__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGoatComponents.g:2077:1: rule__PredOutputProcessOrInputProcess__Group__0__Impl : ( rulePreconditions ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2081:1: ( ( rulePreconditions ) )
            // InternalGoatComponents.g:2082:1: ( rulePreconditions )
            {
            // InternalGoatComponents.g:2082:1: ( rulePreconditions )
            // InternalGoatComponents.g:2083:2: rulePreconditions
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
    // InternalGoatComponents.g:2092:1: rule__PredOutputProcessOrInputProcess__Group__1 : rule__PredOutputProcessOrInputProcess__Group__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2096:1: ( rule__PredOutputProcessOrInputProcess__Group__1__Impl )
            // InternalGoatComponents.g:2097:2: rule__PredOutputProcessOrInputProcess__Group__1__Impl
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
    // InternalGoatComponents.g:2103:1: rule__PredOutputProcessOrInputProcess__Group__1__Impl : ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2107:1: ( ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) ) )
            // InternalGoatComponents.g:2108:1: ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) )
            {
            // InternalGoatComponents.g:2108:1: ( ( rule__PredOutputProcessOrInputProcess__Alternatives_1 ) )
            // InternalGoatComponents.g:2109:2: ( rule__PredOutputProcessOrInputProcess__Alternatives_1 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getAlternatives_1()); 
            // InternalGoatComponents.g:2110:2: ( rule__PredOutputProcessOrInputProcess__Alternatives_1 )
            // InternalGoatComponents.g:2110:3: rule__PredOutputProcessOrInputProcess__Alternatives_1
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
    // InternalGoatComponents.g:2119:1: rule__PredOutputProcessOrInputProcess__Group_1_0__0 : rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_0__1 ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2123:1: ( rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_0__1 )
            // InternalGoatComponents.g:2124:2: rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGoatComponents.g:2131:1: rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2135:1: ( ( () ) )
            // InternalGoatComponents.g:2136:1: ( () )
            {
            // InternalGoatComponents.g:2136:1: ( () )
            // InternalGoatComponents.g:2137:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getOutputProcessPrecondAction_1_0_0()); 
            // InternalGoatComponents.g:2138:2: ()
            // InternalGoatComponents.g:2138:3: 
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
    // InternalGoatComponents.g:2146:1: rule__PredOutputProcessOrInputProcess__Group_1_0__1 : rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2150:1: ( rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl )
            // InternalGoatComponents.g:2151:2: rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl
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
    // InternalGoatComponents.g:2157:1: rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl : ( ruleOutputProcessPart ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2161:1: ( ( ruleOutputProcessPart ) )
            // InternalGoatComponents.g:2162:1: ( ruleOutputProcessPart )
            {
            // InternalGoatComponents.g:2162:1: ( ruleOutputProcessPart )
            // InternalGoatComponents.g:2163:2: ruleOutputProcessPart
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
    // InternalGoatComponents.g:2173:1: rule__PredOutputProcessOrInputProcess__Group_1_1__0 : rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_1__1 ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2177:1: ( rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_1__1 )
            // InternalGoatComponents.g:2178:2: rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl rule__PredOutputProcessOrInputProcess__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGoatComponents.g:2185:1: rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2189:1: ( ( () ) )
            // InternalGoatComponents.g:2190:1: ( () )
            {
            // InternalGoatComponents.g:2190:1: ( () )
            // InternalGoatComponents.g:2191:2: ()
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputProcessesPrecondsAction_1_1_0()); 
            // InternalGoatComponents.g:2192:2: ()
            // InternalGoatComponents.g:2192:3: 
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
    // InternalGoatComponents.g:2200:1: rule__PredOutputProcessOrInputProcess__Group_1_1__1 : rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2204:1: ( rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl )
            // InternalGoatComponents.g:2205:2: rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl
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
    // InternalGoatComponents.g:2211:1: rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl : ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) ) ;
    public final void rule__PredOutputProcessOrInputProcess__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2215:1: ( ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) ) )
            // InternalGoatComponents.g:2216:1: ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) )
            {
            // InternalGoatComponents.g:2216:1: ( ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 ) )
            // InternalGoatComponents.g:2217:2: ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 )
            {
             before(grammarAccess.getPredOutputProcessOrInputProcessAccess().getInputsAssignment_1_1_1()); 
            // InternalGoatComponents.g:2218:2: ( rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 )
            // InternalGoatComponents.g:2218:3: rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1
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
    // InternalGoatComponents.g:2227:1: rule__InputProcessesPart__Group__0 : rule__InputProcessesPart__Group__0__Impl rule__InputProcessesPart__Group__1 ;
    public final void rule__InputProcessesPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2231:1: ( rule__InputProcessesPart__Group__0__Impl rule__InputProcessesPart__Group__1 )
            // InternalGoatComponents.g:2232:2: rule__InputProcessesPart__Group__0__Impl rule__InputProcessesPart__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalGoatComponents.g:2239:1: rule__InputProcessesPart__Group__0__Impl : ( ( rule__InputProcessesPart__InputsAssignment_0 ) ) ;
    public final void rule__InputProcessesPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2243:1: ( ( ( rule__InputProcessesPart__InputsAssignment_0 ) ) )
            // InternalGoatComponents.g:2244:1: ( ( rule__InputProcessesPart__InputsAssignment_0 ) )
            {
            // InternalGoatComponents.g:2244:1: ( ( rule__InputProcessesPart__InputsAssignment_0 ) )
            // InternalGoatComponents.g:2245:2: ( rule__InputProcessesPart__InputsAssignment_0 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getInputsAssignment_0()); 
            // InternalGoatComponents.g:2246:2: ( rule__InputProcessesPart__InputsAssignment_0 )
            // InternalGoatComponents.g:2246:3: rule__InputProcessesPart__InputsAssignment_0
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
    // InternalGoatComponents.g:2254:1: rule__InputProcessesPart__Group__1 : rule__InputProcessesPart__Group__1__Impl ;
    public final void rule__InputProcessesPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2258:1: ( rule__InputProcessesPart__Group__1__Impl )
            // InternalGoatComponents.g:2259:2: rule__InputProcessesPart__Group__1__Impl
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
    // InternalGoatComponents.g:2265:1: rule__InputProcessesPart__Group__1__Impl : ( ( rule__InputProcessesPart__Group_1__0 )* ) ;
    public final void rule__InputProcessesPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2269:1: ( ( ( rule__InputProcessesPart__Group_1__0 )* ) )
            // InternalGoatComponents.g:2270:1: ( ( rule__InputProcessesPart__Group_1__0 )* )
            {
            // InternalGoatComponents.g:2270:1: ( ( rule__InputProcessesPart__Group_1__0 )* )
            // InternalGoatComponents.g:2271:2: ( rule__InputProcessesPart__Group_1__0 )*
            {
             before(grammarAccess.getInputProcessesPartAccess().getGroup_1()); 
            // InternalGoatComponents.g:2272:2: ( rule__InputProcessesPart__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGoatComponents.g:2272:3: rule__InputProcessesPart__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalGoatComponents.g:2281:1: rule__InputProcessesPart__Group_1__0 : rule__InputProcessesPart__Group_1__0__Impl rule__InputProcessesPart__Group_1__1 ;
    public final void rule__InputProcessesPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2285:1: ( rule__InputProcessesPart__Group_1__0__Impl rule__InputProcessesPart__Group_1__1 )
            // InternalGoatComponents.g:2286:2: rule__InputProcessesPart__Group_1__0__Impl rule__InputProcessesPart__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGoatComponents.g:2293:1: rule__InputProcessesPart__Group_1__0__Impl : ( '+' ) ;
    public final void rule__InputProcessesPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2297:1: ( ( '+' ) )
            // InternalGoatComponents.g:2298:1: ( '+' )
            {
            // InternalGoatComponents.g:2298:1: ( '+' )
            // InternalGoatComponents.g:2299:2: '+'
            {
             before(grammarAccess.getInputProcessesPartAccess().getPlusSignKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGoatComponents.g:2308:1: rule__InputProcessesPart__Group_1__1 : rule__InputProcessesPart__Group_1__1__Impl rule__InputProcessesPart__Group_1__2 ;
    public final void rule__InputProcessesPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2312:1: ( rule__InputProcessesPart__Group_1__1__Impl rule__InputProcessesPart__Group_1__2 )
            // InternalGoatComponents.g:2313:2: rule__InputProcessesPart__Group_1__1__Impl rule__InputProcessesPart__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalGoatComponents.g:2320:1: rule__InputProcessesPart__Group_1__1__Impl : ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) ) ;
    public final void rule__InputProcessesPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2324:1: ( ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) ) )
            // InternalGoatComponents.g:2325:1: ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) )
            {
            // InternalGoatComponents.g:2325:1: ( ( rule__InputProcessesPart__PrecondsAssignment_1_1 ) )
            // InternalGoatComponents.g:2326:2: ( rule__InputProcessesPart__PrecondsAssignment_1_1 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getPrecondsAssignment_1_1()); 
            // InternalGoatComponents.g:2327:2: ( rule__InputProcessesPart__PrecondsAssignment_1_1 )
            // InternalGoatComponents.g:2327:3: rule__InputProcessesPart__PrecondsAssignment_1_1
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
    // InternalGoatComponents.g:2335:1: rule__InputProcessesPart__Group_1__2 : rule__InputProcessesPart__Group_1__2__Impl ;
    public final void rule__InputProcessesPart__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2339:1: ( rule__InputProcessesPart__Group_1__2__Impl )
            // InternalGoatComponents.g:2340:2: rule__InputProcessesPart__Group_1__2__Impl
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
    // InternalGoatComponents.g:2346:1: rule__InputProcessesPart__Group_1__2__Impl : ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) ) ;
    public final void rule__InputProcessesPart__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2350:1: ( ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) ) )
            // InternalGoatComponents.g:2351:1: ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) )
            {
            // InternalGoatComponents.g:2351:1: ( ( rule__InputProcessesPart__InputsAssignment_1_2 ) )
            // InternalGoatComponents.g:2352:2: ( rule__InputProcessesPart__InputsAssignment_1_2 )
            {
             before(grammarAccess.getInputProcessesPartAccess().getInputsAssignment_1_2()); 
            // InternalGoatComponents.g:2353:2: ( rule__InputProcessesPart__InputsAssignment_1_2 )
            // InternalGoatComponents.g:2353:3: rule__InputProcessesPart__InputsAssignment_1_2
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
    // InternalGoatComponents.g:2362:1: rule__InputProcess__Group__0 : rule__InputProcess__Group__0__Impl rule__InputProcess__Group__1 ;
    public final void rule__InputProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2366:1: ( rule__InputProcess__Group__0__Impl rule__InputProcess__Group__1 )
            // InternalGoatComponents.g:2367:2: rule__InputProcess__Group__0__Impl rule__InputProcess__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGoatComponents.g:2374:1: rule__InputProcess__Group__0__Impl : ( () ) ;
    public final void rule__InputProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2378:1: ( ( () ) )
            // InternalGoatComponents.g:2379:1: ( () )
            {
            // InternalGoatComponents.g:2379:1: ( () )
            // InternalGoatComponents.g:2380:2: ()
            {
             before(grammarAccess.getInputProcessAccess().getInputProcessAction_0()); 
            // InternalGoatComponents.g:2381:2: ()
            // InternalGoatComponents.g:2381:3: 
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
    // InternalGoatComponents.g:2389:1: rule__InputProcess__Group__1 : rule__InputProcess__Group__1__Impl rule__InputProcess__Group__2 ;
    public final void rule__InputProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2393:1: ( rule__InputProcess__Group__1__Impl rule__InputProcess__Group__2 )
            // InternalGoatComponents.g:2394:2: rule__InputProcess__Group__1__Impl rule__InputProcess__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponents.g:2401:1: rule__InputProcess__Group__1__Impl : ( 'receive' ) ;
    public final void rule__InputProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2405:1: ( ( 'receive' ) )
            // InternalGoatComponents.g:2406:1: ( 'receive' )
            {
            // InternalGoatComponents.g:2406:1: ( 'receive' )
            // InternalGoatComponents.g:2407:2: 'receive'
            {
             before(grammarAccess.getInputProcessAccess().getReceiveKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGoatComponents.g:2416:1: rule__InputProcess__Group__2 : rule__InputProcess__Group__2__Impl rule__InputProcess__Group__3 ;
    public final void rule__InputProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2420:1: ( rule__InputProcess__Group__2__Impl rule__InputProcess__Group__3 )
            // InternalGoatComponents.g:2421:2: rule__InputProcess__Group__2__Impl rule__InputProcess__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:2428:1: rule__InputProcess__Group__2__Impl : ( '(' ) ;
    public final void rule__InputProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2432:1: ( ( '(' ) )
            // InternalGoatComponents.g:2433:1: ( '(' )
            {
            // InternalGoatComponents.g:2433:1: ( '(' )
            // InternalGoatComponents.g:2434:2: '('
            {
             before(grammarAccess.getInputProcessAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:2443:1: rule__InputProcess__Group__3 : rule__InputProcess__Group__3__Impl rule__InputProcess__Group__4 ;
    public final void rule__InputProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2447:1: ( rule__InputProcess__Group__3__Impl rule__InputProcess__Group__4 )
            // InternalGoatComponents.g:2448:2: rule__InputProcess__Group__3__Impl rule__InputProcess__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:2455:1: rule__InputProcess__Group__3__Impl : ( ( rule__InputProcess__Rec_predAssignment_3 ) ) ;
    public final void rule__InputProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2459:1: ( ( ( rule__InputProcess__Rec_predAssignment_3 ) ) )
            // InternalGoatComponents.g:2460:1: ( ( rule__InputProcess__Rec_predAssignment_3 ) )
            {
            // InternalGoatComponents.g:2460:1: ( ( rule__InputProcess__Rec_predAssignment_3 ) )
            // InternalGoatComponents.g:2461:2: ( rule__InputProcess__Rec_predAssignment_3 )
            {
             before(grammarAccess.getInputProcessAccess().getRec_predAssignment_3()); 
            // InternalGoatComponents.g:2462:2: ( rule__InputProcess__Rec_predAssignment_3 )
            // InternalGoatComponents.g:2462:3: rule__InputProcess__Rec_predAssignment_3
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
    // InternalGoatComponents.g:2470:1: rule__InputProcess__Group__4 : rule__InputProcess__Group__4__Impl rule__InputProcess__Group__5 ;
    public final void rule__InputProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2474:1: ( rule__InputProcess__Group__4__Impl rule__InputProcess__Group__5 )
            // InternalGoatComponents.g:2475:2: rule__InputProcess__Group__4__Impl rule__InputProcess__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:2482:1: rule__InputProcess__Group__4__Impl : ( ')' ) ;
    public final void rule__InputProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2486:1: ( ( ')' ) )
            // InternalGoatComponents.g:2487:1: ( ')' )
            {
            // InternalGoatComponents.g:2487:1: ( ')' )
            // InternalGoatComponents.g:2488:2: ')'
            {
             before(grammarAccess.getInputProcessAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:2497:1: rule__InputProcess__Group__5 : rule__InputProcess__Group__5__Impl rule__InputProcess__Group__6 ;
    public final void rule__InputProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2501:1: ( rule__InputProcess__Group__5__Impl rule__InputProcess__Group__6 )
            // InternalGoatComponents.g:2502:2: rule__InputProcess__Group__5__Impl rule__InputProcess__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalGoatComponents.g:2509:1: rule__InputProcess__Group__5__Impl : ( '{' ) ;
    public final void rule__InputProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2513:1: ( ( '{' ) )
            // InternalGoatComponents.g:2514:1: ( '{' )
            {
            // InternalGoatComponents.g:2514:1: ( '{' )
            // InternalGoatComponents.g:2515:2: '{'
            {
             before(grammarAccess.getInputProcessAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGoatComponents.g:2524:1: rule__InputProcess__Group__6 : rule__InputProcess__Group__6__Impl rule__InputProcess__Group__7 ;
    public final void rule__InputProcess__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2528:1: ( rule__InputProcess__Group__6__Impl rule__InputProcess__Group__7 )
            // InternalGoatComponents.g:2529:2: rule__InputProcess__Group__6__Impl rule__InputProcess__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalGoatComponents.g:2536:1: rule__InputProcess__Group__6__Impl : ( ( rule__InputProcess__Group_6__0 )? ) ;
    public final void rule__InputProcess__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2540:1: ( ( ( rule__InputProcess__Group_6__0 )? ) )
            // InternalGoatComponents.g:2541:1: ( ( rule__InputProcess__Group_6__0 )? )
            {
            // InternalGoatComponents.g:2541:1: ( ( rule__InputProcess__Group_6__0 )? )
            // InternalGoatComponents.g:2542:2: ( rule__InputProcess__Group_6__0 )?
            {
             before(grammarAccess.getInputProcessAccess().getGroup_6()); 
            // InternalGoatComponents.g:2543:2: ( rule__InputProcess__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44||LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGoatComponents.g:2543:3: rule__InputProcess__Group_6__0
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
    // InternalGoatComponents.g:2551:1: rule__InputProcess__Group__7 : rule__InputProcess__Group__7__Impl rule__InputProcess__Group__8 ;
    public final void rule__InputProcess__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2555:1: ( rule__InputProcess__Group__7__Impl rule__InputProcess__Group__8 )
            // InternalGoatComponents.g:2556:2: rule__InputProcess__Group__7__Impl rule__InputProcess__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalGoatComponents.g:2563:1: rule__InputProcess__Group__7__Impl : ( '}' ) ;
    public final void rule__InputProcess__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2567:1: ( ( '}' ) )
            // InternalGoatComponents.g:2568:1: ( '}' )
            {
            // InternalGoatComponents.g:2568:1: ( '}' )
            // InternalGoatComponents.g:2569:2: '}'
            {
             before(grammarAccess.getInputProcessAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGoatComponents.g:2578:1: rule__InputProcess__Group__8 : rule__InputProcess__Group__8__Impl rule__InputProcess__Group__9 ;
    public final void rule__InputProcess__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2582:1: ( rule__InputProcess__Group__8__Impl rule__InputProcess__Group__9 )
            // InternalGoatComponents.g:2583:2: rule__InputProcess__Group__8__Impl rule__InputProcess__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalGoatComponents.g:2590:1: rule__InputProcess__Group__8__Impl : ( ( rule__InputProcess__OutputAssignment_8 )? ) ;
    public final void rule__InputProcess__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2594:1: ( ( ( rule__InputProcess__OutputAssignment_8 )? ) )
            // InternalGoatComponents.g:2595:1: ( ( rule__InputProcess__OutputAssignment_8 )? )
            {
            // InternalGoatComponents.g:2595:1: ( ( rule__InputProcess__OutputAssignment_8 )? )
            // InternalGoatComponents.g:2596:2: ( rule__InputProcess__OutputAssignment_8 )?
            {
             before(grammarAccess.getInputProcessAccess().getOutputAssignment_8()); 
            // InternalGoatComponents.g:2597:2: ( rule__InputProcess__OutputAssignment_8 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGoatComponents.g:2597:3: rule__InputProcess__OutputAssignment_8
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
    // InternalGoatComponents.g:2605:1: rule__InputProcess__Group__9 : rule__InputProcess__Group__9__Impl rule__InputProcess__Group__10 ;
    public final void rule__InputProcess__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2609:1: ( rule__InputProcess__Group__9__Impl rule__InputProcess__Group__10 )
            // InternalGoatComponents.g:2610:2: rule__InputProcess__Group__9__Impl rule__InputProcess__Group__10
            {
            pushFollow(FOLLOW_21);
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
    // InternalGoatComponents.g:2617:1: rule__InputProcess__Group__9__Impl : ( '.' ) ;
    public final void rule__InputProcess__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2621:1: ( ( '.' ) )
            // InternalGoatComponents.g:2622:1: ( '.' )
            {
            // InternalGoatComponents.g:2622:1: ( '.' )
            // InternalGoatComponents.g:2623:2: '.'
            {
             before(grammarAccess.getInputProcessAccess().getFullStopKeyword_9()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGoatComponents.g:2632:1: rule__InputProcess__Group__10 : rule__InputProcess__Group__10__Impl ;
    public final void rule__InputProcess__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2636:1: ( rule__InputProcess__Group__10__Impl )
            // InternalGoatComponents.g:2637:2: rule__InputProcess__Group__10__Impl
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
    // InternalGoatComponents.g:2643:1: rule__InputProcess__Group__10__Impl : ( ( rule__InputProcess__NextAssignment_10 ) ) ;
    public final void rule__InputProcess__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2647:1: ( ( ( rule__InputProcess__NextAssignment_10 ) ) )
            // InternalGoatComponents.g:2648:1: ( ( rule__InputProcess__NextAssignment_10 ) )
            {
            // InternalGoatComponents.g:2648:1: ( ( rule__InputProcess__NextAssignment_10 ) )
            // InternalGoatComponents.g:2649:2: ( rule__InputProcess__NextAssignment_10 )
            {
             before(grammarAccess.getInputProcessAccess().getNextAssignment_10()); 
            // InternalGoatComponents.g:2650:2: ( rule__InputProcess__NextAssignment_10 )
            // InternalGoatComponents.g:2650:3: rule__InputProcess__NextAssignment_10
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
    // InternalGoatComponents.g:2659:1: rule__InputProcess__Group_6__0 : rule__InputProcess__Group_6__0__Impl rule__InputProcess__Group_6__1 ;
    public final void rule__InputProcess__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2663:1: ( rule__InputProcess__Group_6__0__Impl rule__InputProcess__Group_6__1 )
            // InternalGoatComponents.g:2664:2: rule__InputProcess__Group_6__0__Impl rule__InputProcess__Group_6__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalGoatComponents.g:2671:1: rule__InputProcess__Group_6__0__Impl : ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) ) ;
    public final void rule__InputProcess__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2675:1: ( ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) ) )
            // InternalGoatComponents.g:2676:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) )
            {
            // InternalGoatComponents.g:2676:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_0 ) )
            // InternalGoatComponents.g:2677:2: ( rule__InputProcess__MsgInPartsAssignment_6_0 )
            {
             before(grammarAccess.getInputProcessAccess().getMsgInPartsAssignment_6_0()); 
            // InternalGoatComponents.g:2678:2: ( rule__InputProcess__MsgInPartsAssignment_6_0 )
            // InternalGoatComponents.g:2678:3: rule__InputProcess__MsgInPartsAssignment_6_0
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
    // InternalGoatComponents.g:2686:1: rule__InputProcess__Group_6__1 : rule__InputProcess__Group_6__1__Impl ;
    public final void rule__InputProcess__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2690:1: ( rule__InputProcess__Group_6__1__Impl )
            // InternalGoatComponents.g:2691:2: rule__InputProcess__Group_6__1__Impl
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
    // InternalGoatComponents.g:2697:1: rule__InputProcess__Group_6__1__Impl : ( ( rule__InputProcess__Group_6_1__0 )* ) ;
    public final void rule__InputProcess__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2701:1: ( ( ( rule__InputProcess__Group_6_1__0 )* ) )
            // InternalGoatComponents.g:2702:1: ( ( rule__InputProcess__Group_6_1__0 )* )
            {
            // InternalGoatComponents.g:2702:1: ( ( rule__InputProcess__Group_6_1__0 )* )
            // InternalGoatComponents.g:2703:2: ( rule__InputProcess__Group_6_1__0 )*
            {
             before(grammarAccess.getInputProcessAccess().getGroup_6_1()); 
            // InternalGoatComponents.g:2704:2: ( rule__InputProcess__Group_6_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGoatComponents.g:2704:3: rule__InputProcess__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalGoatComponents.g:2713:1: rule__InputProcess__Group_6_1__0 : rule__InputProcess__Group_6_1__0__Impl rule__InputProcess__Group_6_1__1 ;
    public final void rule__InputProcess__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2717:1: ( rule__InputProcess__Group_6_1__0__Impl rule__InputProcess__Group_6_1__1 )
            // InternalGoatComponents.g:2718:2: rule__InputProcess__Group_6_1__0__Impl rule__InputProcess__Group_6_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGoatComponents.g:2725:1: rule__InputProcess__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__InputProcess__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2729:1: ( ( ',' ) )
            // InternalGoatComponents.g:2730:1: ( ',' )
            {
            // InternalGoatComponents.g:2730:1: ( ',' )
            // InternalGoatComponents.g:2731:2: ','
            {
             before(grammarAccess.getInputProcessAccess().getCommaKeyword_6_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGoatComponents.g:2740:1: rule__InputProcess__Group_6_1__1 : rule__InputProcess__Group_6_1__1__Impl ;
    public final void rule__InputProcess__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2744:1: ( rule__InputProcess__Group_6_1__1__Impl )
            // InternalGoatComponents.g:2745:2: rule__InputProcess__Group_6_1__1__Impl
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
    // InternalGoatComponents.g:2751:1: rule__InputProcess__Group_6_1__1__Impl : ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) ) ;
    public final void rule__InputProcess__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2755:1: ( ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) ) )
            // InternalGoatComponents.g:2756:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) )
            {
            // InternalGoatComponents.g:2756:1: ( ( rule__InputProcess__MsgInPartsAssignment_6_1_1 ) )
            // InternalGoatComponents.g:2757:2: ( rule__InputProcess__MsgInPartsAssignment_6_1_1 )
            {
             before(grammarAccess.getInputProcessAccess().getMsgInPartsAssignment_6_1_1()); 
            // InternalGoatComponents.g:2758:2: ( rule__InputProcess__MsgInPartsAssignment_6_1_1 )
            // InternalGoatComponents.g:2758:3: rule__InputProcess__MsgInPartsAssignment_6_1_1
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
    // InternalGoatComponents.g:2767:1: rule__OutputProcessPart__Group__0 : rule__OutputProcessPart__Group__0__Impl rule__OutputProcessPart__Group__1 ;
    public final void rule__OutputProcessPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2771:1: ( rule__OutputProcessPart__Group__0__Impl rule__OutputProcessPart__Group__1 )
            // InternalGoatComponents.g:2772:2: rule__OutputProcessPart__Group__0__Impl rule__OutputProcessPart__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:2779:1: rule__OutputProcessPart__Group__0__Impl : ( 'send' ) ;
    public final void rule__OutputProcessPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2783:1: ( ( 'send' ) )
            // InternalGoatComponents.g:2784:1: ( 'send' )
            {
            // InternalGoatComponents.g:2784:1: ( 'send' )
            // InternalGoatComponents.g:2785:2: 'send'
            {
             before(grammarAccess.getOutputProcessPartAccess().getSendKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGoatComponents.g:2794:1: rule__OutputProcessPart__Group__1 : rule__OutputProcessPart__Group__1__Impl rule__OutputProcessPart__Group__2 ;
    public final void rule__OutputProcessPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2798:1: ( rule__OutputProcessPart__Group__1__Impl rule__OutputProcessPart__Group__2 )
            // InternalGoatComponents.g:2799:2: rule__OutputProcessPart__Group__1__Impl rule__OutputProcessPart__Group__2
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
    // InternalGoatComponents.g:2806:1: rule__OutputProcessPart__Group__1__Impl : ( '{' ) ;
    public final void rule__OutputProcessPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2810:1: ( ( '{' ) )
            // InternalGoatComponents.g:2811:1: ( '{' )
            {
            // InternalGoatComponents.g:2811:1: ( '{' )
            // InternalGoatComponents.g:2812:2: '{'
            {
             before(grammarAccess.getOutputProcessPartAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGoatComponents.g:2821:1: rule__OutputProcessPart__Group__2 : rule__OutputProcessPart__Group__2__Impl rule__OutputProcessPart__Group__3 ;
    public final void rule__OutputProcessPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2825:1: ( rule__OutputProcessPart__Group__2__Impl rule__OutputProcessPart__Group__3 )
            // InternalGoatComponents.g:2826:2: rule__OutputProcessPart__Group__2__Impl rule__OutputProcessPart__Group__3
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
    // InternalGoatComponents.g:2833:1: rule__OutputProcessPart__Group__2__Impl : ( ( rule__OutputProcessPart__Group_2__0 )? ) ;
    public final void rule__OutputProcessPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2837:1: ( ( ( rule__OutputProcessPart__Group_2__0 )? ) )
            // InternalGoatComponents.g:2838:1: ( ( rule__OutputProcessPart__Group_2__0 )? )
            {
            // InternalGoatComponents.g:2838:1: ( ( rule__OutputProcessPart__Group_2__0 )? )
            // InternalGoatComponents.g:2839:2: ( rule__OutputProcessPart__Group_2__0 )?
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_2()); 
            // InternalGoatComponents.g:2840:2: ( rule__OutputProcessPart__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||(LA27_0>=12 && LA27_0<=13)||LA27_0==26||LA27_0==44||(LA27_0>=51 && LA27_0<=53)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGoatComponents.g:2840:3: rule__OutputProcessPart__Group_2__0
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
    // InternalGoatComponents.g:2848:1: rule__OutputProcessPart__Group__3 : rule__OutputProcessPart__Group__3__Impl rule__OutputProcessPart__Group__4 ;
    public final void rule__OutputProcessPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2852:1: ( rule__OutputProcessPart__Group__3__Impl rule__OutputProcessPart__Group__4 )
            // InternalGoatComponents.g:2853:2: rule__OutputProcessPart__Group__3__Impl rule__OutputProcessPart__Group__4
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
    // InternalGoatComponents.g:2860:1: rule__OutputProcessPart__Group__3__Impl : ( '}' ) ;
    public final void rule__OutputProcessPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2864:1: ( ( '}' ) )
            // InternalGoatComponents.g:2865:1: ( '}' )
            {
            // InternalGoatComponents.g:2865:1: ( '}' )
            // InternalGoatComponents.g:2866:2: '}'
            {
             before(grammarAccess.getOutputProcessPartAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGoatComponents.g:2875:1: rule__OutputProcessPart__Group__4 : rule__OutputProcessPart__Group__4__Impl rule__OutputProcessPart__Group__5 ;
    public final void rule__OutputProcessPart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2879:1: ( rule__OutputProcessPart__Group__4__Impl rule__OutputProcessPart__Group__5 )
            // InternalGoatComponents.g:2880:2: rule__OutputProcessPart__Group__4__Impl rule__OutputProcessPart__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponents.g:2887:1: rule__OutputProcessPart__Group__4__Impl : ( '@' ) ;
    public final void rule__OutputProcessPart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2891:1: ( ( '@' ) )
            // InternalGoatComponents.g:2892:1: ( '@' )
            {
            // InternalGoatComponents.g:2892:1: ( '@' )
            // InternalGoatComponents.g:2893:2: '@'
            {
             before(grammarAccess.getOutputProcessPartAccess().getCommercialAtKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGoatComponents.g:2902:1: rule__OutputProcessPart__Group__5 : rule__OutputProcessPart__Group__5__Impl rule__OutputProcessPart__Group__6 ;
    public final void rule__OutputProcessPart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2906:1: ( rule__OutputProcessPart__Group__5__Impl rule__OutputProcessPart__Group__6 )
            // InternalGoatComponents.g:2907:2: rule__OutputProcessPart__Group__5__Impl rule__OutputProcessPart__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:2914:1: rule__OutputProcessPart__Group__5__Impl : ( '(' ) ;
    public final void rule__OutputProcessPart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2918:1: ( ( '(' ) )
            // InternalGoatComponents.g:2919:1: ( '(' )
            {
            // InternalGoatComponents.g:2919:1: ( '(' )
            // InternalGoatComponents.g:2920:2: '('
            {
             before(grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:2929:1: rule__OutputProcessPart__Group__6 : rule__OutputProcessPart__Group__6__Impl rule__OutputProcessPart__Group__7 ;
    public final void rule__OutputProcessPart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2933:1: ( rule__OutputProcessPart__Group__6__Impl rule__OutputProcessPart__Group__7 )
            // InternalGoatComponents.g:2934:2: rule__OutputProcessPart__Group__6__Impl rule__OutputProcessPart__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:2941:1: rule__OutputProcessPart__Group__6__Impl : ( ( rule__OutputProcessPart__Send_predAssignment_6 ) ) ;
    public final void rule__OutputProcessPart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2945:1: ( ( ( rule__OutputProcessPart__Send_predAssignment_6 ) ) )
            // InternalGoatComponents.g:2946:1: ( ( rule__OutputProcessPart__Send_predAssignment_6 ) )
            {
            // InternalGoatComponents.g:2946:1: ( ( rule__OutputProcessPart__Send_predAssignment_6 ) )
            // InternalGoatComponents.g:2947:2: ( rule__OutputProcessPart__Send_predAssignment_6 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getSend_predAssignment_6()); 
            // InternalGoatComponents.g:2948:2: ( rule__OutputProcessPart__Send_predAssignment_6 )
            // InternalGoatComponents.g:2948:3: rule__OutputProcessPart__Send_predAssignment_6
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
    // InternalGoatComponents.g:2956:1: rule__OutputProcessPart__Group__7 : rule__OutputProcessPart__Group__7__Impl rule__OutputProcessPart__Group__8 ;
    public final void rule__OutputProcessPart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2960:1: ( rule__OutputProcessPart__Group__7__Impl rule__OutputProcessPart__Group__8 )
            // InternalGoatComponents.g:2961:2: rule__OutputProcessPart__Group__7__Impl rule__OutputProcessPart__Group__8
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
    // InternalGoatComponents.g:2968:1: rule__OutputProcessPart__Group__7__Impl : ( ')' ) ;
    public final void rule__OutputProcessPart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2972:1: ( ( ')' ) )
            // InternalGoatComponents.g:2973:1: ( ')' )
            {
            // InternalGoatComponents.g:2973:1: ( ')' )
            // InternalGoatComponents.g:2974:2: ')'
            {
             before(grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_7()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:2983:1: rule__OutputProcessPart__Group__8 : rule__OutputProcessPart__Group__8__Impl rule__OutputProcessPart__Group__9 ;
    public final void rule__OutputProcessPart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2987:1: ( rule__OutputProcessPart__Group__8__Impl rule__OutputProcessPart__Group__9 )
            // InternalGoatComponents.g:2988:2: rule__OutputProcessPart__Group__8__Impl rule__OutputProcessPart__Group__9
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
    // InternalGoatComponents.g:2995:1: rule__OutputProcessPart__Group__8__Impl : ( ( rule__OutputProcessPart__OutputAssignment_8 )? ) ;
    public final void rule__OutputProcessPart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:2999:1: ( ( ( rule__OutputProcessPart__OutputAssignment_8 )? ) )
            // InternalGoatComponents.g:3000:1: ( ( rule__OutputProcessPart__OutputAssignment_8 )? )
            {
            // InternalGoatComponents.g:3000:1: ( ( rule__OutputProcessPart__OutputAssignment_8 )? )
            // InternalGoatComponents.g:3001:2: ( rule__OutputProcessPart__OutputAssignment_8 )?
            {
             before(grammarAccess.getOutputProcessPartAccess().getOutputAssignment_8()); 
            // InternalGoatComponents.g:3002:2: ( rule__OutputProcessPart__OutputAssignment_8 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGoatComponents.g:3002:3: rule__OutputProcessPart__OutputAssignment_8
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
    // InternalGoatComponents.g:3010:1: rule__OutputProcessPart__Group__9 : rule__OutputProcessPart__Group__9__Impl rule__OutputProcessPart__Group__10 ;
    public final void rule__OutputProcessPart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3014:1: ( rule__OutputProcessPart__Group__9__Impl rule__OutputProcessPart__Group__10 )
            // InternalGoatComponents.g:3015:2: rule__OutputProcessPart__Group__9__Impl rule__OutputProcessPart__Group__10
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
    // InternalGoatComponents.g:3022:1: rule__OutputProcessPart__Group__9__Impl : ( ( rule__OutputProcessPart__Group_9__0 )? ) ;
    public final void rule__OutputProcessPart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3026:1: ( ( ( rule__OutputProcessPart__Group_9__0 )? ) )
            // InternalGoatComponents.g:3027:1: ( ( rule__OutputProcessPart__Group_9__0 )? )
            {
            // InternalGoatComponents.g:3027:1: ( ( rule__OutputProcessPart__Group_9__0 )? )
            // InternalGoatComponents.g:3028:2: ( rule__OutputProcessPart__Group_9__0 )?
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_9()); 
            // InternalGoatComponents.g:3029:2: ( rule__OutputProcessPart__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGoatComponents.g:3029:3: rule__OutputProcessPart__Group_9__0
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
    // InternalGoatComponents.g:3037:1: rule__OutputProcessPart__Group__10 : rule__OutputProcessPart__Group__10__Impl rule__OutputProcessPart__Group__11 ;
    public final void rule__OutputProcessPart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3041:1: ( rule__OutputProcessPart__Group__10__Impl rule__OutputProcessPart__Group__11 )
            // InternalGoatComponents.g:3042:2: rule__OutputProcessPart__Group__10__Impl rule__OutputProcessPart__Group__11
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
    // InternalGoatComponents.g:3049:1: rule__OutputProcessPart__Group__10__Impl : ( '.' ) ;
    public final void rule__OutputProcessPart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3053:1: ( ( '.' ) )
            // InternalGoatComponents.g:3054:1: ( '.' )
            {
            // InternalGoatComponents.g:3054:1: ( '.' )
            // InternalGoatComponents.g:3055:2: '.'
            {
             before(grammarAccess.getOutputProcessPartAccess().getFullStopKeyword_10()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGoatComponents.g:3064:1: rule__OutputProcessPart__Group__11 : rule__OutputProcessPart__Group__11__Impl ;
    public final void rule__OutputProcessPart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3068:1: ( rule__OutputProcessPart__Group__11__Impl )
            // InternalGoatComponents.g:3069:2: rule__OutputProcessPart__Group__11__Impl
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
    // InternalGoatComponents.g:3075:1: rule__OutputProcessPart__Group__11__Impl : ( ( rule__OutputProcessPart__NextAssignment_11 ) ) ;
    public final void rule__OutputProcessPart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3079:1: ( ( ( rule__OutputProcessPart__NextAssignment_11 ) ) )
            // InternalGoatComponents.g:3080:1: ( ( rule__OutputProcessPart__NextAssignment_11 ) )
            {
            // InternalGoatComponents.g:3080:1: ( ( rule__OutputProcessPart__NextAssignment_11 ) )
            // InternalGoatComponents.g:3081:2: ( rule__OutputProcessPart__NextAssignment_11 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getNextAssignment_11()); 
            // InternalGoatComponents.g:3082:2: ( rule__OutputProcessPart__NextAssignment_11 )
            // InternalGoatComponents.g:3082:3: rule__OutputProcessPart__NextAssignment_11
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
    // InternalGoatComponents.g:3091:1: rule__OutputProcessPart__Group_2__0 : rule__OutputProcessPart__Group_2__0__Impl rule__OutputProcessPart__Group_2__1 ;
    public final void rule__OutputProcessPart__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3095:1: ( rule__OutputProcessPart__Group_2__0__Impl rule__OutputProcessPart__Group_2__1 )
            // InternalGoatComponents.g:3096:2: rule__OutputProcessPart__Group_2__0__Impl rule__OutputProcessPart__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalGoatComponents.g:3103:1: rule__OutputProcessPart__Group_2__0__Impl : ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) ) ;
    public final void rule__OutputProcessPart__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3107:1: ( ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) ) )
            // InternalGoatComponents.g:3108:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) )
            {
            // InternalGoatComponents.g:3108:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 ) )
            // InternalGoatComponents.g:3109:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsAssignment_2_0()); 
            // InternalGoatComponents.g:3110:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_0 )
            // InternalGoatComponents.g:3110:3: rule__OutputProcessPart__MsgOutPartsAssignment_2_0
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
    // InternalGoatComponents.g:3118:1: rule__OutputProcessPart__Group_2__1 : rule__OutputProcessPart__Group_2__1__Impl ;
    public final void rule__OutputProcessPart__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3122:1: ( rule__OutputProcessPart__Group_2__1__Impl )
            // InternalGoatComponents.g:3123:2: rule__OutputProcessPart__Group_2__1__Impl
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
    // InternalGoatComponents.g:3129:1: rule__OutputProcessPart__Group_2__1__Impl : ( ( rule__OutputProcessPart__Group_2_1__0 )* ) ;
    public final void rule__OutputProcessPart__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3133:1: ( ( ( rule__OutputProcessPart__Group_2_1__0 )* ) )
            // InternalGoatComponents.g:3134:1: ( ( rule__OutputProcessPart__Group_2_1__0 )* )
            {
            // InternalGoatComponents.g:3134:1: ( ( rule__OutputProcessPart__Group_2_1__0 )* )
            // InternalGoatComponents.g:3135:2: ( rule__OutputProcessPart__Group_2_1__0 )*
            {
             before(grammarAccess.getOutputProcessPartAccess().getGroup_2_1()); 
            // InternalGoatComponents.g:3136:2: ( rule__OutputProcessPart__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==31) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGoatComponents.g:3136:3: rule__OutputProcessPart__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalGoatComponents.g:3145:1: rule__OutputProcessPart__Group_2_1__0 : rule__OutputProcessPart__Group_2_1__0__Impl rule__OutputProcessPart__Group_2_1__1 ;
    public final void rule__OutputProcessPart__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3149:1: ( rule__OutputProcessPart__Group_2_1__0__Impl rule__OutputProcessPart__Group_2_1__1 )
            // InternalGoatComponents.g:3150:2: rule__OutputProcessPart__Group_2_1__0__Impl rule__OutputProcessPart__Group_2_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:3157:1: rule__OutputProcessPart__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__OutputProcessPart__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3161:1: ( ( ',' ) )
            // InternalGoatComponents.g:3162:1: ( ',' )
            {
            // InternalGoatComponents.g:3162:1: ( ',' )
            // InternalGoatComponents.g:3163:2: ','
            {
             before(grammarAccess.getOutputProcessPartAccess().getCommaKeyword_2_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGoatComponents.g:3172:1: rule__OutputProcessPart__Group_2_1__1 : rule__OutputProcessPart__Group_2_1__1__Impl ;
    public final void rule__OutputProcessPart__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3176:1: ( rule__OutputProcessPart__Group_2_1__1__Impl )
            // InternalGoatComponents.g:3177:2: rule__OutputProcessPart__Group_2_1__1__Impl
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
    // InternalGoatComponents.g:3183:1: rule__OutputProcessPart__Group_2_1__1__Impl : ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) ) ;
    public final void rule__OutputProcessPart__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3187:1: ( ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) ) )
            // InternalGoatComponents.g:3188:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) )
            {
            // InternalGoatComponents.g:3188:1: ( ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 ) )
            // InternalGoatComponents.g:3189:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsgOutPartsAssignment_2_1_1()); 
            // InternalGoatComponents.g:3190:2: ( rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 )
            // InternalGoatComponents.g:3190:3: rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1
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
    // InternalGoatComponents.g:3199:1: rule__OutputProcessPart__Group_9__0 : rule__OutputProcessPart__Group_9__0__Impl rule__OutputProcessPart__Group_9__1 ;
    public final void rule__OutputProcessPart__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3203:1: ( rule__OutputProcessPart__Group_9__0__Impl rule__OutputProcessPart__Group_9__1 )
            // InternalGoatComponents.g:3204:2: rule__OutputProcessPart__Group_9__0__Impl rule__OutputProcessPart__Group_9__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponents.g:3211:1: rule__OutputProcessPart__Group_9__0__Impl : ( 'sleep' ) ;
    public final void rule__OutputProcessPart__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3215:1: ( ( 'sleep' ) )
            // InternalGoatComponents.g:3216:1: ( 'sleep' )
            {
            // InternalGoatComponents.g:3216:1: ( 'sleep' )
            // InternalGoatComponents.g:3217:2: 'sleep'
            {
             before(grammarAccess.getOutputProcessPartAccess().getSleepKeyword_9_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGoatComponents.g:3226:1: rule__OutputProcessPart__Group_9__1 : rule__OutputProcessPart__Group_9__1__Impl rule__OutputProcessPart__Group_9__2 ;
    public final void rule__OutputProcessPart__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3230:1: ( rule__OutputProcessPart__Group_9__1__Impl rule__OutputProcessPart__Group_9__2 )
            // InternalGoatComponents.g:3231:2: rule__OutputProcessPart__Group_9__1__Impl rule__OutputProcessPart__Group_9__2
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
    // InternalGoatComponents.g:3238:1: rule__OutputProcessPart__Group_9__1__Impl : ( '(' ) ;
    public final void rule__OutputProcessPart__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3242:1: ( ( '(' ) )
            // InternalGoatComponents.g:3243:1: ( '(' )
            {
            // InternalGoatComponents.g:3243:1: ( '(' )
            // InternalGoatComponents.g:3244:2: '('
            {
             before(grammarAccess.getOutputProcessPartAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:3253:1: rule__OutputProcessPart__Group_9__2 : rule__OutputProcessPart__Group_9__2__Impl rule__OutputProcessPart__Group_9__3 ;
    public final void rule__OutputProcessPart__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3257:1: ( rule__OutputProcessPart__Group_9__2__Impl rule__OutputProcessPart__Group_9__3 )
            // InternalGoatComponents.g:3258:2: rule__OutputProcessPart__Group_9__2__Impl rule__OutputProcessPart__Group_9__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:3265:1: rule__OutputProcessPart__Group_9__2__Impl : ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) ) ;
    public final void rule__OutputProcessPart__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3269:1: ( ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) ) )
            // InternalGoatComponents.g:3270:1: ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) )
            {
            // InternalGoatComponents.g:3270:1: ( ( rule__OutputProcessPart__MsecAssignment_9_2 ) )
            // InternalGoatComponents.g:3271:2: ( rule__OutputProcessPart__MsecAssignment_9_2 )
            {
             before(grammarAccess.getOutputProcessPartAccess().getMsecAssignment_9_2()); 
            // InternalGoatComponents.g:3272:2: ( rule__OutputProcessPart__MsecAssignment_9_2 )
            // InternalGoatComponents.g:3272:3: rule__OutputProcessPart__MsecAssignment_9_2
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
    // InternalGoatComponents.g:3280:1: rule__OutputProcessPart__Group_9__3 : rule__OutputProcessPart__Group_9__3__Impl ;
    public final void rule__OutputProcessPart__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3284:1: ( rule__OutputProcessPart__Group_9__3__Impl )
            // InternalGoatComponents.g:3285:2: rule__OutputProcessPart__Group_9__3__Impl
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
    // InternalGoatComponents.g:3291:1: rule__OutputProcessPart__Group_9__3__Impl : ( ')' ) ;
    public final void rule__OutputProcessPart__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3295:1: ( ( ')' ) )
            // InternalGoatComponents.g:3296:1: ( ')' )
            {
            // InternalGoatComponents.g:3296:1: ( ')' )
            // InternalGoatComponents.g:3297:2: ')'
            {
             before(grammarAccess.getOutputProcessPartAccess().getRightParenthesisKeyword_9_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:3307:1: rule__PrintFormattedStatement__Group__0 : rule__PrintFormattedStatement__Group__0__Impl rule__PrintFormattedStatement__Group__1 ;
    public final void rule__PrintFormattedStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3311:1: ( rule__PrintFormattedStatement__Group__0__Impl rule__PrintFormattedStatement__Group__1 )
            // InternalGoatComponents.g:3312:2: rule__PrintFormattedStatement__Group__0__Impl rule__PrintFormattedStatement__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalGoatComponents.g:3319:1: rule__PrintFormattedStatement__Group__0__Impl : ( () ) ;
    public final void rule__PrintFormattedStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3323:1: ( ( () ) )
            // InternalGoatComponents.g:3324:1: ( () )
            {
            // InternalGoatComponents.g:3324:1: ( () )
            // InternalGoatComponents.g:3325:2: ()
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getPrintFormattedStatementAction_0()); 
            // InternalGoatComponents.g:3326:2: ()
            // InternalGoatComponents.g:3326:3: 
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
    // InternalGoatComponents.g:3334:1: rule__PrintFormattedStatement__Group__1 : rule__PrintFormattedStatement__Group__1__Impl rule__PrintFormattedStatement__Group__2 ;
    public final void rule__PrintFormattedStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3338:1: ( rule__PrintFormattedStatement__Group__1__Impl rule__PrintFormattedStatement__Group__2 )
            // InternalGoatComponents.g:3339:2: rule__PrintFormattedStatement__Group__1__Impl rule__PrintFormattedStatement__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponents.g:3346:1: rule__PrintFormattedStatement__Group__1__Impl : ( 'print' ) ;
    public final void rule__PrintFormattedStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3350:1: ( ( 'print' ) )
            // InternalGoatComponents.g:3351:1: ( 'print' )
            {
            // InternalGoatComponents.g:3351:1: ( 'print' )
            // InternalGoatComponents.g:3352:2: 'print'
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getPrintKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGoatComponents.g:3361:1: rule__PrintFormattedStatement__Group__2 : rule__PrintFormattedStatement__Group__2__Impl rule__PrintFormattedStatement__Group__3 ;
    public final void rule__PrintFormattedStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3365:1: ( rule__PrintFormattedStatement__Group__2__Impl rule__PrintFormattedStatement__Group__3 )
            // InternalGoatComponents.g:3366:2: rule__PrintFormattedStatement__Group__2__Impl rule__PrintFormattedStatement__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalGoatComponents.g:3373:1: rule__PrintFormattedStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__PrintFormattedStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3377:1: ( ( '(' ) )
            // InternalGoatComponents.g:3378:1: ( '(' )
            {
            // InternalGoatComponents.g:3378:1: ( '(' )
            // InternalGoatComponents.g:3379:2: '('
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:3388:1: rule__PrintFormattedStatement__Group__3 : rule__PrintFormattedStatement__Group__3__Impl rule__PrintFormattedStatement__Group__4 ;
    public final void rule__PrintFormattedStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3392:1: ( rule__PrintFormattedStatement__Group__3__Impl rule__PrintFormattedStatement__Group__4 )
            // InternalGoatComponents.g:3393:2: rule__PrintFormattedStatement__Group__3__Impl rule__PrintFormattedStatement__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:3400:1: rule__PrintFormattedStatement__Group__3__Impl : ( ( rule__PrintFormattedStatement__ToPrintAssignment_3 ) ) ;
    public final void rule__PrintFormattedStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3404:1: ( ( ( rule__PrintFormattedStatement__ToPrintAssignment_3 ) ) )
            // InternalGoatComponents.g:3405:1: ( ( rule__PrintFormattedStatement__ToPrintAssignment_3 ) )
            {
            // InternalGoatComponents.g:3405:1: ( ( rule__PrintFormattedStatement__ToPrintAssignment_3 ) )
            // InternalGoatComponents.g:3406:2: ( rule__PrintFormattedStatement__ToPrintAssignment_3 )
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getToPrintAssignment_3()); 
            // InternalGoatComponents.g:3407:2: ( rule__PrintFormattedStatement__ToPrintAssignment_3 )
            // InternalGoatComponents.g:3407:3: rule__PrintFormattedStatement__ToPrintAssignment_3
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
    // InternalGoatComponents.g:3415:1: rule__PrintFormattedStatement__Group__4 : rule__PrintFormattedStatement__Group__4__Impl ;
    public final void rule__PrintFormattedStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3419:1: ( rule__PrintFormattedStatement__Group__4__Impl )
            // InternalGoatComponents.g:3420:2: rule__PrintFormattedStatement__Group__4__Impl
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
    // InternalGoatComponents.g:3426:1: rule__PrintFormattedStatement__Group__4__Impl : ( ')' ) ;
    public final void rule__PrintFormattedStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3430:1: ( ( ')' ) )
            // InternalGoatComponents.g:3431:1: ( ')' )
            {
            // InternalGoatComponents.g:3431:1: ( ')' )
            // InternalGoatComponents.g:3432:2: ')'
            {
             before(grammarAccess.getPrintFormattedStatementAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:3442:1: rule__IfProcesses__Group__0 : rule__IfProcesses__Group__0__Impl rule__IfProcesses__Group__1 ;
    public final void rule__IfProcesses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3446:1: ( rule__IfProcesses__Group__0__Impl rule__IfProcesses__Group__1 )
            // InternalGoatComponents.g:3447:2: rule__IfProcesses__Group__0__Impl rule__IfProcesses__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalGoatComponents.g:3454:1: rule__IfProcesses__Group__0__Impl : ( () ) ;
    public final void rule__IfProcesses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3458:1: ( ( () ) )
            // InternalGoatComponents.g:3459:1: ( () )
            {
            // InternalGoatComponents.g:3459:1: ( () )
            // InternalGoatComponents.g:3460:2: ()
            {
             before(grammarAccess.getIfProcessesAccess().getIfProcessesAction_0()); 
            // InternalGoatComponents.g:3461:2: ()
            // InternalGoatComponents.g:3461:3: 
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
    // InternalGoatComponents.g:3469:1: rule__IfProcesses__Group__1 : rule__IfProcesses__Group__1__Impl rule__IfProcesses__Group__2 ;
    public final void rule__IfProcesses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3473:1: ( rule__IfProcesses__Group__1__Impl rule__IfProcesses__Group__2 )
            // InternalGoatComponents.g:3474:2: rule__IfProcesses__Group__1__Impl rule__IfProcesses__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalGoatComponents.g:3481:1: rule__IfProcesses__Group__1__Impl : ( ( rule__IfProcesses__BranchesAssignment_1 ) ) ;
    public final void rule__IfProcesses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3485:1: ( ( ( rule__IfProcesses__BranchesAssignment_1 ) ) )
            // InternalGoatComponents.g:3486:1: ( ( rule__IfProcesses__BranchesAssignment_1 ) )
            {
            // InternalGoatComponents.g:3486:1: ( ( rule__IfProcesses__BranchesAssignment_1 ) )
            // InternalGoatComponents.g:3487:2: ( rule__IfProcesses__BranchesAssignment_1 )
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesAssignment_1()); 
            // InternalGoatComponents.g:3488:2: ( rule__IfProcesses__BranchesAssignment_1 )
            // InternalGoatComponents.g:3488:3: rule__IfProcesses__BranchesAssignment_1
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
    // InternalGoatComponents.g:3496:1: rule__IfProcesses__Group__2 : rule__IfProcesses__Group__2__Impl rule__IfProcesses__Group__3 ;
    public final void rule__IfProcesses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3500:1: ( rule__IfProcesses__Group__2__Impl rule__IfProcesses__Group__3 )
            // InternalGoatComponents.g:3501:2: rule__IfProcesses__Group__2__Impl rule__IfProcesses__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalGoatComponents.g:3508:1: rule__IfProcesses__Group__2__Impl : ( ( rule__IfProcesses__Group_2__0 )* ) ;
    public final void rule__IfProcesses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3512:1: ( ( ( rule__IfProcesses__Group_2__0 )* ) )
            // InternalGoatComponents.g:3513:1: ( ( rule__IfProcesses__Group_2__0 )* )
            {
            // InternalGoatComponents.g:3513:1: ( ( rule__IfProcesses__Group_2__0 )* )
            // InternalGoatComponents.g:3514:2: ( rule__IfProcesses__Group_2__0 )*
            {
             before(grammarAccess.getIfProcessesAccess().getGroup_2()); 
            // InternalGoatComponents.g:3515:2: ( rule__IfProcesses__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==37) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalGoatComponents.g:3515:3: rule__IfProcesses__Group_2__0
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalGoatComponents.g:3523:1: rule__IfProcesses__Group__3 : rule__IfProcesses__Group__3__Impl ;
    public final void rule__IfProcesses__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3527:1: ( rule__IfProcesses__Group__3__Impl )
            // InternalGoatComponents.g:3528:2: rule__IfProcesses__Group__3__Impl
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
    // InternalGoatComponents.g:3534:1: rule__IfProcesses__Group__3__Impl : ( ( rule__IfProcesses__Group_3__0 )? ) ;
    public final void rule__IfProcesses__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3538:1: ( ( ( rule__IfProcesses__Group_3__0 )? ) )
            // InternalGoatComponents.g:3539:1: ( ( rule__IfProcesses__Group_3__0 )? )
            {
            // InternalGoatComponents.g:3539:1: ( ( rule__IfProcesses__Group_3__0 )? )
            // InternalGoatComponents.g:3540:2: ( rule__IfProcesses__Group_3__0 )?
            {
             before(grammarAccess.getIfProcessesAccess().getGroup_3()); 
            // InternalGoatComponents.g:3541:2: ( rule__IfProcesses__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGoatComponents.g:3541:3: rule__IfProcesses__Group_3__0
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
    // InternalGoatComponents.g:3550:1: rule__IfProcesses__Group_2__0 : rule__IfProcesses__Group_2__0__Impl rule__IfProcesses__Group_2__1 ;
    public final void rule__IfProcesses__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3554:1: ( rule__IfProcesses__Group_2__0__Impl rule__IfProcesses__Group_2__1 )
            // InternalGoatComponents.g:3555:2: rule__IfProcesses__Group_2__0__Impl rule__IfProcesses__Group_2__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalGoatComponents.g:3562:1: rule__IfProcesses__Group_2__0__Impl : ( 'else' ) ;
    public final void rule__IfProcesses__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3566:1: ( ( 'else' ) )
            // InternalGoatComponents.g:3567:1: ( 'else' )
            {
            // InternalGoatComponents.g:3567:1: ( 'else' )
            // InternalGoatComponents.g:3568:2: 'else'
            {
             before(grammarAccess.getIfProcessesAccess().getElseKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGoatComponents.g:3577:1: rule__IfProcesses__Group_2__1 : rule__IfProcesses__Group_2__1__Impl ;
    public final void rule__IfProcesses__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3581:1: ( rule__IfProcesses__Group_2__1__Impl )
            // InternalGoatComponents.g:3582:2: rule__IfProcesses__Group_2__1__Impl
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
    // InternalGoatComponents.g:3588:1: rule__IfProcesses__Group_2__1__Impl : ( ( rule__IfProcesses__BranchesAssignment_2_1 ) ) ;
    public final void rule__IfProcesses__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3592:1: ( ( ( rule__IfProcesses__BranchesAssignment_2_1 ) ) )
            // InternalGoatComponents.g:3593:1: ( ( rule__IfProcesses__BranchesAssignment_2_1 ) )
            {
            // InternalGoatComponents.g:3593:1: ( ( rule__IfProcesses__BranchesAssignment_2_1 ) )
            // InternalGoatComponents.g:3594:2: ( rule__IfProcesses__BranchesAssignment_2_1 )
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesAssignment_2_1()); 
            // InternalGoatComponents.g:3595:2: ( rule__IfProcesses__BranchesAssignment_2_1 )
            // InternalGoatComponents.g:3595:3: rule__IfProcesses__BranchesAssignment_2_1
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
    // InternalGoatComponents.g:3604:1: rule__IfProcesses__Group_3__0 : rule__IfProcesses__Group_3__0__Impl rule__IfProcesses__Group_3__1 ;
    public final void rule__IfProcesses__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3608:1: ( rule__IfProcesses__Group_3__0__Impl rule__IfProcesses__Group_3__1 )
            // InternalGoatComponents.g:3609:2: rule__IfProcesses__Group_3__0__Impl rule__IfProcesses__Group_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:3616:1: rule__IfProcesses__Group_3__0__Impl : ( 'else' ) ;
    public final void rule__IfProcesses__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3620:1: ( ( 'else' ) )
            // InternalGoatComponents.g:3621:1: ( 'else' )
            {
            // InternalGoatComponents.g:3621:1: ( 'else' )
            // InternalGoatComponents.g:3622:2: 'else'
            {
             before(grammarAccess.getIfProcessesAccess().getElseKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGoatComponents.g:3631:1: rule__IfProcesses__Group_3__1 : rule__IfProcesses__Group_3__1__Impl ;
    public final void rule__IfProcesses__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3635:1: ( rule__IfProcesses__Group_3__1__Impl )
            // InternalGoatComponents.g:3636:2: rule__IfProcesses__Group_3__1__Impl
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
    // InternalGoatComponents.g:3642:1: rule__IfProcesses__Group_3__1__Impl : ( ( rule__IfProcesses__BranchesAssignment_3_1 ) ) ;
    public final void rule__IfProcesses__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3646:1: ( ( ( rule__IfProcesses__BranchesAssignment_3_1 ) ) )
            // InternalGoatComponents.g:3647:1: ( ( rule__IfProcesses__BranchesAssignment_3_1 ) )
            {
            // InternalGoatComponents.g:3647:1: ( ( rule__IfProcesses__BranchesAssignment_3_1 ) )
            // InternalGoatComponents.g:3648:2: ( rule__IfProcesses__BranchesAssignment_3_1 )
            {
             before(grammarAccess.getIfProcessesAccess().getBranchesAssignment_3_1()); 
            // InternalGoatComponents.g:3649:2: ( rule__IfProcesses__BranchesAssignment_3_1 )
            // InternalGoatComponents.g:3649:3: rule__IfProcesses__BranchesAssignment_3_1
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
    // InternalGoatComponents.g:3658:1: rule__IfBranchProcess__Group__0 : rule__IfBranchProcess__Group__0__Impl rule__IfBranchProcess__Group__1 ;
    public final void rule__IfBranchProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3662:1: ( rule__IfBranchProcess__Group__0__Impl rule__IfBranchProcess__Group__1 )
            // InternalGoatComponents.g:3663:2: rule__IfBranchProcess__Group__0__Impl rule__IfBranchProcess__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalGoatComponents.g:3670:1: rule__IfBranchProcess__Group__0__Impl : ( () ) ;
    public final void rule__IfBranchProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3674:1: ( ( () ) )
            // InternalGoatComponents.g:3675:1: ( () )
            {
            // InternalGoatComponents.g:3675:1: ( () )
            // InternalGoatComponents.g:3676:2: ()
            {
             before(grammarAccess.getIfBranchProcessAccess().getIfBranchProcessAction_0()); 
            // InternalGoatComponents.g:3677:2: ()
            // InternalGoatComponents.g:3677:3: 
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
    // InternalGoatComponents.g:3685:1: rule__IfBranchProcess__Group__1 : rule__IfBranchProcess__Group__1__Impl rule__IfBranchProcess__Group__2 ;
    public final void rule__IfBranchProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3689:1: ( rule__IfBranchProcess__Group__1__Impl rule__IfBranchProcess__Group__2 )
            // InternalGoatComponents.g:3690:2: rule__IfBranchProcess__Group__1__Impl rule__IfBranchProcess__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGoatComponents.g:3697:1: rule__IfBranchProcess__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfBranchProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3701:1: ( ( 'if' ) )
            // InternalGoatComponents.g:3702:1: ( 'if' )
            {
            // InternalGoatComponents.g:3702:1: ( 'if' )
            // InternalGoatComponents.g:3703:2: 'if'
            {
             before(grammarAccess.getIfBranchProcessAccess().getIfKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGoatComponents.g:3712:1: rule__IfBranchProcess__Group__2 : rule__IfBranchProcess__Group__2__Impl rule__IfBranchProcess__Group__3 ;
    public final void rule__IfBranchProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3716:1: ( rule__IfBranchProcess__Group__2__Impl rule__IfBranchProcess__Group__3 )
            // InternalGoatComponents.g:3717:2: rule__IfBranchProcess__Group__2__Impl rule__IfBranchProcess__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:3724:1: rule__IfBranchProcess__Group__2__Impl : ( ( rule__IfBranchProcess__CondAssignment_2 ) ) ;
    public final void rule__IfBranchProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3728:1: ( ( ( rule__IfBranchProcess__CondAssignment_2 ) ) )
            // InternalGoatComponents.g:3729:1: ( ( rule__IfBranchProcess__CondAssignment_2 ) )
            {
            // InternalGoatComponents.g:3729:1: ( ( rule__IfBranchProcess__CondAssignment_2 ) )
            // InternalGoatComponents.g:3730:2: ( rule__IfBranchProcess__CondAssignment_2 )
            {
             before(grammarAccess.getIfBranchProcessAccess().getCondAssignment_2()); 
            // InternalGoatComponents.g:3731:2: ( rule__IfBranchProcess__CondAssignment_2 )
            // InternalGoatComponents.g:3731:3: rule__IfBranchProcess__CondAssignment_2
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
    // InternalGoatComponents.g:3739:1: rule__IfBranchProcess__Group__3 : rule__IfBranchProcess__Group__3__Impl rule__IfBranchProcess__Group__4 ;
    public final void rule__IfBranchProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3743:1: ( rule__IfBranchProcess__Group__3__Impl rule__IfBranchProcess__Group__4 )
            // InternalGoatComponents.g:3744:2: rule__IfBranchProcess__Group__3__Impl rule__IfBranchProcess__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalGoatComponents.g:3751:1: rule__IfBranchProcess__Group__3__Impl : ( '{' ) ;
    public final void rule__IfBranchProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3755:1: ( ( '{' ) )
            // InternalGoatComponents.g:3756:1: ( '{' )
            {
            // InternalGoatComponents.g:3756:1: ( '{' )
            // InternalGoatComponents.g:3757:2: '{'
            {
             before(grammarAccess.getIfBranchProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGoatComponents.g:3766:1: rule__IfBranchProcess__Group__4 : rule__IfBranchProcess__Group__4__Impl rule__IfBranchProcess__Group__5 ;
    public final void rule__IfBranchProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3770:1: ( rule__IfBranchProcess__Group__4__Impl rule__IfBranchProcess__Group__5 )
            // InternalGoatComponents.g:3771:2: rule__IfBranchProcess__Group__4__Impl rule__IfBranchProcess__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalGoatComponents.g:3778:1: rule__IfBranchProcess__Group__4__Impl : ( ( rule__IfBranchProcess__ThenAssignment_4 ) ) ;
    public final void rule__IfBranchProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3782:1: ( ( ( rule__IfBranchProcess__ThenAssignment_4 ) ) )
            // InternalGoatComponents.g:3783:1: ( ( rule__IfBranchProcess__ThenAssignment_4 ) )
            {
            // InternalGoatComponents.g:3783:1: ( ( rule__IfBranchProcess__ThenAssignment_4 ) )
            // InternalGoatComponents.g:3784:2: ( rule__IfBranchProcess__ThenAssignment_4 )
            {
             before(grammarAccess.getIfBranchProcessAccess().getThenAssignment_4()); 
            // InternalGoatComponents.g:3785:2: ( rule__IfBranchProcess__ThenAssignment_4 )
            // InternalGoatComponents.g:3785:3: rule__IfBranchProcess__ThenAssignment_4
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
    // InternalGoatComponents.g:3793:1: rule__IfBranchProcess__Group__5 : rule__IfBranchProcess__Group__5__Impl ;
    public final void rule__IfBranchProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3797:1: ( rule__IfBranchProcess__Group__5__Impl )
            // InternalGoatComponents.g:3798:2: rule__IfBranchProcess__Group__5__Impl
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
    // InternalGoatComponents.g:3804:1: rule__IfBranchProcess__Group__5__Impl : ( '}' ) ;
    public final void rule__IfBranchProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3808:1: ( ( '}' ) )
            // InternalGoatComponents.g:3809:1: ( '}' )
            {
            // InternalGoatComponents.g:3809:1: ( '}' )
            // InternalGoatComponents.g:3810:2: '}'
            {
             before(grammarAccess.getIfBranchProcessAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGoatComponents.g:3820:1: rule__ElseBranchProcess__Group__0 : rule__ElseBranchProcess__Group__0__Impl rule__ElseBranchProcess__Group__1 ;
    public final void rule__ElseBranchProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3824:1: ( rule__ElseBranchProcess__Group__0__Impl rule__ElseBranchProcess__Group__1 )
            // InternalGoatComponents.g:3825:2: rule__ElseBranchProcess__Group__0__Impl rule__ElseBranchProcess__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:3832:1: rule__ElseBranchProcess__Group__0__Impl : ( () ) ;
    public final void rule__ElseBranchProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3836:1: ( ( () ) )
            // InternalGoatComponents.g:3837:1: ( () )
            {
            // InternalGoatComponents.g:3837:1: ( () )
            // InternalGoatComponents.g:3838:2: ()
            {
             before(grammarAccess.getElseBranchProcessAccess().getIfBranchProcessAction_0()); 
            // InternalGoatComponents.g:3839:2: ()
            // InternalGoatComponents.g:3839:3: 
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
    // InternalGoatComponents.g:3847:1: rule__ElseBranchProcess__Group__1 : rule__ElseBranchProcess__Group__1__Impl rule__ElseBranchProcess__Group__2 ;
    public final void rule__ElseBranchProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3851:1: ( rule__ElseBranchProcess__Group__1__Impl rule__ElseBranchProcess__Group__2 )
            // InternalGoatComponents.g:3852:2: rule__ElseBranchProcess__Group__1__Impl rule__ElseBranchProcess__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGoatComponents.g:3859:1: rule__ElseBranchProcess__Group__1__Impl : ( '{' ) ;
    public final void rule__ElseBranchProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3863:1: ( ( '{' ) )
            // InternalGoatComponents.g:3864:1: ( '{' )
            {
            // InternalGoatComponents.g:3864:1: ( '{' )
            // InternalGoatComponents.g:3865:2: '{'
            {
             before(grammarAccess.getElseBranchProcessAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGoatComponents.g:3874:1: rule__ElseBranchProcess__Group__2 : rule__ElseBranchProcess__Group__2__Impl rule__ElseBranchProcess__Group__3 ;
    public final void rule__ElseBranchProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3878:1: ( rule__ElseBranchProcess__Group__2__Impl rule__ElseBranchProcess__Group__3 )
            // InternalGoatComponents.g:3879:2: rule__ElseBranchProcess__Group__2__Impl rule__ElseBranchProcess__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalGoatComponents.g:3886:1: rule__ElseBranchProcess__Group__2__Impl : ( ( rule__ElseBranchProcess__ThenAssignment_2 ) ) ;
    public final void rule__ElseBranchProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3890:1: ( ( ( rule__ElseBranchProcess__ThenAssignment_2 ) ) )
            // InternalGoatComponents.g:3891:1: ( ( rule__ElseBranchProcess__ThenAssignment_2 ) )
            {
            // InternalGoatComponents.g:3891:1: ( ( rule__ElseBranchProcess__ThenAssignment_2 ) )
            // InternalGoatComponents.g:3892:2: ( rule__ElseBranchProcess__ThenAssignment_2 )
            {
             before(grammarAccess.getElseBranchProcessAccess().getThenAssignment_2()); 
            // InternalGoatComponents.g:3893:2: ( rule__ElseBranchProcess__ThenAssignment_2 )
            // InternalGoatComponents.g:3893:3: rule__ElseBranchProcess__ThenAssignment_2
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
    // InternalGoatComponents.g:3901:1: rule__ElseBranchProcess__Group__3 : rule__ElseBranchProcess__Group__3__Impl ;
    public final void rule__ElseBranchProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3905:1: ( rule__ElseBranchProcess__Group__3__Impl )
            // InternalGoatComponents.g:3906:2: rule__ElseBranchProcess__Group__3__Impl
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
    // InternalGoatComponents.g:3912:1: rule__ElseBranchProcess__Group__3__Impl : ( '}' ) ;
    public final void rule__ElseBranchProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3916:1: ( ( '}' ) )
            // InternalGoatComponents.g:3917:1: ( '}' )
            {
            // InternalGoatComponents.g:3917:1: ( '}' )
            // InternalGoatComponents.g:3918:2: '}'
            {
             before(grammarAccess.getElseBranchProcessAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGoatComponents.g:3928:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3932:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalGoatComponents.g:3933:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGoatComponents.g:3940:1: rule__Update__Group__0__Impl : ( '[' ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3944:1: ( ( '[' ) )
            // InternalGoatComponents.g:3945:1: ( '[' )
            {
            // InternalGoatComponents.g:3945:1: ( '[' )
            // InternalGoatComponents.g:3946:2: '['
            {
             before(grammarAccess.getUpdateAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGoatComponents.g:3955:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3959:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalGoatComponents.g:3960:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalGoatComponents.g:3967:1: rule__Update__Group__1__Impl : ( ( rule__Update__VarsAssignment_1 ) ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3971:1: ( ( ( rule__Update__VarsAssignment_1 ) ) )
            // InternalGoatComponents.g:3972:1: ( ( rule__Update__VarsAssignment_1 ) )
            {
            // InternalGoatComponents.g:3972:1: ( ( rule__Update__VarsAssignment_1 ) )
            // InternalGoatComponents.g:3973:2: ( rule__Update__VarsAssignment_1 )
            {
             before(grammarAccess.getUpdateAccess().getVarsAssignment_1()); 
            // InternalGoatComponents.g:3974:2: ( rule__Update__VarsAssignment_1 )
            // InternalGoatComponents.g:3974:3: rule__Update__VarsAssignment_1
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
    // InternalGoatComponents.g:3982:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3986:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalGoatComponents.g:3987:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:3994:1: rule__Update__Group__2__Impl : ( ':=' ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:3998:1: ( ( ':=' ) )
            // InternalGoatComponents.g:3999:1: ( ':=' )
            {
            // InternalGoatComponents.g:3999:1: ( ':=' )
            // InternalGoatComponents.g:4000:2: ':='
            {
             before(grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGoatComponents.g:4009:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4013:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalGoatComponents.g:4014:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalGoatComponents.g:4021:1: rule__Update__Group__3__Impl : ( ( rule__Update__ValsAssignment_3 ) ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4025:1: ( ( ( rule__Update__ValsAssignment_3 ) ) )
            // InternalGoatComponents.g:4026:1: ( ( rule__Update__ValsAssignment_3 ) )
            {
            // InternalGoatComponents.g:4026:1: ( ( rule__Update__ValsAssignment_3 ) )
            // InternalGoatComponents.g:4027:2: ( rule__Update__ValsAssignment_3 )
            {
             before(grammarAccess.getUpdateAccess().getValsAssignment_3()); 
            // InternalGoatComponents.g:4028:2: ( rule__Update__ValsAssignment_3 )
            // InternalGoatComponents.g:4028:3: rule__Update__ValsAssignment_3
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
    // InternalGoatComponents.g:4036:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4040:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalGoatComponents.g:4041:2: rule__Update__Group__4__Impl rule__Update__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalGoatComponents.g:4048:1: rule__Update__Group__4__Impl : ( ( rule__Update__Group_4__0 )* ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4052:1: ( ( ( rule__Update__Group_4__0 )* ) )
            // InternalGoatComponents.g:4053:1: ( ( rule__Update__Group_4__0 )* )
            {
            // InternalGoatComponents.g:4053:1: ( ( rule__Update__Group_4__0 )* )
            // InternalGoatComponents.g:4054:2: ( rule__Update__Group_4__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_4()); 
            // InternalGoatComponents.g:4055:2: ( rule__Update__Group_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==31) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGoatComponents.g:4055:3: rule__Update__Group_4__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalGoatComponents.g:4063:1: rule__Update__Group__5 : rule__Update__Group__5__Impl ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4067:1: ( rule__Update__Group__5__Impl )
            // InternalGoatComponents.g:4068:2: rule__Update__Group__5__Impl
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
    // InternalGoatComponents.g:4074:1: rule__Update__Group__5__Impl : ( ']' ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4078:1: ( ( ']' ) )
            // InternalGoatComponents.g:4079:1: ( ']' )
            {
            // InternalGoatComponents.g:4079:1: ( ']' )
            // InternalGoatComponents.g:4080:2: ']'
            {
             before(grammarAccess.getUpdateAccess().getRightSquareBracketKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalGoatComponents.g:4090:1: rule__Update__Group_4__0 : rule__Update__Group_4__0__Impl rule__Update__Group_4__1 ;
    public final void rule__Update__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4094:1: ( rule__Update__Group_4__0__Impl rule__Update__Group_4__1 )
            // InternalGoatComponents.g:4095:2: rule__Update__Group_4__0__Impl rule__Update__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGoatComponents.g:4102:1: rule__Update__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Update__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4106:1: ( ( ',' ) )
            // InternalGoatComponents.g:4107:1: ( ',' )
            {
            // InternalGoatComponents.g:4107:1: ( ',' )
            // InternalGoatComponents.g:4108:2: ','
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGoatComponents.g:4117:1: rule__Update__Group_4__1 : rule__Update__Group_4__1__Impl rule__Update__Group_4__2 ;
    public final void rule__Update__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4121:1: ( rule__Update__Group_4__1__Impl rule__Update__Group_4__2 )
            // InternalGoatComponents.g:4122:2: rule__Update__Group_4__1__Impl rule__Update__Group_4__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalGoatComponents.g:4129:1: rule__Update__Group_4__1__Impl : ( ( rule__Update__VarsAssignment_4_1 ) ) ;
    public final void rule__Update__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4133:1: ( ( ( rule__Update__VarsAssignment_4_1 ) ) )
            // InternalGoatComponents.g:4134:1: ( ( rule__Update__VarsAssignment_4_1 ) )
            {
            // InternalGoatComponents.g:4134:1: ( ( rule__Update__VarsAssignment_4_1 ) )
            // InternalGoatComponents.g:4135:2: ( rule__Update__VarsAssignment_4_1 )
            {
             before(grammarAccess.getUpdateAccess().getVarsAssignment_4_1()); 
            // InternalGoatComponents.g:4136:2: ( rule__Update__VarsAssignment_4_1 )
            // InternalGoatComponents.g:4136:3: rule__Update__VarsAssignment_4_1
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
    // InternalGoatComponents.g:4144:1: rule__Update__Group_4__2 : rule__Update__Group_4__2__Impl rule__Update__Group_4__3 ;
    public final void rule__Update__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4148:1: ( rule__Update__Group_4__2__Impl rule__Update__Group_4__3 )
            // InternalGoatComponents.g:4149:2: rule__Update__Group_4__2__Impl rule__Update__Group_4__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:4156:1: rule__Update__Group_4__2__Impl : ( ':=' ) ;
    public final void rule__Update__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4160:1: ( ( ':=' ) )
            // InternalGoatComponents.g:4161:1: ( ':=' )
            {
            // InternalGoatComponents.g:4161:1: ( ':=' )
            // InternalGoatComponents.g:4162:2: ':='
            {
             before(grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_4_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGoatComponents.g:4171:1: rule__Update__Group_4__3 : rule__Update__Group_4__3__Impl ;
    public final void rule__Update__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4175:1: ( rule__Update__Group_4__3__Impl )
            // InternalGoatComponents.g:4176:2: rule__Update__Group_4__3__Impl
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
    // InternalGoatComponents.g:4182:1: rule__Update__Group_4__3__Impl : ( ( rule__Update__ValsAssignment_4_3 ) ) ;
    public final void rule__Update__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4186:1: ( ( ( rule__Update__ValsAssignment_4_3 ) ) )
            // InternalGoatComponents.g:4187:1: ( ( rule__Update__ValsAssignment_4_3 ) )
            {
            // InternalGoatComponents.g:4187:1: ( ( rule__Update__ValsAssignment_4_3 ) )
            // InternalGoatComponents.g:4188:2: ( rule__Update__ValsAssignment_4_3 )
            {
             before(grammarAccess.getUpdateAccess().getValsAssignment_4_3()); 
            // InternalGoatComponents.g:4189:2: ( rule__Update__ValsAssignment_4_3 )
            // InternalGoatComponents.g:4189:3: rule__Update__ValsAssignment_4_3
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
    // InternalGoatComponents.g:4198:1: rule__Awareness__Group__0 : rule__Awareness__Group__0__Impl rule__Awareness__Group__1 ;
    public final void rule__Awareness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4202:1: ( rule__Awareness__Group__0__Impl rule__Awareness__Group__1 )
            // InternalGoatComponents.g:4203:2: rule__Awareness__Group__0__Impl rule__Awareness__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalGoatComponents.g:4210:1: rule__Awareness__Group__0__Impl : ( 'wait' ) ;
    public final void rule__Awareness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4214:1: ( ( 'wait' ) )
            // InternalGoatComponents.g:4215:1: ( 'wait' )
            {
            // InternalGoatComponents.g:4215:1: ( 'wait' )
            // InternalGoatComponents.g:4216:2: 'wait'
            {
             before(grammarAccess.getAwarenessAccess().getWaitKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalGoatComponents.g:4225:1: rule__Awareness__Group__1 : rule__Awareness__Group__1__Impl rule__Awareness__Group__2 ;
    public final void rule__Awareness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4229:1: ( rule__Awareness__Group__1__Impl rule__Awareness__Group__2 )
            // InternalGoatComponents.g:4230:2: rule__Awareness__Group__1__Impl rule__Awareness__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponents.g:4237:1: rule__Awareness__Group__1__Impl : ( 'until' ) ;
    public final void rule__Awareness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4241:1: ( ( 'until' ) )
            // InternalGoatComponents.g:4242:1: ( 'until' )
            {
            // InternalGoatComponents.g:4242:1: ( 'until' )
            // InternalGoatComponents.g:4243:2: 'until'
            {
             before(grammarAccess.getAwarenessAccess().getUntilKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalGoatComponents.g:4252:1: rule__Awareness__Group__2 : rule__Awareness__Group__2__Impl rule__Awareness__Group__3 ;
    public final void rule__Awareness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4256:1: ( rule__Awareness__Group__2__Impl rule__Awareness__Group__3 )
            // InternalGoatComponents.g:4257:2: rule__Awareness__Group__2__Impl rule__Awareness__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:4264:1: rule__Awareness__Group__2__Impl : ( '(' ) ;
    public final void rule__Awareness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4268:1: ( ( '(' ) )
            // InternalGoatComponents.g:4269:1: ( '(' )
            {
            // InternalGoatComponents.g:4269:1: ( '(' )
            // InternalGoatComponents.g:4270:2: '('
            {
             before(grammarAccess.getAwarenessAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:4279:1: rule__Awareness__Group__3 : rule__Awareness__Group__3__Impl rule__Awareness__Group__4 ;
    public final void rule__Awareness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4283:1: ( rule__Awareness__Group__3__Impl rule__Awareness__Group__4 )
            // InternalGoatComponents.g:4284:2: rule__Awareness__Group__3__Impl rule__Awareness__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:4291:1: rule__Awareness__Group__3__Impl : ( ( rule__Awareness__PredAssignment_3 ) ) ;
    public final void rule__Awareness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4295:1: ( ( ( rule__Awareness__PredAssignment_3 ) ) )
            // InternalGoatComponents.g:4296:1: ( ( rule__Awareness__PredAssignment_3 ) )
            {
            // InternalGoatComponents.g:4296:1: ( ( rule__Awareness__PredAssignment_3 ) )
            // InternalGoatComponents.g:4297:2: ( rule__Awareness__PredAssignment_3 )
            {
             before(grammarAccess.getAwarenessAccess().getPredAssignment_3()); 
            // InternalGoatComponents.g:4298:2: ( rule__Awareness__PredAssignment_3 )
            // InternalGoatComponents.g:4298:3: rule__Awareness__PredAssignment_3
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
    // InternalGoatComponents.g:4306:1: rule__Awareness__Group__4 : rule__Awareness__Group__4__Impl ;
    public final void rule__Awareness__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4310:1: ( rule__Awareness__Group__4__Impl )
            // InternalGoatComponents.g:4311:2: rule__Awareness__Group__4__Impl
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
    // InternalGoatComponents.g:4317:1: rule__Awareness__Group__4__Impl : ( ')' ) ;
    public final void rule__Awareness__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4321:1: ( ( ')' ) )
            // InternalGoatComponents.g:4322:1: ( ')' )
            {
            // InternalGoatComponents.g:4322:1: ( ')' )
            // InternalGoatComponents.g:4323:2: ')'
            {
             before(grammarAccess.getAwarenessAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:4333:1: rule__NZCProcess__Group_0__0 : rule__NZCProcess__Group_0__0__Impl rule__NZCProcess__Group_0__1 ;
    public final void rule__NZCProcess__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4337:1: ( rule__NZCProcess__Group_0__0__Impl rule__NZCProcess__Group_0__1 )
            // InternalGoatComponents.g:4338:2: rule__NZCProcess__Group_0__0__Impl rule__NZCProcess__Group_0__1
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
    // InternalGoatComponents.g:4345:1: rule__NZCProcess__Group_0__0__Impl : ( '(' ) ;
    public final void rule__NZCProcess__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4349:1: ( ( '(' ) )
            // InternalGoatComponents.g:4350:1: ( '(' )
            {
            // InternalGoatComponents.g:4350:1: ( '(' )
            // InternalGoatComponents.g:4351:2: '('
            {
             before(grammarAccess.getNZCProcessAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:4360:1: rule__NZCProcess__Group_0__1 : rule__NZCProcess__Group_0__1__Impl rule__NZCProcess__Group_0__2 ;
    public final void rule__NZCProcess__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4364:1: ( rule__NZCProcess__Group_0__1__Impl rule__NZCProcess__Group_0__2 )
            // InternalGoatComponents.g:4365:2: rule__NZCProcess__Group_0__1__Impl rule__NZCProcess__Group_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:4372:1: rule__NZCProcess__Group_0__1__Impl : ( ruleProc ) ;
    public final void rule__NZCProcess__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4376:1: ( ( ruleProc ) )
            // InternalGoatComponents.g:4377:1: ( ruleProc )
            {
            // InternalGoatComponents.g:4377:1: ( ruleProc )
            // InternalGoatComponents.g:4378:2: ruleProc
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
    // InternalGoatComponents.g:4387:1: rule__NZCProcess__Group_0__2 : rule__NZCProcess__Group_0__2__Impl ;
    public final void rule__NZCProcess__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4391:1: ( rule__NZCProcess__Group_0__2__Impl )
            // InternalGoatComponents.g:4392:2: rule__NZCProcess__Group_0__2__Impl
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
    // InternalGoatComponents.g:4398:1: rule__NZCProcess__Group_0__2__Impl : ( ')' ) ;
    public final void rule__NZCProcess__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4402:1: ( ( ')' ) )
            // InternalGoatComponents.g:4403:1: ( ')' )
            {
            // InternalGoatComponents.g:4403:1: ( ')' )
            // InternalGoatComponents.g:4404:2: ')'
            {
             before(grammarAccess.getNZCProcessAccess().getRightParenthesisKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:4414:1: rule__NProcess__Group_0__0 : rule__NProcess__Group_0__0__Impl rule__NProcess__Group_0__1 ;
    public final void rule__NProcess__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4418:1: ( rule__NProcess__Group_0__0__Impl rule__NProcess__Group_0__1 )
            // InternalGoatComponents.g:4419:2: rule__NProcess__Group_0__0__Impl rule__NProcess__Group_0__1
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
    // InternalGoatComponents.g:4426:1: rule__NProcess__Group_0__0__Impl : ( '(' ) ;
    public final void rule__NProcess__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4430:1: ( ( '(' ) )
            // InternalGoatComponents.g:4431:1: ( '(' )
            {
            // InternalGoatComponents.g:4431:1: ( '(' )
            // InternalGoatComponents.g:4432:2: '('
            {
             before(grammarAccess.getNProcessAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:4441:1: rule__NProcess__Group_0__1 : rule__NProcess__Group_0__1__Impl rule__NProcess__Group_0__2 ;
    public final void rule__NProcess__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4445:1: ( rule__NProcess__Group_0__1__Impl rule__NProcess__Group_0__2 )
            // InternalGoatComponents.g:4446:2: rule__NProcess__Group_0__1__Impl rule__NProcess__Group_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:4453:1: rule__NProcess__Group_0__1__Impl : ( ruleProc ) ;
    public final void rule__NProcess__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4457:1: ( ( ruleProc ) )
            // InternalGoatComponents.g:4458:1: ( ruleProc )
            {
            // InternalGoatComponents.g:4458:1: ( ruleProc )
            // InternalGoatComponents.g:4459:2: ruleProc
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
    // InternalGoatComponents.g:4468:1: rule__NProcess__Group_0__2 : rule__NProcess__Group_0__2__Impl ;
    public final void rule__NProcess__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4472:1: ( rule__NProcess__Group_0__2__Impl )
            // InternalGoatComponents.g:4473:2: rule__NProcess__Group_0__2__Impl
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
    // InternalGoatComponents.g:4479:1: rule__NProcess__Group_0__2__Impl : ( ')' ) ;
    public final void rule__NProcess__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4483:1: ( ( ')' ) )
            // InternalGoatComponents.g:4484:1: ( ')' )
            {
            // InternalGoatComponents.g:4484:1: ( ')' )
            // InternalGoatComponents.g:4485:2: ')'
            {
             before(grammarAccess.getNProcessAccess().getRightParenthesisKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:4495:1: rule__CallProcess__Group__0 : rule__CallProcess__Group__0__Impl rule__CallProcess__Group__1 ;
    public final void rule__CallProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4499:1: ( rule__CallProcess__Group__0__Impl rule__CallProcess__Group__1 )
            // InternalGoatComponents.g:4500:2: rule__CallProcess__Group__0__Impl rule__CallProcess__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:4507:1: rule__CallProcess__Group__0__Impl : ( () ) ;
    public final void rule__CallProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4511:1: ( ( () ) )
            // InternalGoatComponents.g:4512:1: ( () )
            {
            // InternalGoatComponents.g:4512:1: ( () )
            // InternalGoatComponents.g:4513:2: ()
            {
             before(grammarAccess.getCallProcessAccess().getCallProcessAction_0()); 
            // InternalGoatComponents.g:4514:2: ()
            // InternalGoatComponents.g:4514:3: 
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
    // InternalGoatComponents.g:4522:1: rule__CallProcess__Group__1 : rule__CallProcess__Group__1__Impl ;
    public final void rule__CallProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4526:1: ( rule__CallProcess__Group__1__Impl )
            // InternalGoatComponents.g:4527:2: rule__CallProcess__Group__1__Impl
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
    // InternalGoatComponents.g:4533:1: rule__CallProcess__Group__1__Impl : ( ( rule__CallProcess__ProcnameAssignment_1 ) ) ;
    public final void rule__CallProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4537:1: ( ( ( rule__CallProcess__ProcnameAssignment_1 ) ) )
            // InternalGoatComponents.g:4538:1: ( ( rule__CallProcess__ProcnameAssignment_1 ) )
            {
            // InternalGoatComponents.g:4538:1: ( ( rule__CallProcess__ProcnameAssignment_1 ) )
            // InternalGoatComponents.g:4539:2: ( rule__CallProcess__ProcnameAssignment_1 )
            {
             before(grammarAccess.getCallProcessAccess().getProcnameAssignment_1()); 
            // InternalGoatComponents.g:4540:2: ( rule__CallProcess__ProcnameAssignment_1 )
            // InternalGoatComponents.g:4540:3: rule__CallProcess__ProcnameAssignment_1
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
    // InternalGoatComponents.g:4549:1: rule__ZeroProcess__Group__0 : rule__ZeroProcess__Group__0__Impl rule__ZeroProcess__Group__1 ;
    public final void rule__ZeroProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4553:1: ( rule__ZeroProcess__Group__0__Impl rule__ZeroProcess__Group__1 )
            // InternalGoatComponents.g:4554:2: rule__ZeroProcess__Group__0__Impl rule__ZeroProcess__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalGoatComponents.g:4561:1: rule__ZeroProcess__Group__0__Impl : ( () ) ;
    public final void rule__ZeroProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4565:1: ( ( () ) )
            // InternalGoatComponents.g:4566:1: ( () )
            {
            // InternalGoatComponents.g:4566:1: ( () )
            // InternalGoatComponents.g:4567:2: ()
            {
             before(grammarAccess.getZeroProcessAccess().getZeroProcessAction_0()); 
            // InternalGoatComponents.g:4568:2: ()
            // InternalGoatComponents.g:4568:3: 
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
    // InternalGoatComponents.g:4576:1: rule__ZeroProcess__Group__1 : rule__ZeroProcess__Group__1__Impl ;
    public final void rule__ZeroProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4580:1: ( rule__ZeroProcess__Group__1__Impl )
            // InternalGoatComponents.g:4581:2: rule__ZeroProcess__Group__1__Impl
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
    // InternalGoatComponents.g:4587:1: rule__ZeroProcess__Group__1__Impl : ( 'nil' ) ;
    public final void rule__ZeroProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4591:1: ( ( 'nil' ) )
            // InternalGoatComponents.g:4592:1: ( 'nil' )
            {
            // InternalGoatComponents.g:4592:1: ( 'nil' )
            // InternalGoatComponents.g:4593:2: 'nil'
            {
             before(grammarAccess.getZeroProcessAccess().getNilKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalGoatComponents.g:4603:1: rule__ProcessDefinition__Group__0 : rule__ProcessDefinition__Group__0__Impl rule__ProcessDefinition__Group__1 ;
    public final void rule__ProcessDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4607:1: ( rule__ProcessDefinition__Group__0__Impl rule__ProcessDefinition__Group__1 )
            // InternalGoatComponents.g:4608:2: rule__ProcessDefinition__Group__0__Impl rule__ProcessDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:4615:1: rule__ProcessDefinition__Group__0__Impl : ( 'proc' ) ;
    public final void rule__ProcessDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4619:1: ( ( 'proc' ) )
            // InternalGoatComponents.g:4620:1: ( 'proc' )
            {
            // InternalGoatComponents.g:4620:1: ( 'proc' )
            // InternalGoatComponents.g:4621:2: 'proc'
            {
             before(grammarAccess.getProcessDefinitionAccess().getProcKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGoatComponents.g:4630:1: rule__ProcessDefinition__Group__1 : rule__ProcessDefinition__Group__1__Impl rule__ProcessDefinition__Group__2 ;
    public final void rule__ProcessDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4634:1: ( rule__ProcessDefinition__Group__1__Impl rule__ProcessDefinition__Group__2 )
            // InternalGoatComponents.g:4635:2: rule__ProcessDefinition__Group__1__Impl rule__ProcessDefinition__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalGoatComponents.g:4642:1: rule__ProcessDefinition__Group__1__Impl : ( ( rule__ProcessDefinition__NameAssignment_1 ) ) ;
    public final void rule__ProcessDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4646:1: ( ( ( rule__ProcessDefinition__NameAssignment_1 ) ) )
            // InternalGoatComponents.g:4647:1: ( ( rule__ProcessDefinition__NameAssignment_1 ) )
            {
            // InternalGoatComponents.g:4647:1: ( ( rule__ProcessDefinition__NameAssignment_1 ) )
            // InternalGoatComponents.g:4648:2: ( rule__ProcessDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getProcessDefinitionAccess().getNameAssignment_1()); 
            // InternalGoatComponents.g:4649:2: ( rule__ProcessDefinition__NameAssignment_1 )
            // InternalGoatComponents.g:4649:3: rule__ProcessDefinition__NameAssignment_1
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
    // InternalGoatComponents.g:4657:1: rule__ProcessDefinition__Group__2 : rule__ProcessDefinition__Group__2__Impl rule__ProcessDefinition__Group__3 ;
    public final void rule__ProcessDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4661:1: ( rule__ProcessDefinition__Group__2__Impl rule__ProcessDefinition__Group__3 )
            // InternalGoatComponents.g:4662:2: rule__ProcessDefinition__Group__2__Impl rule__ProcessDefinition__Group__3
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
    // InternalGoatComponents.g:4669:1: rule__ProcessDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__ProcessDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4673:1: ( ( '=' ) )
            // InternalGoatComponents.g:4674:1: ( '=' )
            {
            // InternalGoatComponents.g:4674:1: ( '=' )
            // InternalGoatComponents.g:4675:2: '='
            {
             before(grammarAccess.getProcessDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGoatComponents.g:4684:1: rule__ProcessDefinition__Group__3 : rule__ProcessDefinition__Group__3__Impl ;
    public final void rule__ProcessDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4688:1: ( rule__ProcessDefinition__Group__3__Impl )
            // InternalGoatComponents.g:4689:2: rule__ProcessDefinition__Group__3__Impl
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
    // InternalGoatComponents.g:4695:1: rule__ProcessDefinition__Group__3__Impl : ( ( rule__ProcessDefinition__ProcAssignment_3 ) ) ;
    public final void rule__ProcessDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4699:1: ( ( ( rule__ProcessDefinition__ProcAssignment_3 ) ) )
            // InternalGoatComponents.g:4700:1: ( ( rule__ProcessDefinition__ProcAssignment_3 ) )
            {
            // InternalGoatComponents.g:4700:1: ( ( rule__ProcessDefinition__ProcAssignment_3 ) )
            // InternalGoatComponents.g:4701:2: ( rule__ProcessDefinition__ProcAssignment_3 )
            {
             before(grammarAccess.getProcessDefinitionAccess().getProcAssignment_3()); 
            // InternalGoatComponents.g:4702:2: ( rule__ProcessDefinition__ProcAssignment_3 )
            // InternalGoatComponents.g:4702:3: rule__ProcessDefinition__ProcAssignment_3
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
    // InternalGoatComponents.g:4711:1: rule__EnvInitValue__Group_0__0 : rule__EnvInitValue__Group_0__0__Impl rule__EnvInitValue__Group_0__1 ;
    public final void rule__EnvInitValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4715:1: ( rule__EnvInitValue__Group_0__0__Impl rule__EnvInitValue__Group_0__1 )
            // InternalGoatComponents.g:4716:2: rule__EnvInitValue__Group_0__0__Impl rule__EnvInitValue__Group_0__1
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
    // InternalGoatComponents.g:4723:1: rule__EnvInitValue__Group_0__0__Impl : ( () ) ;
    public final void rule__EnvInitValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4727:1: ( ( () ) )
            // InternalGoatComponents.g:4728:1: ( () )
            {
            // InternalGoatComponents.g:4728:1: ( () )
            // InternalGoatComponents.g:4729:2: ()
            {
             before(grammarAccess.getEnvInitValueAccess().getIntConstantAction_0_0()); 
            // InternalGoatComponents.g:4730:2: ()
            // InternalGoatComponents.g:4730:3: 
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
    // InternalGoatComponents.g:4738:1: rule__EnvInitValue__Group_0__1 : rule__EnvInitValue__Group_0__1__Impl ;
    public final void rule__EnvInitValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4742:1: ( rule__EnvInitValue__Group_0__1__Impl )
            // InternalGoatComponents.g:4743:2: rule__EnvInitValue__Group_0__1__Impl
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
    // InternalGoatComponents.g:4749:1: rule__EnvInitValue__Group_0__1__Impl : ( ( rule__EnvInitValue__ValueAssignment_0_1 ) ) ;
    public final void rule__EnvInitValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4753:1: ( ( ( rule__EnvInitValue__ValueAssignment_0_1 ) ) )
            // InternalGoatComponents.g:4754:1: ( ( rule__EnvInitValue__ValueAssignment_0_1 ) )
            {
            // InternalGoatComponents.g:4754:1: ( ( rule__EnvInitValue__ValueAssignment_0_1 ) )
            // InternalGoatComponents.g:4755:2: ( rule__EnvInitValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAssignment_0_1()); 
            // InternalGoatComponents.g:4756:2: ( rule__EnvInitValue__ValueAssignment_0_1 )
            // InternalGoatComponents.g:4756:3: rule__EnvInitValue__ValueAssignment_0_1
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
    // InternalGoatComponents.g:4765:1: rule__EnvInitValue__Group_1__0 : rule__EnvInitValue__Group_1__0__Impl rule__EnvInitValue__Group_1__1 ;
    public final void rule__EnvInitValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4769:1: ( rule__EnvInitValue__Group_1__0__Impl rule__EnvInitValue__Group_1__1 )
            // InternalGoatComponents.g:4770:2: rule__EnvInitValue__Group_1__0__Impl rule__EnvInitValue__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalGoatComponents.g:4777:1: rule__EnvInitValue__Group_1__0__Impl : ( () ) ;
    public final void rule__EnvInitValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4781:1: ( ( () ) )
            // InternalGoatComponents.g:4782:1: ( () )
            {
            // InternalGoatComponents.g:4782:1: ( () )
            // InternalGoatComponents.g:4783:2: ()
            {
             before(grammarAccess.getEnvInitValueAccess().getStringConstantAction_1_0()); 
            // InternalGoatComponents.g:4784:2: ()
            // InternalGoatComponents.g:4784:3: 
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
    // InternalGoatComponents.g:4792:1: rule__EnvInitValue__Group_1__1 : rule__EnvInitValue__Group_1__1__Impl ;
    public final void rule__EnvInitValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4796:1: ( rule__EnvInitValue__Group_1__1__Impl )
            // InternalGoatComponents.g:4797:2: rule__EnvInitValue__Group_1__1__Impl
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
    // InternalGoatComponents.g:4803:1: rule__EnvInitValue__Group_1__1__Impl : ( ( rule__EnvInitValue__ValueAssignment_1_1 ) ) ;
    public final void rule__EnvInitValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4807:1: ( ( ( rule__EnvInitValue__ValueAssignment_1_1 ) ) )
            // InternalGoatComponents.g:4808:1: ( ( rule__EnvInitValue__ValueAssignment_1_1 ) )
            {
            // InternalGoatComponents.g:4808:1: ( ( rule__EnvInitValue__ValueAssignment_1_1 ) )
            // InternalGoatComponents.g:4809:2: ( rule__EnvInitValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAssignment_1_1()); 
            // InternalGoatComponents.g:4810:2: ( rule__EnvInitValue__ValueAssignment_1_1 )
            // InternalGoatComponents.g:4810:3: rule__EnvInitValue__ValueAssignment_1_1
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
    // InternalGoatComponents.g:4819:1: rule__EnvInitValue__Group_2__0 : rule__EnvInitValue__Group_2__0__Impl rule__EnvInitValue__Group_2__1 ;
    public final void rule__EnvInitValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4823:1: ( rule__EnvInitValue__Group_2__0__Impl rule__EnvInitValue__Group_2__1 )
            // InternalGoatComponents.g:4824:2: rule__EnvInitValue__Group_2__0__Impl rule__EnvInitValue__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalGoatComponents.g:4831:1: rule__EnvInitValue__Group_2__0__Impl : ( () ) ;
    public final void rule__EnvInitValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4835:1: ( ( () ) )
            // InternalGoatComponents.g:4836:1: ( () )
            {
            // InternalGoatComponents.g:4836:1: ( () )
            // InternalGoatComponents.g:4837:2: ()
            {
             before(grammarAccess.getEnvInitValueAccess().getBoolConstantAction_2_0()); 
            // InternalGoatComponents.g:4838:2: ()
            // InternalGoatComponents.g:4838:3: 
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
    // InternalGoatComponents.g:4846:1: rule__EnvInitValue__Group_2__1 : rule__EnvInitValue__Group_2__1__Impl ;
    public final void rule__EnvInitValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4850:1: ( rule__EnvInitValue__Group_2__1__Impl )
            // InternalGoatComponents.g:4851:2: rule__EnvInitValue__Group_2__1__Impl
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
    // InternalGoatComponents.g:4857:1: rule__EnvInitValue__Group_2__1__Impl : ( ( rule__EnvInitValue__ValueAssignment_2_1 ) ) ;
    public final void rule__EnvInitValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4861:1: ( ( ( rule__EnvInitValue__ValueAssignment_2_1 ) ) )
            // InternalGoatComponents.g:4862:1: ( ( rule__EnvInitValue__ValueAssignment_2_1 ) )
            {
            // InternalGoatComponents.g:4862:1: ( ( rule__EnvInitValue__ValueAssignment_2_1 ) )
            // InternalGoatComponents.g:4863:2: ( rule__EnvInitValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAssignment_2_1()); 
            // InternalGoatComponents.g:4864:2: ( rule__EnvInitValue__ValueAssignment_2_1 )
            // InternalGoatComponents.g:4864:3: rule__EnvInitValue__ValueAssignment_2_1
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
    // InternalGoatComponents.g:4873:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4877:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalGoatComponents.g:4878:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:4885:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4889:1: ( ( () ) )
            // InternalGoatComponents.g:4890:1: ( () )
            {
            // InternalGoatComponents.g:4890:1: ( () )
            // InternalGoatComponents.g:4891:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalGoatComponents.g:4892:2: ()
            // InternalGoatComponents.g:4892:3: 
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
    // InternalGoatComponents.g:4900:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4904:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalGoatComponents.g:4905:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalGoatComponents.g:4912:1: rule__Environment__Group__1__Impl : ( '{' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4916:1: ( ( '{' ) )
            // InternalGoatComponents.g:4917:1: ( '{' )
            {
            // InternalGoatComponents.g:4917:1: ( '{' )
            // InternalGoatComponents.g:4918:2: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGoatComponents.g:4927:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4931:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalGoatComponents.g:4932:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalGoatComponents.g:4939:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Group_2__0 )? ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4943:1: ( ( ( rule__Environment__Group_2__0 )? ) )
            // InternalGoatComponents.g:4944:1: ( ( rule__Environment__Group_2__0 )? )
            {
            // InternalGoatComponents.g:4944:1: ( ( rule__Environment__Group_2__0 )? )
            // InternalGoatComponents.g:4945:2: ( rule__Environment__Group_2__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_2()); 
            // InternalGoatComponents.g:4946:2: ( rule__Environment__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGoatComponents.g:4946:3: rule__Environment__Group_2__0
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
    // InternalGoatComponents.g:4954:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4958:1: ( rule__Environment__Group__3__Impl )
            // InternalGoatComponents.g:4959:2: rule__Environment__Group__3__Impl
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
    // InternalGoatComponents.g:4965:1: rule__Environment__Group__3__Impl : ( '}' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4969:1: ( ( '}' ) )
            // InternalGoatComponents.g:4970:1: ( '}' )
            {
            // InternalGoatComponents.g:4970:1: ( '}' )
            // InternalGoatComponents.g:4971:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGoatComponents.g:4981:1: rule__Environment__Group_2__0 : rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1 ;
    public final void rule__Environment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4985:1: ( rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1 )
            // InternalGoatComponents.g:4986:2: rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalGoatComponents.g:4993:1: rule__Environment__Group_2__0__Impl : ( ( rule__Environment__AttrsAssignment_2_0 ) ) ;
    public final void rule__Environment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:4997:1: ( ( ( rule__Environment__AttrsAssignment_2_0 ) ) )
            // InternalGoatComponents.g:4998:1: ( ( rule__Environment__AttrsAssignment_2_0 ) )
            {
            // InternalGoatComponents.g:4998:1: ( ( rule__Environment__AttrsAssignment_2_0 ) )
            // InternalGoatComponents.g:4999:2: ( rule__Environment__AttrsAssignment_2_0 )
            {
             before(grammarAccess.getEnvironmentAccess().getAttrsAssignment_2_0()); 
            // InternalGoatComponents.g:5000:2: ( rule__Environment__AttrsAssignment_2_0 )
            // InternalGoatComponents.g:5000:3: rule__Environment__AttrsAssignment_2_0
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
    // InternalGoatComponents.g:5008:1: rule__Environment__Group_2__1 : rule__Environment__Group_2__1__Impl rule__Environment__Group_2__2 ;
    public final void rule__Environment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5012:1: ( rule__Environment__Group_2__1__Impl rule__Environment__Group_2__2 )
            // InternalGoatComponents.g:5013:2: rule__Environment__Group_2__1__Impl rule__Environment__Group_2__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalGoatComponents.g:5020:1: rule__Environment__Group_2__1__Impl : ( ':=' ) ;
    public final void rule__Environment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5024:1: ( ( ':=' ) )
            // InternalGoatComponents.g:5025:1: ( ':=' )
            {
            // InternalGoatComponents.g:5025:1: ( ':=' )
            // InternalGoatComponents.g:5026:2: ':='
            {
             before(grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGoatComponents.g:5035:1: rule__Environment__Group_2__2 : rule__Environment__Group_2__2__Impl rule__Environment__Group_2__3 ;
    public final void rule__Environment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5039:1: ( rule__Environment__Group_2__2__Impl rule__Environment__Group_2__3 )
            // InternalGoatComponents.g:5040:2: rule__Environment__Group_2__2__Impl rule__Environment__Group_2__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalGoatComponents.g:5047:1: rule__Environment__Group_2__2__Impl : ( ( rule__Environment__ValsAssignment_2_2 ) ) ;
    public final void rule__Environment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5051:1: ( ( ( rule__Environment__ValsAssignment_2_2 ) ) )
            // InternalGoatComponents.g:5052:1: ( ( rule__Environment__ValsAssignment_2_2 ) )
            {
            // InternalGoatComponents.g:5052:1: ( ( rule__Environment__ValsAssignment_2_2 ) )
            // InternalGoatComponents.g:5053:2: ( rule__Environment__ValsAssignment_2_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getValsAssignment_2_2()); 
            // InternalGoatComponents.g:5054:2: ( rule__Environment__ValsAssignment_2_2 )
            // InternalGoatComponents.g:5054:3: rule__Environment__ValsAssignment_2_2
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
    // InternalGoatComponents.g:5062:1: rule__Environment__Group_2__3 : rule__Environment__Group_2__3__Impl ;
    public final void rule__Environment__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5066:1: ( rule__Environment__Group_2__3__Impl )
            // InternalGoatComponents.g:5067:2: rule__Environment__Group_2__3__Impl
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
    // InternalGoatComponents.g:5073:1: rule__Environment__Group_2__3__Impl : ( ( rule__Environment__Group_2_3__0 )* ) ;
    public final void rule__Environment__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5077:1: ( ( ( rule__Environment__Group_2_3__0 )* ) )
            // InternalGoatComponents.g:5078:1: ( ( rule__Environment__Group_2_3__0 )* )
            {
            // InternalGoatComponents.g:5078:1: ( ( rule__Environment__Group_2_3__0 )* )
            // InternalGoatComponents.g:5079:2: ( rule__Environment__Group_2_3__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_2_3()); 
            // InternalGoatComponents.g:5080:2: ( rule__Environment__Group_2_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==31) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGoatComponents.g:5080:3: rule__Environment__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalGoatComponents.g:5089:1: rule__Environment__Group_2_3__0 : rule__Environment__Group_2_3__0__Impl rule__Environment__Group_2_3__1 ;
    public final void rule__Environment__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5093:1: ( rule__Environment__Group_2_3__0__Impl rule__Environment__Group_2_3__1 )
            // InternalGoatComponents.g:5094:2: rule__Environment__Group_2_3__0__Impl rule__Environment__Group_2_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:5101:1: rule__Environment__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Environment__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5105:1: ( ( ',' ) )
            // InternalGoatComponents.g:5106:1: ( ',' )
            {
            // InternalGoatComponents.g:5106:1: ( ',' )
            // InternalGoatComponents.g:5107:2: ','
            {
             before(grammarAccess.getEnvironmentAccess().getCommaKeyword_2_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGoatComponents.g:5116:1: rule__Environment__Group_2_3__1 : rule__Environment__Group_2_3__1__Impl rule__Environment__Group_2_3__2 ;
    public final void rule__Environment__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5120:1: ( rule__Environment__Group_2_3__1__Impl rule__Environment__Group_2_3__2 )
            // InternalGoatComponents.g:5121:2: rule__Environment__Group_2_3__1__Impl rule__Environment__Group_2_3__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalGoatComponents.g:5128:1: rule__Environment__Group_2_3__1__Impl : ( ( rule__Environment__AttrsAssignment_2_3_1 ) ) ;
    public final void rule__Environment__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5132:1: ( ( ( rule__Environment__AttrsAssignment_2_3_1 ) ) )
            // InternalGoatComponents.g:5133:1: ( ( rule__Environment__AttrsAssignment_2_3_1 ) )
            {
            // InternalGoatComponents.g:5133:1: ( ( rule__Environment__AttrsAssignment_2_3_1 ) )
            // InternalGoatComponents.g:5134:2: ( rule__Environment__AttrsAssignment_2_3_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getAttrsAssignment_2_3_1()); 
            // InternalGoatComponents.g:5135:2: ( rule__Environment__AttrsAssignment_2_3_1 )
            // InternalGoatComponents.g:5135:3: rule__Environment__AttrsAssignment_2_3_1
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
    // InternalGoatComponents.g:5143:1: rule__Environment__Group_2_3__2 : rule__Environment__Group_2_3__2__Impl rule__Environment__Group_2_3__3 ;
    public final void rule__Environment__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5147:1: ( rule__Environment__Group_2_3__2__Impl rule__Environment__Group_2_3__3 )
            // InternalGoatComponents.g:5148:2: rule__Environment__Group_2_3__2__Impl rule__Environment__Group_2_3__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalGoatComponents.g:5155:1: rule__Environment__Group_2_3__2__Impl : ( ':=' ) ;
    public final void rule__Environment__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5159:1: ( ( ':=' ) )
            // InternalGoatComponents.g:5160:1: ( ':=' )
            {
            // InternalGoatComponents.g:5160:1: ( ':=' )
            // InternalGoatComponents.g:5161:2: ':='
            {
             before(grammarAccess.getEnvironmentAccess().getColonEqualsSignKeyword_2_3_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGoatComponents.g:5170:1: rule__Environment__Group_2_3__3 : rule__Environment__Group_2_3__3__Impl ;
    public final void rule__Environment__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5174:1: ( rule__Environment__Group_2_3__3__Impl )
            // InternalGoatComponents.g:5175:2: rule__Environment__Group_2_3__3__Impl
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
    // InternalGoatComponents.g:5181:1: rule__Environment__Group_2_3__3__Impl : ( ( rule__Environment__ValsAssignment_2_3_3 ) ) ;
    public final void rule__Environment__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5185:1: ( ( ( rule__Environment__ValsAssignment_2_3_3 ) ) )
            // InternalGoatComponents.g:5186:1: ( ( rule__Environment__ValsAssignment_2_3_3 ) )
            {
            // InternalGoatComponents.g:5186:1: ( ( rule__Environment__ValsAssignment_2_3_3 ) )
            // InternalGoatComponents.g:5187:2: ( rule__Environment__ValsAssignment_2_3_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getValsAssignment_2_3_3()); 
            // InternalGoatComponents.g:5188:2: ( rule__Environment__ValsAssignment_2_3_3 )
            // InternalGoatComponents.g:5188:3: rule__Environment__ValsAssignment_2_3_3
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
    // InternalGoatComponents.g:5197:1: rule__ComponentDefinition__Group__0 : rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 ;
    public final void rule__ComponentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5201:1: ( rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 )
            // InternalGoatComponents.g:5202:2: rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:5209:1: rule__ComponentDefinition__Group__0__Impl : ( 'component' ) ;
    public final void rule__ComponentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5213:1: ( ( 'component' ) )
            // InternalGoatComponents.g:5214:1: ( 'component' )
            {
            // InternalGoatComponents.g:5214:1: ( 'component' )
            // InternalGoatComponents.g:5215:2: 'component'
            {
             before(grammarAccess.getComponentDefinitionAccess().getComponentKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalGoatComponents.g:5224:1: rule__ComponentDefinition__Group__1 : rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 ;
    public final void rule__ComponentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5228:1: ( rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 )
            // InternalGoatComponents.g:5229:2: rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:5236:1: rule__ComponentDefinition__Group__1__Impl : ( ( rule__ComponentDefinition__EnvAssignment_1 ) ) ;
    public final void rule__ComponentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5240:1: ( ( ( rule__ComponentDefinition__EnvAssignment_1 ) ) )
            // InternalGoatComponents.g:5241:1: ( ( rule__ComponentDefinition__EnvAssignment_1 ) )
            {
            // InternalGoatComponents.g:5241:1: ( ( rule__ComponentDefinition__EnvAssignment_1 ) )
            // InternalGoatComponents.g:5242:2: ( rule__ComponentDefinition__EnvAssignment_1 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getEnvAssignment_1()); 
            // InternalGoatComponents.g:5243:2: ( rule__ComponentDefinition__EnvAssignment_1 )
            // InternalGoatComponents.g:5243:3: rule__ComponentDefinition__EnvAssignment_1
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
    // InternalGoatComponents.g:5251:1: rule__ComponentDefinition__Group__2 : rule__ComponentDefinition__Group__2__Impl ;
    public final void rule__ComponentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5255:1: ( rule__ComponentDefinition__Group__2__Impl )
            // InternalGoatComponents.g:5256:2: rule__ComponentDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGoatComponents.g:5262:1: rule__ComponentDefinition__Group__2__Impl : ( ( rule__ComponentDefinition__ProcAssignment_2 ) ) ;
    public final void rule__ComponentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5266:1: ( ( ( rule__ComponentDefinition__ProcAssignment_2 ) ) )
            // InternalGoatComponents.g:5267:1: ( ( rule__ComponentDefinition__ProcAssignment_2 ) )
            {
            // InternalGoatComponents.g:5267:1: ( ( rule__ComponentDefinition__ProcAssignment_2 ) )
            // InternalGoatComponents.g:5268:2: ( rule__ComponentDefinition__ProcAssignment_2 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getProcAssignment_2()); 
            // InternalGoatComponents.g:5269:2: ( rule__ComponentDefinition__ProcAssignment_2 )
            // InternalGoatComponents.g:5269:3: rule__ComponentDefinition__ProcAssignment_2
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


    // $ANTLR start "rule__Or__Group__0"
    // InternalGoatComponents.g:5278:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5282:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalGoatComponents.g:5283:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalGoatComponents.g:5290:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5294:1: ( ( ruleAnd ) )
            // InternalGoatComponents.g:5295:1: ( ruleAnd )
            {
            // InternalGoatComponents.g:5295:1: ( ruleAnd )
            // InternalGoatComponents.g:5296:2: ruleAnd
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
    // InternalGoatComponents.g:5305:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5309:1: ( rule__Or__Group__1__Impl )
            // InternalGoatComponents.g:5310:2: rule__Or__Group__1__Impl
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
    // InternalGoatComponents.g:5316:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )? ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5320:1: ( ( ( rule__Or__Group_1__0 )? ) )
            // InternalGoatComponents.g:5321:1: ( ( rule__Or__Group_1__0 )? )
            {
            // InternalGoatComponents.g:5321:1: ( ( rule__Or__Group_1__0 )? )
            // InternalGoatComponents.g:5322:2: ( rule__Or__Group_1__0 )?
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalGoatComponents.g:5323:2: ( rule__Or__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGoatComponents.g:5323:3: rule__Or__Group_1__0
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
    // InternalGoatComponents.g:5332:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5336:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalGoatComponents.g:5337:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalGoatComponents.g:5344:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5348:1: ( ( () ) )
            // InternalGoatComponents.g:5349:1: ( () )
            {
            // InternalGoatComponents.g:5349:1: ( () )
            // InternalGoatComponents.g:5350:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalGoatComponents.g:5351:2: ()
            // InternalGoatComponents.g:5351:3: 
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
    // InternalGoatComponents.g:5359:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5363:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalGoatComponents.g:5364:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:5371:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5375:1: ( ( '||' ) )
            // InternalGoatComponents.g:5376:1: ( '||' )
            {
            // InternalGoatComponents.g:5376:1: ( '||' )
            // InternalGoatComponents.g:5377:2: '||'
            {
             before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalGoatComponents.g:5386:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5390:1: ( rule__Or__Group_1__2__Impl )
            // InternalGoatComponents.g:5391:2: rule__Or__Group_1__2__Impl
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
    // InternalGoatComponents.g:5397:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5401:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalGoatComponents.g:5402:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalGoatComponents.g:5402:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalGoatComponents.g:5403:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalGoatComponents.g:5404:2: ( rule__Or__RightAssignment_1_2 )
            // InternalGoatComponents.g:5404:3: rule__Or__RightAssignment_1_2
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
    // InternalGoatComponents.g:5413:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5417:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalGoatComponents.g:5418:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalGoatComponents.g:5425:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5429:1: ( ( ruleEquality ) )
            // InternalGoatComponents.g:5430:1: ( ruleEquality )
            {
            // InternalGoatComponents.g:5430:1: ( ruleEquality )
            // InternalGoatComponents.g:5431:2: ruleEquality
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
    // InternalGoatComponents.g:5440:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5444:1: ( rule__And__Group__1__Impl )
            // InternalGoatComponents.g:5445:2: rule__And__Group__1__Impl
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
    // InternalGoatComponents.g:5451:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )? ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5455:1: ( ( ( rule__And__Group_1__0 )? ) )
            // InternalGoatComponents.g:5456:1: ( ( rule__And__Group_1__0 )? )
            {
            // InternalGoatComponents.g:5456:1: ( ( rule__And__Group_1__0 )? )
            // InternalGoatComponents.g:5457:2: ( rule__And__Group_1__0 )?
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalGoatComponents.g:5458:2: ( rule__And__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGoatComponents.g:5458:3: rule__And__Group_1__0
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
    // InternalGoatComponents.g:5467:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5471:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalGoatComponents.g:5472:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalGoatComponents.g:5479:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5483:1: ( ( () ) )
            // InternalGoatComponents.g:5484:1: ( () )
            {
            // InternalGoatComponents.g:5484:1: ( () )
            // InternalGoatComponents.g:5485:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalGoatComponents.g:5486:2: ()
            // InternalGoatComponents.g:5486:3: 
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
    // InternalGoatComponents.g:5494:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5498:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalGoatComponents.g:5499:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:5506:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5510:1: ( ( '&&' ) )
            // InternalGoatComponents.g:5511:1: ( '&&' )
            {
            // InternalGoatComponents.g:5511:1: ( '&&' )
            // InternalGoatComponents.g:5512:2: '&&'
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalGoatComponents.g:5521:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5525:1: ( rule__And__Group_1__2__Impl )
            // InternalGoatComponents.g:5526:2: rule__And__Group_1__2__Impl
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
    // InternalGoatComponents.g:5532:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5536:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalGoatComponents.g:5537:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalGoatComponents.g:5537:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalGoatComponents.g:5538:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalGoatComponents.g:5539:2: ( rule__And__RightAssignment_1_2 )
            // InternalGoatComponents.g:5539:3: rule__And__RightAssignment_1_2
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
    // InternalGoatComponents.g:5548:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5552:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalGoatComponents.g:5553:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
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
    // InternalGoatComponents.g:5560:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5564:1: ( ( ruleComparison ) )
            // InternalGoatComponents.g:5565:1: ( ruleComparison )
            {
            // InternalGoatComponents.g:5565:1: ( ruleComparison )
            // InternalGoatComponents.g:5566:2: ruleComparison
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
    // InternalGoatComponents.g:5575:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5579:1: ( rule__Equality__Group__1__Impl )
            // InternalGoatComponents.g:5580:2: rule__Equality__Group__1__Impl
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
    // InternalGoatComponents.g:5586:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )? ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5590:1: ( ( ( rule__Equality__Group_1__0 )? ) )
            // InternalGoatComponents.g:5591:1: ( ( rule__Equality__Group_1__0 )? )
            {
            // InternalGoatComponents.g:5591:1: ( ( rule__Equality__Group_1__0 )? )
            // InternalGoatComponents.g:5592:2: ( rule__Equality__Group_1__0 )?
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalGoatComponents.g:5593:2: ( rule__Equality__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=14 && LA38_0<=15)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGoatComponents.g:5593:3: rule__Equality__Group_1__0
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
    // InternalGoatComponents.g:5602:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5606:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalGoatComponents.g:5607:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
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
    // InternalGoatComponents.g:5614:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5618:1: ( ( () ) )
            // InternalGoatComponents.g:5619:1: ( () )
            {
            // InternalGoatComponents.g:5619:1: ( () )
            // InternalGoatComponents.g:5620:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalGoatComponents.g:5621:2: ()
            // InternalGoatComponents.g:5621:3: 
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
    // InternalGoatComponents.g:5629:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5633:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalGoatComponents.g:5634:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:5641:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5645:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalGoatComponents.g:5646:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalGoatComponents.g:5646:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalGoatComponents.g:5647:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalGoatComponents.g:5648:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalGoatComponents.g:5648:3: rule__Equality__OpAssignment_1_1
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
    // InternalGoatComponents.g:5656:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5660:1: ( rule__Equality__Group_1__2__Impl )
            // InternalGoatComponents.g:5661:2: rule__Equality__Group_1__2__Impl
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
    // InternalGoatComponents.g:5667:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5671:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalGoatComponents.g:5672:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalGoatComponents.g:5672:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalGoatComponents.g:5673:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalGoatComponents.g:5674:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalGoatComponents.g:5674:3: rule__Equality__RightAssignment_1_2
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
    // InternalGoatComponents.g:5683:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5687:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalGoatComponents.g:5688:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalGoatComponents.g:5695:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5699:1: ( ( rulePlusOrMinus ) )
            // InternalGoatComponents.g:5700:1: ( rulePlusOrMinus )
            {
            // InternalGoatComponents.g:5700:1: ( rulePlusOrMinus )
            // InternalGoatComponents.g:5701:2: rulePlusOrMinus
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
    // InternalGoatComponents.g:5710:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5714:1: ( rule__Comparison__Group__1__Impl )
            // InternalGoatComponents.g:5715:2: rule__Comparison__Group__1__Impl
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
    // InternalGoatComponents.g:5721:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )? ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5725:1: ( ( ( rule__Comparison__Group_1__0 )? ) )
            // InternalGoatComponents.g:5726:1: ( ( rule__Comparison__Group_1__0 )? )
            {
            // InternalGoatComponents.g:5726:1: ( ( rule__Comparison__Group_1__0 )? )
            // InternalGoatComponents.g:5727:2: ( rule__Comparison__Group_1__0 )?
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalGoatComponents.g:5728:2: ( rule__Comparison__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=16 && LA39_0<=19)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGoatComponents.g:5728:3: rule__Comparison__Group_1__0
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
    // InternalGoatComponents.g:5737:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5741:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalGoatComponents.g:5742:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalGoatComponents.g:5749:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5753:1: ( ( () ) )
            // InternalGoatComponents.g:5754:1: ( () )
            {
            // InternalGoatComponents.g:5754:1: ( () )
            // InternalGoatComponents.g:5755:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalGoatComponents.g:5756:2: ()
            // InternalGoatComponents.g:5756:3: 
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
    // InternalGoatComponents.g:5764:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5768:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalGoatComponents.g:5769:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:5776:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5780:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalGoatComponents.g:5781:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalGoatComponents.g:5781:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalGoatComponents.g:5782:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalGoatComponents.g:5783:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalGoatComponents.g:5783:3: rule__Comparison__OpAssignment_1_1
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
    // InternalGoatComponents.g:5791:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5795:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalGoatComponents.g:5796:2: rule__Comparison__Group_1__2__Impl
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
    // InternalGoatComponents.g:5802:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5806:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalGoatComponents.g:5807:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalGoatComponents.g:5807:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalGoatComponents.g:5808:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalGoatComponents.g:5809:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalGoatComponents.g:5809:3: rule__Comparison__RightAssignment_1_2
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
    // InternalGoatComponents.g:5818:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5822:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalGoatComponents.g:5823:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
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
    // InternalGoatComponents.g:5830:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5834:1: ( ( ruleMulOrDiv ) )
            // InternalGoatComponents.g:5835:1: ( ruleMulOrDiv )
            {
            // InternalGoatComponents.g:5835:1: ( ruleMulOrDiv )
            // InternalGoatComponents.g:5836:2: ruleMulOrDiv
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
    // InternalGoatComponents.g:5845:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5849:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalGoatComponents.g:5850:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalGoatComponents.g:5856:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )? ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5860:1: ( ( ( rule__PlusOrMinus__Group_1__0 )? ) )
            // InternalGoatComponents.g:5861:1: ( ( rule__PlusOrMinus__Group_1__0 )? )
            {
            // InternalGoatComponents.g:5861:1: ( ( rule__PlusOrMinus__Group_1__0 )? )
            // InternalGoatComponents.g:5862:2: ( rule__PlusOrMinus__Group_1__0 )?
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalGoatComponents.g:5863:2: ( rule__PlusOrMinus__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24||(LA40_0>=49 && LA40_0<=50)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGoatComponents.g:5863:3: rule__PlusOrMinus__Group_1__0
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
    // InternalGoatComponents.g:5872:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5876:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalGoatComponents.g:5877:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:5884:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5888:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalGoatComponents.g:5889:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalGoatComponents.g:5889:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalGoatComponents.g:5890:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalGoatComponents.g:5891:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalGoatComponents.g:5891:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalGoatComponents.g:5899:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5903:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalGoatComponents.g:5904:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalGoatComponents.g:5910:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5914:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalGoatComponents.g:5915:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalGoatComponents.g:5915:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalGoatComponents.g:5916:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalGoatComponents.g:5917:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalGoatComponents.g:5917:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalGoatComponents.g:5926:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5930:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalGoatComponents.g:5931:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalGoatComponents.g:5938:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5942:1: ( ( () ) )
            // InternalGoatComponents.g:5943:1: ( () )
            {
            // InternalGoatComponents.g:5943:1: ( () )
            // InternalGoatComponents.g:5944:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalGoatComponents.g:5945:2: ()
            // InternalGoatComponents.g:5945:3: 
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
    // InternalGoatComponents.g:5953:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5957:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalGoatComponents.g:5958:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalGoatComponents.g:5964:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5968:1: ( ( '+' ) )
            // InternalGoatComponents.g:5969:1: ( '+' )
            {
            // InternalGoatComponents.g:5969:1: ( '+' )
            // InternalGoatComponents.g:5970:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGoatComponents.g:5980:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5984:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalGoatComponents.g:5985:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
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
    // InternalGoatComponents.g:5992:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:5996:1: ( ( () ) )
            // InternalGoatComponents.g:5997:1: ( () )
            {
            // InternalGoatComponents.g:5997:1: ( () )
            // InternalGoatComponents.g:5998:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalGoatComponents.g:5999:2: ()
            // InternalGoatComponents.g:5999:3: 
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
    // InternalGoatComponents.g:6007:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6011:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalGoatComponents.g:6012:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalGoatComponents.g:6018:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6022:1: ( ( '-' ) )
            // InternalGoatComponents.g:6023:1: ( '-' )
            {
            // InternalGoatComponents.g:6023:1: ( '-' )
            // InternalGoatComponents.g:6024:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGoatComponents.g:6034:1: rule__PlusOrMinus__Group_1_0_2__0 : rule__PlusOrMinus__Group_1_0_2__0__Impl rule__PlusOrMinus__Group_1_0_2__1 ;
    public final void rule__PlusOrMinus__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6038:1: ( rule__PlusOrMinus__Group_1_0_2__0__Impl rule__PlusOrMinus__Group_1_0_2__1 )
            // InternalGoatComponents.g:6039:2: rule__PlusOrMinus__Group_1_0_2__0__Impl rule__PlusOrMinus__Group_1_0_2__1
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
    // InternalGoatComponents.g:6046:1: rule__PlusOrMinus__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6050:1: ( ( () ) )
            // InternalGoatComponents.g:6051:1: ( () )
            {
            // InternalGoatComponents.g:6051:1: ( () )
            // InternalGoatComponents.g:6052:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getConcatenateLeftAction_1_0_2_0()); 
            // InternalGoatComponents.g:6053:2: ()
            // InternalGoatComponents.g:6053:3: 
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
    // InternalGoatComponents.g:6061:1: rule__PlusOrMinus__Group_1_0_2__1 : rule__PlusOrMinus__Group_1_0_2__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6065:1: ( rule__PlusOrMinus__Group_1_0_2__1__Impl )
            // InternalGoatComponents.g:6066:2: rule__PlusOrMinus__Group_1_0_2__1__Impl
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
    // InternalGoatComponents.g:6072:1: rule__PlusOrMinus__Group_1_0_2__1__Impl : ( '++' ) ;
    public final void rule__PlusOrMinus__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6076:1: ( ( '++' ) )
            // InternalGoatComponents.g:6077:1: ( '++' )
            {
            // InternalGoatComponents.g:6077:1: ( '++' )
            // InternalGoatComponents.g:6078:2: '++'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignPlusSignKeyword_1_0_2_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGoatComponents.g:6088:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6092:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalGoatComponents.g:6093:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
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
    // InternalGoatComponents.g:6100:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6104:1: ( ( rulePrimary ) )
            // InternalGoatComponents.g:6105:1: ( rulePrimary )
            {
            // InternalGoatComponents.g:6105:1: ( rulePrimary )
            // InternalGoatComponents.g:6106:2: rulePrimary
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
    // InternalGoatComponents.g:6115:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6119:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalGoatComponents.g:6120:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalGoatComponents.g:6126:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )? ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6130:1: ( ( ( rule__MulOrDiv__Group_1__0 )? ) )
            // InternalGoatComponents.g:6131:1: ( ( rule__MulOrDiv__Group_1__0 )? )
            {
            // InternalGoatComponents.g:6131:1: ( ( rule__MulOrDiv__Group_1__0 )? )
            // InternalGoatComponents.g:6132:2: ( rule__MulOrDiv__Group_1__0 )?
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalGoatComponents.g:6133:2: ( rule__MulOrDiv__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=20 && LA41_0<=21)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGoatComponents.g:6133:3: rule__MulOrDiv__Group_1__0
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
    // InternalGoatComponents.g:6142:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6146:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalGoatComponents.g:6147:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
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
    // InternalGoatComponents.g:6154:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6158:1: ( ( () ) )
            // InternalGoatComponents.g:6159:1: ( () )
            {
            // InternalGoatComponents.g:6159:1: ( () )
            // InternalGoatComponents.g:6160:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalGoatComponents.g:6161:2: ()
            // InternalGoatComponents.g:6161:3: 
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
    // InternalGoatComponents.g:6169:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6173:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalGoatComponents.g:6174:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:6181:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6185:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalGoatComponents.g:6186:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalGoatComponents.g:6186:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalGoatComponents.g:6187:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalGoatComponents.g:6188:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalGoatComponents.g:6188:3: rule__MulOrDiv__OpAssignment_1_1
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
    // InternalGoatComponents.g:6196:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6200:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalGoatComponents.g:6201:2: rule__MulOrDiv__Group_1__2__Impl
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
    // InternalGoatComponents.g:6207:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6211:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalGoatComponents.g:6212:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalGoatComponents.g:6212:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalGoatComponents.g:6213:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalGoatComponents.g:6214:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalGoatComponents.g:6214:3: rule__MulOrDiv__RightAssignment_1_2
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
    // InternalGoatComponents.g:6223:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6227:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalGoatComponents.g:6228:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:6235:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6239:1: ( ( '(' ) )
            // InternalGoatComponents.g:6240:1: ( '(' )
            {
            // InternalGoatComponents.g:6240:1: ( '(' )
            // InternalGoatComponents.g:6241:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:6250:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6254:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalGoatComponents.g:6255:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:6262:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6266:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:6267:1: ( ruleExpression )
            {
            // InternalGoatComponents.g:6267:1: ( ruleExpression )
            // InternalGoatComponents.g:6268:2: ruleExpression
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
    // InternalGoatComponents.g:6277:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6281:1: ( rule__Primary__Group_0__2__Impl )
            // InternalGoatComponents.g:6282:2: rule__Primary__Group_0__2__Impl
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
    // InternalGoatComponents.g:6288:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6292:1: ( ( ')' ) )
            // InternalGoatComponents.g:6293:1: ( ')' )
            {
            // InternalGoatComponents.g:6293:1: ( ')' )
            // InternalGoatComponents.g:6294:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:6304:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6308:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalGoatComponents.g:6309:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
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
    // InternalGoatComponents.g:6316:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6320:1: ( ( () ) )
            // InternalGoatComponents.g:6321:1: ( () )
            {
            // InternalGoatComponents.g:6321:1: ( () )
            // InternalGoatComponents.g:6322:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalGoatComponents.g:6323:2: ()
            // InternalGoatComponents.g:6323:3: 
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
    // InternalGoatComponents.g:6331:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6335:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalGoatComponents.g:6336:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponents.g:6343:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6347:1: ( ( '!' ) )
            // InternalGoatComponents.g:6348:1: ( '!' )
            {
            // InternalGoatComponents.g:6348:1: ( '!' )
            // InternalGoatComponents.g:6349:2: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalGoatComponents.g:6358:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6362:1: ( rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 )
            // InternalGoatComponents.g:6363:2: rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:6370:1: rule__Primary__Group_1__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6374:1: ( ( '(' ) )
            // InternalGoatComponents.g:6375:1: ( '(' )
            {
            // InternalGoatComponents.g:6375:1: ( '(' )
            // InternalGoatComponents.g:6376:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:6385:1: rule__Primary__Group_1__3 : rule__Primary__Group_1__3__Impl rule__Primary__Group_1__4 ;
    public final void rule__Primary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6389:1: ( rule__Primary__Group_1__3__Impl rule__Primary__Group_1__4 )
            // InternalGoatComponents.g:6390:2: rule__Primary__Group_1__3__Impl rule__Primary__Group_1__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:6397:1: rule__Primary__Group_1__3__Impl : ( ( rule__Primary__ExpressionAssignment_1_3 ) ) ;
    public final void rule__Primary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6401:1: ( ( ( rule__Primary__ExpressionAssignment_1_3 ) ) )
            // InternalGoatComponents.g:6402:1: ( ( rule__Primary__ExpressionAssignment_1_3 ) )
            {
            // InternalGoatComponents.g:6402:1: ( ( rule__Primary__ExpressionAssignment_1_3 ) )
            // InternalGoatComponents.g:6403:2: ( rule__Primary__ExpressionAssignment_1_3 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_3()); 
            // InternalGoatComponents.g:6404:2: ( rule__Primary__ExpressionAssignment_1_3 )
            // InternalGoatComponents.g:6404:3: rule__Primary__ExpressionAssignment_1_3
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
    // InternalGoatComponents.g:6412:1: rule__Primary__Group_1__4 : rule__Primary__Group_1__4__Impl ;
    public final void rule__Primary__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6416:1: ( rule__Primary__Group_1__4__Impl )
            // InternalGoatComponents.g:6417:2: rule__Primary__Group_1__4__Impl
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
    // InternalGoatComponents.g:6423:1: rule__Primary__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6427:1: ( ( ')' ) )
            // InternalGoatComponents.g:6428:1: ( ')' )
            {
            // InternalGoatComponents.g:6428:1: ( ')' )
            // InternalGoatComponents.g:6429:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:6439:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6443:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalGoatComponents.g:6444:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
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
    // InternalGoatComponents.g:6451:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6455:1: ( ( () ) )
            // InternalGoatComponents.g:6456:1: ( () )
            {
            // InternalGoatComponents.g:6456:1: ( () )
            // InternalGoatComponents.g:6457:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalGoatComponents.g:6458:2: ()
            // InternalGoatComponents.g:6458:3: 
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
    // InternalGoatComponents.g:6466:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6470:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalGoatComponents.g:6471:2: rule__Atomic__Group_0__1__Impl
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
    // InternalGoatComponents.g:6477:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6481:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalGoatComponents.g:6482:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalGoatComponents.g:6482:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalGoatComponents.g:6483:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalGoatComponents.g:6484:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalGoatComponents.g:6484:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalGoatComponents.g:6493:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6497:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalGoatComponents.g:6498:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalGoatComponents.g:6505:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6509:1: ( ( () ) )
            // InternalGoatComponents.g:6510:1: ( () )
            {
            // InternalGoatComponents.g:6510:1: ( () )
            // InternalGoatComponents.g:6511:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalGoatComponents.g:6512:2: ()
            // InternalGoatComponents.g:6512:3: 
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
    // InternalGoatComponents.g:6520:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6524:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalGoatComponents.g:6525:2: rule__Atomic__Group_1__1__Impl
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
    // InternalGoatComponents.g:6531:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6535:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalGoatComponents.g:6536:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalGoatComponents.g:6536:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalGoatComponents.g:6537:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalGoatComponents.g:6538:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalGoatComponents.g:6538:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalGoatComponents.g:6547:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6551:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalGoatComponents.g:6552:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalGoatComponents.g:6559:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6563:1: ( ( () ) )
            // InternalGoatComponents.g:6564:1: ( () )
            {
            // InternalGoatComponents.g:6564:1: ( () )
            // InternalGoatComponents.g:6565:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // InternalGoatComponents.g:6566:2: ()
            // InternalGoatComponents.g:6566:3: 
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
    // InternalGoatComponents.g:6574:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6578:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalGoatComponents.g:6579:2: rule__Atomic__Group_2__1__Impl
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
    // InternalGoatComponents.g:6585:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6589:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalGoatComponents.g:6590:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalGoatComponents.g:6590:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalGoatComponents.g:6591:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalGoatComponents.g:6592:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalGoatComponents.g:6592:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalGoatComponents.g:6601:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6605:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalGoatComponents.g:6606:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:6613:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6617:1: ( ( () ) )
            // InternalGoatComponents.g:6618:1: ( () )
            {
            // InternalGoatComponents.g:6618:1: ( () )
            // InternalGoatComponents.g:6619:2: ()
            {
             before(grammarAccess.getAtomicAccess().getLocalVarRefAction_3_0()); 
            // InternalGoatComponents.g:6620:2: ()
            // InternalGoatComponents.g:6620:3: 
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
    // InternalGoatComponents.g:6628:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6632:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalGoatComponents.g:6633:2: rule__Atomic__Group_3__1__Impl
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
    // InternalGoatComponents.g:6639:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6643:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // InternalGoatComponents.g:6644:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // InternalGoatComponents.g:6644:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // InternalGoatComponents.g:6645:2: ( rule__Atomic__RefAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            // InternalGoatComponents.g:6646:2: ( rule__Atomic__RefAssignment_3_1 )
            // InternalGoatComponents.g:6646:3: rule__Atomic__RefAssignment_3_1
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
    // InternalGoatComponents.g:6655:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6659:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalGoatComponents.g:6660:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
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
    // InternalGoatComponents.g:6667:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6671:1: ( ( () ) )
            // InternalGoatComponents.g:6672:1: ( () )
            {
            // InternalGoatComponents.g:6672:1: ( () )
            // InternalGoatComponents.g:6673:2: ()
            {
             before(grammarAccess.getAtomicAccess().getLocalAttributeRefAction_4_0()); 
            // InternalGoatComponents.g:6674:2: ()
            // InternalGoatComponents.g:6674:3: 
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
    // InternalGoatComponents.g:6682:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6686:1: ( rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 )
            // InternalGoatComponents.g:6687:2: rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2
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
    // InternalGoatComponents.g:6694:1: rule__Atomic__Group_4__1__Impl : ( 'proc' ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6698:1: ( ( 'proc' ) )
            // InternalGoatComponents.g:6699:1: ( 'proc' )
            {
            // InternalGoatComponents.g:6699:1: ( 'proc' )
            // InternalGoatComponents.g:6700:2: 'proc'
            {
             before(grammarAccess.getAtomicAccess().getProcKeyword_4_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGoatComponents.g:6709:1: rule__Atomic__Group_4__2 : rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 ;
    public final void rule__Atomic__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6713:1: ( rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 )
            // InternalGoatComponents.g:6714:2: rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:6721:1: rule__Atomic__Group_4__2__Impl : ( '.' ) ;
    public final void rule__Atomic__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6725:1: ( ( '.' ) )
            // InternalGoatComponents.g:6726:1: ( '.' )
            {
            // InternalGoatComponents.g:6726:1: ( '.' )
            // InternalGoatComponents.g:6727:2: '.'
            {
             before(grammarAccess.getAtomicAccess().getFullStopKeyword_4_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGoatComponents.g:6736:1: rule__Atomic__Group_4__3 : rule__Atomic__Group_4__3__Impl ;
    public final void rule__Atomic__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6740:1: ( rule__Atomic__Group_4__3__Impl )
            // InternalGoatComponents.g:6741:2: rule__Atomic__Group_4__3__Impl
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
    // InternalGoatComponents.g:6747:1: rule__Atomic__Group_4__3__Impl : ( ( rule__Atomic__AttributeAssignment_4_3 ) ) ;
    public final void rule__Atomic__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6751:1: ( ( ( rule__Atomic__AttributeAssignment_4_3 ) ) )
            // InternalGoatComponents.g:6752:1: ( ( rule__Atomic__AttributeAssignment_4_3 ) )
            {
            // InternalGoatComponents.g:6752:1: ( ( rule__Atomic__AttributeAssignment_4_3 ) )
            // InternalGoatComponents.g:6753:2: ( rule__Atomic__AttributeAssignment_4_3 )
            {
             before(grammarAccess.getAtomicAccess().getAttributeAssignment_4_3()); 
            // InternalGoatComponents.g:6754:2: ( rule__Atomic__AttributeAssignment_4_3 )
            // InternalGoatComponents.g:6754:3: rule__Atomic__AttributeAssignment_4_3
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
    // InternalGoatComponents.g:6763:1: rule__Atomic__Group_5__0 : rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 ;
    public final void rule__Atomic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6767:1: ( rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 )
            // InternalGoatComponents.g:6768:2: rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:6775:1: rule__Atomic__Group_5__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6779:1: ( ( () ) )
            // InternalGoatComponents.g:6780:1: ( () )
            {
            // InternalGoatComponents.g:6780:1: ( () )
            // InternalGoatComponents.g:6781:2: ()
            {
             before(grammarAccess.getAtomicAccess().getFunctionCallAction_5_0()); 
            // InternalGoatComponents.g:6782:2: ()
            // InternalGoatComponents.g:6782:3: 
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
    // InternalGoatComponents.g:6790:1: rule__Atomic__Group_5__1 : rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 ;
    public final void rule__Atomic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6794:1: ( rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 )
            // InternalGoatComponents.g:6795:2: rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponents.g:6802:1: rule__Atomic__Group_5__1__Impl : ( ( rule__Atomic__FunctionAssignment_5_1 ) ) ;
    public final void rule__Atomic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6806:1: ( ( ( rule__Atomic__FunctionAssignment_5_1 ) ) )
            // InternalGoatComponents.g:6807:1: ( ( rule__Atomic__FunctionAssignment_5_1 ) )
            {
            // InternalGoatComponents.g:6807:1: ( ( rule__Atomic__FunctionAssignment_5_1 ) )
            // InternalGoatComponents.g:6808:2: ( rule__Atomic__FunctionAssignment_5_1 )
            {
             before(grammarAccess.getAtomicAccess().getFunctionAssignment_5_1()); 
            // InternalGoatComponents.g:6809:2: ( rule__Atomic__FunctionAssignment_5_1 )
            // InternalGoatComponents.g:6809:3: rule__Atomic__FunctionAssignment_5_1
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
    // InternalGoatComponents.g:6817:1: rule__Atomic__Group_5__2 : rule__Atomic__Group_5__2__Impl rule__Atomic__Group_5__3 ;
    public final void rule__Atomic__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6821:1: ( rule__Atomic__Group_5__2__Impl rule__Atomic__Group_5__3 )
            // InternalGoatComponents.g:6822:2: rule__Atomic__Group_5__2__Impl rule__Atomic__Group_5__3
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
    // InternalGoatComponents.g:6829:1: rule__Atomic__Group_5__2__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6833:1: ( ( '(' ) )
            // InternalGoatComponents.g:6834:1: ( '(' )
            {
            // InternalGoatComponents.g:6834:1: ( '(' )
            // InternalGoatComponents.g:6835:2: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_5_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:6844:1: rule__Atomic__Group_5__3 : rule__Atomic__Group_5__3__Impl rule__Atomic__Group_5__4 ;
    public final void rule__Atomic__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6848:1: ( rule__Atomic__Group_5__3__Impl rule__Atomic__Group_5__4 )
            // InternalGoatComponents.g:6849:2: rule__Atomic__Group_5__3__Impl rule__Atomic__Group_5__4
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
    // InternalGoatComponents.g:6856:1: rule__Atomic__Group_5__3__Impl : ( ( rule__Atomic__Group_5_3__0 )? ) ;
    public final void rule__Atomic__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6860:1: ( ( ( rule__Atomic__Group_5_3__0 )? ) )
            // InternalGoatComponents.g:6861:1: ( ( rule__Atomic__Group_5_3__0 )? )
            {
            // InternalGoatComponents.g:6861:1: ( ( rule__Atomic__Group_5_3__0 )? )
            // InternalGoatComponents.g:6862:2: ( rule__Atomic__Group_5_3__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_5_3()); 
            // InternalGoatComponents.g:6863:2: ( rule__Atomic__Group_5_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||(LA42_0>=12 && LA42_0<=13)||LA42_0==26||LA42_0==44||(LA42_0>=51 && LA42_0<=53)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGoatComponents.g:6863:3: rule__Atomic__Group_5_3__0
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
    // InternalGoatComponents.g:6871:1: rule__Atomic__Group_5__4 : rule__Atomic__Group_5__4__Impl ;
    public final void rule__Atomic__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6875:1: ( rule__Atomic__Group_5__4__Impl )
            // InternalGoatComponents.g:6876:2: rule__Atomic__Group_5__4__Impl
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
    // InternalGoatComponents.g:6882:1: rule__Atomic__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6886:1: ( ( ')' ) )
            // InternalGoatComponents.g:6887:1: ( ')' )
            {
            // InternalGoatComponents.g:6887:1: ( ')' )
            // InternalGoatComponents.g:6888:2: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_5_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:6898:1: rule__Atomic__Group_5_3__0 : rule__Atomic__Group_5_3__0__Impl rule__Atomic__Group_5_3__1 ;
    public final void rule__Atomic__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6902:1: ( rule__Atomic__Group_5_3__0__Impl rule__Atomic__Group_5_3__1 )
            // InternalGoatComponents.g:6903:2: rule__Atomic__Group_5_3__0__Impl rule__Atomic__Group_5_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalGoatComponents.g:6910:1: rule__Atomic__Group_5_3__0__Impl : ( ( rule__Atomic__ParamsAssignment_5_3_0 ) ) ;
    public final void rule__Atomic__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6914:1: ( ( ( rule__Atomic__ParamsAssignment_5_3_0 ) ) )
            // InternalGoatComponents.g:6915:1: ( ( rule__Atomic__ParamsAssignment_5_3_0 ) )
            {
            // InternalGoatComponents.g:6915:1: ( ( rule__Atomic__ParamsAssignment_5_3_0 ) )
            // InternalGoatComponents.g:6916:2: ( rule__Atomic__ParamsAssignment_5_3_0 )
            {
             before(grammarAccess.getAtomicAccess().getParamsAssignment_5_3_0()); 
            // InternalGoatComponents.g:6917:2: ( rule__Atomic__ParamsAssignment_5_3_0 )
            // InternalGoatComponents.g:6917:3: rule__Atomic__ParamsAssignment_5_3_0
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
    // InternalGoatComponents.g:6925:1: rule__Atomic__Group_5_3__1 : rule__Atomic__Group_5_3__1__Impl ;
    public final void rule__Atomic__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6929:1: ( rule__Atomic__Group_5_3__1__Impl )
            // InternalGoatComponents.g:6930:2: rule__Atomic__Group_5_3__1__Impl
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
    // InternalGoatComponents.g:6936:1: rule__Atomic__Group_5_3__1__Impl : ( ( rule__Atomic__Group_5_3_1__0 )* ) ;
    public final void rule__Atomic__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6940:1: ( ( ( rule__Atomic__Group_5_3_1__0 )* ) )
            // InternalGoatComponents.g:6941:1: ( ( rule__Atomic__Group_5_3_1__0 )* )
            {
            // InternalGoatComponents.g:6941:1: ( ( rule__Atomic__Group_5_3_1__0 )* )
            // InternalGoatComponents.g:6942:2: ( rule__Atomic__Group_5_3_1__0 )*
            {
             before(grammarAccess.getAtomicAccess().getGroup_5_3_1()); 
            // InternalGoatComponents.g:6943:2: ( rule__Atomic__Group_5_3_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==31) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGoatComponents.g:6943:3: rule__Atomic__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalGoatComponents.g:6952:1: rule__Atomic__Group_5_3_1__0 : rule__Atomic__Group_5_3_1__0__Impl rule__Atomic__Group_5_3_1__1 ;
    public final void rule__Atomic__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6956:1: ( rule__Atomic__Group_5_3_1__0__Impl rule__Atomic__Group_5_3_1__1 )
            // InternalGoatComponents.g:6957:2: rule__Atomic__Group_5_3_1__0__Impl rule__Atomic__Group_5_3_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:6964:1: rule__Atomic__Group_5_3_1__0__Impl : ( ',' ) ;
    public final void rule__Atomic__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6968:1: ( ( ',' ) )
            // InternalGoatComponents.g:6969:1: ( ',' )
            {
            // InternalGoatComponents.g:6969:1: ( ',' )
            // InternalGoatComponents.g:6970:2: ','
            {
             before(grammarAccess.getAtomicAccess().getCommaKeyword_5_3_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGoatComponents.g:6979:1: rule__Atomic__Group_5_3_1__1 : rule__Atomic__Group_5_3_1__1__Impl ;
    public final void rule__Atomic__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6983:1: ( rule__Atomic__Group_5_3_1__1__Impl )
            // InternalGoatComponents.g:6984:2: rule__Atomic__Group_5_3_1__1__Impl
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
    // InternalGoatComponents.g:6990:1: rule__Atomic__Group_5_3_1__1__Impl : ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) ) ;
    public final void rule__Atomic__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:6994:1: ( ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) ) )
            // InternalGoatComponents.g:6995:1: ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) )
            {
            // InternalGoatComponents.g:6995:1: ( ( rule__Atomic__ParamsAssignment_5_3_1_1 ) )
            // InternalGoatComponents.g:6996:2: ( rule__Atomic__ParamsAssignment_5_3_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getParamsAssignment_5_3_1_1()); 
            // InternalGoatComponents.g:6997:2: ( rule__Atomic__ParamsAssignment_5_3_1_1 )
            // InternalGoatComponents.g:6997:3: rule__Atomic__ParamsAssignment_5_3_1_1
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
    // InternalGoatComponents.g:7006:1: rule__Atomic__Group_6__0 : rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 ;
    public final void rule__Atomic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7010:1: ( rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 )
            // InternalGoatComponents.g:7011:2: rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1
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
    // InternalGoatComponents.g:7018:1: rule__Atomic__Group_6__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7022:1: ( ( () ) )
            // InternalGoatComponents.g:7023:1: ( () )
            {
            // InternalGoatComponents.g:7023:1: ( () )
            // InternalGoatComponents.g:7024:2: ()
            {
             before(grammarAccess.getAtomicAccess().getComponentAttributeRefAction_6_0()); 
            // InternalGoatComponents.g:7025:2: ()
            // InternalGoatComponents.g:7025:3: 
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
    // InternalGoatComponents.g:7033:1: rule__Atomic__Group_6__1 : rule__Atomic__Group_6__1__Impl rule__Atomic__Group_6__2 ;
    public final void rule__Atomic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7037:1: ( rule__Atomic__Group_6__1__Impl rule__Atomic__Group_6__2 )
            // InternalGoatComponents.g:7038:2: rule__Atomic__Group_6__1__Impl rule__Atomic__Group_6__2
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
    // InternalGoatComponents.g:7045:1: rule__Atomic__Group_6__1__Impl : ( 'this' ) ;
    public final void rule__Atomic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7049:1: ( ( 'this' ) )
            // InternalGoatComponents.g:7050:1: ( 'this' )
            {
            // InternalGoatComponents.g:7050:1: ( 'this' )
            // InternalGoatComponents.g:7051:2: 'this'
            {
             before(grammarAccess.getAtomicAccess().getThisKeyword_6_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalGoatComponents.g:7060:1: rule__Atomic__Group_6__2 : rule__Atomic__Group_6__2__Impl rule__Atomic__Group_6__3 ;
    public final void rule__Atomic__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7064:1: ( rule__Atomic__Group_6__2__Impl rule__Atomic__Group_6__3 )
            // InternalGoatComponents.g:7065:2: rule__Atomic__Group_6__2__Impl rule__Atomic__Group_6__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:7072:1: rule__Atomic__Group_6__2__Impl : ( '.' ) ;
    public final void rule__Atomic__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7076:1: ( ( '.' ) )
            // InternalGoatComponents.g:7077:1: ( '.' )
            {
            // InternalGoatComponents.g:7077:1: ( '.' )
            // InternalGoatComponents.g:7078:2: '.'
            {
             before(grammarAccess.getAtomicAccess().getFullStopKeyword_6_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGoatComponents.g:7087:1: rule__Atomic__Group_6__3 : rule__Atomic__Group_6__3__Impl ;
    public final void rule__Atomic__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7091:1: ( rule__Atomic__Group_6__3__Impl )
            // InternalGoatComponents.g:7092:2: rule__Atomic__Group_6__3__Impl
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
    // InternalGoatComponents.g:7098:1: rule__Atomic__Group_6__3__Impl : ( ( rule__Atomic__AttributeAssignment_6_3 ) ) ;
    public final void rule__Atomic__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7102:1: ( ( ( rule__Atomic__AttributeAssignment_6_3 ) ) )
            // InternalGoatComponents.g:7103:1: ( ( rule__Atomic__AttributeAssignment_6_3 ) )
            {
            // InternalGoatComponents.g:7103:1: ( ( rule__Atomic__AttributeAssignment_6_3 ) )
            // InternalGoatComponents.g:7104:2: ( rule__Atomic__AttributeAssignment_6_3 )
            {
             before(grammarAccess.getAtomicAccess().getAttributeAssignment_6_3()); 
            // InternalGoatComponents.g:7105:2: ( rule__Atomic__AttributeAssignment_6_3 )
            // InternalGoatComponents.g:7105:3: rule__Atomic__AttributeAssignment_6_3
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
    // InternalGoatComponents.g:7114:1: rule__Atomic__Group_7__0 : rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 ;
    public final void rule__Atomic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7118:1: ( rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 )
            // InternalGoatComponents.g:7119:2: rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:7126:1: rule__Atomic__Group_7__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7130:1: ( ( () ) )
            // InternalGoatComponents.g:7131:1: ( () )
            {
            // InternalGoatComponents.g:7131:1: ( () )
            // InternalGoatComponents.g:7132:2: ()
            {
             before(grammarAccess.getAtomicAccess().getRecAttributeRefAction_7_0()); 
            // InternalGoatComponents.g:7133:2: ()
            // InternalGoatComponents.g:7133:3: 
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
    // InternalGoatComponents.g:7141:1: rule__Atomic__Group_7__1 : rule__Atomic__Group_7__1__Impl rule__Atomic__Group_7__2 ;
    public final void rule__Atomic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7145:1: ( rule__Atomic__Group_7__1__Impl rule__Atomic__Group_7__2 )
            // InternalGoatComponents.g:7146:2: rule__Atomic__Group_7__1__Impl rule__Atomic__Group_7__2
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
    // InternalGoatComponents.g:7153:1: rule__Atomic__Group_7__1__Impl : ( 'receiver' ) ;
    public final void rule__Atomic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7157:1: ( ( 'receiver' ) )
            // InternalGoatComponents.g:7158:1: ( 'receiver' )
            {
            // InternalGoatComponents.g:7158:1: ( 'receiver' )
            // InternalGoatComponents.g:7159:2: 'receiver'
            {
             before(grammarAccess.getAtomicAccess().getReceiverKeyword_7_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGoatComponents.g:7168:1: rule__Atomic__Group_7__2 : rule__Atomic__Group_7__2__Impl rule__Atomic__Group_7__3 ;
    public final void rule__Atomic__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7172:1: ( rule__Atomic__Group_7__2__Impl rule__Atomic__Group_7__3 )
            // InternalGoatComponents.g:7173:2: rule__Atomic__Group_7__2__Impl rule__Atomic__Group_7__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:7180:1: rule__Atomic__Group_7__2__Impl : ( '.' ) ;
    public final void rule__Atomic__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7184:1: ( ( '.' ) )
            // InternalGoatComponents.g:7185:1: ( '.' )
            {
            // InternalGoatComponents.g:7185:1: ( '.' )
            // InternalGoatComponents.g:7186:2: '.'
            {
             before(grammarAccess.getAtomicAccess().getFullStopKeyword_7_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGoatComponents.g:7195:1: rule__Atomic__Group_7__3 : rule__Atomic__Group_7__3__Impl ;
    public final void rule__Atomic__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7199:1: ( rule__Atomic__Group_7__3__Impl )
            // InternalGoatComponents.g:7200:2: rule__Atomic__Group_7__3__Impl
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
    // InternalGoatComponents.g:7206:1: rule__Atomic__Group_7__3__Impl : ( ( rule__Atomic__AttributeAssignment_7_3 ) ) ;
    public final void rule__Atomic__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7210:1: ( ( ( rule__Atomic__AttributeAssignment_7_3 ) ) )
            // InternalGoatComponents.g:7211:1: ( ( rule__Atomic__AttributeAssignment_7_3 ) )
            {
            // InternalGoatComponents.g:7211:1: ( ( rule__Atomic__AttributeAssignment_7_3 ) )
            // InternalGoatComponents.g:7212:2: ( rule__Atomic__AttributeAssignment_7_3 )
            {
             before(grammarAccess.getAtomicAccess().getAttributeAssignment_7_3()); 
            // InternalGoatComponents.g:7213:2: ( rule__Atomic__AttributeAssignment_7_3 )
            // InternalGoatComponents.g:7213:3: rule__Atomic__AttributeAssignment_7_3
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
    // InternalGoatComponents.g:7222:1: rule__AttributeToSet__Group_0__0 : rule__AttributeToSet__Group_0__0__Impl rule__AttributeToSet__Group_0__1 ;
    public final void rule__AttributeToSet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7226:1: ( rule__AttributeToSet__Group_0__0__Impl rule__AttributeToSet__Group_0__1 )
            // InternalGoatComponents.g:7227:2: rule__AttributeToSet__Group_0__0__Impl rule__AttributeToSet__Group_0__1
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
    // InternalGoatComponents.g:7234:1: rule__AttributeToSet__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeToSet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7238:1: ( ( () ) )
            // InternalGoatComponents.g:7239:1: ( () )
            {
            // InternalGoatComponents.g:7239:1: ( () )
            // InternalGoatComponents.g:7240:2: ()
            {
             before(grammarAccess.getAttributeToSetAccess().getComponentAttributeToSetAction_0_0()); 
            // InternalGoatComponents.g:7241:2: ()
            // InternalGoatComponents.g:7241:3: 
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
    // InternalGoatComponents.g:7249:1: rule__AttributeToSet__Group_0__1 : rule__AttributeToSet__Group_0__1__Impl rule__AttributeToSet__Group_0__2 ;
    public final void rule__AttributeToSet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7253:1: ( rule__AttributeToSet__Group_0__1__Impl rule__AttributeToSet__Group_0__2 )
            // InternalGoatComponents.g:7254:2: rule__AttributeToSet__Group_0__1__Impl rule__AttributeToSet__Group_0__2
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
    // InternalGoatComponents.g:7261:1: rule__AttributeToSet__Group_0__1__Impl : ( 'this' ) ;
    public final void rule__AttributeToSet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7265:1: ( ( 'this' ) )
            // InternalGoatComponents.g:7266:1: ( 'this' )
            {
            // InternalGoatComponents.g:7266:1: ( 'this' )
            // InternalGoatComponents.g:7267:2: 'this'
            {
             before(grammarAccess.getAttributeToSetAccess().getThisKeyword_0_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalGoatComponents.g:7276:1: rule__AttributeToSet__Group_0__2 : rule__AttributeToSet__Group_0__2__Impl rule__AttributeToSet__Group_0__3 ;
    public final void rule__AttributeToSet__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7280:1: ( rule__AttributeToSet__Group_0__2__Impl rule__AttributeToSet__Group_0__3 )
            // InternalGoatComponents.g:7281:2: rule__AttributeToSet__Group_0__2__Impl rule__AttributeToSet__Group_0__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:7288:1: rule__AttributeToSet__Group_0__2__Impl : ( '.' ) ;
    public final void rule__AttributeToSet__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7292:1: ( ( '.' ) )
            // InternalGoatComponents.g:7293:1: ( '.' )
            {
            // InternalGoatComponents.g:7293:1: ( '.' )
            // InternalGoatComponents.g:7294:2: '.'
            {
             before(grammarAccess.getAttributeToSetAccess().getFullStopKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGoatComponents.g:7303:1: rule__AttributeToSet__Group_0__3 : rule__AttributeToSet__Group_0__3__Impl ;
    public final void rule__AttributeToSet__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7307:1: ( rule__AttributeToSet__Group_0__3__Impl )
            // InternalGoatComponents.g:7308:2: rule__AttributeToSet__Group_0__3__Impl
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
    // InternalGoatComponents.g:7314:1: rule__AttributeToSet__Group_0__3__Impl : ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) ) ;
    public final void rule__AttributeToSet__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7318:1: ( ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) ) )
            // InternalGoatComponents.g:7319:1: ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) )
            {
            // InternalGoatComponents.g:7319:1: ( ( rule__AttributeToSet__AttributeAssignment_0_3 ) )
            // InternalGoatComponents.g:7320:2: ( rule__AttributeToSet__AttributeAssignment_0_3 )
            {
             before(grammarAccess.getAttributeToSetAccess().getAttributeAssignment_0_3()); 
            // InternalGoatComponents.g:7321:2: ( rule__AttributeToSet__AttributeAssignment_0_3 )
            // InternalGoatComponents.g:7321:3: rule__AttributeToSet__AttributeAssignment_0_3
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
    // InternalGoatComponents.g:7330:1: rule__AttributeToSet__Group_1__0 : rule__AttributeToSet__Group_1__0__Impl rule__AttributeToSet__Group_1__1 ;
    public final void rule__AttributeToSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7334:1: ( rule__AttributeToSet__Group_1__0__Impl rule__AttributeToSet__Group_1__1 )
            // InternalGoatComponents.g:7335:2: rule__AttributeToSet__Group_1__0__Impl rule__AttributeToSet__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGoatComponents.g:7342:1: rule__AttributeToSet__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeToSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7346:1: ( ( () ) )
            // InternalGoatComponents.g:7347:1: ( () )
            {
            // InternalGoatComponents.g:7347:1: ( () )
            // InternalGoatComponents.g:7348:2: ()
            {
             before(grammarAccess.getAttributeToSetAccess().getLocalAttributeToSetAction_1_0()); 
            // InternalGoatComponents.g:7349:2: ()
            // InternalGoatComponents.g:7349:3: 
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
    // InternalGoatComponents.g:7357:1: rule__AttributeToSet__Group_1__1 : rule__AttributeToSet__Group_1__1__Impl rule__AttributeToSet__Group_1__2 ;
    public final void rule__AttributeToSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7361:1: ( rule__AttributeToSet__Group_1__1__Impl rule__AttributeToSet__Group_1__2 )
            // InternalGoatComponents.g:7362:2: rule__AttributeToSet__Group_1__1__Impl rule__AttributeToSet__Group_1__2
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
    // InternalGoatComponents.g:7369:1: rule__AttributeToSet__Group_1__1__Impl : ( 'proc' ) ;
    public final void rule__AttributeToSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7373:1: ( ( 'proc' ) )
            // InternalGoatComponents.g:7374:1: ( 'proc' )
            {
            // InternalGoatComponents.g:7374:1: ( 'proc' )
            // InternalGoatComponents.g:7375:2: 'proc'
            {
             before(grammarAccess.getAttributeToSetAccess().getProcKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGoatComponents.g:7384:1: rule__AttributeToSet__Group_1__2 : rule__AttributeToSet__Group_1__2__Impl rule__AttributeToSet__Group_1__3 ;
    public final void rule__AttributeToSet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7388:1: ( rule__AttributeToSet__Group_1__2__Impl rule__AttributeToSet__Group_1__3 )
            // InternalGoatComponents.g:7389:2: rule__AttributeToSet__Group_1__2__Impl rule__AttributeToSet__Group_1__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:7396:1: rule__AttributeToSet__Group_1__2__Impl : ( '.' ) ;
    public final void rule__AttributeToSet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7400:1: ( ( '.' ) )
            // InternalGoatComponents.g:7401:1: ( '.' )
            {
            // InternalGoatComponents.g:7401:1: ( '.' )
            // InternalGoatComponents.g:7402:2: '.'
            {
             before(grammarAccess.getAttributeToSetAccess().getFullStopKeyword_1_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGoatComponents.g:7411:1: rule__AttributeToSet__Group_1__3 : rule__AttributeToSet__Group_1__3__Impl ;
    public final void rule__AttributeToSet__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7415:1: ( rule__AttributeToSet__Group_1__3__Impl )
            // InternalGoatComponents.g:7416:2: rule__AttributeToSet__Group_1__3__Impl
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
    // InternalGoatComponents.g:7422:1: rule__AttributeToSet__Group_1__3__Impl : ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) ) ;
    public final void rule__AttributeToSet__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7426:1: ( ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) ) )
            // InternalGoatComponents.g:7427:1: ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) )
            {
            // InternalGoatComponents.g:7427:1: ( ( rule__AttributeToSet__AttributeAssignment_1_3 ) )
            // InternalGoatComponents.g:7428:2: ( rule__AttributeToSet__AttributeAssignment_1_3 )
            {
             before(grammarAccess.getAttributeToSetAccess().getAttributeAssignment_1_3()); 
            // InternalGoatComponents.g:7429:2: ( rule__AttributeToSet__AttributeAssignment_1_3 )
            // InternalGoatComponents.g:7429:3: rule__AttributeToSet__AttributeAssignment_1_3
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
    // InternalGoatComponents.g:7438:1: rule__FuncParam__Group__0 : rule__FuncParam__Group__0__Impl rule__FuncParam__Group__1 ;
    public final void rule__FuncParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7442:1: ( rule__FuncParam__Group__0__Impl rule__FuncParam__Group__1 )
            // InternalGoatComponents.g:7443:2: rule__FuncParam__Group__0__Impl rule__FuncParam__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:7450:1: rule__FuncParam__Group__0__Impl : ( ( rule__FuncParam__TypeAssignment_0 ) ) ;
    public final void rule__FuncParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7454:1: ( ( ( rule__FuncParam__TypeAssignment_0 ) ) )
            // InternalGoatComponents.g:7455:1: ( ( rule__FuncParam__TypeAssignment_0 ) )
            {
            // InternalGoatComponents.g:7455:1: ( ( rule__FuncParam__TypeAssignment_0 ) )
            // InternalGoatComponents.g:7456:2: ( rule__FuncParam__TypeAssignment_0 )
            {
             before(grammarAccess.getFuncParamAccess().getTypeAssignment_0()); 
            // InternalGoatComponents.g:7457:2: ( rule__FuncParam__TypeAssignment_0 )
            // InternalGoatComponents.g:7457:3: rule__FuncParam__TypeAssignment_0
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
    // InternalGoatComponents.g:7465:1: rule__FuncParam__Group__1 : rule__FuncParam__Group__1__Impl ;
    public final void rule__FuncParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7469:1: ( rule__FuncParam__Group__1__Impl )
            // InternalGoatComponents.g:7470:2: rule__FuncParam__Group__1__Impl
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
    // InternalGoatComponents.g:7476:1: rule__FuncParam__Group__1__Impl : ( ( rule__FuncParam__NameAssignment_1 ) ) ;
    public final void rule__FuncParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7480:1: ( ( ( rule__FuncParam__NameAssignment_1 ) ) )
            // InternalGoatComponents.g:7481:1: ( ( rule__FuncParam__NameAssignment_1 ) )
            {
            // InternalGoatComponents.g:7481:1: ( ( rule__FuncParam__NameAssignment_1 ) )
            // InternalGoatComponents.g:7482:2: ( rule__FuncParam__NameAssignment_1 )
            {
             before(grammarAccess.getFuncParamAccess().getNameAssignment_1()); 
            // InternalGoatComponents.g:7483:2: ( rule__FuncParam__NameAssignment_1 )
            // InternalGoatComponents.g:7483:3: rule__FuncParam__NameAssignment_1
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
    // InternalGoatComponents.g:7492:1: rule__FuncDefinition__Group__0 : rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1 ;
    public final void rule__FuncDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7496:1: ( rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1 )
            // InternalGoatComponents.g:7497:2: rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1
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
    // InternalGoatComponents.g:7504:1: rule__FuncDefinition__Group__0__Impl : ( 'function' ) ;
    public final void rule__FuncDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7508:1: ( ( 'function' ) )
            // InternalGoatComponents.g:7509:1: ( 'function' )
            {
            // InternalGoatComponents.g:7509:1: ( 'function' )
            // InternalGoatComponents.g:7510:2: 'function'
            {
             before(grammarAccess.getFuncDefinitionAccess().getFunctionKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGoatComponents.g:7519:1: rule__FuncDefinition__Group__1 : rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2 ;
    public final void rule__FuncDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7523:1: ( rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2 )
            // InternalGoatComponents.g:7524:2: rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:7531:1: rule__FuncDefinition__Group__1__Impl : ( ( rule__FuncDefinition__TypeAssignment_1 ) ) ;
    public final void rule__FuncDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7535:1: ( ( ( rule__FuncDefinition__TypeAssignment_1 ) ) )
            // InternalGoatComponents.g:7536:1: ( ( rule__FuncDefinition__TypeAssignment_1 ) )
            {
            // InternalGoatComponents.g:7536:1: ( ( rule__FuncDefinition__TypeAssignment_1 ) )
            // InternalGoatComponents.g:7537:2: ( rule__FuncDefinition__TypeAssignment_1 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getTypeAssignment_1()); 
            // InternalGoatComponents.g:7538:2: ( rule__FuncDefinition__TypeAssignment_1 )
            // InternalGoatComponents.g:7538:3: rule__FuncDefinition__TypeAssignment_1
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
    // InternalGoatComponents.g:7546:1: rule__FuncDefinition__Group__2 : rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3 ;
    public final void rule__FuncDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7550:1: ( rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3 )
            // InternalGoatComponents.g:7551:2: rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponents.g:7558:1: rule__FuncDefinition__Group__2__Impl : ( ( rule__FuncDefinition__NameAssignment_2 ) ) ;
    public final void rule__FuncDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7562:1: ( ( ( rule__FuncDefinition__NameAssignment_2 ) ) )
            // InternalGoatComponents.g:7563:1: ( ( rule__FuncDefinition__NameAssignment_2 ) )
            {
            // InternalGoatComponents.g:7563:1: ( ( rule__FuncDefinition__NameAssignment_2 ) )
            // InternalGoatComponents.g:7564:2: ( rule__FuncDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getNameAssignment_2()); 
            // InternalGoatComponents.g:7565:2: ( rule__FuncDefinition__NameAssignment_2 )
            // InternalGoatComponents.g:7565:3: rule__FuncDefinition__NameAssignment_2
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
    // InternalGoatComponents.g:7573:1: rule__FuncDefinition__Group__3 : rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4 ;
    public final void rule__FuncDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7577:1: ( rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4 )
            // InternalGoatComponents.g:7578:2: rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4
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
    // InternalGoatComponents.g:7585:1: rule__FuncDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__FuncDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7589:1: ( ( '(' ) )
            // InternalGoatComponents.g:7590:1: ( '(' )
            {
            // InternalGoatComponents.g:7590:1: ( '(' )
            // InternalGoatComponents.g:7591:2: '('
            {
             before(grammarAccess.getFuncDefinitionAccess().getLeftParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:7600:1: rule__FuncDefinition__Group__4 : rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5 ;
    public final void rule__FuncDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7604:1: ( rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5 )
            // InternalGoatComponents.g:7605:2: rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5
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
    // InternalGoatComponents.g:7612:1: rule__FuncDefinition__Group__4__Impl : ( ( rule__FuncDefinition__Group_4__0 )? ) ;
    public final void rule__FuncDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7616:1: ( ( ( rule__FuncDefinition__Group_4__0 )? ) )
            // InternalGoatComponents.g:7617:1: ( ( rule__FuncDefinition__Group_4__0 )? )
            {
            // InternalGoatComponents.g:7617:1: ( ( rule__FuncDefinition__Group_4__0 )? )
            // InternalGoatComponents.g:7618:2: ( rule__FuncDefinition__Group_4__0 )?
            {
             before(grammarAccess.getFuncDefinitionAccess().getGroup_4()); 
            // InternalGoatComponents.g:7619:2: ( rule__FuncDefinition__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_TYPE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGoatComponents.g:7619:3: rule__FuncDefinition__Group_4__0
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
    // InternalGoatComponents.g:7627:1: rule__FuncDefinition__Group__5 : rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6 ;
    public final void rule__FuncDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7631:1: ( rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6 )
            // InternalGoatComponents.g:7632:2: rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:7639:1: rule__FuncDefinition__Group__5__Impl : ( ')' ) ;
    public final void rule__FuncDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7643:1: ( ( ')' ) )
            // InternalGoatComponents.g:7644:1: ( ')' )
            {
            // InternalGoatComponents.g:7644:1: ( ')' )
            // InternalGoatComponents.g:7645:2: ')'
            {
             before(grammarAccess.getFuncDefinitionAccess().getRightParenthesisKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:7654:1: rule__FuncDefinition__Group__6 : rule__FuncDefinition__Group__6__Impl ;
    public final void rule__FuncDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7658:1: ( rule__FuncDefinition__Group__6__Impl )
            // InternalGoatComponents.g:7659:2: rule__FuncDefinition__Group__6__Impl
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
    // InternalGoatComponents.g:7665:1: rule__FuncDefinition__Group__6__Impl : ( ( rule__FuncDefinition__BlkAssignment_6 ) ) ;
    public final void rule__FuncDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7669:1: ( ( ( rule__FuncDefinition__BlkAssignment_6 ) ) )
            // InternalGoatComponents.g:7670:1: ( ( rule__FuncDefinition__BlkAssignment_6 ) )
            {
            // InternalGoatComponents.g:7670:1: ( ( rule__FuncDefinition__BlkAssignment_6 ) )
            // InternalGoatComponents.g:7671:2: ( rule__FuncDefinition__BlkAssignment_6 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getBlkAssignment_6()); 
            // InternalGoatComponents.g:7672:2: ( rule__FuncDefinition__BlkAssignment_6 )
            // InternalGoatComponents.g:7672:3: rule__FuncDefinition__BlkAssignment_6
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
    // InternalGoatComponents.g:7681:1: rule__FuncDefinition__Group_4__0 : rule__FuncDefinition__Group_4__0__Impl rule__FuncDefinition__Group_4__1 ;
    public final void rule__FuncDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7685:1: ( rule__FuncDefinition__Group_4__0__Impl rule__FuncDefinition__Group_4__1 )
            // InternalGoatComponents.g:7686:2: rule__FuncDefinition__Group_4__0__Impl rule__FuncDefinition__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalGoatComponents.g:7693:1: rule__FuncDefinition__Group_4__0__Impl : ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) ) ;
    public final void rule__FuncDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7697:1: ( ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) ) )
            // InternalGoatComponents.g:7698:1: ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) )
            {
            // InternalGoatComponents.g:7698:1: ( ( rule__FuncDefinition__ParamsAssignment_4_0 ) )
            // InternalGoatComponents.g:7699:2: ( rule__FuncDefinition__ParamsAssignment_4_0 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getParamsAssignment_4_0()); 
            // InternalGoatComponents.g:7700:2: ( rule__FuncDefinition__ParamsAssignment_4_0 )
            // InternalGoatComponents.g:7700:3: rule__FuncDefinition__ParamsAssignment_4_0
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
    // InternalGoatComponents.g:7708:1: rule__FuncDefinition__Group_4__1 : rule__FuncDefinition__Group_4__1__Impl ;
    public final void rule__FuncDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7712:1: ( rule__FuncDefinition__Group_4__1__Impl )
            // InternalGoatComponents.g:7713:2: rule__FuncDefinition__Group_4__1__Impl
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
    // InternalGoatComponents.g:7719:1: rule__FuncDefinition__Group_4__1__Impl : ( ( rule__FuncDefinition__Group_4_1__0 )* ) ;
    public final void rule__FuncDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7723:1: ( ( ( rule__FuncDefinition__Group_4_1__0 )* ) )
            // InternalGoatComponents.g:7724:1: ( ( rule__FuncDefinition__Group_4_1__0 )* )
            {
            // InternalGoatComponents.g:7724:1: ( ( rule__FuncDefinition__Group_4_1__0 )* )
            // InternalGoatComponents.g:7725:2: ( rule__FuncDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getFuncDefinitionAccess().getGroup_4_1()); 
            // InternalGoatComponents.g:7726:2: ( rule__FuncDefinition__Group_4_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==31) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGoatComponents.g:7726:3: rule__FuncDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalGoatComponents.g:7735:1: rule__FuncDefinition__Group_4_1__0 : rule__FuncDefinition__Group_4_1__0__Impl rule__FuncDefinition__Group_4_1__1 ;
    public final void rule__FuncDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7739:1: ( rule__FuncDefinition__Group_4_1__0__Impl rule__FuncDefinition__Group_4_1__1 )
            // InternalGoatComponents.g:7740:2: rule__FuncDefinition__Group_4_1__0__Impl rule__FuncDefinition__Group_4_1__1
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
    // InternalGoatComponents.g:7747:1: rule__FuncDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__FuncDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7751:1: ( ( ',' ) )
            // InternalGoatComponents.g:7752:1: ( ',' )
            {
            // InternalGoatComponents.g:7752:1: ( ',' )
            // InternalGoatComponents.g:7753:2: ','
            {
             before(grammarAccess.getFuncDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGoatComponents.g:7762:1: rule__FuncDefinition__Group_4_1__1 : rule__FuncDefinition__Group_4_1__1__Impl ;
    public final void rule__FuncDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7766:1: ( rule__FuncDefinition__Group_4_1__1__Impl )
            // InternalGoatComponents.g:7767:2: rule__FuncDefinition__Group_4_1__1__Impl
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
    // InternalGoatComponents.g:7773:1: rule__FuncDefinition__Group_4_1__1__Impl : ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) ) ;
    public final void rule__FuncDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7777:1: ( ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) ) )
            // InternalGoatComponents.g:7778:1: ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) )
            {
            // InternalGoatComponents.g:7778:1: ( ( rule__FuncDefinition__ParamsAssignment_4_1_1 ) )
            // InternalGoatComponents.g:7779:2: ( rule__FuncDefinition__ParamsAssignment_4_1_1 )
            {
             before(grammarAccess.getFuncDefinitionAccess().getParamsAssignment_4_1_1()); 
            // InternalGoatComponents.g:7780:2: ( rule__FuncDefinition__ParamsAssignment_4_1_1 )
            // InternalGoatComponents.g:7780:3: rule__FuncDefinition__ParamsAssignment_4_1_1
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
    // InternalGoatComponents.g:7789:1: rule__FuncBlock__Group__0 : rule__FuncBlock__Group__0__Impl rule__FuncBlock__Group__1 ;
    public final void rule__FuncBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7793:1: ( rule__FuncBlock__Group__0__Impl rule__FuncBlock__Group__1 )
            // InternalGoatComponents.g:7794:2: rule__FuncBlock__Group__0__Impl rule__FuncBlock__Group__1
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
    // InternalGoatComponents.g:7801:1: rule__FuncBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__FuncBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7805:1: ( ( '{' ) )
            // InternalGoatComponents.g:7806:1: ( '{' )
            {
            // InternalGoatComponents.g:7806:1: ( '{' )
            // InternalGoatComponents.g:7807:2: '{'
            {
             before(grammarAccess.getFuncBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGoatComponents.g:7816:1: rule__FuncBlock__Group__1 : rule__FuncBlock__Group__1__Impl rule__FuncBlock__Group__2 ;
    public final void rule__FuncBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7820:1: ( rule__FuncBlock__Group__1__Impl rule__FuncBlock__Group__2 )
            // InternalGoatComponents.g:7821:2: rule__FuncBlock__Group__1__Impl rule__FuncBlock__Group__2
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
    // InternalGoatComponents.g:7828:1: rule__FuncBlock__Group__1__Impl : ( () ) ;
    public final void rule__FuncBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7832:1: ( ( () ) )
            // InternalGoatComponents.g:7833:1: ( () )
            {
            // InternalGoatComponents.g:7833:1: ( () )
            // InternalGoatComponents.g:7834:2: ()
            {
             before(grammarAccess.getFuncBlockAccess().getFuncBlockAction_1()); 
            // InternalGoatComponents.g:7835:2: ()
            // InternalGoatComponents.g:7835:3: 
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
    // InternalGoatComponents.g:7843:1: rule__FuncBlock__Group__2 : rule__FuncBlock__Group__2__Impl rule__FuncBlock__Group__3 ;
    public final void rule__FuncBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7847:1: ( rule__FuncBlock__Group__2__Impl rule__FuncBlock__Group__3 )
            // InternalGoatComponents.g:7848:2: rule__FuncBlock__Group__2__Impl rule__FuncBlock__Group__3
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
    // InternalGoatComponents.g:7855:1: rule__FuncBlock__Group__2__Impl : ( ( rule__FuncBlock__StatementsAssignment_2 )* ) ;
    public final void rule__FuncBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7859:1: ( ( ( rule__FuncBlock__StatementsAssignment_2 )* ) )
            // InternalGoatComponents.g:7860:1: ( ( rule__FuncBlock__StatementsAssignment_2 )* )
            {
            // InternalGoatComponents.g:7860:1: ( ( rule__FuncBlock__StatementsAssignment_2 )* )
            // InternalGoatComponents.g:7861:2: ( rule__FuncBlock__StatementsAssignment_2 )*
            {
             before(grammarAccess.getFuncBlockAccess().getStatementsAssignment_2()); 
            // InternalGoatComponents.g:7862:2: ( rule__FuncBlock__StatementsAssignment_2 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==37||(LA46_0>=55 && LA46_0<=56)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGoatComponents.g:7862:3: rule__FuncBlock__StatementsAssignment_2
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
    // InternalGoatComponents.g:7870:1: rule__FuncBlock__Group__3 : rule__FuncBlock__Group__3__Impl ;
    public final void rule__FuncBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7874:1: ( rule__FuncBlock__Group__3__Impl )
            // InternalGoatComponents.g:7875:2: rule__FuncBlock__Group__3__Impl
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
    // InternalGoatComponents.g:7881:1: rule__FuncBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__FuncBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7885:1: ( ( '}' ) )
            // InternalGoatComponents.g:7886:1: ( '}' )
            {
            // InternalGoatComponents.g:7886:1: ( '}' )
            // InternalGoatComponents.g:7887:2: '}'
            {
             before(grammarAccess.getFuncBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGoatComponents.g:7897:1: rule__FuncVarDeclaration__Group__0 : rule__FuncVarDeclaration__Group__0__Impl rule__FuncVarDeclaration__Group__1 ;
    public final void rule__FuncVarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7901:1: ( rule__FuncVarDeclaration__Group__0__Impl rule__FuncVarDeclaration__Group__1 )
            // InternalGoatComponents.g:7902:2: rule__FuncVarDeclaration__Group__0__Impl rule__FuncVarDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGoatComponents.g:7909:1: rule__FuncVarDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__FuncVarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7913:1: ( ( 'var' ) )
            // InternalGoatComponents.g:7914:1: ( 'var' )
            {
            // InternalGoatComponents.g:7914:1: ( 'var' )
            // InternalGoatComponents.g:7915:2: 'var'
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getVarKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGoatComponents.g:7924:1: rule__FuncVarDeclaration__Group__1 : rule__FuncVarDeclaration__Group__1__Impl rule__FuncVarDeclaration__Group__2 ;
    public final void rule__FuncVarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7928:1: ( rule__FuncVarDeclaration__Group__1__Impl rule__FuncVarDeclaration__Group__2 )
            // InternalGoatComponents.g:7929:2: rule__FuncVarDeclaration__Group__1__Impl rule__FuncVarDeclaration__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalGoatComponents.g:7936:1: rule__FuncVarDeclaration__Group__1__Impl : ( ( rule__FuncVarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__FuncVarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7940:1: ( ( ( rule__FuncVarDeclaration__NameAssignment_1 ) ) )
            // InternalGoatComponents.g:7941:1: ( ( rule__FuncVarDeclaration__NameAssignment_1 ) )
            {
            // InternalGoatComponents.g:7941:1: ( ( rule__FuncVarDeclaration__NameAssignment_1 ) )
            // InternalGoatComponents.g:7942:2: ( rule__FuncVarDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getNameAssignment_1()); 
            // InternalGoatComponents.g:7943:2: ( rule__FuncVarDeclaration__NameAssignment_1 )
            // InternalGoatComponents.g:7943:3: rule__FuncVarDeclaration__NameAssignment_1
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
    // InternalGoatComponents.g:7951:1: rule__FuncVarDeclaration__Group__2 : rule__FuncVarDeclaration__Group__2__Impl rule__FuncVarDeclaration__Group__3 ;
    public final void rule__FuncVarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7955:1: ( rule__FuncVarDeclaration__Group__2__Impl rule__FuncVarDeclaration__Group__3 )
            // InternalGoatComponents.g:7956:2: rule__FuncVarDeclaration__Group__2__Impl rule__FuncVarDeclaration__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:7963:1: rule__FuncVarDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__FuncVarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7967:1: ( ( '=' ) )
            // InternalGoatComponents.g:7968:1: ( '=' )
            {
            // InternalGoatComponents.g:7968:1: ( '=' )
            // InternalGoatComponents.g:7969:2: '='
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGoatComponents.g:7978:1: rule__FuncVarDeclaration__Group__3 : rule__FuncVarDeclaration__Group__3__Impl ;
    public final void rule__FuncVarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7982:1: ( rule__FuncVarDeclaration__Group__3__Impl )
            // InternalGoatComponents.g:7983:2: rule__FuncVarDeclaration__Group__3__Impl
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
    // InternalGoatComponents.g:7989:1: rule__FuncVarDeclaration__Group__3__Impl : ( ( rule__FuncVarDeclaration__ValAssignment_3 ) ) ;
    public final void rule__FuncVarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:7993:1: ( ( ( rule__FuncVarDeclaration__ValAssignment_3 ) ) )
            // InternalGoatComponents.g:7994:1: ( ( rule__FuncVarDeclaration__ValAssignment_3 ) )
            {
            // InternalGoatComponents.g:7994:1: ( ( rule__FuncVarDeclaration__ValAssignment_3 ) )
            // InternalGoatComponents.g:7995:2: ( rule__FuncVarDeclaration__ValAssignment_3 )
            {
             before(grammarAccess.getFuncVarDeclarationAccess().getValAssignment_3()); 
            // InternalGoatComponents.g:7996:2: ( rule__FuncVarDeclaration__ValAssignment_3 )
            // InternalGoatComponents.g:7996:3: rule__FuncVarDeclaration__ValAssignment_3
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
    // InternalGoatComponents.g:8005:1: rule__FuncVarAssign__Group__0 : rule__FuncVarAssign__Group__0__Impl rule__FuncVarAssign__Group__1 ;
    public final void rule__FuncVarAssign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8009:1: ( rule__FuncVarAssign__Group__0__Impl rule__FuncVarAssign__Group__1 )
            // InternalGoatComponents.g:8010:2: rule__FuncVarAssign__Group__0__Impl rule__FuncVarAssign__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalGoatComponents.g:8017:1: rule__FuncVarAssign__Group__0__Impl : ( ( rule__FuncVarAssign__VarAssignment_0 ) ) ;
    public final void rule__FuncVarAssign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8021:1: ( ( ( rule__FuncVarAssign__VarAssignment_0 ) ) )
            // InternalGoatComponents.g:8022:1: ( ( rule__FuncVarAssign__VarAssignment_0 ) )
            {
            // InternalGoatComponents.g:8022:1: ( ( rule__FuncVarAssign__VarAssignment_0 ) )
            // InternalGoatComponents.g:8023:2: ( rule__FuncVarAssign__VarAssignment_0 )
            {
             before(grammarAccess.getFuncVarAssignAccess().getVarAssignment_0()); 
            // InternalGoatComponents.g:8024:2: ( rule__FuncVarAssign__VarAssignment_0 )
            // InternalGoatComponents.g:8024:3: rule__FuncVarAssign__VarAssignment_0
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
    // InternalGoatComponents.g:8032:1: rule__FuncVarAssign__Group__1 : rule__FuncVarAssign__Group__1__Impl rule__FuncVarAssign__Group__2 ;
    public final void rule__FuncVarAssign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8036:1: ( rule__FuncVarAssign__Group__1__Impl rule__FuncVarAssign__Group__2 )
            // InternalGoatComponents.g:8037:2: rule__FuncVarAssign__Group__1__Impl rule__FuncVarAssign__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:8044:1: rule__FuncVarAssign__Group__1__Impl : ( '=' ) ;
    public final void rule__FuncVarAssign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8048:1: ( ( '=' ) )
            // InternalGoatComponents.g:8049:1: ( '=' )
            {
            // InternalGoatComponents.g:8049:1: ( '=' )
            // InternalGoatComponents.g:8050:2: '='
            {
             before(grammarAccess.getFuncVarAssignAccess().getEqualsSignKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGoatComponents.g:8059:1: rule__FuncVarAssign__Group__2 : rule__FuncVarAssign__Group__2__Impl ;
    public final void rule__FuncVarAssign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8063:1: ( rule__FuncVarAssign__Group__2__Impl )
            // InternalGoatComponents.g:8064:2: rule__FuncVarAssign__Group__2__Impl
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
    // InternalGoatComponents.g:8070:1: rule__FuncVarAssign__Group__2__Impl : ( ( rule__FuncVarAssign__ValAssignment_2 ) ) ;
    public final void rule__FuncVarAssign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8074:1: ( ( ( rule__FuncVarAssign__ValAssignment_2 ) ) )
            // InternalGoatComponents.g:8075:1: ( ( rule__FuncVarAssign__ValAssignment_2 ) )
            {
            // InternalGoatComponents.g:8075:1: ( ( rule__FuncVarAssign__ValAssignment_2 ) )
            // InternalGoatComponents.g:8076:2: ( rule__FuncVarAssign__ValAssignment_2 )
            {
             before(grammarAccess.getFuncVarAssignAccess().getValAssignment_2()); 
            // InternalGoatComponents.g:8077:2: ( rule__FuncVarAssign__ValAssignment_2 )
            // InternalGoatComponents.g:8077:3: rule__FuncVarAssign__ValAssignment_2
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
    // InternalGoatComponents.g:8086:1: rule__FuncIfElse__Group__0 : rule__FuncIfElse__Group__0__Impl rule__FuncIfElse__Group__1 ;
    public final void rule__FuncIfElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8090:1: ( rule__FuncIfElse__Group__0__Impl rule__FuncIfElse__Group__1 )
            // InternalGoatComponents.g:8091:2: rule__FuncIfElse__Group__0__Impl rule__FuncIfElse__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoatComponents.g:8098:1: rule__FuncIfElse__Group__0__Impl : ( 'if' ) ;
    public final void rule__FuncIfElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8102:1: ( ( 'if' ) )
            // InternalGoatComponents.g:8103:1: ( 'if' )
            {
            // InternalGoatComponents.g:8103:1: ( 'if' )
            // InternalGoatComponents.g:8104:2: 'if'
            {
             before(grammarAccess.getFuncIfElseAccess().getIfKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGoatComponents.g:8113:1: rule__FuncIfElse__Group__1 : rule__FuncIfElse__Group__1__Impl rule__FuncIfElse__Group__2 ;
    public final void rule__FuncIfElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8117:1: ( rule__FuncIfElse__Group__1__Impl rule__FuncIfElse__Group__2 )
            // InternalGoatComponents.g:8118:2: rule__FuncIfElse__Group__1__Impl rule__FuncIfElse__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:8125:1: rule__FuncIfElse__Group__1__Impl : ( '(' ) ;
    public final void rule__FuncIfElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8129:1: ( ( '(' ) )
            // InternalGoatComponents.g:8130:1: ( '(' )
            {
            // InternalGoatComponents.g:8130:1: ( '(' )
            // InternalGoatComponents.g:8131:2: '('
            {
             before(grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:8140:1: rule__FuncIfElse__Group__2 : rule__FuncIfElse__Group__2__Impl rule__FuncIfElse__Group__3 ;
    public final void rule__FuncIfElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8144:1: ( rule__FuncIfElse__Group__2__Impl rule__FuncIfElse__Group__3 )
            // InternalGoatComponents.g:8145:2: rule__FuncIfElse__Group__2__Impl rule__FuncIfElse__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoatComponents.g:8152:1: rule__FuncIfElse__Group__2__Impl : ( ( rule__FuncIfElse__TestAssignment_2 ) ) ;
    public final void rule__FuncIfElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8156:1: ( ( ( rule__FuncIfElse__TestAssignment_2 ) ) )
            // InternalGoatComponents.g:8157:1: ( ( rule__FuncIfElse__TestAssignment_2 ) )
            {
            // InternalGoatComponents.g:8157:1: ( ( rule__FuncIfElse__TestAssignment_2 ) )
            // InternalGoatComponents.g:8158:2: ( rule__FuncIfElse__TestAssignment_2 )
            {
             before(grammarAccess.getFuncIfElseAccess().getTestAssignment_2()); 
            // InternalGoatComponents.g:8159:2: ( rule__FuncIfElse__TestAssignment_2 )
            // InternalGoatComponents.g:8159:3: rule__FuncIfElse__TestAssignment_2
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
    // InternalGoatComponents.g:8167:1: rule__FuncIfElse__Group__3 : rule__FuncIfElse__Group__3__Impl rule__FuncIfElse__Group__4 ;
    public final void rule__FuncIfElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8171:1: ( rule__FuncIfElse__Group__3__Impl rule__FuncIfElse__Group__4 )
            // InternalGoatComponents.g:8172:2: rule__FuncIfElse__Group__3__Impl rule__FuncIfElse__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:8179:1: rule__FuncIfElse__Group__3__Impl : ( ')' ) ;
    public final void rule__FuncIfElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8183:1: ( ( ')' ) )
            // InternalGoatComponents.g:8184:1: ( ')' )
            {
            // InternalGoatComponents.g:8184:1: ( ')' )
            // InternalGoatComponents.g:8185:2: ')'
            {
             before(grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:8194:1: rule__FuncIfElse__Group__4 : rule__FuncIfElse__Group__4__Impl rule__FuncIfElse__Group__5 ;
    public final void rule__FuncIfElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8198:1: ( rule__FuncIfElse__Group__4__Impl rule__FuncIfElse__Group__5 )
            // InternalGoatComponents.g:8199:2: rule__FuncIfElse__Group__4__Impl rule__FuncIfElse__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalGoatComponents.g:8206:1: rule__FuncIfElse__Group__4__Impl : ( ( rule__FuncIfElse__ThenAssignment_4 ) ) ;
    public final void rule__FuncIfElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8210:1: ( ( ( rule__FuncIfElse__ThenAssignment_4 ) ) )
            // InternalGoatComponents.g:8211:1: ( ( rule__FuncIfElse__ThenAssignment_4 ) )
            {
            // InternalGoatComponents.g:8211:1: ( ( rule__FuncIfElse__ThenAssignment_4 ) )
            // InternalGoatComponents.g:8212:2: ( rule__FuncIfElse__ThenAssignment_4 )
            {
             before(grammarAccess.getFuncIfElseAccess().getThenAssignment_4()); 
            // InternalGoatComponents.g:8213:2: ( rule__FuncIfElse__ThenAssignment_4 )
            // InternalGoatComponents.g:8213:3: rule__FuncIfElse__ThenAssignment_4
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
    // InternalGoatComponents.g:8221:1: rule__FuncIfElse__Group__5 : rule__FuncIfElse__Group__5__Impl rule__FuncIfElse__Group__6 ;
    public final void rule__FuncIfElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8225:1: ( rule__FuncIfElse__Group__5__Impl rule__FuncIfElse__Group__6 )
            // InternalGoatComponents.g:8226:2: rule__FuncIfElse__Group__5__Impl rule__FuncIfElse__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalGoatComponents.g:8233:1: rule__FuncIfElse__Group__5__Impl : ( ( rule__FuncIfElse__Group_5__0 )* ) ;
    public final void rule__FuncIfElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8237:1: ( ( ( rule__FuncIfElse__Group_5__0 )* ) )
            // InternalGoatComponents.g:8238:1: ( ( rule__FuncIfElse__Group_5__0 )* )
            {
            // InternalGoatComponents.g:8238:1: ( ( rule__FuncIfElse__Group_5__0 )* )
            // InternalGoatComponents.g:8239:2: ( rule__FuncIfElse__Group_5__0 )*
            {
             before(grammarAccess.getFuncIfElseAccess().getGroup_5()); 
            // InternalGoatComponents.g:8240:2: ( rule__FuncIfElse__Group_5__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==36) ) {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==37) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalGoatComponents.g:8240:3: rule__FuncIfElse__Group_5__0
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalGoatComponents.g:8248:1: rule__FuncIfElse__Group__6 : rule__FuncIfElse__Group__6__Impl ;
    public final void rule__FuncIfElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8252:1: ( rule__FuncIfElse__Group__6__Impl )
            // InternalGoatComponents.g:8253:2: rule__FuncIfElse__Group__6__Impl
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
    // InternalGoatComponents.g:8259:1: rule__FuncIfElse__Group__6__Impl : ( ( rule__FuncIfElse__Group_6__0 )? ) ;
    public final void rule__FuncIfElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8263:1: ( ( ( rule__FuncIfElse__Group_6__0 )? ) )
            // InternalGoatComponents.g:8264:1: ( ( rule__FuncIfElse__Group_6__0 )? )
            {
            // InternalGoatComponents.g:8264:1: ( ( rule__FuncIfElse__Group_6__0 )? )
            // InternalGoatComponents.g:8265:2: ( rule__FuncIfElse__Group_6__0 )?
            {
             before(grammarAccess.getFuncIfElseAccess().getGroup_6()); 
            // InternalGoatComponents.g:8266:2: ( rule__FuncIfElse__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGoatComponents.g:8266:3: rule__FuncIfElse__Group_6__0
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
    // InternalGoatComponents.g:8275:1: rule__FuncIfElse__Group_5__0 : rule__FuncIfElse__Group_5__0__Impl rule__FuncIfElse__Group_5__1 ;
    public final void rule__FuncIfElse__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8279:1: ( rule__FuncIfElse__Group_5__0__Impl rule__FuncIfElse__Group_5__1 )
            // InternalGoatComponents.g:8280:2: rule__FuncIfElse__Group_5__0__Impl rule__FuncIfElse__Group_5__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalGoatComponents.g:8287:1: rule__FuncIfElse__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__FuncIfElse__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8291:1: ( ( 'else' ) )
            // InternalGoatComponents.g:8292:1: ( 'else' )
            {
            // InternalGoatComponents.g:8292:1: ( 'else' )
            // InternalGoatComponents.g:8293:2: 'else'
            {
             before(grammarAccess.getFuncIfElseAccess().getElseKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGoatComponents.g:8302:1: rule__FuncIfElse__Group_5__1 : rule__FuncIfElse__Group_5__1__Impl rule__FuncIfElse__Group_5__2 ;
    public final void rule__FuncIfElse__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8306:1: ( rule__FuncIfElse__Group_5__1__Impl rule__FuncIfElse__Group_5__2 )
            // InternalGoatComponents.g:8307:2: rule__FuncIfElse__Group_5__1__Impl rule__FuncIfElse__Group_5__2
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
    // InternalGoatComponents.g:8314:1: rule__FuncIfElse__Group_5__1__Impl : ( 'if' ) ;
    public final void rule__FuncIfElse__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8318:1: ( ( 'if' ) )
            // InternalGoatComponents.g:8319:1: ( 'if' )
            {
            // InternalGoatComponents.g:8319:1: ( 'if' )
            // InternalGoatComponents.g:8320:2: 'if'
            {
             before(grammarAccess.getFuncIfElseAccess().getIfKeyword_5_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGoatComponents.g:8329:1: rule__FuncIfElse__Group_5__2 : rule__FuncIfElse__Group_5__2__Impl rule__FuncIfElse__Group_5__3 ;
    public final void rule__FuncIfElse__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8333:1: ( rule__FuncIfElse__Group_5__2__Impl rule__FuncIfElse__Group_5__3 )
            // InternalGoatComponents.g:8334:2: rule__FuncIfElse__Group_5__2__Impl rule__FuncIfElse__Group_5__3
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
    // InternalGoatComponents.g:8341:1: rule__FuncIfElse__Group_5__2__Impl : ( '(' ) ;
    public final void rule__FuncIfElse__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8345:1: ( ( '(' ) )
            // InternalGoatComponents.g:8346:1: ( '(' )
            {
            // InternalGoatComponents.g:8346:1: ( '(' )
            // InternalGoatComponents.g:8347:2: '('
            {
             before(grammarAccess.getFuncIfElseAccess().getLeftParenthesisKeyword_5_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGoatComponents.g:8356:1: rule__FuncIfElse__Group_5__3 : rule__FuncIfElse__Group_5__3__Impl rule__FuncIfElse__Group_5__4 ;
    public final void rule__FuncIfElse__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8360:1: ( rule__FuncIfElse__Group_5__3__Impl rule__FuncIfElse__Group_5__4 )
            // InternalGoatComponents.g:8361:2: rule__FuncIfElse__Group_5__3__Impl rule__FuncIfElse__Group_5__4
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
    // InternalGoatComponents.g:8368:1: rule__FuncIfElse__Group_5__3__Impl : ( ( rule__FuncIfElse__TestAssignment_5_3 ) ) ;
    public final void rule__FuncIfElse__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8372:1: ( ( ( rule__FuncIfElse__TestAssignment_5_3 ) ) )
            // InternalGoatComponents.g:8373:1: ( ( rule__FuncIfElse__TestAssignment_5_3 ) )
            {
            // InternalGoatComponents.g:8373:1: ( ( rule__FuncIfElse__TestAssignment_5_3 ) )
            // InternalGoatComponents.g:8374:2: ( rule__FuncIfElse__TestAssignment_5_3 )
            {
             before(grammarAccess.getFuncIfElseAccess().getTestAssignment_5_3()); 
            // InternalGoatComponents.g:8375:2: ( rule__FuncIfElse__TestAssignment_5_3 )
            // InternalGoatComponents.g:8375:3: rule__FuncIfElse__TestAssignment_5_3
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
    // InternalGoatComponents.g:8383:1: rule__FuncIfElse__Group_5__4 : rule__FuncIfElse__Group_5__4__Impl rule__FuncIfElse__Group_5__5 ;
    public final void rule__FuncIfElse__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8387:1: ( rule__FuncIfElse__Group_5__4__Impl rule__FuncIfElse__Group_5__5 )
            // InternalGoatComponents.g:8388:2: rule__FuncIfElse__Group_5__4__Impl rule__FuncIfElse__Group_5__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:8395:1: rule__FuncIfElse__Group_5__4__Impl : ( ')' ) ;
    public final void rule__FuncIfElse__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8399:1: ( ( ')' ) )
            // InternalGoatComponents.g:8400:1: ( ')' )
            {
            // InternalGoatComponents.g:8400:1: ( ')' )
            // InternalGoatComponents.g:8401:2: ')'
            {
             before(grammarAccess.getFuncIfElseAccess().getRightParenthesisKeyword_5_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGoatComponents.g:8410:1: rule__FuncIfElse__Group_5__5 : rule__FuncIfElse__Group_5__5__Impl ;
    public final void rule__FuncIfElse__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8414:1: ( rule__FuncIfElse__Group_5__5__Impl )
            // InternalGoatComponents.g:8415:2: rule__FuncIfElse__Group_5__5__Impl
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
    // InternalGoatComponents.g:8421:1: rule__FuncIfElse__Group_5__5__Impl : ( ( rule__FuncIfElse__ThenAssignment_5_5 ) ) ;
    public final void rule__FuncIfElse__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8425:1: ( ( ( rule__FuncIfElse__ThenAssignment_5_5 ) ) )
            // InternalGoatComponents.g:8426:1: ( ( rule__FuncIfElse__ThenAssignment_5_5 ) )
            {
            // InternalGoatComponents.g:8426:1: ( ( rule__FuncIfElse__ThenAssignment_5_5 ) )
            // InternalGoatComponents.g:8427:2: ( rule__FuncIfElse__ThenAssignment_5_5 )
            {
             before(grammarAccess.getFuncIfElseAccess().getThenAssignment_5_5()); 
            // InternalGoatComponents.g:8428:2: ( rule__FuncIfElse__ThenAssignment_5_5 )
            // InternalGoatComponents.g:8428:3: rule__FuncIfElse__ThenAssignment_5_5
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
    // InternalGoatComponents.g:8437:1: rule__FuncIfElse__Group_6__0 : rule__FuncIfElse__Group_6__0__Impl rule__FuncIfElse__Group_6__1 ;
    public final void rule__FuncIfElse__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8441:1: ( rule__FuncIfElse__Group_6__0__Impl rule__FuncIfElse__Group_6__1 )
            // InternalGoatComponents.g:8442:2: rule__FuncIfElse__Group_6__0__Impl rule__FuncIfElse__Group_6__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoatComponents.g:8449:1: rule__FuncIfElse__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__FuncIfElse__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8453:1: ( ( 'else' ) )
            // InternalGoatComponents.g:8454:1: ( 'else' )
            {
            // InternalGoatComponents.g:8454:1: ( 'else' )
            // InternalGoatComponents.g:8455:2: 'else'
            {
             before(grammarAccess.getFuncIfElseAccess().getElseKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGoatComponents.g:8464:1: rule__FuncIfElse__Group_6__1 : rule__FuncIfElse__Group_6__1__Impl ;
    public final void rule__FuncIfElse__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8468:1: ( rule__FuncIfElse__Group_6__1__Impl )
            // InternalGoatComponents.g:8469:2: rule__FuncIfElse__Group_6__1__Impl
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
    // InternalGoatComponents.g:8475:1: rule__FuncIfElse__Group_6__1__Impl : ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) ) ;
    public final void rule__FuncIfElse__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8479:1: ( ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) ) )
            // InternalGoatComponents.g:8480:1: ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) )
            {
            // InternalGoatComponents.g:8480:1: ( ( rule__FuncIfElse__ElseBranchAssignment_6_1 ) )
            // InternalGoatComponents.g:8481:2: ( rule__FuncIfElse__ElseBranchAssignment_6_1 )
            {
             before(grammarAccess.getFuncIfElseAccess().getElseBranchAssignment_6_1()); 
            // InternalGoatComponents.g:8482:2: ( rule__FuncIfElse__ElseBranchAssignment_6_1 )
            // InternalGoatComponents.g:8482:3: rule__FuncIfElse__ElseBranchAssignment_6_1
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
    // InternalGoatComponents.g:8491:1: rule__FuncReturn__Group__0 : rule__FuncReturn__Group__0__Impl rule__FuncReturn__Group__1 ;
    public final void rule__FuncReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8495:1: ( rule__FuncReturn__Group__0__Impl rule__FuncReturn__Group__1 )
            // InternalGoatComponents.g:8496:2: rule__FuncReturn__Group__0__Impl rule__FuncReturn__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoatComponents.g:8503:1: rule__FuncReturn__Group__0__Impl : ( 'return' ) ;
    public final void rule__FuncReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8507:1: ( ( 'return' ) )
            // InternalGoatComponents.g:8508:1: ( 'return' )
            {
            // InternalGoatComponents.g:8508:1: ( 'return' )
            // InternalGoatComponents.g:8509:2: 'return'
            {
             before(grammarAccess.getFuncReturnAccess().getReturnKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalGoatComponents.g:8518:1: rule__FuncReturn__Group__1 : rule__FuncReturn__Group__1__Impl ;
    public final void rule__FuncReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8522:1: ( rule__FuncReturn__Group__1__Impl )
            // InternalGoatComponents.g:8523:2: rule__FuncReturn__Group__1__Impl
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
    // InternalGoatComponents.g:8529:1: rule__FuncReturn__Group__1__Impl : ( ( rule__FuncReturn__ValAssignment_1 ) ) ;
    public final void rule__FuncReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8533:1: ( ( ( rule__FuncReturn__ValAssignment_1 ) ) )
            // InternalGoatComponents.g:8534:1: ( ( rule__FuncReturn__ValAssignment_1 ) )
            {
            // InternalGoatComponents.g:8534:1: ( ( rule__FuncReturn__ValAssignment_1 ) )
            // InternalGoatComponents.g:8535:2: ( rule__FuncReturn__ValAssignment_1 )
            {
             before(grammarAccess.getFuncReturnAccess().getValAssignment_1()); 
            // InternalGoatComponents.g:8536:2: ( rule__FuncReturn__ValAssignment_1 )
            // InternalGoatComponents.g:8536:3: rule__FuncReturn__ValAssignment_1
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


    // $ANTLR start "rule__Model__InfrastructureAssignment_2"
    // InternalGoatComponents.g:8545:1: rule__Model__InfrastructureAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Model__InfrastructureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8549:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponents.g:8550:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponents.g:8550:2: ( ( RULE_ID ) )
            // InternalGoatComponents.g:8551:3: ( RULE_ID )
            {
             before(grammarAccess.getModelAccess().getInfrastructureInfrastructureCrossReference_2_0()); 
            // InternalGoatComponents.g:8552:3: ( RULE_ID )
            // InternalGoatComponents.g:8553:4: RULE_ID
            {
             before(grammarAccess.getModelAccess().getInfrastructureInfrastructureIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getInfrastructureInfrastructureIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getModelAccess().getInfrastructureInfrastructureCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InfrastructureAssignment_2"


    // $ANTLR start "rule__Model__ProcessesAssignment_3_0"
    // InternalGoatComponents.g:8564:1: rule__Model__ProcessesAssignment_3_0 : ( ruleProcessDefinition ) ;
    public final void rule__Model__ProcessesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8568:1: ( ( ruleProcessDefinition ) )
            // InternalGoatComponents.g:8569:2: ( ruleProcessDefinition )
            {
            // InternalGoatComponents.g:8569:2: ( ruleProcessDefinition )
            // InternalGoatComponents.g:8570:3: ruleProcessDefinition
            {
             before(grammarAccess.getModelAccess().getProcessesProcessDefinitionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProcessesProcessDefinitionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProcessesAssignment_3_0"


    // $ANTLR start "rule__Model__ComponentsAssignment_3_1"
    // InternalGoatComponents.g:8579:1: rule__Model__ComponentsAssignment_3_1 : ( ruleComponentDefinition ) ;
    public final void rule__Model__ComponentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8583:1: ( ( ruleComponentDefinition ) )
            // InternalGoatComponents.g:8584:2: ( ruleComponentDefinition )
            {
            // InternalGoatComponents.g:8584:2: ( ruleComponentDefinition )
            // InternalGoatComponents.g:8585:3: ruleComponentDefinition
            {
             before(grammarAccess.getModelAccess().getComponentsComponentDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComponentsComponentDefinitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ComponentsAssignment_3_1"


    // $ANTLR start "rule__Model__FunctionsAssignment_3_2"
    // InternalGoatComponents.g:8594:1: rule__Model__FunctionsAssignment_3_2 : ( ruleFuncDefinition ) ;
    public final void rule__Model__FunctionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8598:1: ( ( ruleFuncDefinition ) )
            // InternalGoatComponents.g:8599:2: ( ruleFuncDefinition )
            {
            // InternalGoatComponents.g:8599:2: ( ruleFuncDefinition )
            // InternalGoatComponents.g:8600:3: ruleFuncDefinition
            {
             before(grammarAccess.getModelAccess().getFunctionsFuncDefinitionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFunctionsFuncDefinitionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FunctionsAssignment_3_2"


    // $ANTLR start "rule__InterleavingProcess__SubProcsAssignment_2_1"
    // InternalGoatComponents.g:8609:1: rule__InterleavingProcess__SubProcsAssignment_2_1 : ( ruleCallProcess ) ;
    public final void rule__InterleavingProcess__SubProcsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8613:1: ( ( ruleCallProcess ) )
            // InternalGoatComponents.g:8614:2: ( ruleCallProcess )
            {
            // InternalGoatComponents.g:8614:2: ( ruleCallProcess )
            // InternalGoatComponents.g:8615:3: ruleCallProcess
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
    // InternalGoatComponents.g:8624:1: rule__Preconditions__PrecondAssignment_1 : ( ( rule__Preconditions__PrecondAlternatives_1_0 ) ) ;
    public final void rule__Preconditions__PrecondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8628:1: ( ( ( rule__Preconditions__PrecondAlternatives_1_0 ) ) )
            // InternalGoatComponents.g:8629:2: ( ( rule__Preconditions__PrecondAlternatives_1_0 ) )
            {
            // InternalGoatComponents.g:8629:2: ( ( rule__Preconditions__PrecondAlternatives_1_0 ) )
            // InternalGoatComponents.g:8630:3: ( rule__Preconditions__PrecondAlternatives_1_0 )
            {
             before(grammarAccess.getPreconditionsAccess().getPrecondAlternatives_1_0()); 
            // InternalGoatComponents.g:8631:3: ( rule__Preconditions__PrecondAlternatives_1_0 )
            // InternalGoatComponents.g:8631:4: rule__Preconditions__PrecondAlternatives_1_0
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
    // InternalGoatComponents.g:8639:1: rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1 : ( ruleInputProcess ) ;
    public final void rule__PredOutputProcessOrInputProcess__InputsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8643:1: ( ( ruleInputProcess ) )
            // InternalGoatComponents.g:8644:2: ( ruleInputProcess )
            {
            // InternalGoatComponents.g:8644:2: ( ruleInputProcess )
            // InternalGoatComponents.g:8645:3: ruleInputProcess
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
    // InternalGoatComponents.g:8654:1: rule__InputProcessesPart__InputsAssignment_0 : ( ruleInputProcess ) ;
    public final void rule__InputProcessesPart__InputsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8658:1: ( ( ruleInputProcess ) )
            // InternalGoatComponents.g:8659:2: ( ruleInputProcess )
            {
            // InternalGoatComponents.g:8659:2: ( ruleInputProcess )
            // InternalGoatComponents.g:8660:3: ruleInputProcess
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
    // InternalGoatComponents.g:8669:1: rule__InputProcessesPart__PrecondsAssignment_1_1 : ( rulePreconditions ) ;
    public final void rule__InputProcessesPart__PrecondsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8673:1: ( ( rulePreconditions ) )
            // InternalGoatComponents.g:8674:2: ( rulePreconditions )
            {
            // InternalGoatComponents.g:8674:2: ( rulePreconditions )
            // InternalGoatComponents.g:8675:3: rulePreconditions
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
    // InternalGoatComponents.g:8684:1: rule__InputProcessesPart__InputsAssignment_1_2 : ( ruleInputProcess ) ;
    public final void rule__InputProcessesPart__InputsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8688:1: ( ( ruleInputProcess ) )
            // InternalGoatComponents.g:8689:2: ( ruleInputProcess )
            {
            // InternalGoatComponents.g:8689:2: ( ruleInputProcess )
            // InternalGoatComponents.g:8690:3: ruleInputProcess
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
    // InternalGoatComponents.g:8699:1: rule__InputProcess__Rec_predAssignment_3 : ( ruleExpression ) ;
    public final void rule__InputProcess__Rec_predAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8703:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:8704:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:8704:2: ( ruleExpression )
            // InternalGoatComponents.g:8705:3: ruleExpression
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
    // InternalGoatComponents.g:8714:1: rule__InputProcess__MsgInPartsAssignment_6_0 : ( ruleAttributeToSet ) ;
    public final void rule__InputProcess__MsgInPartsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8718:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponents.g:8719:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponents.g:8719:2: ( ruleAttributeToSet )
            // InternalGoatComponents.g:8720:3: ruleAttributeToSet
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
    // InternalGoatComponents.g:8729:1: rule__InputProcess__MsgInPartsAssignment_6_1_1 : ( ruleAttributeToSet ) ;
    public final void rule__InputProcess__MsgInPartsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8733:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponents.g:8734:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponents.g:8734:2: ( ruleAttributeToSet )
            // InternalGoatComponents.g:8735:3: ruleAttributeToSet
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
    // InternalGoatComponents.g:8744:1: rule__InputProcess__OutputAssignment_8 : ( rulePrintStatement ) ;
    public final void rule__InputProcess__OutputAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8748:1: ( ( rulePrintStatement ) )
            // InternalGoatComponents.g:8749:2: ( rulePrintStatement )
            {
            // InternalGoatComponents.g:8749:2: ( rulePrintStatement )
            // InternalGoatComponents.g:8750:3: rulePrintStatement
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
    // InternalGoatComponents.g:8759:1: rule__InputProcess__NextAssignment_10 : ( ruleNZCProcess ) ;
    public final void rule__InputProcess__NextAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8763:1: ( ( ruleNZCProcess ) )
            // InternalGoatComponents.g:8764:2: ( ruleNZCProcess )
            {
            // InternalGoatComponents.g:8764:2: ( ruleNZCProcess )
            // InternalGoatComponents.g:8765:3: ruleNZCProcess
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
    // InternalGoatComponents.g:8774:1: rule__OutputProcessPart__MsgOutPartsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__OutputProcessPart__MsgOutPartsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8778:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:8779:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:8779:2: ( ruleExpression )
            // InternalGoatComponents.g:8780:3: ruleExpression
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
    // InternalGoatComponents.g:8789:1: rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__OutputProcessPart__MsgOutPartsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8793:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:8794:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:8794:2: ( ruleExpression )
            // InternalGoatComponents.g:8795:3: ruleExpression
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
    // InternalGoatComponents.g:8804:1: rule__OutputProcessPart__Send_predAssignment_6 : ( ruleExpression ) ;
    public final void rule__OutputProcessPart__Send_predAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8808:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:8809:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:8809:2: ( ruleExpression )
            // InternalGoatComponents.g:8810:3: ruleExpression
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
    // InternalGoatComponents.g:8819:1: rule__OutputProcessPart__OutputAssignment_8 : ( rulePrintStatement ) ;
    public final void rule__OutputProcessPart__OutputAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8823:1: ( ( rulePrintStatement ) )
            // InternalGoatComponents.g:8824:2: ( rulePrintStatement )
            {
            // InternalGoatComponents.g:8824:2: ( rulePrintStatement )
            // InternalGoatComponents.g:8825:3: rulePrintStatement
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
    // InternalGoatComponents.g:8834:1: rule__OutputProcessPart__MsecAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__OutputProcessPart__MsecAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8838:1: ( ( RULE_INT ) )
            // InternalGoatComponents.g:8839:2: ( RULE_INT )
            {
            // InternalGoatComponents.g:8839:2: ( RULE_INT )
            // InternalGoatComponents.g:8840:3: RULE_INT
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
    // InternalGoatComponents.g:8849:1: rule__OutputProcessPart__NextAssignment_11 : ( ruleProc ) ;
    public final void rule__OutputProcessPart__NextAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8853:1: ( ( ruleProc ) )
            // InternalGoatComponents.g:8854:2: ( ruleProc )
            {
            // InternalGoatComponents.g:8854:2: ( ruleProc )
            // InternalGoatComponents.g:8855:3: ruleProc
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
    // InternalGoatComponents.g:8864:1: rule__PrintFormattedStatement__ToPrintAssignment_3 : ( RULE_STRING ) ;
    public final void rule__PrintFormattedStatement__ToPrintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8868:1: ( ( RULE_STRING ) )
            // InternalGoatComponents.g:8869:2: ( RULE_STRING )
            {
            // InternalGoatComponents.g:8869:2: ( RULE_STRING )
            // InternalGoatComponents.g:8870:3: RULE_STRING
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
    // InternalGoatComponents.g:8879:1: rule__IfProcesses__BranchesAssignment_1 : ( ruleIfBranchProcess ) ;
    public final void rule__IfProcesses__BranchesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8883:1: ( ( ruleIfBranchProcess ) )
            // InternalGoatComponents.g:8884:2: ( ruleIfBranchProcess )
            {
            // InternalGoatComponents.g:8884:2: ( ruleIfBranchProcess )
            // InternalGoatComponents.g:8885:3: ruleIfBranchProcess
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
    // InternalGoatComponents.g:8894:1: rule__IfProcesses__BranchesAssignment_2_1 : ( ruleIfBranchProcess ) ;
    public final void rule__IfProcesses__BranchesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8898:1: ( ( ruleIfBranchProcess ) )
            // InternalGoatComponents.g:8899:2: ( ruleIfBranchProcess )
            {
            // InternalGoatComponents.g:8899:2: ( ruleIfBranchProcess )
            // InternalGoatComponents.g:8900:3: ruleIfBranchProcess
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
    // InternalGoatComponents.g:8909:1: rule__IfProcesses__BranchesAssignment_3_1 : ( ruleElseBranchProcess ) ;
    public final void rule__IfProcesses__BranchesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8913:1: ( ( ruleElseBranchProcess ) )
            // InternalGoatComponents.g:8914:2: ( ruleElseBranchProcess )
            {
            // InternalGoatComponents.g:8914:2: ( ruleElseBranchProcess )
            // InternalGoatComponents.g:8915:3: ruleElseBranchProcess
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
    // InternalGoatComponents.g:8924:1: rule__IfBranchProcess__CondAssignment_2 : ( rulePreconditions ) ;
    public final void rule__IfBranchProcess__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8928:1: ( ( rulePreconditions ) )
            // InternalGoatComponents.g:8929:2: ( rulePreconditions )
            {
            // InternalGoatComponents.g:8929:2: ( rulePreconditions )
            // InternalGoatComponents.g:8930:3: rulePreconditions
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
    // InternalGoatComponents.g:8939:1: rule__IfBranchProcess__ThenAssignment_4 : ( rulePredOutputProcessOrInputProcess ) ;
    public final void rule__IfBranchProcess__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8943:1: ( ( rulePredOutputProcessOrInputProcess ) )
            // InternalGoatComponents.g:8944:2: ( rulePredOutputProcessOrInputProcess )
            {
            // InternalGoatComponents.g:8944:2: ( rulePredOutputProcessOrInputProcess )
            // InternalGoatComponents.g:8945:3: rulePredOutputProcessOrInputProcess
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
    // InternalGoatComponents.g:8954:1: rule__ElseBranchProcess__ThenAssignment_2 : ( rulePredOutputProcessOrInputProcess ) ;
    public final void rule__ElseBranchProcess__ThenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8958:1: ( ( rulePredOutputProcessOrInputProcess ) )
            // InternalGoatComponents.g:8959:2: ( rulePredOutputProcessOrInputProcess )
            {
            // InternalGoatComponents.g:8959:2: ( rulePredOutputProcessOrInputProcess )
            // InternalGoatComponents.g:8960:3: rulePredOutputProcessOrInputProcess
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
    // InternalGoatComponents.g:8969:1: rule__Update__VarsAssignment_1 : ( ruleAttributeToSet ) ;
    public final void rule__Update__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8973:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponents.g:8974:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponents.g:8974:2: ( ruleAttributeToSet )
            // InternalGoatComponents.g:8975:3: ruleAttributeToSet
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
    // InternalGoatComponents.g:8984:1: rule__Update__ValsAssignment_3 : ( ruleExpression ) ;
    public final void rule__Update__ValsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:8988:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:8989:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:8989:2: ( ruleExpression )
            // InternalGoatComponents.g:8990:3: ruleExpression
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
    // InternalGoatComponents.g:8999:1: rule__Update__VarsAssignment_4_1 : ( ruleAttributeToSet ) ;
    public final void rule__Update__VarsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9003:1: ( ( ruleAttributeToSet ) )
            // InternalGoatComponents.g:9004:2: ( ruleAttributeToSet )
            {
            // InternalGoatComponents.g:9004:2: ( ruleAttributeToSet )
            // InternalGoatComponents.g:9005:3: ruleAttributeToSet
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
    // InternalGoatComponents.g:9014:1: rule__Update__ValsAssignment_4_3 : ( ruleExpression ) ;
    public final void rule__Update__ValsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9018:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:9019:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:9019:2: ( ruleExpression )
            // InternalGoatComponents.g:9020:3: ruleExpression
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
    // InternalGoatComponents.g:9029:1: rule__Awareness__PredAssignment_3 : ( ruleExpression ) ;
    public final void rule__Awareness__PredAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9033:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:9034:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:9034:2: ( ruleExpression )
            // InternalGoatComponents.g:9035:3: ruleExpression
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
    // InternalGoatComponents.g:9044:1: rule__CallProcess__ProcnameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CallProcess__ProcnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9048:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponents.g:9049:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponents.g:9049:2: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9050:3: ( RULE_ID )
            {
             before(grammarAccess.getCallProcessAccess().getProcnameProcessDefinitionCrossReference_1_0()); 
            // InternalGoatComponents.g:9051:3: ( RULE_ID )
            // InternalGoatComponents.g:9052:4: RULE_ID
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
    // InternalGoatComponents.g:9063:1: rule__ProcessDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProcessDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9067:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9068:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9068:2: ( RULE_ID )
            // InternalGoatComponents.g:9069:3: RULE_ID
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
    // InternalGoatComponents.g:9078:1: rule__ProcessDefinition__ProcAssignment_3 : ( ruleProc ) ;
    public final void rule__ProcessDefinition__ProcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9082:1: ( ( ruleProc ) )
            // InternalGoatComponents.g:9083:2: ( ruleProc )
            {
            // InternalGoatComponents.g:9083:2: ( ruleProc )
            // InternalGoatComponents.g:9084:3: ruleProc
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
    // InternalGoatComponents.g:9093:1: rule__EnvInitValue__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__EnvInitValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9097:1: ( ( RULE_INT ) )
            // InternalGoatComponents.g:9098:2: ( RULE_INT )
            {
            // InternalGoatComponents.g:9098:2: ( RULE_INT )
            // InternalGoatComponents.g:9099:3: RULE_INT
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
    // InternalGoatComponents.g:9108:1: rule__EnvInitValue__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__EnvInitValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9112:1: ( ( RULE_STRING ) )
            // InternalGoatComponents.g:9113:2: ( RULE_STRING )
            {
            // InternalGoatComponents.g:9113:2: ( RULE_STRING )
            // InternalGoatComponents.g:9114:3: RULE_STRING
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
    // InternalGoatComponents.g:9123:1: rule__EnvInitValue__ValueAssignment_2_1 : ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__EnvInitValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9127:1: ( ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) ) )
            // InternalGoatComponents.g:9128:2: ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) )
            {
            // InternalGoatComponents.g:9128:2: ( ( rule__EnvInitValue__ValueAlternatives_2_1_0 ) )
            // InternalGoatComponents.g:9129:3: ( rule__EnvInitValue__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getEnvInitValueAccess().getValueAlternatives_2_1_0()); 
            // InternalGoatComponents.g:9130:3: ( rule__EnvInitValue__ValueAlternatives_2_1_0 )
            // InternalGoatComponents.g:9130:4: rule__EnvInitValue__ValueAlternatives_2_1_0
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
    // InternalGoatComponents.g:9138:1: rule__Environment__AttrsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Environment__AttrsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9142:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9143:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9143:2: ( RULE_ID )
            // InternalGoatComponents.g:9144:3: RULE_ID
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
    // InternalGoatComponents.g:9153:1: rule__Environment__ValsAssignment_2_2 : ( ruleEnvInitValue ) ;
    public final void rule__Environment__ValsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9157:1: ( ( ruleEnvInitValue ) )
            // InternalGoatComponents.g:9158:2: ( ruleEnvInitValue )
            {
            // InternalGoatComponents.g:9158:2: ( ruleEnvInitValue )
            // InternalGoatComponents.g:9159:3: ruleEnvInitValue
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
    // InternalGoatComponents.g:9168:1: rule__Environment__AttrsAssignment_2_3_1 : ( RULE_ID ) ;
    public final void rule__Environment__AttrsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9172:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9173:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9173:2: ( RULE_ID )
            // InternalGoatComponents.g:9174:3: RULE_ID
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
    // InternalGoatComponents.g:9183:1: rule__Environment__ValsAssignment_2_3_3 : ( ruleEnvInitValue ) ;
    public final void rule__Environment__ValsAssignment_2_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9187:1: ( ( ruleEnvInitValue ) )
            // InternalGoatComponents.g:9188:2: ( ruleEnvInitValue )
            {
            // InternalGoatComponents.g:9188:2: ( ruleEnvInitValue )
            // InternalGoatComponents.g:9189:3: ruleEnvInitValue
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
    // InternalGoatComponents.g:9198:1: rule__ComponentDefinition__EnvAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__ComponentDefinition__EnvAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9202:1: ( ( ruleEnvironment ) )
            // InternalGoatComponents.g:9203:2: ( ruleEnvironment )
            {
            // InternalGoatComponents.g:9203:2: ( ruleEnvironment )
            // InternalGoatComponents.g:9204:3: ruleEnvironment
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
    // InternalGoatComponents.g:9213:1: rule__ComponentDefinition__ProcAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentDefinition__ProcAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9217:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponents.g:9218:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponents.g:9218:2: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9219:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentDefinitionAccess().getProcProcessDefinitionCrossReference_2_0()); 
            // InternalGoatComponents.g:9220:3: ( RULE_ID )
            // InternalGoatComponents.g:9221:4: RULE_ID
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


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalGoatComponents.g:9232:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9236:1: ( ( ruleAnd ) )
            // InternalGoatComponents.g:9237:2: ( ruleAnd )
            {
            // InternalGoatComponents.g:9237:2: ( ruleAnd )
            // InternalGoatComponents.g:9238:3: ruleAnd
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
    // InternalGoatComponents.g:9247:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9251:1: ( ( ruleEquality ) )
            // InternalGoatComponents.g:9252:2: ( ruleEquality )
            {
            // InternalGoatComponents.g:9252:2: ( ruleEquality )
            // InternalGoatComponents.g:9253:3: ruleEquality
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
    // InternalGoatComponents.g:9262:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9266:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalGoatComponents.g:9267:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalGoatComponents.g:9267:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalGoatComponents.g:9268:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalGoatComponents.g:9269:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalGoatComponents.g:9269:4: rule__Equality__OpAlternatives_1_1_0
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
    // InternalGoatComponents.g:9277:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9281:1: ( ( ruleComparison ) )
            // InternalGoatComponents.g:9282:2: ( ruleComparison )
            {
            // InternalGoatComponents.g:9282:2: ( ruleComparison )
            // InternalGoatComponents.g:9283:3: ruleComparison
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
    // InternalGoatComponents.g:9292:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9296:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalGoatComponents.g:9297:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalGoatComponents.g:9297:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalGoatComponents.g:9298:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalGoatComponents.g:9299:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalGoatComponents.g:9299:4: rule__Comparison__OpAlternatives_1_1_0
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
    // InternalGoatComponents.g:9307:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9311:1: ( ( rulePlusOrMinus ) )
            // InternalGoatComponents.g:9312:2: ( rulePlusOrMinus )
            {
            // InternalGoatComponents.g:9312:2: ( rulePlusOrMinus )
            // InternalGoatComponents.g:9313:3: rulePlusOrMinus
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
    // InternalGoatComponents.g:9322:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9326:1: ( ( ruleMulOrDiv ) )
            // InternalGoatComponents.g:9327:2: ( ruleMulOrDiv )
            {
            // InternalGoatComponents.g:9327:2: ( ruleMulOrDiv )
            // InternalGoatComponents.g:9328:3: ruleMulOrDiv
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
    // InternalGoatComponents.g:9337:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9341:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalGoatComponents.g:9342:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalGoatComponents.g:9342:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalGoatComponents.g:9343:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalGoatComponents.g:9344:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalGoatComponents.g:9344:4: rule__MulOrDiv__OpAlternatives_1_1_0
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
    // InternalGoatComponents.g:9352:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9356:1: ( ( rulePrimary ) )
            // InternalGoatComponents.g:9357:2: ( rulePrimary )
            {
            // InternalGoatComponents.g:9357:2: ( rulePrimary )
            // InternalGoatComponents.g:9358:3: rulePrimary
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
    // InternalGoatComponents.g:9367:1: rule__Primary__ExpressionAssignment_1_3 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9371:1: ( ( rulePrimary ) )
            // InternalGoatComponents.g:9372:2: ( rulePrimary )
            {
            // InternalGoatComponents.g:9372:2: ( rulePrimary )
            // InternalGoatComponents.g:9373:3: rulePrimary
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
    // InternalGoatComponents.g:9382:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9386:1: ( ( RULE_INT ) )
            // InternalGoatComponents.g:9387:2: ( RULE_INT )
            {
            // InternalGoatComponents.g:9387:2: ( RULE_INT )
            // InternalGoatComponents.g:9388:3: RULE_INT
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
    // InternalGoatComponents.g:9397:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9401:1: ( ( RULE_STRING ) )
            // InternalGoatComponents.g:9402:2: ( RULE_STRING )
            {
            // InternalGoatComponents.g:9402:2: ( RULE_STRING )
            // InternalGoatComponents.g:9403:3: RULE_STRING
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
    // InternalGoatComponents.g:9412:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9416:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalGoatComponents.g:9417:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalGoatComponents.g:9417:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalGoatComponents.g:9418:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalGoatComponents.g:9419:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalGoatComponents.g:9419:4: rule__Atomic__ValueAlternatives_2_1_0
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
    // InternalGoatComponents.g:9427:1: rule__Atomic__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9431:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponents.g:9432:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponents.g:9432:2: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9433:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getRefLRefCrossReference_3_1_0()); 
            // InternalGoatComponents.g:9434:3: ( RULE_ID )
            // InternalGoatComponents.g:9435:4: RULE_ID
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
    // InternalGoatComponents.g:9446:1: rule__Atomic__AttributeAssignment_4_3 : ( RULE_ID ) ;
    public final void rule__Atomic__AttributeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9450:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9451:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9451:2: ( RULE_ID )
            // InternalGoatComponents.g:9452:3: RULE_ID
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
    // InternalGoatComponents.g:9461:1: rule__Atomic__FunctionAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__FunctionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9465:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponents.g:9466:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponents.g:9466:2: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9467:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getFunctionFuncDefinitionCrossReference_5_1_0()); 
            // InternalGoatComponents.g:9468:3: ( RULE_ID )
            // InternalGoatComponents.g:9469:4: RULE_ID
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
    // InternalGoatComponents.g:9480:1: rule__Atomic__ParamsAssignment_5_3_0 : ( ruleExpression ) ;
    public final void rule__Atomic__ParamsAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9484:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:9485:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:9485:2: ( ruleExpression )
            // InternalGoatComponents.g:9486:3: ruleExpression
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
    // InternalGoatComponents.g:9495:1: rule__Atomic__ParamsAssignment_5_3_1_1 : ( ruleExpression ) ;
    public final void rule__Atomic__ParamsAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9499:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:9500:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:9500:2: ( ruleExpression )
            // InternalGoatComponents.g:9501:3: ruleExpression
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
    // InternalGoatComponents.g:9510:1: rule__Atomic__AttributeAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__Atomic__AttributeAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9514:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9515:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9515:2: ( RULE_ID )
            // InternalGoatComponents.g:9516:3: RULE_ID
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
    // InternalGoatComponents.g:9525:1: rule__Atomic__AttributeAssignment_7_3 : ( RULE_ID ) ;
    public final void rule__Atomic__AttributeAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9529:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9530:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9530:2: ( RULE_ID )
            // InternalGoatComponents.g:9531:3: RULE_ID
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
    // InternalGoatComponents.g:9540:1: rule__AttributeToSet__AttributeAssignment_0_3 : ( RULE_ID ) ;
    public final void rule__AttributeToSet__AttributeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9544:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9545:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9545:2: ( RULE_ID )
            // InternalGoatComponents.g:9546:3: RULE_ID
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
    // InternalGoatComponents.g:9555:1: rule__AttributeToSet__AttributeAssignment_1_3 : ( RULE_ID ) ;
    public final void rule__AttributeToSet__AttributeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9559:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9560:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9560:2: ( RULE_ID )
            // InternalGoatComponents.g:9561:3: RULE_ID
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
    // InternalGoatComponents.g:9570:1: rule__FuncParam__TypeAssignment_0 : ( RULE_TYPE ) ;
    public final void rule__FuncParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9574:1: ( ( RULE_TYPE ) )
            // InternalGoatComponents.g:9575:2: ( RULE_TYPE )
            {
            // InternalGoatComponents.g:9575:2: ( RULE_TYPE )
            // InternalGoatComponents.g:9576:3: RULE_TYPE
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
    // InternalGoatComponents.g:9585:1: rule__FuncParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FuncParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9589:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9590:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9590:2: ( RULE_ID )
            // InternalGoatComponents.g:9591:3: RULE_ID
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
    // InternalGoatComponents.g:9600:1: rule__FuncDefinition__TypeAssignment_1 : ( RULE_TYPE ) ;
    public final void rule__FuncDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9604:1: ( ( RULE_TYPE ) )
            // InternalGoatComponents.g:9605:2: ( RULE_TYPE )
            {
            // InternalGoatComponents.g:9605:2: ( RULE_TYPE )
            // InternalGoatComponents.g:9606:3: RULE_TYPE
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
    // InternalGoatComponents.g:9615:1: rule__FuncDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FuncDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9619:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9620:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9620:2: ( RULE_ID )
            // InternalGoatComponents.g:9621:3: RULE_ID
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
    // InternalGoatComponents.g:9630:1: rule__FuncDefinition__ParamsAssignment_4_0 : ( ruleFuncParam ) ;
    public final void rule__FuncDefinition__ParamsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9634:1: ( ( ruleFuncParam ) )
            // InternalGoatComponents.g:9635:2: ( ruleFuncParam )
            {
            // InternalGoatComponents.g:9635:2: ( ruleFuncParam )
            // InternalGoatComponents.g:9636:3: ruleFuncParam
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
    // InternalGoatComponents.g:9645:1: rule__FuncDefinition__ParamsAssignment_4_1_1 : ( ruleFuncParam ) ;
    public final void rule__FuncDefinition__ParamsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9649:1: ( ( ruleFuncParam ) )
            // InternalGoatComponents.g:9650:2: ( ruleFuncParam )
            {
            // InternalGoatComponents.g:9650:2: ( ruleFuncParam )
            // InternalGoatComponents.g:9651:3: ruleFuncParam
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
    // InternalGoatComponents.g:9660:1: rule__FuncDefinition__BlkAssignment_6 : ( ruleFuncBlock ) ;
    public final void rule__FuncDefinition__BlkAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9664:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponents.g:9665:2: ( ruleFuncBlock )
            {
            // InternalGoatComponents.g:9665:2: ( ruleFuncBlock )
            // InternalGoatComponents.g:9666:3: ruleFuncBlock
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
    // InternalGoatComponents.g:9675:1: rule__FuncBlock__StatementsAssignment_2 : ( ruleFuncStatement ) ;
    public final void rule__FuncBlock__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9679:1: ( ( ruleFuncStatement ) )
            // InternalGoatComponents.g:9680:2: ( ruleFuncStatement )
            {
            // InternalGoatComponents.g:9680:2: ( ruleFuncStatement )
            // InternalGoatComponents.g:9681:3: ruleFuncStatement
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
    // InternalGoatComponents.g:9690:1: rule__FuncVarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FuncVarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9694:1: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9695:2: ( RULE_ID )
            {
            // InternalGoatComponents.g:9695:2: ( RULE_ID )
            // InternalGoatComponents.g:9696:3: RULE_ID
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
    // InternalGoatComponents.g:9705:1: rule__FuncVarDeclaration__ValAssignment_3 : ( ruleExpression ) ;
    public final void rule__FuncVarDeclaration__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9709:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:9710:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:9710:2: ( ruleExpression )
            // InternalGoatComponents.g:9711:3: ruleExpression
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
    // InternalGoatComponents.g:9720:1: rule__FuncVarAssign__VarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FuncVarAssign__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9724:1: ( ( ( RULE_ID ) ) )
            // InternalGoatComponents.g:9725:2: ( ( RULE_ID ) )
            {
            // InternalGoatComponents.g:9725:2: ( ( RULE_ID ) )
            // InternalGoatComponents.g:9726:3: ( RULE_ID )
            {
             before(grammarAccess.getFuncVarAssignAccess().getVarFuncVarDeclarationCrossReference_0_0()); 
            // InternalGoatComponents.g:9727:3: ( RULE_ID )
            // InternalGoatComponents.g:9728:4: RULE_ID
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
    // InternalGoatComponents.g:9739:1: rule__FuncVarAssign__ValAssignment_2 : ( ruleExpression ) ;
    public final void rule__FuncVarAssign__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9743:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:9744:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:9744:2: ( ruleExpression )
            // InternalGoatComponents.g:9745:3: ruleExpression
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
    // InternalGoatComponents.g:9754:1: rule__FuncIfElse__TestAssignment_2 : ( ruleExpression ) ;
    public final void rule__FuncIfElse__TestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9758:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:9759:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:9759:2: ( ruleExpression )
            // InternalGoatComponents.g:9760:3: ruleExpression
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
    // InternalGoatComponents.g:9769:1: rule__FuncIfElse__ThenAssignment_4 : ( ruleFuncBlock ) ;
    public final void rule__FuncIfElse__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9773:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponents.g:9774:2: ( ruleFuncBlock )
            {
            // InternalGoatComponents.g:9774:2: ( ruleFuncBlock )
            // InternalGoatComponents.g:9775:3: ruleFuncBlock
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
    // InternalGoatComponents.g:9784:1: rule__FuncIfElse__TestAssignment_5_3 : ( ruleExpression ) ;
    public final void rule__FuncIfElse__TestAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9788:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:9789:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:9789:2: ( ruleExpression )
            // InternalGoatComponents.g:9790:3: ruleExpression
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
    // InternalGoatComponents.g:9799:1: rule__FuncIfElse__ThenAssignment_5_5 : ( ruleFuncBlock ) ;
    public final void rule__FuncIfElse__ThenAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9803:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponents.g:9804:2: ( ruleFuncBlock )
            {
            // InternalGoatComponents.g:9804:2: ( ruleFuncBlock )
            // InternalGoatComponents.g:9805:3: ruleFuncBlock
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
    // InternalGoatComponents.g:9814:1: rule__FuncIfElse__ElseBranchAssignment_6_1 : ( ruleFuncBlock ) ;
    public final void rule__FuncIfElse__ElseBranchAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9818:1: ( ( ruleFuncBlock ) )
            // InternalGoatComponents.g:9819:2: ( ruleFuncBlock )
            {
            // InternalGoatComponents.g:9819:2: ( ruleFuncBlock )
            // InternalGoatComponents.g:9820:3: ruleFuncBlock
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
    // InternalGoatComponents.g:9829:1: rule__FuncReturn__ValAssignment_1 : ( ruleExpression ) ;
    public final void rule__FuncReturn__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoatComponents.g:9833:1: ( ( ruleExpression ) )
            // InternalGoatComponents.g:9834:2: ( ruleExpression )
            {
            // InternalGoatComponents.g:9834:2: ( ruleExpression )
            // InternalGoatComponents.g:9835:3: ruleExpression
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
    static final String dfa_3s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_4s = "\1\65\3\uffff\1\70\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\7\1\10\1\4\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\1\1\2\5\uffff\2\3\36\uffff\1\5\7\uffff\1\6\1\7",
            "",
            "",
            "",
            "\1\10\11\uffff\10\10\2\uffff\1\10\1\uffff\1\11\1\10\1\uffff\1\10\1\uffff\1\10\5\uffff\1\10\2\uffff\1\10\6\uffff\4\10\4\uffff\2\10",
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
            return "1474:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0040500000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0040500000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000024000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0038100004003070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0010100020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080004000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0038100024003070L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000A6004000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010080000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000003060L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0006000001000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x003810000C003070L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0180002020000010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0180002000000012L});

}