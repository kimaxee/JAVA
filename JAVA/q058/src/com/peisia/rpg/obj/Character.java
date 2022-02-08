package com.peisia.rpg.obj;

public abstract class Character extends GameObject {
	public int currentHp; // 현재체력
	public int maxHp; // 최대체력
	
	public Character(String name, String id) {
		super(name, id);
	}
}
