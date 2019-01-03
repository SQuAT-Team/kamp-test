package io.github.squat_team.export;

import io.github.squat_team.negotiation.NegotiatorResult;

/**
 * Standard interface for different export formats/streams for the SQuAT
 * results. Exporters should only be called by an {@link IExportController}.
 */
public interface IExporter {

	/**
	 * Notifies the exporter that results of a completely finished level of search
	 * are available.
	 * 
	 * @param result
	 *            the results after the negotiation.
	 */
	public void handleLevelTerminated(NegotiatorResult result);

	/**
	 * Notifies the exporter that the negotiation provided results, but the level
	 * might not be finished, e.g., retry is still possible.
	 * 
	 * @param result
	 *            the results after the negotiation.
	 */
	public void handleIntermediateResult(NegotiatorResult result);

	/**
	 * Notifies the exporter that the current state during negotiation should be
	 * exported. The negotiation is not finished yet.
	 * 
	 * @param state
	 *            the intermediate results of the negotiation.
	 */
	public void handleIntermediateState(NegotiatorResult state);
}
