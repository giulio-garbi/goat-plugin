/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest#getOp1 <em>Op1</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest#getOp2 <em>Op2</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEqualityTest()
 * @model
 * @generated
 */
public interface EqualityTest extends Pred
{
  /**
   * Returns the value of the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op1</em>' containment reference.
   * @see #setOp1(EObject)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEqualityTest_Op1()
   * @model containment="true"
   * @generated
   */
  EObject getOp1();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest#getOp1 <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op1</em>' containment reference.
   * @see #getOp1()
   * @generated
   */
  void setOp1(EObject value);

  /**
   * Returns the value of the '<em><b>Operand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' attribute.
   * @see #setOperand(String)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEqualityTest_Operand()
   * @model
   * @generated
   */
  String getOperand();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest#getOperand <em>Operand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' attribute.
   * @see #getOperand()
   * @generated
   */
  void setOperand(String value);

  /**
   * Returns the value of the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' containment reference.
   * @see #setOp2(Value)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEqualityTest_Op2()
   * @model containment="true"
   * @generated
   */
  Value getOp2();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest#getOp2 <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' containment reference.
   * @see #getOp2()
   * @generated
   */
  void setOp2(Value value);

} // EqualityTest
