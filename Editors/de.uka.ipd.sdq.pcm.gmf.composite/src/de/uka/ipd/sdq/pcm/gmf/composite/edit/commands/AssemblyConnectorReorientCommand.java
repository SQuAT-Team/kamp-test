/*
 * Copyright 2007, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.composite.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.policies.PalladioComponentModelBaseItemSemanticEditPolicy;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;

/**
 * @generated
 */
public class AssemblyConnectorReorientCommand extends EditElementCommand {

    /**
     * @generated
     */
    private final int reorientDirection;

    /**
     * @generated
     */
    private final EObject oldEnd;

    /**
     * @generated
     */
    private final EObject newEnd;

    /**
     * @generated
     */
    public AssemblyConnectorReorientCommand(ReorientRelationshipRequest request) {
        super(request.getLabel(), request.getRelationship(), request);
        reorientDirection = request.getDirection();
        oldEnd = request.getOldRelationshipEnd();
        newEnd = request.getNewRelationshipEnd();
    }

    /**
     * @generated
     */
    public boolean canExecute() {
        if (false == getElementToEdit() instanceof AssemblyConnector) {
            return false;
        }
        if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
            return canReorientSource();
        }
        if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
            return canReorientTarget();
        }
        return false;
    }

    /**
     * @generated
     */
    protected boolean canReorientSource() {
        if (!(oldEnd instanceof OperationRequiredRole && newEnd instanceof OperationRequiredRole)) {
            return false;
        }
        OperationProvidedRole target = getLink().getProvidedRole_AssemblyConnector();
        if (!(getLink().eContainer() instanceof ComposedStructure)) {
            return false;
        }
        ComposedStructure container = (ComposedStructure) getLink().eContainer();
        return PalladioComponentModelBaseItemSemanticEditPolicy.getLinkConstraints().canExistAssemblyConnector_4004(
                container, getLink(), getNewSource(), target);
    }

    /**
     * @generated
     */
    protected boolean canReorientTarget() {
        if (!(oldEnd instanceof OperationProvidedRole && newEnd instanceof OperationProvidedRole)) {
            return false;
        }
        OperationRequiredRole source = getLink().getRequiredRole_AssemblyConnector();
        if (!(getLink().eContainer() instanceof ComposedStructure)) {
            return false;
        }
        ComposedStructure container = (ComposedStructure) getLink().eContainer();
        return PalladioComponentModelBaseItemSemanticEditPolicy.getLinkConstraints().canExistAssemblyConnector_4004(
                container, getLink(), source, getNewTarget());
    }

    /**
     * @generated
     */
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
        if (!canExecute()) {
            throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
        }
        if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
            return reorientSource();
        }
        if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
            return reorientTarget();
        }
        throw new IllegalStateException();
    }

    /**
     * @generated
     */
    protected CommandResult reorientSource() throws ExecutionException {
        getLink().setRequiredRole_AssemblyConnector(getNewSource());
        return CommandResult.newOKCommandResult(getLink());
    }

    /**
     * @generated
     */
    protected CommandResult reorientTarget() throws ExecutionException {
        getLink().setProvidedRole_AssemblyConnector(getNewTarget());
        return CommandResult.newOKCommandResult(getLink());
    }

    /**
     * @generated
     */
    protected AssemblyConnector getLink() {
        return (AssemblyConnector) getElementToEdit();
    }

    /**
     * @generated
     */
    protected OperationRequiredRole getOldSource() {
        return (OperationRequiredRole) oldEnd;
    }

    /**
     * @generated
     */
    protected OperationRequiredRole getNewSource() {
        return (OperationRequiredRole) newEnd;
    }

    /**
     * @generated
     */
    protected OperationProvidedRole getOldTarget() {
        return (OperationProvidedRole) oldEnd;
    }

    /**
     * @generated
     */
    protected OperationProvidedRole getNewTarget() {
        return (OperationProvidedRole) newEnd;
    }
}
