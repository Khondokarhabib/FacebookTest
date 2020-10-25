package com.fb.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.fb.base.Operating;
import com.fb.util.Utilities;

public class SmockTest {
	public static WebDriver driver;
	
	@Test(dataProvider="info", dataProviderClass= Utilities.class)//this will  connect excelFile with dataProvider
	public static void regtest(String browser) {
		
		driver=Operating.openBrowser(browser);
		
		
	}
	
	
	
	
	
	

}
