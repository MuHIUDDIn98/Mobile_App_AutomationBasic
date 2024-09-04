package GesturesAutomation;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;

public class ScrollGesture extends BaseTest {
	@Test
	public void Scroll() throws InterruptedException {
		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
		views.click();
		
		String textElement = "WebView";
		//Where to scroll is known prior
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+textElement +"\"));"));
		scrollViewByText(textElement);
		
		
	}

}
