package kh.java.func;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exam {
	Scanner sc = new Scanner(System.in);

	public void main() {
		System.out.println("=========== D-DAY 계산기 ===========");
		Calendar dDay = Calendar.getInstance(); // Calendar의 객체 생성(메서드를 통해)
		System.out.println("D-DAY 계산기");
		System.out.print("D-DAY [년도] 입력 : ");
		dDay.set(Calendar.YEAR, sc.nextInt());
		// 변수명.set(Calendar.YEAR, year)
		System.out.print("D-DAY [월] 입력 : ");
		dDay.set(Calendar.MONTH, (sc.nextInt()) - 1);
		System.out.print("D-DAY [일] 입력 : ");
		dDay.set(Calendar.DATE, sc.nextInt());
		// d-day 입력 받기 완료

		Calendar today = Calendar.getInstance();
		// 입력하는 그 시간에 만들어지는 인스턴스
		
		// 3. date 타입 long매개변수로 넣을 밀리세컨 get해서 변수에 담기
		long todayTime = today.getTimeInMillis();
		long dDayTime = dDay.getTimeInMillis();
		
		// 2. date의 매개변수는 밀리세컨 필요
		Date dDate = new Date(dDayTime);
		Date toDate = new Date(todayTime);

		// 1. simpledateformat 쓰려면 date타입 필요
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String dDaystr = format1.format(dDate);
		String todayString = today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1) + "월 "
				+ today.get(Calendar.DATE) + "일 ";

		// System.out.println(tDaystr);
		System.out.println("오늘 날짜 : " + todayString);
		System.out.println("d-day 날짜 : " + dDaystr);

		long time = dDayTime/1000 - todayTime/1000;
		long div =  time/(60*60*24);
		
		// +추가
		if (div > 0) {
			System.out.println(div+"일 남았습니다");
		} else if (div < 0) {
			System.out.println(Math.abs(div)+"일 지났습니다");
		} else {
			System.out.println("D-DAY 입니다");
		}
	}

	
	//today 하나만 쓰는 거
	public void dday() {
		System.out.println("=========== D-DAY 계산기 ===========");
		Calendar dDay = Calendar.getInstance(); // Calendar의 객체 생성(메서드를 통해)
		System.out.println("D-DAY 계산기");
		System.out.print("D-DAY [년도] 입력 : ");
		dDay.set(Calendar.YEAR, sc.nextInt());
		// 변수명.set(Calendar.YEAR, year)
		System.out.print("D-DAY [월] 입력 : ");
		dDay.set(Calendar.MONTH, (sc.nextInt()) - 1);
		System.out.print("D-DAY [일] 입력 : ");
		dDay.set(Calendar.DATE, sc.nextInt());
		// d-day 입력 받기 완료

		Calendar today = Calendar.getInstance();
		// 입력하는 그 시간에 만들어지는 인스턴스
		
		// 3. date 타입에 매개변수로 넣을 밀리세컨 get해서 변수에 담기
		long todayTime = today.getTimeInMillis();
		long dDayTime = dDay.getTimeInMillis();
		
		// 2. date의 매개변수는 밀리세컨 필요
		Date dDate = new Date(dDayTime);
		Date toDate = new Date(todayTime);

		// 1. simpledateformat 쓰려면 date타입 필요
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String dDaystr = format1.format(dDate);
		String todayString = today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1) + "월 "
				+ today.get(Calendar.DATE) + "일 ";

		// System.out.println(tDaystr);
		System.out.println("오늘 날짜 : " + todayString);
		System.out.println("d-day 날짜 : " + dDaystr);

		long time = dDayTime/1000 - todayTime/1000;
		long div =  time/(60*60*24);
		
		// +추가
		if (div > 0) {
			System.out.println(div+"일 남았습니다");
		} else if (div < 0) {
			System.out.println(Math.abs(div)+"일 지났습니다");
		} else {
			System.out.println("D-DAY 입니다");
		}
	}
	
	public void wrap() {
		// 정수형(기본형변수) 선언 후 대입
		int num1 = 10;
		System.out.println(num1);
		// wrapper클래스 사용
		Integer num2 = new Integer(10); // boxing 참조형으로 감싸줌
 		int num3 = num2.intValue(); // unboxing 다시 기본형으로 꺼내줌
		
		double d1 = 3.14;
		System.out.println(d1);
		// wrapper클래스 Double
		Double d2 = new Double(3.14); // boxing
		double d3 = d2.doubleValue(); // unboxing
		System.out.println(d3);
		//// 여기까지 정식 방법
		
		Integer num4 = 10; // auto-boxing
		int num5 = num4; // auto-unboxing
		
		Double d4 = 3.15; // auto-boxing
		double d5 = d4; // auto-unboxing
	}

	
	public void wrap2() {
		//wrapper 클래스 사용 예
		// 1+"" < 문자열 됨
		// 다른 방법
		
		// 1) 문자열 > 기본형
		String str1 = "100";
		System.out.println(str1+1); //1001
		int num = Integer.parseInt(str1); 
		System.out.println(num+1); //101
		/*
		String str2 = "100a";
		정상적인 정수가 아닌 경우 변환 도중 에러 발생
		int num2 = Integer.parseInt(str2);
		 */
		String str2 = "3.14";
		double dNum = Double.parseDouble(str2);
		System.out.println(dNum);
		
		// 1-2) 문자열 > 문자 변환
		String str3 = "A";
		char ch = str3.charAt(0);
		
		
		// 2) 기본형 > 문자열
		int num1 = 100;
		// 2-1) Integer 사용 방법
		String str4 = Integer.valueOf(num1).toString();
		double dNum2 = 3.14;
		String str5 = Double.valueOf(dNum2).toString();
		
		// 2-2) String 클래스 사용
		String str6 = String.valueOf(num1);
		String str7 = String.valueOf(dNum);
		
	}
	
	
}
