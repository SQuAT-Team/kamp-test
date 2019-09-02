package io.github.squat_team.experiments.filters;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.AdditionalMatchers;
import org.mockito.Mockito;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.model.PCMArchitectureInstance;

/**
 * Tests the {@link BestCandidatesFilter}.
 */
public class BestCandidatesFilterTest {

	/**
	 * This test hands over a list of ten candidates and two modifiability bots to
	 * the filter. Seven of the candidates are last modified by the modifiability
	 * bots, three by the performance bot.
	 */
	@Test
	public void filterBestCandidatesTest() {
		List<SillyBot> bots = mockTwoBots();
		List<ArchitecturalVersion> architectures = mockTenCandidates();
		List<List<ArchitecturalVersion>> botArchitectures = createBotArchitectures(architectures);
		float[][] utilityValues = createBotUtilityValues();
		mockProposals(bots, botArchitectures, utilityValues);
		Map<ArchitecturalVersion, PCMArchitectureInstance> architectureCache = createSimpleArchitectureCache(
				architectures);
		List<ArchitecturalVersion> filteredArchitectures = executeFilter(architectures, bots, architectureCache);
		validate(filteredArchitectures, architectureCache);
	}

	private void validate(List<ArchitecturalVersion> filteredArchitectures, Map<ArchitecturalVersion, PCMArchitectureInstance> architectureCache) {
		String names = concatenateNames(filteredArchitectures);

		assertTrue(names.contains("a0"));
		assertTrue(names.contains("a1"));
		assertTrue(names.contains("a2"));
		assertTrue(names.contains("a3"));
		assertTrue(names.contains("a4"));
		assertTrue(names.contains("a7"));
		assertTrue(names.contains("a8"));
		assertTrue(names.contains("a9"));

		assertFalse(names.contains("a5"));
		assertFalse(names.contains("a6"));

		assertEquals(8, architectureCache.size());
	}

	private String concatenateNames(List<ArchitecturalVersion> filteredArchitectures) {
		String names = "";
		for (ArchitecturalVersion architecture : filteredArchitectures) {
			names += architecture.getName();
		}
		return names;
	}

	private List<ArchitecturalVersion> executeFilter(List<ArchitecturalVersion> architectures, List<SillyBot> bots,
			Map<ArchitecturalVersion, PCMArchitectureInstance> architectureCache) {
		BestCandidatesFilter filter = new BestCandidatesFilter(5);
		assertTrue(filter.checkPrecondition(architectures, bots));
		return filter.filter(architectures, bots, bots, architectureCache);

	}

	private float[][] createBotUtilityValues() {
		float[] bot1UtilityValue = { 1, 1, 1, 0.9f, 0.8f, 0.7f, 0.7f, 0.6f, 0.3f, 0.2f };
		float[] bot2UtilityValue = { 1, 1, 1, 0.9f, 0.8f, 0.7f, 0.7f, 0.6f, 0.3f, 0.2f };
		float[][] utilityValues = { bot1UtilityValue, bot2UtilityValue };
		return utilityValues;
	}

	private List<List<ArchitecturalVersion>> createBotArchitectures(List<ArchitecturalVersion> architectures) {
		List<ArchitecturalVersion> bot1Architectures = new ArrayList<>();
		bot1Architectures.add(architectures.get(0));
		bot1Architectures.add(architectures.get(1));
		bot1Architectures.add(architectures.get(2));
		bot1Architectures.add(architectures.get(9));
		bot1Architectures.add(architectures.get(7));
		bot1Architectures.add(architectures.get(6));
		bot1Architectures.add(architectures.get(5));
		bot1Architectures.add(architectures.get(4));
		bot1Architectures.add(architectures.get(3));
		bot1Architectures.add(architectures.get(8));

		List<ArchitecturalVersion> bot2Architectures = new ArrayList<>();
		bot2Architectures.add(architectures.get(0));
		bot2Architectures.add(architectures.get(2));
		bot2Architectures.add(architectures.get(9));
		bot2Architectures.add(architectures.get(3));
		bot2Architectures.add(architectures.get(4));
		bot2Architectures.add(architectures.get(6));
		bot2Architectures.add(architectures.get(7));
		bot2Architectures.add(architectures.get(8));
		bot2Architectures.add(architectures.get(1));
		bot2Architectures.add(architectures.get(5));

		List<List<ArchitecturalVersion>> botArchitectures = new ArrayList<>();
		botArchitectures.add(bot1Architectures);
		botArchitectures.add(bot2Architectures);
		return botArchitectures;
	}

