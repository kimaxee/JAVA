package com.dg.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.gym.data.Member;

public class DeleteMember {
	public void proc(ArrayList<Member> members) {
		String nameDelete;
		int indexDelete = -1;
		Scanner sc = new Scanner(System.in);

		System.out.print("삭제할 회원 입력 : ");
		nameDelete = sc.next();

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getName().equals(nameDelete)) {
				indexDelete = i;
				break;
			}

		}
		if (indexDelete == -1) {
			System.out.println(nameDelete + " 회원정보가 없습니다.");
		} else {
			members.remove(indexDelete);
			System.out.println(nameDelete + " 회원정보가 삭제되었습니다.");
		}
	}
}
