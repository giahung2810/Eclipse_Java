package model.BO;

import model.DAO.AdminDAO;

public class AdminBO {

	AdminDAO adminDAO = new AdminDAO();
	public boolean isValidUser(String userName, String password) {
		return adminDAO.isExistUser(userName, password);
	}
}
