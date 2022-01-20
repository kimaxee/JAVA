package com.dg;

import java.util.ArrayList;

import com.dg.gym.data.Member;
import com.dg.gym.display.Title;

public class Main {
	public static void main(String[] args) {
		System.out.println(Title.TITLE);
		
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("너구리", "010-1111-1111", "여"));
		members.add(new Member("고라니", "010-2222-2222", "여"));
		members.add(new Member("호랑이", "010-3333-3333", "남"));
		members.add(new Member("재규어", "010-4444-4444", "남"));
		members.add(new Member("코끼리", "010-5555-5555", "남"));
		members.add(new Member("얼룩말", "010-6666-6666", "남"));
		members.add(new Member("원숭이", "010-7777-7777", "여"));
		members.add(new Member("코뿔소", "010-8888-8888", "남"));
		
		for (Member s : members) {
			s.info();
		}
	}
}
