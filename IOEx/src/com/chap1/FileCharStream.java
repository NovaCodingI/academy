package com.chap1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCharStream {
	public static void main(String[] args) {
		FileCharStream fcs 
						= new FileCharStream();
		
//		fcs.fileSave();
		fcs.fileRead();
	}
	
	public void fileRead() {
		try(FileReader fr = new FileReader("b_char.txt")){
			int value = 0;
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read());
			
			while((value=fr.read()) != -1) {
//				System.out.println((char)value); 문자작성 후 띄고 \n
				System.out.print((char)value);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void fileSave() {

		// 리소스를 자동으로 close()
		// FileWriter를 이용해서 파일을 생성하고
		// 데이터를 문자단위로 저장한다.
		try(FileWriter fw = new FileWriter("b_char.txt")){
			fw.write("IO 어떠신가요?!\n");
			fw.write("혼자서도 잘할 수 있습니다!!\n");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			fw.write(new char[]{'a', 'b', 'c', 'd'});
			
			fw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("fileSave() 종료");
		}
	}

}
