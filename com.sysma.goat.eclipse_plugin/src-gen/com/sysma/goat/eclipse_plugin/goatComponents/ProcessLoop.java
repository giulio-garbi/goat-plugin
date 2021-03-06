/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.ProcessLoop#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getProcessLoop()
 * @model
 * @generated
 */
public interface ProcessLoop extends ProcessStatement
{
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
   * @see com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage#getProcessLoop_Block()
   * @model containment="true"
   * @generated
   */
  ProcessBlock getBlock();

  /**
   * Sets the value of the '{@link com.sysma.goat.eclipse_plugin.goatComponents.ProcessLoop#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(ProcessBlock value);

} // ProcessLoop
