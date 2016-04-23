package de.uka.ipd.sdq.pcm.gmf.toolbar.actions;

import org.eclipse.ui.INewWizard;

import de.uka.ipd.sdq.pcm.gmf.resource.part.PalladioComponentModelCreationWizard;
import de.uka.ipd.sdq.pcm.gmf.toolbar.BaseNewDiagramAction;

/**
 * The Class NewResourceDiagramAction.
 */
public class NewResourceDiagramAction extends BaseNewDiagramAction {

    /**
     * Gets the new wizard.
     * 
     * @return the new wizard
     * @see de.uka.ipd.sdq.pcm.gmf.toolbar.BaseNewDiagramAction#getNewWizard()
     */
    @Override
    protected INewWizard getNewWizard() {
        return new PalladioComponentModelCreationWizard();
    }
}