package com.banking.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	public FileInputStream fis;
	public Properties p;
	
	public ReadConfig() {
		try {
			fis = new FileInputStream("./configuration/config.properties");
			p = new Properties();
			p.load(fis);
		} catch (Exception e) {
			System.out.println("File Not Found" + e.getMessage());
		}
	}
	
	public String getBrowser() {
		return p.getProperty("browser");
	}
	public String getURL() {
		return p.getProperty("base_URL");
	}
	
	public String getUsername() {
		return p.getProperty("username");
	}
	
	public String getPassword() {
		return p.getProperty("password");
	}
	
	public String getChromePath() {
		return p.getProperty("chromePath");
	}
	
	public String getfirefoxPath() {
		return p.getProperty("ffPath");
	}
	

}
