/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentArg#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEnvironmentArg()
 * @model
 * @generated
 */
public interface EnvironmentArg extends Expression
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' reference.
   * @see #setArg(EnvParam)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEnvironmentArg_Arg()
   * @model
   * @generated
   */
  EnvParam getArg();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentArg#getArg <em>Arg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' reference.
   * @see #getArg()
   * @generated
   */
  void setArg(EnvParam value);

} // EnvironmentArg
