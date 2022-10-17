package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignWithProductCreation {
	
	public campaignWithProductCreation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Declaration
	@FindBy(xpath="//img[@title='Select']")
	private WebElement createimage;
	
	@FindBy(id="search_txt")
	private WebElement searchElementField;
	
	@FindBy(name="search")
	private WebElement SearchEle;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
   
	//getters
	
	public WebElement getCreateimage() {
		return createimage;
	}

	public WebElement getSearchElementField() {
		return searchElementField;
	}

	public WebElement getSearchEle() {
		return SearchEle;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	
    //Business logic
	public void createImage() {
		createimage.click();;
	}


	public void searchElementField(String data1) {
		 searchElementField.sendKeys(data1);
		
	}


	public void SearchEle() {
		 SearchEle.click();;
	}


	public void SaveButton() {
		 SaveButton.click();;
	}


	
}
