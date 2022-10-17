package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignCreationPage {
	//initialization
		public campaignCreationPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//Declaration
		@FindBy(xpath="//img[@alt='Create Campaign...']")
		private WebElement Campaigncreateimage;
		
		@FindBy(name="campaignname")
		private WebElement campaigneNameTextField;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveButton;
         
		
		//getter methods
		public WebElement getCampaigncreateimage() {
			return Campaigncreateimage;
		}

		public WebElement getCampaigneNameTextField() {
			return campaigneNameTextField;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		

		//Business Logic
		public void clickCampaignimage()
		{
			Campaigncreateimage.click();
		}
		
		public void clickCampaignTextField(String data1)
		{
			campaigneNameTextField.sendKeys(data1);
		}
		
		public void clickOnSaveButton()
		{
			saveButton.click();
		}	
		

		
	}



