package q056;

public class Main {
	public static void main(String[] args) {
		Animal cat = new Kitty("키티");
		// Animal cat = new Cat();
		// Animal cat = new Dog();
		// Animal x = new Animal(); //추상 클래스로 객체생성 불가
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
		
		Dog dog = new Dog("멍멍이");
		Cat cat1 = new Cat("야옹이");
		dog.sound();
		cat1.sound();
	}
}
