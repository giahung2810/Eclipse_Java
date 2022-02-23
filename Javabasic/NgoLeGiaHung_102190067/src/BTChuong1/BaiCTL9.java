package BTChuong1;

public class BaiCTL9 
{
	public static boolean CTL9(int n)
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
	public static void main(String args[])
	{
		if(CTL9(9119)) System.out.println(" la so doi xung");
		else System.out.println(" khong la so doi xung");
	}
}
