package MVC.Model.BO;

import java.util.ArrayList;

import MVC.Model.BEAN.NhanVien;
import MVC.Model.DAO.NhanVienDAO;


public class NhanVienBO {
	NhanVienDAO nhanVienDAO = new NhanVienDAO();
	public ArrayList<NhanVien> getNhanVienList() {
		return nhanVienDAO.findAll();
	}
	public ArrayList<NhanVien> findByIdPb(String idPb){
		return nhanVienDAO.findByIdPb(idPb);
	}
	public NhanVien findNV(String text, String check) {
		return nhanVienDAO.findNV(text, check);
	}
	public void insertNV(NhanVien nhanVien) {
		nhanVienDAO.save(nhanVien);
	}
}
