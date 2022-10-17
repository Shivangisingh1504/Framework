package com.crm.GenericUtilities;
//import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
	
	/*
	 * Implicit wait
	 * @author Shivangi
	 * 
	 */

	public void waitforpagetoLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/*public void waitforElementWithCustomTimeOut(WebDriver driver,WebDriver Element,int pollingTime)
	{
		FluentWait<T> wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(20));
		//wait.until((Function<? super T, V>) Element);
	}*/
	
	/*
	 * Explicit Wait
	 * 
	 * @author Shivangi
	 * 
	 */
	
	public void waitforElementtobeClickable(WebDriver driver,WebDriver element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.elementToBeClickable((By) (element)));
	}
			
	/*
	 * Switching window
	 * 
	 * @author Shivangi
	 * 
	 */
	public void switchToWindow(WebDriver driver,String PartialWindowTitle)
	{
		Set<String> allId = driver.getWindowHandles();
		Iterator<String> it=allId.iterator();
		while(it.hasNext())
		{
		String wid = it.next();
		driver.switchTo().window(wid);
		if(driver.getTitle().contains(PartialWindowTitle))
		{
		break;
		}}
	}
	
	/*
	 * Switching in between frames
	 * 
	 * @author Shivangi
	 * 
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
		
	}
	
	/*
	 * Switching in between frames
	 * 
	 * @author Shivangi
	 * 
	 */
	public void switchToFrame(WebDriver driver,String id_name_attribute)
	{
		driver.switchTo().frame(id_name_attribute);
	}
	/*
	 * To accept the alert popup
	 * 
	 * @author Shivangi
	 */

	public void switchToAlertandAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/*
	 * To dismiss the alert popup
	 * 
	 * @author Shivangi
	 */

	public void switchToAlertandDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/*
	 * to select by index
	 * 
	 * @author Shivangi
	 */
	
	public void select(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	/*
	 * to select by text
	 * 
	 * @author Shivangi
	 */
	
	public void select(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	/*
	 * To peform mousehover action
	 * 
	 */
	
	public void mouseHoverOnElement(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/*
	 * to perform right click
	 * @author Shivangi
	 * 
	 */
	
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
		
}
}