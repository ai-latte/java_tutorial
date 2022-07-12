package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import kh.java.exception.UserException2;

public class ExceptionTest {
	Scanner sc;
	
	
	public ExceptionTest() {
		super();
		sc = new Scanner(System.in);
	}


	public void ExceptionTest() { 
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			int num = 0;
			try {
				num = sc.nextInt();
				// String으로 받아서 Integer.parseInt();
			}catch(InputMismatchException e) {
				System.out.println("에러발생 ! ! !");
			}
			System.out.println("결과 : " +num);
			if(num == 0) {
				break;
			}
		}
		System.out.println("반복문 끝! ! !");
	}
	
	
	public void test2() {

	System.out.print("첫번째 정수 입력 : ");
	int num1 = sc.nextInt();
	while(true) {
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다");
		}else {
			System.out.println("결과 : " +(num1/num2));
			break;
		}
	}

	/*
	  	try {
		System.out.println("결과 : " +(num1/num2));
		
		}catch(ArithmeticException e) {
		System.out.println("0으로는 나눌 수 없습니다");
		}
	*/
	
	}
	
	
	public void test3() {
		try {
			System.out.print("첫번째 정수 입력");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력");
			int num2 = sc.nextInt();
			System.out.println("결과" + (num1/num2));
		} catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요");
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다");
		}
	}

	
	
	public void test4() {
		try {
			System.out.print("첫번째 정수 입력");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력");
			int num2 = sc.nextInt();
			System.out.println("결과" + (num1/num2));
		} catch(Exception e) { // 부모타입으로 한번에 처리 (잘 안씀)
			System.out.println("에러가 발생했습니다");
		}
		
	}
	
	// finally의 용도
	public void test5() {
		try {
			System.out.print("첫번째 정수 입력");
			int num = sc.nextInt();
			System.out.println("입력한 수 : "+num);
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요");
		}finally {
			System.out.println("finally");
		}
	}
	
	
	// checked exception - f2자동완성
	public void test6() {
		try {
			FileInputStream fis = new FileInputStream("text.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// throw : 예외를 던지고, 쓰는 사람이 처리하도록 한다
	// try catch문을 한 번은 수행해야 한다
	// 메서드 작성하는 사람이 할지, 메서드를 사용하는 사람이 할지 선택
	public void test7() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("text.txt");
	}
	
	public void test8() {
		try {
			test7();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void test10() {
		Calc cal = new Calc();
		try {
			cal.div(3, 0);
		} catch (UserException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
