package io.github.squat_team.modifiability.kamp.ecsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import io.github.squat_team.model.OptimizationType;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.model.ResponseMeasureType;
import io.github.squat_team.modifiability.ModifiabilityElement;
import io.github.squat_team.modifiability.ModifiabilityInstruction;
import io.github.squat_team.modifiability.ModifiabilityOperation;
import io.github.squat_team.modifiability.ModifiabilityPCMScenario;
import io.github.squat_team.modifiability.kamp.KAMPPCMBot;
import io.github.squat_team.util.SQuATHelper;

@SuppressWarnings("rawtypes")
public class SimpleTacticsECSATest {
	private String machinePath;
	private String dirPath;
	private String[] modelNames;
	private String[] repositoryFile;
	private String[] resourceEnvironmentFile;
	private String[] baseSystemFile;
	private String[] baseAllocationFile;
	private String[] baseUsageFile;
	//
	private List<AnalysisResult> results;
	private Map<AnalysisResult, AnalysisResult> resultsMap;
	//
	public SimpleTacticsECSATest() {
		this.results = new ArrayList<AnalysisResult>();
		this.resultsMap = new HashMap<AnalysisResult, AnalysisResult>();
	}
	
	private void setModifiabilityPCMModel() {
		machinePath = "/Users/alejandrorago/Documents/Implementacion/Repositorios/kamp-test/";
		dirPath = machinePath + "squat-tool/src/test/resources/io/github/squat_team/icsa/modifiability/";
		modelNames = new String[] {
				// initial architecture
				"stplus",
				// split resp tactic
				"stplus-0-Payment System",
				// wrapper tactic
				"stplus-0-IExporter", "stplus-1-ITripDB", "stplus-2-IExternalPayment", "stplus-3-IEmployeePayment",
				"stplus-4-IBooking", "stplus-5-IBusiness Trip",
				// split resp + wrapper tactic
				"stplus-split-0-IExporter", "stplus-split-1-ITripDB", "stplus-split-2-IExternalPayment",
				"stplus-split-3-IEmployeePayment", "stplus-split-4-IBooking", "stplus-split-5-IBusiness Trip" };
		repositoryFile = new String[modelNames.length];
		resourceEnvironmentFile = new String[modelNames.length];
		baseSystemFile = new String[modelNames.length];
		baseAllocationFile = new String[modelNames.length];
		baseUsageFile = new String[modelNames.length];
		for (int i = 0; i < modelNames.length; i++) {
			repositoryFile[i] = dirPath + modelNames[i] + ".repository";
			resourceEnvironmentFile[i] = dirPath + modelNames[i] + ".resourceenvironment";
			baseSystemFile[i] = dirPath + modelNames[i] + ".system";
			baseAllocationFile[i] = dirPath + modelNames[i] + ".allocation";
			baseUsageFile[i] = dirPath + modelNames[i] + ".usagemodel";
		}
	}
	
	private void setPerformancePCMModel() {
		machinePath = "/Users/alejandrorago/Documents/Implementacion/Repositorios/kamp-test/";
		dirPath = machinePath + "squat-tool/src/test/resources/io/github/squat_team/icsa/performance/";
		String[] localPath = new String[] {
				// initial architecture
				//"opt-models/stplus_min/stplus",
				// performance scenario 1
				"opt-models-scenario1/stplus_min/stplus",
				"opt-models-scenario1/candidate258_minPlus/default",
				"opt-models-scenario1/candidate281_minPlus/default",
				"opt-models-scenario1/candidate338_minPlus/default",
				"opt-models-scenario1/candidate340_minPlus/default",
				"opt-models-scenario1/candidate397_minPlus/default",
				"opt-models-scenario1/candidate404_minPlus/default",
				"opt-models-scenario1/candidate436_minPlus/default",
				"opt-models-scenario1/candidate444_minPlus/default",
				"opt-models-scenario1/candidate494_minPlus/default",
				"opt-models-scenario1/candidate64_minPlus/default",
				// performance scenario 2
				"opt-models-scenario2/stplus_min/stplus",
				"opt-models-scenario2/candidate209_minPlus/default",
				"opt-models-scenario2/candidate22_minPlus/default",
				"opt-models-scenario2/candidate325_minPlus/default",
				"opt-models-scenario2/candidate330_minPlus/default",
				"opt-models-scenario2/candidate358_minPlus/default",
				"opt-models-scenario2/candidate366_minPlus/default",
				"opt-models-scenario2/candidate416_minPlus/default",
				"opt-models-scenario2/candidate476_minPlus/default",
				"opt-models-scenario2/candidate479_minPlus/default",
				"opt-models-scenario2/candidate480_minPlus/default"
		};
		modelNames = new String[] {
				// initial architecture
				//"stplus",
				// performance scenario 1
				"stplus-ps1",
				"stplus-ps1-258",
				"stplus-ps1-281",
				"stplus-ps1-338",
				"stplus-ps1-340",
				"stplus-ps1-397",
				"stplus-ps1-404",
				"stplus-ps1-436",
				"stplus-ps1-444",
				"stplus-ps1-494",
				"stplus-ps1-64",
				// performance scenario 2
				"stplus-ps2",
				"stplus-ps2-209",
				"stplus-ps2-22",
				"stplus-ps2-325",
				"stplus-ps2-330",
				"stplus-ps2-358",
				"stplus-ps2-366",
				"stplus-ps2-416",
				"stplus-ps2-476",
				"stplus-ps2-479",
				"stplus-ps2-480"
		};
		repositoryFile = new String[modelNames.length];
		resourceEnvironmentFile = new String[modelNames.length];
		baseSystemFile = new String[modelNames.length];
		baseAllocationFile = new String[modelNames.length];
		baseUsageFile = new String[modelNames.length];
		for (int i = 0; i < modelNames.length; i++) {
			repositoryFile[i] = dirPath + localPath[i] + ".repository";
			resourceEnvironmentFile[i] = dirPath + localPath[i] + ".resourceenvironment";
			baseSystemFile[i] = dirPath + localPath[i] + ".system";
			baseAllocationFile[i] = dirPath + localPath[i] + ".allocation";
			baseUsageFile[i] = dirPath + localPath[i] + ".usagemodel";
		}
	}
	
