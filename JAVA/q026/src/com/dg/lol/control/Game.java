package com.dg.lol.control;

import com.dg.lol.data.string.Str;
import com.dg.lol.data.user.User;
import com.dg.lol.img.Entrance;

public class Game {
	String cmd = "";

	public void start() {
		Entrance.show();
		User.characterName = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		String s = String.format("당신의 이름은 %s 입니다~", User.characterName);
		System.out.println(s);
	}
}