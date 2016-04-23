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

import de.uka.ipd.sdq.stoex.Power;
import de.uka.ipd.sdq.stoex.Product;
import de.uka.ipd.sdq.stoex.ProductExpression;
import de.uka.ipd.sdq.stoex.ProductOperations;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Product Expression</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.ProductExpressionImpl#getLeft <em>Left</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.ProductExpressionImpl#getRight <em>Right</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.ProductExpressionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductExpressionImpl extends ProductImpl implements ProductExpression {

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
    protected static final ProductOperations OPERATION_EDEFAULT = ProductOperations.MULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ProductExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.PRODUCT_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Product getLeft() {
        return (Product) this.eDynamicGet(StoexPackage.PRODUCT_EXPRESSION__LEFT,
                StoexPackage.Literals.PRODUCT_EXPRESSION__LEFT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLeft(final Product newLeft, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newLeft, StoexPackage.PRODUCT_EXPRESSION__LEFT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLeft(final Product newLeft) {
        this.eDynamicSet(StoexPackage.PRODUCT_EXPRESSION__LEFT, StoexPackage.Literals.PRODUCT_EXPRESSION__LEFT, newLeft);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Power getRight() {
        return (Power) this.eDynamicGet(StoexPackage.PRODUCT_EXPRESSION__RIGHT,
                StoexPackage.Literals.PRODUCT_EXPRESSION__RIGHT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRight(final Power newRight, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newRight, StoexPackage.PRODUCT_EXPRESSION__RIGHT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRight(final Power newRight) {
        this.eDynamicSet(StoexPackage.PRODUCT_EXPRESSION__RIGHT, StoexPackage.Literals.PRODUCT_EXPRESSION__RIGHT,
                newRight);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProductOperations getOperation() {
        return (ProductOperations) this.eDynamicGet(StoexPackage.PRODUCT_EXPRESSION__OPERATION,
                StoexPackage.Literals.PRODUCT_EXPRESSION__OPERATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setOperation(final ProductOperations newOperation) {
        this.eDynamicSet(StoexPackage.PRODUCT_EXPRESSION__OPERATION,
                StoexPackage.Literals.PRODUCT_EXPRESSION__OPERATION, newOperation);
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
        case StoexPackage.PRODUCT_EXPRESSION__LEFT:
            return this.basicSetLeft(null, msgs);
        case StoexPackage.PRODUCT_EXPRESSION__RIGHT:
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
        case StoexPackage.PRODUCT_EXPRESSION__LEFT:
            return this.getLeft();
        case StoexPackage.PRODUCT_EXPRESSION__RIGHT:
            return this.getRight();
        case StoexPackage.PRODUCT_EXPRESSION__OPERATION:
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
        case StoexPackage.PRODUCT_EXPRESSION__LEFT:
            this.setLeft((Product) newValue);
            return;
        case StoexPackage.PRODUCT_EXPRESSION__RIGHT:
            this.setRight((Power) newValue);
            return;
        case StoexPackage.PRODUCT_EXPRESSION__OPERATION:
            this.setOperation((ProductOperations) newValue);
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
        case StoexPackage.PRODUCT_EXPRESSION__LEFT:
            this.setLeft((Product) null);
            return;
        case StoexPackage.PRODUCT_EXPRESSION__RIGHT:
            this.setRight((Power) null);
            return;
        case StoexPackage.PRODUCT_EXPRESSION__OPERATION:
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
        case StoexPackage.PRODUCT_EXPRESSION__LEFT:
            return this.getLeft() != null;
        case StoexPackage.PRODUCT_EXPRESSION__RIGHT:
            return this.getRight() != null;
        case StoexPackage.PRODUCT_EXPRESSION__OPERATION:
            return this.getOperation() != OPERATION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ProductExpressionImpl
