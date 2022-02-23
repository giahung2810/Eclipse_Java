package model.Bean;

public class NhanVien {
	private String IDNV;
	private String Hoten;
	private String IDPB;
	private String Diachi;
	public NhanVien() {
	}
	public NhanVien(String id, String hoTen, String idPb, String diaChi) {
		this.IDNV = id;
		this.Hoten = hoTen;
		this.IDPB = idPb;
		this.Diachi = diaChi;
	}

	public String getIDNV() {
		return IDNV;
	}
	public void setIDNV(String iDNV) {
		IDNV = iDNV;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getIDPB() {
		return IDPB;
	}
	public void setIDPB(String iDPB) {
		IDPB = iDPB;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
}
