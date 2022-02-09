package test;

public class KioskImpl extends Kiosk {
	@Override
	public void displayProducts() {
		for(Product p : products) {
			p.info();
		}
	}

	@Override
	public void selectProducts() {
		System.out.println("구매할 품목");
	}

	@Override
	public void pay() {
		System.out.println("결제");
	}

}
