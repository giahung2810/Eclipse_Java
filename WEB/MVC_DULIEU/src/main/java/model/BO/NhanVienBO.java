package model.BO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.Bean.NhanVien;
import model.Bean.PhongBan;
import model.DAO.NhanVienDAO;

public class NhanVienBO {
	NhanVienDAO nhanVienDAO = new NhanVienDAO();

	public ArrayList<NhanVien> findByIdPb(String idPb) {
		// TODO Auto-generated method stub
		return nhanVienDAO.findByIdPb(idPb);
	}

	public ArrayList<NhanVien> getNhanVienAll() {
		// TODO Auto-generated method stub
		return nhanVienDAO.getNhanVienAll();
	}

	public ArrayList<NhanVien> findNV(String text, String check) {
		// TODO Auto-generated method stub
		return nhanVienDAO.findNV( text,  check);
	}

	public void insertNV(NhanVien nhanVien) {
		nhanVienDAO.save(nhanVien);
	}

	public void DelNV(String IDNV) {
		nhanVienDAO.DelNV(IDNV);
    }

}
