package com.dg.chicken.proc;

import java.util.ArrayList;

import com.dg.chicken.data.Side;

public class SideMenu {
	public void proc(ArrayList<Side> sides) {
		System.out.println("\n=======================");
		System.out.println("2.사이드를 선택하셨습니다.");
		System.out.println("-----------------------");
		for (Side s : sides) {
			s.info();
		}
		System.out.println("-----------------------");
		System.out.print("종류를 선택하세요 : ");
	}
}
