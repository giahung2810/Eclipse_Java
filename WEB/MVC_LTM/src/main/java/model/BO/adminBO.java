package model.BO;

import model.DAO.adminDAO;

public class adminBO {
	adminDAO checkLoginDAO = new adminDAO();
	public boolean isValidUser(String userName, String password) {
		return checkLoginDAO.isExistUser(userName, password);
	}
}
