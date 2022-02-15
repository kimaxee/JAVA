package q115;

//p.658 ~ 659 예제
public class Box<T> {		//제네릭 타입
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
