package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utils.BaseTests;

public class DropdownTest extends BaseTests{
	
	@Test(groups = "ProductFunctionality")
	public void selectByValueTest() {
		app.click(app.menu.shopLink);
		app.shop.selectByValue("popularity");
		assertEquals(app.shop.getSelectedOption(), "Sort by popularity");
	}
	
	@Test(groups = "ProductFunctionality")
	public void selectByIndexTest() {
		app.click(app.menu.shopLink);
		app.shop.selectByIndex(3);
		assertEquals(app.shop.getSelectedOption(), "Sort by latest");
	}
	
	@Test(groups = "ProductFunctionality")
	public void selectByVisibleTextTest() {
		app.click(app.menu.shopLink);
		app.shop.selectByVisibleText("Sort by price: high to low");
		assertEquals(app.shop.getSelectedOption(), "Sort by price: high to low");
	}


}
