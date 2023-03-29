package board.jungang;

public class Board {
	
	// ▼▼▼▼▼▼▼▼▼▼▼▼ 필드를 정의 ▼▼▼▼▼▼▼▼▼▼▼▼
	// 제목
	String title;
	// 내용
	String content;
	// 작성자
	String writer;
	// 작성일
	String date;       // 보통 실무에서도 날짜가 자바에서는 String 타입으로 주고 받는 경우가 많다. 오라클에서 끊어쳐서 가져오는게..?
	// 조회수
	int hitcount;
	// ▲▲▲▲▲▲▲▲▲▲▲ 필드를 정의 ▲▲▲▲▲▲▲▲▲▲▲▲

	// 생성자의 특징 클래스이름과 동일하며 반환타입이없다. = 메소드와 비교했을때 이런 차이점이 있더라..
	public Board(String title, String content) {
		// 생성자 : 필드 초기화
		// 중복을 제거하기위해 다른 생성자를 호출!
		// 똑같은 역할을 할 수 있는 생성자를 호출
		
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
		
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인한 회원아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
				
	}
	
	public Board(String title, String content, String writer, String date, int hitcount) {
		

		
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		
		
	}
}
