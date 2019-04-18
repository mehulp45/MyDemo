package com.banking.testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.banking.pageObjects.LoginPageObjects;
import com.banking.utils.Base;

@Listeners({ com.banking.listners.CustomeListner.class, com.banking.utils.Reporting.class })
public class TC_LoginTest_001 extends Base {

	// @Test(retryAnalyzer=com.banking.Analyzer.RetryAnalyzer.class)
	// @Test
	public void loginTest() throws Exception {
		driver.get(base_URL);
		logger.info("Open Url");
		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.setUsername(username);
		logger.info("enetering username");
		lp.setPassword(password);
		logger.info("entering password");
		lp.clickOnLogin();
		logger.info("click on login button");

		// driver.switchTo().alert().dismiss();
		// Assert.assertEquals("Guru99 Bank Home Page", driver.getTitle());

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			logger.info("verifying title");
			logger.info("Test Pass");
			Assert.assertTrue(true);
		} else {
			// captureScreen("loginTest");
			logger.info("Test Fail");
			Assert.assertTrue(false);

		}

	}

	@Test()
	public void getGoogleTitle() throws Exception {
		driver.get("https://www.google.com");
		// captureScreen("googleTitle");
		Assert.assertEquals(true, true);

	}

	@Test
	public void getfbTitle() throws Exception {
		driver.get("https://www.fb.com");
		// captureScreen("googleTitle");
		Assert.assertEquals(true, true);

	}

	// @Test
	public void getyahooTitle() throws Exception {
		driver.get("https://www.yahoo.com");
		// captureScreen("googleTitle");
		Assert.assertEquals(true, true);

	}

}
