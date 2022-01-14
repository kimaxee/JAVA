package com.dg.lol.data.monster;

import com.dg.lol.data.user.User;
import com.dg.lol.util.Dice;
import com.dg.lol.util.So;

public class Orc {
	String name;
	int currentHp;
	int maxHp;
	int atk;

	public Orc(String name, int currentHp, int maxHp, int atk) {
		this.name = name;
		this.currentHp = currentHp;
		this.maxHp = maxHp;
		this.atk = atk;
	}

	public void info() {
		String s = ("[" + name + "(" + currentHp + "/" + maxHp + ")]");
		So.pl(s);
	}
	
	public void attack() {
		int damage = Dice.getDice(atk);
		User.currentHp = User.currentHp - damage;    // User.currentHp -= damage;
		So.pl(name + "이 " + User.name + "에게 " + damage + "만큼 피해를 입혔습니다.");
	}

}
