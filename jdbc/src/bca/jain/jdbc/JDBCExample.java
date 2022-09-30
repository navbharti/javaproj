package bca.jain.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String ag[])
	{
		Connection con;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
			Statement st = con.createStatement();
			st.executeUpdate ("CREATE TABLE COFEE1" + "(COF_Name VARCHAR(32),SUB_ID INTEGER,PRICE FLOAT,SALES INTEGER,TOTAL INTEGER)");
		}
		catch(ClassNotFoundException e)
	
		{
			System.out.println(e.toString());
	
		}
	
		catch(SQLException e)
		{
			System.out.println(e.toString());
		}
	}

}