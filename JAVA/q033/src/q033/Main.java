package q033;

public class Main {
	public static void main(String[] args) {
		Member dog = new Member("강아지", "010-1234-5678", "남");
		Member cat = new Member("고양이", "010-2345-6789", "여");
		
		dog.info();
		cat.info();
	}
}
