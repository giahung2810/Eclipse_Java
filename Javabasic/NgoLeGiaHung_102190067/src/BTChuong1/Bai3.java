package BTChuong1;


public class Bai3 
{
	public static void PTB2(double a, double b , double c)
	{
		double d = b*b - 4*a*c;
		double x1, x2 ;
		
		if( d > 0)
		{
			x1 = ((-b + Math.sqrt(d)) / (2*a));
            x2 = ((-b - Math.sqrt(d)) / (2*a));
            System.out.println("PT co 2 nghiem    x1 = " + x1 + " x2 = "+ x2 );
		}
		else if( d == 0) 
		{
			x1 = ( -b / 2*a);
			x2 = ( -b / 2*a);
			System.out.println("PT co 1 nghiem kep x1 = x2 = " + x1);
		}
		else 
		{
			System.out.println("PT vo nghiem ");
		}
	}
	public static void main(String args[])
	{
		PTB2(1,4,2);
	}
}
