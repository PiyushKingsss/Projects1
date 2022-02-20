

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends HttpServlet {
	//private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    //public ServletDemo() {
        // TODO Auto-generated constructor stub

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd;
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if("admin".equalsIgnoreCase(userName) && "Piyush123".equals(password)) {
			rd = getServletContext().getRequestDispatcher("/Welcome.html");
			System.out.println("Valid User");
			rd.forward(request, response);
			
		} else {
			rd = getServletContext().getRequestDispatcher("/LoginError.html");
			System.out.println("Invalid User");
			rd.forward(request, response);
			
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
