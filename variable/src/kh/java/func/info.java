package kh.java.func;

public class info {
	public void inf() {
		// 이름 나이 성별 주소 전화번호 이메일
		String name = "이은비";
		int age = 30;
		String sex = "여"; //char도 가능 gender
		String addr = "행신동";
		String phoneNum = "01077478579"; //long불가능 phone
		String email = "mylatteis@gmail.com";
		
		String name1 = "박모모";
		int age1 = 22;
		String sex1 = "여";
		String addr1 = "띠로리";
		String phoneNum1 = "01077478579";
		String email1 = "mylatteis@gmail.com";
		
		
		System.out.printf("이름\t나이\t성별\t지역\t전화번호\t\t이메일\t\t\n");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%s\t%d\t%s\t%s\t%s\t%s\t\n", name, age, sex, addr, phoneNum, email);
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%s\t%d\t%s\t%s\t%s\t%s\t\n", name1, age1, sex1, addr1, phoneNum1, email1);
	}
}
