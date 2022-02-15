package q117;


//p.661 ~ 662 예제
public class Util {		//제네릭 메소드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
