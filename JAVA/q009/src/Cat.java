
public class Cat {
	/* ��� ������(field) */
	String name;    //�̸�
	int age;        //����
	String family;  //ǰ��
	String color;   //�л�
	
	
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
