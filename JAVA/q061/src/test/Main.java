package test;

public class Main {

	public static void main(String[] args) {
		//todo 사수>부사수 업무지시

		//todo
		//Product를 상속받아 제품군을 완성하고
		//ArrayList products 에 제품 등록하기

		//ex.
//		ArrayList<Product> products = new ArrayList<>();
//		products.add(new Drink("오렌지쥬스",1000,1));
//		products.add(new Drink("아아",1000,2));
//		products.add(new Drink("뜨아",1500,3));
//		products.add(new Dessert("마카롱",3000,11));
//		products.add(new Dessert("호두과자",2000,12));
		


		//todo
		//Kiosk 를 상속받아서 구현하여 키오스크 완성
//		Kiosk kiosk = null;
		Kiosk kiosk = new KioskImpl();
		
		//todo
		//Kiosk.run() 실행하여 키오스크 실행
		kiosk.run();

	}

}
