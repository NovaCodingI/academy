package com.kh.practice2.model.vo;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		// 초기화
		this.name = name;
		this.kinds = kinds;
		
	}
	
	public String toString() {
		// 문자열을 반환 합니다. (출력이 아닙니다)
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다." ;
	}
	
	// 클래스가 추상메소드를 포함할 경우 추상 클래스가 되어야 한다
	public abstract void speak();

}
