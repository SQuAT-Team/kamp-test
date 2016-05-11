/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage
 * @generated
 */
public class modificationmarksSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static modificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = modificationmarksPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case modificationmarksPackage.MODIFICATION_REPOSITORY: {
				ModificationRepository modificationRepository = (ModificationRepository)theEObject;
				T result = caseModificationRepository(modificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_COMPONENT: {
				ModifyComponent modifyComponent = (ModifyComponent)theEObject;
				T result = caseModifyComponent(modifyComponent);
				if (result == null) result = caseModification(modifyComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_ASSEMBLY_CONNECTOR: {
				ModifyAssemblyConnector modifyAssemblyConnector = (ModifyAssemblyConnector)theEObject;
				T result = caseModifyAssemblyConnector(modifyAssemblyConnector);
				if (result == null) result = caseModification(modifyAssemblyConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_DATATYPE: {
				ModifyDatatype modifyDatatype = (ModifyDatatype)theEObject;
				T result = caseModifyDatatype(modifyDatatype);
				if (result == null) result = caseModification(modifyDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFICATION: {
				Modification modification = (Modification)theEObject;
				T result = caseModification(modification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.INTERCOMPONENT_PROPAGATION: {
				IntercomponentPropagation intercomponentPropagation = (IntercomponentPropagation)theEObject;
				T result = caseIntercomponentPropagation(intercomponentPropagation);
				if (result == null) result = caseChangePropagationStep(intercomponentPropagation);
				if (result == null) result = caseModification(intercomponentPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.INTRACOMPONENT_PROPAGATION: {
				IntracomponentPropagation intracomponentPropagation = (IntracomponentPropagation)theEObject;
				T result = caseIntracomponentPropagation(intracomponentPropagation);
				if (result == null) result = caseChangePropagationStep(intracomponentPropagation);
				if (result == null) result = caseModification(intracomponentPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.SEED_MODIFICATIONS: {
				SeedModifications seedModifications = (SeedModifications)theEObject;
				T result = caseSeedModifications(seedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE: {
				ModifyProvidedRole modifyProvidedRole = (ModifyProvidedRole)theEObject;
				T result = caseModifyProvidedRole(modifyProvidedRole);
				if (result == null) result = caseModification(modifyProvidedRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_REQUIRED_ROLE: {
				ModifyRequiredRole modifyRequiredRole = (ModifyRequiredRole)theEObject;
				T result = caseModifyRequiredRole(modifyRequiredRole);
				if (result == null) result = caseModification(modifyRequiredRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.CHANGE_PROPAGATION_STEP: {
				ChangePropagationStep changePropagationStep = (ChangePropagationStep)theEObject;
				T result = caseChangePropagationStep(changePropagationStep);
				if (result == null) result = caseModification(changePropagationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES: {
				ChangePropagationDueToDataDependencies changePropagationDueToDataDependencies = (ChangePropagationDueToDataDependencies)theEObject;
				T result = caseChangePropagationDueToDataDependencies(changePropagationDueToDataDependencies);
				if (result == null) result = caseChangePropagationStep(changePropagationDueToDataDependencies);
				if (result == null) result = caseModification(changePropagationDueToDataDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_INTERFACE: {
				ModifyInterface modifyInterface = (ModifyInterface)theEObject;
				T result = caseModifyInterface(modifyInterface);
				if (result == null) result = caseModification(modifyInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_SIGNATURE: {
				ModifySignature modifySignature = (ModifySignature)theEObject;
				T result = caseModifySignature(modifySignature);
				if (result == null) result = caseModification(modifySignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES: {
				ChangePropagationDueToInterfaceDependencies changePropagationDueToInterfaceDependencies = (ChangePropagationDueToInterfaceDependencies)theEObject;
				T result = caseChangePropagationDueToInterfaceDependencies(changePropagationDueToInterfaceDependencies);
				if (result == null) result = caseChangePropagationStep(changePropagationDueToInterfaceDependencies);
				if (result == null) result = caseModification(changePropagationDueToInterfaceDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModificationRepository(ModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyComponent(ModifyComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Assembly Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyAssemblyConnector(ModifyAssemblyConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyDatatype(ModifyDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModification(Modification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercomponent Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercomponent Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntercomponentPropagation(IntercomponentPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intracomponent Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intracomponent Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntracomponentPropagation(IntracomponentPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeedModifications(SeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Provided Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyProvidedRole(ModifyProvidedRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Required Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyRequiredRole(ModifyRequiredRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangePropagationStep(ChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Due To Data Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Due To Data Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangePropagationDueToDataDependencies(ChangePropagationDueToDataDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyInterface(ModifyInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifySignature(ModifySignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Due To Interface Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Due To Interface Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangePropagationDueToInterfaceDependencies(ChangePropagationDueToInterfaceDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //modificationmarksSwitch
