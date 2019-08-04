package com.banking.utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

	ReadConfig rc = new ReadConfig();
	public String br = rc.getBrowser();
	public String base_URL = rc.getURL();
	public String username = rc.getUsername();
	public String password = rc.getPassword();
	
	public String newCustomerDataFile = rc.getNewCustomerExcelFile();
	public String excelSheetName = rc.getExcelSheetName();
	
	
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	// @Parameters("browser")
	public void setUp() {

		logger = Logger.getLogger("Banking");
		PropertyConfigurator.configure("G:\\QA-2018\\Workspace\\myDemo\\Log4j.properties");

		if (br.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + rc.getChromePath());
			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + rc.getfirefoxPath());
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public static void captureScreen(String tname) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(src, target);
		logger.info("screenshots taken");
	}

}
