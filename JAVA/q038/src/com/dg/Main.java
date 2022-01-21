package com.dg;

import java.util.ArrayList;

import com.dg.gym.data.Member;
import com.dg.gym.display.Title;

public class Main {
	public static void main(String[] args) {
		System.out.println(Title.TITLE);
		
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("강아지", "111", "남"));
		members.add(new Member("고양이", "222", "여"));
		members.add(new Member("너구리", "333", "남"));
		members.add(new Member("호랑이", "444", "여"));
		
		for (Member s : members) {
			s.info();
		}
	}
}
