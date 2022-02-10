package q073;

public class Main {

	public static void main(String[] args) {
		
		X x = new X();
		
		System.out.println("이름 : " + x.NAME);
		System.out.println("종류 : " + x.TYPE);
		x.sound();
		x.move();
	}

}
