package test;

import java.util.ArrayList;

public abstract class Kiosk {
	public ArrayList<Product> products;

	// 0.제품 등록(setter)
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public void run() {
		displayProducts();
		selectProducts();
		pay();
	}

	//// 추상 메소드 ////

	// 1.제품 출력
	abstract public void displayProducts();

	// 2.구매할 품목 선택
	abstract public void selectProducts();

	// 3.결제
	abstract public void pay();

}
