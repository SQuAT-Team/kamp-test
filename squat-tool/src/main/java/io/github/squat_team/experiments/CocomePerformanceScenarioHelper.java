package io.github.squat_team.experiments;

import java.util.ArrayList;

import io.github.squat_team.model.OptimizationType;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.ResponseMeasureType;
import io.github.squat_team.performance.AbstractPerformancePCMScenario;
import io.github.squat_team.performance.PerformanceMetric;
import io.github.squat_team.performance.PerformancePCMCPUScenario;
import io.github.squat_team.performance.PerformancePCMUsageScenario;
import io.github.squat_team.performance.PerformancePCMWokloadScenario;
import test.TestConstants;

public class CocomePerformanceScenarioHelper {

	@Deprecated // never used
	public AbstractPerformancePCMScenario createScenarioOfWorkload() {
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
	public AbstractPerformancePCMScenario createScenarioOfCPU() {
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

	public PCMScenario createScenario1Cocome(Float responseTime) {
		ArrayList<String> workloadIDs = new ArrayList<String>();
		workloadIDs.add("_VgwxwHr3Eeek77WF10mCCg");
		AbstractPerformancePCMScenario scenario = new PerformancePCMWokloadScenario(OptimizationType.MINIMIZATION,
				workloadIDs, 1.1);
		PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
		expectedResponse.setResponse(responseTime);
		scenario.setExpectedResponse(expectedResponse);
		scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
		return scenario;
	}

	public PCMScenario createScenario2Cocome(Float responseTime) {
		ArrayList<String> workloadIDs = new ArrayList<String>();
		workloadIDs.add("_VgwxwHr3Eeek77WF10mCCg");
		AbstractPerformancePCMScenario scenario = new PerformancePCMWokloadScenario(OptimizationType.MINIMIZATION,
				workloadIDs, 1.5);
		PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
		expectedResponse.setResponse(responseTime);
		scenario.setExpectedResponse(expectedResponse);
		scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
		return scenario;
	}

	public PCMScenario createScenario3Cocome(Float responseTime) {
		ArrayList<String> cpuIDs = new ArrayList<String>();
		cpuIDs.add("_WV4YUK2VEeaxN4gXuIkS2A");
		AbstractPerformancePCMScenario scenario = new PerformancePCMCPUScenario(OptimizationType.MINIMIZATION, cpuIDs,
				0.5);
		PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
		expectedResponse.setResponse(responseTime);
		scenario.setExpectedResponse(expectedResponse);
		scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
		return scenario;
	}

	public PCMScenario createScenario4Cocome(Float responseTime) {
		String loopIterations = "IntPMF[(1; 0.01)(2; 0.01)(3; 0.02)(4; 0.02)(5; 0.03)(6; 0.03)(7; 0.04)(8; 0.04)(9; 0.05)(10; 0.06)"
				+ "(11; 0.06)(12; 0.06)(13; 0.08)(14; 0.09)(15; 0.10)(16; 0.09)(17; 0.07)(18; 0.06)(19; 0.05)(20; 0.03)]";
		;
		ArrayList<String> loopIDs = new ArrayList<String>();
		loopIDs.add("_fsG44tqFEee4ToXBRRujSw");
		AbstractPerformancePCMScenario scenario = new PerformancePCMUsageScenario(OptimizationType.MINIMIZATION,
				loopIDs, loopIterations);
		PCMResult expectedResponse = new PCMResult(ResponseMeasureType.DECIMAL);
		expectedResponse.setResponse(responseTime);
		scenario.setExpectedResponse(expectedResponse);
		scenario.setMetric(PerformanceMetric.RESPONSE_TIME);
		return scenario;
	}

}
