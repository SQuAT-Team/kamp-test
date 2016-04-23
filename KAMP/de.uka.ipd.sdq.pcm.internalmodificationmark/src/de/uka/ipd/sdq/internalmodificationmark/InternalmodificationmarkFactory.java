/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.internalmodificationmark;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkPackage
 * @generated
 */
public interface InternalmodificationmarkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalmodificationmarkFactory eINSTANCE = de.uka.ipd.sdq.internalmodificationmark.impl.InternalmodificationmarkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Internal Modification Mark Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Modification Mark Repository</em>'.
	 * @generated
	 */
	InternalModificationMarkRepository createInternalModificationMarkRepository();

	/**
	 * Returns a new object of class '<em>Internal Modification Mark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Modification Mark</em>'.
	 * @generated
	 */
	InternalModificationMark createInternalModificationMark();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InternalmodificationmarkPackage getInternalmodificationmarkPackage();

} //InternalmodificationmarkFactory
