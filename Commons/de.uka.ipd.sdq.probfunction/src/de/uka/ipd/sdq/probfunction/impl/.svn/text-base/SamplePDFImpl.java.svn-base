/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.probfunction.Complex;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.probfunction.SamplePDF;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Sample PDF</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.SamplePDFImpl#getDistance <em>Distance</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.SamplePDFImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SamplePDFImpl extends ProbabilityDensityFunctionImpl implements SamplePDF {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDistance()
     * @generated
     * @ordered
     */
    protected static final double DISTANCE_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SamplePDFImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.SAMPLE_PDF;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getDistance() {
        return (Double) this.eDynamicGet(ProbfunctionPackage.SAMPLE_PDF__DISTANCE,
                ProbfunctionPackage.Literals.SAMPLE_PDF__DISTANCE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDistance(final double newDistance) {
        this.eDynamicSet(ProbfunctionPackage.SAMPLE_PDF__DISTANCE, ProbfunctionPackage.Literals.SAMPLE_PDF__DISTANCE,
                newDistance);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Complex> getValues() {
        return (EList<Complex>) this.eDynamicGet(ProbfunctionPackage.SAMPLE_PDF__VALUES,
                ProbfunctionPackage.Literals.SAMPLE_PDF__VALUES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            return ((InternalEList<?>) this.getValues()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ProbfunctionPackage.SAMPLE_PDF__DISTANCE:
            return this.getDistance();
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            return this.getValues();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ProbfunctionPackage.SAMPLE_PDF__DISTANCE:
            this.setDistance((Double) newValue);
            return;
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            this.getValues().clear();
            this.getValues().addAll((Collection<? extends Complex>) newValue);
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
        case ProbfunctionPackage.SAMPLE_PDF__DISTANCE:
            this.setDistance(DISTANCE_EDEFAULT);
            return;
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            this.getValues().clear();
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
        case ProbfunctionPackage.SAMPLE_PDF__DISTANCE:
            return this.getDistance() != DISTANCE_EDEFAULT;
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            return !this.getValues().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SamplePDFImpl
