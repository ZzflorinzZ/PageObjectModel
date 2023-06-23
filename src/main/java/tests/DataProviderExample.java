package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTests;

public class DataProviderExample extends BaseTests{
	
	@DataProvider(name="loginTestData")
	public Object[][] loginTestData(){
		Object[][] data = new Object[4][3];
		data[0][0] = "TestUser";
		data[0][1] = "12345@67890";
		data[0][2] = true;
		
		data[1][0] = "BadUser";
		data[1][1] = "BadPass";
		data[1][2] = false;
		
		data[2][0] = "TestUser";
		data[2][1] = "12345@67890";
		data[2][2] = true;
		
		data[3][0] = "BadUser2";
		data[3][1] = "BadPass3";
		data[3][2] = false;
		
		return data;
	}
	
	
	@Test(dataProvider = "loginTestData")
	public void loginTest(String user, String pass, boolean success) {
		app.click(app.menu.loginLink);
		app.loginPage.loginInApp(user, pass);
		
		if(success) {
			assertTrue(app.checkElementIsDisplayed(app.loginPage.successMessage));
			app.click(app.loginPage.logoutButton);
		}else {
			assertTrue(app.checkElementIsDisplayed(app.loginPage.errorMessage));
			app.click(app.loginPage.closeLoginPopup);
		}
/*		
		if(app.checkElementIsDisplayed(app.loginPage.successMessage)) {
			assertTrue(app.checkElementIsDisplayed(app.loginPage.successMessage));
		}else {
			assertTrue(app.checkElementIsDisplayed(app.loginPage.errorMessage));
			app.click(app.loginPage.closeLoginPopup);
		}
		if(app.checkElementIsDisplayed(app.loginPage.logoutButton)) {
			app.click(app.loginPage.logoutButton);
		}
*/
	}
	
	
	
	
	

}
