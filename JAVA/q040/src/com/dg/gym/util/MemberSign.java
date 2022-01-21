package com.dg.gym.util;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;


public class MemberSign {
	public void memberSign(ArrayList<Member> members) {
		String name;
		String tel;
		String sex;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****회원가입*****");
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("번호를 입력하세요 : ");
		tel = sc.next();
		System.out.print("성별을 입력하세요 : ");
		sex = sc.next();
		members.add(new Member(name,tel,sex));
		System.out.println("회원이 추가되었습니다.");
	}
}
