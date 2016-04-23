/*
 * Copyright 2007, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.composite.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import de.uka.ipd.sdq.pcm.gmf.composite.edit.policies.EventChannelItemSemanticEditPolicy;
import de.uka.ipd.sdq.pcm.gmf.composite.part.PalladioComponentModelVisualIDRegistry;
import de.uka.ipd.sdq.pcm.gmf.composite.providers.PalladioComponentModelElementTypes;

/**
 * @generated
 */
public class EventChannelEditPart extends ShapeNodeEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 3017;

    /**
     * @generated
     */
    protected IFigure contentPane;

    /**
     * @generated
     */
    protected IFigure primaryShape;

    /**
     * @generated
     */
    public EventChannelEditPart(final View view) {
        super(view);
    }

    /**
     * @generated
     */
    @Override
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new EventChannelItemSemanticEditPolicy());
        installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
        // XXX need an SCR to runtime to have another abstract superclass that would let children
        // add reasonable editpolicies
        // removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
    }

    /**
     * @generated
     */
    protected LayoutEditPolicy createLayoutEditPolicy() {
        final org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

            @Override
            protected EditPolicy createChildEditPolicy(final EditPart child) {
                EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (result == null) {
                    result = new NonResizableEditPolicy();
                }
                return result;
            }

            @Override
            protected Command getMoveChildrenCommand(final Request request) {
                return null;
            }

            @Override
            protected Command getCreateCommand(final CreateRequest request) {
                return null;
            }
        };
        return lep;
    }

    /**
     * @generated
     */
    protected IFigure createNodeShape() {
        return primaryShape = new EventChannelFigure();
    }

    /**
     * @generated
     */
    public EventChannelFigure getPrimaryShape() {
        return (EventChannelFigure) primaryShape;
    }

    /**
     * @generated
     */
    protected boolean addFixedChild(final EditPart childEditPart) {
        if (childEditPart instanceof EventChannelEntityNameEditPart) {
            ((EventChannelEntityNameEditPart) childEditPart).setLabel(getPrimaryShape()
                    .getFigureEventChannelLabelFigure());
            return true;
        }
        return false;
    }

    /**
     * @generated
     */
    protected boolean removeFixedChild(final EditPart childEditPart) {
        if (childEditPart instanceof EventChannelEntityNameEditPart) {
            return true;
        }
        return false;
    }

    /**
     * @generated
     */
    @Override
    protected void addChildVisual(final EditPart childEditPart, final int index) {
        if (addFixedChild(childEditPart)) {
            return;
        }
        super.addChildVisual(childEditPart, -1);
    }

    /**
     * @generated
     */
    @Override
    protected void removeChildVisual(final EditPart childEditPart) {
        if (removeFixedChild(childEditPart)) {
            return;
        }
        super.removeChildVisual(childEditPart);
    }

    /**
     * @generated
     */
    @Override
    protected IFigure getContentPaneFor(final IGraphicalEditPart editPart) {
        return getContentPane();
    }

    /**
     * @generated
     */
    protected NodeFigure createNodePlate() {
        final DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(80, 40);
        return result;
    }

    /**
     * Creates figure for this edit part.
     * 
     * Body of this method does not depend on settings in generation model so you may safely remove
     * <i>generated</i> tag and modify it.
     * 
     * @generated
     */
    @Override
    protected NodeFigure createNodeFigure() {
        final NodeFigure figure = createNodePlate();
        figure.setLayoutManager(new StackLayout());
        final IFigure shape = createNodeShape();
        figure.add(shape);
        contentPane = setupContentPane(shape);
        return figure;
    }

    /**
     * Default implementation treats passed figure as content pane. Respects layout one may have set
     * for generated figure.
     * 
     * @param nodeShape
     *            instance of generated figure class
     * @generated
     */
    protected IFigure setupContentPane(final IFigure nodeShape) {
        if (nodeShape.getLayoutManager() == null) {
            final ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
            layout.setSpacing(5);
            nodeShape.setLayoutManager(layout);
        }
        return nodeShape; // use nodeShape itself as contentPane
    }

    /**
     * @generated
     */
    @Override
    public IFigure getContentPane() {
        if (contentPane != null) {
            return contentPane;
        }
        return super.getContentPane();
    }

    /**
     * @generated
     */
    @Override
    protected void setForegroundColor(final Color color) {
        if (primaryShape != null) {
            primaryShape.setForegroundColor(color);
        }
    }

    /**
     * @generated
     */
    @Override
    protected void setBackgroundColor(final Color color) {
        if (primaryShape != null) {
            primaryShape.setBackgroundColor(color);
        }
    }

    /**
     * @generated
     */
    @Override
    protected void setLineWidth(final int width) {
        if (primaryShape instanceof Shape) {
            ((Shape) primaryShape).setLineWidth(width);
        }
    }

    /**
     * @generated
     */
    @Override
    protected void setLineType(final int style) {
        if (primaryShape instanceof Shape) {
            ((Shape) primaryShape).setLineStyle(style);
        }
    }

    /**
     * @generated
     */
    @Override
    public EditPart getPrimaryChildEditPart() {
        return getChildBySemanticHint(PalladioComponentModelVisualIDRegistry
                .getType(EventChannelEntityNameEditPart.VISUAL_ID));
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnTarget() {
        final ArrayList<IElementType> types = new ArrayList<IElementType>(2);
        types.add(PalladioComponentModelElementTypes.EventChannelSinkConnector_4010);
        types.add(PalladioComponentModelElementTypes.EventChannelSourceConnector_4009);
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMATypesForSource(final IElementType relationshipType) {
        final LinkedList<IElementType> types = new LinkedList<IElementType>();
        if (relationshipType == PalladioComponentModelElementTypes.EventChannelSinkConnector_4010) {
            types.add(PalladioComponentModelElementTypes.SinkRole_3014);
        } else if (relationshipType == PalladioComponentModelElementTypes.EventChannelSourceConnector_4009) {
            types.add(PalladioComponentModelElementTypes.SourceRole_3013);
        }
        return types;
    }

    /**
     * @generated
     */
    public class EventChannelFigure extends ScalablePolygonShape {

        /**
         * @generated
         */
        private WrappingLabel fFigureEventChannelLabelFigure;

        /**
         * @generated
         */
        public EventChannelFigure() {

            final GridLayout layoutThis = new GridLayout();
            layoutThis.numColumns = 1;
            layoutThis.makeColumnsEqualWidth = true;
            this.setLayoutManager(layoutThis);

            this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(20)));
            this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode().DPtoLP(0)));
            this.addPoint(new Point(getMapMode().DPtoLP(80), getMapMode().DPtoLP(20)));
            this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40)));
            this.setPreferredSize(new Dimension(getMapMode().DPtoLP(80), getMapMode().DPtoLP(40)));
            this.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
            createContents();
        }

        /**
         * @generated
         */
        private void createContents() {

            fFigureEventChannelLabelFigure = new WrappingLabel();

            fFigureEventChannelLabelFigure.setText("<?>");

            final GridData constraintFFigureEventChannelLabelFigure = new GridData();
            constraintFFigureEventChannelLabelFigure.verticalAlignment = GridData.CENTER;
            constraintFFigureEventChannelLabelFigure.horizontalAlignment = GridData.CENTER;
            constraintFFigureEventChannelLabelFigure.horizontalIndent = 0;
            constraintFFigureEventChannelLabelFigure.horizontalSpan = 1;
            constraintFFigureEventChannelLabelFigure.verticalSpan = 1;
            constraintFFigureEventChannelLabelFigure.grabExcessHorizontalSpace = true;
            constraintFFigureEventChannelLabelFigure.grabExcessVerticalSpace = true;
            this.add(fFigureEventChannelLabelFigure, constraintFFigureEventChannelLabelFigure);

        }

        /**
         * @generated
         */
        public WrappingLabel getFigureEventChannelLabelFigure() {
            return fFigureEventChannelLabelFigure;
        }

    }

}
