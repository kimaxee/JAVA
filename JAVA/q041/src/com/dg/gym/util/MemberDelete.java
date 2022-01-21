package com.dg.gym.util;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;

public class MemberDelete {
	public void memberDelete(ArrayList<Member> members) {
		Scanner sc = new Scanner(System.in);
		String memberDelete;
		int indexDelete = -1;
		
		System.out.println("*****회원삭제*****");
		System.out.print("삭제할 회원 입력 : ");
		memberDelete = sc.next();
		
		for(int i = 0; i < members.size(); i++) {
			if(members.get(i).getName().equals(memberDelete)) {
				indexDelete = i;
				break;
			}
		}
		
		if(indexDelete == -1) {
			System.out.println(memberDelete + " 회원정보가 없습니다.");
		} else {
			members.remove(indexDelete);
			System.out.println(memberDelete + " 회원정보가 삭제되었습니다.");
		}
	}
}
