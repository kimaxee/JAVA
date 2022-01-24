package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Side;

public class SideList {
	public void list(ArrayList<Side> sides) {
		sides.add(new Side("감자튀김"));
		sides.add(new Side("새우튀김"));
		sides.add(new Side("치즈스틱"));
		sides.add(new Side("떡볶이"));
	}
}
