package Bai5_6;

import java.util.*;

public class Management {

	public static void main(String[] args) {
		// khởi tạo
		List<Integer> list = new ArrayList<Integer>();
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = sc.nextInt();
		// nhập ngẫu nhiên - random
		for(int i=0; i<n; i++) {
			list.add(rd.nextInt(20)+1);
		}
		// Thêm giá trị 10,15,20 cho list
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(15);
		list1.add(20);
		list.addAll(list1);
		// sắp xếp giảm dần
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		// đếm xem có bao nhiêu phần tử chẵn
		int x = 0;
		for(int i=0; i<n+3; i++) {
			if(list.get(i) % 2 ==0) {
				x++;
			}
		}
		System.out.println("số phần tử chẵn : " + x);
		// nhân 2 số phần tử chia hết cho 3 và 7
		for(int j=0; j<n+3; j++) {
			if(list.get(j) %3 == 0 || list.get(j) % 7== 0) {
				list.set(j,  list.get(j) * 2);
			}
		}
		System.out.println("Nhân 2 số phần tử chia hết cho 3 và 7: ");
		System.out.println(list);
		// Xoá các phần tử lẽ ra khỏi danh sách
		for(int k=0; k<n+3; k++) {
			list.removeIf( number -> number%2 != 0 );
		}
		System.out.println("Xoá các phần tử lẽ ra khỏi danh sách: ");
		System.out.println(list);
	}
}
