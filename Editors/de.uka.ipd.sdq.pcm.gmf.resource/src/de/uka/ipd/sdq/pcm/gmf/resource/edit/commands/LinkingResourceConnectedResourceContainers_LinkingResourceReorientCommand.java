/*
 * Copyright 2009, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.resource.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import de.uka.ipd.sdq.pcm.gmf.resource.edit.policies.PalladioComponentModelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class LinkingResourceConnectedResourceContainers_LinkingResourceReorientCommand extends EditElementCommand {

    /**
     * @generated
     */
    private final int reorientDirection;

    /**
     * @generated
     */
    private final EObject referenceOwner;

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
    public LinkingResourceConnectedResourceContainers_LinkingResourceReorientCommand(
            ReorientReferenceRelationshipRequest request) {
        super(request.getLabel(), null, request);
        reorientDirection = request.getDirection();
        referenceOwner = request.getReferenceOwner();
        oldEnd = request.getOldRelationshipEnd();
        newEnd = request.getNewRelationshipEnd();
    }

    /**
     * @generated
     */
    public boolean canExecute() {
        if (false == referenceOwner instanceof LinkingResource) {
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
        if (!(oldEnd instanceof ResourceContainer && newEnd instanceof LinkingResource)) {
            return false;
        }
        return PalladioComponentModelBaseItemSemanticEditPolicy
                .getLinkConstraints()
                .canExistLinkingResourceConnectedResourceContainers_LinkingResource_4003(getNewSource(), getOldTarget());
    }

    /**
     * @generated
     */
    protected boolean canReorientTarget() {
        if (!(oldEnd instanceof ResourceContainer && newEnd instanceof ResourceContainer)) {
            return false;
        }
        return PalladioComponentModelBaseItemSemanticEditPolicy
                .getLinkConstraints()
                .canExistLinkingResourceConnectedResourceContainers_LinkingResource_4003(getOldSource(), getNewTarget());
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
        getOldSource().getConnectedResourceContainers_LinkingResource().remove(getOldTarget());
        getNewSource().getConnectedResourceContainers_LinkingResource().add(getOldTarget());
        return CommandResult.newOKCommandResult(referenceOwner);
    }

    /**
     * @generated
     */
    protected CommandResult reorientTarget() throws ExecutionException {
        getOldSource().getConnectedResourceContainers_LinkingResource().remove(getOldTarget());
        getOldSource().getConnectedResourceContainers_LinkingResource().add(getNewTarget());
        return CommandResult.newOKCommandResult(referenceOwner);
    }

    /**
     * @generated
     */
    protected LinkingResource getOldSource() {
        return (LinkingResource) referenceOwner;
    }

    /**
     * @generated
     */
    protected LinkingResource getNewSource() {
        return (LinkingResource) newEnd;
    }

    /**
     * @generated
     */
    protected ResourceContainer getOldTarget() {
        return (ResourceContainer) oldEnd;
    }

    /**
     * @generated
     */
    protected ResourceContainer getNewTarget() {
        return (ResourceContainer) newEnd;
    }
}
