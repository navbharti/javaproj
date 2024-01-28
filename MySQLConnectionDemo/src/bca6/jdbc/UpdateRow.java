package bca6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String mySqlDbUrl = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String pwd = "navbharti";
		
		//Scanner sc = new Scanner(System.in);
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(mySqlDbUrl, username, pwd);
		
		Statement st = con.createStatement();
		
		String query = "update employee set salary=10000 where name='navbharti'";
		
		int rowAffected = st.executeUpdate(query);
		
		System.out.println(rowAffected + " row Updated!!!");
		
		con.close();
	}

}
