/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.internalmodificationmark.impl;

import de.uka.ipd.sdq.internalmodificationmark.*;

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
public class InternalmodificationmarkFactoryImpl extends EFactoryImpl implements InternalmodificationmarkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InternalmodificationmarkFactory init() {
		try {
			InternalmodificationmarkFactory theInternalmodificationmarkFactory = (InternalmodificationmarkFactory)EPackage.Registry.INSTANCE.getEFactory(InternalmodificationmarkPackage.eNS_URI);
			if (theInternalmodificationmarkFactory != null) {
				return theInternalmodificationmarkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InternalmodificationmarkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalmodificationmarkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK_REPOSITORY: return createInternalModificationMarkRepository();
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK: return createInternalModificationMark();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalModificationMarkRepository createInternalModificationMarkRepository() {
		InternalModificationMarkRepositoryImpl internalModificationMarkRepository = new InternalModificationMarkRepositoryImpl();
		return internalModificationMarkRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalModificationMark createInternalModificationMark() {
		InternalModificationMarkImpl internalModificationMark = new InternalModificationMarkImpl();
		return internalModificationMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalmodificationmarkPackage getInternalmodificationmarkPackage() {
		return (InternalmodificationmarkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InternalmodificationmarkPackage getPackage() {
		return InternalmodificationmarkPackage.eINSTANCE;
	}

} //InternalmodificationmarkFactoryImpl
