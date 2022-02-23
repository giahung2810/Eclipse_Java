package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.NhanVienBO;
import model.Bean.NhanVien;

/**
 * Servlet implementation class AddNVServlet
 */
@WebServlet("/AddNVServlet")
public class AddNVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNVServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NhanVienBO nhanVienBO = new NhanVienBO();
		String id = request.getParameter("IDNV");
		String hoTen = request.getParameter("Hoten");
		String idPb = request.getParameter("IDPB");
		String diaChi = request.getParameter("Diachi");
		NhanVien nhanVien = new NhanVien(id, hoTen, idPb, diaChi);
		nhanVienBO.insertNV(nhanVien);
		ArrayList<NhanVien> listNV = new ArrayList<NhanVien>();
		listNV = nhanVienBO.getNhanVienAll();
		request.setAttribute("listNV", listNV);
		RequestDispatcher rd = request.getRequestDispatcher("/NhanVienList.jsp");
		rd.forward(	request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
