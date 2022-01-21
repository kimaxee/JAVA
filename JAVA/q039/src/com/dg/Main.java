package com.dg;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;
import com.dg.gym.display.Title;

public class Main {
	public static void main(String[] args) {
		System.out.println(Title.TITLE);

		while (true) {
			System.out.print("명령을 입력하세요(1/e) : ");
			Scanner sc = new Scanner(System.in);
			String cmd = sc.next();

			switch (cmd) {
			case "1":
				ArrayList<Member> members = new ArrayList<Member>();
				members.add(new Member("강아지", "111", "남"));
				members.add(new Member("고양이", "222", "여"));
				members.add(new Member("너구리", "333", "남"));
				members.add(new Member("호랑이", "444", "여"));

				for (Member s : members) {
					s.info();
				}
				break;

			case "e":
				System.out.println("프로그램을 종료합니다.");
				return;
			}

		}
	}
}
