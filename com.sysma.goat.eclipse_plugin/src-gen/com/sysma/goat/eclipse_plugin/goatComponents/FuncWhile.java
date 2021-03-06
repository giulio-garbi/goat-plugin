/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncWhile#getCond <em>Cond</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncWhile#getCycle <em>Cycle</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getFuncWhile()
 * @model
 * @generated
 */
public interface FuncWhile extends FuncStatement
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expression)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getFuncWhile_Cond()
   * @model containment="true"
   * @generated
   */
  Expression getCond();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncWhile#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expression value);

  /**
   * Returns the value of the '<em><b>Cycle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cycle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cycle</em>' containment reference.
   * @see #setCycle(FuncBlock)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getFuncWhile_Cycle()
   * @model containment="true"
   * @generated
   */
  FuncBlock getCycle();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.FuncWhile#getCycle <em>Cycle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cycle</em>' containment reference.
   * @see #getCycle()
   * @generated
   */
  void setCycle(FuncBlock value);

} // FuncWhile
