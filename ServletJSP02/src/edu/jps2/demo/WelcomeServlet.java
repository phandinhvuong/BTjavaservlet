package edu.jps2.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/welcome",initParams = {
		@WebInitParam(name="emailSupport1",value="phandinhvuong7@gmail.com"),
		@WebInitParam(name = "password",value="12345")
		
}
)
public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		
		super.init();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * ServletOutputStream out = resp.getOutputStream(); String password =
		 * this.getInitParameter("password"); String emailSupport =
		 * this.getInitParameter("emailSupport1"); String id =req.getParameter("id");
		 * int host = req.getLocalPort(); String ser = req.getContextPath();
		 */
		
		
		
		/*
		 * out.println("<html>");
		 * out.println("<head><title>Hello Servlet</title></head>");
		 * 
		 * out.println("<body>"); out.println("<h3>Hello World</h3>");
		 * out.println("Welcome my first Servlet"); out.println("<p>myEmail = " +
		 * emailSupport + "</p>"); out.println("<p>myPasswords = " + password + "</p>");
		 * out.println("<p>myID = " + id + "</p>"); out.println("<p>myLocal = "
		 * +host+"</p>"); out.println("<p>myPath = " + ser + "</p>");
		 * out.println("</body>"); out.println("<html>");
		 */
	    RequestDispatcher dis = req.getServletContext().getRequestDispatcher("/index.jsp");
		dis.forward(req, resp);
	       
	}@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
