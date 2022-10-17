package practice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample_excel {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileInputStream fis = new FileInputStream("./Book2.xlsx");
       Workbook book = WorkbookFactory.create(fis);
      Sheet sh = book.getSheet("Sheet1");
       Row row = sh.getRow(0);
       Cell cel = row.getCell(0);
       RichTextString data = cel.getRichStringCellValue();
       System.out.print(data);
       
       
   
       
       
       
	}

}
