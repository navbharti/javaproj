package bca6.jdbc.apps.employeeManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	public Employee() {
		
	}
	
	public void addEmployee(Connection con, Scanner sc) throws SQLException {
		Statement st = con.createStatement();
		System.out.print("Employee ID: ");
		int id = sc.nextInt();
		
		System.out.print("Employee Name: ");
		String name = sc.next();
		
		System.out.print("Employee Salary: ");
		double salary = sc.nextDouble();
		
		String query = String.format("Insert Into employee values(%d, '%s', %f)", id, name, salary);
		
		int rowAffected = st.executeUpdate(query);
		
		System.out.println(rowAffected + " Record Inserted!!!");
		//con.close();
	}
	
	public void displayEmployeeById(Connection con, Scanner sc) throws SQLException {
		Statement st = con.createStatement();
		System.out.print("Employee ID: ");
		int id = sc.nextInt();
		String query = "Select * from employee where enpid = " + id;
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			String emp = String.format("Employee: [%d\t%s\t%f]", rs.getInt(1), rs.getString(2), rs.getDouble(3));
			//System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+ " "+rs.getDouble(3));
			System.out.println(emp);
		}
		//con.close();
	}
	
	public void sortById(Connection con) throws SQLException {
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("Select * from employee order by enpid");
		System.out.println("--------------------------------------");
		System.out.println("ID\tName\t\t\tSalary");
		System.out.println("--------------------------------------");
		boolean flag = false;
		while(rs.next()) {
			flag = true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+ rs.getDouble(3));
		}
		System.out.println("--------------------------------------");
		if(flag==false)
			System.out.println("No Recorde Found!!!");
	}
	
	public void removeEmployeeById(Connection con, Scanner sc) throws SQLException {
		Statement st = con.createStatement();
		System.out.print("Employee ID: ");
		int id = sc.nextInt();
		String query = "delete from employee where enpid = "+id;
		int rowAffected = st.executeUpdate(query);
		System.out.println(rowAffected + " Record Deleted!!!");
	}
}
