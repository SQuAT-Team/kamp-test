/*
 * Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
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

import de.uka.ipd.sdq.pcm.gmf.seff.edit.policies.ForkAction2ItemSemanticEditPolicy;
import de.uka.ipd.sdq.pcm.gmf.seff.part.PalladioComponentModelVisualIDRegistry;
import de.uka.ipd.sdq.pcm.gmf.seff.providers.PalladioComponentModelElementTypes;

/**
 * @generated
 */
public class ForkAction2EditPart extends ShapeNodeEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 3023;

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
    public ForkAction2EditPart(View view) {
        super(view);
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ForkAction2ItemSemanticEditPolicy());
        installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
        // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
        // removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
    }

    /**
     * @generated
     */
    protected LayoutEditPolicy createLayoutEditPolicy() {
        org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

            protected EditPolicy createChildEditPolicy(EditPart child) {
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
     * @generated
     */
    protected IFigure createNodeShape() {
        return primaryShape = new ForkFigure();
    }

    /**
     * @generated
     */
    public ForkFigure getPrimaryShape() {
        return (ForkFigure) primaryShape;
    }

    /**
     * @generated
     */
    protected boolean addFixedChild(EditPart childEditPart) {
        if (childEditPart instanceof ForkActionEntityName2EditPart) {
            ((ForkActionEntityName2EditPart) childEditPart).setLabel(getPrimaryShape()
                    .getFigureForkFigureNameLabelFigure());
            return true;
        }
        if (childEditPart instanceof ForkActionForkedBehavioursEditPart) {
            IFigure pane = getPrimaryShape().getFigureForkCompartment();
            setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
            pane.add(((ForkActionForkedBehavioursEditPart) childEditPart).getFigure());
            return true;
        }
        return false;
    }

    /**
     * @generated
     */
    protected boolean removeFixedChild(EditPart childEditPart) {
        if (childEditPart instanceof ForkActionEntityName2EditPart) {
            return true;
        }
        if (childEditPart instanceof ForkActionForkedBehavioursEditPart) {
            IFigure pane = getPrimaryShape().getFigureForkCompartment();
            pane.remove(((ForkActionForkedBehavioursEditPart) childEditPart).getFigure());
            return true;
        }
        return false;
    }

    /**
     * @generated
     */
    protected void addChildVisual(EditPart childEditPart, int index) {
        if (addFixedChild(childEditPart)) {
            return;
        }
        super.addChildVisual(childEditPart, -1);
    }

    /**
     * @generated
     */
    protected void removeChildVisual(EditPart childEditPart) {
        if (removeFixedChild(childEditPart)) {
            return;
        }
        super.removeChildVisual(childEditPart);
    }

    /**
     * @generated
     */
    protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
        if (editPart instanceof ForkActionForkedBehavioursEditPart) {
            return getPrimaryShape().getFigureForkCompartment();
        }
        return getContentPane();
    }

    /**
     * @generated
     */
    protected NodeFigure createNodePlate() {
        DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
        return result;
    }

    /**
     * @generated
     */
    protected NodeFigure createNodeFigure() {
        NodeFigure figure = createNodePlate();
        figure.setLayoutManager(new StackLayout());
        IFigure shape = createNodeShape();
        figure.add(shape);
        contentPane = setupContentPane(shape);
        return figure;
    }

    /**
     * @generated
     */
    protected IFigure setupContentPane(IFigure nodeShape) {
        if (nodeShape.getLayoutManager() == null) {
            ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
            layout.setSpacing(5);
            nodeShape.setLayoutManager(layout);
        }
        return nodeShape; // use nodeShape itself as contentPane
    }

    /**
     * @generated
     */
    public IFigure getContentPane() {
        if (contentPane != null) {
            return contentPane;
        }
        return super.getContentPane();
    }

    /**
     * @generated
     */
    protected void setForegroundColor(Color color) {
        if (primaryShape != null) {
            primaryShape.setForegroundColor(color);
        }
    }

    /**
     * @generated
     */
    protected void setBackgroundColor(Color color) {
        if (primaryShape != null) {
            primaryShape.setBackgroundColor(color);
        }
    }

    /**
     * @generated
     */
    protected void setLineWidth(int width) {
        if (primaryShape instanceof Shape) {
            ((Shape) primaryShape).setLineWidth(width);
        }
    }

    /**
     * @generated
     */
    protected void setLineType(int style) {
        if (primaryShape instanceof Shape) {
            ((Shape) primaryShape).setLineStyle(style);
        }
    }

    /**
     * @generated
     */
    public EditPart getPrimaryChildEditPart() {
        return getChildBySemanticHint(PalladioComponentModelVisualIDRegistry
                .getType(ForkActionEntityName2EditPart.VISUAL_ID));
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnSource() {
        ArrayList<IElementType> types = new ArrayList<IElementType>(1);
        types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
        LinkedList<IElementType> types = new LinkedList<IElementType>();
        if (targetEditPart instanceof StartActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof StopActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof ExternalCallActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof EmitEventActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof LoopActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof BranchActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof InternalActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof CollectionIteratorActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof SetVariableActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof AcquireActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof ReleaseActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof ForkActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof RecoveryActionEditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof StartAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof StopAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof LoopAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof InternalAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof BranchAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof ExternalCallAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof EmitEventAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof AcquireAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof ReleaseAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof CollectionIteratorAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof RecoveryAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        if (targetEditPart instanceof SetVariableAction2EditPart) {
            types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        }
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
        LinkedList<IElementType> types = new LinkedList<IElementType>();
        if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
            types.add(PalladioComponentModelElementTypes.StartAction_2001);
            types.add(PalladioComponentModelElementTypes.StopAction_2002);
            types.add(PalladioComponentModelElementTypes.ExternalCallAction_2003);
            types.add(PalladioComponentModelElementTypes.EmitEventAction_2013);
            types.add(PalladioComponentModelElementTypes.LoopAction_2004);
            types.add(PalladioComponentModelElementTypes.BranchAction_2005);
            types.add(PalladioComponentModelElementTypes.InternalAction_2006);
            types.add(PalladioComponentModelElementTypes.CollectionIteratorAction_2007);
            types.add(PalladioComponentModelElementTypes.SetVariableAction_2008);
            types.add(PalladioComponentModelElementTypes.AcquireAction_2012);
            types.add(PalladioComponentModelElementTypes.ReleaseAction_2010);
            types.add(PalladioComponentModelElementTypes.ForkAction_2011);
            types.add(PalladioComponentModelElementTypes.RecoveryAction_2017);
            types.add(PalladioComponentModelElementTypes.StartAction_3004);
            types.add(PalladioComponentModelElementTypes.StopAction_3005);
            types.add(PalladioComponentModelElementTypes.LoopAction_3006);
            types.add(PalladioComponentModelElementTypes.InternalAction_3007);
            types.add(PalladioComponentModelElementTypes.BranchAction_3009);
            types.add(PalladioComponentModelElementTypes.ExternalCallAction_3012);
            types.add(PalladioComponentModelElementTypes.EmitEventAction_3046);
            types.add(PalladioComponentModelElementTypes.AcquireAction_3026);
            types.add(PalladioComponentModelElementTypes.ReleaseAction_3020);
            types.add(PalladioComponentModelElementTypes.ForkAction_3023);
            types.add(PalladioComponentModelElementTypes.CollectionIteratorAction_3013);
            types.add(PalladioComponentModelElementTypes.RecoveryAction_3061);
            types.add(PalladioComponentModelElementTypes.SetVariableAction_3024);
        }
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnTarget() {
        ArrayList<IElementType> types = new ArrayList<IElementType>(1);
        types.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMATypesForSource(IElementType relationshipType) {
        LinkedList<IElementType> types = new LinkedList<IElementType>();
        if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
            types.add(PalladioComponentModelElementTypes.StartAction_2001);
            types.add(PalladioComponentModelElementTypes.StopAction_2002);
            types.add(PalladioComponentModelElementTypes.ExternalCallAction_2003);
            types.add(PalladioComponentModelElementTypes.EmitEventAction_2013);
            types.add(PalladioComponentModelElementTypes.LoopAction_2004);
            types.add(PalladioComponentModelElementTypes.BranchAction_2005);
            types.add(PalladioComponentModelElementTypes.InternalAction_2006);
            types.add(PalladioComponentModelElementTypes.CollectionIteratorAction_2007);
            types.add(PalladioComponentModelElementTypes.SetVariableAction_2008);
            types.add(PalladioComponentModelElementTypes.AcquireAction_2012);
            types.add(PalladioComponentModelElementTypes.ReleaseAction_2010);
            types.add(PalladioComponentModelElementTypes.ForkAction_2011);
            types.add(PalladioComponentModelElementTypes.RecoveryAction_2017);
            types.add(PalladioComponentModelElementTypes.StartAction_3004);
            types.add(PalladioComponentModelElementTypes.StopAction_3005);
            types.add(PalladioComponentModelElementTypes.LoopAction_3006);
            types.add(PalladioComponentModelElementTypes.InternalAction_3007);
            types.add(PalladioComponentModelElementTypes.BranchAction_3009);
            types.add(PalladioComponentModelElementTypes.ExternalCallAction_3012);
            types.add(PalladioComponentModelElementTypes.EmitEventAction_3046);
            types.add(PalladioComponentModelElementTypes.AcquireAction_3026);
            types.add(PalladioComponentModelElementTypes.ReleaseAction_3020);
            types.add(PalladioComponentModelElementTypes.ForkAction_3023);
            types.add(PalladioComponentModelElementTypes.CollectionIteratorAction_3013);
            types.add(PalladioComponentModelElementTypes.RecoveryAction_3061);
            types.add(PalladioComponentModelElementTypes.SetVariableAction_3024);
        }
        return types;
    }

    /**
     * @generated
     */
    public class ForkFigure extends RoundedRectangle {

        /**
         * @generated
         */
        private WrappingLabel fFigureForkFigureNameLabelFigure;

        /**
         * @generated
         */
        private RectangleFigure fFigureForkCompartment;

        /**
         * @generated
         */
        public ForkFigure() {

            GridLayout layoutThis = new GridLayout();
            layoutThis.numColumns = 1;
            layoutThis.makeColumnsEqualWidth = true;
            layoutThis.horizontalSpacing = 0;
            layoutThis.verticalSpacing = 0;
            layoutThis.marginWidth = 0;
            layoutThis.marginHeight = 0;
            this.setLayoutManager(layoutThis);

            this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
            this.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
            createContents();
        }

        /**
         * @generated
         */
        private void createContents() {

            WrappingLabel stereotypeLabelFigure0 = new WrappingLabel();

            stereotypeLabelFigure0.setText("<<Fork>>");
            stereotypeLabelFigure0.setBorder(new MarginBorder(getMapMode().DPtoLP(2), getMapMode().DPtoLP(0),
                    getMapMode().DPtoLP(2), getMapMode().DPtoLP(0)));

            GridData constraintStereotypeLabelFigure0 = new GridData();
            constraintStereotypeLabelFigure0.verticalAlignment = GridData.CENTER;
            constraintStereotypeLabelFigure0.horizontalAlignment = GridData.CENTER;
            constraintStereotypeLabelFigure0.horizontalIndent = 0;
            constraintStereotypeLabelFigure0.horizontalSpan = 1;
            constraintStereotypeLabelFigure0.verticalSpan = 1;
            constraintStereotypeLabelFigure0.grabExcessHorizontalSpace = false;
            constraintStereotypeLabelFigure0.grabExcessVerticalSpace = false;
            this.add(stereotypeLabelFigure0, constraintStereotypeLabelFigure0);

            fFigureForkFigureNameLabelFigure = new WrappingLabel();

            fFigureForkFigureNameLabelFigure.setText("");
            fFigureForkFigureNameLabelFigure.setBorder(new MarginBorder(getMapMode().DPtoLP(2), getMapMode().DPtoLP(0),
                    getMapMode().DPtoLP(2), getMapMode().DPtoLP(0)));

            GridData constraintFFigureForkFigureNameLabelFigure = new GridData();
            constraintFFigureForkFigureNameLabelFigure.verticalAlignment = GridData.CENTER;
            constraintFFigureForkFigureNameLabelFigure.horizontalAlignment = GridData.CENTER;
            constraintFFigureForkFigureNameLabelFigure.horizontalIndent = 0;
            constraintFFigureForkFigureNameLabelFigure.horizontalSpan = 1;
            constraintFFigureForkFigureNameLabelFigure.verticalSpan = 1;
            constraintFFigureForkFigureNameLabelFigure.grabExcessHorizontalSpace = false;
            constraintFFigureForkFigureNameLabelFigure.grabExcessVerticalSpace = false;
            this.add(fFigureForkFigureNameLabelFigure, constraintFFigureForkFigureNameLabelFigure);

            fFigureForkCompartment = new RectangleFigure();

            fFigureForkCompartment.setFill(false);
            fFigureForkCompartment.setOutline(false);
            fFigureForkCompartment.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

            GridData constraintFFigureForkCompartment = new GridData();
            constraintFFigureForkCompartment.verticalAlignment = GridData.FILL;
            constraintFFigureForkCompartment.horizontalAlignment = GridData.FILL;
            constraintFFigureForkCompartment.horizontalIndent = 0;
            constraintFFigureForkCompartment.horizontalSpan = 1;
            constraintFFigureForkCompartment.verticalSpan = 1;
            constraintFFigureForkCompartment.grabExcessHorizontalSpace = true;
            constraintFFigureForkCompartment.grabExcessVerticalSpace = true;
            this.add(fFigureForkCompartment, constraintFFigureForkCompartment);

        }

        /**
         * @generated
         */
        public WrappingLabel getFigureForkFigureNameLabelFigure() {
            return fFigureForkFigureNameLabelFigure;
        }

        /**
         * @generated
         */
        public RectangleFigure getFigureForkCompartment() {
            return fFigureForkCompartment;
        }

    }

}
