package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ContactsPage extends SeleniumWrappers {

	public WebDriver driver;

	public ContactsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By nameField = By.cssSelector("input[name='your-name']");
	public By zoomIn = By.cssSelector("button[title='Zoom in']");
	public By zoomOut = By.cssSelector("button[title='Zoom out']");
	public By iframe = By.tagName("iframe");
	
	public void zoomMap(By locator) {
		driver.switchTo().frame(returnElement(iframe));
		click(locator);
	}

}
