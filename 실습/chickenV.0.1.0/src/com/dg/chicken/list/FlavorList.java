package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Flavor;

public class FlavorList {
	public void list(ArrayList<Flavor> flavors) {
		flavors.add(new Flavor("순한맛"));
		flavors.add(new Flavor("중간맛"));
		flavors.add(new Flavor("매운맛"));
	}
}