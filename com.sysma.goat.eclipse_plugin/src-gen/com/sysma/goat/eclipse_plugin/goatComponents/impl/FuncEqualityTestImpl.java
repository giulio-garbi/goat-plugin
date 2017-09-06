/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents.impl;

import com.sysma.goat.eclipse_plugin.goatComponents.FuncEqualityTest;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVal;
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Func Equality Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.FuncEqualityTestImpl#getOp1 <em>Op1</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.FuncEqualityTestImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.FuncEqualityTestImpl#getOp2 <em>Op2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncEqualityTestImpl extends FuncPredImpl implements FuncEqualityTest
{
  /**
   * The cached value of the '{@link #getOp1() <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp1()
   * @generated
   * @ordered
   */
  protected FuncVal op1;

  /**
   * The default value of the '{@link #getOperand() <em>Operand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
  protected static final String OPERAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperand() <em>Operand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
  protected String operand = OPERAND_EDEFAULT;

  /**
   * The cached value of the '{@link #getOp2() <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp2()
   * @generated
   * @ordered
   */
  protected FuncVal op2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FuncEqualityTestImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoatComponentsPackage.Literals.FUNC_EQUALITY_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncVal getOp1()
  {
    return op1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp1(FuncVal newOp1, NotificationChain msgs)
  {
    FuncVal oldOp1 = op1;
    op1 = newOp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.FUNC_EQUALITY_TEST__OP1, oldOp1, newOp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp1(FuncVal newOp1)
  {
    if (newOp1 != op1)
    {
      NotificationChain msgs = null;
      if (op1 != null)
        msgs = ((InternalEObject)op1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.FUNC_EQUALITY_TEST__OP1, null, msgs);
      if (newOp1 != null)
        msgs = ((InternalEObject)newOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.FUNC_EQUALITY_TEST__OP1, null, msgs);
      msgs = basicSetOp1(newOp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.FUNC_EQUALITY_TEST__OP1, newOp1, newOp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperand()
  {
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand(String newOperand)
  {
    String oldOperand = operand;
    operand = newOperand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.FUNC_EQUALITY_TEST__OPERAND, oldOperand, operand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncVal getOp2()
  {
    return op2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp2(FuncVal newOp2, NotificationChain msgs)
  {
    FuncVal oldOp2 = op2;
    op2 = newOp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.FUNC_EQUALITY_TEST__OP2, oldOp2, newOp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp2(FuncVal newOp2)
  {
    if (newOp2 != op2)
    {
      NotificationChain msgs = null;
      if (op2 != null)
        msgs = ((InternalEObject)op2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.FUNC_EQUALITY_TEST__OP2, null, msgs);
      if (newOp2 != null)
        msgs = ((InternalEObject)newOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.FUNC_EQUALITY_TEST__OP2, null, msgs);
      msgs = basicSetOp2(newOp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.FUNC_EQUALITY_TEST__OP2, newOp2, newOp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP1:
        return basicSetOp1(null, msgs);
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP2:
        return basicSetOp2(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP1:
        return getOp1();
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OPERAND:
        return getOperand();
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP2:
        return getOp2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP1:
        setOp1((FuncVal)newValue);
        return;
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OPERAND:
        setOperand((String)newValue);
        return;
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP2:
        setOp2((FuncVal)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP1:
        setOp1((FuncVal)null);
        return;
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OPERAND:
        setOperand(OPERAND_EDEFAULT);
        return;
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP2:
        setOp2((FuncVal)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP1:
        return op1 != null;
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OPERAND:
        return OPERAND_EDEFAULT == null ? operand != null : !OPERAND_EDEFAULT.equals(operand);
      case GoatComponentsPackage.FUNC_EQUALITY_TEST__OP2:
        return op2 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operand: ");
    result.append(operand);
    result.append(')');
    return result.toString();
  }

} //FuncEqualityTestImpl
