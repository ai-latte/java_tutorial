package kh.java.func;
import java.util.Scanner;
public class Scan {
	

	 	public void scan1() {
		//키보드로 값을 입력받는 방법
		// 1) import java.util.Scanner;
		// 2) 객체 생성
		
		
		Scanner sc = new Scanner(System.in); //생성하고 시스템 안으로 넣겠다
		System.out.print("문자열을 입력해 주세요. : ");
		String str2 = sc.nextLine(); // *첫줄에 String 쓰는 경우 버퍼가 없으므로 바로 사용 가능
		System.out.println(str2);
		System.out.print("첫번째 정수를 입력하세요 : "); //Scanner 생성하고 입력 먼저
		int num = sc.nextInt(); // 입력을 기다렸다가 사용자가 입력한 값을 Int형으로 가져옴 > 값을 num에 넣음
		System.out.print("두번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int sum = num + num1;
		System.out.println("입력한 두 수의 합은"+sum);
		//실수형 입력받는 방법
		System.out.print("실수를 입력하세요. : ");
		double dNum = sc.nextDouble();
		//문자열 입력 받는 방법
		//sc.next() : 띄어쓰기를 처리할 수 없음
		System.out.print("첫번째 문자열을 입력하세요. : ");
		String str1 = sc.next();
		System.out.println(str1);
		System.out.print("두번째 문장을 입력하세요. : ");
		sc.nextLine(); // 버퍼에 남아있는 엔터를 제거
		String str3 = sc.nextLine(); //새로이 입력받음
		// nextLine은 공백과 엔터를 처리해주고 싶어함
		System.out.println(str3);
		//문자 입력받기 > 문자열을 가져온 다음 문자 떼오기
		System.out.print("문자를 입력하세요. : ");
		char ch = sc.next().charAt(0); //charAt(인덱스번호) < 첫번째 문자를 가져오겠다.
		System.out.println(ch);
	}
	
	
	public void scanExam1() {
		Scanner scn = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scn.next();
		System.out.print("나이를 입력하세요 : ");
		int age = scn.nextInt();
		System.out.print("주소를 입력하세요. : ");
		scn.nextLine(); //스트링을 중간에 받으면, 받기 전에 버퍼를 제거한다.
		String adr = scn.nextLine();
		System.out.print("키를 입력하세요. : ");
		double height = scn.nextDouble();
		System.out.print("몸무게를 입력하세요. : ");
		double weight = scn.nextDouble();
		double tmp = weight%10;
		System.out.print("성별을 입력하세요.");
		char gender = scn.next().charAt(0);
		
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+adr);
		System.out.println("키 : "+(int)height);
		System.out.println("몸무게 : "+(int)tmp);
		System.out.println("성별 : "+gender);
		
	}
	
	public void scanExam2() {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = scn.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = scn.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int mat = scn.nextInt();
		
		int sum = kor + eng + mat;
		
		System.out.printf("당신의 총점수는 %d점이고, 평균은 %.2f입니다.", sum, (double)(sum/3));
	} 	
}