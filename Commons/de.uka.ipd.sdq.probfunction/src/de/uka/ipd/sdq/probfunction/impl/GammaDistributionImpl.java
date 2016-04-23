/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.probfunction.GammaDistribution;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Gamma Distribution</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.GammaDistributionImpl#getAlpha <em>Alpha</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.GammaDistributionImpl#getTheta <em>Theta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GammaDistributionImpl extends ContinuousPDFImpl implements GammaDistribution {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getAlpha()
     * @generated
     * @ordered
     */
    protected static final double ALPHA_EDEFAULT = 0.0;
    /**
     * The default value of the '{@link #getTheta() <em>Theta</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getTheta()
     * @generated
     * @ordered
     */
    protected static final double THETA_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected GammaDistributionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.GAMMA_DISTRIBUTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getAlpha() {
        return (Double) this.eDynamicGet(ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA,
                ProbfunctionPackage.Literals.GAMMA_DISTRIBUTION__ALPHA, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setAlpha(final double newAlpha) {
        this.eDynamicSet(ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA,
                ProbfunctionPackage.Literals.GAMMA_DISTRIBUTION__ALPHA, newAlpha);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getTheta() {
        return (Double) this.eDynamicGet(ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA,
                ProbfunctionPackage.Literals.GAMMA_DISTRIBUTION__THETA, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTheta(final double newTheta) {
        this.eDynamicSet(ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA,
                ProbfunctionPackage.Literals.GAMMA_DISTRIBUTION__THETA, newTheta);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA:
            return this.getAlpha();
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA:
            return this.getTheta();
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
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA:
            this.setAlpha((Double) newValue);
            return;
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA:
            this.setTheta((Double) newValue);
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
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA:
            this.setAlpha(ALPHA_EDEFAULT);
            return;
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA:
            this.setTheta(THETA_EDEFAULT);
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
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA:
            return this.getAlpha() != ALPHA_EDEFAULT;
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA:
            return this.getTheta() != THETA_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // GammaDistributionImpl
