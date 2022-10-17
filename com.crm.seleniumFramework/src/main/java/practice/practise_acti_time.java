package practice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise_acti_time {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("./commondata.property.txt");
		Properties pobj = new Properties();
		pobj.load(fis);
		String Browser =pobj.getProperty("Browser");
		System.out.println(Browser);
		String URL =pobj.getProperty("URL");
		String Username =pobj.getProperty("Username");
		String password =pobj.getProperty("Password");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		

	}

}
