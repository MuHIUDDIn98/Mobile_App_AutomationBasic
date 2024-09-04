package MiscellaneousActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SetClipBoardGetClipBoard extends BaseTest{
	
	@Test
	public void setGet() {
		WebElement preference = driver.findElement(AppiumBy.accessibilityId("Preference"));
		preference.click();
		WebElement preferenceDependencise = driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies"));
		preferenceDependencise.click();
		WebElement wifiCheckbox = driver.findElement(By.id("android:id/checkbox"));
		wifiCheckbox.click();
		WebElement wifiSettings = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]"));
		wifiSettings.click();
		WebElement wifiSettingsInput = driver.findElement(By.id("android:id/edit"));
		String wifiAlartmsg = driver.findElement(By.id("android:id/alertTitle")).getText();
		
		driver.setClipboardText(wifiAlartmsg);
		
		wifiSettingsInput.click();
		wifiSettingsInput.sendKeys(driver.getClipboardText());
		WebElement wifiOkButton = driver.findElement(By.id("android:id/button1"));
		wifiOkButton.click();
		
		
	}

}
