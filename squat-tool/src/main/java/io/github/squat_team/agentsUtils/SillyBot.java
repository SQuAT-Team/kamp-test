package io.github.squat_team.agentsUtils;

import java.util.List;

public abstract class SillyBot {
	private List<Proposal> orderedProposals;
	public abstract void insertInOrder(Proposal p);
	public abstract Proposal makeConcession();
}
