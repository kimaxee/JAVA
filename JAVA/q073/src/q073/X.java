package q073;

public class X implements A, B{
	
	@Override
	public void sound() {
		System.out.println(NAME + "가 야옹하고 웁니다");
	}
	
	@Override
	public void move() {
		System.out.println(NAME + "가 이동합니다");
	}

}
