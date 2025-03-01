package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo 
{

	public static void main(String[] args) throws Exception, IllegalAccessException, ClassNotFoundException 
	{
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "db";
		String dburl = url+dbName;
		String userName ="root";
		String password = "root";
		
		// Create an object for driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connect to msql database system
		Connection connection = DriverManager.getConnection(dburl, userName, "");
		
		//Executing the sql queries on the command db database
		if(!connection.isClosed())
		{
			System.out.println("successfully  connected to DB database");
			
			// Execute the query to retrive the employee table records
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from Employee");
			
			while(resultset.next())
			{
				System.out.println(resultset.getString("Name")+"---"+resultset.getString("Location")+"---"+resultset.getInt("Experience"));
			}
			
		}
		
	}

}
