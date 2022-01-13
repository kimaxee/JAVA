package q015;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = Cat.getInstance();
		Cat cat2 = Cat.getInstance();

		System.out.println(System.identityHashCode(cat1));
		System.out.println(System.identityHashCode(cat2));
		System.out.println(cat1.hashCode());
		System.out.println(cat2.hashCode());
		if (cat1 == cat2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		System.out.println(System.identityHashCode(dog1));
		System.out.println(System.identityHashCode(dog2));
		System.out.println(dog1.hashCode());
		System.out.println(dog2.hashCode());
		if (dog1 == dog2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}