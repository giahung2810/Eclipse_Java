package qlsv;

public class LSH {
	private int ID_Lop;
	private String TenLop;
	public LSH(int iD_Lop, String tenLop) {
		super();
		ID_Lop = iD_Lop;
		TenLop = tenLop;
	}
	public int getID_Lop() {
		return ID_Lop;
	}
	public void setID_Lop(int iD_Lop) {
		ID_Lop = iD_Lop;
	}
	public String getTenLop() {
		return TenLop;
	}
	public void setTenLop(String tenLop) {
		TenLop = tenLop;
	}
}
