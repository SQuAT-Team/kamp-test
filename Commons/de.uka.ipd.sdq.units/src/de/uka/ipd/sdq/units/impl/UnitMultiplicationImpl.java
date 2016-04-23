/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.units.Unit;
import de.uka.ipd.sdq.units.UnitMultiplication;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Unit Multiplication</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.units.impl.UnitMultiplicationImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitMultiplicationImpl extends UnitImpl implements UnitMultiplication {

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
    protected UnitMultiplicationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UnitsPackage.Literals.UNIT_MULTIPLICATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Unit> getUnits() {
        return (EList<Unit>) this.eDynamicGet(UnitsPackage.UNIT_MULTIPLICATION__UNITS,
                UnitsPackage.Literals.UNIT_MULTIPLICATION__UNITS, true, true);
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
        case UnitsPackage.UNIT_MULTIPLICATION__UNITS:
            return ((InternalEList<?>) this.getUnits()).basicRemove(otherEnd, msgs);
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
        case UnitsPackage.UNIT_MULTIPLICATION__UNITS:
            return this.getUnits();
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
        case UnitsPackage.UNIT_MULTIPLICATION__UNITS:
            this.getUnits().clear();
            this.getUnits().addAll((Collection<? extends Unit>) newValue);
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
        case UnitsPackage.UNIT_MULTIPLICATION__UNITS:
            this.getUnits().clear();
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
        case UnitsPackage.UNIT_MULTIPLICATION__UNITS:
            return !this.getUnits().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // UnitMultiplicationImpl
