package korea.object;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean kor = new Korean();
		kor.name = "김기덕";
		kor.ssn = "222222-2222222";
		System.out.println(" korean ======== ");
		System.out.println(kor.name);
		System.out.println(kor.ssn);
		System.out.println(kor.nation);
		
		// 객체 초기화
		
		Korean hong = new Korean("홍길동", "123456-1234567");
		System.out.println(" hong ======== ");
		System.out.println(hong.name);
		System.out.println(hong.ssn);
		System.out.println(hong.nation);

		Korean lee = new Korean("이하늬", "111111-2222222");
		System.out.println(" korean ======== ");
		System.out.println(lee.name);
		System.out.println(lee.ssn);
		System.out.println(lee.nation);
		
	}
	
}
