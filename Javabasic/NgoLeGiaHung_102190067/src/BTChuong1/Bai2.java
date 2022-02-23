package BTChuong1;

public class Bai2 
{
	public static void PTB1(double a,double  b)
	{
		if( a == 0)
		{
			if( b == 0 ) 
			{
				System.out.println("PT có VSN ");
			}
			else {
				System.out.println("PT VN ");
			}
		}
		else {
			System.out.println( (double) -b / a);
			 }
	}
	public static void main(String args[])
	{
		PTB1(1.1,1);
	}
}
