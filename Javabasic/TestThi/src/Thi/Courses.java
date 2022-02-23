package Thi;

public class Courses {
	private String Code;
	private String Name;
	private int Credit;
	
	
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		this.Code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getCredit() {
		return Credit;
	}
	public Courses(String code, String name,int credit) {
		this.Code = code;
		this.Name = name;
		this.Credit = credit;
	}
	public Courses() {
		// TODO Auto-generated constructor stub
	}
}
