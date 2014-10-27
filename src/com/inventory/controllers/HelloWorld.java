package com.inventory.controllers;


import java.util.Scanner;

import com.inventory.database.UserDatabaseManager;
import com.inventory.model.User;

public class HelloWorld {

	private static Scanner input;

	public static void main(String[] args) {

		User user=new UserDatabaseManager().readUserFromDatabse("muuna","12354");
		if(user !=null){
		System.out.println("user first name:  "+user.getFirstName());
		}
		else{
			
			System.out.println("Invalid password or username");
		}
		
		User insertUser=new User();
		input = new Scanner(System.in);
		System.out.print("Give the user Id : ");
		insertUser.setId(input.nextInt());
		
		System.out.print("Type UserName : ");
		insertUser.setUserName(input.next());
		
		System.out.print("Type password : ");
		insertUser.setPasswprd(input.next());
		
		System.out.print("Type firstName : ");
		insertUser.setFirstName(input.next());
		
		System.out.print("Type lastName : ");
		insertUser.setLastName(input.next());
		
		System.out.print("Type email : ");
		insertUser.setEmail(input.next());
		
		new UserDatabaseManager().insertUserIntoDatabse(insertUser);
		

		}
		
	}

