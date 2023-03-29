package package1;

import package2.C;

public class A {
	
	// 필드 정의
//	C c = new C();
	// 코드 작성 불가 메소드 외부에 있기 때문에
//	private void syso() {
//		 TODO Auto-generated method stub
//
//	}
	
	// 기능 정의
	public void method1() {
		
	C c = new C(1);
	B b = new B();
		c.method1();
//		c.method2();  private 로 막아 놓았기 때문에
		
		b.equals(b);
		
		
	
	}
		
	}


//public class B { // The public type B must be defined in its own file
//					공용 유형 B는 자체 파일에서 정의되어야 합니다. 클래스 하나에 여러개 클래스 지정할시 하나의 접근 제한자만 넣을수있다.
//}

class B {
	// default일 경우 같은 패키지에서 호출가능
	B(){
		
	}
	
}
