package q014;

// p.244 책 예제
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	
	static Singleton getInstance() {
		return singleton;
	}
}
