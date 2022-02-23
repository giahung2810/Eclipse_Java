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
 * Servlet implementation class NhanVienServlet
 */
@WebServlet("/NhanVienServlet")
public class NhanVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NhanVienServlet() {
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
		NhanVienBO nhanVienBO = new NhanVienBO();
		ArrayList<NhanVien> listNV = new ArrayList<NhanVien>();
		String idPb = request.getParameter("IDPB");
		if(idPb!=null) {
			listNV = nhanVienBO.findByIdPb(idPb);
		}
		else {
			listNV = nhanVienBO.getNhanVienAll();
		}
		request.setAttribute("listNV", listNV);
		RequestDispatcher rd = request.getRequestDispatcher("/NhanVienList.jsp");
		rd.forward(	request, response);
	}
}
