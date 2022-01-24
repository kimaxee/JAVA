package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Drink;

public class DrinkList {
	public void list(ArrayList<Drink> drinks) {
		drinks.add(new Drink("콜라"));
		drinks.add(new Drink("사이다"));
		drinks.add(new Drink("생맥주"));
	}
}
