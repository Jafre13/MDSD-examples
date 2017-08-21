/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
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
public class MathDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class AllExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.AllExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpsMathExpParserRuleCall_3_0 = (RuleCall)cExpsAssignment_3.eContents().get(0);
		
		//AllExp:
		//	'name' name=ID ':' exps+=MathExp+;
		@Override public ParserRule getRule() { return rule; }
		
		//'name' name=ID ':' exps+=MathExp+
		public Group getGroup() { return cGroup; }
		
		//'name'
		public Keyword getNameKeyword_0() { return cNameKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//exps+=MathExp+
		public Assignment getExpsAssignment_3() { return cExpsAssignment_3; }
		
		//MathExp
		public RuleCall getExpsMathExpParserRuleCall_3_0() { return cExpsMathExpParserRuleCall_3_0; }
	}
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.MathExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpExpressionParserRuleCall_2_0 = (RuleCall)cExpAssignment_2.eContents().get(0);
		
		//MathExp:
		//	name=ID '=' exp=Expression;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '=' exp=Expression
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//exp=Expression
		public Assignment getExpAssignment_2() { return cExpAssignment_2; }
		
		//Expression
		public RuleCall getExpExpressionParserRuleCall_2_0() { return cExpExpressionParserRuleCall_2_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.Expression");
		private final RuleCall cAdditionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expression:
		//	Addition;
		@Override public ParserRule getRule() { return rule; }
		
		//Addition
		public RuleCall getAdditionParserRuleCall() { return cAdditionParserRuleCall; }
	}
	public class AdditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.Addition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSubtractionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAdditionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightSubtractionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Addition Expression:
		//	Subtraction ({Addition.left=current} '+' right=Subtraction)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Subtraction ({Addition.left=current} '+' right=Subtraction)*
		public Group getGroup() { return cGroup; }
		
		//Subtraction
		public RuleCall getSubtractionParserRuleCall_0() { return cSubtractionParserRuleCall_0; }
		
		//({Addition.left=current} '+' right=Subtraction)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Addition.left=current}
		public Action getAdditionLeftAction_1_0() { return cAdditionLeftAction_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }
		
		//right=Subtraction
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Subtraction
		public RuleCall getRightSubtractionParserRuleCall_1_2_0() { return cRightSubtractionParserRuleCall_1_2_0; }
	}
	public class SubtractionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.Subtraction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cSubtractionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMultiplicationParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Subtraction Expression:
		//	Multiplication ({Subtraction.left=current} '-' right=Multiplication)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Multiplication ({Subtraction.left=current} '-' right=Multiplication)*
		public Group getGroup() { return cGroup; }
		
		//Multiplication
		public RuleCall getMultiplicationParserRuleCall_0() { return cMultiplicationParserRuleCall_0; }
		
		//({Subtraction.left=current} '-' right=Multiplication)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Subtraction.left=current}
		public Action getSubtractionLeftAction_1_0() { return cSubtractionLeftAction_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1() { return cHyphenMinusKeyword_1_1; }
		
		//right=Multiplication
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Multiplication
		public RuleCall getRightMultiplicationParserRuleCall_1_2_0() { return cRightMultiplicationParserRuleCall_1_2_0; }
	}
	public class MultiplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.Multiplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDivisionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMultiplicationLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightDivisionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Multiplication Expression:
		//	Division ({Multiplication.left=current} '*' right=Division)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Division ({Multiplication.left=current} '*' right=Division)*
		public Group getGroup() { return cGroup; }
		
		//Division
		public RuleCall getDivisionParserRuleCall_0() { return cDivisionParserRuleCall_0; }
		
		//({Multiplication.left=current} '*' right=Division)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Multiplication.left=current}
		public Action getMultiplicationLeftAction_1_0() { return cMultiplicationLeftAction_1_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_1() { return cAsteriskKeyword_1_1; }
		
		//right=Division
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Division
		public RuleCall getRightDivisionParserRuleCall_1_2_0() { return cRightDivisionParserRuleCall_1_2_0; }
	}
	public class DivisionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.Division");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimitiveParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cDivisionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrimitiveParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Division Expression:
		//	Primitive ({Division.left=current} '/' right=Primitive)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Primitive ({Division.left=current} '/' right=Primitive)*
		public Group getGroup() { return cGroup; }
		
		//Primitive
		public RuleCall getPrimitiveParserRuleCall_0() { return cPrimitiveParserRuleCall_0; }
		
		//({Division.left=current} '/' right=Primitive)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Division.left=current}
		public Action getDivisionLeftAction_1_0() { return cDivisionLeftAction_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_1() { return cSolidusKeyword_1_1; }
		
		//right=Primitive
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Primitive
		public RuleCall getRightPrimitiveParserRuleCall_1_2_0() { return cRightPrimitiveParserRuleCall_1_2_0; }
	}
	public class PrimitiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.Primitive");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRawIntegerParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cRawVariableParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Primitive Expression:
		//	RawInteger | '(' Expression ')' | RawVariable;
		@Override public ParserRule getRule() { return rule; }
		
		//RawInteger | '(' Expression ')' | RawVariable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RawInteger
		public RuleCall getRawIntegerParserRuleCall_0() { return cRawIntegerParserRuleCall_0; }
		
		//'(' Expression ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_1_1() { return cExpressionParserRuleCall_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
		
		//RawVariable
		public RuleCall getRawVariableParserRuleCall_2() { return cRawVariableParserRuleCall_2; }
	}
	public class RawIntegerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.RawInteger");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//RawInteger:
		//	value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	public class RawVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MathDsl.RawVariable");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cValueMathExpCrossReference_0 = (CrossReference)cValueAssignment.eContents().get(0);
		private final RuleCall cValueMathExpIDTerminalRuleCall_0_1 = (RuleCall)cValueMathExpCrossReference_0.eContents().get(1);
		
		//RawVariable:
		//	value=[MathExp];
		@Override public ParserRule getRule() { return rule; }
		
		//value=[MathExp]
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//[MathExp]
		public CrossReference getValueMathExpCrossReference_0() { return cValueMathExpCrossReference_0; }
		
		//ID
		public RuleCall getValueMathExpIDTerminalRuleCall_0_1() { return cValueMathExpIDTerminalRuleCall_0_1; }
	}
	
	
	private final AllExpElements pAllExp;
	private final MathExpElements pMathExp;
	private final ExpressionElements pExpression;
	private final AdditionElements pAddition;
	private final SubtractionElements pSubtraction;
	private final MultiplicationElements pMultiplication;
	private final DivisionElements pDivision;
	private final PrimitiveElements pPrimitive;
	private final RawIntegerElements pRawInteger;
	private final RawVariableElements pRawVariable;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAllExp = new AllExpElements();
		this.pMathExp = new MathExpElements();
		this.pExpression = new ExpressionElements();
		this.pAddition = new AdditionElements();
		this.pSubtraction = new SubtractionElements();
		this.pMultiplication = new MultiplicationElements();
		this.pDivision = new DivisionElements();
		this.pPrimitive = new PrimitiveElements();
		this.pRawInteger = new RawIntegerElements();
		this.pRawVariable = new RawVariableElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MathDsl".equals(grammar.getName())) {
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

	
	//AllExp:
	//	'name' name=ID ':' exps+=MathExp+;
	public AllExpElements getAllExpAccess() {
		return pAllExp;
	}
	
	public ParserRule getAllExpRule() {
		return getAllExpAccess().getRule();
	}
	
	//MathExp:
	//	name=ID '=' exp=Expression;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//Expression:
	//	Addition;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Addition Expression:
	//	Subtraction ({Addition.left=current} '+' right=Subtraction)*;
	public AdditionElements getAdditionAccess() {
		return pAddition;
	}
	
	public ParserRule getAdditionRule() {
		return getAdditionAccess().getRule();
	}
	
	//Subtraction Expression:
	//	Multiplication ({Subtraction.left=current} '-' right=Multiplication)*;
	public SubtractionElements getSubtractionAccess() {
		return pSubtraction;
	}
	
	public ParserRule getSubtractionRule() {
		return getSubtractionAccess().getRule();
	}
	
	//Multiplication Expression:
	//	Division ({Multiplication.left=current} '*' right=Division)*;
	public MultiplicationElements getMultiplicationAccess() {
		return pMultiplication;
	}
	
	public ParserRule getMultiplicationRule() {
		return getMultiplicationAccess().getRule();
	}
	
	//Division Expression:
	//	Primitive ({Division.left=current} '/' right=Primitive)*;
	public DivisionElements getDivisionAccess() {
		return pDivision;
	}
	
	public ParserRule getDivisionRule() {
		return getDivisionAccess().getRule();
	}
	
	//Primitive Expression:
	//	RawInteger | '(' Expression ')' | RawVariable;
	public PrimitiveElements getPrimitiveAccess() {
		return pPrimitive;
	}
	
	public ParserRule getPrimitiveRule() {
		return getPrimitiveAccess().getRule();
	}
	
	//RawInteger:
	//	value=INT;
	public RawIntegerElements getRawIntegerAccess() {
		return pRawInteger;
	}
	
	public ParserRule getRawIntegerRule() {
		return getRawIntegerAccess().getRule();
	}
	
	//RawVariable:
	//	value=[MathExp];
	public RawVariableElements getRawVariableAccess() {
		return pRawVariable;
	}
	
	public ParserRule getRawVariableRule() {
		return getRawVariableAccess().getRule();
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
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
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
