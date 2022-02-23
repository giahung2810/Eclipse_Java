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


@WebServlet("/ThemNhanVienServlet")
public class ThemNhanVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/themnhanvien.jsp");
		rd.forward(	request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NhanVienBO nhanVienBO = new NhanVienBO();
		int id = Integer.parseInt(request.getParameter("id"));
		String hoTen = request.getParameter("hoTen");
		String idPb = request.getParameter("idPb");
		String diaChi = request.getParameter("diaChi");
		NhanVien nhanVien = new NhanVien(id, hoTen, idPb, diaChi);
		nhanVienBO.insertNV(nhanVien);
		ArrayList<NhanVien> listNV = new ArrayList<NhanVien>();
		listNV = nhanVienBO.getNhanVienList();
		request.setAttribute("listNV", listNV);
		RequestDispatcher rd = request.getRequestDispatcher("/xemthongtinnv.jsp");
		rd.forward(	request, response);
	}

}
