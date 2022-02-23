package MVC.Model.BO;

import java.util.ArrayList;

import MVC.Model.BEAN.PhongBan;
import MVC.Model.DAO.PhongBanDAO;



public class PhongBanBO {
	PhongBanDAO phongBanDAO = new PhongBanDAO();
	public ArrayList<PhongBan> getNhanVienList() {
		return phongBanDAO.findAll();
	}
	
	public void updatePB(PhongBan phongBan) {
		phongBanDAO.update(phongBan);
	}
	
	public PhongBan findPhongBan(String idPb) {
		return phongBanDAO.findPB(idPb);
	}
}
