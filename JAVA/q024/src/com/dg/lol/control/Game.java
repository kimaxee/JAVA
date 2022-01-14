package com.dg.lol.control;

import com.dg.lol.img.Entrance;

public class Game {
	String cmd = "";

	public void start() {
		Entrance.Show();
		String cmd = Command.getCommand("명령을 입력해주세요 : ");
		System.out.println(cmd);
	}

}
