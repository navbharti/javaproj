package bca6.jdbc.apps.employeeManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String mySqlDbUrl = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String pwd = "navbharti";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(mySqlDbUrl, username, pwd);
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		while(true) {
			menu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1: //System.out.println("calling create new employee module");
				emp.addEmployee(con, sc);
				break;
			case 2: //System.out.println("calling remove existing employee module");
				emp.removeEmployeeById(con, sc);
				break;
			case 3: //System.out.println("calling update existing employee module");
				
				break;
			case 4: emp.displayEmployeeById(con, sc);
				break;
			case 5: emp.sortById(con);
			break;
			case 10: System.out.println("Bye! Bye ... ");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice... ");
			
			}
		}
		
	}
	
	public static void menu() {
		System.out.println("1. Add Employee");
		System.out.println("2. Remove Employee By ID");
		System.out.println("3. Remove Employee By Name");
		System.out.println("4. Remove Employee By Salary");
		System.out.println("5. Update Employee Name");
		System.out.println("6. Update Employee Salary");
		System.out.println("7. Get Employee By ID");
		System.out.println("8. Get Employee By Name");
		System.out.println("9. Get Employee By Salary");
		System.out.println("10. Sort by ID");
		System.out.println("11. Sort by Name");
		System.out.println("12. Sort by Salary");
		System.out.println("20. Exit");
		System.out.print("Your Choice...");
	}

}
