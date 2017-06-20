package edu.squat.transformations;

//import io.github.squat_team.model.PCMArchitectureInstance;

public class ArchitecturalVersion {
	private String fileName;
	private String path;
	private String repositoryFilename, systemFilename, resourceEnvironmentFilename, allocationFilename, usageFilename;
	
	public ArchitecturalVersion(String fileName,String path) {
		this.fileName=fileName;
		this.path=path;
		repositoryFilename = fileName + ".repository";
		systemFilename = fileName + ".system";
		resourceEnvironmentFilename = fileName + ".resourceenvironment";
		allocationFilename = fileName + ".allocation";
		usageFilename = fileName + ".usagemodel";
	}
	/*public PCMArchitectureInstance loadModel(){
		//TODO 
		
		return null;
	}*/
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getRepositoryFilename() {
		return repositoryFilename;
	}
	public void setRepositoryFilename(String repositoryFilename) {
		this.repositoryFilename = repositoryFilename;
	}
	public String getSystemFilename() {
		return systemFilename;
	}
	public void setSystemFilename(String systemFilename) {
		this.systemFilename = systemFilename;
	}
	public String getResourceEnvironmentFilename() {
		return resourceEnvironmentFilename;
	}
	public void setResourceEnvironmentFilename(String resourceEnvironmentFilename) {
		this.resourceEnvironmentFilename = resourceEnvironmentFilename;
	}
	public String getAllocationFilename() {
		return allocationFilename;
	}
	public void setAllocationFilename(String allocationFilename) {
		this.allocationFilename = allocationFilename;
	}
	public String getUsageFilename() {
		return usageFilename;
	}
	public void setUsageFilename(String usageFilename) {
		this.usageFilename = usageFilename;
	}
	
}
