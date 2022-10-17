package com.crm.GenericUtilities;

import java.util.Random;

public class Java_Utility {
	/*
	 * This method is used to avoid duplicates
	 * 
	 * @author Shivangi Singh
	 */
	
	public int getRandomNumber()
	{
		Random ran =new Random();
		int RanNum = ran.nextInt(1000);
		return RanNum;
	}

}
