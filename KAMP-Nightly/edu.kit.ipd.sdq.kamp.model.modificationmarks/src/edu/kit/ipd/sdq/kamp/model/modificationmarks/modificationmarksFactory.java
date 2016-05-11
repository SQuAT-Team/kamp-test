/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage
 * @generated
 */
public interface modificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	modificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.modificationmarksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modification Repository</em>'.
	 * @generated
	 */
	ModificationRepository createModificationRepository();

	/**
	 * Returns a new object of class '<em>Modify Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Component</em>'.
	 * @generated
	 */
	ModifyComponent createModifyComponent();

	/**
	 * Returns a new object of class '<em>Modify Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Assembly Connector</em>'.
	 * @generated
	 */
	ModifyAssemblyConnector createModifyAssemblyConnector();

	/**
	 * Returns a new object of class '<em>Modify Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Datatype</em>'.
	 * @generated
	 */
	ModifyDatatype createModifyDatatype();

	/**
	 * Returns a new object of class '<em>Intercomponent Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intercomponent Propagation</em>'.
	 * @generated
	 */
	IntercomponentPropagation createIntercomponentPropagation();

	/**
	 * Returns a new object of class '<em>Intracomponent Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intracomponent Propagation</em>'.
	 * @generated
	 */
	IntracomponentPropagation createIntracomponentPropagation();

	/**
	 * Returns a new object of class '<em>Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seed Modifications</em>'.
	 * @generated
	 */
	SeedModifications createSeedModifications();

	/**
	 * Returns a new object of class '<em>Modify Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Provided Role</em>'.
	 * @generated
	 */
	ModifyProvidedRole createModifyProvidedRole();

	/**
	 * Returns a new object of class '<em>Modify Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Required Role</em>'.
	 * @generated
	 */
	ModifyRequiredRole createModifyRequiredRole();

	/**
	 * Returns a new object of class '<em>Change Propagation Due To Data Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Propagation Due To Data Dependencies</em>'.
	 * @generated
	 */
	ChangePropagationDueToDataDependencies createChangePropagationDueToDataDependencies();

	/**
	 * Returns a new object of class '<em>Modify Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Interface</em>'.
	 * @generated
	 */
	ModifyInterface createModifyInterface();

	/**
	 * Returns a new object of class '<em>Modify Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Signature</em>'.
	 * @generated
	 */
	ModifySignature createModifySignature();

	/**
	 * Returns a new object of class '<em>Change Propagation Due To Interface Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Propagation Due To Interface Dependencies</em>'.
	 * @generated
	 */
	ChangePropagationDueToInterfaceDependencies createChangePropagationDueToInterfaceDependencies();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	modificationmarksPackage getmodificationmarksPackage();

} //modificationmarksFactory
