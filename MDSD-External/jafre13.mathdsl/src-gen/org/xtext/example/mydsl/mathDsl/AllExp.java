/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.mathDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mathDsl.AllExp#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mathDsl.AllExp#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mathDsl.MathDslPackage#getAllExp()
 * @model
 * @generated
 */
public interface AllExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.mathDsl.MathDslPackage#getAllExp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mathDsl.AllExp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mathDsl.MathExp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exps</em>' containment reference list.
   * @see org.xtext.example.mydsl.mathDsl.MathDslPackage#getAllExp_Exps()
   * @model containment="true"
   * @generated
   */
  EList<MathExp> getExps();

} // AllExp
