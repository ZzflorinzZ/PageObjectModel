package tests;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTests;

public class CookiesLogin extends BaseTests{
	
	Set<Cookie> cookies;

	@Parameters({"user", "pass"})
	@Test(priority = 1, groups = "LoginFunctionality")
	public void validLoginTest(String username, String password) {
		app.click(app.menu.loginLink);
		app.loginPage.loginInApp(username, password);
		assertTrue(app.checkElementIsDisplayed(app.loginPage.successMessage));
		cookies = driver.manage().getCookies();
		System.out.println(cookies);
	}
	

	@Test(priority = 2)
	public void cookiesLogin() {
		app.click(app.menu.loginLink);
		
		for(Cookie cook : cookies) {
			driver.manage().addCookie(cook);
		}
		
		app.click(app.menu.shopLink);
	}
	
	
}
