package com.peisia.rpg;

import com.peisia.rpg.character.Mob;
import com.peisia.rpg.character.Npc;
import com.peisia.rpg.character.Player;

public class Main {
	public static void main(String[] args) {
		Player player = new Player("격투가", "P001");
		Npc npc = new Npc("상인", "N001");
		Mob mob = new Mob("오크", "M001");
		
		player.info();
		npc.info();
		mob.info();
	}
}
