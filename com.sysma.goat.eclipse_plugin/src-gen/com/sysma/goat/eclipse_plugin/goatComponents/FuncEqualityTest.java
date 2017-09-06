/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Equality Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncEqualityTest#getOp1 <em>Op1</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncEqualityTest#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncEqualityTest#getOp2 <em>Op2</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getFuncEqualityTest()
 * @model
 * @generated
 */
public interface FuncEqualityTest extends FuncPred
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
   * @see #setOp1(FuncVal)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getFuncEqualityTest_Op1()
   * @model containment="true"
   * @generated
   */
  FuncVal getOp1();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncEqualityTest#getOp1 <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op1</em>' containment reference.
   * @see #getOp1()
   * @generated
   */
  void setOp1(FuncVal value);

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
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getFuncEqualityTest_Operand()
   * @model
   * @generated
   */
  String getOperand();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncEqualityTest#getOperand <em>Operand</em>}' attribute.
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
   * @see #setOp2(FuncVal)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getFuncEqualityTest_Op2()
   * @model containment="true"
   * @generated
   */
  FuncVal getOp2();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncEqualityTest#getOp2 <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' containment reference.
   * @see #getOp2()
   * @generated
   */
  void setOp2(FuncVal value);

} // FuncEqualityTest
