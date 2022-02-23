package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Bean.sinhvien;


public class sinhvienDAO {
	public ArrayList<sinhvien> findByIdPb(String idPb) {
		// TODO Auto-generated method stub
		ArrayList<sinhvien> list = new ArrayList<sinhvien>();
		try {
			Connection connection = ConnectDB.openConnection();
			PreparedStatement st = connection.prepareStatement("select * from sinhvien where MSSV = ?");
			st.setString(1, idPb);
			ResultSet rSet = st.executeQuery();
			while (rSet.next()) {
				sinhvien n = new sinhvien();
				n.setMSSV(rSet.getString("MSSV"));
				n.setHoTen(rSet.getString("HoTen"));
				n.setGioiTinh(rSet.getString("GioiTinh"));
				n.setKhoa(rSet.getString("Khoa"));
				list.add(n);
			}
			rSet.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return list;
	}

	public ArrayList<sinhvien> getNhanVienAll() {
		// TODO Auto-generated method stub
		ArrayList<sinhvien> list = new ArrayList<sinhvien>();
		
		String select = "select * from sinhvien";
		try {
			
			Connection connection = ConnectDB.openConnection();
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()) {
				sinhvien n = new sinhvien();
				n.setMSSV(resultSet.getString("MSSV"));
				n.setHoTen(resultSet.getString("HoTen"));
				n.setGioiTinh(resultSet.getString("GioiTinh"));
				n.setKhoa(resultSet.getString("Khoa"));
				
				list.add(n);
			}
			resultSet.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<sinhvien> findNV(String text, String check) {
		// TODO Auto-generated method stub
		ArrayList<sinhvien> list = new ArrayList<sinhvien>();
		try {
			Connection connection = ConnectDB.openConnection();
			PreparedStatement st;

				st = connection.prepareStatement("select * from sinhvien where " + check + " = ?");
				st.setString(1, text);

			
			System.out.println(st);
			ResultSet resultSet = st.executeQuery();
			while(resultSet.next()) {
				sinhvien n = new sinhvien();
				n.setMSSV(resultSet.getString("MSSV"));
				n.setHoTen(resultSet.getString("HoTen"));
				n.setGioiTinh(resultSet.getString("GioiTinh"));
				n.setKhoa(resultSet.getString("Khoa"));
				System.out.println(n.getHoTen());
				list.add(n);
			}
			resultSet.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void save(sinhvien nhanVien) {
		// TODO Auto-generated method stub
		try {
			Connection connection = ConnectDB.openConnection();
			String selectQueryString = "insert into sinhvien values(" + nhanVien.getMSSV() +",'" + nhanVien.getHoTen() + "','" + nhanVien.getGioiTinh() + "','" + nhanVien.getKhoa() +"')";
			Statement sqlStatement = connection.createStatement();
			sqlStatement.executeUpdate(selectQueryString);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	public void DelNV(String MSSV) {
        int i=0;
        try {
            Connection conn = ConnectDB.openConnection();
            PreparedStatement st = conn.prepareStatement("delete from sinhvien where MSSV=?");
            st.setString(1, MSSV);
            i = st.executeUpdate();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
