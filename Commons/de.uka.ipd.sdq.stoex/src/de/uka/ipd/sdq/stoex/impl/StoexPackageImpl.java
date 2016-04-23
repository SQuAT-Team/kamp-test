/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.Atom;
import de.uka.ipd.sdq.stoex.BoolLiteral;
import de.uka.ipd.sdq.stoex.BooleanExpression;
import de.uka.ipd.sdq.stoex.BooleanOperations;
import de.uka.ipd.sdq.stoex.BooleanOperatorExpression;
import de.uka.ipd.sdq.stoex.CompareExpression;
import de.uka.ipd.sdq.stoex.CompareOperations;
import de.uka.ipd.sdq.stoex.Comparison;
import de.uka.ipd.sdq.stoex.DoubleLiteral;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.FunctionLiteral;
import de.uka.ipd.sdq.stoex.IfElse;
import de.uka.ipd.sdq.stoex.IfElseExpression;
import de.uka.ipd.sdq.stoex.IntLiteral;
import de.uka.ipd.sdq.stoex.NamespaceReference;
import de.uka.ipd.sdq.stoex.NegativeExpression;
import de.uka.ipd.sdq.stoex.NotExpression;
import de.uka.ipd.sdq.stoex.NumericLiteral;
import de.uka.ipd.sdq.stoex.Parenthesis;
import de.uka.ipd.sdq.stoex.Power;
import de.uka.ipd.sdq.stoex.PowerExpression;
import de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral;
import de.uka.ipd.sdq.stoex.Product;
import de.uka.ipd.sdq.stoex.ProductExpression;
import de.uka.ipd.sdq.stoex.ProductOperations;
import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.StringLiteral;
import de.uka.ipd.sdq.stoex.Term;
import de.uka.ipd.sdq.stoex.TermExpression;
import de.uka.ipd.sdq.stoex.TermOperations;
import de.uka.ipd.sdq.stoex.Unary;
import de.uka.ipd.sdq.stoex.Variable;
import de.uka.ipd.sdq.stoex.VariableReference;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class StoexPackageImpl extends EPackageImpl implements StoexPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass variableReferenceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass abstractNamedReferenceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass namespaceReferenceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass variableEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass atomEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass unaryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass powerEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass productEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass termEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass comparisonEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass booleanExpressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass ifElseEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass expressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass termExpressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass randomVariableEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass productExpressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass probabilityFunctionLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass parenthesisEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass numericLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass intLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass doubleLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass compareExpressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass boolLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass stringLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass powerExpressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass booleanOperatorExpressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass notExpressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass negativeExpressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass functionLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass ifElseExpressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum termOperationsEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum productOperationsEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum compareOperationsEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum booleanOperationsEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.uka.ipd.sdq.stoex.StoexPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private StoexPackageImpl() {
        super(eNS_URI, StoexFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link StoexPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to
     * obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static StoexPackage init() {
        if (isInited) {
            return (StoexPackage) EPackage.Registry.INSTANCE.getEPackage(StoexPackage.eNS_URI);
        }

        // Obtain or create and register package
        final StoexPackageImpl theStoexPackage = (StoexPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StoexPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new StoexPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ProbfunctionPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theStoexPackage.createPackageContents();

        // Initialize created meta-data
        theStoexPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theStoexPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(StoexPackage.eNS_URI, theStoexPackage);
        return theStoexPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getVariableReference() {
        return this.variableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getAbstractNamedReference() {
        return this.abstractNamedReferenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getAbstractNamedReference_ReferenceName() {
        return (EAttribute) this.abstractNamedReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNamespaceReference() {
        return this.namespaceReferenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNamespaceReference_InnerReference_NamespaceReference() {
        return (EReference) this.namespaceReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getVariable() {
        return this.variableEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getVariable_Id_Variable() {
        return (EReference) this.variableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getAtom() {
        return this.atomEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getUnary() {
        return this.unaryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getPower() {
        return this.powerEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProduct() {
        return this.productEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getTerm() {
        return this.termEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getComparison() {
        return this.comparisonEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBooleanExpression() {
        return this.booleanExpressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIfElse() {
        return this.ifElseEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getExpression() {
        return this.expressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getTermExpression() {
        return this.termExpressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getTermExpression_Left() {
        return (EReference) this.termExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getTermExpression_Right() {
        return (EReference) this.termExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getTermExpression_Operation() {
        return (EAttribute) this.termExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getRandomVariable() {
        return this.randomVariableEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getRandomVariable_Specification() {
        return (EAttribute) this.randomVariableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRandomVariable_Expression() {
        return (EReference) this.randomVariableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProductExpression() {
        return this.productExpressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getProductExpression_Left() {
        return (EReference) this.productExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getProductExpression_Right() {
        return (EReference) this.productExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getProductExpression_Operation() {
        return (EAttribute) this.productExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProbabilityFunctionLiteral() {
        return this.probabilityFunctionLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getProbabilityFunctionLiteral_Function_ProbabilityFunctionLiteral() {
        return (EReference) this.probabilityFunctionLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getParenthesis() {
        return this.parenthesisEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getParenthesis_InnerExpression() {
        return (EReference) this.parenthesisEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNumericLiteral() {
        return this.numericLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIntLiteral() {
        return this.intLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getIntLiteral_Value() {
        return (EAttribute) this.intLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDoubleLiteral() {
        return this.doubleLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleLiteral_Value() {
        return (EAttribute) this.doubleLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getCompareExpression() {
        return this.compareExpressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getCompareExpression_Left() {
        return (EReference) this.compareExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getCompareExpression_Right() {
        return (EReference) this.compareExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getCompareExpression_Operation() {
        return (EAttribute) this.compareExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBoolLiteral() {
        return this.boolLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getBoolLiteral_Value() {
        return (EAttribute) this.boolLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getStringLiteral() {
        return this.stringLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getStringLiteral_Value() {
        return (EAttribute) this.stringLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getPowerExpression() {
        return this.powerExpressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getPowerExpression_Base() {
        return (EReference) this.powerExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getPowerExpression_Exponent() {
        return (EReference) this.powerExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBooleanOperatorExpression() {
        return this.booleanOperatorExpressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getBooleanOperatorExpression_Left() {
        return (EReference) this.booleanOperatorExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getBooleanOperatorExpression_Right() {
        return (EReference) this.booleanOperatorExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getBooleanOperatorExpression_Operation() {
        return (EAttribute) this.booleanOperatorExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNotExpression() {
        return this.notExpressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNotExpression_Inner() {
        return (EReference) this.notExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNegativeExpression() {
        return this.negativeExpressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNegativeExpression_Inner() {
        return (EReference) this.negativeExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFunctionLiteral() {
        return this.functionLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getFunctionLiteral_Id() {
        return (EAttribute) this.functionLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFunctionLiteral_Parameters_FunctionLiteral() {
        return (EReference) this.functionLiteralEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIfElseExpression() {
        return this.ifElseExpressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getIfElseExpression_IfExpression() {
        return (EReference) this.ifElseExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getIfElseExpression_ElseExpression() {
        return (EReference) this.ifElseExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getIfElseExpression_ConditionExpression() {
        return (EReference) this.ifElseExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getTermOperations() {
        return this.termOperationsEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getProductOperations() {
        return this.productOperationsEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getCompareOperations() {
        return this.compareOperationsEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getBooleanOperations() {
        return this.booleanOperationsEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public StoexFactory getStoexFactory() {
        return (StoexFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.variableReferenceEClass = this.createEClass(VARIABLE_REFERENCE);

        this.abstractNamedReferenceEClass = this.createEClass(ABSTRACT_NAMED_REFERENCE);
        this.createEAttribute(this.abstractNamedReferenceEClass, ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME);

        this.namespaceReferenceEClass = this.createEClass(NAMESPACE_REFERENCE);
        this.createEReference(this.namespaceReferenceEClass, NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE);

        this.variableEClass = this.createEClass(VARIABLE);
        this.createEReference(this.variableEClass, VARIABLE__ID_VARIABLE);

        this.atomEClass = this.createEClass(ATOM);

        this.unaryEClass = this.createEClass(UNARY);

        this.powerEClass = this.createEClass(POWER);

        this.productEClass = this.createEClass(PRODUCT);

        this.termEClass = this.createEClass(TERM);

        this.comparisonEClass = this.createEClass(COMPARISON);

        this.booleanExpressionEClass = this.createEClass(BOOLEAN_EXPRESSION);

        this.ifElseEClass = this.createEClass(IF_ELSE);

        this.expressionEClass = this.createEClass(EXPRESSION);

        this.termExpressionEClass = this.createEClass(TERM_EXPRESSION);
        this.createEReference(this.termExpressionEClass, TERM_EXPRESSION__LEFT);
        this.createEReference(this.termExpressionEClass, TERM_EXPRESSION__RIGHT);
        this.createEAttribute(this.termExpressionEClass, TERM_EXPRESSION__OPERATION);

        this.productExpressionEClass = this.createEClass(PRODUCT_EXPRESSION);
        this.createEReference(this.productExpressionEClass, PRODUCT_EXPRESSION__LEFT);
        this.createEReference(this.productExpressionEClass, PRODUCT_EXPRESSION__RIGHT);
        this.createEAttribute(this.productExpressionEClass, PRODUCT_EXPRESSION__OPERATION);

        this.probabilityFunctionLiteralEClass = this.createEClass(PROBABILITY_FUNCTION_LITERAL);
        this.createEReference(this.probabilityFunctionLiteralEClass,
                PROBABILITY_FUNCTION_LITERAL__FUNCTION_PROBABILITY_FUNCTION_LITERAL);

        this.parenthesisEClass = this.createEClass(PARENTHESIS);
        this.createEReference(this.parenthesisEClass, PARENTHESIS__INNER_EXPRESSION);

        this.numericLiteralEClass = this.createEClass(NUMERIC_LITERAL);

        this.intLiteralEClass = this.createEClass(INT_LITERAL);
        this.createEAttribute(this.intLiteralEClass, INT_LITERAL__VALUE);

        this.doubleLiteralEClass = this.createEClass(DOUBLE_LITERAL);
        this.createEAttribute(this.doubleLiteralEClass, DOUBLE_LITERAL__VALUE);

        this.compareExpressionEClass = this.createEClass(COMPARE_EXPRESSION);
        this.createEReference(this.compareExpressionEClass, COMPARE_EXPRESSION__LEFT);
        this.createEReference(this.compareExpressionEClass, COMPARE_EXPRESSION__RIGHT);
        this.createEAttribute(this.compareExpressionEClass, COMPARE_EXPRESSION__OPERATION);

        this.boolLiteralEClass = this.createEClass(BOOL_LITERAL);
        this.createEAttribute(this.boolLiteralEClass, BOOL_LITERAL__VALUE);

        this.stringLiteralEClass = this.createEClass(STRING_LITERAL);
        this.createEAttribute(this.stringLiteralEClass, STRING_LITERAL__VALUE);

        this.powerExpressionEClass = this.createEClass(POWER_EXPRESSION);
        this.createEReference(this.powerExpressionEClass, POWER_EXPRESSION__BASE);
        this.createEReference(this.powerExpressionEClass, POWER_EXPRESSION__EXPONENT);

        this.booleanOperatorExpressionEClass = this.createEClass(BOOLEAN_OPERATOR_EXPRESSION);
        this.createEReference(this.booleanOperatorExpressionEClass, BOOLEAN_OPERATOR_EXPRESSION__LEFT);
        this.createEReference(this.booleanOperatorExpressionEClass, BOOLEAN_OPERATOR_EXPRESSION__RIGHT);
        this.createEAttribute(this.booleanOperatorExpressionEClass, BOOLEAN_OPERATOR_EXPRESSION__OPERATION);

        this.notExpressionEClass = this.createEClass(NOT_EXPRESSION);
        this.createEReference(this.notExpressionEClass, NOT_EXPRESSION__INNER);

        this.negativeExpressionEClass = this.createEClass(NEGATIVE_EXPRESSION);
        this.createEReference(this.negativeExpressionEClass, NEGATIVE_EXPRESSION__INNER);

        this.functionLiteralEClass = this.createEClass(FUNCTION_LITERAL);
        this.createEAttribute(this.functionLiteralEClass, FUNCTION_LITERAL__ID);
        this.createEReference(this.functionLiteralEClass, FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL);

        this.ifElseExpressionEClass = this.createEClass(IF_ELSE_EXPRESSION);
        this.createEReference(this.ifElseExpressionEClass, IF_ELSE_EXPRESSION__IF_EXPRESSION);
        this.createEReference(this.ifElseExpressionEClass, IF_ELSE_EXPRESSION__ELSE_EXPRESSION);
        this.createEReference(this.ifElseExpressionEClass, IF_ELSE_EXPRESSION__CONDITION_EXPRESSION);

        this.randomVariableEClass = this.createEClass(RANDOM_VARIABLE);
        this.createEAttribute(this.randomVariableEClass, RANDOM_VARIABLE__SPECIFICATION);
        this.createEReference(this.randomVariableEClass, RANDOM_VARIABLE__EXPRESSION);

        // Create enums
        this.termOperationsEEnum = this.createEEnum(TERM_OPERATIONS);
        this.productOperationsEEnum = this.createEEnum(PRODUCT_OPERATIONS);
        this.compareOperationsEEnum = this.createEEnum(COMPARE_OPERATIONS);
        this.booleanOperationsEEnum = this.createEEnum(BOOLEAN_OPERATIONS);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final ProbfunctionPackage theProbfunctionPackage = (ProbfunctionPackage) EPackage.Registry.INSTANCE
                .getEPackage(ProbfunctionPackage.eNS_URI);
        final UnitsPackage theUnitsPackage = (UnitsPackage) EPackage.Registry.INSTANCE
                .getEPackage(UnitsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.variableReferenceEClass.getESuperTypes().add(this.getAbstractNamedReference());
        this.namespaceReferenceEClass.getESuperTypes().add(this.getAbstractNamedReference());
        this.variableEClass.getESuperTypes().add(this.getAtom());
        this.atomEClass.getESuperTypes().add(this.getUnary());
        this.unaryEClass.getESuperTypes().add(this.getPower());
        this.powerEClass.getESuperTypes().add(this.getProduct());
        this.productEClass.getESuperTypes().add(this.getTerm());
        this.termEClass.getESuperTypes().add(this.getComparison());
        this.comparisonEClass.getESuperTypes().add(this.getBooleanExpression());
        this.booleanExpressionEClass.getESuperTypes().add(this.getIfElse());
        this.ifElseEClass.getESuperTypes().add(this.getExpression());
        this.termExpressionEClass.getESuperTypes().add(this.getTerm());
        this.productExpressionEClass.getESuperTypes().add(this.getProduct());
        this.probabilityFunctionLiteralEClass.getESuperTypes().add(this.getAtom());
        this.parenthesisEClass.getESuperTypes().add(this.getAtom());
        this.numericLiteralEClass.getESuperTypes().add(theUnitsPackage.getUnitCarryingElement());
        this.numericLiteralEClass.getESuperTypes().add(this.getAtom());
        this.intLiteralEClass.getESuperTypes().add(this.getNumericLiteral());
        this.doubleLiteralEClass.getESuperTypes().add(this.getNumericLiteral());
        this.compareExpressionEClass.getESuperTypes().add(this.getComparison());
        this.boolLiteralEClass.getESuperTypes().add(this.getAtom());
        this.stringLiteralEClass.getESuperTypes().add(this.getAtom());
        this.powerExpressionEClass.getESuperTypes().add(this.getPower());
        this.booleanOperatorExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
        this.notExpressionEClass.getESuperTypes().add(this.getUnary());
        this.negativeExpressionEClass.getESuperTypes().add(this.getUnary());
        this.functionLiteralEClass.getESuperTypes().add(this.getAtom());
        this.ifElseExpressionEClass.getESuperTypes().add(this.getIfElse());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.abstractNamedReferenceEClass, AbstractNamedReference.class, "AbstractNamedReference",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getAbstractNamedReference_ReferenceName(), this.ecorePackage.getEString(),
                "referenceName", null, 1, 1, AbstractNamedReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.namespaceReferenceEClass, NamespaceReference.class, "NamespaceReference", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getNamespaceReference_InnerReference_NamespaceReference(),
                this.getAbstractNamedReference(), null, "innerReference_NamespaceReference", null, 1, 1,
                NamespaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getVariable_Id_Variable(), this.getAbstractNamedReference(), null, "id_Variable",
                null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.atomEClass, Atom.class, "Atom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.unaryEClass, Unary.class, "Unary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.powerEClass, Power.class, "Power", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.productEClass, Product.class, "Product", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.comparisonEClass, Comparison.class, "Comparison", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.ifElseEClass, IfElse.class, "IfElse", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.termExpressionEClass, TermExpression.class, "TermExpression", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getTermExpression_Left(), this.getTerm(), null, "left", null, 1, 1,
                TermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getTermExpression_Right(), this.getProduct(), null, "right", null, 1, 1,
                TermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getTermExpression_Operation(), this.getTermOperations(), "operation", null, 1, 1,
                TermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.productExpressionEClass, ProductExpression.class, "ProductExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getProductExpression_Left(), this.getProduct(), null, "left", null, 1, 1,
                ProductExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getProductExpression_Right(), this.getPower(), null, "right", null, 1, 1,
                ProductExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getProductExpression_Operation(), this.getProductOperations(), "operation", null, 1,
                1, ProductExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.probabilityFunctionLiteralEClass, ProbabilityFunctionLiteral.class,
                "ProbabilityFunctionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getProbabilityFunctionLiteral_Function_ProbabilityFunctionLiteral(),
                theProbfunctionPackage.getProbabilityFunction(), null, "function_ProbabilityFunctionLiteral", null, 1,
                1, ProbabilityFunctionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.parenthesisEClass, Parenthesis.class, "Parenthesis", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getParenthesis_InnerExpression(), this.getExpression(), null, "innerExpression", null,
                1, 1, Parenthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.numericLiteralEClass, NumericLiteral.class, "NumericLiteral", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.intLiteralEClass, IntLiteral.class, "IntLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getIntLiteral_Value(), this.ecorePackage.getEInt(), "value", null, 1, 1,
                IntLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.doubleLiteralEClass, DoubleLiteral.class, "DoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getDoubleLiteral_Value(), this.ecorePackage.getEDouble(), "value", null, 1, 1,
                DoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.compareExpressionEClass, CompareExpression.class, "CompareExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCompareExpression_Left(), this.getTerm(), null, "left", null, 1, 1,
                CompareExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getCompareExpression_Right(), this.getTerm(), null, "right", null, 1, 1,
                CompareExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getCompareExpression_Operation(), this.getCompareOperations(), "operation", null, 1,
                1, CompareExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.boolLiteralEClass, BoolLiteral.class, "BoolLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getBoolLiteral_Value(), this.ecorePackage.getEBoolean(), "value", null, 1, 1,
                BoolLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getStringLiteral_Value(), this.ecorePackage.getEString(), "value", null, 1, 1,
                StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.powerExpressionEClass, PowerExpression.class, "PowerExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getPowerExpression_Base(), this.getPower(), null, "base", null, 1, 1,
                PowerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getPowerExpression_Exponent(), this.getUnary(), null, "exponent", null, 1, 1,
                PowerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.booleanOperatorExpressionEClass, BooleanOperatorExpression.class,
                "BooleanOperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getBooleanOperatorExpression_Left(), this.getBooleanExpression(), null, "left", null,
                1, 1, BooleanOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getBooleanOperatorExpression_Right(), this.getBooleanExpression(), null, "right",
                null, 1, 1, BooleanOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getBooleanOperatorExpression_Operation(), this.getBooleanOperations(), "operation",
                null, 1, 1, BooleanOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getNotExpression_Inner(), this.getUnary(), null, "inner", null, 1, 1,
                NotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.negativeExpressionEClass, NegativeExpression.class, "NegativeExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getNegativeExpression_Inner(), this.getUnary(), null, "inner", null, 1, 1,
                NegativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.functionLiteralEClass, FunctionLiteral.class, "FunctionLiteral", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getFunctionLiteral_Id(), this.ecorePackage.getEString(), "id", null, 1, 1,
                FunctionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getFunctionLiteral_Parameters_FunctionLiteral(), this.getExpression(), null,
                "parameters_FunctionLiteral", null, 0, -1, FunctionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.ifElseExpressionEClass, IfElseExpression.class, "IfElseExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getIfElseExpression_IfExpression(), this.getBooleanExpression(), null, "ifExpression",
                null, 1, 1, IfElseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getIfElseExpression_ElseExpression(), this.getBooleanExpression(), null,
                "elseExpression", null, 1, 1, IfElseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getIfElseExpression_ConditionExpression(), this.getBooleanExpression(), null,
                "conditionExpression", null, 1, 1, IfElseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.randomVariableEClass, RandomVariable.class, "RandomVariable", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getRandomVariable_Specification(), this.ecorePackage.getEString(), "specification",
                null, 1, 1, RandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getRandomVariable_Expression(), this.getExpression(), null, "expression", null, 1, 1,
                RandomVariable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.termOperationsEEnum, TermOperations.class, "TermOperations");
        this.addEEnumLiteral(this.termOperationsEEnum, TermOperations.ADD);
        this.addEEnumLiteral(this.termOperationsEEnum, TermOperations.SUB);

        this.initEEnum(this.productOperationsEEnum, ProductOperations.class, "ProductOperations");
        this.addEEnumLiteral(this.productOperationsEEnum, ProductOperations.MULT);
        this.addEEnumLiteral(this.productOperationsEEnum, ProductOperations.DIV);
        this.addEEnumLiteral(this.productOperationsEEnum, ProductOperations.MOD);

        this.initEEnum(this.compareOperationsEEnum, CompareOperations.class, "CompareOperations");
        this.addEEnumLiteral(this.compareOperationsEEnum, CompareOperations.GREATER);
        this.addEEnumLiteral(this.compareOperationsEEnum, CompareOperations.EQUALS);
        this.addEEnumLiteral(this.compareOperationsEEnum, CompareOperations.LESS);
        this.addEEnumLiteral(this.compareOperationsEEnum, CompareOperations.NOTEQUAL);
        this.addEEnumLiteral(this.compareOperationsEEnum, CompareOperations.LESSEQUAL);
        this.addEEnumLiteral(this.compareOperationsEEnum, CompareOperations.GREATEREQUAL);

        this.initEEnum(this.booleanOperationsEEnum, BooleanOperations.class, "BooleanOperations");
        this.addEEnumLiteral(this.booleanOperationsEEnum, BooleanOperations.AND);
        this.addEEnumLiteral(this.booleanOperationsEEnum, BooleanOperations.OR);
        this.addEEnumLiteral(this.booleanOperationsEEnum, BooleanOperations.XOR);

        // Create resource
        this.createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        this.createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        final String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        this.addAnnotation(this.getRandomVariable_Expression(), source, new String[] { "name", "", "namespace", "" });
    }

} // StoexPackageImpl
