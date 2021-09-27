package windowhandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class WindowHandle_Demo extends DriverSetup {
	
	@Test
	public void MultipleWomdows() throws InterruptedException {

		// Launching the site
		driver.get("https://www.salesforce.com/in/");
		
		
		//Start Free trial
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		
		//switch to new window
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator <String> iterator = windowhandles.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		
		//driver.switchTo().window(parentWindow);
		
	    // Sign-up form
		Thread.sleep(2000);
	    driver.findElement(By.name("UserFirstName")).sendKeys("IMRAN");
	    Thread.sleep(1000);
	    driver.findElement(By.name("UserLastName")).sendKeys("AL MUNYEEM");
	    Thread.sleep(1000);
	    
	    
	     
	}
	}