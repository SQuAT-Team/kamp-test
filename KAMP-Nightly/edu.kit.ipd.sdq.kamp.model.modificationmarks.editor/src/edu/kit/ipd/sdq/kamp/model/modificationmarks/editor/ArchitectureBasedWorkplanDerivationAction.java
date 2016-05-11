package edu.kit.ipd.sdq.kamp.model.modificationmarks.editor;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.EMFPlugin.EclipsePlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.core.Activity;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.core.derivation.DifferenceCalculation;
import edu.kit.ipd.sdq.kamp.core.derivation.EnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository;

public class ArchitectureBasedWorkplanDerivationAction implements IActionDelegate {

	public ArchitectureBasedWorkplanDerivationAction() {
	}

	private ISelection selection;

	@Override
	public void run(IAction action) {
	
		Object selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection)selection).size()==1) {
				selectedElement = ((IStructuredSelection)selection).getFirstElement();
			}
		}
		
		if (selectedElement != null) {
			if (selectedElement instanceof ModificationRepository) {
				String fileName = ((ModificationRepository)selectedElement).eResource().getURI().trimFileExtension().lastSegment();
				String targetFolderPathString = ((ModificationRepository)selectedElement).eResource().getURI().trimSegments(1).toPlatformString(false);
				String baseFolderPathString = ((ModificationRepository)selectedElement).eResource().getURI().trimSegments(2).toPlatformString(false);
				String nameOfAufgabe = ((ModificationRepository)selectedElement).eResource().getURI().trimSegments(1).lastSegment();
				
				ArchitectureVersion targetversion = null;
				if (targetFolderPathString != null) {
					try {
						targetversion = ArchitectureVersionPersistency.load(targetFolderPathString, fileName, "target");
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				
				ArchitectureVersion baseversion = null;
				if (baseFolderPathString != null) {
					try {
						baseversion = ArchitectureVersionPersistency.load(baseFolderPathString, fileName, "base");
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				
				if ((baseversion != null)&&(targetversion != null)) {
					List<Activity> baseActivityList = DifferenceCalculation.deriveWorkplan(baseversion, targetversion);
					
					String username = System.getProperty("user.name");
					String usernameSuffix = (username != null) ? username : "";
					
//					ArchitectureVersionPersistency.saveActivityListToExcelFile(targetFolderPathString, "workplan-base"+usernameSuffix, baseActivityList);

					List<Activity> enrichedActivityList = EnrichedWorkplanDerivation.deriveEnrichedWorkplan(baseversion, targetversion, baseActivityList);
				
					ArchitectureVersionPersistency.saveActivityListToExcelFile(targetFolderPathString, "activitylist-"+usernameSuffix+"-"+nameOfAufgabe, enrichedActivityList);
					showMessage("Aktivit�tsliste wurde berechnet!");
					PlatformUI.getWorkbench().saveAllEditors(false);
					
					refreshAllProjectsInWorkspace();
				} 
				
				if (baseversion == null) {
					showMessage("Aktivit�tsliste konnte nicht berechnet werden, da Basisversion nicht gefunden wurde.");
					throw new RuntimeException("Baseversion was null");
				}

				if (targetversion == null) {
					showMessage("Aktivit�tsliste konnte nicht berechnet werden, da Zielversion nicht gefunden wurde.");
					throw new RuntimeException("Target version was null");
				}

			}
		}


	}

	private void refreshAllProjectsInWorkspace() {
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				project.refreshLocal(IProject.DEPTH_INFINITE, null);
			} catch (CoreException e) {
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

