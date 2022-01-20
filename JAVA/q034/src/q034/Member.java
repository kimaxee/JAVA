package q034;

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
		System.out.println("이름 : " + name + "\n전화번호 : " + tel + "\n성별 : " + sex + "\n");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setTel(String tel) {
		this.tel = tel;
	}
	
	void setSex(String sex) {
		this.sex = sex;
	}
	
}
