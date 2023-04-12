package test20230412;

import java.util.Scanner;

/*
[문항3]  사용자로부터 키와 몸무게를 입력받아서 BMI를 구하는 프로그램을 작성하시오
	직접값을 입력한 경우 10점
    입력받을경우 20점
*/

public class Ex3 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        // 사용자로부터 키와 몸무게 입력 받기
        System.out.print("키(cm)를 입력하세요: ");
        if (scanner.hasNextDouble()) {
            double height = scanner.nextDouble();

            System.out.print("몸무게(kg)를 입력하세요: ");
            if (scanner.hasNextDouble()) {
                double weight = scanner.nextDouble();

                // BMI 계산
                double heightMeter = height / 100; // 키를 미터로 변환
                double bmi = weight / (heightMeter * heightMeter);

                // BMI 결과 출력 - 소수점 2자리
                System.out.printf("BMI 지수: %.2f\n", bmi);

                // BMI 범위에 따라 결과 출력
                if (bmi < 18.5) {
                    System.out.println("저체중");
                } else if (bmi >= 18.5 && bmi < 23) {
                    System.out.println("정상체중");
                } else if (bmi >= 23 && bmi < 25) {
                    System.out.println("과체중");
                } else if (bmi >= 25 && bmi < 30) {
                    System.out.println("경도비만");
                } else if (bmi >= 30) {
                    System.out.println("고도비만");
                }
            } else {
                System.out.println("몸무게를 숫자로 입력해주세요.");
                scanner.next(); // 입력 버퍼 비우기
            }
        } else {
            System.out.println("키를 숫자로 입력해주세요.");
            scanner.next(); // 입력 버퍼 비우기
            }
//        scanner.close(); 반복문 사용으로 주석처리 
        }
    }
}
