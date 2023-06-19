package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcountSettingsPage {
	
	public WebDriver driver;
	
	public AcountSettingsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By addresses = By.xpath("//a[text()='Addresses']");
	public By addShippingAdressButton = By.xpath("//a[text()='Add']");
	

}
