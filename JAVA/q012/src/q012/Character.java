package q012;

public class Character {

	String name;
	int currentHp;
	int maxHp;
	int atk;

	Character() {
		this.name = "강아지";
		this.currentHp = 30;
		this.maxHp = 30;
		this.atk = 5;

	}

	Character(String name) {
		this("고양이", 50, 50, 20);
	}

	Character(String name, int currentHp, int maxHp, int atk) {
		this.name = name;
		this.currentHp = currentHp;
		this.maxHp = maxHp;
		this.atk = atk;
	}

	void info() {
		String s = "{" + this.name + "[" + this.currentHp + "/" + this.maxHp + "]" + "(" + "공격력" + this.atk + ")} ";

		System.out.print(s);
	}

	int getRandomAtk() {
		int randomAtk = (int) (Math.random() * atk + 1);
		return randomAtk;
	}
}