package q059;

public abstract class Dog extends Animal {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍~");
	}
}
