package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/*import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mmt_depature {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		FileInputStream fis=new FileInputStream("./mmt.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("URL");
		driver.get(URL);
		driver.manage().window().maximize();
		@SuppressWarnings("unused")
		ChromeOptions c = new ChromeOptions();	
		
		/*FileInputStream fis1=new FileInputStream("./Book2.xlsx");		
	       Workbook book = WorkbookFactory.create(fis1);
	       Sheet sh = book.getSheet("Sheet3");
	       Row row = sh.getRow(0);	       
	       Cell cel = row.getCell(0);	       
	      String data = cel.getStringCellValue();*/
		
		//from		
		String srcCity ="Bangkok, Thailand";
		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));		
		src.sendKeys("'"+srcCity+"'");
		driver.findElement(By.xpath("//p[text()='"+srcCity+"']")).click();
		Thread.sleep(1000);	  	       
	      /* Row row1 = sh.getRow(1);	       
	       Cell cel1 = row.getCell(1);	       
	      String data1 = cel.getStringCellValue();*/
	       
	      //To
		String desCity ="New Delhi, India";
		WebElement des = driver.findElement(By.xpath("//input[@id='toCity']"));
		des.sendKeys("'"+desCity+"'");
		WebElement ab = driver.findElement(By.xpath("//p[text()='"+desCity+"']"));	
		ab.click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		
		  String month = "October 2022";
	       String date = "3";	  
	       //Dynamic xpath
	      driver.findElement(By.xpath("//div[text()='"+month+"'] "+ "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();

	      driver.findElement(By.xpath("//label[@for='travellers']")).click();
	      String adult = "adult-3";
	      String children = "children-2";
	      //String infant = "infant-2";
	      driver.findElement(By.xpath("//li[@data-cy='"+adult+"']")).click();
	      driver.findElement(By.xpath("//li[@data-cy='"+children+"']")).click();
	     // driver.findElement(By.xpath("//li[@data-cy='"+infant+"']")).click();
	      
	      
	      
	}

}
