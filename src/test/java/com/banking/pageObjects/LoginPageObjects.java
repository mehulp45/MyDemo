package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.utils.Base;

public class LoginPageObjects extends Base {
	//public WebDriver driver;
	public LoginPageObjects() {
		//Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid") 
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnlogin;
	
	public void setUsername(String user) {
		 txtUserName.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		btnlogin.click();
	}
	
}
