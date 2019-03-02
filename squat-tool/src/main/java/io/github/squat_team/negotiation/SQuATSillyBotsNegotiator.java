package io.github.squat_team.negotiation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.export.ExportController;

public class SQuATSillyBotsNegotiator implements ISQuATNegotiator {

	// private List<PCMArchitectureInstance> architectureAlternatives;
	private ExportController exporter;
	private List<SillyBot> sillyBots;
	private HashMap<SillyBot, Proposal> proposals;
	private Proposal agreementProposal;
	private List<Proposal> nonDominatedAlternatives = new ArrayList<>();

	public SQuATSillyBotsNegotiator(ExportController exporter) {
		agreementProposal = null;
		this.exporter = exporter;
	}

	@Override
	public void initialize(List<SillyBot> sillyBots) {
		this.sillyBots = sillyBots;
		initializeProposals();
	}

	/**
	 * Sets the best proposals of each bot as its current proposal
	 */
	private void initializeProposals() {
		proposals = new HashMap<>();
		for (SillyBot bot : sillyBots) {
			proposals.put(bot, bot.getBestProposal());
			System.out.println(bot + " " + bot.getBestProposal());
		}
	}

	@Override
	public NegotiatorResult negotiate(boolean redoRequest) {
		// architectureAlternatives=loadArchitecturalAlternatives(); This should be done
		// for real. Now I'm hardcoding the results
		// Step 1: Collect initial proposals -> done by controller now
		// Step 2: Loop until you reach an Agreement or a Conflict
		while ((!checkAgreement(proposals)) || redoRequest) {
			redoRequest = false;
			// Select Agent who has to concede
			List<SillyBot> shouldConcede = selectWhoHasToConcede();

			if (shouldConcede.isEmpty()) {
				// Step 4: CONFLICT REACHED
				return createConflictResults();
			} else {
				System.out.println("Step 3.b: Agent/s who has to concede [#= " + shouldConcede.size() + "]=> "
						+ shouldConcede.toString());
				boolean atLeastOneNewProposal = false;
				for (SillyBot concedingAg : shouldConcede) {
					// Make "concedingAg" to concede
					Proposal newProposal;

					newProposal = concedingAg.makeConcession(this.sillyBots);// I have to implement this method
					if (newProposal != null) {
						System.out.println("Step 3.c: New Proposal made by agent "+concedingAg +" => " + newProposal.toString());
						// Update proposals map
						proposals.put(concedingAg, newProposal);
						atLeastOneNewProposal = true;
					}

				}
				if (!atLeastOneNewProposal) {
					// Step 4: CONFLICT REACHED
					return createConflictResults();
				}
			}
		}
		// At this point an agreement should have been found => return it
		nonDominatedAlternatives = findNonDominatedAlternatives();
		return createSuccessfulResults();
	}

	private NegotiatorResult createSuccessfulResults() {
		NegotiatorResult result = new NegotiatorResult(true);
		result.setAgreementProposal(agreementProposal);
		result.setNonDominatedAlternatives(nonDominatedAlternatives);
		result.setSillyBots(sillyBots);
		result.setProposals(proposals);
		return result;
	}

	private NegotiatorResult createConflictResults() {
		NegotiatorResult result = new NegotiatorResult(false);
		result.setAgreementProposal(null);
		result.setNonDominatedAlternatives(new ArrayList<>());
		result.setSillyBots(sillyBots);
		result.setProposals(proposals);
		return result;
	}

	/**
	 * Searches for the non-dominated (Pareto optimal) solutions within all
	 * proposals.
	 */
	private List<Proposal> findNonDominatedAlternatives() {
		List<Proposal> nonDominatedAlternatives = new ArrayList<>();
		List<Proposal> proposals = sillyBots.get(0).getOrderedProposals();
		for (Proposal proposal : proposals) {
			if (!isDominatedByAtLeastOneProposal(proposal)) {
				nonDominatedAlternatives.add(proposal);
			}
		}
		return nonDominatedAlternatives;
	}

	private boolean isDominatedByAtLeastOneProposal(Proposal proposal) {
		List<Proposal> otherProposals = new ArrayList<>(sillyBots.get(0).getOrderedProposals());
		otherProposals.remove(proposal);
		for (Proposal proposal2 : otherProposals) {
			if (isDominatedBy(proposal, proposal2)) {
				return true;
			}
		}
		return false;
	}

