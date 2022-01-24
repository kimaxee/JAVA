package com.dg.chicken.proc;

import java.util.ArrayList;

import com.dg.chicken.data.Drink;

public class DrinkMenu {
	public void proc(ArrayList<Drink> drinks) {
		System.out.println("\n=======================");
		System.out.println("3.음료를 선택하셨습니다.");
		System.out.println("-----------------------");
		for (Drink d : drinks) {
			d.info();
		}
		System.out.println("-----------------------");
		System.out.print("종류를 선택하세요 : ");
	}

}
