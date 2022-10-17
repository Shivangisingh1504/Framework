package com.crm.campaign;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.crm.GenericUtilities.BaseClass;
import com.crm.GenericUtilities.Excel_Utility;
import com.crm.GenericUtilities.File_Utility;
import com.crm.GenericUtilities.Java_Utility;
import com.crm.GenericUtilities.WebDriver_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.campaignCreationPage;
import com.crm.ObjectRepository.campaignWithProductCreation;
import com.crm.ObjectRepository.productCreationPage;

public class CreateCampaignWithProductTest extends BaseClass{

	@Test(groups= {"Regression Test"})
	public void createcampaignWithProductTest() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebDriver_Utility wUtil = new WebDriver_Utility();
		File_Utility flib = new File_Utility();
		String URL = flib.getPropertyKeyValue("URL");
		String UserName =flib.getPropertyKeyValue("Username");
		String PassWord = flib.getPropertyKeyValue("Password");
		driver.get(URL);
		LoginPage login = new LoginPage(driver);
		login.login(UserName, PassWord);		
		campaignWithProductCreation prodCreat = new campaignWithProductCreation(driver);
        HomePage home = new HomePage(driver);
        
		//product data
        home.productLinkText();    		
        productCreationPage prodCreation = new productCreationPage(driver);
        prodCreation.clickProductimage();
        prodCreation.clickProductField(); 	
        
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNumber();
		Excel_Utility eutil = new Excel_Utility();		      
		String data1 = eutil.getExcelValues("Sheet1",0,0)+ranNum;
		prodCreation.clickonProductName(data1);
		prodCreation.Savebutton();
		//Navigate to Campaign
		home.moreLink(driver);
		home.campaignsLinkText();
		campaignCreationPage CampCreate = new campaignCreationPage(driver);
		CampCreate.clickCampaignimage();
		
		Excel_Utility eutil1 = new Excel_Utility();		      
		String data = eutil1.getExcelValues("Sheet1",0,0)+ranNum;
		CampCreate.clickCampaignTextField(data1);
		prodCreat.createImage();
				
		//Window Switching		
		wUtil.switchToWindow(driver, "Products&action");       
        prodCreat.searchElementField(data1);
        prodCreat.SearchEle();
       
		//Dynamic Xpath
		driver.findElement(By.xpath("//a[text()='"+data1+"']")).click();
		//Switch back Window
		wUtil.switchToWindow(driver, "Campaigns&action");
         prodCreat.SaveButton();				
		String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();

		if(actData.contains(data))
		{
		System.out.println("pass");
		}
		else
		{
		System.out.println("fail");
		}
		home.signout(driver);

	}

}
