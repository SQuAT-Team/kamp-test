/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.impl;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.Deployment;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.LogicalRepresentation;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.PhysicalRepresentation;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.Testing;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getSourceFileAggregations <em>Source File Aggregations</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getBuildConfigurations <em>Build Configurations</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getRuntimeInstances <em>Runtime Instances</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getTestCaseAggregations <em>Test Case Aggregations</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getDesignPatternRoles <em>Design Pattern Roles</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getTechnologicalCorrespondences <em>Technological Correspondences</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl#getStaffAssignment <em>Staff Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldOfActivityAnnotationsRepositoryImpl extends EObjectImpl implements FieldOfActivityAnnotationsRepository {
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
	 * The cached value of the '{@link #getBuildConfigurations() <em>Build Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildConfiguration> buildConfigurations;

	/**
	 * The cached value of the '{@link #getRuntimeInstances() <em>Runtime Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeInstance> runtimeInstances;

	/**
	 * The cached value of the '{@link #getRuntimeInstanceAggregations() <em>Runtime Instance Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInstanceAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeInstanceAggregation> runtimeInstanceAggregations;

	/**
	 * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testCases;

	/**
	 * The cached value of the '{@link #getTestCaseAggregations() <em>Test Case Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCaseAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCaseAggregation> testCaseAggregations;

	/**
	 * The cached value of the '{@link #getDesignPatternRoles() <em>Design Pattern Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignPatternRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignPatternRole> designPatternRoles;

	/**
	 * The cached value of the '{@link #getTechnologicalCorrespondences() <em>Technological Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologicalCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<TechnologicalCorrespondence> technologicalCorrespondences;

	/**
	 * The cached value of the '{@link #getStaffAssignment() <em>Staff Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffAssignment> staffAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfActivityAnnotationsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceFile> getSourceFiles() {
		if (sourceFiles == null) {
			sourceFiles = new EObjectContainmentEList<SourceFile>(SourceFile.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILES);
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
			sourceFileAggregations = new EObjectContainmentEList<SourceFileAggregation>(SourceFileAggregation.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILE_AGGREGATIONS);
		}
		return sourceFileAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildConfiguration> getBuildConfigurations() {
		if (buildConfigurations == null) {
			buildConfigurations = new EObjectContainmentEList<BuildConfiguration>(BuildConfiguration.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_CONFIGURATIONS);
		}
		return buildConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeInstance> getRuntimeInstances() {
		if (runtimeInstances == null) {
			runtimeInstances = new EObjectContainmentEList<RuntimeInstance>(RuntimeInstance.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCES);
		}
		return runtimeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeInstanceAggregation> getRuntimeInstanceAggregations() {
		if (runtimeInstanceAggregations == null) {
			runtimeInstanceAggregations = new EObjectContainmentEList<RuntimeInstanceAggregation>(RuntimeInstanceAggregation.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCE_AGGREGATIONS);
		}
		return runtimeInstanceAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestCases() {
		if (testCases == null) {
			testCases = new EObjectContainmentEList<TestCase>(TestCase.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASES);
		}
		return testCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCaseAggregation> getTestCaseAggregations() {
		if (testCaseAggregations == null) {
			testCaseAggregations = new EObjectContainmentEList<TestCaseAggregation>(TestCaseAggregation.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASE_AGGREGATIONS);
		}
		return testCaseAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignPatternRole> getDesignPatternRoles() {
		if (designPatternRoles == null) {
			designPatternRoles = new EObjectContainmentEList<DesignPatternRole>(DesignPatternRole.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_ROLES);
		}
		return designPatternRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TechnologicalCorrespondence> getTechnologicalCorrespondences() {
		if (technologicalCorrespondences == null) {
			technologicalCorrespondences = new EObjectContainmentEList<TechnologicalCorrespondence>(TechnologicalCorrespondence.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGICAL_CORRESPONDENCES);
		}
		return technologicalCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffAssignment> getStaffAssignment() {
		if (staffAssignment == null) {
			staffAssignment = new EObjectContainmentEList<StaffAssignment>(StaffAssignment.class, this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_ASSIGNMENT);
		}
		return staffAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILES:
				return ((InternalEList<?>)getSourceFiles()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILE_AGGREGATIONS:
				return ((InternalEList<?>)getSourceFileAggregations()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_CONFIGURATIONS:
				return ((InternalEList<?>)getBuildConfigurations()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCES:
				return ((InternalEList<?>)getRuntimeInstances()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCE_AGGREGATIONS:
				return ((InternalEList<?>)getRuntimeInstanceAggregations()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASES:
				return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASE_AGGREGATIONS:
				return ((InternalEList<?>)getTestCaseAggregations()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_ROLES:
				return ((InternalEList<?>)getDesignPatternRoles()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGICAL_CORRESPONDENCES:
				return ((InternalEList<?>)getTechnologicalCorrespondences()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_ASSIGNMENT:
				return ((InternalEList<?>)getStaffAssignment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILES:
				return getSourceFiles();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILE_AGGREGATIONS:
				return getSourceFileAggregations();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_CONFIGURATIONS:
				return getBuildConfigurations();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCES:
				return getRuntimeInstances();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCE_AGGREGATIONS:
				return getRuntimeInstanceAggregations();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASES:
				return getTestCases();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASE_AGGREGATIONS:
				return getTestCaseAggregations();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_ROLES:
				return getDesignPatternRoles();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGICAL_CORRESPONDENCES:
				return getTechnologicalCorrespondences();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_ASSIGNMENT:
				return getStaffAssignment();
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
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILES:
				getSourceFiles().clear();
				getSourceFiles().addAll((Collection<? extends SourceFile>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILE_AGGREGATIONS:
				getSourceFileAggregations().clear();
				getSourceFileAggregations().addAll((Collection<? extends SourceFileAggregation>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				getBuildConfigurations().addAll((Collection<? extends BuildConfiguration>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCES:
				getRuntimeInstances().clear();
				getRuntimeInstances().addAll((Collection<? extends RuntimeInstance>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCE_AGGREGATIONS:
				getRuntimeInstanceAggregations().clear();
				getRuntimeInstanceAggregations().addAll((Collection<? extends RuntimeInstanceAggregation>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASES:
				getTestCases().clear();
				getTestCases().addAll((Collection<? extends TestCase>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASE_AGGREGATIONS:
				getTestCaseAggregations().clear();
				getTestCaseAggregations().addAll((Collection<? extends TestCaseAggregation>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_ROLES:
				getDesignPatternRoles().clear();
				getDesignPatternRoles().addAll((Collection<? extends DesignPatternRole>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGICAL_CORRESPONDENCES:
				getTechnologicalCorrespondences().clear();
				getTechnologicalCorrespondences().addAll((Collection<? extends TechnologicalCorrespondence>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_ASSIGNMENT:
				getStaffAssignment().clear();
				getStaffAssignment().addAll((Collection<? extends StaffAssignment>)newValue);
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
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILES:
				getSourceFiles().clear();
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILE_AGGREGATIONS:
				getSourceFileAggregations().clear();
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCES:
				getRuntimeInstances().clear();
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCE_AGGREGATIONS:
				getRuntimeInstanceAggregations().clear();
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASES:
				getTestCases().clear();
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASE_AGGREGATIONS:
				getTestCaseAggregations().clear();
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_ROLES:
				getDesignPatternRoles().clear();
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGICAL_CORRESPONDENCES:
				getTechnologicalCorrespondences().clear();
				return;
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_ASSIGNMENT:
				getStaffAssignment().clear();
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
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILES:
				return sourceFiles != null && !sourceFiles.isEmpty();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILE_AGGREGATIONS:
				return sourceFileAggregations != null && !sourceFileAggregations.isEmpty();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_CONFIGURATIONS:
				return buildConfigurations != null && !buildConfigurations.isEmpty();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCES:
				return runtimeInstances != null && !runtimeInstances.isEmpty();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCE_AGGREGATIONS:
				return runtimeInstanceAggregations != null && !runtimeInstanceAggregations.isEmpty();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASES:
				return testCases != null && !testCases.isEmpty();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASE_AGGREGATIONS:
				return testCaseAggregations != null && !testCaseAggregations.isEmpty();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_ROLES:
				return designPatternRoles != null && !designPatternRoles.isEmpty();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGICAL_CORRESPONDENCES:
				return technologicalCorrespondences != null && !technologicalCorrespondences.isEmpty();
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_ASSIGNMENT:
				return staffAssignment != null && !staffAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FieldOfActivityAnnotationsRepositoryImpl
