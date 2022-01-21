package com.dg.gym.proc;

import java.util.ArrayList;

import com.dg.gym.data.Member;

public class MemberList {
	public void proc(ArrayList<Member> members) {
		for (Member s : members) {
			s.info();
		}
	}
}
