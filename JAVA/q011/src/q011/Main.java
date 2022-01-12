package q011;

public class Main {
	public static void main(String[] args) {
		
		Character elf = new Character("����", 100, 100, 15);
		Monster orc = new Monster("��ũ", 100, 100, 10);
		elf.info();
		orc.info();
		
		elf.currentHp = elf.maxHp - orc.atk;
		orc.currentHp = orc.maxHp - elf.atk;
		
				
		System.out.println(elf.name + "�� " + orc.name + "���� " + orc.getRandomAtk() + "��ŭ ���ظ� �Ծ����ϴ�.");
		System.out.println(orc.name + "�� " + elf.name + "���� " + elf.getRandomAtk() + "��ŭ ���ظ� �Ծ����ϴ�.");
		
		elf.info();
		orc.info();
		
	}

}

