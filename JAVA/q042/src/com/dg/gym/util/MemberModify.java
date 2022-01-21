package com.dg.gym.util;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;

public class MemberModify {
	public void memberModify(ArrayList<Member> members) {
		Scanner sc = new Scanner(System.in);
		String memberModify;
		String name;
		String tel;
		String sex;
		int indexModify = -1;
		
		System.out.println("*****회원수정*****");
		System.out.print("수정할 회원 입력 : ");
		memberModify = sc.next();
		
		for(int i = 0; i < members.size(); i++) {
			if(members.get(i).getName().equals(memberModify)) {
				indexModify = i;
				break;
			}
		}
		
		if(indexModify == -1) {
			System.out.println(memberModify + " 회원정보가 없습니다.");
		} else {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("번호를 입력하세요 : ");
			tel = sc.next();
			System.out.print("성별을 입력하세요 : ");
			sex = sc.next();
			members.set(indexModify, new Member(name,tel,sex));
			System.out.println(memberModify + " 회원정보가 수정되었습니다.");
		}
	}
}
