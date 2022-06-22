package kh.java.function;
import java.util.Scanner;
public class Example {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int fir = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int scd = sc.nextInt();
		
		int sum = fir+scd;
		int sub = fir-scd;
		int mul = fir*scd;
		int div = fir/scd;
		int rem = fir%scd;
		
		System.out.printf("더하기 결과 : %d\n빼기 결과 : %d\n곱하기 결과 : %d\n나누기 몫 : %d\n나머지 : %d\n", sum, sub, mul, div, rem);
		System.out.println();
		
		// 단순 연산 후 출력 > 변수 만들지 않아도 된다.
		//System.out.println(fir+scd);
	}
	

	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 입력 (실수) : ");
		double leng = sc.nextDouble();
		System.out.print("세로 길이 입력 (실수) : ");
		double width = sc.nextDouble();
		
		double are = leng*width;
		double cir = 2*(leng+width);
		
		System.out.println("======== 결과 ========");
		System.out.printf("면적 : %.2f\n둘레 : %.1f", are, cir);
		System.out.println();
		System.out.println();
		}
	
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어단어 입력 : ");
		String vac = sc.nextLine(); //단어라서 sc.next로 가능
		
		System.out.println("첫번째 문자 : "+vac.charAt(0));
		System.out.println("두번째 문자 : "+vac.charAt(1));
		System.out.println("세번째 문자 : "+vac.charAt(2));
	}
}

