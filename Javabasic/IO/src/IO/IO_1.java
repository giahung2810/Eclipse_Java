package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_1 
{
	public int nhapso() throws IOException
	{
		InputStreamReader luongvao = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(luongvao);
		String s = br.readLine();
		return Integer.parseInt(s);
	}
	public int UCLN(int a, int b)
	{
		while( a != b)
		{
			if( a < b)
			{
				b = b - a;
			}
			else
			{
				a = a - b;
			}
		}
		return a;
	}
	public int BCNN(int a, int b)
	{
		return a*b/UCLN(a,b);
	}
	public static void main(String args[])
	{
		IO_1 b1 = new IO_1();
		int a=0,b=0;
		try 
		{
			do 
			{
				System.out.print("Nhap mot so nguyen duong a: ");
				a = b1.nhapso();
				System.out.print("Nhap mot so nguyen duong b: ");
				b = b1.nhapso();
			} 
			while (a < 0 || b < 0);
			System.out.println("UCLN " + b1.UCLN(a, b));
			System.out.println("BCNN " + b1.BCNN(a, b));
		} 
		catch (Exception e) 
		{
			System.out.println("So da nhap la: " + a +" "+ b);
		}
	}
}
