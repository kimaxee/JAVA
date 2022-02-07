package q049;

public class Snake extends Animal {
	
	public Snake(String name, String cry) {
		super(name, cry);
	}
	
	@Override
	void move() {
		System.out.println(name + "이 스르륵 기어갑니다.");
	}
}
