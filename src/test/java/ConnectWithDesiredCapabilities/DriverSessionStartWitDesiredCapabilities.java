package ConnectWithDesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;

public class DriverSessionStartWitDesiredCapabilities {

	
	@Test
	public  void desiredCaps() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName","Android");
		cap.setCapability("deviceName","Pixel_8_Pro_API_33");
		cap.setCapability("UDID","emulator-5554");
		cap.setCapability("automationName", "UiAutomator2");
		
		String appPath =System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                + File.separator+"java" + File.separator + "ResouscesApk"+File.separator+"YourCampus_2024_08_28_V1.apk";
		
		System.out.println(appPath);
		
		cap.setCapability("app",appPath);
		
		
		
		URL url = new URL("http://127.0.0.1:4723");
		
		AppiumDriver driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
