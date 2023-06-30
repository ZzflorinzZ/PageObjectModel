package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTests;

public class ScrollExample extends BaseTests{
	
//	@Test
	public void blindScroll() throws InterruptedException {
		
		//JS executor scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		//Action class scroll
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 1000).perform();
	}
	
	
//	@Test
	public void scrollToElement() {
		
		WebElement visitBlogButton = driver.findElement(By.xpath("//h4[text()=' ReadDown']"));
		//JS executor scroll to element
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].scrollIntoView()", visitBlogButton);
		
		Actions action = new Actions(driver);
		action.moveToElement(visitBlogButton).perform();
	}
	
	@Test
	public void scrollTopAndDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		
		//JS executor scroll down
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		//JS executor scroll up
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		//Action scroll down
		action.sendKeys(Keys.END).perform();
		
		Thread.sleep(2000);
		
		//Action scroll up
		action.sendKeys(Keys.HOME).perform();

	}

}
