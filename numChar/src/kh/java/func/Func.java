package kh.java.func;

public class Func { //기능메서드가 있는 클래스
	public void print1() {
		//정수 1출력
		System.out.println(1);
		//실수 1출력
		System.out.println(1.0);
		//문자 1출력
		System.out.println('1');
		//문자열 1출력
		System.out.println("1");
	}
	
	public void print2() {
		System.out.println(1+1); //2
		System.out.println(1.0+1.0); //2.0
		System.out.println('1'+'1'); //11(x)
		// '1'에 해당하는 숫자인 49+49로 연산되어 결과는 98
		System.out.println("1"+"1"); //11
		
		System.out.println(1-1); //0
		System.out.println(1.0-1.0); //0.0
		System.out.println('1'-'1'); // 0
		//System.out.println("1"-"1");
		// 문자열은 숫자 연산이 아니므로 +이외의 연산은 불가능	
	}
	
	public void print3() {
		// 자바는 연산 시 같은 자료형끼리만 연산 가능
		// 다른 자료형 연산 시 범위가 큰 자료형으로 자동변환하여 연산
		System.out.println(1+1.1); //2.1
		// => 1.0+1.1=2.1 넓은범위로
		System.out.println(1+'1'); //50
		// => 1+ 49 = 50 문자를 정수로
		System.out.println(1.1+'1'); //50.1
		// => 1.1+ 49 => 1.1+ 49.0 = 50.1 문자를 정수로, 정수를 실수로
	}
	
	public void printstr() {
		//문자열은 다른 자료형과도 +연산만 가능
		//문자열은 우선순위가 높아 다른 자료형이 모두 문자열로 변경
		System.out.println(1+"1"); //"1"+"1" = "11"
		System.out.println(1.0+"1"); //"1.0"+"1" = "1.01"
		System.out.println('1'+"1"); //"1"+"1" = "11"
	}
	
	public void print4( ) {
		System.out.println("Hello"+10);
		System.out.println(10+"Hello");
		System.out.println(10+20+"Hello"); //연산 우선순위 동일
		System.out.println(10+(20+"Hello")); //10+"20Hello"
	}
	
	
	
	
}