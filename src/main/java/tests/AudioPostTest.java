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
		app.doubleClick(app.audioPostPage.dream);		// nu sunt sigur de ce nu face dublu click
		app.dragAndDrop(app.audioPostPage.songSlider, 200, 0);
		app.dragAndDrop(app.audioPostPage.volumeSlider, -50, 0);
	}
	
	/*
	 * incercasem cu locatorul 
	 * 		public By songSlider = By.cssSelector("span[aria-label='Time Slider']");
	 * aria-label='Time Slider' dispare dupa ce melodia este pornita, dar poate fi folosit daca faci dublu click pe playButton
	 * 		primul click activeaza slider-ul, cel de-al doilea opreste melodia si mentine locatorul vizibil
	 * 
	 * 
	 * am creat o metoda doubleClick in SeleniumWrappers, dar pare ca nu functioneaza....
	 * am incercat doubleClick si pe locatorul 
	 * 		public By dream = By.xpath("//span[text()='Dream']");
	 * dar nu pare sa faca highlight pe text
	 */

}
