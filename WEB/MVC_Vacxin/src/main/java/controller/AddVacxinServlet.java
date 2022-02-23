package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.VacxinBO;
import model.Bean.Vacxin;

/**
 * Servlet implementation class AddVacxinServlet
 */
@WebServlet("/AddVacxinServlet")
public class AddVacxinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVacxinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VacxinBO VacxinBO = new VacxinBO();
		String MaVacxin = request.getParameter("MaVacxin");
		String TenVacxin = request.getParameter("TenVacxin");
		String SoMui = request.getParameter("SoMui");
		String MoTa = request.getParameter("MoTa");
		String GiaVacxin = request.getParameter("GiaVacxin");
		String TenHangSX = request.getParameter("TenHangSX");
		Vacxin vacxin = new Vacxin(MaVacxin, TenVacxin, SoMui, MoTa, GiaVacxin, TenHangSX );
		System.out.println(MaVacxin + TenVacxin +  SoMui +  MoTa +  GiaVacxin + TenHangSX);
		VacxinBO.insertVacxin(vacxin);
		ArrayList<Vacxin> listvacxin = new ArrayList<Vacxin>();
		listvacxin = VacxinBO.getAll();
		request.setAttribute("listvacxin", listvacxin);
		RequestDispatcher rd = request.getRequestDispatcher("/VacxinList.jsp");
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
