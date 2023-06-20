package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTests;

public class ShippingAddressTest extends BaseTests{
	
	@Test(priority = 1)
	public void validLoginTest() {
		app.click(app.menu.loginLink);
		app.loginPage.loginInApp("TestUser", "12345@67890");
		assertTrue(app.checkElementIsDisplayed(app.loginPage.successMessage));
	}	
	
	@Test(priority = 2)
	public void goToAccountSettingsAndAccessShippingAddress() {
		app.hooverOnElement(app.loginPage.userLoggedIn);
		app.click(app.loginPage.userSettings);
		app.click(app.accountDetails.addresses);
		app.click(app.accountDetails.addShippingAdressButton);
	}
	
	@Test(priority = 3)
	public void fillInShippingAddress() {
		app.selectByIndex(app.shippingaddress.selectCountryRegion, 41);
		assertEquals(app.getSelectedOption(app.shippingaddress.selectCountryRegion), "Canada");
		app.selectByValue(app.shippingaddress.selectProvince, "NL");
		assertEquals(app.getSelectedOption(app.shippingaddress.selectProvince), "Newfoundland and Labrador");
		
	}
	
}
