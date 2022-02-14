package q078;

public interface Kiosk {
	String TITLE = "======= GURO CAFE =======";

	// 1.제품 출력
	public void displayProducts();

	// 2.구매할 품목 선택
	public void selectProducts();

	// 3.결제
	public void pay();
		
}
