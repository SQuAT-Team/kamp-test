package io.github.squat_team.agentsUtils.transformations;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.runner.SQuATConfiguration;

public class ArchitecturalTransformationsFactory {

	/** the initial architecture */
	private ArchitecturalVersion initialArchitecture;

	/** List of scenarios */
	private Hashtable<Integer, List<ArchitecturalVersion>> architecturesByLevel;

	private Map<String, QualityAttributeTransformationFactory> transformationFactories = new HashMap<>();

	private List<String> qualityAttributes;

	public ArchitecturalTransformationsFactory(SQuATConfiguration configuration,
			ArchitecturalVersion initialArchitecture) {
		this.initialArchitecture = initialArchitecture;
		this.architecturesByLevel = new Hashtable<>();
		this.qualityAttributes = configuration.getExperiment().getOrderedQualityAttributes();

		for (String qualityAttribute : configuration.getExperiment().getOrderedQualityAttributes()) {
			transformationFactories.put(qualityAttribute,
					new QualityAttributeTransformationFactory(configuration, qualityAttribute));
		}
	}

	public QualityAttributeTransformationFactory findTransformationFactory(AbstractPCMBot bot) {
		String qualityAttribute = bot.getQualityAttribute();
		return transformationFactories.get(qualityAttribute);
	}

	public List<ArchitecturalVersion> getArchitecturalTransformationsUntilLevel(int level) {
		if (architecturesByLevel.get(level) == null) {
			createArchitecturalTransformationsForLevel(level);
		}

		// The results is the architectures created for this level plus the
		// architectures created for previous levels
		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();
		for (int i = 1; i <= level; i++) {
			ret.addAll(architecturesByLevel.get(i));
		}
		return ret;
	}

	private void createArchitecturalTransformationsForLevel(int level) {
		// if already exists, exit doing nothing
		if (this.architecturesByLevel.containsKey(level)) {
			return;
		}

		// Create the list and add to map
		final List<ArchitecturalVersion> results = new ArrayList<>();
		this.architecturesByLevel.put(level, results);

		// If we need to create the first level, we have to start with the initial
		// architecture
		List<ArchitecturalVersion> transformationForLevel = new ArrayList<ArchitecturalVersion>();
		architecturesByLevel.put(level, transformationForLevel);
		if (level == 1) {
			// Applied transformations to initial architecture and save it on the hashtable
			for (String qualityAttribute : qualityAttributes) {
				QualityAttributeTransformationFactory factory = transformationFactories.get(qualityAttribute);
				transformationForLevel
						.addAll(factory.generateArchitecturalVersionsUsingTransformations(initialArchitecture));
			}
		} else {
			List<ArchitecturalVersion> architecturesPreviousLevel = architecturesByLevel.get(level - 1);
			int i = 0;
			for (ArchitecturalVersion architecturalVersion : architecturesPreviousLevel) {
				System.out.println("*********PREVIOUS LEVEL ARCHITECTURES " + i + "/"
						+ architecturesPreviousLevel.size() + "*********************************************");
				i++;
				// if the architecture was modified last time by performance now is going to be
				// modified for modifiability.
				for (Map.Entry<String, QualityAttributeTransformationFactory> qualityAttributeAndFactory : transformationFactories
						.entrySet()) {
					if (!architecturalVersion.wasLastModifiedBy(qualityAttributeAndFactory.getKey())) {
						transformationForLevel.addAll(qualityAttributeAndFactory.getValue()
								.generateArchitecturalVersionsUsingTransformations(architecturalVersion));
					}
				}
			}
		}
	}

	public void replaceTransformationsForLevel(int level, Set<Proposal> proposalsForNextRound) {
		List<ArchitecturalVersion> fullList = architecturesByLevel.get(level);
		Set<ArchitecturalVersion> newList = new HashSet<>();
		for (Proposal p : proposalsForNextRound) {
			ArchitecturalVersion av = findArchitecturalVersionByName(fullList, p.getArchitectureName());
			if (av != null)
				newList.add(av);
		}
		List<ArchitecturalVersion> reducedList = new ArrayList<ArchitecturalVersion>();
		reducedList.addAll(newList);

		architecturesByLevel.put(level, reducedList);
	}

	private ArchitecturalVersion findArchitecturalVersionByName(List<ArchitecturalVersion> fullList,
			String architectureName) {
		for (ArchitecturalVersion architecturalVersion : fullList) {
			if (architecturalVersion.getName().equals(architectureName)) {
				return architecturalVersion;
			}
		}
		return null;
	}

	public List<ArchitecturalVersion> transformationsForLevel(int level) {
		return architecturesByLevel.get(level);
	}

	public ArchitecturalVersion getInitialArchitecture() {
		return initialArchitecture;
	}

	public void preLoadModelsFrom(String path, int level) {
		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();
		List<String> fileNames = getFilesNames(path);
		for (String fileName : fileNames) {
			String lastModifiedBy;
			if (fileName.startsWith("c"))
				lastModifiedBy = AbstractPCMBot.QA_MODIFIABILITY;
			else
				lastModifiedBy = AbstractPCMBot.QA_PERFORMANCE;

			ArchitecturalVersion av = new ArchitecturalVersion(fileName, path, lastModifiedBy);
			String alternativePath = path + "/";
			if (lastModifiedBy.equals(AbstractPCMBot.QA_MODIFIABILITY))
				alternativePath = alternativePath + "alternative" + fileName + ".repository";
			else
				alternativePath = alternativePath + fileName + "alternative.repository";
			av.setFullPathToAlternativeRepository(alternativePath);
			if (lastModifiedBy.equals(AbstractPCMBot.QA_MODIFIABILITY))
				ret.add(av);
		}
		architecturesByLevel.put(level, ret);
	}

	private List<String> getFilesNames(String path) {
		File dir = new File(path);
		File[] files = dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".allocation");
			}
		});
		List<String> names = new ArrayList<>();
		for (File allocationFile : files) {
			names.add(allocationFile.getName().substring(0, allocationFile.getName().lastIndexOf(".")));
		}
		names.remove(initialArchitecture.getFileName());

		return names;
	}
}
