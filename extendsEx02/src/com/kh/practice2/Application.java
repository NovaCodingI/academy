package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {
	
	public static void main(String[] args) {
		// 이름이 같은 클래스가 있을때 임폴트 문장 사용해야해요
		
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] animalArry = new Animal[5];
		// 각 인덱스별로 무작위로	Dog, Cat 클래스를 이용하여 객체 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		Dog dog = new Dog("멍뭉이", "도베르만", (int)(Math.random()*50));
		Cat cat = new Cat("야옹이", "러시안블루", "알래스카", "검붉은");
		
		// 0~4
		// 배열의 각 방에 고양이 또는 멍멍이를 입력
		for(int i=0;i<5;i++) {
			// 0,1
			int index = (int)(Math.random() * 2);
			if(index==1) {
				// 배열이름[방번호]
				animalArry[i] = dog;
			} else {
				animalArry[i] = cat;
			}
		}

		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		
		// 객체의 speak() 메소드 호출
		for(Animal a : animalArry) {
			// 자식 객체에서 재정의(오버라이딩 되어진 메소드가 호출
			a.speak();
		}
		
	}

}
