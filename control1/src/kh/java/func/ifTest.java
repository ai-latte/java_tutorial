package kh.java.func;
import java.util.Scanner;
public class ifTest {
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 10을 입력해보세요 : ");
		int num = sc.nextInt();
		 // if(논리형boolean데이터)
		
		if(num==10) {
			System.out.println("잘했어요!");
		}
		
		if(num!=10) {
			System.out.println("10 입력하라니까요?");
		}
		
		System.out.println("끝!!!!!!!!!!!!");
	}
	
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		//입력받은 정수가 홀수면 "홀수" 짝수면 "짝수"
		
		if((num%2)==1) {
			System.out.println("홀수입니다.");
		}
		
		if((num%2)==0) {
			System.out.println("짝수입니다.");
		}
	}
	
	
	public void test3() {
		System.out.println("=======숫자 구별 프로그램=======");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("당신이 입력한 "+num+"은(는) 양수입니다.");
		}
		
		if(num == 0) {
			System.out.println("당신이 입력한 "+num+"은(는) 0입니다.");
		}
		
		if(num < 0) {
			System.out.println("당신이 입력한 "+num+"은(는) 음수입니다.");
		}
	}
	
	
	public void test4() {
		System.out.println("======두수 비교 프로그램=======");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
			
		if(num1>num2) {
			System.out.println(num1+">"+num2);
			System.out.println("첫번째 수가 더 큽니다.");
		}
		
		if(num1==num2) {
			System.out.println(num1+"="+num2);
			System.out.println("두 수가 같습니다.");
		}
		
		if(num1<num2) {
			System.out.println(num1+"<"+num2);
			System.out.println("첫번째 수가 더 작습니다.");
		}
	}

	//계산기프로그램
	
	public void test5() {
		System.out.println("======계산기 프로그램=======");
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		//char ch = sc.next().charAt(0);
		String ch = sc.next();
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		
		//(ch=="+") String은 참조형 데이터이기 떄문에 안 됨
		if(ch.equals("+")) {
			System.out.println(num1+""+ch+num2+"="+(num1+num2));
		} //다른 연산자와 합쳐지면 문자열로 바뀌는 성질을 이용, ch앞에 ""를 넣어 문자열 덧셈으로 바꿔준다
		
		if(ch.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		
		if(ch.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		
		if(ch.equals("/")) {
			System.out.printf("%d/%d=%f", num1, num2, (double)num1/num2);
		}		
	}
	
	// if - else
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		if((num%2)==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		} // 둘중 하나는 반드시 실행한다. (true or false)
	}
	
	public void test7() {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scn.nextInt();
		String str;
		
		if(num%2==0) {
			str = "짝수";
		} else {
			str = "홀수";
		} // 이클립스 : 둘 중 하나는 무조건 되네. 둘다 false가 나와서 초기화가 안 될 가능성은 없겠구나.
		System.out.println(str);
	}
	
	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num > 1000) {
			System.out.println("10보다 큰 수 입니다.");
		} else if(num > 100) {
			System.out.println("100보다 큰 수 입니다.");
		} else if(num > 10) {
			System.out.println("10보다 큰 수 입니다.");
		}		//범위를 else if로 연결하는 경우 좁은 범위가 위로 가야 함
	}
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int all = sc.nextInt();
		System.out.print("어른은 몇명입니까?(1인당 15,000원) : ");
		int adl = sc.nextInt();
		System.out.print("아이는 몇명입니까?(1인당 5,000원) : ");
		int chl = sc.nextInt();
		
		int aTk = adl*15000;
		int cTk = chl*5000;
		
		if(all==(adl+chl)) {
			System.out.println("지불하실 총 금액은 "+(aTk+cTk)+"원 입니다.");
		} else {
			System.out.println("인원이 맞지 않습니다.");
		}		
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========퀴즈 프로그램========");
		System.out.print("첫번째 퀴즈\n사과는 영어로 무엇일까요?(1.apple 2.steve) : ");
		String anw1 = sc.nextLine();
		if(anw1.equals("1")) {
			System.out.println("정답입니다!!!");
		} else {
			System.out.println("땡~ㅎ");
		}
		
		System.out.print("두번째 퀴즈\n바나나는 길어 길으면 기차 기차는?(1.비싸 2.빨라) : ");
		String anw2 = sc.nextLine();
		if(anw2.equals("2")) {
			System.out.println("정답입니다!!!");
		} else {
			System.out.println("땡~ㅎ");
		}
		
		
		if (anw1.equals("1")&& anw2.equals("2")) {
			System.out.println("총 2문제를 맞혔습니다.");
		} else if (anw1.equals("2")&& anw2.equals("1")) {
			System.out.println("총 0문제를 맞혔습니다.");
		} else {
			System.out.println("총 1문제를 맞혔습니다.");
		}
	}

	
	public void exam3() {
		System.out.println("=======심리테스트========");
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 술을 좋아하십니까? (1.yes 2.no) : ");
		int anw1 = sc.nextInt();
		
		if(anw1==1) { //술을 좋아하면?
			System.out.print("당신은 담배를 피웁니까?(1.yes 2.no) : ");
			int anw2 = sc.nextInt();
			if(anw2==1) {
				System.out.println("건강에 안 좋은 건 다하네.");
			} else {
				System.out.println("술은 건강에 좋지 않아요");
			}
		} else { //술을 좋아하지 않으면?
			System.out.print("당신은 이성친구가 있습니까?(1.yes 2.no) : ");
			int anw3 = sc.nextInt();
			if(anw3==1) {
				System.out.println("오~");
			} else {
				System.out.println("힘내요ㅠㅠ");
			}
		}
	}
	
	public void exam4() { // A=65~90 a=97~122
		System.out.println("=======대/소문자 변환 프로그램========");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		char alp = sc.next().charAt(0);
		
		if(65<=alp&&90>=alp) {
			System.out.println("대문자를 입력하였습니다.");
			System.out.println("소문자로 변환 : "+(char)(alp+32));			
		} else if(97<=alp&&122>=alp) {
			System.out.println("소문자를 입력하였습니다.");
			System.out.println("대문자로 변환 : "+(char)(alp-32));	
		} else {
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요.");
		}
	}
	
	public void exam5() { //3의배수, //4의배수
		System.out.println("======3/4의 배수=======");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("다시 입력하세요.");
		} else {
			if(num%3==0) {
				if(num==0) {
						System.out.println("[0]은(는) 3의 배수도 4의 배수도 아닙니다.");
				} else if(num%4==0) {
						System.out.printf("[%d]은(는) 3의 배수면서, 4의 배수입니다.", num);
				} else {
						System.out.printf("[%d]은(는) 3의 배수입니다.", num); }
			} else if(num%4==0) {
					System.out.printf("[%d]은(는) 4의 배수입니다.", num);
			} else {
					System.out.printf("[%d]은(는) 3의 배수도 4의 배수도 아닙니다.", num);
			
		} //0보다 작은 경우/아닌 경우 > 3의 배수 4의 배수, 둘다 아닌 경우 (3의 배수 안에서 0, 3의배수가 아닌 경우 분류)
		}
	}
}