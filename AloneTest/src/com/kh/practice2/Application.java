package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {

    public static void main(String[] args) {
        // Animal 타입의 객체배열 크기 5로 생성
        Animal[] animalArr = new Animal[5];

//         각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
        for (int i = 0; i < animalArr.length; i++) {
            double random = Math.random() * 5 + 1 ;
            if (random < 5) {
                animalArr[i] = new Dog("멍멍" + i, "골든리트리버", (int)(Math.random()*50));
            } else {
                animalArr[i] = new Cat("야옹이" + i, "샴", "집", "갈색");
            }
        }
        
//        for (int i = 0; i < animalArr.length; i++) {
//            double random = Math.random() * 5 + 1;
//            if (random < 5) {
//                animalArr[i] = new Dog("멍멍" + i, "골든리트리버", (int)(Math.random()*50));
//            } else {
//                String[] colors = {"검정색", "하얀색", "갈색", "누런색"};
//                String[] habitats = {"집", "안뜰", "산", "바다"};
//                animalArr[i] = new Cat("야옹이" + i, "샴", habitats[(int)(Math.random()*4)], colors[(int)(Math.random()*4)]);
//            }
//        }


        // 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
        // 객체의 speak() 메소드 호출
        for (int i = 0; i < animalArr.length; i++) {
            animalArr[i].speak();
        }
    }
}
