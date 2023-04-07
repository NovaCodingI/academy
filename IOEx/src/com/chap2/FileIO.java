package com.chap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	
	public static void main(String[] args) {
		
		FileIO io = new FileIO();
		
		long start, end;
		start = System.currentTimeMillis();
		io.fileCopy();
		end = System.currentTimeMillis();
		System.err.println("소요시간 : " + (end - start)); // 단위는 1/1000초
		
		
		io.fileIOCopy();
	}
	
	
	/**
	 * 파일 복사하기
	 * A_File.java 파일을 읽어서
	 * A_File_copy.java 파일을 생성 합니다.
	 */
	public void fileIOCopy() {
		System.out.println("복사가 되었습니다.");
		
		long startTime, endTime;
		// 시작시간
		startTime = System.currentTimeMillis();
		
		
		File file = new File("D:\\work\\IOEx\\src\\com\\chap1\\A_File.java"); // 경로기입할때 \ 추가 하나씩 해주기 D:\work\IOEx\src\com\chap1\A_File.java;
		// 파일의 존재 여부를 확인 후 존재하지 않으면 종료
		if(!file.exists()) {
			System.out.print("파일이 존재하지 않습니다.");
			return;
		}
		
		try (FileInputStream fis = new FileInputStream(file); // try는 여러개 문장이 올수있음, ; 세미클론으로 여러개 표시를 하자!
							FileOutputStream fos = new FileOutputStream ("A_File_copy.java")) {
			int value = 0;
			// 1바이트씩 읽어 옵니다.
			// -1은 endOfFile 파일의 끝을 의미하는것
			while( (value = fis.read()) != -1) {
//				System.out.print((char)value);
				fos.write(value);
			}
			
			fos.flush();
			
		}	catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} 	catch (IOException e1) {
			
			e1.printStackTrace();
			
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - startTime));
	}
	
	/**
	 * 복사하기 - 복사할 파일을 준비
	 * FileInputStream 읽어와서
	 * FileOutputStream 저장하기
	 */
	public void fileCopy() {
		System.out.println("복사가 되었습니다.");
		try 
			(FileInputStream  fis1
					= new FileInputStream("13_1_컬렉션프레임워크.pptx");
			FileOutputStream fos1
					= new FileOutputStream("13_1_컬렉션프레임워크_copy.pptx")) {
			
			int value = 0;
			// 1바이트씩 읽어 옵니다.
			// -1은 endOfFile 파일의 끝을 의미하는것
			byte[] byteArr = new byte[1024];    // 공간을 키울수록 소요시간이 줄어든다.
//			byte[] byteArr = new byte[100];    // 공간을 키울수록 소요시간이 줄어든다.
			// i = 바이트 배열에 읽어온 갯수를 반환 합니다.
			int i = 0;
			while((i = fis1.read(byteArr)) != -1) {
				// 읽어온 갯수만큼 출력합니다.
				// 마지막 출력시 배열에 갯수를 다 채우지 못하면
				// 이전에 읽어들인 내용이 출력됩니다.
				// 5칸일시 안녕하세요 -> 그다음 출력시 잘가를 출력하려고하지만 |안|녕|하|세|요| => |잘|가|하|세|요|
				
				fos1.write(byteArr,0,i);
			}
//			while((value = fis1.read()) != -1) {
//				fos1.write(value);
//			}
			
			fos1.flush();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		
		
		
			
		}
}
		
		// 파일 복사하기
	
//			try {
//				FileInputStream fis = new FileInputStream(file);
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();