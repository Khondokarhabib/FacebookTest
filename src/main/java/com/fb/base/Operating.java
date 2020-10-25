package com.fb.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Operating {
	public static WebDriver driver=null;

	public static String besepath=System.getProperty("user.dir");
	public static String os=System.getProperty("os.name");
	
	public static WebDriver openBrowser(String browser) {
		if(System.getProperty("os.name").toString().contains("windows")) {
			//System.out.println("the browser is runnig on "+os +" operating system");
			 windows(browser);}
		else {//System.out.println("the browser is running on "+ os +" operating system");
				mac(browser);}
		return driver;
		}
	
	public static void windows(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",besepath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();}
			else if(browser.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", besepath+"\\src\\test\\resources\\drivers\\geckodriver.exe");
				driver=new FirefoxDriver();} 
			else {System.out.println("entered invalid a browser");}
			}
	
	public static void mac(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",besepath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();}
			else if(browser.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", besepath+"\\src\\test\\resources\\drivers\\geckodriver.exe");
				driver=new FirefoxDriver();} 
			else {System.out.println("entered invalid a browser");}
			
		
	}
	
	
	
	
	/*String os=System.getProperty("os.name");
	public static void selectOS(String os) {
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			System.out.println("The browser is running on "+System.getProperty("os.name")+" operating system");
		}else {
			System.out.println("The browser is running on "+System.getProperty("os.name")+" operating system");
		}*/
	
	public static void main(String[] args) {
		driver= openBrowser("chrome");
		driver.get("https://www.facebook.com/");
	}
}

