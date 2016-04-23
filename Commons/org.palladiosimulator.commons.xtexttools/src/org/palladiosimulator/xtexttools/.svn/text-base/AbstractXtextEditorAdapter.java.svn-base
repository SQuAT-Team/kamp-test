package org.palladiosimulator.xtexttools;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.validation.IResourceValidator;
import org.palladiosimulator.xtexttools.interfaces.IXEditor;
import org.palladiosimulator.xtexttools.interfaces.IXSerializer;

import com.google.inject.Injector;

/**
 * Abstract class for Xtext embedded editor.
 * 
 * @author Jonas Heinisch
 *
 */
@SuppressWarnings("restriction")
public abstract class AbstractXtextEditorAdapter implements IXEditor {

    private static final String PREFIX = "";
    private static final String SUFFIX = "";
    private EmbeddedEditorModelAccess partialEditorModelAccess;
    private EmbeddedEditor embeddedEditor;
    private XtextResource resource;
    private IXSerializer serializer;
    private Injector injector;
    
    /**
     * Constructor for your XtextEditorAdapter.
     * 
     * @param parent
     *            the parent Composite of the {@link EmbeddedEditor}
     * @param string
     *            the String that is initially set inside the Editor.
     */
    public AbstractXtextEditorAdapter(Composite parent, String string) {
        // TODO: show error/warning marks!
        if (string == null) {
            string = "";
        }
        EmbeddedEditorFactory factory = getInjectorInstance().getInstance(EmbeddedEditorFactory.class);
        IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {
            public XtextResource createResource() {

                XtextResourceSet rs = getInjectorInstance().getInstance(XtextResourceSet.class);
                rs.setClasspathURIContext(getClass());

                IResourceFactory resourceFactory = getInjectorInstance().getInstance(IResourceFactory.class);
                URI uri = URI.createURI("dummy:/inmemory" + getUniqueID() + "." + getFileExtension());
                resource = (XtextResource) resourceFactory.createResource(uri);
                rs.getResources().add(resource);

                EcoreUtil.resolveAll(resource);

                return resource;
            }
        };
        embeddedEditor = factory.newEditor(resourceProvider).showErrorAndWarningAnnotations().withParent(parent);
        partialEditorModelAccess = embeddedEditor.createPartialEditor(PREFIX, string, SUFFIX, false);
        serializer = getSerializer();
    }

    /**
     * Generates an ID for the dummy-resource.
     * 
     * @return timeinmillis + random(0-9999);
     */
    protected long getUniqueID() {
        return System.currentTimeMillis() + (int) (Math.random() * 10000);
    }

    /**
     * Returns a unique instance of an {@link Injector}.
     * 
     * @return the {@link Injector}
     */
    protected final Injector getInjectorInstance() {
        if (injector == null) {
            injector = getInjector();
        }
        return injector;
    }

    @Override
    public EmbeddedEditor getEmbeddedEditor() {
        return embeddedEditor;
    }

    @Override
    public EmbeddedEditorModelAccess getEmbeddedEditorModelAccess() {
        return partialEditorModelAccess;
    }

    @Override
    public EObject getRootNode() {
        return resource.getContents().get(0);
    }

    @Override
    public String getContent() {
        return serializer.valueOf(getRootNode());
    }

    @Override
    public XtextResource getResource() {
        return resource;
    }

    /**
     * Should return an instance of an {@link Injector} you can get from your YourGrammarActivator
     * in Xtexts UI package.
     * 
     * @return {@link Injector} instance
     */
    protected abstract Injector getInjector();

    /**
     * Should return the fileextension of yourgrammar without a dot.
     * 
     * @return "yourGrammar"
     */
    protected abstract String getFileExtension();

    /**
     * Should return an instance of an IXSerializer for your grammar.
     * 
     * @return {@link IXSerializer} instance
     */
    protected abstract IXSerializer getSerializer();

}
