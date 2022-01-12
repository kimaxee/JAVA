package q012;

public class Main {
	public static void main(String[] args) {

		Character elf = new Character("엘프", 100, 100, 15);
		Monster orc = new Monster("오크", 100, 100, 10);
		Character cat = new Character("");
		Character dog = new Character();
		elf.info();
		cat.info();
		dog.info();
		orc.info();

		elf.currentHp = elf.maxHp - orc.atk;
		orc.currentHp = orc.maxHp - elf.atk;

		System.out.println(elf.name + "가 " + orc.name + "에게 " + orc.getRandomAtk() + "피해를 입었습니다.");
		System.out.println(orc.name + "가 " + elf.name + "에게 " + elf.getRandomAtk() + "피해를 입었습니다.");

		elf.info();
		orc.info();

	}

}