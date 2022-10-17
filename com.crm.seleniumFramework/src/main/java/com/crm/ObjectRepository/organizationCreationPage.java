package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationCreationPage {
  //initialization
	public organizationCreationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Declaration
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement organizationcreateimage;
	
	@FindBy(name="accountname")
	private WebElement organizationNameTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	
	//getter methods
	
	public WebElement getOrganizationcreateimage() {
		return organizationcreateimage;
	}

	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	

	//Business Logic
	public void clickOrganizationimage()
	{
		organizationcreateimage.click();
	}
	
	public void clickOrganizationTextField(String data1)
	{
		organizationNameTextField.sendKeys(data1);
	}
	
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	 
}
