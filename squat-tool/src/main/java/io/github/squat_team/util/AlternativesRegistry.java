package io.github.squat_team.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;

public class AlternativesRegistry {
	private static AlternativesRegistry instance;
	private String fileName="alternativesRegistry.txt";
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private Hashtable<String, List<String>> fathers;
	
	
	private AlternativesRegistry() {
		try {
			fathers=new Hashtable<>();
			fileWriter = new FileWriter(fileName, false);
	        bufferedWriter =
	                new BufferedWriter(fileWriter);
	        bufferedWriter.write("BotName,QA,ResponseType,Value,ArchitecturalAlternative,Level,Generator,Negotiated,Utility,Father");
	        bufferedWriter.newLine();
	        bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void printAlternative(SillyBot bot, Proposal proposal,boolean agreement){
		
		try {
			String fileName=removePrefix(proposal.getArchitectureName());
			String messageToLog=bot.getName()+";"+bot.getKind()+";"+bot.getResponseType()
			+";"+proposal.getScenarioResponse()+";"+fileName+";"+proposal.getLevel()
			+";"+proposal.getLastModifiedBy()+";"+agreement+";"+bot.getUtilityFor(proposal)+";"+getFatherName(fileName);
			//System.out.println(messageToLog);
			bufferedWriter.write(messageToLog);
			bufferedWriter.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	

	private String getFatherName(String childName) {
		for(String fatherName : fathers.keySet()){
			if(fathers.get(fatherName).contains(childName))
				return fatherName;
		}
		return "null";
	}

	private String removePrefix(String architectureName) {
		return architectureName.replace("/Users/santiagovidal/git/kamp-test/squat-tool/models/cocomeWithResourceDemands/", "");
	}

	public void closeFile(){
		try {
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static AlternativesRegistry getInstace(){
		if(instance==null){
			instance=new AlternativesRegistry();
		}
		return instance;
	}

	public void saveAlternatives(List<SillyBot> sillyBots, List<Proposal> agreetmentsOfLevel,
			int currentLevelOfTransformations, Set<Proposal> seeds) {
		for (Iterator<SillyBot> iterator = sillyBots.iterator(); iterator.hasNext();) {
			SillyBot bot = (SillyBot) iterator.next();
			for(Iterator<Proposal> proposals=bot.getOrderedProposals().iterator(); proposals.hasNext();){
				Proposal proposal=proposals.next();
				printAlternative(bot, proposal, isAnAgreement(agreetmentsOfLevel,proposal));
			}
		}
		
	}
	
	private boolean isAnAgreement(List<Proposal> agreetmentsOfLevel,Proposal proposal){
		for (Proposal proposal2 : agreetmentsOfLevel) {
			if(proposal2.getArchitectureName().equals(proposal.getArchitectureName()))
				return true;
		}
		return false;
	}

	public void saveChildrensOfArchitecture(ArchitecturalVersion initialArchitecture, List<ArchitecturalVersion> ret) {
		String fathersName=initialArchitecture.getFileName();
		if(fathers.get(fathersName)==null){
			fathers.put(fathersName, new ArrayList<>());
		}
		List<String> children=fathers.get(fathersName);
		for (ArchitecturalVersion child : ret) {
			children.add(child.getFileName());
		}
	}
}
