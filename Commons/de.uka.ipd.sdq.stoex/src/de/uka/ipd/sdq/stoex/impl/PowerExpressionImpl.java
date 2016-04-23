/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import de.uka.ipd.sdq.stoex.Power;
import de.uka.ipd.sdq.stoex.PowerExpression;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.Unary;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Power Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.PowerExpressionImpl#getBase <em>Base</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.PowerExpressionImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerExpressionImpl extends PowerImpl implements PowerExpression {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PowerExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.POWER_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Power getBase() {
        return (Power) this.eDynamicGet(StoexPackage.POWER_EXPRESSION__BASE,
                StoexPackage.Literals.POWER_EXPRESSION__BASE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetBase(final Power newBase, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newBase, StoexPackage.POWER_EXPRESSION__BASE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setBase(final Power newBase) {
        this.eDynamicSet(StoexPackage.POWER_EXPRESSION__BASE, StoexPackage.Literals.POWER_EXPRESSION__BASE, newBase);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Unary getExponent() {
        return (Unary) this.eDynamicGet(StoexPackage.POWER_EXPRESSION__EXPONENT,
                StoexPackage.Literals.POWER_EXPRESSION__EXPONENT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetExponent(final Unary newExponent, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newExponent, StoexPackage.POWER_EXPRESSION__EXPONENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setExponent(final Unary newExponent) {
        this.eDynamicSet(StoexPackage.POWER_EXPRESSION__EXPONENT, StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                newExponent);
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            return this.basicSetBase(null, msgs);
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
            return this.basicSetExponent(null, msgs);
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            return this.getBase();
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
            return this.getExponent();
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            this.setBase((Power) newValue);
            return;
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
            this.setExponent((Unary) newValue);
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            this.setBase((Power) null);
            return;
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
            this.setExponent((Unary) null);
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            return this.getBase() != null;
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
            return this.getExponent() != null;
        }
        return super.eIsSet(featureID);
    }

} // PowerExpressionImpl
