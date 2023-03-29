package com.kh.inherit.practice;

public class Student extends Person {
	
	private int grade;
	private String major;
	
//	public Student(int grade, String major) {
//		super();
//		this.grade = grade;
//		this.major = major;
//	}  alt + shift + s = >  Generate Constructor using field;

	public Student() {
		
	}
	// 초기화 : 생성자의 매개변수를 필드에 입력합니다.
	public Student(String name, int age, double height,
			double weight, int grade, String major) {
		// 부모의 생성자를 호출 합니다.
		super(age, height, weight);
//		super.age; // private 접근제한자라 접근 불가합니다. 그래서 생성자 만들어놓음
		super.name = name; // protected : 패키지가 달라도 부모자식 관계면 접근가능
		// name 직접 접근해서 초기화
		setMajor(major);
		this.grade = grade; // = setGrade(grade); 동일
		this.major = major; // = setMajor(major); 동일
	}
	
	@Override
	public String information() {
		// super.information 반환타입 String
		
		String information = super.information();
		return information
				
//		return super.information() // 33,34줄과 동일한 내용
					+ " " + getGrade()
					+ " " + getMajor();
	}
	
	
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
