package BTChuong1;

public class BaiCTL13 
{
	public static int F(int n)
    {
        if ( n == 0 || n == 1) return 1;
        else return F(n - 1) + F(n - 2);
    }
	public static void CTL13(int n)
	{
		int count = 0;
		for(int i = 0 ;i <= n; i++)
		{
			if(F(i) == n) 
			{
				System.out.println(n+ " thuoc day Fibonacci tai vi tri thu : " +(i+1));
				count++;
			}
		}
		if(count == 0) System.out.println(n+ " khong thuoc day Fibonacci");
	}
	public static void main(String args[])
	{
		CTL13(4);
	}
}
