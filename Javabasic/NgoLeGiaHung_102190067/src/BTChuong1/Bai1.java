package BTChuong1;


public class Bai1 {

	public static int Max(int a,int b,int c)
	{
		int max;
		max = a;
		if(max < b)
		{
			max = b;
		}
		if(max < c)
		{
			max = c;
		}
		return max;
	}
	public static void main(String args[])
	{
		System.out.println(Max(1,5,3));
	}
}
