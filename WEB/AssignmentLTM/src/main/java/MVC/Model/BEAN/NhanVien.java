package MVC.Model.BEAN;

public class NhanVien {
	private int id;
	private String hoTen;
	private String idPb;
	private String diaChi;
	
	
	public NhanVien() {
	}
	public NhanVien(int id, String hoTen, String idPb, String diaChi) {
		this.id = id;
		this.hoTen = hoTen;
		this.idPb = idPb;
		this.diaChi = diaChi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getIdPb() {
		return idPb;
	}
	public void setIdPb(String idPb) {
		this.idPb = idPb;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
