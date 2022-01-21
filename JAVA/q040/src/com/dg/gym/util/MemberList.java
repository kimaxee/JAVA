package com.dg.gym.util;

import java.util.ArrayList;

import com.dg.gym.data.Member;

public class MemberList {
	public void memberList(ArrayList<Member> members) {
		System.out.println("*****회원정보*****");

		for (Member m : members) {
			m.info();
		}
	}
}
