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
import MVC.Model.BEAN.PhongBan;
import MVC.Model.BO.NhanVienBO;
import MVC.Model.BO.PhongBanBO;

/**
 * Servlet implementation class PhongBanServlet
 */
@WebServlet("/PhongBanServlet")
public class PhongBanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PhongBanBO phongBanBO = new PhongBanBO();
		ArrayList<PhongBan> listPB = new ArrayList<PhongBan>();
		listPB = phongBanBO.getNhanVienList();
		request.setAttribute("listPB", listPB);
		RequestDispatcher rd = request.getRequestDispatcher("/xemthongtinpb2.jsp");
		rd.forward(	request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
