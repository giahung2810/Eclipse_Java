package MVC.Model.BEAN;

public class PhongBan {
	private String id;
	private String tenPb;
	private String moTa;
	
	
	public PhongBan() {
	}
	public PhongBan(String id, String tenPb, String moTa) {
		this.id = id;
		this.tenPb = tenPb;
		this.moTa = moTa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenPb() {
		return tenPb;
	}
	public void setTenPb(String tenPb) {
		this.tenPb = tenPb;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
}
