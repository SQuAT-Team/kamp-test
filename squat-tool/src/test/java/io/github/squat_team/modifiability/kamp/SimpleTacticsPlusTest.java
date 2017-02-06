package io.github.squat_team.modifiability.kamp;

import org.junit.Assert;
import org.junit.Test;
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
import io.github.squat_team.util.SQuATHelper;

public class SimpleTacticsPlusTest {
	private static String machinePath = "/Users/alejandrorago/Documents/Implementacion/Repositorios/kamp-test/squat-tool/src/test/resources/";
	private static String dirPath = machinePath + "io/github/squat_team/casestudies/SimpleTactics+/";
	private static String stplus_base = "stplus";
	private static String stplus_alt0 = "stplus-0-Payment System";
	private static String stplus_alt1 = "stplus-1-Payment System";
	private static String[] repositoryFile = 
		{ dirPath + stplus_base + ".repository", dirPath + stplus_alt0 + ".repository", dirPath + stplus_alt1 + ".repository"};
	private static String[] resourceEnvironmentFile = 
		{ dirPath + stplus_base + ".resourceenvironment", dirPath + stplus_alt0 + ".resourceenvironment", dirPath + stplus_alt1 + ".resourceenvironment"};
	private static String[] baseSystemFile = 
		{ dirPath + stplus_base + ".system", dirPath + stplus_alt0 + ".system", dirPath + stplus_alt1 + ".system"};
	private static String[] baseAllocationFile = 
		{ dirPath + stplus_base + ".allocation", dirPath + stplus_alt0 + ".allocation", dirPath + stplus_alt1 + ".allocation"};
	private static String[] baseUsageFile = 
		{ dirPath + stplus_base + ".usagemodel", dirPath + stplus_alt0 + ".usagemodel", dirPath + stplus_alt1 + ".usagemodel"};

	@SuppressWarnings("rawtypes")
	@Test
	public void testAnalysis() throws Exception {
		PCMScenario scenario = this.createModifiabilityScenario();
		Comparable response_expected = scenario.getExpectedResult().getResponse();
		java.lang.System.out.println("The goal of the scenario is: " + ((Integer)response_expected).intValue());
		KAMPPCMBot bot = new KAMPPCMBot(scenario);
		//
		PCMArchitectureInstance stplus_base = this.loadSimpleTacticsPlus("SimpleTactics+BASE");
		PCMArchitectureInstance stplus_alt0 = this.loadSimpleTacticsPlus("SimpleTactics+ALT0");
		PCMArchitectureInstance stplus_alt1 = this.loadSimpleTacticsPlus("SimpleTactics+ALT1");
		//
		PCMScenarioResult scenarioResult_base = bot.analyze(stplus_base);
		String satisfaction_base = scenarioResult_base.isSatisfied() >= 0 ? "SATISFIED" : "NOT SATISFIED";
		java.lang.System.out.println("The scenario satisfaction with " + stplus_base.getName() + " is: " + satisfaction_base);
		Assert.assertTrue(scenarioResult_base.isSatisfied() < 0);
		int AFFECTED_COMPONENTS = 6;
		Comparable response_base = scenarioResult_base.getResult().getResponse();
		java.lang.System.out.println("The number of affected components is: " + ((Integer)response_base).intValue());
		Assert.assertEquals(((Integer)response_base).intValue(), AFFECTED_COMPONENTS);
		//
		PCMScenarioResult scenarioResult_alt0 = bot.analyze(stplus_alt0);
		String satisfaction_alt0 = scenarioResult_alt0.isSatisfied() >= 0 ? "SATISFIED" : "NOT SATISFIED";
		java.lang.System.out.println("The scenario satisfaction with " + stplus_alt0.getName() + " is: " + satisfaction_alt0);
		Assert.assertTrue(scenarioResult_alt0.isSatisfied() < 0);
		//int AFFECTED_COMPONENTS = 6;
		Comparable response_alt0 = scenarioResult_alt0.getResult().getResponse();
		java.lang.System.out.println("The number of affected components is: " + ((Integer)response_alt0).intValue());
		//Assert.assertEquals(((Integer)response_alt0).intValue(), AFFECTED_COMPONENTS);
		//
		PCMScenarioResult scenarioResult_alt1 = bot.analyze(stplus_alt1);
		String satisfaction_alt1 = scenarioResult_alt0.isSatisfied() >= 0 ? "SATISFIED" : "NOT SATISFIED";
		java.lang.System.out.println("The scenario satisfaction with " + stplus_alt1.getName() + " is: " + satisfaction_alt1);
		Assert.assertTrue(scenarioResult_alt1.isSatisfied() < 0);
		//int AFFECTED_COMPONENTS = 6;
		Comparable response_alt1 = scenarioResult_alt1.getResult().getResponse();
		java.lang.System.out.println("The number of affected components is: " + ((Integer)response_alt1).intValue());
		//Assert.assertEquals(((Integer)response_alt1).intValue(), AFFECTED_COMPONENTS);
	}
	
