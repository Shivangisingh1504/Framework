package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class read_data_from_Sql_query {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
    Driver driverref =new Driver();
    DriverManager.registerDriver(driverref);
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra","root","root");
    Statement stat = con.createStatement();    
    String query = "select * from student";
    ResultSet Result = stat.executeQuery(query);
    while(Result.next())
    {
    	System.out.println(Result.getString(1));
    }
    con.close();
	}

}
