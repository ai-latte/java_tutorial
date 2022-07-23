package kh.java.func;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamTest { // 글씨를 내보낼 때 특화
	Scanner sc;

	public CharStreamTest() {
		super();
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
	}
	
	public void primaryStream() {
		System.out.print("저장할 파일 이름 입력 : ");
		String filename = sc.nextLine();
		FileWriter fw = null; // Stream = 1바이트씩 / writer, reader = 2바이트 / try보다 상단에 만들어주기
		
		try {
			// 1. 파일이 생성되고 스트림이 연결되는 시점
			fw = new FileWriter(filename); // FileWriter 객체를 생성하여 외부로 연결하는 통로와 연결한다
			System.out.println("["+filename+"] 파일에 저장될 내용을 입력하세요");
			System.out.println("종료는 exit");
			while(true) {
				System.out.print("내용 입력 : ");
				String str = sc.nextLine()+"\r\n";
				if(str.equals("exit"+"\r\n")) {
					break;
				}
				// 문자스트림은 1문자 단위로 전송하기 때문에
				// 바이트 배열로 바꾸지 않음
				fw.write(str); // 2. fw의 메서드로 입력 받은 내용을 내보낸다
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public void subStream() {
		System.out.print("저장할 파일명 입력 : ");
		String filename = sc.nextLine();
		BufferedWriter bw = null;
		// 데이터를 전송하는 역할이 아님
		// 단독으로 사용X 워터슬라이드의 물 같은 역할
		try {
			FileWriter fw = new FileWriter(filename);	// 주스트림 생성
			bw = new BufferedWriter(fw); // 주스트림에 보조 스트림 추가
			System.out.println("["+filename+"]에 저장할 내용 입력 ");
			System.out.println("종료는 exit");
			while(true) {
				System.out.print("입력 : ");
				String str = sc.nextLine(); //엔터 안씀
				if(str.equals("exit")) {
					break;
				}
				bw.write(str); //보조스트림을 통한 데이터 전송
				bw.newLine(); // 보조스트림에 존재하는 줄 개행 기능
			}
		}catch(IOException e ){
			e.printStackTrace();
		} finally {
			try {
				// 보조스트림 반환 시 주 스트림은 자동으로 반환
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 읽어오기
	public void charStreamReader() {
		//1. 스트림 생성하고 2. 메서드를 통한 입력 3. 자원반환
		System.out.println("로드할 파일명 입력 : ");
		String filename = sc.nextLine();
		// 데이터를 읽어올 보조스트림
		BufferedReader br = null;	
		// 파일 읽어올 주스트림
		try {
			FileReader fr = new FileReader(filename);
			br = new BufferedReader(fr);
			// 보조스트림 안에 주스트림을 넣는 것은 똑같다
			while(true) {
				try {
					// readLine() : 스트림이 연결된 파일에서 1줄 읽어옴
					// 더이상 읽어올 내용이 없는 경우 null 리턴
					String str = br.readLine(); //2. 메서드를 통한 입력
					if(str == null) {
						break;
					}
					System.out.println(str); // null이 아니면 화면에 출력
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
