package edu.squat.transformations.modifiability;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.TracePackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.system.SystemPackage;

import edu.squat.pcm.PCMHelper;

public class SplitRespRunner {
	public static final String PATH = "src/edu/squat/transformations/modifiability";
	
	static {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		//PCM Packages
		EPackage.Registry.INSTANCE.put(RepositoryPackage.eNS_URI, RepositoryPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ResourceenvironmentPackage.eNS_URI, ResourceenvironmentPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, SystemPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(AllocationPackage.eNS_URI, AllocationPackage.eINSTANCE);
		//Henshin Packages
		EPackage.Registry.INSTANCE.put(HenshinPackage.eNS_URI, HenshinPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(TracePackage.eNS_URI, TracePackage.eINSTANCE);
		//EPackage.Registry.INSTANCE.put(StateSpacePackage.eNS_URI, StateSpacePackage.eINSTANCE);
		//EPackage.Registry.INSTANCE.put(WrapPackage.eNS_URI, WrapPackage.eINSTANCE);
	}

	public static void run(String path, boolean saveResult) {
		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		// Load the module
		//Module module = resourceSet.getModule("splitresp.henshin", false);
		Module module = resourceSet.getModule("simple.henshin", false);
		
		// Load the example model into an EGraph:
		EGraph graph = new EGraphImpl(resourceSet.getResource("split-test.repository"));
		
		// Load the pcm model
		Repository repository = PCMHelper.loadRepositoryModel(path + "/" +"split-test.repository");
		
		// Create an engine and a rule application:
		Engine engine = new EngineImpl();
		
		for(RepositoryComponent basicComponent : repository.getComponents__Repository()) {
			BasicComponent component = (BasicComponent) basicComponent;
			String name = component.getEntityName();
			
			UnitApplication unitApplication = new UnitApplicationImpl(engine);
			unitApplication.setEGraph(graph);
			//unitApplication.setUnit(module.getUnit("splitResponsability"));
			unitApplication.setUnit(module.getUnit("changeName"));

			//unitApplication.setParameterValue("originalName", name);
			unitApplication.setParameterValue("name", name);

			if (!unitApplication.execute(null)) {
				System.out.println("Error while transforming from component: " + name);
			}

			// Saving the result:
			if (saveResult) {
				resourceSet.saveEObject(graph.getRoots().get(0), "split-test-result-" + name + ".repository");
			}
		}
	}
	
	public static void main(String[] args) {
		run(PATH, true); // we assume the working directory is the root of the examples plug-in
	}
}
