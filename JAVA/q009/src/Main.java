public class Main {
	// �� java ������Ʈ�� ������
	public static void main(String[] args) {
		//js : var cat = new Cat();
		Cat cat = new Cat();
		
		int random = (int)(Math.random() * 6 + 1);
		cat.age = random;
		cat.name = "�߿���";
		cat.family = "�ڸ��ȼ����";
		cat.color = "������";

		cat.info();
	}	
}