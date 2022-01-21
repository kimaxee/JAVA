package com.dg.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;

public class JoinMembership {
	Scanner sc = new Scanner(System.in);
	public void proc(ArrayList<Member> members) {
		System.out.println("====================2.회원가입====================");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("전화번호를 입력하세요 : ");
		String tel = sc.next();
		System.out.print("성별을 입력하세요 : ");
		String gender = sc.next();
		members.add(new Member(name,tel,gender));
		System.out.println("*****회원이 추가되었습니다*****");
		System.out.println("이름 : " + name + " / 전화번호 : " + tel + " / 성별 : " + gender);
		System.out.println("================================================");
	}
}
