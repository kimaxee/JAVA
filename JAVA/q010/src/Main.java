public class Main {
	// 이 java 프로젝트의 시작점
	public static void main(String[] args) {
		//js : var cat = new Cat();
		
		int random = (int)(Math.random() * 6 + 1);
		Cat cat = new Cat("야옹이", random, "코리안숏헤어", "검은색");

		cat.info();
	}	
}