package io.github.squat_team.algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.agentsUtils.concessionStrategies.DesiredDistanceFactory;
import io.github.squat_team.agentsUtils.concessionStrategies.IConcessionStrategyFactory;
import io.github.squat_team.export.ExportController;
import io.github.squat_team.negotiation.NegotiatorResult;
import io.github.squat_team.negotiation.SQuATSillyBotsNegotiator;

/**
 * A basic test for the {@link SQuATSillyBotsNegotiator} with only two general
 * bots.
 */
public class SimpleNegotiatorTest {
	/**
	 * Bot 1 accepts results below this threshold.
	 */
	private final static float BOT1_SCENARIO_THRESHOLD = 10;
	/**
	 * Bot 2 accepts results below this threshold.
	 */
	private final static float BOT2_SCENARIO_THRESHOLD = 100;

	private List<SillyBot> bots = new ArrayList<>();
	private HashMap<SillyBot, Proposal> proposals = new HashMap<>();
	private NegotiatorResult result;

	@Before
	public void clearData() {
		bots.clear();
		proposals.clear();

		result = null;
	}

	/**
	 * Tests whether the negotiator accepts a single solution with the exact
	 * threshold values.
	 */
	@Test
	public void correctSolutionTest1() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 10f, 100f });

		executeNegotiation();

		assertTrue(result.isSuccessful());
		assertEquals("architecture1", result.getAgreementProposal().getArchitectureName());

		// check non-dominated results
		assertEquals(1, result.getNonDominatedAlternatives().size());
		assertEquals("architecture1", result.getNonDominatedAlternatives().get(0).getArchitectureName());
	}

	/**
	 * Tests whether the negotiator accepts a solution with the exact threshold
	 * values, while a very bad result is present.
	 */
	@Test
	public void correctSolutionTest2() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 10f, 100f });
		setResultsForArchitecture("architecture2", new Float[] { 10000f, 1000000f });

		executeNegotiation();

		assertTrue(result.isSuccessful());
		assertEquals("architecture1", result.getAgreementProposal().getArchitectureName());

		// check non-dominated results
		assertEquals(1, result.getNonDominatedAlternatives().size());
		assertEquals("architecture1", result.getNonDominatedAlternatives().get(0).getArchitectureName());
	}

	/**
	 * Tests whether the negotiator accepts the correct solution with the exact
	 * threshold values from a group of multiple values.
	 */
	@Test
	public void correctMultipleSolutionTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 10f, 100f });
		setResultsForArchitecture("architecture2", new Float[] { 12f, 102f });
		setResultsForArchitecture("architecture3", new Float[] { 13f, 100f });
		setResultsForArchitecture("architecture4", new Float[] { 100f, 152f });

		executeNegotiation();

		assertTrue(result.isSuccessful());
		assertEquals("architecture1", result.getAgreementProposal().getArchitectureName());

		// check non-dominated results
		assertEquals(1, result.getNonDominatedAlternatives().size());
		assertEquals("architecture1", result.getNonDominatedAlternatives().get(0).getArchitectureName());
	}

	/**
	 * Tests whether the negotiator accepts a single solution, which is much better
	 * than the threshold.
	 */
	@Test
	public void overoptimizedSolutionTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 1f, 1f });

		executeNegotiation();

		assertTrue(result.isSuccessful());

		// check non-dominated results
		assertEquals(1, result.getNonDominatedAlternatives().size());
		assertEquals("architecture1", result.getNonDominatedAlternatives().get(0).getArchitectureName());
	}

	/**
	 * Tests whether the negotiator accepts a solution, which nearly reaches the
	 * threshold of the first bot.
	 */
	@Test
	public void Bot1TradeoffTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 11f, 100f });

		executeNegotiation();

		assertTrue(result.isSuccessful());

		// check non-dominated results
		assertEquals(1, result.getNonDominatedAlternatives().size());
		assertEquals("architecture1", result.getNonDominatedAlternatives().get(0).getArchitectureName());
	}

	/**
	 * Tests whether the negotiator finds the right solution, which nearly reaches
	 * the threshold of the first bot.
	 */
	@Test
	public void Bot1MultipleTradeoffTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 11f, 100f });
		setResultsForArchitecture("architecture2", new Float[] { 100f, 10000f });
		setResultsForArchitecture("architecture3", new Float[] { 1000f, 100f });
		setResultsForArchitecture("architecture4", new Float[] { 110f, 1000f });

		executeNegotiation();

		assertTrue(result.isSuccessful());
		assertEquals("architecture1", result.getAgreementProposal().getArchitectureName());

		// check non-dominated results
		assertEquals(1, result.getNonDominatedAlternatives().size());
		assertEquals("architecture1", result.getNonDominatedAlternatives().get(0).getArchitectureName());
	}

	/**
	 * Tests whether the negotiator accepts a solution, which nearly reaches the
	 * threshold of the second bot.
	 */
	@Test
	public void Bot2TradeoffTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 10f, 101f });

		executeNegotiation();

		assertTrue(result.isSuccessful());
		assertEquals("architecture1", result.getAgreementProposal().getArchitectureName());

		// check non-dominated results
		assertEquals(1, result.getNonDominatedAlternatives().size());
		assertEquals("architecture1", result.getNonDominatedAlternatives().get(0).getArchitectureName());
	}

	/**
	 * Tests whether the negotiator finds the right solution, which nearly reaches
	 * the threshold of the second bot.
	 */
	@Test
	public void Bot2MultipleTradeoffTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 12f, 100f });
		setResultsForArchitecture("architecture2", new Float[] { 10f, 101f });
		setResultsForArchitecture("architecture3", new Float[] { 12f, 101f });

		executeNegotiation();

		assertTrue(result.isSuccessful());
		assertEquals("architecture2", result.getAgreementProposal().getArchitectureName());

		// check non-dominated results
		assertEquals(2, result.getNonDominatedAlternatives().size());
		assertNotEquals("architecture3", result.getNonDominatedAlternatives().get(0).getArchitectureName());
		assertNotEquals("architecture3", result.getNonDominatedAlternatives().get(1).getArchitectureName());
	}

	/**
	 * Tests whether the negotiator accepts a solution, which nearly reaches the
	 * threshold of the first and second bot.
	 */
	@Test
	public void Bot1And2TradeoffTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 11f, 101f });

		executeNegotiation();

		assertTrue(result.isSuccessful());

		// check non-dominated results
		assertEquals(1, result.getNonDominatedAlternatives().size());
		assertEquals("architecture1", result.getNonDominatedAlternatives().get(0).getArchitectureName());
	}

	/**
	 * Tests whether the negotiator finds the right solution, which nearly reaches
	 * the threshold of the first and second bot.
	 */
	@Test
	public void Bot1And2MultipleTradeoffTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 10f, 1000f });
		setResultsForArchitecture("architecture2", new Float[] { 100f, 100f });
		setResultsForArchitecture("architecture3", new Float[] { 11f, 101f });

		executeNegotiation();

		assertTrue(result.isSuccessful());
		assertEquals("architecture3", result.getAgreementProposal().getArchitectureName());

		// check non-dominated results
		assertEquals(3, result.getNonDominatedAlternatives().size());
	}

	/**
	 * Tests whether the negotiator declines a really bad solution.
	 */
	@Test
	public void wrongSolutionTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 10000f, 1000000f });

		executeNegotiation();

		assertFalse(result.isSuccessful());
	}

	/**
	 * Tests whether the negotiator declines a group of really bad solutions.
	 */
	@Test
	public void wrongMultipleSolutionTest() {
		initializeTwoBots();

		setResultsForArchitecture("architecture1", new Float[] { 10000f, 100000f });
		setResultsForArchitecture("architecture2", new Float[] { 1000f, 1000000f });
		setResultsForArchitecture("architecture3", new Float[] { 10000f, 1000000f });
		setResultsForArchitecture("architecture4", new Float[] { 1000f, 100000f });

		executeNegotiation();

		assertFalse(result.isSuccessful());
	}

	private void executeNegotiation() {
		SQuATSillyBotsNegotiator negotiator = new SQuATSillyBotsNegotiator(new ExportController());
		negotiator.initialize(bots);
		result = negotiator.negotiate(false);
	}

	private void initializeTwoBots() {
		initializeBot("performance1", AbstractPCMBot.QA_PERFORMANCE, BOT1_SCENARIO_THRESHOLD);
		initializeBot("modifiability1", AbstractPCMBot.QA_MODIFIABILITY, BOT2_SCENARIO_THRESHOLD);
	}

	private void initializeBot(String name, String qualityAttribute, float scenarioThreshold) {
		SillyBot bot = new SillyBotImplementation(name, qualityAttribute, scenarioThreshold, new DesiredDistanceFactory());
		bots.add(bot);
	}

	private void setResultsForArchitecture(String name, Float[] responses) {
		if (bots.size() != responses.length) {
			throw new IllegalArgumentException("There must be exactly as many responses as bots");
		}
		for (int i = 0; i < bots.size(); i++) {
			Proposal proposal = new ProposalImplementation(name, responses[i]);
			bots.get(i).insertInOrder(proposal);
		}
	}

	/**
	 * This class is necessary, as there is no default implementation.
	 */
	public class SillyBotImplementation extends SillyBot {

		public SillyBotImplementation(String name, String qualityAttribute, float scenarioThreshold,
				IConcessionStrategyFactory concessionStrategyFactory) {
			super(name, qualityAttribute, scenarioThreshold, concessionStrategyFactory, false);
		}

		@Override
		public float getResponse(Proposal p) {
			Proposal proposal = getProposalForArchitecture(p.getArchitectureName());
			return proposal.getScenarioResponse();
		}

		@Override
		protected float getScenarioMeasureFor(Proposal proposal) {
			return proposal.getScenarioResponse();
		}

	}

	/**
	 * This class is necessary, as there is no default implementation.
	 */
	public class ProposalImplementation extends Proposal {

		public ProposalImplementation(String pcmArchitecture, float scenarioResponse) {
			super(pcmArchitecture, scenarioResponse);
		}

	}

}
