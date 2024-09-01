package com.YourCampus.App_Automation;

import java.io.IOException;

import org.testng.annotations.Test;

public class Testexecution extends BaseTestServices{
	
	
	@Test
	public void startAppiumServer() throws IOException, InterruptedException {
		
		startServer();
		
		SetDesiredCapabilitiesDriver();
		//UiAutomator2SetOptionsDriver();
		StopServer();
	
		
	}

	
	

}
