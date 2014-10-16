package com.inventory.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.inventory.model.User;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class UserDatabaseManager {
	Connection connection;
	Statement statement;
	public User readUserFromDatabse(String id)
	{
		User user=new User();
		initConnection();
		String sql;
		sql="SELECT * FROM info WHERE customr_id='"+id+"'";
		System.out.println(sql);
		try {
			ResultSet result=statement.executeQuery(sql);
			int i=1;
			result.first();
			 user.setId(result.getInt(i++));
			 user.setFirstName(result.getString(i++));
			 user.setEmail(result.getString(i++));
			 user.setPasswprd(result.getString(i++));
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
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
