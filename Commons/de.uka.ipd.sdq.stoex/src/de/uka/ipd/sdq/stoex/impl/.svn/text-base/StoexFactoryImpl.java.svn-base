/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.stoex.BoolLiteral;
import de.uka.ipd.sdq.stoex.BooleanOperations;
import de.uka.ipd.sdq.stoex.BooleanOperatorExpression;
import de.uka.ipd.sdq.stoex.CompareExpression;
import de.uka.ipd.sdq.stoex.CompareOperations;
import de.uka.ipd.sdq.stoex.DoubleLiteral;
import de.uka.ipd.sdq.stoex.FunctionLiteral;
import de.uka.ipd.sdq.stoex.IfElseExpression;
import de.uka.ipd.sdq.stoex.IntLiteral;
import de.uka.ipd.sdq.stoex.NamespaceReference;
import de.uka.ipd.sdq.stoex.NegativeExpression;
import de.uka.ipd.sdq.stoex.NotExpression;
import de.uka.ipd.sdq.stoex.Parenthesis;
import de.uka.ipd.sdq.stoex.PowerExpression;
import de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral;
import de.uka.ipd.sdq.stoex.ProductExpression;
import de.uka.ipd.sdq.stoex.ProductOperations;
import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.StringLiteral;
import de.uka.ipd.sdq.stoex.TermExpression;
import de.uka.ipd.sdq.stoex.TermOperations;
import de.uka.ipd.sdq.stoex.Variable;
import de.uka.ipd.sdq.stoex.VariableReference;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class StoexFactoryImpl extends EFactoryImpl implements StoexFactory {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static StoexFactory init() {
        try {
            final StoexFactory theStoexFactory = (StoexFactory) EPackage.Registry.INSTANCE
                    .getEFactory(StoexPackage.eNS_URI);
            if (theStoexFactory != null) {
                return theStoexFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StoexFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StoexFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case StoexPackage.VARIABLE_REFERENCE:
            return this.createVariableReference();
        case StoexPackage.NAMESPACE_REFERENCE:
            return this.createNamespaceReference();
        case StoexPackage.VARIABLE:
            return this.createVariable();
        case StoexPackage.TERM_EXPRESSION:
            return this.createTermExpression();
        case StoexPackage.PRODUCT_EXPRESSION:
            return this.createProductExpression();
        case StoexPackage.PROBABILITY_FUNCTION_LITERAL:
            return this.createProbabilityFunctionLiteral();
        case StoexPackage.PARENTHESIS:
            return this.createParenthesis();
        case StoexPackage.INT_LITERAL:
            return this.createIntLiteral();
        case StoexPackage.DOUBLE_LITERAL:
            return this.createDoubleLiteral();
        case StoexPackage.COMPARE_EXPRESSION:
            return this.createCompareExpression();
        case StoexPackage.BOOL_LITERAL:
            return this.createBoolLiteral();
        case StoexPackage.STRING_LITERAL:
            return this.createStringLiteral();
        case StoexPackage.POWER_EXPRESSION:
            return this.createPowerExpression();
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION:
            return this.createBooleanOperatorExpression();
        case StoexPackage.NOT_EXPRESSION:
            return this.createNotExpression();
        case StoexPackage.NEGATIVE_EXPRESSION:
            return this.createNegativeExpression();
        case StoexPackage.FUNCTION_LITERAL:
            return this.createFunctionLiteral();
        case StoexPackage.IF_ELSE_EXPRESSION:
            return this.createIfElseExpression();
        case StoexPackage.RANDOM_VARIABLE:
            return this.createRandomVariable();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case StoexPackage.TERM_OPERATIONS:
            return this.createTermOperationsFromString(eDataType, initialValue);
        case StoexPackage.PRODUCT_OPERATIONS:
            return this.createProductOperationsFromString(eDataType, initialValue);
        case StoexPackage.COMPARE_OPERATIONS:
            return this.createCompareOperationsFromString(eDataType, initialValue);
        case StoexPackage.BOOLEAN_OPERATIONS:
            return this.createBooleanOperationsFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case StoexPackage.TERM_OPERATIONS:
            return this.convertTermOperationsToString(eDataType, instanceValue);
        case StoexPackage.PRODUCT_OPERATIONS:
            return this.convertProductOperationsToString(eDataType, instanceValue);
        case StoexPackage.COMPARE_OPERATIONS:
            return this.convertCompareOperationsToString(eDataType, instanceValue);
        case StoexPackage.BOOLEAN_OPERATIONS:
            return this.convertBooleanOperationsToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public VariableReference createVariableReference() {
        final VariableReferenceImpl variableReference = new VariableReferenceImpl();
        return variableReference;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NamespaceReference createNamespaceReference() {
        final NamespaceReferenceImpl namespaceReference = new NamespaceReferenceImpl();
        return namespaceReference;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Variable createVariable() {
        final VariableImpl variable = new VariableImpl();
        return variable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public TermExpression createTermExpression() {
        final TermExpressionImpl termExpression = new TermExpressionImpl();
        return termExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public RandomVariable createRandomVariable() {
        final RandomVariableImpl randomVariable = new RandomVariableImpl();
        return randomVariable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProductExpression createProductExpression() {
        final ProductExpressionImpl productExpression = new ProductExpressionImpl();
        return productExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProbabilityFunctionLiteral createProbabilityFunctionLiteral() {
        final ProbabilityFunctionLiteralImpl probabilityFunctionLiteral = new ProbabilityFunctionLiteralImpl();
        return probabilityFunctionLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Parenthesis createParenthesis() {
        final ParenthesisImpl parenthesis = new ParenthesisImpl();
        return parenthesis;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public IntLiteral createIntLiteral() {
        final IntLiteralImpl intLiteral = new IntLiteralImpl();
        return intLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DoubleLiteral createDoubleLiteral() {
        final DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
        return doubleLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CompareExpression createCompareExpression() {
        final CompareExpressionImpl compareExpression = new CompareExpressionImpl();
        return compareExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BoolLiteral createBoolLiteral() {
        final BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
        return boolLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public StringLiteral createStringLiteral() {
        final StringLiteralImpl stringLiteral = new StringLiteralImpl();
        return stringLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PowerExpression createPowerExpression() {
        final PowerExpressionImpl powerExpression = new PowerExpressionImpl();
        return powerExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BooleanOperatorExpression createBooleanOperatorExpression() {
        final BooleanOperatorExpressionImpl booleanOperatorExpression = new BooleanOperatorExpressionImpl();
        return booleanOperatorExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotExpression createNotExpression() {
        final NotExpressionImpl notExpression = new NotExpressionImpl();
        return notExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NegativeExpression createNegativeExpression() {
        final NegativeExpressionImpl negativeExpression = new NegativeExpressionImpl();
        return negativeExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FunctionLiteral createFunctionLiteral() {
        final FunctionLiteralImpl functionLiteral = new FunctionLiteralImpl();
        return functionLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public IfElseExpression createIfElseExpression() {
        final IfElseExpressionImpl ifElseExpression = new IfElseExpressionImpl();
        return ifElseExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TermOperations createTermOperationsFromString(final EDataType eDataType, final String initialValue) {
        final TermOperations result = TermOperations.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertTermOperationsToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProductOperations createProductOperationsFromString(final EDataType eDataType, final String initialValue) {
        final ProductOperations result = ProductOperations.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertProductOperationsToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CompareOperations createCompareOperationsFromString(final EDataType eDataType, final String initialValue) {
        final CompareOperations result = CompareOperations.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertCompareOperationsToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public BooleanOperations createBooleanOperationsFromString(final EDataType eDataType, final String initialValue) {
        final BooleanOperations result = BooleanOperations.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertBooleanOperationsToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public StoexPackage getStoexPackage() {
        return (StoexPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StoexPackage getPackage() {
        return StoexPackage.eINSTANCE;
    }

} // StoexFactoryImpl
