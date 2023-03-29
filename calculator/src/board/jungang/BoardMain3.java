package board.jungang;

public class BoardMain3 {
	public static void main(String[] args) {
		// int[] intArr = {1,2,3,4,5}; // 아래 코드와 똑같다
		
		int[] intArr = new int[5];
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		// [] : 배열 
		// 타입[] : 이름 = new 타입[갯수];
		Board[] boardArr = new Board[5];
		boardArr[0] = new Board("게시글1", "홍길동");
		boardArr[1] = new Board("게시글2", "홍길동");
		boardArr[2] = new Board("게시글3", "홍길동");
		boardArr[3] = new Board("게시글4", "홍길동");
		boardArr[4] = new Board("게시글5", "홍길동");
		
		for(Board board : boardArr) {
			
			System.out.println("=============");
			System.out.println(board.title);
			System.out.println(board.content);
			System.out.println(board.writer);
			System.out.println(board.date);
			System.out.println(board.hitcount);
			System.out.println("=============");
			
		}
		
	}

}
