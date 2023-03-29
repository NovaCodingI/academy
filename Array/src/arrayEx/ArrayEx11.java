package arrayEx;

public class ArrayEx11 {

	public static void main(String[] args) {
		String[] oldStrArr = {"Java", "array", "copy"};
		String[] newStrArr = new String[5];
		
		// java 기본 API에서 제공해주는 메소드를 활용해서 배열을 복사함.
		// (원본배열, 복사시작index, 새로운배열, 새배열에 복사를 시작할 인덱스, 복사할 갯수)
		System.arraycopy(oldStrArr, 0, newStrArr, 1, oldStrArr.length);
		
		for(int i=0;i<newStrArr.length;i++) {
			// 배열의 값에 접근할때는 배열이름[인덱스]
			System.out.println(newStrArr[i]);
			
		}
		
	}
}
