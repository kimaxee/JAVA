package com.dg;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;
import com.dg.gym.display.Title;
import com.dg.gym.util.ExitProgram;
import com.dg.gym.util.MemberList;
import com.dg.gym.util.MemberSign;

public class Main {
	public static void main(String[] args) {
		System.out.println(Title.TITLE);
		Scanner sc = new Scanner(System.in);
		Boolean isNotEnd = true;
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("강아지", "111", "남"));
		members.add(new Member("고양이", "222", "여"));
		members.add(new Member("너구리", "333", "남"));
		members.add(new Member("호랑이", "444", "여"));

		while (isNotEnd) {
			System.out.print("명령을 입력하세요 ( 회원정보 : 1 / 회원가입 : 2 / 종료하기 : e )");
			String cmd = sc.next();
			switch (cmd) {
			case "1": // 회원정보
				MemberList list = new MemberList();
				list.memberList(members);
				break;
			case "2": // 회원가입
				MemberSign sign = new MemberSign();
				sign.memberSign(members);
				break;
			case "e": // 종료하기
				ExitProgram exit = new ExitProgram();
				exit.exitProgram();
				isNotEnd = false;
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		}
	}
}
