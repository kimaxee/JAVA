package com.dg.lol.control;

import com.dg.lol.data.string.Str;
import com.dg.lol.img.Entrance;

public class Game {
	String cmd = "";

	public void start() {
		Entrance.Show();
		String cmd = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		System.out.println(cmd);
	}

}
