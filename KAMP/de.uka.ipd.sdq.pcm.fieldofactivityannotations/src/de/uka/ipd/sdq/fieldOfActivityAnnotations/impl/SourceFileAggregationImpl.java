/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.impl;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.repository.ImplementationComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source File Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileAggregationImpl#getNumberOfSourceFiles <em>Number Of Source Files</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileAggregationImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceFileAggregationImpl extends IdentifierImpl implements SourceFileAggregation {
	/**
	 * The default value of the '{@link #getNumberOfSourceFiles() <em>Number Of Source Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSourceFiles()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SOURCE_FILES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSourceFiles() <em>Number Of Source Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSourceFiles()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSourceFiles = NUMBER_OF_SOURCE_FILES_EDEFAULT;

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
	protected SourceFileAggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldOfActivityAnnotationsPackage.Literals.SOURCE_FILE_AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSourceFiles() {
		return numberOfSourceFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSourceFiles(int newNumberOfSourceFiles) {
		int oldNumberOfSourceFiles = numberOfSourceFiles;
		numberOfSourceFiles = newNumberOfSourceFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__NUMBER_OF_SOURCE_FILES, oldNumberOfSourceFiles, numberOfSourceFiles));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__NUMBER_OF_SOURCE_FILES:
				return getNumberOfSourceFiles();
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__COMPONENT:
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
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__NUMBER_OF_SOURCE_FILES:
				setNumberOfSourceFiles((Integer)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__COMPONENT:
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
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__NUMBER_OF_SOURCE_FILES:
				setNumberOfSourceFiles(NUMBER_OF_SOURCE_FILES_EDEFAULT);
				return;
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__COMPONENT:
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
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__NUMBER_OF_SOURCE_FILES:
				return numberOfSourceFiles != NUMBER_OF_SOURCE_FILES_EDEFAULT;
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION__COMPONENT:
				return component != null;
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
		result.append(" (numberOfSourceFiles: ");
		result.append(numberOfSourceFiles);
		result.append(')');
		return result.toString();
	}

} //SourceFileAggregationImpl
