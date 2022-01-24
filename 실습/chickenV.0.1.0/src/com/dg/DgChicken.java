package com.dg;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Chicken;
import com.dg.chicken.data.Drink;
import com.dg.chicken.data.Flavor;
import com.dg.chicken.data.Side;
import com.dg.chicken.diaplay.Title;
import com.dg.chicken.list.ChickenList;
import com.dg.chicken.list.DrinkList;
import com.dg.chicken.list.FlavorList;
import com.dg.chicken.list.SideList;
import com.dg.chicken.menu.Seasoning;
import com.dg.chicken.proc.ChickenMenu;
import com.dg.chicken.proc.DrinkMenu;
import com.dg.chicken.proc.SideMenu;

public class DgChicken {
	String name;
	String taste;

	public void proc() {
		System.out.println(Title.TITLE);
		Scanner sc = new Scanner(System.in);

		ArrayList<Chicken> chickens = new ArrayList<Chicken>();
		ChickenList chickenList = new ChickenList();
		chickenList.list(chickens);

		ArrayList<Side> sides = new ArrayList<Side>();
		SideList sideList = new SideList();
		sideList.list(sides);

		ArrayList<Drink> drinks = new ArrayList<Drink>();
		DrinkList drinkList = new DrinkList();
		drinkList.list(drinks);

		ArrayList<Flavor> flavors = new ArrayList<Flavor>();
		FlavorList flavorList = new FlavorList();
		flavorList.list(flavors);

		boolean run = true;
		while (run) {
			System.out.print("\n메뉴를 입력하세요 : ( 1.치킨정보 | 2.사이드정보 | 3.음료정보 | 4.주문내역 )");
			String selectNo = sc.next();
			switch (selectNo) { // 메뉴 선택
			case "1": // 치킨정보
				ChickenMenu chickenMenu = new ChickenMenu();
				chickenMenu.proc(chickens);
				name = sc.next();

				switch (name) { // 치킨종류 선택
				case "후라이드":
					System.out.println("=======================");
					System.out.println(name + "를 선택하셨습니다.");
					break;

				case "양념":
					System.out.println("=======================");
					System.out.println(name + "을 선택하셨습니다.");
					Seasoning seasoning = new Seasoning();
					seasoning.proc(flavors);
					taste = sc.next();

					switch (taste) {
					case "순한맛":
						System.out.println("=======================");
						System.out.println(taste + "을 선택하셨습니다.");
						break;
					case "중간맛":
						System.out.println("=======================");
						System.out.println(taste + "을 선택하셨습니다.");
						break;
					case "매운맛":
						System.out.println("=======================");
						System.out.println(taste + "을 선택하셨습니다.");
						break;
					default:
						System.out.println(taste + "는(은) 없습니다 다시 선택하세요.");
						System.out.println("-----------------------");
						for (Flavor f : flavors) {
							f.info();
						}
						System.out.println("-----------------------");
						System.out.print("맛을 선택하세요 : ");
						break;
					}
					break;

				case "갈릭":
					System.out.println("=======================");
					System.out.println(name + "을 선택하셨습니다.");
					break;

				case "바베큐":
					System.out.println("=======================");
					System.out.println(name + "를 선택하셨습니다.");
					break;

				default:
					System.out.println(name + "는(은) 없습니다 다시 선택하세요.");
					System.out.println("-----------------------");
					for (Chicken c : chickens) {
						c.info();
					}
					System.out.println("-----------------------");
					System.out.print("종류를 선택하세요 : ");
				}
				break;

			case "2": // 사이드 정보
				SideMenu sideMenu = new SideMenu();
				sideMenu.proc(sides);
				name = sc.next();
				switch (name) {
				case "감자튀김":
					System.out.println("=======================");
					System.out.println(name + "을 선택하셨습니다.");
					break;
				case "새우튀김":
					System.out.println("=======================");
					System.out.println(name + "을 선택하셨습니다.");
					break;
				case "치즈스틱":
					System.out.println("=======================");
					System.out.println(name + "을 선택하셨습니다.");
					break;
				case "떡볶이":
					System.out.println("=======================");
					System.out.println(name + "를 선택하셨습니다.");
					break;
				}
				break;

			case "3": // 음료 정보
				DrinkMenu drinkMenu = new DrinkMenu();
				drinkMenu.proc(drinks);
				name = sc.next();
				switch (name) {
				case "콜라":
					System.out.println("=======================");
					System.out.println(name + "를 선택하셨습니다.");
					break;
				case "사이다":
					System.out.println("=======================");
					System.out.println(name + "를 선택하셨습니다.");
					break;
				case "생맥주":
					System.out.println("=======================");
					System.out.println(name + "를 선택하셨습니다.");
					break;
				}
				break;

			case "4": // 주문내역
				System.out.println("\n=======================");
				System.out.println("4.주문내역을 선택하셨습니다.");
				System.out.println("-----------------------");
				break;

			default:
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");

			}
		}

	}
}
