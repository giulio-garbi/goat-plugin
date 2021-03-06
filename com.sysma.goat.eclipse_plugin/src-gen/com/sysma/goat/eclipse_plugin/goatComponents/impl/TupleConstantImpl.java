/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents.impl;

import com.sysma.goat.eclipse_plugin.goatComponents.Expression;
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage;
import com.sysma.goat.eclipse_plugin.goatComponents.TupleConstant;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuple Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.TupleConstantImpl#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TupleConstantImpl extends ExpressionImpl implements TupleConstant
{
  /**
   * The cached value of the '{@link #getElem() <em>Elem</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem()
   * @generated
   * @ordered
   */
  protected EList<Expression> elem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TupleConstantImpl()
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
    return GoatComponentsPackage.Literals.TUPLE_CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getElem()
  {
    if (elem == null)
    {
      elem = new EObjectContainmentEList<Expression>(Expression.class, this, GoatComponentsPackage.TUPLE_CONSTANT__ELEM);
    }
    return elem;
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
      case GoatComponentsPackage.TUPLE_CONSTANT__ELEM:
        return ((InternalEList<?>)getElem()).basicRemove(otherEnd, msgs);
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
      case GoatComponentsPackage.TUPLE_CONSTANT__ELEM:
        return getElem();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoatComponentsPackage.TUPLE_CONSTANT__ELEM:
        getElem().clear();
        getElem().addAll((Collection<? extends Expression>)newValue);
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
      case GoatComponentsPackage.TUPLE_CONSTANT__ELEM:
        getElem().clear();
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
      case GoatComponentsPackage.TUPLE_CONSTANT__ELEM:
        return elem != null && !elem.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TupleConstantImpl
