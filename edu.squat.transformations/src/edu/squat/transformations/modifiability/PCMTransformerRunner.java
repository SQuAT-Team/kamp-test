package edu.squat.transformations.modifiability;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.LoggingApplicationMonitor;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.TracePackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.core.CorePackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.pcm.system.SystemPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import edu.squat.pcm.PCMHelper;

public abstract class PCMTransformerRunner {
	protected String dirPath;
	protected String modelFilename;
	protected String henshinFilename;
	protected String resultFilename;
	//
	protected HenshinResourceSet resourceSet;
	protected Module module;
	protected EGraph graph;
	protected Repository repository;
	//
	protected List<Tactic> candidateTactics;
	//
	protected ApplicationMonitor monitor;
	//
	static {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		//PCM Packages
		EPackage.Registry.INSTANCE.put(IdentifierPackage.eNS_URI, IdentifierPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(StoexPackage.eNS_URI, StoexPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(EntityPackage.eNS_URI, EntityPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(RepositoryPackage.eNS_URI, RepositoryPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ResourceenvironmentPackage.eNS_URI, ResourceenvironmentPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, SystemPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(AllocationPackage.eNS_URI, AllocationPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SeffPackage.eNS_URI, SeffPackage.eINSTANCE);
		//Henshin Packages
		EPackage.Registry.INSTANCE.put(HenshinPackage.eNS_URI, HenshinPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(TracePackage.eNS_URI, TracePackage.eINSTANCE);
		//EPackage.Registry.INSTANCE.put(StateSpacePackage.eNS_URI, StateSpacePackage.eINSTANCE);
		//EPackage.Registry.INSTANCE.put(WrapPackage.eNS_URI, WrapPackage.eINSTANCE);
	}
	//
	public PCMTransformerRunner() {
		monitor = new LoggingApplicationMonitor();
		((LoggingApplicationMonitor) monitor).setLogStream(System.out);
	}
	
	private void setParameters(String dirPath, String modelFilename, String henshinFilename, String resultFilename) {
		this.dirPath = dirPath;
		this.modelFilename = modelFilename;
		this.henshinFilename = henshinFilename;
		this.resultFilename = resultFilename;
	}
	
	private void loadModels() {
		// Create a resource set with a base directory
		resourceSet = new HenshinResourceSet(dirPath);
		// Load the module
		module = resourceSet.getModule(henshinFilename, false);
		// Load the example model into an EGraph
		graph = new EGraphImpl(resourceSet.getResource(modelFilename));
		// Load the pcm model
		repository = PCMHelper.loadRepositoryModel(dirPath + "/" + modelFilename);
	}
	

	public void loadModelsAndRules(String dirPath, String modelFilename, String henshinFilename, String resultFilename) {
		this.setParameters(dirPath, modelFilename, henshinFilename, resultFilename);
		this.loadModels();
		this.loadRules();
	}
	
	public abstract void loadRules();

	public abstract void run(boolean saveResult);
	
	public void run(String dirPath, String modelFilename, String henshinFilename, String resultFilename, boolean saveResult) {
		this.loadModelsAndRules(dirPath, modelFilename, henshinFilename, resultFilename);
		this.run(saveResult);
	}
	
	protected void addTactic(BasicComponent seed, EGraph tempGraph, Match match) {
		Tactic tactic = new Tactic();
		tactic.initialArchitecture = graph;
		tactic.seed = seed;
		tactic.seedName = seed != null ? seed.getEntityName() : "" ;
		tactic.resultingArchitecture = tempGraph;
		tactic.initialMatch = match;
		candidateTactics.add(tactic);
	}
}
