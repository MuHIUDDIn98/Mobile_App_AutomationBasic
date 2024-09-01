package com.YourCampus.App_Automation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;

public class CreateDriverSessionUsingOptions {
	@Test
	public void AppTestOn() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel_7_Pro_API_34");
		
//		String appPath =System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
//                + File.separator+"java" + File.separator + "ResouscesApk"+File.separator+"YourCampus_2024_08_28_V1.apk";
//		
//		//String appPath = "E:\\java_web_automation_scripts\\Mobile_Automation_Basics_with_java\\src\\test\\java\\ResouscesApk\\YourCampus_2024_08_28_V1.apk";
//		//installing app on android using setApp
//		options.setApp(appPath);
//		System.out.println(appPath);
		options.setUdid("emulator-5554");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.mnt.your_campus");
		options.setAppActivity("com.mnt.your_campus.MainActivity");
		
		
		
		URL url = new URL("http://127.0.0.1:4723");

		
        AppiumDriver driver = new AndroidDriver(url, options);
		
		
	}
	
	
	
	
	

}
