/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.goatInfrastructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.GoatInfrastructureFactory
 * @model kind="package"
 * @generated
 */
public interface GoatInfrastructurePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "goatInfrastructure";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sysma.com/goat/eclipse_plugin/GoatInfrastructure";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "goatInfrastructure";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GoatInfrastructurePackage eINSTANCE = com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.GoatInfrastructurePackageImpl.init();

  /**
   * The meta object id for the '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.InfrastructureImpl
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.GoatInfrastructurePackageImpl#getInfrastructure()
   * @generated
   */
  int INFRASTRUCTURE = 0;

  /**
   * The number of structural features of the '<em>Infrastructure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.SingleServerImpl <em>Single Server</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.SingleServerImpl
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.GoatInfrastructurePackageImpl#getSingleServer()
   * @generated
   */
  int SINGLE_SERVER = 1;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SERVER__EXTERNAL = INFRASTRUCTURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SERVER__PARAMS = INFRASTRUCTURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Single Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SERVER_FEATURE_COUNT = INFRASTRUCTURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.ParamsImpl <em>Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.ParamsImpl
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.GoatInfrastructurePackageImpl#getParams()
   * @generated
   */
  int PARAMS = 2;

  /**
   * The feature id for the '<em><b>Keys</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS__KEYS = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS__VALUES = 1;

  /**
   * The number of structural features of the '<em>Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.Infrastructure <em>Infrastructure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infrastructure</em>'.
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.Infrastructure
   * @generated
   */
  EClass getInfrastructure();

  /**
   * Returns the meta object for class '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer <em>Single Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Server</em>'.
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer
   * @generated
   */
  EClass getSingleServer();

  /**
   * Returns the meta object for the attribute '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer#isExternal <em>External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External</em>'.
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer#isExternal()
   * @see #getSingleServer()
   * @generated
   */
  EAttribute getSingleServer_External();

  /**
   * Returns the meta object for the containment reference '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer#getParams()
   * @see #getSingleServer()
   * @generated
   */
  EReference getSingleServer_Params();

  /**
   * Returns the meta object for class '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.Params <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Params</em>'.
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.Params
   * @generated
   */
  EClass getParams();

  /**
   * Returns the meta object for the attribute list '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.Params#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Keys</em>'.
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.Params#getKeys()
   * @see #getParams()
   * @generated
   */
  EAttribute getParams_Keys();

  /**
   * Returns the meta object for the attribute list '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.Params#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.Params#getValues()
   * @see #getParams()
   * @generated
   */
  EAttribute getParams_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GoatInfrastructureFactory getGoatInfrastructureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.InfrastructureImpl
     * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.GoatInfrastructurePackageImpl#getInfrastructure()
     * @generated
     */
    EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

    /**
     * The meta object literal for the '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.SingleServerImpl <em>Single Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.SingleServerImpl
     * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.GoatInfrastructurePackageImpl#getSingleServer()
     * @generated
     */
    EClass SINGLE_SERVER = eINSTANCE.getSingleServer();

    /**
     * The meta object literal for the '<em><b>External</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_SERVER__EXTERNAL = eINSTANCE.getSingleServer_External();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_SERVER__PARAMS = eINSTANCE.getSingleServer_Params();

    /**
     * The meta object literal for the '{@link com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.ParamsImpl <em>Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.ParamsImpl
     * @see com.sysma.goat.eclipse_plugin.goatInfrastructure.impl.GoatInfrastructurePackageImpl#getParams()
     * @generated
     */
    EClass PARAMS = eINSTANCE.getParams();

    /**
     * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMS__KEYS = eINSTANCE.getParams_Keys();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMS__VALUES = eINSTANCE.getParams_Values();

  }

} //GoatInfrastructurePackage
