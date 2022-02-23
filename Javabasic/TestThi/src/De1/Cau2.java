package De1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Cau2 
{
	private static String MaHV;
	private static String TenHV;
	private static String NS;
	private static String GT;
	private static float Diem;
	public static Connection Connect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hocvien";
			String user = "root";
			String pass = "root";
			Connection connection = (Connection) DriverManager.getConnection(url, user, pass);
			System.out.println("Hi MySQL");
			return connection;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("error" + e);
			return null;
		}
	}
	public static ArrayList<String> ReadFile()
	{
		ArrayList<String> s = new ArrayList<String>();
		try {
			String inputFile = "D:\\Java\\input.txt";
			FileInputStream fileInputStream = new FileInputStream(inputFile);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String line;
			while ((line = bufferedReader.readLine()) != null ) {	
				s.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	public static void data()
	{
		ArrayList<String> s = ReadFile();
		try 
		{
			Connection conn = Connect();
			for(int i = 0; i < s.size(); i++)
			{
				if(isValidFormat(s.get(i).substring(60, 70)))
				{
					MaHV = convertString(s.get(i).substring(0, 10));
					TenHV = convertString(s.get(i).substring(10, 60));
					NS = convertString(s.get(i).substring(60, 70));
					GT = convertString(s.get(i).substring(70, 73));
					Diem = Float.parseFloat(s.get(i).substring(73));
					DatatoSQL();
					System.out.println(MaHV+TenHV+NS+GT+Diem);
				}
				else
				{
					WriteToFile("Dong thu " + (i+1) + ": Sai dinh dang ngay sinh");
				}
			}
		} catch (Exception e) 
		{
			System.out.println("Error "+ e);

		}		
	}
	public static void DatatoSQL() throws ParseException
	{
		try {
			PreparedStatement statement = null;
			Connection conn = Connect();
			String sql = "insert into hocvien values(?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql);
            
            statement.setString(1, MaHV);
            statement.setString(2, TenHV);
            java.util.Date d = new SimpleDateFormat("dd/MM/yyyy").parse(NS);
			statement.setDate(3, new java.sql.Date(d.getTime()));
			statement.setString(4, GT);
			statement.setFloat(5, Diem);
			
			statement.execute();
		} catch (SQLException e) {
			System.out.println("Error "+ e);
		}
	}
	
	public static String convertString(String string)
	{
		int i = string.length() - 1;
		while(string.charAt(i) == ' ')
			i--;
		return string.substring(0, i + 1);
	}
	public static void WriteToFile(String content)
	{
		try {
			FileWriter fileWriter = new FileWriter("G:/Java/error.txt");
			fileWriter.write(content + "\n");
			fileWriter.close();
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
	}
	public static boolean isValidFormat(String value) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date date = format.parse(value);
            if (!value.equals(format.format(date))) {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }
	public static void main(String[] args)
	{
		try {
			data();
		} catch (Exception e) {
		}
	}
}
