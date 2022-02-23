package model.Bean;

public class sinhvien {
	private String MSSV;
	private String HoTen;
	private String GioiTinh;
	private String Khoa;
	public sinhvien() {
	}
	public sinhvien(String MSSV, String HoTen, String GioiTinh, String Khoa) {
		this.MSSV = MSSV;
		this.HoTen = HoTen;
		this.GioiTinh = GioiTinh;
		this.Khoa = Khoa;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}

	
}
