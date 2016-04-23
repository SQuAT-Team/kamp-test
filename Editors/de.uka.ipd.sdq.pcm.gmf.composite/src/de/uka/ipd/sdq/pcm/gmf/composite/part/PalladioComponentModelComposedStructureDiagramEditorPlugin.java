/*
 * Copyright 2007, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.composite.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProviderAdapterFactory;
import org.palladiosimulator.pcm.allocation.provider.AllocationItemProviderAdapterFactory;
import org.palladiosimulator.pcm.core.composition.provider.CompositionItemProviderAdapterFactory;
import org.palladiosimulator.pcm.core.entity.provider.EntityItemProviderAdapterFactory;
import org.palladiosimulator.pcm.core.provider.CoreItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.policies.PalladioComponentModelBaseItemSemanticEditPolicy;
import de.uka.ipd.sdq.pcm.gmf.composite.providers.ElementInitializers;
import org.palladiosimulator.pcm.parameter.provider.ParameterItemProviderAdapterFactory;
import org.palladiosimulator.pcm.protocol.provider.ProtocolItemProviderAdapterFactory;
import org.palladiosimulator.pcm.provider.PcmItemProviderAdapterFactory;
import org.palladiosimulator.pcm.qosannotations.provider.QosannotationsItemProviderAdapterFactory;
import org.palladiosimulator.pcm.reliability.provider.ReliabilityItemProviderAdapterFactory;
import org.palladiosimulator.pcm.repository.provider.RepositoryItemProviderAdapterFactory;
import org.palladiosimulator.pcm.resourceenvironment.provider.ResourceenvironmentItemProviderAdapterFactory;
import org.palladiosimulator.pcm.resourcetype.provider.ResourcetypeItemProviderAdapterFactory;
import org.palladiosimulator.pcm.seff.provider.SeffItemProviderAdapterFactory;
import org.palladiosimulator.pcm.subsystem.provider.SubsystemItemProviderAdapterFactory;
import org.palladiosimulator.pcm.system.provider.SystemItemProviderAdapterFactory;
import org.palladiosimulator.pcm.ui.provider.PalladioItemProviderAdapterFactory;
import org.palladiosimulator.pcm.usagemodel.provider.UsagemodelItemProviderAdapterFactory;

import de.uka.ipd.sdq.probfunction.provider.ProbfunctionItemProviderAdapterFactory;
import de.uka.ipd.sdq.stoex.provider.StoexItemProviderAdapterFactory;
import de.uka.ipd.sdq.units.provider.UnitsItemProviderAdapterFactory;

/**
 * @generated
 */
public class PalladioComponentModelComposedStructureDiagramEditorPlugin extends AbstractUIPlugin {

    /**
     * @generated
     */
    public static final String ID = "de.uka.ipd.sdq.pcm.gmf.composite"; //$NON-NLS-1$

    /**
     * @generated
     */
    public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(ID);

    /**
     * @generated
     */
    private static PalladioComponentModelComposedStructureDiagramEditorPlugin instance;

    /** The adapter factory. @generated not */
    private AdapterFactory adapterFactory;
    // private ComposedAdapterFactory adapterFactory;

    /**
     * @generated
     */
    private PalladioComponentModelDocumentProvider documentProvider;

    /**
     * @generated
     */
    private PalladioComponentModelBaseItemSemanticEditPolicy.LinkConstraints linkConstraints;

    /**
     * @generated
     */
    private ElementInitializers initializers;

    /**
     * @generated
     */
    public PalladioComponentModelComposedStructureDiagramEditorPlugin() {
    }

    /**
     * @generated
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        instance = this;
        PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT, getPreferenceStore());
        this.adapterFactory = createAdapterFactory();
    }

    /**
     * Stop.
     * 
     * @param context
     *            the context
     * @throws Exception
     *             the exception
     * @generated not
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        // adapterFactory.dispose();
        // adapterFactory = null;
        // linkConstraints = null;
        // initializers = null;
        // instance = null;
        // super.stop(context);
        ((IDisposable) this.adapterFactory).dispose();
        this.adapterFactory = null;
        instance = null;
        super.stop(context);
    }

    /**
     * @generated
     */
    public static PalladioComponentModelComposedStructureDiagramEditorPlugin getInstance() {
        return instance;
    }

    /**
     * Creates the adapter factory.
     * 
     * @return the adapter factory
     * @generated not
     */
    protected AdapterFactory createAdapterFactory() {
        // ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
        // fillItemProviderFactories(factories);
        // return new ComposedAdapterFactory(factories);
        final List factories = new ArrayList();
        fillItemProviderFactories(factories);
        final ComposedAdapterFactory caf = new ComposedAdapterFactory(factories) {

            @Override
            public ComposeableAdapterFactory getRootAdapterFactory() {
                return (ComposeableAdapterFactory) PalladioComponentModelComposedStructureDiagramEditorPlugin.this.adapterFactory;
            }

        };
        return new PalladioItemProviderAdapterFactory(caf);
    }

