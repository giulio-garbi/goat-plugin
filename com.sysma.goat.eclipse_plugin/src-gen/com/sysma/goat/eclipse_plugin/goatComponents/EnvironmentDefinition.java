/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentDefinition#getName <em>Name</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentDefinition#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEnvironmentDefinition()
 * @model
 * @generated
 */
public interface EnvironmentDefinition extends EObject
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
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEnvironmentDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Env</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Env</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Env</em>' containment reference.
   * @see #setEnv(Environment)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEnvironmentDefinition_Env()
   * @model containment="true"
   * @generated
   */
  Environment getEnv();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentDefinition#getEnv <em>Env</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Env</em>' containment reference.
   * @see #getEnv()
   * @generated
   */
  void setEnv(Environment value);

} // EnvironmentDefinition
