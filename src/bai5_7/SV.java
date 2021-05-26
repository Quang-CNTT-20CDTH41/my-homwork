package bai5_7;

public class SV {
	private String name;
	private double dtb;
	private int thuong;
	public SV(String name, double dtb) {
		super();
		this.name = name;
		this.dtb = dtb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public int getThuong() {
		return thuong;
	}
	public void setThuong(int thuong) {
		this.thuong = thuong;
	}
	public String toString() {
		return "Tên: " + name + "\tDTB: " + dtb;
	}
}
