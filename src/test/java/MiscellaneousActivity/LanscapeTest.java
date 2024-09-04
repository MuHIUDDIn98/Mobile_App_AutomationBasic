package MiscellaneousActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LanscapeTest extends BaseTest {
	
	
	@Test
	public void landscapeRotate() {
		WebElement preference = driver.findElement(AppiumBy.accessibilityId("Preference"));
		preference.click();
		WebElement preferenceDependencise = driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies"));
		preferenceDependencise.click();
		
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		
		WebElement wifiCheckbox = driver.findElement(By.id("android:id/checkbox"));
		wifiCheckbox.click();
		WebElement wifiSettings = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]"));
		wifiSettings.click();
		WebElement wifiSettingsInput = driver.findElement(By.id("android:id/edit"));
		wifiSettingsInput.click();
		wifiSettingsInput.sendKeys("Hello anik");
		WebElement wifiOkButton = driver.findElement(By.id("android:id/button1"));
		wifiOkButton.click();
		
		
	}

}
