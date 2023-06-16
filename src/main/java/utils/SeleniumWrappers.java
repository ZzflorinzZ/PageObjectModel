package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrappers extends BaseTests{
	
	/**
	 * Wrapped method over selenium default click() method, enhanced with:</br>
	 * 1. Logging mechanism</br>
	 * 2. Retry mechanism</br>
	 * 3. waitForElementToBeClickable()</br>
	 * @param locator (By locator)
	 */
	public void click(By locator) {	
		try {
			waitForElementToBeClickable(locator);
			WebElement element = driver.findElement(locator);
			element.click();
			System.out.println("Called method click");
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public void waitForElementToBeClickable(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			}
	}
	
	public void waitForElementToBeVisible(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			}
	}
	/**
	 * Custom sendKeys method. Wraps default selenium sendKeys and enhance with:</br>
	 * 1. Clear() method before sending text</br>
	 * 2. waitForElementToBeVisible() before any action on webElement</br>
	 * @param locator (By locator) --> used inside method to create WebElement
	 * @param textToSend --> String value
	 */
	public void sendKeys(By locator, String textToSend) {
		try {
			waitForElementToBeVisible(locator);
			WebElement element = driver.findElement(locator);
			element.sendKeys(textToSend);
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public boolean checkElementIsDisplayed(By locator) {
		try {
			driver.findElement(locator).isDisplayed();
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
	}
}
	
	
	

