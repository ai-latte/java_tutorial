package kh.java.func;
import java.util.Scanner;
public class Oper {
	
	public void test1() {
		//복합대입연산자 (+=, -=, *=, /=, %=)
		int num = 10;
		System.out.println("num : "+num);
		num += 5; // num = num + 5;
		// 반대로 쓰는 건 안 됨
		System.out.println("num : "+num);
		num *= 3;
		System.out.println("num : "+num);
		
		//증감연산자 (a++, ++a, a--, --a)
		num++; //num의 값을 1 증가시킴
		System.out.println("num : "+num);
		++num;
		System.out.println("num : "+num);
		num--; //num의 값을 1 감소시킴
		System.out.println("num : "+num);
		--num;
		System.out.println("num : "+num);
		
		//증감연산자의 연산 순서
		int num1 = 10;
		//변수++ : 후위연산(증감연산자가 변수 뒤에 위치할때)
		//후위연산 : 인접연산을 먼저 수행한 후(끝낸 후) 자기자신을 증/감한다.	
		//int num2 = (num1++)+2; //연산 끝내고 num1이 증가한다.
		
		//++변수 : 전위연산(증감연산자가 변수 앞에 위치할때)
		//전위연산 : 자기자신을 증/감한 후 인접연산
		int num2 = (++num)+2;
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
		//예제
		int a = 10;
		int b = 10;
		int c;
		
		c = (a++) + (++b) + a;
		//	(10) +  (11)  + 10? 11? < 인접연산이 끝났기 때문에 11
		System.out.println(c);
	}
	
	//관계연산자 => 컴퓨터에게 물어보는 것 (논리값으로 반환한다)
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("num1<num2 ? "+(num1<num2));
		System.out.println("num1>num2 ? "+(num1>num2));
		System.out.println("num1<=num2 ? "+(num1<=num2));
		System.out.println("num1<=num2 ? "+(num1<=num2));
		System.out.println("num1==num2 ? "+(num1==num2));
		System.out.println("num1!=num2 ? "+(num1!=num2));
	}
	
	// &&앤퍼센트(=and) ||파이프라인(=or) !(=not)
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");
		int num3 = sc.nextInt();
		System.out.print("네번째 정수 입력 : ");
		int num4 = sc.nextInt();
		boolean result1 = num1<num2;
		boolean result2 = num3<num4;
		System.out.println("result1 ? "+result1);
		System.out.println("result2 ? "+result2);
		System.out.println("result1&&result2 ? "+(result1&&result2));
		System.out.println("result1||result2 ? "+(result1||result2));
		System.out.println("!result1 ? "+(!result1));
		//! = 반대로 바꿔줘
	}
	 
	//삼항연산자
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = num1<num2? num1: num2; //무조건 작은 수가 나오는 삼항 연산자
		System.out.println("result : "+result);
	}
	
 	// 삼항연산자 실습
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요. : ");
		
		int age = sc.nextInt();
		//삼항연산자 =>	조건식?true인경우:false인경우;	
		
		String msg = age>19? "성인입니다.": "미성년자입니다";
		//       앞에 조건에 따라서 ? 뒤에 값이 남는다
		System.out.println(msg);
		
		//System.out.println(age>19? "성인입니다.": "미성년자입니다.";); 한 줄로 써도 무방
	}
}