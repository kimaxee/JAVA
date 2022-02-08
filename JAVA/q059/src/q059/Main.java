package q059;

public class Main {
	public static void main(String[] args) {
		Animal c = new Kitty("키티");
		Cat c1 = new Kitty("키티1");
		Kitty c2 = new Kitty("키티2");
		
		c.info();
		c.sound();
		c1.info();
		c1.sound();
		c2.info();
		c2.sound();
		
		c2.x();
	}
}
