package kh.java.func;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {
	private Scanner sc;

	public ByteStreamTest() {
		super();
		sc = new Scanner(System.in);
	}
	
	public void primaryStream() {
		System.out.print("저장할 파일명 입력 : ");
		String filename = sc.nextLine();
		
		// 나가는 방향 스트림과 연결
		FileOutputStream fos = null;
		try {
			// 입력받은 파일명으로 파일 생성
			// 생성된 파일과 프로그램이 stream연결
			fos = new FileOutputStream("C:\\Users\\greys\\Desktop"+filename);
			System.out.println("["+filename+"]에 저장될 내용을 입력하세요");
			System.out.println("종료는 exit를 입력하세요");
			// 파일로 데이터를 내보내는 역할
			while(true) {
				System.out.print("내용 입력 : ");
				String str = sc.nextLine()+"\r\n";
				if(str.equals("exit\r\n")) {
					break;
				}
				byte[] arr = str.getBytes(); //문자열을 바이트배열로 변환
				// 이유 : write 메서드의 매개변수가 byte[]타입이기 때문
				fos.write(arr);
			}
 		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}