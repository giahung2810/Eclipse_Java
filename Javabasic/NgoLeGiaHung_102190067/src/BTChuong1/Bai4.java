package BTChuong1;

public class Bai4 
{
	public static void HPT(float a1, float b1, float c1, float a2, float b2, float c2)
	{
		float D,Dx,Dy;
		D = a1*b2 - a2*b1;
		Dx = c1*b2 - c2*b1;
		Dy = a1*c2 - a2*c1;
		
		if( D == 0)
		{
			if( Dx + Dy == 0)
			{
				System.out.println("HPTVSN");
			} else {
				System.out.println("HPTVN");
			}
		}
		else 
		{
			System.out.println("x = " + Dx/D + ", y = " + Dy/D);
		}
	}
	public static void main(String args[])
	{
		HPT(1,1,1,1,2,1);
	}
}