	private boolean isDominatedBy(Proposal proposal, Proposal proposal2) {

		boolean allEqual = true;
		for (SillyBot bot : sillyBots) {
			// Si le gano en al menos uno entonces no es dominado
			if ((bot.getResponse(proposal) < bot.getResponse(proposal2)))
				return false;
			if ((bot.getResponse(proposal) != bot.getResponse(proposal2)))
				allEqual = false;
		}

		return !allEqual;
	}

	private List<SillyBot> selectWhoHasToConcede() {
		List<SillyBot> shouldConcede = new ArrayList<>();
		List<SillyBot> concedingAgents = getAgentsThatCanConcede();
		if (concedingAgents.size() > 1) {
			SillyBot agMin = null;
			double minZi = Double.POSITIVE_INFINITY;

			// String zis = "";
			for (SillyBot ag : concedingAgents) {
				double agZi = this.getZiFor(ag, sillyBots);
				// zis+= ag.getID()+"= "+agZi+", ";
				if (agZi <= minZi && agZi != Double.POSITIVE_INFINITY) { // agZi != Double.POSITIVE_INFINITY just in
																			// case, we should never need this check if
																			// the agents in "agents" list can concede.
					if (agZi == minZi && agMin != null) // if A and B have the same Zi => store A in the list of agents
														// who should concede, and now B is the agMin.
						shouldConcede.add(agMin);
					else // agZi < minZi
						shouldConcede.clear(); // clear the list because there is a new minimum
					minZi = agZi;
					agMin = ag;
				}
			}
			shouldConcede.add(agMin); // the "last" minimum should be added to the list. If there were other agents
										// with the same Zi as the agMin then they were added to the shouldConcede list.
			// logger.info(">> Zi's: "+zis);
		} else if (concedingAgents.size() == 1)
			shouldConcede.add(concedingAgents.get(0));

		return shouldConcede;

	}

	/**
	 * WillingnessToRiskConflictStrategy (WRC)
	 * 
	 * @param ag
	 * @param sillyBots2
	 * @return
	 */
	private double getZiFor(SillyBot myAgent, List<SillyBot> allAgents) {
		List<SillyBot> otherAgents = new ArrayList<>(allAgents);
		otherAgents.remove(myAgent);

		double myUtility;

		myUtility = myAgent.getUtilityFor(myAgent.getCurrentProposal());

		if (myUtility == 0)
			return 1;
		else
			return ((myUtility - selectMinUtilityProposal(myAgent, otherAgents)) / myUtility); // zi
	}

	private double selectMinUtilityProposal(SillyBot myAgent, List<SillyBot> otherAgents) {
		double minUtility = Double.POSITIVE_INFINITY;

		for (SillyBot otherAgent : otherAgents) {
			Proposal otherAgentProposal = otherAgent.getCurrentProposal();
			if (myAgent.getUtilityFor(otherAgentProposal.getArchitectureName()) < minUtility) {
				minUtility = myAgent.getUtilityFor(otherAgentProposal.getArchitectureName());
			}
		}

		return minUtility;

	}

	private List<SillyBot> getAgentsThatCanConcede() {
		List<SillyBot> ret = new ArrayList<>();
		for (SillyBot bot : sillyBots) {
			if (bot.canConcede())
				ret.add(bot);
		}
		return ret;
	}

	/**
	 * Checks if there is an agreement (between the agents) for one of the proposals
	 * 
	 * @param proposals
	 * @return
	 */
	private boolean checkAgreement(HashMap<SillyBot, Proposal> proposals) {
		ArrayList<Proposal> proposalsShuffle = new ArrayList<Proposal>(proposals.values());
		Collections.shuffle(proposalsShuffle);
		for (Proposal proposal : proposalsShuffle) {
			if (checkAgreementForAgents(proposal)) {
				agreementProposal = proposal;
				exporter.handleIntermediateState(createSuccessfulResults());
				return true;
			}
		}
		return false;
	}

	private boolean checkAgreementForAgents(Proposal proposal) {
		for (SillyBot sillyBot : sillyBots) {
			if (!sillyBot.acceptableUtilityValue(proposal))
				return false;
		}
		return true;
	}

}
