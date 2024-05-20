package appiumBasics;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
public class Scrollable extends BaseTest {	
    @Test
	public void AppiumTest() throws MalformedURLException, InterruptedException, URISyntaxException  
	{
    	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
  Thread.sleep(2000);
  //scrollToEndAction() ;
   	
	}
}
