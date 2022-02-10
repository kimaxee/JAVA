package q074;

public class Kiosk {

	public static class StaticInner {

		public StaticInner() { // 생성자

		}

		public int f1; // 인스턴스 필드
		public static int f2; // 정적 필드

		public void a() { // 인스턴스 메소드
			System.out.println("인스턴스 메소드");
		}

		public static void s() { // 정적 메소드
			System.out.println("정적static 메소드");
		}

	}

}
