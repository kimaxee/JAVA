package com.dg.lol.data.user;

import com.dg.lol.data.monster.Goblin;
import com.dg.lol.util.Dice;
import com.dg.lol.util.So;

public class User {
	static public String name = "";
	static public String sex = "";
	static public String job = "";
	static public int currentHp = 200;
	static public int maxHp = 200;
	static public int atk = 20;
	

	

	static public void info() {
		So.pl("[" + name + "(" + currentHp + "/" + maxHp + ")]");
	}
	
	static public void attack(Goblin goblin) {
		int damage = Dice.getDice(atk);
		goblin.currentHp -= damage;
		So.pl(name + "가 " + goblin.name + "에게 " + damage + "만큼 피해를 입혔습니다.");
	}

		
}
