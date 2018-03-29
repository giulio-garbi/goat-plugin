/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDP Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.PDPBlock#getProcs <em>Procs</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getPDPBlock()
 * @model
 * @generated
 */
public interface PDPBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Procs</b></em>' reference list.
   * The list contents are of type {@link com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procs</em>' reference list.
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getPDPBlock_Procs()
   * @model
   * @generated
   */
  EList<ProcessDefinition> getProcs();

} // PDPBlock
