package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertTest {
	@Test
	
	public void createcxTest()
	{
	System.out.println("Step 1");
	System.out.println("Step 2");
	SoftAssert soft = new SoftAssert();
	soft.assertEquals("a","b");
	System.out.println("Step 3");
	
	System.out.println("Step 4");
	soft.assertAll();
	}

}
