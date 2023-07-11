package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;

import pages.BasePages;

public class BaseTests {
	
	public static WebDriver driver;
	public BasePages app;

	@BeforeClass(alwaysRun = true)
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://keybooks.ro/");
		app = new BasePages();
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
//		driver.close();	// inchide tab-ul curent
		driver.quit();  // inchide browser-ul
	}
	
	@AfterMethod
	public void recordFailure(ITestResult result) throws IOException {
		//verificam statusul executiei
		if(ITestResult.FAILURE == result.getStatus()) {
			//instantieim TakeScreenshot
			TakesScreenshot poza = (TakesScreenshot)driver;
			File picture = poza.getScreenshotAs(OutputType.FILE);
			//salvam poza
			Files.copy(picture, new File("poze/failure.png"));
		}
	}

}
