package q078;

import java.util.ArrayList;
import java.util.Scanner;

public class DessertList {
	Scanner sc = new Scanner(System.in);
	ArrayList<Product> desserts = new ArrayList<>();
	
	public void list() {
		desserts.add(new KioskImpl("마카롱", 2500, 1));
		desserts.add(new KioskImpl("머핀", 2000, 2));
		desserts.add(new KioskImpl("팥빙수", 4000, 3));
		for (Product d : desserts) {
			d.info();
		}
	}
	
	public void select() {
		switch (sc.next()) {
		case "1":
			System.out.println(desserts.get(0).getId() + "번 " + desserts.get(0).getName() + "를 선택했습니다");
			break;
		case "2":
			System.out.println(desserts.get(1).getId() + "번 " + desserts.get(1).getName() + "를 선택했습니다");
			break;
		case "3":
			System.out.println(desserts.get(2).getId() + "번 " + desserts.get(2).getName() + "를 선택했습니다");
			break;
		default:
			System.out.println("잘못 선택하셨습니다.");
		}
	}
}
