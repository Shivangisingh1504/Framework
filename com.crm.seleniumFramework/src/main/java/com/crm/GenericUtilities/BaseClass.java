package com.crm.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	File_Utility flib1 = new File_Utility();
	public static WebDriver sDriver;
	
	@BeforeSuite(groups= {"Smoke test","Regression Test"})
	public void BS() 
	{
	System.out.println("Database Connection");
	}
	
	@BeforeTest(groups= {"Smoke test","Regression Test"})
	public void BT()
	{
	System.out.println("Execute in Parallel Mode");
	}
	
	@BeforeClass(groups= {"Smoke test","Regression Test"})
	public void BC()
	{
		System.out.println("Launching");
	}
	
	//@Parameters("BROWSER")
	@BeforeMethod(groups= {"Smoke test","Regression Test"})
	//public void BM(String BROWSER) throws Throwable
	public void BM() throws Throwable
	{
	System.out.println("Login To Application");
	
	File_Utility flib1 = new File_Utility();
	String Browser= flib1.getPropertyKeyValue("browser");
		if(Browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();				
	}
	else if(Browser.equalsIgnoreCase("Firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();				
	}
	else
		{
		driver = new ChromeDriver();	
		}
		sDriver = driver;
	}
	
	@AfterMethod(groups= {"Smoke test","Regression Test"})
	public void AM()
	{
	System.out.println("LogOut");
	}
	
	@AfterClass(groups= {"Smoke test","Regression Test"})
	public void AC()
	{
	System.out.println("Close the Browser");
	}
	
	@AfterTest(groups= {"Smoke test","Regression Test"})
	public void AT()
	{
	System.out.println("Executed Successfully");
	}
	
	@AfterSuite(groups= {"Smoke test","Regression Test"})
	public void AS()
	{
	System.out.println("Database Closed");
	}
	
}
