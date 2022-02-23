package MVC.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHelper {
	public static Connection openConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
    	String url = "jdbc:mysql://localhost:3306/DULIEUNEW";
    	Connection connection = DriverManager.getConnection(url, "root", "");
		return connection;
	}
}