	private Map<ArchitecturalVersion, PCMArchitectureInstance> createSimpleArchitectureCache(
			List<ArchitecturalVersion> architectures) {
		Map<ArchitecturalVersion, PCMArchitectureInstance> architectureCache = new HashMap<>();
		for (ArchitecturalVersion architecture : architectures) {
			architectureCache.put(architecture, null);
		}
		assertEquals(10, architectureCache.size());
		return architectureCache;
	}

	private List<SillyBot> mockTwoBots() {
		List<SillyBot> bots = new ArrayList<>();
		bots.add(mockBot(AbstractPCMBot.QA_MODIFIABILITY));
		bots.add(mockBot(AbstractPCMBot.QA_MODIFIABILITY));
		return bots;
	}

	private SillyBot mockBot(String qualityAttribute) {
		SillyBot bot = Mockito.mock(SillyBot.class);
		Mockito.when(bot.getQualityAttribute()).thenReturn(qualityAttribute);
		return bot;
	}

	private List<ArchitecturalVersion> mockTenCandidates() {
		List<ArchitecturalVersion> architectures = new ArrayList<>();
		architectures.add(mockCandidate("a0", AbstractPCMBot.QA_MODIFIABILITY));
		architectures.add(mockCandidate("a1", AbstractPCMBot.QA_MODIFIABILITY));
		architectures.add(mockCandidate("a2", AbstractPCMBot.QA_MODIFIABILITY));
		architectures.add(mockCandidate("a3", AbstractPCMBot.QA_MODIFIABILITY));
		architectures.add(mockCandidate("a4", AbstractPCMBot.QA_MODIFIABILITY));
		architectures.add(mockCandidate("a5", AbstractPCMBot.QA_MODIFIABILITY));
		architectures.add(mockCandidate("a6", AbstractPCMBot.QA_MODIFIABILITY));
		architectures.add(mockCandidate("a7", AbstractPCMBot.QA_PERFORMANCE));
		architectures.add(mockCandidate("a8", AbstractPCMBot.QA_PERFORMANCE));
		architectures.add(mockCandidate("a9", AbstractPCMBot.QA_PERFORMANCE));
		return architectures;
	}

	private ArchitecturalVersion mockCandidate(String name, String lastModifiedBy) {
		ArchitecturalVersion candidate = Mockito.mock(ArchitecturalVersion.class);
		Mockito.when(candidate.getName()).thenReturn(name);
		Mockito.when(candidate.getLastModifiedBy()).thenReturn(lastModifiedBy);
		Mockito.when(candidate.wasLastModifiedBy(lastModifiedBy)).thenReturn(true);
		Mockito.when(candidate.wasLastModifiedBy(AdditionalMatchers.not(Mockito.eq(lastModifiedBy)))).thenReturn(false);

		return candidate;
	}

	private void mockProposals(List<SillyBot> bots, List<List<ArchitecturalVersion>> architectures,
			float[][] utilityValues) {
		for (int i = 0; i < bots.size(); i++) {
			SillyBot currentBot = bots.get(i);
			float[] currentUtilityValues = utilityValues[i];
			List<ArchitecturalVersion> currentArchitectures = architectures.get(i);
			mockProposals(currentBot, currentArchitectures, currentUtilityValues);
		}
	}

	private void mockProposals(SillyBot bot, List<ArchitecturalVersion> architectures, float[] utilityValues) {
		List<Proposal> proposals = new ArrayList<>();
		for (int i = 0; i < architectures.size(); i++) {
			ArchitecturalVersion currentArchitecture = architectures.get(i);
			float utilityValue = utilityValues[i];
			Proposal currentProposal = mockProposal(currentArchitecture.getName());
			proposals.add(currentProposal);
			Mockito.when(bot.getUtilityFor(currentProposal)).thenReturn(utilityValue);
		}
		Mockito.when(bot.getOrderedProposals()).thenReturn(proposals);
	}

	private Proposal mockProposal(String architectureName) {
		Proposal proposal = Mockito.mock(Proposal.class);
		Mockito.when(proposal.getArchitectureName()).thenReturn(architectureName);
		return proposal;
	}

}
