/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uka.ipd.sdq.units.BaseUnit;
import de.uka.ipd.sdq.units.Unit;
import de.uka.ipd.sdq.units.UnitCarryingElement;
import de.uka.ipd.sdq.units.UnitDivision;
import de.uka.ipd.sdq.units.UnitMultiplication;
import de.uka.ipd.sdq.units.UnitNames;
import de.uka.ipd.sdq.units.UnitPower;
import de.uka.ipd.sdq.units.UnitRepository;
import de.uka.ipd.sdq.units.UnitsFactory;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class UnitsPackageImpl extends EPackageImpl implements UnitsPackage {

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
    private EClass unitCarryingElementEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass unitEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass baseUnitEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass unitRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass unitMultiplicationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass unitPowerEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass unitDivisionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum unitNamesEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.uka.ipd.sdq.units.UnitsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private UnitsPackageImpl() {
        super(eNS_URI, UnitsFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link UnitsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to
     * obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static UnitsPackage init() {
        if (isInited) {
            return (UnitsPackage) EPackage.Registry.INSTANCE.getEPackage(UnitsPackage.eNS_URI);
        }

        // Obtain or create and register package
        final UnitsPackageImpl theUnitsPackage = (UnitsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UnitsPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new UnitsPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theUnitsPackage.createPackageContents();

        // Initialize created meta-data
        theUnitsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUnitsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UnitsPackage.eNS_URI, theUnitsPackage);
        return theUnitsPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getUnitCarryingElement() {
        return this.unitCarryingElementEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getUnitCarryingElement_Unit() {
        return (EReference) this.unitCarryingElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getUnit() {
        return this.unitEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBaseUnit() {
        return this.baseUnitEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getBaseUnit_Name() {
        return (EAttribute) this.baseUnitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getUnitRepository() {
        return this.unitRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getUnitRepository_Units() {
        return (EReference) this.unitRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getUnitMultiplication() {
        return this.unitMultiplicationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getUnitMultiplication_Units() {
        return (EReference) this.unitMultiplicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getUnitPower() {
        return this.unitPowerEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getUnitPower_Unit() {
        return (EReference) this.unitPowerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getUnitPower_Exponent() {
        return (EAttribute) this.unitPowerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getUnitDivision() {
        return this.unitDivisionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getUnitDivision_Dividend() {
        return (EReference) this.unitDivisionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getUnitDivision_Divisor() {
        return (EReference) this.unitDivisionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getUnitNames() {
        return this.unitNamesEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public UnitsFactory getUnitsFactory() {
        return (UnitsFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.unitCarryingElementEClass = this.createEClass(UNIT_CARRYING_ELEMENT);
        this.createEReference(this.unitCarryingElementEClass, UNIT_CARRYING_ELEMENT__UNIT);

        this.unitEClass = this.createEClass(UNIT);

        this.baseUnitEClass = this.createEClass(BASE_UNIT);
        this.createEAttribute(this.baseUnitEClass, BASE_UNIT__NAME);

        this.unitRepositoryEClass = this.createEClass(UNIT_REPOSITORY);
        this.createEReference(this.unitRepositoryEClass, UNIT_REPOSITORY__UNITS);

        this.unitMultiplicationEClass = this.createEClass(UNIT_MULTIPLICATION);
        this.createEReference(this.unitMultiplicationEClass, UNIT_MULTIPLICATION__UNITS);

        this.unitPowerEClass = this.createEClass(UNIT_POWER);
        this.createEReference(this.unitPowerEClass, UNIT_POWER__UNIT);
        this.createEAttribute(this.unitPowerEClass, UNIT_POWER__EXPONENT);

        this.unitDivisionEClass = this.createEClass(UNIT_DIVISION);
        this.createEReference(this.unitDivisionEClass, UNIT_DIVISION__DIVIDEND);
        this.createEReference(this.unitDivisionEClass, UNIT_DIVISION__DIVISOR);

        // Create enums
        this.unitNamesEEnum = this.createEEnum(UNIT_NAMES);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.baseUnitEClass.getESuperTypes().add(this.getUnit());
        this.unitMultiplicationEClass.getESuperTypes().add(this.getUnit());
        this.unitPowerEClass.getESuperTypes().add(this.getUnit());
        this.unitDivisionEClass.getESuperTypes().add(this.getUnit());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.unitCarryingElementEClass, UnitCarryingElement.class, "UnitCarryingElement", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getUnitCarryingElement_Unit(), this.getUnit(), null, "unit", null, 0, 1,
                UnitCarryingElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.unitEClass, Unit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.baseUnitEClass, BaseUnit.class, "BaseUnit", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getBaseUnit_Name(), this.getUnitNames(), "name", null, 1, 1, BaseUnit.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.unitRepositoryEClass, UnitRepository.class, "UnitRepository", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getUnitRepository_Units(), this.getBaseUnit(), null, "units", null, 0, -1,
                UnitRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.unitMultiplicationEClass, UnitMultiplication.class, "UnitMultiplication", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getUnitMultiplication_Units(), this.getUnit(), null, "units", null, 1, -1,
                UnitMultiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.unitPowerEClass, UnitPower.class, "UnitPower", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getUnitPower_Unit(), this.getUnit(), null, "unit", null, 1, 1, UnitPower.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getUnitPower_Exponent(), this.ecorePackage.getEInt(), "exponent", null, 1, 1,
                UnitPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.unitDivisionEClass, UnitDivision.class, "UnitDivision", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getUnitDivision_Dividend(), this.getUnit(), null, "dividend", null, 1, 1,
                UnitDivision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getUnitDivision_Divisor(), this.getUnit(), null, "divisor", null, 1, 1,
                UnitDivision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.unitNamesEEnum, UnitNames.class, "UnitNames");
        this.addEEnumLiteral(this.unitNamesEEnum, UnitNames.UNITLESS);
        this.addEEnumLiteral(this.unitNamesEEnum, UnitNames.BYTE);
        this.addEEnumLiteral(this.unitNamesEEnum, UnitNames.SECOND);
        this.addEEnumLiteral(this.unitNamesEEnum, UnitNames.METER);

        // Create resource
        this.createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        this.createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        final String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        this.addAnnotation(this.getUnitCarryingElement_Unit(), source, new String[] { "name", "", "namespace", "" });
        this.addAnnotation(this.getBaseUnit_Name(), source, new String[] { "name", "", "namespace", "" });
    }

} // UnitsPackageImpl
