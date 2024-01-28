package bca6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMultipleRows {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String mySqlDbUrl = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String pwd = "navbharti";
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(mySqlDbUrl, username, pwd);
		
		Statement st = con.createStatement();
		
		System.out.print("Enter salary to delete: ");
		
		double salary = sc.nextDouble();
		
		String query = String.format("delete from employee where salary='%f'", salary);
		
		int rowsAffected = st.executeUpdate(query);
		
		System.out.println(rowsAffected + " rows deleted!!!");
		
		con.close();
	}

}
