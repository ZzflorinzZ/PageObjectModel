package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTests;

public class AudioPostTest extends BaseTests{
	
	@Test
	public void playSong() {
		app.hooverOnElement(app.menu.blogLink);
		app.click(app.menu.postFormatsLink);
		app.click(app.postFormPage.audioPost);
		app.click(app.audioPostPage.playButton);
//		app.click(app.audioPostPage.playButton);
		app.doubleClick(app.audioPostPage.dream);	
		app.dragAndDrop(app.audioPostPage.songSlider, 200, 0);
		app.dragAndDrop(app.audioPostPage.volumeSlider, -50, 0);
	}
	


}
