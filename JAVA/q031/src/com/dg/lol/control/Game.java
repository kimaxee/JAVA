package com.dg.lol.control;

import com.dg.lol.data.monster.Goblin;
import com.dg.lol.data.monster.Orc;
import com.dg.lol.data.string.Str;
import com.dg.lol.data.user.User;
import com.dg.lol.img.Entrance;
import com.dg.lol.util.So;

public class Game {

	Goblin goblin1;

	public void start() {
		Entrance.show();
		User.name = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		User.sex = Command.getCommand(Str.CMD_GUIDE_CHARACTER_SEX_INPUT);
		User.job = Command.getCommand(Str.CMD_GUIDE_CHARACTER_JOB_INPUT);
		String s = String.format("당신의 이름은 %s입니다~\n", User.name);
		s += String.format("당신의 성별은 %s입니다~\n", User.sex);
		s += String.format("당신의 직업은 %s입니다~\n", User.job);
		So.pl(s);

		Orc orc1 = new Orc("오크", 100, 100, 10);
		Orc orc2 = new Orc("오크", 100, 100, 10);
		goblin1 = new Goblin("고블린", 80, 80, 5);
		Goblin goblin2 = new Goblin("고블린", 80, 80, 5);
		Goblin goblin3 = new Goblin("고블린", 80, 80, 5);
		orc1.info();
		orc2.info();
		goblin1.info();
		goblin2.info();
		goblin3.info();
		So.pl("");
		So.pl("공격하기 : 쳐 / 나가기 : exit");
		
		gameRun();

	}

	private void gameRun() {
		boolean isNotEnd = true;
		while (isNotEnd) {
			User.info();
			goblin1.info();
			String cmd = Command.getCommand("");
			switch (cmd) {
			case "exit":
				isNotEnd = false;
				break;
			case "쳐" :
				procBattle();
			}

		}
		gameOver();
	}

	private void gameOver() {
		So.pl(Str.MSG_GAME_OVER);
	}
	
	private void procBattle() {
		goblin1.attack();
		User.attack(goblin1);
	}

}