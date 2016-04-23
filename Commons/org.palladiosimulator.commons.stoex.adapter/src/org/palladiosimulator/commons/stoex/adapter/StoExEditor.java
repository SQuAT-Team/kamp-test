package org.palladiosimulator.commons.stoex.adapter;

import org.eclipse.swt.widgets.Composite;
import org.palladiosimulator.commons.stoex.ui.internal.StoExActivator;
import org.palladiosimulator.xtexttools.AbstractXtextEditorAdapter;
import org.palladiosimulator.xtexttools.interfaces.IXSerializer;

import com.google.inject.Injector;

/**
 * Embedded Editor adapter for StoEx.
 * 
 * @author Jonas Heinisch
 *
 */
public class StoExEditor extends AbstractXtextEditorAdapter {

    /**
     * Constructor with parent composite and initial input.
     * 
     * @param parent
     *            the parent composite
     * @param string
     *            the initial editor input
     */
    public StoExEditor(Composite parent, String string) {
        super(parent, string);
    }

    @Override
    protected Injector getInjector() {
        StoExActivator activator = StoExActivator.getInstance();
        return activator.getInjector(StoExActivator.ORG_PALLADIOSIMULATOR_COMMONS_STOEX_STOEX);
    }

    @Override
    protected String getFileExtension() {
        return "stoex";
    }

    @Override
    protected IXSerializer getSerializer() {
        return new StoExSerializer();
    }

}
