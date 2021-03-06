/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ProcessCall#getProc <em>Proc</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getProcessCall()
 * @model
 * @generated
 */
public interface ProcessCall extends ProcessStatement
{
  /**
   * Returns the value of the '<em><b>Proc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc</em>' reference.
   * @see #setProc(ProcessDefinition)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getProcessCall_Proc()
   * @model
   * @generated
   */
  ProcessDefinition getProc();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.ProcessCall#getProc <em>Proc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc</em>' reference.
   * @see #getProc()
   * @generated
   */
  void setProc(ProcessDefinition value);

} // ProcessCall
