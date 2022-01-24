package com.dg.chicken.proc;

import java.util.ArrayList;

import com.dg.chicken.data.Chicken;

public class ChickenMenu {
	public void proc(ArrayList<Chicken> chickens) {
		System.out.println("\n=======================");
		System.out.println("1.치킨을 선택하셨습니다.");
		System.out.println("-----------------------");
		for (Chicken c : chickens) {
			c.info();
		}
		System.out.println("-----------------------");
		System.out.print("종류를 선택하세요 : ");
	}
}
