package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2 
{
	public int nhapso() throws IOException 
	{
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
	public int SDN(int n)
	{
		int m = 0; 
		   int x = n;
		   while (x > 0)
		   {
		      m = m*10 + x%10;
		      x /= 10;
		   }
		   return m;
	}
	public static boolean SDS(int n)
	{
		int m = 0; 
		   int x = n;
		   while (x > 0)
		   {
		      m = m*10 + x%10;
		      x /= 10;
		   }
		   return (m == n);
	}
	public static int F(int n)
    {
		int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (n < 0) 
        {
            return -1;
        } 
        else if (n == 0 || n == 1) 
        {
            return n;
        } 
        else 
        {
            for (int i = 2; i < n; i++)
            {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            return fn;
        }
        
    }
	public void Fib(int n)
	{
		int count = 0;
		for(int i = 0 ;i <= n; i++)
		{
			if(F(i) == n) 
			{
				System.out.println(n+ " thuoc day Fibonacci tai vi tri thu : " +(i+1));
				count++;
			}
		}
		if(count == 0) System.out.println(n+ " khong thuoc day Fibonacci");
	}
	public static void main (String args[])
	{
		int m = 0;
		IO_2 b2 = new IO_2();
		try 
		{
            System.out.print("Nhap so m: ");
            m = b2.nhapso();
            System.out.print("So nghich dao: " + b2.SDN(m) + "\n");
            if(SDS(m))
            {
            	System.out.println("la so doi xung");
            }
    		else 
    		{
    			System.out.println("khong la so doi xung");
    		}
            b2.Fib(m);
        } catch (Exception e) {
        	System.out.println("So da nhap la: " + m );
        }
	}
}
