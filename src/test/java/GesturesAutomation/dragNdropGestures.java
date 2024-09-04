package GesturesAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class dragNdropGestures extends BaseTest {
	@Test
	public void drapDropTest() {
		
		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
		views.click();
		WebElement dragdrop = driver.findElement(AppiumBy.accessibilityId("Drag and Drop"));
		dragdrop.click();
		
		WebElement dragElem = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		dragNdropByElementNCordinate(dragElem,830,790);
		String droppedMsg = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		System.out.println(droppedMsg);
		Assert.assertEquals(droppedMsg, "Dropped!");
	}

}
