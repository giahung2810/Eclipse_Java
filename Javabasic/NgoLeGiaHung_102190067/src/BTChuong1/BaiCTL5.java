package BTChuong1;

public class BaiCTL5 
{
	public static void CTL5(int n)
	{
		int s=0,p=1;
		while(n!=0)
		{
			s+=n%10;
			p*=n%10;
			n=n/10;
		}
		System.out.println("Tong: " + s +" Tich : " + p);
	}
	public static void main(String args[])
	{
		CTL5(234);
	}
}
