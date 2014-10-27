package com.inventory.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.inventory.model.User;

public class UserDatabaseManager {
	Connection connection;
	Statement statement;
	
	public User readUserFromDatabse(String userName,String password)
	{
		
		User user=new User();
		initConnection();
		String sql;
		//System.out.println(userName);
		sql="SELECT * FROM user WHERE userName='"+userName+"' and password='"+password+"'";
		//System.out.println(sql);

		try {
			//sql="SELECT * FROM user WHERE userName='"+userName+"' and password='"+password+"'";
			ResultSet result=statement.executeQuery(sql);
			int i=1;
			result.first();
			 user.setId(result.getInt(i++));
			 user.setFirstName(result.getString(i++));
			 user.setEmail(result.getString(i++));
			 user.setPasswprd(result.getString(i++));
			return user;
			
		}
		
		
		catch (SQLException e) {
			//e.printStackTrace();
			//System.out.println("Invalid [");
		}
		closeConnection();
		return null;
	}

		
	
	public User[] getListOfAllUserFromDatabse()
	{
		return null;
	}
	
	public void insertUserIntoDatabse(User user)
	{
		initConnection();
		
		
		String sqlInsert;

		sqlInsert="INSERT INTO user VALUES ('"+user.getId()+"','"+user.getUserName()+"','"+user.getPasswprd()+"','"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getEmail()+"')";
		try {
			statement.executeUpdate(sqlInsert);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeConnection();
		
	}
	
	
	private void initConnection()
	{
		connection=new DatabaseConnection().getConnection();
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void closeConnection()
	{
		
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}

}
