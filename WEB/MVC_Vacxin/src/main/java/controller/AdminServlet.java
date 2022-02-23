package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BO.AdminBO;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destination = null;
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		AdminBO checkLoginBO = new AdminBO();

		if (checkLoginBO.isValidUser(userName, password)) {
			destination = "/index.jsp";
			String checkLogin = "yes";
			HttpSession session=request.getSession();  
        	session.setAttribute("check",checkLogin);  
			request.setAttribute("checkLogin",checkLogin); 
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
			return;
		} else {
			destination = "/Login.jsp";
			String checkLogin = "no";
			HttpSession session=request.getSession();  
        	session.setAttribute("check",checkLogin);  
			request.setAttribute("checkLogin",checkLogin); 
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);

		}
	}

}
