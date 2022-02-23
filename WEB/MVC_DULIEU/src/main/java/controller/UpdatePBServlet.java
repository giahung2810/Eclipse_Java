package controller;

import java.io.IOException;

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
 * Servlet implementation class UpdatePBServlet
 */
@WebServlet("/UpdatePBServlet")
public class UpdatePBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idPb = request.getParameter("IDPB");
		String TenPB = request.getParameter("TenPB");
		String Mota = request.getParameter("Mota");
		String action = request.getParameter("action");
		System.out.println(idPb);
		PhongBanBO phongBanBO = new PhongBanBO();
		if(action != null) {
			PhongBan phongBan = phongBanBO.findPhongBan(idPb);
			
			phongBan.setTenPB(TenPB);
			phongBan.setMota(Mota);
			phongBanBO.updatePB(phongBan);
			
			RequestDispatcher rd = request.getRequestDispatcher("PhongBanServlet");
			rd.forward(	request, response);
		}
		else {
			PhongBan phongBan = phongBanBO.findPhongBan(idPb);
			request.setAttribute("PhongBan", phongBan);
			RequestDispatcher rd = request.getRequestDispatcher("/UpdatePB.jsp");
			rd.forward(	request, response);
		}
		
	}
}
