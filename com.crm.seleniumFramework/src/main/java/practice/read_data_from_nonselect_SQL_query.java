package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class read_data_from_nonselect_SQL_query {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Driver driverref =new Driver();
	    DriverManager.registerDriver(driverref);
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra","root","root");
	    Statement stat = con.createStatement(); 
	    String query = "insert into student(first_name) values ('ramu')";
	    int result = stat.executeUpdate(query);
	    if(result==1)
	    {
	    	System.out.println("user is created");
	    	
	    }
	    else
	    	
	    {
	    	System.out.println("not created");
	    }
	    con.close();
	}

}
