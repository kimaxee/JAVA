package com.dg.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;

public class ModifyMember {
	Scanner sc = new Scanner(System.in);
	public void proc(ArrayList<Member> members) {
		System.out.println("====================4.회원정보수정====================");
		System.out.print("수정할 회원 입력 : ");
		String searchMember = sc.next();
		int searchIndex = -1;

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getName().equals(searchMember)) {
				searchIndex = i;
				break;
			}
		}
		
		if (searchIndex == -1) {
			System.out.println("*****회원정보가 없습니다*****");
			System.out.println("================================================");
		} else {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("전화번호를 입력하세요 : ");
			String tel = sc.next();
			System.out.print("성별을 입력하세요 : ");
			String gender = sc.next();
			members.set(searchIndex, new Member(name,tel,gender));
			System.out.println("*****회원정보가 수정되었습니다*****");
			System.out.println("이름 : " + name + " / 전화번호 : " + tel + " / 성별 : " + gender);
			System.out.println("================================================");
		}
	}
}
