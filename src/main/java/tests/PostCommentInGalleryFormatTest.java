package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTests;

public class PostCommentInGalleryFormatTest extends BaseTests{
	
	
	@Test
	public void galleryFormatPostComment() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
			
		js.executeScript("var obj = document.createEvent('MouseEvent');"
				+ "obj.initMouseEvent('mouseover', true);"
				+ "document.getElementsByClassName('sf-with-ul')[0].dispatchEvent(obj)"); 
		
		js.executeScript("document.getElementById('menu-item-232').firstElementChild.click()");		
		js.executeScript("document.getElementsByClassName('post_title')[4].firstElementChild.scrollIntoView()");
		Thread.sleep(1000);
		js.executeScript("document.getElementsByClassName('post_title')[4].firstElementChild.click()");

		js.executeScript("document.getElementById('send_comment').scrollIntoView()");
//		js.executeScript("document.getElementsByClassName('section_title comments_form_title').scrollIntoView()");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('comment').textContent='test message 17'");	
		js.executeScript("document.getElementById('author').value='florin'");	
		js.executeScript("document.getElementById('email').value='florin_test@gmail.com'");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('send_comment').click()");
		
		Thread.sleep(2000);		
//		String comment = js.executeScript("return document.getElementsByClassName('comment_text').firstElementChild.innerHTML").toString();
//		System.out.println(comment);
		
//		String confirmationText = js.executeScript("return document.getElementsByClassName('comment_not_approved').innerHTML").toString();
//		System.out.println(confirmationText);
		
	}

}
