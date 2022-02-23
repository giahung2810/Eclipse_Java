package model.Bean;

public class Vacxin {

	private String MaVacxin;
	private String TenVacxin;
	private String SoMui;
	private String MoTa;
	private String GiaVacxin;
	private String TenHangSX;
	
	
	public Vacxin(String maVacxin, String tenVacxin, String soMui, String moTa, String giaVacxin, String tenHangSX) {
		super();
		MaVacxin = maVacxin;
		TenVacxin = tenVacxin;
		SoMui = soMui;
		MoTa = moTa;
		GiaVacxin = giaVacxin;
		TenHangSX = tenHangSX;
	}
	public Vacxin() {
		// TODO Auto-generated constructor stub
	}
	public String getMaVacxin() {
		return MaVacxin;
	}
	public void setMaVacxin(String maVacxin) {
		MaVacxin = maVacxin;
	}
	public String getTenVacxin() {
		return TenVacxin;
	}
	public void setTenVacxin(String tenVacxin) {
		TenVacxin = tenVacxin;
	}
	public String getSoMui() {
		return SoMui;
	}
	public void setSoMui(String soMui) {
		SoMui = soMui;
	}
	public String getMoTa() {
		return MoTa;
	}
	public void setMoTa(String moTa) {
		MoTa = moTa;
	}
	public String getGiaVacxin() {
		return GiaVacxin;
	}
	public void setGiaVacxin(String giaVacxin) {
		GiaVacxin = giaVacxin;
	}
	public String getTenHangSX() {
		return TenHangSX;
	}
	public void setTenHangSX(String tenHangSX) {
		TenHangSX = tenHangSX;
	}
}
