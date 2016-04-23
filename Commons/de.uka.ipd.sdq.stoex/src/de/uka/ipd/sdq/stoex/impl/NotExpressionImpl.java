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

import de.uka.ipd.sdq.stoex.NotExpression;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.Unary;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Not Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.NotExpressionImpl#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotExpressionImpl extends UnaryImpl implements NotExpression {

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
    protected NotExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.NOT_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Unary getInner() {
        return (Unary) this.eDynamicGet(StoexPackage.NOT_EXPRESSION__INNER,
                StoexPackage.Literals.NOT_EXPRESSION__INNER, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetInner(final Unary newInner, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newInner, StoexPackage.NOT_EXPRESSION__INNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setInner(final Unary newInner) {
        this.eDynamicSet(StoexPackage.NOT_EXPRESSION__INNER, StoexPackage.Literals.NOT_EXPRESSION__INNER, newInner);
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
        case StoexPackage.NOT_EXPRESSION__INNER:
            return this.basicSetInner(null, msgs);
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
        case StoexPackage.NOT_EXPRESSION__INNER:
            return this.getInner();
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
        case StoexPackage.NOT_EXPRESSION__INNER:
            this.setInner((Unary) newValue);
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
        case StoexPackage.NOT_EXPRESSION__INNER:
            this.setInner((Unary) null);
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
        case StoexPackage.NOT_EXPRESSION__INNER:
            return this.getInner() != null;
        }
        return super.eIsSet(featureID);
    }

} // NotExpressionImpl
