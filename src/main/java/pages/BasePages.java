package pages;

import utils.BaseTests;
import utils.SeleniumWrappers;

public class BasePages extends SeleniumWrappers{
	
	public MenuPage menu = new MenuPage(driver);
	public LoginPage loginPage = new LoginPage(driver);

	
	

}
