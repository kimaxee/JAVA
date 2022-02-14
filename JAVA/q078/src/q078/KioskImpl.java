package q078;

import java.util.Scanner;

public class KioskImpl extends Product implements Kiosk {
	DrinkList drinkProc = new DrinkList();
	DessertList dessertProc = new DessertList();
	Scanner sc = new Scanner(System.in);

	public KioskImpl(String name, int price, int id) {
		super(name, price, id);
	}

	@Override
	public void displayProducts() {
		switch(sc.next()) {
		case "1":
			System.out.println("-----------------");
			System.out.println("음료를 선택하셨습니다.");
			System.out.println("-----------------");
			drinkProc.list();
		case "2":
			System.out.println("-----------------");
			System.out.println("디저트를 선택했습니다.");
			System.out.println("-----------------");
			dessertProc.list();
		default:
			System.out.println("잘못 선택하셨습니다.");
		}
	}

	@Override
	public void selectProducts() {
		switch(sc.next()) {
		case "1":
			System.out.println("-----------------");
			System.out.println("음료를 선택하세요");
			System.out.print(">> ");
			drinkProc.select();	
		case "2":
			System.out.println("-----------------");
			System.out.println("디저트를 선택하세요");
			System.out.print(">> ");
			dessertProc.select();
		default:
			System.out.println("잘못 선택하셨습니다.");
		}
	}

	@Override
	public void pay() {
		System.out.println("-----------------");
		System.out.println("[Y] 구매 [N] 취소");
		System.out.print(">> ");
	}
}
