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
import de.uka.ipd.sdq.stoex.IfElseExpression;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>If Else Expression</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.IfElseExpressionImpl#getIfExpression <em>If Expression</em>}
 * </li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.IfElseExpressionImpl#getElseExpression <em>Else Expression
 * </em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.IfElseExpressionImpl#getConditionExpression <em>Condition
 * Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfElseExpressionImpl extends IfElseImpl implements IfElseExpression {

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
    protected IfElseExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.IF_ELSE_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BooleanExpression getIfExpression() {
        return (BooleanExpression) this.eDynamicGet(StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION,
                StoexPackage.Literals.IF_ELSE_EXPRESSION__IF_EXPRESSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetIfExpression(final BooleanExpression newIfExpression, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newIfExpression,
                StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setIfExpression(final BooleanExpression newIfExpression) {
        this.eDynamicSet(StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION,
                StoexPackage.Literals.IF_ELSE_EXPRESSION__IF_EXPRESSION, newIfExpression);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BooleanExpression getElseExpression() {
        return (BooleanExpression) this.eDynamicGet(StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION,
                StoexPackage.Literals.IF_ELSE_EXPRESSION__ELSE_EXPRESSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetElseExpression(final BooleanExpression newElseExpression, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newElseExpression,
                StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setElseExpression(final BooleanExpression newElseExpression) {
        this.eDynamicSet(StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION,
                StoexPackage.Literals.IF_ELSE_EXPRESSION__ELSE_EXPRESSION, newElseExpression);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BooleanExpression getConditionExpression() {
        return (BooleanExpression) this.eDynamicGet(StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION,
                StoexPackage.Literals.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetConditionExpression(final BooleanExpression newConditionExpression,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newConditionExpression,
                StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setConditionExpression(final BooleanExpression newConditionExpression) {
        this.eDynamicSet(StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION,
                StoexPackage.Literals.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION, newConditionExpression);
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            return this.basicSetIfExpression(null, msgs);
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            return this.basicSetElseExpression(null, msgs);
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            return this.basicSetConditionExpression(null, msgs);
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            return this.getIfExpression();
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            return this.getElseExpression();
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            return this.getConditionExpression();
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            this.setIfExpression((BooleanExpression) newValue);
            return;
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            this.setElseExpression((BooleanExpression) newValue);
            return;
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            this.setConditionExpression((BooleanExpression) newValue);
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            this.setIfExpression((BooleanExpression) null);
            return;
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            this.setElseExpression((BooleanExpression) null);
            return;
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            this.setConditionExpression((BooleanExpression) null);
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            return this.getIfExpression() != null;
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            return this.getElseExpression() != null;
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            return this.getConditionExpression() != null;
        }
        return super.eIsSet(featureID);
    }

} // IfElseExpressionImpl
