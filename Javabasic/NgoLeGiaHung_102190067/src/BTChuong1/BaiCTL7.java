package BTChuong1;

public class BaiCTL7 
{
	public static void CTL7(int n) 
	{
		int d = 0;
		if(n < 2) {
			System.out.println("Khong la so nguyen to");
		}
		else 
		{
			for(int i = 2; i <= Math.sqrt(n); i++ ) {
			if(n%i ==0) d++;
		}
		if(d == 0) System.out.println("La so nguyen to !");
		else System.out.println("Khong la so nguyen to !");
		}
	}
	public static void main(String args[])
	{
		CTL7(8);
	}
}
