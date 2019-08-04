package com.banking.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.utils.Base;

public class HomePageObjects extends Base {

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "New Customer")
	@CacheLookup
	WebElement linkNewCustomer;

	@FindBy(linkText = "Edit Customer")
	@CacheLookup
	WebElement linkEditCustomer;

	@FindBy(linkText = "Delete Customer")
	@CacheLookup
	WebElement linkDeleteCustomer;

	@FindBy(linkText = "New Account")
	@CacheLookup
	WebElement linkNewAccount;

	@FindBy(linkText = "Edit Account")
	@CacheLookup
	WebElement linkEditAccount;

	@FindBy(linkText = "Delete Account")
	@CacheLookup
	WebElement linkDeleteAccount;

	@FindBy(linkText = "Deposit")
	@CacheLookup
	WebElement linkDeposit;

	@FindBy(linkText = "Withdrawal")
	@CacheLookup
	WebElement linkWithdrawal;

	@FindBy(linkText = "Fund Transfer")
	@CacheLookup
	WebElement linkFundTransfer;
	
	@FindBy(linkText = "Change Password")
	@CacheLookup
	WebElement linkChangePassword;

	@FindBy(linkText = "Balance Enquiry")
	@CacheLookup
	WebElement linkBalanceEnquiry;
	
	@FindBy(linkText = "Mini Statement")
	@CacheLookup
	WebElement linkMiniStatement;
	
	@FindBy(linkText = "Customised Statement")
	@CacheLookup
	WebElement linkCustomisedStatement;
	
	@FindBy(linkText = "Log out")
	@CacheLookup
	WebElement linkLogout;

	
	public void clickNewCustomer() {
		linkNewCustomer.click();
		//return new NewCustomerPage() ;
	}
	
	public void clickEditCustomer() {
		linkEditCustomer.click();
	}
	
	

}
