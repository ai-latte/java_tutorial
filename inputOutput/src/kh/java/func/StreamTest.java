package kh.java.func;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StreamTest {
	public void test1() {
		// quiz.txt 파일의 내용을 읽어올 예정
		// 읽어오 때는 문자, 내보낼 때는 바이트
		BufferedReader br = null; // 텍스트 읽어올 때
		BufferedOutputStream bos = null; // 이미지 내보낼 때
		
		try {
			// quiz.txt를 읽어오기 위한 주스트림
			FileReader fr = new FileReader("quiz.txt");
			// 보조스트림을 통한 성능 개선
			br = new BufferedReader(fr);
			// 1줄짜리 파일로 한번만 읽으면 모든 정보 로드 완료
			String str = br.readLine();
			// " " 띄어쓰기 기준으로 데이터를 잘라 토큰으로 관리
			StringTokenizer sT = new StringTokenizer(str, " ");
			// 데이터를 내보낼 때 byte스트림을 사용할 예정
			// 읽어온 숫자를 Byte List에 저장
			ArrayList<Byte> list = new ArrayList<Byte>();
			while(sT.hasMoreTokens()) { //토크나이저로 잘라온 토큰이 남아있지 않을 때까지
				String num = sT.nextToken(); // 하나씩 꺼내서 스트링 타입에 저장했다가
				int iNum = Integer.parseInt(num); // 정수로 변환하여 저장
				list.add((byte)(iNum)); // 바이트로 넣어주어야 하니까 강제 형변환
			}
			System.out.println("파일 읽어오기 완료");
			System.out.println("리스트 길이 : "+list.size());
			// 이미지 파일을 내보내기 위한 주스트림
			FileOutputStream fos = new FileOutputStream("test.gif");
			// 보조스트림
			bos = new BufferedOutputStream(fos);
			for(Byte b : list) {
				bos.write(b); //fos.write(b)도 가능 < 속도차이
			}
			System.out.println("내보내기 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
