package io.github.squat_team.algorithm;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.ArchitectureTransformer;
import io.github.squat_team.algorithm.util.PCMBotMockBuilder;
import io.github.squat_team.algorithm.util.PCMBotMockBuilderResult;
import io.github.squat_team.algorithm.util.PCMBotMockLinker;
import io.github.squat_team.model.PCMArchitectureInstance;

/**
 * This class simplifies the setup of tests for the SQuAT algorithm. Methods can be overridden if necessary.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ArchitectureTransformer.class)
public abstract class AbstractSQuATTest {
	protected PCMArchitectureInstance initialArchitecture;
	protected List<AbstractPCMBot> bots = new ArrayList<AbstractPCMBot>();

	@Before
	public void setUp() throws Exception {
		generateInitialArchitecture();
		List<PCMBotMockBuilder> botBuilder = mockBots();
		mockAnalysisResponses(botBuilder);
		mockOptimizationResponses(botBuilder);
		List<PCMBotMockBuilderResult> botBuilderResults = buildBots(botBuilder);
		mockLinks(botBuilderResults);
		bots = extractBots(botBuilderResults);
	}

	/**
	 * Initializes all bots necessary for this test.
	 * 
	 * @return The bots which should be built.
	 */
	protected abstract List<PCMBotMockBuilder> mockBots();

	/**
	 * Sets the results for the analysis of the initial architecture.
	 * 
	 * @param botBuilders
	 *            the initialized bot builders.
	 */
	protected abstract void mockAnalysisResponses(List<PCMBotMockBuilder> botBuilders);

	/**
	 * Sets the results for the optimization of the initial candidate.
	 * 
	 * @param botBuilders
	 *            the initialized bot builders.
	 */
	protected abstract void mockOptimizationResponses(List<PCMBotMockBuilder> botBuilders);

	/**
	 * Sets the analysis results of the other bots for the optimization results
	 * of another bot. The {@link PCMBotMockLinker} can do most of the work.
	 * 
	 * @param botResults the results of the bot builders.
	 */
	protected abstract void mockLinks(List<PCMBotMockBuilderResult> botResults);

	/**
	 * In the end of the test the results have to be compared to the desired values.
	 * 
	 * @param bots all the bots used in this test.
	 * @param bestCandidate the best candidate found by the negotiation.
	 */
	protected abstract void validateResults(List<AbstractPCMBot> bots, PCMArchitectureInstance bestCandidate);

	protected void generateInitialArchitecture() {
		initialArchitecture = mock(PCMArchitectureInstance.class);
		when(initialArchitecture.getName()).thenReturn("initialArchitecture");
	}

	protected List<PCMBotMockBuilderResult> buildBots(List<PCMBotMockBuilder> botBuilder) throws Exception {
		List<PCMBotMockBuilderResult> botResults = new ArrayList<PCMBotMockBuilderResult>();
		for (PCMBotMockBuilder builder : botBuilder) {
			botResults.add(builder.build(initialArchitecture));
		}
		return botResults;
	}

	protected List<AbstractPCMBot> extractBots(List<PCMBotMockBuilderResult> botBuilders) {
		List<AbstractPCMBot> bots = new ArrayList<AbstractPCMBot>();
		for (PCMBotMockBuilderResult botResult : botBuilders) {
			bots.add(botResult.getBot());
		}
		return bots;
	}

	@Test
	public void test() throws Exception {
		PCMArchitectureInstance bestCandidate = executeNegotiation(bots);
		validateResults(bots, bestCandidate);
	}

	protected PCMArchitectureInstance executeNegotiation(List<AbstractPCMBot> bots) throws Exception {
		// TODO
		return null;
	}

}
