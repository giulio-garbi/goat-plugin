/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatInfrastructure.impl;

import com.sysma.goat.eclipse_plugin.goatInfrastructure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoatInfrastructureFactoryImpl extends EFactoryImpl implements GoatInfrastructureFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GoatInfrastructureFactory init()
  {
    try
    {
      GoatInfrastructureFactory theGoatInfrastructureFactory = (GoatInfrastructureFactory)EPackage.Registry.INSTANCE.getEFactory(GoatInfrastructurePackage.eNS_URI);
      if (theGoatInfrastructureFactory != null)
      {
        return theGoatInfrastructureFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GoatInfrastructureFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoatInfrastructureFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GoatInfrastructurePackage.INFRASTRUCTURE: return createInfrastructure();
      case GoatInfrastructurePackage.SINGLE_SERVER: return createSingleServer();
      case GoatInfrastructurePackage.CLUSTER: return createCluster();
      case GoatInfrastructurePackage.RING: return createRing();
      case GoatInfrastructurePackage.TREE: return createTree();
      case GoatInfrastructurePackage.PARAMS: return createParams();
      case GoatInfrastructurePackage.PARAM: return createParam();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Infrastructure createInfrastructure()
  {
    InfrastructureImpl infrastructure = new InfrastructureImpl();
    return infrastructure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleServer createSingleServer()
  {
    SingleServerImpl singleServer = new SingleServerImpl();
    return singleServer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cluster createCluster()
  {
    ClusterImpl cluster = new ClusterImpl();
    return cluster;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ring createRing()
  {
    RingImpl ring = new RingImpl();
    return ring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tree createTree()
  {
    TreeImpl tree = new TreeImpl();
    return tree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Params createParams()
  {
    ParamsImpl params = new ParamsImpl();
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoatInfrastructurePackage getGoatInfrastructurePackage()
  {
    return (GoatInfrastructurePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GoatInfrastructurePackage getPackage()
  {
    return GoatInfrastructurePackage.eINSTANCE;
  }

} //GoatInfrastructureFactoryImpl
