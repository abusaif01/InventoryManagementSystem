
package com.inventory.ui;
import java.sql.*;


public class DbConnection {
	//jdbc driver name and datavase url
	static final String jdbc_driver = "com.mysql.jdbc.Driver";
	static final String db_url = "jdbc:mysql://localhost/information";
	
	static final String user = "root";
	static final String pass = "";
	static Connection conn;
	
	public static void main(String[] args){
		conn = null;
		Statement stmt= null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Connecting to database");
			
			conn = DriverManager.getConnection(db_url,user,pass);
			stmt=conn.createStatement();
			String sql;
			sql="SELECT customr_id,customer_name,account_no,amount FROM info";
			ResultSet rs =stmt.executeQuery(sql);
			while(rs.next()){
				int id=rs.getInt("customr_id");
				int amount=rs.getInt("amount");
				String name=rs.getString("customer_name");
				String account_no=rs.getString("account_no");
				
				System.out.println(id+" "+name+" "+" "+account_no+" "+amount);
				
				
				
			}
			rs.close();
			stmt.close();
			conn.close();
			
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
