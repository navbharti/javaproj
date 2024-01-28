package bca6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String mySqlDbUrl = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String pwd = "navbharti";
		
		String query = "drop table amity_employees";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(mySqlDbUrl, username, pwd);
		
		Statement st = con.createStatement();
		
		st.executeUpdate(query);
		
		System.out.println("Table is dropped!!!");
		
		con.close();
	}

}
