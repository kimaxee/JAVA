package q067;

public class M {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a = new A();
		A a1 = b; // == ((A)b)
		A a2 = c; // == ((A)c)
		A a3 = d; // == ((A)d)
		A a4 = e; // == ((A)e)

		a.sound();
		a1.sound(); // == ((A)b).sound();
		a2.sound(); // == ((A)c).sound();
		a3.sound(); // == ((A)d).sound();
		a4.sound(); // == ((A)e).sound();
	}
}
