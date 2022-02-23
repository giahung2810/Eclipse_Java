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
import model.BO.PhongBanBO;
import model.Bean.NhanVien;
import model.Bean.PhongBan;

/**
 * Servlet implementation class PhongBanServlet
 */
@WebServlet("/PhongBanServlet")
public class PhongBanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhongBanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PhongBanBO phongbanBO = new PhongBanBO();
		ArrayList<PhongBan> listPB = new ArrayList<PhongBan>();
		listPB = phongbanBO.findAllPB();
		String text = request.getParameter("action");
		System.out.print(text);
		if(text != null)
		{
			request.setAttribute("listPB", listPB);
			RequestDispatcher rd = request.getRequestDispatcher("/PhongBanList2.jsp");
			rd.forward(	request, response);
		}
		else {
			request.setAttribute("listPB", listPB);
			RequestDispatcher rd = request.getRequestDispatcher("/PhongBanList.jsp");
			rd.forward(	request, response);
		}
//		request.setAttribute("listPB", listPB);
//		RequestDispatcher rd = request.getRequestDispatcher("/PhongBanList.jsp");
//		rd.forward(	request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
