package com.dg.lol.control;

import com.dg.lol.data.monster.Goblin;
import com.dg.lol.data.monster.Orc;
import com.dg.lol.data.string.Str;
import com.dg.lol.data.user.User;
import com.dg.lol.img.Entrance;

public class Game {
	String cmd = "";

	public void start() {
		Entrance.show();
		User.characterName = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		User.characterSex = Command.getCommand(Str.CMD_GUIDE_CHARACTER_SEX_INPUT);
		User.characterJob = Command.getCommand(Str.CMD_GUIDE_CHARACTER_JOB_INPUT);
		String s = String.format("당신의 이름은 %s입니다~\n", User.characterName);
		s += String.format("당신의 성별은 %s입니다~\n", User.characterSex);
		s += String.format("당신의 직업은 %s입니다~", User.characterJob);
		System.out.println(s);
		
		Orc orc1 = new Orc("오크", 100, 100, 10);
		Orc orc2 = new Orc("오크", 100, 100, 10);
		
		Goblin goblin1 = new Goblin("고블린", 80, 80, 5);
		Goblin goblin2 = new Goblin("고블린", 80, 80, 5);
		Goblin goblin3 = new Goblin("고블린", 80, 80, 5);
		
		orc1.info(); orc2.info();
		goblin1.info(); goblin2.info(); goblin3.info();
		
		System.out.println("");
		
		User.info();
		
	}
}