package com.dg.lol.data.user;

import com.dg.lol.util.So;

public class User {
	static public String characterName = "";
	static public String characterSex = "";
	static public String characterJob = "";
	static public int currentHp = 200;
	static public int maxHp = 200;
	static public int atk = 20;
	

	

	static public void info() {
		String s = ("[" + characterName + "(" + currentHp + "/" + maxHp + ")]");
		So.pl(s);
	}

		
}
