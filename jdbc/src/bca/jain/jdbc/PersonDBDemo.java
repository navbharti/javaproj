package bca.jain.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PersonDBDemo {
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
	public static final String URL = "jdbc:mysql://localhost/jdbcdb";
	public static String user = "root";
	public static String password = "root@123";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		
		Class.forName(DRIVER_CLASS);
		
		
		Connection connection = DriverManager.getConnection(URL, user, password);

	}
	
    private Connection createConnection() {
    	 
        Connection connection = null;
        try {
            //Step 3: Establish Java MySQL connection
            connection = DriverManager.getConnection(URL, user, password);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }   
     
    public static Connection getConnection() {
        return instance.createConnection();
    }

}
