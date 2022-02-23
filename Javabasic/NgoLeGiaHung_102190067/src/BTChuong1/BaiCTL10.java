package BTChuong1;

public class BaiCTL10 
{
	public static boolean SNT(int n) 
	{
		int d = 0;
		if(n < 2) {
			return false;
		}
		else 
		{
			for(int i = 2; i <= Math.sqrt(n); i++ ) {
			if(n%i ==0) d++;
		}
		if(d == 0) return true;
		else return false;
		}
	}
	public static void CTL10(int n)
	{
		for (int i = 0; i <= n; i++) 
		{
            if (SNT(i)) 
            {
                System.out.print(" " + i);
            }
		}
	}
	public static void main(String args[])
	{
		CTL10(7);
	}
}
