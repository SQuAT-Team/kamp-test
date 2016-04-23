/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Random Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.RandomVariableImpl#getSpecification <em>Specification</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.RandomVariableImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RandomVariableImpl extends CDOObjectImpl implements RandomVariable {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSpecification()
     * @generated
     * @ordered
     */
    protected static final String SPECIFICATION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RandomVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.RANDOM_VARIABLE;
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
     * @generated
     */
    @Override
    public String getSpecification() {
        return (String) this.eDynamicGet(StoexPackage.RANDOM_VARIABLE__SPECIFICATION,
                StoexPackage.Literals.RANDOM_VARIABLE__SPECIFICATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSpecification(final String newSpecification) {
        this.eDynamicSet(StoexPackage.RANDOM_VARIABLE__SPECIFICATION,
                StoexPackage.Literals.RANDOM_VARIABLE__SPECIFICATION, newSpecification);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public Expression getExpression() {
        // FIXME: StB: I am not sure at all how this is supposed to work with dynamic feature.
        // The code below works but is far of the generated one....
        return (Expression) this.eGet(StoexPackage.RANDOM_VARIABLE__EXPRESSION,
                false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    public Expression basicGetExpression() {
        // TODO: implement this method to return the 'Expression' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    public boolean isSetExpression() {

        return (this.getSpecification() != null);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case StoexPackage.RANDOM_VARIABLE__SPECIFICATION:
            return this.getSpecification();
        case StoexPackage.RANDOM_VARIABLE__EXPRESSION:
            if (resolve) {
                return this.getExpression();
            }
            return this.basicGetExpression();
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
        case StoexPackage.RANDOM_VARIABLE__SPECIFICATION:
            this.setSpecification((String) newValue);
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
        case StoexPackage.RANDOM_VARIABLE__SPECIFICATION:
            this.setSpecification(SPECIFICATION_EDEFAULT);
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
        case StoexPackage.RANDOM_VARIABLE__SPECIFICATION:
            return SPECIFICATION_EDEFAULT == null ? this.getSpecification() != null : !SPECIFICATION_EDEFAULT
            .equals(this.getSpecification());
        case StoexPackage.RANDOM_VARIABLE__EXPRESSION:
            return this.isSetExpression();
        }
        return super.eIsSet(featureID);
    }

} // RandomVariableImpl
