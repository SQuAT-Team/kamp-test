package edu.squat.transformations.modifiability.tests;

import edu.squat.transformations.modifiability.PCMTransformerRunner;
import edu.squat.transformations.modifiability.insinter.InsInterRunner;
import edu.squat.transformations.modifiability.splitrespn.SplitRespNRunner;
import edu.squat.transformations.modifiability.wrapper.WrapperRunner;

public class TesterECSA {
	private final static String wrapperHenshinFilename = "wrapper-modular.henshin";
	private final static String splitrespHenshinFilename = "splitrespn-modular.henshin";
	private final static String insinterHenshinFilename = "insinter-modular.henshin";
	//
	private String repositoryFilename, systemFilename, resourceEnvironmentFilename, allocationFilename, usageFilename;
	private String resultRepositoryFilename, resultSystemFilename, resultResourceEnvironmentFilename, resultAllocationFilename, resultUsageFilename;

	public void runWrapper(String dirPath, String filename) {
		WrapperRunner runner = new WrapperRunner();
		this.runTransformation(dirPath, filename, runner, wrapperHenshinFilename);
	}
	
	public void runSplitResp(String dirPath, String filename) {
		SplitRespNRunner runner = new SplitRespNRunner();
		this.runTransformation(dirPath, filename, runner, splitrespHenshinFilename);
	}
	
	public void runInsInter(String dirPath, String filename) {
		InsInterRunner runner = new InsInterRunner();
		this.runTransformation(dirPath, filename, runner, insinterHenshinFilename);
	}
	
	private void runTransformation(String dirPath, String filename, PCMTransformerRunner runner, String henshinFilename) {
		this.setFilenames(filename);
		runner.run(dirPath,
			repositoryFilename, systemFilename, resourceEnvironmentFilename, allocationFilename, usageFilename,
			henshinFilename, 
			resultRepositoryFilename, resultSystemFilename, resultResourceEnvironmentFilename, resultAllocationFilename, resultUsageFilename,
			true);
	}
	
	private void setFilenames(String filename) {
		repositoryFilename = filename + ".repository";
		systemFilename = filename + ".system";
		resourceEnvironmentFilename = filename + ".resourceenvironment";
		allocationFilename = filename + ".allocation";
		usageFilename = filename + ".usagemodel";
		//
		resultRepositoryFilename = filename + "-" + "#REPLACEMENT#" + ".repository";
		resultSystemFilename = filename + "-" + "#REPLACEMENT#" + ".system";
		resultResourceEnvironmentFilename = filename + "-" + "#REPLACEMENT#" + ".resourceenvironment";
		resultAllocationFilename = filename + "-" + "#REPLACEMENT#" + ".allocation";
		resultUsageFilename = filename + "-" + "#REPLACEMENT#" + ".usagemodel";
	}
	
	public static void main(String[] args) {
		String dirPath = "src/edu/squat/transformations/modifiability/tests";
		String filename;
		//
		TesterECSA tester = new TesterECSA();
		// Run first level transformations
		filename = "stplus";
		tester.runWrapper(dirPath, filename);
		//tester.runSplitResp(dirPath, filename);
		// Run second level transformations
		filename = "stplus-split";
		//tester.runWrapper(dirPath, filename);
	}
}
