package exceptionEx;

import java.util.Scanner;

public class TryCatchEx {
	
	public static void main(String[] args) {
		
		/**
		 * try-catch
		 * 
		 * try{
		 * 			// 예외가 발생할 소지가 있는 코드
		 * } catch(Exception e){
		 * 			// try 블럭에서 예외가 발생 시 실행을 멈추고 catch 블럭으로 이동
		 * }
		 */
		
		Scanner scan = new Scanner(System.in);
		
			int num = 0;
			while(true) {
				
				try {
					System.out.println("숫자를 입력해주세요");
					// 사용자가 문자를 입력했을경우, 숫자로 변환 시 오류가 발생   // Exception in thread "main" java.util.InputMismatchException
					num = scan.nextInt();
					System.out.println(num + "입력되었습니다.");
					break; // 한번만 하고싶을때 넣기.
				} catch (Exception e) {
					String str = scan.next();
//			e.printStackTrace(); 불필요한 코드를 작성..?
					System.out.println(str + "은 입력 가능한 숫자가 아닙니다.");
					// TODO: handle exception
				}
				
			}
			
		}
	}
	
	
	
