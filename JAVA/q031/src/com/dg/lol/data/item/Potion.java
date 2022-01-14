package com.dg.lol.data.item;

public class Potion {
	private static Potion Potion = new Potion();
	
	private Potion() {
		
	}
	
	public static Potion getInstance() {
		return Potion;
	}

}
