package GesturesAutomation;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class swipeGesture extends BaseTest {
	@Test
	public void swipe() throws InterruptedException {
		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
		views.click();
		
		WebElement Gallery = driver.findElement(AppiumBy.accessibilityId("Gallery"));
		Gallery.click();
		
		WebElement Photos = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]"));
		Photos.click();
		
		WebElement firstImage = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]"));


//		
		
		
		
		
		//String focasable = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"); 
		Assert.assertEquals(firstImage.getAttribute("focusable"),"true");
		swipeElement(firstImage,"left");
		Assert.assertEquals(firstImage.getAttribute("focusable"),"false");
		swipeElement(firstImage,"right");
		Assert.assertEquals(firstImage.getAttribute("focusable"),"true");
		swipeElement(firstImage,"left");
		Assert.assertEquals(firstImage.getAttribute("focusable"),"false");
		
		
		
		WebElement secondImage = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[2]"));
		Assert.assertEquals(secondImage.getAttribute("focusable"),"true");
		swipeElement(secondImage,"left");
		Assert.assertEquals(secondImage.getAttribute("focusable"),"false");
		swipeElement(secondImage,"right");
		Assert.assertEquals(secondImage.getAttribute("focusable"),"true");
		swipeElement(secondImage,"left");
		Assert.assertEquals(secondImage.getAttribute("focusable"),"false");
	
		
		WebElement thirdImage = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[3]"));
		Assert.assertEquals(thirdImage.getAttribute("focusable"),"true");
		swipeElement(thirdImage,"left");
		Assert.assertEquals(thirdImage.getAttribute("focusable"),"false");
		swipeElement(thirdImage,"right");
		Assert.assertEquals(thirdImage.getAttribute("focusable"),"true");
		swipeElement(thirdImage,"left");
		Assert.assertEquals(thirdImage.getAttribute("focusable"),"false");

		
		WebElement forthImage = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[4]"));
//		Assert.assertEquals(forthImage.getAttribute("focusable"),"true");
		swipeElement(forthImage,"left");
//		Assert.assertEquals(forthImage.getAttribute("focusable"),"false");
		swipeElement(forthImage,"right");
//		Assert.assertEquals(forthImage.getAttribute("focusable"),"true");
		swipeElement(forthImage,"left");
//		Assert.assertEquals(forthImage.getAttribute("focusable"),"false");
		
		
		Thread.sleep(2000);
							  
		
	}

}
