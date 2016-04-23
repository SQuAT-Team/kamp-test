/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.Atom;
import de.uka.ipd.sdq.stoex.BoolLiteral;
import de.uka.ipd.sdq.stoex.BooleanExpression;
import de.uka.ipd.sdq.stoex.BooleanOperatorExpression;
import de.uka.ipd.sdq.stoex.CompareExpression;
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
import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.StringLiteral;
import de.uka.ipd.sdq.stoex.Term;
import de.uka.ipd.sdq.stoex.TermExpression;
import de.uka.ipd.sdq.stoex.Unary;
import de.uka.ipd.sdq.stoex.Variable;
import de.uka.ipd.sdq.stoex.VariableReference;
import de.uka.ipd.sdq.units.UnitCarryingElement;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see de.uka.ipd.sdq.stoex.StoexPackage
 * @generated
 */
public class StoexAdapterFactory extends AdapterFactoryImpl {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static StoexPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StoexAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = StoexPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected StoexSwitch<Adapter> modelSwitch = new StoexSwitch<Adapter>() {

        @Override
        public Adapter caseVariableReference(final VariableReference object) {
            return StoexAdapterFactory.this.createVariableReferenceAdapter();
        }

        @Override
        public Adapter caseAbstractNamedReference(final AbstractNamedReference object) {
            return StoexAdapterFactory.this.createAbstractNamedReferenceAdapter();
        }

        @Override
        public Adapter caseNamespaceReference(final NamespaceReference object) {
            return StoexAdapterFactory.this.createNamespaceReferenceAdapter();
        }

        @Override
        public Adapter caseVariable(final Variable object) {
            return StoexAdapterFactory.this.createVariableAdapter();
        }

        @Override
        public Adapter caseAtom(final Atom object) {
            return StoexAdapterFactory.this.createAtomAdapter();
        }

        @Override
        public Adapter caseUnary(final Unary object) {
            return StoexAdapterFactory.this.createUnaryAdapter();
        }

        @Override
        public Adapter casePower(final Power object) {
            return StoexAdapterFactory.this.createPowerAdapter();
        }

        @Override
        public Adapter caseProduct(final Product object) {
            return StoexAdapterFactory.this.createProductAdapter();
        }

        @Override
        public Adapter caseTerm(final Term object) {
            return StoexAdapterFactory.this.createTermAdapter();
        }

        @Override
        public Adapter caseComparison(final Comparison object) {
            return StoexAdapterFactory.this.createComparisonAdapter();
        }

        @Override
        public Adapter caseBooleanExpression(final BooleanExpression object) {
            return StoexAdapterFactory.this.createBooleanExpressionAdapter();
        }

        @Override
        public Adapter caseIfElse(final IfElse object) {
            return StoexAdapterFactory.this.createIfElseAdapter();
        }

        @Override
        public Adapter caseExpression(final Expression object) {
            return StoexAdapterFactory.this.createExpressionAdapter();
        }

        @Override
        public Adapter caseTermExpression(final TermExpression object) {
            return StoexAdapterFactory.this.createTermExpressionAdapter();
        }

        @Override
        public Adapter caseProductExpression(final ProductExpression object) {
            return StoexAdapterFactory.this.createProductExpressionAdapter();
        }

        @Override
        public Adapter caseProbabilityFunctionLiteral(final ProbabilityFunctionLiteral object) {
            return StoexAdapterFactory.this.createProbabilityFunctionLiteralAdapter();
        }

        @Override
        public Adapter caseParenthesis(final Parenthesis object) {
            return StoexAdapterFactory.this.createParenthesisAdapter();
        }

        @Override
        public Adapter caseNumericLiteral(final NumericLiteral object) {
            return StoexAdapterFactory.this.createNumericLiteralAdapter();
        }

        @Override
        public Adapter caseIntLiteral(final IntLiteral object) {
            return StoexAdapterFactory.this.createIntLiteralAdapter();
        }

        @Override
        public Adapter caseDoubleLiteral(final DoubleLiteral object) {
            return StoexAdapterFactory.this.createDoubleLiteralAdapter();
        }

        @Override
        public Adapter caseCompareExpression(final CompareExpression object) {
            return StoexAdapterFactory.this.createCompareExpressionAdapter();
        }

        @Override
        public Adapter caseBoolLiteral(final BoolLiteral object) {
            return StoexAdapterFactory.this.createBoolLiteralAdapter();
        }

        @Override
        public Adapter caseStringLiteral(final StringLiteral object) {
            return StoexAdapterFactory.this.createStringLiteralAdapter();
        }

        @Override
        public Adapter casePowerExpression(final PowerExpression object) {
            return StoexAdapterFactory.this.createPowerExpressionAdapter();
        }

        @Override
        public Adapter caseBooleanOperatorExpression(final BooleanOperatorExpression object) {
            return StoexAdapterFactory.this.createBooleanOperatorExpressionAdapter();
        }

