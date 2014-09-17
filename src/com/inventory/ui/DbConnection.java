
package com.inventory.ui;
import java.sql.*;


public class DbConnection {
	//jdbc driver name and datavase url
	static final String jdbc_driver = "com,mysql.jdbc.Driver";
	static final String db_url = "jdbc:mysql://localhost/IMS";
	
	static final String user = "username";
	static final String pass = "password";
	static Connection conn;
	
	public static void main(String[] args){
		conn = null;
		Statement stmt= null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Connecting to database");
			
			conn = DriverManager.getConnection(db_url,user,pass);
			
			//ekhan theke kisu  bujlam na......
		}catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      
		      }// nothing we can do
		      
		      
		      // vai try catch vako buji na....copy marlam sudu
		
		
	}
		
	}
	

}
