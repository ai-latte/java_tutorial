package kh.java.func;
import java.util.Scanner;
public class WhileTest {
	public void test1() {
		//for(int i=0; i<5; i++)
		int i = 0;
		while(i<5) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까? : ");
		int num = sc.nextInt();
		int i = 0;
		
		while(num>i) {
			System.out.println("안녕하세요?");
			i++;
		}
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단? : ");
		int n = sc.nextInt();
		int i = 1;
		System.out.println(n+"단 입니다.");
		
		while(i<10) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
			i++;
		}
	}
	
	
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		
		while(i<5) {
			System.out.print("정수 값을 입력하시오 : ");
			sum += sc.nextInt();
			i++;
		} System.out.println("입력한 5개 정수의 합은 ? "+sum);
	}
	
	

	public void exam4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		int min = num1<num2? num1: num2; 
		int max = num2<num1? num1: num2;
		int i = min;
		
		while(i<=max) {
			sum+=i;
			i++;
		} 
		
		System.out.println(min+"부터"+max+"의 정수의 합은? "+sum);
	}
	
	
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 0;
		
		
		while(i<=num) {
			sum += i;
			i += 2;
		}	System.out.println(sum);
	}
	
	
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		/*
		 	while(num==10) {
			System.out.println("10을 입력하셨군요.");
			num++;
		}
		*/
		
		do { //조건을 검사하기 전에 무조건 실행문 출력
			System.out.println("10을입력하셨군요");
			num++;
		} while(num==10);
	}
	
	
	
	public void test3() {
		// for문으로 무한루프
		//for(;;) {
		//	System.out.print("안녕?");
		//}
		
		// while문 무한루프
		while(true) {
			System.out.print("안녕?");
		}
	}
	
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("hi~");
			System.out.print("one more? (1.yes 2.no) : ");
			int sel = sc.nextInt();
			if(sel==1) {
				System.out.println("okay!");
			} else if(sel==2) {
			break;  //만나는 순간 나감
			//	System.out.println();  >>> Unreachable code
			}
			System.out.println("반복문 마지막부분");
		}
		
		System.out.println("while 바깥에 있는 그냥 코드입니다.");
		//브레이크가 없으면 즉, 반복문이 끝나지 않으면 쓸모없는 코드 
	}
	
	
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("i = "+i);
			System.out.print("1 / 2 / 3 중 하나를 선택하세요 : ");
			int select = sc.nextInt();
			
			if(select==1) {
				break; //반복문을 즉시 나가는 코드
			} else if(select==2) {
				continue; // 바로 증감문으로 이동
			} else {
				System.out.println("3이나 그 외 나머지를 선택하셨습니다."); //증감문으로 이동
			}
			System.out.println("반복문 마지막 부분");
		}
		System.out.println("반복문 끝나면 출력되는 문구");
	}
	
	
	
}