package q115;

//p.658 ~ 659 예제
public class BoxExample {		//제네릭 타입 이용

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		
		Box<Integer> box2 = new Box<>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}

}
