package com.dg.lol.util;

public class Dice {
	public static int getDice(int r) {
		return (int) (Math.random() * r + 1);
	}

}
