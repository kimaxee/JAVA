package q078;

public class Cafe {
	public void proc() {
		Display display = new Display();
		Kiosk products = new KioskImpl(null, 0, 0);

		display.proc();
		products.displayProducts();
		products.selectProducts();
		products.pay();
	}
}
