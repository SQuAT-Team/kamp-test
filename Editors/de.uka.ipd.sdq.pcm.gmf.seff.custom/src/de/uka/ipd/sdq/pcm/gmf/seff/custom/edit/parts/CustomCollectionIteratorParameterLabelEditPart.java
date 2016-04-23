/*
 * Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorParameterLabelEditPart;
import org.palladiosimulator.pcm.seff.CollectionIteratorAction;

/**
 * The customized collection iterator parameter label edit part class.
 */
public class CustomCollectionIteratorParameterLabelEditPart extends CollectionIteratorParameterLabelEditPart {

    /**
     * Instantiates a new customized collection iterator parameter label edit part.
     * 
     * @param view
     *            the view
     */
    public CustomCollectionIteratorParameterLabelEditPart(final View view) {
        super(view);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorParameterLabelEditPart#getLabelText
     * ()
     */
    /**
     * Gets the label text.
     * 
     * @return the label text
     * @see de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorParameterLabelEditPart#getLabelText()
     */
    @Override
    protected String getLabelText() {
        String text = "Param: ";
        final CollectionIteratorAction action = (CollectionIteratorAction) this.resolveSemanticElement();
        if (action.getParameter_CollectionIteratorAction() != null
                && action.getParameter_CollectionIteratorAction().getParameterName() != null) {
            text += action.getParameter_CollectionIteratorAction().getParameterName();
        }
        if (text == null || text.length() == 0) {
            text = this.getLabelTextHelper(this.getFigure());
        }
        return text;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorParameterLabelEditPart#
     * addSemanticListeners()
     */
    /**
     * Adds the semantic listeners.
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorParameterLabelEditPart#addSemanticListeners()
     */
    @Override
    protected void addSemanticListeners() {
        final CollectionIteratorAction action = (CollectionIteratorAction) this.resolveSemanticElement();
        this.addListenerFilter("SemanticModel", this, action); //$NON-NLS-1$
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorParameterLabelEditPart#
     * removeSemanticListeners()
     */
    /**
     * Removes the semantic listeners.
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorParameterLabelEditPart#removeSemanticListeners()
     */
    @Override
    protected void removeSemanticListeners() {
        this.removeListenerFilter("SemanticModel"); //$NON-NLS-1$
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorParameterLabelEditPart#
     * handleNotificationEvent(org.eclipse.emf.common.notify.Notification)
     */
    /**
     * Handle notification event.
     * 
     * @param event
     *            the event
     * @see de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorParameterLabelEditPart#handleNotificationEvent(org.eclipse.emf.common.notify.Notification)
     */
    @Override
    protected void handleNotificationEvent(final Notification event) {
        final Object feature = event.getFeature();
        if (NotationPackage.eINSTANCE.getFontStyle_FontColor().equals(feature)) {
            final Integer c = (Integer) event.getNewValue();
            this.setFontColor(DiagramColorRegistry.getInstance().getColor(c));
        } else if (NotationPackage.eINSTANCE.getFontStyle_Underline().equals(feature)) {
            this.refreshUnderline();
        } else if (NotationPackage.eINSTANCE.getFontStyle_StrikeThrough().equals(feature)) {
            this.refreshStrikeThrough();
        } else if (NotationPackage.eINSTANCE.getFontStyle_FontHeight().equals(feature)
                || NotationPackage.eINSTANCE.getFontStyle_FontName().equals(feature)
                || NotationPackage.eINSTANCE.getFontStyle_Bold().equals(feature)
                || NotationPackage.eINSTANCE.getFontStyle_Italic().equals(feature)) {
            this.refreshFont();
        } else {
            this.refreshLabel();
        }
        super.handleNotificationEvent(event);
    }
}
