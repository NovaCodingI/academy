package exceptionEx;

import java.io.IOException;

public class B_Throws {

		public static void main(String[] args) {
			B_Throws b = new B_Throws();
			b.method2();
			
		}
	// Exception 은 최상위 객체
	
//	public void method1() throws IOException,Exception{ //  하나로 적었을때와 추가해서 했을때 내용이 각각 다르다 
														// multi-try-catch!! 는 최상위만!! // throws Exception{
	public void method1() throws IOException, NullPointerException, Exception{
		System.out.println("method1() 호출");
		// 1~3까지 수를 추출
		int num = (int)(Math.random() * 3 + 1);
		if(num==1) {
			throw new Exception();
		} else if (num==2) {
			throw new IOException();
		} else if (num==3) {
			throw new NullPointerException();
		}
	}
	
	public void method2() {
		System.out.println("method1 호출");
		try {
			method1();
		} catch (IOException e) {
			// 어떤 종류의 예외가 발생 했는지 확인 후 처리
			System.out.println("파일 입출력 도중 오류가 발생했습니다.");
//			e.printStackTrace();
		} catch (Exception e) {
			// Exception은 예외의 최상위 계층이므로 어떤 오류 발생했는지
			// 명확하게 알 수가 없다.
			System.out.println("오류가 발생했습니다.");
//			e.printStackTrace();
		}
		System.out.println("method1 종료");		
	}
	
	public void method3() {
		
	}
	
}
