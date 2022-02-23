package model.BO;

import java.util.ArrayList;

import model.Bean.Vacxin;
import model.DAO.VacxinDAO;


public class VacxinBO {
	VacxinDAO VacxinDAO = new VacxinDAO();



	public ArrayList<Vacxin> getAll() {
		// TODO Auto-generated method stub
		return VacxinDAO.getVacxinAll();
	}


	public void insertVacxin(Vacxin Vacxin) {
		VacxinDAO.save(Vacxin);
	}
	
	

}
