package com.dg;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;
import com.dg.gym.display.Title;
import com.dg.gym.proc.DeleteMember;
import com.dg.gym.proc.ExitProgram;
import com.dg.gym.proc.JoinMembership;
import com.dg.gym.proc.ListMembers;

public class Main {
	public static void main(String[] args) {
		System.out.println(Title.TITLE);
		ArrayList<Member> members = new ArrayList<Member>();

		members.add(new Member("강아지", "010-1111-1111", "남"));
		members.add(new Member("고양이", "010-2222-2222", "여"));
		members.add(new Member("호랑이", "010-3333-3333", "남"));
		members.add(new Member("너구리", "010-4444-4444", "여"));

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n명령을 입력하세요: ( 1.회원정보 | 2.회원가입 | 3.회원삭제 | 4.회원수정 | e.종료 )");
			String cmd = sc.next();
			switch (cmd) {
			case "1": // 회원정보
				ListMembers list = new ListMembers();
				list.proc(members);
				break;
			case "2": // 회원가입
				JoinMembership join = new JoinMembership();
				join.proc(members);
				break;
			case "3": // 회원삭제
				DeleteMember del = new DeleteMember();
				del.proc(members);
				
				System.out.println("====================3.회원삭제====================");
				System.out.print("삭제할 회원 입력 : ");
				String deleteMember = sc.next();
				int deleteIndex = -1;

				for (int i = 0; i < members.size(); i++) {
					if (members.get(i).getName().equals(deleteMember)) {
						deleteIndex = i;
						break;
					}
				}
				
				if (deleteIndex == -1) {
					System.out.println("*****회원정보가 없습니다*****");
					System.out.println("================================================");
				} else {
					members.remove(deleteIndex);
					System.out.println("*****회원이 삭제되었습니다*****");
					System.out.println("================================================");
				}
				break;
			case "4": // 회원수정
				System.out.println("====================4.회원수정====================");
				break;
			case "e": // 종료하기
				ExitProgram exit = new ExitProgram();
				exit.proc();
				run = false;
				break;
			default:
				System.out.println("*****잘못 입력했습니다*****");
				break;
			}
		}
	}
}