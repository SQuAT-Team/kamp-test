/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.util;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.*;

import de.uka.ipd.sdq.identifier.Identifier;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage
 * @generated
 */
public class FieldOfActivityAnnotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FieldOfActivityAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FieldOfActivityAnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfActivityAnnotationsSwitch<Adapter> modelSwitch =
		new FieldOfActivityAnnotationsSwitch<Adapter>() {
			@Override
			public Adapter caseFieldOfActivityAnnotationsRepository(FieldOfActivityAnnotationsRepository object) {
				return createFieldOfActivityAnnotationsRepositoryAdapter();
			}
			@Override
			public Adapter caseSourceFile(SourceFile object) {
				return createSourceFileAdapter();
			}
			@Override
			public Adapter caseSourceFileAggregation(SourceFileAggregation object) {
				return createSourceFileAggregationAdapter();
			}
			@Override
			public Adapter caseBuildConfiguration(BuildConfiguration object) {
				return createBuildConfigurationAdapter();
			}
			@Override
			public Adapter caseRuntimeInstance(RuntimeInstance object) {
				return createRuntimeInstanceAdapter();
			}
			@Override
			public Adapter caseRuntimeInstanceAggregation(RuntimeInstanceAggregation object) {
				return createRuntimeInstanceAggregationAdapter();
			}
			@Override
			public Adapter caseTestCase(TestCase object) {
				return createTestCaseAdapter();
			}
			@Override
			public Adapter caseTestCaseAggregation(TestCaseAggregation object) {
				return createTestCaseAggregationAdapter();
			}
			@Override
			public Adapter caseDesignPatternRole(DesignPatternRole object) {
				return createDesignPatternRoleAdapter();
			}
			@Override
			public Adapter caseTechnologicalCorrespondence(TechnologicalCorrespondence object) {
				return createTechnologicalCorrespondenceAdapter();
			}
			@Override
			public Adapter caseStaffAssignment(StaffAssignment object) {
				return createStaffAssignmentAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository
	 * @generated
	 */
	public Adapter createFieldOfActivityAnnotationsRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile
	 * @generated
	 */
	public Adapter createSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation <em>Source File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation
	 * @generated
	 */
	public Adapter createSourceFileAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration <em>Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration
	 * @generated
	 */
	public Adapter createBuildConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance <em>Runtime Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance
	 * @generated
	 */
	public Adapter createRuntimeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation <em>Runtime Instance Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation
	 * @generated
	 */
	public Adapter createRuntimeInstanceAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation <em>Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation
	 * @generated
	 */
	public Adapter createTestCaseAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole <em>Design Pattern Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole
	 * @generated
	 */
	public Adapter createDesignPatternRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence <em>Technological Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence
	 * @generated
	 */
	public Adapter createTechnologicalCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment <em>Staff Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment
	 * @generated
	 */
	public Adapter createStaffAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FieldOfActivityAnnotationsAdapterFactory
