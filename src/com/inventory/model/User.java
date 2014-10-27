package com.inventory.model;

/**
 * @author Saif
 * 
 * This is how a model class should look like.
 * Just gave you a demo.
 * 
 */
public class User {
	
	private int id;
	private String userName;
	private String passwprd;
	private String firstName;
	private String lastName;
	private String email;
	
	
	
	
	/**
	 * These method are called accessor and mutator
	 * Ecplise will auto generate this part of codes if you want
	 * Dont need to write this code by yourelf
	 * 
	 */
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswprd() {
		return passwprd;
	}
	public void setPasswprd(String passwprd) {
		this.passwprd = passwprd;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