        @Override
        public Adapter caseNotExpression(final NotExpression object) {
            return StoexAdapterFactory.this.createNotExpressionAdapter();
        }

        @Override
        public Adapter caseNegativeExpression(final NegativeExpression object) {
            return StoexAdapterFactory.this.createNegativeExpressionAdapter();
        }

        @Override
        public Adapter caseFunctionLiteral(final FunctionLiteral object) {
            return StoexAdapterFactory.this.createFunctionLiteralAdapter();
        }

        @Override
        public Adapter caseIfElseExpression(final IfElseExpression object) {
            return StoexAdapterFactory.this.createIfElseExpressionAdapter();
        }

        @Override
        public Adapter caseRandomVariable(final RandomVariable object) {
            return StoexAdapterFactory.this.createRandomVariableAdapter();
        }

        @Override
        public Adapter caseUnitCarryingElement(final UnitCarryingElement object) {
            return StoexAdapterFactory.this.createUnitCarryingElementAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return StoexAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.VariableReference
     * <em>Variable Reference</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.VariableReference
     * @generated
     */
    public Adapter createVariableReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.stoex.AbstractNamedReference <em>Abstract Named Reference</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.AbstractNamedReference
     * @generated
     */
    public Adapter createAbstractNamedReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.NamespaceReference
     * <em>Namespace Reference</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.NamespaceReference
     * @generated
     */
    public Adapter createNamespaceReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.Variable
     * <em>Variable</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.Variable
     * @generated
     */
    public Adapter createVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.Atom <em>Atom</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.Atom
     * @generated
     */
    public Adapter createAtomAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.Unary
     * <em>Unary</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.Unary
     * @generated
     */
    public Adapter createUnaryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.Power
     * <em>Power</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.Power
     * @generated
     */
    public Adapter createPowerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.Product
     * <em>Product</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.Product
     * @generated
     */
    public Adapter createProductAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.Term <em>Term</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.Term
     * @generated
     */
    public Adapter createTermAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.Comparison
     * <em>Comparison</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.Comparison
     * @generated
     */
    public Adapter createComparisonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.BooleanExpression
     * <em>Boolean Expression</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.BooleanExpression
     * @generated
     */
    public Adapter createBooleanExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.IfElse
     * <em>If Else</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.IfElse
     * @generated
     */
    public Adapter createIfElseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.Expression
     * <em>Expression</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.TermExpression
     * <em>Term Expression</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.TermExpression
     * @generated
     */
    public Adapter createTermExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.RandomVariable
     * <em>Random Variable</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.RandomVariable
     * @generated
     */
    public Adapter createRandomVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.ProductExpression
     * <em>Product Expression</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.ProductExpression
     * @generated
     */
    public Adapter createProductExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral <em>Probability Function Literal</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral
     * @generated
     */
    public Adapter createProbabilityFunctionLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.Parenthesis
     * <em>Parenthesis</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.Parenthesis
     * @generated
     */
    public Adapter createParenthesisAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.NumericLiteral
     * <em>Numeric Literal</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.NumericLiteral
     * @generated
     */
    public Adapter createNumericLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.IntLiteral
     * <em>Int Literal</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.IntLiteral
     * @generated
     */
    public Adapter createIntLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.DoubleLiteral
     * <em>Double Literal</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.DoubleLiteral
     * @generated
     */
    public Adapter createDoubleLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.CompareExpression
     * <em>Compare Expression</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.CompareExpression
     * @generated
     */
    public Adapter createCompareExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.BoolLiteral
     * <em>Bool Literal</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.BoolLiteral
     * @generated
     */
    public Adapter createBoolLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.StringLiteral
     * <em>String Literal</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.StringLiteral
     * @generated
     */
    public Adapter createStringLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.PowerExpression
     * <em>Power Expression</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.PowerExpression
     * @generated
     */
    public Adapter createPowerExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.stoex.BooleanOperatorExpression <em>Boolean Operator Expression</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.BooleanOperatorExpression
     * @generated
     */
    public Adapter createBooleanOperatorExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.NotExpression
     * <em>Not Expression</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.NotExpression
     * @generated
     */
    public Adapter createNotExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.NegativeExpression
     * <em>Negative Expression</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.NegativeExpression
     * @generated
     */
    public Adapter createNegativeExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.FunctionLiteral
     * <em>Function Literal</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.FunctionLiteral
     * @generated
     */
    public Adapter createFunctionLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.stoex.IfElseExpression
     * <em>If Else Expression</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.stoex.IfElseExpression
     * @generated
     */
    public Adapter createIfElseExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.units.UnitCarryingElement <em>Unit Carrying Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.units.UnitCarryingElement
     * @generated
     */
    public Adapter createUnitCarryingElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // StoexAdapterFactory
