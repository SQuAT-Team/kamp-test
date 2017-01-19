package edu.squat.transformations.modifiability.splitresp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.LoggingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.trace.Trace;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.Repository;

import edu.squat.transformations.modifiability.PCMTransformerRunner;
import edu.squat.transformations.modifiability.RunnerHelper;
import edu.squat.transformations.modifiability.Tactic;

@SuppressWarnings("unused")
public class SplitRespRunner extends PCMTransformerRunner {
	private String PARAMETER_1stInterface = "A";
	private String PARAMETER_2ndInterface = "B";
	//
	private final static String TRACE_InitialInterface = "init-int";
	private final static String TRACE_DependentInterface = "dep-int";
	private final static String TRACE_SplitComponent = "split-comp";
	private final static String TRACE_SplitInterface = "split-int";
	private final static String TRACE_SEFFComponent = "seff-comp";
	private final static String TRACE_SEFFInterface = "seff-int";
	private final static String TRACE_ReconnectedComponent = "reconn-comp";
	private final static String TRACE_ReconnectedInterface = "reconn-int";
	//
	private Engine engine;
	//
	private Rule markComponents2Split;
	private Rule splitComp4Interface;
	private Rule migrateSEFF;
	private Rule rewireInterfaces;
	private Rule cloneInternalElements;
	private Rule cleanUpManual;
	//
	public SplitRespRunner() {
		super();
	}
	
	@Override
	public void loadRules() {
		markComponents2Split = (Rule) module.getUnit("markComponents2Split");
		//markComponents2Split.setCheckDangling(false);
		splitComp4Interface = (Rule) module.getUnit("splitComp4Interface");
		migrateSEFF = (Rule) module.getUnit("migrateSEFF");
		rewireInterfaces = (Rule) module.getUnit("rewireInterfaces");
		cloneInternalElements = (Rule) module.getUnit("cloneInternalElements");
		cleanUpManual = (Rule) module.getUnit("cleanUpManual");
	}

	public void run(boolean saveResult) {
		candidateTactics = new ArrayList<Tactic>();
		//Create and configure an engine
		engine = new EngineImpl();
		//engine.getOptions().put(engine.OPTION_CHECK_DANGLING, false);
		
		//Find all possible matches for applying the tactic by checking the first rule
		List<Match> matches = this.findMatchesFirstRule();
		//For all matchings
		for(Match match : matches) {
			//Run the first rule for each potential matching and create the traces
			RuleApplication app = this.configureFirstRule(graph, match);
			//If the transformation was successful continue with the other rules
			if(app.execute(monitor)) {
				//Creating a clone for avoiding undoing things
				EGraph tempGraph = graph.copy(null);
				BasicComponent seed = (BasicComponent) app.getResultParameterValue("seed");
				System.out.println("Successfully created the trace elements for splitting component: " + seed.getEntityName());
				//Configuring and executing the second rule for the 1st interface split
				this.runSecondRule(tempGraph, PARAMETER_1stInterface);
				//Configuring and executing the second rule for the 2nd interface split
				this.runSecondRule(tempGraph, PARAMETER_2ndInterface);
				//Configuring and executing the third rule for the 1st interface split
				this.runThirdRule(tempGraph, PARAMETER_1stInterface);
				//Configuring and executing the third rule for the 2nd interface split
				this.runThirdRule(tempGraph, PARAMETER_2ndInterface);
				//Configuring and executing the fourth rule for the 1st and 2nd interface split
				this.runFourthRule(tempGraph);
				//Configuring and executing the cloning rule
				this.runFifthRule(tempGraph, PARAMETER_1stInterface);
				this.runFifthRule(tempGraph, PARAMETER_2ndInterface);
				//Configuring and executing the cleanUp rule
				this.runSixthRule(tempGraph);
				//Store the results
				this.addTactic(seed, tempGraph, match);
				if (saveResult) {
					String fileName = resultFilename.replace("#REPLACEMENT#", String.valueOf(matches.indexOf(match)) + "-" + seed.getEntityName());
					RunnerHelper.saveResult(resourceSet, tempGraph, fileName);
				}
				app.undo(monitor);
			}
		}
	}

	private List<Match> findMatchesFirstRule() {
		Iterable<Match> matches = engine.findMatches(markComponents2Split, graph, null);
		Iterator<Match> it = matches.iterator();
		List<Match> list = new ArrayList<Match>();
		while(it.hasNext())
			list.add(it.next());
		return list;
	}
	
