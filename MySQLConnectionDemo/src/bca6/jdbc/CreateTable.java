package bca6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String mySqlDbUser = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String pwd = "navbharti";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(mySqlDbUser, username, pwd);
		
		Statement st = con.createStatement();
		
		String query = "CREATE TABLE amity_employees(e_id int, e_name varchar(30), salary double, address varchar(30))";
		
		st.executeUpdate(query);
		
		System.out.println("Table Created!!!");
		
		con.close();
	}

}
