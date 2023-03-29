package getter.setter;

public class SingleTonEx {

	// static을 안 붙여준다면
	// Cannot make a static reference to the non-static field singleton
	private static SingleTonEx singleton = new SingleTonEx();
	
	// 1. private 접근제한자를 이용하여
	//    생성자를 외부에서 이용하지 못하도록 막는다
	private SingleTonEx () {
		
	}
	
	// 2. 외부에서 접근할 수 있는 메소드를 만들고
	//    생성된 객체를 반환한다.
	//		- 생성을 할 수 없으므로 정적 메소드로 만들어야 한다.
	//		- 정적필드에 자신을 생성하여 리턴해준다.
	public static SingleTonEx getInstance() {
		// 정적 메소드에서는 정적필드, 정적메소드만 사용이 가능하다
		System.out.println("메롱");
		return singleton;
	}
}
