package io.github.squat_team.algorithm.util;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.model.PCMTactic;
import io.github.squat_team.model.ResponseMeasureType;

import static org.mockito.Mockito.*;

/**
 * Clones a mocked PCMScenarioResult.
 */
@SuppressWarnings("rawtypes")
public class PCMScenarioResultMockCloner {
	ArchitectureBuilder builder = new ArchitectureBuilder();

	public PCMScenarioResult clone(PCMScenarioResult optimizationResponse) throws Exception {
		PCMScenarioResult clonedScenarioResult = mock(PCMScenarioResult.class);
		PCMResult clonedResult = mock(PCMResult.class);

		Comparable response = optimizationResponse.getResult().getResponse();
		ResponseMeasureType responseMeasureType = optimizationResponse.getResult().getResponseMeasureType();
		AbstractPCMBot bot = optimizationResponse.getOriginatingBot();
		PCMTactic tactic = optimizationResponse.getAppliedTactic();
		PCMArchitectureInstance architecture = optimizationResponse.getResultingArchitecture();

		when(clonedResult.getResponse()).thenReturn(response);
		when(clonedResult.getResponseMeasureType()).thenReturn(responseMeasureType);
		when(clonedScenarioResult.getResult()).thenReturn(clonedResult);

		when(clonedScenarioResult.getOriginatingBot()).thenReturn(bot);
		when(clonedScenarioResult.getAppliedTactic()).thenReturn(tactic);
		when(clonedScenarioResult.getResultingArchitecture()).thenReturn(architecture);
		when(clonedScenarioResult.isSatisfied()).thenCallRealMethod();

		return clonedScenarioResult;
	}

}
