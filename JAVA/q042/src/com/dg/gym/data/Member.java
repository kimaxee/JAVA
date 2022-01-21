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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTel() {
		return tel;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}
}
