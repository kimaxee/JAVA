
public class Cat {
	/* ��� ������(field) */
	String name;    //�̸�
	int age;        //����
	String family;  //ǰ��
	String color;   //�л�
	
	/* ������ */
	Cat(String name, int age, String family, String color) {
		this.name = name;
		this.age = age;
		this.family = family;
		this.color = color;
	}
	
	/* ��� �Լ��� */
	//js���� �Լ����� : var info = function(){ ... }
	void info() {   //void : �������� �ʴ´ٴ� ��
		String s =
				"�̸� : " + name + "\n"
				+ "���� : " + age + "\n"
				+ "ǰ�� : " + family + "\n"
				+ "�л� : " + color; 
		System.out.println(s);
	}
	
}
