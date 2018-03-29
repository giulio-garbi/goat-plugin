/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatComponents.impl;

import com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.Environment;
import com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.ComponentDefinitionImpl#getEnvref <em>Envref</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.ComponentDefinitionImpl#getEnvargs <em>Envargs</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.ComponentDefinitionImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link com.sysma.goat.eclipse_plugin.goatComponents.impl.ComponentDefinitionImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefinitionImpl extends MinimalEObjectImpl.Container implements ComponentDefinition
{
  /**
   * The cached value of the '{@link #getEnvref() <em>Envref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvref()
   * @generated
   * @ordered
   */
  protected EnvironmentDefinition envref;

  /**
   * The cached value of the '{@link #getEnvargs() <em>Envargs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvargs()
   * @generated
   * @ordered
   */
  protected EList<Expression> envargs;

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
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected EObject block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentDefinitionImpl()
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
    return GoatComponentsPackage.Literals.COMPONENT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentDefinition getEnvref()
  {
    if (envref != null && envref.eIsProxy())
    {
      InternalEObject oldEnvref = (InternalEObject)envref;
      envref = (EnvironmentDefinition)eResolveProxy(oldEnvref);
      if (envref != oldEnvref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoatComponentsPackage.COMPONENT_DEFINITION__ENVREF, oldEnvref, envref));
      }
    }
    return envref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentDefinition basicGetEnvref()
  {
    return envref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnvref(EnvironmentDefinition newEnvref)
  {
    EnvironmentDefinition oldEnvref = envref;
    envref = newEnvref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.COMPONENT_DEFINITION__ENVREF, oldEnvref, envref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getEnvargs()
  {
    if (envargs == null)
    {
      envargs = new EObjectContainmentEList<Expression>(Expression.class, this, GoatComponentsPackage.COMPONENT_DEFINITION__ENVARGS);
    }
    return envargs;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.COMPONENT_DEFINITION__ENV, oldEnv, newEnv);
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
        msgs = ((InternalEObject)env).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.COMPONENT_DEFINITION__ENV, null, msgs);
      if (newEnv != null)
        msgs = ((InternalEObject)newEnv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.COMPONENT_DEFINITION__ENV, null, msgs);
      msgs = basicSetEnv(newEnv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.COMPONENT_DEFINITION__ENV, newEnv, newEnv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(EObject newBlock, NotificationChain msgs)
  {
    EObject oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.COMPONENT_DEFINITION__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(EObject newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.COMPONENT_DEFINITION__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoatComponentsPackage.COMPONENT_DEFINITION__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoatComponentsPackage.COMPONENT_DEFINITION__BLOCK, newBlock, newBlock));
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
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENVARGS:
        return ((InternalEList<?>)getEnvargs()).basicRemove(otherEnd, msgs);
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENV:
        return basicSetEnv(null, msgs);
      case GoatComponentsPackage.COMPONENT_DEFINITION__BLOCK:
        return basicSetBlock(null, msgs);
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
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENVREF:
        if (resolve) return getEnvref();
        return basicGetEnvref();
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENVARGS:
        return getEnvargs();
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENV:
        return getEnv();
      case GoatComponentsPackage.COMPONENT_DEFINITION__BLOCK:
        return getBlock();
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
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENVREF:
        setEnvref((EnvironmentDefinition)newValue);
        return;
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENVARGS:
        getEnvargs().clear();
        getEnvargs().addAll((Collection<? extends Expression>)newValue);
        return;
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENV:
        setEnv((Environment)newValue);
        return;
      case GoatComponentsPackage.COMPONENT_DEFINITION__BLOCK:
        setBlock((EObject)newValue);
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
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENVREF:
        setEnvref((EnvironmentDefinition)null);
        return;
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENVARGS:
        getEnvargs().clear();
        return;
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENV:
        setEnv((Environment)null);
        return;
      case GoatComponentsPackage.COMPONENT_DEFINITION__BLOCK:
        setBlock((EObject)null);
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
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENVREF:
        return envref != null;
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENVARGS:
        return envargs != null && !envargs.isEmpty();
      case GoatComponentsPackage.COMPONENT_DEFINITION__ENV:
        return env != null;
      case GoatComponentsPackage.COMPONENT_DEFINITION__BLOCK:
        return block != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentDefinitionImpl
