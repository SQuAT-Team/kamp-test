/**
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.impl;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import de.uka.ipd.sdq.pcm.repository.ImplementationComponentType;
import de.uka.ipd.sdq.pcm.repository.ProvidedRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Pattern Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.DesignPatternRoleImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.DesignPatternRoleImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignPatternRoleImpl extends IdentifierImpl implements DesignPatternRole {
	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedRole;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ImplementationComponentType component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignPatternRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldOfActivityAnnotationsPackage.Literals.DESIGN_PATTERN_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getProvidedRole() {
		if (providedRole != null && providedRole.eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject)providedRole;
			providedRole = (ProvidedRole)eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__PROVIDED_ROLE, oldProvidedRole, providedRole));
			}
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetProvidedRole() {
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRole(ProvidedRole newProvidedRole) {
		ProvidedRole oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__PROVIDED_ROLE, oldProvidedRole, providedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationComponentType getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (ImplementationComponentType)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationComponentType basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ImplementationComponentType newComponent) {
		ImplementationComponentType oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__PROVIDED_ROLE:
				if (resolve) return getProvidedRole();
				return basicGetProvidedRole();
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__COMPONENT:
				setComponent((ImplementationComponentType)newValue);
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
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)null);
				return;
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__COMPONENT:
				setComponent((ImplementationComponentType)null);
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
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__PROVIDED_ROLE:
				return providedRole != null;
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //DesignPatternRoleImpl
