/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.mathDsl.Addition;
import org.xtext.example.mydsl.mathDsl.AllExp;
import org.xtext.example.mydsl.mathDsl.Division;
import org.xtext.example.mydsl.mathDsl.MathDslPackage;
import org.xtext.example.mydsl.mathDsl.MathExp;
import org.xtext.example.mydsl.mathDsl.Multiplication;
import org.xtext.example.mydsl.mathDsl.RawInteger;
import org.xtext.example.mydsl.mathDsl.RawVariable;
import org.xtext.example.mydsl.mathDsl.Subtraction;
import org.xtext.example.mydsl.services.MathDslGrammarAccess;

@SuppressWarnings("all")
public class MathDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathDslPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case MathDslPackage.ALL_EXP:
				sequence_AllExp(context, (AllExp) semanticObject); 
				return; 
			case MathDslPackage.DIVISION:
				sequence_Division(context, (Division) semanticObject); 
				return; 
			case MathDslPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MathDslPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case MathDslPackage.RAW_INTEGER:
				sequence_RawInteger(context, (RawInteger) semanticObject); 
				return; 
			case MathDslPackage.RAW_VARIABLE:
				sequence_RawVariable(context, (RawVariable) semanticObject); 
				return; 
			case MathDslPackage.SUBTRACTION:
				sequence_Subtraction(context, (Subtraction) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns Addition
	 *     Addition returns Addition
	 *     Addition.Addition_1_0 returns Addition
	 *     Subtraction returns Addition
	 *     Subtraction.Subtraction_1_0 returns Addition
	 *     Multiplication returns Addition
	 *     Multiplication.Multiplication_1_0 returns Addition
	 *     Division returns Addition
	 *     Division.Division_1_0 returns Addition
	 *     Primitive returns Addition
	 *
	 * Constraint:
	 *     (left=Addition_Addition_1_0 right=Subtraction)
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.ADDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.ADDITION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.ADDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.ADDITION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightSubtractionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AllExp returns AllExp
	 *
	 * Constraint:
	 *     (name=ID exps+=MathExp+)
	 */
	protected void sequence_AllExp(ISerializationContext context, AllExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Division
	 *     Addition returns Division
	 *     Addition.Addition_1_0 returns Division
	 *     Subtraction returns Division
	 *     Subtraction.Subtraction_1_0 returns Division
	 *     Multiplication returns Division
	 *     Multiplication.Multiplication_1_0 returns Division
	 *     Division returns Division
	 *     Division.Division_1_0 returns Division
	 *     Primitive returns Division
	 *
	 * Constraint:
	 *     (left=Division_Division_1_0 right=Primitive)
	 */
	protected void sequence_Division(ISerializationContext context, Division semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.DIVISION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.DIVISION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDivisionAccess().getRightPrimitiveParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     (name=ID exp=Expression)
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.MATH_EXP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.MATH_EXP__NAME));
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.MATH_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.MATH_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMathExpAccess().getExpExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Multiplication
	 *     Addition returns Multiplication
	 *     Addition.Addition_1_0 returns Multiplication
	 *     Subtraction returns Multiplication
	 *     Subtraction.Subtraction_1_0 returns Multiplication
	 *     Multiplication returns Multiplication
	 *     Multiplication.Multiplication_1_0 returns Multiplication
	 *     Division returns Multiplication
	 *     Division.Division_1_0 returns Multiplication
	 *     Primitive returns Multiplication
	 *
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 right=Division)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.MULTIPLICATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.MULTIPLICATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns RawInteger
	 *     Addition returns RawInteger
	 *     Addition.Addition_1_0 returns RawInteger
	 *     Subtraction returns RawInteger
	 *     Subtraction.Subtraction_1_0 returns RawInteger
	 *     Multiplication returns RawInteger
	 *     Multiplication.Multiplication_1_0 returns RawInteger
	 *     Division returns RawInteger
	 *     Division.Division_1_0 returns RawInteger
	 *     Primitive returns RawInteger
	 *     RawInteger returns RawInteger
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_RawInteger(ISerializationContext context, RawInteger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.RAW_INTEGER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.RAW_INTEGER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRawIntegerAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns RawVariable
	 *     Addition returns RawVariable
	 *     Addition.Addition_1_0 returns RawVariable
	 *     Subtraction returns RawVariable
	 *     Subtraction.Subtraction_1_0 returns RawVariable
	 *     Multiplication returns RawVariable
	 *     Multiplication.Multiplication_1_0 returns RawVariable
	 *     Division returns RawVariable
	 *     Division.Division_1_0 returns RawVariable
	 *     Primitive returns RawVariable
	 *     RawVariable returns RawVariable
	 *
	 * Constraint:
	 *     value=[MathExp|ID]
	 */
	protected void sequence_RawVariable(ISerializationContext context, RawVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.RAW_VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.RAW_VARIABLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRawVariableAccess().getValueMathExpIDTerminalRuleCall_0_1(), semanticObject.eGet(MathDslPackage.Literals.RAW_VARIABLE__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Subtraction
	 *     Addition returns Subtraction
	 *     Addition.Addition_1_0 returns Subtraction
	 *     Subtraction returns Subtraction
	 *     Subtraction.Subtraction_1_0 returns Subtraction
	 *     Multiplication returns Subtraction
	 *     Multiplication.Multiplication_1_0 returns Subtraction
	 *     Division returns Subtraction
	 *     Division.Division_1_0 returns Subtraction
	 *     Primitive returns Subtraction
	 *
	 * Constraint:
	 *     (left=Subtraction_Subtraction_1_0 right=Multiplication)
	 */
	protected void sequence_Subtraction(ISerializationContext context, Subtraction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.SUBTRACTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.SUBTRACTION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathDslPackage.Literals.SUBTRACTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathDslPackage.Literals.SUBTRACTION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubtractionAccess().getRightMultiplicationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
}