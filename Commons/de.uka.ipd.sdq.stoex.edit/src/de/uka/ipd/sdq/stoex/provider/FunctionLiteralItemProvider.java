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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uka.ipd.sdq.stoex.FunctionLiteral;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.stoex.FunctionLiteral} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class FunctionLiteralItemProvider extends AtomItemProvider {

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
    public FunctionLiteralItemProvider(final AdapterFactory adapterFactory) {
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

            this.addIdPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Id feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    protected void addIdPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_FunctionLiteral_id_feature"), this.getString("_UI_PropertyDescriptor_description",
                        "_UI_FunctionLiteral_id_feature", "_UI_FunctionLiteral_type"),
                StoexPackage.Literals.FUNCTION_LITERAL__ID, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            this.childrenFeatures.add(StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL);
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
     * This returns FunctionLiteral.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/FunctionLiteral"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((FunctionLiteral) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_FunctionLiteral_type") : this
                .getString("_UI_FunctionLiteral_type") + " " + label;
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

        switch (notification.getFeatureID(FunctionLiteral.class)) {
        case StoexPackage.FUNCTION_LITERAL__ID:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case StoexPackage.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL:
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

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createTermExpression()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createProductExpression()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createProbabilityFunctionLiteral()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createParenthesis()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createIntLiteral()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createDoubleLiteral()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createCompareExpression()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createBoolLiteral()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createStringLiteral()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createPowerExpression()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createBooleanOperatorExpression()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createNotExpression()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createNegativeExpression()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createFunctionLiteral()));

        newChildDescriptors.add(this.createChildParameter(
                StoexPackage.Literals.FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL,
                StoexFactory.eINSTANCE.createIfElseExpression()));
    }

}
