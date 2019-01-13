package io.github.squat_team.negotiation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;

/**
 * The result provided by an {@link ISQuATNegotiator}. A result is provided
 * after every level of search.
 */
public class NegotiatorResult {
	private boolean successful;
	private Proposal agreementProposal;
	private List<Proposal> nonDominatedAlternatives = new ArrayList<>();
	private List<SillyBot> sillyBots;
	private HashMap<SillyBot, Proposal> proposals;

	/**
	 * Initiates a new negotiator result. This should be done once after each level
	 * of search.
	 * 
	 * @param successful
	 *            whether the negotiation terminated successfully. It does not, if
	 *            there is a conflict.
	 */
	public NegotiatorResult(boolean successful) {
		super();
		this.successful = successful;
	}

	/**
	 * States whether the negotiation terminated successfully.
	 * 
	 * @return true if successful, false if not.
	 */
	public boolean isSuccessful() {
		return successful;
	}

	/**
	 * Returns the bots that were used in the negotiation. This list and its content
	 * should not be changed as it could be used in the next level by the
	 * negotiator.
	 * 
	 * @return the bots from the negotiation.
	 */
	public List<SillyBot> getSillyBots() {
		return sillyBots;
	}

	public void setSillyBots(List<SillyBot> sillyBots) {
		this.sillyBots = sillyBots;
	}

	/**
	 * Returns the current proposals of the bots at the end of the negotiation. This
	 * map and its content should not be changed as it could be used in the next
	 * level by the negotiator.
	 * 
	 * @return the final proposals in the negotiation.
	 */
	public HashMap<SillyBot, Proposal> getProposals() {
		return proposals;
	}

	public void setProposals(HashMap<SillyBot, Proposal> proposals) {
		this.proposals = proposals;
	}

	/**
	 * The proposal the bots agreed on. Might only be available, if successfully
	 * terminated (see {@link #isSuccessful()}}).
	 * 
	 * @return the agreement proposal of this level.
	 */
	public Proposal getAgreementProposal() {
		return agreementProposal;
	}

	public void setAgreementProposal(Proposal agreementProposal) {
		this.agreementProposal = agreementProposal;
	}

	/**
	 * The non-dominated alternatives found in this level of search. Might only be
	 * available, if successfully terminated (see {@link #isSuccessful()}}).
	 * 
	 * @return the non-dominated alternatives of this level.
	 */
	public List<Proposal> getNonDominatedAlternatives() {
		return nonDominatedAlternatives;
	}

	public void setNonDominatedAlternatives(List<Proposal> nonDominatedAlternatives) {
		this.nonDominatedAlternatives = nonDominatedAlternatives;
	}

}
