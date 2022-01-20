package com.dg.gym.data;

public class Member {
	private String name;
	private String tel;
	private String sex;

	public Member(String name, String tel, String sex) {
		this.name = name;
		this.tel = tel;
		this.sex = sex;
	}

	public void info() {
		System.out.println("이름 : " + name + " / 전화번호 : " + tel + " / 성별 : " + sex);
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setTel(String tel) {
		this.tel = tel;
	}

	String getTel() {
		return tel;
	}

	void setSex(String sex) {
		this.sex = sex;
	}

	String getSex() {
		return sex;
	}
}
