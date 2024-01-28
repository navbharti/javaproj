import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Register JDBC Driver
		//com.mysql.cj.jdbc.Driver
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager.registerDriver(new Driver());
		
		//2. Establish Connection
		//jdbc:mysql://localhost:3306/
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "navbharti");
		
		//3. Create statement object
		Statement st = con.createStatement();
		
		//4. Execute Query and store the returned result in ResultSet object
		ResultSet rs = st.executeQuery("Select * from students");
		
		//5. Process the Result Set object
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(3)+" "+rs.getDouble(4)+" "+rs.getString(5));
		}
		
		//6. close the Connection
		con.close();
		
	}

}
