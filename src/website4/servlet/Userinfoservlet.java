package website4.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Userinfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("userinfo Servlet: doGet");	
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/userinfo.jsp").forward(req, resp);
	}
	
	
}
