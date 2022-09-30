package bca.jain.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCExample2 {
	public static void main(String ag[]) throws Exception
	{
		Person p = new Person(9099, "Vikash", "Singh", "Patna", "Lalbagh");
		insertPerson(p);
		//showPersons(123);
		showPersons();
		
		
	}
	
	public static void insertPerson(Person person) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
		Statement st = con.createStatement();
		String sql = "INSERT INTO Persons VALUES (" + person.getPersonID() + ",\"" + person.getLastName() + "\",\"" + person.getFirstName() + "\",\""+ person.getAddress() + "\",\"" + person.getCity() + "\")";
		System.out.println(sql);
		if( st.executeUpdate(sql) > 0)
			System.out.println("Data Inserted");
		else
			System.out.println("Data not Inserted");
		con.close();
	}
	
	public static void updateLastNameById(long id, String lname) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
		Statement st = con.createStatement();
		String sql = "UPDATE Persons SET LastName = '"+lname+"' WHERE PersonId="+id;
		System.out.println(sql);
		if( st.executeUpdate(sql) > 0)
			System.out.println("Data Updated");
		else
			System.out.println("Data not Updated");
		con.close();
	}
	
	public static void showPersons() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
		Statement st = con.createStatement();
		ResultSet set = st.executeQuery("SELECT * FROM Persons");
		while(set.next()) {
			System.out.println("Id: "+ set.getLong(1) + 
					"\nLast Name: "+ set.getString(2)+ "\nFirst Name: "+ 
					set.getString(3)+ "\nAddress: "+set.getString(4)+ 
					"\nCity: "+ set.getString(5)+"\n");
		}
		
		con.close();
		
	}
	
	public static void showPersons(long id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
		Statement st = con.createStatement();
		ResultSet set = st.executeQuery("SELECT * FROM Persons WHERE PersonId="+id);
		while(set.next()) {
			System.out.println("Id: "+ set.getLong(1) + 
					"\nLast Name: "+ set.getString(2)+ "\nFirst Name: "+ 
					set.getString(3)+ "\nAddress: "+set.getString(4)+ 
					"\nCity: "+ set.getString(5)+"\n");
		}
		
		con.close();
		
	}
	
	public static void showPersons(String lname) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
		Statement st = con.createStatement();
		ResultSet set = st.executeQuery("SELECT * FROM Persons WHERE LastName='"+lname+"'");
		while(set.next()) {
			System.out.println("Id: "+ set.getLong(1) + 
					"\nLast Name: "+ set.getString(2)+ "\nFirst Name: "+ 
					set.getString(3)+ "\nAddress: "+set.getString(4)+ 
					"\nCity: "+ set.getString(5)+"\n");
		}
		
		con.close();
		
	}
	
	public static void deletePerson(long id) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
		Statement st = con.createStatement();
		String sql = "DELETE FROM Persons WHERE PersonId="+id;
		System.out.println(sql);
		if( st.executeUpdate(sql) > 0)
			System.out.println("Data Deleted");
		else
			System.out.println("Data not Deleted");
		con.close();
	}
	
}