package org.palladiosimulator.xtexttools.interfaces;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;

import com.google.inject.Module;

/**
 * Interface for a product that needs StandaloneSetup and RuntimeModule to work.
 * 
 * @author Jonas Heinisch
 *
 */
public abstract class IXProduct {

    /**
     * Should return an instance of YourGrammarStandaloneSetup.
     * 
     * @return YourGrammarStandaloneSetup instance
     */
    protected abstract ISetup getStandaloneSetup();

    /**
     * Should return an instance of YourGrammarRuntimeModule.
     * 
     * @return YourGrammarRuntimeModule instance
     */
    protected abstract Module getRuntimeModule();
    
    /**
     * This EPackages should be registered for Standalones.
     * @return An array of EPackages to register.
     */
    protected abstract Collection<EPackage> registerEPackages();

}
