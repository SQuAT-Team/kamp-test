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

import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.probfunction.Sample;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Probability Mass Function</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.ProbabilityMassFunctionImpl#getSamples <em>Samples
 * </em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.ProbabilityMassFunctionImpl#isOrderedDomain <em>
 * Ordered Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProbabilityMassFunctionImpl extends ProbabilityFunctionImpl implements ProbabilityMassFunction {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #isOrderedDomain() <em>Ordered Domain</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isOrderedDomain()
     * @generated
     * @ordered
     */
    protected static final boolean ORDERED_DOMAIN_EDEFAULT = false;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ProbabilityMassFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.PROBABILITY_MASS_FUNCTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Sample> getSamples() {
        return (EList<Sample>) this.eDynamicGet(ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES,
                ProbfunctionPackage.Literals.PROBABILITY_MASS_FUNCTION__SAMPLES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isOrderedDomain() {
        return (Boolean) this.eDynamicGet(ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN,
                ProbfunctionPackage.Literals.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setOrderedDomain(final boolean newOrderedDomain) {
        this.eDynamicSet(ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN,
                ProbfunctionPackage.Literals.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN, newOrderedDomain);
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            return ((InternalEList<?>) this.getSamples()).basicRemove(otherEnd, msgs);
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            return this.getSamples();
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            return this.isOrderedDomain();
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            this.getSamples().clear();
            this.getSamples().addAll((Collection<? extends Sample>) newValue);
            return;
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            this.setOrderedDomain((Boolean) newValue);
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            this.getSamples().clear();
            return;
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            this.setOrderedDomain(ORDERED_DOMAIN_EDEFAULT);
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            return !this.getSamples().isEmpty();
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            return this.isOrderedDomain() != ORDERED_DOMAIN_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ProbabilityMassFunctionImpl
