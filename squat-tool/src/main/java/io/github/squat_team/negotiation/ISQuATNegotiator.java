package io.github.squat_team.negotiation;

import java.util.List;

import io.github.squat_team.agentsUtils.SillyBot;

/**
 * Searches for an agreement proposal and non-dominated alternatives. Use
 * {@link #initialize(List)} for every new level of search. {@link #negotiate()}
 * can be called multiple times in order to continue the search (e.g., if the
 * architect is not satisfied).
 */
public interface ISQuATNegotiator {

	/**
	 * Initializes the negotiator. This notifies the negotiator that a new level of
	 * search starts.
	 * 
	 * @param sillyBots
	 */
	public void initialize(List<SillyBot> sillyBots);

	/**
	 * The negotiator searches for an agreement proposal until it finds one or
	 * reaches a conflict. The initialization ({@link #initialize(List)}) must be
	 * called before, if a new level of search starts or the negotiation is used for
	 * the first time. Otherwise the call is interpreted as a redo request.
	 * 
	 * @return the result of the negotiation. Never null.
	 */
	public NegotiatorResult negotiate(boolean redo);
}
