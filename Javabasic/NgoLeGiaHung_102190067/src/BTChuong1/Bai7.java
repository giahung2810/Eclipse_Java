package BTChuong1;

public class Bai7 
{
	public static void Dayof(int month, int year)
	{
		switch (month)
		{
        	case 1:
        	case 3:
        	case 5:
        	case 7:
        	case 8:
        	case 10:
        	case 12:
        		System.out.println("thang " + month + " nam "+year+ " co 31 ngay");
        		break;
        		
        	case 4:
        	case 6:
        	case 9:
        	case 11:
        		System.out.println("thang " + month + " nam "+year+  " có 30 ngày.");
        		break;
             
        	case 2:
        		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
        		{
        			System.out.println("thang " + month + " nam " + year + " co 29 ngay");
        		} 
        		else 
        		{
        			System.out.println("thang " + month + " nam " + year + " co 28 ngay");
        		}
        		break;
        	default:
        		System.out.println("Thang khong hop le");
        }
	}
	public static void main(String args[])
	{
		Dayof(2,2020);
	}
}
