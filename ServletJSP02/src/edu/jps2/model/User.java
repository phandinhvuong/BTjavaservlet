package edu.jps2.model;

public class User {
	private int ID;
	private String Username;
	private String password;
	private String Email;
	private int Role;
	
	public User() {
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getRole() {
		return Role;
	}

	public void setRole(int role) {
		Role = role;
	}

	public void setAvatar(String fileName) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	/*
	 * public boolean validate() { if ("admin".equals(password)) { return true; }
	 * else { return false; } }
	 */
	

}
