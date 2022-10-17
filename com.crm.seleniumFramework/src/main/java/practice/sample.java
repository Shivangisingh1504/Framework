package practice;

import org.testng.annotations.Test;

public class sample {

	@Test(priority=1)
	public void CreateCustomerTest()
	{
		System.out.println("Cx created");
		int arr[]= {1,2,3};
		System.out.println(arr[5]);
	}
	
	@Test(dependsOnMethods="CreateCustomerTest")
	public void modifyCustomerTest()
	{
		System.out.println("Cx modified");
	}
	
	@Test(dependsOnMethods="CreateCustomerTest")	
	public void deleteCustomerTest()
	{
		System.out.println("Cx deleted");
	}
}
