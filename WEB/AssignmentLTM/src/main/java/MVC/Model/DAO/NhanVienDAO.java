package MVC.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import MVC.Model.BEAN.NhanVien;


public class NhanVienDAO {
	
	public ArrayList<NhanVien> findAll() {
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		try {
			String selectQueryString = "select * from nhanvien";
			Connection connection = DatabaseHelper.openConnection();
			Statement sqlStatement = connection.createStatement();
			ResultSet rSet = sqlStatement.executeQuery(selectQueryString);
			while (rSet.next()) {
				NhanVien nhanVien = new NhanVien();
				nhanVien.setId(Integer.parseInt(rSet.getString("id")));
				nhanVien.setHoTen(rSet.getString("hoTen"));
				nhanVien.setIdPb(rSet.getString("idPb"));
				nhanVien.setDiaChi(rSet.getString("diaChi"));
				list.add(nhanVien);
			}
			rSet.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<NhanVien> findByIdPb(String idPb) {
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		try {
			Connection connection = DatabaseHelper.openConnection();
			PreparedStatement st = connection.prepareStatement("select * from nhanvien where idPb = ?");
			st.setString(1, idPb);
			ResultSet rSet = st.executeQuery();
			while (rSet.next()) {
				NhanVien nhanVien = new NhanVien();
				nhanVien.setId(Integer.parseInt(rSet.getString("id")));
				nhanVien.setHoTen(rSet.getString("hoTen"));
				nhanVien.setIdPb(rSet.getString("idPb"));
				nhanVien.setDiaChi(rSet.getString("diaChi"));
				list.add(nhanVien);
			}
			rSet.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return list;
	}
	
	public NhanVien findNV(String text, String check) {
		NhanVien nhanVien = null;
		try {
			Connection connection = DatabaseHelper.openConnection();
			PreparedStatement st;
			if(check=="id"){
				 st = connection.prepareStatement("select * from nhanvien where id = ?");
		    }else if(check=="hoTen"){
				 st = connection.prepareStatement("select * from nhanvien where hoTen = ?");
		    }else 
				 st = connection.prepareStatement("select * from nhanvien where diaChi = ?");
			
			st.setString(1, text);
			ResultSet rSet = st.executeQuery();
			rSet.next();
			nhanVien = new NhanVien(Integer.parseInt(rSet.getString("id")),rSet.getString("hoTen"),rSet.getString("idPb"),rSet.getString("diaChi"));
			rSet.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return nhanVien;
	}
	
	public void save(NhanVien nhanVien) {
		try {
			Connection connection = DatabaseHelper.openConnection();
			String selectQueryString = "insert into nhanvien values(" + nhanVien.getId() +",'" + nhanVien.getHoTen() + "','" + nhanVien.getIdPb() + "','" + nhanVien.getDiaChi() +"')";
			Statement sqlStatement = connection.createStatement();
			sqlStatement.executeUpdate(selectQueryString);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
