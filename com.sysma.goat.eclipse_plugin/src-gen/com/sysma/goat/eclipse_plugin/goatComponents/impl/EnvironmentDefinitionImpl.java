/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents.impl;

import com.sysma.goat.eclipse_plugin.goatComponents.EnvParam;
import com.sysma.goat.eclipse_plugin.goatComponents.Environment;
import com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.EnvironmentDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.EnvironmentDefinitionImpl#getEnvParams <em>Env Params</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.EnvironmentDefinitionImpl#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentDefinitionImpl extends MinimalEObjectImpl.Container implements EnvironmentDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnvParams() <em>Env Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvParams()
   * @generated
   * @ordered
   */
  protected EList<EnvParam> envParams;

  /**
   * The cached value of the '{@link #getEnv() <em>Env</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnv()
   * @generated
   * @ordered
   */
  protected Environment env;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentDefinitionImpl()
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
    return GoatComponentsPackage.Literals.ENVIRONMENT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.ENVIRONMENT_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnvParam> getEnvParams()
  {
    if (envParams == null)
    {
      envParams = new EObjectContainmentEList<EnvParam>(EnvParam.class, this, GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV_PARAMS);
    }
    return envParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment getEnv()
  {
    return env;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnv(Environment newEnv, NotificationChain msgs)
  {
    Environment oldEnv = env;
    env = newEnv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV, oldEnv, newEnv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnv(Environment newEnv)
  {
    if (newEnv != env)
    {
      NotificationChain msgs = null;
      if (env != null)
        msgs = ((InternalEObject)env).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV, null, msgs);
      if (newEnv != null)
        msgs = ((InternalEObject)newEnv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV, null, msgs);
      msgs = basicSetEnv(newEnv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV, newEnv, newEnv));
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
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV_PARAMS:
        return ((InternalEList<?>)getEnvParams()).basicRemove(otherEnd, msgs);
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV:
        return basicSetEnv(null, msgs);
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
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__NAME:
        return getName();
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV_PARAMS:
        return getEnvParams();
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV:
        return getEnv();
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
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV_PARAMS:
        getEnvParams().clear();
        getEnvParams().addAll((Collection<? extends EnvParam>)newValue);
        return;
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV:
        setEnv((Environment)newValue);
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
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV_PARAMS:
        getEnvParams().clear();
        return;
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV:
        setEnv((Environment)null);
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
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV_PARAMS:
        return envParams != null && !envParams.isEmpty();
      case GoatComponentsPackage.ENVIRONMENT_DEFINITION__ENV:
        return env != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EnvironmentDefinitionImpl
