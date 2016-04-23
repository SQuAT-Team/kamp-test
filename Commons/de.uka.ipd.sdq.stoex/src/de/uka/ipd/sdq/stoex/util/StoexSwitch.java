/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see de.uka.ipd.sdq.stoex.StoexPackage
 * @generated
 */
public class StoexSwitch<T> extends Switch<T> {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static StoexPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StoexSwitch() {
        if (modelPackage == null) {
            modelPackage = StoexPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case StoexPackage.VARIABLE_REFERENCE: {
            final VariableReference variableReference = (VariableReference) theEObject;
            T result = this.caseVariableReference(variableReference);
            if (result == null) {
                result = this.caseAbstractNamedReference(variableReference);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.ABSTRACT_NAMED_REFERENCE: {
            final AbstractNamedReference abstractNamedReference = (AbstractNamedReference) theEObject;
            T result = this.caseAbstractNamedReference(abstractNamedReference);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.NAMESPACE_REFERENCE: {
            final NamespaceReference namespaceReference = (NamespaceReference) theEObject;
            T result = this.caseNamespaceReference(namespaceReference);
            if (result == null) {
                result = this.caseAbstractNamedReference(namespaceReference);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.VARIABLE: {
            final Variable variable = (Variable) theEObject;
            T result = this.caseVariable(variable);
            if (result == null) {
                result = this.caseAtom(variable);
            }
            if (result == null) {
                result = this.caseUnary(variable);
            }
            if (result == null) {
                result = this.casePower(variable);
            }
            if (result == null) {
                result = this.caseProduct(variable);
            }
            if (result == null) {
                result = this.caseTerm(variable);
            }
            if (result == null) {
                result = this.caseComparison(variable);
            }
            if (result == null) {
                result = this.caseBooleanExpression(variable);
            }
            if (result == null) {
                result = this.caseIfElse(variable);
            }
            if (result == null) {
                result = this.caseExpression(variable);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.ATOM: {
            final Atom atom = (Atom) theEObject;
            T result = this.caseAtom(atom);
            if (result == null) {
                result = this.caseUnary(atom);
            }
            if (result == null) {
                result = this.casePower(atom);
            }
            if (result == null) {
                result = this.caseProduct(atom);
            }
            if (result == null) {
                result = this.caseTerm(atom);
            }
            if (result == null) {
                result = this.caseComparison(atom);
            }
            if (result == null) {
                result = this.caseBooleanExpression(atom);
            }
            if (result == null) {
                result = this.caseIfElse(atom);
            }
            if (result == null) {
                result = this.caseExpression(atom);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.UNARY: {
            final Unary unary = (Unary) theEObject;
            T result = this.caseUnary(unary);
            if (result == null) {
                result = this.casePower(unary);
            }
            if (result == null) {
                result = this.caseProduct(unary);
            }
            if (result == null) {
                result = this.caseTerm(unary);
            }
            if (result == null) {
                result = this.caseComparison(unary);
            }
            if (result == null) {
                result = this.caseBooleanExpression(unary);
            }
            if (result == null) {
                result = this.caseIfElse(unary);
            }
            if (result == null) {
                result = this.caseExpression(unary);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.POWER: {
            final Power power = (Power) theEObject;
            T result = this.casePower(power);
            if (result == null) {
                result = this.caseProduct(power);
            }
            if (result == null) {
                result = this.caseTerm(power);
            }
            if (result == null) {
                result = this.caseComparison(power);
            }
            if (result == null) {
                result = this.caseBooleanExpression(power);
            }
            if (result == null) {
                result = this.caseIfElse(power);
            }
            if (result == null) {
                result = this.caseExpression(power);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.PRODUCT: {
            final Product product = (Product) theEObject;
            T result = this.caseProduct(product);
            if (result == null) {
                result = this.caseTerm(product);
            }
            if (result == null) {
                result = this.caseComparison(product);
            }
            if (result == null) {
                result = this.caseBooleanExpression(product);
            }
            if (result == null) {
                result = this.caseIfElse(product);
            }
            if (result == null) {
                result = this.caseExpression(product);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.TERM: {
            final Term term = (Term) theEObject;
            T result = this.caseTerm(term);
            if (result == null) {
                result = this.caseComparison(term);
            }
            if (result == null) {
                result = this.caseBooleanExpression(term);
            }
            if (result == null) {
                result = this.caseIfElse(term);
            }
            if (result == null) {
                result = this.caseExpression(term);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.COMPARISON: {
            final Comparison comparison = (Comparison) theEObject;
            T result = this.caseComparison(comparison);
            if (result == null) {
                result = this.caseBooleanExpression(comparison);
            }
            if (result == null) {
                result = this.caseIfElse(comparison);
            }
            if (result == null) {
                result = this.caseExpression(comparison);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.BOOLEAN_EXPRESSION: {
            final BooleanExpression booleanExpression = (BooleanExpression) theEObject;
            T result = this.caseBooleanExpression(booleanExpression);
            if (result == null) {
                result = this.caseIfElse(booleanExpression);
            }
            if (result == null) {
                result = this.caseExpression(booleanExpression);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.IF_ELSE: {
            final IfElse ifElse = (IfElse) theEObject;
            T result = this.caseIfElse(ifElse);
            if (result == null) {
                result = this.caseExpression(ifElse);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.EXPRESSION: {
            final Expression expression = (Expression) theEObject;
            T result = this.caseExpression(expression);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.TERM_EXPRESSION: {
            final TermExpression termExpression = (TermExpression) theEObject;
            T result = this.caseTermExpression(termExpression);
            if (result == null) {
                result = this.caseTerm(termExpression);
            }
            if (result == null) {
                result = this.caseComparison(termExpression);
            }
            if (result == null) {
                result = this.caseBooleanExpression(termExpression);
            }
            if (result == null) {
                result = this.caseIfElse(termExpression);
            }
            if (result == null) {
                result = this.caseExpression(termExpression);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.PRODUCT_EXPRESSION: {
            final ProductExpression productExpression = (ProductExpression) theEObject;
            T result = this.caseProductExpression(productExpression);
            if (result == null) {
                result = this.caseProduct(productExpression);
            }
            if (result == null) {
                result = this.caseTerm(productExpression);
            }
            if (result == null) {
                result = this.caseComparison(productExpression);
            }
            if (result == null) {
                result = this.caseBooleanExpression(productExpression);
            }
            if (result == null) {
                result = this.caseIfElse(productExpression);
            }
            if (result == null) {
                result = this.caseExpression(productExpression);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.PROBABILITY_FUNCTION_LITERAL: {
            final ProbabilityFunctionLiteral probabilityFunctionLiteral = (ProbabilityFunctionLiteral) theEObject;
            T result = this.caseProbabilityFunctionLiteral(probabilityFunctionLiteral);
            if (result == null) {
                result = this.caseAtom(probabilityFunctionLiteral);
            }
            if (result == null) {
                result = this.caseUnary(probabilityFunctionLiteral);
            }
            if (result == null) {
                result = this.casePower(probabilityFunctionLiteral);
            }
            if (result == null) {
                result = this.caseProduct(probabilityFunctionLiteral);
            }
            if (result == null) {
                result = this.caseTerm(probabilityFunctionLiteral);
            }
            if (result == null) {
                result = this.caseComparison(probabilityFunctionLiteral);
            }
            if (result == null) {
                result = this.caseBooleanExpression(probabilityFunctionLiteral);
            }
            if (result == null) {
                result = this.caseIfElse(probabilityFunctionLiteral);
            }
            if (result == null) {
                result = this.caseExpression(probabilityFunctionLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.PARENTHESIS: {
            final Parenthesis parenthesis = (Parenthesis) theEObject;
            T result = this.caseParenthesis(parenthesis);
            if (result == null) {
                result = this.caseAtom(parenthesis);
            }
            if (result == null) {
                result = this.caseUnary(parenthesis);
            }
            if (result == null) {
                result = this.casePower(parenthesis);
            }
            if (result == null) {
                result = this.caseProduct(parenthesis);
            }
            if (result == null) {
                result = this.caseTerm(parenthesis);
            }
            if (result == null) {
                result = this.caseComparison(parenthesis);
            }
            if (result == null) {
                result = this.caseBooleanExpression(parenthesis);
            }
            if (result == null) {
                result = this.caseIfElse(parenthesis);
            }
            if (result == null) {
                result = this.caseExpression(parenthesis);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.NUMERIC_LITERAL: {
            final NumericLiteral numericLiteral = (NumericLiteral) theEObject;
            T result = this.caseNumericLiteral(numericLiteral);
            if (result == null) {
                result = this.caseUnitCarryingElement(numericLiteral);
            }
            if (result == null) {
                result = this.caseAtom(numericLiteral);
            }
            if (result == null) {
                result = this.caseUnary(numericLiteral);
            }
            if (result == null) {
                result = this.casePower(numericLiteral);
            }
            if (result == null) {
                result = this.caseProduct(numericLiteral);
            }
            if (result == null) {
                result = this.caseTerm(numericLiteral);
            }
            if (result == null) {
                result = this.caseComparison(numericLiteral);
            }
            if (result == null) {
                result = this.caseBooleanExpression(numericLiteral);
            }
            if (result == null) {
                result = this.caseIfElse(numericLiteral);
            }
            if (result == null) {
                result = this.caseExpression(numericLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.INT_LITERAL: {
            final IntLiteral intLiteral = (IntLiteral) theEObject;
            T result = this.caseIntLiteral(intLiteral);
            if (result == null) {
                result = this.caseNumericLiteral(intLiteral);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(intLiteral);
            }
            if (result == null) {
                result = this.caseAtom(intLiteral);
            }
            if (result == null) {
                result = this.caseUnary(intLiteral);
            }
            if (result == null) {
                result = this.casePower(intLiteral);
            }
            if (result == null) {
                result = this.caseProduct(intLiteral);
            }
            if (result == null) {
                result = this.caseTerm(intLiteral);
            }
            if (result == null) {
                result = this.caseComparison(intLiteral);
            }
            if (result == null) {
                result = this.caseBooleanExpression(intLiteral);
            }
            if (result == null) {
                result = this.caseIfElse(intLiteral);
            }
            if (result == null) {
                result = this.caseExpression(intLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.DOUBLE_LITERAL: {
            final DoubleLiteral doubleLiteral = (DoubleLiteral) theEObject;
            T result = this.caseDoubleLiteral(doubleLiteral);
            if (result == null) {
                result = this.caseNumericLiteral(doubleLiteral);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(doubleLiteral);
            }
            if (result == null) {
                result = this.caseAtom(doubleLiteral);
            }
            if (result == null) {
                result = this.caseUnary(doubleLiteral);
            }
            if (result == null) {
                result = this.casePower(doubleLiteral);
            }
            if (result == null) {
                result = this.caseProduct(doubleLiteral);
            }
            if (result == null) {
                result = this.caseTerm(doubleLiteral);
            }
            if (result == null) {
                result = this.caseComparison(doubleLiteral);
            }
            if (result == null) {
                result = this.caseBooleanExpression(doubleLiteral);
            }
            if (result == null) {
                result = this.caseIfElse(doubleLiteral);
            }
            if (result == null) {
                result = this.caseExpression(doubleLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.COMPARE_EXPRESSION: {
            final CompareExpression compareExpression = (CompareExpression) theEObject;
            T result = this.caseCompareExpression(compareExpression);
            if (result == null) {
                result = this.caseComparison(compareExpression);
            }
            if (result == null) {
                result = this.caseBooleanExpression(compareExpression);
            }
            if (result == null) {
                result = this.caseIfElse(compareExpression);
            }
            if (result == null) {
                result = this.caseExpression(compareExpression);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.BOOL_LITERAL: {
            final BoolLiteral boolLiteral = (BoolLiteral) theEObject;
            T result = this.caseBoolLiteral(boolLiteral);
            if (result == null) {
                result = this.caseAtom(boolLiteral);
            }
            if (result == null) {
                result = this.caseUnary(boolLiteral);
            }
            if (result == null) {
                result = this.casePower(boolLiteral);
            }
            if (result == null) {
                result = this.caseProduct(boolLiteral);
            }
            if (result == null) {
                result = this.caseTerm(boolLiteral);
            }
            if (result == null) {
                result = this.caseComparison(boolLiteral);
            }
            if (result == null) {
                result = this.caseBooleanExpression(boolLiteral);
            }
            if (result == null) {
                result = this.caseIfElse(boolLiteral);
            }
            if (result == null) {
                result = this.caseExpression(boolLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.STRING_LITERAL: {
            final StringLiteral stringLiteral = (StringLiteral) theEObject;
            T result = this.caseStringLiteral(stringLiteral);
            if (result == null) {
                result = this.caseAtom(stringLiteral);
            }
            if (result == null) {
                result = this.caseUnary(stringLiteral);
            }
            if (result == null) {
                result = this.casePower(stringLiteral);
            }
            if (result == null) {
                result = this.caseProduct(stringLiteral);
            }
            if (result == null) {
                result = this.caseTerm(stringLiteral);
            }
            if (result == null) {
                result = this.caseComparison(stringLiteral);
            }
            if (result == null) {
                result = this.caseBooleanExpression(stringLiteral);
            }
            if (result == null) {
                result = this.caseIfElse(stringLiteral);
            }
            if (result == null) {
                result = this.caseExpression(stringLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.POWER_EXPRESSION: {
            final PowerExpression powerExpression = (PowerExpression) theEObject;
            T result = this.casePowerExpression(powerExpression);
            if (result == null) {
                result = this.casePower(powerExpression);
            }
            if (result == null) {
                result = this.caseProduct(powerExpression);
            }
            if (result == null) {
                result = this.caseTerm(powerExpression);
            }
            if (result == null) {
                result = this.caseComparison(powerExpression);
            }
            if (result == null) {
                result = this.caseBooleanExpression(powerExpression);
            }
            if (result == null) {
                result = this.caseIfElse(powerExpression);
            }
            if (result == null) {
                result = this.caseExpression(powerExpression);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION: {
            final BooleanOperatorExpression booleanOperatorExpression = (BooleanOperatorExpression) theEObject;
            T result = this.caseBooleanOperatorExpression(booleanOperatorExpression);
            if (result == null) {
                result = this.caseBooleanExpression(booleanOperatorExpression);
            }
            if (result == null) {
                result = this.caseIfElse(booleanOperatorExpression);
            }
            if (result == null) {
                result = this.caseExpression(booleanOperatorExpression);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.NOT_EXPRESSION: {
            final NotExpression notExpression = (NotExpression) theEObject;
            T result = this.caseNotExpression(notExpression);
            if (result == null) {
                result = this.caseUnary(notExpression);
            }
            if (result == null) {
                result = this.casePower(notExpression);
            }
            if (result == null) {
                result = this.caseProduct(notExpression);
            }
            if (result == null) {
                result = this.caseTerm(notExpression);
            }
            if (result == null) {
                result = this.caseComparison(notExpression);
            }
            if (result == null) {
                result = this.caseBooleanExpression(notExpression);
            }
            if (result == null) {
                result = this.caseIfElse(notExpression);
            }
            if (result == null) {
                result = this.caseExpression(notExpression);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.NEGATIVE_EXPRESSION: {
            final NegativeExpression negativeExpression = (NegativeExpression) theEObject;
            T result = this.caseNegativeExpression(negativeExpression);
            if (result == null) {
                result = this.caseUnary(negativeExpression);
            }
            if (result == null) {
                result = this.casePower(negativeExpression);
            }
            if (result == null) {
                result = this.caseProduct(negativeExpression);
            }
            if (result == null) {
                result = this.caseTerm(negativeExpression);
            }
            if (result == null) {
                result = this.caseComparison(negativeExpression);
            }
            if (result == null) {
                result = this.caseBooleanExpression(negativeExpression);
            }
            if (result == null) {
                result = this.caseIfElse(negativeExpression);
            }
            if (result == null) {
                result = this.caseExpression(negativeExpression);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.FUNCTION_LITERAL: {
            final FunctionLiteral functionLiteral = (FunctionLiteral) theEObject;
            T result = this.caseFunctionLiteral(functionLiteral);
            if (result == null) {
                result = this.caseAtom(functionLiteral);
            }
            if (result == null) {
                result = this.caseUnary(functionLiteral);
            }
            if (result == null) {
                result = this.casePower(functionLiteral);
            }
            if (result == null) {
                result = this.caseProduct(functionLiteral);
            }
            if (result == null) {
                result = this.caseTerm(functionLiteral);
            }
            if (result == null) {
                result = this.caseComparison(functionLiteral);
            }
            if (result == null) {
                result = this.caseBooleanExpression(functionLiteral);
            }
            if (result == null) {
                result = this.caseIfElse(functionLiteral);
            }
            if (result == null) {
                result = this.caseExpression(functionLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.IF_ELSE_EXPRESSION: {
            final IfElseExpression ifElseExpression = (IfElseExpression) theEObject;
            T result = this.caseIfElseExpression(ifElseExpression);
            if (result == null) {
                result = this.caseIfElse(ifElseExpression);
            }
            if (result == null) {
                result = this.caseExpression(ifElseExpression);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StoexPackage.RANDOM_VARIABLE: {
            final RandomVariable randomVariable = (RandomVariable) theEObject;
            T result = this.caseRandomVariable(randomVariable);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableReference(final VariableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Abstract Named Reference</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Abstract Named Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractNamedReference(final AbstractNamedReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Namespace Reference</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Namespace Reference</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamespaceReference(final NamespaceReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariable(final Variable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Atom</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAtom(final Atom object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unary</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnary(final Unary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePower(final Power object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Product</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Product</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProduct(final Product object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Term</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Term</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTerm(final Term object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComparison(final Comparison object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanExpression(final BooleanExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>If Else</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>If Else</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIfElse(final IfElse object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpression(final Expression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Term Expression</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Term Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTermExpression(final TermExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Random Variable</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Random Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRandomVariable(final RandomVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Product Expression</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Product Expression</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProductExpression(final ProductExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Probability Function Literal</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Probability Function Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProbabilityFunctionLiteral(final ProbabilityFunctionLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parenthesis</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parenthesis</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParenthesis(final Parenthesis object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericLiteral(final NumericLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntLiteral(final IntLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoubleLiteral(final DoubleLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Compare Expression</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Compare Expression</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompareExpression(final CompareExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bool Literal</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoolLiteral(final BoolLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringLiteral(final StringLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Expression</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerExpression(final PowerExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Boolean Operator Expression</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Boolean Operator Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanOperatorExpression(final BooleanOperatorExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNotExpression(final NotExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Negative Expression</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Negative Expression</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNegativeExpression(final NegativeExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Literal</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionLiteral(final FunctionLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>If Else Expression</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>If Else Expression</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIfElseExpression(final IfElseExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Unit Carrying Element</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Unit Carrying Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnitCarryingElement(final UnitCarryingElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // StoexSwitch
