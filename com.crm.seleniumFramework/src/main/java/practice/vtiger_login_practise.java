package practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger_login_practise {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
      FileInputStream fis = new FileInputStream("./commondata.property.txt");
      Properties pro = new Properties();
      pro.load(fis);
      String URL = pro.getProperty("url");
      @SuppressWarnings("unused")
	String Username = pro.getProperty("username");
      String Password = pro.getProperty("pswd");
      driver.get(URL);
      System.out.print(Password);
      
      
      
      
      
	}

}
