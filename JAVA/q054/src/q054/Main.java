package q054;

public class Main {
	public static void main(String[] args) {
		Animal cat = new Kitty();
		// Animal cat = new Cat();
		// Animal cat = new Dog();
		if (cat instanceof Animal) {
			System.out.println("동물임");
		}
		if (cat instanceof Cat) {
			System.out.println("캣임");
		}
		if (cat instanceof Kitty) {
			System.out.println("키티임");
		}
		if (cat instanceof Dog) {
			System.out.println("개임");
		}
	}
}
