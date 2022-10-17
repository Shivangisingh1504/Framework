package com.crm.product;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import com.crm.GenericUtilities.BaseClass;
import com.crm.GenericUtilities.Excel_Utility;
import com.crm.GenericUtilities.File_Utility;
import com.crm.GenericUtilities.Java_Utility;
import com.crm.GenericUtilities.WebDriver_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.productDeletionPage;

public class Delete_ProductTest extends BaseClass{
	
	@Test(groups= {"Smoke test"})
	public void DeleteProductTest() throws Throwable {
			
		File_Utility flib = new File_Utility();
		String URL = flib.getPropertyKeyValue("URL");
		String UserName =flib.getPropertyKeyValue("Username");
		String PassWord = flib.getPropertyKeyValue("Password");					
			driver.get(URL);
			LoginPage login = new LoginPage(driver);
			login.login(UserName, PassWord);	
			HomePage home = new HomePage(driver);
			home.productLinkText();
			productDeletionPage prdDelete = new productDeletionPage(driver);
			prdDelete.clickProductimage();			
			prdDelete.clickProductField();	
			
			Java_Utility jlib = new Java_Utility();
			int ranNum = jlib.getRandomNumber();
			Excel_Utility eutil = new Excel_Utility();		      
			String data1 = eutil.getExcelValues("Sheet1",0,0)+ranNum;
			
			prdDelete.clickonProductName(data1);
			prdDelete.clickonSavebutton();
			prdDelete.clickonDeleteButton();
			WebDriver_Utility wUtil = new WebDriver_Utility();
			wUtil.switchToAlertandAccept(driver);
				
			home.signout(driver);

	}

}
