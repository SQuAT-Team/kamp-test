/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.util.modificationmarksAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class modificationmarksItemProviderAdapterFactory extends modificationmarksAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modificationmarksItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModificationRepositoryItemProvider modificationRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModificationRepositoryAdapter() {
		if (modificationRepositoryItemProvider == null) {
			modificationRepositoryItemProvider = new ModificationRepositoryItemProvider(this);
		}

		return modificationRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyComponentItemProvider modifyComponentItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyComponentAdapter() {
		if (modifyComponentItemProvider == null) {
			modifyComponentItemProvider = new ModifyComponentItemProvider(this);
		}

		return modifyComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyAssemblyConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyAssemblyConnectorItemProvider modifyAssemblyConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyAssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyAssemblyConnectorAdapter() {
		if (modifyAssemblyConnectorItemProvider == null) {
			modifyAssemblyConnectorItemProvider = new ModifyAssemblyConnectorItemProvider(this);
		}

		return modifyAssemblyConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyDatatype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyDatatypeItemProvider modifyDatatypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyDatatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyDatatypeAdapter() {
		if (modifyDatatypeItemProvider == null) {
			modifyDatatypeItemProvider = new ModifyDatatypeItemProvider(this);
		}

		return modifyDatatypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.IntercomponentPropagation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercomponentPropagationItemProvider intercomponentPropagationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.IntercomponentPropagation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntercomponentPropagationAdapter() {
		if (intercomponentPropagationItemProvider == null) {
			intercomponentPropagationItemProvider = new IntercomponentPropagationItemProvider(this);
		}

		return intercomponentPropagationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.IntracomponentPropagation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntracomponentPropagationItemProvider intracomponentPropagationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.IntracomponentPropagation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntracomponentPropagationAdapter() {
		if (intracomponentPropagationItemProvider == null) {
			intracomponentPropagationItemProvider = new IntracomponentPropagationItemProvider(this);
		}

		return intracomponentPropagationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeedModificationsItemProvider seedModificationsItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeedModificationsAdapter() {
		if (seedModificationsItemProvider == null) {
			seedModificationsItemProvider = new SeedModificationsItemProvider(this);
		}

		return seedModificationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyProvidedRoleItemProvider modifyProvidedRoleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyProvidedRoleAdapter() {
		if (modifyProvidedRoleItemProvider == null) {
			modifyProvidedRoleItemProvider = new ModifyProvidedRoleItemProvider(this);
		}

		return modifyProvidedRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyRequiredRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyRequiredRoleItemProvider modifyRequiredRoleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyRequiredRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyRequiredRoleAdapter() {
		if (modifyRequiredRoleItemProvider == null) {
			modifyRequiredRoleItemProvider = new ModifyRequiredRoleItemProvider(this);
		}

		return modifyRequiredRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationDueToDataDependencies} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangePropagationDueToDataDependenciesItemProvider changePropagationDueToDataDependenciesItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationDueToDataDependencies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangePropagationDueToDataDependenciesAdapter() {
		if (changePropagationDueToDataDependenciesItemProvider == null) {
			changePropagationDueToDataDependenciesItemProvider = new ChangePropagationDueToDataDependenciesItemProvider(this);
		}

		return changePropagationDueToDataDependenciesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyInterfaceItemProvider modifyInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyInterfaceAdapter() {
		if (modifyInterfaceItemProvider == null) {
			modifyInterfaceItemProvider = new ModifyInterfaceItemProvider(this);
		}

		return modifyInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifySignature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifySignatureItemProvider modifySignatureItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifySignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifySignatureAdapter() {
		if (modifySignatureItemProvider == null) {
			modifySignatureItemProvider = new ModifySignatureItemProvider(this);
		}

		return modifySignatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationDueToInterfaceDependencies} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangePropagationDueToInterfaceDependenciesItemProvider changePropagationDueToInterfaceDependenciesItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationDueToInterfaceDependencies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangePropagationDueToInterfaceDependenciesAdapter() {
		if (changePropagationDueToInterfaceDependenciesItemProvider == null) {
			changePropagationDueToInterfaceDependenciesItemProvider = new ChangePropagationDueToInterfaceDependenciesItemProvider(this);
		}

		return changePropagationDueToInterfaceDependenciesItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (modificationRepositoryItemProvider != null) modificationRepositoryItemProvider.dispose();
		if (modifyComponentItemProvider != null) modifyComponentItemProvider.dispose();
		if (modifyAssemblyConnectorItemProvider != null) modifyAssemblyConnectorItemProvider.dispose();
		if (modifyDatatypeItemProvider != null) modifyDatatypeItemProvider.dispose();
		if (intercomponentPropagationItemProvider != null) intercomponentPropagationItemProvider.dispose();
		if (intracomponentPropagationItemProvider != null) intracomponentPropagationItemProvider.dispose();
		if (seedModificationsItemProvider != null) seedModificationsItemProvider.dispose();
		if (modifyProvidedRoleItemProvider != null) modifyProvidedRoleItemProvider.dispose();
		if (modifyRequiredRoleItemProvider != null) modifyRequiredRoleItemProvider.dispose();
		if (changePropagationDueToDataDependenciesItemProvider != null) changePropagationDueToDataDependenciesItemProvider.dispose();
		if (modifyInterfaceItemProvider != null) modifyInterfaceItemProvider.dispose();
		if (modifySignatureItemProvider != null) modifySignatureItemProvider.dispose();
		if (changePropagationDueToInterfaceDependenciesItemProvider != null) changePropagationDueToInterfaceDependenciesItemProvider.dispose();
	}

}
