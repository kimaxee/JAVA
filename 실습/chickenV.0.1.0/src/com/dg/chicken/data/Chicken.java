package com.dg.chicken.data;

public class Chicken {
	private String name;
	
	public Chicken(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println(name);
	}
}
