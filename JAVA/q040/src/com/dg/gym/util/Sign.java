package com.dg.gym.util;

import java.util.ArrayList;

import com.dg.gym.data.Member;

public class Sign {
	public static String name = "";
	public static String tel = "";
	public static String sex = "";
	
	public static void signMember(ArrayList<Member> members) {
		System.out.println("이름 : " + name + " / 전화번호 : " + tel + " / 성별 : " + sex);
		members.add(new Member(name, tel, sex));
	}
}
