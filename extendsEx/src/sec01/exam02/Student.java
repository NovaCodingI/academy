package sec01.exam02; 

// 자식 클래스에서 부모클래스를 정의 한다
// 자식이 부모를 선택
public class Student extends People {
	
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		// 부모의 생성자를 호출
		// 매개변수로 입력된 값을 받아서 부모생성자를 호출 합니다.
		// The constructor People() is undefined 부모가 생성자가 없으면..
		super(name, ssn);
		this.studentNo = studentNo;
		
	}
	
	//overrides java.lang.Object.toString - 재정의
	@Override
	public String toString() {
		return name + "/" + ssn + "/" + studentNo;
		
	}

	@Override // 부모가 가지는 걸 재정의 하는 문구 // 프로그램상에서 실행안되는 주석같은것.
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	

}
