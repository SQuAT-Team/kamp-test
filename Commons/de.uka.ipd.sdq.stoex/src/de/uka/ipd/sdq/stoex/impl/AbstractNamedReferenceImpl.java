/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Abstract Named Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.AbstractNamedReferenceImpl#getReferenceName <em>Reference
 * Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractNamedReferenceImpl extends CDOObjectImpl implements AbstractNamedReference {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getReferenceName()
     * @generated
     * @ordered
     */
    protected static final String REFERENCE_NAME_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected AbstractNamedReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getReferenceName() {
        return (String) this.eDynamicGet(StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME,
                StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setReferenceName(final String newReferenceName) {
        this.eDynamicSet(StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME,
                StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME, newReferenceName);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            return this.getReferenceName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            this.setReferenceName((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            this.setReferenceName(REFERENCE_NAME_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            return REFERENCE_NAME_EDEFAULT == null ? this.getReferenceName() != null : !REFERENCE_NAME_EDEFAULT
            .equals(this.getReferenceName());
        }
        return super.eIsSet(featureID);
    }

} // AbstractNamedReferenceImpl
