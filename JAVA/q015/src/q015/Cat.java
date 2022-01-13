package q015;

public class Cat {
	private static Cat Cat = new Cat();
	
	private Cat() {
		
	}
	
	static Cat getInstance() {
		return Cat;
	}

}
