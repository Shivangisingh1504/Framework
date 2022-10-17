package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTest {
	
	@Test(dataProvider="dataproviderTest")
 public void bookTicket(String src, String dest)
 {
	System.out.println("Book ticket from "+src+"to"+dest); 
 }
 @DataProvider
 public Object[][] dataproviderTest()
 {
	 Object[][] objArr=new Object[5][2];
	 objArr[0][0]="Bangalore";
	 objArr[0][1]="Goa";
	 
	 objArr[1][0]="Bangalore";
	 objArr[1][1]="Mysore";
	 
	 objArr[2][0]="Mumbai";
	 objArr[2][1]="Goa";
	 
	 objArr[3][0]="Mysore";
	 objArr[3][1]="Bangalore";
	 
	 objArr[4][0]="Kerala";
	 objArr[4][1]="Bangalore";
	return objArr;

	 
	 
	 
 }
}
