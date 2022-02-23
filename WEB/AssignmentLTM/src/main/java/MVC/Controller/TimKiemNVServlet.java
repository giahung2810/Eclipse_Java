package MVC.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MVC.Model.BEAN.NhanVien;
import MVC.Model.BO.NhanVienBO;

/**
 * Servlet implementation class TimKiemNVServlet
 */
@WebServlet("/TimKiemNVServlet")
public class TimKiemNVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/timkiemnv.jsp");
		rd.forward(	request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NhanVienBO nhanVienBO = new NhanVienBO();
		String text = request.getParameter("text");
		String check = request.getParameter("check");
		NhanVien nhanVien = nhanVienBO.findNV(text, check);
		ArrayList<NhanVien> listNV = new ArrayList<NhanVien>();
		listNV.add(nhanVien);
		request.setAttribute("listNV", listNV);
		RequestDispatcher rd = request.getRequestDispatcher("/xemthongtinnv.jsp");
		rd.forward(	request, response);
	}

}
