package io.github.squat_team.negotiation;

import java.util.ArrayList;
import java.util.List;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;

public class ProposalAnalyzer {
	private List<SillyBot> bots;
	private List<Proposal> proposals;

	public ProposalAnalyzer(List<SillyBot> bots) {
		this.bots = bots;
	}

	/**
	 * Searches for the non-dominated (Pareto optimal) solutions within all
	 * proposals.
	 */
	public List<Proposal> getParetoOptimalSolutions() {
		this.proposals = getCurrentProposals(bots);
		List<Proposal> nonDominatedAlternatives = new ArrayList<>();
		for (Proposal proposal : proposals) {
			if (!isDominatedByAtLeastOneProposal(proposal)) {
				nonDominatedAlternatives.add(proposal);
			}
		}
		return nonDominatedAlternatives;
	}

	private List<Proposal> getCurrentProposals(List<SillyBot> bots) {
		return bots.get(0).getOrderedProposals();
	}

	private boolean isDominatedByAtLeastOneProposal(Proposal proposal) {
		List<Proposal> otherProposals = new ArrayList<>(this.proposals);
		otherProposals.remove(proposal);
		for (Proposal otherProposal : otherProposals) {
			if (isDominatedBy(proposal, otherProposal)) {
				return true;
			}
		}
		return false;
	}

	private boolean isDominatedBy(Proposal proposal, Proposal otherProposal) {
		boolean allEqual = true;
		for (SillyBot bot : this.bots) {
			// Si le gano en al menos uno entonces no es dominado
			if ((bot.getResponse(proposal) < bot.getResponse(otherProposal)))
				return false;
			if ((bot.getResponse(proposal) != bot.getResponse(otherProposal)))
				allEqual = false;
		}

		return !allEqual;
	}
}
