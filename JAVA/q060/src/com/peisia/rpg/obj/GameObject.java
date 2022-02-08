package com.peisia.rpg.obj;

public abstract class GameObject {
	String name;
	String id;
	
	public GameObject(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void info() {
		System.out.println("( 이름 : " + name + " / 아이디 : " + id + " )");
	}
}
