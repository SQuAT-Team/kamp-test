package de.uka.ipd.sdq.pcm.gmf.repository.helper;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.ui.PlatformUI;
import org.palladiosimulator.editors.dialogs.stoex.StochasticExpressionEditDialog;
import org.palladiosimulator.pcm.core.CoreFactory;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.parameter.ParameterPackage;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

/**
 * A variable character EditHelperAdvice.
 */
public class VariableCharacterisationEditHelperAdvice extends AbstractEditHelperAdvice implements IEditHelperAdvice {

    @Override
    protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
        PCMRandomVariable rv = CoreFactory.eINSTANCE.createPCMRandomVariable();
        rv.setSpecification("");

        StochasticExpressionEditDialog dialog = new StochasticExpressionEditDialog(PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getShell(), TypeEnum.ANY, rv);
        dialog.open();

        if (dialog.getReturnCode() == Dialog.CANCEL) {
            return new CanceledCommand();
        }

        rv.setSpecification(dialog.getResultText());

        ICommand cmd = new SetValueCommand(new SetRequest(request.getElementToConfigure(),
                ParameterPackage.eINSTANCE.getVariableCharacterisation_Specification_VariableCharacterisation(), rv));

        return cmd;
    }
}
