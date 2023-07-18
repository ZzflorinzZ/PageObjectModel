package utils;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrappers extends BaseTests {

	/**
	 * Wrapped method over selenium default click() method, enhanced with:</br>
	 * 1. Logging mechanism</br>
	 * 2. Retry mechanism</br>
	 * 3. waitForElementToBeClickable()</br>
	 * 
	 * @param locator (By locator)
	 */
	public void click(By locator) {
		WebElement element;
		try {
			waitForElementToBeClickable(locator);
			element = driver.findElement(locator);
			element.click();
			System.out.println("Called method click");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (StaleElementReferenceException e) {
			element = driver.findElement(locator);
			element.click();
		}
	}

	public void doubleClick(By locator) {
		try {
			waitForElementToBeClickable(locator);
			Actions action = new Actions(driver);
			action.doubleClick(returnElement(locator)).perform();
			System.out.println("Called method doubleClick");
		} catch (StaleElementReferenceException e) {
			Actions action = new Actions(driver);
			action.doubleClick(returnElement(locator)).perform();
		}
	}

	public void waitForElementToBeClickable(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void waitForElementToBeVisible(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void waitForElementToBePresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void textToBePresentInElementLocated(By locator, String textToBePresent) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, textToBePresent));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Custom sendKeys method. Wraps default Selenium sendKeys and enhance
	 * with:</br>
	 * 1. Clear() method before sending text</br>
	 * 2. waitForElementToBeVisible() before any action on webElement</br>
	 * 
	 * @param locator    (By locator) --> used inside method to create WebElement
	 * @param textToSend --> String value
	 */
	public void sendKeys(By locator, String textToSend) {
		try {
			waitForElementToBeVisible(locator);
			WebElement element = driver.findElement(locator);
			element.clear();
			element.sendKeys(textToSend);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public boolean checkElementIsDisplayed(By locator) {
		try {
			driver.findElement(locator).isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/*
	 * public void hooverOnElement(By locator) { Actions hoover = new
	 * Actions(driver); try { waitForElementToBeVisible(locator); WebElement element
	 * = driver.findElement(locator); hoover.moveToElement(element).perform(); }
	 * catch (NoSuchElementException e) { e.printStackTrace(); } }
	 */
	public void hooverOnElement(By locator) {
		Actions hoover = new Actions(driver);
		waitForElementToBeVisible(locator);
		hoover.moveToElement(returnElement(locator)).perform();
	}

	public void hooverOnElementPresent(By locator) {
		Actions hoover = new Actions(driver);
		waitForElementToBePresent(locator);
		hoover.moveToElement(returnElement(locator)).perform();
	}

	public void selectByIndex(By locator, int index) {
		try {
			Select select = new Select(returnElement(locator));
			select.selectByIndex(index);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void selectByValue(By locator, String value) {
		try {
			Select select = new Select(returnElement(locator));
			select.selectByValue(value);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public String getSelectedOption(By locator) {
		try {
			Select select = new Select(returnElement(locator));
			return select.getFirstSelectedOption().getText();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void dragAndDropElementToElement(By locator1, By locator2) {
		try {
			WebElement e1 = driver.findElement(locator1);
			WebElement e2 = driver.findElement(locator2);
			Actions action = new Actions(driver);
			action.dragAndDrop(e1, e2).perform();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void dragAndDrop(By locator, int x, int y) {
		try {
			WebElement element = driver.findElement(locator);

			Actions action = new Actions(driver);
			/*
			 * action .moveToElement(element) .clickAndHold() .moveByOffset(x, y) .release()
			 * .perform();
			 */
			action.dragAndDropBy(element, x, y).perform();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public WebElement returnElement(By locator) {
		try {
			return driver.findElement(locator);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String checkRedirectedUrlAndReturnToInitialPage(By locator) {
		try {
			click(locator);
			List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(browserTabs.get(1));
			String currentURL = driver.getCurrentUrl();		
			driver.close();
			driver.switchTo().window(browserTabs.get(0));
			return currentURL;
		} catch (Exception e) {
			return e.getMessage(); 
		}
	}

}
