package bai5_8;

public class Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SV[] arr = { new SV("Quang", 8.9), new SV("Phuong", 9.9), new SV("Hoang", 7.8)};
		Test test = new Test(arr);
		test.inAn();
		test.sxDTBGiam();
		test.chenSV( new SV("Tai", 8.0));
		test.inAn();
		System.out.println("Dem kha gioi: "+test.demSVKhaGioi());
		test.capNhatThuong(10);
		test.xoaDTB(5);
	}
}


