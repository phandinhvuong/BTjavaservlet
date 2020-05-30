package edu.jps2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jps2.model.User;
import edu.jps2.service.UserService;
import edu.jps2.service.impl.UserServiceImpl;


@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doPost(request, response);  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();  
        String name=request.getParameter("username");  
        String password=request.getParameter("password");
        
        UserService service=new UserServiceImpl();  
//        user.setUsername(name);  
//        user.setPassword(password);
        List<User> users = service.getAll();
        System.out.println("----"+users.size());
        
       
    
        User user = service.findUserByNameAndPass(name, password);
        request.getSession().setAttribute("key1",user); 
        
		
		/*
		 * boolean status = user.validate();
		 * 
		 * if (status) { RequestDispatcher rd = request
		 * .getRequestDispatcher("login-success.jsp"); rd.forward(request, response); }
		 * else { RequestDispatcher rd = request
		 * .getRequestDispatcher("login-error.jsp"); rd.forward(request, response); }
		 */
		
		
	}

}
