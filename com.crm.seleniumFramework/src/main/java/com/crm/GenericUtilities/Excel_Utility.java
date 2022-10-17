package com.crm.GenericUtilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
    
	/*
	 * This method is used to fetch data from excel sheet
	 * 
	 * @author Shivangi singh
	 */
	public String getExcelValues(String sheetname,int RowNum,int cellNum) throws Throwable {
		
	FileInputStream fis1=new FileInputStream("./Book2.xlsx");			
    Workbook book = WorkbookFactory.create(fis1);
    Sheet sh = book.getSheet(sheetname);
    Row row = sh.getRow(RowNum);
    Cell cel = row.getCell(cellNum);
    String data = cel.getStringCellValue();
    return data;
}
}