/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Process Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.OutputProcessPart#getMsgOutParts <em>Msg Out Parts</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.OutputProcessPart#getSend_pred <em>Send pred</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.OutputProcessPart#getOutput <em>Output</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.OutputProcessPart#getMsec <em>Msec</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.OutputProcessPart#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getOutputProcessPart()
 * @model
 * @generated
 */
public interface OutputProcessPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Msg Out Parts</b></em>' containment reference list.
   * The list contents are of type {@link com.sysma.goat.eclipse_plugin.goatComponents.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg Out Parts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg Out Parts</em>' containment reference list.
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getOutputProcessPart_MsgOutParts()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getMsgOutParts();

  /**
   * Returns the value of the '<em><b>Send pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Send pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Send pred</em>' containment reference.
   * @see #setSend_pred(Expression)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getOutputProcessPart_Send_pred()
   * @model containment="true"
   * @generated
   */
  Expression getSend_pred();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.OutputProcessPart#getSend_pred <em>Send pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Send pred</em>' containment reference.
   * @see #getSend_pred()
   * @generated
   */
  void setSend_pred(Expression value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute.
   * @see #setOutput(String)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getOutputProcessPart_Output()
   * @model
   * @generated
   */
  String getOutput();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.OutputProcessPart#getOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #getOutput()
   * @generated
   */
  void setOutput(String value);

  /**
   * Returns the value of the '<em><b>Msec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msec</em>' attribute.
   * @see #setMsec(int)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getOutputProcessPart_Msec()
   * @model
   * @generated
   */
  int getMsec();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.OutputProcessPart#getMsec <em>Msec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msec</em>' attribute.
   * @see #getMsec()
   * @generated
   */
  void setMsec(int value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(com.sysma.goat.eclipse_plugin.goatComponents.Process)
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getOutputProcessPart_Next()
   * @model containment="true"
   * @generated
   */
  com.sysma.goat.eclipse_plugin.goatComponents.Process getNext();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.OutputProcessPart#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(com.sysma.goat.eclipse_plugin.goatComponents.Process value);

} // OutputProcessPart
