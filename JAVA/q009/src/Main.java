public class Main {
	// 이 java 프로젝트의 시작점
	public static void main(String[] args) {
		//js : var cat = new Cat();
		Cat cat = new Cat();
		
		int random = (int)(Math.random() * 6 + 1);
		cat.age = random;
		cat.name = "야옹이";
		cat.family = "코리안숏헤어";
		cat.color = "검은색";

		cat.info();
	}	
}