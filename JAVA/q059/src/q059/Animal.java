package q059;

public abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("이름 : " + name);
	}
	
	abstract void sound();
}
