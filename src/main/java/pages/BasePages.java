package pages;

import utils.BaseTests;
import utils.SeleniumWrappers;

public class BasePages extends SeleniumWrappers{
	
	public MenuPage menu = new MenuPage(driver);
	public LoginPage loginPage = new LoginPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public AcountSettingsPage accountDetails = new AcountSettingsPage(driver);
	public ShippingAddressPage	shippingaddress = new ShippingAddressPage(driver);
	public PostFormatsPage postFormPage = new PostFormatsPage(driver); 
	public ContactsPage contacts = new ContactsPage(driver);

	
	

}
