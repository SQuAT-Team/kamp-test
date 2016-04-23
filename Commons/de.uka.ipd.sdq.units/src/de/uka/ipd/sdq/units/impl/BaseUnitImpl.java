/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.impl;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.units.BaseUnit;
import de.uka.ipd.sdq.units.UnitNames;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Base Unit</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.units.impl.BaseUnitImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseUnitImpl extends UnitImpl implements BaseUnit {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final UnitNames NAME_EDEFAULT = UnitNames.UNITLESS;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected BaseUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UnitsPackage.Literals.BASE_UNIT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public UnitNames getName() {
        return (UnitNames) this.eDynamicGet(UnitsPackage.BASE_UNIT__NAME, UnitsPackage.Literals.BASE_UNIT__NAME, true,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setName(final UnitNames newName) {
        this.eDynamicSet(UnitsPackage.BASE_UNIT__NAME, UnitsPackage.Literals.BASE_UNIT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case UnitsPackage.BASE_UNIT__NAME:
            return this.getName();
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
        case UnitsPackage.BASE_UNIT__NAME:
            this.setName((UnitNames) newValue);
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
        case UnitsPackage.BASE_UNIT__NAME:
            this.setName(NAME_EDEFAULT);
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
        case UnitsPackage.BASE_UNIT__NAME:
            return this.getName() != NAME_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // BaseUnitImpl
