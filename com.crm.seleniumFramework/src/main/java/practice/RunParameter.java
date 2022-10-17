package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunParameter {
	
	@Test
	public void method()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		WebDriver driver=null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();				
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();				
		}
		else
			{
			driver = new ChromeDriver();	
			}
			String URL = System.getProperty("url");
			driver.get(URL);
			
			String Username = System.getProperty("username");
			driver.findElement(By.name("user_name")).sendKeys(Username);
			
			String Password= System.getProperty("password");
			driver.findElement(By.name("user_password")).sendKeys(Password);
			
			
			driver.findElement(By.id("submitButton")).click();
		}
		
	}


