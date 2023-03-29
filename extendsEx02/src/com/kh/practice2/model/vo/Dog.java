package com.kh.practice2.model.vo;

public class Dog extends Animal {
	// The type Dog must implement the inherited abstract method Animal.speak() Dog 클래스에서 에러가 뜸
	// static final 상수 만들기
	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name,kinds);
		setWeight(weight);
//		this.weight = weight;
	}

	@Override 	// Animal 에 있는 speak 를 오버라이드 해줘야된다
	public void speak() {
		// Dog dog = new Dog(); dog.toString(); 아무런 의미가 없다 연결되어있는 부모로 접근을해야함!!
		// 부모의 메소드를 호출
//		String str = super.toStirng();  // 아래와 같다.
//		str + "몸무게는 " + weight + "kg 입니다."
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
		// TODO Auto-generated method stub
		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
