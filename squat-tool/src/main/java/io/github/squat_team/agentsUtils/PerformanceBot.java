package io.github.squat_team.agentsUtils;

public class PerformanceBot extends SillyBot {
	private float originalResponseTime;

	public PerformanceBot(float originalResponseTime) {
		super();
		this.originalResponseTime = originalResponseTime;
	}

	@Override
	public void insertInOrder(Proposal p) {
		PerformanceProposal currentProposal = (PerformanceProposal) p;
		if (orderedProposals.size() == 0) {
			orderedProposals.add(currentProposal);
		} else if (((PerformanceProposal) orderedProposals.get(0)).getResponseTime() > currentProposal
				.getResponseTime()) {
			orderedProposals.add(0, currentProposal);
		} else if (((PerformanceProposal) orderedProposals.get(orderedProposals.size() - 1))
				.getResponseTime() < currentProposal.getResponseTime()) {
			orderedProposals.add(currentProposal);
		} else {
			int i = 0;
			while (((PerformanceProposal) orderedProposals.get(i)).getResponseTime() < currentProposal
					.getResponseTime()) {
				i++;
			}
			orderedProposals.add(i, currentProposal);
		}
	}

	@Override
	public Proposal makeConcession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean makeImprovement(Proposal proposal) {
		return ((PerformanceProposal)proposal).getResponseTime()<=originalResponseTime;
	}

}
