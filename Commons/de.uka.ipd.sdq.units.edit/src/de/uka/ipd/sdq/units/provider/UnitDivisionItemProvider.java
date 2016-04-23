/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 */
package de.uka.ipd.sdq.units.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uka.ipd.sdq.units.UnitDivision;
import de.uka.ipd.sdq.units.UnitsFactory;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.units.UnitDivision} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class UnitDivisionItemProvider extends UnitItemProvider {

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
    public UnitDivisionItemProvider(final AdapterFactory adapterFactory) {
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
            this.childrenFeatures.add(UnitsPackage.Literals.UNIT_DIVISION__DIVIDEND);
            this.childrenFeatures.add(UnitsPackage.Literals.UNIT_DIVISION__DIVISOR);
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
     * This returns UnitDivision.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/UnitDivision"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        return this.getString("_UI_UnitDivision_type");
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

        switch (notification.getFeatureID(UnitDivision.class)) {
        case UnitsPackage.UNIT_DIVISION__DIVIDEND:
        case UnitsPackage.UNIT_DIVISION__DIVISOR:
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

        newChildDescriptors.add(this.createChildParameter(UnitsPackage.Literals.UNIT_DIVISION__DIVIDEND,
                UnitsFactory.eINSTANCE.createBaseUnit()));

        newChildDescriptors.add(this.createChildParameter(UnitsPackage.Literals.UNIT_DIVISION__DIVIDEND,
                UnitsFactory.eINSTANCE.createUnitMultiplication()));

        newChildDescriptors.add(this.createChildParameter(UnitsPackage.Literals.UNIT_DIVISION__DIVIDEND,
                UnitsFactory.eINSTANCE.createUnitPower()));

        newChildDescriptors.add(this.createChildParameter(UnitsPackage.Literals.UNIT_DIVISION__DIVIDEND,
                UnitsFactory.eINSTANCE.createUnitDivision()));

        newChildDescriptors.add(this.createChildParameter(UnitsPackage.Literals.UNIT_DIVISION__DIVISOR,
                UnitsFactory.eINSTANCE.createBaseUnit()));

        newChildDescriptors.add(this.createChildParameter(UnitsPackage.Literals.UNIT_DIVISION__DIVISOR,
                UnitsFactory.eINSTANCE.createUnitMultiplication()));

        newChildDescriptors.add(this.createChildParameter(UnitsPackage.Literals.UNIT_DIVISION__DIVISOR,
                UnitsFactory.eINSTANCE.createUnitPower()));

        newChildDescriptors.add(this.createChildParameter(UnitsPackage.Literals.UNIT_DIVISION__DIVISOR,
                UnitsFactory.eINSTANCE.createUnitDivision()));
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

        final boolean qualify = childFeature == UnitsPackage.Literals.UNIT_DIVISION__DIVIDEND
                || childFeature == UnitsPackage.Literals.UNIT_DIVISION__DIVISOR;

        if (qualify) {
            return this.getString(
                    "_UI_CreateChild_text2",
                    new Object[] { this.getTypeText(childObject), this.getFeatureText(childFeature),
                            this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
