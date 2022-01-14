package com.dg.lol;

import com.dg.lol.control.Game;
import com.dg.lol.img.Entrance;
import com.dg.lol.util.Dice;

public class Main {

	public static void main(String[] args) {
		System.out.println("주사위를 굴려" + Dice.getDice(6) + "이 나왔습니다.");
		Game game = new Game();
		game.start();
		Entrance entrance = new Entrance();
		entrance.show();
	}
}
