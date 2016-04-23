/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.internalmodificationmark;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
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
 * @see de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkFactory
 * @model kind="package"
 * @generated
 */
public interface InternalmodificationmarkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "internalmodificationmark";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/InternalModificationMark/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "internalmodificationmark";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalmodificationmarkPackage eINSTANCE = de.uka.ipd.sdq.internalmodificationmark.impl.InternalmodificationmarkPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkRepositoryImpl <em>Internal Modification Mark Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkRepositoryImpl
	 * @see de.uka.ipd.sdq.internalmodificationmark.impl.InternalmodificationmarkPackageImpl#getInternalModificationMarkRepository()
	 * @generated
	 */
	int INTERNAL_MODIFICATION_MARK_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MODIFICATION_MARK_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Internal Modification Mark</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MODIFICATION_MARK_REPOSITORY__INTERNAL_MODIFICATION_MARK = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Modification Mark Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MODIFICATION_MARK_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkImpl <em>Internal Modification Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkImpl
	 * @see de.uka.ipd.sdq.internalmodificationmark.impl.InternalmodificationmarkPackageImpl#getInternalModificationMark()
	 * @generated
	 */
	int INTERNAL_MODIFICATION_MARK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MODIFICATION_MARK__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MODIFICATION_MARK__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MODIFICATION_MARK__PROVIDED_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MODIFICATION_MARK__SIGNATURE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Internal Modification Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MODIFICATION_MARK_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.internalmodificationmark.InternalModificationMarkRepository <em>Internal Modification Mark Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Modification Mark Repository</em>'.
	 * @see de.uka.ipd.sdq.internalmodificationmark.InternalModificationMarkRepository
	 * @generated
	 */
	EClass getInternalModificationMarkRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.internalmodificationmark.InternalModificationMarkRepository#getInternalModificationMark <em>Internal Modification Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Modification Mark</em>'.
	 * @see de.uka.ipd.sdq.internalmodificationmark.InternalModificationMarkRepository#getInternalModificationMark()
	 * @see #getInternalModificationMarkRepository()
	 * @generated
	 */
	EReference getInternalModificationMarkRepository_InternalModificationMark();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark <em>Internal Modification Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Modification Mark</em>'.
	 * @see de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark
	 * @generated
	 */
	EClass getInternalModificationMark();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark#getComponent()
	 * @see #getInternalModificationMark()
	 * @generated
	 */
	EReference getInternalModificationMark_Component();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Role</em>'.
	 * @see de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark#getProvidedRole()
	 * @see #getInternalModificationMark()
	 * @generated
	 */
	EReference getInternalModificationMark_ProvidedRole();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signature</em>'.
	 * @see de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark#getSignature()
	 * @see #getInternalModificationMark()
	 * @generated
	 */
	EReference getInternalModificationMark_Signature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InternalmodificationmarkFactory getInternalmodificationmarkFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkRepositoryImpl <em>Internal Modification Mark Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkRepositoryImpl
		 * @see de.uka.ipd.sdq.internalmodificationmark.impl.InternalmodificationmarkPackageImpl#getInternalModificationMarkRepository()
		 * @generated
		 */
		EClass INTERNAL_MODIFICATION_MARK_REPOSITORY = eINSTANCE.getInternalModificationMarkRepository();

		/**
		 * The meta object literal for the '<em><b>Internal Modification Mark</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_MODIFICATION_MARK_REPOSITORY__INTERNAL_MODIFICATION_MARK = eINSTANCE.getInternalModificationMarkRepository_InternalModificationMark();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkImpl <em>Internal Modification Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkImpl
		 * @see de.uka.ipd.sdq.internalmodificationmark.impl.InternalmodificationmarkPackageImpl#getInternalModificationMark()
		 * @generated
		 */
		EClass INTERNAL_MODIFICATION_MARK = eINSTANCE.getInternalModificationMark();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_MODIFICATION_MARK__COMPONENT = eINSTANCE.getInternalModificationMark_Component();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_MODIFICATION_MARK__PROVIDED_ROLE = eINSTANCE.getInternalModificationMark_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_MODIFICATION_MARK__SIGNATURE = eINSTANCE.getInternalModificationMark_Signature();

	}

} //InternalmodificationmarkPackage
