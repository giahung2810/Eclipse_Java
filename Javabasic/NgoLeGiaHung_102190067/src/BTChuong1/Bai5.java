package BTChuong1;

public class Bai5 
{
	public static int SoTrungGian( int a , int b , int c)
	{
		
		if( b < a && a < c || c < a && a < b)	return a;
		if( a < b && b < c || c < b && b < a)	return b;
		else return c;	
	}
	public static void main(String args[])
	{
		System.out.println(SoTrungGian(1,5,4));
	}
}
