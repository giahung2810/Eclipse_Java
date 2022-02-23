package CSDL;
import javax.sql.*;
import javax.swing.JOptionPane;

import java.sql.*;

public class CSDL_1 
{
public static void main(String[] args) {
		
	java.sql.Connection conn;
	try {
		
		String dbURL = "jdbc:sqlserver://;databaseName=CSDLJavaBai1;user=giahung;password=giahung";
		conn = DriverManager.getConnection(dbURL);
		if (conn != null)
			System.out.println( "Kết nối thành công");
		Statement stmt = (Statement) conn.createStatement();
		String sql = "SELECT * FROM tabl1";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			int id = rs.getInt("ID");
			String name = rs.getString("Name");
			String address = rs.getString("Address");
			double total = rs.getDouble("Total");
			System.out.println("ID= " + id + " Name= "+ name + " Address =" +address + " Total=" + total);
			System.out.println("\n");
		}
		rs.close();
		stmt.close();			
	} catch (SQLException ex) {
		JOptionPane.showMessageDialog(null, ""+ex);
		}		
	}

}