	private RuleApplication configureFirstRule(EGraph graph, Match match) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(markComponents2Split);
		app.setPartialMatch(match);
		app.setCompleteMatch(match);
		app.setParameterValue("n", PARAMETER_1stInterface);
		app.setParameterValue("m", PARAMETER_2ndInterface);
		return app;
	}
	
	private RuleApplication runSecondRule(EGraph graph, String i) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(splitComp4Interface);
		app.setParameterValue("i", i);
		app.setParameterValue("initIntTrace", TRACE_InitialInterface + i);
		boolean success = app.execute(monitor);
		if(success)
			System.out.println("Successfully splitted component for interface " + i);
		else
			System.out.println("Could not split component for interface " + i);
		return app;
	}
	
	private RuleApplication runThirdRule(EGraph graph, String i) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(migrateSEFF);
		app.setParameterValue("i", i);
		app.setParameterValue("splitCompTrace", TRACE_SplitComponent + i);
		app.setParameterValue("splitIntTrace", TRACE_SplitInterface + i);
		boolean success = app.execute(monitor);
		if(success)
			System.out.println("Successfully migrated SEFFs for component " + i);
		else
			System.out.println("Could not migrate SEFFs for component " + i);
		return app;
	}
	
	private RuleApplication runFourthRule(EGraph graph) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(rewireInterfaces);
		String i = PARAMETER_1stInterface;
		String j = PARAMETER_2ndInterface;
		app.setParameterValue("i", i);
		app.setParameterValue("j", j);
		app.setParameterValue("seffCompTraceI", TRACE_SEFFComponent + i);
		app.setParameterValue("seffIntTraceI", TRACE_SEFFInterface + i);
		app.setParameterValue("seffCompTraceJ", TRACE_SEFFComponent + j);
		app.setParameterValue("seffIntTraceJ", TRACE_SEFFInterface + j);
		boolean success = app.execute(monitor);
		if(success)
			System.out.println("Successfully rewire interfaces for the new components");
		else
			System.out.println("Could not rewire interfaces for the new components");
		return app;
	}
	
	private RuleApplication runFifthRule(EGraph graph, String i) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(cloneInternalElements);
		app.setParameterValue("reconnCompTrace", TRACE_ReconnectedComponent + i);
		app.setParameterValue("reconnIntTrace", TRACE_ReconnectedInterface + i);
		boolean success = app.execute(monitor);
		if(success) {
			BasicComponent oldComponent = (BasicComponent) app.getResultParameterValue("oldComp");
			BasicComponent newComponent = (BasicComponent) app.getResultParameterValue("newComp");
			OperationInterface oldInterface = (OperationInterface) app.getResultParameterValue("oldInt");
			//Duplicating passive resources
			EList<PassiveResource> passiveResources = oldComponent.getPassiveResource_BasicComponent();
			if(passiveResources != null && !passiveResources.isEmpty()) {
				Collection<PassiveResource> passiveResourcesClone = EcoreUtil.copyAll(passiveResources);
				for(PassiveResource pr : passiveResourcesClone)
					pr.setId(EcoreUtil.generateUUID());
				newComponent.getPassiveResource_BasicComponent().addAll(passiveResourcesClone);
			}
			//Duplicating component resources
			EList<VariableUsage> variableUsages = oldComponent.getComponentParameterUsage_ImplementationComponentType();
			if(variableUsages != null && !variableUsages.isEmpty()) {
				Collection<VariableUsage> variableUsagesClone = EcoreUtil.copyAll(variableUsages);
				newComponent.getComponentParameterUsage_ImplementationComponentType().addAll(variableUsagesClone);
			}
			System.out.println("Successfully cloned the internal elements of the component and the associated interface");
		}
		else
			System.out.println("Could not clone the the internal elements of the component and the associated interface");
		return app;
	}
	
	private RuleApplication runSixthRule(EGraph graph) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(cleanUpManual);
		boolean success = app.execute(monitor);
		if(success) {
			//Removing the old component
			BasicComponent oldComponent = (BasicComponent) app.getResultParameterValue("oldComp");
			EcoreUtil.delete((EObject) oldComponent, true);
			//Removing all the traces
			Trace root = (Trace) app.getResultParameterValue("root");
			EcoreUtil.delete((EObject) root, true);
			System.out.println("Successfully deleted the seed component and its provided/required interfaces");
		}
		else
			System.out.println("Could not delete the seed component and its provided/required interfaces");
		return app;
	}
	
	public static void main(String[] args) {
		String dirPath = "src/edu/squat/transformations/modifiability/splitresp";
		String henshinFilename = "splitresp-modular.henshin";
		String modelFilename;
		String resultFilename;
		
		SplitRespRunner runner = new SplitRespRunner();

		//Individual testing
		modelFilename = "split-test.repository";
		resultFilename = "split-test-" + "#REPLACEMENT#" + ".repository";
		runner.run(dirPath, modelFilename, henshinFilename, resultFilename, true);
		
		//Multiple testing
		modelFilename = "split-dual.repository";
		resultFilename = "split-dual-" + "#REPLACEMENT#" + ".repository";
		runner.run(dirPath, modelFilename, henshinFilename, resultFilename, true);
		
		//MediaStore3 testing
		modelFilename = "ms.repository";
		resultFilename = "ms-" + "#REPLACEMENT#" + ".repository";
		runner.run(dirPath, modelFilename, henshinFilename, resultFilename, true);
		
		//SimpleTactics testing
		modelFilename = "st.repository";
		resultFilename = "st-" + "#REPLACEMENT#" + ".repository";
		runner.run(dirPath, modelFilename, henshinFilename, resultFilename, true);
		
		//SimpleTactics+ testing
		modelFilename = "stplus.repository";
		resultFilename = "stplus-" + "#REPLACEMENT#" + ".repository";
		runner.run(dirPath, modelFilename, henshinFilename, resultFilename, true);
	}
}
