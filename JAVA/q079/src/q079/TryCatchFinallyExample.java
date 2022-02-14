package q079;

//p.431 예제
public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	
//	public static void main(String[] args) {
//		try {
//			Class clazz = Class.forName("q079.A");
//		} catch(ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않습니다.");
//		}
//	}
}
