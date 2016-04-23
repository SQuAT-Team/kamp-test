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

import de.uka.ipd.sdq.stoex.Product;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.Term;
import de.uka.ipd.sdq.stoex.TermExpression;
import de.uka.ipd.sdq.stoex.TermOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Term Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.TermExpressionImpl#getLeft <em>Left</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.TermExpressionImpl#getRight <em>Right</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.TermExpressionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermExpressionImpl extends TermImpl implements TermExpression {

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
    protected static final TermOperations OPERATION_EDEFAULT = TermOperations.ADD;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TermExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.TERM_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Term getLeft() {
        return (Term) this.eDynamicGet(StoexPackage.TERM_EXPRESSION__LEFT, StoexPackage.Literals.TERM_EXPRESSION__LEFT,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLeft(final Term newLeft, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newLeft, StoexPackage.TERM_EXPRESSION__LEFT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLeft(final Term newLeft) {
        this.eDynamicSet(StoexPackage.TERM_EXPRESSION__LEFT, StoexPackage.Literals.TERM_EXPRESSION__LEFT, newLeft);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Product getRight() {
        return (Product) this.eDynamicGet(StoexPackage.TERM_EXPRESSION__RIGHT,
                StoexPackage.Literals.TERM_EXPRESSION__RIGHT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRight(final Product newRight, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newRight, StoexPackage.TERM_EXPRESSION__RIGHT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRight(final Product newRight) {
        this.eDynamicSet(StoexPackage.TERM_EXPRESSION__RIGHT, StoexPackage.Literals.TERM_EXPRESSION__RIGHT, newRight);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public TermOperations getOperation() {
        return (TermOperations) this.eDynamicGet(StoexPackage.TERM_EXPRESSION__OPERATION,
                StoexPackage.Literals.TERM_EXPRESSION__OPERATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setOperation(final TermOperations newOperation) {
        this.eDynamicSet(StoexPackage.TERM_EXPRESSION__OPERATION, StoexPackage.Literals.TERM_EXPRESSION__OPERATION,
                newOperation);
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            return this.basicSetLeft(null, msgs);
        case StoexPackage.TERM_EXPRESSION__RIGHT:
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            return this.getLeft();
        case StoexPackage.TERM_EXPRESSION__RIGHT:
            return this.getRight();
        case StoexPackage.TERM_EXPRESSION__OPERATION:
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            this.setLeft((Term) newValue);
            return;
        case StoexPackage.TERM_EXPRESSION__RIGHT:
            this.setRight((Product) newValue);
            return;
        case StoexPackage.TERM_EXPRESSION__OPERATION:
            this.setOperation((TermOperations) newValue);
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            this.setLeft((Term) null);
            return;
        case StoexPackage.TERM_EXPRESSION__RIGHT:
            this.setRight((Product) null);
            return;
        case StoexPackage.TERM_EXPRESSION__OPERATION:
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            return this.getLeft() != null;
        case StoexPackage.TERM_EXPRESSION__RIGHT:
            return this.getRight() != null;
        case StoexPackage.TERM_EXPRESSION__OPERATION:
            return this.getOperation() != OPERATION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // TermExpressionImpl
