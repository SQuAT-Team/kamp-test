package io.github.squat_team.negotiation;

import io.github.squat_team.export.ExportController;

public interface ISQuATNegotiatorFactory {

	public ISQuATNegotiator getNegotiator(ExportController exportController);

}
