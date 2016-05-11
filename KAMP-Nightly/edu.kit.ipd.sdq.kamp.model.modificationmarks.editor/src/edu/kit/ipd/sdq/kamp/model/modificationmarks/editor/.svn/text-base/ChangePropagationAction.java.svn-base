package edu.kit.ipd.sdq.kamp.model.modificationmarks.editor;

import java.io.IOException;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.core.ChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository;

public class ChangePropagationAction implements IActionDelegate {

	public ChangePropagationAction() {
	}

	private ISelection selection;

	@Override
	public void run(IAction action) {

		PlatformUI.getWorkbench().saveAllEditors(false);
		
		Object selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection)selection).size()==1) {
				selectedElement = ((IStructuredSelection)selection).getFirstElement();
			}
		}
		
		if (selectedElement != null) {
			if (selectedElement instanceof ModificationRepository) {
				String fileName = ((ModificationRepository)selectedElement).eResource().getURI().trimFileExtension().lastSegment();
				String folderPathString = ((ModificationRepository)selectedElement).eResource().getURI().trimSegments(1).toPlatformString(false);

				ArchitectureVersion targetversion = null;
				if (folderPathString != null) {
					try {
						targetversion = ArchitectureVersionPersistency.load(folderPathString, fileName, "target");
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				
				if (targetversion != null) {
					ChangePropagationAnalysis changePropagationAnalysis = new ChangePropagationAnalysis();
					changePropagationAnalysis.runChangePropagationAnalysis(targetversion);
					try {
						ArchitectureVersionPersistency.saveModificationMarkFile(folderPathString, fileName, targetversion);
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				
				if (!targetversion.getModificationMarkRepository().getChangePropagationSteps().isEmpty()) {
					showMessage("Ausbreitungsschritte wurden unterhalb im Baum eingef�gt.");
				} else {
					showMessage("Es konnten keine Ausbreitungsschritte ermittelt werden.");
				}
				
				PlatformUI.getWorkbench().saveAllEditors(false);
			}
		}
		
	}
	
	public void showMessage(String text) {
		if ((text != null) && !(text.trim().equals(""))) {
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	
		    int style = SWT.ICON_INFORMATION;
		   
		    MessageBox messageBox = new MessageBox(shell, style);
		    messageBox.setMessage(text);
		    messageBox.open();
		}
	  }

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
