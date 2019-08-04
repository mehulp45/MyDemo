package com.banking.testCases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.pageObjects.HomePageObjects;
import com.banking.pageObjects.LoginPageObjects;
import com.banking.pageObjects.NewCustomerPage;
import com.banking.utils.Base;
import com.banking.utils.XLUtils;

public class TC_NewCustomer_DDT_001 extends Base {

	public HomePageObjects homePage;
	public LoginPageObjects loginPage;
	public NewCustomerPage newCustomerPage;

	@BeforeMethod
	public void setLogin() {
		loginPage = new LoginPageObjects();
		driver.get(base_URL);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickOnLogin();

		homePage = new HomePageObjects();
		homePage.clickNewCustomer();

		newCustomerPage = new NewCustomerPage();
	}

	//@Test(dataProvider = "NewCustomerData")
	@Test(dataProvider = "TestData")
	public void addNewCustomer2(String customerName, String gender, String dob, String adress, String city,
			String state, String pin, String mobile, String email, String pass) throws Exception {

		newCustomerPage.setName(customerName);
		newCustomerPage.setMaleGender();
		newCustomerPage.setDOB(dob);
		newCustomerPage.setAdress(adress);
		newCustomerPage.setCity(city);
		newCustomerPage.setState(state);
		newCustomerPage.setPincode(pin);
		newCustomerPage.setMobileno(mobile);
		newCustomerPage.setEmail(email);
		newCustomerPage.setPassword(pass);

		//Thread.sleep(3000);
		newCustomerPage.clickOnReset();

	}

	@DataProvider(name = "TestData")
	public Iterator<Object[]> addNewCustomer() throws Exception {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		XLUtils.setExcelFile(newCustomerDataFile, excelSheetName);
		int rows = XLUtils.getRowCount(newCustomerDataFile, excelSheetName);
		int cols = XLUtils.getCellCount(newCustomerDataFile, excelSheetName, rows);

		System.out.println("Rows : " + rows + "Cols: " + cols);

		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cols; j++) {

				String customerName = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;
				String gender = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;
				// String genderF = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1,
				// 2);
				String dob = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;
				String adress = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;
				String city = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;
				String state = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;
				String pin = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;
				String mobile = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;
				String email = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;
				String pass = XLUtils.getCellData(newCustomerDataFile, excelSheetName, i, j);
				j++;

				// System.out.println(customerName + " " + adress);

				Object data[] = { customerName, gender, dob, adress, city, state, pin, mobile, email, pass };

				myData.add(data);

			}
		}
		return myData.iterator();
	}

	@DataProvider(name = "NewCustomerData")
	public Iterator<Object[]> readExcelData() throws Exception {
		XLUtils.setExcelFile(newCustomerDataFile, excelSheetName);
		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		String customerName = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 0);
		String gender = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 1);
		// String genderF = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1,
		// 2);
		String dob = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 2);
		String adress = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 3);
		String city = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 4);
		String state = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 5);
		String pin = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 6);
		String mobile = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 7);
		String email = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 8);
		String pass = XLUtils.getCellData(newCustomerDataFile, excelSheetName, 1, 9);

		Object data[] = { customerName, gender, dob, adress, city, state, pin, mobile, email, pass };

		myData.add(data);

		return myData.iterator();

		
		
		// System.out.println(customerName + " " + adress);

	}

	/*
	 * public static void main(String[] args) throws Exception {
	 * TC_NewCustomer_DDT_001 nc = new TC_NewCustomer_DDT_001();
	 * nc.addNewCustomer(); }
	 */
}
