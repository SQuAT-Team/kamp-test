package org.palladiosimulator.xtexttools.interfaces;

import org.eclipse.emf.ecore.EObject;

/**
 * An interface for a Xtext serializer adapter.
 * @author Jonas Heinisch
 *
 */
public interface IXSerializer {
    /**
     * Serializes the Object to a String.
     * @param eobj the Oject to serialize.
     * @return the String representation
     */
    public String valueOf(EObject eobj);
}
