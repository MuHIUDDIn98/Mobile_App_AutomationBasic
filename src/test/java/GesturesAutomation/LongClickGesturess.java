package GesturesAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class LongClickGesturess extends BaseTest{
	
	
	@Test
	public void LongClickGesture() {
		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
		views.click();
		
		WebElement ExpandableLists = driver.findElement(AppiumBy.accessibilityId("Expandable Lists"));
		ExpandableLists.click();
		
		WebElement CustormAdapter = driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter"));
		CustormAdapter.click();
		
		WebElement PeoplesName = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
		
//		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)PeoplesName).getId()),"duration",2000);
		longPressAction(PeoplesName);
		WebElement sampleMenu = driver.findElement(By.id("android:id/title"));
		Assert.assertTrue(sampleMenu.isDisplayed());
		Assert.assertEquals(sampleMenu.getText(), "Sample menu");
		
	}

	
	

}
