/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents.impl;

import com.sysma.goat.eclipse_plugin.goatComponents.Expression;
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessBlock;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessIf;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessStatement;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessThenBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.ProcessIfImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.ProcessIfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.ProcessIfImpl#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessIfImpl extends ProcessStatementImpl implements ProcessIf
{
  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected EList<ProcessStatement> action;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected EList<ProcessBlock> then;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected EList<Expression> cond;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessIfImpl()
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
    return GoatComponentsPackage.Literals.PROCESS_IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessStatement> getAction()
  {
    if (action == null)
    {
      action = new EObjectContainmentEList<ProcessStatement>(ProcessStatement.class, this, GoatComponentsPackage.PROCESS_IF__ACTION);
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessBlock> getThen()
  {
    if (then == null)
    {
      then = new EObjectContainmentEList<ProcessBlock>(ProcessBlock.class, this, GoatComponentsPackage.PROCESS_IF__THEN);
    }
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getCond()
  {
    if (cond == null)
    {
      cond = new EObjectContainmentEList<Expression>(Expression.class, this, GoatComponentsPackage.PROCESS_IF__COND);
    }
    return cond;
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
      case GoatComponentsPackage.PROCESS_IF__ACTION:
        return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
      case GoatComponentsPackage.PROCESS_IF__THEN:
        return ((InternalEList<?>)getThen()).basicRemove(otherEnd, msgs);
      case GoatComponentsPackage.PROCESS_IF__COND:
        return ((InternalEList<?>)getCond()).basicRemove(otherEnd, msgs);
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
      case GoatComponentsPackage.PROCESS_IF__ACTION:
        return getAction();
      case GoatComponentsPackage.PROCESS_IF__THEN:
        return getThen();
      case GoatComponentsPackage.PROCESS_IF__COND:
        return getCond();
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
      case GoatComponentsPackage.PROCESS_IF__ACTION:
        getAction().clear();
        getAction().addAll((Collection<? extends ProcessStatement>)newValue);
        return;
      case GoatComponentsPackage.PROCESS_IF__THEN:
        getThen().clear();
        getThen().addAll((Collection<? extends ProcessBlock>)newValue);
        return;
      case GoatComponentsPackage.PROCESS_IF__COND:
        getCond().clear();
        getCond().addAll((Collection<? extends Expression>)newValue);
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
      case GoatComponentsPackage.PROCESS_IF__ACTION:
        getAction().clear();
        return;
      case GoatComponentsPackage.PROCESS_IF__THEN:
        getThen().clear();
        return;
      case GoatComponentsPackage.PROCESS_IF__COND:
        getCond().clear();
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
      case GoatComponentsPackage.PROCESS_IF__ACTION:
        return action != null && !action.isEmpty();
      case GoatComponentsPackage.PROCESS_IF__THEN:
        return then != null && !then.isEmpty();
      case GoatComponentsPackage.PROCESS_IF__COND:
        return cond != null && !cond.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ProcessThenBlock.class)
    {
      switch (derivedFeatureID)
      {
        case GoatComponentsPackage.PROCESS_IF__ACTION: return GoatComponentsPackage.PROCESS_THEN_BLOCK__ACTION;
        case GoatComponentsPackage.PROCESS_IF__THEN: return GoatComponentsPackage.PROCESS_THEN_BLOCK__THEN;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ProcessThenBlock.class)
    {
      switch (baseFeatureID)
      {
        case GoatComponentsPackage.PROCESS_THEN_BLOCK__ACTION: return GoatComponentsPackage.PROCESS_IF__ACTION;
        case GoatComponentsPackage.PROCESS_THEN_BLOCK__THEN: return GoatComponentsPackage.PROCESS_IF__THEN;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ProcessIfImpl
