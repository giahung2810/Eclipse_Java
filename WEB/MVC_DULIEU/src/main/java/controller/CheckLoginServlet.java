package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BO.CheckLoginBO;

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
//		 String destination_check= null; String checkLogin = null;
//		 
//		 String userName = request.getParameter("username"); String password =
//		 request.getParameter("password");
//		 
//		 CheckLoginBO checkLoginBO = new CheckLoginBO();
//		 
//		 if (checkLoginBO.isValidUser(userName, password)) {
//		 
//		 
//		 destination_check = "/t2.jsp"; checkLogin = "yes";
//		 request.setAttribute("checkLogin",checkLogin); 
//		 RequestDispatcher rd_check = request.getRequestDispatcher(destination_check);
//		 rd_check.forward(request, response);
//		 return; 
//		 }
//		 else { 
//			 destination_check = "/t2.jsp"; checkLogin = "no";
//		 request.setAttribute("checkLogin",checkLogin); 
//		 RequestDispatcher rd_check = request.getRequestDispatcher(destination_check);
//		 rd_check.forward(request, response); }
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destination = null;
	
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		CheckLoginBO checkLoginBO = new CheckLoginBO();

		if (checkLoginBO.isValidUser(userName, password)) {
			destination = "/t4.jsp";
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
