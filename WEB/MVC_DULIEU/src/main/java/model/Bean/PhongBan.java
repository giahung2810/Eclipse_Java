package model.Bean;


public class PhongBan {
	private String IDPB;
	private String TenPB;
	private String Mota;
	public PhongBan(String id, String tenPb, String moTa) {
		this.IDPB = id;
		this.TenPB = tenPb;
		this.Mota = moTa;
	}
	public PhongBan() {
		// TODO Auto-generated constructor stub
	}
	public String getIDPB() {
		return IDPB;
	}
	public void setIDPB(String iDPB) {
		IDPB = iDPB;
	}
	public String getTenPB() {
		return TenPB;
	}
	public void setTenPB(String tenPB) {
		TenPB = tenPB;
	}
	public String getMota() {
		return Mota;
	}
	public void setMota(String mota) {
		Mota = mota;
	}
}
