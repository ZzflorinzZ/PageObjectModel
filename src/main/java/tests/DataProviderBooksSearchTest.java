package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTests;
import utils.DataProviderClass;

public class DataProviderBooksSearchTest extends BaseTests{

	
	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "booksDataProvider")
	public void searchBooksTest(String bookName, String bookImage) throws InterruptedException {
		
		app.menu.search(bookName);
		Thread.sleep(2000);
		assertTrue(app.returnElement(By.cssSelector("div[data-image*='"+bookImage+"']")).isDisplayed());
	}
}
