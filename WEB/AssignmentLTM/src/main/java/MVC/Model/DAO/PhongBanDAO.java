package MVC.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import MVC.Model.BEAN.PhongBan;

public class PhongBanDAO {
	public ArrayList<PhongBan> findAll() {
		ArrayList<PhongBan> list = new ArrayList<PhongBan>();
		try {
			String selectQueryString = "select * from phongban";
			Connection connection = DatabaseHelper.openConnection();
			Statement sqlStatement = connection.createStatement();
			ResultSet rSet = sqlStatement.executeQuery(selectQueryString);
			while (rSet.next()) {
				PhongBan phongBan = new PhongBan();
				phongBan.setId(rSet.getString("id"));
				phongBan.setTenPb(rSet.getString("tenPb"));
				phongBan.setMoTa(rSet.getString("moTa"));
				list.add(phongBan);
			}
			rSet.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return list;
	}
	
	public void update(PhongBan phongBan) {
		try {
			String sqlUpdate = "UPDATE phongban "
	                + "SET tenPb = ?, moTa = ? "
	                + "WHERE id = ?";
			Connection connection = DatabaseHelper.openConnection();
			PreparedStatement st = connection.prepareStatement(sqlUpdate);
			st.setString(1, phongBan.getTenPb());
			st.setString(1, phongBan.getMoTa());
			st.setString(1, phongBan.getId());
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public PhongBan findPB(String text) {
		PhongBan phongBan = null;
		try {
			Connection connection = DatabaseHelper.openConnection();
			PreparedStatement st;
			 st = connection.prepareStatement("select * from phongban where id = ?");
			st.setString(1, text);
			ResultSet rSet = st.executeQuery();
			rSet.next();
			phongBan = new PhongBan(rSet.getString("id"),rSet.getString("tenPb"),rSet.getString("moTa"));
			rSet.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return phongBan;
	}
}
