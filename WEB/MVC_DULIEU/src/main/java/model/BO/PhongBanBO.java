
package model.BO;

import java.util.ArrayList;

import model.Bean.PhongBan;
import model.DAO.PhongBanDAO;

public class PhongBanBO {
	
	PhongBanDAO phongBanDAO = new PhongBanDAO();
	public ArrayList<PhongBan> findAllPB() {
		return phongBanDAO.findAllPB();
	}
	public PhongBan findPhongBan(String idPb) {
		// TODO Auto-generated method stub
		return phongBanDAO.findPB(idPb);
	}
	public void updatePB(PhongBan phongBan) {
		phongBanDAO.updatePB(phongBan);
		
	}
}
