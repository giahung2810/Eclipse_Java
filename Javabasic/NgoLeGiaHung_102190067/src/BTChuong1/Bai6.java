package BTChuong1;

public class Bai6 
{
	public static void KaraOke(int a, int b)
	{
		int TT;
		if(b>a)
		{
			if(b<=18) 
			{
				TT = (b-a)*45000;
				System.out.println("Gio bat dau : " +a +" Gio ket thuc" + b +" --> Truoc 18h --> Tinh Tien : " + TT);
			}
			else if(a<18 && b>18)
			{
				TT = (18-a)*45000 + (b-18)*60000;
				System.out.println("Gio bat dau : " +a +" Gio ket thuc " + b +" --> Tinh Tien : " + TT);
			}
			else
			{
				TT = (b-a)*60000;
				System.out.println("Gio bat dau : " +a +" Gio ket thuc" + b +" --> Sau 18  --> Tinh Tien : " + TT);
			}
		}
		else
		{
			System.out.println("gio ket thuc phai lon hon gio bat dau");
		}
	}
	public static void main(String args[])
	{
		KaraOke(16,20);
	}
}
