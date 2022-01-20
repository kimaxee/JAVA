package com.dg;

import java.util.ArrayList;

import com.dg.gym.control.Command;
import com.dg.gym.data.Member;
import com.dg.gym.data.string.Str;
import com.dg.gym.display.Title;
import com.dg.gym.util.Sign;

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
		
		while (true) {
			System.out.print("명령을 입력하세요 : (회원정보 : 1 / 회원가입 : 2 / 종료 : e)");
			String cmd = Command.getCommand("");

			switch (cmd) {
			case "1":
				
				for (Member s : members) {
					s.info();
				}
				break;
			case "2":
				Sign.name = Command.getCommand(Str.CMD_GUIDE_SIGN_NAME_INPU);
				Sign.tel = Command.getCommand(Str.CMD_GUIDE_SIGN_TEL_INPU);
				Sign.sex = Command.getCommand(Str.CMD_GUIDE_SIGN_SEX_INPU);
				Sign.signMember(members);
				break;
			case "e":
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}

		}
	}
}
