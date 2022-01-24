package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Chicken;

public class ChickenList {
	public void list(ArrayList<Chicken> chickens) {
		chickens.add(new Chicken("후라이드"));
		chickens.add(new Chicken("양념"));
		chickens.add(new Chicken("갈릭"));
		chickens.add(new Chicken("바베큐"));
	}
}
