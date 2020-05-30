package edu.jps2.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForwardServlet")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String isLogin = request.getParameter("isLogin");
		if("true".equals(isLogin)) {
			UserInfor ui = new UserInfor("Vuong","Da Nang");
			//di qua servlet tiep theo,co doan servletcontext vi co servletcontext  servletJSP02
			RequestDispatcher dis = request.getServletContext().getRequestDispatcher("/ShowServlet");
			dis.forward(request, response);
			//truyen thong tin cua userinfo vao
			request.setAttribute("key1", ui);
		}else {
			response.sendRedirect("http");
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
