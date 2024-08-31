package com.YourCampus.App_Automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasicsTestNG {

    private AppiumDriverLocalService service;
    private AndroidDriver driver;
    private static final String EMULATOR_PATH = "C:\\Users\\Onick\\AppData\\Local\\Android\\Sdk\\emulator\\emulator.exe";
    private static final String AVD_NAME = "Pixel_3a_API_34_extension_level_7_x86_64";
    private static final String APP_PATH = "G:\\git repository\\Mobile app automation with java\\App_Automation\\src\\test\\java\\ResouscesApk\\YourCampus_2024_08_28_V1.apk";
    private static final String APPIUM_JS_PATH = "C:\\Users\\Onick\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";

    @BeforeClass
    public void setUp() {
        startEmulator();
        startAppiumService();
    }

    @Test
    public void appiumTest() throws MalformedURLException, InterruptedException {
        // Set up UiAutomator2 options
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName(AVD_NAME);
        options.setApp(APP_PATH);

        // Initialize AndroidDriver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        // Example test operation
        Thread.sleep(500);

        // Close the Appium driver
        driver.quit();
    }

    @AfterClass
    public void tearDown() {
        stopEmulator();
        stopAppiumService();
    }

    private void startEmulator() {
        try {
            ProcessBuilder builder = new ProcessBuilder(EMULATOR_PATH, "-avd", AVD_NAME);
            builder.start();
            System.out.println("Emulator started successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void stopEmulator() {
        String[] command = {"adb", "emu", "kill"};
        try {
            Process process = new ProcessBuilder(command).start();
            process.waitFor();
            System.out.println("Emulator stopped successfully.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void startAppiumService() {
        service = new AppiumServiceBuilder()
            .withAppiumJS(new File(APPIUM_JS_PATH))
            .withIPAddress("127.0.0.1")
            .usingPort(4723)
            .build();

        service.start();
        System.out.println("Appium service started.");
    }

    private void stopAppiumService() {
        if (service != null && service.isRunning()) {
            service.stop();
            System.out.println("Appium service stopped.");
        }
    }
}

