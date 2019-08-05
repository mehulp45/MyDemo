package com.banking.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.utils.Base;

public class NewCustomerPage extends Base {

	public NewCustomerPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Add New Customer']")
	@CacheLookup
	WebElement verifyNewCustomerPageTitle;

	@FindBy(name = "name")
	@CacheLookup
	WebElement txtname;

	// input[@value='m']
	// input[@value='f']

	@FindBy(xpath = "//input[@value='m']")
	@CacheLookup
	WebElement rdMale;

	@FindBy(xpath = "//input[@value='f']")
	@CacheLookup
	WebElement rdFemale;

	@FindBy(xpath = "//input[@type='date']")
	@CacheLookup
	WebElement date;

	@FindBy(tagName = "textarea")
	@CacheLookup
	WebElement taAddress;

	@FindBy(name = "city")
	@CacheLookup
	WebElement txtCity;

	@FindBy(name = "state")
	@CacheLookup
	WebElement txtState;

	@FindBy(name = "pinno")
	@CacheLookup
	WebElement txtPinno;

	@FindBy(name = "telephoneno")
	@CacheLookup
	WebElement txtTelephoneno;

	@FindBy(name = "emailid")
	@CacheLookup
	WebElement txtEmailid;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(tagName = "submit")
	@CacheLookup
	WebElement btnSubmit;

	@FindBy(xpath = "//input[@type='reset']")
	@CacheLookup
	WebElement btnReset;

	// label[text()='Date Field must not be blank']
	@FindBy(xpath = "//label[text()='Date Field must not be blank']")
	@CacheLookup
	WebElement dateErrMsg;

	@FindBy(xpath = "//label[text()='City Field must not be blank']")
	@CacheLookup
	WebElement cityErrMsg;

	@FindBy(xpath = "//label[text()='State must not be blank']")
	@CacheLookup
	WebElement stateErrMsg;

	@FindBy(xpath = "//label[text()='PIN Code must not be blank']")
	@CacheLookup
	WebElement pinErrMsg;

	@FindBy(xpath = "//label[text()='Mobile no must not be blank']")
	@CacheLookup
	WebElement mobileErrMsg;

	@FindBy(xpath = "//label[text()='Email-ID must not be blank']")
	@CacheLookup
	WebElement emailErrMsg;

	
	// Actions
	public void setName(String customerName) {
		txtname.sendKeys(customerName);
	}

	public void setMaleGender() {
		rdMale.click();
	}

	public void setFemaleGender() {
		rdFemale.click();
	}
	
	public void setDOB(String dob) {
		date.sendKeys(dob);
	}
	
	public void setAdress(String adress) {
		taAddress.sendKeys(adress);
	}
	
	public void setCity(String city) {
		txtCity.sendKeys(city);
	}
	
	public void setState(String state) {
		txtState.sendKeys(state);
	}
	
	public void setPincode(String pincode) {
		txtPinno.sendKeys(pincode);
	}
	
	public void setMobileno(String mobileno) {
		txtTelephoneno.sendKeys(mobileno);
	}
	
	public void setEmail(String email) {
		txtEmailid.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickOnReset() {
		btnReset.click();
	}
	
}
