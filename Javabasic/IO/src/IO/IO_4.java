package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_4 
{
	public String nhapchuoi() throws IOException 
	{
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return s;
    }
	public String VietHoa(char s)
    {
        String inhoa = "";
        if (s >= 'a' && s <= 'z')
            {
                inhoa += (s - 32);
            }
            else
            {
                inhoa += s;
            }
        return (String)inhoa;
    }
	public String inHoaChuDau(String s) 
	{
        String x = "";
        if (s.charAt(0) != ' ' && s.charAt(0) >='a' && s.charAt(0) <='z' ) {
            x += VietHoa(s.charAt(0));
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && s.charAt(i + 1) >='a' && s.charAt(i + 1) <='z' ) {
                	x += VietHoa(s.charAt(0));
                }
                else
                {
                    x += s.charAt(i + 1);
                }
            }
        }
        else
        {
            for (int i = 0; i < s.length() - 1; i++) 
            {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && s.charAt(i + 1) >='a' && s.charAt(i + 1) <='z' ) {
                	x += VietHoa(s.charAt(0));
                }
                else
                {
                    x += s.charAt(i + 1);
                }
            }
        }
        return x;
	}
	public void inMoiTuMoiDong(String s)
    {
        char x;
        for (int i = 0; i < s.length(); i++)
        {
            x = s.charAt(i);
            if(x == ' ')
            {
                System.out.println();
            }
            else
            {
                System.out.print(x);
            }
        }
    }
	public void NguyenAm(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
            	System.out.println(s.charAt(i));
            }
        }
    }
	public void DemSoTu(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != ' ')
            {
                count++;
            }
        }
        System.out.println(count);
    } 
	public static void main(String[] args) 
	{
        IO_4 b4 = new IO_4();
        String s = "";
        try {
            s = b4.nhapchuoi();
        } catch (Exception e) {}
        System.out.println("Inhoachudau " + b4.inHoaChuDau(s));
        b4.inMoiTuMoiDong(s);
        System.out.println();
        b4.NguyenAm(s);
        b4.DemSoTu(s);
    }
}
