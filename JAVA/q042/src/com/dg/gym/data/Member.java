package com.dg.gym.data;

public class Member {
	String name;    //회원 이름
	String tel;     //회원 전화번호
	String gender;  //회원 성별
	
	public Member(String name, String tel, String gender) {
		this.name = name;
		this.tel = tel;
		this.gender = gender;
	}
	
	public void info() {
		System.out.println("이름 : " + name + " / 전화번호 : " + tel + " / 성별 : " + gender);
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
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
}

