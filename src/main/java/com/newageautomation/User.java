package com.newageautomation;

import java.util.Set;

public class User {

	private int userId;
	private String password;
	private Set<UserType> listOfUserTypes; //There is a One to many relation between User
	// and UserTypes. Example: an affiliate can be a customer, etc.
	
	public User(int userId, String password) {
		setUserId(userId);
		setPassword(password);
	}
	
	public User(int userId, String password, Set<UserType> listOfUserTypes) {
		setUserId(userId);
		setPassword(password);
		setListofUserTypes(listOfUserTypes);
	}	
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId=userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public Set<UserType> getListOfUserTypes() {
		return listOfUserTypes;
	}
	
	public void setListofUserTypes(Set<UserType> listOfUserTypes) {
		this.listOfUserTypes=listOfUserTypes;
	}
}









