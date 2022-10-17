package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDeletionPage {
	//initialization
			public productDeletionPage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			//Declaration
			@FindBy(linkText="Products")
			private WebElement productcreateimage;
			
			@FindBy(xpath="//img[@alt='Create Product...']")
			private WebElement ProductField;
			
			@FindBy(name="productname")
			private WebElement productName;
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement savebutton;
			
			@FindBy(xpath="//input[@value='Delete']")
			private WebElement DeleteField;
	        
			//getters
			public WebElement getProductcreateimage() {
				return productcreateimage;
			}

			public WebElement getProductField() {
				return ProductField;
			}

			public WebElement getProductName() {
				return productName;
			}
			
			public WebElement getSavebutton() {
				return savebutton;
			}

			public WebElement getDeleteField() {
				return DeleteField;
			}

			//Business Logic
			public void clickProductimage()
			{
				productcreateimage.click();
			}
			
			public void clickProductField()
			{
				ProductField.click();
			}
			
			public void clickonProductName(String data)
			{
				productName.sendKeys(data);
			}
			
			public void clickonSavebutton()
			{
				savebutton.click();
			}
			public void clickonDeleteButton()
			{
				DeleteField.click();
			}
	
}
