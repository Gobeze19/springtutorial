package com.stacksimplify.restservices.springbootbuildingblocks.Hello;

public class UserDetails {
	private String firstname;
	private String middlename;
	private String lasttname;
	private String city;
	
	//Fields Constractor
	public UserDetails(String firstname, String middlename, String lasttname, String city) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lasttname = lasttname;
		this.city = city;
	}
	// Getters and Setters
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLasttname() {
		return lasttname;
	}
	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	// ToString
	@Override
	public String toString() {
		return "UserDetails [firstname=" + firstname + ",middlename=" + middlename +" lasttname=" + lasttname + ", city=" + city + "]";
	}
	

}
