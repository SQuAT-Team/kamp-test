/*
 * Copyright 2007, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.composite.custom.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableLabelEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.gmf.composite.custom.AbstractBorderFigure.POSITION_TYPE;
import de.uka.ipd.sdq.pcm.gmf.composite.custom.SourceFigure;
import de.uka.ipd.sdq.pcm.gmf.composite.custom.edit.policies.CustomSourceRoleItemSemanticEditPolicy;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.SourceRoleEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.SourceRoleEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.part.PalladioComponentModelVisualIDRegistry;

/**
 * The Class CustomSourceRoleEditPart.
 */
public class CustomSourceRoleEditPart extends SourceRoleEditPart {

    /**
     * Instantiates a new custom source role edit part.
     * 
     * @param view
     *            the view
     */
    public CustomSourceRoleEditPart(View view) {
        super(view);
    }

    /** size of the figure in LP. @generated not */
    private static final int FIGURE_LOGICAL_SIZE = 30;

    /**
     * Creates figure for this edit part.
     * 
     * Body of this method does not depend on settings in generation model so you may safely remove
     * <i>generated</i> tag and modify it.
     * 
     * Manually modified to generate a specific source figure instead of the standard shape
     * configured in the map model.
     * 
     * @return the node figure
     * @generated not
     */
    protected NodeFigure createMainFigure() {
        SourceFigure figure = new SourceFigure(getMapMode().DPtoLP(FIGURE_LOGICAL_SIZE), POSITION_TYPE.POS_INTERNAL);
        figure.getBounds().setSize(figure.getPreferredSize());
        return figure;
    }

    /**
     * Creates the default edit policies.
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.SourceRoleEditPart#createDefaultEditPolicies()
     */
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, getPrimaryDragEditPolicy());
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CustomSourceRoleItemSemanticEditPolicy());
        installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
        // XXX need an SCR to runtime to have another abstract superclass that would let children
        // removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

        // Modification: don't let parts be removed from components by clicking [BACKSPACE]
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy() {
            @Override
            protected Command getDeleteCommand(GroupRequest request) {
                return null;
            }
            // protected Command getOrphanCommand() {
            // return null; // don't let parts be moved from components
            // }
        });
    }

    /**
     * Enable freely placeable labels.
     * 
     * @return the layout edit policy
     * @author Andreas Rentschler
     * @generated not
     */
    @Override
    protected LayoutEditPolicy createLayoutEditPolicy() {
        org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

            protected EditPolicy createChildEditPolicy(EditPart child) {
                View childView = (View) child.getModel();
                switch (PalladioComponentModelVisualIDRegistry.getVisualID(childView)) {
                case SourceRoleEntityNameEditPart.VISUAL_ID:
                    // return new BorderItemSelectionEditPolicy() {
                    //
                    // protected List<MoveHandle> createSelectionHandles() {
                    // MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
                    // mh.setBorder(null);
                    // return Collections.singletonList(mh);
                    // }
                    // };
                    // Replace by the following:
                    /* > */
                    // no movability limited to NSEW locations
                    return new NonResizableLabelEditPolicy() {
                        /* return new BorderItemSelectionEditPolicy() */

                        protected List<MoveHandle> createSelectionHandles() {
                            MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
                            mh.setBorder(null);
                            return Collections.singletonList(mh);
                        }
                    };
                    /* < */
                default:
                    // unspecified
                }
                EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (result == null) {
                    result = new NonResizableEditPolicy();
                }
                return result;
            }

            protected Command getMoveChildrenCommand(Request request) {
                return null;
            }

            protected Command getCreateCommand(CreateRequest request) {
                return null;
            }
        };
        return lep;
    }

    /**
     * Modify labels attached to border items to be freely placeable. Adjust default location.
     * 
     * @param borderItemContainer
     *            the border item container
     * @param borderItemEditPart
     *            the border item edit part
     * @author Andreas Rentschler
     * @generated not
     */
    @Override
    protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
        if (borderItemEditPart instanceof SourceRoleEntityNameEditPart) {
            BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.EAST/* SOUTH */)
            /* > */
            {
                /*
                 * (non-Javadoc)
                 * 
                 * @see org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator
                 * #locateOnParent(org.eclipse.draw2d.geometry.Point, int,
                 * org.eclipse.draw2d.IFigure)
                 */
                @Override
                protected Point locateOnParent(Point suggestedLocation, int suggestedSide, IFigure borderItem) {
                    // override fixed positioning (NSEW) with arbitrary one, correct displacement
                    Dimension borderItemSize = getSize(borderItem);
                    suggestedLocation.x -= borderItemSize.width / 2;
                    suggestedLocation.y -= borderItemSize.height / 2;
                    // try to fix repaint bug (initially not drawn)
                    borderItem.repaint();

                    return suggestedLocation;
                }

                /*
                 * (non-Javadoc)
                 * 
                 * @see org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator
                 * #getPreferredLocation(int, org.eclipse.draw2d.IFigure)
                 */
                @Override
                protected Point getPreferredLocation(int side, IFigure borderItem) {
                    Point point = super.getPreferredLocation(side, borderItem);
                    // correct displacement done above
                    point.x += getSize(borderItem).width / 2;
                    // point.y += getSize(borderItem).height / 2;

                    return point;
                }
            };
            // initially place label nearer than suggested 20 units
            locator.setBorderItemOffset(new Dimension(-0, -5)); // -20, -20));
            /* < */
            borderItemContainer.add(borderItemEditPart.getFigure(), locator);
        } else {
            super.addBorderItem(borderItemContainer, borderItemEditPart);
        }
    }

}
