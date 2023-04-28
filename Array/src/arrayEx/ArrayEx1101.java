package arrayEx;

public class ArrayEx1101 {
	
	public static void main(String[] args) {
		
		String[] oldStrArr = {"Java", "array", "copy"};
		String[] newStrArr = new String[5];
		
		// java 기본 API에서 제공해주는 메소드를 활용해서 배열을 복사함.
		// (원본배열, 복사시작index, 새로운배열, 새배열에 복사를 시작할 인덱스, 복사할 갯수)
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
			
		for(int i=0;i<newStrArr.length;i++) {
			// 배열의 값에 접근할때는 배열이름[인덱스]
			System.out.println("순서 1몇번째?");
			System.out.println(newStrArr[i]);
		
		// 향상된 for 문을 이용하는 방법
		// (타입 변수명 : 배열의이름)
		// 배열의 요소를 모두 순회 합니다.  0~끝까지 실행함 ex) 0 < 배열명.length
		// 배열이름[인덱스]	
			
		for(String data : newStrArr) {
			System.out.println("순서 2몇번째?");
			System.out.println(data);
		}
			
		}
	}

}
