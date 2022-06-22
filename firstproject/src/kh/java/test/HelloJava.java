package kh.java.test;
import kh.java.func.PrintMsg; //위치를 알려주는 import문
public class HelloJava { //실행 메서드가 있는 클래스
	
	public static void main(String[] args) { //실행 메서드
		/*
		 클래스이름 약어 = new 클래스이름();
		 약어.메서드이름();
		 */
		PrintMsg pm = new PrintMsg();
		pm.printMsg(); //기능 메서드 호출
	}
}
