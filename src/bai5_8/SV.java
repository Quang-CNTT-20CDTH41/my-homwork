package bai5_8;

public class SV {
	private String name;
	private double dtb;
	private double thuong;
	public SV(String name, double dtb) {
		super();
		this.name = name;
		this.dtb = dtb;
	}
	public void  inSV() {
		System.out.println( "Tên: " + name + "\tDTB: " + dtb);
	}
	public String getName() {
		return name;
	}
	public double getDtb() {
		return dtb;
	}
	public double getThuong() {
		return thuong;
	}
	public void setThuong(double k) {
		this.thuong = k;
	}
}
