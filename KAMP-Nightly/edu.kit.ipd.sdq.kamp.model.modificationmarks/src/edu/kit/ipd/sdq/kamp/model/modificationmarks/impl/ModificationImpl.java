/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.Modification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationImpl#isToolderived <em>Toolderived</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationImpl#getUserDecision <em>User Decision</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModificationImpl extends EObjectImpl implements Modification {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isToolderived() <em>Toolderived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToolderived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOOLDERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToolderived() <em>Toolderived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToolderived()
	 * @generated
	 * @ordered
	 */
	protected boolean toolderived = TOOLDERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDecision() <em>User Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDecision()
	 * @generated
	 * @ordered
	 */
	protected static final AcceptanceAndConfirmationState USER_DECISION_EDEFAULT = AcceptanceAndConfirmationState.NODECISION;

	/**
	 * The cached value of the '{@link #getUserDecision() <em>User Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDecision()
	 * @generated
	 * @ordered
	 */
	protected AcceptanceAndConfirmationState userDecision = USER_DECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected ModificationImpl() {
		super();
		setId(EcoreUtil.generateUUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modificationmarksPackage.MODIFICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToolderived() {
		return toolderived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolderived(boolean newToolderived) {
		boolean oldToolderived = toolderived;
		toolderived = newToolderived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modificationmarksPackage.MODIFICATION__TOOLDERIVED, oldToolderived, toolderived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceAndConfirmationState getUserDecision() {
		return userDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDecision(AcceptanceAndConfirmationState newUserDecision) {
		AcceptanceAndConfirmationState oldUserDecision = userDecision;
		userDecision = newUserDecision == null ? USER_DECISION_EDEFAULT : newUserDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modificationmarksPackage.MODIFICATION__USER_DECISION, oldUserDecision, userDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case modificationmarksPackage.MODIFICATION__ID:
				return getId();
			case modificationmarksPackage.MODIFICATION__TOOLDERIVED:
				return isToolderived();
			case modificationmarksPackage.MODIFICATION__USER_DECISION:
				return getUserDecision();
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
			case modificationmarksPackage.MODIFICATION__ID:
				setId((String)newValue);
				return;
			case modificationmarksPackage.MODIFICATION__TOOLDERIVED:
				setToolderived((Boolean)newValue);
				return;
			case modificationmarksPackage.MODIFICATION__USER_DECISION:
				setUserDecision((AcceptanceAndConfirmationState)newValue);
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
			case modificationmarksPackage.MODIFICATION__ID:
				setId(ID_EDEFAULT);
				return;
			case modificationmarksPackage.MODIFICATION__TOOLDERIVED:
				setToolderived(TOOLDERIVED_EDEFAULT);
				return;
			case modificationmarksPackage.MODIFICATION__USER_DECISION:
				setUserDecision(USER_DECISION_EDEFAULT);
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
			case modificationmarksPackage.MODIFICATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case modificationmarksPackage.MODIFICATION__TOOLDERIVED:
				return toolderived != TOOLDERIVED_EDEFAULT;
			case modificationmarksPackage.MODIFICATION__USER_DECISION:
				return userDecision != USER_DECISION_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", toolderived: ");
		result.append(toolderived);
		result.append(", userDecision: ");
		result.append(userDecision);
		result.append(')');
		return result.toString();
	}

} //ModificationImpl
