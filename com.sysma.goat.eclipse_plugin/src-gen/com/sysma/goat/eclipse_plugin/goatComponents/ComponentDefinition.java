/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition#getEnvref <em>Envref</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition#getEnvargs <em>Envargs</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition#getEnv <em>Env</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getComponentDefinition()
 * @model
 * @generated
 */
public interface ComponentDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Envref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Envref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Envref</em>' reference.
   * @see #setEnvref(EnvironmentDefinition)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getComponentDefinition_Envref()
   * @model
   * @generated
   */
  EnvironmentDefinition getEnvref();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition#getEnvref <em>Envref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Envref</em>' reference.
   * @see #getEnvref()
   * @generated
   */
  void setEnvref(EnvironmentDefinition value);

  /**
   * Returns the value of the '<em><b>Envargs</b></em>' containment reference list.
   * The list contents are of type {@link com.sysma.goat.eclipse_plugin.goatComponents.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Envargs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Envargs</em>' containment reference list.
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getComponentDefinition_Envargs()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getEnvargs();

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
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getComponentDefinition_Env()
   * @model containment="true"
   * @generated
   */
  Environment getEnv();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition#getEnv <em>Env</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Env</em>' containment reference.
   * @see #getEnv()
   * @generated
   */
  void setEnv(Environment value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(ProcessBlock)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getComponentDefinition_Block()
   * @model containment="true"
   * @generated
   */
  ProcessBlock getBlock();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(ProcessBlock value);

} // ComponentDefinition
