package com.peisia.rpg.obj;

public abstract class Item extends GameObject {
	public Item(String name, String id) {
		super(name, id);
	}
	public int currentDurability; // 현재 내구도
	public int maxDurability; // 최대 내구도
	public int price; // 가격
}
