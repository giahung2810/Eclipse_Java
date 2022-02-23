package Thi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class DB {
	
	public static String url = "jdbc:mysql://localhost:3306/qlkhjava";
	public static String user = "root";
	public static String pass = "root";
	
	public static List<Courses> ListAllCourses() throws ClassNotFoundException, SQLException
	{
		List<Courses>  s= new ArrayList<Courses>();
		Connection connection= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);
			Statement statement = (Statement) connection.createStatement();
			String query = "select * from courses";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next())
			{
				 Courses std = new Courses(resultSet.getString("Code"), 
	                        resultSet.getString("CoursesName"), 
	                        resultSet.getInt("Credit"));
				 s.add(std);
			}
		} catch (SQLException e) {
			System.out.println("Error" + e);
		}
		return s;
	}
	public static void Insert(Courses c) throws ClassNotFoundException, SQLException
	{
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);
			//Statement statement = (Statement) connection.createStatement();
			String query = "insert into courses(Code,CoursesName,Credit) values(?,?,?)";
			PreparedStatement statement = connection.prepareCall(query);
			statement.setString(1, c.getCode());
			statement.setString(2, c.getName());
			statement.setInt(3, c.getCredit());
			statement.execute();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error" + e);
		}
	}
	public Courses findByCode(String _code) throws ClassNotFoundException, SQLException
	{
		Courses c = null ;
		Connection connection = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);
			String sql = "select * from courses where Code like ?";
			PreparedStatement statement = (PreparedStatement) connection.prepareCall(sql);
			statement.setString(1, "%"+ _code +"%");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				c = new Courses(resultSet.getString("Code"), 
                        resultSet.getString("CoursesName"), 
                        resultSet.getInt("Credit"));
			}
			resultSet.close();
			statement.close();
		}
		catch(SQLException ex)
		{
			System.out.println("Error" + ex);
		}
		return c;
	}
}
