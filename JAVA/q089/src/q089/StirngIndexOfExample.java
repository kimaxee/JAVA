package q089;

//p.505 예제
public class StirngIndexOfExample {			//문자열 포함 여부 조사

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요."); //"자바"가 포함되어 있는 경우
		} else {
			System.out.println("자바와 관련없는 책이군요.");
		}
		
	}

}
