package q074;

public class Main {

	public static void main(String[] args) {

		Kiosk.StaticInner kioskStaticInner = new Kiosk.StaticInner();

		kioskStaticInner.f1 = 10; // 인스턴스 필드 사용
		kioskStaticInner.a(); // 인스턴스 메소드 호출
		System.out.println(kioskStaticInner.f1); // 인스턴스 필드값 호출

		Kiosk.StaticInner.f2 = 100; // 정적 필드 사용
		Kiosk.StaticInner.s(); // 정적 메소드 사용
		System.out.println(Kiosk.StaticInner.f2); // 정적 필드값 호출

	}

}
