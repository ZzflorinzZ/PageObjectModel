package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTests;

public class LoginTest extends BaseTests{
	
	@Parameters({"user", "pass"})
	@Test(priority = 1, groups = "LoginFunctionality")
	public void validLoginTest(String username, String password) {
		app.click(app.menu.loginLink);
		app.loginPage.loginInApp(username, password);
		assertTrue(app.checkElementIsDisplayed(app.loginPage.successMessage));
		app.click(app.loginPage.logoutButton);
	}
	
	@Parameters({"invuser", "invpass"})
	@Test(priority = 2, groups = "LoginFunctionality")
	public void invalidLoginTest(String username, String password) {
		app.click(app.menu.loginLink);
		app.loginPage.loginInApp(username, password);
		assertTrue(app.checkElementIsDisplayed(app.loginPage.errorMessage));
	}

}
