package Locators;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Testexecution extends BaseTest{
	
	
	@Test
	public void StartTest() {
		
		WebElement SkipButton = driver.findElement(AppiumBy.accessibilityId("Skip"));
//		String SkipTitle = SkipButton.getText();
//		Assert.assertEquals(SkipTitle, "Skip");
		WebElement NextButtonAcid = driver.findElement(AppiumBy.accessibilityId("Next"));
		NextButtonAcid.click();
		// xpath : //tagName[@attribute='value']
		WebElement NextButtonXpath = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Next\"]"));
		NextButtonXpath.click();
		NextButtonXpath.click();
		
		
		
		
		WebElement NumberXpath =	 driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]"));
		NumberXpath.click();
		WebElement NumberUiSelector = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"));
		NumberUiSelector.sendKeys("01521327657");
		
		WebElement passXpath = driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]"));
		passXpath.click();
		passXpath.sendKeys("123456");
		
		WebElement LoginButton = driver.findElement(AppiumBy.accessibilityId("LOG IN"));
		LoginButton.click();
		
		
		// Find the element using accessibility ID (content description)
        WebElement element = driver.findElement(AppiumBy.accessibilityId("This number is not registered yet. Please Signup first."));

        // Get the content description (accessibility ID) of the element
        String contentDescription = element.getAttribute("contentDescription");

        // Output the content description
        System.out.println("Content Description: " + contentDescription);
        Assert.assertEquals(contentDescription, "This number is not registered yet. Please Signup first.");
        
//		WebElement ForgetPin = driver.findElement(AppiumBy.accessibilityId("Forgot PIN?"));
//		ForgetPin.click();
//		WebElement CreateAccount = driver.findElement(AppiumBy.accessibilityId("CREATE ACCOUNT"));
//		CreateAccount.click();
	}

	
	

}
