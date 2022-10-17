package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productCreationPage {
	
	//initialization
		public productCreationPage(WebDriver driver)
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
		private WebElement save;
        
		

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
		
		public WebElement getSave() {
			return save;
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
		
       public void Savebutton() {
    	   save.click();
       }
}
