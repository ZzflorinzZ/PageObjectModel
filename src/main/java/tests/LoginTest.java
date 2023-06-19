package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTests;

public class LoginTest extends BaseTests{
	
	@Test(priority = 1)
	public void validLoginTest() {
		app.click(app.menu.loginLink);
		app.loginPage.loginInApp("TestUser", "12345@67890");
		assertTrue(app.checkElementIsDisplayed(app.loginPage.successMessage));
		app.click(app.loginPage.logoutButton);
	}
	
	@Test(priority = 2)
	public void invalidLoginTest() {
		app.click(app.menu.loginLink);
		app.loginPage.loginInApp("BadUser", "BadPass");
		assertTrue(app.checkElementIsDisplayed(app.loginPage.errorMessage));
	}

}
