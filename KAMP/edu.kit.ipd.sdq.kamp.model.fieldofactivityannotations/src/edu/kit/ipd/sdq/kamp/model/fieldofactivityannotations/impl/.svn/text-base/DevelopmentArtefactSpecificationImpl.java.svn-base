/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.MetadataFile;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.MetadataFileAggregation;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.SourceFile;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.SourceFileAggregation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Development Artefact Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.DevelopmentArtefactSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.DevelopmentArtefactSpecificationImpl#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.DevelopmentArtefactSpecificationImpl#getSourceFileAggregations <em>Source File Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.DevelopmentArtefactSpecificationImpl#getMetadataFiles <em>Metadata Files</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.DevelopmentArtefactSpecificationImpl#getMetadataFileAggregations <em>Metadata File Aggregations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevelopmentArtefactSpecificationImpl extends EObjectImpl implements DevelopmentArtefactSpecification {
	/**
	 * The cached value of the '{@link #getSourceFiles() <em>Source Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceFile> sourceFiles;

	/**
	 * The cached value of the '{@link #getSourceFileAggregations() <em>Source File Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFileAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceFileAggregation> sourceFileAggregations;

	/**
	 * The cached value of the '{@link #getMetadataFiles() <em>Metadata Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataFile> metadataFiles;

	/**
	 * The cached value of the '{@link #getMetadataFileAggregations() <em>Metadata File Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFileAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataFileAggregation> metadataFileAggregations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentArtefactSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.DEVELOPMENT_ARTEFACT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository getParent() {
		if (eContainerFeatureID() != FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationRepository)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceFile> getSourceFiles() {
		if (sourceFiles == null) {
			sourceFiles = new EObjectContainmentWithInverseEList<SourceFile>(SourceFile.class, this, FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES, FieldofactivityannotationsPackage.SOURCE_FILE__PARENT);
		}
		return sourceFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceFileAggregation> getSourceFileAggregations() {
		if (sourceFileAggregations == null) {
			sourceFileAggregations = new EObjectContainmentWithInverseEList<SourceFileAggregation>(SourceFileAggregation.class, this, FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS, FieldofactivityannotationsPackage.SOURCE_FILE_AGGREGATION__PARENT);
		}
		return sourceFileAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetadataFile> getMetadataFiles() {
		if (metadataFiles == null) {
			metadataFiles = new EObjectContainmentWithInverseEList<MetadataFile>(MetadataFile.class, this, FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES, FieldofactivityannotationsPackage.METADATA_FILE__PARENT);
		}
		return metadataFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetadataFileAggregation> getMetadataFileAggregations() {
		if (metadataFileAggregations == null) {
			metadataFileAggregations = new EObjectContainmentWithInverseEList<MetadataFileAggregation>(MetadataFileAggregation.class, this, FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS, FieldofactivityannotationsPackage.METADATA_FILE_AGGREGATION__PARENT);
		}
		return metadataFileAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((FieldOfActivityAnnotationRepository)otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceFiles()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceFileAggregations()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetadataFiles()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetadataFileAggregations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return ((InternalEList<?>)getSourceFiles()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return ((InternalEList<?>)getSourceFileAggregations()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return ((InternalEList<?>)getMetadataFiles()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return ((InternalEList<?>)getMetadataFileAggregations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return getParent();
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return getSourceFiles();
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return getSourceFileAggregations();
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return getMetadataFiles();
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return getMetadataFileAggregations();
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
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)newValue);
				return;
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				getSourceFiles().clear();
				getSourceFiles().addAll((Collection<? extends SourceFile>)newValue);
				return;
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				getSourceFileAggregations().clear();
				getSourceFileAggregations().addAll((Collection<? extends SourceFileAggregation>)newValue);
				return;
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				getMetadataFiles().clear();
				getMetadataFiles().addAll((Collection<? extends MetadataFile>)newValue);
				return;
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				getMetadataFileAggregations().clear();
				getMetadataFileAggregations().addAll((Collection<? extends MetadataFileAggregation>)newValue);
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
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)null);
				return;
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				getSourceFiles().clear();
				return;
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				getSourceFileAggregations().clear();
				return;
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				getMetadataFiles().clear();
				return;
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				getMetadataFileAggregations().clear();
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
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return getParent() != null;
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return sourceFiles != null && !sourceFiles.isEmpty();
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return sourceFileAggregations != null && !sourceFileAggregations.isEmpty();
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return metadataFiles != null && !metadataFiles.isEmpty();
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return metadataFileAggregations != null && !metadataFileAggregations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DevelopmentArtefactSpecificationImpl
