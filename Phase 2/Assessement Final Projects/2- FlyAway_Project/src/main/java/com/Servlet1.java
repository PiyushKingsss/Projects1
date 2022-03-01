package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if("admin".equalsIgnoreCase(userName) && "Piyush123".equals(password)) {
			rd = getServletContext().getRequestDispatcher("/HomePage.html");
			System.out.println("Valid User");
			rd.forward(request, response);
			
		} else {
			rd = getServletContext().getRequestDispatcher("/LoginError.html");
			System.out.println("Invalid User");
			rd.forward(request, response);
			
	}
}

}
