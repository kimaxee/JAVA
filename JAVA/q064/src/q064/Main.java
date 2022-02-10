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

		for (Parent p : parents) {
			if (p instanceof A) { // 부모가 Parent가 자식객체로 강제형변환
				((A) p).a();
			}
			if (p instanceof B) { // 부모가 Parent가 자식객체로 강제형변환
				((B) p).b();
			}
			if (p instanceof C) { // 부모가 Parent가 자식객체로 강제형변환
				((C) p).c();
			}
		}
	}
}