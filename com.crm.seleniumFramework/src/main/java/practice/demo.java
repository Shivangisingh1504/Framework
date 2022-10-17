package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
      String key = "webdriver.chrome.driver";
      String value = "./chromedriver.exe";
      System.setProperty(key, value);
   @SuppressWarnings("unused")
WebDriver Driver =new ChromeDriver();
      
	}

}
