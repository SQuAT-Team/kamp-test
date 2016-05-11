/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyAssemblyConnector;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModifyAssemblyConnectorImpl#getAssemblyconnector <em>Assemblyconnector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyAssemblyConnectorImpl extends ModificationImpl implements ModifyAssemblyConnector {
	/**
	 * The cached value of the '{@link #getAssemblyconnector() <em>Assemblyconnector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyconnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyConnector assemblyconnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyAssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector getAssemblyconnector() {
		if (assemblyconnector != null && ((EObject)assemblyconnector).eIsProxy()) {
			InternalEObject oldAssemblyconnector = (InternalEObject)assemblyconnector;
			assemblyconnector = (AssemblyConnector)eResolveProxy(oldAssemblyconnector);
			if (assemblyconnector != oldAssemblyconnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, modificationmarksPackage.MODIFY_ASSEMBLY_CONNECTOR__ASSEMBLYCONNECTOR, oldAssemblyconnector, assemblyconnector));
			}
		}
		return assemblyconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector basicGetAssemblyconnector() {
		return assemblyconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyconnector(AssemblyConnector newAssemblyconnector) {
		AssemblyConnector oldAssemblyconnector = assemblyconnector;
		assemblyconnector = newAssemblyconnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modificationmarksPackage.MODIFY_ASSEMBLY_CONNECTOR__ASSEMBLYCONNECTOR, oldAssemblyconnector, assemblyconnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case modificationmarksPackage.MODIFY_ASSEMBLY_CONNECTOR__ASSEMBLYCONNECTOR:
				if (resolve) return getAssemblyconnector();
				return basicGetAssemblyconnector();
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
			case modificationmarksPackage.MODIFY_ASSEMBLY_CONNECTOR__ASSEMBLYCONNECTOR:
				setAssemblyconnector((AssemblyConnector)newValue);
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
			case modificationmarksPackage.MODIFY_ASSEMBLY_CONNECTOR__ASSEMBLYCONNECTOR:
				setAssemblyconnector((AssemblyConnector)null);
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
			case modificationmarksPackage.MODIFY_ASSEMBLY_CONNECTOR__ASSEMBLYCONNECTOR:
				return assemblyconnector != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifyAssemblyConnectorImpl
