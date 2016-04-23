/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uka.ipd.sdq.probfunction.GammaDistribution;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.probfunction.GammaDistribution}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class GammaDistributionItemProvider extends ContinuousPDFItemProvider {

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
    public GammaDistributionItemProvider(final AdapterFactory adapterFactory) {
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

            this.addAlphaPropertyDescriptor(object);
            this.addThetaPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Alpha feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addAlphaPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_GammaDistribution_alpha_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_GammaDistribution_alpha_feature",
                        "_UI_GammaDistribution_type"), ProbfunctionPackage.Literals.GAMMA_DISTRIBUTION__ALPHA, true,
                        false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Theta feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addThetaPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_GammaDistribution_theta_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_GammaDistribution_theta_feature",
                        "_UI_GammaDistribution_type"), ProbfunctionPackage.Literals.GAMMA_DISTRIBUTION__THETA, true,
                        false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This returns GammaDistribution.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/GammaDistribution"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final GammaDistribution gammaDistribution = (GammaDistribution) object;
        return this.getString("_UI_GammaDistribution_type") + " " + gammaDistribution.getAlpha();
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

        switch (notification.getFeatureID(GammaDistribution.class)) {
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA:
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

}
