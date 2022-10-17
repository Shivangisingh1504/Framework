package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilities.WebDriver_Utility;

public class HomePage
{ 
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Declaration
   @FindBy(linkText="Products")
   private WebElement productLinkText;
   
   @FindBy(linkText="More")
   private WebElement moreLink;
   
   @FindBy(name="Campaigns")
   private WebElement campaignsLinkText;
   
   @FindBy(linkText="Organizations")
   private WebElement organizationsLinkText;
   
   @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
   private WebElement signoutImg;
   
   @FindBy(linkText="Sign Out")
   private WebElement signoutLinkText;
   
   
 //getter methods

   
public WebElement getSignoutImg() {
	return signoutImg;
}


public WebElement getSignoutLinkText() {
	return signoutLinkText;
}


public WebElement getProductLinkText() {
	return productLinkText;
}


public WebElement getMoreLink() {
	return moreLink;
}


public WebElement getCampaignsLinkText() {
	return campaignsLinkText;
}


public WebElement getOrganizationsLinkText() {
	return organizationsLinkText;
}

//product
public void productLinkText()
{
	productLinkText.click();
}  

//more link
public void moreLink(WebDriver driver)
{
	WebDriver_Utility wlib = new WebDriver_Utility();
	wlib.mouseHoverOnElement(driver, moreLink);
}

//campaign
public void campaignsLinkText()
{
	campaignsLinkText.click();
}

//organization
public void clickOrganizationsLinkText()
{
	organizationsLinkText.click();
}

//sign out
public void signout(WebDriver driver)
{
	Actions act = new Actions(driver);
	act.moveToElement(signoutImg).perform();
	signoutLinkText.click();
}
}
