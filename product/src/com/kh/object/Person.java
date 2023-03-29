package com.kh.object;

public class Person {
	
//	String name;
//	int age;
	
	private String name; // 오류 뜸 get.name을 사용해줘야함.
	private int age; // 오류 뜸
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	


}
