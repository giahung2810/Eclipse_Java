package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Bean.NhanVien;
import model.Bean.PhongBan;

public class PhongBanDAO {

	public ArrayList<PhongBan> findAllPB() {
		// TODO Auto-generated method stub
		ArrayList<PhongBan> list = new ArrayList<PhongBan>();
		
		String select = "select * from phongban ";
		try {
			
			Connection connection = ConnectDB.openConnection();
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()) {
				PhongBan n = new PhongBan();
				n.setIDPB(resultSet.getString("IDPB"));
				n.setTenPB(resultSet.getString("Tenpb"));
				n.setMota(resultSet.getString("Mota"));
				
				list.add(n);
			}
			resultSet.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public PhongBan findPB(String idPb) {
		// TODO Auto-generated method stub
		PhongBan phongBan = null;
		try {
			Connection connection = ConnectDB.openConnection();
			PreparedStatement st;
			 st = connection.prepareStatement("select * from phongban where IDPB = ?");
			st.setString(1, idPb);
			ResultSet rSet = st.executeQuery();
			rSet.next();
			phongBan = new PhongBan(rSet.getString("IDPB"),rSet.getString("Tenpb"),rSet.getString("Mota"));
			rSet.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return phongBan;
	}

	public void updatePB(PhongBan phongBan) {
		// TODO Auto-generated method stub
		try {
			System.out.println(phongBan.getTenPB());
			System.out.println(phongBan.getMota());
			System.out.println(phongBan.getIDPB());
			String sqlUpdate = "UPDATE phongban SET Tenpb = '" + phongBan.getTenPB() +"', Mota = '"+phongBan.getMota() +"' WHERE IDPB = '"+phongBan.getIDPB() +"'";
			Connection connection = ConnectDB.openConnection();
			PreparedStatement st = connection.prepareCall(sqlUpdate);
			st.executeUpdate();

			System.out.println(sqlUpdate);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
