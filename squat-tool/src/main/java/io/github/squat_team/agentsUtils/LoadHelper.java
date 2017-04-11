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
		ModifiabilityBot m1Bot=new ModifiabilityBot(3, 115,"m1");
		ModifiabilityBot m2Bot=new ModifiabilityBot(5, 190.5f,"m2");
		PerformanceBot p1Bot=new PerformanceBot(111.7639f,"p1");
		PerformanceBot p2Bot=new PerformanceBot(74.0173f,"p2");
		
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 111.0f, "stplus-0-Payment System"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-0-IExporter"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-1-ITripDB"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-2-IExternalPayment"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-3-IEmployeePayment"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-4-IBooking"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-5-IBusiness Trip"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 111.0f, "stplus-split-0-IExporter"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 111.0f, "stplus-split-1-ITripDB"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 110.5f, "stplus-split-2-IExternalPayment"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 111.0f, "stplus-split-3-IEmployeePayment"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 111.0f, "stplus-split-4-IBooking"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 111.0f, "stplus-split-5-IBusiness Trip"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps1-258"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps1-281"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-ps1-338"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps1-340"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps1-397"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-ps1-404"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps1-436"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps1-444"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps1-494"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps1-64"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps2-209"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-ps2-22"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-ps2-325"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps2-330"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-ps2-358"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-ps2-366"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-ps2-416"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps2-476"));
		m1Bot.insertInOrder(new ModifiabilityProposal(4, 123.0f, "stplus-ps2-479"));
		m1Bot.insertInOrder(new ModifiabilityProposal(3, 115.0f, "stplus-ps2-480"));

		
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-0-Payment System"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-0-IExporter"));
		m2Bot.insertInOrder(new ModifiabilityProposal(4, 110.5f, "stplus-1-ITripDB"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-2-IExternalPayment"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-3-IEmployeePayment"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-4-IBooking"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-5-IBusiness Trip"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-split-0-IExporter"));
		m2Bot.insertInOrder(new ModifiabilityProposal(4, 110.5f, "stplus-split-1-ITripDB"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-split-2-IExternalPayment"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-split-3-IEmployeePayment"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-split-4-IBooking"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-split-5-IBusiness Trip"));
		m2Bot.insertInOrder(new ModifiabilityProposal(6, 251.0f, "stplus-ps1-258"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps1-281"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps1-338"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps1-340"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps1-397"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps1-404"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps1-436"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps1-444"));
		m2Bot.insertInOrder(new ModifiabilityProposal(6, 251.0f, "stplus-ps1-494"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps1-64"));
		m2Bot.insertInOrder(new ModifiabilityProposal(6, 231.0f, "stplus-ps2-209"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps2-22"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps2-325"));
		m2Bot.insertInOrder(new ModifiabilityProposal(6, 251.0f, "stplus-ps2-330"));
		m2Bot.insertInOrder(new ModifiabilityProposal(6, 231.0f, "stplus-ps2-358"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps2-366"));
		m2Bot.insertInOrder(new ModifiabilityProposal(6, 251.0f, "stplus-ps2-416"));
		m2Bot.insertInOrder(new ModifiabilityProposal(6, 251.0f, "stplus-ps2-476"));
		m2Bot.insertInOrder(new ModifiabilityProposal(7, 291.5f, "stplus-ps2-479"));
		m2Bot.insertInOrder(new ModifiabilityProposal(5, 190.5f, "stplus-ps2-480"));

		p1Bot.insertInOrder(new PerformanceProposal(111.7639f, "stplus-0-Payment System"));
		p1Bot.insertInOrder(new PerformanceProposal(152.77259999999998f, "stplus-0-IExporter"));
		p1Bot.insertInOrder(new PerformanceProposal(112.94460000000001f, "stplus-1-ITripDB"));
		p1Bot.insertInOrder(new PerformanceProposal(119.5708f, "stplus-2-IExternalPayment"));
		p1Bot.insertInOrder(new PerformanceProposal(112.6332f, "stplus-3-IEmployeePayment"));
		p1Bot.insertInOrder(new PerformanceProposal(132.47140000000002f, "stplus-4-IBooking"));
		p1Bot.insertInOrder(new PerformanceProposal(111.7639f, "stplus-5-IBusiness Trip"));
		p1Bot.insertInOrder(new PerformanceProposal(152.77259999999998f, "stplus-split-0-IExporter"));
		p1Bot.insertInOrder(new PerformanceProposal(112.94460000000001f, "stplus-split-1-ITripDB"));
		p1Bot.insertInOrder(new PerformanceProposal(119.5708f, "stplus-split-2-IExternalPayment"));
		p1Bot.insertInOrder(new PerformanceProposal(112.6332f, "stplus-split-3-IEmployeePayment"));
		p1Bot.insertInOrder(new PerformanceProposal(132.47140000000002f, "stplus-split-4-IBooking"));
		p1Bot.insertInOrder(new PerformanceProposal(111.7639f, "stplus-split-5-IBusiness Trip"));
		p1Bot.insertInOrder(new PerformanceProposal(10.83839f, "stplus-ps1-258"));
		p1Bot.insertInOrder(new PerformanceProposal(10.25568f, "stplus-ps1-281"));
		p1Bot.insertInOrder(new PerformanceProposal(12.312850000000001f, "stplus-ps1-338"));
		p1Bot.insertInOrder(new PerformanceProposal(13.67052f, "stplus-ps1-340"));
		p1Bot.insertInOrder(new PerformanceProposal(13.10291f, "stplus-ps1-397"));
		p1Bot.insertInOrder(new PerformanceProposal(14.126349999999999f, "stplus-ps1-404"));
		p1Bot.insertInOrder(new PerformanceProposal(8.29862f, "stplus-ps1-436"));
		p1Bot.insertInOrder(new PerformanceProposal(12.59697f, "stplus-ps1-444"));
		p1Bot.insertInOrder(new PerformanceProposal(10.77821f, "stplus-ps1-494"));
		p1Bot.insertInOrder(new PerformanceProposal(11.51662f, "stplus-ps1-64"));
		p1Bot.insertInOrder(new PerformanceProposal(14.51197f, "stplus-ps2-209"));
		p1Bot.insertInOrder(new PerformanceProposal(20.55931f, "stplus-ps2-22"));
		p1Bot.insertInOrder(new PerformanceProposal(26.76549f, "stplus-ps2-325"));
		p1Bot.insertInOrder(new PerformanceProposal(26.021819999999998f, "stplus-ps2-330"));
		p1Bot.insertInOrder(new PerformanceProposal(21.51209f, "stplus-ps2-358"));
		p1Bot.insertInOrder(new PerformanceProposal(21.00345f, "stplus-ps2-366"));
		p1Bot.insertInOrder(new PerformanceProposal(12.170570000000001f, "stplus-ps2-416"));
		p1Bot.insertInOrder(new PerformanceProposal(28.2282f, "stplus-ps2-476"));
		p1Bot.insertInOrder(new PerformanceProposal(18.98772f, "stplus-ps2-479"));
		p1Bot.insertInOrder(new PerformanceProposal(19.53763f, "stplus-ps2-480"));


		
		p2Bot.insertInOrder(new PerformanceProposal(74.0173f, "stplus-0-Payment System"));
		p2Bot.insertInOrder(new PerformanceProposal(1289.96f, "stplus-0-IExporter"));
		p2Bot.insertInOrder(new PerformanceProposal(115.82230000000001f, "stplus-1-ITripDB"));
		p2Bot.insertInOrder(new PerformanceProposal(78.7857f, "stplus-2-IExternalPayment"));
		p2Bot.insertInOrder(new PerformanceProposal(148.847f, "stplus-3-IEmployeePayment"));
		p2Bot.insertInOrder(new PerformanceProposal(82.4342f, "stplus-4-IBooking"));
		p2Bot.insertInOrder(new PerformanceProposal(74.0173f, "stplus-5-IBusiness Trip"));
		p2Bot.insertInOrder(new PerformanceProposal(74.0173f, "stplus-split-0-IExporter"));
		p2Bot.insertInOrder(new PerformanceProposal(115.82230000000001f, "stplus-split-1-ITripDB"));
		p2Bot.insertInOrder(new PerformanceProposal(78.7857f, "stplus-split-2-IExternalPayment"));
		p2Bot.insertInOrder(new PerformanceProposal(148.847f, "stplus-split-3-IEmployeePayment"));
		p2Bot.insertInOrder(new PerformanceProposal(82.4342f, "stplus-split-4-IBooking"));
		p2Bot.insertInOrder(new PerformanceProposal(74.0173f, "stplus-split-5-IBusiness Trip"));
		p2Bot.insertInOrder(new PerformanceProposal(16.94575f, "stplus-ps1-258"));
		p2Bot.insertInOrder(new PerformanceProposal(999999999f, "stplus-ps1-281"));
		p2Bot.insertInOrder(new PerformanceProposal(29.7949f, "stplus-ps1-338"));
		p2Bot.insertInOrder(new PerformanceProposal(17.64059f, "stplus-ps1-340"));
		p2Bot.insertInOrder(new PerformanceProposal(999999999f, "stplus-ps1-397"));
		p2Bot.insertInOrder(new PerformanceProposal(31.0628f, "stplus-ps1-404"));
		p2Bot.insertInOrder(new PerformanceProposal(1240.1419999999998f, "stplus-ps1-436"));
		p2Bot.insertInOrder(new PerformanceProposal(999999999f, "stplus-ps1-444"));
		p2Bot.insertInOrder(new PerformanceProposal(9.77246f, "stplus-ps1-494"));
		p2Bot.insertInOrder(new PerformanceProposal(89.18619999999999f, "stplus-ps1-64"));
		p2Bot.insertInOrder(new PerformanceProposal(26.2866f, "stplus-ps2-209"));
		p2Bot.insertInOrder(new PerformanceProposal(25.7885f, "stplus-ps2-22"));
		p2Bot.insertInOrder(new PerformanceProposal(25.16403f, "stplus-ps2-325"));
		p2Bot.insertInOrder(new PerformanceProposal(26.9824f, "stplus-ps2-330"));
		p2Bot.insertInOrder(new PerformanceProposal(26.2043f, "stplus-ps2-358"));
		p2Bot.insertInOrder(new PerformanceProposal(22.348979999999997f, "stplus-ps2-366"));
		p2Bot.insertInOrder(new PerformanceProposal(16.59996f, "stplus-ps2-416"));
		p2Bot.insertInOrder(new PerformanceProposal(26.82446f, "stplus-ps2-476"));
		p2Bot.insertInOrder(new PerformanceProposal(26.341700000000003f, "stplus-ps2-479"));
		p2Bot.insertInOrder(new PerformanceProposal(23.42628f, "stplus-ps2-480"));

		
		
		List<SillyBot> ret=new ArrayList<>();
		ret.add(m1Bot);
		ret.add(m2Bot);
		ret.add(p1Bot);
		ret.add(p2Bot);
		return ret;
	}
	/*Data for first version of the paper
	 * public List<SillyBot> loadBotsWithInformation() {
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
	}*/
}
