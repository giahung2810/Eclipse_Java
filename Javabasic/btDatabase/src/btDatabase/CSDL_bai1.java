package btDatabase;

import java.sql.*;

public class CSDL_bai1 {
	public static void main(String args[])
	{
		System.out.println("Ket noi SQL");
		java.sql.Connection connection;
		try {
			String dbURL = "jdbc:sqlserver://;databaseName=CSDLJavaBai1;user=giahung;password=giahung";
			connection = DriverManager.getConnection(dbURL);
			if(connection != null)
			{
				System.out.println("Ket noi OK");
			}
			Statement sql = connection.createStatement(); 
			String query = "SELECT * FROM Tabl1";
			ResultSet rs = sql.executeQuery(query);
			while (rs.next()) 
			{
				int id = rs.getInt("ID");
				String name = rs.getString("Name");
				String Address = rs.getString("Address");
				float total = rs.getFloat("Total");
				
				System.out.println("ID= " + id + " Name= "+ name + " Address = " +Address + " Total= " + total);
				
			}
			rs.close();
			sql.close();	
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

}
