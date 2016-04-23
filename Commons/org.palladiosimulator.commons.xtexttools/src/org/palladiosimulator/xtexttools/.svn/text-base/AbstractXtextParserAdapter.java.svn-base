package org.palladiosimulator.xtexttools;

import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.palladiosimulator.xtexttools.interfaces.IXParser;
import org.palladiosimulator.xtexttools.interfaces.IXProduct;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Abstract class for an adapter for Xtext-Parser.
 * @author Jonas Heinisch
 *
 */
public abstract class AbstractXtextParserAdapter extends IXProduct implements IXParser {

    @Inject
    private IParser parser;

    private String s;

    private IParseResult result;

    /**
     * Constructor for parser adapter. Use this for eclipse runtime.
     * 
     * @param s
     *            String to parse
     */
    public AbstractXtextParserAdapter(final String s) {
        this(s, false);
    }

    /**
     * Constructor for parser adapter.
     * 
     * @param standalone
     *            set true if not working inside eclipse
     * @param s
     *            String to parse
     */
    public AbstractXtextParserAdapter(final String s, final boolean standalone) {
        setupParser(standalone);
        this.s = s;
    }

    /**
     * Sets up the injector and injects fields.
     * 
     * @param standalone
     *            true if not used in eclipse
     */
    private void setupParser(final boolean standalone) {
        if (standalone) {
            for (EPackage pack : registerEPackages()) {
                EPackage.Registry.INSTANCE.put(pack.getNsURI(), pack);
            }
        }
        Injector injector;
        if (standalone) {
            injector = getStandaloneSetup().createInjectorAndDoEMFRegistration();
        } else {
            injector = Guice.createInjector(getRuntimeModule());
        }
        injector.injectMembers(this);
    }

    @Override
    public EObject parse() {
    	if(result==null){
    		result = parser.parse(new StringReader(s));
    	}
        return result.getRootASTElement();
    }

    @Override
    public boolean hasErrors() {
        if (result == null) {
            return false;
        }
        return result.hasSyntaxErrors();
    }

    @Override
    public Iterable<INode> getErrors() {
        if (result == null) {
            return null;
        }
        return result.getSyntaxErrors();
    }

}