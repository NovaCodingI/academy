package forEx;

public class StarPoint {
	
	  public static void main(String[] args) {
	        int n = 5; // 삼각형 높이
	        for (int i = 1; i <= n; i++) { // 행(row) 반복
	            for (int j = 1; j <= i; j++) { // 열(column) 반복
	                System.out.print("*"); // 별 출력
	            }
	            System.out.println(); // 다음 행으로 이동
	        }
	    }
	}

