package practice;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Data_Provider_Test {

	@Test(dataProvider="Data_Provider_Test")
	public void companyDetails(String name, String phnum) throws Throwable
	{
		 String key = "webdriver.chrome.driver";
	     String value = "./chromedriver.exe";
	    System.setProperty(key, value);
	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
	driver.findElement(By.name("name")).sendKeys(name);
	driver.findElement(By.name("phnum")).sendKeys(phnum);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	driver.quit();
	 	}	
		
	@DataProvider
	public Object[][] Data_Provider_Test()
	{
		Object[][] ob=new Object[2][2] ;
		ob[0][1]="Test_Yantra";
		ob[0][1]="998067321";
		
		ob[1][0]="ABC";
		ob[1][1]="996747321";
		
		return ob;
	}
	}

