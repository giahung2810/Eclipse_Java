package qlsv;

public class CBBItem {
	private int id;
	private String description;
	public CBBItem(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public String toString() {
		return  description ;
	}
}
