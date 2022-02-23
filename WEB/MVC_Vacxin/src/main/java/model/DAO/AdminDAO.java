package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO {

	public boolean isExistUser(String userName, String password) {
		boolean isCorrect = false;
    	try{
    		System.out.println(userName);
    		System.out.println(password);
    		Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test999","root","");
			String sql = "select * from admin where username= ? and password= ?";
			
			PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){			
				return isCorrect = true;
			} else {		
				isCorrect = false;
				System.out.println("0");
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}      
    	return isCorrect;
	}

}
