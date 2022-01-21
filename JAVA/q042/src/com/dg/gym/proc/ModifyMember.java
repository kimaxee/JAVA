package com.dg.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;

public class ModifyMember {
	public void proc(ArrayList<Member> members) {
		Scanner sc = new Scanner(System.in);
		String memberModify;
		String name;
		String tel;
		String sex;
		int indexSearch = -1;

		System.out.print("수정할 회원 입력 : ");
		memberModify = sc.next();

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getName().equals(memberModify)) {
				indexSearch = i;
				break;
			}
		}

		if (indexSearch == -1) {
			System.out.println(memberModify + " 회원정보가 없습니다.");
		} else {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();

			System.out.print("전화번호를 입력하세요 : ");
			tel = sc.next();

			System.out.print("성별을 입력하세요 : ");
			sex = sc.next();
			System.out.println(memberModify + " 회원정보가 수정되었습니다.");
			members.set(indexSearch, new Member(name, tel, sex));
		}
	}
}
