package com.crm.organization;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

import com.crm.GenericUtilities.BaseClass;
import com.crm.GenericUtilities.Excel_Utility;
import com.crm.GenericUtilities.File_Utility;
import com.crm.GenericUtilities.Java_Utility;
import com.crm.GenericUtilities.VerificationAndValidation;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.organizationCreationPage;

//import io.github.bonigarcia.wdm.WebDriverManager;
//@Listeners(com.crm.GenericUtilities.ListenerImplementationClass.class)
public class CreateOrganizationTest extends BaseClass {	
   	@Test(retryAnalyzer=com.crm.GenericUtilities.RetryAnalyser.class)
	public void createOrganizationTest() throws Throwable {
		File_Utility flib = new File_Utility();	
		String URL = flib.getPropertyKeyValue("URL");
		String UserName =flib.getPropertyKeyValue("Username");
		String PassWord = flib.getPropertyKeyValue("Password");
		driver.get(URL);
		LoginPage login = new LoginPage(driver);
		login.login(UserName, PassWord);
		HomePage home = new HomePage(driver);
		home.clickOrganizationsLinkText();	
		organizationCreationPage OrgCreationPage = new organizationCreationPage(driver);
		OrgCreationPage.clickOrganizationimage();
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNumber();
	      Excel_Utility eutil = new Excel_Utility();		      
		String data1 = eutil.getExcelValues("Sheet1",0,0)+ranNum;
		OrgCreationPage.clickOrganizationTextField(data1);
		driver.findElement(By.className("detailedViewTextBox")).sendKeys("Test");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("A","B");
		
		OrgCreationPage.clickOnSaveButton();
		/*String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
		if(actData.contains(data1))
		{
		System.out.println("pass");
		}
		else
		{
		System.out.println("fail");
		}*/
		VerificationAndValidation validate = new VerificationAndValidation(driver);
		validate.organizationValidation(driver,data1);
		home.signout(driver);
         soft.assertAll();

	}

}
