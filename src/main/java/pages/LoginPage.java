package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers{	//clasele de page object nu au assert-uri
							//assert-urile exista doar in clasele de test

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	//locatori
	public By usernameField = By.id("log");
	public By passwordField = By.id("password");
	public By submitButton = By.cssSelector("input[class='submit_button']");
	public By errorMessage = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By successMessage = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By logoutButton = By.linkText("Logout");
	
	//metode
	public void loginInApp(String user, String pass) {
		sendKeys(usernameField, user);
		sendKeys(passwordField, pass);
		click(submitButton);
	}
}
