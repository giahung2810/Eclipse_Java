package BTChuong1;

public class BaiCTL2 
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
	public static double CTL2(int n)
	{
		double s =15.0;
		for(int i = 1; i <= n; i++)
		{
			if((i % 2) == 0)
			{
				s = (s + 1/(double)GiaiThua(i));
			}
			else 
			{
				s = (s - 1/(double)GiaiThua(i));
			}
		}
		return s;
	}
	public static void main(String args[])
	{
		System.out.println(CTL2(3));
	}
}
