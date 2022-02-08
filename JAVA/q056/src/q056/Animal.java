package q056;

public abstract class Animal {
	public String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("이름 : " + name);
	}
	
	abstract void sound();
	
}
