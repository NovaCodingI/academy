package exceptionEx;

public class NullPointExceptionEx {
	
	public static void main(String[] args) {
		
		String str = null;
		
		// Null pointer access: The variable str can only be null at this location
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "str" is null
		// 참조변수가 null 값을 가지고 있을때
		// 참조변수로 부터 객체접근연산자(.)을 이용해서 접근할때 발생하는 오류
		
		try {
			str.toString();
			print(str);

		} catch (Exception e) {
			System.out.println("오류가 발생 하였습니다.");
		}
		
		// 예외처리
		// 프로그램이 정상적으로 종료될 수 있도록 처리해줍니다.
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
//		print(str); 여기에 있으면 Excepction 처리를 못하므로 try위로 가면 오류가 안뜬다
		
	}
	// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "str" is null
	public static void print(String str) throws Exception {
//		System.out.println(str.toString());
		
		throw new Exception("강제 오류 발생");
		
	}
}
