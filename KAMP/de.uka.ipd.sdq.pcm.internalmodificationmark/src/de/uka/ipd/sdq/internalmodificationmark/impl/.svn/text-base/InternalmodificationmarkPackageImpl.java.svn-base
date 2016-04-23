/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.internalmodificationmark.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark;
import de.uka.ipd.sdq.internalmodificationmark.InternalModificationMarkRepository;
import de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkFactory;
import de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkPackage;

import de.uka.ipd.sdq.pcm.PcmPackage;

import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalmodificationmarkPackageImpl extends EPackageImpl implements InternalmodificationmarkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalModificationMarkRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalModificationMarkEClass = null;

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
	 * @see de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InternalmodificationmarkPackageImpl() {
		super(eNS_URI, InternalmodificationmarkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InternalmodificationmarkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InternalmodificationmarkPackage init() {
		if (isInited) return (InternalmodificationmarkPackage)EPackage.Registry.INSTANCE.getEPackage(InternalmodificationmarkPackage.eNS_URI);

		// Obtain or create and register package
		InternalmodificationmarkPackageImpl theInternalmodificationmarkPackage = (InternalmodificationmarkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InternalmodificationmarkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InternalmodificationmarkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInternalmodificationmarkPackage.createPackageContents();

		// Initialize created meta-data
		theInternalmodificationmarkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInternalmodificationmarkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InternalmodificationmarkPackage.eNS_URI, theInternalmodificationmarkPackage);
		return theInternalmodificationmarkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalModificationMarkRepository() {
		return internalModificationMarkRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalModificationMarkRepository_InternalModificationMark() {
		return (EReference)internalModificationMarkRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalModificationMark() {
		return internalModificationMarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalModificationMark_Component() {
		return (EReference)internalModificationMarkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalModificationMark_ProvidedRole() {
		return (EReference)internalModificationMarkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalModificationMark_Signature() {
		return (EReference)internalModificationMarkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalmodificationmarkFactory getInternalmodificationmarkFactory() {
		return (InternalmodificationmarkFactory)getEFactoryInstance();
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
		internalModificationMarkRepositoryEClass = createEClass(INTERNAL_MODIFICATION_MARK_REPOSITORY);
		createEReference(internalModificationMarkRepositoryEClass, INTERNAL_MODIFICATION_MARK_REPOSITORY__INTERNAL_MODIFICATION_MARK);

		internalModificationMarkEClass = createEClass(INTERNAL_MODIFICATION_MARK);
		createEReference(internalModificationMarkEClass, INTERNAL_MODIFICATION_MARK__COMPONENT);
		createEReference(internalModificationMarkEClass, INTERNAL_MODIFICATION_MARK__PROVIDED_ROLE);
		createEReference(internalModificationMarkEClass, INTERNAL_MODIFICATION_MARK__SIGNATURE);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		internalModificationMarkRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		internalModificationMarkEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(internalModificationMarkRepositoryEClass, InternalModificationMarkRepository.class, "InternalModificationMarkRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalModificationMarkRepository_InternalModificationMark(), this.getInternalModificationMark(), null, "internalModificationMark", null, 0, -1, InternalModificationMarkRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(internalModificationMarkEClass, InternalModificationMark.class, "InternalModificationMark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalModificationMark_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, InternalModificationMark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInternalModificationMark_ProvidedRole(), theRepositoryPackage.getProvidedRole(), null, "providedRole", null, 0, -1, InternalModificationMark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInternalModificationMark_Signature(), theRepositoryPackage.getSignature(), null, "signature", null, 0, -1, InternalModificationMark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InternalmodificationmarkPackageImpl
