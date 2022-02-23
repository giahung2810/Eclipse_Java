package BTChuong1;

public class BaiCTL11 
{
	public static boolean SHH(int n)
	{
		int s=0;
		for (int i = 1 ; i < n ; i++)
			if(n%i==0) 
				s+=i;
		if(s==n) return true;
		else return false;
	}
	public static void main(String args[])
	{
		int n = 1 ;
		while(n < 1000)
		{
			if(SHH(n)) System.out.println(" " + n);
			n++;
		}
	}
}	
