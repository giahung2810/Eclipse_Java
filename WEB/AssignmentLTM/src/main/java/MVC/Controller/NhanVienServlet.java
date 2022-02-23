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


@WebServlet("/NhanVienServlet")
public class NhanVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NhanVienBO nhanVienBO = new NhanVienBO();
		ArrayList<NhanVien> listNV = new ArrayList<NhanVien>();
		String idPb = request.getParameter("IDPB");
		if(idPb!=null) {
			listNV = nhanVienBO.findByIdPb(idPb);
		}
		else {
			listNV = nhanVienBO.getNhanVienList();
		}
		request.setAttribute("listNV", listNV);
		RequestDispatcher rd = request.getRequestDispatcher("/xemthongtinnv.jsp");
		rd.forward(	request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
