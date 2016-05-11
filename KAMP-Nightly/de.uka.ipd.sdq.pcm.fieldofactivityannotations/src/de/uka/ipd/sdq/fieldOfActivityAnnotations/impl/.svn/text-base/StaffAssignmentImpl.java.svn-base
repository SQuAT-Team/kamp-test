/**
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.impl;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.palladiosimulator.pcm.repository.ImplementationComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.StaffAssignmentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.StaffAssignmentImpl#getTeamName <em>Team Name</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.StaffAssignmentImpl#getStaffName <em>Staff Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffAssignmentImpl extends IdentifierImpl implements StaffAssignment {
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
	 * The default value of the '{@link #getTeamName() <em>Team Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeamName() <em>Team Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamName()
	 * @generated
	 * @ordered
	 */
	protected String teamName = TEAM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaffName() <em>Staff Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> staffName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldOfActivityAnnotationsPackage.Literals.STAFF_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationComponentType getComponent() {
		if (component != null && ((EObject)component).eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (ImplementationComponentType)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeamName(String newTeamName) {
		String oldTeamName = teamName;
		teamName = newTeamName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__TEAM_NAME, oldTeamName, teamName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStaffName() {
		if (staffName == null) {
			staffName = new EDataTypeUniqueEList<String>(String.class, this, FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__STAFF_NAME);
		}
		return staffName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__TEAM_NAME:
				return getTeamName();
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__STAFF_NAME:
				return getStaffName();
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
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__COMPONENT:
				setComponent((ImplementationComponentType)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__TEAM_NAME:
				setTeamName((String)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__STAFF_NAME:
				getStaffName().clear();
				getStaffName().addAll((Collection<? extends String>)newValue);
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
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__COMPONENT:
				setComponent((ImplementationComponentType)null);
				return;
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__TEAM_NAME:
				setTeamName(TEAM_NAME_EDEFAULT);
				return;
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__STAFF_NAME:
				getStaffName().clear();
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
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__COMPONENT:
				return component != null;
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__TEAM_NAME:
				return TEAM_NAME_EDEFAULT == null ? teamName != null : !TEAM_NAME_EDEFAULT.equals(teamName);
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT__STAFF_NAME:
				return staffName != null && !staffName.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (teamName: ");
		result.append(teamName);
		result.append(", staffName: ");
		result.append(staffName);
		result.append(')');
		return result.toString();
	}

} //StaffAssignmentImpl
