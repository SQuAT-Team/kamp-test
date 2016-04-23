package org.palladiosimulator.xtexttools.interfaces;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

/**
 * An interface for Xtext embedded Editors.
 * 
 * @author Jonas Heinisch
 *
 */
@SuppressWarnings("restriction")
public interface IXEditor {

    /**
     * Get the instance of the concrete Editor.
     * 
     * @return the editor instance
     */
    public EmbeddedEditor getEmbeddedEditor();

    /**
     * Get the EmbeddedEditorModelAccess to obtain or manipulate the edited text.
     * 
     * @return the model access
     */
    public EmbeddedEditorModelAccess getEmbeddedEditorModelAccess();

    /**
     * Get the Object build with the editor.
     * 
     * @return the object
     */
    public EObject getRootNode();

    /**
     * Get the serialized object of the editor. (This is not the exact input of the editor, but the
     * formatted input.)
     * 
     * @return the serialized object
     */
    public String getContent();
    
    /**
     * Get the Resource of the editor.
     * @return the {@link XtextResource}
     */
    public XtextResource getResource();
}
