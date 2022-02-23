package model.BO;

import java.util.ArrayList;

import model.Bean.sinhvien;
import model.DAO.sinhvienDAO;


public class sinhvienBO {
	sinhvienDAO sinhvienDAO = new sinhvienDAO();

	public ArrayList<sinhvien> findByIdPb(String idPb) {
		// TODO Auto-generated method stub
		return sinhvienDAO.findByIdPb(idPb);
	}

	public ArrayList<sinhvien> getNhanVienAll() {
		// TODO Auto-generated method stub
		return sinhvienDAO.getNhanVienAll();
	}

	public ArrayList<sinhvien> findNV(String text, String check) {
		// TODO Auto-generated method stub
		return sinhvienDAO.findNV( text,  check);
	}

	public void insertNV(sinhvien nhanVien) {
		sinhvienDAO.save(nhanVien);
	}

	public void DelNV(String IDNV) {
		sinhvienDAO.DelNV(IDNV);
    }
}
