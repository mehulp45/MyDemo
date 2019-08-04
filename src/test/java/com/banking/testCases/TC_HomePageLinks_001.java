package com.banking.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.banking.pageObjects.HomePageObjects;
import com.banking.pageObjects.LoginPageObjects;
import com.banking.utils.Base;

public class TC_HomePageLinks_001 extends Base {
	HomePageObjects homePage;
	LoginPageObjects loginPage;

	@BeforeMethod
	public void setLogin() {
		homePage = new HomePageObjects();
		loginPage = new LoginPageObjects();
		driver.get(base_URL);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickOnLogin();
	}

	@Test
	public void clickOnNewCustomer() {
		homePage.clickNewCustomer();
	}
	
	@Test
	public void clickOnEditCustomer() {
		homePage.clickEditCustomer();
	}
	
	
}