	//@Test
	public void testAlternatives() {
		PCMScenario scenario = this.createModifiabilityScenario();
		KAMPPCMBot bot = new KAMPPCMBot(scenario);
		PCMArchitectureInstance stplus = loadSimpleTacticsPlus("SimpleTactics+");
	}
	

	private PCMScenario createModifiabilityScenario() {
		ModifiabilityPCMScenario scenario = new ModifiabilityPCMScenario(OptimizationType.MINIMIZATION);
		PCMResult expectedResult = new PCMResult(ResponseMeasureType.NUMERIC);
		expectedResult.setResponse(new Integer(5));
		scenario.setExpectedResponse(expectedResult);
		ModifiabilityInstruction i1 = new ModifiabilityInstruction();
		i1.operation = ModifiabilityOperation.MODIFY;
		i1.element = ModifiabilityElement.INTERFACE;
		i1.parameters.put("name", "IExternalPayment");
		scenario.addChange(i1);
		ModifiabilityInstruction i2 = new ModifiabilityInstruction();
		i2.operation = ModifiabilityOperation.MODIFY;
		i2.element = ModifiabilityElement.COMPONENT;
		i2.parameters.put("name", "BusinessTripMgmr");
		scenario.addChange(i2);
		return scenario;
	}
	
	private PCMArchitectureInstance loadSimpleTacticsPlus(String name) {
		Repository repository = SQuATHelper.loadRepositoryModel(repositoryFile[0]);
		ResourceEnvironment resourceEnvironment = SQuATHelper.loadResourceEnvironmentModel(resourceEnvironmentFile[0]);
		System system = SQuATHelper.loadSystemModel(baseSystemFile[0]);
		Allocation allocation = SQuATHelper.loadAllocationModel(baseAllocationFile[0]);
		UsageModel usageModel = SQuATHelper.loadUsageModel(baseUsageFile[0]);
		PCMArchitectureInstance instance = new PCMArchitectureInstance(name, repository, system, allocation, resourceEnvironment, usageModel);
		return instance;
	}
	
	private PCMArchitectureInstance loadSimpleTacticsPlusAlt0(String name) {
		Repository repository = SQuATHelper.loadRepositoryModel(repositoryFile[1]);
		ResourceEnvironment resourceEnvironment = SQuATHelper.loadResourceEnvironmentModel(resourceEnvironmentFile[1]);
		System system = SQuATHelper.loadSystemModel(baseSystemFile[1]);
		Allocation allocation = SQuATHelper.loadAllocationModel(baseAllocationFile[1]);
		UsageModel usageModel = SQuATHelper.loadUsageModel(baseUsageFile[1]);
		PCMArchitectureInstance instance = new PCMArchitectureInstance(name, repository, system, allocation, resourceEnvironment, usageModel);
		return instance;
	}
	
	private PCMArchitectureInstance loadSimpleTacticsPlusAlt1(String name) {
		Repository repository = SQuATHelper.loadRepositoryModel(repositoryFile[2]);
		ResourceEnvironment resourceEnvironment = SQuATHelper.loadResourceEnvironmentModel(resourceEnvironmentFile[2]);
		System system = SQuATHelper.loadSystemModel(baseSystemFile[2]);
		Allocation allocation = SQuATHelper.loadAllocationModel(baseAllocationFile[2]);
		UsageModel usageModel = SQuATHelper.loadUsageModel(baseUsageFile[2]);
		PCMArchitectureInstance instance = new PCMArchitectureInstance(name, repository, system, allocation, resourceEnvironment, usageModel);
		return instance;
	}
}
