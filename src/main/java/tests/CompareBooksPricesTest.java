package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTests;

public class CompareBooksPricesTest extends BaseTests{
	
	@Test
	public void compareBooksPrices() {
		app.click(app.menu.shopLink);
		app.selectByValue(app.shop.dropdown, "price");
		
		String firstBookPrice;
		StringBuilder LastBookPrice;

		
		if(app.checkElementIsDisplayed(app.shop.firstBookDisountedPrice)) {
			firstBookPrice = app.returnElement(app.shop.firstBookDisountedPrice).getText().toString();
			System.out.println(firstBookPrice);
		}else {
			firstBookPrice = app.returnElement(app.shop.firstBookPrice).getText().toString();
			System.out.println(firstBookPrice);
		}
		
		if(app.checkElementIsDisplayed(app.shop.nextPageButton)) {
			do {
				app.click(app.shop.nextPageButton);				
			}while (app.checkElementIsDisplayed(app.shop.nextPageButton));		
		}
		
		if(app.checkElementIsDisplayed(app.shop.lastBookDisountedPrice)) {
			LastBookPrice = new StringBuilder(app.returnElement(app.shop.lastBookPrice).getText().toString());
			System.out.println(firstBookPrice);
		}else {
			LastBookPrice = new StringBuilder(app.returnElement(app.shop.lastBookPrice).getText().toString());
			LastBookPrice.delete(0, 1);
			System.out.println(LastBookPrice);
		}
		
		double firstBookPriceD = Double.parseDouble(firstBookPrice.substring(1, 5));
		double lastBookPriceD = Double.parseDouble(LastBookPrice.toString());
		System.out.println(firstBookPriceD + ", " + lastBookPriceD);
		
		if(firstBookPriceD < lastBookPriceD) {
			assertTrue(true);
		}
		
	}

}
