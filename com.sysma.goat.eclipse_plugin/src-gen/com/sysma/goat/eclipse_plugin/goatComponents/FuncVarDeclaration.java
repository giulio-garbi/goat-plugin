/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncVarDeclaration#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getFuncVarDeclaration()
 * @model
 * @generated
 */
public interface FuncVarDeclaration extends FuncStatement, FuncVarParam
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(FuncVal)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getFuncVarDeclaration_Val()
   * @model containment="true"
   * @generated
   */
  FuncVal getVal();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncVarDeclaration#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(FuncVal value);

} // FuncVarDeclaration
