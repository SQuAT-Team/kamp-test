package io.github.squat_team.agentsUtils;

import java.util.ArrayList;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.model.OptimizationType;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.ResponseMeasureType;
import io.github.squat_team.performance.AbstractPerformancePCMScenario;
import io.github.squat_team.performance.PerformanceMetric;
import io.github.squat_team.performance.PerformancePCMCPUScenario;
import io.github.squat_team.performance.PerformancePCMUsageScenario;
import io.github.squat_team.performance.PerformancePCMWokloadScenario;
import io.github.squat_team.performance.peropteryx.ConcurrentPerOpteryxPCMBot;
import io.github.squat_team.performance.peropteryx.configuration.ConfigurationImprovedImproved;
import io.github.squat_team.performance.peropteryx.configuration.DesigndecisionConfigImproved;
import test.TestConstants;

public class PerformanceScenarioHelper {
	private AbstractPerformancePCMScenario cocomeS1;
	private AbstractPerformancePCMScenario cocomeS2;
	private AbstractPerformancePCMScenario cocomeS3;
	private AbstractPerformancePCMScenario cocomeS4;
	private ConcurrentPerOpteryxPCMBot cocomeBotS1;
	private ConcurrentPerOpteryxPCMBot cocomeBotS2;
	private ConcurrentPerOpteryxPCMBot cocomeBotS3;
	private ConcurrentPerOpteryxPCMBot cocomeBotS4;

	private Float responseTimeP1 = 1.4f;
	private Float responseTimeP2 = 1.6f;
	private Float responseTimeP3 = 1.3f;
	private Float responseTimeP4 = 2.8f;

	private static PerformanceScenarioHelper instance;

	public static PerformanceScenarioHelper getInstance() {
		if (instance == null)
			instance = new PerformanceScenarioHelper();
		return instance;
	}

	private PerformanceScenarioHelper() {
		cocomeS1 = null;
		cocomeS2 = null;
		cocomeS3 = null;
		cocomeS4 = null;
		cocomeBotS1 = null;
		cocomeBotS2 = null;
		cocomeBotS3 = null;
		cocomeBotS4 = null;
	}

	public void resetBots() {
		cocomeBotS1 = null;
		cocomeBotS2 = null;
		cocomeBotS3 = null;
		cocomeBotS4 = null;
	}

	@Deprecated // never used
	public static AbstractPerformancePCMScenario createScenarioOfWorkload() {
		ArrayList<String> workloadIDs = new ArrayList<String>();
		workloadIDs.add(TestConstants.WORKLOAD_ID);
		AbstractPerformancePCMScenario scenario = new PerformancePCMWokloadScenario(OptimizationType.MINIMIZATION,
				workloadIDs, 1.1);
		PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
		expectedResponse.setResponse(6.0);
		scenario.setExpectedResponse(expectedResponse);
		scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
		return scenario;
	}

	@Deprecated // never used
	public static AbstractPerformancePCMScenario createScenarioOfCPU() {
		ArrayList<String> cpuIDs = new ArrayList<String>();
		cpuIDs.add(TestConstants.CPU_ID);
		AbstractPerformancePCMScenario scenario = new PerformancePCMCPUScenario(OptimizationType.MINIMIZATION, cpuIDs,
				0.5);
		PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
		expectedResponse.setResponse(6.0);
		scenario.setExpectedResponse(expectedResponse);
		scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
		return scenario;
	}

	// COCOME

	public AbstractPerformancePCMScenario createScenario1Cocome() {
		if (cocomeS1 == null) {
			ArrayList<String> workloadIDs = new ArrayList<String>();
			workloadIDs.add("_VgwxwHr3Eeek77WF10mCCg");
			AbstractPerformancePCMScenario scenario = new PerformancePCMWokloadScenario(OptimizationType.MINIMIZATION,
					workloadIDs, 1.1);
			PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
			expectedResponse.setResponse(responseTimeP1);
			scenario.setExpectedResponse(expectedResponse);
			scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
			cocomeS1 = scenario;
		}

		return cocomeS1;
	}

	public AbstractPerformancePCMScenario createScenario2Cocome() {
		if (cocomeS2 == null) {
			ArrayList<String> workloadIDs = new ArrayList<String>();
			workloadIDs.add("_VgwxwHr3Eeek77WF10mCCg");
			AbstractPerformancePCMScenario scenario = new PerformancePCMWokloadScenario(OptimizationType.MINIMIZATION,
					workloadIDs, 1.5);
			PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
			expectedResponse.setResponse(responseTimeP2);
			scenario.setExpectedResponse(expectedResponse);
			scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
			cocomeS2 = scenario;
		}
		return cocomeS2;
	}

