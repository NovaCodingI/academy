package getter.setter;

public class CalculatorMain {
	
	public static void main(String[] args) {
		// 정적 필드, 정적 메소드는 생성하지 않고
		// 클래스 이름으로 접근하여 사용합니다.
		double res = 10 * 10 * Calculator.pi;
		int plus = Calculator.plus(5, 5);
		int mplus = Calculator.plus(6, 6);
		int kplus = Calculator.plus(3, 6);
		
//		불러오는 값에 	static이 없다면
//		Cannot make a static reference to the non-static method plus(int, int) from the type Calculator
//		유형 계산기에서 비정적 메서드 plus(int, int)에 대한 정적 참조를 만들 수 없습니다.

		
		System.out.println(plus);
		System.out.println(mplus);
		System.out.println(kplus);
		System.out.println(res);
		
	}

}
