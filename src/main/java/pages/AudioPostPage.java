package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class AudioPostPage extends SeleniumWrappers{
	
	public WebDriver driver;

	public AudioPostPage(WebDriver driver) {
		this.driver = driver;
	}

	public By playButton = By.cssSelector("div[class*='playpause']");
	public By songSlider = By.cssSelector("span[role='slider']");
//	span[aria-label='Time Slider']
	public By volumeSlider = By.cssSelector("a[aria-label='Volume Slider']");
	
	public By dream = By.xpath("//span[text()='Dream']");
	
}
