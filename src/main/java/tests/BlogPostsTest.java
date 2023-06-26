package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTests;
import utils.DataProviderClass;

public class BlogPostsTest extends BaseTests{
	
	@Test(priority = 1)
	public void goToPortfolos2ColumnsPage() {
		app.hooverOnElement(app.menu.blogLink);
		app.hooverOnElement(app.menu.portfolioLink);
		app.click(app.menu.portfolio2ColumnsLink);
	}

	@Test(priority = 2, dataProviderClass = DataProviderClass.class, dataProvider = "blogPostsDataProvider")
	public void checkBlogPostsTitle(By blogPostImage, String blogPostTitle) throws InterruptedException {		
		app.hooverOnElementPresent(blogPostImage);																//am creat o metoda noua de hoover cu wait pt prezenta elementului; daca o foloseam pe cea cu vizibilitatea elementului, spunea ca nu le vede
		Thread.sleep(125);																						//daca nu pun thered.sleep-ul, pica primul assert
		assertTrue(app.returnElement(By.xpath("//a[text()='"+blogPostTitle+"']")).isDisplayed());
		
	}
}
