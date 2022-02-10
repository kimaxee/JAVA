package q071;

public class Main {

	public static void main(String[] args) {
		A b = new B();
		B b1 = new B();

		b.sound(); // 야옹
		b1.sound(); // 야옹

		System.out.println(b.SANG_SU); // 상수
		System.out.println(b1.SANG_SU); // 상수

		A a = new A() {
			@Override
			public void sound() {
				System.out.println("익명 구현 객체");
			}
		};

		a.sound(); // 익명 구현 객체

	}

}
