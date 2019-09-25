package io.github.squat_team.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.Instant;

public class TimeMeasurement {
	private static TimeMeasurement instance;
	private String fileName="timeMeasurement.txt";
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private Instant start;
	
	private TimeMeasurement() {
		try {
			fileWriter = new FileWriter(fileName, false);
	        bufferedWriter =
	                new BufferedWriter(fileWriter);
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printStart(String message){
		start = Instant.now();
		try {
			String messageToLog="Starting "+message + " at "+start;
			bufferedWriter.write(messageToLog);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	public void printFinish(String message){
		Instant finish = Instant.now();
		try {
			String messageToLog="Finishing "+message + " at "+finish+". Total time: "+Duration.between(start, finish).toMillis();
			System.out.println(messageToLog);
			bufferedWriter.write(messageToLog);
			bufferedWriter.newLine();
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
	
	public static TimeMeasurement getInstace(){
		if(instance==null){
			instance=new TimeMeasurement();
		}
		return instance;
	}
}
