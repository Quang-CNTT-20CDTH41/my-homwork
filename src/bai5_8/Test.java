package bai5_8;

import java.util.*;

public class Test {
	private static List<SV> list;

	public Test(SV[] arr) {
		super();
		list = new ArrayList<SV>();
		for (SV sv : arr) {
			list.add(sv);
		}
	}
	public void inAn() {
		for (SV sv : list) {
			sv.inSV();
		}
	}
	void sxDTBGiam() {
		list.sort(Comparator.comparing(SV::getDtb).reversed());
		for(SV x: list)
			x.inSV();
	}
	 public void chenSV(SV sv) {
			// TODO Auto-generated method stub
			int i=0;
			for (SV x: list)
				if(x.getDtb()>sv.getDtb())i++;
			list.add(i, sv);
		}
	static int demSVKhaGioi () {
		int i=0;
		for (SV x: list)
			if(x.getDtb()>=7)i++;
		return i;
	}
	void capNhatThuong (double k) {
	
		for (SV x: list) {
			if(x.getDtb()>=7);
				x.setThuong(k);
		System.out.println("Ten: "+x.getName()+" va diem trung binh: "+x.getDtb()+ " và thuong "+x.getThuong());
		}
	}
	 void xoaDTB (double k) {
		list.removeIf(SV->SV.getDtb()<k);
		for(SV x: list )
			x.inSV();
	}
	
}
