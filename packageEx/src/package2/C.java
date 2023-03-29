package package2;

import java.util.Calendar;

public class C {
	
	// 외부에서 생성자 접근 제한
	private C() {
//		Calendar cal = Calendar.getInstance();
//		B b = new B(); // default 라서.. (같은 패키지내에..)
	}
	
	
	public C(int i) {
		this();
	}
	
	public void method1() {
		System.out.println("method1");
	}
	
		
	private void method2() {                        //The method method2() from the type C is never used locally
		System.out.println("method2");
		
		
		
	}
	
}
