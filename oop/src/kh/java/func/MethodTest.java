package kh.java.func;
import java.util.Scanner;
public class MethodTest {
	
	public void test6() {
		// 1. 기본형 매개변수
		int num = 100;
		System.out.println("num : "+num);
		test7(num);
		// 매개변수로 기본형 데이터 전송할 때는
		// 값을 복사하여 보낸다
		System.out.println("test7 후 num : "+num);
		// 100 < 영향을 받지 않음
		
		// 2. 참조형 매개변수
		int[] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		} // 참조형 매개변수를 만들기 위한 배열 생성
		System.out.println();
		test8(arr); // arr[2] = 100; 메서드 호출
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
			//3. 배열의 값을 넘겨주는 것 = 기본형
		System.out.println(arr[2]);
		test9(arr[2]);
		System.out.println(arr[2]);
		}

		
	}
	
	//1. 기본형 매개변수 메서드
	public void test7(int num) {
		num += 100;
		System.out.println("test7 : "+num);
	}
	
	//2. 참조형 매개변수 메서드
	public void test8(int[] arr) {
		arr[2] = 100;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		} 
	}
	
	
	public void test9(int num) {
		num += 300;
	}
	
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		// 입력받은 두 수의 합을 출력 > 메서드로 분리
		// 메서드를 호출하고 결과를 받아 sum에 저장
		int sum = add(num1, num2);
		// 입력받은 두 수의 나누기 결과를 받아오는 메서드 생성
		// 나누기 결과는 실수타입, 메서드 명은 div
		double div = div(num1, num2);
		System.out.println("입력받은 두 수의 합은 ? "+sum);
		System.out.println("입력받은 두 수를 나누면 ? "+div);
	}
	
	public void div2(int a, int b) {
		double result = (double)a/b;
		System.out.println(result);
	}
	
	public double div(int a, int b) {
		double result = (double)a/b;
		return result;
	}
	
	public int add (int su1, int su2) {
		System.out.println(su1);
		System.out.println(su2);
		int sum = su1+su2;
		return sum;
	}
	
	public void test1() {
		System.out.println("test1 메소드입니다");
		test2();
		int num = test4();
		System.out.println(num);
	}
	
	private void test2() {
		System.out.println("test2 메소드입니다");
		return; // break와 마찬가지로 메서드 끝나는 코드
		// System.out.println("123"); //unreachable코드
	}
	
	public int test4() {
		return 100;
	}
}
