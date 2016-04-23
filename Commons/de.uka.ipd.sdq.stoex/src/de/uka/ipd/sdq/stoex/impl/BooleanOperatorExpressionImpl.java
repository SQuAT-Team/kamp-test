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

import de.uka.ipd.sdq.stoex.BooleanExpression;
import de.uka.ipd.sdq.stoex.BooleanOperations;
import de.uka.ipd.sdq.stoex.BooleanOperatorExpression;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Boolean Operator Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.BooleanOperatorExpressionImpl#getLeft <em>Left</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.BooleanOperatorExpressionImpl#getRight <em>Right</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.BooleanOperatorExpressionImpl#getOperation <em>Operation
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanOperatorExpressionImpl extends BooleanExpressionImpl implements BooleanOperatorExpression {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected static final BooleanOperations OPERATION_EDEFAULT = BooleanOperations.AND;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected BooleanOperatorExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BooleanExpression getLeft() {
        return (BooleanExpression) this.eDynamicGet(StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT,
                StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__LEFT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLeft(final BooleanExpression newLeft, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newLeft, StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLeft(final BooleanExpression newLeft) {
        this.eDynamicSet(StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT,
                StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__LEFT, newLeft);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BooleanExpression getRight() {
        return (BooleanExpression) this.eDynamicGet(StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT,
                StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__RIGHT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRight(final BooleanExpression newRight, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newRight, StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRight(final BooleanExpression newRight) {
        this.eDynamicSet(StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT,
                StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__RIGHT, newRight);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BooleanOperations getOperation() {
        return (BooleanOperations) this.eDynamicGet(StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION,
                StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__OPERATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setOperation(final BooleanOperations newOperation) {
        this.eDynamicSet(StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION,
                StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__OPERATION, newOperation);
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            return this.basicSetLeft(null, msgs);
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            return this.basicSetRight(null, msgs);
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            return this.getLeft();
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            return this.getRight();
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION:
            return this.getOperation();
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            this.setLeft((BooleanExpression) newValue);
            return;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            this.setRight((BooleanExpression) newValue);
            return;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION:
            this.setOperation((BooleanOperations) newValue);
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            this.setLeft((BooleanExpression) null);
            return;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            this.setRight((BooleanExpression) null);
            return;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION:
            this.setOperation(OPERATION_EDEFAULT);
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            return this.getLeft() != null;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            return this.getRight() != null;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION:
            return this.getOperation() != OPERATION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // BooleanOperatorExpressionImpl
