package BTChuong1;

public class BaiCTL8 
{
	public static boolean CTL8(int n)
	{
		int i =1;
		 while(i*i <= n)
		 {
			 if(i*i == n)
			 {
		     System.out.println(n + " la so chinh phuong");
		     return true;
		     }
		        ++i;
		 }
		 System.out.println(n + " khong phai so chinh phuong");
		 return false;
	}
	public static void main(String args[])
	{
		CTL8(8);
	}
}
