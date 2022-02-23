package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Bean.NhanVien;


public class NhanVienDAO {

	public ArrayList<NhanVien> findByIdPb(String idPb) {
		// TODO Auto-generated method stub
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		try {
			Connection connection = ConnectDB.openConnection();
			PreparedStatement st = connection.prepareStatement("select * from nhanvien where IDPB = ?");
			st.setString(1, idPb);
			ResultSet rSet = st.executeQuery();
			while (rSet.next()) {
				NhanVien n = new NhanVien();
				n.setIDNV(rSet.getString("IDNV"));
				n.setHoten(rSet.getString("Hoten"));
				n.setIDPB(rSet.getString("IDPB"));
				n.setDiachi(rSet.getString("Diachi"));
				list.add(n);
			}
			rSet.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return list;
	}

	public ArrayList<NhanVien> getNhanVienAll() {
		// TODO Auto-generated method stub
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		
		String select = "select * from nhanvien";
		try {
			
			Connection connection = ConnectDB.openConnection();
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()) {
				NhanVien n = new NhanVien();
				n.setIDNV(resultSet.getString("IDNV"));
				n.setHoten(resultSet.getString("Hoten"));
				n.setIDPB(resultSet.getString("IDPB"));
				n.setDiachi(resultSet.getString("Diachi"));
				
				list.add(n);
			}
			resultSet.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<NhanVien> findNV(String text, String check) {
		// TODO Auto-generated method stub
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		try {
			Connection connection = ConnectDB.openConnection();
			PreparedStatement st;

				st = connection.prepareStatement("select * from nhanvien where " + check + " = ?");
				st.setString(1, text);

			
			System.out.println(st);
			ResultSet resultSet = st.executeQuery();
			while(resultSet.next()) {
				NhanVien n = new NhanVien();
				n.setIDNV(resultSet.getString("IDNV"));
				n.setHoten(resultSet.getString("Hoten"));
				n.setIDPB(resultSet.getString("IDPB"));
				n.setDiachi(resultSet.getString("Diachi"));
				System.out.println(n.getHoten());
				list.add(n);
			}
			resultSet.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void save(NhanVien nhanVien) {
		// TODO Auto-generated method stub
		try {
			Connection connection = ConnectDB.openConnection();
			String selectQueryString = "insert into nhanvien values(" + nhanVien.getIDNV() +",'" + nhanVien.getHoten() + "','" + nhanVien.getIDPB() + "','" + nhanVien.getDiachi() +"')";
			Statement sqlStatement = connection.createStatement();
			sqlStatement.executeUpdate(selectQueryString);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	public void DelNV(String IDNV) {
        int i=0;
        try {
            Connection conn = ConnectDB.openConnection();
            PreparedStatement st = conn.prepareStatement("delete from nhanvien where IDNV=?");
            st.setString(1, IDNV);
            i = st.executeUpdate();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
