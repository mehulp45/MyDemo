package com.banking.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.banking.pageObjects.LoginPageObjects;
import com.banking.utils.Base;

import junit.framework.Assert;

@Listeners(com.banking.listners.CustomeListner.class)
public class TC_LoginDDT_002 extends Base {

	@Test(dataProvider="loginData")
	public void getData(String uname, String pswd) {
		driver.get(base_URL);
		logger.info("Open Url");
		LoginPageObjects lp = new LoginPageObjects();
		lp.setUsername(uname);
		logger.info("enetering username : "+uname);
		lp.setPassword(pswd);
		logger.info("entering password : " +pswd);
		lp.clickOnLogin();
		logger.info("click on login button");
		
		Alert alert = driver.switchTo().alert();
		
		Assert.assertEquals("User is not valid", alert.getText());
		alert.accept();
		
		//Assert.assertTrue(false);
	}

	@DataProvider(name = "loginData")
	public Object[][] testData() {
		String[][] data = {{ "abcd", "abcd123" }, { "xyz123", "xyz123" } };
		return data;
	}
}
