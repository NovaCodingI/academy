package board.jungang;

public class BoardMain2 {
	
	public static void main(String[] args) {
		// 게시글을 생성
		 
		Board board1 = new Board("게시글1", "너무어려워요", "홍길동", "23-03-22", 10);
		Board board2 = new Board("게시글2", "너무어려워요", "홍길동", "23-03-22", 10);
		Board board3 = new Board("게시글3", "너무어려워요", "홍길동", "23-03-22", 10);
		Board board4 = new Board("게시글4", "너무어려워요", "홍길동", "23-03-22", 10);
		Board board5 = new Board("게시글5", "너무어려워요", "홍길동", "23-03-22", 10);
		
	
		// 배열생성 " 똑같은 타입이 여러개 있어서 배열입니다.
		// 배열에 담아 줍니다
		Board[] boardList = new Board[10];
		
		boardList[0] = board1;
		boardList[1] = board2;
		boardList[2] = board3;
		boardList[3] = board4;
		boardList[4] = board5;
		
		
		// 게시글리스트 생성
		BoardList list = new BoardList(boardList);
		
		System.out.println();
		
	}

}
