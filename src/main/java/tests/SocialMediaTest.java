package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import utils.BaseTests;

public class SocialMediaTest extends BaseTests{
	
	@Test
	public void checkSocialMediaRedirects() {
		assertEquals(app.checkRedirectedUrlAndReturnToInitialPage(app.menu.facebookLink), "https://www.facebook.com/keytraining.ro");
		assertEquals(app.checkRedirectedUrlAndReturnToInitialPage(app.menu.twitterLink), "https://twitter.com/i/flow/login?redirect_after_login=%2F");
		assertEquals(app.checkRedirectedUrlAndReturnToInitialPage(app.menu.instagramLink), "https://www.instagram.com/");
	}
}
