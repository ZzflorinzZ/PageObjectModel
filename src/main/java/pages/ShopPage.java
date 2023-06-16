package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By dropdown = By.cssSelector("select[class='orderby']");
	
	public void selectByValue(String value) {
		WebElement element = driver.findElement(dropdown);
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void selectByIndex(int index) {
		WebElement element = driver.findElement(dropdown);
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectByVisibleText(String text ) {
		WebElement element = driver.findElement(dropdown);
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public String getSelectedOption() {
		WebElement element = driver.findElement(dropdown);
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();	
	}

}
