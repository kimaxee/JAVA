package q011;

public class Monster {
	
	String name;
	int currentHp;
	int maxHp;
	int atk;
	
	
	Monster(String name, int currentHp, int maxHp, int atk) {
	this.name = name;
	this.currentHp= currentHp;
	this.maxHp = maxHp;
	this.atk = atk;
	}
	
	void info() {
		String s = 
				"{" + this.name 
				+ "[" + this.currentHp + "/" + this.maxHp + "]" 
				+ "(" + "°ø°Ý·Â" + this.atk + ")}";
		
		System.out.println(s);
	}
	
	int getRandomAtk() {
		int randomAtk = (int)(Math.random() * atk + 1);
		return randomAtk;		
		}


}
