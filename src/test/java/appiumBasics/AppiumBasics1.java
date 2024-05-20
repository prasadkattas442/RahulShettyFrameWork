package appiumBasics;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
public class AppiumBasics1 extends BaseTest {	
    @Test
	public void AppiumTest() throws MalformedURLException, InterruptedException, URISyntaxException  
	{
    	  driver.findElement(AppiumBy.accessibilityId("Preference")).click();
  driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='WiFi']")).click();
  driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
  String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
  Assert.assertEquals(alertTitle,"WiFi settings");
  driver.findElement(By.id("android:id/edit")).sendKeys("PrasadWIFI");
  driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
    	
		
	}
}
