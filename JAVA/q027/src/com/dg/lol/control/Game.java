package com.dg.lol.control;

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
		String name = String.format("당신의 이름은 %s 입니다~", User.characterName);
		String sex = String.format("당신의 성별은 %s 입니다~", User.characterSex);
		String job = String.format("당신의 직업은 %s 입니다~", User.characterJob);
		System.out.println(name);
		System.out.println(sex);
		System.out.println(job);
	}
}