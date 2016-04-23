package org.palladiosimulator.commons.stoex.adapter;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.palladiosimulator.commons.stoex.StoExRuntimeModule;
import org.palladiosimulator.commons.stoex.StoExStandaloneSetup;
import org.palladiosimulator.xtexttools.AbstractXtextSerializerAdapter;

import com.google.inject.Module;

import de.uka.ipd.sdq.probfunction.ProbabilityFunction;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.NamespaceReference;
import de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.VariableReference;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * A Serializer adapter for StoEx.
 * 
 * @author Jonas Heinisch
 *
 */
public class StoExSerializer extends AbstractXtextSerializerAdapter {

    @Override
    protected ISetup getStandaloneSetup() {
        return new StoExStandaloneSetup();
    }

    @Override
    protected Module getRuntimeModule() {
        return new StoExRuntimeModule();
    }

    /**
     * Same as {@link AbstractXtextSerializerAdapter#valueOf(EObject)}.
     * 
     * @param o
     *            the object to pretty print
     * @return pretty printed String
     */
    public String prettyPrint(EObject o) {
        return valueOf(o);
    }

    @Override
    protected Collection<EPackage> registerEPackages() {
        Collection<EPackage> packages = new LinkedList<EPackage>();
        packages.add(StoexPackage.eINSTANCE);
        packages.add(ProbfunctionPackage.eINSTANCE);
        packages.add(UnitsPackage.eINSTANCE);
        return packages;
    }

    @Override
    public String valueOf(EObject o) {
        // TODO: the setting makes trouble...
        if (o instanceof ProbabilityFunction) {
            ProbabilityFunctionLiteral pfl = StoexFactory.eINSTANCE.createProbabilityFunctionLiteral();
            pfl.setFunction_ProbabilityFunctionLiteral((ProbabilityFunction) o);
            o = pfl;
        } else if (o instanceof AbstractNamedReference) {
            return abstractNamedReferencePrettyPrint((AbstractNamedReference) o);
        }
        return super.valueOf(o);
    }

    /**
     * This is a fix for prettyprinting VariableReferences because the Serializer won't do this due AbstractNamedReference is no Expression.
     * @param o an {@link AbstractNamedReference} to pretty print
     * @return the prettyprinted Strin
     */
    private String abstractNamedReferencePrettyPrint(AbstractNamedReference o) {
        if (o instanceof VariableReference) {
            return ((VariableReference) o).getReferenceName();
        }
        if (o instanceof NamespaceReference) {
            return ((NamespaceReference) o).getReferenceName()
                    + "."
                    + abstractNamedReferencePrettyPrint(((NamespaceReference) o).getInnerReference_NamespaceReference());
        }
        return valueOf(o.eContainer());
    }
}
