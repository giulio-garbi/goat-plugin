/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ReceiveCase#getCond <em>Cond</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ReceiveCase#getMsgInParts <em>Msg In Parts</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ReceiveCase#getUpdates <em>Updates</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ReceiveCase#getSpawn <em>Spawn</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ReceiveCase#getPrint <em>Print</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getReceiveCase()
 * @model
 * @generated
 */
public interface ReceiveCase extends EObject
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
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getReceiveCase_Cond()
   * @model containment="true"
   * @generated
   */
  Expression getCond();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.ReceiveCase#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expression value);

  /**
   * Returns the value of the '<em><b>Msg In Parts</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg In Parts</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg In Parts</em>' attribute list.
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getReceiveCase_MsgInParts()
   * @model unique="false"
   * @generated
   */
  EList<String> getMsgInParts();

  /**
   * Returns the value of the '<em><b>Updates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updates</em>' containment reference.
   * @see #setUpdates(Update)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getReceiveCase_Updates()
   * @model containment="true"
   * @generated
   */
  Update getUpdates();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.ReceiveCase#getUpdates <em>Updates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updates</em>' containment reference.
   * @see #getUpdates()
   * @generated
   */
  void setUpdates(Update value);

  /**
   * Returns the value of the '<em><b>Spawn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spawn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spawn</em>' containment reference.
   * @see #setSpawn(ProcessSpawn)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getReceiveCase_Spawn()
   * @model containment="true"
   * @generated
   */
  ProcessSpawn getSpawn();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.ReceiveCase#getSpawn <em>Spawn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spawn</em>' containment reference.
   * @see #getSpawn()
   * @generated
   */
  void setSpawn(ProcessSpawn value);

  /**
   * Returns the value of the '<em><b>Print</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Print</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Print</em>' containment reference.
   * @see #setPrint(PrintStatement)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getReceiveCase_Print()
   * @model containment="true"
   * @generated
   */
  PrintStatement getPrint();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.ReceiveCase#getPrint <em>Print</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Print</em>' containment reference.
   * @see #getPrint()
   * @generated
   */
  void setPrint(PrintStatement value);

} // ReceiveCase
