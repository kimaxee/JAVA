package q065;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		B b1 = new B();
		
		System.out.println(a.n);
		System.out.println(b.n);
		System.out.println(b1.n);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
	}
}
