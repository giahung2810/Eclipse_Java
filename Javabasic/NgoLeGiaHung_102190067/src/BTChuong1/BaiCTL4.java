package BTChuong1;

public class BaiCTL4 
{
	public static int CTL4(int n)
	{
		int s = 1;
		while(n > 0)
		{
			s*= n;
			n-=2;
		}
		return s;
	}
	public static void main(String args[])
	{
		System.out.println(CTL4(5));
	}
}
