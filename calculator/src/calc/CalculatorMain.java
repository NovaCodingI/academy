package calc;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		Calculator calc	= new Calculator();
		
		calc.powerOn();
//		calc.powerOn(); 이 값이 없으면 계산기를 실행 해주세요 \n 0 이라는 값이 나온다.

		// 메소드의 오류가 나는경우
		// 매개변수의 타입과 갯수가 일치하지 않을때
		// 이름이 다를경우
		int result = calc.add((int)(5.5), 5);
		
		System.out.println(result);
		
		// 배열을 생성 후 메소드의 파라메터로 전달
		int[] numbers = {1,2,3,4,5};
		System.out.println("calc.add(numbers) :" + calc.add(numbers));
		
		// 메소드를 실행할 때 배열을 생성
//		calc.add(new int[] {1,2,3})
		System.out.println("calc.add(new int[] {1,2,3}) :" + calc.add(new int[] {1,2,3}));
		
		System.out.println("calc.addFn : " + calc.addFn(1,2,3,4,5,6,7));
		
	}

}
