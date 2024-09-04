package MiscellaneousActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEvents extends BaseTest {
	@Test
	public void keyEventTest() {
		
		WebElement preference = driver.findElement(AppiumBy.accessibilityId("Preference"));
		preference.click();
		WebElement preferenceDependencise = driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies"));
		preferenceDependencise.click();
	
		WebElement wifiCheckbox = driver.findElement(By.id("android:id/checkbox"));
		wifiCheckbox.click();
		WebElement wifiSettings = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]"));
		wifiSettings.click();
		WebElement wifiSettingsInput = driver.findElement(By.id("android:id/edit"));
		wifiSettingsInput.click();
		wifiSettingsInput.sendKeys("Hello anik");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		
		
		WebElement wifiOkButton = driver.findElement(By.id("android:id/button1"));
		wifiOkButton.click();
	}

}
