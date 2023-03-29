package arrayEx;

// 접근제어자 class(키워드) 클래스명
public class ArrayEx5 {
	// 접근제어자 반환타입 메소드명(매개변수){}
	// void : 반환 타입이 없다는 의미
	// 매개변수 : (타입 변수명)
	// 매개변수 : 있을 수도 있고 없을 수도 있다.
	// 매개변수가 있다면 타입을 명시 해줘야한다!
	// void 란에.. 반환타입을 : int, String 타입을 적어주면 됌..
	// main 은 메소드 이름
	public static void main(String[] args) {
		
//		System.out.println(args.length);
		
//		 1: 로컬환경, 2:테스트환경, 3:운영환경
		int mode = Integer.parseInt(args[0]);
		if(mode==1) {
			System.out.println("로컬환경 입니다.");
			// 로컬 DB 접속
			
		} else if(mode==2) {
			System.out.println("테스트환경 입니다");
			// 테스트 DB에 접속
			
		} else if(mode==3) {
			System.out.println("운영환경 입니다");
			// 운영 DB에 접속
		
//		for(int i=0;i<args.length;i++) {
//			
//			System.out.println(args[i]);
			
		}
		
//		System.out.println(args[0]);
	}
		
	

}