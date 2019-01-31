package io.github.squat_team.negotiation;

import io.github.squat_team.export.ExportController;

public class SQuATSillyBotsNegotiatorFactory implements ISQuATNegotiatorFactory{
		
	public SQuATSillyBotsNegotiatorFactory() {
	}
	
	@Override
	public ISQuATNegotiator getNegotiator(ExportController exportController) {
		return new SQuATSillyBotsNegotiator(exportController);
	}

}
