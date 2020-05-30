package edu.jps2.service;

import java.util.List;

import edu.jps2.model.User;

public interface UserService {
	public boolean checkLogin(User user);
	public boolean checkAdmin(int role);
	public List<User> getAll();
	public User findUserByNameAndPass(String username, String password);
	public User findUserById(int id);
	public void editUser (User user);
	public void deleteUser(int id);
	public void addUser(User user);

	
}
