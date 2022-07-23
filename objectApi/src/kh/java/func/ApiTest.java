package kh.java.func;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.omg.CORBA.DATA_CONVERSION;

public class ApiTest {
	public void math() {
		//객체를 생성하지 않고 바로 사용 < 독특
		System.out.println(Math.abs(10));	// 절대값
		System.out.println(Math.abs(-10));	// 절대값
		// 올림, 버림, 반올림
		System.out.println(Math.ceil(10.1));	//소수 첫자리에서 올림 11.0
		System.out.println(Math.floor(10.9)); 	//소수 첫자리에서 버림 10.0
		System.out.println(Math.round(10.5));	//소수 첫자리에서 반올림 11(정수)
		// 1.3456 소수 3번째 자리에서 반올림 > 1.35
		// 134.5 만들어서 반올림 하고 135/100.0 > 1.35
		System.out.println(Math.round(1.3456*100)/(double)100);
		// 숫자비교
		// 매개변수로 전달한 두 수 중 큰수 리턴
		System.out.println(Math.max(50, 30));
		// 매개변수로 전달한 두 수 중 작은수 리턴
		System.out.println(Math.min(50, 30));	
	}
	
	
	public void date() {
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String todayStr = format1.format(today);
		System.out.println(todayStr);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초 EEE요일");
		String todayStr2 = format2.format(today);
		System.out.println(todayStr2);
	}
	
	
	public void calendar() {
		Calendar today = Calendar.getInstance();
		//Calender클래스의 생성자의 접근제어지시자는 protected
		//getInstance()메소드를 통해서만 객체 생성 가능
		//정보 가져오는 방법 : today.get(Calendar.정보종류);
		System.out.println(today.get(Calendar.YEAR)); // 0,1,2,3
		System.out.println(today.get(Calendar.MONTH)+1); // 월(0-11)
		System.out.println(today.get(Calendar.DATE)); //일
		System.out.println(today.get(Calendar.AM_PM)); //AM=0, PM=0
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND)); // 현재기준 밀리세컨을 보여줌
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); //(1=일요일, 7=토요일)
		
		System.out.println("-----------------------------------");
		
		Calendar day1 = Calendar.getInstance();
		System.out.println(day1.get(Calendar.MONTH)+1);
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));
		
		// 날짜랑 시간정보 변경
		day1.set(Calendar.MONTH, 10);
		day1.set(Calendar.DATE, 18);
		System.out.println(day1.get(Calendar.MONTH)+1);
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));

		Calendar day2 = Calendar.getInstance();
		long time1 = day2.getTimeInMillis(); 
		//1970년도 1월 1일부터 day2까지 몇 ms가 흘렀는지 리턴
		// 흐른 정도를 보여주는
		// 흐른 양이라고 생각하면 됨
		day2.set(Calendar.DATE, 8); // 7/8
		long time2 = day2.getTimeInMillis();
		System.out.println("time1 : "+time1);
		System.out.println("time2 : "+time2);
		System.out.println("시간차이 : "+(time2-time1));
		
		Date date1 = new Date(time1);
		Date date2 = new Date(time2);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1str = format.format(date1);
		String date2str = format.format(date2);
		System.out.println(date1str);
		System.out.println(date2str);
	}
	
	
	
	
	
	
	
}