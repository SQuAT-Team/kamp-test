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

import de.uka.ipd.sdq.stoex.PowerExpression;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.stoex.PowerExpression} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class PowerExpressionItemProvider extends PowerItemProvider {

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
    public PowerExpressionItemProvider(final AdapterFactory adapterFactory) {
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
            this.childrenFeatures.add(StoexPackage.Literals.POWER_EXPRESSION__BASE);
            this.childrenFeatures.add(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT);
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
     * This returns PowerExpression.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/PowerExpression"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        return this.getString("_UI_PowerExpression_type");
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

        switch (notification.getFeatureID(PowerExpression.class)) {
        case StoexPackage.POWER_EXPRESSION__BASE:
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
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

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createProbabilityFunctionLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createParenthesis()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createIntLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createDoubleLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createBoolLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createStringLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createPowerExpression()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createNotExpression()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createNegativeExpression()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__BASE,
                StoexFactory.eINSTANCE.createFunctionLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createProbabilityFunctionLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createParenthesis()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createIntLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createDoubleLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createBoolLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createStringLiteral()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createNotExpression()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createNegativeExpression()));

        newChildDescriptors.add(this.createChildParameter(StoexPackage.Literals.POWER_EXPRESSION__EXPONENT,
                StoexFactory.eINSTANCE.createFunctionLiteral()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getCreateChildText(final Object owner, final Object feature, final Object child,
            final Collection<?> selection) {
        final Object childFeature = feature;
        final Object childObject = child;

        final boolean qualify = childFeature == StoexPackage.Literals.POWER_EXPRESSION__BASE
                || childFeature == StoexPackage.Literals.POWER_EXPRESSION__EXPONENT;

        if (qualify) {
            return this.getString(
                    "_UI_CreateChild_text2",
                    new Object[] { this.getTypeText(childObject), this.getFeatureText(childFeature),
                            this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
