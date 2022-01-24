package com.dg.chicken.menu;

import java.util.ArrayList;

import com.dg.chicken.data.Flavor;

public class Seasoning {
	public void proc(ArrayList<Flavor> flavors) {
		System.out.println("-----------------------");
		for (Flavor f : flavors) {
			f.info();
		}
		System.out.println("-----------------------");
		System.out.print("맛을 선택하세요 : ");
	}
}
