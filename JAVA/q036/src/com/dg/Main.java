package com.dg;

import com.dg.gym.display.Title;

public class Main {
	public static void main(String[] args) {
		System.out.println(Title.TITLE);
		
		Member dog = new Member("강아지", "010-1234-5678", "남");
		Member cat = new Member("고양이", "010-2345-6789", "여");

		dog.info();
		cat.info();
		dog.setName("불독");
		dog.setTel("010-3456-7890");
		dog.setSex("여");
		dog.info();

		System.out.println("이름 : " + dog.getName() + " / 전화번호 : " + dog.getTel() + " / 성별 : " + dog.getSex());
	}
}
