package io.github.squat_team.experiments.filters;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;

/**
 * Tests the {@link CorruptedCandidatesFilter}.
 */
public class CorruptedCandidatesFilterTest {

	/**
	 * A setup which contains two bots and three architectures. One architecture is
	 * corrupted. Low values are assumed to be corrupted.
	 */
	@Test
	public void testFloatMaxThreshold() {
		List<SillyBot> bots = mockTwoBots();
		List<ArchitecturalVersion> architectures = mockThreeArchitectures();

		float[] architecture1Responses = { 2, Float.MAX_VALUE };
		mockResponses(architectures.get(0), bots, architecture1Responses);

		float[] architecture2Responses = { Float.MAX_VALUE, Float.MAX_VALUE };
		mockResponses(architectures.get(1), bots, architecture2Responses);

		float[] architecture3Responses = { 11000, 13200 };
		mockResponses(architectures.get(2), bots, architecture3Responses);

		CorruptedCandidatesFilter filter = new CorruptedCandidatesFilter(Float.MAX_VALUE, true);
		List<ArchitecturalVersion> filteredArchitectures = filter.filter(architectures, bots, bots, null);

		assertEquals(2, filteredArchitectures.size());
		assertEquals("a1", filteredArchitectures.get(0).getName());
		assertEquals("a3", filteredArchitectures.get(1).getName());
	}

	/**
	 * A setup which contains two bots and three architectures. One architecture is
	 * corrupted. High values are assumed to be corrupted.
	 */
	@Test
	public void testMinThreshold() {
		List<SillyBot> bots = mockTwoBots();
		List<ArchitecturalVersion> architectures = mockThreeArchitectures();

		float[] architecture1Responses = { 2, 0 };
		mockResponses(architectures.get(0), bots, architecture1Responses);

		float[] architecture2Responses = { 0, 0 };
		mockResponses(architectures.get(1), bots, architecture2Responses);

		float[] architecture3Responses = { 11000, 13200 };
		mockResponses(architectures.get(2), bots, architecture3Responses);

		CorruptedCandidatesFilter filter = new CorruptedCandidatesFilter(0, false);
		List<ArchitecturalVersion> filteredArchitectures = filter.filter(architectures, bots, bots, null);

		assertEquals(2, filteredArchitectures.size());
		assertEquals("a1", filteredArchitectures.get(0).getName());
		assertEquals("a3", filteredArchitectures.get(1).getName());
	}

	private SillyBot mockBot() {
		return Mockito.mock(SillyBot.class);
	}

	private ArchitecturalVersion mockArchitecture(String name) {
		ArchitecturalVersion architecture = Mockito.mock(ArchitecturalVersion.class);
		Mockito.when(architecture.getName()).thenReturn(name);
		return architecture;
	}

	private Proposal mockProposal(float scenarioResponse) {
		Proposal proposal = Mockito.mock(Proposal.class);
		Mockito.when(proposal.getScenarioResponse()).thenReturn(scenarioResponse);
		return proposal;
	}

	private void mockResponse(SillyBot mockedBot, Proposal proposal, ArchitecturalVersion architecture) {
		Mockito.when(mockedBot.getProposalForArchitecture(architecture.getName())).thenReturn(proposal);
	}

	private List<SillyBot> mockTwoBots() {
		List<SillyBot> bots = new ArrayList<>();
		bots.add(mockBot());
		bots.add(mockBot());
		return bots;
	}

	private void mockResponses(ArchitecturalVersion architecture, List<SillyBot> bots, float[] scenarioResponses) {
		for (int i = 0; i < bots.size(); i++) {
			Proposal proposal = mockProposal(scenarioResponses[i]);
			mockResponse(bots.get(i), proposal, architecture);
		}
	}

	private List<ArchitecturalVersion> mockThreeArchitectures() {
		List<ArchitecturalVersion> architectures = new ArrayList<>();
		architectures.add(mockArchitecture("a1"));
		architectures.add(mockArchitecture("a2"));
		architectures.add(mockArchitecture("a3"));
		return architectures;
	}

}
