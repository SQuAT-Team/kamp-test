package io.github.squat_team.export;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.squat_team.vis.connector.ProjectConnector;
import org.squat_team.vis.connector.data.CArchitecture;
import org.squat_team.vis.connector.data.CCandidate;
import org.squat_team.vis.connector.data.CGoal;
import org.squat_team.vis.connector.data.CLevel;
import org.squat_team.vis.connector.data.CProject;
import org.squat_team.vis.connector.data.CRange;
import org.squat_team.vis.connector.data.CToolConfiguration;
import org.squat_team.vis.connector.data.DefaultToolConfigurations;
import org.squat_team.vis.connector.exceptions.ConnectionFailure;
import org.squat_team.vis.connector.exceptions.InvalidRequestException;
import org.squat_team.vis.connector.exceptions.ProtocolFailure;
import org.squat_team.vis.connector.protocols.NewLevelClientProtocol;
import org.squat_team.vis.connector.protocols.NewProjectClientProtocol;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.algorithm.util.ArchitectureBuilder;
import io.github.squat_team.experiments.IExperiment;
import io.github.squat_team.util.AlternativesRegistry;

public class SquatVisProtocolImplementation {
	private ProjectConnector projectConnector;
	private int levelNumber = 0;
	private long candidateId = 0;
	private Map<String, CCandidate> fatherCandidates = new HashMap<>();
	private Map<String, CCandidate> levelCandidates = new HashMap<>();

	private long getCandidateId() {
		return candidateId++;
	}

	public void runNewProjectClientProtocol(IExperiment experiment)
			throws ConnectionFailure, ProtocolFailure, InvalidRequestException {
		CProject project = new CProject("SQuAT Project");
		CToolConfiguration configuration = DefaultToolConfigurations.getInstance().getSquatDefaultConfiguration();
		CGoal goal = transformToGoals(experiment.getBots());
		NewProjectClientProtocol newProjectClientProtocol = new NewProjectClientProtocol(project, configuration, goal);
		projectConnector = newProjectClientProtocol.call();
	}

	public void runNewLevelProtocol(List<SillyBot> bots, List<Proposal> agreementProposals)
			throws ConnectionFailure, ProtocolFailure, InvalidRequestException {
		if (projectConnector == null) {
			return;
		}

		boolean noResponse = (levelNumber == 0);
		CLevel level = new CLevel();
		level.setLevelNumber(levelNumber);
		level.setCandidates(transformToCandidate(bots, agreementProposals));

		NewLevelClientProtocol newLevelClientProtocol = new NewLevelClientProtocol(level, projectConnector, noResponse);
		newLevelClientProtocol.call();

		fatherCandidates = levelCandidates;
		levelCandidates = new HashMap<>();
		levelNumber++;
	}
	
	private void storeParentCandidates() {
		AlternativesRegistry alternativesRegistry = AlternativesRegistry.getInstace();
		for(Entry<String, CCandidate> candidate : levelCandidates.entrySet()) {
			String name = alternativesRegistry.removePrefix(candidate.getKey());
			// TODO:
			// candidate.getValue().getCandidateId()
			// candidate.getKey().
		}
	}

	private CArchitecture tranformToArchitecture(ArchitecturalVersion architecturalVersion) {
		String archtiecturePath = architecturalVersion.getAbsolutePath();
		CArchitecture architecture = new CArchitecture();
		architecture.setRepository(
				new File(archtiecturePath + File.separator + architecturalVersion.getRepositoryFilename()));
		architecture.setAllocation(
				new File(archtiecturePath + File.separator + architecturalVersion.getAllocationFilename()));
		architecture.setResourceenvironment(
				new File(archtiecturePath + File.separator + architecturalVersion.getResourceEnvironmentFilename()));
		architecture.setSystem(new File(archtiecturePath + File.separator + architecturalVersion.getSystemFilename()));
		architecture.setUsage(new File(archtiecturePath + File.separator + architecturalVersion.getUsageFilename()));
		return architecture;
	}

	private boolean isSuggested(Proposal proposal, List<Proposal> agreementProposals) {
		return agreementProposals.contains(proposal);
	}

	private List<Double> createListOfLength(int length, Double value) {
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			list.add(value);
		}
		return list;
	}
	
	private String getFatherName(Proposal proposal) {
		AlternativesRegistry alternativesRegistry = AlternativesRegistry.getInstace();
		String fatherName = alternativesRegistry.getFatherName(alternativesRegistry.removePrefix(proposal.getArchitectureName()));
		if(fatherName.equals("null")) {
			return "";
		}
		return fatherName;
	}

	private List<CCandidate> transformToCandidate(List<SillyBot> bots, List<Proposal> agreementProposals) {
		List<CCandidate> candidates = new ArrayList<>();
		for (SillyBot bot : bots) {
			int valueIndex = bots.indexOf(bot);
			for (Proposal proposal : bot.getOrderedProposals()) {
				String architectureName = proposal.getArchitectureName();
				CCandidate cashedCandidate = levelCandidates.get(architectureName);
				if (cashedCandidate == null) {
					cashedCandidate = new CCandidate();
					cashedCandidate.setCandidateId(getCandidateId());
					cashedCandidate.setArchitecture(tranformToArchitecture(proposal.getArchitecture()));
					cashedCandidate.setSuggested(isSuggested(proposal, agreementProposals));
					cashedCandidate.setRealValues(createListOfLength(bots.size(), Double.MAX_VALUE));
					cashedCandidate.setUtilityValues(createListOfLength(bots.size(), 0d));
					// TODO:
					// cashedCandidate.setParentId();getFatherName(proposal);
					levelCandidates.put(architectureName, cashedCandidate);
				}
				double realValue = proposal.getScenarioResponse();
				double utilityValue = bot.getUtilityFor(proposal);
				cashedCandidate.getRealValues().set(valueIndex, realValue);
				cashedCandidate.getUtilityValues().set(valueIndex, utilityValue);
			}
		}
		return candidates;
	}

	private CGoal transformToGoals(List<AbstractPCMBot> bots) {
		// add qa level
		CGoal goal = new CGoal();
		goal.setName("Root");

		for (AbstractPCMBot bot : bots) {
			CGoal qualityGoal = goal.addChild();
			qualityGoal.setName(bot.getName());

			// set expected Value
			Double expectedResponse = null;
			Comparable expectedResponseRaw = bot.getScenario().getExpectedResult().getResponse();
			if (expectedResponseRaw instanceof Double) {
				expectedResponse = (Double) bot.getScenario().getExpectedResult().getResponse();
			}
			if (expectedResponseRaw instanceof Float) {
				expectedResponse = ((Float) bot.getScenario().getExpectedResult().getResponse()).doubleValue();
			}
			if (expectedResponseRaw instanceof Integer) {
				expectedResponse = ((Integer) bot.getScenario().getExpectedResult().getResponse()).doubleValue();
			}
			if (expectedResponse != null) {
				qualityGoal.setExpectedResponse(expectedResponse);
			}

			// set range
			qualityGoal.setRange(new CRange());
		}

		return goal;
	}

}
