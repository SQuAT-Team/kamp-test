package io.github.squat_team.agentsUtils;

import org.palladiosimulator.pcm.repository.Repository;

import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.util.SQuATHelper;

public class BotModelLoading implements Runnable {
	private String fullPathToAlternativeRepository;
	private PCMArchitectureInstance architecture;

	public BotModelLoading(String fullPathToAlternativeRepository, PCMArchitectureInstance architecture) {
		this.fullPathToAlternativeRepository = fullPathToAlternativeRepository;
		this.architecture = architecture;
	}

	@Override
	public void run() {
		Repository repositoryAlternatives = SQuATHelper.loadRepositoryModel("file:/" + fullPathToAlternativeRepository);
		architecture.setRepositoryWithAlternatives(repositoryAlternatives);
	}

}
