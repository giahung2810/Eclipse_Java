package BTChuong1;

public class BaiCTL6 
{
	public static int UCLN(int a, int b)
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
		} return a;
	}
	public static int BCNN(int a, int b)
	{
		return a*b/UCLN(a,b);
	}
	public static void main(String args[])
	{
		System.out.println("UCLN: " +UCLN(3,6) + " BCNN: "+ BCNN(3,6));
	}
}
