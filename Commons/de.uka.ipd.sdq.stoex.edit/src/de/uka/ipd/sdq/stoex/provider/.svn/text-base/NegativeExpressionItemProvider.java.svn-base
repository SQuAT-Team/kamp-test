/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uka.ipd.sdq.stoex.NegativeExpression;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.stoex.NegativeExpression} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class NegativeExpressionItemProvider extends UnaryItemProvider {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public NegativeExpressionItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns NegativeExpression.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/NegativeExpression"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        return this.getString("_UI_NegativeExpression_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(NegativeExpression.class)) {
        case StoexPackage.NEGATIVE_EXPRESSION__INNER:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createProbabilityFunctionLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createParenthesis()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createIntLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createDoubleLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createBoolLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createStringLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createNotExpression()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createNegativeExpression()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER,
                StoexFactory.eINSTANCE.createFunctionLiteral()));
    }

}
