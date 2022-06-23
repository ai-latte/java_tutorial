package kh.java.func;
import java.util.Scanner;
public class ForTest {
	public void test1() { //안녕하세요 3회 반복출력
		for(int i=0; i<3; i++) {
			System.out.println("안녕하세요. 라떼언니입니다.");
		}
	}
	
	
	// ----------------실습예제----------------
	
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까?");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까?");
		int num = sc.nextInt();
		
		System.out.println(num+"단 입니다.");
		
		for(int i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	
	
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		int sum = 0; //미리 선언하기!!!
		
		for(int i=0; i<5; i++) {
			System.out.print("정수 값을 입력하시오. : ");
			int num = sc.nextInt();
			sum += num;
			// sum += sc.nextInt();
		}	
		System.out.println("입력한 5개 정수의 합은 ? "+sum);
	}
	
	
	
	// 정수 두개를 입력받고 두 수 사이의 모든 수의 합
	
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num1<num2) {
			for(int i=num1; i<=num2; i++) { //num2가 더 큰 경우
				sum += i;
			}
		} else {
			for(int i=num1; i>=num2; i--) { //num1이 더 큰 경우
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
	
	
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=0; i<=num; i++) {
			if(i%2==0) {
				sum += i;
			} // int i=0; i<=num; i+2 증감문을 변경하면, if쓰지 않아도 가능
		} 
		
		System.out.println(sum);
		
		}
	
	
	// 이중포문
	
	public void exam6() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("i="+i+" / j="+j);
			}
		}
	}
	

	
	public void exam7() {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
			System.out.printf("%d*%d=%d ", i, j, i*j);
			}	System.out.println();
		}
	
	}
	
	
	
	public void exam8() {
		for(int i=1; i<=9; i++) { 
			System.out.println();
			for(int j=2; j<=9; j++) {
				System.out.printf("%d*%d=%d  ", j, i, j*i);
			}
		}
	}
	
	
}