package bca6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMultipleRows {

	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String mySqlDbUrl = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String pwd = "navbharti";
		
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection(mySqlDbUrl, username, pwd);
		
		Statement st = con.createStatement();
		
		System.out.print("Enter Old Salayer: ");
		double oldSalary = sc.nextDouble();
		
		System.out.print("Enter New Salary: ");
		double newSalary = sc.nextDouble();
		
		String query = String.format("update employee set salary=%f where salary<%f", newSalary, oldSalary);
	
		int rowsAffected = st.executeUpdate(query);
		
		System.out.println(rowsAffected + " rows Salary Updated!!!");
		
		con.close();
	}

}
