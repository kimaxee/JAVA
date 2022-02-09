package test;

public class KioskImpl extends Kiosk{

	@Override
	public void displayProducts() {
		System.out.println("메뉴판 보여주기");
	}

	@Override
	public void selectProducts() {
		System.out.println("구매하실 제품을 선택해 주세요~");
	}

	@Override
	public void pay() {
		System.out.println("이용해주셔서 감사합니다~");
	}
	
}
