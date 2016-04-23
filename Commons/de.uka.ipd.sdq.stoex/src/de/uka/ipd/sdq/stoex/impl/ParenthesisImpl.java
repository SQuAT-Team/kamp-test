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

import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.Parenthesis;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parenthesis</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.ParenthesisImpl#getInnerExpression <em>Inner Expression
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParenthesisImpl extends AtomImpl implements Parenthesis {

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
    protected ParenthesisImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.PARENTHESIS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Expression getInnerExpression() {
        return (Expression) this.eDynamicGet(StoexPackage.PARENTHESIS__INNER_EXPRESSION,
                StoexPackage.Literals.PARENTHESIS__INNER_EXPRESSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetInnerExpression(final Expression newInnerExpression, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newInnerExpression,
                StoexPackage.PARENTHESIS__INNER_EXPRESSION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setInnerExpression(final Expression newInnerExpression) {
        this.eDynamicSet(StoexPackage.PARENTHESIS__INNER_EXPRESSION,
                StoexPackage.Literals.PARENTHESIS__INNER_EXPRESSION, newInnerExpression);
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
        case StoexPackage.PARENTHESIS__INNER_EXPRESSION:
            return this.basicSetInnerExpression(null, msgs);
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
        case StoexPackage.PARENTHESIS__INNER_EXPRESSION:
            return this.getInnerExpression();
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
        case StoexPackage.PARENTHESIS__INNER_EXPRESSION:
            this.setInnerExpression((Expression) newValue);
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
        case StoexPackage.PARENTHESIS__INNER_EXPRESSION:
            this.setInnerExpression((Expression) null);
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
        case StoexPackage.PARENTHESIS__INNER_EXPRESSION:
            return this.getInnerExpression() != null;
        }
        return super.eIsSet(featureID);
    }

} // ParenthesisImpl
