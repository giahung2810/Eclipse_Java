package BTChuong1;

public class BaiCTL1 
{
	public static double CTL1(int n)
	{
		double s = 0 ;
		for( int i = 1 ; i <= n ; i++)
			s = s + (double)1/i;
		return s;
	}
	public static void main(String args[])
	{
		System.out.println(CTL1(13));
	}
}
