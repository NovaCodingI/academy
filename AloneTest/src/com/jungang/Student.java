package com.jungang;

public class Student extends Person {

	private int grade; // 학년
	private String major; // 전공
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height,
			double weight, int grade, String major) {
		super(age, height, weight);
		this.grade = grade;
		this.major = major;
		
	}
	
	public String information() {
		return "";
	}
	
}
