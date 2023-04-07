package com.chap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamEx_copy {
	
	public static void main(String[] args) {
		FileByteStreamEx ex
					= new FileByteStreamEx();
		
//		ex.method1();
		ex.fileSave();
		ex.fileRead();
	}
	public void fileRead() {
		// 사용한 자원을 닫아주기 위해서 상단에 선언합니다.
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.dat");
			
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용하면 된다.
			 * 하지만 실제로 파일에는 얼마만큼의 데이터가 있는지 모른다.
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
			 * 따라서 반복문을 사용해서 read() 메소드에서 -1이 리턴되기 전까지
			 * 데이터를 읽어오면 된다.
			 */
			
			int value = 0;
			value = fis.read();
			System.out.println(value);
			
			// 데이터를 읽어서 value 변수에 저장
			// -1 : 문장의끝
//			while((value=fis.read()) != -1) {
//				System.out.println((char)value);
//			}
//			======================================
//			while(fis.read() != -1) {
//				fis.read();
//			}
//			======================================
//			while(true) {
//				value = fis.read();
//				if(value == -1 ) {
//					break;
//				}
//				System.out.println((char)value);
//			}
//			======================================	
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
	}
	
	
	public void fileSave() {
		FileOutputStream fos = null;
		System.out.println("파일 저장 실행");
		try {
			// 프로젝트 내부에 파일이 생성
			fos = new FileOutputStream("a_byte.dat");
			fos.write(97);  // a저장
			fos.write('b'); // b저장
			fos.write(10);
//			fos.write('한');
			
			byte[] byteArry = {'a', 'b', 'c', 'd'};
			fos.write(byteArry);
			fos.write(10);
			// fos. write(배열, 시작인덱스, 갯수)
			fos.write(byteArry, 1, 2);
			// 버퍼라는 공간에 저장만 되어있을뿐 파일에 저장되지 않은 상태에서
			fos.flush(); // 하면 파일 저장 됩니다.
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(fos != null) {
				try {
					// 스트림을 이용했으면 닫아 주어야 합니다.
					fos.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			
		}
	}

}
