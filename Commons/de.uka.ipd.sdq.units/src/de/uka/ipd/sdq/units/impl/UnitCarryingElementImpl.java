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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import de.uka.ipd.sdq.units.Unit;
import de.uka.ipd.sdq.units.UnitCarryingElement;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Unit Carrying Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.units.impl.UnitCarryingElementImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnitCarryingElementImpl extends CDOObjectImpl implements UnitCarryingElement {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    private Unit unit;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected UnitCarryingElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UnitsPackage.Literals.UNIT_CARRYING_ELEMENT;
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
     * @generated NOT
     */
    @Override
    public Unit getUnit() {
        // TO DO: implement this method to return the 'Unit' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        // throw new UnsupportedOperationException();
        return this.unit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public NotificationChain basicSetUnit(final Unit newUnit, final NotificationChain msgs) {
        // TO DO: implement this method to set the contained 'Unit' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a
        // NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        // throw new UnsupportedOperationException();
        this.unit = newUnit;
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    public Unit basicGetUnit() {
        // TO DO: implement this method to return the 'Unit' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT

        return this.unit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void setUnit(final Unit newUnit) {
        this.unit = newUnit;
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
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
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
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
            return this.getUnit();
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
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
            this.setUnit((Unit) newValue);
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
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
            this.setUnit((Unit) null);
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
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
            return this.getUnit() != null;
        }
        return super.eIsSet(featureID);
    }

} // UnitCarryingElementImpl
