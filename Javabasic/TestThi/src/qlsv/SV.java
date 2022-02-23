package qlsv;


public class SV {
	private String mssv;
	private String tenSV;
	private String age;
	private String diachi;
	private int id_lop;
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getId_lop() {
		return id_lop;
	}
	public void setId_lop(int id_lop) {
		this.id_lop = id_lop;
	}
	public SV(String mssv, String tenSV, String age, String diachi, int id_lop) {
		this.mssv = mssv;
		this.tenSV = tenSV;
		this.age = age;
		this.diachi = diachi;
		this.id_lop = id_lop;
	}
}
