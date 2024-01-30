import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSingleRow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//1. load class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. establish
		//jdbc:mysql://localhost:3306/?user=root
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "navbharti");;

		//3. create statement object 
		Statement st = con.createStatement();
		
		//String query = "insert into students values (555, 'Manohar', 22, 98.0, 'male')";
		//UPDATE table_name
		//SET column1 = value1, column2 = value2, ...
		//		WHERE condition;
		//String query = "update students set name = 'Abhishek' where id = 555";
		
		String query = "delete from students where id = 555";
		
		//4. exectute query
		int rowAffected = st.executeUpdate(query);
		
		System.out.println(rowAffected + " row deleted Successfully!!!");
		
		//5. close connection
		con.close();
	}

}
