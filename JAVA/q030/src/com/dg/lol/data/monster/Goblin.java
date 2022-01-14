package com.dg.lol.data.monster;

import com.dg.lol.util.So;

public class Goblin {
	String name;
	int currentHp;
	int maxHp;
	int atk;

	public Goblin(String name, int currentHp, int maxHp, int atk) {
		this.name = name;
		this.currentHp = currentHp;
		this.maxHp = maxHp;
		this.atk = atk;
	}

	public void info() {
		String s = ("[" + name + "(" + currentHp + "/" + maxHp + ")]");
		So.pl(s);
	}

}
