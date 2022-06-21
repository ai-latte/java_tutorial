package kh.java.func;

public class Variable {
	public void var1() {
		//변수를 선언하는 방법 : 자료형 변수명;
		//1. 논리형 변수를 선언
		boolean bool;
		//2. 문자형 변수 선언
		char ch;
		//3. 정수형 변수 선언 (byte, short, int, long)
		int num;
		//4. 실수형 변수 선언 (float, double)
		double dNum;
		
		//변수에 데이터를 저장하는 방법 > 대입연산자(=)
		//a=b; > b라는 값을 a변수에 대입
		
		num = 10;
		System.out.println(num);
		
		//문자형
		ch = 'A';
		char ch2 = 65;
		System.out.println(ch);
		System.out.println(ch2);
		
		//논리형 변수에 true 대입 후 출력
		bool = true;
		System.out.println(bool);
		
		dNum = 3.14;
		System.out.println(dNum);
		
		System.out.println(num+dNum);
		
		long lNum; //int 4byte < long 8byte
		lNum = 1000l; //작은 양을 큰 통에 넣는 것 => 가능
		float fNum; //float 4byte < double 8byte
		fNum = 3.14f; //큰 양을 작은 통에 넣는 것 => 불가능
		
		// l, f를 붙여서 리터럴로 만들어 줌
	}
	
	public void var2() {
		double dNum1 = 3.14;
		System.out.println(dNum1);
		System.out.println(dNum1);
		System.out.println(dNum1);
		dNum1 = 10.1;
		System.out.println(dNum1);
		dNum1 = 100.2;
		System.out.println(dNum1);
		// 상수형 변수 선언 (변수명은 모두 대문자)
		final double PI = 3.14; // 값을 변경할 수 없음
		System.out.println(PI+dNum1);
	}
	
	public void var3() {
		String str = "라떼는";
		System.out.println(str);
		str = "말이야";
		System.out.println(str);
	}
	
	public void var4() {
		int num = 2147483647;
		long result = (long)num + 1; // 2. 강제 형변환 필요
		System.out.println(result); // 1. -2147483648 출력 < 데이터 오버플로우
	}
	
	public void print() {
		System.out.println("안녕하세요");
		System.out.println("제 이름은");
		System.out.println("ai라떼입니다");
		
		System.out.print("안녕하세요 ");
		System.out.print("제 이름은 ");
		System.out.println("ai라떼입니다");
		
		//변수 3개 만들기
		String name = "Latte Im";
		int age = 3;
		String adr = "haengsindong799";

		System.out.print("제 이름은 "+name+"이고, ");
		System.out.print("나이는 "+age);
		System.out.println("살 사는 곳은 "+adr);
		System.out.println("제 이름은 "+name+"이고, 나이는 "+age+"살 사는 곳은 "+adr+"입니다.");
		
		System.out.printf("제 이름은 %s이고, 나이는 %d살 사는 곳은 %s입니다.", name, age, adr);
		//System.out.printf("%s는 %d살이고, %s에 살아요", name, age, adr);
		System.out.println();
		System.out.printf("%f", 3.141592); //실수를 가리키는 formatting
		System.out.println();
		System.out.printf("%.2f", 3.141592); //%f사이에 .2 넣어줌
		System.out.println();
		System.out.println("제 이름은 \"임라떼\"입니다.");
		System.out.println("라떼\t태현");
		System.out.println("안녕\n하세요");
		System.out.println("중감에 엔터를 넣고 싶으면 \\n을 사용하세요");
	}
}