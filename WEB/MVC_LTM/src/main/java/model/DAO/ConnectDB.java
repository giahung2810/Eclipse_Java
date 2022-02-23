package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

class ConnectDB {
	public static Connection openConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test888","root","");
		return connection;
	}
}