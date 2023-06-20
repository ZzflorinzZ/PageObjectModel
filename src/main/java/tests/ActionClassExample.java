package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTests;

public class ActionClassExample extends BaseTests {

	// moveToElement().clickAndHold().moveToOffset().release()

//	@Test
	public void dragAndDropExample() {
		app.click(app.menu.shopLink);
		app.dragAndDrop(app.shop.leftPriceSlider, 100, 0);
//		app.dragAndDropElementToElement(app.shop.leftPriceSlider, app.shop.rightPriceSlider);
		app.dragAndDrop(app.shop.rightPriceSlider, -100, 0);
	}

//	@Test
	public void actionScrollExample() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		// action.scrollByAmount(7500, 0).perform();
		WebElement text = driver.findElement(By.cssSelector("h4[class*='sc_title_underline']"));
		// action.moveToElement(text).perform();
		action.scrollToElement(text).perform();
	}

//	@Test
	public void sendKeysExample() {
		Actions action = new Actions(driver);
		action.moveToElement(app.returnElement(app.menu.blogLink)).perform();
		app.click(app.menu.postFormatsLink);

		action
			.moveToElement(app.returnElement(app.postFormPage.searchField))
			.keyDown(Keys.SHIFT)
			.sendKeys(app.returnElement(app.postFormPage.searchField), "abracadabra")
			.perform();
	}

	@Test
	public void sendKeysExample2() {
		app.click(app.menu.contactLink);
		Actions action = new Actions(driver);
		action
			.moveToElement(app.returnElement(app.contacts.nameField))
			.sendKeys(app.returnElement(app.contacts.nameField), "My Name")
			.sendKeys(Keys.TAB, "email@test.com")
			.sendKeys(Keys.TAB, "my subject")
			.sendKeys(Keys.TAB, "my message")
			.sendKeys(Keys.TAB, Keys.ENTER)
			.perform();
	}
}
