package tests;

import org.testng.annotations.Test;

import utils.BaseTests;

public class FrameExample extends BaseTests{
	
	@Test
	public void testExample() throws InterruptedException {
		app.click(app.menu.contactLink);
		app.contacts.zoomMap(app.contacts.zoomIn);
		
	}
	
	

}
