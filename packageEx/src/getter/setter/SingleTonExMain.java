package getter.setter;

public class SingleTonExMain {
	
	public static void main(String[] args) {
		// 접근할수있는 메소드를 만들었기때문에 메소드를 넣는다.
		// 참조 타입의 변수는 주소를 가지고 있는것이다.
		SingleTonEx ex = SingleTonEx.getInstance();
		SingleTonEx ex1 = SingleTonEx.getInstance();
		SingleTonEx ex2= SingleTonEx.getInstance();
		SingleTonEx ex3= SingleTonEx.getInstance();
		SingleTonEx ex4= SingleTonEx.getInstance();
		SingleTonEx ex5= SingleTonEx.getInstance();
		SingleTonEx ex6= SingleTonEx.getInstance();
		
		// 같은 주소를 갖고 있는지 확인
		if(ex == ex1) {
			System.out.println("같은 객체입니다");
		} else {
			System.out.println("다른 객체입니다");
		}
		
		System.out.println(ex);
		System.out.println(ex1);
		System.out.println(ex2);
		System.out.println(ex3);
		System.out.println(ex4);
		System.out.println(ex5);
		System.out.println(ex6);
		
	}

}
