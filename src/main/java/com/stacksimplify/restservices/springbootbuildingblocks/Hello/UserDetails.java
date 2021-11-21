package com.stacksimplify.restservices.springbootbuildingblocks.Hello;

public class UserDetails {
	private String firstname;
	private String lasttname;
	private String city;
	
	//Fields Constractor
	public UserDetails(String firstname, String lasttname, String city) {
		super();
		this.firstname = firstname;
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
		return "UserDetails [firstname=" + firstname + ", lasttname=" + lasttname + ", city=" + city + "]";
	}
	

}
