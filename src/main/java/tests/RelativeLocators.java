package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import utils.BaseTests;

public class RelativeLocators extends BaseTests{
	
	/*
	 * toLeftOf
	 * toRightOf
	 * below
	 * above
	 * near
	 * 
	 */
	
	@Test
	public void relativeLocatorsExample() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//toLeftOf
		WebElement  price10_20 = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']"))
				.toLeftOf(By.cssSelector("a[href='life-in-the-garden']")));		
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", price10_20);

		//toRightOf
		WebElement  price10_20_2 = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']"))
				.toRightOf(By.cssSelector("a[href='the-son']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", price10_20_2);
		
		//below
		WebElement  price15_99 = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']"))
				.below(By.xpath("//p[text()='Richard Mann']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", price15_99);
		
		//above
		WebElement  author = driver.findElement(RelativeLocator.with(By.xpath("//p[text()='Richard Mann']"))
				.above(By.xpath("//h5[text()='$15.99']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", author);
		
		//near
		WebElement  author2 = driver.findElement(RelativeLocator.with(By.xpath("//p[text()='Burt Geller']"))
				.near(By.cssSelector("img[src*='books7']"), 200));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", author2);
	}

}
