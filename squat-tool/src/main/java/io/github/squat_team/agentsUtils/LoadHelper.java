package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.List;

import io.github.squat_team.model.PCMArchitectureInstance;

public class LoadHelper {
	public List<PCMArchitectureInstance> loadArchitecturalAlternatives() {
		List<PCMArchitectureInstance> ret= new ArrayList<>();
		
		
		
		return ret;
	}

	public List<SillyBot> loadBotsWithInformation() {
		ModifiabilityBot m1Bot=new ModifiabilityBot(4,123,"m1");
		ModifiabilityBot m2Bot=new ModifiabilityBot(8,352,"m2");
		PerformanceBot p1Bot=new PerformanceBot(111.76f,"p1");
		PerformanceBot p2Bot=new PerformanceBot(74.02f,"p2");
		
		//I have to add Sebastians architectures
		
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 118.5f, "SR-PS"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123f, "SRW-IE"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123f, "SRW-IT"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115f, "SRW-IEP"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123f, "SRW-IEmP"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123f, "SRW-IB"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123f, "SRW-IBT"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 118.5f, "W-IE"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 118.5f, "W-IT"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 110.5f, "W-IEP"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 118.5f, "W-IEmP"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 118.5f, "W-IB"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 118.5f, "W-IBT"));
		
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "SR-PS"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "SRW-IE"));
		m2Bot.insertInOrder(new ModifiabilityProposal(6, 231.5f, "SRW-IT"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "SRW-IEP"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "SRW-IEmP"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "SRW-IB"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "SRW-IBT"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "W-IE"));
		m2Bot.insertInOrder(new ModifiabilityProposal(6, 231.5f, "W-IT"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "W-IEP"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "W-IEmP"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "W-IB"));
		m2Bot.insertInOrder(new ModifiabilityProposal(8, 352f, "W-IBT"));
		
		p1Bot.insertInOrder(new PerformanceProposal(111.76f, "SR-PS"));
		p1Bot.insertInOrder(new PerformanceProposal(152.77f, "SRW-IE"));
		p1Bot.insertInOrder(new PerformanceProposal(112.94f, "SRW-IT"));
		p1Bot.insertInOrder(new PerformanceProposal(119.57f, "SRW-IEP"));
		p1Bot.insertInOrder(new PerformanceProposal(112.63f, "SRW-IEmP"));
		p1Bot.insertInOrder(new PerformanceProposal(132.47f, "SRW-IB"));
		p1Bot.insertInOrder(new PerformanceProposal(111.76f, "SRW-IBT"));
		p1Bot.insertInOrder(new PerformanceProposal(152.77f, "W-IE"));
		p1Bot.insertInOrder(new PerformanceProposal(112.94f, "W-IT"));
		p1Bot.insertInOrder(new PerformanceProposal(119.57f, "W-IEP"));
		p1Bot.insertInOrder(new PerformanceProposal(112.63f, "W-IEmP"));
		p1Bot.insertInOrder(new PerformanceProposal(132.47f, "W-IB"));
		p1Bot.insertInOrder(new PerformanceProposal(111.76f, "W-IBT"));
		
		p2Bot.insertInOrder(new PerformanceProposal(74.02f, "SR-PS"));
		p2Bot.insertInOrder(new PerformanceProposal(84.51f, "SRW-IE"));
		p2Bot.insertInOrder(new PerformanceProposal(115.82f, "SRW-IT"));
		p2Bot.insertInOrder(new PerformanceProposal(78.78f, "SRW-IEP"));
		p2Bot.insertInOrder(new PerformanceProposal(74.74f, "SRW-IEmP"));
		p2Bot.insertInOrder(new PerformanceProposal(82.43f, "SRW-IB"));
		p2Bot.insertInOrder(new PerformanceProposal(74.02f, "SRW-IBT"));
		p2Bot.insertInOrder(new PerformanceProposal(84.51f, "W-IE"));
		p2Bot.insertInOrder(new PerformanceProposal(115.82f, "W-IT"));
		p2Bot.insertInOrder(new PerformanceProposal(78.78f, "W-IEP"));
		p2Bot.insertInOrder(new PerformanceProposal(74.74f, "W-IEmP"));
		p2Bot.insertInOrder(new PerformanceProposal(82.43f, "W-IB"));
		p2Bot.insertInOrder(new PerformanceProposal(74.02f, "W-IBT"));
		
		
		List<SillyBot> ret=new ArrayList<>();
		ret.add(m1Bot);
		ret.add(m2Bot);
		ret.add(p1Bot);
		ret.add(p2Bot);
		return ret;
	}
}
