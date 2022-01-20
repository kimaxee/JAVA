package q033;

public class Member {
	String name;
	String tel;
	String sex;
	
	Member(String name, String tel, String sex) {
		this.name = name;
		this.tel = tel;
		this.sex = sex;
	}
	
	void info() {
		System.out.println("이름 : " + name + "\n전화번호 : " + tel + "\n성별 : " + sex);
	}
}
