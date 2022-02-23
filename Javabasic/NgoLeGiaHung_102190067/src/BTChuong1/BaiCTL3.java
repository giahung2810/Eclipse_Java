package BTChuong1;

public class BaiCTL3 
{
	public static int GiaiThua(int n)
    {
        int s = 1;
        for (int i = 2; i <= n; i++)
        {
            s *= i;
        }
        return s;
    }
	public static double CTL3(int n)
	{
		double s=0;
		for (int i = 1; i < 2*n; i=i+2)
		{
			s=s + 1/(double)GiaiThua(i);
		}
		return s;
	}
	public static void main(String args[])
	{
		System.out.println(CTL3(4));
	}
}
