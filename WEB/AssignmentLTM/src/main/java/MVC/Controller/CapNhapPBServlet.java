package MVC.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MVC.Model.BEAN.PhongBan;
import MVC.Model.BO.PhongBanBO;

/**
 * Servlet implementation class CapNhapPBServlet
 */
@WebServlet("/CapNhapPBServlet")
public class CapNhapPBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idPb = request.getParameter("IDPB");
		PhongBanBO phongBanBO = new PhongBanBO();
		PhongBan phongBan = phongBanBO.findPhongBan(idPb);
		request.setAttribute("PhongBan", phongBan);
		RequestDispatcher rd = request.getRequestDispatcher("/capnhap.jsp");
		rd.forward(	request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idPb = request.getParameter("IDPB");
		
	}

}
