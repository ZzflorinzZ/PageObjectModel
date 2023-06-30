package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		app.hooverOnElementPresent(blogPostImage);
		app.textToBePresentInElementLocated(By.xpath("//a[text()='"+blogPostTitle+"']"), blogPostTitle);
		assertTrue(app.returnElement(By.xpath("//a[text()='"+blogPostTitle+"']")).isDisplayed());
	}
}
