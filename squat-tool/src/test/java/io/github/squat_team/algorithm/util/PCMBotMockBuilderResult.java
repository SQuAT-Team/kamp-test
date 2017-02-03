package io.github.squat_team.algorithm.util;

import io.github.squat_team.AbstractPCMBot;

/**
 * Result of a {@link PCMBotMockBuilder}. Contains the generated (mocked) bot
 * and the properties, which were used to generate the bot.
 */
public class PCMBotMockBuilderResult {
	private final PCMBotMockProperties properties;
	private final AbstractPCMBot bot;

	public PCMBotMockBuilderResult(PCMBotMockProperties properties, AbstractPCMBot bot) {
		super();
		this.properties = properties;
		this.bot = bot;
	}

	public PCMBotMockProperties getProperties() {
		return properties;
	}

	public AbstractPCMBot getBot() {
		return bot;
	}

}
