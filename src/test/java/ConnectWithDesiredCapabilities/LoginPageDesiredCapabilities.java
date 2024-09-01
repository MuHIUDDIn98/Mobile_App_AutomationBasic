package ConnectWithDesiredCapabilities;


import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


	public class LoginPageDesiredCapabilities {
		
	    public AndroidDriver driver;
	    
	    
	    @Test
	    public void TestyourCampusAPK() throws MalformedURLException {
	    	
	    	
	    	
	    	
	    	
	        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	        desiredCapabilities.setCapability("platformName", "android");
	        desiredCapabilities.setCapability("appium:automationName","UiAutomator2");
	        desiredCapabilities.setCapability("appium:deviceName","Pixel_7_Pro_API_34");
	        desiredCapabilities.setCapability("appium:udid","emulator-5554");
	        
	        //for emulator laoumch through appium
	        desiredCapabilities.setCapability("appium:avd", "Pixel_7_Pro_API_34");
	        desiredCapabilities.setCapability("appium:avdLaunchTimeout", 18000);
	        desiredCapabilities.setCapability("appium:appPackage","com.mnt.your_campus");
	        desiredCapabilities.setCapability("appium:appActivity","com.mnt.your_campus.MainActivity");
	        
	        
	        URL remoteUrl = new URL("http://127.0.0.1:4723");
	        
	        
	        
	        driver = new AndroidDriver(remoteUrl,desiredCapabilities);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement e1 = driver.findElement(AppiumBy.accessibilityId("Next"));
	        e1.click();
	        e1.click();
	        e1.click();
	        
	        

	    }
	}



