package com.peisia.rpg.obj;

public abstract class GameObject {
	String name; // 이름
	String id; // 아이디
	
	public GameObject(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void info() {
		System.out.println("게임오브젝트 name : " + name);
		System.out.println("게임오브젝트 id : " + id);
	}
}
