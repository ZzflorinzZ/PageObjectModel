package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTests;

public class JavaScriptExecutorExample extends BaseTests{
	
//	@Test
	public void javaScriptNavigation() {
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//	driver.get(null);
	//	driver.navigate().to(null);
		js.executeScript("window.location='http://emag.ro'");
		
	//	driver.navigate().back();
		js.executeScript("window.history.go(-1)");
	//	js.executeScript("window.history.back()");
		
	//	driver.navigate().forward();
		js.executeScript("window.history.forward()");
		
		//1
		driver.navigate().refresh();
		//2
		js.executeScript("window.history.go(0)");
		//3
		action.sendKeys(Keys.F5);
		//4
		driver.get(driver.getCurrentUrl());
		
	}
	
//	@Test
	public void workingWithElements() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
/*		
		//alternativa pt click
		js.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));		
		//alternativa pt sendKeys
		js.executeScript("arguments[0].value='cooking'", app.returnElement(app.menu.searchInput));		
		//alternativa pt click
		js.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));
		
		
		js.executeScript("arguments[0].click(); arguments[1].value='cooking'; arguments[0].click()", app.returnElement(app.menu.searchIcon), app.returnElement(app.menu.searchInput));
*/
		//java script executor ar trebui sa fie folosita doar independent de selenium, cand selenium nu poate identifica un element
		js.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		js.executeScript("document.getElementsByClassName('search_field')[0].value='cooking'");
		js.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		
		//alternativa pt isDisplayed()
		js.executeScript("document.getElementsByClassName('logo_slogan')[0].checkVisibility()");
		
		//alternativa pt getText
		String bookTitle = js.executeScript("return document.getElementsByClassName('post_title')[1].childNodes[0].innerHTML").toString();
		System.out.println(bookTitle);
		
		//alternativa pt getTitle()
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		//alternativa pt getCurrentUrl()
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
	}
	
	@Test
	public void JSHoover() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("var obj = document.createEvent('MouseEvent');"
				+ "obj.initMouseEvent('mouseover', true);"
				+ "arguments[0].dispatchEvent(obj);", app.returnElement(app.menu.blogLink));
		
		js.executeScript("window.numeFunctie = function(){document.title='Alt titlu!'};"
				+ "window.numeFunctie.call();");
		System.out.println(driver.getTitle());
	}

}
