package q049;

public class Animal {
	String name;
	String cry;
	
	Animal(String name, String cry) {
		this.name = name;
		this.cry = cry;
	}
	
	void sound() {
		System.out.println("Animal 부모Class에 있는 "+ name + "가(이) " + cry + "하고 웁니다.");
	}
	
	void move() {
		System.out.println("Animal 부모Class에 있는 " + name + "가(이) 이동합니다.");		
	}
}
