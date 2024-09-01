package com.YourCampus.App_Automation;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class AppiumBasics {
	

	@Test
	public void AppiumTest() throws InterruptedException, IOException{
		
		
		
		
		
		//android emulator start automation
		
		String emulatorPath = "C:\\Users\\Anik\\AppData\\Local\\Android\\Sdk\\emulator\\emulator.exe";
		String avdName = "Pixel_8_Pro_API_33";
		String mainJsPath ="C:\\Users\\Anik\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
		String AppiumServerIP = "127.0.0.1";
		int AppiumPort = 4723;
//		try {
//            ProcessBuilder builder = new ProcessBuilder(emulatorPath, "-avd", avdName);
//            builder.start();
//            System.out.println("Emulator started successfully please wait for 5 second.");
//        
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
		
		
		
//		EmulatorManager emulatorService = new EmulatorManager();
		EmulatorManager.setAvdName(avdName);
		EmulatorManager.setEmuPath(emulatorPath);
		
		EmulatorManager.startEmulator();
		
		
		
//		appium service start from appium client
//		main.js path in my local machine..
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File(mainJsPath)).withIPAddress(AppiumServerIP).usingPort(AppiumPort).build();
		
		service.start();
		
		
		
		
		//UiAutomation options selection
		UiAutomator2Options options = new UiAutomator2Options();
		//setting uiautomator capabilities options
		options.setDeviceName("Pixel_8_Pro_API_33");
		String appPath =System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                + File.separator+"java" + File.separator + "ResouscesApk"+File.separator+"YourCampus_2024_08_28_V1.apk";
		
		//String appPath = "E:\\java_web_automation_scripts\\Mobile_Automation_Basics_with_java\\src\\test\\java\\ResouscesApk\\YourCampus_2024_08_28_V1.apk";
		
		
		options.setApp(appPath);
		
		System.out.println(appPath);
		
		
		//AndroidDriver
	
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		Thread.sleep(5000);
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		service.stop();
		
		
		EmulatorManager.stopEmulator();
		

		
	}

}
