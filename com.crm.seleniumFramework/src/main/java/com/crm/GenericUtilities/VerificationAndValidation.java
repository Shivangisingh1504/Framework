package com.crm.GenericUtilities;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationAndValidation {

	public VerificationAndValidation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="span.dvHeaderText")
	private WebElement actualCampaignData;
	
	@FindBy(css="span.dvHeaderText")
	private WebElement actualOrganizationData;

	//getters
	public WebElement getActualCampaignData() {
		return actualCampaignData;
	}

	public WebElement getActualOrganizationData() {
		return actualOrganizationData;
	}
	
	public void organizationValidation(WebDriver driver,String data1)
	{
		String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
		if(actData.contains(data1))
		{
		System.out.println("pass");
		}
		else
		{
		System.out.println("fail");
		}
	}
	public String verificationOfOrganizationDataCreated()
	{
		return actualOrganizationData.getText();
		
	}
	public String verificationOfCampaignDataCreated()
	{
		return actualCampaignData.getText();
		
	}
	
	
}
