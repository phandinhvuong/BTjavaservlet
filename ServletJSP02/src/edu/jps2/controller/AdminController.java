package edu.jps2.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jps2.dao.UserDAO;
import edu.jps2.model.User;
import edu.jps2.service.UserService;
import edu.jps2.service.impl.UserServiceImpl;


@WebServlet("/admin")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = new UserServiceImpl();
		List<User> users = userService.getAll();
		/*List<User> users = new ArrayList<User>();
		User user1 = new User("user1", "123456");
		User user2 = new User("user2", "332333");
		User user3 = new User("user3", "444444");
		users.add(user1);
		users.add(user2);
		users.add(user3);*/
		request.setAttribute("user", users);	
		RequestDispatcher rd = request.getRequestDispatcher("/view/admin.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
//	public static void main(String[] args) {
//		UserService userService = new UserServiceImpl();
//		List<User> users = userService.getAll();
//		for(User u : users ){
//			System.out.println(u.getPassword());
//		}
//	}

}
