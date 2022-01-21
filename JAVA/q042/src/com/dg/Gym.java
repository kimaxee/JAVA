package com.dg;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;
import com.dg.gym.display.Title;
import com.dg.gym.proc.DeleteMember;
import com.dg.gym.proc.Exit;
import com.dg.gym.proc.MemberList;
import com.dg.gym.proc.ModifyMember;
import com.dg.gym.proc.Sign;

public class Gym {
	void proc() {

		System.out.println(Title.TITLE);
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("너구리", "010-1111-1111", "여"));
		members.add(new Member("고라니", "010-2222-2222", "여"));
		members.add(new Member("호랑이", "010-3333-3333", "남"));
		members.add(new Member("재규어", "010-4444-4444", "남"));
		members.add(new Member("코끼리", "010-5555-5555", "남"));
		
		Scanner sc = new Scanner(System.in);
		boolean isNotEnd = true;
		while (isNotEnd) {
			System.out.print("명령을 입력하세요 : (회원정보 : 1 / 회원가입 : 2 / 회원삭제 : 3 / 회원수정 : 4 / 종료 : e)");
			String cmd = sc.next();
			switch (cmd) {
			case "1": // 회원정보
				MemberList list = new MemberList();
				list.proc(members);
				break;
			case "2": // 회원가입
				Sign sign = new Sign();
				sign.proc(members);
				break;
			case "3": // 회원삭제
				DeleteMember del = new DeleteMember();
				del.proc(members);
				break;
			case "4": // 회원수정
				ModifyMember modify = new ModifyMember();
				modify.proc(members);
				break;
			case "e": // 프로그램 종료
				Exit exit = new Exit();
				exit.exitProgram();
				isNotEnd = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}

		}

	}
}
