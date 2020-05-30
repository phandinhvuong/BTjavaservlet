package edu.jps2.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.jps2.connect.ConnectionUtils;
import edu.jps2.model.User;
import edu.jps2.service.UserService;
import edu.jps2.service.impl.UserServiceImpl;
import edu.jps2.dao.UserDAO;

public class UserDAOImpl extends ConnectionUtils implements UserDAO {

	@Override
	public List<User> getAll() {
		List<User> userlist = new ArrayList<User>();
		String sql = "Select * from Users";
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User();
				user.setUsername(rs.getString("UserName"));
				user.setPassword(rs.getString("Passwords"));
				user.setRole(rs.getInt("Role"));

				userlist.add(user);
			}
		} catch (ClassNotFoundException el) {
			el.printStackTrace();
		} catch (SQLException el) {
			el.printStackTrace();
		}
		return userlist;
	}

	@Override
	public User findUserByNameAndPass(String username, String password) {
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM Users WHERE " + "UserName = '" + username + "'" + "AND Passwords = '" + password
				+ "'";
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User userOut = new User();
				userOut.setUsername(rs.getString("UserName"));
				userOut.setPassword(rs.getString("Passwords"));
				userOut.setRole(rs.getInt("Role"));

				userList.add(userOut);
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}
	
	
	/*
	 * public static void main(String[] args) { UserDAOImpl a = new UserDAOImpl();
	 * System.out.println(a.findUserByNameAndPass("admin1","123456").toString()); }
	 */

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM Users WHERE " + "ID = " + id;
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User userOut = new User();
				userOut.setID(rs.getInt("ID"));
				userOut.setUsername(rs.getString("UserName"));
				userOut.setPassword(rs.getString("Passwords"));
				userOut.setEmail(rs.getString("Email"));
				userOut.setRole(rs.getInt("Role"));

				userList.add(userOut);
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}

	@Override
	public void editUser(User user) {
		// TODO Auto-generated method stub
		String sql = "UPDATE Users SET " + "Email = '"+ user.getEmail()+"' WHERE " + "ID = " + user.getID();
		System.out.println("sql");
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE From User WHERE ID = " + id;
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO User(Avatar, UserName, Passwords, Email) VALUES("
				+ "'" + user.getUsername() + "',"
				+ "'" + user.getPassword() + "',"
				+ "'" + user.getEmail() + "')";
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		List<User> users = userService.getAll();
		for(User u : users ){
			System.out.println(u);
		}
	}
}
	 
	 


