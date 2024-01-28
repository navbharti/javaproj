package bca6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMultipleRows {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String mySqlDbUrl = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String pwd = "navbharti";
		Scanner sc = new Scanner(System.in);
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(mySqlDbUrl, username, pwd);
		
		Statement st = con.createStatement();
		
		while(true) {
			System.out.print("Enter Employee Id: ");
			int id = sc.nextInt();
			
			System.out.print("Enter Employee Name: ");
			String name = sc.next();
			
			System.out.print("Enter Employee Salary: ");
			double salary = sc.nextDouble();
			
			String query = String.format("INSERT INTO Employee values (%d, '%s', %f)", id, name, salary);
			
			int rowAffected = st.executeUpdate(query);
			
			System.out.println(rowAffected + " row inserted!!!");
			
			System.out.print("Want to Insert more row? ");
			
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("no"))
				break;
				
		}
		
	}

}
