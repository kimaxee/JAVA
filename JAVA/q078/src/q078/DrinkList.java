package q078;

import java.util.ArrayList;
import java.util.Scanner;

public class DrinkList {
	Scanner sc = new Scanner(System.in);
	ArrayList<Product> drinks = new ArrayList<>();
	
	public void list() {
		drinks.add(new KioskImpl("카페라떼", 1000, 1));
		drinks.add(new KioskImpl("아메리카노", 1000, 2));
		drinks.add(new KioskImpl("카푸치노", 1500, 3));
		for (Product d : drinks) {
			d.info();
		}
	}
	
	public void select() {
		switch (sc.next()) {
		case "1":
			System.out.println(drinks.get(0).getId() + "번 " + drinks.get(0).getName() + "를 선택했습니다");
			break;
		case "2":
			System.out.println(drinks.get(1).getId() + "번 " + drinks.get(1).getName() + "를 선택했습니다");
			break;
		case "3":
			System.out.println(drinks.get(2).getId() + "번 " + drinks.get(2).getName() + "를 선택했습니다");
			break;
		default:
			System.out.println("잘못 선택하셨습니다.");
		}
	}
}
