package tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import utils.BaseTests;

public class CookiesHandling extends BaseTests{
	
	@Test(priority=1)
	public void addCookie() {
		
		Cookie cookie = new Cookie("MyCookie", "My cookie value");
		driver.manage().addCookie(cookie);
	}
	
	@Test(priority=2)
	public void getCookieNamed() {
		Cookie cookie = driver.manage().getCookieNamed("PHPSESSID");
		System.out.println(cookie);
	}
	
	@Test(priority=3)
	public void getAllCookies() {
		Set<Cookie> allCookies = driver.manage().getCookies(); //intoarce un obiect se tip Set
		System.out.println(allCookies);		
	}
	
	@Test(priority=4)
	public void deleteCookieNamed() {
		driver.manage().deleteCookieNamed("MyCookie");
		System.out.println("=================================");
		Set<Cookie> allCookies = driver.manage().getCookies(); //intoarce un obiect se tip Set
		System.out.println(allCookies);	
	}
	
	@Test(priority=5)
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	

}