	private PCMArchitectureInstance loadSpecificModel(String name, String repositoryFile, String enviromentFile,
			String systemFile, String sllocationFile, String usageFile) {
		Repository repository = SQuATHelper.loadRepositoryModel(repositoryFile);
		ResourceEnvironment resourceEnvironment = SQuATHelper.loadResourceEnvironmentModel(enviromentFile);
		System system = SQuATHelper.loadSystemModel(systemFile);
		Allocation allocation = SQuATHelper.loadAllocationModel(sllocationFile);
		UsageModel usageModel = SQuATHelper.loadUsageModel(usageFile);
		PCMArchitectureInstance instance = new PCMArchitectureInstance(name, repository, system, allocation,
				resourceEnvironment, usageModel);
		return instance;
	}

	public void runAllTests() throws Exception {
		this.results.clear(); 
		this.resultsMap.clear();
		String evaluationType; ResponseMeasureType type; Comparable response;
		//Modifiability
		//this.setModifiabilityPCMModel();
		this.setPerformancePCMModel();
		//Affected components
		evaluationType = KAMPPCMBot.TYPE_ELEMENTS;
		type = ResponseMeasureType.NUMERIC;
		response = new Integer(5);
		this.testModifiabilityScenario(this.createModifiabilityScenarioS1(type, response), "M1", evaluationType);
		response = new Integer(7);
		this.testModifiabilityScenario(this.createModifiabilityScenarioS2(type, response), "M2", evaluationType);
		//Complexity 
		evaluationType = KAMPPCMBot.TYPE_COMPLEXITY;
		type = ResponseMeasureType.DECIMAL;
		response = new Float(120);
		this.testModifiabilityScenario(this.createModifiabilityScenarioS1(type, response), "M1", evaluationType);
		response = new Float(300);
		this.testModifiabilityScenario(this.createModifiabilityScenarioS2(type, response), "M2", evaluationType);
		//Print code
		this.printCode();
	}
	
	@SuppressWarnings("rawtypes")
	public void testModifiabilityScenario(PCMScenario scenario, String scenarioName, String evaluationType) throws Exception {
		boolean debug = false;
		Comparable expectedResponse = scenario.getExpectedResult().getResponse();
		if(debug) java.lang.System.out.println("The goal of scenario " + scenarioName + ": " + expectedResponse.toString());
		KAMPPCMBot bot = new KAMPPCMBot(scenario);
		bot.setEvaluationType(evaluationType);
		if(debug) java.lang.System.out.println("The evaluation type is: " + evaluationType);
		//
		for (int i = 0; i < modelNames.length; i++) {
			PCMArchitectureInstance model = this.loadSpecificModel(modelNames[i], repositoryFile[i], resourceEnvironmentFile[i], baseSystemFile[i], baseAllocationFile[i], baseUsageFile[i]);
			PCMScenarioResult scenarioResult = bot.analyze(model);
			String satisfaction_alt1 = scenarioResult.isSatisfied() >= 0 ? "SATISFIED" : "NOT SATISFIED";
			if(debug) java.lang.System.out.println("The scenario satisfaction with " + model.getName() + " is: " + satisfaction_alt1);
			Comparable response_alt1 = scenarioResult.getResult().getResponse();
			if(response_alt1 instanceof Integer)
				if(debug) java.lang.System.out.println("The response measure of the scenario is: " + ((Integer) response_alt1).intValue());
			if(response_alt1 instanceof Float)
				if(debug) java.lang.System.out.println("The response measure of the scenario is: " + ((Float) response_alt1).floatValue());
			//
			AnalysisResult analysisResult = new AnalysisResult();
			analysisResult.qa = "Modifiability";
			analysisResult.scenario = scenarioName.toLowerCase();
			analysisResult.model = model.getName();
			if(resultsMap.keySet().contains(analysisResult)) {
				analysisResult = resultsMap.get(analysisResult);
			}
			else {
				results.add(analysisResult);
				resultsMap.put(analysisResult, analysisResult);
			}
			analysisResult.measureValues.put(evaluationType, response_alt1);
		}
	}
	
