package com.dg.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;

public class ListMembers {
	Scanner sc = new Scanner(System.in);
	public void proc(ArrayList<Member> members) {
		System.out.println("====================1.회원정보====================");
		for (Member m : members) {
			m.info();
		}
		System.out.println("================================================");
	}
}
