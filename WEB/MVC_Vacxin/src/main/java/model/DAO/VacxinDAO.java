package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Bean.Vacxin;

public class VacxinDAO {



	public void save(Vacxin vx) {
		// TODO Auto-generated method stub
		try {
            Connection connection = ConnectDB.openConnection();
            String selectQueryString = "INSERT INTO vacxin (MaVacxin, TenVacxin, SoMui, MoTa, GiaVacxin, TenHangSX) VALUES('" + vx.getMaVacxin() +"','" + vx.getTenVacxin() + "','" + vx.getSoMui() + "','" + vx.getMoTa() +"','" + vx.getGiaVacxin() +"','" + vx.getTenHangSX() +"')";
            Statement sqlStatement = connection.createStatement();
            sqlStatement.executeUpdate(selectQueryString);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
	}

	public ArrayList<Vacxin> getVacxinAll() {
		// TODO Auto-generated method stub
		ArrayList<Vacxin> list = new ArrayList<Vacxin>();
		
		String select = "select * from vacxin";
		try {
			
			Connection connection = ConnectDB.openConnection();
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()) {
				Vacxin n = new Vacxin();
				n.setMaVacxin((resultSet.getString("MaVacxin")));
				n.setTenVacxin((resultSet.getString("TenVacxin")));
				n.setSoMui((resultSet.getString("SoMui")));
				n.setMoTa((resultSet.getString("MoTa")));
				n.setGiaVacxin((resultSet.getString("GiaVacxin")));
				n.setTenHangSX((resultSet.getString("TenHangSX")));
				
				list.add(n);
			}
			resultSet.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