	private PCMScenario createModifiabilityScenarioS1(ResponseMeasureType type, Comparable response) {
		ModifiabilityPCMScenario scenario = new ModifiabilityPCMScenario(OptimizationType.MINIMIZATION);
		PCMResult expectedResult = new PCMResult(type);
		expectedResult.setResponse(response);
		scenario.setExpectedResponse(expectedResult);
		//
		ModifiabilityInstruction i1 = new ModifiabilityInstruction();
		i1.operation = ModifiabilityOperation.MODIFY;
		i1.element = ModifiabilityElement.INTERFACE;
		i1.parameters.put("name", "IExternalPayment");
		scenario.addChange(i1);
		ModifiabilityInstruction i2 = new ModifiabilityInstruction();
		i2.operation = ModifiabilityOperation.MODIFY;
		i2.element = ModifiabilityElement.COMPONENT;
		i2.parameters.put("name", "BusinessTripMgmt");
		scenario.addChange(i2);
		//
		return scenario;
	}

	/** This is the right way of implementing scenario S1. However, it does not work because KAMP
	 * doesn't propagate changes to components when an operation is added to an interface.
	 **/
	/*private PCMScenario createModifiabilityScenarioS1(ResponseMeasureType type, Comparable response) {
		ModifiabilityPCMScenario scenario = new ModifiabilityPCMScenario(OptimizationType.MINIMIZATION);
		PCMResult expectedResult = new PCMResult(type);
		expectedResult.setResponse(response);
		scenario.setExpectedResponse(expectedResult);
		//
		ModifiabilityInstruction i1 = new ModifiabilityInstruction();
		i1.operation = ModifiabilityOperation.MODIFY;
		i1.element = ModifiabilityElement.INTERFACE;
		i1.parameters.put("name", "IExternalPayment");
		scenario.addChange(i1);
		ModifiabilityInstruction i2 = new ModifiabilityInstruction();
		i2.operation = ModifiabilityOperation.CREATE;
		i2.element = ModifiabilityElement.OPERATION;
		i2.parameters.put("iname", "IExternalPayment");
		i2.parameters.put("oname", "specialPay");
		scenario.addChange(i2);
		ModifiabilityInstruction i3 = new ModifiabilityInstruction();
		i3.operation = ModifiabilityOperation.MODIFY;
		i3.element = ModifiabilityElement.COMPONENT;
		i3.parameters.put("name", "BusinessTripMgmt");
		scenario.addChange(i3);
		//
		return scenario;
	}*/
	
	private PCMScenario createModifiabilityScenarioS2(ResponseMeasureType type, Comparable response) {	
		ModifiabilityPCMScenario scenario = new ModifiabilityPCMScenario(OptimizationType.MINIMIZATION);
		PCMResult expectedResult = new PCMResult(type);
		expectedResult.setResponse(response);
		scenario.setExpectedResponse(expectedResult);
		//
		ModifiabilityInstruction i1 = new ModifiabilityInstruction();
		i1.operation = ModifiabilityOperation.MODIFY;
		i1.element = ModifiabilityElement.INTERFACE;
		i1.parameters.put("name", "ITripDB");
		scenario.addChange(i1);
		ModifiabilityInstruction i2 = new ModifiabilityInstruction();
		i2.operation = ModifiabilityOperation.CREATE;
		i2.element = ModifiabilityElement.INTERFACE;
		i2.parameters.put("name", "Analytics");
		scenario.addChange(i2);
		ModifiabilityInstruction i3 = new ModifiabilityInstruction();
		i3.operation = ModifiabilityOperation.CREATE;
		i3.element = ModifiabilityElement.OPERATION;
		i3.parameters.put("iname", "Analytics");
		i3.parameters.put("oname", "getLastTrips");
		scenario.addChange(i3);
		ModifiabilityInstruction i4 = new ModifiabilityInstruction();
		i4.operation = ModifiabilityOperation.CREATE;
		i4.element = ModifiabilityElement.COMPONENT;
		i4.parameters.put("name", "Insights");
		scenario.addChange(i4);
		ModifiabilityInstruction i5 = new ModifiabilityInstruction();
		i5.operation = ModifiabilityOperation.CREATE;
		i5.element = ModifiabilityElement.PROVIDEDROLE;
		i5.parameters.put("cname", "Insights");
		i5.parameters.put("iname", "Analytics");
		scenario.addChange(i5);
		ModifiabilityInstruction i6 = new ModifiabilityInstruction();
		i6.operation = ModifiabilityOperation.CREATE;
		i6.element = ModifiabilityElement.REQUIREDROLE;
		i6.parameters.put("cname", "Insights");
		i6.parameters.put("iname", "ITripDB");
		scenario.addChange(i6);
		//
		return scenario;
	}

