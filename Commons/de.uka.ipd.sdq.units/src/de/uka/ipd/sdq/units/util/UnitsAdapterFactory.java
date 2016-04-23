/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.units.BaseUnit;
import de.uka.ipd.sdq.units.Unit;
import de.uka.ipd.sdq.units.UnitCarryingElement;
import de.uka.ipd.sdq.units.UnitDivision;
import de.uka.ipd.sdq.units.UnitMultiplication;
import de.uka.ipd.sdq.units.UnitPower;
import de.uka.ipd.sdq.units.UnitRepository;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see de.uka.ipd.sdq.units.UnitsPackage
 * @generated
 */
public class UnitsAdapterFactory extends AdapterFactoryImpl {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static UnitsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = UnitsPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected UnitsSwitch<Adapter> modelSwitch = new UnitsSwitch<Adapter>() {

        @Override
        public Adapter caseUnitCarryingElement(final UnitCarryingElement object) {
            return UnitsAdapterFactory.this.createUnitCarryingElementAdapter();
        }

        @Override
        public Adapter caseUnit(final Unit object) {
            return UnitsAdapterFactory.this.createUnitAdapter();
        }

        @Override
        public Adapter caseBaseUnit(final BaseUnit object) {
            return UnitsAdapterFactory.this.createBaseUnitAdapter();
        }

        @Override
        public Adapter caseUnitRepository(final UnitRepository object) {
            return UnitsAdapterFactory.this.createUnitRepositoryAdapter();
        }

        @Override
        public Adapter caseUnitMultiplication(final UnitMultiplication object) {
            return UnitsAdapterFactory.this.createUnitMultiplicationAdapter();
        }

        @Override
        public Adapter caseUnitPower(final UnitPower object) {
            return UnitsAdapterFactory.this.createUnitPowerAdapter();
        }

        @Override
        public Adapter caseUnitDivision(final UnitDivision object) {
            return UnitsAdapterFactory.this.createUnitDivisionAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return UnitsAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.units.UnitCarryingElement <em>Unit Carrying Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.units.UnitCarryingElement
     * @generated
     */
    public Adapter createUnitCarryingElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.units.Unit <em>Unit</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.units.Unit
     * @generated
     */
    public Adapter createUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.units.BaseUnit
     * <em>Base Unit</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.units.BaseUnit
     * @generated
     */
    public Adapter createBaseUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.units.UnitRepository
     * <em>Unit Repository</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.units.UnitRepository
     * @generated
     */
    public Adapter createUnitRepositoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.units.UnitMultiplication
     * <em>Unit Multiplication</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.units.UnitMultiplication
     * @generated
     */
    public Adapter createUnitMultiplicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.units.UnitPower
     * <em>Unit Power</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.units.UnitPower
     * @generated
     */
    public Adapter createUnitPowerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.units.UnitDivision
     * <em>Unit Division</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.units.UnitDivision
     * @generated
     */
    public Adapter createUnitDivisionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // UnitsAdapterFactory
