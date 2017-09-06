/*
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GoatInfrastructureGrammarAccess extends AbstractGrammarElementFinder {
	
	public class InfrastructureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sysma.goat.eclipse_plugin.GoatInfrastructure.Infrastructure");
		private final RuleCall cSingleServerParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Infrastructure:
		//	SingleServer;
		@Override public ParserRule getRule() { return rule; }
		
		//SingleServer
		public RuleCall getSingleServerParserRuleCall() { return cSingleServerParserRuleCall; }
	}
	public class SingleServerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sysma.goat.eclipse_plugin.GoatInfrastructure.SingleServer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExternalAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cExternalExternalKeyword_0_0 = (Keyword)cExternalAssignment_0.eContents().get(0);
		private final Keyword cSingleServerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParamsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParamsParamsParserRuleCall_2_0 = (RuleCall)cParamsAssignment_2.eContents().get(0);
		
		//SingleServer:
		//	external?='external'? 'singleServer' params=Params;
		@Override public ParserRule getRule() { return rule; }
		
		//external?='external'? 'singleServer' params=Params
		public Group getGroup() { return cGroup; }
		
		//external?='external'?
		public Assignment getExternalAssignment_0() { return cExternalAssignment_0; }
		
		//'external'
		public Keyword getExternalExternalKeyword_0_0() { return cExternalExternalKeyword_0_0; }
		
		//'singleServer'
		public Keyword getSingleServerKeyword_1() { return cSingleServerKeyword_1; }
		
		//params=Params
		public Assignment getParamsAssignment_2() { return cParamsAssignment_2; }
		
		//Params
		public RuleCall getParamsParamsParserRuleCall_2_0() { return cParamsParamsParserRuleCall_2_0; }
	}
	public class ParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sysma.goat.eclipse_plugin.GoatInfrastructure.Params");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cParamsAction_1 = (Action)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cGroup_2.eContents().get(0);
		private final Assignment cKeysAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final RuleCall cKeysIDTerminalRuleCall_2_0_0_0 = (RuleCall)cKeysAssignment_2_0_0.eContents().get(0);
		private final Keyword cColonKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Assignment cValuesAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cValuesSTRINGTerminalRuleCall_2_0_2_0 = (RuleCall)cValuesAssignment_2_0_2.eContents().get(0);
		private final Keyword cCommaKeyword_2_0_3 = (Keyword)cGroup_2_0.eContents().get(3);
		private final Assignment cKeysAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cKeysIDTerminalRuleCall_2_1_0 = (RuleCall)cKeysAssignment_2_1.eContents().get(0);
		private final Keyword cColonKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cValuesAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cValuesSTRINGTerminalRuleCall_2_3_0 = (RuleCall)cValuesAssignment_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Params:
		//	'{' {Params} ((keys+=ID ':' values+=STRING ',')*
		//	keys+=ID ':' values+=STRING)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' {Params} ((keys+=ID ':' values+=STRING ',')* keys+=ID ':' values+=STRING)? '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//{Params}
		public Action getParamsAction_1() { return cParamsAction_1; }
		
		//((keys+=ID ':' values+=STRING ',')* keys+=ID ':' values+=STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//(keys+=ID ':' values+=STRING ',')*
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//keys+=ID
		public Assignment getKeysAssignment_2_0_0() { return cKeysAssignment_2_0_0; }
		
		//ID
		public RuleCall getKeysIDTerminalRuleCall_2_0_0_0() { return cKeysIDTerminalRuleCall_2_0_0_0; }
		
		//':'
		public Keyword getColonKeyword_2_0_1() { return cColonKeyword_2_0_1; }
		
		//values+=STRING
		public Assignment getValuesAssignment_2_0_2() { return cValuesAssignment_2_0_2; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_2_0_2_0() { return cValuesSTRINGTerminalRuleCall_2_0_2_0; }
		
		//','
		public Keyword getCommaKeyword_2_0_3() { return cCommaKeyword_2_0_3; }
		
		//keys+=ID
		public Assignment getKeysAssignment_2_1() { return cKeysAssignment_2_1; }
		
		//ID
		public RuleCall getKeysIDTerminalRuleCall_2_1_0() { return cKeysIDTerminalRuleCall_2_1_0; }
		
		//':'
		public Keyword getColonKeyword_2_2() { return cColonKeyword_2_2; }
		
		//values+=STRING
		public Assignment getValuesAssignment_2_3() { return cValuesAssignment_2_3; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_2_3_0() { return cValuesSTRINGTerminalRuleCall_2_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	
	
	private final InfrastructureElements pInfrastructure;
	private final SingleServerElements pSingleServer;
	private final ParamsElements pParams;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GoatInfrastructureGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pInfrastructure = new InfrastructureElements();
		this.pSingleServer = new SingleServerElements();
		this.pParams = new ParamsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.sysma.goat.eclipse_plugin.GoatInfrastructure".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Infrastructure:
	//	SingleServer;
	public InfrastructureElements getInfrastructureAccess() {
		return pInfrastructure;
	}
	
	public ParserRule getInfrastructureRule() {
		return getInfrastructureAccess().getRule();
	}
	
	//SingleServer:
	//	external?='external'? 'singleServer' params=Params;
	public SingleServerElements getSingleServerAccess() {
		return pSingleServer;
	}
	
	public ParserRule getSingleServerRule() {
		return getSingleServerAccess().getRule();
	}
	
	//Params:
	//	'{' {Params} ((keys+=ID ':' values+=STRING ',')*
	//	keys+=ID ':' values+=STRING)?
	//	'}';
	public ParamsElements getParamsAccess() {
		return pParams;
	}
	
	public ParserRule getParamsRule() {
		return getParamsAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
