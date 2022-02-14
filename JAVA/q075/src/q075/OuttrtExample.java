package q075;

//p.400 ~ 401 예제
public class OuttrtExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
