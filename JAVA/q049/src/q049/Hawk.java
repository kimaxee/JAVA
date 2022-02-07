package q049;

public class Hawk extends Animal {
	
	public Hawk(String name, String cry) {
		super(name, cry);
	}
	
	@Override
	void move() {
		System.out.println(name + "가 훨훨 날아갑니다");
	}
}
