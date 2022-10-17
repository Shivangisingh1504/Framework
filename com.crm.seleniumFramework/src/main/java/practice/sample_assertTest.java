package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample_assertTest {

	@Test
	public void createCustomerTest()
	{
		System.out.println("step 1");
		System.out.println("step 2");
		Assert.assertEquals("a","b");
		System.out.println("step 3");
		System.out.println("step 4");
		
	}
	
	@Test
	public void modifyCustomerTest()
	{
		System.out.println("step 1");
		System.out.println("step 2");		
		System.out.println("step 3");
		System.out.println("step 4");
		
	}
}
