package scanner;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException  {
		
		// System.in.read() 메소드는 오류가 발생 할 수 있다
		// 오류를 처리하는 2가지 방법 중 throws 하는 방법을 선택 하여 해결
		// 다른방법으로는 try {} catch () {} 문으로 감싸서 해결 할 수 있다
		System.out.println("====== 키코드 출력 ======");
		
		int code1 = System.in.read();
		int code2 = System.in.read();
		int code3 = System.in.read();
		int code4 = System.in.read();
		int code5 = System.in.read();
		int code6 = System.in.read();
		
		
		// 사용자의 입력을 기다리고 있습니다.
		// 엔터키를 입력하는 순간 실행이 됩니다.
		System.out.println((char)code1);
		System.out.println(code2);
		System.out.println(code3);
		System.out.println(code4);
		System.out.println(code5);
		System.out.println(code6);
		
	}

}
