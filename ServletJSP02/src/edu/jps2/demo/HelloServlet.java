package edu.jps2.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private String emailSupport1;
	public HelloServlet() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		String password =this.getInitParameter("myPassword");
		out.println("<html>");
	       out.println("<head><title>Hello Servlet</title></head>");
	        
	       out.println("<body>");
	       out.println("<h3>Hello World</h3>");
	       out.println("This is my first Servlet");
	       out.println("<p>myEmail = " + this.emailSupport1 + "</p>");
	       out.println("<p>myPasswords = " + password + "</p>");
	       out.println("</body>");
	       out.println("<html>");
	}
	 @Override//tiep nhan thong tin nguoi dung truyen vao
	    public void init(ServletConfig config) throws ServletException {
	        super.init(config);
	        this.emailSupport1 = config.getInitParameter("emailSupport1");
	    }
	 
	@Override//nhan 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		super.doPost(req, resp);
	}
	
}
