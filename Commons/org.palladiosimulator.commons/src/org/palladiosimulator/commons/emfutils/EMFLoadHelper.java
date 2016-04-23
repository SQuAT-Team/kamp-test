package org.palladiosimulator.commons.emfutils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * This class provides static helper methods for accessing models during runtime. Models are stored
 * in resources, identified by resource URIs. Concrete model elements are identified by their
 * fragments.
 *
 * @author Sebastian Lehrig
 */
public final class EMFLoadHelper {

    /** Static helper classes shall not be instantiated. */
    private EMFLoadHelper() {
    }

    /**
     * Loads the EObject specified by the given resource URI. The resource URI has to include the
     * concrete fragment that references the EObject; otherwise an EObject cannot be uniquely
     * identified in a given resource. For example, the String
     * "platform:/resource/myProject/default.usagemodel#_ieXlgKDrEeKjDcfkNgs1Gg" correctly includes
     * a fragment while "platform:/resource/myProject/default.usagemodel" does not. Use the
     * <code>getResourceURI(...)</code> method of this class in case you want to get a correct
     * resource URI for a given EObject.
     *
     * @param resourceURI
     *            Resource URI to a given EObject (has to include fragment).
     * @return The referenced EObject.
     */
    public static EObject loadAndResolveEObject(final String resourceURI) {
        return loadAndResolveEObject(new ResourceSetImpl(), resourceURI);
    }

    public static EObject loadAndResolveEObject(final ResourceSet resourceSet, final String resourceURI) {
        return loadAndResolveEObject(resourceSet, URI.createURI(resourceURI));
    }

    public static EObject loadAndResolveEObject(final ResourceSet resourceSet, final URI modelURI) {
        if (modelURI.fragment() == null) {
            throw new IllegalArgumentException(
                    "The resource URI has to include the concrete fragment that references the EObject;"
                            + "otherwise an EObject cannot be uniquely identified in a given resource");
        }

        final Resource resource = resourceSet.getResource(modelURI.trimFragment(), true);
        if (resource == null) {
            throw new IllegalArgumentException("Could not load resource with URI " + modelURI);
        }

        final EObject eObject = resource.getEObject(modelURI.fragment());
        if (eObject == null) {
            throw new IllegalArgumentException("Could not get eObject with URI " + modelURI);
        }

        return eObject;
    }

    /**
     * Creates a resource URI for a given EObject; including its fragment that uniquely identifies
     * the EObject within the resource.
     *
     * @param eObject
     *            The given EObject.
     * @return The URI String of the given object; including its fragment.
     */
    public static String getResourceURI(final EObject eObject) {
        final Resource resource = eObject.eResource();
        if (resource == null) {
            // FIXME: What should be the right behaviour here??
            return "";
        } else {
            final URI uri = resource.getURI();
            final URI fullUri = uri.appendFragment(getResourceFragment(eObject));

            return fullUri.toString();
        }
    }

    /**
     * Returns the URI fragment of a given eObject.
     *
     * @param eObject
     *            the eObject to look the fragment up for.
     * @return the fragment of the eObject.
     */
    public static String getResourceFragment(final EObject eObject) {
        return eObject.eResource().getURIFragment(eObject);
    }
}
