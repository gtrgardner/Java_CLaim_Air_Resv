package com.air_resv.dao;

import java.sql.Date;
import java.util.*;

public class Customer {

	private String uName;
	private String password;
	private String fName;
	private String lName;
	//private Date dob;
	private String email;
	
	public Customer(){
		
		this.uName = "username";
		this.password = "password";
		this.fName = "first_name";
		this.lName = "last_name";
		this.email = "email";
		
	}
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	/*public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
