package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTests;

public class WindowHandleExamples extends BaseTests{
	
	@Test
	public void windowHandleTest() throws InterruptedException {
		app.click(app.menu.eventsLink);
		app.click(app.event.festivalOfOldFilmsEvent);
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 800).perform();
		System.out.println("Current window: " + driver.getWindowHandle());
		app.genericEvent.clickMap();
		
		System.out.println("Current window: " + driver.getWindowHandle());
		System.out.println("All windows: " + driver.getWindowHandles()); // intoarce un set
		
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		System.out.println("Current window after switch: " + driver.getWindowHandle());
		driver.findElement(By.xpath("//span[text()='Accept all']")).click();
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		System.out.println("Current window after close: " + driver.getWindowHandle());
		
		System.out.println("All windows: " + driver.getWindowHandles());
		Thread.sleep(10000);
		
	}
	
	
	

}
