package org.palladiosimulator.commons.stoex.adapter;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.service.DefaultRuntimeModule;
import org.palladiosimulator.commons.stoex.StoExRuntimeModule;
import org.palladiosimulator.commons.stoex.StoExStandaloneSetup;
import org.palladiosimulator.xtexttools.AbstractXtextParserAdapter;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * @author Jonas Heinisch
 *
 */
public class StoExParser extends AbstractXtextParserAdapter {
    
    /**
     * Constructor for StoEx parser adapter. Use this for eclipse runtime.
     * 
     * @param s
     *            String to parse
     */
    public StoExParser(String s) {
        super(s);
    }

    /**
     * Constructor for StoEx parser adapter.
     * 
     * @param standalone
     *            set true if not working inside eclipse
     * @param s
     *            String to parse
     */
    public StoExParser(String s, boolean standalone) {
        super(s, standalone);
    }

    @Override
    protected DefaultRuntimeModule getRuntimeModule() {
        return new StoExRuntimeModule();
    }

    @Override
    protected ISetup getStandaloneSetup() {
        return new StoExStandaloneSetup();
    }

    /**
     * Returns {@link Expression} if parser started with parametrized constructor and String can be
     * parsed to {@link Expression}. Null else.
     * 
     * @return parsed {@link Expression}
     */
    public Expression expression() {
        EObject o = parse();
        if (o instanceof Expression) {
            return (Expression) o;
        }
        return null;
    }

    @Override
    protected Collection<EPackage> registerEPackages() {
        Collection<EPackage> packages = new LinkedList<EPackage>();
        packages.add(StoexPackage.eINSTANCE);
        packages.add(ProbfunctionPackage.eINSTANCE);
        packages.add(UnitsPackage.eINSTANCE);
        return packages;
    }

}
