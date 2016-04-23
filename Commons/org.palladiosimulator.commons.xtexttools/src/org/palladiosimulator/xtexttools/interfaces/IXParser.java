package org.palladiosimulator.xtexttools.interfaces;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;

/**
 * An interface for Xtext parser adapter.
 * 
 * @author Jonas Heinisch
 *
 */
public interface IXParser {
    /**
     * Parses an Object.
     * @return the parsed Object
     */
    public EObject parse();
    
    /**
     * Does the Parser has SyntaxErrors?
     * @return true iff it has syntactical errors
     */
    public boolean hasErrors();
    
    /**
     * Get Errors resulting from parsing.
     * 
     * @return INodes with errors, null if parsing hasn't been done.
     */
    public Iterable<INode> getErrors();
}
