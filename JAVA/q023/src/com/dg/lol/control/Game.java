package com.dg.lol.control;

import java.util.Scanner;

import com.dg.lol.img.Entrance;

public class Game {
	String cmd = "";

	public void start() {
		Entrance.show();
		System.out.print("명령을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in); // 키보드 입력을 받게 하기 위한 객체 생성
		// sc.next() 함수가 호출되면 키보드 입력 대기 상태가 됨. (실행흐름이 여기서 잠시 멈춤)
		cmd = sc.next();
		// 입력 후 엔터를 쳐서 입력이 끝나야 실행 흐름이 다시 시작됨.
		System.out.println(cmd);
	}

}
