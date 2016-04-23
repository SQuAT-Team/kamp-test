/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.FunctionLiteral;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Function Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.FunctionLiteralImpl#getId <em>Id</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.FunctionLiteralImpl#getParameters_FunctionLiteral <em>
 * Parameters Function Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionLiteralImpl extends AtomImpl implements FunctionLiteral {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected FunctionLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.FUNCTION_LITERAL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getId() {
        return (String) this.eDynamicGet(StoexPackage.FUNCTION_LITERAL__ID, StoexPackage.Literals.FUNCTION_LITERAL__ID,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setId(final String newId) {
        this.eDynamicSet(StoexPackage.FUNCTION_LITERAL__ID, StoexPackage.Literals.FUNCTION_LITERAL__ID, newId);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Expression> getParameters_FunctionLiteral() {
        return (EList<Expression>) this.eDynamicGet(StoexPackage.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL, true, true);
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
        case StoexPackage.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL:
            return ((InternalEList<?>) this.getParameters_FunctionLiteral()).basicRemove(otherEnd, msgs);
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
        case StoexPackage.FUNCTION_LITERAL__ID:
            return this.getId();
        case StoexPackage.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL:
            return this.getParameters_FunctionLiteral();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case StoexPackage.FUNCTION_LITERAL__ID:
            this.setId((String) newValue);
            return;
        case StoexPackage.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL:
            this.getParameters_FunctionLiteral().clear();
            this.getParameters_FunctionLiteral().addAll((Collection<? extends Expression>) newValue);
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
        case StoexPackage.FUNCTION_LITERAL__ID:
            this.setId(ID_EDEFAULT);
            return;
        case StoexPackage.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL:
            this.getParameters_FunctionLiteral().clear();
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
        case StoexPackage.FUNCTION_LITERAL__ID:
            return ID_EDEFAULT == null ? this.getId() != null : !ID_EDEFAULT.equals(this.getId());
        case StoexPackage.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL:
            return !this.getParameters_FunctionLiteral().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // FunctionLiteralImpl
