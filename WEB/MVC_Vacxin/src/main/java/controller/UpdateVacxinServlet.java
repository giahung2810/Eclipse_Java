package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.VacxinBO;
import model.Bean.Vacxin;


/**
 * Servlet implementation class UpdateVacxinServlet
 */
@WebServlet("/UpdateVacxinServlet")
public class UpdateVacxinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateVacxinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String MaVacxin = request.getParameter("MaVacxin");
		String TenVacxin = request.getParameter("TenVacxin");
		String SoMui = request.getParameter("SoMui");
		String MoTa = request.getParameter("MoTa");
		String GiaVacxin = request.getParameter("GiaVacxin");
		String TenHangSX = request.getParameter("TenHangSX");
		System.out.println(MaVacxin);
		VacxinBO vacxinBO = new VacxinBO();

		Vacxin phongBan = vacxinBO.findPhongBan(idPb);
			request.setAttribute("PhongBan", phongBan);
			RequestDispatcher rd = request.getRequestDispatcher("/UpdatePB.jsp");
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