	public AbstractPerformancePCMScenario createScenario3Cocome() {
		if (cocomeS3 == null) {
			ArrayList<String> cpuIDs = new ArrayList<String>();
			cpuIDs.add("_WV4YUK2VEeaxN4gXuIkS2A");
			AbstractPerformancePCMScenario scenario = new PerformancePCMCPUScenario(OptimizationType.MINIMIZATION,
					cpuIDs, 0.5);
			PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
			expectedResponse.setResponse(responseTimeP3);
			scenario.setExpectedResponse(expectedResponse);
			scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
			cocomeS3 = scenario;
		}
		return cocomeS3;
	}

	public AbstractPerformancePCMScenario createScenario4Cocome() {
		if (cocomeS4 == null) {
			String loopIterations = "IntPMF[(1; 0.01)(2; 0.01)(3; 0.02)(4; 0.02)(5; 0.03)(6; 0.03)(7; 0.04)(8; 0.04)(9; 0.05)(10; 0.06)"
					+ "(11; 0.06)(12; 0.06)(13; 0.08)(14; 0.09)(15; 0.10)(16; 0.09)(17; 0.07)(18; 0.06)(19; 0.05)(20; 0.03)]";
			;
			ArrayList<String> loopIDs = new ArrayList<String>();
			loopIDs.add("_fsG44tqFEee4ToXBRRujSw");
			AbstractPerformancePCMScenario scenario = new PerformancePCMUsageScenario(OptimizationType.MINIMIZATION,
					loopIDs, loopIterations);
			PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
			expectedResponse.setResponse(responseTimeP4);
			scenario.setExpectedResponse(expectedResponse);
			scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
			cocomeS4 = scenario;
		}
		return cocomeS4;
	}

	private static void configureCpuClockRate(ConfigurationImprovedImproved configuration) {
		DesigndecisionConfigImproved designdecisionConfig = configuration.getDesignDecisionConfig();

		// Set the boundary values for the IDs of the servers
		designdecisionConfig.setLimits("_78qo4K2UEeaxN4gXuIkS2A", 200, 600);
		designdecisionConfig.setLimits("_-5Q84K2UEeaxN4gXuIkS2A", 600, 1600);
		designdecisionConfig.setLimits("_BgmykK2VEeaxN4gXuIkS2A", 350, 1000);
		designdecisionConfig.setLimits("_FM6FMK2VEeaxN4gXuIkS2A", 250, 800);
	}

	public AbstractPCMBot createPCMBot(AbstractPerformancePCMScenario scenario) {
		if (scenario == cocomeS1 && cocomeBotS1 != null)
			return cocomeBotS1;
		if (scenario == cocomeS2 && cocomeBotS2 != null)
			return cocomeBotS2;
		if (scenario == cocomeS3 && cocomeBotS3 != null)
			return cocomeBotS3;
		if (scenario == cocomeS4 && cocomeBotS4 != null)
			return cocomeBotS4;
		// create configuration
		ConfigurationImprovedImproved configuration = new ConfigurationImprovedImproved();
		// The number is rather small, but still the improvement is at around 80%. In
		// addition, one run does only need to do small steps if several iterations are
		// applied.
		configuration.getPerOpteryxConfig().setGenerationSize(25);
		configuration.getPerOpteryxConfig().setMaxIterations(7);

		configureCpuClockRate(configuration);

		configuration.getLqnsConfig().setLqnsOutputDir(TestConstants.LQN_OUTPUT);
		configuration.getExporterConfig().setPcmOutputFolder(TestConstants.PCM_STORAGE_PATH);
		configuration.getPcmModelsConfig().setPathmapFolder(TestConstants.PCM_MODEL_FILES);

		// init bot
		ConcurrentPerOpteryxPCMBot bot = new ConcurrentPerOpteryxPCMBot(scenario, configuration);
		bot.setDebugMode(false);
		// This is another analysis run that outputs detailed CPU utilization, we
		// usually use it for debugging. This can be done later if
		// necessary, so we do not need it.
		bot.setDetailedAnalysis(false);

		if (scenario == cocomeS1)
			cocomeBotS1 = bot;
		if (scenario == cocomeS2)
			cocomeBotS2 = bot;
		if (scenario == cocomeS3)
			cocomeBotS3 = bot;
		if (scenario == cocomeS4)
			cocomeBotS4 = bot;

		return bot;
	}

	public String obtainName(AbstractPerformancePCMScenario scenario) {
		if (scenario == cocomeS1)
			return "perfomanceBot1";
		if (scenario == cocomeS2)
			return "perfomanceBot2";
		if (scenario == cocomeS3)
			return "perfomanceBot3";
		if (scenario == cocomeS4)
			return "perfomanceBot4";
		return null;
	}
}
