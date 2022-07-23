package kh.java.func;
import java.util.Random; // 컨트롤 시프트 o
import java.util.StringTokenizer;
public class StringClass {
	public void test1() {
		//문자열 변경을 위한 StringBuffer 사용
		//import 안하는 조건
		// 1) 같은 패키지 내부의 클래스인 경우
		// 2) java.lang패키지 소속의 클래스인 경우
		StringBuffer sb = new StringBuffer();
		System.out.println("문자열 길이 : "+sb.length());
		// 현재 저장된 문자열에 매개변수로 전달한 문자를 추가
		sb.append("hi");
		System.out.println(sb.length());
		sb.append(" 안녕");
		System.out.println(sb.length());
		sb.append(" test");
		System.out.println(sb.toString());
		sb.insert(3, "삽입구문");
		System.out.println(sb.toString());
		// 첫번째 매개변수 위치에, 두번째 매개변수 값을 삽입
		sb.insert(7, " 여기 ");
		System.out.println(sb.toString());
		// 문자열중 0번째부터 2번째 앞!!!까지 "수정구문"으로 대체
		sb.replace(0, 2, "수정구문");
		// (for int i=0; i<2; i++) 이라고 생각하면 됨
		System.out.println(sb.toString());
		sb.delete(5, 8);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		
		// 0-9숫자로 랜덤 인증코드
		Random r = new Random();
		StringBuffer joinCode = new StringBuffer();
		for(int i=0; i<6; i++) {
			char num = (char)(r.nextInt(26)+97);
			//int num = r.nextInt(10); // 0-9
			joinCode.append(num);
		}
		System.out.println("회원가입 코드 ["+joinCode.toString()+"]");

	}

	
	// split(" "); < 매개변수 기준으로 문자열을 잘라 배열에 담아서 돌려준다
	public void test2() {
		String str = "임라떼/서울/강아지";
		String[] arr = str.split("/");
		System.out.println("배열길이 : "+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 대문자 변환
		String str1 = "Abcdefg";
		str.val
		char ch1 = str1.charAt(0);
		char ch2 = str1.charAt(1);
		if('a'<=ch1 && ch1 <='z') {
			ch1 = (char)(ch1-32); // 대소문자는 32차이니까
		}
		
		String str2 = "AbcDeFG";
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
	}
	
	
	public void test3() {
		String str = "임라떼/서울사는/강아지";
		StringTokenizer st = new StringTokenizer(str, "/");
		// hasMoreTokens가 boolean이기 때문에 false까지한다
		while(st.hasMoreTokens()) { 
			String str1 = st.nextToken();
			System.out.println(str1);
		}
		
		/*
		
		// 첫번째 매개변수가 문자열
		// 두번째 매개변수가 자르는 기준
		System.out.println("지금 토큰이 남아있는지 true/false : "+st.hasMoreTokens());
		System.out.println("남아있는 토큰 수 : "+st.countTokens());
		// 현재 토큰 중 가장 앞의 토큰을 꺼내온다
		String str1 = st.nextToken();
		System.out.println(str1);
		System.out.println("지금 토큰이 남아있는지 true/false : "+st.hasMoreTokens());
		System.out.println("남아있는 토큰 수 : "+st.countTokens());
		String str2 = st.nextToken();
		System.out.println(str2);
		System.out.println("지금 토큰이 남아있는지 true/false : "+st.hasMoreTokens());
		System.out.println("남아있는 토큰 수 : "+st.countTokens());
		String str3 = st.nextToken();
		System.out.println(str3);
		System.out.println("지금 토큰이 남아있는지 true/false : "+st.hasMoreTokens());
		System.out.println("남아있는 토큰 수 : "+st.countTokens());

	*/
	}	
		
}
