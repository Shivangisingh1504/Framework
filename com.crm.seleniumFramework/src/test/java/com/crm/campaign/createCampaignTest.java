package com.crm.campaign;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.GenericUtilities.BaseClass;
import com.crm.GenericUtilities.Excel_Utility;
import com.crm.GenericUtilities.File_Utility;
import com.crm.GenericUtilities.Java_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.campaignCreationPage;

public class createCampaignTest extends BaseClass{
	
               @Test(groups= {"Regression Test"})
				public void createcampaigntest() throws Throwable {
				
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				File_Utility flib = new File_Utility();
				String URL = flib.getPropertyKeyValue("URL");
				String UserName =flib.getPropertyKeyValue("Username");
				String PassWord = flib.getPropertyKeyValue("Password");

				driver.get(URL);
				LoginPage login = new LoginPage(driver);
				login.login(UserName, PassWord);
				
				HomePage home = new HomePage(driver);
				home.moreLink(driver);
				home.campaignsLinkText();
				
				campaignCreationPage camcreatePage = new campaignCreationPage(driver);
				
				camcreatePage.clickCampaignimage();
				Java_Utility jlib = new Java_Utility();
				int ranNum = jlib.getRandomNumber();
				Excel_Utility eutil = new Excel_Utility();		      
				String data1 = eutil.getExcelValues("Sheet1",0,0)+ranNum;
				
			       camcreatePage.clickCampaignTextField(data1);
			       camcreatePage.clickOnSaveButton();
								
					String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();

					if(actData.contains(data1))
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


