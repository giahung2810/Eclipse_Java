package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_6 
{
	public int nhapso() throws IOException 
	{
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
	public void NhapMaTran(int a[][], int m, int n) throws IOException 
	{
		for(int i = 0; i < m; i++) 
		{
			for(int j = 0; j < n; j++) 
			{
				System.out.print("Phan tu hang a[" + i + "][" + j + "] = ");
				a[i][j] = nhapso();
			}
		}
		for(int i = 0; i < m; i++) 
		{
			for(int j = 0; j < n; j++) 
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public void Tichboi3(int a[][],int m, int n)
	{
		int temp = 1;
        for (int j = 0; j < n; j++)
        {
            if (a[0][j] % 3 == 0) {
                temp *= a[0][j];
            }
        }
        System.out.println("Tich boi 3 cua dong dau " + temp);
	}
	public int[] MangMotChieu(int a[][], int m ,int n)
	{
		int max = a[0][0];
		int X[] = new int[n-1];
		for (int i = 0; i < m; i++) 
		{
			max = a[i][0];
            for (int j = 0; j < n; j++) 
            {
                if(a[i][j] > m)
                {
                	max = a[i][j];
                }
                X[i] = max;
            }
        }
		for (int i = 0; i < n; i++) 
		{
			System.out.print("X=" + X[i] + "\t");
		}
		return X;
	}
	public void MMC(int X[], int n)
	{
		System.out.print("Xoa Phan Tu Dau Tien cua X");
		int Y[] = new int[n-2];
		for (int i = 0; i < n; i++) 
		{
			Y[i] = X[i+1];
		}
		for (int i = 0; i < n; i++) 
		{
			X[i] = Y[i];
		}
		for (int i = 0; i < n; i++) 
		{
			System.out.print("X=" + X[i] + "\t");
		}
	}
	public static void main(String args[])  
	{
		IO_6 b6 = new IO_6();
        
        int n = 0,m = 0;
        try 
		{
			do 
			{
				System.out.print("Nhap m: ");
				m = b6.nhapso();
				System.out.print("Nhap n: ");
				n = b6.nhapso();
				int a[][] = new int[m][n];
				b6.NhapMaTran(a,m,n);
				b6.Tichboi3(a, m, n);
				b6.MangMotChieu(a, m, n);
				b6.MMC(b6.MangMotChieu(a, m, n), n);
			} 
			while (n < 0 || m <0);
			
		} 
		catch (Exception e) 
		{

		}
	}
}
