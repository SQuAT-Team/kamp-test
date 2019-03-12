package io.github.squat_team.experiments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.squat_team.AbstractPCMBot;

public abstract class AbstractExperiment implements IExperiment {
	private Map<String, List<AbstractPCMBot>> bots = new HashMap<>();

	public AbstractExperiment() {
		setBots(getBots());
	}

	public List<AbstractPCMBot> botWith(String qualityAttribute) {
		return this.bots.get(qualityAttribute);
	}

	public Set<String> getUsedQualityAttributes() {
		return bots.keySet();
	}

	private void setBots(List<AbstractPCMBot> bots) {
		for (AbstractPCMBot bot : bots) {
			String qualityAttribute = bot.getQualityAttribute();
			List<AbstractPCMBot> botForQualityAttribute;
			if (this.bots.containsKey(qualityAttribute)) {
				botForQualityAttribute = this.bots.get(qualityAttribute);
			} else {
				botForQualityAttribute = new ArrayList<>();
				this.bots.put(qualityAttribute, botForQualityAttribute);
			}
			botForQualityAttribute.add(bot);
		}
	}

}
