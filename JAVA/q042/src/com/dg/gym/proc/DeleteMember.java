package com.dg.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;

public class DeleteMember {
	Scanner sc = new Scanner(System.in);
	public void proc(ArrayList<Member> members) {
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
	}
}
