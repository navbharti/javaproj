package bca.jain.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	 public static void main(String[] args) {
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
			
	    //Class.forName("Sun.jdbc.odbc.JdbcOdbcDriver");
	    System.out.println("DRIVERS LOADED...");
	    //Connection con = DriverManager.getConnection("jdbc:odbc:oradsn", "root", "root@123");
	    System.out.println("CONNECTION ESTABLISHED...");
	    Statement st = con.createStatement();
	    int i = st.executeUpdate("create table kalyan (eno number (4), ename varchar2 (15))");
	    System.out.println("TABLE CREATED...");
	    con.close();
	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	  } // main
	}  // CreateTable



