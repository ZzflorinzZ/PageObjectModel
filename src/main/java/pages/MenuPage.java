package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	//driver.findElement(By.linkTesxt("BOOKS"));
//	public By shopLink = By.linkText("BOOKS");
	//driver.findElement(shopLink);
	public By contactLink = By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	public By shopLink = By.xpath("//li[@id='menu-item-262']/a[text()='Books']");
	public By eventsLink = By.xpath("//li[@id='menu-item-1047']/a[text()='Events']");
	public By postFormatsLink = By.linkText("Post Formats");
	public By blogLink = By.linkText("BLOG");
	
	public By searchIcon = By.cssSelector("button[class*='search_submit']");
	public By searchInput = By.cssSelector("input[class='search_field']");
	
	public By portfolioLink = By.linkText("Portfolio");
	public By portfolio2ColumnsLink = By.linkText("Portfolio 2 columns");
	
	public By facebookLink = By.cssSelector("span[class='icon-facebook']");
	public By twitterLink = By.cssSelector("span[class='icon-twitter']");
	public By instagramLink = By.cssSelector("span[class='icon-instagramm']");
	
	public void search(String text) {
		click(searchIcon);
		sendKeys(searchInput, text);
		click(searchIcon);
	}
	
	public void navigateBack(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().back();
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void navigateForward(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().forward();
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
