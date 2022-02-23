package CSDL;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Bai2test 
{
	private String MaHV;
	private String TenHV;
	private String NS;
	private String GT;
	private float Diem;
	public static Connection Connect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hocvien";
			String user ="root";
			String password ="root";
			Connection con =(Connection) DriverManager.getConnection(url, user, password);
			System.out.println("Hi MySQL");
			return con;
		}
		catch (SQLException | ClassNotFoundException e)
		{
			 System.out.println("Error " + e);
			 return null;
		}
	}
	public static ArrayList<String> ReadFile()
	{
		ArrayList<String> s = new ArrayList<String>();
	    try 
	    {
	    	String f = "D:\\Java\\input.txt";
	    	FileInputStream fileInputStream = new FileInputStream(f);
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
			String line;
			while ((line = br.readLine()) != null) 
			{
				s.add(line);
			}
		} 
	    catch (FileNotFoundException e) 
	    {
			e.printStackTrace();
		} 
	    catch (IOException e) {
			e.printStackTrace();
		}
	    return s;
	}
	public void Outdata()
	{
		/*
		 * String MaHV=""; String TenHV=""; String NS=""; String GT=""; String Diem="";
		 */
		ArrayList<String> s = ReadFile();
		try 
		{
			//Connection conn = Connect();
			for(int i = 0; i < s.size(); i++)
			{
				if(isValidFormat(s.get(i).substring(60, 70)))
				{
					MaHV = convertString(s.get(i).substring(0, 10));
					TenHV = convertString(s.get(i).substring(10, 60));
					NS = convertString(s.get(i).substring(60, 70));
					GT = convertString(s.get(i).substring(70, 73));
					Diem = Float.parseFloat(s.get(i).substring(73));
					
					System.out.println(MaHV+TenHV+NS+GT+Diem);
				}
				else
				{
					WriteToFile("Dong thu " + (i+1) + ": Sai dinh dang ngay sinh");
				}
			}
		} catch (Exception e) 
		{


		}		
	}
	public static String convertString(String string)
	{
		int i = string.length() - 1;
		while(string.charAt(i) == ' ')
			i--;
		return string.substring(0, i + 1);
	}
	public static boolean isValidFormat(String value) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date = (Date) format.parse(value);
            if (!value.equals(format.format(date))) {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }
	public void WriteToFile(String content)
	{
		try {
			FileWriter fileWriter = new FileWriter("G:/Java/error.txt");
			fileWriter.write(content + "\n");
			fileWriter.close();
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
	}
	@SuppressWarnings("unused")
	public static void main(String args[]) 
	{
		Bai2test h = new Bai2test();
		try 
		{
			Connection conn = Connect();
			
			h.Outdata();
		} catch (Exception e) 
		{

		}
		
	}
}
