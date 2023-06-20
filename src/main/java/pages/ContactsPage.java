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

}
