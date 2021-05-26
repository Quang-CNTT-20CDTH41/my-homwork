package bai5_7;

import java.util.*;

public class Management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<SV> list = new ArrayList<>();
		SV sv1 = new SV("Quang", 5.3);
		list.add(sv1);
		SV sv2 = new SV("Nhi", 8.9);
		list.add(sv2);
		SV sv3 = new SV("Phước", 7.5);
		list.add(sv3);
		SV sv4 = new SV("Nhat", 4.2);
		list.add(sv4);
		SV sv5 = new SV("Hoang",7.8);
		list.add(sv5);
		
		// sắp xếp sv giảm dần theo dtb
		list.sort(Comparator.comparing(SV::getDtb).reversed());
		for (SV sv : list) {
			System.out.println(sv);
		}
		
		// add thêm sinh viên
		SV sv6 = new SV("Nhung",8.8);
		list.add(sv6);
//		list.sort(Comparator.comparing(SV::getDtb).reversed());
		System.out.println("\nThêm SV: "); 
		for (SV sv : list) {
			System.out.println(sv);
		}
		
		// đếm xem trong list có bnhieu sv có dtb >=7
		int dem = 0;
		for (int i = 0; i <list.size(); i++) {
			if(list.get(i).getDtb() >=7 ) {
				dem++;
			}
		}
		System.out.println("\nSố SV có DTB lớn hơn 7: " + dem);
		
		
		// Thay đổi giá trị thuong la k neu dtb >= 7 
		System.out.println("\nNhâp k: ");
		int k = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getDtb() >=7 ) {
				list.get(i).setThuong(k); 
			}
		}
		for (SV sv : list) {
			System.out.println("Ten: "+ sv.getName() + "\tThuong: "+ sv.getThuong());
		}
		
		
		// xoá sv có dtb bé hơn 5
		// cách 1
		System.out.println("\nXoá SV DTB < 5: ");
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getDtb() < 5) {
				list.remove(i).getDtb();
			}
		}
		System.out.println(list);
		
		
		// cách 2
		System.out.println("\nXoá SV DTB < 5: ");
		for (int i = 0; i < list.size(); i++) {
			list.removeIf(SV -> SV.getDtb() < 5);
		}
		for (SV sv : list) {
			System.out.println(sv);
		}
	}
}
