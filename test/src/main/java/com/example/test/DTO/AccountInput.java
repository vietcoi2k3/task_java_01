package com.example.test.DTO;

import java.util.Date;

public class AccountInput {
	
	private String email;
	private String phone;
	private String userName;
	
	private String password;
	
	private String dayOfUpdate;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDayOfUpdate() {
		return dayOfUpdate;
	}

	public void setDayOfUpdate(String dayOfUpdate) {
		this.dayOfUpdate = dayOfUpdate;
	}
	
}
