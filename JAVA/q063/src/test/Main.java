package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Drink("오렌지쥬스", 1000, 1));
		products.add(new Drink("아아", 1000, 2));
		products.add(new Drink("뜨아", 1500, 3));
		products.add(new Dessert("마카롱", 3000, 11));
		products.add(new Dessert("호두과자", 2000, 12));

		Kiosk kiosk = new KioskImpl();
		
		kiosk.setProducts(products);
		kiosk.run();
	}

}
