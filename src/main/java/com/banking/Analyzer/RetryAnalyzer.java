package com.banking.Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int cnt = 0;
	int retryLimit = 2;

	public boolean retry(ITestResult result) {
		if(cnt<retryLimit) {
			cnt++; 
			return true;
		}
		return false;
	}

}
