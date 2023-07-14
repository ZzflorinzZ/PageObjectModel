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
	public By rightPriceSlider = By.cssSelector("span[style='left: 100%;']");
	public By leftPriceSlider = By.cssSelector("span[style='left: 0%;']");
	
	public By targetPrice = By.xpath("//span[text()='$12']");
	
	public By firstBookPrice = By.xpath("//span[@class='price'][1]/descendant::bdi");
	public By firstBookDisountedPrice = By.xpath("//span[@class='price'][1]/ins/descendant::bdi");
	public By nextPageButton = By.cssSelector("a[class='next page-numbers']");
	public By lastBookPrice = By.xpath("//span[@class='price']/descendant::bdi");
	public By lastBookDisountedPrice = By.xpath("//span[@class='price']/ins/descendant::bdi");
	
	
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
