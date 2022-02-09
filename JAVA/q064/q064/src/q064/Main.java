package q064;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new A();
		A a3 = new A();
		
		ArrayList<Parent> parents = new ArrayList<>();
		parents.add(a);
		parents.add(b);
		parents.add(c);
		parents.add(a2);
		parents.add(a3);
		
		for(Parent p : parents) {
			if(p instanceof A) {
				((A) p).a();
			}
			if(p instanceof B) {
				((B) p).b();
			}
			if(p instanceof C) {
				((C) p).c();
			}
		}
	}
}