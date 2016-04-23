/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import de.uka.ipd.sdq.units.Unit;
import de.uka.ipd.sdq.units.UnitPower;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Unit Power</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.units.impl.UnitPowerImpl#getUnit <em>Unit</em>}</li>
 * <li>{@link de.uka.ipd.sdq.units.impl.UnitPowerImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitPowerImpl extends UnitImpl implements UnitPower {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExponent()
     * @generated
     * @ordered
     */
    protected static final int EXPONENT_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected UnitPowerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UnitsPackage.Literals.UNIT_POWER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Unit getUnit() {
        return (Unit) this.eDynamicGet(UnitsPackage.UNIT_POWER__UNIT, UnitsPackage.Literals.UNIT_POWER__UNIT, true,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetUnit(final Unit newUnit, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newUnit, UnitsPackage.UNIT_POWER__UNIT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setUnit(final Unit newUnit) {
        this.eDynamicSet(UnitsPackage.UNIT_POWER__UNIT, UnitsPackage.Literals.UNIT_POWER__UNIT, newUnit);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getExponent() {
        return (Integer) this.eDynamicGet(UnitsPackage.UNIT_POWER__EXPONENT,
                UnitsPackage.Literals.UNIT_POWER__EXPONENT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setExponent(final int newExponent) {
        this.eDynamicSet(UnitsPackage.UNIT_POWER__EXPONENT, UnitsPackage.Literals.UNIT_POWER__EXPONENT, newExponent);
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
        case UnitsPackage.UNIT_POWER__UNIT:
            return this.basicSetUnit(null, msgs);
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
        case UnitsPackage.UNIT_POWER__UNIT:
            return this.getUnit();
        case UnitsPackage.UNIT_POWER__EXPONENT:
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
        case UnitsPackage.UNIT_POWER__UNIT:
            this.setUnit((Unit) newValue);
            return;
        case UnitsPackage.UNIT_POWER__EXPONENT:
            this.setExponent((Integer) newValue);
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
        case UnitsPackage.UNIT_POWER__UNIT:
            this.setUnit((Unit) null);
            return;
        case UnitsPackage.UNIT_POWER__EXPONENT:
            this.setExponent(EXPONENT_EDEFAULT);
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
        case UnitsPackage.UNIT_POWER__UNIT:
            return this.getUnit() != null;
        case UnitsPackage.UNIT_POWER__EXPONENT:
            return this.getExponent() != EXPONENT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // UnitPowerImpl
