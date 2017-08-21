/*
 * generated by Xtext 2.12.0
 */
grammar InternalMathDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MathDslGrammarAccess;

}
@parser::members {
	private MathDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MathDslGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleAllExp
entryRuleAllExp
:
{ before(grammarAccess.getAllExpRule()); }
	 ruleAllExp
{ after(grammarAccess.getAllExpRule()); } 
	 EOF 
;

// Rule AllExp
ruleAllExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAllExpAccess().getGroup()); }
		(rule__AllExp__Group__0)
		{ after(grammarAccess.getAllExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMathExp
entryRuleMathExp
:
{ before(grammarAccess.getMathExpRule()); }
	 ruleMathExp
{ after(grammarAccess.getMathExpRule()); } 
	 EOF 
;

// Rule MathExp
ruleMathExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMathExpAccess().getGroup()); }
		(rule__MathExp__Group__0)
		{ after(grammarAccess.getMathExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); }
		ruleAddition
		{ after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAddition
entryRuleAddition
:
{ before(grammarAccess.getAdditionRule()); }
	 ruleAddition
{ after(grammarAccess.getAdditionRule()); } 
	 EOF 
;

// Rule Addition
ruleAddition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAdditionAccess().getGroup()); }
		(rule__Addition__Group__0)
		{ after(grammarAccess.getAdditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubtraction
entryRuleSubtraction
:
{ before(grammarAccess.getSubtractionRule()); }
	 ruleSubtraction
{ after(grammarAccess.getSubtractionRule()); } 
	 EOF 
;

// Rule Subtraction
ruleSubtraction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubtractionAccess().getGroup()); }
		(rule__Subtraction__Group__0)
		{ after(grammarAccess.getSubtractionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiplication
entryRuleMultiplication
:
{ before(grammarAccess.getMultiplicationRule()); }
	 ruleMultiplication
{ after(grammarAccess.getMultiplicationRule()); } 
	 EOF 
;

// Rule Multiplication
ruleMultiplication 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiplicationAccess().getGroup()); }
		(rule__Multiplication__Group__0)
		{ after(grammarAccess.getMultiplicationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDivision
entryRuleDivision
:
{ before(grammarAccess.getDivisionRule()); }
	 ruleDivision
{ after(grammarAccess.getDivisionRule()); } 
	 EOF 
;

// Rule Division
ruleDivision 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDivisionAccess().getGroup()); }
		(rule__Division__Group__0)
		{ after(grammarAccess.getDivisionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimitive
entryRulePrimitive
:
{ before(grammarAccess.getPrimitiveRule()); }
	 rulePrimitive
{ after(grammarAccess.getPrimitiveRule()); } 
	 EOF 
;

// Rule Primitive
rulePrimitive 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimitiveAccess().getAlternatives()); }
		(rule__Primitive__Alternatives)
		{ after(grammarAccess.getPrimitiveAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRawInteger
entryRuleRawInteger
:
{ before(grammarAccess.getRawIntegerRule()); }
	 ruleRawInteger
{ after(grammarAccess.getRawIntegerRule()); } 
	 EOF 
;

// Rule RawInteger
ruleRawInteger 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRawIntegerAccess().getValueAssignment()); }
		(rule__RawInteger__ValueAssignment)
		{ after(grammarAccess.getRawIntegerAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRawVariable
entryRuleRawVariable
:
{ before(grammarAccess.getRawVariableRule()); }
	 ruleRawVariable
{ after(grammarAccess.getRawVariableRule()); } 
	 EOF 
;

// Rule RawVariable
ruleRawVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRawVariableAccess().getValueAssignment()); }
		(rule__RawVariable__ValueAssignment)
		{ after(grammarAccess.getRawVariableAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getRawIntegerParserRuleCall_0()); }
		ruleRawInteger
		{ after(grammarAccess.getPrimitiveAccess().getRawIntegerParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getGroup_1()); }
		(rule__Primitive__Group_1__0)
		{ after(grammarAccess.getPrimitiveAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getRawVariableParserRuleCall_2()); }
		ruleRawVariable
		{ after(grammarAccess.getPrimitiveAccess().getRawVariableParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AllExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AllExp__Group__0__Impl
	rule__AllExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AllExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAllExpAccess().getNameKeyword_0()); }
	'name'
	{ after(grammarAccess.getAllExpAccess().getNameKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AllExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AllExp__Group__1__Impl
	rule__AllExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AllExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAllExpAccess().getNameAssignment_1()); }
	(rule__AllExp__NameAssignment_1)
	{ after(grammarAccess.getAllExpAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AllExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AllExp__Group__2__Impl
	rule__AllExp__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AllExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAllExpAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getAllExpAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AllExp__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AllExp__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AllExp__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getAllExpAccess().getExpsAssignment_3()); }
		(rule__AllExp__ExpsAssignment_3)
		{ after(grammarAccess.getAllExpAccess().getExpsAssignment_3()); }
	)
	(
		{ before(grammarAccess.getAllExpAccess().getExpsAssignment_3()); }
		(rule__AllExp__ExpsAssignment_3)*
		{ after(grammarAccess.getAllExpAccess().getExpsAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__0__Impl
	rule__MathExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getNameAssignment_0()); }
	(rule__MathExp__NameAssignment_0)
	{ after(grammarAccess.getMathExpAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__1__Impl
	rule__MathExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getExpAssignment_2()); }
	(rule__MathExp__ExpAssignment_2)
	{ after(grammarAccess.getMathExpAccess().getExpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Addition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group__0__Impl
	rule__Addition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getSubtractionParserRuleCall_0()); }
	ruleSubtraction
	{ after(grammarAccess.getAdditionAccess().getSubtractionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getGroup_1()); }
	(rule__Addition__Group_1__0)*
	{ after(grammarAccess.getAdditionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Addition__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1__0__Impl
	rule__Addition__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1__1__Impl
	rule__Addition__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); }
	'+'
	{ after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); }
	(rule__Addition__RightAssignment_1_2)
	{ after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Subtraction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subtraction__Group__0__Impl
	rule__Subtraction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Subtraction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubtractionAccess().getMultiplicationParserRuleCall_0()); }
	ruleMultiplication
	{ after(grammarAccess.getSubtractionAccess().getMultiplicationParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subtraction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subtraction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Subtraction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubtractionAccess().getGroup_1()); }
	(rule__Subtraction__Group_1__0)*
	{ after(grammarAccess.getSubtractionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Subtraction__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subtraction__Group_1__0__Impl
	rule__Subtraction__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Subtraction__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); }
	()
	{ after(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subtraction__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subtraction__Group_1__1__Impl
	rule__Subtraction__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Subtraction__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); }
	'-'
	{ after(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subtraction__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subtraction__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Subtraction__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); }
	(rule__Subtraction__RightAssignment_1_2)
	{ after(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group__0__Impl
	rule__Multiplication__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); }
	ruleDivision
	{ after(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getGroup_1()); }
	(rule__Multiplication__Group_1__0)*
	{ after(grammarAccess.getMultiplicationAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1__0__Impl
	rule__Multiplication__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1__1__Impl
	rule__Multiplication__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); }
	'*'
	{ after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); }
	(rule__Multiplication__RightAssignment_1_2)
	{ after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Division__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Division__Group__0__Impl
	rule__Division__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Division__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDivisionAccess().getPrimitiveParserRuleCall_0()); }
	rulePrimitive
	{ after(grammarAccess.getDivisionAccess().getPrimitiveParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Division__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Division__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Division__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDivisionAccess().getGroup_1()); }
	(rule__Division__Group_1__0)*
	{ after(grammarAccess.getDivisionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Division__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Division__Group_1__0__Impl
	rule__Division__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Division__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0()); }
	()
	{ after(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Division__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Division__Group_1__1__Impl
	rule__Division__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Division__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); }
	'/'
	{ after(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Division__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Division__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Division__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); }
	(rule__Division__RightAssignment_1_2)
	{ after(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primitive__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primitive__Group_1__0__Impl
	rule__Primitive__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_1_0()); }
	'('
	{ after(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primitive__Group_1__1__Impl
	rule__Primitive__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_1_1()); }
	ruleExpression
	{ after(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primitive__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_1_2()); }
	')'
	{ after(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AllExp__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAllExpAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAllExpAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AllExp__ExpsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAllExpAccess().getExpsMathExpParserRuleCall_3_0()); }
		ruleMathExp
		{ after(grammarAccess.getAllExpAccess().getExpsMathExpParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__ExpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getExpExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getMathExpAccess().getExpExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditionAccess().getRightSubtractionParserRuleCall_1_2_0()); }
		ruleSubtraction
		{ after(grammarAccess.getAdditionAccess().getRightSubtractionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subtraction__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubtractionAccess().getRightMultiplicationParserRuleCall_1_2_0()); }
		ruleMultiplication
		{ after(grammarAccess.getSubtractionAccess().getRightMultiplicationParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); }
		ruleDivision
		{ after(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Division__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDivisionAccess().getRightPrimitiveParserRuleCall_1_2_0()); }
		rulePrimitive
		{ after(grammarAccess.getDivisionAccess().getRightPrimitiveParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RawInteger__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRawIntegerAccess().getValueINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getRawIntegerAccess().getValueINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RawVariable__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRawVariableAccess().getValueMathExpCrossReference_0()); }
		(
			{ before(grammarAccess.getRawVariableAccess().getValueMathExpIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRawVariableAccess().getValueMathExpIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getRawVariableAccess().getValueMathExpCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
