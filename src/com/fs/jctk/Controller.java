package com.fs.jctk;

public class Controller extends Trigger{
	
	public static String jenkinsConnector(String apiMethod, String jenkinsURL) {
		
		String connectionStatus = "Failed";
				
		return connectionStatus;
		
	}
	
	public static void disconnectJenkins(){
		
		/*
		connection.disconnect();
		connection = null;
		*/
	}
	
	public static String triggerJenkinsBuild(){
		
		String connectionStatus = "";
		connectionStatus = jenkinsConnector("POST", "http://localhost:8080");
		
		return connectionStatus;
		
	}
	
	public static String getJenkinsProgress(){
		
		getJenkinsBuildNumber();
		return verifyBuildStatus();
		
	}
	
	public static int getJenkinsBuildNumber(){
		
		return buildNumber;
		
	}
	
	public static String verifyBuildStatus(String ...buildNumber){
		
		String jobStatus = "";
		return jobStatus;
		
	}

}
