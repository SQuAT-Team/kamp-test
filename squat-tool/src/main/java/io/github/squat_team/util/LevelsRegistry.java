package io.github.squat_team.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;

public class LevelsRegistry {
	private static LevelsRegistry instance;
	private String fileName="levelsInformation.txt";
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	
	
	private LevelsRegistry() {
		try {
			fileWriter = new FileWriter(fileName, false);
	        bufferedWriter =
	                new BufferedWriter(fileWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public static LevelsRegistry getInstace(){
		if(instance==null){
			instance=new LevelsRegistry();
		}
		return instance;
	}

	public void logInformationNewLine(String messageToLog){
			try {
				bufferedWriter.write(messageToLog);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void logInformation(String messageToLog){
		try {
			bufferedWriter.write(messageToLog);
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
