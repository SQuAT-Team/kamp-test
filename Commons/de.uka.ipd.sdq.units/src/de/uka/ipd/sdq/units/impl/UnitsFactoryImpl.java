/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.units.BaseUnit;
import de.uka.ipd.sdq.units.UnitDivision;
import de.uka.ipd.sdq.units.UnitMultiplication;
import de.uka.ipd.sdq.units.UnitNames;
import de.uka.ipd.sdq.units.UnitPower;
import de.uka.ipd.sdq.units.UnitRepository;
import de.uka.ipd.sdq.units.UnitsFactory;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class UnitsFactoryImpl extends EFactoryImpl implements UnitsFactory {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static UnitsFactory init() {
        try {
            final UnitsFactory theUnitsFactory = (UnitsFactory) EPackage.Registry.INSTANCE
                    .getEFactory(UnitsPackage.eNS_URI);
            if (theUnitsFactory != null) {
                return theUnitsFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UnitsFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case UnitsPackage.BASE_UNIT:
            return this.createBaseUnit();
        case UnitsPackage.UNIT_REPOSITORY:
            return this.createUnitRepository();
        case UnitsPackage.UNIT_MULTIPLICATION:
            return this.createUnitMultiplication();
        case UnitsPackage.UNIT_POWER:
            return this.createUnitPower();
        case UnitsPackage.UNIT_DIVISION:
            return this.createUnitDivision();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case UnitsPackage.UNIT_NAMES:
            return this.createUnitNamesFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case UnitsPackage.UNIT_NAMES:
            return this.convertUnitNamesToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BaseUnit createBaseUnit() {
        final BaseUnitImpl baseUnit = new BaseUnitImpl();
        return baseUnit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public UnitRepository createUnitRepository() {
        final UnitRepositoryImpl unitRepository = new UnitRepositoryImpl();
        return unitRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public UnitMultiplication createUnitMultiplication() {
        final UnitMultiplicationImpl unitMultiplication = new UnitMultiplicationImpl();
        return unitMultiplication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public UnitPower createUnitPower() {
        final UnitPowerImpl unitPower = new UnitPowerImpl();
        return unitPower;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public UnitDivision createUnitDivision() {
        final UnitDivisionImpl unitDivision = new UnitDivisionImpl();
        return unitDivision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitNames createUnitNamesFromString(final EDataType eDataType, final String initialValue) {
        final UnitNames result = UnitNames.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertUnitNamesToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public UnitsPackage getUnitsPackage() {
        return (UnitsPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UnitsPackage getPackage() {
        return UnitsPackage.eINSTANCE;
    }

} // UnitsFactoryImpl
