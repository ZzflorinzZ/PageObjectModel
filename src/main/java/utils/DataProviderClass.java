package utils;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "booksDataProvider")
	public Object[][] booksDataProvider() {
		
		Object[][] data = new Object[5][2];
		
		data[0][0] = "The forest";
		data[0][1] = "book2.jpg";
		
		data[1][0] = "Life in the garden";
		data[1][1] = "book4.jpg";
		
		data[2][0] = "The long road to the deep Silence";
		data[2][1] = "book5.jpg";
		
		data[3][0] = "It’s a really strange story";
		data[3][1] = "book12.jpg";
		
		data[4][0] = "Storm";
		data[4][1] = "books7.jpg";
		
		return data;
	}
	
	@DataProvider(name = "blogPostsDataProvider")
	public Object[][] blogPostsDataProvider() {
		Object[][] data = new Object[14][2];
		
		data[0][0] = By.xpath("(//div[@class='post_info_wrap info'])[1]");
		data[0][1] = "15 Amazing Things About Reading in the Fall";
		
		data[1][0] = By.xpath("(//div[@class='post_info_wrap info'])[2]");
		data[1][1] = "10 Book Recommendations For Family Members";
		
		data[2][0] = By.xpath("(//div[@class='post_info_wrap info'])[3]");
		data[2][1] = "The Best business books – Financial Times";
		
		data[3][0] = By.xpath("(//div[@class='post_info_wrap info'])[4]");
		data[3][1] = "The Best Poetry Books of All Time";
		
		data[4][0] = By.xpath("(//div[@class='post_info_wrap info'])[5]");
		data[4][1] = "Five the Best Audiobooks";
		
		data[5][0] = By.xpath("(//div[@class='post_info_wrap info'])[6]");
		data[5][1] = "Book reviews: Find the best new books";
		
		data[6][0] = By.xpath("(//div[@class='post_info_wrap info'])[7]");
		data[6][1] = "How end-of-year book lists prove we lack diversity";
		
		data[7][0] = By.xpath("(//div[@class='post_info_wrap info'])[8]");
		data[7][1] = "We need to talk about all women writers";
		
		data[8][0] = By.xpath("(//div[@class='post_info_wrap info'])[9]");
		data[8][1] = "The hottest books to warm you up this winter";
		
		data[9][0] = By.xpath("(//div[@class='post_info_wrap info'])[10]");
		data[9][1] = "Celebrity Picks:Favorite Reads of 2015";
		
		data[10][0] = By.xpath("(//div[@class='post_info_wrap info'])[11]");
		data[10][1] = "Weekend Reading";
		
		data[11][0] = By.xpath("(//div[@class='post_info_wrap info'])[12]");
		data[11][1] = "Coffee Table Books";
		
		data[12][0] = By.xpath("(//div[@class='post_info_wrap info'])[13]");
		data[12][1] = "Turn the Page: Your Next Rock ‘N’ Roll Book Club";
		
		data[13][0] = By.xpath("(//div[@class='post_info_wrap info'])[14]");
		data[13][1] = "The Book Report: Episode 3";
		
		return data;
	}

}
