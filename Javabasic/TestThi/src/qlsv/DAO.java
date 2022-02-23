package qlsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class DAO {
	public static String url = "jdbc:mysql://localhost:3306/qlsvjava";
	public static String user = "root";
	public static String pass = "root";
	
	public static List<SV> ListAllSV() throws ClassNotFoundException, SQLException
	{
		List<SV>  s= new ArrayList<SV>();
		Connection connection= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);
			Statement statement = (Statement) connection.createStatement();
			String query = "select * from sinhvien";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next())
			{
				 SV std = new SV(resultSet.getString("MSSV"), 
	                        resultSet.getString("NameSV"), resultSet.getString("Age"), 
	                        resultSet.getString("DiaChi"), resultSet.getInt("ID_Lop"));
				 s.add(std);
			}
		} catch (SQLException e) {
			System.out.println("Error" + e);
		}
		return s;
	}
	public static List<LSH> ListLSH() throws ClassNotFoundException, SQLException
	{
		List<LSH>  s= new ArrayList<LSH>();
		Connection connection= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);
			Statement statement = (Statement) connection.createStatement();
			String query = "select * from lop";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next())
			{
				 LSH std = new LSH(resultSet.getInt("ID_Lop"), 
	                        resultSet.getString("TenLop"));
				 s.add(std);
			}
		} catch (SQLException e) {
			System.out.println("Error" + e);
		}
		return s;
	}
	public static List<CBBItem> getCBBItem() throws ClassNotFoundException, SQLException
	{
		List<CBBItem> listCBB = new ArrayList<CBBItem>();
		for (LSH i : ListLSH()) {
			CBBItem cbb = new CBBItem(i.getID_Lop(), i.getTenLop());
			listCBB.add(cbb);
		}
		return listCBB;
	}
	public static void Insert(SV sv) throws ClassNotFoundException, SQLException
	{
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);
			//Statement statement = (Statement) connection.createStatement();
			String query = "insert into sinhvien(MSSV,NameSV,Age,DiaChi,ID_Lop) values(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareCall(query);
			statement.setString(1, sv.getMssv());
			statement.setString(2, sv.getTenSV());
			statement.setString(3, sv.getAge());
			statement.setString(4, sv.getDiachi());
			statement.setInt(5, sv.getId_lop());
			statement.execute();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error" + e);
		}
	}
	public static void Delete(String mssv) throws ClassNotFoundException, SQLException
	{
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);
			//Statement statement = (Statement) connection.createStatement();
			String query = "delete from sinhvien where mssv = ?";
			PreparedStatement statement = connection.prepareCall(query);
			statement.setString(1, mssv);
			statement.execute();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error" + e);
		}
	}
	public static void Update(SV sv) throws ClassNotFoundException, SQLException
	{
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);
			//Statement statement = (Statement) connection.createStatement();
			String query = "update sinhvien set NameSV=?, Age=?, DiaChi=?, ID_Lop=? where MSSV=?";
			PreparedStatement statement = connection.prepareCall(query);
			//statement.setString(1, sv.getMssv());
			statement.setString(1, sv.getTenSV());
			statement.setString(2, sv.getAge());
			statement.setString(3, sv.getDiachi());
			statement.setInt(4, sv.getId_lop());
			statement.setString(5, sv.getMssv());
			statement.executeUpdate();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error" + e);
		}
	}
	public List<SV> findByNameSV(String _nameSV) throws ClassNotFoundException, SQLException
	{
		List<SV> list = new ArrayList<SV>();
		Connection connection = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);
			String sql = "select * from sinhvien where NameSV like ?";
			PreparedStatement statement = (PreparedStatement) connection.prepareCall(sql);
			statement.setString(1, "%"+ _nameSV +"%");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				SV std = new SV(resultSet.getString("MSSV"), 
                        resultSet.getString("NameSV"), resultSet.getString("Age"), 
                        resultSet.getString("DiaChi"), resultSet.getInt("ID_Lop"));
				list.add(std);
				//System.out.println(sv.getMssv() + " " + sv.getTenSV() + " " + sv.getAge() + " " + sv.getDiachi() + " " + sv.getId_lop());
			}
			resultSet.close();
			statement.close();
		}
		catch(SQLException ex)
		{
			System.out.println("Error" + ex);
		}
		return list;
	}
}
