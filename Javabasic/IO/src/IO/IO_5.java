package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class IO_5 
{
	public int nhapso() throws IOException 
	{
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
	public void NhapMang(int a[]) throws IOException
	{
		for(int i = 0; i < a.length; i++) 
		{
			System.out.print("Nhap phan tu " + i + ": ");
			a[i] = nhapso();
		}
	}
	public void TongSoLe(int a[]) 
	{
		int sum = 0;
		for(int i = 0; i < a.length ; i++) 
		{
			if(a[i] > 0 && a[i]%2==1) 
			{
				sum += a[i];
			}
		}	
		System.out.println("Tong so le nguyen duong la : " + sum);
	}
	public void Timk(int a[], int k ) 
	{
		int in = -1;
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] == k)
            {
                in = i;
                break;
            }
        }
        if (in >= 0)
        {
            System.out.println(k + " Ton tai trong day o vi tri " + (in + 1));
        }
        if (in == -1)
        {
            System.out.println(k + " Khong ton tai trong day");
        }
	}
	public void SapXep(int a[]) 
	{
		for(int i = 0; i < a.length - 1; i++) 
		{
			for(int j = i + 1; j < a.length; j++) 
			{
				if(a[i] > a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
	public void Chen(int a[], int p, int x) 
	{
		int b[] = new int[x];
		for(int i = 0; i < a.length; i++) 
		{
			b[i] = a[i];
		}
		b[x - 1] = p;
		SapXep(b);
	}
	public static void main(String args[])  throws IOException
	{
		IO_5 b5 = new IO_5();
        
        int n = 0, k = 0, p = 0;
        try 
		{
			do 
			{
				System.out.print("Nhap n: ");
				n = b5.nhapso();
				int a[] = new int[n];
				b5.NhapMang(a);
				b5.TongSoLe(a);
				System.out.print("Nhap k de tim: ");
				k = b5.nhapso();
				b5.Timk(a, k);
				b5.SapXep(a);
				System.out.print("Nhap p de chen: ");
				p = b5.nhapso();
				int x = n + 1; 
				b5.Chen(a, p, x);
			} 
			while (n < 0);
			
		} 
		catch (Exception e) 
		{

		}
	}
}
