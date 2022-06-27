package kh.java.func;
import java.util.Scanner;
public class SwitchTest {
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("1111111111");
			break;
		case 2 :
			System.out.println("2222222222");
			break;
		case 3 :
			System.out.println("3333333333");
			break;
		default :
			System.out.println("??????????");
			break;
		}
	}
	
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		switch(str) {
		case "a" : 
			System.out.println("a입력했음");
			break;
		case "b" :
			System.out.println("b입력했음");
			break;
		case "c" :
			System.out.println("c입력했음");
			break;
		default :
			System.out.println("a,b,c가 아닌 다른 문자를 입력하셨습니다.");
		}
	}
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고싶은 달을 입력하세요. : ");
		int mon = sc.nextInt();
		
		switch(mon) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(mon+"월달은 31일까지 있습니다.");
			break;
			//스위치의 특성을 이용하여 공백으로 두고 마지막에 출력문 넣어주기
			
		case 2 :
			System.out.println(mon+"월달은 28일까지 있습니다.");
			
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(mon+"월달은 30일까지 있습니다.");
			break;
			
		default :
			System.out.println("잘못입력하셨습니다.");
		}		
	}
	
	
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("장학금 지불 시스템입니다.");
		System.out.print("학점을 입력하세요.(A,B,C,D,F) : ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A' :
			System.out.println("수고하셨습니다. 장학금 100%지급해드립니다.");
			break;
		case 'B' :
			System.out.println("아쉽군요. 장학금 50%지급해드립니다.");
			break;
		case 'C' :
			System.out.println("장학금을 바라시면 더 열심히 하세요.");
			break;
		case 'D' :
			System.out.println("흠...");
			break;
		case 'F' :
			System.out.println("학사경고입니다!");
			break;
		default :
			System.out.println("다시 입력하세요.");
			break;
		}
	}
	
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========계산기 프로그램========");
		System.out.print("연산자를 입력하세요(+, -, *, /)");
		char ch = sc.next().charAt(0);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		switch(ch) {
		case '+' :
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case '-' :
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case '*' :
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case '/' :
			System.out.println(num1+"/"+num2+"="+(num1/num2));
			break;
		default :
			System.out.println("다시 입력하세요.");
			break;
		
		}
		
	}
	
	
}
