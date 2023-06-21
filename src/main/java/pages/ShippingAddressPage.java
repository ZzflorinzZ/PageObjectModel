package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ShippingAddressPage extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public ShippingAddressPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By selectCountryRegion = By.cssSelector("select[data-label='Country / Region']");
	public By selectProvince = By.cssSelector("select[id='shipping_state']");
	
}
