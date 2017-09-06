/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.Environment#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.Environment#getVals <em>Vals</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject
{
  /**
   * Returns the value of the '<em><b>Attrs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' attribute list.
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEnvironment_Attrs()
   * @model unique="false"
   * @generated
   */
  EList<String> getAttrs();

  /**
   * Returns the value of the '<em><b>Vals</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' attribute list.
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getEnvironment_Vals()
   * @model unique="false"
   * @generated
   */
  EList<String> getVals();

} // Environment
