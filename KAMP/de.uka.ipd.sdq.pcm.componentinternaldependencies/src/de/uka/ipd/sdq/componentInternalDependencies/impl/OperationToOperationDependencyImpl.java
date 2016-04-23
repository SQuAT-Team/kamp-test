/**
 */
package de.uka.ipd.sdq.componentInternalDependencies.impl;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage;
import de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import de.uka.ipd.sdq.pcm.repository.Signature;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation To Operation Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.impl.OperationToOperationDependencyImpl#getProvidedSignatures <em>Provided Signatures</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.impl.OperationToOperationDependencyImpl#getRequiredSignatures <em>Required Signatures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationToOperationDependencyImpl extends IdentifierImpl implements OperationToOperationDependency {
	/**
	 * The cached value of the '{@link #getProvidedSignatures() <em>Provided Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> providedSignatures;

	/**
	 * The cached value of the '{@link #getRequiredSignatures() <em>Required Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> requiredSignatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationToOperationDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInternalDependenciesPackage.Literals.OPERATION_TO_OPERATION_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getProvidedSignatures() {
		if (providedSignatures == null) {
			providedSignatures = new EObjectResolvingEList<Signature>(Signature.class, this, ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES);
		}
		return providedSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getRequiredSignatures() {
		if (requiredSignatures == null) {
			requiredSignatures = new EObjectResolvingEList<Signature>(Signature.class, this, ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES);
		}
		return requiredSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES:
				return getProvidedSignatures();
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES:
				return getRequiredSignatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES:
				getProvidedSignatures().clear();
				getProvidedSignatures().addAll((Collection<? extends Signature>)newValue);
				return;
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES:
				getRequiredSignatures().clear();
				getRequiredSignatures().addAll((Collection<? extends Signature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES:
				getProvidedSignatures().clear();
				return;
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES:
				getRequiredSignatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES:
				return providedSignatures != null && !providedSignatures.isEmpty();
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES:
				return requiredSignatures != null && !requiredSignatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationToOperationDependencyImpl
