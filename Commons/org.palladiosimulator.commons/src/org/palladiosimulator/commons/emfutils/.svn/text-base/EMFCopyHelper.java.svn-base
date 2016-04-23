package org.palladiosimulator.commons.emfutils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

/**
 * 
 * @author Sebastian Lehrig
 * @author Steffen Becker
 */
public final class EMFCopyHelper {

    private static final ResourceSet SOURCE_RESOURCE_SET = new ResourceSetImpl();

    /** Static helper classes shall not be instantiated. */
    private EMFCopyHelper() {
    }

    public static List<EObject> deepCopyEObjectList(final List<EObject> roots) {
        final Copier copier = new Copier(true, false);
        final List<EObject> result = (List<EObject>) copier.copyAll(roots);
        copier.copyReferences();
        return result;
    }

    public static List<EObject> deepCopyToEObjectList(final ResourceSet originalResourceSet) {
        EcoreUtil.resolveAll(originalResourceSet);
        final List<EObject> roots = new LinkedList<EObject>();
        for (final Resource r : originalResourceSet.getResources()) {
            for (final EObject root : r.getContents()) {
                roots.add(root);
            }
        }
        return deepCopyEObjectList(roots);
    }

    public static ResourceSet deepCopyToEObjectList(final String fileName) throws FileNotFoundException, IOException {
        final Resource sourceResource = SOURCE_RESOURCE_SET.getResource(URI.createFileURI(fileName), true);
        sourceResource.load(Collections.EMPTY_MAP);
        EcoreUtil.resolveAll(sourceResource);
        return SOURCE_RESOURCE_SET;
    }

}