	/** This is the right way of implementing scenario S2. However, it does not work because KAMP
	 * doesn't propagate changes to components when an operation is added to an interface.
	 * @throws Exception 
	 **/
	/*private PCMScenario createModifiabilityScenarioS2(ResponseMeasureType type) {
		ModifiabilityPCMScenario scenario = new ModifiabilityPCMScenario(OptimizationType.MINIMIZATION);
		PCMResult expectedResult = new PCMResult(type);
		expectedResult.setResponse(response);
		scenario.setExpectedResponse(expectedResult);
		//
		ModifiabilityInstruction i1 = new ModifiabilityInstruction();
		i1.operation = ModifiabilityOperation.CREATE;
		i1.element = ModifiabilityElement.OPERATION;
		i1.parameters.put("iname", "ITripDB");
		i1.parameters.put("oname", "executeReport");
		scenario.addChange(i1);
		ModifiabilityInstruction i2 = new ModifiabilityInstruction();
		i2.operation = ModifiabilityOperation.CREATE;
		i2.element = ModifiabilityElement.INTERFACE;
		i2.parameters.put("name", "Analytics");
		scenario.addChange(i2);			
		ModifiabilityInstruction i3 = new ModifiabilityInstruction();
		i3.operation = ModifiabilityOperation.CREATE;
		i3.element = ModifiabilityElement.OPERATION;
		i3.parameters.put("iname", "Analytics");
		i3.parameters.put("oname", "getLastTrips");
		scenario.addChange(i3);		
		ModifiabilityInstruction i4 = new ModifiabilityInstruction();
		i4.operation = ModifiabilityOperation.CREATE;
		i4.element = ModifiabilityElement.COMPONENT;
		i4.parameters.put("name", "Insights");
		scenario.addChange(i4);			
		ModifiabilityInstruction i5 = new ModifiabilityInstruction();
		i5.operation = ModifiabilityOperation.CREATE;
		i5.element = ModifiabilityElement.PROVIDEDROLE;
		i5.parameters.put("cname", "Insights");
		i5.parameters.put("iname", "Analytics");
		scenario.addChange(i5);			
		ModifiabilityInstruction i6 = new ModifiabilityInstruction();
		i6.operation = ModifiabilityOperation.CREATE;
		i6.element = ModifiabilityElement.REQUIREDROLE;
		i6.parameters.put("cname", "Insights");
		i6.parameters.put("iname", "ITripDB");
		scenario.addChange(i6);
		//
		return scenario;
	}*/
	
	public void printCode() {
		for(AnalysisResult r : results) {
			if(r.qa.equals("Modifiability")) {
				String classType = r.qa + "Bot";
				String variableName = r.scenario + "Bot";
				String components = r.measureValues.get(KAMPPCMBot.TYPE_ELEMENTS).toString();
				String complexity = r.measureValues.get(KAMPPCMBot.TYPE_COMPLEXITY).toString();
				String parameters = "(" + components + ", " + complexity + ", \"" + r.model + "\")";
				String codeLine = classType + " " + variableName + " = new " + classType + parameters;
				java.lang.System.out.println(codeLine);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		SimpleTacticsECSATest test = new SimpleTacticsECSATest();
		test.runAllTests();
	}
	
	class AnalysisResult {
		public String qa;
		public String scenario;
		public String model;
		public Map<String, Comparable> measureValues;
		
		public AnalysisResult() {
			measureValues = new HashMap<String, Comparable>();
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			result = prime * result + ((qa == null) ? 0 : qa.hashCode());
			result = prime * result + ((scenario == null) ? 0 : scenario.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AnalysisResult other = (AnalysisResult) obj;
			if (model == null) {
				if (other.model != null)
					return false;
			} else if (!model.equals(other.model))
				return false;
			if (qa == null) {
				if (other.qa != null)
					return false;
			} else if (!qa.equals(other.qa))
				return false;
			if (scenario == null) {
				if (other.scenario != null)
					return false;
			} else if (!scenario.equals(other.scenario))
				return false;
			return true;
		}
	}
}