    /**
     * @generated
     */
    protected void fillItemProviderFactories(final List<AdapterFactory> factories) {
        factories.add(new PcmItemProviderAdapterFactory());
        factories.add(new CoreItemProviderAdapterFactory());
        factories.add(new EntityItemProviderAdapterFactory());
        factories.add(new CompositionItemProviderAdapterFactory());
        factories.add(new UsagemodelItemProviderAdapterFactory());
        factories.add(new RepositoryItemProviderAdapterFactory());
        factories.add(new ResourcetypeItemProviderAdapterFactory());
        factories.add(new ProtocolItemProviderAdapterFactory());
        factories.add(new ParameterItemProviderAdapterFactory());
        factories.add(new ReliabilityItemProviderAdapterFactory());
        factories.add(new SeffItemProviderAdapterFactory());
        factories
                .add(new org.palladiosimulator.pcm.seff.seff_performance.provider.SeffPerformanceItemProviderAdapterFactory());
        factories
                .add(new org.palladiosimulator.pcm.seff.seff_reliability.provider.SeffReliabilityItemProviderAdapterFactory());
        factories.add(new QosannotationsItemProviderAdapterFactory());
        factories
                .add(new org.palladiosimulator.pcm.qosannotations.qos_performance.provider.QosPerformanceItemProviderAdapterFactory());
        factories
                .add(new org.palladiosimulator.pcm.qosannotations.qos_reliability.provider.QosReliabilityItemProviderAdapterFactory());
        factories.add(new SystemItemProviderAdapterFactory());
        factories.add(new ResourceenvironmentItemProviderAdapterFactory());
        factories.add(new AllocationItemProviderAdapterFactory());
        factories.add(new SubsystemItemProviderAdapterFactory());
        factories.add(new IdentifierItemProviderAdapterFactory());
        factories.add(new ProbfunctionItemProviderAdapterFactory());
        factories.add(new StoexItemProviderAdapterFactory());
        factories.add(new UnitsItemProviderAdapterFactory());
        factories.add(new ResourceItemProviderAdapterFactory());
        factories.add(new ReflectiveItemProviderAdapterFactory());
    }

    /**
     * @generated
     */
    public AdapterFactory getItemProvidersAdapterFactory() {
        return this.adapterFactory;
    }

    /**
     * @generated
     */
    public ImageDescriptor getItemImageDescriptor(final Object item) {
        final IItemLabelProvider labelProvider = (IItemLabelProvider) this.adapterFactory.adapt(item,
                IItemLabelProvider.class);
        if (labelProvider != null) {
            return ExtendedImageRegistry.getInstance().getImageDescriptor(labelProvider.getImage(item));
        }
        return null;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in relative path.
     * 
     * @generated
     * @param path
     *            the path
     * @return the image descriptor
     */
    public static ImageDescriptor getBundledImageDescriptor(final String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
    }

    /**
     * Respects images residing in any plug-in. If path is relative, then this bundle is looked up
     * for the image, otherwise, for absolute path, first segment is taken as id of plug-in with
     * image
     * 
     * @generated
     * @param path
     *            the path to image, either absolute (with plug-in id as first segment), or relative
     *            for bundled images
     * @return the image descriptor
     */
    public static ImageDescriptor findImageDescriptor(final String path) {
        final IPath p = new Path(path);
        if (p.isAbsolute() && p.segmentCount() > 1) {
            return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0), p.removeFirstSegments(1).makeAbsolute()
                    .toString());
        } else {
            return getBundledImageDescriptor(p.makeAbsolute().toString());
        }
    }

    /**
     * Returns an image for the image file at the given plug-in relative path. Client do not need to
     * dispose this image. Images will be disposed automatically.
     * 
     * @generated
     * @param path
     *            the path
     * @return image instance
     */
    public Image getBundledImage(final String path) {
        Image image = getImageRegistry().get(path);
        if (image == null) {
            getImageRegistry().put(path, getBundledImageDescriptor(path));
            image = getImageRegistry().get(path);
        }
        return image;
    }

    /**
     * Returns string from plug-in's resource bundle
     * 
     * @generated
     */
    public static String getString(final String key) {
        return Platform.getResourceString(getInstance().getBundle(), "%" + key); //$NON-NLS-1$
    }

    /**
     * @generated
     */
    public PalladioComponentModelDocumentProvider getDocumentProvider() {
        if (this.documentProvider == null) {
            this.documentProvider = new PalladioComponentModelDocumentProvider();
        }
        return this.documentProvider;
    }

    /**
     * @generated
     */
    public PalladioComponentModelBaseItemSemanticEditPolicy.LinkConstraints getLinkConstraints() {
        return this.linkConstraints;
    }

    /**
     * @generated
     */
    public void setLinkConstraints(final PalladioComponentModelBaseItemSemanticEditPolicy.LinkConstraints lc) {
        this.linkConstraints = lc;
    }

    /**
     * @generated
     */
    public ElementInitializers getElementInitializers() {
        return this.initializers;
    }

    /**
     * @generated
     */
    public void setElementInitializers(final ElementInitializers i) {
        this.initializers = i;
    }

    /**
     * @generated
     */
    public void logError(final String error) {
        logError(error, null);
    }

    /**
     * @generated
     */
    public void logError(String error, final Throwable throwable) {
        if (error == null && throwable != null) {
            error = throwable.getMessage();
        }
        getLog().log(
                new Status(IStatus.ERROR, PalladioComponentModelComposedStructureDiagramEditorPlugin.ID, IStatus.OK,
                        error, throwable));
        debug(error, throwable);
    }

    /**
     * @generated
     */
    public void logInfo(final String message) {
        logInfo(message, null);
    }

    /**
     * @generated
     */
    public void logInfo(String message, final Throwable throwable) {
        if (message == null && throwable != null) {
            message = throwable.getMessage();
        }
        getLog().log(
                new Status(IStatus.INFO, PalladioComponentModelComposedStructureDiagramEditorPlugin.ID, IStatus.OK,
                        message, throwable));
        debug(message, throwable);
    }

    /**
     * @generated
     */
    private void debug(final String message, final Throwable throwable) {
        if (!isDebugging()) {
            return;
        }
        if (message != null) {
            System.err.println(message);
        }
        if (throwable != null) {
            throwable.printStackTrace();
        }
    }
}
