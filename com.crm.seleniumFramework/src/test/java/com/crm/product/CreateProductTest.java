package com.crm.product;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import com.crm.GenericUtilities.BaseClass;
import com.crm.GenericUtilities.Excel_Utility;
import com.crm.GenericUtilities.File_Utility;
import com.crm.GenericUtilities.Java_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.productCreationPage;

public class CreateProductTest extends BaseClass{
   
	@Test(groups= {"Smoke test","Regression Test"})
	public void createProductTest() throws Throwable {
			
		File_Utility flib = new File_Utility();
		String URL = flib.getPropertyKeyValue("URL");
		String UserName =flib.getPropertyKeyValue("Username");
		String PassWord = flib.getPropertyKeyValue("Password");			
			driver.get(URL);
			LoginPage login = new LoginPage(driver);
			login.login(UserName, PassWord);			
			HomePage home = new HomePage(driver);
			home.productLinkText();
			productCreationPage PrdCreation = new productCreationPage(driver);
			PrdCreation.clickProductimage();
			PrdCreation.clickProductField();
					
			Java_Utility jlib = new Java_Utility();
			int ranNum = jlib.getRandomNumber();
			Excel_Utility eutil = new Excel_Utility();		      
			String data1 = eutil.getExcelValues("Sheet1",0,0)+ranNum;
			
			PrdCreation.clickonProductName(data1);
					
			home.signout(driver);

	}

}
