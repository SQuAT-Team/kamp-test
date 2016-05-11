/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationDueToInterfaceDependencies;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.IntercomponentPropagation;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.IntracomponentPropagation;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.Modification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyAssemblyConnector;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyDatatype;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyRequiredRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifySignature;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksFactory;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class modificationmarksPackageImpl extends EPackageImpl implements modificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyAssemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intercomponentPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intracomponentPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyProvidedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyRequiredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePropagationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePropagationDueToDataDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePropagationDueToInterfaceDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acceptanceAndConfirmationStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private modificationmarksPackageImpl() {
		super(eNS_URI, modificationmarksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link modificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static modificationmarksPackage init() {
		if (isInited) return (modificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(modificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		modificationmarksPackageImpl themodificationmarksPackage = (modificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof modificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new modificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themodificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		themodificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themodificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(modificationmarksPackage.eNS_URI, themodificationmarksPackage);
		return themodificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModificationRepository() {
		return modificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModificationRepository_SeedModifications() {
		return (EReference)modificationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModificationRepository_ChangePropagationSteps() {
		return (EReference)modificationRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyComponent() {
		return modifyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyComponent_Component() {
		return (EReference)modifyComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyComponent_ProvidedroleModifications() {
		return (EReference)modifyComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyComponent_RequiredroleModifications() {
		return (EReference)modifyComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyAssemblyConnector() {
		return modifyAssemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyAssemblyConnector_Assemblyconnector() {
		return (EReference)modifyAssemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyDatatype() {
		return modifyDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyDatatype_Datatype() {
		return (EReference)modifyDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModification() {
		return modificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModification_Id() {
		return (EAttribute)modificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModification_Toolderived() {
		return (EAttribute)modificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModification_UserDecision() {
		return (EAttribute)modificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntercomponentPropagation() {
		return intercomponentPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntercomponentPropagation_AssemblyConnectorModifications() {
		return (EReference)intercomponentPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntracomponentPropagation() {
		return intracomponentPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntracomponentPropagation_ComponentModifications() {
		return (EReference)intracomponentPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeedModifications() {
		return seedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeedModifications_DatatypeModifications() {
		return (EReference)seedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeedModifications_ComponentModifications() {
		return (EReference)seedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeedModifications_InterfaceModifications() {
		return (EReference)seedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyProvidedRole() {
		return modifyProvidedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyProvidedRole_Providedrole() {
		return (EReference)modifyProvidedRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyProvidedRole_SignatureModifications() {
		return (EReference)modifyProvidedRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyRequiredRole() {
		return modifyRequiredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyRequiredRole_Requiredrole() {
		return (EReference)modifyRequiredRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangePropagationStep() {
		return changePropagationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangePropagationDueToDataDependencies() {
		return changePropagationDueToDataDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToDataDependencies_InterfaceModifications() {
		return (EReference)changePropagationDueToDataDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyInterface() {
		return modifyInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyInterface_OperationInterface() {
		return (EReference)modifyInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyInterface_SignatureModifications() {
		return (EReference)modifyInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySignature() {
		return modifySignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifySignature_Signature() {
		return (EReference)modifySignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangePropagationDueToInterfaceDependencies() {
		return changePropagationDueToInterfaceDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToInterfaceDependencies_ComponentModifications() {
		return (EReference)changePropagationDueToInterfaceDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcceptanceAndConfirmationState() {
		return acceptanceAndConfirmationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modificationmarksFactory getmodificationmarksFactory() {
		return (modificationmarksFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modificationRepositoryEClass = createEClass(MODIFICATION_REPOSITORY);
		createEReference(modificationRepositoryEClass, MODIFICATION_REPOSITORY__SEED_MODIFICATIONS);
		createEReference(modificationRepositoryEClass, MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS);

		modifyComponentEClass = createEClass(MODIFY_COMPONENT);
		createEReference(modifyComponentEClass, MODIFY_COMPONENT__COMPONENT);
		createEReference(modifyComponentEClass, MODIFY_COMPONENT__PROVIDEDROLE_MODIFICATIONS);
		createEReference(modifyComponentEClass, MODIFY_COMPONENT__REQUIREDROLE_MODIFICATIONS);

		modifyAssemblyConnectorEClass = createEClass(MODIFY_ASSEMBLY_CONNECTOR);
		createEReference(modifyAssemblyConnectorEClass, MODIFY_ASSEMBLY_CONNECTOR__ASSEMBLYCONNECTOR);

		modifyDatatypeEClass = createEClass(MODIFY_DATATYPE);
		createEReference(modifyDatatypeEClass, MODIFY_DATATYPE__DATATYPE);

		modificationEClass = createEClass(MODIFICATION);
		createEAttribute(modificationEClass, MODIFICATION__ID);
		createEAttribute(modificationEClass, MODIFICATION__TOOLDERIVED);
		createEAttribute(modificationEClass, MODIFICATION__USER_DECISION);

		intercomponentPropagationEClass = createEClass(INTERCOMPONENT_PROPAGATION);
		createEReference(intercomponentPropagationEClass, INTERCOMPONENT_PROPAGATION__ASSEMBLY_CONNECTOR_MODIFICATIONS);

		intracomponentPropagationEClass = createEClass(INTRACOMPONENT_PROPAGATION);
		createEReference(intracomponentPropagationEClass, INTRACOMPONENT_PROPAGATION__COMPONENT_MODIFICATIONS);

		seedModificationsEClass = createEClass(SEED_MODIFICATIONS);
		createEReference(seedModificationsEClass, SEED_MODIFICATIONS__DATATYPE_MODIFICATIONS);
		createEReference(seedModificationsEClass, SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);
		createEReference(seedModificationsEClass, SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);

		modifyProvidedRoleEClass = createEClass(MODIFY_PROVIDED_ROLE);
		createEReference(modifyProvidedRoleEClass, MODIFY_PROVIDED_ROLE__PROVIDEDROLE);
		createEReference(modifyProvidedRoleEClass, MODIFY_PROVIDED_ROLE__SIGNATURE_MODIFICATIONS);

		modifyRequiredRoleEClass = createEClass(MODIFY_REQUIRED_ROLE);
		createEReference(modifyRequiredRoleEClass, MODIFY_REQUIRED_ROLE__REQUIREDROLE);

		changePropagationStepEClass = createEClass(CHANGE_PROPAGATION_STEP);

		changePropagationDueToDataDependenciesEClass = createEClass(CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES);
		createEReference(changePropagationDueToDataDependenciesEClass, CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS);

		modifyInterfaceEClass = createEClass(MODIFY_INTERFACE);
		createEReference(modifyInterfaceEClass, MODIFY_INTERFACE__OPERATION_INTERFACE);
		createEReference(modifyInterfaceEClass, MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS);

		modifySignatureEClass = createEClass(MODIFY_SIGNATURE);
		createEReference(modifySignatureEClass, MODIFY_SIGNATURE__SIGNATURE);

		changePropagationDueToInterfaceDependenciesEClass = createEClass(CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES);
		createEReference(changePropagationDueToInterfaceDependenciesEClass, CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS);

		// Create enums
		acceptanceAndConfirmationStateEEnum = createEEnum(ACCEPTANCE_AND_CONFIRMATION_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modifyComponentEClass.getESuperTypes().add(this.getModification());
		modifyAssemblyConnectorEClass.getESuperTypes().add(this.getModification());
		modifyDatatypeEClass.getESuperTypes().add(this.getModification());
		intercomponentPropagationEClass.getESuperTypes().add(this.getChangePropagationStep());
		intracomponentPropagationEClass.getESuperTypes().add(this.getChangePropagationStep());
		modifyProvidedRoleEClass.getESuperTypes().add(this.getModification());
		modifyRequiredRoleEClass.getESuperTypes().add(this.getModification());
		changePropagationStepEClass.getESuperTypes().add(this.getModification());
		changePropagationDueToDataDependenciesEClass.getESuperTypes().add(this.getChangePropagationStep());
		modifyInterfaceEClass.getESuperTypes().add(this.getModification());
		modifySignatureEClass.getESuperTypes().add(this.getModification());
		changePropagationDueToInterfaceDependenciesEClass.getESuperTypes().add(this.getChangePropagationStep());

		// Initialize classes and features; add operations and parameters
		initEClass(modificationRepositoryEClass, ModificationRepository.class, "ModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModificationRepository_SeedModifications(), this.getSeedModifications(), null, "seedModifications", null, 1, 1, ModificationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModificationRepository_ChangePropagationSteps(), this.getChangePropagationStep(), null, "changePropagationSteps", null, 0, -1, ModificationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyComponentEClass, ModifyComponent.class, "ModifyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifyComponent_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, ModifyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifyComponent_ProvidedroleModifications(), this.getModifyProvidedRole(), null, "providedroleModifications", null, 0, -1, ModifyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifyComponent_RequiredroleModifications(), this.getModifyRequiredRole(), null, "requiredroleModifications", null, 0, -1, ModifyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyAssemblyConnectorEClass, ModifyAssemblyConnector.class, "ModifyAssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifyAssemblyConnector_Assemblyconnector(), theCompositionPackage.getAssemblyConnector(), null, "assemblyconnector", null, 0, 1, ModifyAssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyDatatypeEClass, ModifyDatatype.class, "ModifyDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifyDatatype_Datatype(), theRepositoryPackage.getDataType(), null, "datatype", null, 0, 1, ModifyDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modificationEClass, Modification.class, "Modification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModification_Id(), ecorePackage.getEString(), "id", null, 1, 1, Modification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModification_Toolderived(), ecorePackage.getEBoolean(), "toolderived", null, 1, 1, Modification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModification_UserDecision(), this.getAcceptanceAndConfirmationState(), "userDecision", "NODECISION", 1, 1, Modification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intercomponentPropagationEClass, IntercomponentPropagation.class, "IntercomponentPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntercomponentPropagation_AssemblyConnectorModifications(), this.getModifyAssemblyConnector(), null, "assemblyConnectorModifications", null, 0, -1, IntercomponentPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intracomponentPropagationEClass, IntracomponentPropagation.class, "IntracomponentPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntracomponentPropagation_ComponentModifications(), this.getModifyComponent(), null, "componentModifications", null, 0, -1, IntracomponentPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seedModificationsEClass, SeedModifications.class, "SeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeedModifications_DatatypeModifications(), this.getModifyDatatype(), null, "datatypeModifications", null, 0, -1, SeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeedModifications_ComponentModifications(), this.getModifyComponent(), null, "componentModifications", null, 0, -1, SeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeedModifications_InterfaceModifications(), this.getModifyInterface(), null, "interfaceModifications", null, 0, -1, SeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyProvidedRoleEClass, ModifyProvidedRole.class, "ModifyProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifyProvidedRole_Providedrole(), theRepositoryPackage.getProvidedRole(), null, "providedrole", null, 1, 1, ModifyProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifyProvidedRole_SignatureModifications(), this.getModifySignature(), null, "signatureModifications", null, 0, -1, ModifyProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyRequiredRoleEClass, ModifyRequiredRole.class, "ModifyRequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifyRequiredRole_Requiredrole(), theRepositoryPackage.getRequiredRole(), null, "requiredrole", null, 1, 1, ModifyRequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePropagationStepEClass, ChangePropagationStep.class, "ChangePropagationStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changePropagationDueToDataDependenciesEClass, ChangePropagationDueToDataDependencies.class, "ChangePropagationDueToDataDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangePropagationDueToDataDependencies_InterfaceModifications(), this.getModifyInterface(), null, "interfaceModifications", null, 0, -1, ChangePropagationDueToDataDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyInterfaceEClass, ModifyInterface.class, "ModifyInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifyInterface_OperationInterface(), theRepositoryPackage.getOperationInterface(), null, "operationInterface", null, 1, 1, ModifyInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifyInterface_SignatureModifications(), this.getModifySignature(), null, "signatureModifications", null, 0, -1, ModifyInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifySignatureEClass, ModifySignature.class, "ModifySignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifySignature_Signature(), theRepositoryPackage.getSignature(), null, "signature", null, 1, 1, ModifySignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePropagationDueToInterfaceDependenciesEClass, ChangePropagationDueToInterfaceDependencies.class, "ChangePropagationDueToInterfaceDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangePropagationDueToInterfaceDependencies_ComponentModifications(), this.getModifyComponent(), null, "componentModifications", null, 0, -1, ChangePropagationDueToInterfaceDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(acceptanceAndConfirmationStateEEnum, AcceptanceAndConfirmationState.class, "AcceptanceAndConfirmationState");
		addEEnumLiteral(acceptanceAndConfirmationStateEEnum, AcceptanceAndConfirmationState.NODECISION);
		addEEnumLiteral(acceptanceAndConfirmationStateEEnum, AcceptanceAndConfirmationState.CONFIRMED);
		addEEnumLiteral(acceptanceAndConfirmationStateEEnum, AcceptanceAndConfirmationState.EXCLUDED);

		// Create resource
		createResource(eNS_URI);
	}

} //modificationmarksPackageImpl
