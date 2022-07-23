package kh.java.func;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 : ");
		String filename = sc.nextLine();
		File file = new File(filename);
		if(file.exists()) { //파일이 해당 경로에 있는지 없는지 판단하여 bool반환
			System.out.println("파일 이름 : "+file.getName());
			System.out.println("파일 절대 경로 : "+file.getAbsolutePath());
			System.out.println("파일 크기 : "+file.length()+"byte");
			System.out.print("파일을 삭제하시겠습니까? 1번 yes");
			int sel = sc.nextInt();
			if(sel==1) {
				boolean bool = file.delete();
				System.out.println(bool);
			}
		}else {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
}
