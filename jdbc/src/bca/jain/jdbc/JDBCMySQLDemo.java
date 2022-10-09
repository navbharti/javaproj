package bca.jain.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
import com.theopentutorials.jdbc.db.DbUtil;
import com.theopentutorials.jdbc.db.JDBCMySQLConnection;
import com.theopentutorials.jdbc.to.Employee;
 */
public class JDBCMySQLDemo {
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter the EmployeeID:");
         
        long id;
        try {
            //employeeId = Integer.parseInt(br.readLine());
        	id = 123;
            JDBCMySQLDemo demo = new JDBCMySQLDemo();
            Person person = demo.getPerson(id);
            System.out.println(person);           
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        Person p = new Person(111, "Deepak", "Mangal", "Mathura", "Mathura City");
        
    }
 
    public Person getPerson(long id)  {      
        ResultSet rs = null;
        Connection connection = null;
        Statement statement = null; 
         
        Person person = null;
        //String query = "SELECT * FROM Persons WHERE PersonId=" + id;
        String query = "SELECT * FROM Persons";
        try {           
            connection = JDBCMySQLConnection.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
             
            if (rs.next()) {
                person = new Person();
                person.setPersonID(rs.getInt("PersonId"));
                person.setFirstName(rs.getString("FirstName"));
                person.setLastName(rs.getString("LastName"));
                person.setAddress(rs.getString("Address"));
                person.setCity(rs.getString("City")); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return person;
    }
    
    public boolean insertPerson(Person person) throws SQLException {
    	String query = "INSERT INTO person(PersonId,LastName, FirstName, Address, City) "
                + "VALUES("+person.getPersonID()+","+person.getLastName()+","+person.getFirstName()+","+person.getAddress()+","+person.getCity()+")";

    	ResultSet rs = null;
        Connection connection = null;
        Statement statement = null; 
    	connection = JDBCMySQLConnection.getConnection();
        statement = connection.createStatement();
        rs = statement.executeQuery(query);
        if(rs.)
    	
    	return false;
    }
}



class JDBCDemo{
	public static void main(String args[]) {
		//1. Load and Register the Driver Class
		class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Establish Databse Connection using DB URL and credential
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
		
		//3. Create Statement object
		Statement st = con.createStatement();
		
		//4. send and execute database query
		ResultSet rs = st.executeQuery("SELECT * FROM Persons");
		
		
		//5. process the ResultSet object
		while(rs.next()) {
			
		}
		
		//6. close the conneciton
		con.close();	
		
	}
}