package q011;

public class Character {
	
	String name;
	int currentHp;
	int maxHp;
	int atk;
	
	Character(String name, int currentHp, int maxHp, int atk) {
	this.name = name;
	this.currentHp= currentHp;
	this.maxHp = maxHp;
	this.atk = atk;
	}
	
	void info() {
		String s = 
				"{" + this.name 
				+ "[" + this.currentHp + "/" + this.maxHp + "]" 
				+ "(" + "°ø°Ý·Â" + this.atk + ")} ";
		
		System.out.print(s);
	}
	
	int getRandomAtk() {
		int randomAtk = (int)(Math.random() * atk + 1);
		return randomAtk;		
		}
}