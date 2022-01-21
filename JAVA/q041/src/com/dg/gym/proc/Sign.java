package com.dg.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;

public class Sign {
	public void proc(ArrayList<Member> members) {
		String name;
		String tel;
		String sex;

		System.out.print("이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();

		System.out.print("전화번호를 입력하세요 : ");
		tel = sc.next();

		System.out.print("성별을 입력하세요 : ");
		sex = sc.next();
		System.out.println("회원이 추가되었습니다");
		members.add(new Member(name, tel, sex));
	}
}
