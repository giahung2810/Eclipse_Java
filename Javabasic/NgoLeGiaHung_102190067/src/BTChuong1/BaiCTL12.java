package BTChuong1;

public class BaiCTL12 
{
	public static int CTL12(int n)
	{
		int f0 = 0, f1 = 1, fn;
		   fn = f1;
		   for(int i = 1; i <= n ; i++)
		   {
		    System.out.print(fn + " ");
		        fn = f0 + f1;
		        f0 = f1;
		        f1 = fn;
		   }
		   return fn;
	}
	public static void main(String args[])
	{
		CTL12(8);
	}
}
