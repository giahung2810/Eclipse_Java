package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_3 
{
	public String nhapchuoi() throws IOException 
	{
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return s;
    }
	public String ChuoiDao(String st)
    {
        String s = "";
        for(int i = st.length() - 1; i >= 0; i--)
        {
            s += st.charAt(i);
        }
        return s;
    }
	public String ChuoiHoa(String s)
    {
        String inhoa = "";
        for (int i = 0; i <= s.length() - 1; i++)
        {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                inhoa += (char)(s.charAt(i) - 32);
            }
            else
            {
                inhoa += s.charAt(i);
            }
        }
        return inhoa;
    }
	public String ChuoiThuong(String s)
    {
        String inthuong = "";
        for (int i = 0; i <= s.length() - 1; i++)
        {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                inthuong += (char)(s.charAt(i) + 32);
            }
            else
            {
                inthuong += s.charAt(i);
            }
        }
        return inthuong;
    }
	public String ChuoiHoaThuong(String st)
    {
        String inhoathuong = "";
        for(int i = 0; i <= st.length() - 1; i++)
        {
            if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z')
            {
                inhoathuong += (char)(st.charAt(i) + 32);
            }
            if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z')
            {
                inhoathuong += (char)(st.charAt(i) - 32);
            }
        }
        return inhoathuong;
    }
	public static void main(String[] args) {
        IO_3 b3 = new IO_3();
        String s  = "";
        try
        {
            s = b3.nhapchuoi();
        }
        catch (Exception e){}
        System.out.println("Chuoi dao " + b3.ChuoiDao(s));
        System.out.println("Inhoa " + b3.ChuoiHoa(s));
        System.out.println("Inthuong " + b3.ChuoiThuong(s));
        System.out.println("Invuathuongvuahoa " + b3.ChuoiHoaThuong(s));
    }
}
