package bca6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllRowsOrderedASC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String mySqlDbUrl = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String pwd = "navbharti";
				
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(mySqlDbUrl, username, pwd);
		
		Statement st = con.createStatement();
		
		
		
		String query = "SELECT * FROM employee order by salary";
		
		ResultSet rs = st.executeQuery(query);
		
		System.out.println("ID\tName\t\tSalary");
		
		boolean flag = false;
		
		while(rs.next()) {
			flag = true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
		}
		
		if(!flag)
			System.out.println("No row exist!!!");
		
		con.close();
	}

}
