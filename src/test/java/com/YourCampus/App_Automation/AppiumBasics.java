package com.YourCampus.App_Automation;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics {
	

	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException{
		
		
		
		
		
		//android emulator start automation
		
		String emulatorPath = "C:\\Users\\Onick\\AppData\\Local\\Android\\Sdk\\emulator\\emulator.exe";
		String avdName = "Pixel_7_Pro_API_34";
		
		try {
            ProcessBuilder builder = new ProcessBuilder(emulatorPath, "-avd", avdName);
            builder.start();
            System.out.println("Emulator started successfully please wait for 5 second.");
        
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		
//		appium service start from appium client
//		main.js path in my local machine..
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Onick\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		
		service.start();
		
		
		
		
		//UiAutomation options selection
		UiAutomator2Options options = new UiAutomator2Options();
		//setting uiautomator capabilities options
		options.setDeviceName("Pixel_7_Pro_API_34");
		options.setApp("G:\\git repository\\Mobile app automation with java\\App_Automation\\src\\test\\java\\ResouscesApk\\YourCampus_2024_08_28_V1.apk");
		
		
		//AndroidDriver
	
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		Thread.sleep(500);
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		service.stop();
		
		

		
	}

}
