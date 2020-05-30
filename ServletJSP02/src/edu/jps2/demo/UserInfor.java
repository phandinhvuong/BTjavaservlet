package edu.jps2.demo;

public class UserInfor {
	private String username;
	private String address;
	public UserInfor(String username, String address) {
		super();
		this.username = username;
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
