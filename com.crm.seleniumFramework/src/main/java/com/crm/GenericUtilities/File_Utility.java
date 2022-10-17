package com.crm.GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	
	/**
	 * This method is used to launch the application
	 * 
	 * @param Key
	 * @return
	 * @throws Throwable
	 * @author Shivangi 
	 */
	public String getPropertyKeyValue(String Key) throws Throwable {
	
	//FileInputStream fis=new FileInputStream("./commondata.property.txt");
		FileInputStream fis=new FileInputStream(ipathConstant.Propertyfile_path);
		
	Properties pro=new Properties();
	pro.load(fis);
	String value = pro.getProperty(Key);	
	return value;

}

	 
}