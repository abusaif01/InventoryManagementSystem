package com.inventory.controllers;

import com.inventory.database.UserDatabaseManager;
import com.inventory.model.User;

public class HelloWorld {

	public static void main(String[] args) {
		User user=new UserDatabaseManager().readUserFromDatabse("2");
		System.out.println("usr first name:  "+user.getFirstName());
	}
}
